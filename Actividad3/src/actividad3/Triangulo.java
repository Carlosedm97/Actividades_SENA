package actividad3;

import java.util.Scanner;

public class Triangulo {
    int ladoA;
    int ladoB;
    int ladoC;
    double anguloA;
    double anguloB;
    double anguloC;
    String tipo;
    
    public void clasificacion(){
        if(ladoA == ladoB & ladoB == ladoC){
            System.out.println("El triangulo corresponde a un triangulo equilatero.");
            tipo = "Equilatero";
        } else if(ladoA != ladoB & ladoB != ladoC) {
            System.out.println("El triangulo corresponde a un triangulo escaleno.");
            tipo = "Escaleno";
        } else if (ladoA == ladoB | ladoB == ladoC | ladoC == ladoA){
            System.out.println("El triangulo corresponde a un triangulo isoceles.");
            tipo = "Isoceles";
        }
    }
    
    public void calculoAngulo(){
        double AR, BR, CR, argumento;
        double la = (double)ladoA;
        double lb = (double)ladoB;
        double lc = (double)ladoC;
        
        switch(tipo){
            case "Equilatero":
                AR = Math.PI/3.0;
                BR = Math.PI/3.0;
                CR = Math.PI/3.0;
                break;
                
            default:
                argumento = (lb * lb + lc * lc - la * la) / (2 * lb * lc);
                AR = Math.acos(argumento);
                
                argumento = (la * la + lc * lc - lb * lb) / (2 * la * lc);
                BR = Math.acos(argumento);
                
                argumento = (la * la + lb * lb - lc * lc) / (2 * la * lb);
                CR = Math.acos(argumento);
                break;
        }
        
        anguloA = Math.toDegrees(AR);
        anguloB = Math.toDegrees(BR);
        anguloC = Math.toDegrees(CR);       
    }
   
    
    public static void main(String[] args) {
    Triangulo triangulo1 = new Triangulo();
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado A: ");
        triangulo1.ladoA = sc.nextInt();
        System.out.println("Ingrese el lado B: ");
        triangulo1.ladoB = sc.nextInt();
        System.out.println("Ingrese el lado C: ");
        triangulo1.ladoC = sc.nextInt();
        
        triangulo1.clasificacion();
        triangulo1.calculoAngulo();
        
        System.out.println("Tipo de triangulo: " + triangulo1.tipo);
        System.out.println("Angulo A = " + triangulo1.anguloA);
        System.out.println("Angulo B = " + triangulo1.anguloB);
        System.out.println("Angulo C = " + triangulo1.anguloC);
    }
}



