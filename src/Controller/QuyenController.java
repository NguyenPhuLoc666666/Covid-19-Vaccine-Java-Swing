package Controller;

import Model.ConnectionModel;
import Model.Quan;
import Model.Quyen;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class QuyenController {
     public ArrayList<Quyen> layDSQuyen() {
        // Khởi tạo danh sách Quyền
        ArrayList<Quyen> danhsachQuyen = new ArrayList<>();
        try {
            String sql = "Select * From Quyen"; // Thực hiện câu lệnh SQL
            ResultSet rs = ConnectionModel.ThucHienSQL(sql);
            while (rs.next()) {
                Quyen q = new Quyen(rs.getString("maquyen"),rs.getString("tenquyen"));
                danhsachQuyen.add(q);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhsachQuyen;
}
     
     //Thêm data tên quận load vào cmb lên View
    public JComboBox Load_CMB_Quyen(JComboBox cmb_Quyen) {
        ArrayList<Quyen> lstQuyen= new QuyenController().layDSQuyen();
        lstQuyen.forEach(item -> {
            cmb_Quyen.addItem(item.getTenquyen());
        });
        return cmb_Quyen;
    }
    
    // Lấy ra các mã quận từ tên quận
    public String Get_MaQuyen(JComboBox cmb_Quyen) {
        ArrayList<Quyen> lstQuyen = new QuyenController().layDSQuyen();
        String maquan = "";
        for (Quyen item : lstQuyen) {
            if (item.getTenquyen().equals(cmb_Quyen.getSelectedItem().toString())) {
                maquan = item.getMaquyen();
            }
        }
        return maquan;
    }
}
