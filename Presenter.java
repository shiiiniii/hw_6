package finalwork.presenter;

import java.io.IOException;

import finalwork.model.Model;
import finalwork.view.View;

public class Presenter {
    
    private View view;
    private Model model;

    public Presenter(View view, Model model){
        this.view = view;
        this.model = model;
        view.setPresenter(this);
        model.setPresenter(this);
    }
    

    public void onClick(int choice) throws IOException{

        model.choice(choice);
    }

    public void back() throws IOException{
        view.start();
    }


    public boolean isFull() {
        return !notebook.isEmpty();
    }
}
