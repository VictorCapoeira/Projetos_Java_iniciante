
public class Conta {
    private String cliente;
    private double saldo;
    
    void exibeSaldo(){
        System.out.printf("O saldo na conta: %.2f", this.saldo);
    }
    void saca(double valorSaca){
        this.saldo -= valorSaca;
    }
    void deposita(double valordepo){
        this.saldo += valordepo;
    }
    void transferePara(Conta destino, double valortrans){
        this.saca(valortrans);
        destino.deposita(valortrans);
    }
}
