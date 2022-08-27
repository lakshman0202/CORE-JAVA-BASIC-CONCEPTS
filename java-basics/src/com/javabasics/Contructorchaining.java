package com.javabasics;

public class Contructorchaining {
	
	Contructorchaining(){
		this(5);
		System.out.println("copy cons1");
		
	}
      Contructorchaining(int x){
    	  this(4,8);
    	  System.out.println("copycons2");
		
	}
       Contructorchaining(int x,int y){
    	   
    	   System.out.println("copy cons3");
	
}
	public static void main(String[] args) {
		
		new Contructorchaining();
	}

}
