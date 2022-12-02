import javax.swing.JOptionPane;
public class exe4_zero {

    public static void main (String [] args){

        int num = 0;
        double positivos = 0;
        int total = 0;
        double media = 0;
        int pares = 0;
        int impares = 0;
        double soma = 0;
        double media_par =0;

        for(int repet = 1; repet != 0;){

            num++;
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor " + num + ":"));
            if(valor==0){
                repet = 0;
            }

            if(valor>0){
                total++;
                positivos += valor;
                media = positivos/total;

                if(valor % 2 == 0){
                    pares++;
                    soma += + valor;
                    media_par = soma/pares;    
                }
                else{
                    impares++;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "A quantidade de números positivos é de: " + pares + "\n" + "A quantidade de números ímpares é de: " + impares + "\n" + "A média de números pares é de: " + media_par + "\n" + "A média geral é de: " + media);

    }
    
}
