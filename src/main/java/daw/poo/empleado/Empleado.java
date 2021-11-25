
package daw.poo.empleado;

/**
 *
 * @author Gabriel
 */
public class Empleado {
    String nombre;
    String apellidos;
    String NIF;
    double sueldoBase;
    double pagoHoraExtra;
    double horasExtraRealizadas;
    int irpf;
    boolean casado;
    int numeroHijos;

    public Empleado(String nombre, String apellidos, String NIF, double sueldoBase, double pagoHoraExtra, double horasExtraRealizadas, int irpf, boolean casado, int numeroHijos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtraRealizadas = horasExtraRealizadas;
        this.irpf = irpf;
        this.casado = casado;
        this.numeroHijos = numeroHijos;
        
    }
    public Empleado (){
        nombre = "Gabriel";
        apellidos = "Allende";
        NIF = "67619234J";
        sueldoBase = 4150.50;
        double pagoHoraExtra = 15.5;
        double horasExtraRealizadas = 6;
        irpf = 8;
        casado = false;
        numeroHijos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public double getHorasExtraRealizadas() {
        return horasExtraRealizadas;
    }

    public void setHorasExtraRealizadas(double horasExtraRealizadas) {
        this.horasExtraRealizadas = horasExtraRealizadas;
    }

    public int getIrpf() {
        return irpf;
    }

    public void setIrpf(int irpf) {
        this.irpf = irpf;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    @Override
    public String toString() {
        return "Empleado \n ---------------------- \n" + "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nNIF: " + NIF + "\nSueldo base: " + sueldoBase + "\nPago por horas extras: " + pagoHoraExtra + "\nHoras extra realizadas: " + horasExtraRealizadas + "\nIRPF: " + irpf + "\nEstado civil: " + casado + "\nCantidad de hijos: " + numeroHijos;
    }
    
}
