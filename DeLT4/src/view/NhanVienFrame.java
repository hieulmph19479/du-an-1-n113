package view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import servicer.ServicerNV;

public class NhanVienFrame extends javax.swing.JFrame {

    private ServicerNV serNV;
    DefaultComboBoxModel _DefaultComboBoxModel;

    public NhanVienFrame() {
        serNV = new ServicerNV();
        _DefaultComboBoxModel = new DefaultComboBoxModel();
        initComponents();
        VaiTro();
        loadTable();
    }

    public void VaiTro() {
        _DefaultComboBoxModel.addElement("Quan Ly");
        _DefaultComboBoxModel.addElement("Nhan Vien");
        cbbVaiTro.setModel(_DefaultComboBoxModel);
    }

    public void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) TbNhanVien.getModel();
        dtm.setRowCount(0);

        for (NhanVien nv : this.serNV.getList()) {
            Object[] rowData = {
                nv.getId(),
                nv.getTen(),
                nv.getMaNV(),
                nv.getSdt(),
                nv.getTuoi(),
                nv.getVaiTro(),// == 1 ?"Quan Ly":"Nhan Vien",
           
            };
            dtm.addRow(rowData);
        }

    }

    public void clear() {
        LbID.setText("");
        txtTen.setText("");
        txtMa.setText("");
        txtSDT.setText("");
        txtTuoi.setText("");
    }
    
    public void validate(){
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnsua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbNhanVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        LbID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbbVaiTro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Tuoi");

        btnsua.setText("Sua");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        TbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Ten", "Ma NV", "SDT", "Tuoi", "Vai Tro"
            }
        ));
        TbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TbNhanVien);

        jLabel1.setText("ID");

        LbID.setText("---");

        jLabel3.setText("Ten");

        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel2.setText("Ma NV");

        jLabel4.setText("SDT");

        jLabel5.setText("Vai Tro");

        cbbVaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(LbID))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtTen))))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cbbVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnXoa))
                            .addComponent(btnsua, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnThem)))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(jLabel1)
                    .addComponent(LbID)
                    .addComponent(jLabel4)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsua)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbbVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnClear)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        NhanVien nv = this.getData();
        serNV.update(nv.getId(), nv);
        loadTable();
        clear();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = TbNhanVien.getSelectedRow();
        String ids = TbNhanVien.getValueAt(row, 0).toString();
        int id = Integer.parseInt(ids);

        serNV.delete(id);
        loadTable();
        clear();

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();

    }//GEN-LAST:event_btnClearActionPerformed

    private void TbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbNhanVienMouseClicked
        int row = TbNhanVien.getSelectedRow();
        if (row == -1) {
            return;
        }
        String idS = TbNhanVien.getValueAt(row, 0).toString();
        String tenS = TbNhanVien.getValueAt(row, 1).toString();
        String maNVS = TbNhanVien.getValueAt(row, 2).toString();
        String sdtS = TbNhanVien.getValueAt(row, 3).toString();
        String tuoiS = TbNhanVien.getValueAt(row, 4).toString();
        String vaiTroS = TbNhanVien.getValueAt(row, 5).toString();
        
        
        int vaiTro = Integer.parseInt(vaiTroS );
        
        LbID.setText(idS);
        txtTen.setText(tenS);
        txtMa.setText(maNVS);
        txtSDT.setText(sdtS);
        txtTuoi.setText(tuoiS);
        cbbVaiTro.setSelectedItem( vaiTro == 0 ? "Quan Ly":"Nhan Vien");
        // vai tro

    }//GEN-LAST:event_TbNhanVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        NhanVien nv = this.getData();

        this.serNV.insert(nv);
        loadTable();
        clear();
    }//GEN-LAST:event_btnThemActionPerformed
    public NhanVien getData() {
        String IDS = LbID.getText().trim();
        String tenS = txtTen.getText().trim();
        String maNVS = txtMa.getText().trim();
        String sdtS = txtSDT.getText().trim();
        String tuoiS = txtTuoi.getText().trim();
        //  String vaiTroS = cbbVaiTro.getSelectedItem() == 0 ?"Quan Ly":"Nhan Vien";

        int id = Integer.parseInt(IDS);
        int tuoi = Integer.parseInt(tuoiS);
        int vaiTro = 0;

        NhanVien nv = new NhanVien(id, tenS, maNVS, sdtS, tuoi, vaiTro);
        return nv;

    }

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
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbID;
    private javax.swing.JTable TbNhanVien;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnsua;
    private javax.swing.JComboBox<String> cbbVaiTro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
