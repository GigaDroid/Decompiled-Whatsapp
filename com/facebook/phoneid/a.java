package com.facebook.phoneid;

import com.whatsapp.arj;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.v;
import org.whispersystems.at;

public final class a {
    private static final Set a;

    public static boolean a(String str) {
        return a.contains(str);
    }

    static {
        Set hashSet = new HashSet();
        String str = "\"fz- \"={&\u0019zFr-G\u0013=Q$\u0012&oj\u0017\u00059g";
        Object obj = -1;
        HashSet hashSet2 = hashSet;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 75;
                        break;
                    case at.g /*1*/:
                        i2 = 12;
                        break;
                    case at.i /*2*/:
                        i2 = 2;
                        break;
                    case at.o /*3*/:
                        i2 = 97;
                        break;
                    default:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    hashSet2.add(str);
                    str = "\u0018~;\f\u0002\u001bGM$\u001d$:L\u0018\u0019%UlYZxhXR?\"U";
                    obj = 1;
                    hashSet2 = hashSet;
                    break;
                case at.g /*1*/:
                    hashSet2.add(str);
                    str = "\u0004GFR[\u001aT/&:|KVVR{\\q\u0010\u001bstF\u0003[~g";
                    hashSet2 = hashSet;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    hashSet2.add(str);
                    a = Collections.unmodifiableSet(hashSet);
                    return;
                default:
                    hashSet2.add(str);
                    str = "3[/R[\u0011K4;\u001d\u001fj@)5\u0011f3/>(z4\u0006+#I";
                    hashSet2 = hashSet;
                    obj = null;
                    break;
            }
        }
    }
}
