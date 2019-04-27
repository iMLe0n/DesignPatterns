package observe;

import observe.weather.CurrentConditionsDisplay;
import observe.weather.WeatherData;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-27 下午10:06
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
