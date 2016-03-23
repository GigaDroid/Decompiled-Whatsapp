package com.whatsapp;

import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.support.annotation.Nullable;
import com.whatsapp.util.Log;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class fz implements o6 {
    private static final String[] z;
    final ChangeNumber a;

    static {
        String[] strArr = new String[9];
        String str = "\u0003~<\u0003+\bp%^=\u0010a\u000e].\u0005w4_9\u000er4^";
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
                        i3 = 17;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 92;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0010y";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0003r";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0003y0C;\u0005\u007f$@>\u0005c";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\rt";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0016~8N9?c4Y.\u0019N%D1\u0005";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0013|\"r.\u0005e#T\u0003\u0014x<H";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0003y0C;\u0005\u007f$@>\u0005c~^9\u0014r2]4\u000f\u007f4C)\r>7L5\ft5";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0012~0@5\u000ev";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    fz(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }

    public void a(@Nullable String str, @Nullable String str2) {
        App.ae();
        App.aL();
        App.ay = null;
        new File(App.z().getFilesDir(), z[5]).delete();
        ve.c();
        App.f(App.z(), null);
        App.d(this.a, 4);
        Editor edit = this.a.getSharedPreferences(z[0], 0).edit();
        edit.putString(z[3], EnterPhoneNumber.w);
        edit.putString(z[2], EnterPhoneNumber.A);
        if (!edit.commit()) {
            Log.e(z[8]);
        }
        Intent intent = new Intent(this.a, VerifySms.class);
        intent.putExtra(z[1], this.a.u);
        intent.putExtra(z[4], true);
        intent.putExtra(z[7], (VerifyNumber.a(str, 0) * 1000) + System.currentTimeMillis());
        intent.putExtra(z[6], (VerifyNumber.a(str2, 0) * 1000) + System.currentTimeMillis());
        this.a.startActivity(intent);
        this.a.finish();
    }
}
