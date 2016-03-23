package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class GroupMembersSelector extends MultipleContactsSelector {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\n(s1<\u0000?q&)\u001f)o! \b9h+>B9n!-\u0019?";
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
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 90;
                        break;
                    case at.i /*2*/:
                        i3 = 28;
                        break;
                    case at.o /*3*/:
                        i3 = 68;
                        break;
                    default:
                        i3 = 76;
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
                    str = "\n(s1<\u0000?q&)\u001f)o! \b9h+>B>y78\u001f5e";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u00073x7";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected int f() {
        return 2131231009;
    }

    protected int e() {
        return a59.c;
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[0]);
        super.onCreate(bundle);
    }

    protected int g() {
        return 1;
    }

    protected int k() {
        return 2131231349;
    }

    public void onDestroy() {
        Log.i(z[2]);
        super.onDestroy();
    }

    protected String c() {
        return getString(2131230791).toUpperCase();
    }

    protected String j() {
        return getString(2131231545);
    }

    protected void d() {
        Object b = b();
        if (TextUtils.isEmpty(b)) {
            App.b((Context) this, getString(2131231570), 0);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(z[1], b);
        setResult(-1, intent);
        finish();
    }
}
