package ex1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Teste1 {

	@Test
	public void testeTemperatura() {
		
		// primeiro teste
		TemperaturaCelsius tp = new TemperaturaCelsius(23);
		//assertEquals(tp, tp);

		Assert.assertEquals(260, tp.converteCelsiusParaFahrenheit(), 0.1 );
		}

	
	@Test
	 void testeTempFahrenheit() {
		ConversorTemperatura cv = new ConversorTemperatura();
		
		//cv.converteFahrenheitParaCelsius(5.1);
		
		Assert.assertEquals(20.8, cv.converteFahrenheitParaCelsius(20.8),0.2);
		
	}
	
	
	@Test
	 void testeTempCelsius() {
		
		ConversorTemperatura cv2 = new ConversorTemperatura();
	
		assertEquals(20, cv2.converteFahrenheitParaCelsius(20.2),20);
		/*assertEquals(cv2, cv2); */
	
	}
	
}
