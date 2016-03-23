package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ViewUtils {
    private static Method sComputeFitSystemWindowsMethod;
    private static final String[] z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 91;
                    break;
                case at.g /*1*/:
                    i2 = 111;
                    break;
                case at.i /*2*/:
                    i2 = 76;
                    break;
                case at.o /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 121);
        }
        return toCharArray;
    }

    public static void makeOptionalFitsSystemWindows(View view) {
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod(z[6], new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException e) {
                throw e;
            } catch (Throwable e2) {
                Log.d(z[3], z[5], e2);
            } catch (Throwable e22) {
                Log.d(z[8], z[2], e22);
            } catch (NoSuchMethodException e3) {
                Log.d(z[7], z[4]);
            }
        }
    }

    public static boolean isLayoutRtl(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    public static int combineMeasuredStates(int i, int i2) {
        return i | i2;
    }

    public static void computeFitSystemWindows(View view, Rect rect, Rect rect2) {
        if (sComputeFitSystemWindowsMethod != null) {
            try {
                sComputeFitSystemWindowsMethod.invoke(view, new Object[]{rect, rect2});
            } catch (Throwable e) {
                Log.d(z[1], z[0], e);
            }
        }
    }

    static {
        String[] strArr = new String[9];
        String str = "\u0018\u00009W\u001d{\u0001#OY2\u0001:T\u0012>O/T\u0014+\u001a8^?2\u001b\u001fB\n/\n!l\u00105\u000b#L\n";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            str = z(z(str));
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0018\u00009W\u001d{\u0001#OY2\u0001:T\u0012>O!Z\u0012> <O\u00104\u0001-W?2\u001b?h\u0000(\u001b)V.2\u0001(T\u000e(";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\r\u0006)L,/\u0006 H";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0018\u00009W\u001d{\u0001#OY=\u0006\"_Y6\n8S\u0016?O!Z\u0012> <O\u00104\u0001-W?2\u001b?h\u0000(\u001b)V.2\u0001(T\u000e(Alt\u0011{\u0018)W\u0015uAb";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0018\u00009W\u001d{\u0001#OY2\u0001:T\u0012>O!Z\u0012> <O\u00104\u0001-W?2\u001b?h\u0000(\u001b)V.2\u0001(T\u000e(";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "6\u000e'^6+\u001b%T\u0017:\u0003\nR\r(<5H\r>\u0002\u001bR\u0017?\u0000;H";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\r\u0006)L,/\u0006 H";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\r\u0006)L,/\u0006 H";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    if (VERSION.SDK_INT >= 18) {
                        try {
                            sComputeFitSystemWindowsMethod = View.class.getDeclaredMethod(z(z("8\u0000!K\f/\n\nR\r\b\u0016?O\u001c68%U\u001d4\u0018?")), new Class[]{Rect.class, Rect.class});
                            if (!sComputeFitSystemWindowsMethod.isAccessible()) {
                                sComputeFitSystemWindowsMethod.setAccessible(true);
                                return;
                            }
                            return;
                        } catch (NoSuchMethodException e) {
                            Log.d(z(z("\r\u0006)L,/\u0006 H")), z(z("\u0018\u00009W\u001d{\u0001#OY=\u0006\"_Y6\n8S\u0016?O/T\u0014+\u001a8^?2\u001b\u001fB\n/\n!l\u00105\u000b#L\nuO\u0003SY,\n WW")));
                            return;
                        }
                    }
                    return;
                default:
                    strArr2[i] = str;
                    str = "\r\u0006)L,/\u0006 H";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
