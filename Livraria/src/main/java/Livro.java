
public abstract class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private String autor;

        Livro(String n,String d,double v,String i,Autor a){
            this.nome = n;
            this.descricao = d;
            this.valor = v;
            this.isbn = i;
            this.autor = a.getNomeAutor();
        }
        
        void mostrarDetalhes(){
                System.out.println("Titulo: " + this.getNome());
                System.out.println("Descricao: " + this.getDescricao());
                System.out.printf("Valor: %.2f" , this.getValor());
                System.out.println("");
                System.out.println("ISBN: " + this.getIsbn());
                System.out.println("Autor: " + this.getAutor());
            }
        void aplicaDescontoDe(double porcentagem){
            if(porcentagem > 30){
                porcentagem = 30;
                this.valor = this.valor - (this.valor * porcentagem/100);
            }
            else{
                this.valor = this.valor - (this.valor * porcentagem/100);
            }
        }
        public String getNome() {
            return nome;
        }
        public String getDescricao() {
            return descricao;
        }
        public double getValor() {
            return valor;
        }
        public String getIsbn() {
            return isbn;
        }
        public String getAutor() {
            return autor;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        public void setValor(double valor) {
            this.valor = valor;
        }
        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }

            

    
        
}
