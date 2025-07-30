
package controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import admonArray.AdministradorArray;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import modelo.estudiantes;
import validar.validar;
import view.Entrada;
import view.SalidasPariales;
import view.Totales;
import view.VerVector;
import view.VistaSubsidios;

//ahi vas viendo y si te funciona melo, sino me escribes y me conecto de nuevo// dale hermano eso va
public class ControladorSubsidio implements ActionListener {

    private final estudiantes est;
    private final VistaSubsidios visSub;
    private final Entrada ent;
    private final SalidasPariales salPar;
    private final Totales tot;
    private final validar val;
    private final VerVector verVec;
    private final AdministradorArray admArr;
    
    float porSubMat, valPagEst, valSubOng,valPagSub, dinTotSub100, dinTotSub80, dinTotSub60, dinTotSub40, dinTotSub20, dinTotSub;
    float porEstSub100, porEstSub80, porEstSub60, porEstSub40, porEstSub20, porEstSub00;
    int numEstSub100, numEstSub80, numEstSub60, numEstSub40, numEstSub20, numEstSub00, numTotEstSub, numTotEstAfi, i;
    
    //Formatos de salida 
     DecimalFormat f1 = new DecimalFormat("###,###,###.##");
    DecimalFormat f2 = new DecimalFormat("#########.#%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");
    
    //Asignar cabecera y valores a la tabla tblsalidaparcial del panel salidaparcial
     String cabecera[] = {"Ident.", "Apellidos", "Nombres", "Val. matSem", "% Sub.", "Val. sub.", "Val. PagEst"};
    String datos[][] = {};
    DefaultTableModel modelo1 = new DefaultTableModel(datos, cabecera);
    
    String cabecera2[] = {"Ident.", "Apellidos", "Nombres", "Val. matSem", "% Sub.", "Val. sub.", "Val. PagEst"};
    String datos2[][] = {};
    DefaultTableModel modelo2 = new DefaultTableModel(datos2, cabecera2);
    
    //Vector auxiliar para las búsquedas
    ArrayList<estudiantes> vecBus = new ArrayList<>();
    
    
    
    //Constructores

    public ControladorSubsidio(estudiantes est, VistaSubsidios visSub, Entrada ent, SalidasPariales salPar, Totales tot, validar val, VerVector verVec, AdministradorArray admArr) {
        this.est = est;
        this.visSub = visSub;
        this.ent = ent;
        this.salPar = salPar;
        this.tot = tot;
        this.val = val;
        this.verVec = verVec;
        this.admArr = admArr; 
    

    //Adiccionar botones y demas componentes graficos
        
        this.visSub.getBtnValidar().addActionListener(e -> {btnValidar();});
        this.visSub.getBtnCalcular().addActionListener(e -> {btnCalcular();});
        this.visSub.getBtnTotalizar().addActionListener(e -> {btnTotalizar();});
        this.visSub.getBtnLimpiar().addActionListener(e -> {btnLimpiar();});
        this.visSub.getBtnSalir().addActionListener(e -> {System.exit(0);});
        this.visSub.getBtnAdicionar().addActionListener(e -> {btnAdicionar();});
        this.visSub.getBtnVer().addActionListener(e -> {btnVer();});
        
        this.salPar.getBtnVolver().addActionListener(e -> {btnVolver();});
       
        
        this.tot.getBntVolver().addActionListener(e -> {btnVolver();});
        this.visSub.getBtnVer1().addActionListener(e -> {btnVer();});

        this.ent.getBtnBuscarIdeEst().addActionListener(e -> {btnBuscarIdeEst();});
        this.ent.getBtnBuscarapeEst().addActionListener(e -> {btnBuscarapeEst();});
        this.ent.getBtnBuscarnomEst().addActionListener(e -> {btnBuscarnomEst();});
        this.ent.getBtnBuscarproSem().addActionListener(e -> {btnBuscarproSem();});
        this.ent.getBtnBuscarvalmatSem().addActionListener(e -> {btnBuscarvalmatSem();});
        this.ent.getBtnOrdenarIdeEst().addActionListener(e -> {btnOrdenarIdeCli();});
        this.ent.getBtnOrdenarapeEst().addActionListener(e -> {btnOrdenarApeCli();});
        this.ent.getBtnOrdenarnomEst().addActionListener(e -> {btnOrdenarNomCli();});
        this.ent.getBtnOrdenarproSem().addActionListener(e -> {btnOrdenarValCom();});
        this.ent.getBtnOrdenarvalmatSem().addActionListener(e -> {btnOrdenarTipCli();});
        this.ent.getBtnEditar().addActionListener(e -> {btnEditar();});
        this.ent.getBtnGuardar().addActionListener(e -> {btnGuardar();});
        this.ent.getBtnEliminar().addActionListener(e -> {btnEliminar();});
        
        //Alinear la columna de la tablas
        alinearModelo1();
        alinearModelo2();
       
        //Crear el vector
        admArr.crearVector();
}
    
    

