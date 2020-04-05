
/**
 * Escreva a descrição da classe TeleSena aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class TeleSena
{
    // private
    private static final int vvenda = 10;
    public int cartela1[], cartela2[] = new int[25];
    /// public
    public static double vtotal = 0;
    public int count1 = 0, count2 =  0; 
    
    public TeleSena(int[] c1, int[] c2) {
        int aux;
        this.cartela1 = c1;
        this.cartela2 = c2;
        /*Quando uma Tele-Sena é instanciada, ordenamos suas cartelas em ordem crescente,
        para o caso de mais de uma cartela de Tele-Sena for gerada com os mesmos números, 
        mas em ordem diferete. Não necessariamente precisávamos pôr em ordem crescente,
        somente precisávamos de uma ordenação.
        */
        for (int i = 0; i < this.cartela1.length - 1; i++) {
            for ( int j = 0; j < this.cartela1.length - 1; j++) {
                if (this.cartela1[j] > this.cartela1[j+1]) {
                    aux = this.cartela1[j];
                    this.cartela1[j] = this.cartela1[j+1];
                    this.cartela1[j+1] = aux;
                }
            }    
        }
        
        for (int i = 0; i < this.cartela2.length - 1; i++) {
            for (int j = 0; j < this.cartela2.length - 1; j++) {
                if (this.cartela2[j] > this.cartela2[j+1]) {
                    aux = this.cartela2[j];
                    cartela2[j] = cartela2[j+1];
                    cartela2[j+1] = aux;
                }
            }    
        }
        
    }
    
    public void tString() { 
        /* função a fins de teste, provavelmente não será usada.
        for( int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(cartela2[i+j*5] + " ");
            }
            System.out.println("\n");
        }
        */
        for( int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(cartela1[i+j*5] + " ");
            }
            System.out.println("\n");
        }
    }
    
    public static int getVVenda () { return vvenda;}
    public static void setVTotal (int n) { vtotal += n;}
    
    public int[] getC1() { return this.cartela1; }
    public int[] getC2() { return this.cartela2; }
    
    public void trocaC1C2 (int s) {
        //tString();
        if (s == 2) { 
            int aux[] = null;
            aux = cartela1;
            cartela1 = cartela2;
            cartela2 = aux;
        }
    }
    
}
