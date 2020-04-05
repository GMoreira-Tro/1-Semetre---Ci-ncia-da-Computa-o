
/**
 * Escreva a descrição da classe Exerciciols aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Exercicios
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    

    /**
     * COnstrutor para objetos da classe Exerciciols
     */
    public Exercicios()
    {
        // inicializa variáveis de instância
        
    }

    public double[] leNotas (int q) {
        double notas[] = new double[q];
        for (int i = 0; i < q; i++) {
            notas[i] = Teclado.leDouble("Digite a " + (i+1) + "ª notas: ");
        }
        return notas;
    }
    
    public int soma (int[] v) { int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }
    
    public boolean procuraNome (String[] arrayNome, String nome) {
        for (int i = 0; i < arrayNome.length; i++) {
            if (arrayNome[i].equals(nome)) return true; 
        }
        return false;
    }
    
    public int[] somaArrays (int[] v1, int[] v2) {
        if (v1.length != v2.length) {
            System.out.println ("Erro. Array de  tamanhos diferentes");
            return null;
        }
        
        else {
            int v3[] = new int[v1.length];
            for (int i = 0; i < v1.length; i++) {
                v3[i] = v1[i] + v2[i];
            }
            return v3;
        }    
    }
    
    public double encontraMaior ( double[] v) {
        double m = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > m) m = v[i];
        }
        return m;
    } 
    
    public double encontraMenor ( double[] v) {
        double m = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < m) m = v[i];
        }
        return m;
    }
    
    public void arrayAleatorio () {
        int[] array = new int[(int)(Math.random()*100 + 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 1000 + 1);
        }
        
        System.out.println ("Tamanho do array: " + array.length + "\n");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print (array[i] + " - ");
        }
        System.out.println (array[array.length - 1]);
    }
    
    public int[] criaArray () {
        int[] array = new int[(int)(Math.random()*100 + 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 1000 + 1);
        }
        return array;
    }
}
