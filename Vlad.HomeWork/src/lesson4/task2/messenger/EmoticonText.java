package lesson4.task2.messenger;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class EmoticonText  implements Text {
//    private static Map<String, String> mapEmoticon = new HashMap<>();
//    static {
//        mapEmoticon.put("winking-face", "\uD83D\uDE09");
//        mapEmoticon.put("ghost", "\uD83D\uDC7B");
//    }

    private String emoticon;

    private static Properties prop = new Properties();
    static {
        try (InputStream inputStream = EmoticonText.class.getClassLoader().getResourceAsStream("lesson4/task2/messenger/properties/emotions.properties")) {
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    EmoticonText(String emoticon) {
        this.emoticon = emoticon;
    }

    @Override
    public String print() {
        return prop.getProperty(emoticon);
    }
    public void addEmoticon(String name, String picture) {
        prop.put(name, picture);
    }
    static Set<String> getEmotion(){
        return prop.stringPropertyNames();
    }

}
