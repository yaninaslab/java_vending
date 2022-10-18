/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sy.vendingmachine.controller;

import com.sy.vendingmachine.dao.VendingMachineDao;
import com.sy.vendingmachine.ui.VendingMachineView;

/**
 *
 * @author yanina
 */
public class VendingMachineController {
    
    private VendingMachineView view;
    private VendingMachineDao dao;

    public VendingMachineController(VendingMachineView view, VendingMachineDao dao) {
        this.view = view;
        this.dao = dao;
    }
    
    public void run() {
        boolean keepGoing = true;
            while (keepGoing) {
            view.printMenuAndGetSelection();      
        }
    }
    
}
