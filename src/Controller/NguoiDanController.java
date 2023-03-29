package Controller;

import Check_Validator.Validation;
import Model.ConnectionModel;
import Model.DotTiem;
import Model.NguoiDan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class NguoiDanController {

    public static ArrayList<NguoiDan> layDSNguoiDan() {
        // Khởi tạo danh sách tài khoản
        ArrayList<NguoiDan> danhsachNguoiDan = new ArrayList<>();
        try {
            String sql = "Select * From NguoiDan"; // Thực hiện câu lệnh SQL
            ResultSet rs = ConnectionModel.ThucHienSQL(sql);
            // Đọc từng bản ghi một
            while (rs.next()) {
                NguoiDan tk = new NguoiDan(rs.getString("cmnd"), rs.getString("hoten"), rs.getString("gioitinh"), rs.getString("namsinh"),
                        rs.getString("sdt"), rs.getString("maquan"), rs.getString("maphuong"), rs.getString("diachi"), rs.getString("masods"));
                danhsachNguoiDan.add(tk);
            }

        } catch (SQLException ex) {
            Logger.getLogger(NguoiDanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsachNguoiDan;
    }

    public void loadDataNguoiDan(JTable tbl_ThongKe, JTextField txt_TuNgay, JTextField txt_DenNgay, JComboBox cmb_Quan, JComboBox cmb_Phuong,
            JComboBox cmb_LoaiVacxin, JRadioButton opt_TheoNgay, JRadioButton opt_TheoThang, JCheckBox opt_khuVuc, JCheckBox opt_loaiVacxin, JComboBox cmb_Thang, JTextField txt_Tong) {

        String maquan = QuanController.Get_MaQuan(cmb_Quan); //get maquan
        String maphuong = PhuongController.Get_MaPhuong(cmb_Phuong); //get maphuong
        String tenloaiVacxin = cmb_LoaiVacxin.getSelectedItem().toString(); //get ten loai vacxin
        tbl_ThongKe.removeAll();
        //=============================================================================
        String opt = "";
        if (opt_TheoNgay.isSelected()) {//nếu thống kê theo ngày
            boolean validate = new Validation().Validate_ThongKe(txt_TuNgay.getText(), txt_DenNgay.getText()); //check có nhập từ ngày đến ngày không?
            if (validate) {
                if (txt_TuNgay.getText().equals("") && txt_DenNgay.getText().equals("")) { //nếu không nhập gì thì gán ngày đầu tiên đến ngày hiện tại
                    for (DotTiem i : new DotTiemController().layDSDotTiem()) {
                        txt_TuNgay.setText(i.getNgaytiem().toString());
                        break;
                    }//từ ngày của dợt đầu tiên
                    txt_DenNgay.setText(String.valueOf(LocalDate.now()));// ngày hiện tại
                }
                opt = " and dt.NgayTiem >='" + txt_TuNgay.getText() + "' and dt.NgayTiem <= '" + txt_DenNgay.getText() + "'";
            }//close validate
        } else {//nếu thống kê theo tháng
            opt = " and Month(dt.NgayTiem) =" + cmb_Thang.getSelectedItem().toString() + " ";
        }

        String theoKhuVuc;
        String theoLoaiVacxin;
        if (opt_khuVuc.isSelected()) {
            theoKhuVuc = " q.MaQuan ='" + maquan + "' and p.MaPhuong='" + maphuong + "' ";
        } else {
            theoKhuVuc = "";
        }
        if (opt_loaiVacxin.isSelected()) {
            theoLoaiVacxin = " lvx.TenLoai= '" + tenloaiVacxin + "' ";
        } else {
            theoLoaiVacxin = "";
        }
        if (opt_khuVuc.isSelected() && opt_loaiVacxin.isSelected()) {
            theoLoaiVacxin = " and " + theoLoaiVacxin;
        }
        try {
            String sql = "select nd.CMND, nd.HoTen, nd.NamSinh,nd.GioiTinh, nd.SDT,nd.DiaChi,p.TenPhuong, q.TenQuan, dt.NgayTiem, lvx.TenLoai, cn.LanTiem "
                    + " from NguoiDan nd \n"
                    + "join PhieuChungNhan cn on nd.CMND = cn.CMND\n"
                    + "join DotTiem dt  on cn.MaDotTiem = dt.MaDotTiem\n"
                    + "join Quan q on dt.MaQuan = q.MaQuan\n"
                    + "join Phuong p on dt.MaPhuong = p.MaPhuong\n"
                    + "join LoVacXin lo on lo.MaSoLo = dt.MaSoLo\n"
                    + "join LoaiVacXin lvx on lvx.MaLoai = lo.MaLoai\n"
                    + "where "
                    + theoKhuVuc + theoLoaiVacxin + opt;// Thực hiện câu lệnh SQL
            System.out.println("sql: " + sql);
            ResultSet rs = ConnectionModel.ThucHienSQL(sql);

            DefaultTableModel tbModel = (DefaultTableModel) tbl_ThongKe.getModel();
            tbModel.setRowCount(0);
            // Đọc từng bản ghi một

            int stt = 0;
            while (rs.next()) {
                stt++;
                Object[] obj = new Object[]{stt, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
                tbModel.addRow(obj);
            }
            txt_Tong.setText(String.valueOf(stt));
            System.out.println("so luong: " + stt);
            if (stt == 0) {
                JOptionPane.showMessageDialog(null, "Không có kết quả thống kê phù hợp với điều kiện!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(NguoiDanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    if (!opt_khuVuc.isSelected () && !opt_loaiVacxin.isSelected()) {
            JOptionPane.showMessageDialog(null, "Mời chọn thống kê theo ngày hoặc theo khu vực",
                "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }
}//close loadDataNguoiDan

}
