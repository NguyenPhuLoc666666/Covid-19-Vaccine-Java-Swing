package View;

import Check_Validator.Validation;
import Controller.QuyenController;
import Controller.TaiKhoanController;
import Model.TaiKhoan;
import javax.swing.JOptionPane;

public class FromTaoTaiKhoanMoi extends javax.swing.JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FromTaoTaiKhoanMoi() {
        initComponents();
        setLocationRelativeTo(null); // Cho form vào giữa màn hình
        
        // load thông tin các quyền lên View
        new QuyenController().Load_CMB_Quyen(cmb_Quyen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_MatKhau = new javax.swing.JTextField();
        txt_NhapLaiMK = new javax.swing.JTextField();
        txt_TaiKhoan = new javax.swing.JTextField();
        btnTaoTaiKhoan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmb_Quyen = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("Tên tài khoản");

        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("Mật khẩu");

        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setText("Nhập lại mật khẩu");

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Quyền");

        btnTaoTaiKhoan.setBackground(new java.awt.Color(153, 255, 153));
        btnTaoTaiKhoan.setForeground(new java.awt.Color(255, 0, 153));
        btnTaoTaiKhoan.setText("Tạo tài khoản mới");
        btnTaoTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoTaiKhoanMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("THÊM TÀI KHOẢN");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 132, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaoTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_Quyen, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_NhapLaiMK)
                    .addComponent(txt_MatKhau, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_NhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_Quyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoTaiKhoanMouseClicked
        String tentk = txt_TaiKhoan.getText();
        String mk = txt_MatKhau.getText();
        String check_mk = txt_NhapLaiMK.getText();
        String quyen = new QuyenController().Get_MaQuyen(cmb_Quyen);
        TaiKhoan tk = new TaiKhoan(tentk,mk,quyen);
        // Gọi hàm validation để kiểm tra nhập liệu
        boolean validate = new Validation().Validate_TaiKhoan(tentk,mk,check_mk) ;
        if (validate) {
            // Gọi hàm từ TaiKhoanController để kiểm tra
            boolean Check_TaoTaiKhoan = new TaiKhoanController().TaoTaiKhoan(tk);
            if (Check_TaoTaiKhoan) {
                JOptionPane.showMessageDialog(null, "Đăng ký tài khoản mới thành công !",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Đăng ký thất bại",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnTaoTaiKhoanMouseClicked

    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FromTaoTaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromTaoTaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromTaoTaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromTaoTaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromTaoTaiKhoanMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoTaiKhoan;
    private javax.swing.JComboBox<String> cmb_Quyen;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_MatKhau;
    private javax.swing.JTextField txt_NhapLaiMK;
    private javax.swing.JTextField txt_TaiKhoan;
    // End of variables declaration//GEN-END:variables
}
