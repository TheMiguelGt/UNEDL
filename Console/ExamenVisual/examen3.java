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
        int arregloaux[]=new int [7];
        int n = 3;
        int conta=0,menor;
        Scanner popo = new Scanner(System.in);
        arreglo = new int[3][4];
        System.out.println("Ingrese los valores");
        for (int i = 0; i < 4; i++) {//ENTRADA DE DATOS 
            for (int j = 0; j < 3; j++) {

                arreglo[j][i] = popo.nextInt();
                arregloaux[conta]=arreglo[j][i];
            }
        }
       for (int i = 0; i < 7; i++) {//ORDENAR
            for (int j = 0; j < 7; j++) {
                if(arregloaux[i]>arregloaux[j]){
                    int auxiliar=arregloaux[i];
                    arregloaux[i]=arregloaux[j];
                    arregloaux[j]=auxiliar;
                }
                
            }
        }
       conta=0;
       for (int i = 0; i < 4; i++) {//ORDENAR
            for (int j = 0; j < 3; j++) {

                arreglo[j][i]=arregloaux[conta];
                conta++;
            }
        }
        System.out.println("Arreglo ordenado");
        for (int i = 0; i < 4; i++) {//ORDENAR
            for (int j = 0; j < 3; j++) {
                System.out.println(arreglo[j][i]);
            }
        }
    }
}
