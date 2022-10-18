/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sy.vendingmachine;

import com.sy.vendingmachine.controller.VendingMachineController;
import com.sy.vendingmachine.dao.VendingMachineDao;
import com.sy.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sy.vendingmachine.dto.Item;
import com.sy.vendingmachine.ui.UserIO;
import com.sy.vendingmachine.ui.UserIOConsoleImpl;
import com.sy.vendingmachine.ui.VendingMachineView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yanina
 */
public class App {

    public static void main(String[] args) {
       
        List<Item> itemList = new ArrayList<Item>();
        
        Item item1 = new Item(" PEPSI", 2.50,5);
        Item item2 = new Item("  COKE", 2.40,5);
        Item item3 = new Item(" FANTA", 2.10,5);
        Item item4 = new Item("SPRITE", 2.20,5);
        Item item5 = new Item("ICETEA", 2.00,5);
        
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        
        UserIO myIo = new UserIOConsoleImpl();
        VendingMachineView myView = new VendingMachineView(myIo, itemList);
        VendingMachineDao myDao = new VendingMachineDaoFileImpl();
        VendingMachineController controller = new VendingMachineController(myView, myDao);
        
        controller.run();
    }
}
