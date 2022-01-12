package model;

public class Triangolo {

	private Punto a, b, c;
	private Segmento ab, ac, bc;

	public Triangolo(Punto a, Punto b, Punto c) {

		this.a = a;
		this.b = b;
		this.c = c;

		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);

	}

	public double perimetro() {

		return this.ab.lunghezza() + this.ac.lunghezza() + this.bc.lunghezza();

	}
	
	
		public double area () {
			double p = this.perimetro()/2;
			
			return Math.sqrt(p*(p-ab.lunghezza())*(p-ab.lunghezza())*(p-bc.lunghezza()));
	
}
}
