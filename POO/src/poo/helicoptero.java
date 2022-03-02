package poo;

	public class helicoptero extends avion{
		private int helices;
		private int motor;
		private String tipofuselaje;
		
		//constructor por defecto
		public helicoptero() {
		}
		
		//constructor con los atributos de la clase incluso los heredados
		public helicoptero(String Denominacion, String Fabricacion, String Tripulacion, String Ubicacion, String Autonomia, int helices, int motor,
				String  tipofuselaje) {
			super(Denominacion, Fabricacion, Tripulacion, Ubicacion, Autonomia);
			this.helices = helices;
			this.motor = motor;
			this.tipofuselaje = tipofuselaje;
		}
	
		// m�todo sobrescrito (override), utilizo c�digo de la clase avion y a�ado c�digo que necesito 
		@Override
		public void informarCaracteristicas() {
			// TODO Auto-generated method stub
			super.informarCaracteristicas();
			System.out.println(String.format("%s helices", helices));
			System.out.println(String.format("tipo de motor %s ", motor));
			System.out.println(String.format("tipo de fuselaje %s ", tipofuselaje));
		}
		//getters y setters
		public int gethelices() {
			return helices;
		}
	 
		public void sethelices(int helices) {
			this.helices = helices;
		}
	 
		public int getmotor() {
			return motor;
		}
	 
		public void setmotor(int motor) {
			this.motor = motor;
		}
	 
		public String  gettipofuselaje() {
			return  tipofuselaje;
		}
	 
		public void settipofuselaje(String  tipofuselaje) {
			this.tipofuselaje =  tipofuselaje;
		}		
	}
		
	
