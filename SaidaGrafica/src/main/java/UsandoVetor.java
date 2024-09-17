import javax.swing.JOptionPane;
public class UsandoVetor {
    public static void main(String[] args) {
        int idade[] = new int[6];
        int somaIdade = 0;
        
        for(int i = 0 ; i < 6; i++){
        String aux = JOptionPane.showInputDialog(null, "Digite a idade" + (i+1));
        idade[i] = Integer.parseInt(aux);
        somaIdade = somaIdade + idade[i];
    }
    double media = somaIdade/6.0;
    
    JOptionPane.showMessageDialog(null, "A média das idades é: " + media);
    }
    
}
