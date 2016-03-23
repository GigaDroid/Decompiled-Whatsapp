package android.support.v4.view;

import android.content.Context;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import java.lang.reflect.Field;
import org.v;
import org.whispersystems.at;

class LayoutInflaterCompatHC {
    private static boolean sCheckedField;
    private static Field sLayoutInflaterFactory2Field;
    private static final String[] z;

    class FactoryWrapperHC extends FactoryWrapper implements Factory2 {
        FactoryWrapperHC(LayoutInflaterFactory layoutInflaterFactory) {
            super(layoutInflaterFactory);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.mDelegateFactory.onCreateView(view, str, context, attributeSet);
        }
    }

    static {
        String[] strArr = new String[7];
        String str = "/\u0016tm&-\"l<";
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
                        i3 = 66;
                        break;
                    case at.g /*1*/:
                        i3 = 80;
                        break;
                    case at.i /*2*/:
                        i3 = 21;
                        break;
                    case at.o /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "$?gm7\u00115aH3!$z|+ppVa'.45`=6psg<&psg7.45)?\u00041vz=0)')r->5m>##f.";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "yp|`4.1ag=,pxo+b8tx7b%{k*25vz7&pgk!7<a}|";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u000e1la'6\u0019{h>#$p|\u0011-=eo&\n\u0013";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000e1la'6\u0019{h>#$p|\u0011-=eo&\n\u0013";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "yp|`4.1ag=,pxo+b8tx7b%{k*25vz7&pgk!7<a}|";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "$?gm7\u00115aH3!$z|+ppva'.45`=6pfk&b$}kr\u00041vz=0)'.=,pYo+-%aG<$<tz70p";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void forceSetFactory2(LayoutInflater layoutInflater, Factory2 factory2) {
        try {
            if (!sCheckedField) {
                try {
                    sLayoutInflaterFactory2Field = LayoutInflater.class.getDeclaredField(z[0]);
                    sLayoutInflaterFactory2Field.setAccessible(true);
                } catch (Throwable e) {
                    Log.e(z[5], z[2] + LayoutInflater.class.getName() + z[3], e);
                }
                sCheckedField = true;
            }
            try {
                if (sLayoutInflaterFactory2Field != null) {
                    try {
                        sLayoutInflaterFactory2Field.set(layoutInflater, factory2);
                    } catch (Throwable e2) {
                        Log.e(z[4], z[1] + layoutInflater + z[6], e2);
                    }
                }
            } catch (NoSuchFieldException e3) {
                throw e3;
            }
        } catch (IllegalAccessException e4) {
            throw e4;
        }
    }

    static void setFactory(LayoutInflater layoutInflater, LayoutInflaterFactory layoutInflaterFactory) {
        Factory2 factoryWrapperHC;
        int i = WindowInsetsCompat.a;
        if (layoutInflaterFactory != null) {
            factoryWrapperHC = new FactoryWrapperHC(layoutInflaterFactory);
        } else {
            factoryWrapperHC = null;
        }
        layoutInflater.setFactory2(factoryWrapperHC);
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof Factory2) {
            forceSetFactory2(layoutInflater, (Factory2) factory);
            if (i != 0) {
                RemoteInput.a++;
            } else {
                return;
            }
        }
        forceSetFactory2(layoutInflater, factoryWrapperHC);
    }
}
