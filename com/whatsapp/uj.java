package com.whatsapp;

import android.backport.util.Base64;

public class uj {
    public String a;
    public String b;
    public String c;
    public byte[] d;
    public String e;

    public uj(String str, String str2, String str3) {
        this.a = str;
        this.c = str3;
        this.b = str2;
        byte[] bArr = new byte[64];
        wn.f().nextBytes(bArr);
        this.e = Base64.encodeToString(bArr, 2);
        this.d = bArr;
    }
}
