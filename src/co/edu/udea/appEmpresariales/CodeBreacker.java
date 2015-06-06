package co.edu.udea.appEmpresariales;


public class CodeBreacker {
	
	private int numeroCorrecto[] = new int[4];
	
	public void crearNumeroSecreto(int posicion1, int posicion2, int posicion3, int posicion4){
		numeroCorrecto[0] = posicion1;
		numeroCorrecto[1] = posicion2;
		numeroCorrecto[2] = posicion3;
		numeroCorrecto[3] = posicion4;
	}
	
	public String buscarCoincidencia(int posicion1, int posicion2, int posicion3, int posicion4) {
		String cadenaX = "";
		String cadenaRaya = "";
		int numeroIngresado[] = {posicion1,posicion2,posicion3,posicion4};
		for(int pos = 0; pos < 4; pos++){
			if(numeroIngresado[pos] == numeroCorrecto[pos]){
				cadenaX = cadenaX + "X";
			}
			else {
				for (int i=0; i<4;i++){
					if((numeroIngresado[pos] == numeroCorrecto[i]) && pos != i){
						cadenaRaya = cadenaRaya + "-";
						break;
					}
				}
			}
		}
		return cadenaX+cadenaRaya;
	}

}
