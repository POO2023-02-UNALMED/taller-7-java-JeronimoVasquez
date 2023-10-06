package comunicacion;

public class Libro extends Escrito {
	
	String co_autor;
	String editorial;
	String edicion;
	String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor,
			String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
		
	}
	
	
	
	public String getCo_autor() {
		return co_autor;
	}



	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}



	public String getEditorial() {
		return editorial;
	}



	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	public String getEdicion() {
		return edicion;
	}



	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}



	public String getInterpretacion() {
		return interpretacion;
	}



	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}



	public int palabrasTotales(int multiplicador) {
		return this.getPaginas() * multiplicador * 2;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" +
				this.getPaginas() + "\n" + this.getCo_autor() + "\n"  + this.getEditorial() + "\n" + 
				this.getEdicion() + "\n" + this.getInterpretacion();
				
	}
	
	

}
