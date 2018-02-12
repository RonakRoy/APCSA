package net.sduhsd.royr6099.unit2;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public Fahrenheit() {
		setFahrenheit(0);
	}
	
	public Fahrenheit(double f) {
		setFahrenheit(f);
	}
	
	public void setFahrenheit(double f)
	{
		fahrenheit = f;
	}

	public double getCelsius()
	{
		return (fahrenheit - 32.0) * 5.0 / 9.0;
	}

	public void print()
	{
		System.out.println(format(fahrenheit) + " degrees F == " + format(getCelsius()) + " degrees C");
	}
	
	public String format(double d) {
		return String.format("%.2f", d);
	}
}