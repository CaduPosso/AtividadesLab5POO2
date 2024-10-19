// Main.java
public class Main {
    public static void main(String[] args) {
        CarroFachada carro = new CarroFachada("101.5 FM");
        
        System.out.println("Iniciando a corrida...");
        carro.iniciarCorrida();
        
        System.out.println("\nFinalizando a corrida...");
        carro.finalizarCorrida();
    }
}
