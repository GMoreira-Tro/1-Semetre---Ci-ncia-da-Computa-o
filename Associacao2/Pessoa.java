public class Pessoa
{
    private String nome;
    private int idade;
    
    private Animal bichoEstimacao;
    
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
        this.bichoEstimacao = null;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    private void fazAlgumaCoisa(int valor)
    {
        //
    }
    
    public void setBichoEstimacao(Animal bicho)
    {
        this.bichoEstimacao = bicho;
    }
    
    
    public Animal getBichoEstimacao()
    {
        return this.bichoEstimacao;
    }
    
    
    public String toString()
    {
                return this.nome + " (" + this.idade + " anos)";
    }
}
