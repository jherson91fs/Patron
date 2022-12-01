
package Adapter;

/**
 *
 * @author Grupo OEtec
 */
public class MotorEconomico extends Motor {

    public MotorEconomico(){
        super();
        System.out.println("Creando motor economico");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor economico.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor economico.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor economico.");
    }
}
