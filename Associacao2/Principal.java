public class Principal
{
    public static void main(String[] args)
    {
        Pessoa pessoinha = new Pessoa("Maria", 23);
        Pessoa pessoinha2 = new Pessoa("Jim Carrey", 50);
        Pessoa outraPessoinha = new Pessoa("Lauren Holly", 80);
        
        
        Animal animalzinho = new Animal("Gato", "Garfield");
        Animal bichinho = new Animal("Coruja", "Edwiges");
        
        pessoinha.setBichoEstimacao(bichinho);
        
        pessoinha2.setBichoEstimacao(animalzinho);
        outraPessoinha.setBichoEstimacao(animalzinho);
        
        
        System.out.println("animalzinho: " + animalzinho);
        System.out.println("bichinho: " + bichinho);
        
        System.out.println("pessoinha: " + pessoinha);
        System.out.println("\t" + pessoinha + " eh dono(a) do(a) " + pessoinha.getBichoEstimacao());
        System.out.println("pessoinha2: " + pessoinha2);
        System.out.println("\t" + pessoinha2 + " eh dono(a) do(a) " + pessoinha2.getBichoEstimacao());
        System.out.println("outraPessoinha: " + outraPessoinha);
        System.out.println("\t" + outraPessoinha + " eh dono(a) do(a) " + outraPessoinha.getBichoEstimacao());
        
        
        
    }
}
