package LabTest;

public class SolvingSimulataneouslyTwoDifferentialEq {
	public static Long startTime = System.nanoTime();
	
	public static Double rungaKutta(Double x0, Double y0, Double x, Double h) {
		
		Integer n = (int)((x - x0) / h);
		Double k1= 0.0, k2= 0.0, k3= 0.0, k4= 0.0, l1= 0.0,l2= 0.0,l3= 0.0,l4 = 0.0;
		
		// Iterate for number of iterations
		Double y = y0;
		Double xr = x0;
		System.out.println("The value of y at x is : " + y+" x: "+ xr+" at time 0 nano seconds");
		for (int i = 1; i <= n; i++)
		{
			// Apply Runge Kutta Formulas to find
			k1 = h * (dydx(x0, y));
			k2 = h * (dydx(x0 + 0.5 * h, y + 0.5 * k1));
			k3 = h * (dydx(x0 + 0.5 * h, y + 0.5 * k2));
			k4 = h * (dydx(x0 + h, y + k3));
			
			l1 = h * (dzdx(x0, y));
			l2 = h * (dzdx(x0 + 0.5 * h, y + 0.5 * l1));
			l3 = h * (dzdx(x0 + 0.5 * h, y + 0.5 * l2));
			l4 = h * (dzdx(x0 + h, y + l3));


			// Update next value of y
			y = y + (1.0 / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4);
			// Update next value of xr
			xr = xr + (1.0 / 6.0) * (l1 + 2 * l2 + 2 * l3 + l4);
			
			
			x0 = x0 + h;
//			System.out.println(startTime);
			Long endTime = System.nanoTime();
			Long time = endTime - startTime;
			System.out.println("The value of y at x is : " + y+" x: "+ xr+" at time "+time+" nano seconds");
//			System.out.println("Y"+"\t\t\t\t"+"X"+"\t\t"+"= \t\t"+"Time");
//			printValues(y,xr,time);
		}
//		System.out.println(k1+"\t\t"+k2+" \t"+k3+" \t"+k4);
//		System.out.println(l1+" \t"+l2+" \t\t\t"+l3+" \t"+l4);
		
		return y;
	}
	public static Double dydx(Double x, Double y)
	{
		float a=2/3,b=4/3,c=1,d=1;
		return (a*x-b*x*y);
//		return (-c*y+d*x*y)/(a*x-b*x*y);
//        return (x*(a - b*y)/-y*(c - d*x));
	}
	
	public static Double dzdx(double x, double y)
	{
		float a=2/3,b=4/3,c=1,d=1;
		return (-c*y+d*x*y);
//        return (-y*(c - d*x)/x*(a - b*y));
	}
	public static void main(String[] args) {
		Double x0 = (double) 0, y = (double) 1, x = 2.0, h = 0.2;
		System.out.println("\n\nThe Value of y at x is "+rungaKutta(x0, y, x, h));
	}
	public static void printValues(Double y, Double x, Long time) {
		System.out.println(y+"\t\t"+x+"\t\t"+"= \t\t"+time);
		return;
		
	}
}