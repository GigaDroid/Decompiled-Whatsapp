package android.support.v4.text;

import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

class ICUCompatIcs {
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;
    private static final String[] z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 70;
                    break;
                case at.g /*1*/:
                    i2 = 124;
                    break;
                case at.i /*2*/:
                    i2 = 58;
                    break;
                case at.o /*3*/:
                    i2 = 61;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 86);
        }
        return toCharArray;
    }

    static {
        Object obj = -1;
        String[] strArr = new String[4];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "\u000f?o~9+\f[I\u001f%\u000f";
        Object obj2 = -1;
        while (true) {
            str = z(z(str));
            switch (obj2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000f?o~9+\f[I\u001f%\u000f";
                    i = 2;
                    strArr2 = strArr3;
                    obj2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u000f?o~9+\f[I\u001f%\u000f";
                    obj2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        Class cls = Class.forName(z(z("*\u0015X^94\u0019\u0014T53Rs~\u0003")));
                        if (cls != null) {
                            String str2 = "!\u0019Nn54\u0015JI";
                            Class cls2 = cls;
                            while (true) {
                                str2 = z(z(str2));
                                switch (obj) {
                                    case v.m /*0*/:
                                        sAddLikelySubtagsMethod = cls2.getMethod(str2, new Class[]{String.class});
                                        return;
                                    default:
                                        sGetScriptMethod = cls2.getMethod(str2, new Class[]{String.class});
                                        str2 = "'\u0018^q?-\u0019VD\u00053\u001eN\\15";
                                        obj = null;
                                        cls2 = cls;
                                }
                                throw e;
                            }
                        } else {
                            return;
                        }
                    } catch (Exception e) {
                        throw e;
                    } catch (Throwable e2) {
                        sGetScriptMethod = null;
                        sAddLikelySubtagsMethod = null;
                        Log.w(z(z("\u000f?o~9+\f[I\u001f%\u000f")), e2);
                        return;
                    }
                default:
                    strArr2[i] = str;
                    str = "\u000f?o~9+\f[I\u001f%\u000f";
                    i = 1;
                    strArr2 = strArr3;
                    obj2 = null;
                    break;
            }
        }
    }

    private static String addLikelySubtags(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (sAddLikelySubtagsMethod != null) {
                return (String) sAddLikelySubtagsMethod.invoke(null, new Object[]{locale2});
            }
        } catch (Throwable e) {
            Log.w(z[2], e);
        } catch (Throwable e2) {
            Log.w(z[3], e2);
        }
        return locale2;
    }

    private static String getScript(String str) {
        try {
            if (sGetScriptMethod != null) {
                return (String) sGetScriptMethod.invoke(null, new Object[]{str});
            }
        } catch (Throwable e) {
            Log.w(z[0], e);
        } catch (Throwable e2) {
            Log.w(z[1], e2);
        }
        return null;
    }

    public static String maximizeAndGetScript(Locale locale) {
        boolean z = TextUtilsCompatJellybeanMr1.a;
        String addLikelySubtags = addLikelySubtags(locale);
        if (addLikelySubtags != null) {
            return getScript(addLikelySubtags);
        }
        if (!z) {
            return null;
        }
        RemoteInput.a++;
        return null;
    }
}
