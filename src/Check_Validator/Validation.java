package Check_Validator;

// Hàm để kiểm tra nhập liệu cho View
import Model.ConnectionModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Validation {

    // Hàm kiểm nhập liệu login
    public boolean Validate_DangNhap(String taikhoan, String matkhau, JLabel thongbao) {
        if ("".equals(taikhoan)) {
            thongbao.setText("Chưa nhập tài khoản !");
            return false;
        }
        if ("".equals(matkhau)) {
            thongbao.setText("Chưa nhập mật khẩu!");
            return false;
        }
        return true;
    }

    // Hàm Chech nhập liệu tạo tài khoản
    public boolean Validate_TaiKhoan(String taikhoan, String matkhau, String checkmatkhau) {

        if (taikhoan.isEmpty() && matkhau.isEmpty() && checkmatkhau.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin đầy đủ",
                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        if (checkmatkhau.length() < 6 || checkmatkhau.length() > 8) {
            JOptionPane.showMessageDialog(null, "Mật khẩu phải có độ dài từ 6 đến 8 ký tự",
                    "Thông báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!matkhau.equals(checkmatkhau)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu xác nhận không trùng khớp",
                    "Thông báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // kiểm tra xem tài khoản đã tồn tại hay chưa
        String sql = "select * from TaiKhoan where TenTaiKhoan ='" + taikhoan + "'";
        ResultSet rs = ConnectionModel.ThucHienSQL(sql);
        try {
            if (true == rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Tài khoản đã tồn tại",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tạo tài khoản không thành công",
                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean Validate_ThongKe(String txt_TuNgay, String txt_DenNgay) {
        if (!txt_TuNgay.equals("") && txt_DenNgay.equals("") || txt_TuNgay.equals("") && !txt_DenNgay.equals("")) {
            JOptionPane.showMessageDialog(null, "Phải nhập đủ từ ngày đến ngày",
                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    return false;
        }
        return true;
    }
   
}
