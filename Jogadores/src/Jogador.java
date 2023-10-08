public class Jogador {
    private String nomeJogador;
    private int idadeJogador;
    private String enderecoJogador;

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getIdadeJogador() {
        return idadeJogador;
    }

    public void setIdadeJogador(int idadeJogador) {
        this.idadeJogador = idadeJogador;
    }

    public String getEnderecoJogador() {
        return enderecoJogador;
    }

    public void setEnderecoJogador(String enderecoJogador) {
        this.enderecoJogador = enderecoJogador;
    }

    public void statusJogador1() {
        System.out.println("Nome: " + this.nomeJogador);
        System.out.println("Idade:" + this.idadeJogador);
        System.out.println("Endereco: " + this.enderecoJogador);
    }

    public void statusJogador2() {
        System.out.println("Nome: " + this.nomeJogador);
        System.out.println("Idade: " + this.idadeJogador);
        System.out.println("Endereço: " + this.enderecoJogador);
    }

    public void statusJogador3() {
        System.out.println("Nome: " + this.nomeJogador);
        System.out.println("Idade:" + this.idadeJogador);
        System.out.println("Enderaço: " + this.enderecoJogador);
    }
}
