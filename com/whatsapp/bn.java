package com.whatsapp;

import android.os.Handler.Callback;
import org.v;
import org.whispersystems.at;

class bn implements Callback {
    private static final String z;
    final VoiceService a;

    static {
        char[] toCharArray = "ROt]5TEoDu@I~LvqPyLnAh|C~HEo\rmA\u0000|_\u007f\u0004NrY:MN=Lt\u0004A~YsRE=N{HL".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 32;
                    break;
                case at.i /*2*/:
                    i2 = 29;
                    break;
                case at.o /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r7) {
        /*
        r6 = this;
        r1 = 1;
        r2 = 0;
        com.whatsapp.auv.a();
        r3 = com.whatsapp.Voip.getCallInfo();
        if (r3 == 0) goto L_0x00a1;
    L_0x000b:
        r0 = r3.getCallState();
        r4 = com.whatsapp.Voip.CallState.ACTIVE;
        if (r0 != r4) goto L_0x00b2;
    L_0x0013:
        r0 = r1;
    L_0x0014:
        r4 = r3.getCallDuration();
        if (r0 == 0) goto L_0x0024;
    L_0x001a:
        com.whatsapp.Voip.checkStreamStatistics();
        r0 = r3.getPeerId();
        com.whatsapp.App.a(r0, r4);
    L_0x0024:
        r0 = r3.getCallState();
        r4 = com.whatsapp.Voip.CallState.RECEIVED_CALL;
        if (r0 != r4) goto L_0x006b;
    L_0x002c:
        r0 = r6.a;
        r0 = com.whatsapp.VoiceService.b(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x0034:
        r0 = r6.a;
        r0 = com.whatsapp.VoiceService.b(r0);
        r0 = r0.isPlaying();
        if (r0 != 0) goto L_0x006b;
    L_0x0040:
        r0 = r6.a;
        r0 = com.whatsapp.VoiceService.b(r0);
        r0.stop();
        r0 = r6.a;
        r4 = r6.a;
        r5 = r6.a;
        r5 = com.whatsapp.VoiceService.U(r5);
        r4 = android.media.RingtoneManager.getRingtone(r4, r5);
        com.whatsapp.VoiceService.a(r0, r4);
        r0 = r6.a;
        r0 = com.whatsapp.VoiceService.b(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x0062:
        r0 = r6.a;
        r0 = com.whatsapp.VoiceService.b(r0);
        r0.play();
    L_0x006b:
        r0 = r3.getCallState();
        r4 = com.whatsapp.Voip.CallState.RECEIVED_CALL;
        if (r0 == r4) goto L_0x0078;
    L_0x0073:
        r0 = r6.a;
        r0.M();
    L_0x0078:
        r0 = r6.a;
        r0 = com.whatsapp.VoiceService.a(r0);
        if (r0 == 0) goto L_0x009d;
    L_0x0080:
        r0 = r6.a;
        r0 = com.whatsapp.VoiceService.K(r0);
        r4 = (long) r0;
        r3.setEchoLevel(r4);
        r0 = r6.a;
        r0 = com.whatsapp.VoiceService.O(r0);
        r4 = (long) r0;
        r3.setEchoLevelBeforeEC(r4);
        r0 = r6.a;
        r0 = com.whatsapp.VoiceService.a(r0);
        r0.a(r3);
    L_0x009d:
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x00a6;
    L_0x00a1:
        r0 = z;
        com.whatsapp.util.Log.w(r0);
    L_0x00a6:
        r0 = r6.a;
        r0 = com.whatsapp.VoiceService.M(r0);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.sendEmptyMessageDelayed(r2, r4);
        return r1;
    L_0x00b2:
        r0 = r2;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bn.handleMessage(android.os.Message):boolean");
    }

    bn(VoiceService voiceService) {
        this.a = voiceService;
    }
}
