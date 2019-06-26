/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerParcial;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author CAT
 */
public class ArregloBinario {

    static int binario[];
    static int datos, tamaño, i, conta = 1, menor;

    public static void main(String args[]) {
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo por favor"));
        binario = new int[tamaño];
        JOptionPane.showMessageDialog(null, "Ingrese los valores por favor");
        for (i = 0; i < binario.length; i++) {
            do {
                datos = Integer.parseInt(JOptionPane.showInputDialog("Valor de la posicion " + conta));
                if (datos > 1 || datos < 0) {
                    JOptionPane.showMessageDialog(null, "Favor de solo ingresar 1 y 0 (numero binario)", "Error", JOptionPane.WARNING_MESSAGE);
                }
            } while (datos > 1 || datos < 0);
            conta++;
            binario[i] = datos;
        }
        JOptionPane.showMessageDialog(null, "Tu arreglo es " + Arrays.toString(binario));
        Arrays.sort(binario);
        JOptionPane.showMessageDialog(null, "Tu arreglo acomodado es " + Arrays.toString(binario));
    }
}
