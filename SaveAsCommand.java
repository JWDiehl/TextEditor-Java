public class SaveAsCommand implements Command {
    @Override
    public void execute(TextEditor editor) {
        editor.saveAsFile();
    }
}
