package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.util.ap;
import de.greenrobot.event.h;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class yt extends ap {
    private static final String[] z;
    final ChangeNumber b;

    static {
        String[] strArr = new String[9];
        String str = "!\u0002_>\u000e'\u0004K=\u000b'\u0018\u0011#\u001c \u0007W$F!\t\u001e";
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
                        i3 = 66;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 62;
                        break;
                    case at.o /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "b\u0000W4T";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "!\u0002_>\u000e'\u0004K=\u000b'\u0018\u0011 \u0001-\u0004[\u007f\n!W";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001e.";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "!\u0002_>\u000e'\u0004K=\u000b'\u0018\u0011 \u0001-\u0004[p\u000f#\u0003R5\rb\u001eL9\u0004\u000e\u000f_4\u0000,\rd5\u001b-JX\"\u0006/J}?\u001c,\u001eL)9*\u0005P5 ,\fQ";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "H`";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "!\u0002_>\u000e'\u0004K=\u000b'\u0018\u0011#\u001c \u0007W$F,\u0005\u00133\u0006,\u0004[3\u001d+\u001cW$\u0010";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "m\u0004K=\u000b'\u0018\u0003";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "b\u001aVm";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(View view) {
        String trim = ChangeNumber.e(this.b).e.getText().toString().trim();
        String obj = ChangeNumber.e(this.b).c.getText().toString();
        try {
            if (ChangeNumber.a(this.b, trim, obj, ChangeNumber.e(this.b))) {
                try {
                    if (ChangeNumber.a(this.b, this.b.v.e.getText().toString().trim(), this.b.v.c.getText().toString(), this.b.v)) {
                        int parseInt = Integer.parseInt(trim);
                        obj = obj.replaceAll(z[4], "");
                        try {
                            obj = u0.a(parseInt, obj);
                        } catch (Throwable e) {
                            Log.b(z[5], e);
                        }
                        Log.i(z[3] + trim + z[8] + obj);
                        ChangeNumber.f(trim);
                        ChangeNumber.a(obj);
                        Log.w(z[0] + ChangeNumber.n() + z[1] + ChangeNumber.b() + z[2] + App.ay.jabber_id);
                        try {
                            if (!((a47) h.b().b(a47.class)).a) {
                                Log.w(z[7]);
                                this.b.f(this.b.getString(2131230896) + " " + this.b.getString(2131230938) + z[6] + this.b.getString(2131230939));
                                if (!DialogToastActivity.f) {
                                    return;
                                }
                            }
                            try {
                                this.b.showDialog(1);
                                ChangeNumber.d(this.b).sendEmptyMessageDelayed(4, 30000);
                                if (!App.a(ChangeNumber.n(), ChangeNumber.b(), ChangeNumber.b(this.b), ChangeNumber.c(this.b))) {
                                    ChangeNumber.d(this.b).removeMessages(4);
                                    this.b.removeDialog(1);
                                    this.b.f(this.b.getString(2131231746, new Object[]{this.b.getString(2131230939)}));
                                }
                            } catch (IOException e2) {
                                throw e2;
                            }
                        } catch (IOException e22) {
                            throw e22;
                        } catch (IOException e222) {
                            throw e222;
                        }
                    }
                } catch (IOException e2222) {
                    throw e2222;
                }
            }
        } catch (IOException e22222) {
            throw e22222;
        }
    }

    yt(ChangeNumber changeNumber) {
        this.b = changeNumber;
    }
}
