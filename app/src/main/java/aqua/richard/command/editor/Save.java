package aqua.richard.command.editor;

public class Save implements IAction {
  private final IEditor editor;

  public Save(IEditor editor) {
    this.editor = editor;
  }

  @Override
  public void perform() {
    editor.save();
  }
}
