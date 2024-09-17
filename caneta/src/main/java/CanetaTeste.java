public class CanetaTeste {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Fabel Castel", 0.5f);
            c1.setMarca("Bic");
            c1.setPonta(0.5f);
            c1.setCor("Azul");
            
            c1.status();
            
            //System.out.println("A marca da caneta eh:" + c1.getMarca());
            
            Caneta c2 = new Caneta("Fabel Castel", 0.5f);
            c2.status();
            
        
    }
    
    
}
