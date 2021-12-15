package pratica1;

public class Principal {
    public static void main(String[] args) {
        Personagem p;

        System.out.println("Persnagem 1");
        p = new Personagem1();
        p.atacar();
        p.correr();
        p.pular();

        System.out.println("Persnagem 2");
        p = new Personagem2();
        p.atacar();
        p.correr();
        p.pular();

        System.out.println("Persnagem 3");
        p = new Personagem3();
        p.atacar();
        p.correr();
        p.pular();
    }
}
