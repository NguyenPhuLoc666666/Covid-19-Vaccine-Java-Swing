package Controller;

import Model.ConnectionModel;
import Model.DotTiem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DotTiemController {
     public ArrayList<DotTiem> layDSDotTiem() {
        // Khởi tạo danh sách tài khoản
        ArrayList<DotTiem> danhsachDotTiem = new ArrayList<>();
        try {
            String sql = "Select * From DotTiem"; // Thực hiện câu lệnh SQL
            ResultSet rs = ConnectionModel.ThucHienSQL(sql);
            // Đọc từng bản ghi một
            while (rs.next()) {
                DotTiem dt = new DotTiem(rs.getString("madottiem"),rs.getDate("ngaytiem"),rs.getString("maquan"),rs.getString("maphuong"),rs.getString("masolo"),rs.getString("masods"),rs.getString("madoingu"));
                danhsachDotTiem.add(dt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DotTiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsachDotTiem;
    }
}
