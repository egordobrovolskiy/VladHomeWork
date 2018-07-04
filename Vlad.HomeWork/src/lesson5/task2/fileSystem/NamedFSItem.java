package lesson5.task2.fileSystem;

public abstract class NamedFSItem implements FSItem {
    private final String name;

    NamedFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "NamedFSItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
