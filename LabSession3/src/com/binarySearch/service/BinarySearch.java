package com.binarySearch.service;

import java.util.HashSet;
import java.util.Set;



public class BinarySearch {
	public Node1 insert(Node1 root,int data) {
		if(root==null) {
			Node1 node =new Node1(data);
			//return new Node1(data);
			return node;
		}
		if (root.data<data) {
			root.left=insert(root.left,data);
		}
		else if(root.data>data) {
			root.right=insert(root.right,data);
		}
		return root;
	}
	
	public boolean findPairUntil(Node1 root,int sum,HashSet set) {
		if (root==null)
			return false;
		if(findPairUntil(root.left,sum,set))
			return true;
		if(set.contains(sum-root.data)) {
			System.out.println("pair found ("+ root.data + ","+(sum-root.data)+")");
			return true;
		}
		else {
			set.add(root.data);
		}
		return findPairUntil(root.right,sum,set);
		
	}
	
	public void findPairWithGivenSum(Node1  root,int sum) {
		HashSet set = new HashSet();
		if(!findPairUntil(root,sum,set)) {
			System.out.println("pair do not exist"+" ");
		}
	}

}
