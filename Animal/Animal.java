
/**
 * Escreva a descrição da classe Animal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Animal
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String especie;
    private String nome;
    /**
     * COnstrutor para objetos da classe Animal
     */
    public Animal(String specie, String nome)
    {
        // inicializa variáveis de instância
        this.especie = especie;
        this.nome = nome;
    }
    
    public String getEspecie () {
        return this.especie;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public void setEspecie (String Especie) {
        this.especie = especie;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }    
}
