
public class LivroFisico extends Livro{

    public LivroFisico(String n, String d, double v, String i, Autor a) {
        super(n, d, v, i, a);
    }
    
    public void getTaxaImpressao(){
        double valorTaxa = getValor();
        valorTaxa = valorTaxa + (valorTaxa * 5/100);
        setValor(valorTaxa);
    }
}
