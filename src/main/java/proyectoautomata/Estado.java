/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoautomata;

/**
 *
 * @author salvatorecoscab
 */
public class Estado {

    private int id;
    private boolean aceptado;
    private Estado siguiente;

    public boolean Transiciona(Alfabeto a, char valor) {
        if (a.equals(valor)) { 
            return true;
        } else {
            return false;
        }

    }
}