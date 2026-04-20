/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapracita3_ejercicio1;

/**
 *
 * @author josjo
 */
public class CalculoPromedio {

    ValoresCalculo valores = new ValoresCalculo();

    public void capturaDatos(double parcial, double guia, double control) {
        valores.setParcial(parcial);
        valores.setGuia(guia);
        valores.setControl(control);
    }

    public double calculoProm(double porcGuia, double porcControl) {
        double porcParcial = valores.getParcial() * 0.60;
        double r_guia = valores.getGuia() * porcGuia;
        double r_control = valores.getControl() * porcControl;

        return porcParcial + r_guia + r_control;
    }

}
