package pratica1;

public class Personagem2 extends Personagem{
    public Personagem2(){
        setPula(new PulaAlto());
        setCorre(new CorreRapido());
        setAtaque(new AtaqueMedio());
    }
}
