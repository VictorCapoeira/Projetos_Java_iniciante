
public class CachorroTeste {
    public static void main(String[] args) {
        Cachorro pipoca = new Cachorro();
        //criando objeto "pipoca" a parti de classe Cachorro
        pipoca.raca = "Lhasa";
        //atribuindo valor para o atribuito de raca
        pipoca.peso = 8;
        //atribuindo valor para o atribuito de peso
        
        
        Cachorro tob = new Cachorro();
        tob.raca = "Vira-Lata";
        tob.peso = 18;
        
        Cachorro pandora = new Cachorro();
        pandora.nome = "Pandora";
        pandora.cor = "Marrom";
        pandora.idade = 14;
        pandora.vacinado = true;
        pandora.raca = "Vira-Lata";
        pandora.peso = 5;
        
        
        Cachorro black = new Cachorro();
        black.nome = "Black";
        black.cor = "Preto";
        black.idade = 5;
        black.vacinado = false;
        black.raca = "pinscher";
        black.peso = 3;
        
        Cachorro taliba = new Cachorro();
        black.nome = "Taliba";
        black.cor = "Preto";
        black.idade = 7;
        black.vacinado = false;
        black.raca = "Galinha";
        black.peso = 2;
        
        
        Livro lorde = new Livro();
        lorde.titulo = "Lorde dos  Misterios";
        lorde.autor = "Uma lula que ama mergulhar";
        lorde.anoPublicacao = 2018;
        lorde.totpaginas = 10000;
        
        Livro isaac = new Livro();
        isaac.titulo = "Isaac";
        isaac.autor = "Nome coreano";
        isaac.anoPublicacao = 2018;
        isaac.totpaginas = 1500;
        
        Livro arcanista = new Livro();
        arcanista.titulo = "Trono do arcanista";
        arcanista.autor = "Uma lula que ama mergulhar";
        arcanista.anoPublicacao = 2013;
        arcanista.totpaginas = 3000;
        
         Livro monogatari = new Livro();
        monogatari.titulo = "Bakemonogatari";
        monogatari.autor = "Nissa Insonia";
        monogatari.anoPublicacao = 2008;
        monogatari.totpaginas = 4000;
        
        System.out.println(lorde.titulo);
        
    }
    
}
