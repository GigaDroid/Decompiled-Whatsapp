package com.whatsapp;

import android.content.Intent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class av_ implements OnCheckedChangeListener {
    private static final String[] z;
    final CheckBox a;
    final TosUpdateDetailsActivity b;

    static {
        String[] strArr = new String[2];
        String str = "CX\u0016<ZSV\u0011,NRC\u0004 FD\u0018\u0016,^ER\u0016<FC\u0017";
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
                        i3 = 55;
                        break;
                    case at.g /*1*/:
                        i3 = 55;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 42;
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
                    str = "XG\u0011\u0016EBC";
                    obj = null;
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean z2;
        boolean z3 = true;
        Intent intent = new Intent();
        String str = z[1];
        if (this.a.isChecked()) {
            z2 = false;
        } else {
            z2 = true;
        }
        intent.putExtra(str, z2);
        this.b.setResult(0, intent);
        if (TosUpdateDetailsActivity.b(this.b) != null) {
            TosUpdateDetailsActivity.b(this.b).cancel();
        }
        TosUpdateDetailsActivity.a(this.b, Toast.makeText(this.b.getApplicationContext(), this.b.getString(this.a.isChecked() ? 2131232164 : 2131232163), 1));
        TosUpdateDetailsActivity.b(this.b).setGravity(17, 0, 0);
        TosUpdateDetailsActivity.b(this.b).show();
        StringBuilder append = new StringBuilder().append(z[0]);
        if (this.a.isChecked()) {
            z3 = false;
        }
        Log.i(append.append(z3).toString());
    }

    av_(TosUpdateDetailsActivity tosUpdateDetailsActivity, CheckBox checkBox) {
        this.b = tosUpdateDetailsActivity;
        this.a = checkBox;
    }
}
