public class ReprodutorMusical extends iPhone {
    public void tocar() {
        System.out.println("Faixa tocando.");
    }
    public void pausar() {
        System.out.println("Som pausado.");
    }
    public void selecionarMusica (String musica) {
        System.out.printf("Selecionando a música: %s\n", musica);
    }
}