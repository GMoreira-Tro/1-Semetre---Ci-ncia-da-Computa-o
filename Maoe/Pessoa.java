
/**
 * Escreva a descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    public TeleSena[] tl;
    private double premio = 0;
    /**
     * COnstrutor para objetos da classe Pessoa
     */
    public Pessoa(String n, TeleSena[] tl)
    {
        this.nome = n;
        this.tl = tl;
    }
    
    public void imprimeTeleSenas () { // fins de teste
        for (int i = 0; i < tl.length; i++) {
            tl[i].tString();
        }    
    }
    
    public void setPremio (double p) { this.premio = p;} 
    

}
