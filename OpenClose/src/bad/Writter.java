package bad;

public class Writter {
    public void writeToFile(WriteTypes writeType, String content) {

        switch (writeType) {
            case FILE:
                System.out.println("Writing to file");
            case SOCKET:
                System.out.println("Writing to Socket");
        }
    }
}
