package aqua.richard.observer.traditional;

import static aqua.lib.Logger.*;

public class PhoneDisplay implements IDisplay {
  @Override
  public void update(int temperature) {
    log("Phone display temperature updated to: = " + temperature);
  }
}
