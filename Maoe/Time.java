
/**
 * Escreva a descrição da classe Time aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Time
{
    
    
    public static void delay (int x) {
        try {
            Thread.sleep(x*1000);
        } catch (Exception e) {}        
    }
    
    public static int rand (int y) {
        return (int) (Math.random() * y + 1);
    }   
}
