import java.util.Scanner;


public class lab_six {

	/**
	 * @param args
	 */
	public static double calc_force_d(double mass_d,double accel){
		return (mass_d * accel);
	}
	public static double calc_force(double mass,double speed,double radius){
		return ((mass * (double)Math.pow(speed, 2))/radius);
	}
	public static double calc_period(double time,int revolutions){
		return (time/revolutions);
	}
	public static double calc_speed(double radius, double period){
		return ((2.0*Math.PI*radius)/period);
	}
	public static double calc_delta_F(double force, double force_d){
		return (((force-force_d)/force)*100);
	}
	public static double pp(double val){return val;} //pretty print
	public static String ppx(double val){ //pretty print
		String pretty = "" + val; //initial string var
		// format area for pretty output
		pretty = pretty.indexOf(".") < 0 ? pretty : 
			pretty.replaceAll("([0-9]{1,3})*$", "$1")
				.replaceAll("0*$", "").replaceAll("\\.$", "");
		pretty = pretty.indexOf(".") < 0 ? pretty + ".0":pretty;
		return pretty;
	}
	public static void main(String[] args) {
		double gravity = 9.8;
		int revolutions = 0;
		double radius = 0, mass = .4529, mass_d = 0, time = 0;
		double force = 0, force_d = 0, period = 0, speed = 0, delta_F = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("radius: ");radius = in.nextDouble();
		System.out.print("displacement mass: ");mass_d = in.nextDouble();
//		System.out.print("Heavy mass: ");mass = in.nextDouble();
		System.out.print("time: ");time = in.nextDouble();
		System.out.print("revolutions: ");revolutions = in.nextInt();
		
		force_d = calc_force_d(mass_d, gravity);
		period = calc_period(time, revolutions);
		speed = calc_speed(radius, period);
		force = calc_force(mass, speed, radius);
		delta_F = calc_delta_F(force, force_d);
		
		System.out.print("displacement force: \t"+pp(force_d)+"\n"
				+"period: \t\t"+pp(period)+"\n"
				+"speed of rotation: \t"+pp(speed)+"\n"
				+"force (Newton's): \t"+pp(force)+"\n"
				+"difference between forces: "+pp(delta_F)+"%\n");		
		
	}

}
