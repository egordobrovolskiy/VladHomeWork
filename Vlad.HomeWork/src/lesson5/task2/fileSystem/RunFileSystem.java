package lesson5.task2.fileSystem;

public class RunFileSystem {
    public static void main(String[] args) throws InterruptedException {
        addFluentItems();

        System.out.println("==================================================");

        createSymlink();

        System.out.println("==================================================");

        //стек ошибок оттделить от стека информации (без засыпания текст ошибки перемешивается с информативной часью
        System.out.println("Expect an exception:");
        Thread.sleep(100);

        // must be IllegalArgumentException
        tryCyclicDirectory();
    }

    private static void tryCyclicDirectory() {
        Directory d1 = new Directory("d1");
        Directory d2 = new Directory("d2");

        d2.add(d1);
        d1.add(d2);
    }

    private static void createSymlink() {
        File file = new File("hello.txt", 10);
        Symlink symlink = new Symlink("my-doc.txt", file);
        System.out.println(symlink.getSymlinkName());
    }

    private static void addFluentItems() {
        Directory dir = new Directory("music")
                .add(new Directory("classic")
                        .add(new File("beethoven-symphony9.mp3", 4000))
                )
                .add(new Directory("rock")
                        .add(new File("wind-of-change.mp3", 2000))
                        .add(new File("riders-on-the-storm.mp3", 2500))
                )
                .add(new File("unknown-music.mp3", 500));

        System.out.println(dir);
    }
}
