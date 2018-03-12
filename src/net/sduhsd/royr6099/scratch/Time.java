package net.sduhsd.royr6099.scratch;

public class Time {
	private int hour, minute, second;
	
	public void setTime(long elapsedTime) {
		long totalSec = elapsedTime / 1000;
		second = (int) (totalSec % 60);
		
		long totalMin = totalSec / 60;
		minute = (int) (totalMin % 60);
		
		long totalHour = totalMin / 60;
		hour = (int) (totalHour % 60);
	}
	
	public Time() {
		long ms = System.currentTimeMillis();
		
		setTime(ms);
	}
	
	public Time(int ms) {
		setTime(ms);
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
}
