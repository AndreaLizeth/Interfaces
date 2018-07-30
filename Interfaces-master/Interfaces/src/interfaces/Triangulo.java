/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ESFOT
 */
public class Triangulo implements Figura{
    private double base;
    private double altura;
  
    
    @Override
    public double calcularPerimetro(){
    return 0.0;
    }
    
    @Override
    public double calcularArea(){
        double areaTriangulo = (base*altura)/2;
               
        return areaTriangulo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
    
}
