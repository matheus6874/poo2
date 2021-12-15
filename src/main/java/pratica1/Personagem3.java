package pratica1;

public class Personagem3 extends Personagem{
    public Personagem3(){
        setPula(new PulaBaixo());
        setCorre(new CorreRapido());
        setAtaque(new AtaqueForte());
    }
}
