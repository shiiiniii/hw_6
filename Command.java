package finalwork.view.commands;

public abstract class Command {

	   private final View view;

	   public Command(View view) {
	      this.view = view;
	   }

	   public abstract String description();

	   public View getConsole() {
	      return view;
	   }

	   public abstract void execute();
	}
