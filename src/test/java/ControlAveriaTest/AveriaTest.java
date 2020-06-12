package ControlAveriaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.sanvalero.examenEntornosJunio.model.Averia;

public class AveriaTest {
	
	private static Averia averia;
	
	@Test
	
	public void regitro1() {
		
		Averia averia2 = new Averia (1, "Rueda pinchada", LocalDate.now());
		assertEquals(false, averia2.registro2(-1, "Rueda pinchada", LocalDate.now()));
	}
	
	
	@Test
	public void regitro2() {
		
		Averia averia2 = new Averia (10, "Cadena suelta", LocalDate.now());
		assertEquals(true, averia2.registro2(10, "Cadena suelta", LocalDate.now()));
	}

}
