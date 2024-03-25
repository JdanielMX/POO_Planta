/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planta.logica;

/**
 *
 * @author JDANIEL
 */
public class Arbusto extends Planta {

    private double ancho;
    private boolean esDomestico;
    private String varidadArbusto;
    private String colorHojas;
    private boolean sePoda;

    public Arbusto() {
    }

    public Arbusto(double ancho, boolean esDomestico, String varidadArbusto, String colorHojas, boolean sePoda, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.varidadArbusto = varidadArbusto;
        this.colorHojas = colorHojas;
        this.sePoda = sePoda;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVaridadArbusto() {
        return varidadArbusto;
    }

    public void setVaridadArbusto(String varidadArbusto) {
        this.varidadArbusto = varidadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }

    @Override
    public void presentarce() {
        System.out.println("Hola soy un arbusto");
    }

}
