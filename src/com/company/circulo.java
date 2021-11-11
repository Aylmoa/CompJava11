package com.company;
import java.math.*;

public class circulo implements Shape{
    private double radio,area,perimetro;

    public circulo(double rad)throws Exception{
        radio=rad;
        calculaArea();calculaPerimetro();
    }
    public circulo(){}

    public void calculaPerimetro(){
        perimetro=2*Math.PI*radio;
    }
    public void calculaArea(){
        area=Math.PI*(radio*radio);
    }
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    @Override
    public String toString(){
       return("\nCirculo. Area: "+area+" Perimetro: "+perimetro+" radio: "+radio);
    }
}
