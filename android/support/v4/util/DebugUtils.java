package android.support.v4.util;

import org.v;
import org.whispersystems.at;

public class DebugUtils {
    private static final String z;

    static {
        char[] toCharArray = "Re#X".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 60;
                    break;
                case at.g /*1*/:
                    i2 = 16;
                    break;
                case at.i /*2*/:
                    i2 = 79;
                    break;
                case at.o /*3*/:
                    i2 = 52;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static void buildShortClassTag(Object obj, StringBuilder stringBuilder) {
        if (obj == null) {
            stringBuilder.append(z);
            if (!LruCache.a) {
                return;
            }
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName == null || simpleName.length() <= 0) {
            simpleName = obj.getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        stringBuilder.append(simpleName);
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