    private void btnValidar() {
      
        if( val.validarNumeroEnteroPositivo(ent.getTextideEst().getText())) {
            est.setIdeEst(ent.getTextideEst().getText());
               if (val.validarNombre(ent.getTextnomEst().getText())) {
                 est.setNomEst(ent.getTextnomEst().getText());
                     if (val.validarApellido(ent.getTextapeEst().getText())) {
                         est.setApeEst(ent.getTextapeEst().getText());
                         if (val.validarNumeroRealPositivo(ent.getTextproSem().getText())) {
                             est.setProSem(Float.parseFloat(ent.getTextproSem().getText()));
                             if(val.validarNumeroRealPositivo(ent.getTextvalMatSem().getText())) {
                                
                                 est.setValMatSem(Float.parseFloat(ent.getTextvalMatSem().getText()));
                             
                            // JOptionPane.showMessageDialog(null, "datos validos correctamente", "Datos Ok",JOptionPane.INFORMATION_MESSAGE);
                            visSub.getBtnCalcular().setEnabled(true);
                            visSub.getBtnTotalizar().setEnabled(true);
                            
                             }else {
                             error (ent.getTextvalMatSem(),"Error en el campo valor de matricula, su contenido no es válido");
                                    }
                        }else {
                         error (ent.getTextproSem(),"Error en el campo promedio de semestre, su contenido no es válido");
                                }
                    }else {
                     error (ent.getTextapeEst(),"Error en el campo apellido, su contenido no es válido");
                            }
                }else {
                  error (ent.getTextnomEst(),"Error en el campo nombre, su contenido no es válido");
                       }
            }else {
            error (ent.getTextideEst(),"Error en el campo identificacion, su contenido no es válido");
                    }
    }
    
    public void btnAdicionar() {
        estudiantes mb = new estudiantes(est.getIdeEst(),  
        est.getNomEst(),   
        est.getApeEst(),     
        est.getValMatSem(),  
        est.getProSem()      );
        admArr.adicionar(mb);
        visSub.getBtnVer().setEnabled(true);
        visSub.getBtnCalcular().setEnabled(true);
        visSub.getBtnTotalizar().setEnabled(true);
        visSub.getBtnAdicionar().setEnabled(false);
        habilitarbtn();
        btnLimpiar();
        
    }
    
    public void btnVer() {
        modelo2.setRowCount(0);
        for (estudiantes mb : admArr.getvecEst()) {
            Object contenido[] = {mb.getIdeEst(), mb.getApeEst(), mb.getNomEst(), mb.getValMatSem(), mb.getProSem(),};
            modelo2.addRow(contenido);
        }
        desahabilitarbtn();
        showPane(verVec);
    }

