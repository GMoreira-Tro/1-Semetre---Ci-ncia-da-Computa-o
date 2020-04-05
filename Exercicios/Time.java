/**
 * Escreva a descrição da classe Time aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Time
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String categoria;
    private double historico;
    private double mensalidade;
    private int ano;
    private int socios;
    /**
     * COnstrutor para objetos da classe Time
     */
    public Time(String nome, String cat)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.categoria = cat;
        this.historico = 0;
        this.mensalidade = 0;
        this.ano = 0;
        this.socios = 0;
    }
    
    public Time () {
       this.nome = null;
       this.categoria = null;
       this.historico = 0;
       this.mensalidade = 0;
       this.ano = 0;
       this.socios = 0; 
    }    

    public void setAno (int a) {
        this.ano = a;
    } 
    
    public void setHistorico (double a) {
        this.historico = a;
    }
    
    public void setSocios (int a) {
        this.socios = a;
    }
    
    public void setNome (String a) {
        this.nome = a;
    }
    
    public void setCategoria (String a) {
        this.categoria = a;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public double getHistorico () {
        return this.historico;
    }    
    
    public String getCategoria () {
        return this.categoria;
    }    
    
    public int getAno () {
        return this.ano;
    }    
    
    public int getSocios () {
        return this.socios;
    }    
    
    public double getMensalidade () {
        return this.mensalidade;
    }
    
    public int calculaIdade (int i) {
        
        return (i - this.ano);
        
    }
    
    public void adicionaSocios (int s) {
        this.socios += s;
        System.out.println("Foram adicionados: " + s + " sócios.");
    }
    
    public String imprimeInfo () {
        return "Nome: " + this.nome + "\nCategoria: " + this.categoria + "\nHistórico: " + this.historico + "\nAno de fundação: " + this.ano
        + "\nSócios: " + this.socios + "\nMensalidade: " + this.mensalidade;
    }
    
    public void contagemRegressiva (int y) {
        int x = calculaIdade(y);
            x = 100 - x;
            x = x * 365 + ((int)(x / 4)); 
            System.out.print ("\nFaltam: " + x + " dias para o centenário"); 
        
    }
    
    public double calculaReceita (){
        return (this.socios * this.mensalidade);
    }    
}
