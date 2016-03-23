package com.whatsapp.notification;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

final class am extends an {
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "M~DIc[p^\u0002b\u0000pG\u0003yAxMIgOdG\u0004cKc";
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
                        i3 = 46;
                        break;
                    case at.g /*1*/:
                        i3 = 17;
                        break;
                    case at.i /*2*/:
                        i3 = 41;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    default:
                        i3 = 11;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "{\u007fL\u001f{Kr]\u0002o\u000etQ\u0004n^e@\be\u00021E\u0006~@rA\u0002y\u000egL\u0015xG~GG6\u000e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "^pJ\fjIt";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "LpM\u0000n@dD\u0005n\\";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "MyH\tlKNK\u0006oIt";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "M}H\u0014x";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "M~DIc[p^\u0002b\u0000pG\u0003yAxMIgOdG\u0004cKc";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "M~G\u0013n@e\u0013H$M~DIc[p^\u0002b\u0000pG\u0003yAxMIgOdG\u0004cKc\u0007\u0014nZe@\tl]>K\u0006oIt\u0006";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public List m1029a() {
        return Collections.singletonList(z[0]);
    }

    private int a() {
        try {
            return d().getPackageManager().getPackageInfo(z[7], 0).versionCode;
        } catch (Throwable e) {
            Log.c(e);
            return -1;
        }
    }

    am() {
    }

    @SuppressLint({"NewApi"})
    public void a(int i) {
        try {
            if (VERSION.SDK_INT >= 11 && a() > 63006) {
                Bundle bundle = new Bundle();
                bundle.putString(z[3], c());
                bundle.putString(z[6], b());
                bundle.putInt(z[4], i);
                try {
                    d().getContentResolver().call(Uri.parse(z[1]), z[5], null, bundle);
                } catch (Throwable e) {
                    Log.b(z[2] + a(), e);
                }
            }
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }
}