    private void btnCalcular() {
       
        //Procesos parciales
        porSubMat = est.determinarPorcentajeSubsidio(est.getProSem()); // Calcula el porcentaje de subsidio
        valSubOng = est.valorSubsidio(est.getValMatSem(), porSubMat);
        valPagSub = est.getValMatSem() - valSubOng;
        
         switch ((int) porSubMat) {
        case 100:
            numEstSub100++;
            dinTotSub100 += valSubOng;
            break;
        case 80:
            numEstSub80++;
            dinTotSub80 += valSubOng;
            break;
        case 60:
            numEstSub60++;
            dinTotSub60 += valSubOng;
            break;
        case 40:
            numEstSub40++;
            dinTotSub40 += valSubOng;
            break;
        case 20:
            numEstSub20++;
            dinTotSub20 += valSubOng;
            break;
        case 0:
            numEstSub00++;
            break;
    }
       
       
        validarEstudiante();
        
        //Datos de salida parciales
        Object contenido[] = {est.getIdeEst(), est.getNomEst(), est.getApeEst(), 
            f3.format(est.getValMatSem()), f2.format(porSubMat / 100), f3.format(valSubOng), 
            f3.format(valPagSub)};
        modelo1.addRow(contenido);
        desahabilitarbtn();
        showPane(salPar);  
        
        
    }

      
    private void btnTotalizar() {
    
    // Procesos totales
    dinTotSub = est.sumar5Valores(dinTotSub100, dinTotSub80, dinTotSub60, dinTotSub40, dinTotSub20);
    numTotEstSub = (int) est.sumar5Valores(numEstSub100, numEstSub80, numEstSub60, numEstSub40, numEstSub20);
    numTotEstAfi = est.sumar2Valores(numTotEstSub, numEstSub00);

    // Cálculo de porcentajes
    porEstSub100 = est.calcularPorcentajeSubsidiados(numEstSub100, numTotEstAfi);
    porEstSub80 =  est.calcularPorcentajeSubsidiados(numEstSub80, numTotEstAfi);
    porEstSub60 =  est.calcularPorcentajeSubsidiados(numEstSub60, numTotEstAfi);
    porEstSub40 = est.calcularPorcentajeSubsidiados(numEstSub40, numTotEstAfi);
    porEstSub20 = est.calcularPorcentajeSubsidiados(numEstSub20, numTotEstAfi);
    porEstSub00 = est.calcularPorcentajeSubsidiados(numEstSub00, numTotEstAfi);

    // Datos de salida totales
    tot.getjTextNumEstSub100().setText(String.valueOf(numEstSub100));
    tot.getjTextNumEstSub80().setText(String.valueOf(numEstSub80));
    tot.getjTextNumEstSub60().setText(String.valueOf(numEstSub60));
    tot.getjTextNumEstSub40().setText(String.valueOf(numEstSub40));
    tot.getjTextNumEstSub20().setText(String.valueOf(numEstSub20));
    tot.getjTextnumEstSub00().setText(String.valueOf(numEstSub00));

    tot.getjTextdinTotSub100().setText(f3.format(dinTotSub100));
    tot.getjTextdinTotSub80().setText(f3.format(dinTotSub80));
    tot.getjTextdinTotSub60().setText(f3.format(dinTotSub60));
    tot.getjTextdinTotSub40().setText(f3.format(dinTotSub40));
    tot.getjTextdinTotSub20().setText(f3.format(dinTotSub20));
 
    // ✅ Arreglando formato de porcentaje (quitamos /100)
    tot.getjTextporEstSub100().setText(f2.format(porEstSub100/100));
    tot.getjTextporEstSub80().setText(f2.format(porEstSub80/100));
    tot.getjTextporEstSub60().setText(f2.format(porEstSub60/100));
    tot.getjTextporEstSub40().setText(f2.format(porEstSub40/100));
    tot.getjTextporEstSub20().setText(f2.format(porEstSub20/100));
    tot.getjTextporEstSub00().setText(f2.format(porEstSub00/100));

    tot.getjTextnumTotEstSub().setText(f1.format(numTotEstSub));
    tot.getjTextdinTotOtoSub().setText(f3.format(dinTotSub));
        System.out.println(porEstSub100);
      desahabilitarbtn();   
        showPane(tot);
}

    private void btnLimpiar() {
        
        ent.getTextideEst().setText("");
        ent.getTextnomEst().setText("");
        ent.getTextapeEst().setText("");
        ent.getTextproSem().setText("");
        ent.getTextvalMatSem().setText("");
        ent.getTextideEst().requestFocus();
  
    }

    private void btnVolver() {
         habilitarbtn();
         showPane(ent);
        btnLimpiar();
    }

