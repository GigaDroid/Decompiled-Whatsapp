package android.support.v7.graphics.drawable;

import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class DrawableUtils {
    private static final String z;

    static {
        char[] toCharArray = "u8h".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 52;
                    break;
                case at.g /*1*/:
                    i2 = 124;
                    break;
                case at.i /*2*/:
                    i2 = 44;
                    break;
                case at.o /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static Mode parseTintMode(int i, Mode mode) {
        switch (i) {
            case at.o /*3*/:
                return Mode.SRC_OVER;
            case at.m /*5*/:
                return Mode.SRC_IN;
            case Y.l /*9*/:
                return Mode.SRC_ATOP;
            case arj.Toolbar_titleMarginEnd /*14*/:
                return Mode.MULTIPLY;
            case arj.Toolbar_titleMarginTop /*15*/:
                return Mode.SCREEN;
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                if (VERSION.SDK_INT >= 11) {
                    return Mode.valueOf(z);
                }
                return mode;
            default:
                return mode;
        }
    }
}
