package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.a;
import com.whatsapp.fieldstats.i;
import org.v;
import org.whispersystems.at;

class a9h implements OnClickListener {
    private static final String[] z;
    final ConversationsFragment a;

    static {
        String[] strArr = new String[4];
        String str = "\u0003\u0004\u0018w\u001b\u0005)\u001ad\u0000\u0015\u0006\"b\u0006\u0010)\u001ey\u001a\u000e\u0002";
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
                        i3 = 96;
                        break;
                    case at.g /*1*/:
                        i3 = 118;
                        break;
                    case at.i /*2*/:
                        i3 = 125;
                        break;
                    case at.o /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 111;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0003\u0019\u00108\u0018\b\u0017\te\u000e\u0010\u0006\"f\u001d\u0005\u0010\u0018d\n\u000e\u0015\u0018e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0003\u0004\u0018w\u001b\u0005)\u001ad\u0000\u0015\u0006\"b\u0006\u0010)\t\u007f\u0002\u0005";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0003\u0004\u0018w\u001b\u0005)\u001ad\u0000\u0015\u0006\"b\u0006\u0010)\u001ey\u001a\u000e\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a9h(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }

    public void onClick(View view) {
        i.a(App.z(), a.GROUP_CREATE_BANNER_CANCEL, Integer.valueOf(1));
        this.a.f.setVisibility(8);
        SharedPreferences sharedPreferences = App.z().getSharedPreferences(z[2], 0);
        int i = sharedPreferences.getInt(z[0], 0);
        Editor edit = sharedPreferences.edit();
        edit.putInt(z[1], i + 1);
        edit.putLong(z[3], System.currentTimeMillis());
        edit.commit();
    }
}
