package lab_3;

public class One {

	private int a;
	int b;
	int temp;
<<<<<<< HEAD
	int c;
	
	public One(int a, int b, int temp, int c) {
=======
	
	public One(int a, int b, int temp) {
>>>>>>> 0be4b4952bc717e362091bdd614258523d250586
		super();
		this.a = a;
		this.b = b;
		this.temp = temp;
<<<<<<< HEAD
		this.c = c;
=======
>>>>>>> 0be4b4952bc717e362091bdd614258523d250586
	}

	int sumaDemo() {
		return suma();
	}

	private int suma() {
		int c = a + b;
		return c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}