package controller;

import admonArray.AdministradorArray;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.ModeloBelleza;
import validate.Validar;
import view.DatoEntrada;
import view.SalidaParcial;
import view.SalidaTotal;
import view.VerVector;
import view.VistaBelleza;

public class ControladorBelleza implements ActionListener{
    
    //Atributos de la clase
    private final ModeloBelleza modBel;
    private final Validar val;
    private final VistaBelleza visBel;
    private final DatoEntrada datEnt;
    private final SalidaParcial salPar;
    private final SalidaTotal salTot;
    private final VerVector verVec;
    private final AdministradorArray admArr;
    
    //Variables adicionales
    int numComMay, numComMin, numComOca, numTotCom, tipCli, antCli, i;
    float porDes, valDes, valPag, valCom;
    float valComMay, valComMin, valComOca, porComMay, porComMin, porComOca;
    String ideCli, apeCli, nomCli;

    //Formatos de salida
    DecimalFormat f1 = new DecimalFormat("###,###,###,###.##");
    DecimalFormat f2 = new DecimalFormat("############.#%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###,###.##");
    
    //Asignar cabecera y valores a la tabla tblparcial del panel SalidaParcial
    String cabecera1[] = {"Ident.", "Apellidos", "Nombres", "Val. compra", "% Desc.", "Val. Desc.", "Val. Pagar"};
    String datos1[][] = {};
    DefaultTableModel modelo1 = new DefaultTableModel(datos1, cabecera1);
    
    
    //Asignar cabecera y valores a la tabla tblVector del panel VerVector
    String cabecera2[] = {"Identificación.", "Apellidos", "Nombres", "Tipo", "Antigüedad.", "Val. Compra"};
    String datos2[][] = {};
    DefaultTableModel modelo2 = new DefaultTableModel(datos2, cabecera2);
    
    //Vector auxiliar para la busquedas
    ArrayList<ModeloBelleza> vecBus = new ArrayList();
    
    
    //Constructor
    public ControladorBelleza(ModeloBelleza modBel, Validar val, VistaBelleza visBel, DatoEntrada datEnt, 
            SalidaParcial salPar,  SalidaTotal salTot, VerVector verVec, AdministradorArray admArr) {
        this.modBel = modBel;
        this.val    = val;
        this.visBel = visBel;
        this.datEnt = datEnt;
        this.salPar = salPar;
        this.salTot = salTot;
        this.verVec = verVec;
        this.admArr = admArr; 
        
        //Adicionar botones de VitaBelleza
        this.visBel.getBtnValidar().addActionListener(e -> {btnValidar();});
        this.visBel.getBtnAdicionar().addActionListener(e -> {btnAdicionar();});
        this.visBel.getBtnVer().addActionListener(e -> {btnVer();});
        this.visBel.getBtnCalcular().addActionListener(e -> {btnCalcular();});
        this.visBel.getBtnTotalizar().addActionListener(e -> {btnTotalizar();});
        this.visBel.getBtnNuevo().addActionListener(e -> {btnNuevo();});
        this.visBel.getBtnSalir().addActionListener(e -> {System.exit(0);});
        
        //Adicionar lo botone de DatoEntrada
        this.datEnt.getBtnBuscarIdeCli().addActionListener(e -> {btnBuscarIdeCli();});
        this.datEnt.getBtnBuscarApeCli().addActionListener(e -> {btnBuscarApeCli();});
        this.datEnt.getBtnBuscarNomCli().addActionListener(e -> {btnBuscarNomCli();});
        this.datEnt.getBtnBuscarValCom().addActionListener(e -> {btnBuscarValCom();});
        this.datEnt.getBtnBuscarTipCli().addActionListener(e -> {btnBuscarTipCli();});
        this.datEnt.getBtnBuscarAntCli().addActionListener(e -> {btnBuscarAntCli();});
        this.datEnt.getBtnOrdenarIdeCli().addActionListener(e -> {btnOrdenarIdeCli();});
        this.datEnt.getBtnOrdenarApeCli().addActionListener(e -> {btnOrdenarApeCli();});
        this.datEnt.getBtnOrdenarNomCli().addActionListener(e -> {btnOrdenarNomCli();});
        this.datEnt.getBtnOrdenarValCom().addActionListener(e -> {btnOrdenarValCom();});
        this.datEnt.getBtnOrdenarTipCli().addActionListener(e -> {btnOrdenarTipCli();});
        this.datEnt.getBtnOrdenarAntCli().addActionListener(e -> {btnOrdenarAntCli();});
        this.datEnt.getBtnEditar().addActionListener(e -> {btnEditar();});
        this.datEnt.getBtnGuardar().addActionListener(e -> {btnGuardar();});
        this.datEnt.getBtnEliminar().addActionListener(e -> {btnEliminar();});
        
        //Adicionar lo botone Volver
        this.salPar.getBtnVolver().addActionListener(e -> {btnVolver();});
        this.salTot.getBtnVolver().addActionListener(e -> {btnVolver();});
        this.verVec.getBtnVolver().addActionListener(e -> {btnVolver();});
        
        //Adicionarl el combobox
        this.datEnt.getCmbTipCli().addActionListener(this);
        
        //Alinear la columna de la tablas
        alinearModelo1();
        alinearModelo2();
       
        //Crear el vector
        admArr.crearVector();
    }
    
