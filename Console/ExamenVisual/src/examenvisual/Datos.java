package examenvisual;

public abstract class Datos{
    protected double A,h,b,valor,multi,costo;
    protected int conta;

    public Datos() {
    }

    public Datos(double A, double h, double b, double valor, double multi, double costo, int conta) {
        this.A = A;
        this.h = h;
        this.b = b;
        this.valor = valor;
        this.multi = multi;
        this.costo = costo;
        this.conta = conta;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulti() {
        return multi;
    }

    public void setMulti(double multi) {
        this.multi = multi;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    
}
