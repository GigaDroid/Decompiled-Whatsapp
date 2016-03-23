package de.greenrobot.event;

import org.v;
import org.whispersystems.at;

public enum n {
    ;
    
    public static final n Async;
    public static final n BackgroundThread;
    public static final n MainThread;
    public static final n PostThread;
    public static int b;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "bYW\u007fL";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 35;
                        break;
                    case at.g /*1*/:
                        i4 = 42;
                        break;
                    case at.i /*2*/:
                        i4 = 46;
                        break;
                    case at.o /*3*/:
                        i4 = 17;
                        break;
                    default:
                        i4 = 47;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "sE]e{KXKpK";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "nKG\u007f{KXKpK";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    PostThread = new n(z[2], 0);
                    MainThread = new n(z[3], 1);
                    BackgroundThread = new n(z[1], 2);
                    Async = new n(z[0], 3);
                    a = new n[]{PostThread, MainThread, BackgroundThread, Async};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "aKMzHQE[\u007fKwB\\tNG";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
