package finalwork.view.commands;

public class AllNotes extends Command {
    public AllNotes(View view) {
        super(view);
    }

    @Override
    public String description() {
        return "Все заметки";
    }

    public void execute() {
        printAll();
    }	

}
