import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        Marco marco = new Marco(); 
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true); //Activa el marco haciendo el objeto visible
    }
}

//----------------------------------------Constructores-----------------------------------------

//Ventana
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
        creaPanel();
        add(menu);
        add(tPane);
    }

    //-----------Metodo para agregar items a cada menu------------
    public void creaItem(String rotulo, String menu, String accion){
        elementoItem = new JMenuItem(rotulo);
        if (menu.equals("archivo")) {
            archivo.add(elementoItem);
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
        areaTexto = new JTextPane(); //instancio el area de texto

        ventana.add(areaTexto); //agrego el area de texto a la ventana

        tPane.addTab("Page",ventana);
    }

    private JTabbedPane tPane;
    private JPanel ventana;
    private JTextPane areaTexto;
    private JMenuBar menu;
    private JMenu archivo, editar, seleccion, ver, apariencia;
    private JMenuItem elementoItem;
}