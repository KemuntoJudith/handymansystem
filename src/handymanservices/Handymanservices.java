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
public class Handymanservices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        handyman Handyman = new handyman(); 
        
        carpenter Carpenter = new carpenter(); 
        electrician Electrician = new electrician();
        gardener Gardener = new gardener();
        painter Painter = new painter();
        plumber Plumber = new plumber(); 
        
        System.out.println();
        handyman.giveService();
        handyman.getAppointment();
        System.out.println();
        carpenter.giveService();
        carpenter.getAppointment();
        System.out.println();
        electrician.giveService();
        electrician.getAppointment();
        System.out.println();
        gardener.giveService();
        gardener.getAppointment();
        System.out.println();
        painter.giveService();
        painter.getAppointment();
        System.out.println();
        plumber.giveService();
        plumber.getAppointment();       
    }
}
