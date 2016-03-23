package android.support.v7.view.menu;

import org.v;
import org.whispersystems.at;

class BaseWrapper {
    private static final String z;
    final Object mWrappedObject;

    static {
        char[] toCharArray = "\u001c\u0000wa;.\u00166^)!\u0017uek(\u0013x1%$\u00066s.k\u001cc}'e".toCharArray();
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
                    i2 = 114;
                    break;
                case at.i /*2*/:
                    i2 = 22;
                    break;
                case at.o /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    BaseWrapper(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(z);
        }
        this.mWrappedObject = obj;
    }
}
