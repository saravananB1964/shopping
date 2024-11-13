package com.pvr.shopping;

import com.pvr.mall.entity.Customerjava;
import com.pvr.shopping.impl_ordering.Mobiletools;
import com.pvr.shopping.impl_ordering.computer;
import com.pvr.shopping.interfacesample.Order;

public class shoppingdemo {

	public static void main(String[] args) {
		Customerjava c1 = new Customerjava();
	    c1.setCid(101);
	    c1.setCname("saravanan");
	    c1.setCity("cuddalore");
	    c1.setProduct("mobiletools");
	    
	    Order order;
	     String choice = c1.getProduct();
	     if(choice.equals("mobiletools"))
	     {
	    	 order=Mobiletools.getMobiletools();
	     }
	     else {
	    	 order=computer.getComputertools();	     
	     
	     }
	     order.ordering();
	}

}
