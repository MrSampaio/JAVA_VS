import javax.swing.JOptionPane;
public class exe3_calculos {
    
    public static void main(String [] args){

        int quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos valores serão calculados: "));
        int num = 0;
        double media = 0;
        int quant_geral = 0;
        double soma = 0;
        int quant_pos = 0;
        int quant_neg = 0;
        double porcent_pos = 0;
        double porcent_neg = 0;
        double valor = 0;


        for( int repet = 0; repet<=quant-1; repet++){
            num++;

            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor " + num + ":"));
            
            quant_geral++;
            
            soma += + valor;
            media = soma/quant_geral;

            if(valor<0){
                quant_neg++;
            }
            else{
                quant_pos++;
            }

            porcent_pos = 100*quant_pos/quant_geral; 
            porcent_neg = 100*quant_neg/quant_geral;

        }
        JOptionPane.showMessageDialog(null, "A média dos valores é de: " + media + "\n" + "A quantidade de valores positivos é de: " + quant_pos + "\n" + "A quantidade de valores negativos é de: " + quant_neg + "\n" + "A porcentagem de valores positivos é de: " + porcent_pos + "%" + "\n" + "A porcentagem de valores negativos é de: " + porcent_neg + "%");




    }
}
