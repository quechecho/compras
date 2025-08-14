
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
        textideEst = new javax.swing.JTextField();
        textnomEst = new javax.swing.JTextField();
        textapeEst = new javax.swing.JTextField();
        textproSem = new javax.swing.JTextField();
        textvalMatSem = new javax.swing.JTextField();
        btnBuscarIdeEst = new javax.swing.JButton();
        btnBuscarapeEst = new javax.swing.JButton();
        btnBuscarnomEst = new javax.swing.JButton();
        btnBuscarproSem = new javax.swing.JButton();
        btnBuscarvalmatSem = new javax.swing.JButton();

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

        btnBuscarIdeEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarIdeEst.setText("Buscar ==");
        btnBuscarIdeEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarIdeEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdeEstActionPerformed(evt);
            }
        });

        btnBuscarapeEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarapeEst.setText("Buscar ==");
        btnBuscarapeEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarnomEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarnomEst.setText("Buscar ==");
        btnBuscarnomEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarproSem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarproSem.setText("Buscar ==");
        btnBuscarproSem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarvalmatSem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buscar.png"))); // NOI18N
        btnBuscarvalmatSem.setText("Buscar ==");
        btnBuscarvalmatSem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                            .addComponent(textideEst)
                            .addComponent(textnomEst)
                            .addComponent(textapeEst)
                            .addComponent(textproSem)
                            .addComponent(textvalMatSem, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarIdeEst, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBuscarnomEst, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarapeEst, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarproSem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarvalmatSem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textideEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdeEst))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textnomEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarnomEst))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textapeEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarapeEst))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textproSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarproSem))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textvalMatSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarvalmatSem))
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarIdeEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdeEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarIdeEstActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarIdeEst;
    private javax.swing.JButton btnBuscarapeEst;
    private javax.swing.JButton btnBuscarnomEst;
    private javax.swing.JButton btnBuscarproSem;
    private javax.swing.JButton btnBuscarvalmatSem;
    private javax.swing.JButton btnOrdenarIdeCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textapeEst;
    private javax.swing.JTextField textideEst;
    private javax.swing.JTextField textnomEst;
    private javax.swing.JTextField textproSem;
    private javax.swing.JTextField textvalMatSem;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBuscarIdeEst() {
        return btnBuscarIdeEst;
    }

    public void setBtnBuscarIdeEst(JButton btnBuscarIdeEst) {
        this.btnBuscarIdeEst = btnBuscarIdeEst;
    }

    public JButton getBtnBuscarapeEst() {
        return btnBuscarapeEst;
    }

    public void setBtnBuscarapeEst(JButton btnBuscarapeEst) {
        this.btnBuscarapeEst = btnBuscarapeEst;
    }

    public JButton getBtnBuscarnomEst() {
        return btnBuscarnomEst;
    }

    public void setBtnBuscarnomEst(JButton btnBuscarnomEst) {
        this.btnBuscarnomEst = btnBuscarnomEst;
    }

    public JButton getBtnBuscarproSem() {
        return btnBuscarproSem;
    }

    public void setBtnBuscarproSem(JButton btnBuscarproSem) {
        this.btnBuscarproSem = btnBuscarproSem;
    }

    public JButton getBtnBuscarvalmatSem() {
        return btnBuscarvalmatSem;
    }

    public void setBtnBuscarvalmatSem(JButton btnBuscarvalmatSem) {
        this.btnBuscarvalmatSem = btnBuscarvalmatSem;
    }

    public JButton getBtnOrdenarIdeCli() {
        return btnOrdenarIdeCli;
    }

    public void setBtnOrdenarIdeCli(JButton btnOrdenarIdeCli) {
        this.btnOrdenarIdeCli = btnOrdenarIdeCli;
    }

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

    public JTextField getTextapeEst() {
        return textapeEst;
    }

    public void setTextapeEst(JTextField textapeEst) {
        this.textapeEst = textapeEst;
    }

    public JTextField getTextideEst() {
        return textideEst;
    }

    public void setTextideEst(JTextField textideEst) {
        this.textideEst = textideEst;
    }

    public JTextField getTextnomEst() {
        return textnomEst;
    }

    public void setTextnomEst(JTextField textnomEst) {
        this.textnomEst = textnomEst;
    }

    public JTextField getTextproSem() {
        return textproSem;
    }

    public void setTextproSem(JTextField textproSem) {
        this.textproSem = textproSem;
    }

    public JTextField getTextvalMatSem() {
        return textvalMatSem;
    }

    public void setTextvalMatSem(JTextField textvalMatSem) {
        this.textvalMatSem = textvalMatSem;
    }

    
   
   

}
