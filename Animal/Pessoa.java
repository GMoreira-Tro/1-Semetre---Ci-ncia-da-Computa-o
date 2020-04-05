public class Pessoa
{
    private String nome;
    private int idade;
    private Animal bicho;
    public Pessoa()
    {
        this.nome = "(indefinido)";
        this.idade = 0;
    }
    
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public void setBicho (Animal bicho) {
        this.bicho = bicho;
    }
    
    public Animal getBixo () {
        return this.bicho;
    }
    public String toString()
    {
        return this.nome + " (" + this.idade + " anos)";
    }
    
}