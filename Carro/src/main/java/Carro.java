public class Carro {
    //criando classe publica 
    int ano;
    // criando atributo do tipo inteiro
    String cor;
    // criando atributo do tipo String
    String fabricante;
    // criando atributo do tipo String
    String modelo;
    // criando atributo do tipo String
    
    public void desligarCarro(){
        //criando metodo(função), e definindo void como metodo de exeucção
        System.out.println("O carro foi desligado!");
    }
    void verCarro(){
        //perceba que "public" não é necessario na hora de criar um metodo
        System.out.println("Carro: " + modelo + " | Ano: " + ano);
        //exibindo dados na tela
        System.out.println("Cor: " + this.cor);
        //exibindo dados na tela
        System.out.println("Fabricante: " + this.fabricante);
        //exibindo dados na tela
        //usando this, é mais especifico na direção do atributo 
    }
    
}
