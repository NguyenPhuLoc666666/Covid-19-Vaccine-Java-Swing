package Controller;

import Model.ConnectionModel;
import Model.Phuong;
import Model.Quan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class PhuongController {
    public ArrayList<Phuong> layDSPhuong() {
        // Khởi tạo danh sách Phường
        ArrayList<Phuong> danhsachPhuong = new ArrayList<>();
        try {
            String sql = "Select * From Phuong"; // Thực hiện câu lệnh SQL
            ResultSet rs = ConnectionModel.ThucHienSQL(sql);
            // Đọc từng bản ghi một
            while (rs.next()) {
                Phuong p = new Phuong(rs.getString("maphuong"),rs.getString("tenphuong"),rs.getString("maquan"));
                danhsachPhuong.add(p);
            }
 
        } catch (SQLException ex) {
            Logger.getLogger(PhuongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsachPhuong;
}
    
    //Thêm data tên quận load vào cmb lên View
    public JComboBox Load_CMB_Phuong(JComboBox cmb_Phuong, JComboBox cmb_Quan) {
        ArrayList<Phuong> lstQuan= new PhuongController().layDSPhuong();
        String maQuan = new QuanController().Get_MaQuan(cmb_Quan);
        lstQuan.forEach(item -> {
            if(item.getMaQuan().equals(maQuan))
                cmb_Phuong.addItem(item.getTenPhuong());
        });
        return cmb_Phuong;
    }
    
    // Lấy ra các mã quận từ tên quận
    public static String Get_MaPhuong(JComboBox cmb_Phuong) {
        ArrayList<Phuong> lstPhuong = new PhuongController().layDSPhuong();
        String maphuong = "";
        for (Phuong item : lstPhuong) {
            if (item.getTenPhuong().equals(cmb_Phuong.getSelectedItem().toString())) {
                maphuong = item.getMaPhuong();
            }
        }
        return maphuong;
    }
}
