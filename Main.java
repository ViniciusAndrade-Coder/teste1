//teste 
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int i;
        double media, soma;
        double numero[] = new double[20];

        for (i = 0; i < 20; i++) {
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número: "+ i));

        }
        
        soma = 0;
        for( i = 0; i< 20; i++){
        soma = soma + numero[i];
        }
        media = soma / 20;
        JOptionPane.showMessageDialog(null, "A soma é igual a: " + soma + "e a média artimética é igual a: " + media);

    }
}
