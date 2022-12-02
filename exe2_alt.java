import javax.swing.JOptionPane;
public class exe2_alt {

    public static void main (String [] args){


        double maior = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura 1: "));
       
        double menor = 0;
        int num_alt = 1;

        for(int repet = 0; repet<=13; repet++){
            num_alt++;

            double alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura " + num_alt + ":"));

            if(alt>maior){
                maior = alt;
            }
            else{
                menor = alt;
            }
        }

        JOptionPane.showMessageDialog(null, "A maior altura é: " + maior + "\n" + "A menor altura é: " + menor);
    }
    
}
