package model;

public enum Taglia {
	// gli enum sono oggetti in questa classe vengono creati 4 oggetti
	S(40), M(44), L(48), XL(52);

	private int numero;
	
	
	private Taglia(int numero) {
		this.numero = numero;
	
	}
	
	public int getNumero() {
		return numero;
	}
	
	
	
}
