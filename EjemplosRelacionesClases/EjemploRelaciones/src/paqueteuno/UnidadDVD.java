    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

public class UnidadDVD {

    private String marca;
    private int Costo;

    public UnidadDVD(String a) {
        marca = a;
    }

    public void establecerMarca(String n) {
        marca = n;
    }
    public void establecerCosto(int c) {
        Costo = c;
    }
    public int obtenerCosto() {
        return Costo;
    }


    public String obtenerMarca() {
        return marca;
    }
}
