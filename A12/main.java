
/**
 * Escreva a descrição da classe main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class main
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    

    /**
     * COnstrutor para objetos da classe main
     */
    public  static void main(String[] args)
    {   Exercicios ex = new Exercicios();
        
        int x = Teclado.leInt ("Digite a quantidade de notas:");
       // inicializa variáveis de instância        
       double vetor[] = new double[x];
       vetor = ex.leNotas(x);
       
       System.out.println ("Notas:");
       for (int i = 0; i < vetor.length; i++){
           System.out.println ((i+1) + "ª nota: " + vetor[i]);
       }
       
       int arr[] = new int[100];
       arr = ex.criaArray();
       
       System.out.println("Exercício 2 - resultado da soma: " + ex.soma(arr) +"\nArray mandado:");
       for (int i = 0; i < arr.length; i++) {
           System.out.println ((i+1) + "º valor: " + arr[i]);
       }
       System.out.print("\n");
       String[] nomes = new String[5];
       for (int i = 0; i < 5; i++) {
           nomes[i] = Teclado.leString ("Preencha o array de nomes: ");
       }
       
       System.out.println(ex.procuraNome (nomes,Teclado.leString("Diz um nome pra ver se tem:")));
       int arr2[] = new int [100];
       arr2 = ex.criaArray();
       System.out.print("\nAgora vai ser criado o array do exercício 4:\n");
       int arr3[] = new int[100];
       arr3 = ex.somaArrays (arr, arr2);
       if (arr3 != null) {
           for (int i = 0; i < arr3.length; i++) {
               System.out.println((i+1) +"ª posição: " + arr3[i]);
            }    
       }
       
       System.out.println ("\nVou mandar o array de notas e achar o maior e o menor valor");
       System.out.println ("Maior nota: " + ex.encontraMaior(vetor));
       System.out.println ("Maior nota: " + ex.encontraMenor(vetor));
       
       System.out.println("\nAgora vem o array random do exercício 7");
       ex.arrayAleatorio();
    }

    
}
