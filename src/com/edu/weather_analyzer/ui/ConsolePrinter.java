package com.edu.weather_analyzer.ui;

import com.edu.weather_analyzer.model.WeatherDay;

public class ConsolePrinter {
	
	public static void printIncreasingPeriod(WeatherDay[] days, int startIndex, int length) {
		if (length > 1) {
            int endIndex = startIndex + length - 1;
            System.out.println("Период повышения температуры:");
            System.out.println("Начало: " + days[startIndex].getDate());
            System.out.println("Конец: " + days[endIndex].getDate());
            System.out.println("Длина периода: " + length + " дней");
        } else {
            System.out.println("Непрерывного периода повышения температуры не найдено.");
        }
	}
	

}
