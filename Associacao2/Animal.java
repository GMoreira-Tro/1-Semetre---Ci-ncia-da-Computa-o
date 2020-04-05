public class Animal
{
    private String especie;
    private String nome;
    
    public Animal(String especie, String nome)
    {
        this.especie = especie;
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getEspecie() 
    {
        return this.especie;
    }
    
    public String toString()
    {
        return this.especie + " " + this.nome;
    }
}
