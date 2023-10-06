package comunicacion;

public class Fabula extends Escrito {
	
	String ensenanza;
	String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,
			String enseñanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = enseñanza;
		this.interpretacion = interpretacion;
	}
	
	
	
	public String getEnsenanza() {
		return ensenanza;
	}



	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}



	public String getInterpretacion() {
		return interpretacion;
	}



	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}



	public int palabrasTotales(int multiplicador) {
		return this.getPaginas() * multiplicador * 1;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" +
				this.getPaginas() + "\n" + this.getEnsenanza() + "\n"  + this.getInterpretacion();
	}
	

}