package sk.kosickakademia.cingelova.homework;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadWriteFiles rwFile=new ReadWriteFiles();

        rwFile.changetext("resource/git.txt");
    }

}



