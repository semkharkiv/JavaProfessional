package myLessons.autoTask;

import org.w3c.dom.stylesheets.LinkStyle;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CopyWriter {

    //—записывать в текстовый файл всех девелоперов в формате : Jonn-[auto: BMW ::: salary: 12345] в столбик.
    public void copyInfoInTxT(List<Developer> developers)  {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("developers_info.txt"))) {
            for (Developer developer : developers) {
                String line = developer.getName() + " [auto - " + developer.getCar().getBrand() + " ::: salary: " + developer.getSalary() + " ]";
                printWriter.println(line);
            }
        }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
