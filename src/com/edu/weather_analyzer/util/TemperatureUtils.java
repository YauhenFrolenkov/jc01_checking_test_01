package com.edu.weather_analyzer.util;

import com.edu.weather_analyzer.model.WeatherDay;

public final class TemperatureUtils {
	
	private TemperatureUtils() {
	}

	public static double[] getAverageTemperatures(WeatherDay[] days) {
		if (days == null || days.length == 0) {
			return new double[0];
		}
		
		double[] averages = new double[days.length];
		for (int i = 0; i < days.length; i++) {
			averages[i] = days[i].getAverageTemp();
		}
		return averages;
	}

}
