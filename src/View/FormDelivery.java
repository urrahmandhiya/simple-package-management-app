/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerDelivery;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import DAO.DAOCourier;
import DAO.DAOPacket;
import Model.Courier;
import Model.Packet;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ardab
 */
public class FormDelivery extends javax.swing.JFrame {

    /**
     * Creates new form FormDelivery
     */
    public FormDelivery() {
        initComponents();
        // Other initialization code...
        // Create an instance of DAOCourier
        DAOCourier GetCourierID = new DAOCourier();
        DAOPacket GetPacketID = new DAOPacket();

        // Assuming the getAll() method is now non-static in DAOCourier
        List<Courier> couriers = GetCourierID.getAll();
        List<String> SetCourierID = new ArrayList<>();
        
        // Assuming the getAll() method is now non-static in DAOPacket
        List<Packet> packets = GetPacketID.getAll();
        List<String> SetPacketID = new ArrayList<>();

        // Extract courier_id values from the couriers list
        for (Courier courier : couriers) {
            SetCourierID.add(String.valueOf(courier.getKId()));
        }
        
         // Extract packet_id values from the packets list
        for (Packet packet : packets) {
            SetPacketID.add(packet.getPacket_id());
        }

        // Create a DefaultComboBoxModel with the SetCourierID list
        DefaultComboBoxModel<String> couriercomboBoxModel = new DefaultComboBoxModel<>(SetCourierID.toArray(new String[0]));
        // Create a DefaultComboBoxModel with the SetPacketID list
        DefaultComboBoxModel<String> packetcomboBoxModel = new DefaultComboBoxModel<>(SetPacketID.toArray(new String[0]));

        // Set the comboBoxModel as the model for the setIdKurir JComboBox
        setIdKurir.setModel(couriercomboBoxModel);
        setIdPaket.setModel(packetcomboBoxModel);
        
        ctPengiriman = new ControllerDelivery(this);
        ctPengiriman.isiTable();
        
//        setStatusPengiriman = new JComboBox<>(new String[]{"Berhasil", "On Progress", "Gagal"});
//        setStatusPengiriman.addActionListener(new SetStatusPengirimanListener());
//
//        txtTanggalTerima = new JTextField();
//        txtTanggalTerima.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdKirim = new javax.swing.JTextField();
        setStatusPengiriman = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCariPengiriman = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataPengiriman = new javax.swing.JTable();
        btnCariPengiriman = new javax.swing.JButton();
        btnSimpanPengiriman = new javax.swing.JButton();
        btnResetPengiriman = new javax.swing.JButton();
        btnHapusPengiriman = new javax.swing.JButton();
        btnUbahPengiriman = new javax.swing.JButton();
        btnKembaliDashboard = new javax.swing.JButton();
        setIdKurir = new javax.swing.JComboBox<>();
        setIdPaket = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtTanggalTerima = new javax.swing.JTextField();
        txtTanggalKirim = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplikasi Manajemen Gudang Paket");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Form Data Pengiriman");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID Kirim ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("ID Kurir");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("ID Paket");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("T.Kirim");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Status");

        txtIdKirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdKirimActionPerformed(evt);
            }
        });

        setStatusPengiriman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On Progress", "Berhasil", "Gagal" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("Cari Data Pengiriman (ID)");

        txtCariPengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariPengirimanActionPerformed(evt);
            }
        });

        tabelDataPengiriman.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelDataPengiriman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataPengirimanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataPengiriman);

        btnCariPengiriman.setBackground(new java.awt.Color(255, 102, 102));
        btnCariPengiriman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCariPengiriman.setForeground(new java.awt.Color(255, 255, 255));
        btnCariPengiriman.setText("Cari");
        btnCariPengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPengirimanActionPerformed(evt);
            }
        });

        btnSimpanPengiriman.setBackground(new java.awt.Color(0, 204, 0));
        btnSimpanPengiriman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpanPengiriman.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpanPengiriman.setText("Simpan");
        btnSimpanPengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanPengirimanActionPerformed(evt);
            }
        });

        btnResetPengiriman.setBackground(new java.awt.Color(0, 0, 153));
        btnResetPengiriman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResetPengiriman.setForeground(new java.awt.Color(255, 255, 255));
        btnResetPengiriman.setText("Reset");
        btnResetPengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPengirimanActionPerformed(evt);
            }
        });

        btnHapusPengiriman.setBackground(new java.awt.Color(204, 0, 0));
        btnHapusPengiriman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapusPengiriman.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusPengiriman.setText("Hapus");
        btnHapusPengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusPengirimanActionPerformed(evt);
            }
        });

        btnUbahPengiriman.setBackground(new java.awt.Color(255, 153, 0));
        btnUbahPengiriman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbahPengiriman.setForeground(new java.awt.Color(255, 255, 255));
        btnUbahPengiriman.setText("Ubah");
        btnUbahPengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahPengirimanActionPerformed(evt);
            }
        });

        btnKembaliDashboard.setBackground(new java.awt.Color(0, 153, 153));
        btnKembaliDashboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKembaliDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnKembaliDashboard.setText("Kembali ke Dashboard");
        btnKembaliDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliDashboardMouseClicked(evt);
            }
        });
        btnKembaliDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliDashboardActionPerformed(evt);
            }
        });

        setIdKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setIdKurirActionPerformed(evt);
            }
        });

        setIdPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setIdPaketActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("T.Terima");

        txtTanggalTerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalTerimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSimpanPengiriman)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapusPengiriman)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnUbahPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnResetPengiriman))
                        .addComponent(btnKembaliDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(setStatusPengiriman, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdKirim)
                                .addComponent(setIdKurir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(setIdPaket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTanggalTerima)
                                .addComponent(txtTanggalKirim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCariPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCariPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdKirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCariPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariPengiriman))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(setIdKurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(setIdPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtTanggalKirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(setStatusPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTanggalTerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpanPengiriman)
                            .addComponent(btnHapusPengiriman)
                            .addComponent(btnResetPengiriman)
                            .addComponent(btnUbahPengiriman))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKembaliDashboard)
                        .addGap(46, 46, 46))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliDashboardMouseClicked
        this.dispose();
        Dashboard kmbl = new Dashboard();
        kmbl.setVisible(true);
    }//GEN-LAST:event_btnKembaliDashboardMouseClicked

    private void btnHapusPengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusPengirimanActionPerformed
        // TODO add your handling code here:
        ctPengiriman.delete();
        ctPengiriman.isiTable();
        ctPengiriman.reset();
    }//GEN-LAST:event_btnHapusPengirimanActionPerformed

    private void btnSimpanPengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanPengirimanActionPerformed
        // TODO add your handling code here:
        ctPengiriman.insert();
        ctPengiriman.isiTable();
        ctPengiriman.reset();
    }//GEN-LAST:event_btnSimpanPengirimanActionPerformed

    private void txtIdKirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdKirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKirimActionPerformed

    private void setIdKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setIdKurirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setIdKurirActionPerformed

    private void btnUbahPengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahPengirimanActionPerformed
        // TODO add your handling code here:
        ctPengiriman.update();
        ctPengiriman.isiTable();
        ctPengiriman.reset();
    }//GEN-LAST:event_btnUbahPengirimanActionPerformed

    private void btnResetPengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPengirimanActionPerformed
        // TODO add your handling code here:
         ctPengiriman.reset();
    }//GEN-LAST:event_btnResetPengirimanActionPerformed

    private void btnKembaliDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembaliDashboardActionPerformed

    private void txtCariPengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariPengirimanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariPengirimanActionPerformed

    private void tabelDataPengirimanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataPengirimanMouseClicked
        // TODO add your handling code here:
        int row = tabelDataPengiriman.getSelectedRow();
        ctPengiriman.isiField(row);
    }//GEN-LAST:event_tabelDataPengirimanMouseClicked

    private void btnCariPengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPengirimanActionPerformed
        // TODO add your handling code here:
        ctPengiriman.cari();
        ctPengiriman.reset();
    }//GEN-LAST:event_btnCariPengirimanActionPerformed

    private void setIdPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setIdPaketActionPerformed
        //TODO add your handling code here:
    }//GEN-LAST:event_setIdPaketActionPerformed

    private void txtTanggalTerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalTerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalTerimaActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new FormDelivery();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDelivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariPengiriman;
    private javax.swing.JButton btnHapusPengiriman;
    private javax.swing.JButton btnKembaliDashboard;
    private javax.swing.JButton btnResetPengiriman;
    private javax.swing.JButton btnSimpanPengiriman;
    private javax.swing.JButton btnUbahPengiriman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> setIdKurir;
    private javax.swing.JComboBox<String> setIdPaket;
    private javax.swing.JComboBox<String> setStatusPengiriman;
    private javax.swing.JTable tabelDataPengiriman;
    private javax.swing.JTextField txtCariPengiriman;
    private javax.swing.JTextField txtIdKirim;
    private com.toedter.calendar.JDateChooser txtTanggalKirim;
    private javax.swing.JTextField txtTanggalTerima;
    // End of variables declaration//GEN-END:variables

    ControllerDelivery ctPengiriman;
    public JTable getTabelDataPengiriman() {
        return tabelDataPengiriman; 
    }
    
    public JTextField gettxtIDKirim(){
        return txtIdKirim;
    }
    
    public JComboBox<String> getsetIDKurir(){
        return setIdKurir;
    }
    
    public JComboBox<String> getsetIDPaket(){
        return setIdPaket;
    }
    
    public JDateChooser gettxtTanggalKirim(){
        return txtTanggalKirim;
    }
    
    public JTextField gettxtTanggalTerima(){
        return txtTanggalTerima;
    }
    
    public JComboBox<String> getsetStatusPengiriman(){
        return setStatusPengiriman;
    }
    
    public JTextField gettxtCariPengiriman(){
        return txtCariPengiriman;
    }

//    private class SetStatusPengirimanListener implements ActionListener {
//
//        public SetStatusPengirimanListener() {
//        }
//        
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            String selectedStatus = (String) setStatusPengiriman.getSelectedItem();
//            if (selectedStatus.equals("On Progress") || selectedStatus.equals("Gagal")) {
//                txtTanggalTerima.setEnabled(false);
//                txtTanggalTerima.setText("");
//            } else {
//                txtTanggalTerima.setEnabled(true);
//            }
//        }
//    }
}