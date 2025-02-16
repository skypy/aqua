package aqua.richard.observer.functional;

import java.util.ArrayList;
import java.util.List;

public class ScoreManager {
  private List<IObserver> observers = new ArrayList<>();
  private int score;

  public void addObserver(IObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(IObserver observer) {
    observers.remove(observer);
  }

  public void setScore(int score) {
    this.score = score;
    notifyObserver();
  }

  public void notifyObserver() {
    for (IObserver observer : observers) {
      observer.update(score);
    }
  }
}
