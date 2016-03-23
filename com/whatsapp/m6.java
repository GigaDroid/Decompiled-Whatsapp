package com.whatsapp;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.Voip.CallInfo;
import com.whatsapp.Voip.CallState;
import com.whatsapp.fieldstats.cz;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class m6 implements Runnable {
    private static final String[] z;
    final VoiceService a;
    final vl b;

    static {
        String[] strArr = new String[3];
        String str = "oiP<FjcK:\u0000zc\u0016?\u0000~hX 6mnK)\b})\\\"\rFeX \u00056";
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
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 6;
                        break;
                    case at.i /*2*/:
                        i3 = 57;
                        break;
                    case at.o /*3*/:
                        i3 = 76;
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
                    i = 2;
                    strArr2 = strArr3;
                    str = "ziW*\u0000kkX8\u0000vhj8\u001bph^";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "ziTb\u001eqgM?\biv\u0017%\u0007mcW8GxeM%\u0006w(j\u0004&NY|\u0002-FEx\u0000%FEv\u0002/PTt\r=PIw";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            Log.i(z[0] + this.b);
            if (this.b == vl.USER_END_CALL && VoiceService.d(this.a) != null && VoiceService.d(this.a).longValue() <= 10000 && callInfo.isCaller() && callInfo.getCallState() == CallState.ACTIVE && callInfo.getCallDuration() <= VoiceService.d(this.a).longValue() && SystemClock.elapsedRealtime() - VoiceService.z(this.a) >= 8000) {
                VoiceService.d(this.a, Double.valueOf((double) cz.CALL_TOO_SHORT.getCode()));
                Intent intent = new Intent(App.z(), VoipActivity.class);
                intent.setAction(z[1]);
                intent.putExtra(z[2], this.a.getString(2131232243, new Object[]{this.a.a(true)}));
                intent.setFlags(268435456);
                App.z().startActivity(intent);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            if (this.b == vl.USER_END_CALL_AFTER_CONFIRMATION) {
                VoiceService.c(this.a, VoiceService.C(this.a));
            }
            Voip.endCall();
        }
    }

    m6(VoiceService voiceService, vl vlVar) {
        this.a = voiceService;
        this.b = vlVar;
    }
}
