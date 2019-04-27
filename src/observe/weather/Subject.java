package observe.weather;

import observe.weather.Observer;

/**
 * 主题接口
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-27 下午9:10
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
