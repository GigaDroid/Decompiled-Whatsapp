package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.Voip.CallState;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ht implements OnClickListener {
    private static final String[] z;
    final VoipActivity a;

    static {
        String[] strArr = new String[2];
        String str = "F/v\u0010lU.{@/Q,s@.E4k\u000f\"\u00100m\u0005?C%{@%^`Q/\u0002u`l\u0014-D%";
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
                        i3 = 48;
                        break;
                    case at.g /*1*/:
                        i3 = 64;
                        break;
                    case at.i /*2*/:
                        i3 = 31;
                        break;
                    case at.o /*3*/:
                        i3 = 96;
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
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "F/v\u0010lU.{@/Q,s@.E4k\u000f\"\u00100m\u0005?C%{";
                    obj = null;
            }
        }
    }

    ht(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void onClick(View view) {
        boolean z = DialogToastActivity.f;
        Log.i(z[1]);
        CallState currentCallState = Voip.getCurrentCallState();
        if (currentCallState == CallState.NONE) {
            Log.e(z[0]);
            this.a.finish();
            if (!z) {
                return;
            }
        }
        if (currentCallState == CallState.RECEIVED_CALL) {
            VoipActivity.g(this.a);
            if (!z) {
                return;
            }
        }
        VoipActivity.a(this.a);
    }
}
