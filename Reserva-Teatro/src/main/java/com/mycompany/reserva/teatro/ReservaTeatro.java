package com.mycompany.reserva.teatro;

import java.util.Scanner;

public class ReservaTeatro {
    public static void main(String[] args) {
        //Inicializacion de variables
        Scanner in = new Scanner(System.in);
        Asientos a = new Asientos();
        int disp;
        String enter;
        final String FIN = "FIN";
        int i = -1,j = -1;
        a.inicializarAsientos();
        //Empieza la carga
        asientosDisponibles(a, in);
        System.out.println("Desea cargar un asiento? Si lo desea, marque SI, si no lo desea marque FIN ");
        enter = in.next();
        //Chequeo cierre
        while(!enter.equals(FIN)){
            //Metodo para cargar asientos
            cargarAsiento(i,j,in,a);
            //Ciclo
            asientosDisponibles(a, in);
            System.out.println("Desea cargar otro asiento? Si no lo desea marque FIN");
            enter = in.next();
        }
        //Cierre del programa
        System.out.println("Programa finalizado, asi quedo el teatro: ");
        a.mostrarAsientos();
        in.close();
    }
    
    public static void asientosDisponibles(Asientos a, Scanner in){
        int disp;
        System.out.println("Desea ver los asientos disponibles? Marque 1 para si, 0 para no");
            disp = in.nextInt();
            if(disp == 1){
                a.mostrarAsientos();
            }
    }
    
    public static void cargarAsiento(int i, int j, Scanner in,Asientos a){
        System.out.println("Indique la fila que desea: (0 -- 9) ");
            i = in.nextInt();
            //Chequeo que no ingrese una fila invalida
            while((i < 0) || (i > 9)){
                System.out.println("No es posible asignar esa fila, ingrese otra por favor");
                i = in.nextInt();
            }
            System.out.println("Indique el asiento de la fila "+i+" que desea: (0 -- 9)");
            j = in.nextInt();
            //Chequeo que no ingrese un asiento invalido
            while((j < 0) || (j > 9)){
                System.out.println("No es posible asignar ese asiento, ingrese otro por favor");
                j = in.nextInt();
            }
            System.out.println(a.cargarAsiento(i,j));
    }
}
