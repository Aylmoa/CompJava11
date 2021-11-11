package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Object> ola= new ArrayList<>();
        elegir(ola);
    }

    public static void elegir(ArrayList lista) throws Exception {
        Scanner sc= new Scanner(System.in);
        String cont="o"; double lado;
        do{
            System.out.println("Porfavor escoga que tipo de figuara querra agragar/o calcular" +
                    "\n1= Triangulo equilatero. 2= Circulo." +
                    "3= Cuadrado. 4= Rombo. 5=Mostrar todas las figuras actuales 0= Salir");
            try{
            int eleccion= Integer.parseInt(sc.next());
            switch (eleccion){
                case 1:
                    System.out.println("Cual es la base del triangulo?");
                    double base= Double.parseDouble(sc.next());
                    System.out.println("Cual es la altura del triangulo?");
                    double alt= Double.parseDouble(sc.next());
                    triangulo ola =new triangulo(base,alt);
                    lista.add(ola);
                    break;
                case 2:
                    System.out.println("Cual es radio del circulo?");
                    double radio= Double.parseDouble(sc.next());
                    circulo circ =new circulo(radio);
                    lista.add(circ);
                    break;
                case 3:
                    System.out.println("Caunto mide un lado del cuadrado?");
                     lado= Double.parseDouble(sc.next());
                    cuadrado cua =new cuadrado(lado);
                    lista.add(cua);
                    break;
                case 4:
                    System.out.println("Caunto mide un lado del rombo?");
                     lado= Double.parseDouble(sc.next());
                    System.out.println("Caunto mide la diagonal 1?");
                    double diag= Double.parseDouble(sc.next());
                    System.out.println("Caunto mide la diagonal 2?");
                    double diag2= Double.parseDouble(sc.next());
                    Rombo rombo =new Rombo(lado,diag,diag2);
                    lista.add(rombo);
                    break;
                case 5:
                    System.out.println(lista);
                    break;
                case 0:
                    cont="n";
                    break;
                default:
                    System.out.println("Opción Invalida, vuelva a escoger");
                    break;
            }}catch(java.lang.NumberFormatException exception){
                System.out.println("----No escribiste un numero intenta de nuevo---");}
        }while(cont.equals("o"));

    }
}
