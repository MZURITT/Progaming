package trenes;


public class Principal {
	public static void main(String[] args) {

		TrenVala ave = new TrenVala(12, 10, 9000);
		System.out.println(ave);
		ave.elegirPelicula("mougli");
		ave.reproducirPelicula("mougli");
		ave.aumentarTemperatura(25);
		ave.reproducirPelicula("mougli");
	
		TrenCarga carga = new TrenCarga(1231, 1111, "lleno");
		System.out.println(carga);
		//carga.elegirPelicula("mougli");
		carga.aumentarTemperatura(30);
	
}
}
