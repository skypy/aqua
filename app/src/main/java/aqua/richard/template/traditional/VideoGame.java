package aqua.richard.template.traditional;

import static aqua.lib.Logger.*;

public class VideoGame extends AGame {

  @Override
  protected void init() {
    log("Video game initialized..");
  }

  @Override
  protected void start() {
    log("Video game started..");
  }

  @Override
  protected void end() {
    log("Video game finished..");
  }
}
