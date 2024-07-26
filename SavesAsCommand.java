public class SavesAsCommand implements Command {
    @Override
    public void execute(TextEditor editor) {
        editor.saveAsFile();
    }
}
