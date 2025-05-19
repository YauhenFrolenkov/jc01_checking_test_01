package com.edu.weather_analyzer.main;

import com.edu.weather_analyzer.model.WeatherDay;
import com.edu.weather_analyzer.service.WeatherAnalyzer;
import com.edu.weather_analyzer.ui.ConsolePrinter;

public class Main {

	public static void main(String[] args) {
		
			WeatherDay[] week = new WeatherDay[] {
				new WeatherDay("2024-04-24", 10, 15, 12),
		        new WeatherDay("2024-04-25", 12, 16, 13),
		        new WeatherDay("2024-04-26", 11, 15, 14),
		        new WeatherDay("2024-04-27", 13, 18, 15),
		        new WeatherDay("2024-04-28", 15, 20, 17),
		        new WeatherDay("2024-04-29", 17, 22, 19),
		        new WeatherDay("2024-04-30", 16, 21, 18)
			};
			
			int[] result = WeatherAnalyzer.findIncreasingPeriod(week);
			ConsolePrinter.printIncreasingPeriod(week, result[0], result[1]);
			
	}

}