    public void titulo() {
        visSub.setTitle("Gestion de subsidio");
        visSub.setLocationRelativeTo(null);
        
         TitledBorder borEnt = new TitledBorder("Datos de entrada");
          ent.setBorder(borEnt);
          
         TitledBorder borsalPar = new TitledBorder("Datos de salida");
          salPar.setBorder(borsalPar);
          
         TitledBorder bortot = new TitledBorder("datos de salidas totales");
         tot.setBorder(bortot);
    
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
        
    public void validarEstudiante() {
    
    // Verificar si todos los campos están llenos
    if (est.getIdeEst().isEmpty() || est.getNomEst().isEmpty() || 
        est.getApeEst().isEmpty() || est.getProSem() == 0 || 
        est.getValMatSem() == 0) {
        JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Verificar si los valores son razonables (ejemplo)
    if (est.getProSem() < 0 || est.getProSem() > 5) {
        JOptionPane.showMessageDialog(null, "El promedio del semestre debe estar entre 0 y 5", "Error", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
   //JOptionPane.showMessageDialog(null, "Validación exitosa del estudiante", "Validación", JOptionPane.INFORMATION_MESSAGE);
    }
        
     //Hacer visible un panel
    public void showPane(JPanel p) {
        p.setSize(800, 500);
        p.setLocation(0, 0);

        visSub.getContenedor().removeAll();
        visSub.getContenedor().add(p,BorderLayout.CENTER);
        visSub.getContenedor().revalidate();
        visSub.getContenedor().repaint();
    }
    
    public void deshabilitarTxt(){
        ent.getTextideEst().setEditable(false);
        ent.getTextapeEst().setEditable(false);
        ent.getTextnomEst().setEditable(false);
        ent.getTextproSem().setEditable(false);
        ent.getTextvalMatSem().setEnabled(false);
    }
    
     public void habilitarTxt(){
        ent.getTextideEst().setEditable(true);
        ent.getTextapeEst().setEditable(true);
        ent.getTextnomEst().setEditable(true);
        ent.getTextproSem().setEditable(true);
        ent.getTextvalMatSem().setEnabled(true);
        
    }
     
    public void deshabilitarCrud(){
        ent.getBtnEditar().setEnabled(false);
        ent.getBtnGuardar().setEnabled(false);
        ent.getBtnEliminar().setEnabled(false);
    }
    
    public void habilitarCrud(){
        ent.getBtnEditar().setEnabled(true);
        ent.getBtnGuardar().setEnabled(true);
        ent.getBtnEliminar().setEnabled(true);
    }
    
    public void habilitarbtn(){
        visSub.getBtnValidar().setEnabled(true);
        visSub.getBtnCalcular().setEnabled(true);
        visSub.getBtnTotalizar().setEnabled(true);
        visSub.getBtnLimpiar().setEnabled(true);
        visSub.getBtnSalir().setEnabled(true);
        visSub.getBtnVer().setEnabled(true);
        
        ent.getBtnBuscarIdeEst().setEnabled(true);
        ent.getBtnBuscarapeEst().setEnabled(true);
        ent.getBtnBuscarnomEst().setEnabled(true);
        ent.getBtnBuscarproSem().setEnabled(true);
        ent.getBtnBuscarvalmatSem().setEnabled(true);
        ent.getBtnOrdenarapeEst().setEnabled(true);
        ent.getBtnOrdenarIdeCli().setEnabled(true);
        ent.getBtnOrdenarproSem().setEnabled(true);
        ent.getBtnOrdenarvalmatSem().setEnabled(true);
        ent.getBtnOrdenarnomEst().setEnabled(true); 
        
    }
    
    public void desahabilitarbtn(){
        visSub.getBtnValidar().setEnabled(false);
        visSub.getBtnCalcular().setEnabled(false);
        visSub.getBtnTotalizar().setEnabled(false);
        visSub.getBtnLimpiar().setEnabled(false);
        visSub.getBtnSalir().setEnabled(false);
        visSub.getBtnAdicionar().setEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
        
    }
    public final void alinearModelo1() {
        
        //Asignar el modelo1 a la tabla tblParcial de SalidaParcial
        salPar.getjTblaDatos().setModel(modelo1);

        //Obtener el modelo de la columna del JTable de SalidaParcial
        TableColumnModel columnModel1 = salPar.getjTblaDatos().getColumnModel();
        
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

   
    
    }

