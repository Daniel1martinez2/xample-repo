package view;

import processing.core.PApplet;

public class Main extends PApplet {
	Figure f; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main"); 

	}
	public String sayHi(String quote) {
		return quote; 
	}
	public void settings() {
		size(500,500); 
	}

	public void setup() {
		f = new Xample(2); 
		System.out.println(f.pow(4));
		
	}

	public void draw() {
		background(255,255,0); 
	}

}
