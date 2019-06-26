/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerParcial;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CAT
 */
public class Rotacion {

    static int[] ar;
    static int tamaño, i, rotacion, datos, conta = 1;

    public static void main(String[] args) {
        tamaño = 0;//tamaño del arreglo
        while (tamaño < 1) {
            tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de tu arreglo"));

            if (tamaño < 1) {
                JOptionPane.showMessageDialog(null, "Favor de ingresar un tamaño mayor a 0", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
        rotacion = 0;//ingresar el numero de rotaciones
        while (rotacion <= 0) {
            rotacion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de rotaciones que se ejecutara"));
            if (rotacion <= 0) {
                JOptionPane.showMessageDialog(null, "Favor de ingresar un numero mayor a 0, no se puede hacer una rotacion así", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
        int[] ar = new int[tamaño];
        JOptionPane.showMessageDialog(null, "Favor de llenar el arreglo");//llamr el metodo llenar el arreglo con los valores
        llenarVector(ar);
        JOptionPane.showMessageDialog(null, "Tu arreglo es");//llamar el metodo imprimir
        imprimirVector(ar);
        rotarVectorIzq(ar, rotacion);//llamar el metodo rotar el arreglo
        JOptionPane.showMessageDialog(null, "Tu arreglo rotado es");//llamar el metodo imprimir
        imprimirVector(ar);
    }

    static void llenarVector(int[] ar) {//ingresar datos en el arreglo
        for (i = 0; i < ar.length; i++) {
            datos = Integer.parseInt(JOptionPane.showInputDialog("Valor de la posicion " + conta));
            ar[i] = datos;
            conta++;
        }
    }

    static void imprimirVector(int[] ar) {
        JOptionPane.showMessageDialog(null, Arrays.toString(ar));
    }

    static void rotarVectorIzq(int[] ar, int repeticion) {
        for (int i = 1; i <= repeticion; i++) {
            int aux = ar[0];
            for (int j = 0; j < ar.length - 1; j++) {
                ar[j] = ar[j + 1];
            }
            ar[ar.length - 1] = aux;
        }
    }
}
