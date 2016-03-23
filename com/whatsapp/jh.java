package com.whatsapp;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import com.whatsapp.messaging.be;
import org.v;
import org.whispersystems.at;

final class jh implements be {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\u0006\u001d7f&<\u0017&w\"\n\u0013&K*\u0006\u00160u \u0006:,v-";
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
                        i3 = 99;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.i /*2*/:
                        i3 = 67;
                        break;
                    case at.o /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 71;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0006\u001d7f&<\u0017&w\"\n\u0013&K*\u0006\u00160u \u0006";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0011\u0000 q.\u0015\u0000\u001cy\"\u0010\u0016\"s\"";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\f\u0007)4.\rE\u0000u+\u000fE\u000eq4\u0010\u0004$qg\n\u0016cz(\u0017E\u0013u5\u0000\u0000/u%\u000f\u0000";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    jh() {
    }

    public void a(Message message) {
        Intent intent = new Intent(z[3], null, App.z(), VoiceService.class);
        if (message.obj != null) {
            try {
                Parcelable parcelable = (Parcelable) message.obj;
                message.obj = null;
                intent.putExtra(z[0], parcelable);
            } catch (ClassCastException e) {
                throw new RuntimeException(z[1]);
            }
        }
        intent.putExtra(z[2], message);
        App.z().startService(intent);
    }
}
