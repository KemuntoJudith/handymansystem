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
public class gardener extends handyman{
    public gardener(){
        super();
        System.out.println("A new gardener has been registered");
    }
    

    public static void giveService() {
        System.out.println("I offer gardening services");
    }    
    

     public static void getAppointment() {
        System.out.println("Appointment has been made. See you soon.");
    } 
}
