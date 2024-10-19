// ContaBancariaReal.java
public class ContaBancariaReal implements ContaBancaria {
    private double saldo;

    public ContaBancariaReal(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    
    public void depositar(double quantia) {
        saldo += quantia;
        System.out.println("Depositado: R$ " + quantia);
    }

    
    public void sacar(double quantia) {
        if (quantia > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= quantia;
            System.out.println("Sacado: R$ " + quantia);
        }
    }

    
    public double consultarSaldo() {
        return saldo;
    }
}
