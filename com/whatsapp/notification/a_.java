package com.whatsapp.notification;

import android.content.Intent;
import com.whatsapp.arj;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

final class a_ extends an {
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "\f\u0002\u007f[,\u0006\u0018{[,\u0006\u0018{\u001d.\u0002\b ";
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
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 18;
                        break;
                    case at.o /*3*/:
                        i3 = 117;
                        break;
                    default:
                        i3 = 65;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\f\u0002\u007f[,\u0006\u0018{[,\u0006\u0018{\u0019(\u001b\b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u000e\u0003v\u0007.\u0006\t<\u00141\u001fC_\u001c4\u0006#}\u0001(\t\u0004q\u00145\u0006\u0002|";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u000e\u0003v\u0007.\u0006\t<\u001c/\u001b\b|\u0001o\u000e\u000ef\u001c.\u0001CS%\u0011#$Q4\u0015&\"\\*\f*>A4\u0006*2G%\u0005.9W";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000e\u0003v\u0007.\u0006\t<\u001c/\u001b\b|\u0001o\n\u0015f\u0007 A\u0018b\u0011 \u001b\bM\u00141\u001f\u0001{\u0016 \u001b\u0004}\u001b\u001e\f\u0002\u007f\u0005.\u0001\b|\u0001\u001e\u0001\f\u007f\u0010";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u000e\u0003v\u0007.\u0006\t<\u001c/\u001b\b|\u0001o\n\u0015f\u0007 A\u0018b\u0011 \u001b\bM\u00141\u001f\u0001{\u0016 \u001b\u0004}\u001b\u001e\u0002\ba\u0006 \b\bM\u0001$\u0017\u0019";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0002\ba\u0006 \b\bQ\u001a4\u0001\u0019";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\f\u0002\u007f[,\u0006\u0018{[,\u0006\u0018{\u001d.\u0002\b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a_() {
    }

    public List a() {
        return Arrays.asList(new String[]{z[2], z[1], z[0]});
    }

    public void a(int i) {
        try {
            Object newInstance = Class.forName(z[3]).newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField(z[7]);
            declaredField.setAccessible(true);
            declaredField.set(newInstance, Integer.valueOf(i));
        } catch (Exception e) {
            Intent intent = new Intent(z[4]);
            try {
                intent.putExtra(z[5], c() + "/" + b());
                intent.putExtra(z[6], String.valueOf(i == 0 ? "" : Integer.valueOf(i)));
                d().sendBroadcast(intent);
            } catch (Exception e2) {
                throw e2;
            }
        }
    }
}
