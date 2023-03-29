package Controller;

import Model.ConnectionModel;
import Model.DanhSachTiem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DanhSachTiemController {
    public ArrayList<DanhSachTiem> layDSDanhSachTiem() {
        // Khởi tạo danh sách tài khoản
        ArrayList<DanhSachTiem> danhsachDanhSachTiem = new ArrayList<>();
        try {
            String sql = "Select * From DanhSachTiem"; // Thực hiện câu lệnh SQL
            ResultSet rs = ConnectionModel.ThucHienSQL(sql);
            // Đọc từng bản ghi một
            while (rs.next()) {
                DanhSachTiem tk = new DanhSachTiem(rs.getString("masods"),rs.getString("tends"));
                danhsachDanhSachTiem.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachTiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsachDanhSachTiem;
    }
}
