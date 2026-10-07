public class Main {
    public static void main(String[] args) {

        // 1. Criar os personagens (usei Leoneytor como você pediu)
        Guerreiro guerreiro = new Guerreiro("Leoneytor", 150, 25, 18);
        Mago mago = new Mago("Santiago", 90, 45, 35);
        Arqueiro arqueiro = new Arqueiro("Valeria", 100, 8, 28);

        // 2. Exibir informações
        System.out.println("========== INFORMAÇÕES INICIAIS ==========");
        guerreiro.exibirInfo();
        System.out.println();
        mago.exibirInfo();
        System.out.println();
        arqueiro.exibirInfo();

        // 3. Executar ações específicas
        System.out.println("\n========== AÇÕES ESPECÍFICAS ==========");
        guerreiro.golpear();
        mago.lancarMagia();
        arqueiro.atirar();

        // 4. Mago lança magias até acabar a mana
        System.out.println("\n========== MAGO LANÇANDO MAGIAS ==========");
        for (int i = 0; i < 6; i++) {
            mago.lancarMagia();
        }

        // 5. Arqueiro atira até ficar sem flechas
        System.out.println("\n========== ARQUEIRO ATIRANDO ==========");
        for (int i = 0; i < 10; i++) {
            arqueiro.atirar();
        }

        // 6. Usar ações da classe Personagem
        System.out.println("\n========== AÇÕES GERAIS (Personagem) ==========");
        guerreiro.receberDano(30);
        mago.recuperarVida(20);
        arqueiro.receberMoedas(50);
        guerreiro.receberMoedas(100);

        // Exibir estado final
        System.out.println("\n========== ESTADO FINAL ==========");
        guerreiro.exibirInfo();
        System.out.println();
        mago.exibirInfo();
        System.out.println();
        arqueiro.exibirInfo();
    }
}