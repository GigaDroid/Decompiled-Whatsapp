package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

class yv extends ap {
    private static final String[] z;
    final ConversationRowContact b;

    static {
        String[] strArr = new String[3];
        String str = "s|Xr";
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
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = 60;
                        break;
                    case at.o /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 57;
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
                    str = "ov]s]";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "i}So\\j";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(View view) {
        Intent intent = new Intent(this.b.getContext(), ViewSharedContactActivity.class);
        intent.putStringArrayListExtra(z[1], ConversationRowContact.a(this.b));
        intent.putStringArrayListExtra(z[0], ConversationRowContact.d(this.b));
        intent.putExtra(z[2], this.b.e.c());
        this.b.getContext().startActivity(intent);
    }

    private yv(ConversationRowContact conversationRowContact) {
        this.b = conversationRowContact;
    }

    yv(ConversationRowContact conversationRowContact, ee eeVar) {
        this(conversationRowContact);
    }
}
