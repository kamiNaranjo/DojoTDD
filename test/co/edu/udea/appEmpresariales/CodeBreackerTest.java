package co.edu.udea.appEmpresariales;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CodeBreackerTest {
	
	CodeBreacker codebreacker = new CodeBreacker();
	
	@Test
	public void todosCoincidenMismaPosicion(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "XXXX";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,8,6,4));
	}
	
	@Test
	public void tresCoincidenMismaPosicion(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "XXX";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,5,6,4));
	}
	
	public void DosCoincidenMismaPosicion(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "XX";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,5,1,4));
	}
	
	public void UnoCoincidenMismaPosicion(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "X";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,5,1,3));
	}
	
	@Test
	public void todosCoincidenDiferentePosicion(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "----";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(4,6,8,2));
	}
	
	@Test
	public void tresCoincidenDiferentePosicion(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "---";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(4,6,5,2));
	}
	
	@Test
	public void DosCoincidenDiferentePosicion(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "--";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(4,6,5,1));
	}
	
	@Test
	public void UnoCoincidenDiferentePosicion(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "-";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(4,1,5,3));
	}
	
	@Test
	public void DosPosicionCorrectaDosPosicionIncorrecta(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "XX--";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,8,4,6));
	}
	
	@Test
	public void DosPosicionIncorrectaDosPosicionCorrecta(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "XX--";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(8,2,6,4));
	}
	
	@Test
	public void NingunoNumeroCorrecto(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(1,3,5,7));
	}
	
	@Test
	public void unaPosicionCorrectaTresIncorrectas(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "X---";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,6,4,8));
	}
	
	@Test
	public void unaPosicionCorrecta(){
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);
		String respuestaEsperada = "X";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(1,5,6,3));
	}
	
	
}

	
	


