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
public class Circulo implements Figura {
    private final double PI = 3.14;
    double radio;
    
    
    
    @Override
    
    public double calcularArea(){
        double area = PI*pow(radio,2);
        
        return area;
    }

    
    @Override
    
    public double calcularPerimetro() {
    return 0.0;    
    }
}
