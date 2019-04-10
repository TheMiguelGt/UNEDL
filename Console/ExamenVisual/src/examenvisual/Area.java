package examenvisual;

import java.util.Scanner;

public abstract class Area extends Datos{
    public void calcularArea(){
        Scanner popo=new Scanner(System.in);
        System.out.println("Ingresa la altura");
        h=popo.nextDouble();
        System.out.println("Ingresa la base");
        b=popo.nextDouble();
        A=h*b;
        System.out.println("El area es igual a: " +A);
    }
}
