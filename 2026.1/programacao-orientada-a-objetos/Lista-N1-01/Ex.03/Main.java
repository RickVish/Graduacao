import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        Televisao televisao = new Televisao(); //Criacao do objeto

        int rep = 1;
        while (rep == 1) {
            //Menu de escolha de acao
            String temp = JOptionPane.showInputDialog("MENU DA TELEVISAO:\n" +
                    "1 - Ligar\n" +
                    "2 - Desligar\n" +
                    "3 - Aumentar canal\n" +
                    "4 - Diminuir canal\n" +
                    "5 - Aumentar volume\n" +
                    "6 - Diminuir volume\n" +
                    "7 - Sair"
            );

            int valor = Integer.parseInt(temp);
            switch (valor)
            {
                case 1:
                    televisao.ligar(); //Chama a funcao ligar
                    break;
                case 2:
                    televisao.desligar(); //Chama a funcao desligar
                    break;
                case 3:
                    televisao.aumentarCanal(); //Chama a funcao aumentarCanal
                    break;
                case 4:
                    televisao.diminuirCanal(); //Chama a funcao diminuirCanal
                    break;
                case 5:
                    televisao.aumentarVolume(); //Chama a funcao aumentarVolume
                    break;
                case 6:
                    televisao.diminuirVolume(); //Chama a funcao diminuirVolume
                    break;
                case 7:
                    rep = 0;
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Programa Finalizado.");
    }
}
