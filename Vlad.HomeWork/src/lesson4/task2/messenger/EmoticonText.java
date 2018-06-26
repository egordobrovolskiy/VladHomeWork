package lesson4.task2.messenger;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class EmoticonText  implements Text {

    private String emoticon;

    private static Properties prop = new Properties();
    private static final String EMOTIONS_PROPERTIES = "emotions.properties";
    private static final String EMOTICON_RESERVE = "lesson4/task2/messenger/properties/emotions_save.properties";

    static {
        try (InputStream inputStream = new FileInputStream(EMOTIONS_PROPERTIES)) {
            prop.load(inputStream);
        } catch (IOException e) {
            System.err.println(e + " Резервания копия");
            try (InputStream streamReserve = EmoticonText.class.getClassLoader().getResourceAsStream(EMOTICON_RESERVE)) {
                prop.load(streamReserve);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    EmoticonText(String emoticon) {
        this.emoticon = emoticon;
    }

    @Override
    public String print() {
        return prop.getProperty(emoticon);
    }

    //избавиться от второго / во время добавления (не решено)
    static void addEmoticon(String name, String picture) {
        prop.put(name, picture);
    }

    static Set<String> getEmotion(){
        return prop.stringPropertyNames();
    }

    // сохранять в указанную папку (не решено)
    static void saveProperties() {
        try (OutputStream writer = new FileOutputStream(EMOTIONS_PROPERTIES)) {
            prop.store(writer, null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
