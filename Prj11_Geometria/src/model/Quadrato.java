package model;
// siccome il rettangolo non ha un costruttore vuoto per costruire un quadrato devi costruire un rettangolo
public class Quadrato extends Rettangolo{

	Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato); // deve essere la prima istruzione 
		this.lato=lato;
	}

	@Override
	public double perimetro() {
		System.out.println("Stai usando un metodo del quadrato");
		return this.lato.lunghezza()*4;
	}

	
	
	
}
