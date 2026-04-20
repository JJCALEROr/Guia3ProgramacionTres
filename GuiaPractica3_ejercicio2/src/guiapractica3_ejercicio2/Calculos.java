/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapractica3_ejercicio2;

/**
 *
 * @author josjo
 */
public class Calculos {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    public double raiz(double a) throws ArithmeticException {
        if (a < 0) {
            throw new ArithmeticException("No se puede sacar raíz de un número negativo");
        }
        return Math.sqrt(a);
    }
}
