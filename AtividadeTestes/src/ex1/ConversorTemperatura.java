package ex1;

public class ConversorTemperatura {

	public static double converterCelsiusParaFahrenheit(double celsius){
		double fahrenheit = 1.8*celsius+32; //f = 1,9*c+32
		return fahrenheit;
	}
	public static double converteFahrenheitParaCelsius(double fahrenteit){
		double celsius = (5/9)*(fahrenteit-32); //c=(5/9) * (f-32)
		return celsius;
	}
		
}
