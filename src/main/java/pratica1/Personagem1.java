package pratica1;

import padraoStrategy.MovimentoRapido;

public class Personagem1 extends Personagem{
    public Personagem1(){
        setPula(new PulaMedio());
        setCorre(new CorreMedio());
        setAtaque(new AtaqueForte());
    }
}
