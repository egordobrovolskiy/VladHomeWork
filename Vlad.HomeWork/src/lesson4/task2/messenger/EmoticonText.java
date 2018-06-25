package lesson4.task2.messenger;

import java.util.HashMap;
import java.util.Map;

public class EmoticonText  implements Text {
    private static Map<String, String> mapEmoticon = new HashMap<>();
    private String emoticon;
    static {
        mapEmoticon.put("winking-face", "\uD83D\uDE09");
        mapEmoticon.put("ghost", "\uD83D\uDC7B");
    }

    EmoticonText(String emoticon) {
        this.emoticon = emoticon;
    }

    @Override
    public String print() {
        return mapEmoticon.get(emoticon);
    }
    public void addEmoticon(String name, String picture) {
        mapEmoticon.put(name, picture);
    }

}
