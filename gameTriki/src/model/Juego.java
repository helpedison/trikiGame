package model;

public class Juego {
	
	private String nombre;
	private int numeroPartidas ;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroPartidas() {
		return numeroPartidas;
	}
	public void setNumeroPartidas(int numeroPartidas) {
		this.numeroPartidas = numeroPartidas;
	}
	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", numeroPartidas=" + numeroPartidas + ", getNombre()=" + getNombre()
				+ ", getNumeroPartidas()=" + getNumeroPartidas() + "]";
	}
	
	
	
	
	
	

}
