package com.company;

public class Rombo implements Shape {
    private double lado, diagonal1,diagonal2, area, perimetro;


    public Rombo(double lado,double diagonal, double Diagonal2)throws Exception{
        this.lado=lado;diagonal1=diagonal;diagonal2=Diagonal2;
        calculaArea();calculaPerimetro();
    }
    public Rombo(){}

    public void calculaArea(){
        area=(diagonal1*diagonal2)/2;
    }
    public void calculaPerimetro(){
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
       return("\nRombo. Area: "+area+" Perimetro: "+perimetro+" Lados: "+lado+" Diagonal 1: " +
                diagonal1+" Diagonal 2: "+diagonal2);
    }
}
