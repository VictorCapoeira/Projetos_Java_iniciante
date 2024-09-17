import java.util.Scanner;
public class Conversao {
    String nome;
    String profissao;
    double idade;
    Scanner teclado = new Scanner(System.in);
    
    void setValores(String n, double i, String p){
        nome = n;
        idade = i;
        profissao = p;
        this.setIdade(idade);
    }
    void setIdade(double idadeSet){
        if(idadeSet % 2 == 0 || idadeSet % 2 == 1){
            idade = idadeSet;
        }
        else{
            System.out.println("Digite um numero valido!");
        }
    }
    void verDados(){
        System.out.println("\nNome: " + nome);
        System.out.println("\nIdade: " + idade);
        System.out.println("\nProfissao: " + profissao);
    }
    void envelhece(){
        idade++;
    }

}
