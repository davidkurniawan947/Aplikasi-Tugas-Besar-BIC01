/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.DetailPemesananDAO;
import control.PegawaiDAO;
import control.PemesananDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.DetailPemesanan;
import model.Pegawai;
import model.Pemesanan;

/**
 *
 * @author MSI
 */
public class panelDetail extends javax.swing.JPanel implements ListSelectionListener {
    PemesananDAO daoPem;
    DetailPemesananDAO daoDetail;
    private DetailPemesanan detailpemesanan;
    DefaultTableModel dataPem;
    List<Pemesanan> dataPemesanan;
    
    public panelDetail() {
        initComponents();
        daoPem = new PemesananDAO();
        daoDetail = new DetailPemesananDAO();
        dataPem = (DefaultTableModel) tabelDetail.getModel();
        reset();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDetail = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        idpem = new javax.swing.JComboBox<>();
        jumlah = new javax.swing.JFormattedTextField();

        setLayout(new java.awt.GridBagLayout());

        tabelDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produk", "ID Pemesanan", "Jumlah Pesanan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelDetail);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 647;
        gridBagConstraints.ipady = 583;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 13, 12);
        add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Kelola Detail Pemesanan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 35, 0, 0);
        add(jLabel1, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kelola Detail"));

        jLabel2.setText("ID Produk");

        jLabel3.setText("ID Pemesanan");

        jLabel4.setText("Jumlah Pesanan");

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        idpem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jumlah)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id)
                            .addComponent(idpem, 0, 126, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idpem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 413;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 13, 0);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        save();
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       delete();
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
    }//GEN-LAST:event_resetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<String> idpem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jumlah;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTable tabelDetail;
    // End of variables declaration//GEN-END:variables
    private void save() {
        if (detailpemesanan.getIdProdukPesanan() == null) {
            detailpemesanan.setIdProdukPesanan(id.getText().trim());
            detailpemesanan.setIdPemesanan(dataPemesanan.get(idpem.getSelectedIndex()));
            detailpemesanan.setJumlahPemesananProduk(Integer.parseInt(jumlah.getValue().toString().trim()));
            if (daoDetail.insertData(detailpemesanan)) {
                JOptionPane.showMessageDialog(this, "Data Detail berhasil ditambah!", "Information Message", 1);
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "Data Detail gagal ditambah!", "Warning Message", 2);
            } 
        } else {
            detailpemesanan.setIdProdukPesanan(id.getText().trim());
            detailpemesanan.setIdPemesanan(dataPemesanan.get(idpem.getSelectedIndex()));
            detailpemesanan.setJumlahPemesananProduk(Integer.parseInt(jumlah.getValue().toString().trim()));
            if (daoDetail.updateData(detailpemesanan)) {
                JOptionPane.showMessageDialog(this, "Data Detail berhasil diubah!", "Information Message", 1);
                reset();
            } else {
            JOptionPane.showMessageDialog(this, "Data Detail gagal diubah!", "Warning Message", 2);
            } 
        }
    }
  
    private void delete() {
        if (detailpemesanan.getIdProdukPesanan() == null) {
            JOptionPane.showMessageDialog(this, "Data Detail tidak ada!", "Warning Message", 2);
        } else if (detailpemesanan.getProduksiList().isEmpty()) {
            if (JOptionPane.showConfirmDialog(this, "Apakah Anda akan menghapus Data Detail?", "Confirmation Delete", 2, 3) == 0) {
                if (daoDetail.deleteData(detailpemesanan)) {
                    JOptionPane.showMessageDialog(this, "Data Detail berhasil dihapus!", "Information Message", 1);
                    reset();
                } else {
                    JOptionPane.showMessageDialog(this, "Data Detail gagal dihapus!", "Warning Message", 2);
                } 
            } else {
                JOptionPane.showMessageDialog(this, "Data Detail batal dihapus!", "Information Message", 1);
            } 
        } else {
            JOptionPane.showMessageDialog(this, "Data Detail tidak dapat dihapus!", "Warning Message", 2);
        } 
    }
    public void reset() {
        detailpemesanan = new DetailPemesanan();
        id.setText("");
        listPem();
        idpem.setSelectedIndex(0);
        ShowDPemesananList();
        save.setText("save");
    }
    
    private void ShowDPemesananList() {
        tabelDetail.getSelectionModel().removeListSelectionListener(this);
        dataPem.getDataVector().removeAllElements();
        for (DetailPemesanan b : daoDetail.getAllData()) {
            dataPem.addRow(new Object[]{
                b.getIdProdukPesanan(),
                b.getIdPemesanan(),
                b.getJumlahPemesananProduk()
                        });
        } 
        tabelDetail.getSelectionModel().addListSelectionListener(this);
    }
    
    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource() == this.tabelDetail.getSelectionModel())
            try {
                detailpemesanan = daoDetail.getData(Integer.parseInt(tabelDetail.getValueAt(tabelDetail.getSelectedRow(), 0).toString()));
                id.setText(detailpemesanan.getIdProdukPesanan().toString());
                jumlah.setValue(Integer.valueOf(detailpemesanan.getJumlahPemesananProduk()));
                idpem.setSelectedItem(detailpemesanan.getIdPemesanan().getIdPemesanan());
                save.setText("Update");
            } catch (Exception exception) {} 
    }
        
    public void listPem() {
        dataPemesanan = daoPem.getAllData();
        String[] data = new String[dataPemesanan.size()];
        for (int i = 0; i < data.length; i++)
            data[i] = ((Pemesanan)dataPemesanan.get(i)).getIdPemesanan().isEmpty() ? "-" : ((Pemesanan)dataPemesanan.get(i)).getIdPemesanan(); 
            idpem.setModel(new DefaultComboBoxModel<>(data));
    }
}
