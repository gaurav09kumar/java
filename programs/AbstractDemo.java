package com;

abstract  class GraphicDemo {
	 void fillColor()
	{
		System.out.println("filled with blue color");
	}
	abstract void shape();

}

class Square extends GraphicDemo{
	void shape()
	{
		System.out.println("drawing Shape");
	}
	void show()
	{
		System.out.println("in square class");
	}
}

class Rectangle extends GraphicDemo
{
	void shape()
	{
		System.out.println("drawing rectangle");
		
	}
	void show()
	{
		System.out.println("in circle class");
	}
}

class Triangle extends GraphicDemo
{
	 void shape()
	 {
		 System.out.println("drawing a triangle");
	 }
	
}

public class AbstractDemo{
	public static void main(String[] args){
		GraphicDemo g;
		
		Square s=new Square();
		s.shape();
		s.fillColor();
		s.show();
		
		g=s;
		g.shape();
		g.fillColor();
		//g.show(): C.E
		
		Rectangle r=new Rectangle();
		g=r;
		g.shape();
		g.fillColor();
		
		Triangle t=new Triangle();
		g=t;
		g.shape();
		g.fillColor();
	}
}
	


