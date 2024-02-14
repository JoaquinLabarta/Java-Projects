import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Marco marco = new Marco(); 
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true); //Activa el marco haciendo el objeto visible
    }
}

//----------------------------------------Constructores-----------------------------------------

class Marco extends JFrame{
    public Marco() {
        setBounds(300,300,300,300);
        setTitle("Text Editor");
        add(new Panel()); //Agrego etiqueta (siempre al final)
    }
}

//----------------------------Acá va todo lo visual-----------------------------------
class Panel extends JPanel{
    public Panel(){
        //--------------------------Menu-----------------------------
        JPanel panelmenu = new JPanel();
        menu = new JMenuBar();

        archivo = new JMenu("File");
        editar = new JMenu("Edit");
        seleccion = new JMenu("Select");
        apariencia = new JMenu("Appareance");
        ver = new JMenu("See");

        menu.add(archivo);
        menu.add(editar);
        menu.add(seleccion);
        menu.add(ver);

        //---Creador items por menu---
        creaItem("New File", "archivo", "nuevo");
        creaItem("Open File", "archivo", "abrir");
        archivo.addSeparator();
        creaItem("Save","archivo","guardar");
        creaItem("Save as","archivo","guardarComo");

        creaItem("Undo", "editar", "deshacer");
        creaItem("Redo", "editar", "rehacer");
        editar.addSeparator();
        creaItem("Cut", "editar", "cortar");
        creaItem("Copy", "editar", "copiar");
        creaItem("Paste", "editar", "pegar");
        
        creaItem("Select All", "seleccion", "");

        creaItem("Navegation", "ver", "navegar");
        ver.add(apariencia);
        creaItem("Light", "apariencia", "blanco");
        creaItem("Dark", "apariencia", "negro");


        
        panelmenu.add(menu);

        //--------------------Ventana-------------------------------
        tPane = new JTabbedPane();
        listfile = new ArrayList<File>();
        listAreaTexto = new ArrayList<JTextPane>();
        listScroll = new ArrayList<JScrollPane>();
        //-----------------------------------------------------------
        add(menu);
        add(tPane);
    }

    //-----------Metodo para agregar items a cada menu------------
    public void creaItem(String rotulo, String menu, String accion){
        elementoItem = new JMenuItem(rotulo);
        if (menu.equals("archivo")) {
            archivo.add(elementoItem);
            if (accion.equals("nuevo")) {
                elementoItem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        creaPanel(); //crea area de texto
                    }
                });
            }
            else if(accion.equals("abrir")) {
                elementoItem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        creaPanel();
                        JFileChooser selectorArchivo = new JFileChooser();
                        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                        int resultado = selectorArchivo.showOpenDialog(listAreaTexto.get(tPane.getSelectedIndex()));

                        if (resultado == JFileChooser.APPROVE_OPTION) {
                            //try {
                                boolean existePath = false;

                                for (int i=0;i<tPane.getTabCount(); i++) {
                                    File f = selectorArchivo.getSelectedFile();
                                    if (listfile.get(i).getPath().equals(f.getPath())) {
                                        existePath = true;
                                    }
                                }

                                if (!existePath) {
                                    File archivo = selectorArchivo.getSelectedFile();
                                    listfile.set(tPane.getSelectedIndex(), archivo);
                                    try {
                                        FileReader entrada = new FileReader(listfile.get(tPane.getSelectedIndex()).getPath());
                                    } catch (IOException e1) {
                                        // TODO Auto-generated catch block
                                        e1.printStackTrace();
                                    }
                                }

                            //} catch (IOException el) {
                                // TODO: handle exception
                            //}
                        }
                        
                    }
                });
            }
            else if(accion.equals("guardar")) {
                elementoItem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        
                    }
                });
            }
            else if(accion.equals("guardarComo")) {
                elementoItem.addActionListener(new ActionListener() {
                    @Override 
                    public void actionPerformed(ActionEvent e){
                        
                    }
                });
            }
            
        }
        else if (menu.equals("editar")) {
            editar.add(elementoItem);
        }
        else if (menu.equals("seleccion")) {
            seleccion.add(elementoItem);
        }
        else if (menu.equals("apariencia")) {
            apariencia.add(elementoItem);
        }
        else {
            ver.add(elementoItem);
        }
    }

    //---------Metodo para crear la ventana de texto---------------
    public void creaPanel(){
        ventana = new JPanel(); //instancio la ventana
        
        listfile.add(new File(""));
        listAreaTexto.add(new JTextPane());
        listScroll.add(new JScrollPane(listAreaTexto.get(contadorPanel)));

        ventana.add(listScroll.get(contadorPanel));  
    
        tPane.addTab("Page " + (contadorPanel + 1),ventana);
        tPane.setSelectedIndex(contadorPanel);
        contadorPanel++;
        existePanel = true;
    }

    //---------Elementos funcionales--------
    private int contadorPanel = 0;
    private boolean existePanel = false;

    //---------Elementos visuales-----------
    private JTabbedPane tPane;
    private JPanel ventana;
    //private JTextPane areaTexto;
    private ArrayList<JTextPane> listAreaTexto;
    private ArrayList<File> listfile;
    private ArrayList<JScrollPane> listScroll;
    private JMenuBar menu;
    private JMenu archivo, editar, seleccion, ver, apariencia;
    private JMenuItem elementoItem;
}