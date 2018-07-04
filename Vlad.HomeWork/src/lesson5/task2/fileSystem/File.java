package lesson5.task2.fileSystem;

public class File extends NamedFSItem {
    private final int size;

    File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File {" +
                "name = " + super.getName() +
                " size = " + size +
                " } ";
    }
}
