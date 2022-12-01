/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Adapter;

/**
 *
 * @author Grupo OEtec
 */
public class Aplicacion {


    public static void main(String[] args) {
    	
    	Aplicacion miPrincipal = new Aplicacion();
    	System.out.println("\n******************Motor Comun*********************");
    	miPrincipal.usarMotorComun();
    	System.out.println("**************************************************\n");
    	System.out.println("*****************Motor Economico******************");
    	miPrincipal.usarMotorEconomico();
    	System.out.println("**************************************************\n");
    	System.out.println("*****************Motor Electrico******************");
    	miPrincipal.usarMotorElectrico();
    	System.out.println("**************************************************\n");
    }

	private void usarMotorComun() {
	    Motor motor = new MotorComun();
        motor = new MotorComun();
        motor.encender();
        motor.acelerar();
        motor.apagar();
	}

	private void usarMotorElectrico() {
		Motor motor = new MotorElectricoAdapter() ;
        motor.encender();
        motor.acelerar();
        motor.apagar();		
	}

	private void usarMotorEconomico() {
        Motor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();		
	}

}

