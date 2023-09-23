package questao1;

public class Cachorro extends Animal{
    private String raca;
    
    public Cachorro(String nome, double peso, String raca){
        super(nome,peso);
        this.raca = raca;
    }
    
    public String getRaca(){return raca;}
    
    @Override
    public String toString(){
        return "Nome: "+nome+", Peso: "+peso+", Raça: "+raca;
    }
}
