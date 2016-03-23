package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.gdrive.dg;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class bm implements ServiceConnection {
    private static final String[] z;
    final ConversationsFragment a;

    static {
        String[] strArr = new String[2];
        String str = "9\u0017u\u001f\u0002(\u000bz\u001d\u000e5\u0016hF\u0000>\nr\u001f\u0002w\u000b~\u001b\u00113\u001b~D\u00033\u000bx\u0006\t4\u001dx\u001d\u0002>";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = 120;
                        break;
                    case at.i /*2*/:
                        i3 = 27;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    default:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "9\u0017u\u001f\u0002(\u000bz\u001d\u000e5\u0016hF\u0000>\nr\u001f\u0002w\u000b~\u001b\u00113\u001b~D\u00045\u0016u\f\u0004.\u001d\u007f";
                    obj = null;
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ConversationsFragment.p(this.a).a(ConversationsFragment.n(this.a));
        ConversationsFragment.a(this.a, null);
        Log.i(z[0]);
    }

    bm(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ConversationsFragment.a(this.a, ((dg) iBinder).a());
        ConversationsFragment.a(this.a, new ga(this.a, null));
        bq.a(new aek(this));
        Log.i(z[1]);
    }
}
