public class Projecto {
    public static void main(String[] args) {
        ReprodutorMusical rm1 = new ReprodutorMusical();
        rm1.tocar();
        rm1.pausar();
        rm1.selecionarMusica("Bryson Tiller - Don't");

        System.out.println("--- ||| --- ||| ---");

        AparelhoTelefonico at1 = new AparelhoTelefonico();
        at1.atender();
        at1.iniciarCorreioVoz();
        at1.ligar("+244 912 345 678");

        System.out.println("--- ||| --- ||| ---");

        NavegadorInternet ni1 = new NavegadorInternet();
        ni1.adicionarNovaAba();
        ni1.exibirPagina("eulersili.com");
        ni1.atualizarPagina();
    }
}