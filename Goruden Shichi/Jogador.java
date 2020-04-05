
/**
 * Escreva a descrição da classe Jogador aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Jogador
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private int idade;
    private Carta carta = new Carta (null,0);
    private int tries;
    /**
     * COnstrutor para objetos da classe Jogador
     */
    public Jogador(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
        //this.carta = null;
        this.tries = 0;
    }
    
    public String getNome (){
        return this.nome;
    } 
    
    public int getIdade (){
        return this.idade;
    } 
    
    public Carta getCarta (){
        return this.carta;
    } 
    
    public int getTries (){
        return this.tries;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public void setTries (int tries) {
        this.tries = tries;
    }
    
    public void pegaCarta () {
        this.carta.setN((int)(Math.random() * 13 + 1));
        int x = (int)(Math.random() * 4 + 1);
        if (x == 1) this.carta.setNaipe("♥");
        else if (x == 2) this.carta.setNaipe("♦");
        else if (x == 3) this.carta.setNaipe("♣");
        else if (x == 4) this.carta.setNaipe ("♠");
    }
    
    public String imprimeCarta () {
        if (carta != null)
        return "Naipe: " + carta.getNaipe() + "\nNúmero: " + carta.getN();
        else return "Carta inválida";
    }
    
    public void info() {
        System.out.println ("Nome: " + this.nome + "\nIdade: " + this.idade + "\n");
    }    
}
