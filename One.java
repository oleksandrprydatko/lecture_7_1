package lab_3;

public class One {

	private int a;
	int b;
	int c;
	ststic int p = 3.14;
	
	public One(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	int sumaDemo() {
		return suma();
	}

	private int suma() {
		int c = (a + b) * p;
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