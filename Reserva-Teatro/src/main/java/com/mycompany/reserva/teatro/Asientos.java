package com.mycompany.reserva.teatro;

public class Asientos {
    private char[][] asi;
    private final int DIMF = 10;
    public Asientos(){
        asi = new char[DIMF][DIMF];
    }
    
    public void inicializarAsientos(){
        for (int i = 0; i < DIMF; i++) {
            for (int j = 0; j < DIMF; j++) {
                asi[i][j] = 'L';
            }
        }
    }
    
    public String cargarAsiento(int i, int j){
        String s = "Asiento ocupado";
        if (asi[i][j] == 'L') {
            asi[i][j] = 'X';
            s = "Asiento cargado";
        } 
        return s;
    }
    
    public void mostrarAsientos(){
        for (int i = 0; i < DIMF; i++) {
            System.out.println("Fila "+i);
            for (int j = 0; j < DIMF; j++) {                
                System.out.print(asi[i][j]);
            }
            System.out.print("\n");
        }
    }
}
