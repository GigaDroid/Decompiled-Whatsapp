package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

class y4 extends ap {
    private static final String[] z;
    final ConversationRowLocation b;
    final String c;

    static {
        String[] strArr = new String[2];
        String str = "2\u0001eT\u001fuZ";
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
                        i3 = 117;
                        break;
                    case at.i /*2*/:
                        i3 = 17;
                        break;
                    case at.o /*3*/:
                        i3 = 36;
                        break;
                    default:
                        i3 = 37;
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
                    str = ";\u001buVJ3\u0011?MK.\u0010\u007fP\u000b;\u0016eMJ4[Gm`\r";
                    obj = null;
            }
        }
    }

    public void a(View view) {
        Uri parse = Uri.parse(this.c);
        if (parse.getScheme() == null) {
            parse = Uri.parse(z[0] + this.c);
        }
        try {
            this.b.getContext().startActivity(new Intent(z[1], parse));
        } catch (ActivityNotFoundException e) {
            App.a(App.z().getApplicationContext(), 2131230782, 0);
        }
    }

    y4(ConversationRowLocation conversationRowLocation, String str) {
        this.b = conversationRowLocation;
        this.c = str;
    }
}
