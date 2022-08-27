package com.javabasics;

class car{
	String speed;
	String color;
	String weight;
	String engine;
	
	public void speed(){
		System.out.println("speed is 120");
		
	}
    public void color(){
    	System.out.println("color is black");
		
	}
	
    
    public void weight(){
    	System.out.println("1000pounds");
	
    }
    public void engine(){
    	
    	System.out.println("engine");
    }

}

public class Corejavaobjectcreation {

	public static void main(String[] args) {
		car obj=new car();
		obj.color="blue";
		obj.engine="power engine";
		obj.speed="high";
		obj.weight="heavy weight";
		
		obj.engine();
		obj.weight();
		obj.speed();
		

	}

	@Override
	public String toString() {
		return "Corejavaobjectcreation [getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	
	}


