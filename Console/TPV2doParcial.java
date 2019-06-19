package exa2;

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TPV2doParcial {

    public static void main(String args[]) throws IOException {
        int numeros[];
        int valor,i;
        int opc;
        Scanner tecl = new Scanner(System.in);

        try {
            File archivo = new File("orden.txt");//creaar o abrir acceso a un archivo y en un constructor
            FileWriter escribir = new FileWriter(archivo, true);//escribir sobre un archivo 
  
            System.out.println("¿Cuantos numeros desea ingresar en la lista?");
            valor = tecl.nextInt();
            numeros = new int[valor];

            System.out.println("La lista es de " + valor + " elementos");
            System.out.println("Ingrese su lista de numeros ");
            for (i = 0; i < numeros.length; i++) {
                numeros[i] = tecl.nextInt();
            }
            Arrays.sort(numeros);

            System.out.println("La lista ordenada de menor a mayor es");
            
            for ( i = 0; i < numeros.length; i++) {

                System.out.println(+numeros[i]);
                escribir.write(numeros[i]);//Escribir en el archivo con el metodo write 
                
            }
//            escribir.write(numeros[i]);
            escribir.close();
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

}
