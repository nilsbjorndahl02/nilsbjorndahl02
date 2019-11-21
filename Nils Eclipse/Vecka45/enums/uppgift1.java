package enums;

public class uppgift1 {

public static void main(String[] args) {
	System.out.println(farenheitToCelsius(50));
	System.out.println(KelvinToCelsius(0));
	}
public static double farenheitToCelsius (double farenheit) {
		double celsius = ((farenheit - 32)*5)/9;
		return celsius;
}
public static double KelvinToCelsius (double kelvin) {
	double celsius = (kelvin-273.15);
	return celsius;
}
}
