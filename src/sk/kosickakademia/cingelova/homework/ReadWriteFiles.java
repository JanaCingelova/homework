package sk.kosickakademia.cingelova.homework;
import java.io.*;

public class ReadWriteFiles {
    public void changetext(String fileName) throws IOException {
        BufferedReader reader;
        try {

            FileReader fr = new FileReader(fileName);
            File file = new File("");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            reader = new BufferedReader(fr);
            String retazec = "";
            String line = null;
            retazec+=line+'\n';
            char[] arr = new char[retazec.length()];

            while ((line = reader.readLine())!=null) {

                for (int i = 0; i < retazec.length(); i++) {
                    arr[i] = retazec.charAt(i);
                    if (arr[i] == 'i')
                        fw.write("y");
                    else if (arr[i] == 'y')
                        fw.write("i");
                    else if (arr[i] == '?')
                        continue;
                    else fw.write(arr[i]);
                }
                fr.close();
                fw.close();
            }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}