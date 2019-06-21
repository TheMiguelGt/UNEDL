/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerParcial;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CAT
 */
public class Rotacion {
    public static void main(String args[]){
        int []ar;
        int tamaño,i,rotacion,datos,conta=1;
        Scanner popo = new Scanner(System.in);
        
        tamaño=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        ar=new int[tamaño];
        JOptionPane.showMessageDialog(null, "Ingrese los valores que contendra su arreglo","Informacion",JOptionPane.INFORMATION_MESSAGE);
        for(i=0;i<ar.length;i++){
            ar[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa los valores que contendra el arreglo (posicion "+conta+")"));
            conta++;  
        }
        for(i=0;i<ar.length;i++){
        JOptionPane.showMessageDialog(null, ar[i]);
        }
//        JOptionPane.showMessageDialog(null, "El tamaño del arreglo es de "+tamaño, "Informacion", JOptionPane.INFORMATION_MESSAGE);
//        rotacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la rotacion que se hara para el lado izquierdo"));
//        JOptionPane.showMessageDialog(null, "La rotacion que se hara sera de "+rotacion, "Informacion", JOptionPane.INFORMATION_MESSAGE);
//        for(i=ar.length;i>=rotacion;i--){
//            System.out.println(ar[i]);
//        }
    
    
    }
}
