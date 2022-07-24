package com.balance.driver;


import com.balance.service.BalanceBracket;

public class Main {
	
	public static void main(String[] args) {
		
		//Object create
		BalanceBracket balanceBracket=new BalanceBracket();
		boolean rs=balanceBracket.balance("([[{}]])");
		//boolean rs=balanceBracket.balance("([[{}]]))");
		
		if(rs)
			System.out.println("the enter String has Balanced Brackets");
		else
			System.out.println("the enter String do not contain Balanced Brackets");
		}
}
