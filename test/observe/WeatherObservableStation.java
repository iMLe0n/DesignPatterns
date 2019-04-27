package observe;

import observe.weatherObservable.CurrentConditionsDisplay;
import observe.weatherObservable.WeatherData;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-27 下午10:51
 */
public class WeatherObservableStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
