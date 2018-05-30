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
public class Modelo {

    private Double moneda;
    private float valor;
    private Double cantidad;
    private Double resultado;

    public void setValor(float valor) {
        this.valor = valor;
    }
    public void setMoneda(Double moneda) {
        this.moneda = moneda;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getResultado() {
        return resultado;
    }

    public void convetirDolarAPeso() {
        resultado = cantidad * moneda;
    }

    public void convertirPesoADolar() {
        resultado = cantidad / moneda;
    }
<<<<<<< HEAD

    public void convetirYenAPeso() {
        resultado = cantidad * valor;
    }


=======
>>>>>>> 7ce7a23ffb54adf4eb8e3d7e27863732cc5fb467
     public void convertirDirhamsADolar() {
        resultado = cantidad * moneda;
    }
}
