package padraoStrategy;

public class PersonagemA extends Personagem{
    public PersonagemA(){
        setAtaque(new AtaqueForte());
        setMovimento(new MovimentoRapido());
    }
}
