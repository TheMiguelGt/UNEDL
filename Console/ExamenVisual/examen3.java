/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CAT
 */
public class examen3 {

    public static void main(String args[]) {
        int arreglo[][];
        int arregloaux[]=new int [12];
        int n = 3;
        int i,j,auxiliar,o;
        int conta=0,menor;
        Scanner popo = new Scanner(System.in);
        arreglo = new int[3][4];
        System.out.println("Ingrese los valores");
        for ( i = 0; i < 4; i++) {//ENTRADA DE DATOS 
            for ( j = 0; j < 3; j++) {

                arreglo[j][i] = popo.nextInt();
                arregloaux[conta]=arreglo[j][i];
                conta++;
            }
        }
        
         System.out.println("Arreglo desordenado");
        for ( i = 0; i < 4; i++) {//ORDENAR
            for ( j = 0; j < 3; j++) {
                
                System.out.println(arreglo[j][i]);
            }
            
        }
        System.out.println();
       for ( i = 0; i < 12; i++) {//ORDENAR
            for ( j = 0; j < 12; j++) {
                if(arregloaux[i]<arregloaux[j]){
                     auxiliar=arregloaux[i];
                    arregloaux[i]=arregloaux[j];
                    arregloaux[j]=auxiliar;
                }
                
            }
        }
       conta=0;
       for (i = 0; i < 4; i++) {//ORDENAR
            for ( j = 0; j < 3; j++) {
                arreglo[j][i]=arregloaux[conta];
                conta++;
            }
        }
        System.out.println("Arreglo ordenado");
        for ( i = 0; i < 4; i++) {//ORDENAR   
            for ( j = 0; j < 3; j++) {
                System.out.println(arreglo[j][i]);
            }
            
        }
        System.out.println();
    }
}
