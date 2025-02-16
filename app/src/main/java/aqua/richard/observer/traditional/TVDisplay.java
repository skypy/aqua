package aqua.richard.observer.traditional;

import static aqua.lib.Logger.*;

public class TVDisplay implements IDisplay {
  @Override
  public void update(int temperature) {
    log("TV display temperature  updated to: = " + temperature);
  }
}
