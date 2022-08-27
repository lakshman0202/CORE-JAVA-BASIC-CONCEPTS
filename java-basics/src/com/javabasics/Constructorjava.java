package com.javabasics;
class car{
	public void speed() {
		System.out.println("this is copy constructor");
	}
}
    class bike{
        int age;
        int hight;
        int weight;
     public bike
     (int age,int hight,int weight){
        	this.age=age;
        	this.hight=hight;
        	this.weight=weight;
        }
     
	
       public void age() {
    	   System.out.println("red");
    	   
       }
       
         public void hight() {
        	 System.out.println("yellow");
    	   
       }
        public void weight() {
        	System.out.println("green");
	   
}

    } 

   
		
public class Constructorjava {
	

	public static void main(String[] args) {
		
         bike obj1=new bike(16,19,19);
         bike obj2=obj1;
         obj1.age();
         obj1.hight();
         obj1.weight();
         
         System.out.println(obj1.hight+" "+" "+" "+obj1.age+" "+" "+obj1.weight);
	}

}
