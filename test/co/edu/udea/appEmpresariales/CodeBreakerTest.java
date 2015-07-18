package co.edu.udea.appEmpresariales;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CodeBreakerTest {
	
	private CodeBreaker codebreacker;
	
	@Before
	public void inicializar(){
		codebreacker = new CodeBreaker();
		codebreacker.crearNumeroSecreto("2864");	
	}
	
	@Test
	public void todosCoincidenMismaPosicion(){		
		String respuestaEsperada = "XXX-";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("2864"));
	}
	
	@Test
	public void tresCoincidenMismaPosicion(){
		String respuestaEsperada = "XXX";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("2564"));
	}
	
	public void DosCoincidenMismaPosicion(){		
		String respuestaEsperada = "XX";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("2514"));
	}
	
	public void UnoCoincidenMismaPosicion(){		
		String respuestaEsperada = "X";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("2513"));
	}
	
	@Test
	public void todosCoincidenDiferentePosicion(){	
		String respuestaEsperada = "----";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("4682"));
	}
	
	@Test
	public void tresCoincidenDiferentePosicion(){		
		String respuestaEsperada = "---";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("4652"));
	}
	
	@Test
	public void DosCoincidenDiferentePosicion(){		
		String respuestaEsperada = "--";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("4651"));
	}
	
	@Test
	public void UnoCoincidenDiferentePosicion(){
		
		String respuestaEsperada = "-";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("4153"));
	}
	
	@Test
	public void DosPosicionCorrectaDosPosicionIncorrecta(){
		
		String respuestaEsperada = "XX--";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("2846"));
	}
	
	@Test
	public void DosPosicionIncorrectaDosPosicionCorrecta(){		
		String respuestaEsperada = "XX--";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("8264"));
	}
	
	@Test
	public void NingunoNumeroCorrecto(){
		
		String respuestaEsperada = "";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("1357"));
	}
	
	@Test
	public void unaPosicionCorrectaTresIncorrectas(){		
		String respuestaEsperada = "X---";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("2648"));
	}
	
	@Test
	public void unaPosicionCorrecta(){		
		String respuestaEsperada = "X";
		assertEquals(respuestaEsperada, codebreacker.buscarCoincidencia("1563"));
	}
	
	
}

	
	


