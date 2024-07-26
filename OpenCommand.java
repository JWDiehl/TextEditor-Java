public class OpenCommand implements Command {
    @Override
    public void execute(TextEditor editor) {
        editor.openFile();
    }
}
