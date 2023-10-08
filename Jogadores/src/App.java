public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador1 = new Jogador();
        jogador1.setNomeJogador("Dida");
        jogador1.setIdadeJogador(25);
        jogador1.setEnderecoJogador("Rua Tal de SP");
        jogador1.statusJogador1();

        Jogador jogador2 = new Jogador();
        jogador2.setNomeJogador("Ronaldo");
        jogador2.setIdadeJogador(30);
        jogador2.setEnderecoJogador("Rua Tal de Rj");
        jogador2.statusJogador2();

        Jogador jogador3 = new Jogador();
        jogador3.setNomeJogador("Juninho");
        jogador3.setIdadeJogador(26);
        jogador3.setEnderecoJogador("Rua Tal de Goiania");
        jogador3.statusJogador3();

    }
}
