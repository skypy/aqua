package aqua.richard.observer.functional;

@FunctionalInterface
public interface IObserver {
  void update(int score);
}
