
public class Ebook extends Livro{
    private String waterMark;

    public Ebook(String waterMark, String n, String d, double v, String i, Autor a) {
        super(n, d, v, i, a);
        this.waterMark = waterMark;
    }
    //@Override é usado para que metodos possam ser sobrecritos 
    @Override
    void aplicaDescontoDe(double porcentagem){
            double valorEbook = getValor();
            if(porcentagem > 15){
                porcentagem = 15;
                valorEbook = valorEbook - (valorEbook * porcentagem/100);
            }
            else{
                valorEbook = valorEbook - (valorEbook * porcentagem/100);
            }
            setValor(valorEbook);

        }
    
    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    
}
