package enums;
public class uppgift1 {
	
	static double g_swe = 9.82;
	static double G = 6.67408*Math.pow(10, -11);
	static double R = 8.3144621;
	static double p_0 = 1000;
	static double c = 299792458;
	
		
public static void main(String[] args) {
	
	System.out.println(farenheitToCelsius(50));
	System.out.println(KelvinToCelsius(0));
	System.out.println(fluidPressure(FluidTable.WATER, 10));
	System.out.println(pressureUnderWater(10));
	System.out.println(kineticEnergy(2,2));
	System.out.println(potentialEnergy(2,5));
	System.out.println(fallSpeed(2.5));
	System.out.println(delta(1,10));
	System.out.println(delta(5,1));
	System.out.println(volumeToMass(FluidTable.WATER,1));
	System.out.println(volumeToMassGas(GasTable.AIR,1));
	System.out.println(volumeToMass(SolidTable.IRON,1));
	System.out.println(svtVelocity(10,5));
	System.out.println(svtDistance(10,5));
	System.out.println(svtTime(10,2));
	System.out.println(work(50,10));
	System.out.println(power(1000,2));
	System.out.println(heatSolid(SolidTable.IRON,1,2));
	System.out.println(heatFluid(FluidTable.WATER,1,10));
	System.out.println(heatGas(GasTable.AIR,1,1));
	System.out.println(velocityToHeight(9.82));
	}


public static double farenheitToCelsius (double farenheit) {
		double celsius = ((farenheit - 32)*5)/9;
		return celsius;
}
public static double KelvinToCelsius (double kelvin) {
	double celsius = (kelvin-273.15);
	return celsius;
}
public static double fluidPressure(FluidTable fluid, double deep) {

double thePressure = 0;
thePressure = fluid.density*g_swe*deep;

return thePressure;

}

public static double pressureUnderWater(double deep) {
double thePressure1 = FluidTable.WATER.density * g_swe * deep;

return thePressure1;
}

public static double kineticEnergy(double mass, double velocity) {
double KE = 0.5 * mass * Math.pow(velocity, 2);
return KE;

}

public static double potentialEnergy(double mass, double height) {

double ep = g_swe * mass * height;
return ep;

}

public static double fallSpeed(double height) {

double hastighet = Math.sqrt(2*g_swe*height);
return hastighet;

}

public static double delta(double first, double last) {
double delta = last - first;
return delta;
}

public static double volumeToMass(FluidTable fluid, double volume) {
double mass = fluid.density * volume;
return mass;
}

public static double volumeToMassGas (GasTable gas, double volume) {
double mass = gas.density * volume;
return mass;
}

public static double volumeToMass(SolidTable solid, double volume) {

return solid.density * volume;
}

public static double svtVelocity(double distance, double time) {

return distance/time;
}

public static double svtDistance(double velocity, double time) {

return velocity * time;
}

public static double svtTime(double distance, double velocity) {

return distance/velocity;
}

public static double work(double force, double distance) {

return force * distance;
}

public static double power(double work, double time) {

return work/time;
}

public static double heatSolid(SolidTable solid, double mass, double deltaT) {

return solid.heatCapacity * mass * deltaT;
}

public static double heatFluid(FluidTable fluid, double mass, double deltaT) {

return fluid.heatCapacity * mass * deltaT;
}

public static double heatGas(GasTable gas, double mass, double deltaT) {

return gas.heatCapacity * mass * deltaT;
}

public static double velocityToHeight(double velocity) {

return Math.pow(velocity, 2)/ (2*g);
}






}
