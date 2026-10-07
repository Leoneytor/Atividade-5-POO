public class Personagem {
    protected String nome;
    protected int vida;
    protected int nivel;
    protected int moedas;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = 1;      // valor padrão
        this.moedas = 0;     // valor padrão
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida atual: " + vida);
    }

    public void recuperarVida(int quantidade) {
        vida += quantidade;
        System.out.println(nome + " recuperou " + quantidade + " de vida. Vida atual: " + vida);
    }

    public void receberMoedas(int quantidade) {
        moedas += quantidade;
        System.out.println(nome + " recebeu " + quantidade + " moedas. Total: " + moedas);
    }

    public void exibirInfo() {
        System.out.println("----- " + nome + " -----");
        System.out.println("Vida: " + vida);
        System.out.println("Nível: " + nivel);
        System.out.println("Moedas: " + moedas);
    }

    // Getters (úteis se precisar)
    public String getNome() { return nome; }
    public int getVida() { return vida; }
}