package com.whatsapp.memory;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.view.View;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class e {
    private static Field a;
    private static final String[] z;

    static {
        String[] strArr = new String[13];
        String str = "4WG\u0017p/L\u0013C";
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
                        i3 = 87;
                        break;
                    case at.g /*1*/:
                        i3 = 56;
                        break;
                    case at.i /*2*/:
                        i3 = 41;
                        break;
                    case at.o /*3*/:
                        i3 = 99;
                        break;
                    default:
                        i3 = 21;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0010QG\u0004p%Z[\u0006t3n@\u0006b\u0003YN/p6Sa\u0002v<\u0017Y\u0002g2V]<v8V]\u0006m#\u0002\t";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0010QG\u0004p%Z[\u0006t3n@\u0006b\u0003YN/p6Sa\u0002v<\u0017]\u0002r$\u0018F\u0001\u007f2[]C|$\u0018G\u0016y;";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0010QG\u0004p%Z[\u0006t3n@\u0006b\u0003YN/p6Sa\u0002v<\u0017";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ">Kv\u0000z9LL\u001ba\bO[\u0002e'][Y5";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "#YNY5";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0010QG\u0004p%Z[\u0006t3n@\u0006b\u0003YN/p6Sa\u0002v<\u0017O\n{6Tv\u0000z9LL\u001bam\u0018";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ">Kv\u0002v#Q_\na.\u0002\t";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0010QG\u0004p%Z[\u0006t3n@\u0006b\u0003YN/p6Sa\u0002v<\u0017Z\u0016v4]Z\u0010s\"T\u0013C";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0010QG\u0004p%Z[\u0006t3n@\u0006b\u0003YN/p6Sa\u0002v<\u0017D\u0006a?WMC{8L\t\u0005z\"VM";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "$lH\u0004f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0010QG\u0004p%Z[\u0006t3n@\u0006b\u0003YN/p6Sa\u0002v<\u0017F\u0001\u007f2[]C{8L\t\u0005z\"VM";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0010QG\u0004p%Z[\u0006t3n@\u0006b\u0003YN/p6Sa\u0002v<\u0017]\u0002r$\u0018F\u0001\u007f2[]Cv8MG\u00175>K\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean a() {
        return VERSION.SDK_INT <= 10;
    }

    private static Field b() {
        if (a == null) {
            try {
                a = View.class.getDeclaredField(z[11]);
                a.setAccessible(true);
            } catch (Throwable e) {
                Log.a(z[12], e);
                return null;
            }
        }
        return a;
    }

    public static boolean a(Activity activity) {
        int i = d.a;
        WeakHashMap c = c();
        if (c == null) {
            Log.i(z[3]);
            return false;
        }
        boolean z;
        Log.i(z[1] + c.size());
        Set<View> hashSet = new HashSet();
        for (View view : c.keySet()) {
            Object context = view.getContext();
            Log.i(new StringBuilder(z[4]).append(z[6]).append(view).append(z[0]).append(context).append(z[5]).append(context instanceof ContextWrapper).append(z[8]).append(context instanceof Activity).toString());
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
                Log.i(z[2] + context);
                if (i != 0) {
                    break;
                }
            }
            if (context != null || i != 0) {
                Log.i(z[7] + context);
                if (activity.equals(context)) {
                    hashSet.add(view);
                }
                if (i != 0) {
                    break;
                }
            }
        }
        for (View view2 : hashSet) {
            c.remove(view2);
            if (i != 0) {
                break;
            }
        }
        if (hashSet.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Log.i(z[9] + z);
        if (WAAppCompatActivity.c != 0) {
            d.a = i + 1;
        }
        return z;
    }

    private static WeakHashMap c() {
        Field b = b();
        if (b == null) {
            return null;
        }
        try {
            return (WeakHashMap) b.get(null);
        } catch (Throwable e) {
            Log.a(z[10], e);
            return null;
        }
    }
}
