package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.arj;
import java.lang.reflect.Method;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class ViewCompatEclairMr1 {
    private static Method sChildrenDrawingOrderMethod;
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "=sK\n\u0000\r=^\u0007L\u0001s\\\u0007\u0007\r=I\u0000\u0005\u0004yX\r\u0002,oK\u001f\u0005\u0006ze\u001a\b\roo\u0006\r\nqO\f";
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
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 29;
                        break;
                    case at.i /*2*/:
                        i3 = 42;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    default:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "=sK\n\u0000\r=^\u0007L\u000etD\fL\u000buC\u0004\b\u001axD,\u001e\tjC\u0006\u000b'oN\r\u001e-sK\n\u0000\ry";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ">tO\u001f/\u0007pZ\t\u0018";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ">tO\u001f/\u0007pZ\t\u0018";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "=sK\n\u0000\r=^\u0007L\u0001s\\\u0007\u0007\r=I\u0000\u0005\u0004yX\r\u0002,oK\u001f\u0005\u0006ze\u001a\b\roo\u0006\r\nqO\f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "=sK\n\u0000\r=^\u0007L\u0001s\\\u0007\u0007\r=I\u0000\u0005\u0004yX\r\u0002,oK\u001f\u0005\u0006ze\u001a\b\roo\u0006\r\nqO\f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001bx^+\u0004\u0001qN\u001a\t\u0006YX\t\u001b\u0001sM'\u001e\fxX-\u0002\t\u007fF\r\b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ">tO\u001f/\u0007pZ\t\u0018";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ">tO\u001f/\u0007pZ\t\u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z) {
        try {
            if (sChildrenDrawingOrderMethod == null) {
                try {
                    sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod(z[7], new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e(z[8], z[2], e);
                }
                sChildrenDrawingOrderMethod.setAccessible(true);
            }
            try {
                sChildrenDrawingOrderMethod.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.e(z[1], z[0], e2);
            } catch (Throwable e22) {
                Log.e(z[4], z[5], e22);
            } catch (Throwable e222) {
                Log.e(z[3], z[6], e222);
            }
        } catch (IllegalAccessException e3) {
            throw e3;
        }
    }
}
