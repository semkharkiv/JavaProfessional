package main.summaryFriday._19_05_2023;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//1. Создайте файл, используя FileOutputStream,
// с текстом: "This is my first experience when I myself
// work with IO API. I can do everything!"
//2. Создайте файл используя new File() в каталоге folder,
// убедитесь, что файл существует, удалите файл.
public class FileCreatedAndDeleted {
    public static void main(String[] args) {
        String text = "This is my first experience when I myself\n" +
                "// work with IO API. I can do everything!";
        String fileName= "output.txt";
//1
        try(FileOutputStream output = new FileOutputStream(fileName)){
            output.write(text.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//2
        String folderName = "src/main/summaryFriday";
        File folder = new File(folderName);
        File file = new File(folder,fileName);
        try{
            if (file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File exists");
            }
            if (file.exists()){
                System.out.println("File exists");
            }
            else {
                System.out.println("File doesn't exist");
            }
            if (file.delete()){
                System.out.println("File deleted");
            }else {
                System.out.println("Don't find file");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
