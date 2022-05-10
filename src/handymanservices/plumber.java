package handymanservices;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUDITH
 */
public class plumber extends handyman {
public plumber(){
        super();
        System.out.println("A new plumber has been registered");
    }
    

    public static void giveService() {
        System.out.println("I offer plumbing services");
    }    
    

     public static void getAppointment() {
        System.out.println("Appointment has been made. See you soon.");
    } 
  
}