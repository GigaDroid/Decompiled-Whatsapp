package com.whatsapp.camera;

import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class g implements c {
    private static final String[] z;
    final CameraActivity a;

    static {
        String[] strArr = new String[2];
        String str = "2K\u000fz\\0K\u0001kG'C\u0016f\u0001!C\u0001k[#O\u0016~E4D";
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
                        i3 = 81;
                        break;
                    case at.g /*1*/:
                        i3 = 42;
                        break;
                    case at.i /*2*/:
                        i3 = 98;
                        break;
                    case at.o /*3*/:
                        i3 = 31;
                        break;
                    default:
                        i3 = 46;
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
                    str = "\u007f@\u0012zI";
                    obj = null;
            }
        }
    }

    g(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public void a(byte[] bArr, boolean z) {
        Log.i(z[0]);
        this.a.findViewById(2131755410).setVisibility(0);
        bq.a(new k(this, ag.a(this.a, z[1], (byte) 1, 0, false), bArr, z), new Void[0]);
    }

    public void a() {
        CameraActivity.p(this.a).setOn();
    }
}
