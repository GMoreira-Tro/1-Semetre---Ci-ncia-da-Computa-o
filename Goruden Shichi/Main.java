
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Main
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    

    /**
     * COnstrutor para objetos da classe Main
     */
    public static void main(String[] args)
    {
        // inicializa variáveis de instância
        String nome;
        int idade;
        int tries = 0;
        Jogador p1 = new Jogador(Teclado.leString("Nome do player 1: "), Teclado.leInt("Idade do player 1: "));
        while (p1.getIdade() < 0) p1.setIdade(Teclado.leInt("Idade do player 1: "));
        
        nome = Teclado.leString ("Nome do player 2: ");
        while (nome.equals(p1.getNome())) nome = Teclado.leString ("Nome do player 2: ");
        idade = Teclado.leInt ("Idade do player 2: ");
        while (idade < 0) idade = Teclado.leInt ("Idade do player 2: ");
        Jogador p2 = new Jogador (nome, idade);
        
        nome = Teclado.leString ("Nome do player 3: ");
        while (nome.equals(p1.getNome()) || nome.equals(p2.getNome())) nome = Teclado.leString("Nome do player 3: ");
        idade = Teclado.leInt ("Idade do player 3: ");
        while (idade < 0) idade = Teclado.leInt ("\nIdade do player 3: ");
        Jogador p3 = new Jogador (nome, idade);
        
        System.out.println("\nJogador 1 joga:");
        do{
           p1.pegaCarta();
           System.out.println(p1.getCarta().imprimeInfo());
           tries++;
        }  while (p1.getCarta().getN() != 7 || !(p1.getCarta().getNaipe().equals("♦")));
        p1.setTries (tries);
        tries = 0;
        System.out.println("Tentativas do jogador 1: " + p1.getTries() + "\n");
        
        System.out.println("\nJogador 2 joga:");
        do{
           p2.pegaCarta();
           System.out.println(p2.getCarta().imprimeInfo());
           tries++;
        }  while (p2.getCarta().getN() != 7 || !(p2.getCarta().getNaipe().equals( "♦")));
        p2.setTries (tries);
        tries = 0 ;
        System.out.println("Tentativas do jogador 2: " + p2.getTries() + "\n");
        
        System.out.println("\nJogador 3 joga:");
        do{
           p3.pegaCarta();
           System.out.println(p3.getCarta().imprimeInfo());
           tries++;
        }  while (p3.getCarta().getN() != 7 || !(p3.getCarta().getNaipe().equals("♦")));
        p3.setTries (tries);
        System.out.println("Tentativas do jogador 3: " + p3.getTries() + "\n");
        System.out.println("\n");
        if (p1.getTries() == p2.getTries() && p1.getTries() == p3.getTries()) {
            System.out.println ("Empate entre todos os jogadores! (" + p1.getTries() + ") tentativas\n\n");
            p1.info();
            p2.info();
            p3.info();
        }
        
        else if (p1.getTries() == p2.getTries() && p1.getTries() < p3.getTries()) {
            System.out.println ("Jogadores 1 e 2 venceram! (" + p1.getTries() + ") tentativas\n\n");
            p1.info();
            p2.info();
            
        }
        
        else if (p2.getTries() == p3.getTries() && p2.getTries() < p1.getTries()) {
            System.out.println ("Jogadores 2 e 3 venceram! (" + p2.getTries() + ") tentativas\n\n");
            
            p2.info();
            p3.info();
        }
        
        else if (p3.getTries() == p1.getTries() && p1.getTries() < p2.getTries()) {
            System.out.println ("Jogadores 1 e 3 venceram! (" + p1.getTries() + ") tentativas\n\n");
            
            p1.info();
            p3.info();
        }
        
        else if (p2.getTries() < p1.getTries() && p2.getTries() < p3.getTries()) {
            System.out.println ("Jogador 2 venceu! (" + p2.getTries() + ") tentativas\n\n");
            
            p2.info();
            
        }
        
        else if (p3.getTries() < p1.getTries()) {
            System.out.println ("Jogador 3 venceu! (" + p3.getTries() + ") tentativas\n\n");
            
            
            p3.info();
        }
        
        else {
            System.out.println ("Jogador 1 venceu! (" + p1.getTries() + ") tentativas\n\n");
            
            p1.info();
            
        }
    }

    
}
