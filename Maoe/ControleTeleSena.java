
/**
 * Escreva a descrição da classe ControleTeleSena aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ControleTeleSena
{
    
    public static void ControleTeleSena()
    {   
        TeleSena tl[] = new TeleSena[300];
        tl = fazTeleSena();
        Pessoa p[] = new Pessoa[20];
        int totalVendas = 0;
        
        for (int i = 0; i < 20; i++) {
           int x = (int)(Math.random() * 15) + 1; 
           TeleSena TeleCompra[] = new TeleSena[x];
           TeleCompra = CompraTeleSena(tl,x,totalVendas);
           totalVendas += x;
           p[i] = new Pessoa ("",TeleCompra);
           TeleSena.setVTotal((TeleSena.getVVenda()*x));
        }
        
        //tl[44].tString();
        //tl[299].tString();
        //p[0].imprimeTeleSenas();
        //p[12].imprimeTeleSenas();
        System.out.println("Tele - Senas vendidas: " + totalVendas);
        System.out.println("Preço total de vendas: " + TeleSena.vtotal + "R$");
        boolean flag = false;
        int vencedores = 0;
        //TeleSena sorteio = tl[(int)(Math.random() * totalVendas)];
        int v1[] =  new int[60], t = 60,x1, sorteio[] = new int [60];
        
        for (int i = 0; i < 60; i++) { v1[i] = i+1;}
        
        for (int i = 0; i < 60; i++) {
                int aux = (int)(Math.random() * t); //auxiliar recebe random de 1 a t
                
                sorteio[i] = v1[aux]; //cartela 1 recebe posição de número random de v1
                
                
                x1 = v1[t-1]; // interpolação simples
                v1[t-1] = v1[aux]; // posição final troca com posição random
                v1[aux] = x1; // 
                
                
                
                t--; // reduz em 1 a posição que pode ser sorteada, se, por exemplo, no
                // primeiro ciclo poderia ser sorteado da posição 0 até 59, no segundo
                // só poderá ser sorteado da posição 0 até 58
                
            }
        
        int xy = 0;
        System.out.println("\nNúmeros sorteados:");
        while(vencedores == 0) {
            for (int i = 0; i < totalVendas; i++) {
                for (int j = 0; j < 25; j++) {
                    if (tl[i].cartela1[j] == sorteio[xy]) tl[i].count1++;
                    if (tl[i].cartela2[j] == sorteio[xy]) tl[i].count2++;
                //if (tl[j].cartela2[i] == 0 && tl[i].cartela1[j] == 0) break;
                    
                }
                
                if (tl[i].count1 == 25 || tl[i].count2 == 25) vencedores++;
            } 
            if (xy%5 == 0) System.out.print("\n");
                    System.out.print(String.format("%2d",sorteio[xy]) + " ");
                    Time.delay(1);
            xy++;
        }
        
        //No caso da mesma pessoa ganhar mais de uma vez.
        for (int i = 0; i < 20; i++) { int d = 0;
            for (int j  = 0; j < p[i].tl.length; j++) {
                if (p[i].tl[j] == null) break;
                if (p[i].tl[j].count1 == 25 || p[i].tl[j].count2 == 25) {
                    d++;
                    break;}
                } 
                if (d > 1) vencedores = vencedores - d + 1;
            }
        
        System.out.println("\n\nTotal de vencedores: " + vencedores + "\n");
        for (int i = 0; i < 20; i++) { 
            for (int j  = 0; j < p[i].tl.length; j++) {
                if (p[i].tl[j] == null) break;
                if (p[i].tl[j].count1 == 25 || p[i].tl[j].count2 == 25) {
                    System.out.println("Pessoa da posição " + i + " ganhou!");
                    break;}
                } 
                
            }
        double premio;
        
        
        
        premio = (0.8 * TeleSena.vtotal)/vencedores;
        System.out.println("\nPremiação: " + premio + "R$");
        
        
        
        
        System.out.println("\nSílvio Santos lucrou: " + (TeleSena.vtotal - TeleSena.vtotal*0.8) + "R$");
        
    } 
    
    public static TeleSena[] fazTeleSena () {
        int v1[] = new int[60];
        int v2[] = new int[60];
        int cartela1[] = new int[25];
        int cartela2[] = new int[25];
        
        int t = 60,x1,x2;
        
        TeleSena tl[] = new TeleSena[300];
        
        for (int i = 0; i < 60; i++) { v1[i] = i+1;}
        for (int i = 0; i < 60; i++) { v2[i] = i+1;}
        
        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 25; j++) {
                int aux = (int)(Math.random() * t); //auxiliar recebe random de 1 a t
                int aux2 = (int)(Math.random() * t);
                cartela1[j] = v1[aux]; //cartela 1 recebe posição de número random de v1
                cartela2[j] = v2[aux2];
                
                x1 = v1[t-1]; // interpolação simples
                v1[t-1] = v1[aux]; // posição final troca com posição random
                v1[aux] = x1; // 
                
                x2 = v2[t-1];
                v2[t-1] = v2[aux2];
                v2[aux2] = x2;
                
                t--; // reduz em 1 a posição que pode ser sorteada, se, por exemplo, no
                // primeiro ciclo poderia ser sorteado da posição 0 até 59, no segundo
                // só poderá ser sorteado da posição 0 até 58
                
            }
            t = 60;
            tl[i] = new TeleSena (cartela1,cartela2);
            cartela1 = new int [25];
            cartela2 = new int [25];
        }
        return tl;
    }
    
    public static TeleSena[] CompraTeleSena  (TeleSena[] tl,int x, int y) {
        TeleSena TeleCompra[] = new TeleSena[x];
        for (int i = 0; i < x; i++) {
            TeleCompra[i] = tl[i + y];
        }
        
        return TeleCompra;
    }
    
    /*public static TeleSena Sorteio () {
        int v1[] = new int[60];
        
        int cartela1[] = new int[25];
        
        
        int t = 60,x1;
        
        
        
        for (int i = 0; i < 60; i++) { v1[i] = i+1;}
        
        for (int j = 0; j < 25; j++) {
                int aux = (int)(Math.random() * t); //auxiliar recebe random de 1 a t
                
                cartela1[j] = v1[aux]; //cartela 1 recebe posição de número random de v1
                
                
                x1 = v1[t-1]; // interpolação simples
                v1[t-1] = v1[aux]; // posição final troca com posição random
                v1[aux] = x1; // 
                
                
                
                t--; // reduz em 1 a posição que pode ser sorteada, se, por exemplo, no
                // primeiro ciclo poderia ser sorteado da posição 0 até 59, no segundo
                // só poderá ser sorteado da posição 0 até 58
                
        }
        TeleSena tl = new TeleSena (cartela1,null);
        return tl;
    }*/    
}
