package com.whatsapp;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.app.NotificationManagerCompat;
import android.telephony.TelephonyManager;
import com.whatsapp.Voip.CallInfo;
import com.whatsapp.Voip.CallState;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class ki implements Callback {
    private static final String[] z;
    final VoiceService a;

    static {
        String[] strArr = new String[9];
        String str = ";D#\u0011q.D'\f1#c+\u000f:!N8N\u0016\fe\u000e-\u001b\u001ft\u001d)\u001f\u0019t\u00195\u001f\u001f\u007f\u0015 \u001d\u0019b\u001c(\n\u0014t\f.\f\u0012b\u0004\"\u0011\u0000b\u0004&\u0001\u000ej\u0006-~#Dj\u0000=9B<\u0004~.J&\r";
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
                        i3 = 77;
                        break;
                    case at.g /*1*/:
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 74;
                        break;
                    case at.o /*3*/:
                        i3 = 97;
                        break;
                    default:
                        i3 = 94;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ",E.\u00131$Od\b09N$\u0015p,H>\b1#\u0005\b \n\u0019n\u00188\u0001\u000ec\u000b/\u0019\bo";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ";D#\u0011q.J&\rq/J>\u0015;?R\u0015\f1#B>\u000e,m[/\u0013=(E>Acm";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "a\u000b)\t??L#\u000f9m\u0016j";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "#N=\"?!G";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ">_+\u0015+>";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "=C%\u000f;";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ">H+\r;";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "!N<\u00042";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean handleMessage(Message message) {
        boolean z = false;
        switch (message.what) {
            case v.m /*0*/:
                VoiceService.g(this.a);
                return true;
            case at.g /*1*/:
                if (Voip.d()) {
                    Intent intent = new Intent(this.a, VoipActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra(z[5], true);
                    this.a.startActivity(intent);
                    VoiceService.j(this.a, false);
                    VoiceService.d(this.a, false);
                    return true;
                }
                Log.e(z[0]);
                return true;
            case at.i /*2*/:
                VoiceService.D(this.a);
                return true;
            case at.o /*3*/:
                Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter(z[2]));
                if (registerReceiver == null) {
                    return true;
                }
                int intExtra = registerReceiver.getIntExtra(z[6], -1);
                boolean z2 = intExtra == 2 || intExtra == 5;
                Log.i(z[3] + ((int) (((float) (registerReceiver.getIntExtra(z[1], -1) * 100)) / ((float) registerReceiver.getIntExtra(z[8], -1)))) + z[4] + z2);
                VoiceService.e(this.a).removeMessages(3);
                VoiceService.e(this.a).sendEmptyMessageDelayed(3, 60000);
                return true;
            case at.p /*4*/:
                NotificationManagerCompat.from(App.z()).cancel(10);
                VoiceService.a(this.a, CallState.values()[message.arg1], (CallInfo) message.obj);
                return true;
            case at.m /*5*/:
                App.j((co) message.obj);
                return true;
            case Y.f /*6*/:
                boolean w = VoiceService.w(this.a);
                TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService(z[7]);
                VoiceService voiceService = this.a;
                if (telephonyManager.getCallState() != 0) {
                    z = true;
                }
                VoiceService.i(voiceService, z);
                if (w == VoiceService.w(this.a)) {
                    return true;
                }
                VoiceService.B(this.a);
                return true;
            default:
                return false;
        }
    }

    ki(VoiceService voiceService) {
        this.a = voiceService;
    }
}
