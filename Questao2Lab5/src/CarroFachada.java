// CarroFacade.java
public class CarroFachada {
    private Motor motor;
    private CintoSeguranca cinto;
    private Porta portas;
    private Farol farol;
    private Radio radio;
    private String estacaoPreferida;

    public CarroFachada(String estacaoPreferida) {
        this.motor = new Motor();
        this.cinto = new CintoSeguranca();
        this.portas = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
        this.estacaoPreferida = estacaoPreferida;
    }

    public void iniciarCorrida() {
        motor.ligar();
        portas.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoPreferida);
        System.out.println("Pronto para dirigir!");
    }

    public void finalizarCorrida() {
        motor.desligar();
        portas.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println("Carro desligado.");
    }
}
