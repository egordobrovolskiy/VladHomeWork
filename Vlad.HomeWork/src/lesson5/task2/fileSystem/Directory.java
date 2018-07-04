package lesson5.task2.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends NamedFSItem {
    private List<FSItem> items;

    Directory(String name) {
        super(name);
        items = new ArrayList<>();
    }

    public Directory add(FSItem item) {
        loopingValidator(item);
        items.add(item);
        return this;
    }

    private void loopingValidator(FSItem item) {
        if (item instanceof Directory) {
            if (((Directory) item).getItems().contains(this)) throw new IllegalArgumentException();
        }
    }

    @Override
    public int getSize() {
        int result = 0;
        for (FSItem item : items) {
            result += item.getSize();
        }
        return result;
    }

    public List<FSItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "\n<" + super.getName() + "> " +
                "items = " + items +
                "</" + super.getName() + ">\n " +
                "   }" +
                "\n    ================================\n";
    }
}
