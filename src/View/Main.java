package View;
import Controller.NguoiDanController;
import Controller.PhieuChungNhanController;
import Model.NguoiDan;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Main() {
        initComponents();
        setLocationRelativeTo(null); // Cho form vào giữa màn hình
        CaiDatLoadForm();
        
        // load người dân
       loaddataTrangChu();
    }

        // Lấy thông tin tài khoản đăng nhập
    public Main(String taikhoan, String matkhau) {
        this();
        txtTaiKhoanDangNhap.setText(taikhoan);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void CaiDatLoadForm(){  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        // tạo 1 đối tượng có định dạng thời gian yyyy-MM-dd HH:mm:ss
        Date date = new Date(); // lấy thời gian hệ thống
        String stringDate = dateFormat.format(date);//Định dạng thời gian theo trên
        txtTime.setText(stringDate);
        
        
        // active color btn trang chủ 
          btnTrangCHu.setBackground(Color.decode("#FF3399"));
        
        // Lấy số lượng đã tiêm tại tp hcm
//       int soluong = new PhieuChungNhanController().SoLuongMuiTiem();
//       txtTongMuiTiemHCM.setText(String.valueOf(soluong)); 
//       
//        // Lấy số lượng đã tiêm hôm qua
//       int sltiemhomqua = new PhieuChungNhanController().SoLuongHomQua();
//       textSLTiemHomQua.setText(String.valueOf(sltiemhomqua)); 
    }
    
    public void loaddataTrangChu(){
        ArrayList<NguoiDan> loadCaTiemHomNay = new NguoiDanController().layDSNguoiDan();
        DefaultTableModel tbModel =(DefaultTableModel) table_TiemChungHomNay.getModel();
        tbModel.setRowCount(0);
        int stt=0;
        for(NguoiDan nd : loadCaTiemHomNay){
            stt++;
            Object[] object = new Object[]{stt,nd.getCmnd(),nd.getHoten(),nd.getGioitinh(),nd.getNamsinh(),nd.getSdt(),nd.getMaquan(),nd.getMaphuong(),nd.getDiachi(),nd.getMasods()};
            tbModel.addRow(object);
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Layout = new javax.swing.JPanel();
        Layout_SideBar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        btnTrangCHu = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTiemMui1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnTiemMui2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnThongKe = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnCaiDat = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnChungNhan = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Layout_Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnTaoTaiKhoan = new javax.swing.JLabel();
        btn_image = new javax.swing.JLabel();
        txtTieuDe = new javax.swing.JLabel();
        txtTaiKhoanDangNhap = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Layout_Footer = new javax.swing.JPanel();
        btnCapNhat = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        btnBaoCao = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btnCmbBaoCao = new javax.swing.JComboBox<>();
        btnTraCuu = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        Layout_Body = new javax.swing.JPanel();
        PanelTrangChu = new javax.swing.JPanel();
        PanelChungNhan1 = new javax.swing.JPanel();
        txtSoLuongTiemHomQua3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        textSLTiemHomQua = new javax.swing.JLabel();
        txtSoLuongTiemHomQua4 = new javax.swing.JPanel();
        txtinfo1 = new javax.swing.JLabel();
        txtTongMuiTiemHCM = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_TiemChungHomNay = new javax.swing.JTable();
        PanelTiemMui2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        PanelTiemMui1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        PanelThongKe = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PanelCaiDat = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnDoiPass = new javax.swing.JButton();
        PanelChungNhan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        jTextField9.setText("jTextField9");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(31, 30, 68));

        Layout.setBackground(new java.awt.Color(31, 30, 68));

        Layout_SideBar.setBackground(new java.awt.Color(31, 30, 68));
        Layout_SideBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(204, 204, 255))); // NOI18N
        Layout_SideBar.setPreferredSize(new java.awt.Dimension(212, 520));

        jPanel2.setBackground(new java.awt.Color(31, 30, 68));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/image_covid1.png"))); // NOI18N

        txtTime.setBackground(new java.awt.Color(255, 255, 255));
        txtTime.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTime.setForeground(new java.awt.Color(255, 255, 255));
        txtTime.setText("20:30:12 01/04/22021");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtTime))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTime)
                .addGap(18, 18, 18))
        );

        btnTrangCHu.setBackground(new java.awt.Color(31, 30, 68));
        btnTrangCHu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrangCHuMouseClicked(evt);
            }
        });

        btnTrangChu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        btnTrangChu.setText("Trang Chủ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_home_cam.png"))); // NOI18N

        javax.swing.GroupLayout btnTrangCHuLayout = new javax.swing.GroupLayout(btnTrangCHu);
        btnTrangCHu.setLayout(btnTrangCHuLayout);
        btnTrangCHuLayout.setHorizontalGroup(
            btnTrangCHuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTrangCHuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(btnTrangChu)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        btnTrangCHuLayout.setVerticalGroup(
            btnTrangCHuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTrangCHuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnTrangCHuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrangChu)
                    .addComponent(jLabel4))
                .addGap(361, 361, 361))
        );

        btnTiemMui1.setBackground(new java.awt.Color(31, 30, 68));
        btnTiemMui1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTiemMui1MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tiêm Mũi 1");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_muitiem1.png"))); // NOI18N

        jPanel12.setBackground(new java.awt.Color(31, 30, 68));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Trang chủ");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(361, 361, 361))
        );

        javax.swing.GroupLayout btnTiemMui1Layout = new javax.swing.GroupLayout(btnTiemMui1);
        btnTiemMui1.setLayout(btnTiemMui1Layout);
        btnTiemMui1Layout.setHorizontalGroup(
            btnTiemMui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTiemMui1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnTiemMui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnTiemMui1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnTiemMui1Layout.setVerticalGroup(
            btnTiemMui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTiemMui1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnTiemMui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(361, 361, 361))
            .addGroup(btnTiemMui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnTiemMui1Layout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );

        btnTiemMui2.setBackground(new java.awt.Color(31, 30, 68));
        btnTiemMui2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTiemMui2MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tiêm Mũi 2");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_muitiem2.png"))); // NOI18N

        jPanel16.setBackground(new java.awt.Color(31, 30, 68));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setText("Trang chủ");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel16)
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(361, 361, 361))
        );

        javax.swing.GroupLayout btnTiemMui2Layout = new javax.swing.GroupLayout(btnTiemMui2);
        btnTiemMui2.setLayout(btnTiemMui2Layout);
        btnTiemMui2Layout.setHorizontalGroup(
            btnTiemMui2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTiemMui2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnTiemMui2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnTiemMui2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnTiemMui2Layout.setVerticalGroup(
            btnTiemMui2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTiemMui2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnTiemMui2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(361, 361, 361))
            .addGroup(btnTiemMui2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnTiemMui2Layout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );

        btnThongKe.setBackground(new java.awt.Color(31, 30, 68));
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongKeMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Thống Kê");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_thongke.png"))); // NOI18N

        jPanel22.setBackground(new java.awt.Color(31, 30, 68));

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel27.setText("Trang chủ");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel28)
                .addGap(26, 26, 26)
                .addComponent(jLabel27)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(361, 361, 361))
        );

        javax.swing.GroupLayout btnThongKeLayout = new javax.swing.GroupLayout(btnThongKe);
        btnThongKe.setLayout(btnThongKeLayout);
        btnThongKeLayout.setHorizontalGroup(
            btnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThongKeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel26)
                .addGap(26, 26, 26)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnThongKeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnThongKeLayout.setVerticalGroup(
            btnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThongKeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(361, 361, 361))
            .addGroup(btnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnThongKeLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );

        btnCaiDat.setBackground(new java.awt.Color(31, 30, 68));
        btnCaiDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCaiDatMouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Cài Đặt");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_caidat.png"))); // NOI18N

        jPanel24.setBackground(new java.awt.Color(31, 30, 68));

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel31.setText("Trang chủ");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel32)
                .addGap(26, 26, 26)
                .addComponent(jLabel31)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addGap(361, 361, 361))
        );

        javax.swing.GroupLayout btnCaiDatLayout = new javax.swing.GroupLayout(btnCaiDat);
        btnCaiDat.setLayout(btnCaiDatLayout);
        btnCaiDatLayout.setHorizontalGroup(
            btnCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCaiDatLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel30)
                .addGap(26, 26, 26)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCaiDatLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnCaiDatLayout.setVerticalGroup(
            btnCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCaiDatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(361, 361, 361))
            .addGroup(btnCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCaiDatLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );

        btnChungNhan.setBackground(new java.awt.Color(31, 30, 68));
        btnChungNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChungNhanMouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Chứng Nhận");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_chungnhan.png"))); // NOI18N

        jPanel26.setBackground(new java.awt.Color(31, 30, 68));

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel35.setText("Trang chủ");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel36)
                .addGap(26, 26, 26)
                .addComponent(jLabel35)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addGap(361, 361, 361))
        );

        javax.swing.GroupLayout btnChungNhanLayout = new javax.swing.GroupLayout(btnChungNhan);
        btnChungNhan.setLayout(btnChungNhanLayout);
        btnChungNhanLayout.setHorizontalGroup(
            btnChungNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnChungNhanLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel34)
                .addGap(26, 26, 26)
                .addComponent(jLabel33)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(btnChungNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnChungNhanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnChungNhanLayout.setVerticalGroup(
            btnChungNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnChungNhanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnChungNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGap(361, 361, 361))
            .addGroup(btnChungNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnChungNhanLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );

        btnDangXuat.setBackground(new java.awt.Color(31, 30, 68));
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Đăng Xuất");

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_login.jpg"))); // NOI18N

        jPanel29.setBackground(new java.awt.Color(31, 30, 68));

        jLabel53.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel53.setText("Trang chủ");

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel54)
                .addGap(26, 26, 26)
                .addComponent(jLabel53)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addGap(361, 361, 361))
        );

        javax.swing.GroupLayout btnDangXuatLayout = new javax.swing.GroupLayout(btnDangXuat);
        btnDangXuat.setLayout(btnDangXuatLayout);
        btnDangXuatLayout.setHorizontalGroup(
            btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDangXuatLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel52)
                .addGap(26, 26, 26)
                .addComponent(jLabel51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnDangXuatLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnDangXuatLayout.setVerticalGroup(
            btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDangXuatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addGap(361, 361, 361))
            .addGroup(btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnDangXuatLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_trash.png"))); // NOI18N
        jLabel17.setText("Thùng Rác");

        javax.swing.GroupLayout Layout_SideBarLayout = new javax.swing.GroupLayout(Layout_SideBar);
        Layout_SideBar.setLayout(Layout_SideBarLayout);
        Layout_SideBarLayout.setHorizontalGroup(
            Layout_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_SideBarLayout.createSequentialGroup()
                .addGroup(Layout_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Layout_SideBarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(Layout_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChungNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Layout_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnTiemMui2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTiemMui1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Layout_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnTrangCHu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCaiDat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Layout_SideBarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Layout_SideBarLayout.setVerticalGroup(
            Layout_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_SideBarLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrangCHu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTiemMui1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTiemMui2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChungNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        Layout_Header.setBackground(new java.awt.Color(26, 25, 62));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản Lý Tài Khoản");

        btnTaoTaiKhoan.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnTaoTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoTaiKhoan.setText("Tạo Tài Khoản mới");
        btnTaoTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoTaiKhoanMouseClicked(evt);
            }
        });

        btn_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_home_cam.png"))); // NOI18N

        txtTieuDe.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTieuDe.setForeground(new java.awt.Color(255, 51, 153));
        txtTieuDe.setText("Trang Chủ");

        txtTaiKhoanDangNhap.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTaiKhoanDangNhap.setForeground(new java.awt.Color(255, 51, 153));
        txtTaiKhoanDangNhap.setText("Admin");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_avata.png"))); // NOI18N

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_taomoi.png"))); // NOI18N

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_qltk.png"))); // NOI18N

        javax.swing.GroupLayout Layout_HeaderLayout = new javax.swing.GroupLayout(Layout_Header);
        Layout_Header.setLayout(Layout_HeaderLayout);
        Layout_HeaderLayout.setHorizontalGroup(
            Layout_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Layout_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layout_HeaderLayout.createSequentialGroup()
                        .addComponent(btn_image)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTieuDe))
                    .addComponent(jLabel2))
                .addGroup(Layout_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Layout_HeaderLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaoTaiKhoan)
                        .addContainerGap(419, Short.MAX_VALUE))
                    .addGroup(Layout_HeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTaiKhoanDangNhap)
                        .addGap(30, 30, 30))))
        );
        Layout_HeaderLayout.setVerticalGroup(
            Layout_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Layout_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Layout_HeaderLayout.createSequentialGroup()
                        .addGroup(Layout_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Layout_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel50)
                                .addComponent(jLabel49)
                                .addComponent(btnTaoTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(Layout_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Layout_HeaderLayout.createSequentialGroup()
                                .addComponent(txtTaiKhoanDangNhap)
                                .addGap(8, 8, 8))
                            .addGroup(Layout_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTieuDe)
                                .addComponent(btn_image))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layout_HeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel20)))
                .addContainerGap())
        );

        Layout_Footer.setBackground(new java.awt.Color(31, 30, 80));
        Layout_Footer.setPreferredSize(new java.awt.Dimension(634, 55));

        btnCapNhat.setBackground(new java.awt.Color(31, 30, 68));
        btnCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapNhatMouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Cập Nhật");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_update.png"))); // NOI18N

        jPanel25.setBackground(new java.awt.Color(31, 30, 68));

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel39.setText("Trang chủ");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel40)
                .addGap(26, 26, 26)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addGap(361, 361, 361))
        );

        javax.swing.GroupLayout btnCapNhatLayout = new javax.swing.GroupLayout(btnCapNhat);
        btnCapNhat.setLayout(btnCapNhatLayout);
        btnCapNhatLayout.setHorizontalGroup(
            btnCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCapNhatLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCapNhatLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnCapNhatLayout.setVerticalGroup(
            btnCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCapNhatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addGap(361, 361, 361))
            .addGroup(btnCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCapNhatLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );

        btnBaoCao.setBackground(new java.awt.Color(31, 30, 68));
        btnBaoCao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBaoCaoMouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_report.png"))); // NOI18N

        jPanel27.setBackground(new java.awt.Color(31, 30, 68));

        jLabel43.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel43.setText("Trang chủ");

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel44)
                .addGap(26, 26, 26)
                .addComponent(jLabel43)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addGap(361, 361, 361))
        );

        btnCmbBaoCao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCmbBaoCao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Báo Cáo", "Kết Quả Tiêm", "Người Dân Tiêm", "Nhân Viên Y Tế" }));

        javax.swing.GroupLayout btnBaoCaoLayout = new javax.swing.GroupLayout(btnBaoCao);
        btnBaoCao.setLayout(btnBaoCaoLayout);
        btnBaoCaoLayout.setHorizontalGroup(
            btnBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBaoCaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCmbBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnBaoCaoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnBaoCaoLayout.setVerticalGroup(
            btnBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBaoCaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42)
                    .addGroup(btnBaoCaoLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(30, 30, 30))
                    .addComponent(btnCmbBaoCao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(367, 367, 367))
            .addGroup(btnBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnBaoCaoLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );

        btnTraCuu.setBackground(new java.awt.Color(31, 30, 68));
        btnTraCuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTraCuuMouseClicked(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Tra Cứu");

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_search.png"))); // NOI18N

        jPanel28.setBackground(new java.awt.Color(31, 30, 68));

        jLabel47.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel47.setText("Trang chủ");

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel48)
                .addGap(26, 26, 26)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addGap(361, 361, 361))
        );

        javax.swing.GroupLayout btnTraCuuLayout = new javax.swing.GroupLayout(btnTraCuu);
        btnTraCuu.setLayout(btnTraCuuLayout);
        btnTraCuuLayout.setHorizontalGroup(
            btnTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTraCuuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel46)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnTraCuuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnTraCuuLayout.setVerticalGroup(
            btnTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTraCuuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46))
                .addGap(361, 361, 361))
            .addGroup(btnTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnTraCuuLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Layout_FooterLayout = new javax.swing.GroupLayout(Layout_Footer);
        Layout_Footer.setLayout(Layout_FooterLayout);
        Layout_FooterLayout.setHorizontalGroup(
            Layout_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_FooterLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Layout_FooterLayout.setVerticalGroup(
            Layout_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layout_FooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Layout_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Layout_Body.setPreferredSize(new java.awt.Dimension(670, 450));
        Layout_Body.setLayout(new java.awt.CardLayout());

        PanelTrangChu.setBackground(new java.awt.Color(51, 0, 153));
        PanelTrangChu.setPreferredSize(new java.awt.Dimension(670, 500));

        PanelChungNhan1.setBackground(new java.awt.Color(153, 0, 153));

        txtSoLuongTiemHomQua3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Số mũi đã tiêm hôm qua");

        textSLTiemHomQua.setBackground(new java.awt.Color(0, 0, 0));
        textSLTiemHomQua.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textSLTiemHomQua.setForeground(new java.awt.Color(0, 0, 0));
        textSLTiemHomQua.setText("0");

        javax.swing.GroupLayout txtSoLuongTiemHomQua3Layout = new javax.swing.GroupLayout(txtSoLuongTiemHomQua3);
        txtSoLuongTiemHomQua3.setLayout(txtSoLuongTiemHomQua3Layout);
        txtSoLuongTiemHomQua3Layout.setHorizontalGroup(
            txtSoLuongTiemHomQua3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtSoLuongTiemHomQua3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(textSLTiemHomQua, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        txtSoLuongTiemHomQua3Layout.setVerticalGroup(
            txtSoLuongTiemHomQua3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtSoLuongTiemHomQua3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtSoLuongTiemHomQua3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(textSLTiemHomQua))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtSoLuongTiemHomQua4.setBackground(new java.awt.Color(255, 255, 255));

        txtinfo1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtinfo1.setForeground(new java.awt.Color(0, 0, 0));
        txtinfo1.setText("Số mũi đã tiêm toàn TP HCM");

        txtTongMuiTiemHCM.setBackground(new java.awt.Color(0, 0, 0));
        txtTongMuiTiemHCM.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTongMuiTiemHCM.setForeground(new java.awt.Color(0, 0, 0));
        txtTongMuiTiemHCM.setText("0");

        javax.swing.GroupLayout txtSoLuongTiemHomQua4Layout = new javax.swing.GroupLayout(txtSoLuongTiemHomQua4);
        txtSoLuongTiemHomQua4.setLayout(txtSoLuongTiemHomQua4Layout);
        txtSoLuongTiemHomQua4Layout.setHorizontalGroup(
            txtSoLuongTiemHomQua4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtSoLuongTiemHomQua4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtinfo1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtTongMuiTiemHCM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        txtSoLuongTiemHomQua4Layout.setVerticalGroup(
            txtSoLuongTiemHomQua4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtSoLuongTiemHomQua4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtSoLuongTiemHomQua4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtinfo1)
                    .addComponent(txtTongMuiTiemHCM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_TiemChungHomNay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "CMND", "Họ Tên", "Giới Tính", "Năm Sinh", "SĐT", "Quận", "Phường", "Địa Chỉ", "MSDS"
            }
        ));
        jScrollPane2.setViewportView(table_TiemChungHomNay);

        javax.swing.GroupLayout PanelChungNhan1Layout = new javax.swing.GroupLayout(PanelChungNhan1);
        PanelChungNhan1.setLayout(PanelChungNhan1Layout);
        PanelChungNhan1Layout.setHorizontalGroup(
            PanelChungNhan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChungNhan1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(PanelChungNhan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(PanelChungNhan1Layout.createSequentialGroup()
                        .addComponent(txtSoLuongTiemHomQua3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(txtSoLuongTiemHomQua4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        PanelChungNhan1Layout.setVerticalGroup(
            PanelChungNhan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChungNhan1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelChungNhan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSoLuongTiemHomQua4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongTiemHomQua3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelTrangChuLayout = new javax.swing.GroupLayout(PanelTrangChu);
        PanelTrangChu.setLayout(PanelTrangChuLayout);
        PanelTrangChuLayout.setHorizontalGroup(
            PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelChungNhan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTrangChuLayout.setVerticalGroup(
            PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelChungNhan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Layout_Body.add(PanelTrangChu, "card3");

        PanelTiemMui2.setBackground(new java.awt.Color(153, 204, 255));
        PanelTiemMui2.setPreferredSize(new java.awt.Dimension(670, 500));
        PanelTiemMui2.setRequestFocusEnabled(false);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel72.setText("Chọn đợt tiêm :");

        jLabel73.setText("Số ca tiêm:");

        jLabel74.setText("Loại Vắc Xin :");

        jLabel75.setText("Địa điểm tiêm :");

        jLabel76.setText("Danh sách: ");

        jLabel77.setText("Đội Ngũ :");

        jLabel78.setText("Mã lô :");

        jLabel79.setText("Ngày tiêm :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel74)
                                    .addComponent(jLabel78))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel77)
                                    .addComponent(jLabel76)))
                            .addComponent(jLabel73)
                            .addComponent(jLabel75)
                            .addComponent(jLabel79))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel76)
                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(jLabel73)
                .addGap(6, 6, 6))
        );

        jLabel80.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel80.setText("Thông Tin Tiêm Mũi 2");

        jLabel89.setText("Tên nv :");

        jLabel90.setText("Lần tiêm :");

        jTextField17.setText("1");

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jButton2.setText("Tìm Kiếm");

        jLabel82.setText("Vắc xin đã thêm :");

        jLabel87.setText("Ngày đã tiêm :");

        jLabel88.setText("Chưa có thông tin ");

        jLabel91.setText("Chưa có thông tin ");

        jLabel86.setText("Họ và tên :");

        jLabel92.setText("CMND/CCCD :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel87)
                            .addComponent(jLabel82))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel91)
                            .addComponent(jLabel88)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel92)
                            .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField18)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel91))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88))
                .addGap(20, 20, 20))
        );

        jButton5.setText("Thêm");

        jButton6.setText("Sửa");

        jButton7.setText("Xóa");

        jButton8.setText("Sửa TT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel89)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel90)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelTiemMui2Layout = new javax.swing.GroupLayout(PanelTiemMui2);
        PanelTiemMui2.setLayout(PanelTiemMui2Layout);
        PanelTiemMui2Layout.setHorizontalGroup(
            PanelTiemMui2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTiemMui2Layout.setVerticalGroup(
            PanelTiemMui2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTiemMui2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(286, 286, 286))
        );

        Layout_Body.add(PanelTiemMui2, "card5");

        PanelTiemMui1.setBackground(new java.awt.Color(204, 153, 0));
        PanelTiemMui1.setPreferredSize(new java.awt.Dimension(670, 500));
        PanelTiemMui1.setRequestFocusEnabled(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102), 2));

        jLabel21.setText("Chọn đợt tiêm :");

        jLabel24.setText("Số ca tiêm:");

        jLabel55.setText("Loại Vắc Xin :");

        jLabel56.setText("Địa điểm tiêm :");

        jLabel58.setText("Danh sách: ");

        jLabel59.setText("Đội Ngũ :");

        jLabel60.setText("Mã lô :");

        jLabel61.setText("Ngày tiêm :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel60))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel58)))
                            .addComponent(jLabel24)
                            .addComponent(jLabel56)
                            .addComponent(jLabel61))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(jLabel24)
                .addGap(6, 6, 6))
        );

        jLabel57.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel57.setText("Thông Tin Tiêm Mũi 1");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15/04/2022", "Item 2", "Item 3", "Item 4" }));

        jLabel62.setText("Ngày sinh :");

        jLabel63.setText("Giới tính :");

        jLabel64.setText("Họ và tên :");

        jLabel65.setText("CMND/CCCD :");

        jLabel66.setText("Số điện thoại :");

        jRadioButton1.setText("Nam");

        jRadioButton2.setText("Nữ");

        jLabel67.setText("Quận :");

        jLabel68.setText("Phường :");

        jLabel69.setText("Địa chỉ :");

        jLabel70.setText("Tên nv :");

        jLabel71.setText("Lần tiêm :");

        jTextField8.setText("1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel63)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel65)
                                .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel66)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton2))
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71)
                            .addComponent(jLabel67))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField12)
                    .addComponent(jTextField13)
                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62)
                            .addComponent(jLabel70)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel71)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "CMND", "Họ Tên", "Ngày Sinh", "Giới tính", "Địa chỉ", "Phường", "Quận", "Phường", "Tên NV", "Ngày tiêm", "Lần Tiêm", "Loại Vắc Xin"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout PanelTiemMui1Layout = new javax.swing.GroupLayout(PanelTiemMui1);
        PanelTiemMui1.setLayout(PanelTiemMui1Layout);
        PanelTiemMui1Layout.setHorizontalGroup(
            PanelTiemMui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTiemMui1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTiemMui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelTiemMui1Layout.setVerticalGroup(
            PanelTiemMui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTiemMui1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        Layout_Body.add(PanelTiemMui1, "card4");

        PanelThongKe.setBackground(new java.awt.Color(255, 153, 153));
        PanelThongKe.setForeground(new java.awt.Color(0, 0, 0));
        PanelThongKe.setPreferredSize(new java.awt.Dimension(670, 500));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout PanelThongKeLayout = new javax.swing.GroupLayout(PanelThongKe);
        PanelThongKe.setLayout(PanelThongKeLayout);
        PanelThongKeLayout.setHorizontalGroup(
            PanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThongKeLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelThongKeLayout.setVerticalGroup(
            PanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThongKeLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Layout_Body.add(PanelThongKe, "card2");
        PanelThongKe.getAccessibleContext().setAccessibleDescription("");

        PanelCaiDat.setBackground(new java.awt.Color(255, 204, 102));
        PanelCaiDat.setPreferredSize(new java.awt.Dimension(670, 500));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/image_covid1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Đổi Logo");

        jButton1.setText("Chọn Đường Dẫn");

        btnDoiPass.setText("Đổi Mật Khẩu");
        btnDoiPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiPassMouseClicked(evt);
            }
        });
        btnDoiPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCaiDatLayout = new javax.swing.GroupLayout(PanelCaiDat);
        PanelCaiDat.setLayout(PanelCaiDatLayout);
        PanelCaiDatLayout.setHorizontalGroup(
            PanelCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCaiDatLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(PanelCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDoiPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );
        PanelCaiDatLayout.setVerticalGroup(
            PanelCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCaiDatLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCaiDatLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)))
                .addGap(88, 88, 88)
                .addComponent(btnDoiPass)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        Layout_Body.add(PanelCaiDat, "card7");
        PanelCaiDat.getAccessibleContext().setAccessibleName("");

        PanelChungNhan.setBackground(new java.awt.Color(153, 0, 153));
        PanelChungNhan.setPreferredSize(new java.awt.Dimension(670, 500));

        jLabel9.setText("CMND");

        jTextField1.setText("1911165417");

        jLabel10.setText("Họ và tên");

        jTextField2.setText("Trần Thị Cẩm Tú");

        jLabel11.setText("Số điện thoại");

        jTextField3.setText("0989384392");

        jLabel12.setText("Ngày sinh");

        jTextField4.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(141, 141, 141)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelChungNhanLayout = new javax.swing.GroupLayout(PanelChungNhan);
        PanelChungNhan.setLayout(PanelChungNhanLayout);
        PanelChungNhanLayout.setHorizontalGroup(
            PanelChungNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChungNhanLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelChungNhanLayout.setVerticalGroup(
            PanelChungNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChungNhanLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        Layout_Body.add(PanelChungNhan, "card6");

        javax.swing.GroupLayout LayoutLayout = new javax.swing.GroupLayout(Layout);
        Layout.setLayout(LayoutLayout);
        LayoutLayout.setHorizontalGroup(
            LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayoutLayout.createSequentialGroup()
                .addComponent(Layout_SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LayoutLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Layout_Body, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                            .addComponent(Layout_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Layout_Footer, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)))
        );
        LayoutLayout.setVerticalGroup(
            LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayoutLayout.createSequentialGroup()
                .addGroup(LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Layout_SideBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addGroup(LayoutLayout.createSequentialGroup()
                        .addComponent(Layout_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Layout_Body, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Layout_Footer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        Layout_Body.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Cài đặt màu cho các nút btn có trong giao diện
    public void SettingColor(){
       btnTrangCHu.setBackground(Color.decode("#1F1E44"));
       btnThongKe.setBackground(Color.decode("#1F1E44"));
       btnTiemMui1.setBackground(Color.decode("#1F1E44"));
       btnTiemMui2.setBackground(Color.decode("#1F1E44"));
       btnChungNhan.setBackground(Color.decode("#1F1E44"));
       btnCaiDat.setBackground(Color.decode("#1F1E44"));
    }
    
   // Hàm ẩn tất cả Panel có trong giao diện
    public void HihePanel(){
       PanelTrangChu.hide();
       PanelThongKe.hide();
       PanelTiemMui1.hide();
       PanelTiemMui2.hide();
       PanelChungNhan.hide();
       PanelCaiDat.hide();
    }

    // click vào bt trang
    private void btnTrangCHuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangCHuMouseClicked
        HihePanel();
        PanelTrangChu.show();
        SettingColor();
        btnTrangCHu.setBackground(Color.decode("#FF3399"));
        txtTieuDe.setText("Trang Chủ");
  
    }//GEN-LAST:event_btnTrangCHuMouseClicked

    private void btnThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseClicked
        HihePanel();
        PanelThongKe.show();
        SettingColor();
        btnThongKe.setBackground(Color.decode("#FF3399"));
        txtTieuDe.setText("Thống kê");
    }//GEN-LAST:event_btnThongKeMouseClicked

    private void btnTiemMui1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiemMui1MouseClicked
        HihePanel();
        PanelTiemMui1.show();
        SettingColor();
        btnTiemMui1.setBackground(Color.decode("#FF3399"));
        txtTieuDe.setText("Tiêm Mũi 1");
        
    }//GEN-LAST:event_btnTiemMui1MouseClicked

    private void btnTiemMui2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiemMui2MouseClicked
        HihePanel();
        PanelTiemMui2.show();
        SettingColor();
        btnTiemMui2.setBackground(Color.decode("#FF3399"));
        txtTieuDe.setText("Tiêm Mũi 2");
    }//GEN-LAST:event_btnTiemMui2MouseClicked

    private void btnChungNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChungNhanMouseClicked
        HihePanel();
        PanelChungNhan.show();
        SettingColor();
        btnChungNhan.setBackground(Color.decode("#FF3399"));
        txtTieuDe.setText("Chứng Nhận");
    }//GEN-LAST:event_btnChungNhanMouseClicked

    private void btnCaiDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaiDatMouseClicked
        HihePanel();
        PanelCaiDat.show();
        SettingColor();
        btnCaiDat.setBackground(Color.decode("#FF3399"));
        txtTieuDe.setText("Cài Đặt");
    }//GEN-LAST:event_btnCaiDatMouseClicked

    private void btnCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatMouseClicked
        this.hide();  
        FormNhapLieu m = new FormNhapLieu();
        m.show();
    }//GEN-LAST:event_btnCapNhatMouseClicked

    // Hàm Ẩn giao diện diện
    public void ShowFormMain() {
        this.setVisible(true);
    }

    public void HideFormMain() {
        this.setVisible(false);
    }

    private void btnBaoCaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaoCaoMouseClicked
       int value = btnCmbBaoCao.getSelectedIndex();
        
        if (value==2) {
//           FormThongKeNguoiDan formTKND = new FormThongKeNguoiDan(this);
//           formTKND.show();
        } 
        if (value == 3) {
            FormThongKeNhanVienYTe formTKYT = new FormThongKeNhanVienYTe();
            formTKYT.show();
        }
    }//GEN-LAST:event_btnBaoCaoMouseClicked

    private void btnTraCuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraCuuMouseClicked
        this.hide();  
        FormTimKiem m = new FormTimKiem();
        m.show();
    }//GEN-LAST:event_btnTraCuuMouseClicked

    // Xử lý đăng xuất
    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        int check = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát khỏi chương trình không",
                "Thông báo", JOptionPane.YES_NO_OPTION);
        if (check == 0) {
            new Login().setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void btnTaoTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoTaiKhoanMouseClicked
        FromTaoTaiKhoanMoi m = new FromTaoTaiKhoanMoi();
        m.show();
    }//GEN-LAST:event_btnTaoTaiKhoanMouseClicked

    private void btnDoiPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiPassMouseClicked
        FromDoiMatKhau m = new FromDoiMatKhau();
        m.show();
    }//GEN-LAST:event_btnDoiPassMouseClicked

    private void btnDoiPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiPassActionPerformed
        FromDoiMatKhau form = new  FromDoiMatKhau();
        form.show();
    }//GEN-LAST:event_btnDoiPassActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Layout;
    private javax.swing.JPanel Layout_Body;
    private javax.swing.JPanel Layout_Footer;
    private javax.swing.JPanel Layout_Header;
    private javax.swing.JPanel Layout_SideBar;
    private javax.swing.JPanel PanelCaiDat;
    private javax.swing.JPanel PanelChungNhan;
    private javax.swing.JPanel PanelChungNhan1;
    private javax.swing.JPanel PanelThongKe;
    private javax.swing.JPanel PanelTiemMui1;
    private javax.swing.JPanel PanelTiemMui2;
    private javax.swing.JPanel PanelTrangChu;
    private javax.swing.JPanel btnBaoCao;
    private javax.swing.JPanel btnCaiDat;
    private javax.swing.JPanel btnCapNhat;
    private javax.swing.JPanel btnChungNhan;
    private javax.swing.JComboBox<String> btnCmbBaoCao;
    private javax.swing.JPanel btnDangXuat;
    private javax.swing.JButton btnDoiPass;
    private javax.swing.JLabel btnTaoTaiKhoan;
    private javax.swing.JPanel btnThongKe;
    private javax.swing.JPanel btnTiemMui1;
    private javax.swing.JPanel btnTiemMui2;
    private javax.swing.JPanel btnTraCuu;
    private javax.swing.JPanel btnTrangCHu;
    private javax.swing.JLabel btnTrangChu;
    private javax.swing.JLabel btn_image;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable table_TiemChungHomNay;
    private javax.swing.JLabel textSLTiemHomQua;
    private javax.swing.JPanel txtSoLuongTiemHomQua3;
    private javax.swing.JPanel txtSoLuongTiemHomQua4;
    private javax.swing.JLabel txtTaiKhoanDangNhap;
    private javax.swing.JLabel txtTieuDe;
    private javax.swing.JLabel txtTime;
    private javax.swing.JLabel txtTongMuiTiemHCM;
    private javax.swing.JLabel txtinfo1;
    // End of variables declaration//GEN-END:variables
}
