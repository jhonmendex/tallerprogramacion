/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**jjhbjhjhbjhbjhbjhbbj
 *
 * @author Jhon
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame {

    public JButton pesos, dolares,yen_peso,peso_yen;
    private JPanel panelB, panelR;
    public JLabel lResultado;
    public JTextField campoTexto;

    public Vista() {
        getContentPane().setLayout(new BorderLayout());

        panelB = new JPanel();
        panelB.setLayout(new FlowLayout());

        panelR = new JPanel();
        panelR.setLayout(new FlowLayout());

        pesos = new JButton("Convertir a Pesos");
        dolares = new JButton("Convertir a Dolares");
        yen_peso = new JButton("Convertir a Yenes a Pesos");
        peso_yen = new JButton("Convertir a Yenes a Pesos");

        lResultado = new JLabel("Resultado:");
        campoTexto = new JTextField(20);

        panelB.add(pesos);
        panelB.add(dolares);
        panelB.add(yen_peso);
        panelB.add(peso_yen);

        panelR.add(lResultado);

        add(campoTexto, BorderLayout.NORTH);
        add(panelB, BorderLayout.SOUTH);
        add(panelR, BorderLayout.CENTER);
    }
}
