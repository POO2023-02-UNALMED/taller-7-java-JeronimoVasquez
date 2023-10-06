package comunicacion;

public class Alfabeto extends Pictograma {
	
	String[] letras;
	String interpetracion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpetracion = interpretacion;
	}
	
	
	
	public String[] getLetras() {
		return letras;
	}



	public void setLetras(String[] letras) {
		this.letras = letras;
	}



	public String getInterpetracion() {
		return interpetracion;
	}



	public void setInterpetracion(String interpetracion) {
		this.interpetracion = interpetracion;
	}



	public int cantidadLetras() {
		return this.letras.length;
	}
	
	public String interpretacion() {
		return this.interpetracion;
	}
	
	public String toString() {
		
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
	}

}
