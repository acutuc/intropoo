
package daw.poo;

/**
 *
 * @author acutuc
 */
public class CajaCarton {
    

    private double ancho;
    private double alto;
    private double largo;
    private double peso;

    public CajaCarton(double ancho, double alto, double largo, double peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void abrir(){
        
    }
    public void cerrar(){
        
    }

    @Override
    public String toString() {
        return "ancho=" + ancho + " mm, alto=" + alto + " mm, largo=" + largo + " mm, peso=" + peso + " gr";
    }
}