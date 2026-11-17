Main.java

/*
01 – Criar uma classe Aviao
Criar um objeto a partir da classe aviao
Use os seguintes atributos
- Altitude
- Voando
Realizar métodos do avião
- Decolar
- Aterrissar
- Subir
- Descer
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        Aviao av1 = new Aviao();

        int rep = 1;
        while (rep == 1) {
            //Menu de escolha
            String temp = JOptionPane.showInputDialog("Escolha a opcao desejada:\n" +
                    "1 - Decolar\n" +
                    "2 - Aterrissar\n" +
                    "3 - Subir\n" +
                    "4 - Descer\n" +
                    "5 - Sair\n"
            );

            int valor = Integer.parseInt(temp); //Converte o valor de entrada para int

            switch (valor) {
                case 1:
                    av1.decolar(); //Chama a funcao decolar
                    break;
                case 2:
                    av1.aterrissar(); //Chama a funcao aterrisar
                    break;
                case 3:
                    av1.subir(); //Chama a funcao subir
                    break;
                case 4:
                    av1.descer(); //Chama a funcao descer
                    break;
                case 5:
                    rep = 0; //Encerra o programa
                    break;
            }
        }
    }
}

Aviao.java

import javax.swing.*;
import java.util.Scanner;

public class Aviao
{
    //Atributos do aviao

    int altitude=0;
    boolean voando=false;

    //Metodos do aviao

    public void decolar()
    {
        voando = true;
        JOptionPane.showMessageDialog(null,"Aviao decolou.");
    }

    public void aterrissar()
    {
        voando = false;
        JOptionPane.showMessageDialog(null,"Aviao aterrissou.");
    }

    public void subir()
    {
        altitude += Integer.parseInt(JOptionPane.showInputDialog("O aviao subiu " +
                "quantos metros?"));
        JOptionPane.showMessageDialog(null,"O aviao subiu " + altitude +" metros.");
    }

    public void descer()
    {
        altitude += Integer.parseInt(JOptionPane.showInputDialog("O aviao desceu " +
                "quantos metros?"));
        JOptionPane.showMessageDialog(null,"O aviao desceu " + altitude +" metros.");
    }
}
