package com.whatsapp;

import com.whatsapp.VoiceService.VoiceServiceEventCallback;
import com.whatsapp.Voip.DebugTapType;
import com.whatsapp.Voip.RecordingInfo;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

class q3 implements Runnable {
    private static final String[] z;
    final VoiceServiceEventCallback a;
    final RecordingInfo[] b;
    final DebugTapType c;

    static {
        String[] strArr = new String[2];
        String str = "E\u0017(v{G\u00060oJC3*~]BV";
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
                        i3 = 38;
                        break;
                    case at.g /*1*/:
                        i3 = 118;
                        break;
                    case at.i /*2*/:
                        i3 = 68;
                        break;
                    case at.o /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 56;
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
                    str = "\u0006\u0005-`]\u0006";
                    obj = null;
            }
        }
    }

    q3(VoiceServiceEventCallback voiceServiceEventCallback, RecordingInfo[] recordingInfoArr, DebugTapType debugTapType) {
        this.a = voiceServiceEventCallback;
        this.b = recordingInfoArr;
        this.c = debugTapType;
    }

    public void run() {
        RecordingInfo recordingInfo = this.b[this.c.ordinal()];
        if (recordingInfo != null) {
            try {
                if (recordingInfo.b() != null) {
                    try {
                        recordingInfo.b().close();
                        Log.i(z[0] + recordingInfo.a() + z[1] + recordingInfo.a().length());
                    } catch (Throwable e) {
                        Log.a(e);
                    }
                }
            } catch (IOException e2) {
                throw e2;
            } catch (IOException e22) {
                throw e22;
            }
        }
    }
}
