package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.util.Log;
import com.whatsapp.arj;
import java.lang.reflect.Method;
import org.v;
import org.whispersystems.at;

class DrawableCompatJellybeanMr1 {
    private static Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "\u001cC\f'C\u0016I\r\u001ff\u0006T\u001d\bV\u0006I\u0016";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 111;
                        break;
                    case at.g /*1*/:
                        i3 = 38;
                        break;
                    case at.i /*2*/:
                        i3 = 120;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    default:
                        i3 = 34;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ")G\u0011\u0007G\u000b\u0006\f\u0004\u0002\u0006H\u000e\u0004I\n\u0006\u000b\u000eV#G\u0001\u0004W\u001bb\u0011\u0019G\fR\u0011\u0004LGO\u0016\u001f\u000bOP\u0011\n\u0002\u001dC\u001e\u0007G\fR\u0011\u0004L";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "+T\u0019\u001cC\rJ\u001d(M\u0002V\u0019\u001fh\nJ\u0014\u0012@\nG\u0016&P^";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "+T\u0019\u001cC\rJ\u001d(M\u0002V\u0019\u001fh\nJ\u0014\u0012@\nG\u0016&P^";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ")G\u0011\u0007G\u000b\u0006\f\u0004\u0002\u001dC\f\u0019K\nP\u001dKQ\nR4\n[\u0000S\f/K\u001dC\u001b\u001fK\u0000HP\u0002L\u001b\u000fX\u0006G\u001bN\u0017\u000f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void setLayoutDirection(Drawable drawable, int i) {
        if (!sSetLayoutDirectionMethodFetched) {
            try {
                sSetLayoutDirectionMethod = Drawable.class.getDeclaredMethod(z[0], new Class[]{Integer.TYPE});
                sSetLayoutDirectionMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i(z[4], z[1], e);
            }
            sSetLayoutDirectionMethodFetched = true;
        }
        if (sSetLayoutDirectionMethod != null) {
            try {
                sSetLayoutDirectionMethod.invoke(drawable, new Object[]{Integer.valueOf(i)});
            } catch (Throwable e2) {
                Log.i(z[3], z[2], e2);
                sSetLayoutDirectionMethod = null;
            }
        }
    }
}
