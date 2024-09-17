import javax.swing.JOptionPane;
public class UsandoJOption {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Meu primeiro programa gráfico!!" + "\n Obrigado, JAVA!!!");
        //comando para imprimir um texto na tela 
        //JOptionPane.showInternalConfirmDialog(null, "Aceitas a bufa?");
        String nome;
        nome = JOptionPane.showInputDialog("Informe o seu nome:");
        //comando usado para entrar com dados 
        JOptionPane.showMessageDialog(null," Olá, " + nome + " :)" + "\n Seja bem vindo(a)!!");
    }
    
}
