import LabProject001.iPhone;

public class Phone extends iPhone {
    void ligar(String numero) {
        System.out.println("Ligando para alguém!");
    }
    void atender() {
        System.out.println("Chamada atendida.");
    }
    void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }
}