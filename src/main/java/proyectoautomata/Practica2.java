/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoautomata;

import java.util.Scanner;

/**
 *
 * @author salvatorecoscab
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        do{
            System.out.println("Selecciona una opcion:");
            System.out.println("1. AFD numero real");
            System.out.println("2. AFD detecta par de ceros y sin 1's sucesivos");
            System.out.println("3. AFD dos o mas simbolos consecutivos iguales para {a, b, c, d}");
            System.out.println("4. Automata libre");
            System.out.println("5. Salir");
            opc=ent.nextInt();
        }while(opc!=5);
                
        

    }
    
}
