package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Boletin9_2 {

   
    public static void main(String[] args) {
        int sum = 0;
    double prod = 1;
    for (int i= 10; i<=90; i++){
        sum = sum + i;
        prod = prod * i;
    }
    JOptionPane.showMessageDialog(null,"resultado de la suma: "+sum+"\nresultado del producto: "+prod);
    }
    
}
