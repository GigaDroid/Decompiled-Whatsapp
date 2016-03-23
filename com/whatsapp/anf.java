package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class anf implements Runnable {
    private static final String[] z;
    final co a;
    final Conversation b;

    static {
        String[] strArr = new String[2];
        String str = "\u0012\u001c";
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
                        i3 = 50;
                        break;
                    case at.g /*1*/:
                        i3 = 52;
                        break;
                    case at.i /*2*/:
                        i3 = 74;
                        break;
                    case at.o /*3*/:
                        i3 = 31;
                        break;
                    default:
                        i3 = 78;
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
                    str = "Q[$i+@G+k']Zem+TF/l&\b\u0014$pnD]/hnT[8?";
                    obj = null;
            }
        }
    }

    anf(Conversation conversation, co coVar) {
        this.b = conversation;
        this.a = coVar;
    }

    public void run() {
        View findViewWithTag = this.b.bc.findViewWithTag(this.a);
        if (findViewWithTag != null) {
            ((ConversationRow) findViewWithTag).l();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        if (!Conversation.m(this.b).contains(this.a)) {
            Conversation.m(this.b).add(this.a);
            Log.w(z[1] + this.a.k.b + " " + this.b.bc.getFirstVisiblePosition() + "-" + this.b.bc.getLastVisiblePosition() + z[0] + this.b.bc.getCount() + ")");
        }
    }
}
