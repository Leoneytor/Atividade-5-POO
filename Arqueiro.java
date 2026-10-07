public class Arqueiro extends Personagem {
    private int flechas;
    private int precisao;

    public Arqueiro(String nome, int vida, int flechas, int precisao) {
        super(nome, vida);
        this.flechas = flechas;
        this.precisao = precisao;
    }

    public void atirar() {
        if (flechas > 0) {
            flechas--;
            System.out.println(nome + " atirou uma flecha com precisão " + precisao +
                    "! Flechas restantes: " + flechas);
        } else {
            System.out.println(nome + " não possui flechas para atirar!");
        }
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Flechas: " + flechas);
        System.out.println("Precisão: " + precisao);
        System.out.println("Tipo: Arqueiro");
    }
}