package padraoStrategy;

public class Principal {
    public static void main(String[] args) {
        Personagem p;

        System.out.println("Persnagem A");
        p = new PersonagemA();
        p.atacar();
        p.movimentar();

        System.out.println("Persnagem B");
        p = new PersonagemB();
        p.atacar();
        p.movimentar();

        System.out.println("Persnagem C");
        p = new PersonagemC();
        p.atacar();
        p.movimentar();

        System.out.println("Persnagem D");
        p = new PersonagemD();
        p.atacar();
        p.movimentar();
    }
}
