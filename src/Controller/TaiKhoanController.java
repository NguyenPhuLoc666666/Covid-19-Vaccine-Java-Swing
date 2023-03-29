package Controller;

import Model.ConnectionModel;
import Model.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaiKhoanController {

    public ArrayList<TaiKhoan> layDSTaiKhoan() {
        // Khởi tạo danh sách tài khoản
        ArrayList<TaiKhoan> danhsachTaiKhoan = new ArrayList<>();
        try {
            String sql = "Select * From TaiKhoan"; // Thực hiện câu lệnh SQL
            ResultSet rs = ConnectionModel.ThucHienSQL(sql);
            // Đọc từng bản ghi một
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getString("tentaikhoan"),rs.getString("matkhau"),rs.getString("maquyen"));
                danhsachTaiKhoan.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsachTaiKhoan;
    }

    public boolean TaoTaiKhoan(String tentaikhoan, String matkhau, String quyen) {
        String sql = "insert into TaiKhoan values ('"+tentaikhoan+"','"+matkhau+"','"+quyen+"')";
        int update = ConnectionModel.UpdateSQl(sql);
        return 0 != update;
    }

    public boolean TaoTaiKhoan(TaiKhoan tk) {
        String sql = "insert into TaiKhoan values ('"+tk.getTentaikhoan()+"','"+tk.getMatkhau()+"','"+tk.getMaquyen()+"')";
        int update = ConnectionModel.UpdateSQl(sql);
        return 0 != update;
    }
    
    public boolean DoiMatKhau(TaiKhoan tk){
        String sql = "update TaiKhoan set MatKhau='"+tk.getMatkhau()+"' where (TenTaiKhoan = '"+tk.getTentaikhoan()+"')";
        int update = ConnectionModel.UpdateSQl(sql);
        return 0 != update;
    }
    // Test thử lấy ra một thông tin tài khoản
     public static void main(String args[]) {
         TaiKhoanController tkmodel = new TaiKhoanController();
         System.out.print("Tài Khoản: "+tkmodel.layDSTaiKhoan().get(0).getTentaikhoan());
         System.out.print("\nMật Khẩu: "+tkmodel.layDSTaiKhoan().get(0).getMatkhau());
         System.out.print("\nMã Quyền: "+tkmodel.layDSTaiKhoan().get(0).getMaquyen());
         System.out.println();
    }
}
