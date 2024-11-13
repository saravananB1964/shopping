package com.pvr.shopping.impl_ordering;

import com.pvr.shopping.interfacesample.Order;

public class computer implements Order {
	
 private static computer  computertools=new computer();

public static computer getComputertools() {
	return computertools;
}

public static void setComputertools(computer computertools) {
	computer.computertools = computertools;
}
 
 private computer() {
 }
 
 
@Override
public void ordering() {
	System.out.println("tm buyiing harddisk");
}
}

