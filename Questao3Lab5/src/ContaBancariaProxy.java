// ContaBancariaProxy.java
public class ContaBancariaProxy implements ContaBancaria {
    private ContaBancariaReal contaBancariaReal;
    private boolean autenticado;

    public ContaBancariaProxy(ContaBancariaReal contaBancariaReal) {
        this.contaBancariaReal = contaBancariaReal;
        this.autenticado = false;
    }

    // Simula a autenticação de um usuário.
    public void autenticar(String usuario, String senha) {
        if ("usuario123".equals(usuario) && "senha123".equals(senha)) {
            autenticado = true;
            System.out.println("Autenticado com sucesso.");
        } else {
            autenticado = false;
            System.out.println("Falha na autenticação.");
        }
    }

    
    public void depositar(double quantia) {
        if (autenticado) {
            contaBancariaReal.depositar(quantia);
        } else {
            System.out.println("Acesso negado! Faça a autenticação primeiro.");
        }
    }

    
    public void sacar(double quantia) {
        if (autenticado) {
            contaBancariaReal.sacar(quantia);
        } else {
            System.out.println("Acesso negado! Faça a autenticação primeiro.");
        }
    }

    
    public double consultarSaldo() {
        if (autenticado) {
            return contaBancariaReal.consultarSaldo();
        } else {
            System.out.println("Acesso negado! Faça a autenticação primeiro.");
            return 0.0;
        }
    }
}
