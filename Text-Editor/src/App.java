import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        Marco marco = new Marco(); //Creacion del objeto ventana
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Por tener metodo o constate estatica tengo que crear nombre que tiene
        marco.setVisible(true); //Activa la ventana haciendo el objeto visible
    }
}

//Creacion de la clase ventana
class Marco extends JFrame{
    public Marco() {
        setBounds(300,300,300,300);
        setTitle("Text Editor");
    }
}