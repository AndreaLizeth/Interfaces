/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import static java.lang.Math.pow;

/**
 *
 * @author ESFOT
 */
public class Cuadrado implements Figura {
    private double lado;
    
    @Override
    public double calcularPerimetro(){
    return 0.0;
    }
    
    @Override
    public double calcularArea(){
        double areaCuadrado = pow(lado,2);
        
    return areaCuadrado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
}
