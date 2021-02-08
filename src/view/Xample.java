package view;

public class Xample extends Figure {
	
	int number ; 
	public Xample(int number) {
		super(number);
		this.number = number; 
	}

	@Override
	public double pow(int numberToElevate) {
		// TODO Auto-generated method stub
		double result = Math.pow(number,numberToElevate); 
		return Math.floor(result);
	}

	

}
