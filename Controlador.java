/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Jhona
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Controlador implements ActionListener {

    private Modelo modelo;
    private Vista vista;
    private Double cantidad;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.yen_peso.addActionListener(this);
        this.vista.pesos.addActionListener(this);
        this.vista.dolares.addActionListener(this);
        this.vista.peso_yen.addActionListener(this);

    }

    public void iniciarVista() {
        vista.setTitle("Conversor");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if (vista.pesos == evento.getSource()) {
            if (!"".equals(vista.campoTexto.getText())) {
                try {
                    cantidad = Double.parseDouble(vista.campoTexto.getText());
                    modelo.setCantidad(cantidad);
                    modelo.setMoneda(2958.57);
                    modelo.convetirDolarAPeso();
                    vista.lResultado.setText(modelo.getResultado().toString());
                } catch (NumberFormatException e) {
                    vista.lResultado.setText("Introduzca una cantidad valida...");
                }
            }
        }else if (vista.dirhams == evento.getSource()) 
        {
            System.out.println("dir");
            if (!"".equals(vista.campoTexto.getText())) 
            {
                try 
                {
                    cantidad = Double.parseDouble(vista.campoTexto.getText());
                    modelo.setCantidad(cantidad);
                    modelo.setMoneda(3.67250);
                    
                     modelo.convertirDirhamsADolar();
                    
                    vista.lResultado.setText(modelo.getResultado().toString());
                } catch (NumberFormatException e) 
                {
                    vista.lResultado.setText("Introduzca una cantidad valida...");
                }
            }
        }
        else if (vista.dolares == evento.getSource()) 
        {
            if (!"".equals(vista.campoTexto.getText())) 
            {
                try
                {
                    cantidad = Double.parseDouble(vista.campoTexto.getText());
                    modelo.setCantidad(cantidad);
                    modelo.setMoneda(3.3800);
                    modelo.convertirPesoADolar();
                    vista.lResultado.setText(modelo.getResultado().toString());
                } catch (NumberFormatException e) {
                    vista.lResultado.setText("Introduzca una cantidad valida...");
                }
            }
        } else if (vista.yen_peso == evento.getSource()) {
            if (!"".equals(vista.campoTexto.getText())) {
                try {
                    cantidad = Double.parseDouble(vista.campoTexto.getText());
                    modelo.setCantidad(cantidad);
                    modelo.setValor(26.798f);
                    modelo.convetirYenAPeso();
                    vista.lResultado.setText(modelo.getResultado().toString());
                } catch (NumberFormatException e) {
                    vista.lResultado.setText("Introduzca una cantidad valida...");
                }
            }
        }else if (vista.peso_yen == evento.getSource()) {
            if (!"".equals(vista.campoTexto.getText())) {
                try {
                    cantidad = Double.parseDouble(vista.campoTexto.getText());
                    modelo.setCantidad(cantidad);
                    modelo.setValor(26.798f);
                    modelo.convertirPesoAYen();
                    vista.lResultado.setText(modelo.getResultado().toString());
                } catch (NumberFormatException e) {
                    vista.lResultado.setText("Introduzca una cantidad valida...");
                }
            }
        }
       
    }
}