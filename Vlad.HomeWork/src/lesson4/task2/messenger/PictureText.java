package lesson4.task2.messenger;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PictureText implements Text {

private static Properties prop = new Properties();

    private static final String PICTURE_PROPERTIES = "picture.properties";
    private static final String DIR_PROPERTIES = "\\Vlad.HomeWork\\src\\lesson4\\task2\\messenger\\properties";
    private static final String PICTURE_RESERVE = "lesson4/task2/messenger/properties/picture.properties";

    static {
        try (InputStream streamReserve = PictureText.class.getClassLoader().getResourceAsStream(PICTURE_RESERVE)) {
            prop.load(streamReserve);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String textPicture;

    PictureText(String textPicture) {
        this.textPicture = textPicture;
    }

    @Override
    public String print() {
        return prop.getProperty(textPicture);
    }

    static void addPicture(String name, String picture) {
        prop.put(name, picture);
    }

    static Set<String> getPictures() {
        return prop.stringPropertyNames();
    }

    static void saveProperties() {
        String path = new File("").getAbsolutePath() + DIR_PROPERTIES;
        new File(path).mkdirs();
        File file = new File(path, PICTURE_PROPERTIES);
        try (OutputStream writer = new FileOutputStream(file)) {
            prop.store(writer, null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
