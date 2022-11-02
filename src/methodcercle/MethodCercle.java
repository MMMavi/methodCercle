/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodcercle;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MethodCercle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        afficher("enter rayon");
        double r = scan.nextDouble();

        double p = perimetre(r);
        
        afficher("perimetre = " + p);

    }

    static double perimetre(double r) {
        double p = 2 * r * Math.PI;
        return p;

    }

    static void afficher(String text) {
        System.out.println(text);
    }
}