    //Validar los datos de entrada
    public void btnValidar() {
        if (val.validarNumeroEnteroPositivo(datEnt.getTxtIdeCli().getText())) {
            ideCli = datEnt.getTxtIdeCli().getText();

            if (val.validarApellido(datEnt.getTxtApeCli().getText())) {
                apeCli = datEnt.getTxtApeCli().getText();

                if (val.validarNombre(datEnt.getTxtNomCli().getText())) {
                    nomCli = datEnt.getTxtNomCli().getText();

                    if (val.validarNumeroRealPositivo(datEnt.getTxtValCom().getText())) {
                        valCom = Float.parseFloat(datEnt.getTxtValCom().getText());
                        
                        if (val.validarNumeroRealPositivo(datEnt.getTxtAntCli().getText())) {
                            antCli = Integer.parseInt(datEnt.getTxtAntCli().getText());
                        
                            switch(datEnt.getCmbTipCli().getSelectedIndex()){
                                case 0 -> tipCli = 1;
                                case 1 -> tipCli = 2;
                                case 2 -> tipCli = 3;
                            }
                            
                            visBel.getBtnAdicionar().setEnabled(true);
                            //visBel.getBtnTotalizar().setEnabled(true);

                        } else error(datEnt.getTxtAntCli(), "Error en el campo antigüedad, su contenido no es válido");
                    } else error(datEnt.getTxtValCom(), "Error en el campo valor de la compra, su contenido no es válido"); 
                } else error(datEnt.getTxtNomCli(), "Error en el campo nombre del cliente, su contenido no es válido"); 
            } else error(datEnt.getTxtApeCli(), "Error en el campo apellido del cliente, su contenido no es válido");
        } else error(datEnt.getTxtIdeCli(), "Error en el campo identificación del cliente, su contenido no es válido");
    }
    
    //Adicionar elementos al vector
    public void btnAdicionar() {
        ModeloBelleza mb = new ModeloBelleza(ideCli, nomCli, apeCli, tipCli, antCli, valCom);
        admArr.adicionar(mb);
        visBel.getBtnVer().setEnabled(true);
        visBel.getBtnCalcular().setEnabled(true);
        visBel.getBtnTotalizar().setEnabled(true);
        visBel.getBtnAdicionar().setEnabled(false);
        habilitarBtn();
        btnNuevo();
    }
    
    //Ver el contenido del vector
    public void btnVer() {
        modelo2.setRowCount(0);
        for (ModeloBelleza mb : admArr.getVecBel()) {
            Object contenido[] = {mb.getIdeCli(), mb.getApeCli(), mb.getNomCli(), mb.getTipCli(), mb.getAntCli(), f3.format(mb.getValCom())};
            modelo2.addRow(contenido);
        }
        deshabilitarBtn();
        showPane(verVec);
    }
     
