
/**
 * Escreva a descrição da classe Maquina aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Log
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double temperatura;
    private int quantCiclos;
    private int  vibracoes;
    /**
     * COnstrutor para objetos da classe Maquina
     */
    public Log(double temp, int qC, int vibracoes)
    {
        // inicializa variáveis de instância
        this.temperatura = temp;
        this.quantCiclos = qC;
        this.vibracoes = vibracoes;
    }

    public double getTemperatura () {
        return this.temperatura;
    }   
    
    public int getQuantCiclos () {
        return this.quantCiclos;
    } 
    
    public int getVibracoes () {
        return this.vibracoes;
    }
    
    public void setTemperatura (double t) {
        this.temperatura = t;
    } 
    
    public void setQuantCiclos (int q) {
        this.quantCiclos = q;
    } 
    
    public void setVibracoes (int v) {
        this.vibracoes = v;
    } 
    
     
}
