public class NewCommand implements Command {
    @Override
    public void execute(TextEditor editor) {
        editor.newFile();
    }
}
