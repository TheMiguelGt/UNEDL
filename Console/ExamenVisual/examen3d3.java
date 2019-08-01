/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author CAT
 */
public class examen3d3 {
    public static int[] el= {1, 12, 5, 111, 200, 1000, 10};
    public static int d = 50, conta, conta2;
    public static void main(String args[]) {
        
        System.out.println("Dinero disponible es de \n: " + d);
        for (int i = 0; i < el.length; i++) {//se verifica los espacios que hay en el arreglo
           conta2++;//se va sumando
        }
        
        System.out.println("Cantidad de precios: " + conta2);//te dice cuantos elementos hay
        System.out.println("Precios: ");
        for (int i = 0; i < el.length; i++) {//vuelve a pasar por todo el arreglo
            System.out.println("\t-$" + el[i]);//te imprime los datos del arreglo
        }
        for (int i = 0; i < el.length; i++) {//de nuevo pasa por el arreglo
            if (el[i] <= d) {//cada dato del arreglo tiene que verificar cuan es menor o igual a 50 que es la cantidad de dinero disponible
                conta++;//incrementa de uno en uno de los que cumpla ese requisito
            }
        }
        System.out.println("Resultado: " + conta);//te imprime cuales son los que cumplen con ese if que sean iguales o menores de 50ya que es el dinero disponible 
    }
}

