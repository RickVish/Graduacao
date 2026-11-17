import javax.swing.*;

public class Pessoa
{
    //Atributos da classe
     int idade, numSapato;
     long cpf, rg;
     String nome;
     char sexo, tamCamisa;
     double altura, peso, velMax;

     public void cadastro() {
         //Criando campos de texto
         JTextField nomeField = new JTextField();
         JTextField idadeField = new JTextField();
         JTextField cpfField = new JTextField();
         JTextField rgField = new JTextField();
         JTextField sexoField = new JTextField();
         JTextField alturaField = new JTextField();
         JTextField pesoField = new JTextField();
         JTextField numSapatoField = new JTextField();
         JTextField tamCamisaField = new JTextField();
         JTextField velMaxField = new JTextField();

         //Array para preenchimento dos dados
         Object[] dados =
                 {
                         "Nome: ", nomeField,
                         "Idade: ", idadeField,
                         "CPF: ", cpfField,
                         "RG: ", rgField,
                         "Sexo: ", sexoField,
                         "Altura: ", alturaField,
                         "Peso: ", pesoField,
                         "Num. Sapato: ", numSapatoField,
                         "Tam. Camisa: ", tamCamisaField,
                         "Vel. Maxima: ", velMaxField
                 };

         int janela = JOptionPane.showConfirmDialog(null, dados, "Cadastre o Usuario:",
                 JOptionPane.OK_CANCEL_OPTION); //Gera a janela para inserir dados

         if (janela == JOptionPane.OK_OPTION) //Atribui os valores inseridos para variaveis
         {
             this.nome = nomeField.getText();
             this.idade = Integer.parseInt(idadeField.getText());
             this.cpf = Long.parseLong(cpfField.getText());
             this.rg = Long.parseLong(rgField.getText());
             this.sexo = sexoField.getText().charAt(0);
             this.altura = Double.parseDouble(alturaField.getText());
             this.peso = Double.parseDouble(pesoField.getText());
             this.numSapato = Integer.parseInt(numSapatoField.getText());;
             this.tamCamisa = tamCamisaField.getText().charAt(0);
             this.velMax = Double.parseDouble(velMaxField.getText());

             JOptionPane.showMessageDialog(null, "Dados salvos");
         }
     }

     public void sapataria () //Mostra na tela as informacoes para o sapateiro.
     {
         JOptionPane.showMessageDialog(null,
                 "Nome: "+ this.nome + "\n" +
                         "Tamanho do Sapato: " + this.numSapato + "\n");
     }

    public void treinador () //Mostra na tela as informacoes para o treinador.
    {
        JOptionPane.showMessageDialog(null,
                String.format(
                "Nome: %s\n" +
                "Idade: %d\n" +
                "Sexo: %c\n" +
                "Altura: %.2f\n" +
                "Peso: %.2f\n" +
                "velMax: %.2f\n",
                this.nome, this.idade, this.sexo, this.altura, this.peso, this.velMax));
    }

    public void medico () //Mostra na tela as informacoes para o medico.
    {

        JOptionPane.showMessageDialog(null,
        String.format(
                "Nome: %s\n" +
                "Idade: %d\n" +
                "CPF: %d\n" +
                "RG: %d\n" +
                "Sexo: %c\n" +
                "Altura: %.2f\n" +
                "Peso: %.2f\n",
                this.nome, this.idade, this.cpf, this.rg, this.sexo, this.altura, this.peso));
    }

    public void alfaiate () //Mostra na tela as informacoes para o alfaiate
    {
        JOptionPane.showMessageDialog(null,
        String.format(
                "Nome: %s\n" +
                "Tamanho da Camisa: %c\n",
                this.nome, this.tamCamisa));
    }

    public void faculdade () //Mostra na tela as informacoes para a faculdade.
    {
        JOptionPane.showMessageDialog(null,
                "Nome: "+ this.nome + "\n" +
                "Idade: "+ this.idade + "\n" +
                "CPF: "+ this.cpf + "\n" +
                "RG: "+ this.rg + "\n" +
                "Sexo: "+ this.sexo + "\n");
    }
}
