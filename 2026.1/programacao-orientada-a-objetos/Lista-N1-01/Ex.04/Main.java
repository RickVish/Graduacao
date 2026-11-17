import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();

        pessoa.cadastro(); //Chama a funcao cadastro

        int rep = 1;
        while (rep == 1) {
            //Gera o menu de escolha
            String temp = JOptionPane.showInputDialog("Entre com a opcao desejada?\n" +
                    "1 - Sapataria\n" +
                    "2 - Treinador\n" +
                    "3 - Medico\n" +
                    "4 - Alfaiate\n" +
                    "5 - Faculdade\n" +
                    "6 - Finalizar programa.");

            int valor = Integer.parseInt(temp); //Converte valor da escolha para int

            switch (valor) {
                case 1:
                    pessoa.sapataria(); //Chama a funcao sapataria
                    break;
                case 2:
                    pessoa.treinador(); //Chama a funcao treinador
                    break;
                case 3:
                    pessoa.medico(); //Chama a funcao medico
                    break;
                case 4:
                    pessoa.alfaiate(); //Chama a funcao alfaiate
                    break; 
                case 5:
                    pessoa.faculdade(); //Chama a funcao faculdade
                    break;
                case 6:
                    rep = 0; //Encerra o programa
                    break;
            }
        }
    }
}
