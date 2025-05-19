package com.edu.weather_analyzer.model;

import java.util.Objects;

public class WeatherDay {
	private String date;
	private int morningTemp;
    private int dayTemp;
    private int eveningTemp;
    
    public WeatherDay() {
    }
    
    public WeatherDay(String date, int morningTemp, int dayTemp, int eveningTemp) {
    	this.date = date;
    	this.morningTemp = morningTemp;
    	this.dayTemp = dayTemp;
        this.eveningTemp = eveningTemp;
    }

	public String getDate() {
		return date;
	}

	public int getMorningTemp() {
		return morningTemp;
	}

	public int getDayTemp() {
		return dayTemp;
	}

	public int getEveningTemp() {
		return eveningTemp;
	}
    
    public double getAverageTemp() {
        return (morningTemp + dayTemp + eveningTemp) / 3.0;
    }

	@Override
	public int hashCode() {
		return Objects.hash(date, dayTemp, eveningTemp, morningTemp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeatherDay other = (WeatherDay) obj;
		return Objects.equals(date, other.date) && dayTemp == other.dayTemp && eveningTemp == other.eveningTemp
				&& morningTemp == other.morningTemp;
	}

	@Override
	public String toString() {
		return "WeatherDay [date=" + date + ", morningTemp=" + morningTemp + ", dayTemp=" + dayTemp + ", eveningTemp="
				+ eveningTemp + "]";
	}
    
 
}
