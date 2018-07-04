package lesson4.task2.messenger;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class EmoticonText implements Text {

    private static final String EMOTIONS_PROPERTIES = "emotions.properties";
    private static final String DIR_PROPERTIES = "\\Vlad.HomeWork\\src\\lesson4\\task2\\messenger\\properties";
    private static final String EMOTICON_RESERVE = "lesson4/task2/messenger/properties/emotions.properties";
    private static Properties prop = new Properties();

    static {
        try (InputStream streamReserve = EmoticonText.class.getClassLoader().getResourceAsStream(EMOTICON_RESERVE)) {
            prop.load(streamReserve);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String emoticon;

    EmoticonText(String emoticon) {
        this.emoticon = emoticon;
    }

    //избавиться от второго / во время добавления (не решено)
    static void addEmoticon(String name, String picture) {
        prop.put(name, picture);
    }

    static Set<String> getEmotion() {
        return prop.stringPropertyNames();
    }

    static void saveProperties() {
        String path = new File("").getAbsolutePath() + DIR_PROPERTIES;
        new File(path).mkdirs();
        File file = new File(path, EMOTIONS_PROPERTIES);
        try (OutputStream writer = new FileOutputStream(file)) {
            prop.store(writer, null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String print() {
        return prop.getProperty(emoticon);
    }
}
