package mob1023;
import buoi1.QuanLy;
import buoi1.QuanLyDanhSach;
import buoi1.SinhVien;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author namxg
 */
public class demo extends javax.swing.JFrame {

    /**
     * Creates new form demo
     */
    private QuanLy qlsv;
    
    public demo() {
        initComponents();
        this.cbbChuyenNganh.addItem("Quản Trị khách sạn");
        this.qlsv = new QuanLyDanhSach();
        this.qlsv.taoSVao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioSEX = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUSER = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JToggleButton();
        btnDarkTheme = new javax.swing.JToggleButton();
        btnLightTheme = new javax.swing.JToggleButton();
        chkGhiNho = new javax.swing.JCheckBox();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        cbbChuyenNganh = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        btnTaoSinhVienAo = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 109, 167));

        jLabel1.setText("Đăng nhập");

        jLabel2.setText("Tên đăng nhập");

        jLabel3.setText("Mật khẩu");

        txtUSER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUSERActionPerformed(evt);
            }
        });

        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnDarkTheme.setText("Dark theme");
        btnDarkTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarkThemeActionPerformed(evt);
            }
        });

        btnLightTheme.setText("Light theme");
        btnLightTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLightThemeActionPerformed(evt);
            }
        });

        chkGhiNho.setText("Ghi nhớ đăng nhập");

        radioSEX.add(radNam);
        radNam.setText("Nam");

        radioSEX.add(radNu);
        radNu.setText("Nữ");
        radNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNuActionPerformed(evt);
            }
        });

        cbbChuyenNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOB", "UDPM", "Đồ hoạ", "DIG", "WEB", " " }));

        tblSinhVien.setBackground(new java.awt.Color(255, 85, 40));
        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Họ Tên", "Giới tính", "Chuyên ngành", "Quê quán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSinhVien);

        btnTaoSinhVienAo.setText("Tạo sinh viên ảo");
        btnTaoSinhVienAo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoSinhVienAoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDarkTheme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLightTheme))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbbChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radNam))
                                    .addComponent(btnTaoSinhVienAo))
                                .addGap(13, 13, 13)
                                .addComponent(radNu)
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDangNhap)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkGhiNho)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtUSER)
                                                .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDarkTheme)
                    .addComponent(btnLightTheme)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(chkGhiNho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDangNhap))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radNu)
                            .addComponent(radNam))
                        .addGap(18, 18, 18)
                        .addComponent(btnTaoSinhVienAo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUSERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUSERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUSERActionPerformed

    private void btnDarkThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkThemeActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.blue);
    }//GEN-LAST:event_btnDarkThemeActionPerformed

    private void btnLightThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLightThemeActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.gray);

    }//GEN-LAST:event_btnLightThemeActionPerformed

    private void radNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radNuActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        String username = this.txtUSER.getText();
        String password = String.valueOf(this.txtPass.getPassword());
        boolean ghiNhoDangNhap = this.chkGhiNho.isSelected();
        boolean isNam = this.radNam.isSelected();
        boolean isNu = this.radNu.isSelected();
        
        String chuyennganh = this.cbbChuyenNganh.getSelectedItem().toString();
        this.cbbChuyenNganh.getSelectedIndex();
        if (username.length()==0 || password.length()== 0 ){
            JOptionPane.showMessageDialog(this,"không được để trống","lỗi", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        int confirmHocLai = JOptionPane.showConfirmDialog(this, "bạn điền đủ thông tin chưa", "xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        
        String soLuongNy = JOptionPane.showInputDialog(this, "có mấy người yêu");
        System.out.println("User name: "+ username);
        System.out.println("Password: "+ password);
        System.out.println("ghi nhớ: "+ ghiNhoDangNhap);
        System.out.println("nam: "+ isNam);
        System.out.println("nữ: "+ isNu);
        System.out.println("chuyên ngành: "+ chuyennganh);
        System.out.println("học lại: "+ confirmHocLai);
        System.out.println("số lượng người yêu" + soLuongNy);
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnTaoSinhVienAoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoSinhVienAoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)this.tblSinhVien.getModel();
        //xóa toàn bộ dữ liệu có trong table 
        dtm.setRowCount(0);
        //thêm 1 hàng
        for (int i = 0; i < this.qlsv.xuatDanhSach().size(); i++) {
            SinhVien sv = (SinhVien) this.qlsv.getByViTri(i);
            Object[] rowData = new Object[]{
                sv.getMaSV(),
                sv.getHoTen(),
                sv.getGioiTinh(),
                sv.getChuyenNganh(),
                sv.getQueQuan()
            };
            dtm.addRow(rowData);
        }
        
    }//GEN-LAST:event_btnTaoSinhVienAoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDangNhap;
    private javax.swing.JToggleButton btnDarkTheme;
    private javax.swing.JToggleButton btnLightTheme;
    private javax.swing.JButton btnTaoSinhVienAo;
    private javax.swing.JComboBox<String> cbbChuyenNganh;
    private javax.swing.JCheckBox chkGhiNho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.ButtonGroup radioSEX;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUSER;
    // End of variables declaration//GEN-END:variables
}
