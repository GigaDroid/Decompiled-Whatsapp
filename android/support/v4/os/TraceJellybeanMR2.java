package android.support.v4.os;

import android.os.Trace;

class TraceJellybeanMR2 {
    public static void endSection() {
        Trace.endSection();
    }

    public static void beginSection(String str) {
        Trace.beginSection(str);
    }
}
