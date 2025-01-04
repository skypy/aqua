package aqua.richard.command.editor;

public class Close implements IAction {
  private final IEditor editor;

  public Close(IEditor editor) {
    this.editor = editor;
  }

  @Override
  public void perform() {
    editor.close();
  }
}
