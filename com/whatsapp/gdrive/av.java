package com.whatsapp.gdrive;

import com.whatsapp.arj;
import com.whatsapp.util.Log;
import com.whatsapp.util.l;
import org.v;
import org.whispersystems.at;

class av implements Runnable {
    private static final String z;
    final long a;
    final el b;
    final long c;
    final int d;

    static {
        char[] toCharArray = "\u0019\u0002\bFM\u001bK\u001bLO\u0017\u0010\u0013[BS\t\u0018\\^\f\u0010\u001f]\u0014\u0013\u0015\u001d\\O\u0011\u0014\u001f\u0002_\u0011\u0011\u0014CT\u001f\u0002W_I\u0011\u0001\bJH\rI\u001bLO\u0017\u0010\u0013[BS\u0007\u0016]^\u001f\u0002\u0003\u0002^\u0006\u000f\u000eJ_".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 122;
                    break;
                case at.o /*3*/:
                    i2 = 47;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (!fn.a(this.b.b)) {
            GoogleDriveActivity.c(this.b.b).setIndeterminate(false);
            GoogleDriveActivity.c(this.b.b).setProgress(this.d);
            GoogleDriveActivity.s(this.b.b).setText(this.b.b.getString(2131231962, new Object[]{l.a(this.b.b, this.a), l.a(this.b.b, this.c), Integer.valueOf(this.d)}));
            if (!GoogleDriveService.c) {
                return;
            }
        }
        Log.i(z);
    }

    av(el elVar, int i, long j, long j2) {
        this.b = elVar;
        this.d = i;
        this.a = j;
        this.c = j2;
    }
}
