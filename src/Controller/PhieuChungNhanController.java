package Controller;

import Model.ConnectionModel;
import Model.PhieuChungNhan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhieuChungNhanController {
     public ArrayList<PhieuChungNhan> layDSPhieuChungNhan() {
        // Khởi tạo danh sách tài khoản
        ArrayList<PhieuChungNhan> danhsachPhieuChungNhan = new ArrayList<>();
        try {
            String sql = "Select * From PhieuChungNhan"; // Thực hiện câu lệnh SQL
            ResultSet rs = ConnectionModel.ThucHienSQL(sql);
            // Đọc từng bản ghi một
            while (rs.next()) {
                PhieuChungNhan tk = new PhieuChungNhan(rs.getString("masophieu"),rs.getString("madottiem"),rs.getInt("lantiem"),rs.getString("cmnd"),rs.getString("manhanvienyt"));
                danhsachPhieuChungNhan.add(tk);
            }
 
        } catch (SQLException ex) {
            Logger.getLogger(PhieuChungNhanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsachPhieuChungNhan;
    }
}
