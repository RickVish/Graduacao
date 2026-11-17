/*
03 – Criar uma classe Televisao
Criar um objeto a partir da classe televisao
Use os seguintes atributos
- Ligada
- Volume*(Não existe volume negativo)
- Canal*(não existe canal negativo)
1
Realizar métodos da televisão
- Ligar
- Desligar
- Aumentar canal
- Diminuir canal
- Aumentar volume
- Diminuir volume
 */

import javax.swing.*;

public class Televisao {
    //Atributos da classe
    boolean ligada;
    int canal;
    int volume;

    //Metodos da classe
    public void ligar()
    {
        if (!this.ligada)
        {
            JOptionPane.showMessageDialog(null,"Televisao ligada.");
            this.ligada = true;
        }
        else
            JOptionPane.showMessageDialog(null,"Televisao ja esta ligada.");
    }

    public void desligar ()
    {
        if (this.ligada)
        {
            JOptionPane.showMessageDialog(null, "Televisao desligada.");
            this.ligada = false;
        }
        else
            JOptionPane.showMessageDialog(null, "Televisao ja esta desligada.");
    }

    public void aumentarCanal ()
    {
        this.canal++;
        JOptionPane.showMessageDialog(null, "Canal " + this.canal);
    }
    public void diminuirCanal ()
    {
        if (this.canal > 0)
            this.canal--;
        JOptionPane.showMessageDialog(null, "Canal " + this.canal);
    }

    public void aumentarVolume ()
    {
        this.volume++;
        JOptionPane.showMessageDialog(null, "Volume " + this.volume);
    }
    public void diminuirVolume ()
    {
        if (this.volume > 0)
            this.volume--;
        JOptionPane.showMessageDialog(null, "Volume " + this.volume);
    }

}
