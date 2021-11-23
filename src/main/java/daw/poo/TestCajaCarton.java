
package daw.poo;

/**
 *
 * @author acutuc
 */
public class TestCajaCarton {
    
    public static void main(String[] args) {
        
        CajaCarton cajaGrande = new CajaCarton(250, 400, 500, 200);
        CajaCarton cajaChica = new CajaCarton(25, 30, 15, 17);
        
        System.out.println("Caja Grande --> " + cajaGrande.toString());
        System.out.println("Caja Chica --> " + cajaChica.toString());
        
        
    }
    
}
