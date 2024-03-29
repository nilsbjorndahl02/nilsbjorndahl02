package enums;
import java.lang.Math;
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
	
	// 1. How much does 60 dm ^ 3 iron weigh?
			System.out.println(volumeToMass(SolidTable.IRON, 0.06));
	// 2. How far will Thomas get if he runs at an average speed of 2.7 m / s for 50
	// minutes?
			System.out.println(svtDistance(2.7, 3000));
			// 3. How much energy is needed to heat 4 liters of water from room temperature
			// (22 degrees) to the boiling point?
			System.out.println(heatFluid(FluidTable.WATER, 4, 78));
			// 4. How big is the total pressure 75 meters below sea level?
			System.out.println(pressureUnderWater(75));
			// 5. Thomas, who is 180cm tall, throws up a ball with the mass 250 grams in the
			// air so it gets the take off speed 60 km / h. How high is the ball?
			System.out.println(velocityToHeight(16.6666666667));
			// 6. A car with a mass of 735kg accelerates with constant acceleration from
			// 0-100 in 4.8 seconds. How much effect has the car's engine achieved?
			System.out.println(power(work(force(735, acceleration(kMpHConvert(100), 4.8)),
					distance(4.8, acceleration(kMpHConvert(100), 4.8))), 4.8));
			// 7. A bouncing ball weighing 1kg is released from a height of 12 meters and
			// every time it touches the ground it loses 1% of its energy. How many times
			// will the ball bounce in the ground before bouncing no more than 0.5 meters?
			System.out.println(bounceCount(12, 1));
			// 8. A 13 kilo weight is hanging on a spring which has t as a constant factor
			// characteristic of the springs stiffness 96N/m. How far the spring is
			// extended?
			System.out.println(hookesLawLenght(force(g_swe, 13), 96));
			
			// 9. What speed does a rock that weights 1kg have when it hits the ground, if it has a speed of 8 m / s at a height of 5 meters?
			// When it hit the ground mgh= 0 => m * Math.pow(v, 2)/2. V = (mechanicalEnergy(Em1)*2)
			System.out.println(velocityMechanicalEnergy_mgh0(mechanicalEnergy(potentialEnergy(1, 9.82, 5), keneticEnergy(1, 8))));
			// 10. What height was the stone dropped from?
			//mechanicalEnergy(Em2)= mgh= 9.82 * h. Em1 = Em2 = 61.6 = 9.82 * h <=> 61.6/9.82 = h.
			System.out.println(heightMechanicalEnergy(mechanicalEnergy(potentialEnergy(1, 9.82, 5), keneticEnergy(1, 8)), 1));
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

return Math.pow(velocity, 2)/ (2*G);
}

public static double kMpHConvert(double kMpH) {
	double velocityMpS = kMpH / 3.6;
	return velocityMpS;

}	
	public static double bounceCount(double height, double mass) {
		double potentialEnergy = mass * g_swe * height;
		int bounceCount = 0;
		double i = height;

		while (i >= 0.5) {
			potentialEnergy *= 0.99;
			i = potentialEnergy / g_swe;
			bounceCount++;
		}

		return bounceCount;
}

	public static double acceleration(double velocityMpS, double time) {
		double acceleration = velocityMpS / time;
		return acceleration;

}

	public static double force(double acceleration, double mass) {
		double force = acceleration * mass;
		return force;
	}
	
	public static double distance(double time, double acceleration) {
		double distance = (acceleration * Math.pow(time, 2)) / 2;
		return distance;
	}

	public static double mechanicalEnergy(double potentialEnergy, double keneticEnergy) {
		double mechanicalEnergy = potentialEnergy + keneticEnergy;
		return mechanicalEnergy;
		
	}
	
	public static double keneticEnergy(double mass, double velocity) {
		double keneticEnergy = (mass * Math.pow(velocity, 2))/2;
		return keneticEnergy;
	}
	
	
	public static double hookesLawLenght(double force, double springConstant) {
		//Length = Force(F) / k
		double lenght = force / springConstant;
		return lenght;
	}
	
	
	public static double potentialEnergy(double mass, double g, double height) {
		double potentialEnergy = mass * g * height;
		return potentialEnergy;
	}
	
	public static double velocityMechanicalEnergy_mgh0(double mechanicalEnergy) {
		double velocity = Math.sqrt(mechanicalEnergy * 2);
		return velocity;
	}
	
	public static double heightMechanicalEnergy(double mechanicalEnergy, double mass) {
		double height = mechanicalEnergy / (mass * g_swe);
		return height;
	}
}
