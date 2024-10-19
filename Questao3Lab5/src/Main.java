// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de R$ 1000,00
        ContaBancariaReal contaReal = new ContaBancariaReal(1000.0);
        
        // Criando o proxy para essa conta
        ContaBancariaProxy proxy = new ContaBancariaProxy(contaReal);
        
        // Tentando acessar a conta sem autenticação
        System.out.println("Tentando acessar sem autenticação:");
        proxy.depositar(200.0);
        proxy.consultarSaldo();
        
        // Realizando a autenticação
        System.out.println("\nAutenticando...");
        proxy.autenticar("usuario123", "senha123");
        
        // Após autenticação, podemos realizar as operações
        System.out.println("\nAcessando após autenticação:");
        proxy.depositar(200.0);
        System.out.println("Saldo atual: R$ " + proxy.consultarSaldo());

        proxy.sacar(150.0);
        System.out.println("Saldo atual: R$ " + proxy.consultarSaldo());
        
        // Tentando operação sem autenticar
        System.out.println("\nTentando acessar com autenticação falha:");
        proxy.autenticar("usuario123", "senhaErrada");
        proxy.sacar(100.0);
    }
}
