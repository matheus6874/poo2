package padraoStrategy;

public abstract class Personagem {
    private Ataque ataque;
    private Movimento movimento;

    public void atacar(){
        ataque.atacar();
    }

    public void movimentar(){
        this.movimento.movimentar();
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public Movimento getMovimento() {
        return movimento;
    }

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }
}
