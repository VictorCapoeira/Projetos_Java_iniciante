
public class CarroTeste {

  
    public static void main(String[] args) {
        Carro linea = new Carro();
        linea.fabricante = "Fiat";
        linea.modelo = "Linea";
        linea.ano = 2010;
        linea.cor = "Cinza";
        
        Carro focus = new Carro();
        focus.fabricante = "Ford";
        focus.modelo = "Focus";
        focus.ano = 2008;
        focus.cor = "Cinza";
        
        Carro marea = new Carro();
        marea.fabricante = "Fiat";
        marea.modelo = "Marea";
        marea.ano = 2007;
        marea.cor = "Preto";
        
        linea.verCarro();
        System.out.println("--------------###########------------");
        focus.verCarro();
        System.out.println("--------------###########------------");
        marea.verCarro();
        
        marea.desligarCarro();

    }
    
}
