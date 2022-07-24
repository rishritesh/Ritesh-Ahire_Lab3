package com.binarySearch.driver;



import com.binarySearch.service.BinarySearch;
import com.binarySearch.service.Node1;


public class Main {
	public static void main(String[] args) {
		
		Node1 root=null;
		
		BinarySearch binary=new BinarySearch();
		root=binary.insert(root,40);//20,60,10,30,50,70
		root=binary.insert(root,20);
		root=binary.insert(root,60);
		root=binary.insert(root,10);
		root=binary.insert(root,30);
		root=binary.insert(root,50);
		root=binary.insert(root,70);
		
		//int sum=80;
		int sum=130;
		binary.findPairWithGivenSum(root, sum);
	}

}
