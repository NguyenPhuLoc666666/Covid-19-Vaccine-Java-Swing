package Controller;

import Model.ConnectionModel;
import Model.LoaiVacXin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class LoaiVacXinController {
     public ArrayList<LoaiVacXin> layDSLoaiVacXin() {
        // Khởi tạo danh sách tài khoản
        ArrayList<LoaiVacXin> danhsachLoaiVacXin = new ArrayList<>();
        try {
           String sql = "Select * From LoaiVacXin"; // Thực hiện câu lệnh SQL
           ResultSet rs = ConnectionModel.ThucHienSQL(sql);
            while (rs.next()) {
                LoaiVacXin loaivx = new LoaiVacXin(rs.getString("maloai"),rs.getString("tenloai"),rs.getInt("somuitiem"),rs.getString("xuatxu"),rs.getString("mota"),rs.getBoolean("trangthai"),rs.getInt("lieutrinh"));
                danhsachLoaiVacXin.add(loaivx);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiVacXinController.class.getName()).log(Level.SEVERE, null, ex);
       }
        return danhsachLoaiVacXin;
    }
     
      //Thêm data tên loại vacxin load vào cmb lên View
    public JComboBox Load_CMB_LoaiVacxin(JComboBox cmb_LoaiVacxin) {
        ArrayList<LoaiVacXin> lstLoaiVacxin=  new LoaiVacXinController().layDSLoaiVacXin();
        lstLoaiVacxin.forEach(item -> {
            cmb_LoaiVacxin.addItem(item.getTenloai());
        });
        return cmb_LoaiVacxin;
    }
    
    // Lấy ra các mã loại từ tên loại vacxin
    public static String Get_MaLoaiVacxin(JComboBox cmb_LoaiVacxin) {
        ArrayList<LoaiVacXin> lstLoaiVacxin = new LoaiVacXinController().layDSLoaiVacXin();
        String maquan = "";
        for (LoaiVacXin item : lstLoaiVacxin) {
            if (item.getTenloai().equals(cmb_LoaiVacxin.getSelectedItem().toString())) {
                maquan = item.getMaloai();
            }
        }
        return maquan;
    }
}
