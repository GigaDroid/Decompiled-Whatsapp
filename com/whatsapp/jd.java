package com.whatsapp;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class jd extends CountDownTimer {
    private static final String[] z;
    final VerifySms a;
    final ProgressBar b;
    final TextView c;
    final long d;

    static {
        String[] strArr = new String[2];
        String str = "rg\u0003g*b";
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
                        i3 = 6;
                        break;
                    case at.i /*2*/:
                        i3 = 115;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 79;
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
                    str = "pc\u0001~)\u007fu\u001ed`ei\u0006y;bi\u0004y;ok\u0016e`bi\u001dr`rt\n:<gp\u0016s,ib\u0016";
                    obj = null;
            }
        }
    }

    public void onTick(long j) {
        this.b.setProgress((int) ((((double) (this.d - j)) * 100.0d) / ((double) this.d)));
    }

    jd(VerifySms verifySms, long j, long j2, ProgressBar progressBar, long j3, TextView textView) {
        this.a = verifySms;
        this.b = progressBar;
        this.d = j3;
        this.c = textView;
        super(j, j2);
    }

    public void onFinish() {
        VerifySms.a(this.a, null);
        VerifySms.p(this.a).setEnabled(true);
        this.b.setProgress(100);
        this.c.setText(this.a.getString(2131232198, new Object[]{Integer.valueOf(VerifySms.m())}));
        VerifySms.c(this.a, false);
        VerifySms.w(this.a);
        if (VerifySms.e(this.a) != null) {
            Log.i(z[1]);
            VerifySms.s(this.a);
            bq.a(new aze(this.a), new String[]{r0, z[0]});
        }
    }
}
