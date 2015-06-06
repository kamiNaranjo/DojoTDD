package co.edu.udea.appEmpresariales;


public class CodeBreaker {
	
	private char numeroCorrecto[];
	
	public void crearNumeroSecreto(String numeroSecreto){
		numeroCorrecto = new char[numeroSecreto.length()];
		for (int i = 0; i < numeroSecreto.length(); i++) 
			numeroCorrecto[i] = numeroSecreto.charAt(i);
	}
	
	public String buscarCoincidencia(String numeroDeIntento) {
		String cadenaX = "";
		String cadenaRaya = "";
		char numeroIngresado[] = new char[numeroDeIntento.length()];
		for (int i = 0; i < numeroDeIntento.length(); i++) 
			numeroIngresado[i] = numeroDeIntento.charAt(i);
		for(int pos = 0; pos < 4; pos++){
			if(numeroIngresado[pos] == numeroCorrecto[pos])
				cadenaX = cadenaX + "X";
			else {
				for (int i=0; i<4;i++){
					if((numeroIngresado[pos] == numeroCorrecto[i])){
						cadenaRaya = cadenaRaya + "-";
						break;
					}
				}
			}
		}
		return cadenaX+cadenaRaya;
	}

}
