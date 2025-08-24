package controlador;

import modelo.Libro;
import validar.Validar;
import vista.Vista;
import admonArbol.ArbolBinario;
import admonArbol.Nodo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Controlador implements ActionListener{
    Libro lib;
    Nodo nod;
    ArbolBinario arbBin;
    Validar val;
    Vista vis;

    //Variables auxiliares
    String tit, aut, isb;
    int cla;

    public Controlador(Libro lib, Nodo nod, ArbolBinario arbBin, Validar val, Vista vis) {
        this.lib = lib;
        this.nod = nod;
        this.arbBin = arbBin;
        this.val = val;
        this.vis = vis;
        
        //Adicionar los botones
        this.vis.getBtnValidar().addActionListener(e->{btnValidar();});
        this.vis.getBtnInsertar().addActionListener(e->{btnInsertar();});
        this.vis.getBtnBuscar().addActionListener(e->{btnBuscar();});
        this.vis.getBtnEliminar().addActionListener(e->{btnEliminar();});
        this.vis.getBtnPreOrden().addActionListener(e->{btnPreOrden();});
        this.vis.getBtnInOrden().addActionListener(e->{btnInOrden();});
        this.vis.getBtnPostOrden().addActionListener(e->{btnPostOrden();});
        this.vis.getBtnLimpiar().addActionListener(e->{btnLimpiar();});
        this.vis.getBtnSalir().addActionListener(e -> {System.exit(0);});
    }
    
    public void btnValidar(){
        if (val.validarCadena(vis.getTxtTitulo().getText().trim())) {
            tit = vis.getTxtTitulo().getText().trim();

            if (val.validarCadena(vis.getTxtAutor().getText().trim())) {
                aut = vis.getTxtAutor().getText();

                if (val.validarIsbn(vis.getTxtIsbn().getText().trim())) {
                    isb = vis.getTxtIsbn().getText();
                    lib = new Libro(tit, aut, isb);
                    //habilitarBtn();
                    if (val.validarNumeroEnteroPositivo(vis.getTxtClave().getText().trim())) {
                        cla = Integer.parseInt(vis.getTxtClave().getText());
                        lib = new Libro(tit, aut, isb);
                        habilitarBtn();
                    } else {
                        error(vis.getTxtClave(), "Error en el campo clave, su contenido no es válido");
                    }
                } else {
                    error(vis.getTxtIsbn(), "Error en el campo ISBN, su contenido no es válido");
                }
            } else {
                error(vis.getTxtAutor(), "Error en el campo autor, su contenido no es válido");
            }
        } else {
            error(vis.getTxtTitulo(), "Error en el campo título, su contenido no es válido");
        }
    }
    
    public void btnInsertar(){
        if(arbBin.insertar(cla, lib)){
            mensajeGreen("Nodo insertado");
            btnLimpiar();
            vis.getBtnInsertar().setEnabled(false);
        }else
            mensajeRed("No se pudo insertar, la clave ya exiuste en el árbol");
    }
    
    public void btnBuscar() {
        if (val.validarNumeroEnteroPositivo(vis.getTxtClave().getText().trim())) {
            cla = Integer.parseInt(vis.getTxtClave().getText());
            Libro libro = arbBin.buscar(cla);
            if(libro != null){
                vis.getTxtTitulo().setText(libro.getTitulo());
                vis.getTxtAutor().setText(libro.getAutor());
                vis.getTxtIsbn().setText(libro.getIsbn());
                deshabilitarTxt();
            } else {
                mensajeRed("La clave buscada no existe en el árbol");
            }
        } else {
            error(vis.getTxtClave(), "Error en el campo clave, su contenido no es válido");
        }
    }
    
    public void btnEliminar(){
        if (val.validarNumeroEnteroPositivo(vis.getTxtClave().getText().trim())) {
            cla = Integer.parseInt(vis.getTxtClave().getText());
            Libro libro = arbBin.eliminar(cla);
            if(libro != null){
                vis.getTxtTitulo().setText(libro.getTitulo());
                vis.getTxtAutor().setText(libro.getAutor());
                vis.getTxtIsbn().setText(libro.getIsbn());
                deshabilitarTxt();
                mensajeGreen("Nodo eliminado del árbol");
            }else{
               mensajeRed("El nodo a eliminar no existe en el árbol"); 
            }
        }else{
            error(vis.getTxtClave(), "Error en el campo clave, su contenido no es válido");
        }
    }
    
    public void btnPreOrden(){
        arbBin.preOrden();
    }
    
    public void btnInOrden(){
        arbBin.inOrden();
    }
    
    public void btnPostOrden(){
        arbBin.postOrden();
    }
    
    public void btnLimpiar(){
        vis.getTxtClave().setText("");
        vis.getTxtTitulo().setText("");
        vis.getTxtAutor().setText("");
        vis.getTxtIsbn().setText("");
        arbBin.limpiarTabla();
        vis.getTxtClave().requestFocus();
        habilitarTxt();
    }
    
    public void deshabilitarTxt(){
        vis.getTxtTitulo().setEnabled(false);
        vis.getTxtAutor().setEnabled(false);
        vis.getTxtIsbn().setEnabled(false);
    }
    
    public void habilitarTxt(){
        vis.getTxtTitulo().setEnabled(true);
        vis.getTxtAutor().setEnabled(true);
        vis.getTxtIsbn().setEnabled(true);
    }
    
    public void dehabilitarBtn(){
        vis.getBtnInsertar().setEnabled(false);
        vis.getBtnBuscar().setEnabled(false);
        vis.getBtnEliminar().setEnabled(false);
        vis.getBtnPreOrden().setEnabled(false);
        vis.getBtnInOrden().setEnabled(false);
        vis.getBtnPostOrden().setEnabled(false);
    }
    
    public void habilitarBtn(){
        vis.getBtnInsertar().setEnabled(true);
        vis.getBtnBuscar().setEnabled(true);
        vis.getBtnEliminar().setEnabled(true);
        vis.getBtnPreOrden().setEnabled(true);
        vis.getBtnInOrden().setEnabled(true);
        vis.getBtnPostOrden().setEnabled(true);
    }
    
    public void titulo(){
        vis.setTitle("Árbol binario");
        vis.setLocationRelativeTo(null);
        vis.setVisible(true);
        
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
    
    public void mensajeGreen(String msg) {

        // Cambiar el color del texto del JOptionPane a rojo
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(new Color(80,200,120)));
        JOptionPane.showMessageDialog(null, msg, "Información", JOptionPane.INFORMATION_MESSAGE);
        
        // Resetear el color a su valor original (opcional)
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }
    
    public void mensajeRed(String msg) {

        // Cambiar el color del texto del JOptionPane a rojo
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
        JOptionPane.showMessageDialog(null, msg, "Información", JOptionPane.INFORMATION_MESSAGE);
        
        // Resetear el color a su valor original (opcional)
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
