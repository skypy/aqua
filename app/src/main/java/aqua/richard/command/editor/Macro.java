package aqua.richard.command.editor;

import java.util.*;
import java.text.*;

public class Macro {
  private final List<IAction> actions;

  public Macro() {
    actions = new ArrayList<>();
  }

  public void record(IAction action)
    throws Exception
  {
    actions.add(action);
  }

  public void run() {
    actions.forEach(IAction::perform);
  }
}
