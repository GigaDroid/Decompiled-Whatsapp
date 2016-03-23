package android.support.v4.os;

import org.v;
import org.whispersystems.at;

public class OperationCanceledException extends RuntimeException {
    private static final String z;

    static {
        char[] toCharArray = "m\u001aIj(I\u0017^+3P\u001dBj/X\u0001\f(\"\\\u001c\f)&W\u0011I&\"]\\".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 57;
                    break;
                case at.g /*1*/:
                    i2 = 114;
                    break;
                case at.i /*2*/:
                    i2 = 44;
                    break;
                case at.o /*3*/:
                    i2 = 74;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public OperationCanceledException(String str) {
        if (str == null) {
            str = z;
        }
        super(str);
    }

    public OperationCanceledException() {
        this(null);
    }
}
