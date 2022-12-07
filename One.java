package lab_3;

public class One {

	private int a;
	int b;
	int temp;
	int c;
	int d;
	
	public One(int a, int b, int temp, int c) {
	
		super();
		this.a = a;
		this.b = b;
		this.temp = temp;
		this.c = c;
	}

	int sumaDemo() {
		return suma();
	}

	private int suma() {
		int c = a + b;
		return c;
	}

	void opp (){
		// шось робить
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}