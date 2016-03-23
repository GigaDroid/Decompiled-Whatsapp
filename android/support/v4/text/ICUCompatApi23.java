package android.support.v4.text;

import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.util.Log;
import com.whatsapp.arj;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

public class ICUCompatApi23 {
    private static Method sAddLikelySubtagsMethod;
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "s\b\u0017*\u0018W;#\u001d>Y8";
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
                        i3 = 58;
                        break;
                    case at.g /*1*/:
                        i3 = 75;
                        break;
                    case at.i /*2*/:
                        i3 = 66;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    default:
                        i3 = 119;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        char c2;
                        int i4;
                        char[] toCharArray2 = "V\" \n\u0018H.l\u0000\u0014Oe\u000b*\"".toCharArray();
                        i = toCharArray2.length;
                        toCharArray = toCharArray2;
                        for (int i5 = 0; i > i5; i5++) {
                            c2 = toCharArray[i5];
                            switch (i5 % 5) {
                                case v.m /*0*/:
                                    i4 = 58;
                                    break;
                                case at.g /*1*/:
                                    i4 = 75;
                                    break;
                                case at.i /*2*/:
                                    i4 = 66;
                                    break;
                                case at.o /*3*/:
                                    i4 = arj.Theme_radioButtonStyle;
                                    break;
                                default:
                                    i4 = 119;
                                    break;
                            }
                            toCharArray[i5] = (char) (i4 ^ c2);
                        }
                        Class cls = Class.forName(new String(toCharArray).intern());
                        toCharArray2 = "[/&%\u001eQ..\u0010$O)6\b\u0010I".toCharArray();
                        i3 = toCharArray2.length;
                        char[] cArr2 = toCharArray2;
                        for (i = 0; i3 > i; i++) {
                            c2 = cArr2[i];
                            switch (i % 5) {
                                case v.m /*0*/:
                                    i4 = 58;
                                    break;
                                case at.g /*1*/:
                                    i4 = 75;
                                    break;
                                case at.i /*2*/:
                                    i4 = 66;
                                    break;
                                case at.o /*3*/:
                                    i4 = arj.Theme_radioButtonStyle;
                                    break;
                                default:
                                    i4 = 119;
                                    break;
                            }
                            cArr2[i] = (char) (i4 ^ c2);
                        }
                        String intern = new String(cArr2).intern();
                        sAddLikelySubtagsMethod = cls.getMethod(intern, new Class[]{Locale.class});
                        return;
                    } catch (Throwable e) {
                        throw new IllegalStateException(e);
                    }
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "s\b\u0017*\u0018W;#\u001d>Y8";
                    obj = null;
            }
        }
    }

    public static String maximizeAndGetScript(Locale locale) {
        String script;
        boolean z = TextUtilsCompatJellybeanMr1.a;
        try {
            return ((Locale) sAddLikelySubtagsMethod.invoke(null, new Object[]{locale})).getScript();
        } catch (Throwable e) {
            Log.w(z[1], e);
            try {
                script = locale.getScript();
                if (RemoteInput.a != 0) {
                    TextUtilsCompatJellybeanMr1.a = z;
                }
                return script;
            } catch (InvocationTargetException e2) {
                throw e2;
            } catch (InvocationTargetException e22) {
                throw e22;
            }
        } catch (Throwable e3) {
            Log.w(z[0], e3);
            script = locale.getScript();
            if (RemoteInput.a != 0) {
                if (z) {
                }
                TextUtilsCompatJellybeanMr1.a = z;
            }
            return script;
        }
    }
}
