/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asia.ridwan.jualanbuah;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ridwan
 */
public class JualanBuahSaja extends javax.swing.JFrame {

    /**
     * Creates new form JualanBuahSaja
     */
    DefaultTableModel model;
    String namaBuah, jumlahBuah, rd, kb, jenisPembayaran;
    
    public JualanBuahSaja() {
        initComponents();
        
        Object kolom[] = {"Nama Buah", "Jumlah Buah", "Harga Buah", "Kondisi Buah", "Jenis Pembayaran"};
        Object data[][] = {{"Pisang", "123", "Per Kg", "Sudah Matang", "Cash"}};
        model = new DefaultTableModel(data, kolom);
        
        tblHasil.setModel(model);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJumlahBuah = new javax.swing.JTextField();
        rdKg = new javax.swing.JRadioButton();
        rdEceran = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cmbNamaBuah = new javax.swing.JComboBox<>();
        cmbJenisPembayaran = new javax.swing.JComboBox<>();
        rdBelum = new javax.swing.JRadioButton();
        rdSudah = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHasil = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama Buah");

        jLabel2.setText("Jumlah Buah");

        jLabel3.setText("Pembelian");

        jLabel5.setText("Jenis Pembayaran");

        jLabel6.setText("Kondisi Buah");

        buttonGroup1.add(rdKg);
        rdKg.setText("Per Kg");

        buttonGroup1.add(rdEceran);
        rdEceran.setText("Eceran");

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel4.setText("BUAH SEGAR SHOP");

        cmbNamaBuah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apel", "Jambu", "Pisang", "Jeruk" }));
        cmbNamaBuah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNamaBuahActionPerformed(evt);
            }
        });

        cmbJenisPembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Qris", "Bank" }));

        buttonGroup2.add(rdBelum);
        rdBelum.setText("Setengah Matang");

        buttonGroup2.add(rdSudah);
        rdSudah.setText("Sudah Matang");

        tblHasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama Buah", "Jumlah Buah", "Harga Buah", "Kondisi Buah", "Jenis Pembayaran"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHasil);

        btnTambah.setBackground(new java.awt.Color(102, 255, 102));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 102, 102));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(249, 249, 249))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdBelum)
                                .addGap(18, 18, 18)
                                .addComponent(rdSudah))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rdKg)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdEceran))
                                .addComponent(cmbNamaBuah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbJenisPembayaran, 0, 150, Short.MAX_VALUE)
                                .addComponent(txtJumlahBuah)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(cmbNamaBuah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJumlahBuah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdKg)
                    .addComponent(rdEceran))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdBelum)
                    .addComponent(rdSudah))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbJenisPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNamaBuahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNamaBuahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNamaBuahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int index = tblHasil.getSelectedRow();
        model.removeRow(index);
        tblHasil.setModel(model);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        namaBuah = cmbNamaBuah.getSelectedItem().toString();
        jumlahBuah = txtJumlahBuah.getText();
        jenisPembayaran = cmbJenisPembayaran.getSelectedItem().toString();

        if (rdKg.isSelected()) {
            rd = "Per Kg";
        } else if (rdEceran.isSelected()) {
            rd = "Eceran";
        }

        if (rdBelum.isSelected()) {
            kb = "Setengah Matang";
        } else if (rdSudah.isSelected()) {
            kb = "Sudah Matang";
        }

        // Menampilkan JOptionPane konfirmasi
        int confirm = JOptionPane.showConfirmDialog(null, 
            "Apakah Anda yakin ingin menambahkan data berikut?\n" +
            "Nama Buah: " + namaBuah + "\n" +
            "Jumlah Buah: " + jumlahBuah + "\n" +
            "Jenis: " + rd + "\n" +
            "Kondisi: " + kb + "\n" +
            "Jenis Pembayaran: " + jenisPembayaran,
            "Konfirmasi Tambah Data", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            // Tambahkan data ke tabel jika pengguna memilih "Ya"
            model.addRow(new Object[]{namaBuah, jumlahBuah, rd, kb, jenisPembayaran});
            tblHasil.setModel(model);
        } else {
            // Jika pengguna memilih "Batal", lakukan sesuatu jika diperlukan (opsional)
            JOptionPane.showMessageDialog(null, "Data tidak jadi ditambahkan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

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
            java.util.logging.Logger.getLogger(JualanBuahSaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JualanBuahSaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JualanBuahSaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JualanBuahSaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JualanBuahSaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cmbJenisPembayaran;
    private javax.swing.JComboBox<String> cmbNamaBuah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdBelum;
    private javax.swing.JRadioButton rdEceran;
    private javax.swing.JRadioButton rdKg;
    private javax.swing.JRadioButton rdSudah;
    private javax.swing.JTable tblHasil;
    private javax.swing.JTextField txtJumlahBuah;
    // End of variables declaration//GEN-END:variables
}
