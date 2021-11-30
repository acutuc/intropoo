package daw.poo.cafetera;

/**
 *
 * @author acutuc
 */
public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    /*Constructor predeterminado, sin parámetros: establece la capacidad máxima en 1000 (c.c.) y la cantidad actual
    en cero (cafetera vacía).*/
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    /*Constructor, que recibe sólo la capacidad máxima de la cafetera; inicializa la cantidad actual de café
    igual a la capacidad máxima (cafetera llena).*/
    public double Cafetera(double capacidadMaxima) {
        this.cantidadActual = capacidadMaxima;
        return capacidadMaxima;
    }

    /*Constructor, que recibe la capacidad máxima y la cantidad actual. Si la cantidad actual que se pasa es mayor
    que la capacidad máxima de la cafetera, se ajustará la cantidad actual a la capacidad máxima.*/
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        }
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.
    public double llenarCafetera() {
        return this.cantidadActual = this.capacidadMaxima;
    }

    /*servirTaza(double cantidadAServir): simula la acción de servir una taza con la capacidad indicada.
    Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.*/
    public double servirTaza(double cantidadAServir) {
        if (cantidadAServir < cantidadActual) {
            cantidadAServir = cantidadActual;
        }
        return cantidadAServir;
    }
    
    //vaciarCafetera(): pone la cantidad de café actual en cero.
    public double vaciarCafetera(){
        cantidadActual = 0;
        return cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
