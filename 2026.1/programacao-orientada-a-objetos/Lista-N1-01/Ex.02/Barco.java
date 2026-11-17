/*
02 – Criar uma classe Barco

Criar um objeto a partir da classe barco
Use os seguintes atributos
- Andando ok
- Velocidade ok
- AncoraGuardada*(O barco somente pode andar e ter velocidade > 0 se a ancora estiver ok
guardada)
Realizar métodos do barco:
        - Entrar em movimento: parado && AncoraGuardada (true) ok
- Parar : andando=true ok
        - Acelerar: não pode Ancora modo False ok
- Desacelerar: ok
        - Descer ancora ok
- Subir ancora ok
*/

import javax.swing.*;

public class Barco {

    //Atributos do aviao

    boolean andando = false;
    int velocidade = 0;
    boolean ancoraGuardada = true;

    //Metodos do aviao

    public void movimentar()
    {
        if (!this.andando && this.ancoraGuardada)
            JOptionPane.showMessageDialog(null, "Barco entrou em movimento.");
        else if (!andando && !ancoraGuardada)
            JOptionPane.showMessageDialog(null, "Barco nao entrou em movimento, favor subir ancora.");
        else
            JOptionPane.showMessageDialog(null, "Barco ja esta em movimento.");
    }

    public void acelerar()
    {
        if (!this.andando && this.ancoraGuardada)
        {
            this.velocidade = 10;
            this.andando = true;
            JOptionPane.showMessageDialog(null, "Barco acelerou.");
        }
    }

    public void desacelerar()
    {
        if (this.andando && this.ancoraGuardada && this.velocidade == 10)
        {
            this.velocidade = 5;
            JOptionPane.showMessageDialog(null, "Barco desacelerou.");
        }
        else
            JOptionPane.showMessageDialog(null, "Ja desacelerou o barco.");
    }

    public void parar()
    {
        if (this.andando && this.ancoraGuardada)
        {
            this.andando = false;
            this.ancoraGuardada = false;
            JOptionPane.showMessageDialog(null, "Barco parado.");
        }
        else
            JOptionPane.showMessageDialog(null, "Barco ja esta parado.");
    }

    public void descerAncora()
    {
        if (this.ancoraGuardada)
        {
            this.ancoraGuardada = false;
            JOptionPane.showMessageDialog(null, "Desceu a ancora.");
        }
        else
            JOptionPane.showMessageDialog(null, "Barco ja esta ancorado.");
    }

    public void subirAncora()
    {
        if (!this.ancoraGuardada)
        {
            this.ancoraGuardada = true;
            JOptionPane.showMessageDialog(null, "Subiu a ancora.");
        }
        else
            JOptionPane.showMessageDialog(null, "Barco ja esta com a ancora recolhida.");
    }
}
