package model;

public class Jugador {
	
	private String nombre ;
	private String partidas ;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPartidas() {
		return partidas;
	}
	public void setPartidas(String partidas) {
		this.partidas = partidas;
	}
	
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", partidas=" + partidas + "]";
	}
	
	
	

}
