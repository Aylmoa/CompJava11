package com.company;

public class cuadrado implements Shape{
    private double area, perimetro,lado;

    public cuadrado(double Lado)throws Exception{
        this.lado=Lado;
        calcularPerimetro();calcularArea();
    }

    private void calcularArea(){
        area=lado*lado;
    }
    private void calcularPerimetro(){
        perimetro=lado*4;
    }

    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    @Override
    public String toString(){
        return("\nCuadrado. Area: "+area+" Perimetro: "+perimetro+" Lados: "+lado);
    }
}
