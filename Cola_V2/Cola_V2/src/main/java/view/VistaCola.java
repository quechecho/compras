
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaCola extends javax.swing.JFrame {

    public VistaCola() {
        initComponents();
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textnomEst = new javax.swing.JTextField();
        textproSem = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblestudiante = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textideEst = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textvalMatSem = new javax.swing.JTextField();
        btnBuscarapeEst = new javax.swing.JButton();
        btnBuscarnomEst = new javax.swing.JButton();
        btnBuscarproSem = new javax.swing.JButton();
        btnBuscarvalmatSem = new javax.swing.JButton();
        btnBuscarIdeEst = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textapeEst = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnValidar = new javax.swing.JButton();
        btnTotalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cola de estudiantes");

        jLabel2.setText("Nombres");

        jLabel3.setText("promedio");

        textproSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textproSemActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");

        btnNuevo.setText("Nuevo");

        btnVer.setText("Ver");

        btnPrimero.setText("Primero");

        btnEliminar.setText("Eliminar");

        tblestudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblestudiante);

        btnSalir.setText("Salir");

        jLabel4.setText("Identificacion ");

        textideEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textideEstActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor de matricula ");

        btnBuscarapeEst.setText("Buscar ==");
        btnBuscarapeEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarnomEst.setText("Buscar ==");
        btnBuscarnomEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarproSem.setText("Buscar ==");
        btnBuscarproSem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarvalmatSem.setText("Buscar ==");
        btnBuscarvalmatSem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarIdeEst.setText("Buscar ==");
        btnBuscarIdeEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarIdeEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdeEstActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido");

        btnCalcular.setText("Calcular");

        btnValidar.setText("Validar");

        btnTotalizar.setText("Totalizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnVer)
                                .addGap(18, 18, 18)
                                .addComponent(btnPrimero))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textideEst, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(textproSem)
                                    .addComponent(textvalMatSem)
                                    .addComponent(textnomEst)
                                    .addComponent(textapeEst))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnBuscarvalmatSem, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(btnBuscarproSem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(22, 22, 22)
                                        .addComponent(btnEliminar)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnSalir))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnBuscarnomEst, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(btnBuscarapeEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBuscarIdeEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnTotalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarIdeEst)
                    .addComponent(jLabel4)
                    .addComponent(textideEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarnomEst)
                    .addComponent(jLabel5)
                    .addComponent(textapeEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textnomEst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(textproSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarproSem))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(textvalMatSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnBuscarapeEst))
                    .addComponent(btnBuscarvalmatSem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnNuevo)
                    .addComponent(btnVer)
                    .addComponent(btnPrimero)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTotalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnValidar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textproSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textproSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textproSemActionPerformed

    private void textideEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textideEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textideEstActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnBuscarIdeEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdeEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarIdeEstActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscarIdeEst;
    private javax.swing.JButton btnBuscarapeEst;
    private javax.swing.JButton btnBuscarnomEst;
    private javax.swing.JButton btnBuscarproSem;
    private javax.swing.JButton btnBuscarvalmatSem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTotalizar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblestudiante;
    private javax.swing.JTextField textapeEst;
    private javax.swing.JTextField textideEst;
    private javax.swing.JTextField textnomEst;
    private javax.swing.JTextField textproSem;
    private javax.swing.JTextField textvalMatSem;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAdicionar() {
        return btnAdicionar;
    }

    public void setBtnAdicionar(JButton btnAdicionar) {
        this.btnAdicionar = btnAdicionar;
    }

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

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public void setBtnCalcular(JButton btnCalcular) {
        this.btnCalcular = btnCalcular;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public void setBtnNuevo(JButton btnNuevo) {
        this.btnNuevo = btnNuevo;
    }

    public JButton getBtnPrimero() {
        return btnPrimero;
    }

    public void setBtnPrimero(JButton btnPrimero) {
        this.btnPrimero = btnPrimero;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtnTotalizar() {
        return btnTotalizar;
    }

    public void setBtnTotalizar(JButton btnTotalizar) {
        this.btnTotalizar = btnTotalizar;
    }

    public JButton getBtnValidar() {
        return btnValidar;
    }

    public void setBtnValidar(JButton btnValidar) {
        this.btnValidar = btnValidar;
    }

    public JButton getBtnVer() {
        return btnVer;
    }

    public void setBtnVer(JButton btnVer) {
        this.btnVer = btnVer;
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

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTblestudiante() {
        return tblestudiante;
    }

    public void setTblestudiante(JTable tblestudiante) {
        this.tblestudiante = tblestudiante;
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
