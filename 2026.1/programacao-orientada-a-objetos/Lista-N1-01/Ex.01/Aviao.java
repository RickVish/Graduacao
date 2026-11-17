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
