package campeones;
abstract class Campeon {

	protected String nombre;
	protected int da�o;
	protected int vida;
	protected int armadura;
	protected int velocidad;
	protected float velAtac;
	protected String raza;
	private static int personajes;
	
	
	public Campeon() {
	
		nombre="";
		da�o=68;
		vida=505;
		armadura=38;
		velocidad=340;
		velAtac=0.67f;
		raza="";
		
	}
	
	

	public Campeon(Campeon campeon){
		this.nombre = campeon.nombre;
		this.da�o = campeon.da�o;
		this.vida = campeon.vida;
		this.armadura = campeon.armadura;
		this.velocidad = campeon.velocidad;
		this.velAtac = campeon.velAtac;
		this.raza = campeon.raza;
		this.personajes = campeon.personajes;
		
	}
	
	public Campeon (String nombre, int da�o, int vida, int armadura, int velocidad, String raza, float velAtac){
		this.nombre = nombre;
		this.da�o = da�o;
		this.armadura = armadura;
		this.velocidad = velocidad;
		this.raza = raza;
		this.velAtac = velAtac;
		Campeon.personajes++;
	}
	
	
	public void informarCampeon(){
			System.out.printf("nombre: %s", nombre);
			System.out.printf("da�o: %s", da�o);
			System.out.printf("armadura: %s", armadura);
			System.out.printf("velocidad: %s", velocidad);
			System.out.printf("velocidad de ataque: %s", velAtac);
			System.out.printf("raza: %s", raza);
		}


	
	
	@Override
	public String toString() {
		return "Campeon [nombre=" + nombre + ", da�o=" + da�o + ", vida=" + vida + ", armadura=" + armadura
				+ ", velocidad=" + velocidad + ", velAtac=" + velAtac + ", raza=" + raza + "]";
	}



	public abstract void rangoAtaque (float rango);

	public abstract void ResistenciMagica (float cantidadResistencia);
	
	

	public float getVelAtac() {
		return velAtac;
	}

	public void setVelAtac(float velAtac) {
		this.velAtac = velAtac;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDa�o() {
		return da�o;
	}


	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public int getArmadura() {
		return armadura;
	}


	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}


	public float getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}

	
	
}
