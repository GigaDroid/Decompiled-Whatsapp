package com.whatsapp;

import com.whatsapp.VoiceService.VoiceServiceEventCallback;
import com.whatsapp.Voip.DebugTapType;
import com.whatsapp.Voip.RecordingInfo;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

class gz implements Runnable {
    private static final String[] z;
    final RecordingInfo[] a;
    final int b;
    final VoiceServiceEventCallback c;
    final byte[] d;
    final DebugTapType e;

    static {
        String[] strArr = new String[2];
        String str = ";\u007fm+#.qh7O,`p.~(Rq=j(bB2`!u`tC8dt.x\u001edv>m ?j.`!";
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
                        i3 = 16;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 12;
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
                    str = ".qh7O,`p.~(Rq=j(bB2`!u`{\u007f9\u007ft{~(sk)h$~c{h8u$/cmu|8i(tw{j$|a{\u007f$ja{`$}m/";
                    obj = null;
            }
        }
    }

    public void run() {
        RecordingInfo recordingInfo;
        RecordingInfo recordingInfo2 = this.a[this.e.ordinal()];
        if (recordingInfo2 == null) {
            this.a[this.e.ordinal()] = new RecordingInfo(this.e);
            recordingInfo = this.a[this.e.ordinal()];
        } else {
            recordingInfo = recordingInfo2;
        }
        try {
            if (recordingInfo.b() == null) {
                Log.e(z[0]);
                Voip.stopCallRecording();
                return;
            }
            try {
                recordingInfo.b().write(this.d, 0, this.b);
            } catch (Throwable e) {
                Log.a(e);
            }
            try {
                this.c.bufferQueue.a(this.d);
                if (recordingInfo.a().length() >= 52428800) {
                    Log.i(z[1]);
                    Voip.stopCallRecording();
                }
            } catch (IOException e2) {
                throw e2;
            }
        } catch (IOException e22) {
            throw e22;
        }
    }

    gz(VoiceServiceEventCallback voiceServiceEventCallback, RecordingInfo[] recordingInfoArr, DebugTapType debugTapType, byte[] bArr, int i) {
        this.c = voiceServiceEventCallback;
        this.a = recordingInfoArr;
        this.e = debugTapType;
        this.d = bArr;
        this.b = i;
    }
}
