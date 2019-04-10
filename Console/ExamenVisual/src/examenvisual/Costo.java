package examenvisual;

public final class Costo extends Area{

    public void calcularCosto(){
        
        if(A<=24){
            A=A*200;
            do{
                valor=200;
            conta=1;
                multi=(A*conta);
                conta++;
            }while(multi!=A);
        }
        valor=multi*valor;
        System.out.println("---");
        System.out.println("El precio es: "+valor);
    }

    
}
