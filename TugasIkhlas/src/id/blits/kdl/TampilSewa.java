/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.blits.kdl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class TampilSewa extends javax.swing.JFrame {
 Koneksi sindi = new Koneksi();
    /**
     * Creates new form TampilSewa
     */
    public TampilSewa() {
        initComponents();
        setLocationRelativeTo(null);
        sindi.koneksiDatabase();
        dataTable();
    }
    private void dataTable(){
        DefaultTableModel tabel = new DefaultTableModel();
         tabel.addColumn("No");
        tabel.addColumn("Tgl Pinjam");
        tabel.addColumn("Nama");
        tabel.addColumn("Alamat");
        tabel.addColumn("No.Hp");
        tabel.addColumn("Judul");
        tabel.addColumn("Jumlah");
        tabel.addColumn("Bayar");
        tabel.addColumn("Tgl Kembali");
        
        jTable1.setModel(tabel);
      try { 
           String sql = "select * from ikhlas";
           ResultSet res = sindi.state.executeQuery(sql);
            while(res.next()){
             tabel.addRow(new Object[]{
                    res.getString("no"),
                    res.getString("pinjam"),
                    res.getString("nama"),
                    res.getString("alamat"),
                    res.getString("nope"),
                    res.getString("judul"),
                    res.getString("jumlah"),
                    res.getString("bayar"),
                    res.getString("kembali")
                });
                jTable1.setModel(tabel);
            }
      } catch (SQLException ex) {
            System.err.println("SQLException:"+ex.getMessage());   
    }
    }
private void bersih(){
        jTextFieldNo.setText(null);
        jTextFieldNama.setText(null);
        jTextAreaAlamat.setText(null);
        jTextFieldNope.setText(null);
        jTextAreaJudul.setText(null);
        jTextFieldPinjam.setText(null);
        jTextFieldJumlah.setText(null);
        jTextFieldKembali.setText(null);
        jTextFieldBayar.setText(null);
    
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPinjam = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldBayar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldKembali = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldJumlah = new javax.swing.JTextField();
        jTextFieldNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAlamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNope = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaJudul = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonEdit = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldPinjam.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Bayar                           :");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTextFieldNama.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextFieldBayar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(159, 83, 8));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jTextFieldKembali.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel16.setText("NO");

        jTextFieldJumlah.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJumlahActionPerformed(evt);
            }
        });

        jTextFieldNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Judul Kaset/CD          :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTextAreaAlamat.setColumns(20);
        jTextAreaAlamat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextAreaAlamat.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAlamat);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Jumlah Disk                :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nama                         :");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Hari/Tanggal Pinjam :");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Alamat                       :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("No Hp                         :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Hari/Tanggal Kembali :");

        jTextFieldNope.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setText("Rp.");

        jTextAreaJudul.setColumns(20);
        jTextAreaJudul.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextAreaJudul.setRows(5);
        jScrollPane2.setViewportView(jTextAreaJudul);

        jTable1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jButtonEdit.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jButtonEdit.setText("EDIT");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonHapus.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jButtonHapus.setText("HAPUS");
        jButtonHapus.setEnabled(false);
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jButton3.setText("BARU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Main Menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNope, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEdit)
                .addGap(48, 48, 48)
                .addComponent(jButtonHapus)
                .addGap(38, 38, 38)
                .addComponent(jButton3)
                .addGap(306, 306, 306))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextFieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextFieldBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextFieldKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonHapus)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextFieldNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldNope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJumlahActionPerformed

    private void jTextFieldNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        String no = jTextFieldNo.getText();
        String nama = jTextFieldNama.getText();
        String nope = jTextFieldNope.getText();
        String alamat = jTextAreaAlamat.getText();
        String judul = jTextAreaJudul.getText();
        String jumlah = jTextFieldJumlah.getText();
        String bayar = jTextFieldBayar.getText();
        String kembali = jTextFieldKembali.getText();
        String pinjam = jTextFieldPinjam.getText();
        
        
        try {
            sindi.koneksiDatabase();
            String kueriEdit = "update ikhlas set nama ='"+nama+"', "
                    + "nope ='"+nope+"', alamat='"+alamat+"', "
                    + "pinjam='"+pinjam+"', judul='"+judul+"', jumlah='"+jumlah+"'"
                    + ", bayar='"+bayar+"', kembali='"+kembali+"'where no='"+no+"'";
            sindi.state.executeUpdate(kueriEdit);
            dataTable();
            JOptionPane.showMessageDialog(null, "Data Berhasil di ubah");
        } catch (SQLException ex) {
            Logger.getLogger(TampilSewa.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButtonEdit.setEnabled(false);
        jButtonHapus.setEnabled(false);
        jButton3.setEnabled(true);
        bersih();
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        int pilih = JOptionPane.showConfirmDialog(null, 
                                  "Apakah Anda Yakin?", 
                                  "", 
                                  JOptionPane.YES_NO_OPTION); 
if (pilih == JOptionPane.YES_OPTION) {
    
        String no = jTextFieldNo.getText();
        try {
            String kueriHapus = "delete from ikhlas where no='"+no+"'";
            sindi.state.executeUpdate(kueriHapus);
           dataTable();
           JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
           
        } catch (SQLException ex) {
            System.err.println("Error : "+ex);
        }}
        jButtonEdit.setEnabled(false);
        jButtonHapus.setEnabled(false);
        jButton3.setEnabled(true);
bersih();

    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int table = jTable1.getSelectedRow();
        //mengambil data dari table
        String ambilNo = jTable1.getValueAt(table, 0).toString();
        String ambilPinjam = jTable1.getValueAt(table, 1).toString();
        String ambilNama = jTable1.getValueAt(table, 2).toString();
        String ambilAlamat = jTable1.getValueAt(table, 3).toString();
        String ambilNope = jTable1.getValueAt(table, 4).toString();
        String ambilJudul = jTable1.getValueAt(table, 5).toString();
        String ambilJumlah = jTable1.getValueAt(table, 6).toString();
        String ambilBayar = jTable1.getValueAt(table, 7).toString();
        String ambilKembali = jTable1.getValueAt(table, 8).toString();
        
        jTextFieldNo.setText(ambilNo);
        jTextFieldPinjam.setText(ambilPinjam);
        jTextFieldNama.setText(ambilNama);
        jTextAreaAlamat.setText(ambilAlamat);
        jTextFieldNope.setText(ambilNope);
        jTextAreaJudul.setText(ambilJudul);
        jTextFieldJumlah.setText(ambilJumlah);
        jTextFieldBayar.setText(ambilBayar);
        jTextFieldKembali.setText(ambilKembali);
        
        jButtonHapus.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InputSewa pindah = new InputSewa();
        pindah.setVisible(true);
        TampilSewa.this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        MainMenu pindah = new MainMenu();
        pindah.setVisible(true);
        TampilSewa.this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TampilSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilSewa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAlamat;
    private javax.swing.JTextArea jTextAreaJudul;
    private javax.swing.JTextField jTextFieldBayar;
    private javax.swing.JTextField jTextFieldJumlah;
    private javax.swing.JTextField jTextFieldKembali;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNo;
    private javax.swing.JTextField jTextFieldNope;
    private javax.swing.JTextField jTextFieldPinjam;
    // End of variables declaration//GEN-END:variables
}
