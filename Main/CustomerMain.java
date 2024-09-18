/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Controllers.CustomerController;
import Models.CustomerList;
import Models.CustomerSet;
import Views.CustomerConsole;
import Views.CustomerFrame;

/**
 *
 * @author jprod
 */
public class CustomerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        CustomerSet model = new CustomerSet();
        CustomerFrame view = new CustomerFrame();
        CustomerController controller = new CustomerController(model,view);
        view.setController(controller);
        view.show();
    }
     
}
