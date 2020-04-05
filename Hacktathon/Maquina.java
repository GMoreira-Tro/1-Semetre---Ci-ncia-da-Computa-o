
/**
 * Escreva a descrição da classe Maquina aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Maquina
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private static double temperaturaMinima = 10;
    private static double temperaturaMaxima = 50;
    private static int qCmax = 250;
    private static int qCmin = 50;
    private static int vMax = 1000;
    private static int vMin = 100;
    public Log log ;
    /**
     * COnstrutor para objetos da classe Maquina
     */
    public Maquina ()
    {
        // inicializa variáveis de instância
        
    }
    public void verificaOsbgl (double temp, int vibr, int qC) {
        if ( temp > this.temperaturaMaxima || temp < this.temperaturaMinima || vibr > this.vMax || vibr < this.vMin || qC > this.qCmax || qC < this.qCmin) {
         System.out.print ("Máquina em estado defeituoso");
        }
        
        else System.out.print ("Máquina em bom estado");
        log = new Log (temp, vibr, qC);
    }   
    
    
}
