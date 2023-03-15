package List;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author firda
 */

public class TestList extends javax.swing.JFrame {
    List<Object> List = new ArrayList<>();

   
    /**
     * Creates new form TestList
     */
    public TestList() {
        initComponents();
    }
    
    private void tambahObject(){
        Object input = JOptionPane.showInputDialog(this, "Ketikan apapun",
            "Tambah Elemen ", JOptionPane.INFORMATION_MESSAGE);
        if(input == null || "".equals(input)){
        JOptionPane.showMessageDialog(this, "Anda Belum Mengetikkan " + "Elemen Yang Akan Ditambahkan");
        }else{
            List.add(input);
            tampilIsiList();
            JOptionPane.showMessageDialog(this,"" 
                    + "Menambahkan Objek \"" +input+"\" kedalah List");
        }
    }
    
    private void tampilIsiList(){
        txtArea.setText("");
        int ukuran = List.size();
        if (ukuran > 0) {
            for (int i = 0; i < ukuran; i++) {
                txtArea.append("" + List.get(i) + "\n");
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "List kosong");
        }
    }
    
    private void ubahObjek(){
        JDialog dialog = new JDialog(this, "Ubah isi List", true);
        JPanel panel = new JPanel(new BorderLayout());
        JComboBox combo = new JComboBox();
        for(int i = 0; i < List.size(); i++){
            combo.addItem(List.get(i));
        }
        
        JTextField txtEdit = new JTextField();
        JButton hapus = new JButton("ubah");
        hapus.addActionListener((ActionEvent e) -> {
            if(List.size() > 0){
                Object newObject = txtEdit.getText();
                if(!txtEdit.getText().isEmpty()){
                    Object obj = combo.getSelectedItem();
                    int index = combo.getSelectedIndex();
                    List.set(index, newObject);
                    combo.removeAllItems();
                    for (int i = 0; i< List.size(); i++){
                        combo.addItem(List.get(i));
                    }
                    combo.setSelectedIndex(index);
                    txtEdit.setText("");
                    tampilIsiList();
                    JOptionPane.showMessageDialog(TestList.this, "Berhasil " 
                            + "Mengubah elemen list" );
                    txtEdit.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(TestList.this, "Masukkan " 
                            + "elemen/objek");
                    txtEdit.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(TestList.this, "Tidak Ada " 
                        + " Elemen dalam list");
            }
        });
        panel.add(combo, BorderLayout.NORTH);
        panel.add(txtEdit, BorderLayout.CENTER);
        panel.add(hapus, BorderLayout.SOUTH);
        dialog.add(panel);
        dialog.setLocationRelativeTo(null);
        dialog.setSize(new Dimension(400, 120));
        dialog.setVisible(true);
    }
    
    private void hapusObject(){
         JDialog dialog = new JDialog(this, "Hapus isi List", true);
        JPanel panel = new JPanel(new BorderLayout());
        JComboBox combo = new JComboBox();
        for (int i = 0; i < List.size(); i++) {
            combo.addItem(List.get(i));
            
            
        }
        JButton hapus = new JButton("Hapus");
        hapus.addActionListener((ActionEvent e) -> {
            if (List.size() > 0) {
                Object obj = combo.getSelectedItem();
                List.remove(obj);
                combo.removeAllItems();
                for (int i = 0; i < List.size(); i++) {
                    combo.addItem(List.get(i));
                }
                JOptionPane.showMessageDialog(TestList.this, "Berhasil "
                + "menghapus elemen list");
            } else {
                JOptionPane.showMessageDialog(TestList.this, "Tidak ada elemen"
                + "dalam list");
                
            }
            tampilIsiList();
        });
        panel.add(combo, BorderLayout.NORTH);
        panel.add(hapus, BorderLayout.SOUTH);
        dialog.add(panel);
        dialog.setLocationRelativeTo(null);
        dialog.setSize(new Dimension(400,200));
        dialog.setVisible(true);
    }
    
    private void clearObjek(){
        List.clear();
        txtArea.setText("");
        JOptionPane.showMessageDialog(TestList.this, "semua elemen dalam list " 
                + "telah di hapus");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneKIRI = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnKosongkan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneKIRI.setBackground(new java.awt.Color(51, 51, 255));

        btnTambah.setBackground(new java.awt.Color(204, 204, 204));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(0, 0, 0));
        btnTambah.setText("Tambahkan Objek");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(204, 204, 204));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(0, 0, 0));
        btnHapus.setText("Hapus Objek");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(204, 204, 204));
        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(0, 0, 0));
        btnUbah.setText("Ubah Objek");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnKosongkan.setBackground(new java.awt.Color(204, 204, 204));
        btnKosongkan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKosongkan.setForeground(new java.awt.Color(0, 0, 0));
        btnKosongkan.setText("Kosongkan List");
        btnKosongkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKosongkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneKIRILayout = new javax.swing.GroupLayout(paneKIRI);
        paneKIRI.setLayout(paneKIRILayout);
        paneKIRILayout.setHorizontalGroup(
            paneKIRILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneKIRILayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneKIRILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKosongkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneKIRILayout.setVerticalGroup(
            paneKIRILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneKIRILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKosongkan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        getContentPane().add(paneKIRI, java.awt.BorderLayout.LINE_START);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        tambahObject();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusObject();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        ubahObjek();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnKosongkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKosongkanActionPerformed
        clearObjek();
    }//GEN-LAST:event_btnKosongkanActionPerformed

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
            java.util.logging.Logger.getLogger(TestList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKosongkan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paneKIRI;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables

}
