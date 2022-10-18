/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sy.vendingmachine.ui;

import com.sy.vendingmachine.dto.Item;
import java.util.List;

/**
 *
 * @author yanina
 */
public class VendingMachineView {
    
    private UserIO io;
    private List<Item> itemList;

    public VendingMachineView(UserIO io, List<Item> itemList) {
        this.io = io;
        this.itemList = itemList;
    }
    
        public int printMenuAndGetSelection() {
        io.print("******** MAIN MENU ********");
        io.print("** Name ** Price * Stock **");
        for (int i = 0; i < itemList.size(); i++) {
            io.print(i+ 1 + " " + itemList.get(i).toString());
        }

        return io.readInt("Please select from the above choices.", 1, 5);
    }
    
}
