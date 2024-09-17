//]//
public class TestandoLivaria {

    
    public static void main(String[] args) {
        /*Autor lovecraft = new Autor("Lovrecraft Marcelo","lovrecaft@gmail.com");
        
        Livro cuculo = new Livro("cuculo","Livro de terror cosmico",100,"alfa",lovecraft);
        cuculo.mostrarDetalhes();
        cuculo.aplicaDescontoDe(100);
        cuculo.mostrarDetalhes();
        
        
        Livro hobbit = new Livro("Hobbit","Livro de fantasia medieval",40,"Omega",tolkien);
        hobbit.mostrarDetalhes();
        
        
        
        Livro memorias = new Livro("Memorias do subsolo","Livro de Ficção filosófica",35,"Beta",dostoievski);
        memorias.mostrarDetalhes();*/
        
        Autor dostoievski = new Autor("Fiodor Dostoievski","Dostoievski@gmail.com");
        Autor tolkien = new Autor("John Ronald Reuel Tolkien","Tolkien@gmail.com");

       
        Ebook memoriasE = new Ebook("VENDA EBOOk", "Memorias do subsolo EBOOK","Livro de Ficção filosófica",20,"Beta",dostoievski);
        memoriasE.mostrarDetalhes();
        memoriasE.aplicaDescontoDe(100);
        memoriasE.mostrarDetalhes();
        System.out.println(memoriasE.getWaterMark());
        
        LivroFisico hobbitF = new LivroFisico("Hobbit","Livro de fantasia medieval",40,"Omega",tolkien);
        hobbitF.mostrarDetalhes();
        hobbitF.getTaxaImpressao();
        hobbitF.mostrarDetalhes();
    }
    
}
