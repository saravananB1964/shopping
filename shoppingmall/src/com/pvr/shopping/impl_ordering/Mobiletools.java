package com.pvr.shopping.impl_ordering;

import com.pvr.shopping.interfacesample.Order;

public class Mobiletools implements Order{

	private static Mobiletools mobiletools=new Mobiletools();
	
	public static Mobiletools getMobiletools() {
		return mobiletools;
	}
	public static void setMobiletools(Mobiletools mobiletools) {
		Mobiletools.mobiletools = mobiletools;
	}
	{
		
	}
	@Override
	public void ordering()
	{
		System.out.println("im buying bluetooth");
	}

	
	
}
