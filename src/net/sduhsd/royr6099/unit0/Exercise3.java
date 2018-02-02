package net.sduhsd.royr6099.unit0;

public class Exercise3 {
	public static void main(String[] args) {
		double population = 312032486;
		
		int sec_per_year = 365 * 24 * 3600;
		
		double annual_births = sec_per_year / 7.0;
		double annual_deaths = sec_per_year / 13.0;
		double annual_immigr = sec_per_year / 45.0;
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Year " + i + " Population: " + (int)population);
			population += (annual_births + annual_immigr - annual_deaths);
		}
	}
}
