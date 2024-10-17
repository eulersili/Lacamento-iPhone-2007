public class NavegadorInternet extends iPhone {
    public void exibirPagina(String URL) {
        System.out.printf("Exibindo a página: %s\n", URL);
    }
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada.");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}