
/**
 * Escreva a descrição da classe Torcedor aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Torcedor
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String sexo;
    private int idade;
    private Time time;
    /**
     * COnstrutor para objetos da classe Torcedor
     */
    public Torcedor(String nome, String sexo, int idade)
    {
        // inicializa variáveis de instância
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public Torcedor (String nome, int idade) 
    {
        this.nome = nome;
        this.idade = idade;
        this.sexo = null;
    }
    
    public Torcedor (String nome, String sexo, int idade, Time time) 
    {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.time = time;
    }
    
    public Torcedor () 
    {
        this.nome = "Jacinto Pinto";
        this.idade = -20;
        this.sexo = "Todo dia";
    }
    
    public String getNome () {
        return this.nome;
    }    
    
    public String getSexo () {
        return this.sexo;
    }
    
    public int getIdade () {
        return this.idade;
    }
    
    public Time getTime () {
        return this.time;
    }
    
    public void imprimeInfo() {
        System.out.println ("Nome: " + this.nome + "\nSexo: " + this.sexo + "\nIdade: " + this.idade);
    }
    
    public void setNome (String a) {
        this.nome = a;
    }
    
    public void setIdade (int a) {
        this.idade = a;
    }
    
    public void setSexo (String a) {
        this.sexo = a;
    }
    
    public void setTime (Time a) {
        this.time = a;
    }
    
    public void imprimeTime () {
        System.out.println ("\nO torcedor(a) " + this.nome + " torce para o/a " + getTime().getNome() + "\n");
    }    
    
    public double receitaTime () {
        return getTime().calculaReceita();
    }    
}
