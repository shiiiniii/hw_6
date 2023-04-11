package finalwork.model;

import java.io.IOException;


import finalwork.presenter.Presenter;

public class Model {
    
    private String str;

    private static StringBuilder sb;
    private Presenter presenter;


    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public void open(String folderPath, String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            fileName = fileName + ".txt";
        }
    }

    private void record() throws IOException {
        System.out.println("Введите текст: ");
        sb.append(str + "\n");
        recordFile(str);
        back();
    }


    private void back() throws IOException{
        presenter.back();
    }


    private void recordFile(String str) throws IOException{
        FileWriter fw = new FileWriter( "file.txt", true );
        fw.write(str + "\n");
        fw.close();
    }
}