    //Realizar lo proceos parciles
    public void btnCalcular() {
        try {
            //Inicializar variable tipo contador y acumulador en 0
            valComMay = 0;
            valComMin = 0;
            valComOca = 0;
            numComMay = 0;
            numComMin = 0;
            numComOca = 0;
            
            //Se limpia el contenido de la tabla
            modelo1.setRowCount(0);
            
            for (ModeloBelleza mb : admArr.getVecBel()) {
                //Procesos parciales
                porDes = modBel.determinarPorcentaje(mb.getTipCli(), mb.getAntCli(), mb.getValCom());
                valDes = modBel.valorDescontar(mb.getValCom(), porDes);
                valPag = modBel.valorPagar(mb.getValCom(), valDes);

                switch (mb.getTipCli()) {
                    case 1 -> {
                        valComMay = modBel.sumar2Valores(valComMay, mb.getValCom());
                        numComMay = modBel.sumar2Valores(numComMay, 1);
                    }
                    case 2 -> {
                        valComMin = modBel.sumar2Valores(valComMin, mb.getValCom());
                        numComMin = modBel.sumar2Valores(numComMin, 1);
                    }
                    case 3 -> {
                        valComOca = modBel.sumar2Valores(valComOca, mb.getValCom());
                        numComOca = modBel.sumar2Valores(numComOca, 1);
                    }
                }
                Object contenido[] = {mb.getIdeCli(), mb.getApeCli(), mb.getNomCli(), f3.format(mb.getValCom()), f2.format(porDes / 100),
                    f3.format(valDes), f3.format(valPag)};
                modelo1.addRow(contenido);
            }

            deshabilitarBtn();
            showPane(salPar);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">Error + ex</p></htnl>", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void btnTotalizar() {
        try {
            
            //Procesos totales
            numTotCom = modBel.sumar3Valores(numComMay, numComMin, numComOca);
            porComMay = modBel.calcularPorcentaje(numComMay, numTotCom);
            porComMin = modBel.calcularPorcentaje(numComMin, numTotCom);
            porComOca = modBel.calcularPorcentaje(numComOca, numTotCom);

            //Datos de salida totales
            salTot.getTxtNumComMay().setText(f1.format(numComMay));
            salTot.getTxtNumComMin().setText(f1.format(numComMin));
            salTot.getTxtNumComOca().setText(f1.format(numComOca));
            salTot.getTxtValComMay().setText(f3.format(valComMay));
            salTot.getTxtValComMin().setText(f3.format(valComMin));
            salTot.getTxtValComOca().setText(f3.format(valComOca));
            salTot.getTxtPorComMay().setText(f2.format(porComMay / 100));
            salTot.getTxtPorComMin().setText(f2.format(porComMin / 100));
            salTot.getTxtPorComOca().setText(f2.format(porComOca / 100));
            salTot.getTxtNumTotCom().setText(f1.format(numTotCom));

            deshabilitarBtn();
            showPane(salTot);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">Error + ex</p></htnl>", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void btnNuevo(){
        datEnt.getTxtIdeCli().setText("");
        datEnt.getTxtApeCli().setText("");
        datEnt.getTxtNomCli().setText("");
        datEnt.getTxtValCom().setText("");
        datEnt.getTxtAntCli().setText("");
        datEnt.getTxtIdeCli().requestFocus();
        habilitarTxt();
        deshabilitarCrud();
    }
    
    
    public void btnBuscarIdeCli() {
        try {
            i = admArr.buscarIdeCli(datEnt.getTxtIdeCli().getText());
            if (i != -1) {
                deshabilitarTxt();
                datEnt.getTxtApeCli().setText(admArr.getVecBel().get(i).getApeCli());
                datEnt.getTxtNomCli().setText(admArr.getVecBel().get(i).getNomCli());
                datEnt.getTxtValCom().setText(f3.format(admArr.getVecBel().get(i).getValCom()));

                switch (admArr.getVecBel().get(i).getTipCli()) {
                    case 1 -> {
                        datEnt.getCmbTipCli().setSelectedIndex(0);
                    }
                    case 2 -> {
                        datEnt.getCmbTipCli().setSelectedIndex(1);
                    }
                    case 3 -> {
                        datEnt.getCmbTipCli().setSelectedIndex(2);
                    }
                }
                datEnt.getTxtAntCli().setText(String.valueOf(admArr.getVecBel().get(i).getAntCli()));
                habilitarCrud();
            } else {
                JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentra la identificación buscada</p></htnl>",
                        "Aención", JOptionPane.WARNING_MESSAGE);
                datEnt.getTxtIdeCli().setText("");
                datEnt.getTxtIdeCli().requestFocus();
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">Error + ex</p></htnl>", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void btnBuscarApeCli(){
        vecBus = admArr.buscarApeCli(datEnt.getTxtApeCli().getText());
        if(vecBus.isEmpty()){
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentra el apellido buscada</p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
            btnNuevo();
        }else
            verBuqueda(vecBus);
    }
    
    public void btnBuscarNomCli(){
        vecBus = admArr.buscarNomCli(datEnt.getTxtNomCli().getText());
        if(vecBus.isEmpty()){
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentra el nombre buscada</p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
            btnNuevo();
        }else
            verBuqueda(vecBus);
    }
    
    public void btnBuscarValCom(){
        vecBus = admArr.buscarValCom(Float.parseFloat(datEnt.getTxtValCom().getText()));
        if(vecBus.isEmpty()){
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentran compras buscadas</p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
            btnNuevo();
        }else
            verBuqueda(vecBus);
    }
    
    public void btnBuscarTipCli() {
        switch (datEnt.getCmbTipCli().getSelectedIndex()) {
            case 0 ->
                tipCli = 1;
            case 1 ->
                tipCli = 2;
            case 2 ->
                tipCli = 3;
        }
        vecBus = admArr.buscarTipCli(tipCli);
        if(vecBus.isEmpty()){
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentran clientes con el tipo buscado</p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
            btnNuevo();
        }else
            verBuqueda(vecBus);
    }
    
    public void btnBuscarAntCli(){
        vecBus = admArr.buscarAntCli(Integer.parseInt(datEnt.getTxtAntCli().getText()));
        if(vecBus.isEmpty()){
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentran cliente con la antiguedad buscada</p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
            btnNuevo();
        }else
            verBuqueda(vecBus);
    }
    
    public void btnOrdenarIdeCli(){
        admArr.ordenarIdentificacion();
        btnVer();
    }
    
    public void btnOrdenarApeCli(){
        admArr.ordenarApellido();
        btnVer();
    }
    
    public void btnOrdenarNomCli(){
        admArr.ordenarNombre();
        btnVer();
    }
    
    public void btnOrdenarValCom(){
        admArr.ordenarCompra();
        btnVer();
    }
    
    public void btnOrdenarTipCli(){
        admArr.ordenarTipo();
        btnVer();
    }
    
    public void btnOrdenarAntCli(){
        admArr.ordenarAntiguedad();
        btnVer();
    }
    
    public void btnEditar(){
        habilitarTxt();
        datEnt.getTxtIdeCli().setEditable(false);
    }
    
    public void btnGuardar(){
        admArr.getVecBel().get(i).setApeCli(datEnt.getTxtApeCli().getText());
        admArr.getVecBel().get(i).setNomCli(datEnt.getTxtNomCli().getText());
        admArr.getVecBel().get(i).setValCom(Float.parseFloat(datEnt.getTxtValCom().getText()));
        
        switch (datEnt.getCmbTipCli().getSelectedIndex()) {
            case 0 ->
                admArr.getVecBel().get(i).setTipCli(1);
            case 1 ->
                admArr.getVecBel().get(i).setTipCli(2);
            case 2 ->
                admArr.getVecBel().get(i).setTipCli(3);
        }
        
        admArr.getVecBel().get(i).setAntCli(Integer.parseInt(datEnt.getTxtAntCli().getText()));
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: green\">Regitro actualizado</p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
        btnNuevo();
    }
    
    public void btnEliminar(){
        admArr.eliminar(i);
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: green\">Regitro eliminado</p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
        btnNuevo();
    }
    
    public void btnVolver(){
        habilitarBtn();
        showPane(datEnt);
        btnNuevo();
    }
    
    
    public void verBuqueda(ArrayList<ModeloBelleza> vecBus){
        modelo2.setRowCount(0);
        for (ModeloBelleza mb : vecBus) {
            Object contenido[] = {mb.getIdeCli(), mb.getApeCli(), mb.getNomCli(), mb.getTipCli(), mb.getAntCli(), f3.format(mb.getValCom())};
            modelo2.addRow(contenido);
        }
        deshabilitarBtn();
        showPane(verVec);
    }
    
    //Método para mostrar un mensaje de error y limpiar el campo de texto y asignarle el focus
    public void error(javax.swing.JTextField txtName, String msg) {
        // Cambiar el color del texto del JOptionPane a rojo
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        txtName.setText("");
        txtName.requestFocus();
        
        // Resetear el color a su valor original (opcional)
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }
    
    //Hacer visible un panel
    public void showPane(JPanel p) {
        p.setSize(800, 500);
        p.setLocation(0, 0);

        visBel.getContenedor().removeAll();
        visBel.getContenedor().add(p, BorderLayout.CENTER);
        visBel.getContenedor().revalidate();
        visBel.getContenedor().repaint();
    }

    public void titulo() {
        visBel.setTitle("Descuento por compras");
        visBel.setLocationRelativeTo(null);
        
        TitledBorder borDatEnt = new TitledBorder("Datos de entrada");
        datEnt.setBorder(borDatEnt);
        
        TitledBorder borSalPar = new TitledBorder("Datos de salida parciales");
        salPar.setBorder(borSalPar);
        
        TitledBorder borSalTot = new TitledBorder("Datos de salida totales");
        salTot.setBorder(borSalTot);
    }
    
    public void deshabilitarTxt(){
        datEnt.getTxtIdeCli().setEditable(false);
        datEnt.getTxtApeCli().setEditable(false);
        datEnt.getTxtNomCli().setEditable(false);
        datEnt.getTxtValCom().setEditable(false);
        datEnt.getCmbTipCli().setEnabled(false);
        datEnt.getTxtAntCli().setEditable(false);
    }
    
     public void habilitarTxt(){
        datEnt.getTxtIdeCli().setEditable(true);
        datEnt.getTxtApeCli().setEditable(true);
        datEnt.getTxtNomCli().setEditable(true);
        datEnt.getTxtValCom().setEditable(true);
        datEnt.getCmbTipCli().setEnabled(true);
        datEnt.getTxtAntCli().setEditable(true);
    }
     
    public void deshabilitarCrud(){
        datEnt.getBtnEditar().setEnabled(false);
        datEnt.getBtnGuardar().setEnabled(false);
        datEnt.getBtnEliminar().setEnabled(false);
    }
    
    public void habilitarCrud(){
        datEnt.getBtnEditar().setEnabled(true);
        datEnt.getBtnGuardar().setEnabled(true);
        datEnt.getBtnEliminar().setEnabled(true);
    }
    
    public void deshabilitarBtn(){
        visBel.getBtnValidar().setEnabled(false);
        visBel.getBtnAdicionar().setEnabled(false);
        visBel.getBtnVer().setEnabled(false);
        visBel.getBtnCalcular().setEnabled(false);
        visBel.getBtnTotalizar().setEnabled(false);
        visBel.getBtnNuevo().setEnabled(false);
        visBel.getBtnSalir().setEnabled(false);
    }
    
    public void habilitarBtn(){
        visBel.getBtnValidar().setEnabled(true);
        visBel.getBtnVer().setEnabled(true);
        visBel.getBtnCalcular().setEnabled(true);
        visBel.getBtnTotalizar().setEnabled(true);
        visBel.getBtnNuevo().setEnabled(true);
        visBel.getBtnSalir().setEnabled(true);
        
        datEnt.getBtnBuscarIdeCli().setEnabled(true);
        datEnt.getBtnBuscarApeCli().setEnabled(true);
        datEnt.getBtnBuscarNomCli().setEnabled(true);
        datEnt.getBtnBuscarValCom().setEnabled(true);
        datEnt.getBtnBuscarTipCli().setEnabled(true);
        datEnt.getBtnBuscarAntCli().setEnabled(true);
        datEnt.getBtnOrdenarIdeCli().setEnabled(true);
        datEnt.getBtnOrdenarApeCli().setEnabled(true);
        datEnt.getBtnOrdenarNomCli().setEnabled(true);
        datEnt.getBtnOrdenarValCom().setEnabled(true);
        datEnt.getBtnOrdenarTipCli().setEnabled(true);
        datEnt.getBtnOrdenarAntCli().setEnabled(true); 
    }
   
    public void deshabilitarBtnVisBelDatEnt(){
        visBel.getBtnAdicionar().setEnabled(false);
        visBel.getBtnVer().setEnabled(false);
        visBel.getBtnCalcular().setEnabled(false);
        visBel.getBtnTotalizar().setEnabled(false);
        datEnt.getBtnBuscarIdeCli().setEnabled(false);
        datEnt.getBtnBuscarApeCli().setEnabled(false);
        datEnt.getBtnBuscarNomCli().setEnabled(false);
        datEnt.getBtnBuscarValCom().setEnabled(false);
        datEnt.getBtnBuscarTipCli().setEnabled(false);
        datEnt.getBtnBuscarAntCli().setEnabled(false);
        datEnt.getBtnOrdenarIdeCli().setEnabled(false);
        datEnt.getBtnOrdenarApeCli().setEnabled(false);
        datEnt.getBtnOrdenarNomCli().setEnabled(false);
        datEnt.getBtnOrdenarValCom().setEnabled(false);
        datEnt.getBtnOrdenarTipCli().setEnabled(false);
        datEnt.getBtnOrdenarAntCli().setEnabled(false);
        datEnt.getBtnEditar().setEnabled(false);
        datEnt.getBtnGuardar().setEnabled(false);
        datEnt.getBtnEliminar().setEnabled(false);
    }

    public final void alinearModelo1() {
        
        //Asignar el modelo1 a la tabla tblParcial de SalidaParcial
        salPar.getTblParcial().setModel(modelo1);

        //Obtener el modelo de la columna del JTable de SalidaParcial
        TableColumnModel columnModel1 = salPar.getTblParcial().getColumnModel();
        
        //Alinear las columnas a la izquierda, centro o derecha
        DefaultTableCellRenderer renderer1 = new DefaultTableCellRenderer();
        renderer1.setHorizontalAlignment(SwingConstants.RIGHT);
        columnModel1.getColumn(0).setCellRenderer(renderer1);
        columnModel1.getColumn(3).setCellRenderer(renderer1);
        columnModel1.getColumn(4).setCellRenderer(renderer1);
        columnModel1.getColumn(5).setCellRenderer(renderer1);
        columnModel1.getColumn(6).setCellRenderer(renderer1);
        
    }
    
    public final void alinearModelo2() {
        //Asignar el modelo1 a la tabla tblVector de VerVector
        verVec.getTblVector().setModel(modelo2);

        //Obtener el modelo de la columna del JTable de SalidaParcial
        TableColumnModel columnModel2 = verVec.getTblVector().getColumnModel();
            
        //Alinear las columnas a la izquierda, centro o derecha
        DefaultTableCellRenderer renderer1 = new DefaultTableCellRenderer();
        renderer1.setHorizontalAlignment(SwingConstants.RIGHT);
        columnModel2.getColumn(0).setCellRenderer(renderer1);
        
        DefaultTableCellRenderer renderer2 = new DefaultTableCellRenderer();
        renderer2.setHorizontalAlignment(SwingConstants.CENTER);
        columnModel2.getColumn(3).setCellRenderer(renderer2);
        columnModel2.getColumn(4).setCellRenderer(renderer2);
        
        DefaultTableCellRenderer renderer3 = new DefaultTableCellRenderer();
        renderer3.setHorizontalAlignment(SwingConstants.RIGHT);
        columnModel2.getColumn(5).setCellRenderer(renderer1);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
