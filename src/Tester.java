import java.lang.Math;
public class Tester {

	public static void main(String[] args) {
		double d1=37.9;
		double d2=1004.128;
		int i1=12;
		int i2=18;
		
		double a=15 - i1 * ((int)d1 * 3) + 4;
		//I expect it to be negative 1313 because since
		//we’re doing integer math, it’ll just round
		//stuff so we won’t have a value past the decimal point.
		System.out.println(a);
		double b= 15 - i1 *(int)(d1 * 3) + 4;
		//I expect the value to be negative 1337 because it will apply
		//the integer math to the d1*3, but the extra parenthesis won’t
		//give priority over all to the integer and the d1*3, so it’ll make
		//the problem just act in PEMDAS left to right.
		System.out.println(b);
		double c=57.2*(i1/i2)+1;
		//I expect it to be 1 since the 57.2 is
		//being multiplied by 0 because the integer math makes
		//the 12/18 turn into a zero, so you would just add one.
		System.out.println(c);
		double d=57.2*((double)i1/i2)+1;
		//I expect it to be 39.13 repeating because
		//the math in the parenthesis is actually doing 
		//double math, so it won’t just turn into zero.
		//You would just do the problem normally.
		System.out.println(d);
		double e=15 - i1 * (d1 * 3) + 4;
		//I expect it to be negative 1345.4 because java works in PEMDAS,
		//so you would do the multiplication in the parenthesis first
		//then multiply it by 12, which produces a crazy big number
		System.out.println(e);
		

	}

}
