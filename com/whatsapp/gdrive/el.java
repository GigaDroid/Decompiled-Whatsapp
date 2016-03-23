package com.whatsapp.gdrive;

import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class el extends eq {
    private static final String[] z;
    private int a;
    final GoogleDriveActivity b;

    static {
        String[] strArr = new String[6];
        String str = "\u0011n~\u0013\u001d\u0013'm\u0019\u001f\u001f|e\u000e\u0012[en\t\u000e\u0004|i\bD\u001byk\t\u001f\u0019xiW\u000f\u0019}b\u0016\u0004\u0017n!\n\u0019\u0019m~\u001f\u0018\u00050";
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
                        i3 = 118;
                        break;
                    case at.g /*1*/:
                        i3 = 10;
                        break;
                    case at.i /*2*/:
                        i3 = 12;
                        break;
                    case at.o /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0011n~\u0013\u001d\u0013'm\u0019\u001f\u001f|e\u000e\u0012[en\t\u000e\u0004|i\bD\u001byk\t\u001f\u0019xiW\u000f\u0019}b\u0016\u0004\u0017n!\u001c\u0002\u0018c\u007f\u0012\u000e\u0012%";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0010ke\u0016\u000e\u0012";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0011n~\u0013\u001d\u0013'm\u0019\u001f\u001f|e\u000e\u0012[en\t\u000e\u0004|i\bD\u001byk\t\u001f\u0019xiW\u000f\u0019}b\u0016\u0004\u0017n!\u001c\u0002\u0018c\u007f\u0012\u000e\u0012%k\u001f\u001f[o~\b\u0004\u0004%";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0005\u007fo\u0019\u000e\u0005yj\u000f\u0007";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0011n~\u0013\u001d\u0013'm\u0019\u001f\u001f|e\u000e\u0012[en\t\u000e\u0004|i\bD\u001byk\t\u001f\u0019xiW\u000f\u0019}b\u0016\u0004\u0017n!\u001f\u0019\u0004e~U";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void c(long j, long j2) {
        int i = (int) ((100 * j) / j2);
        if (i - this.a > 0) {
            this.a = i;
            if (i % 10 == 0) {
                Log.i(z[0] + j + "/" + j2 + " " + i + "%");
            }
            this.b.runOnUiThread(new av(this, i, j, j2));
        }
    }

    el(GoogleDriveActivity googleDriveActivity) {
        this.b = googleDriveActivity;
        this.a = -1;
    }

    public void a(boolean z) {
        Log.i(z[2] + (z ? z[5] : z[3]));
        int o = GoogleDriveActivity.k(this.b).o();
        if (o == 10) {
            this.b.runOnUiThread(new d0(this, z));
            if (!GoogleDriveService.c) {
                return;
            }
        }
        Log.i(z[4] + fn.a(o));
    }

    public void e() {
        this.b.runOnUiThread(new dk(this));
    }

    public void b(@fk int i) {
        Log.i(z[1] + fn.a(i));
        this.b.runOnUiThread(new e6(this, i));
    }
}
