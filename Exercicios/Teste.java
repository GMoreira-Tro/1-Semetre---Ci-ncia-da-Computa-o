
/**
 * Escreva a descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Teste
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio

    /**
     * COnstrutor para objetos da classe Teste
     */
    public static void main (String args[])
    {
        String nome;
        String categoria;
        String historico;
        double mensalidade;
        int ano;
        int socios;// inicializa variáveis de instância
        
        nome = Teclado.leString ("Digite o nome do time 1: ");
        categoria = Teclado.leString ("Digite a categoria do time 1: ");
        Time time1 = new Time (nome,categoria);
        Time time2 = new Time ();
        time2.setNome ("Ulbra");
        time2.setCategoria ("Vôlei");
        
        do{
        time1.setSocios (Teclado.leInt("Digite o número de sócios do time 1: "));
        }  while (time1.getSocios() < 0);
        
        time1.setHistorico (Teclado.leDouble("Digite o histórico do time 1: "));
        
        do {
            time1.setAno (Teclado.leInt ("Digite o ano de criação do time 1: "));
        } while (time1.getAno() < 0 || time1.calculaIdade(2019) < 0);
        
        Torcedor torcedor = new Torcedor ("Vandressa", "Feminino", 27);
        Torcedor torce2 = new Torcedor ();
        torce2.setNome ("Ribelton Cruz");
        torce2.setSexo ("Masculino");
        torcedor.setTime(time1);
        torce2.setTime(time2);
        if (time1.calculaIdade(2019) <= 100) {
        time1.contagemRegressiva(2019);
        System.out.println (" do time: " + time1.getNome() +".");
        } else System.out.println ("O time '" + time1.getNome() + "' tem 100 anos ou mais");
        System.out.println ("\nA idade do time " + "'" + time2.getNome() + "' é: " + time2.calculaIdade(2019) + " anos."); 
        System.out.println ("\nReceita do time de Ribelton: " + torcedor.getTime().calculaReceita() + "\n");
        
        // 7 - q,r,s
        Torcedor Andoreha = new Torcedor("André",32);
        Torcedor outro_cara = new Torcedor ("Richeli", 22);
        Torcedor Pedrao = new Torcedor ("Petrúcio", 54);
        Time timao = new Time ("São José", "Basquete");
        Andoreha.setTime (timao);
        outro_cara.setTime (timao);
        Pedrao.setTime (timao);
        outro_cara.setNome ("Rochele");
        Andoreha.imprimeTime();
        outro_cara.imprimeTime();
        Pedrao.imprimeTime();
    }
}
