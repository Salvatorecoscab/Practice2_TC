/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoautomata;
import java.util.ArrayLisst;
/**
 *
 * @author salvatorecoscab
 */
public class Alfabeto {
    private final ArrayList<Character> elem = new ArrayList<>();
    public void GeneraAlfabetoDigitos(){
        if(this.elem.isEmpty()){
        for(char c='0';c<='9';c++){
            this.elem.add(c);
        }
        }else{
            System.out.println("Error");
        }
    }
    public void GeneraAlfabetoSignos(){
        if(this.elem.isEmpty()){
          this.elem.add('+');
          this.elem.add('-');
        }else{
            System.out.println("Error");
        }
    }
    
    public void GeneraAlfabetoVocalesMinuscolas(){
        if(this.elem.isEmpty()){
        for(char c='a';c<='d';c++){
            this.elem.add(c);
        }
        }else{
            System.out.println("Error");
        }
    }
    public void GeneraAlfabetoBinario(){
        if(this.elem.isEmpty()){
        for(char c='0';c<='1';c++){
            this.elem.add(c);
        }
        }else{
            System.out.println("Error");
        }
    }
    public void MuestraElementos(){
        for(char car:this.elem){
            System.out.print(car+" ");
        }
        System.out.println("");
    }
}

