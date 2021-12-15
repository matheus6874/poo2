package pratica1;

public abstract class Personagem {
    private Ataque ataque;
    private Corre corre;
    private Pula pula;

    public void atacar(){
        this.ataque.atacar();
    }

    public void correr(){
        this.corre.correr();
    }

    public void pular(){
        this.pula.pular();
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public Corre getCorre() {
        return corre;
    }

    public void setCorre(Corre corre) {
        this.corre = corre;
    }

    public Pula getPula() {
        return pula;
    }

    public void setPula(Pula pula) {
        this.pula = pula;
    }
}
