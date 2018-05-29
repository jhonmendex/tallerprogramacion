/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
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

<<<<<<< HEAD
    public JButton pesos, dolares,rublos;
=======
    public JButton pesos, dolares,dirhams;
>>>>>>> 7ce7a23ffb54adf4eb8e3d7e27863732cc5fb467
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
        dirhams = new JButton("Convertir a Dirhams");
        dolares = new JButton("Convertir a Dolares");
        rublos = new JButton("Convertir a Rublos");

        lResultado = new JLabel("Resultado:");
        campoTexto = new JTextField(20);
           panelB.add(dirhams);
        panelB.add(pesos);
        panelB.add(dolares);
<<<<<<< HEAD
        panelB.add(rublos);
=======
        
>>>>>>> 7ce7a23ffb54adf4eb8e3d7e27863732cc5fb467

        panelR.add(lResultado);

        add(campoTexto, BorderLayout.NORTH);
        add(panelB, BorderLayout.SOUTH);
        add(panelR, BorderLayout.CENTER);
    }
}
