package good;

public class FileWriter implements Writer {


    @Override
    public void write(String s) {
        System.out.println("write to File" + s);
    }
}
