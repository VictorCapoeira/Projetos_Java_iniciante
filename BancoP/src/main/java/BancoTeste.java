
public class BancoTeste {

    public static void main(String[] args) {
       Conta isaac = new Conta();
       isaac.cliente = "Isaac";
       isaac.saldo = 2500;
       
       /*isaac.exibeSaldo();
       System.out.println("\n-------####-------\n");
       isaac.saca(500);
       isaac.exibeSaldo();
       System.out.println("\n-------####-------\n");
       isaac.deposita(1000);
       isaac.exibeSaldo();
       System.out.println("\n-------####-------\n");*/
       
       Conta lucas = new Conta();
       lucas.saldo = 500;
       lucas.exibeSaldo();
       isaac.transferePara(lucas,700 );
       lucas.exibeSaldo();
       isaac.exibeSaldo();
    }
    
}
