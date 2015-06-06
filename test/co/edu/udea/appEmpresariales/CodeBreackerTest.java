package co.edu.udea.appEmpresariales;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CodeBreackerTest {
	
	private CodeBreacker codebreacker;
	
	@Before
	public void inicializar(){
		codebreacker = new CodeBreacker();
		codebreacker.crearNumeroSecreto(2, 8, 6, 4);	}
	
	@Test
	public void todosCoincidenMismaPosicion(){
		
		String respuestaEsperada = "XXXX";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,8,6,4));
	}
	
	@Test
	public void tresCoincidenMismaPosicion(){
		
		String respuestaEsperada = "XXX";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,5,6,4));
	}
	
	public void DosCoincidenMismaPosicion(){
		
		String respuestaEsperada = "XX";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,5,1,4));
	}
	
	public void UnoCoincidenMismaPosicion(){
		
		String respuestaEsperada = "X";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,5,1,3));
	}
	
	@Test
	public void todosCoincidenDiferentePosicion(){
		
		String respuestaEsperada = "----";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(4,6,8,2));
	}
	
	@Test
	public void tresCoincidenDiferentePosicion(){
		
		String respuestaEsperada = "---";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(4,6,5,2));
	}
	
	@Test
	public void DosCoincidenDiferentePosicion(){
		
		String respuestaEsperada = "--";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(4,6,5,1));
	}
	
	@Test
	public void UnoCoincidenDiferentePosicion(){
		
		String respuestaEsperada = "-";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(4,1,5,3));
	}
	
	@Test
	public void DosPosicionCorrectaDosPosicionIncorrecta(){
		
		String respuestaEsperada = "XX--";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,8,4,6));
	}
	
	@Test
	public void DosPosicionIncorrectaDosPosicionCorrecta(){
		
		String respuestaEsperada = "XX--";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(8,2,6,4));
	}
	
	@Test
	public void NingunoNumeroCorrecto(){
		
		String respuestaEsperada = "";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(1,3,5,7));
	}
	
	@Test
	public void unaPosicionCorrectaTresIncorrectas(){
		
		String respuestaEsperada = "X---";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(2,6,4,8));
	}
	
	@Test
	public void unaPosicionCorrecta(){
		
		String respuestaEsperada = "X";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia(1,5,6,3));
	}
	
	
}

	
	


