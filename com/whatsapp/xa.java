package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class xa implements Runnable {
    private static final String[] z;
    final String a;
    final boolean b;
    final ConversationsFragment c;

    static {
        String[] strArr = new String[3];
        String str = "0L";
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
                        i3 = 16;
                        break;
                    case at.g /*1*/:
                        i3 = 100;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 36;
                        break;
                    default:
                        i3 = 61;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "s\u000bmRXb\u0017bPT\u007f\np\u000bOu\u0002qANx^#JR0\u0012jAJ0\u0002lV\u001d";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "s\u000bmRXb\u0017bPT\u007f\np\u000bZb\u000bvT\u0012d\u000bdCQu#qKH`4qKZb\u0001pW_q\u0016,\u001e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    xa(ConversationsFragment conversationsFragment, String str, boolean z) {
        this.c = conversationsFragment;
        this.a = str;
        this.b = z;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        Log.i(z[1] + this.a);
        View b = ConversationsFragment.b(this.c, this.a);
        if (b != null) {
            if (this.b) {
                b.findViewById(2131755580).setVisibility(0);
                if (!z) {
                    return;
                }
            }
            b.findViewById(2131755580).setVisibility(8);
            if (!z) {
                return;
            }
        }
        Log.w(z[2] + this.a + " " + ConversationsFragment.l(this.c).getFirstVisiblePosition() + "-" + ConversationsFragment.l(this.c).getLastVisiblePosition() + z[0] + ConversationsFragment.l(this.c).getCount() + ")");
    }
}
