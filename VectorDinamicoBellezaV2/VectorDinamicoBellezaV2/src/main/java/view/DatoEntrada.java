package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class DatoEntrada extends javax.swing.JPanel {

    public DatoEntrada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        cmbTipCli = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtAntCli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdeCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApeCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNomCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValCom = new javax.swing.JTextField();
        btnBuscarIdeCli = new javax.swing.JButton();
        btnBuscarApeCli = new javax.swing.JButton();
        btnBuscarTipCli = new javax.swing.JButton();
        btnBuscarNomCli = new javax.swing.JButton();
        btnBuscarValCom = new javax.swing.JButton();
        btnBuscarAntCli = new javax.swing.JButton();
        btnOrdenarIdeCli = new javax.swing.JButton();
        btnOrdenarApeCli = new javax.swing.JButton();
        btnOrdenarNomCli = new javax.swing.JButton();
        btnOrdenarValCom = new javax.swing.JButton();
        btnOrdenarTipCli = new javax.swing.JButton();
        btnOrdenarAntCli = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel6.setText("Tiplo cliente");

        cmbTipCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Mayorista", "Minorista", "Ocacionales" }));

        jLabel7.setText("Antigüedad ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Datos de Entrada");

        jLabel2.setText("Identificación");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Nombres");

        jLabel5.setText("Valor compra");

        btnBuscarIdeCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarIdeCli.setText("Buscar ==");
        btnBuscarIdeCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarApeCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarApeCli.setText("Buscar ==");
        btnBuscarApeCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarTipCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarTipCli.setText("Buscar ==");
        btnBuscarTipCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarNomCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarNomCli.setText("Buacar ==");
        btnBuscarNomCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarValCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarValCom.setText("Buscar >=");
        btnBuscarValCom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarAntCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarAntCli.setText("Buscar >=");
        btnBuscarAntCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOrdenarIdeCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarIdeCli.setText("Ordenar");
        btnOrdenarIdeCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOrdenarApeCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarApeCli.setText("Ordenar");
        btnOrdenarApeCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOrdenarNomCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarNomCli.setText("Ordenar");
        btnOrdenarNomCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarNomCli.setMaximumSize(new java.awt.Dimension(63, 24));
        btnOrdenarNomCli.setMinimumSize(new java.awt.Dimension(63, 24));

        btnOrdenarValCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarValCom.setText("Ordenar");
        btnOrdenarValCom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarValCom.setMaximumSize(new java.awt.Dimension(63, 24));
        btnOrdenarValCom.setMinimumSize(new java.awt.Dimension(63, 24));

        btnOrdenarTipCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarTipCli.setText("Ordenar");
        btnOrdenarTipCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarTipCli.setMaximumSize(new java.awt.Dimension(63, 24));
        btnOrdenarTipCli.setMinimumSize(new java.awt.Dimension(63, 24));

        btnOrdenarAntCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarAntCli.setText("Ordenar");
        btnOrdenarAntCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarAntCli.setMaximumSize(new java.awt.Dimension(63, 24));
        btnOrdenarAntCli.setMinimumSize(new java.awt.Dimension(63, 24));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnBuscarIdeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnOrdenarIdeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnBuscarApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnOrdenarApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdenarNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValCom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarValCom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnOrdenarValCom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTipCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnBuscarTipCli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnOrdenarTipCli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAntCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnBuscarAntCli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnOrdenarAntCli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(btnBuscarIdeCli)
                            .addComponent(btnOrdenarIdeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(btnBuscarApeCli)
                            .addComponent(btnOrdenarApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBuscarNomCli)
                                    .addComponent(btnOrdenarNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtValCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBuscarValCom)
                                    .addComponent(btnOrdenarValCom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbTipCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(btnBuscarTipCli)
                            .addComponent(btnOrdenarTipCli, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAntCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(btnBuscarAntCli)
                            .addComponent(btnOrdenarAntCli, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAntCli;
    private javax.swing.JButton btnBuscarApeCli;
    private javax.swing.JButton btnBuscarIdeCli;
    private javax.swing.JButton btnBuscarNomCli;
    private javax.swing.JButton btnBuscarTipCli;
    private javax.swing.JButton btnBuscarValCom;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnOrdenarAntCli;
    private javax.swing.JButton btnOrdenarApeCli;
    private javax.swing.JButton btnOrdenarIdeCli;
    private javax.swing.JButton btnOrdenarNomCli;
    private javax.swing.JButton btnOrdenarTipCli;
    private javax.swing.JButton btnOrdenarValCom;
    private javax.swing.JComboBox<String> cmbTipCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAntCli;
    private javax.swing.JTextField txtApeCli;
    private javax.swing.JTextField txtIdeCli;
    private javax.swing.JTextField txtNomCli;
    private javax.swing.JTextField txtValCom;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getCmbTipCli() {
        return cmbTipCli;
    }

    public void setCmbTipCli(JComboBox<String> cmbTipCli) {
        this.cmbTipCli = cmbTipCli;
    }

    public JTextField getTxtAntCli() {
        return txtAntCli;
    }

    public void setTxtAntCli(JTextField txtAntCli) {
        this.txtAntCli = txtAntCli;
    }

    public JTextField getTxtApeCli() {
        return txtApeCli;
    }

    public void setTxtApeCli(JTextField txtApeCli) {
        this.txtApeCli = txtApeCli;
    }

    public JTextField getTxtIdeCli() {
        return txtIdeCli;
    }

    public void setTxtIdeCli(JTextField txtIdeCli) {
        this.txtIdeCli = txtIdeCli;
    }

    public JTextField getTxtNomCli() {
        return txtNomCli;
    }

    public void setTxtNomCli(JTextField txtNomCli) {
        this.txtNomCli = txtNomCli;
    }

    public JTextField getTxtValCom() {
        return txtValCom;
    }

    public void setTxtValCom(JTextField txtValCom) {
        this.txtValCom = txtValCom;
    }

    public JButton getBtnBuscarAntCli() {
        return btnBuscarAntCli;
    }

    public void setBtnBuscarAntCli(JButton btnBuscarAntCli) {
        this.btnBuscarAntCli = btnBuscarAntCli;
    }

    public JButton getBtnBuscarApeCli() {
        return btnBuscarApeCli;
    }

    public void setBtnBuscarApeCli(JButton btnBuscarApeCli) {
        this.btnBuscarApeCli = btnBuscarApeCli;
    }

    public JButton getBtnBuscarIdeCli() {
        return btnBuscarIdeCli;
    }

    public void setBtnBuscarIdeCli(JButton btnBuscarIdeCli) {
        this.btnBuscarIdeCli = btnBuscarIdeCli;
    }

    public JButton getBtnBuscarNomCli() {
        return btnBuscarNomCli;
    }

    public void setBtnBuscarNomCli(JButton btnBuscarNomCli) {
        this.btnBuscarNomCli = btnBuscarNomCli;
    }

    public JButton getBtnBuscarTipCli() {
        return btnBuscarTipCli;
    }

    public void setBtnBuscarTipCli(JButton btnBuscarTipCli) {
        this.btnBuscarTipCli = btnBuscarTipCli;
    }

    public JButton getBtnBuscarValCom() {
        return btnBuscarValCom;
    }

    public void setBtnBuscarValCom(JButton btnBuscarValCom) {
        this.btnBuscarValCom = btnBuscarValCom;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnOrdenarAntCli() {
        return btnOrdenarAntCli;
    }

    public void setBtnOrdenarAntCli(JButton btnOrdenarAntCli) {
        this.btnOrdenarAntCli = btnOrdenarAntCli;
    }

    public JButton getBtnOrdenarApeCli() {
        return btnOrdenarApeCli;
    }

    public void setBtnOrdenarApeCli(JButton btnOrdenarApeCli) {
        this.btnOrdenarApeCli = btnOrdenarApeCli;
    }

    public JButton getBtnOrdenarIdeCli() {
        return btnOrdenarIdeCli;
    }

    public void setBtnOrdenarIdeCli(JButton btnOrdenarIdeCli) {
        this.btnOrdenarIdeCli = btnOrdenarIdeCli;
    }

    public JButton getBtnOrdenarNomCli() {
        return btnOrdenarNomCli;
    }

    public void setBtnOrdenarNomCli(JButton btnOrdenarNomCli) {
        this.btnOrdenarNomCli = btnOrdenarNomCli;
    }

    public JButton getBtnOrdenarTipCli() {
        return btnOrdenarTipCli;
    }

    public void setBtnOrdenarTipCli(JButton btnOrdenarTipCli) {
        this.btnOrdenarTipCli = btnOrdenarTipCli;
    }

    public JButton getBtnOrdenarValCom() {
        return btnOrdenarValCom;
    }

    public void setBtnOrdenarValCom(JButton btnOrdenarValCom) {
        this.btnOrdenarValCom = btnOrdenarValCom;
    }
    
    
}
