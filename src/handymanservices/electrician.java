/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handymanservices;

/**
 *
 * @author JUDITH
 */
public class electrician extends handyman {
    public electrician(){
        super();
        System.out.println("A new electrician has been registered");
    }


    public static void giveService() {
        System.out.println("I offer electrician services");
    }    
    

     public static void getAppointment() {
        System.out.println("Appointment has been made. See you soon.");
    } 
    
    
}
