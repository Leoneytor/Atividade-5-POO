public class Mago extends Personagem {
    private int mana;
    private int poderMagico;

    public Mago(String nome, int vida, int mana, int poderMagico) {
        super(nome, vida);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public void lancarMagia() {
        if (mana >= 10) {
            mana -= 10;
            System.out.println(nome + " lançou uma magia com poder " + poderMagico +
                    "! Mana restante: " + mana);
        } else {
            System.out.println(nome + " não possui mana suficiente para lançar magia!");
        }
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Mana: " + mana);
        System.out.println("Poder Mágico: " + poderMagico);
        System.out.println("Tipo: Mago");
    }
}