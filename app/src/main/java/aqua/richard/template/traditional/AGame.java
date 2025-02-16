package aqua.richard.template.traditional;

public abstract class AGame {
  public final void play() {
    init();
    start();
    end();
  }

  protected abstract void init();
  protected abstract void start();
  protected abstract void end();
}
