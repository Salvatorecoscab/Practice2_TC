/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoautomata;

import java.util.HashSet;

/**
 *
 * @author salvatorecoscab
 */

public class Automata {
    
    private HashSet<Estado> estados = new HashSet();
    private Alfabeto a;
    private Funciones;
    private Estado q0;
    private HashSet<Estado> estadosaceptacion = new HashSet();
    
    
    
    public boolean Transiciona(String cadena, Estado actual,HashSet <Estado> edo,Alfabeto a){
        for(Estado e: edo){
            Transiciona();
        }
        return a.contains(elem);
    }
    
    public boolean VerificaCadena(String cadena){
        return false;
    }
}
