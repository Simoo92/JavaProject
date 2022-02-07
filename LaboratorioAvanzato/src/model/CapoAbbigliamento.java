package model;
//capo abbigliamento è una cosa che andiamo ad aggregare
public abstract class CapoAbbigliamento {
	
	//protected vuol dire visibile come se fosse pubblico per i discendenti della classe mentre privati x il resto del mondo

	protected static int counter = 1;
	
	protected int codArt;
	protected String descrizione;
	protected Taglia taglia;
	
	protected String sigla;
	
	public CapoAbbigliamento() {
		this.codArt = counter++;
		this.sigla = "M000-" + this.codArt;
		
	}
	
	public int getCodArt() {
		return codArt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(sigla);
		builder.append(" - ");
		
		builder.append(descrizione);
		builder.append(", taglia: ");
		builder.append(taglia + " (" + taglia.getNumero() + ")");
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
