


import good.FileWriter;
import good.Writer;

import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
       // Writter w = new Writter();
        //w.writeToFile(WriteTypes.FILE,"Sawani");

        Writer writer=new FileWriter();
        writer.write("Hello World");


    }
}