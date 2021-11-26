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

    public Empleado() {
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
        return "Empleado \n ---------------------- \n" + "Nombre: " + nombre + "\nApellidos: "
                + apellidos + "\nNIF: " + NIF + "\nSueldo base: " + sueldoBase + "\nPago por horas extras: "
                + pagoHoraExtra + "\nHoras extra realizadas: "
                + horasExtraRealizadas + "\nIRPF: " + irpf + "\nEstado civil: " + casado + "\nCantidad de hijos: " + numeroHijos;
    }
    
    public String estadoCivil(){
        String estadoCivil;
        if (casado) {
            estadoCivil = "Casado";
        } else {
            estadoCivil = "Soltero";
        }
        return estadoCivil;
    }

    //Cálculo del complemento correspondiente a las horas extra realizadas. El valor debe ser devuelto por el método.
    public double complementoHorasExtras() {
        double complementoApagar = pagoHoraExtra * horasExtraRealizadas;
        return complementoApagar;
    }

    //Cálculo del sueldo bruto. El valor debe ser devuelto por el método. El sueldo bruto es el resultado
    //del sueldo base más el complemento por las horasextra trabajadas en el mes.
    public double sueldoBruto() {
        double sueldoBruto = complementoHorasExtras() + sueldoBase;
        return sueldoBruto;
    }

    //Cálculo de las retenciones (IRPF) a partir del tipo, teniendo en cuenta que el porcentaje de retención
    //que hay que aplicar es el tipo menos 2 puntos si el empleado está casado y menos 1 punto por cada hijo que
    //tenga; el porcentaje se aplica sobre todo el sueldo bruto.
    public double retencionTotalIRPF() {
        int irpfCasado;
        int irpfTotal;
        if (casado) {
            irpfCasado = irpf - 2;
            irpfTotal = irpfCasado - numeroHijos;
        } else {
            irpfTotal = irpf - numeroHijos;
        }
        double retencionTotalIRPF = (sueldoBruto() * irpfTotal) / 100;
        return retencionTotalIRPF;
    }

    //Cálculo del sueldo neto. El valor debe ser devuelto por el método. El sueldo neto es el bruto menos las retenciones.
    public double sueldoNeto() {
        double sueldoNeto = sueldoBruto() - retencionTotalIRPF();
        return sueldoNeto;
    }

    //escribirBasicInfo(): visualización en consola de la información básica del empleado: nombre, apellidos,
    //NIF, estado civil y número de hijos.
    public void escribirBasicInfo() {
               
        System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nNIF: " + NIF + "\nEstado civil: " + estadoCivil() + 
                "\nNúmero de hijos: " + numeroHijos);
    }
    
    //escribirAllInfo(): visualización en consola de toda la información del empleado, esto es, la información básica
    //más el sueldo base, el complemento por horas extra, el sueldo bruto, la retención de IRPF y el sueldo neto. Intenta
    //reutilizar código.
    public void escribirAllInfo(){
        escribirBasicInfo();
        System.out.println("Sueldo base: " + sueldoBase + "\nComplemento por horas extra: " + complementoHorasExtras() + 
                "\nSueldo bruto: " + sueldoBruto() + "\nRetención de IRPF: " + retencionTotalIRPF() + "\nSueldo neto: " + 
                sueldoNeto());
    }

}
