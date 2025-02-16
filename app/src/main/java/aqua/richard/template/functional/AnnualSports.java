package aqua.richard.template.functional;

public class AnnualSports {
  public void play(Runnable init,
                   Runnable start,
                   Runnable end) {
    init.run();
    start.run();
    end.run();
  }
}
