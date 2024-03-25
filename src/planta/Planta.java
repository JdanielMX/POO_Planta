/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planta;

import planta.logica.Arbol;
import planta.logica.Arbusto;
import planta.logica.Flor;

/**
 *
 * @author JDANIEL
 */
public class Planta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        


        
        Arbol arbol = new Arbol("Gigante", "Duro", 500, "Rojo", "Suaves", "árbol del cielo ", 9000, true, "Primavera");
        
        Flor flor = new Flor("Azul", 24, "Amarillo", "Domestica", "Primavera", "Tulipan", 25, true, "Calido");
        
        Arbusto arbusto = new Arbusto(25, false, "Desertico", "Verdes", false, "Arbusto del desierto", 50, true, "Calouroso");
        
        
        arbol.presentarce();
        flor.presentarce();
        arbusto.presentarce();
        
        

}
    
}
