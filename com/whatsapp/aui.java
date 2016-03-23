package com.whatsapp;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class aui implements OnClickListener {
    private static final String[] z;
    final NewGroup a;

    static {
        String[] strArr = new String[2];
        String str = "_Vl:";
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
                        i3 = 53;
                        break;
                    case at.g /*1*/:
                        i3 = 63;
                        break;
                    case at.i /*2*/:
                        i3 = 8;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 127;
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
                    str = "_Vl:";
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        if (NewGroup.c(this.a).getText().toString().trim().length() == 0) {
            App.b(this.a.getBaseContext(), this.a.getString(2131231546), 0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Intent intent = new Intent(this.a, GroupMembersSelector.class);
        Object stringExtra = this.a.getIntent().getStringExtra(z[1]);
        if (!TextUtils.isEmpty(stringExtra)) {
            intent.putExtra(z[0], stringExtra);
        }
        this.a.startActivityForResult(intent, 1);
    }

    aui(NewGroup newGroup) {
        this.a = newGroup;
    }
}
