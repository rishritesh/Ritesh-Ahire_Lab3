package com.balance.service;

import java.util.Stack;

public class BalanceBracket {
	public boolean balance(String data) {
		
		Stack <Character>st=new Stack();
		
		for(int i=0;i<data.length();i++) {
			
			char character=data.charAt(i);
			
			if(st.isEmpty()) {
				
			st.push(character);
		}
			
			else if((st.peek()=='(' && character==')') || (st.peek()=='{' && character=='}')|| (st.peek()=='[' && character==']')) {
			st.pop();
		}
			else {
			st.push(character);
			}
		}
		
		if(st.isEmpty()){
			return true;
		}
		
		return false;
	}

}
