package android.support.v4.util;

import android.util.Log;
import java.io.Writer;

public class LogWriter extends Writer {
    private StringBuilder mBuilder;
    private final String mTag;

    public void close() {
        flushBuilder();
    }

    public void flush() {
        flushBuilder();
    }

    public LogWriter(String str) {
        this.mBuilder = new StringBuilder(128);
        this.mTag = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(char[] r5, int r6, int r7) {
        /*
        r4 = this;
        r1 = android.support.v4.util.LruCache.a;
        r0 = 0;
    L_0x0003:
        if (r0 >= r7) goto L_0x001b;
    L_0x0005:
        r2 = r6 + r0;
        r2 = r5[r2];
        r3 = 10;
        if (r2 != r3) goto L_0x0012;
    L_0x000d:
        r4.flushBuilder();
        if (r1 == 0) goto L_0x0017;
    L_0x0012:
        r3 = r4.mBuilder;
        r3.append(r2);
    L_0x0017:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0003;
    L_0x001b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.LogWriter.write(char[], int, int):void");
    }

    private void flushBuilder() {
        if (this.mBuilder.length() > 0) {
            Log.d(this.mTag, this.mBuilder.toString());
            this.mBuilder.delete(0, this.mBuilder.length());
        }
    }
}
