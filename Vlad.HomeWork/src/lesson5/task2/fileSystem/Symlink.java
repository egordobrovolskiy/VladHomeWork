package lesson5.task2.fileSystem;

public class Symlink {
    private final int size = 1;
    private String symlinkName;
    private FSItem item;

    public Symlink(String symlinkName, FSItem item) {
        this.symlinkName = symlinkName;
        this.item = item;
    }

    public String getSymlinkName() {
        return symlinkName + " -> " + item.getName();

    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Symlink{" +
                "symlinkName='" + symlinkName + '\'' +
                ", size=" + size +
                ", item=" + item +
                '}';
    }
}
