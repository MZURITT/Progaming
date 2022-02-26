package campeones;

public class Enano extends Campeon {

	private int tama�o;
	
	
	public Enano() {
		
		tama�o= 50;
		
	}


	public Enano(Campeon campeon) {
		super(campeon);
	
	}


	@Override
	public String toString() {
		return "Enano [tama�o=" + tama�o + ", toString()=" + super.toString() + "]";
	}


	public Enano(String nombre, int da�o, int vida, int armadura, int velocidad, String raza, float velAtac, int tama�o) {
		super(nombre, da�o, vida, armadura, velocidad, raza, velAtac);
		this.tama�o = tama�o;
	}




	@Override
	public void rangoAtaque(float rango) {
		
		
	}

	@Override
	public void ResistenciMagica(float cantidadResistencia) {
		
		
	}



}
