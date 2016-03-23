package com.whatsapp.notification;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class ax extends an {
    private static final String[] z;

    static {
        String[] strArr = new String[14];
        String str = "!\u00015N('\rv\u00015&\u001c7\t?l\u000f(\u0010u'\u000f+\u00197#\u001b6\u00033'\u001c";
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
                        i3 = 110;
                        break;
                    case at.i /*2*/:
                        i3 = 88;
                        break;
                    case at.o /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 91;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "!\u00015N('\rv\u00015&\u001c7\t?l\u000f(\u0010u6\u00194\u0001.,\r0\u0005)";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "!\u00015N('\rv\u00015&\u001c7\t?l\u000b5\u0005)%\u000b6\u0003\".\u000f-\u000e8*\u000b*";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = " \u000f<\u0007>!\u0001-\u000e/";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "2\u000f;\u000b:%\u000be_{\u0003 \u001c@8.\u000f+\u0013f}";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "#\u0000<\u00124+\nv\t56\u000b6\u0014u#\r,\t4,@\u001a!\u001f\u0005+\u0007#\u0014\u0017 \f?\u000e\u0012*\u00194\u001e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "!\u00029\u0013(";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = " \u000f<\u0007>\u001d\r7\u0015561(\u00018)\u000f?\u0005\u0004,\u000f5\u0005";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "2\u000f;\u000b:%\u000b";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "5\u0007<\u0007>6\u001e*\u000f-+\n=\u0012t7\u001e<\u0001/'\f9\u0004<'";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "!\u00016\u0014>,\u001abOt!\u00015N('\rv\u0002:&\t=O:2\u001e+";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = " \u000f<\u0007>\u001d\r7\u001556";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = " \u000f<\u0007>\u001d\r7\u0015561;\f:1\u001d\u0007\u000e:/\u000b";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "!\u00015N('\rv\u00015&\u001c7\t?l\u000f(\u0010u.\u000f-\u000e8*\u000b*";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public List a() {
        return Arrays.asList(new String[]{z[1], z[2], z[0], z[3]});
    }

    ax() {
    }

    public void a(int i) {
        if (VERSION.SDK_INT < 22) {
            String c = c();
            try {
                Uri parse = Uri.parse(z[11]);
                ContentResolver contentResolver = d().getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put(z[9], c);
                contentValues.put(z[7], b());
                contentValues.put(z[4], Integer.valueOf(i));
                if (contentResolver.update(parse, contentValues, z[5], new String[]{c, b()}) == 0) {
                    contentResolver.insert(parse, contentValues);
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable e2) {
                Log.b(z[10], e2);
            }
            if (!an.a) {
                return;
            }
        }
        Intent intent = new Intent(z[6]);
        intent.putExtra(z[12], i);
        intent.putExtra(z[8], c());
        intent.putExtra(z[13], b());
        d().sendBroadcast(intent);
    }
}
