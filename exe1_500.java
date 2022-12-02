import javax.swing.JOptionPane;
public class exe1_500 {

    public static void main (String [] args){

        int num = 0;
        double result = 0;
        int soma = 0;

        for(int repet = 0; repet<=499; repet++){
            num++;

            result = num/3;

            if((int) result == result){
                if(result % 2 != 0){
                    soma+= + result;

                }
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);

        


    }
    
}
