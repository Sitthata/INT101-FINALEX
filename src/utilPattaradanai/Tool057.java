package utilPattaradanai;

import valuablePattaradanai.Item057;

public class Tool057 {

    public static boolean isUsable057(String str) {
        return str != null && !str.isBlank();
    }

    public static boolean isUsable057(Object[] obj) {
        return obj != null && obj.length != 0;
    }

    public static int count057(Object[] obj) {
        if(!isUsable057(obj)) return -1;
        return obj.length;
    }
}
