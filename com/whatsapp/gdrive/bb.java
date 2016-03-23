package com.whatsapp.gdrive;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import com.whatsapp.util.l;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class bb implements OnClickListener {
    private static final String[] z;
    final GoogleDriveActivity a;
    final String b;
    final bc c;
    final c4 d;
    final b6 e;

    static {
        String[] strArr = new String[9];
        String str = "h!%\u00052g(\u000f\u00135r0?\u001f";
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
                        i3 = 6;
                        break;
                    case at.g /*1*/:
                        i3 = 68;
                        break;
                    case at.i /*2*/:
                        i3 = 80;
                        break;
                    case at.o /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 64;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "a \"\u00186ci1\u00124o29\u00059)78\u001e7+65\u00024i65Q)h7%\u0017&o'9\u0014.rd#\u0005/t%7\u0014l&%&\u0010)j%2\u001d%<d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "&65\u00005o65\u0015z&";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "v+#\u00184o25.\"s0$\u001e.";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "a \"\u00186ci1\u00124o29\u00059)78\u001e7+65\u00024i65^3r+ \u0001)h#}\u00100v6?\tmr61\u001f3`!\"\\3o>5\\#g(3\\4n65\u0010$";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "b-1\u001d/a\u001b9\u0015";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "k!#\u0002!a!";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "a \"\u00186ci1\u00124o29\u00059)78\u001e7+65\u00024i65Q3r%\"\u0005)h#p\u0003%u0?\u0003%&\"\"\u001e-&";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "r-$\u001d%";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        if (App.T() < GoogleDriveActivity.m(this.a)) {
            Log.i(z[2] + App.T() + z[3] + GoogleDriveActivity.m(this.a));
            String format = String.format(this.a.getString(App.V() ? 2131231200 : 2131231202), new Object[]{l.a(this.a, GoogleDriveActivity.m(this.a))});
            DialogFragment promptDialogFragment = new PromptDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(z[6], 13);
            bundle.putString(z[1], this.a.getString(2131231201));
            bundle.putString(z[7], format);
            bundle.putString(z[4], this.a.getString(2131230860));
            bundle.putString(z[0], this.a.getString(2131231580));
            promptDialogFragment.setArguments(bundle);
            promptDialogFragment.show(this.a.getSupportFragmentManager(), null);
            return;
        }
        Log.i(z[8] + fn.a(this.b));
        Log.i(z[5]);
        GoogleDriveActivity.e(this.a).set(true);
        GoogleDriveActivity.a(this.a);
        bq.a(new ay(this));
    }

    bb(GoogleDriveActivity googleDriveActivity, String str, bc bcVar, c4 c4Var, b6 b6Var) {
        this.a = googleDriveActivity;
        this.b = str;
        this.c = bcVar;
        this.d = c4Var;
        this.e = b6Var;
    }
}
