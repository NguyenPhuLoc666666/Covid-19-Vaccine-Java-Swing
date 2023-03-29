package Controller;

import Model.ConnectionModel;
import Model.LoVacXin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoVacXinController {
    public ArrayList<LoVacXin> layDSLoVacXin() {
        // Khởi tạo danh sách tài khoản
        ArrayList<LoVacXin> danhsachLoVacXin = new ArrayList<>();
        try {
            String sql = "Select * From LoVacXin"; // Thực hiện câu lệnh SQL
            ResultSet rs = ConnectionModel.ThucHienSQL(sql);
            while (rs.next()) {
                LoVacXin lvx = new LoVacXin(rs.getString("masolo"),rs.getInt("soluong"),rs.getString("maloai"),rs.getDate("ngaysanxuat").toString(),rs.getString("ngayhethan"),rs.getBoolean("trangthai"),rs.getString("dotuoi"));
                danhsachLoVacXin.add(lvx);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoVacXinController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsachLoVacXin;
    }
}
