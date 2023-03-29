/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConnectionModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
//
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.CategoryDataset;
//import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Felix
 */
public class XemBieuDo {

//    public ArrayList<Integer> laySoLuongMuiTiem() {
//      //code
//        ArrayList<Integer> dsSLMuiTiem = new ArrayList<>();
//        for (int j = 129; j >=100; j--) {
//            try {
//                String sql = "Select count(*) as \"SoLuong\" From PhieuChungNhan cn\n"
//                        + "join DotTiem dt on cn.MaDotTiem = dt.MaDotTiem\n"
//                        + "where dt.NgayTiem = CONVERT(varchar,GETDATE()-"+j+")"; // Thực hiện câu lệnh SQL
//                System.out.println(sql+"\n");
//                ResultSet rs = ConnectionModel.ThucHienSQL(sql);
//                // Đọc từng bản ghi một
//                int sl =0;
//                while (rs.next()) {
//                    sl= rs.getInt("SoLuong");
//                    dsSLMuiTiem.add(sl);
//                }
//                System.out.println("sl: "+sl);
//            } catch (SQLException ex) {
//                Logger.getLogger(XemBieuDo.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        return dsSLMuiTiem;
    }

//    public static JFreeChart createChart() {
//        JFreeChart barChart = ChartFactory.createLineChart( "BIỂU ĐỒ MŨI TIÊM",   "Ngày", "Số mũi tiêm",createDataset(), PlotOrientation.VERTICAL, false, false, false);
//        return barChart;
//    }
//
//    private static CategoryDataset createDataset() {
//       //code
//        ArrayList<Integer> dsSLMuiTiem = new XemBieuDo().laySoLuongMuiTiem();
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        for (int i = 29; i >= 0; i--) {
//                   dataset.addValue(dsSLMuiTiem.get(i), "Số mũi tiêm", String.valueOf(i));
//        }
//        return dataset;
//    }
//  
//    public static void main(String[] args) {
//        ChartPanel chartPanel = new ChartPanel(createChart());
//        chartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
//        JFrame frame = new JFrame();
//        frame.add(chartPanel);
//        frame.setTitle("Biểu đồ JFreeChart trong Java Swing");
//        frame.setSize(1500, 1000);
//        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
//        frame.setVisible(true);
//    }
//}
