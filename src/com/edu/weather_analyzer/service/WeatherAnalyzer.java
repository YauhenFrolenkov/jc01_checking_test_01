package com.edu.weather_analyzer.service;

import com.edu.weather_analyzer.model.WeatherDay;
import com.edu.weather_analyzer.util.TemperatureUtils;

public class WeatherAnalyzer {

	public static int[] findIncreasingPeriod(WeatherDay[] days) {
		if (days == null || days.length < 2) {
			return new int[] { 0, 0 };
		}

		double[] avgTemps = TemperatureUtils.getAverageTemperatures(days);
		return findLongestIncreasingSegment(avgTemps);
	}

	private static int[] findLongestIncreasingSegment(double[] avgTemps) {
		int maxStart = 0;
		int maxLength = 1;

		int currentStart = 0;
		int currentLength = 1;

		for (int i = 1; i < avgTemps.length; i++) {
			if (avgTemps[i] > avgTemps[i - 1]) {
				currentLength++;
			} else {
				if (currentLength > maxLength) {
					maxLength = currentLength;
					maxStart = currentStart;
				}
				currentStart = i;
				currentLength = 1;
			}
		}

		if (currentLength > maxLength) {
			maxLength = currentLength;
			maxStart = currentStart;
		}

		return new int[] { maxStart, maxLength };
	}
}
