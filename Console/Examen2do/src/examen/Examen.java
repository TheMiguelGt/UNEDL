package examen;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
       String cambiado[][]={{"A","T"},{"B","U"},{"C","W"},{"D","V"},{"E","X"},{"F",""},{"G","Z"},{"H","A"},{"I","B"},{"J",""},{"K","D"},{"L","E"},{"M","F"},{"N",""},{"Ñ","H"},{"O","I"},{"P","J"},{"Q",""}};
       String palabra;
       Scanner popo=new Scanner(System.in);
       try{
       File archivo = new File("cambio.txt");//creaar o abrir acceso a un archivo y en un constructor
       FileWriter escribir = new FileWriter(archivo, true);
        System.out.println("Escribe algo");
        palabra=popo.next().toUpperCase();
        for(String[] remplazar:cambiado){
//          cadena = cadena.replace(reemplazar[0], reemplazar[1]);
            palabra=palabra.replace(remplazar[0], remplazar[1]);
        }
        System.out.println(palabra);
          escribir.write(palabra);
          escribir.close();
            
       }
       catch (Exception e) {
        }
    }
    
}
