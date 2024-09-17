import javax.swing.JOptionPane;
public class TransformaString {

   
    public static void main(String[] args) {
        String valor, resultado;
        
        valor = JOptionPane.showInputDialog("Informe o primeiro número:");
        int num1 = Integer.parseInt(valor);
        
        valor = JOptionPane.showInputDialog("Informe o segundo número");
        int num2 = Integer.parseInt(valor);
        
        resultado = String.format("Resultado: %d", num1 + num2);
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
