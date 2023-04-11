package finalwork.view;

import java.io.IOException;
import java.util.Scanner;

import finalwork.presenter.Presenter;

public class View {
    private Presenter presenter;
    private Scanner scanner;

    public View(){
        scanner = new Scanner(System.in);
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }
    

    public void start() throws IOException{
        int choice = scan();
        presenter.onClick(choice);
    }

    public void showAll() {
        if (presenter.isFull()) {
            System.out.println(presenter.printAll());
        } else System.out.println("Записей нет");
    }
    
    
    private int scan(){
        System.out.println("1. Вход\n 2. Посмотреть все записи\n 3.Выход");
        int choice = scanner.nextInt();
        return choice;
    }
}
