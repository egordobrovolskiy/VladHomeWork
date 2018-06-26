package lesson4.task2.messenger;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PictureText implements Text {

private static Properties prop = new Properties();

    private static final String PICTURE_PROPERTIES = "picture.properties";
    private static final String PICTURE_RESERVE = "lesson4/task2/messenger/properties/picture_save.properties";

    static {
        try (InputStream inputStream = new FileInputStream(PICTURE_PROPERTIES)) {
            prop.load(inputStream);
        } catch (IOException e) {
            System.err.println(e + " Резервания копия");
            try (InputStream streamReserve = PictureText.class.getClassLoader().getResourceAsStream(PICTURE_RESERVE)) {
                prop.load(streamReserve);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
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
        try (OutputStream writer = new FileOutputStream(PICTURE_PROPERTIES)) {
            prop.store(writer, null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
