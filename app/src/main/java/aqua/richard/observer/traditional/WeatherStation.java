package aqua.richard.observer.traditional;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
  private List<IDisplay> observers = new ArrayList<>();
  private int temperature;

  public void addObserver(IDisplay display) {
    observers.add(display);
  }

  public void removeObserver(IDisplay display) {
    observers.remove(display);
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    notifyObserver();
  }

  public void notifyObserver() {
    for (IDisplay display : observers) {
      display.update(temperature);
    }
  }
}
