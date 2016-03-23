package de.greenrobot.event.util;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.whatsapp.arj;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

public class k {
    public static Class a;
    public static int b;
    private static final String[] z;

    public static Dialog a(Context context, Bundle bundle, OnClickListener onClickListener) {
        boolean z = g.b;
        Builder builder = new Builder(context);
        try {
            builder.setTitle(bundle.getString(z[2]));
            builder.setMessage(bundle.getString(z[3]));
            if (b != 0) {
                builder.setIcon(b);
            }
            builder.setPositiveButton(17039370, onClickListener);
            Dialog create = builder.create();
            if (z) {
                h.p++;
            }
            return create;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static void a(DialogInterface dialogInterface, int i, Activity activity, Bundle bundle) {
        if (a != null) {
            try {
                c.g.a.b().a(a.newInstance());
            } catch (Throwable e) {
                throw new RuntimeException(z[1], e);
            }
        }
        if (bundle.getBoolean(z[0], false) && activity != null) {
            try {
                activity.finish();
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "\rE'Zn\fEgOs\u000bO}\u0013y\u001fEgI~\u001cS'Xn\u001bO{Yu\bLfZ2\u000fIgTo\u0001\u007fh[h\fRVYu\bLfZ";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i4 = 32;
                        break;
                    case at.i /*2*/:
                        i4 = 9;
                        break;
                    case at.o /*3*/:
                        i4 = 61;
                        break;
                    default:
                        i4 = 28;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\rE'Zn\fEgOs\u000bO}\u0013y\u001fEgI~\u001cS'Xn\u001bO{Yu\bLfZ2\u001dI}Qy";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "\rE'Zn\fEgOs\u000bO}\u0013y\u001fEgI~\u001cS'Xn\u001bO{Yu\bLfZ2\u0004EzN}\u000eE";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    b = 0;
                    return;
                default:
                    strArr2[i2] = str;
                    str = ",VlShIChSr\u0006T)_yICfSo\u001dR|^h\fD";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
