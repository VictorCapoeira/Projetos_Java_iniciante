
public class Caneta {
    private boolean tinta;
    private boolean tampa;
    private String cor;
    private String marca;
    private float ponta;
//METODO CONSTRUTOR METODO CONSTRUTOR METODO CONSTRUTOR METODO CONSTRUTOR METODO CONSTRUTOR 
        public Caneta(String m, float p){
            this.marca = m;
            this.ponta = p;
            //this.tampa = true; ou
            this.tampar();
        }
//METODO CONSTRUTOR METODO CONSTRUTOR METODO CONSTRUTOR METODO CONSTRUTOR METODO CONSTRUTOR 
//METODOS GET METODOS GET METODOS GET METODOS GET METODOS GET METODOS GET 
        /*boolean getTinta(){
            return this.tinta;
        }
        boolean getTampa(){
            return this.tampa;
            //Usando os metodos "getters" podemos resgastar os dados do atritubo;
        }
        String getCor(){
            return this.cor;
        }
        String getMarca(){
            return this.marca;
        }
        float getPonta(){
            return this.ponta;
        }
//METODOS GET METODOS GET  METODOS GET  METODOS GET  METODOS GET  METODOS GET  
//METODOS SET METODOS SET METODOS SET  METODOS SET  METODOS SET  METODOS SET 
        void setTinta(boolean ti){
            this.tinta = ti;
        }
        void setTampa(boolean t){
            this.tampa = t;
            //Usando os metodos "setters" podemos manipular os daddos do atributo;
        }
        void setCor(String c){
            this.cor = c;
        }
        void setMarca(String m){
            this.marca = m;
        }
        void setPonta(float p){
            this.ponta = p;
        }
//METODOS SET METODOS SET METODOS SET  METODOS SET  METODOS SET  METODOS SET 
    */
        
        void escrever(){
            if( this.tinta == true && this.tampa == false){
                System.out.println("Escrevendo!");
            }else{
                System.out.println("Caneta esta tampada ou sem tinta");
            }
        }
        void tampar(){
            if(this.tampa == false){
                this.setTampa(true);
            }
        }
        void destampar(){
            if(this.tampa  == true){
                this.setTampa(false);
            }
        }

        void status(){
            System.out.println("\nMarca " + this.getMarca());
            System.out.println("\nCor " + this.getCor());
            System.out.println("\nPonta " + this.getPonta());
            System.out.println("\nTampada " + this.getTampa());
            System.out.println("---------*********---------------");
        }

    /**
     * @return the tinta
     */
    public boolean isTinta() {
        return tinta;
    }

    /**
     * @param tinta the tinta to set
     */
    public void setTinta(boolean tinta) {
        this.tinta = tinta;
    }

    /**
     * @return the tampa
     */
    public boolean getTampa() {
        return tampa;
    }

    /**
     * @param tampa the tampa to set
     */
    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ponta
     */
    public float getPonta() {
        return ponta;
    }

    /**
     * @param ponta the ponta to set
     */
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
}
