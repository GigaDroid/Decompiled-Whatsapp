package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class tr implements OnClickListener {
    private static final String[] z;
    final Conversation a;

    static {
        String[] strArr = new String[3];
        String str = "1YJO<;YfU9";
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
                        i3 = 92;
                        break;
                    case at.g /*1*/:
                        i3 = 60;
                        break;
                    case at.i /*2*/:
                        i3 = 57;
                        break;
                    case at.o /*3*/:
                        i3 = 60;
                        break;
                    default:
                        i3 = 93;
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
                    str = "8NXK<>P\\c48";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ",YKQ4/OPS3/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    tr(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        Conversation.k(this.a).dismiss();
        if (App.u(this.a) || !(RequestPermissionActivity.c(this.a, Conversation.S()) || RequestPermissionActivity.b(this.a, Conversation.S()))) {
            Conversation.V(this.a);
        } else {
            this.a.startActivityForResult(new Intent(this.a, RequestPermissionActivity.class).putExtra(z[2], 2130839700).putExtra(z[1], Conversation.S()).putExtra(z[0], 2131231622), 34);
        }
    }
}
