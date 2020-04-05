
/**
 * Escreva a descrição da classe Carta aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Carta
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String naipe;
    private int n;
    /**
     * COnstrutor para objetos da classe Carta
     */
    public Carta(String naipe, int n)
    {
        this.naipe = naipe;// inicializa variáveis de instância
        this.n = n;
    }

    public String imprimeInfo()
    {
        // ponha seu código aqui
        return "Naipe: " + this.naipe + "\nNúmero: " + this.n;
    }
    
    public String getNaipe () {
        return this.naipe;
    } 
    
    public int getN () {
        return this.n;
    }
    
    public void setN (int n) {
        this.n = n;
    }
    
    public void setNaipe (String naipe) {
        this.naipe = naipe;
    }    
}
