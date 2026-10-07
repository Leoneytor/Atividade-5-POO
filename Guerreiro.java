public class Guerreiro extends Personagem {
    private int forca;
    private int armadura;

    public Guerreiro(String nome, int vida, int forca, int armadura) {
        super(nome, vida);
        this.forca = forca;
        this.armadura = armadura;
    }

    public void golpear() {
        System.out.println(nome + " realizou um golpe poderoso com força " + forca + "!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Força: " + forca);
        System.out.println("Armadura: " + armadura);
        System.out.println("Tipo: Guerreiro");
    }
}