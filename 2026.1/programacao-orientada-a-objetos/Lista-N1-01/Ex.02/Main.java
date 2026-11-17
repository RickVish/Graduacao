/*
02 – Criar uma classe Barco

Criar um objeto a partir da classe barco
Use os seguintes atributos
- Andando
- Velocidade
- AncoraGuardada*(O barco somente pode andar e ter velocidade > 0 se a ancora estiver
guardada)
Realizar métodos do barco:
        - Entrar em movimento: parado && AncoraGuardada (true)
- Parar : andando=true
        - Acelerar: não pode Ancora modo False
- Desacelerar:
        - Descer ancora
- Subir ancora
*/

import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int valor, rep = 1;

        Barco barco = new Barco();

        while (rep == 1) {
            //Menu de escolha
            String temp = JOptionPane.showInputDialog("Escolha a opcao desejada:\n" +
                    "1 - Movimentar\n" +
                    "2 - Acelerar\n" +
                    "3 - Desacelerar\n" +
                    "4 - Parar\n" +
                    "5 - Descer Ancora\n" +
                    "6 - Subir Ancora" +
                    "7 - Sair"
            );

            valor = Integer.parseInt(temp); //Converte o valor de entrada para int

            switch (valor) {
                case 1:
                    barco.movimentar(); //Chama a funcao movimentar
                    break;
                case 2:
                    barco.acelerar(); //Chama a funcao acelerar
                    break;
                case 3:
                    barco.desacelerar(); //Chama a funcao desacelerar
                    break;
                case 4:
                    barco.parar(); //Chama a funcao parar
                    break;
                case 5:
                    barco.descerAncora(); //Chama a funcao descerAncora
                    break;
                case 6:
                    barco.subirAncora(); //Chama a funcao subirAncora
                    break;
                case 7:
                    rep = 0; //Encerra o programa
                    break;
            }
        }
    }
}
