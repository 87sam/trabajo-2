/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udi.tp2;
import java.util.*;
/**
 *
 * @author SUPCOMERCIO
 */
public class UdiTP2 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
       UdiTP2.Menu();
       
    }

    public static void Menu() {

        Scanner sc = new Scanner(System.in);
        int opcion, v1, v2;

        do {
            System.out.println("Menu elija una opcion");
            System.out.println("1- Area triangulo");
            System.out.println("2- Area Rectangulo");
            System.out.println("3- Area Circulo");
            System.out.println("4- Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la base");
                    v1 = sc.nextInt();
                    System.out.println("Ingrese la altura");
                    v2 = sc.nextInt();
                    System.out.println("El area del triangulo es de " + UdiTP2.Areatri(v1, v2));
                    break;

                case 2:
                    System.out.println("Ingrese la base");
                    v1 = sc.nextInt();
                    System.out.println("Ingrese la altura");
                    v2 = sc.nextInt();
                    System.out.println("El area del Rectangulo  es de " + UdiTP2.Arearec(v1, v2));
                    break;
                case 3:
                    System.out.println("Ingrese el radio");
                    double rad = sc.nextInt();
                    System.out.println("El area del circulo es de " + UdiTP2.Areacir(rad));
                            
            }
        } while (opcion != 4);

    }

    public static int Areatri(int v1, int v2) {
       
        int areat = (v1 * v2) / 2;
        return areat;

    }

    public static int Arearec(int v1, int v2) {
       int arear = v1 * v2;
        return arear;
    }
    
    public static double Areacir (Double rad){
        double PI = 3.146; 
        double areac = PI * (rad*rad);
        return areac;
    }
   
}
    
    

