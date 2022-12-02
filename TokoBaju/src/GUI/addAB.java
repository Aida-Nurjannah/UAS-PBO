package GUI;

import models.Baju;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class addAB extends javax.swing.JFrame {
    Baju Baju;

    /**
     * Creates new form Tambah
     */
    public addAB() throws ClassNotFoundException, SQLException {
        Baju = new Baju();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formMerk = new javax.swing.JTextField();
        formTR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        formHarga = new javax.swing.JTextField();
        addDatas = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formMerk.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formMerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formMerkActionPerformed(evt);
            }
        });

        formTR.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formTRActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Inter Extra Bold", 1, 18)); // NOI18N
        jLabel1.setText("Tambah Motor");

        formHarga.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formHargaActionPerformed(evt);
            }
        });

        addDatas.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        addDatas.setText("Tambah");
        addDatas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDatasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addDatasMouseEntered(evt);
            }
        });
        addDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDatasActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel2.setText("Masukkan Merk");

        jLabel3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel3.setText("Masukkan Transmisi");

        jLabel4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel4.setText("Masukkan Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addDatas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(formHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(formTR)
                            .addComponent(formMerk))))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDatas)
                    .addComponent(cancel))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMerkActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void formTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formTRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formTRActionPerformed

    private void formHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formHargaActionPerformed

    private void addDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDatasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDatasActionPerformed

    private void addDatasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDatasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addDatasMouseEntered

    private void addDatasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDatasMouseClicked
        try{
            String hb = formMerk.getText();
            String jb = formTR.getText();
            int kb = Integer.parseInt(formHarga.getText());

            Baju.insert(hb, jb, kb);

            JOptionPane.showMessageDialog(null, "BERHASIL !");

            new Menu().setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tolong Masukan Data Yang Valid !");
            try {
                new addAB().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(addAB.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(addAB.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        this.dispose();
    }//GEN-LAST:event_addDatasMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        try {
            new Menu().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addAB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addAB.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDatas;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField formHarga;
    private javax.swing.JTextField formMerk;
    private javax.swing.JTextField formTR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
