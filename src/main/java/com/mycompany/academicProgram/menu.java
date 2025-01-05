/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.programakademik;

/**
 *
 * @author ACER
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        ad1 = new com.inet.viewer.ad();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        entryDataMahasiswa = new javax.swing.JMenuItem();
        entryDataMatkul = new javax.swing.JMenuItem();
        entryDataNilai = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        dataMahasiswa = new javax.swing.JMenuItem();
        dataMatkul = new javax.swing.JMenuItem();
        dataNilai = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Entry");

        entryDataMahasiswa.setText("Entry Data Mahasiswa");
        entryDataMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryDataMahasiswaActionPerformed(evt);
            }
        });
        jMenu1.add(entryDataMahasiswa);

        entryDataMatkul.setText("Entry Data Mata Kuliah");
        entryDataMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryDataMatkulActionPerformed(evt);
            }
        });
        jMenu1.add(entryDataMatkul);

        entryDataNilai.setText("Entry Data Nilai");
        entryDataNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryDataNilaiActionPerformed(evt);
            }
        });
        jMenu1.add(entryDataNilai);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Laporan");

        dataMahasiswa.setText("Data Mahasiswa");
        dataMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataMahasiswaActionPerformed(evt);
            }
        });
        jMenu2.add(dataMahasiswa);

        dataMatkul.setText("Data Mata Kuliah");
        dataMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataMatkulActionPerformed(evt);
            }
        });
        jMenu2.add(dataMatkul);

        dataNilai.setText("Data Nilai");
        dataNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNilaiActionPerformed(evt);
            }
        });
        jMenu2.add(dataNilai);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Exit");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entryDataMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryDataMatkulActionPerformed
        new entryMataKuliah().show();
    }//GEN-LAST:event_entryDataMatkulActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void entryDataMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryDataMahasiswaActionPerformed
        new entryMahasiswa().show();
    }//GEN-LAST:event_entryDataMahasiswaActionPerformed

    private void entryDataNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryDataNilaiActionPerformed
        new entryNilai().show();
    }//GEN-LAST:event_entryDataNilaiActionPerformed

    private void dataMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataMahasiswaActionPerformed
        new lMahasiswa(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_dataMahasiswaActionPerformed

    private void dataMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataMatkulActionPerformed
        new lMataKuliah().show();
    }//GEN-LAST:event_dataMatkulActionPerformed

    private void dataNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNilaiActionPerformed
        new lNilai(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_dataNilaiActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.inet.viewer.ad ad1;
    private javax.swing.JMenuItem dataMahasiswa;
    private javax.swing.JMenuItem dataMatkul;
    private javax.swing.JMenuItem dataNilai;
    private javax.swing.JMenuItem entryDataMahasiswa;
    private javax.swing.JMenuItem entryDataMatkul;
    private javax.swing.JMenuItem entryDataNilai;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}