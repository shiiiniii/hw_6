package finalwork;

import finalwork.model.Model;
import finalwork.presenter.Presenter;
import finalwork.view.View;

public class Main {
    public static void main(String[] args) throws Exception {
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter(view, model);

        view.start();
    }
}
