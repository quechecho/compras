
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Entrada extends javax.swing.JPanel {

   
    public Entrada() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrdenarIdeCli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextideEst = new javax.swing.JTextField();
        jTextnomEst = new javax.swing.JTextField();
        jTextapeEst = new javax.swing.JTextField();
        jTextproSem = new javax.swing.JTextField();
        jTextvalMatSem = new javax.swing.JTextField();
        btnBuscarIdeCli = new javax.swing.JButton();
        btnOrdenarIdeCli1 = new javax.swing.JButton();
        btnBuscarIdeCli1 = new javax.swing.JButton();
        btnOrdenarIdeCli2 = new javax.swing.JButton();
        btnOrdenarIdeCli3 = new javax.swing.JButton();
        btnBuscarIdeCli2 = new javax.swing.JButton();
        btnBuscarIdeCli3 = new javax.swing.JButton();
        btnBuscarIdeCli4 = new javax.swing.JButton();
        btnOrdenarIdeCli4 = new javax.swing.JButton();
        btnOrdenarIdeCli5 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        btnOrdenarIdeCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarIdeCli.setText("Ordenar");
        btnOrdenarIdeCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Datos de entrada");

        jLabel2.setText("Identificacion:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Promedio del semestre:");

        jLabel6.setText("Valor de matricula:");

        btnBuscarIdeCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarIdeCli.setText("Buscar ==");
        btnBuscarIdeCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarIdeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdeCliActionPerformed(evt);
            }
        });

        btnOrdenarIdeCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarIdeCli1.setText("Ordenar");
        btnOrdenarIdeCli1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarIdeCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarIdeCli1.setText("Buscar ==");
        btnBuscarIdeCli1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOrdenarIdeCli2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarIdeCli2.setText("Ordenar");
        btnOrdenarIdeCli2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOrdenarIdeCli3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarIdeCli3.setText("Ordenar");
        btnOrdenarIdeCli3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarIdeCli2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarIdeCli2.setText("Buscar ==");
        btnBuscarIdeCli2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarIdeCli3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarIdeCli3.setText("Buscar ==");
        btnBuscarIdeCli3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarIdeCli4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarIdeCli4.setText("Buscar ==");
        btnBuscarIdeCli4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOrdenarIdeCli4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarIdeCli4.setText("Ordenar");
        btnOrdenarIdeCli4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOrdenarIdeCli5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ordenar.png"))); // NOI18N
        btnOrdenarIdeCli5.setText("Ordenar");
        btnOrdenarIdeCli5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextideEst)
                            .addComponent(jTextnomEst)
                            .addComponent(jTextapeEst)
                            .addComponent(jTextproSem)
                            .addComponent(jTextvalMatSem, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarIdeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOrdenarIdeCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBuscarIdeCli2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarIdeCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOrdenarIdeCli3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOrdenarIdeCli2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarIdeCli3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOrdenarIdeCli4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarIdeCli4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOrdenarIdeCli5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextideEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdeCli)
                    .addComponent(btnOrdenarIdeCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextnomEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarIdeCli2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdeCli2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextapeEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarIdeCli3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdeCli1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextproSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdeCli3)
                    .addComponent(btnOrdenarIdeCli4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextvalMatSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdeCli4)
                    .addComponent(btnOrdenarIdeCli5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarIdeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdeCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarIdeCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarIdeCli;
    private javax.swing.JButton btnBuscarIdeCli1;
    private javax.swing.JButton btnBuscarIdeCli2;
    private javax.swing.JButton btnBuscarIdeCli3;
    private javax.swing.JButton btnBuscarIdeCli4;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnOrdenarIdeCli;
    private javax.swing.JButton btnOrdenarIdeCli1;
    private javax.swing.JButton btnOrdenarIdeCli2;
    private javax.swing.JButton btnOrdenarIdeCli3;
    private javax.swing.JButton btnOrdenarIdeCli4;
    private javax.swing.JButton btnOrdenarIdeCli5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextapeEst;
    private javax.swing.JTextField jTextideEst;
    private javax.swing.JTextField jTextnomEst;
    private javax.swing.JTextField jTextproSem;
    private javax.swing.JTextField jTextvalMatSem;
    // End of variables declaration//GEN-END:variables

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JTextField getjTextapeEst() {
        return jTextapeEst;
    }

    public void setjTextapeEst(JTextField jTextapeEst) {
        this.jTextapeEst = jTextapeEst;
    }

    public JTextField getjTextideEst() {
        return jTextideEst;
    }

    public void setjTextideEst(JTextField jTextideEst) {
        this.jTextideEst = jTextideEst;
    }

    public JTextField getjTextnomEst() {
        return jTextnomEst;
    }

    public void setjTextnomEst(JTextField jTextnomEst) {
        this.jTextnomEst = jTextnomEst;
    }

    public JTextField getjTextproSem() {
        return jTextproSem;
    }

    public void setjTextproSem(JTextField jTextproSem) {
        this.jTextproSem = jTextproSem;
    }

    public JTextField getjTextvalMatSem() {
        return jTextvalMatSem;
    }

    public void setjTextvalMatSem(JTextField jTextvalMatSem) {
        this.jTextvalMatSem = jTextvalMatSem;
    }

    public JButton getBtnBuscarIdeCli() {
        return btnBuscarIdeCli;
    }

    public void setBtnBuscarIdeCli(JButton btnBuscarIdeCli) {
        this.btnBuscarIdeCli = btnBuscarIdeCli;
    }

    public JButton getBtnBuscarIdeCli1() {
        return btnBuscarIdeCli1;
    }

    public void setBtnBuscarIdeCli1(JButton btnBuscarIdeCli1) {
        this.btnBuscarIdeCli1 = btnBuscarIdeCli1;
    }

    public JButton getBtnBuscarIdeCli2() {
        return btnBuscarIdeCli2;
    }

    public void setBtnBuscarIdeCli2(JButton btnBuscarIdeCli2) {
        this.btnBuscarIdeCli2 = btnBuscarIdeCli2;
    }

    public JButton getBtnBuscarIdeCli3() {
        return btnBuscarIdeCli3;
    }

    public void setBtnBuscarIdeCli3(JButton btnBuscarIdeCli3) {
        this.btnBuscarIdeCli3 = btnBuscarIdeCli3;
    }

    public JButton getBtnBuscarIdeCli4() {
        return btnBuscarIdeCli4;
    }

    public void setBtnBuscarIdeCli4(JButton btnBuscarIdeCli4) {
        this.btnBuscarIdeCli4 = btnBuscarIdeCli4;
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

    public JButton getBtnOrdenarIdeCli() {
        return btnOrdenarIdeCli;
    }

    public void setBtnOrdenarIdeCli(JButton btnOrdenarIdeCli) {
        this.btnOrdenarIdeCli = btnOrdenarIdeCli;
    }

    public JButton getBtnOrdenarIdeCli1() {
        return btnOrdenarIdeCli1;
    }

    public void setBtnOrdenarIdeCli1(JButton btnOrdenarIdeCli1) {
        this.btnOrdenarIdeCli1 = btnOrdenarIdeCli1;
    }

    public JButton getBtnOrdenarIdeCli2() {
        return btnOrdenarIdeCli2;
    }

    public void setBtnOrdenarIdeCli2(JButton btnOrdenarIdeCli2) {
        this.btnOrdenarIdeCli2 = btnOrdenarIdeCli2;
    }

    public JButton getBtnOrdenarIdeCli3() {
        return btnOrdenarIdeCli3;
    }

    public void setBtnOrdenarIdeCli3(JButton btnOrdenarIdeCli3) {
        this.btnOrdenarIdeCli3 = btnOrdenarIdeCli3;
    }

    public JButton getBtnOrdenarIdeCli4() {
        return btnOrdenarIdeCli4;
    }

    public void setBtnOrdenarIdeCli4(JButton btnOrdenarIdeCli4) {
        this.btnOrdenarIdeCli4 = btnOrdenarIdeCli4;
    }

    public JButton getBtnOrdenarIdeCli5() {
        return btnOrdenarIdeCli5;
    }

    public void setBtnOrdenarIdeCli5(JButton btnOrdenarIdeCli5) {
        this.btnOrdenarIdeCli5 = btnOrdenarIdeCli5;
    }



}
