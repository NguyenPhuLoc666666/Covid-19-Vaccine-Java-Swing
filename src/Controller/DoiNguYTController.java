package Controller;

import Model.ConnectionModel;
import Model.DoiNguYT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoiNguYTController {
     public ArrayList<DoiNguYT> layDSDoiNguYT() {
        // Khởi tạo danh sách tài khoản
        ArrayList<DoiNguYT> danhsachDoiNguYT = new ArrayList<>();
        try {
            String sql = "Select * From DoiNguYT"; // Thực hiện câu lệnh SQL
            ResultSet rs = ConnectionModel.ThucHienSQL(sql);
            // Đọc từng bản ghi một
            while (rs.next()) {
                DoiNguYT dn = new DoiNguYT(rs.getString("madoingu"),rs.getString("tendoingu"));
                danhsachDoiNguYT.add(dn);
            }
 
        } catch (SQLException ex) {
            Logger.getLogger(DoiNguYTController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsachDoiNguYT;
    }
}
