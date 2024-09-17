public class Autor {
    private String nome;
    private String email;

        Autor(String n, String e){
            this.nome = n;
            this.email = e;
        }
        public String getNomeAutor() {
            return this.nome;
        }
        public String getEmail() {
            return this.email;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        
        void mostrasDetalhes(){
            System.out.println("Nome do autor: " + this.getNomeAutor());
            System.out.println("Email do autor: " + this.getEmail());
        }
    
    
        
        
}
