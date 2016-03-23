package com.whatsapp.util;

import com.whatsapp.App;
import com.whatsapp.MediaData;

final class bo implements Runnable {
    final String a;
    final byte[] b;
    final String c;
    final MediaData d;

    bo(String str, byte[] bArr, MediaData mediaData, String str2) {
        this.a = str;
        this.b = bArr;
        this.d = mediaData;
        this.c = str2;
    }

    public void run() {
        App.a(this.a, this.b, this.d, (byte) 1, 0, this.c, null);
    }
}
