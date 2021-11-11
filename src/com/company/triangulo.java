package com.company;

public class triangulo implements Shape{
    private double area, perimetro, base, altura;

    public triangulo(double bas, double alt)throws Exception{
        base=bas;
        altura=alt;
        calculaArea();calculaPerimetro();
    }
    public triangulo(){}
    public void calculaArea(){
        area=(base*altura)/2;
    }
    public void calculaPerimetro(){
        perimetro=base*3;
    }
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    @Override
    public String toString(){
     return ("\nTriangulo. Area: "+area+" Perimetro: "+perimetro+" Base: "+base+" Altura: "+altura);
    }

}
