package ch2;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		// Register currentDisplay as an observer
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(30, 65, 30.4f);
		weatherData.setMeasurements(32, 70, 29.2f);
		weatherData.setMeasurements(28, 90, 29.2f);

	}

}
