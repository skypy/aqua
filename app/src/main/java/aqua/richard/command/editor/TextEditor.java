package aqua.richard.command.editor;

import static aqua.lib.Logger.*;

public class TextEditor implements IEditor {
  public void save() {
    log("save text editor...");
  }

  public void open() {
    log("open text editor...");
  }

  public void close() {
    log("close text editor...");
  }
}
