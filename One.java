package lab_3;

public class One {

	private int a;
	int b;
	int temp;
	
	public One(int a, int b, int temp) {
		super();
		this.a = a;
		this.b = b;
		this.temp = temp;
	}

	int method (int a){
		int b = a*2;
		return b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}