package aqua.richard.template.functional;

import static aqua.lib.Logger.*;

public class SportsManager {
  public void manage() {
    AnnualSports event = new AnnualSports();
    event.play(() -> log("prepare swimming event"),
               () -> log("start swimming event"),
               () -> log("end swimming event"));

    event.play(() -> log("prepare running event"),
               () -> log("start running event"),
               () -> log("end running event"));
  }
}
