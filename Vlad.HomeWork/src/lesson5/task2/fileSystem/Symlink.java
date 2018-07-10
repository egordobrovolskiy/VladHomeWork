package lesson5.task2.fileSystem;

public class Symlink {
    private static final int SIZE = 1;
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
        return SIZE;
    }

    @Override
    public String toString() {
        return "Symlink{" +
                "symlinkName='" + symlinkName + '\'' +
                ", SIZE=" + SIZE +
                ", item=" + item +
                '}';
    }
}
