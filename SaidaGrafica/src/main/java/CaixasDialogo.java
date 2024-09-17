import javax.swing.JOptionPane;
public class CaixasDialogo {
    public static void main(String[] args) {
       String nome;
       int reposta;
       
       nome = JOptionPane.showInputDialog("Qual o seu nome?");
       reposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
       if(reposta == 0){
           JOptionPane.showMessageDialog(null, "Olá " + nome + "!!");
       }
       else if(reposta == 1){
           JOptionPane.showMessageDialog(null, "Você não é o (a) " + nome + "??");
       }
       else{
           JOptionPane.showMessageDialog(null, "Porque você cancelou?");
           
       }
    }
    
}
