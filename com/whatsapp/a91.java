package com.whatsapp;

import android.os.Handler.Callback;
import android.os.Message;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a91 implements Callback {
    private static final String[] z;
    final VoiceService a;

    static {
        String[] strArr = new String[6];
        String str = "h)\u0017 i}'\u0012<im#\u00104k}'\u0012<kq \u00185432\u0017=#q3\n";
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
                        i3 = 30;
                        break;
                    case at.g /*1*/:
                        i3 = 70;
                        break;
                    case at.i /*2*/:
                        i3 = 126;
                        break;
                    case at.o /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = 70;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "h)\u0017 i}'\u0012<il/\u001072q(\u001b}2w+\u001b?3j";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "h)\u0017 i}'\u0012<i\u007f%\u001d56j#\u001a}$k2S>)jk\u001f32w0\u001b}2w+\u001b?3j";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "h)\u0017 i}'\u0012<ip)\n}'}%\u001b 232\u0017=#q3\n";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "h)\u0017 i}'\u0012<i|3\r)kj)\u00105kj/\u00135)k2";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "h)\u0017 i}'\u0012<\u0012w+\u001b?3j\u000e\u001f>\"r#\fp1{f\u001f\"#>(\u0011$fw(^1(>'\u001d$/h#^3'r*";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (Voip.d()) {
            switch (message.what) {
                case v.m /*0*/:
                    Log.i(z[4]);
                    this.a.a(vl.BEFORE_ACCEPT_TIMEOUT);
                    return true;
                case at.g /*1*/:
                    Log.i(z[3]);
                    this.a.a(vl.AFTER_ACCEPT_TIMEOUT);
                    return true;
                case at.i /*2*/:
                    Log.i(z[0]);
                    if (App.az() == 0) {
                        this.a.a(vl.SEND_CALL_OFFER_TIMEOUT, this.a.getString(2131232246));
                    }
                    return true;
                case at.o /*3*/:
                    Log.i(z[5]);
                    this.a.a(vl.BUSY_TONE_TIMEOUT);
                    return true;
                case at.p /*4*/:
                    Log.i(z[2]);
                    this.a.M();
                    return true;
                default:
                    return false;
            }
        }
        Log.e(z[1]);
        return false;
    }

    a91(VoiceService voiceService) {
        this.a = voiceService;
    }
}
