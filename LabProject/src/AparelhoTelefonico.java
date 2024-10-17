public class AparelhoTelefonico extends iPhone {
    public void ligar(String numero) {
        System.out.printf("Ligando para %s\n", numero);
    }
    public void atender() {
        System.out.println("Chamada atendida.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }
}