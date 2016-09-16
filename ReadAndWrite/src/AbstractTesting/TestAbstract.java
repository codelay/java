package AbstractTesting;

abstract public class TestAbstract {

	double width, length, height;
	
	public TestAbstract(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public TestAbstract(double width, double length, double height ){
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	
	abstract double area();
	
}

class First_class extends TestAbstract{
	
	public First_class(double width, double length){
		super(width,length);
	}
	
	public double area(){
		
		return width*length;
	}
}


