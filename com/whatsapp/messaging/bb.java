package com.whatsapp.messaging;

import com.whatsapp.protocol.b1;
import com.whatsapp.protocol.c3;
import java.util.Hashtable;
import java.util.Vector;

public class bb {
    public final Vector a;
    public final int b;
    public final String c;
    public final String d;
    public final b1 e;
    public final String f;
    public final Hashtable g;
    public final String h;
    private final long i;
    public final String j;
    public final String k;
    public final c3 l;

    public bb(c3 c3Var, long j, int i, String str, String str2, String str3, String str4, String str5, String str6, b1 b1Var, Hashtable hashtable, Vector vector) {
        this.l = c3Var;
        this.i = j;
        this.b = i;
        this.j = str;
        this.k = str2;
        this.f = str3;
        this.d = str4;
        this.h = str5;
        this.c = str6;
        this.e = b1Var;
        this.g = hashtable;
        this.a = vector;
    }

    static long a(bb bbVar) {
        return bbVar.i;
    }
}
