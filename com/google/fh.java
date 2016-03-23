package com.google;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class fh implements Closeable {
    private static final char[] j;
    private static final String[] z;
    private int a;
    private final char[] b;
    private int c;
    private int[] d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private String[] k;
    private int l;
    private String m;
    private int[] n;
    private int o;
    private final Reader p;

    static {
        /* JADX: method processing error */
/*
        Error: java.lang.AssertionError: Can't fix method cfg: com.google.fh.<clinit>():void
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r1 = 90;
        r3 = 31;
        r2 = 10;
        r4 = 5;
        r6 = 0;
        r0 = 63;
        r9 = new java.lang.String[r0];
        r0 = "zz=kmz";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0017:
        if (r7 > r8) goto L_0x068a;
    L_0x0019:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r6] = r0;
        r10 = 1;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0030:
        if (r7 > r8) goto L_0x06a4;
    L_0x0032:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 2;
        r0 = "zk(?i3d9?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0049:
        if (r7 > r8) goto L_0x06be;
    L_0x004b:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 3;
        r0 = "\u001fr,zf.o8?dzd=r`zh)k%-k/?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0062:
        if (r7 > r8) goto L_0x06d8;
    L_0x0064:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 4;
        r0 = "zz=kmz";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x007b:
        if (r7 > r8) goto L_0x06f2;
    L_0x007d:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0093:
        if (r7 > r8) goto L_0x070c;
    L_0x0095:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r4] = r0;
        r10 = 6;
        r0 = "\u001fr,zf.o8?@\u0014N\u0003PG\u0010O\u001fK%8\u007f(?r;y|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x00ac:
        if (r7 > r8) goto L_0x0726;
    L_0x00ae:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 7;
        r0 = "zk(?i3d9?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x00c5:
        if (r7 > r8) goto L_0x0740;
    L_0x00c7:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 8;
        r0 = "p%";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x00df:
        if (r7 > r8) goto L_0x075a;
    L_0x00e1:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 9;
        r0 = "\u000fd(zw7c2~q?n||j7g9qq";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x00f9:
        if (r7 > r8) goto L_0x0774;
    L_0x00fb:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r0 = "\u001fd8?j<*5qu/~|~qzf5q`z";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0111:
        if (r7 > r8) goto L_0x078e;
    L_0x0113:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r2] = r0;
        r10 = 11;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x012b:
        if (r7 > r8) goto L_0x07a8;
    L_0x012d:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 12;
        r0 = "zz=kmz";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0145:
        if (r7 > r8) goto L_0x07c2;
    L_0x0147:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 13;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x015f:
        if (r7 > r8) goto L_0x07dc;
    L_0x0161:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 14;
        r0 = "zk(?i3d9?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0179:
        if (r7 > r8) goto L_0x07f6;
    L_0x017b:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 15;
        r0 = "\u001fr,zf.o8?G\u001fM\u0015QZ\u0015H\u0016ZF\u000e*>jqz}=l%";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0193:
        if (r7 > r8) goto L_0x0810;
    L_0x0195:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 16;
        r0 = "\u000fd(zw7c2~q?n|zv9k,z%)o-j`4i9";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x01ad:
        if (r7 > r8) goto L_0x082a;
    L_0x01af:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 17;
        r0 = "\u0006\u007f";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x01c7:
        if (r7 > r8) goto L_0x0844;
    L_0x01c9:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 18;
        r0 = "\u000fd(zw7c2~q?n|zv9k,z%)o-j`4i9";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x01e1:
        if (r7 > r8) goto L_0x085e;
    L_0x01e3:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 19;
        r0 = "3d|\"8zd)si";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x01fb:
        if (r7 > r8) goto L_0x0878;
    L_0x01fd:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 20;
        r0 = "\u000fy9?O)e2M`;n9m+)o(S`4c9qqr~.j`s*(p%;i?zu.*1~i<e.r`>*\u0016LJ\u0014";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0215:
        if (r7 > r8) goto L_0x0892;
    L_0x0217:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 21;
        r0 = "zk(?i3d9?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x022f:
        if (r7 > r8) goto L_0x08ac;
    L_0x0231:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 22;
        r0 = "\u001fr,zf.o8?@\u0014N\u0003^W\bK\u0005?g/~|hd)*";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0249:
        if (r7 > r8) goto L_0x08c6;
    L_0x024b:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 23;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0263:
        if (r7 > r8) goto L_0x08e0;
    L_0x0265:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 24;
        r0 = "zz=kmz";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x027d:
        if (r7 > r8) goto L_0x08fa;
    L_0x027f:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 25;
        r0 = "\u001fr,zf.o8?dzy(ml4m|}p.*+~vz";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0297:
        if (r7 > r8) goto L_0x0914;
    L_0x0299:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 26;
        r0 = "zz=kmz";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x02b1:
        if (r7 > r8) goto L_0x092e;
    L_0x02b3:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 27;
        r0 = "zk(?i3d9?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x02cb:
        if (r7 > r8) goto L_0x0948;
    L_0x02cd:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 28;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x02e5:
        if (r7 > r8) goto L_0x0962;
    L_0x02e7:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 29;
        r0 = "4\u007f0s";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x02ff:
        if (r7 > r8) goto L_0x097c;
    L_0x0301:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 30;
        r0 = "\u000eX\tZ";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0319:
        if (r7 > r8) goto L_0x0996;
    L_0x031b:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r0 = "<k0l`";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0331:
        if (r7 > r8) goto L_0x09b0;
    L_0x0333:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r3] = r0;
        r10 = 32;
        r0 = "\u0014_\u0010S";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x034b:
        if (r7 > r8) goto L_0x09ca;
    L_0x034d:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 33;
        r0 = ".x)z";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0365:
        if (r7 > r8) goto L_0x09e4;
    L_0x0367:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 34;
        r0 = "\u001cK\u0010L@";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x037f:
        if (r7 > r8) goto L_0x09fe;
    L_0x0381:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 35;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0399:
        if (r7 > r8) goto L_0x0a18;
    L_0x039b:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 36;
        r0 = "zk(?i3d9?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x03b3:
        if (r7 > r8) goto L_0x0a32;
    L_0x03b5:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 37;
        r0 = "zz=kmz";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x03cd:
        if (r7 > r8) goto L_0x0a4c;
    L_0x03cf:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 38;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x03e7:
        if (r7 > r8) goto L_0x0a66;
    L_0x03e9:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 39;
        r0 = "\u001fr,zf.o8?G\u001fM\u0015QZ\u001bX\u000e^\\zh)k%-k/?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0401:
        if (r7 > r8) goto L_0x0a80;
    L_0x0403:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 40;
        r0 = "zk(?i3d9?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x041b:
        if (r7 > r8) goto L_0x0a9a;
    L_0x041d:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 41;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0435:
        if (r7 > r8) goto L_0x0ab4;
    L_0x0437:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 42;
        r0 = "zk(?i3d9?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x044f:
        if (r7 > r8) goto L_0x0ace;
    L_0x0451:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 43;
        r0 = "zz=kmz";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0469:
        if (r7 > r8) goto L_0x0ae8;
    L_0x046b:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 44;
        r0 = "\u000fd(zw7c2~q?n|lq(c2x";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0483:
        if (r7 > r8) goto L_0x0b02;
    L_0x0485:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 45;
        r0 = "zz=kmz";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x049d:
        if (r7 > r8) goto L_0x0b1c;
    L_0x049f:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 46;
        r0 = "zz=kmz";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x04b7:
        if (r7 > r8) goto L_0x0b36;
    L_0x04b9:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 47;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x04d1:
        if (r7 > r8) goto L_0x0b50;
    L_0x04d3:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 48;
        r0 = "zk(?i3d9?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x04eb:
        if (r7 > r8) goto L_0x0b6a;
    L_0x04ed:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 49;
        r0 = "zk(?i3d9?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0505:
        if (r7 > r8) goto L_0x0b84;
    L_0x0507:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 50;
        r0 = "\u001fr,zf.o8?dzf3qbzh)k%-k/?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x051f:
        if (r7 > r8) goto L_0x0b9e;
    L_0x0521:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 51;
        r0 = "zi3sp7d|";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0539:
        if (r7 > r8) goto L_0x0bb8;
    L_0x053b:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 52;
        r0 = "\u001fr,zf.o8?dzf3qbzh)k%-k/?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0553:
        if (r7 > r8) goto L_0x0bd2;
    L_0x0555:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 53;
        r0 = "\u000fd(zw7c2~q?n|lq(c2x";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x056d:
        if (r7 > r8) goto L_0x0bec;
    L_0x056f:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 54;
        r0 = "\u000fd(zw7c2~q?n|pg0o?k";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0587:
        if (r7 > r8) goto L_0x0c06;
    L_0x0589:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 55;
        r0 = "\u0010y3qW?k8zwzc/?f6e/za";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x05a1:
        if (r7 > r8) goto L_0x0c20;
    L_0x05a3:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 56;
        r0 = "\u001fr,zf.o8?\"`-";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x05bb:
        if (r7 > r8) goto L_0x0c3a;
    L_0x05bd:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 57;
        r0 = "\u001fr,zf.o8?k;g9";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x05d5:
        if (r7 > r8) goto L_0x0c54;
    L_0x05d7:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 58;
        r0 = "\u001fr,zf.o8?k;g9";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x05ef:
        if (r7 > r8) goto L_0x0c6e;
    L_0x05f1:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 59;
        r0 = "\u000fd9gu?i(zaz|=sp?";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0609:
        if (r7 > r8) goto L_0x0c88;
    L_0x060b:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 60;
        r0 = "\u000fd(zw7c2~q?n|~w(k%";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0623:
        if (r7 > r8) goto L_0x0ca2;
    L_0x0625:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 61;
        r0 = "\u001fr,zf.o8?s;f)z";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x063d:
        if (r7 > r8) goto L_0x0cbc;
    L_0x063f:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        r10 = 62;
        r0 = "4\u007f0s";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r5;
        r8 = r6;
        r5 = r0;
    L_0x0657:
        if (r7 > r8) goto L_0x0cd6;
    L_0x0659:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r9[r10] = r0;
        z = r9;
        r0 = "sW!8\u000f";
        r0 = r0.toCharArray();
        r5 = r0.length;
        r7 = r6;
        r6 = r5;
        r5 = r0;
    L_0x0671:
        if (r6 > r7) goto L_0x0cf0;
    L_0x0673:
        r0 = new java.lang.String;
        r0.<init>(r5);
        r0 = r0.intern();
        r0 = r0.toCharArray();
        j = r0;
        r0 = new com.google.dc;
        r0.<init>();
        com.google.d3.a = r0;
        return;
    L_0x068a:
        r10 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x069b;
            case 1: goto L_0x069d;
            case 2: goto L_0x069f;
            case 3: goto L_0x06a2;
            default: goto L_0x0691;
        };
    L_0x0691:
        r0 = r4;
    L_0x0692:
        r0 = r0 ^ r10;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0017;
    L_0x069b:
        r0 = r1;
        goto L_0x0692;
    L_0x069d:
        r0 = r2;
        goto L_0x0692;
    L_0x069f:
        r0 = 92;
        goto L_0x0692;
    L_0x06a2:
        r0 = r3;
        goto L_0x0692;
    L_0x06a4:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x06b5;
            case 1: goto L_0x06b7;
            case 2: goto L_0x06b9;
            case 3: goto L_0x06bc;
            default: goto L_0x06ab;
        };
    L_0x06ab:
        r0 = r4;
    L_0x06ac:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0030;
    L_0x06b5:
        r0 = r1;
        goto L_0x06ac;
    L_0x06b7:
        r0 = r2;
        goto L_0x06ac;
    L_0x06b9:
        r0 = 92;
        goto L_0x06ac;
    L_0x06bc:
        r0 = r3;
        goto L_0x06ac;
    L_0x06be:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x06cf;
            case 1: goto L_0x06d1;
            case 2: goto L_0x06d3;
            case 3: goto L_0x06d6;
            default: goto L_0x06c5;
        };
    L_0x06c5:
        r0 = r4;
    L_0x06c6:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0049;
    L_0x06cf:
        r0 = r1;
        goto L_0x06c6;
    L_0x06d1:
        r0 = r2;
        goto L_0x06c6;
    L_0x06d3:
        r0 = 92;
        goto L_0x06c6;
    L_0x06d6:
        r0 = r3;
        goto L_0x06c6;
    L_0x06d8:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x06e9;
            case 1: goto L_0x06eb;
            case 2: goto L_0x06ed;
            case 3: goto L_0x06f0;
            default: goto L_0x06df;
        };
    L_0x06df:
        r0 = r4;
    L_0x06e0:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0062;
    L_0x06e9:
        r0 = r1;
        goto L_0x06e0;
    L_0x06eb:
        r0 = r2;
        goto L_0x06e0;
    L_0x06ed:
        r0 = 92;
        goto L_0x06e0;
    L_0x06f0:
        r0 = r3;
        goto L_0x06e0;
    L_0x06f2:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0703;
            case 1: goto L_0x0705;
            case 2: goto L_0x0707;
            case 3: goto L_0x070a;
            default: goto L_0x06f9;
        };
    L_0x06f9:
        r0 = r4;
    L_0x06fa:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x007b;
    L_0x0703:
        r0 = r1;
        goto L_0x06fa;
    L_0x0705:
        r0 = r2;
        goto L_0x06fa;
    L_0x0707:
        r0 = 92;
        goto L_0x06fa;
    L_0x070a:
        r0 = r3;
        goto L_0x06fa;
    L_0x070c:
        r10 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x071d;
            case 1: goto L_0x071f;
            case 2: goto L_0x0721;
            case 3: goto L_0x0724;
            default: goto L_0x0713;
        };
    L_0x0713:
        r0 = r4;
    L_0x0714:
        r0 = r0 ^ r10;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0093;
    L_0x071d:
        r0 = r1;
        goto L_0x0714;
    L_0x071f:
        r0 = r2;
        goto L_0x0714;
    L_0x0721:
        r0 = 92;
        goto L_0x0714;
    L_0x0724:
        r0 = r3;
        goto L_0x0714;
    L_0x0726:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0737;
            case 1: goto L_0x0739;
            case 2: goto L_0x073b;
            case 3: goto L_0x073e;
            default: goto L_0x072d;
        };
    L_0x072d:
        r0 = r4;
    L_0x072e:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x00ac;
    L_0x0737:
        r0 = r1;
        goto L_0x072e;
    L_0x0739:
        r0 = r2;
        goto L_0x072e;
    L_0x073b:
        r0 = 92;
        goto L_0x072e;
    L_0x073e:
        r0 = r3;
        goto L_0x072e;
    L_0x0740:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0751;
            case 1: goto L_0x0753;
            case 2: goto L_0x0755;
            case 3: goto L_0x0758;
            default: goto L_0x0747;
        };
    L_0x0747:
        r0 = r4;
    L_0x0748:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x00c5;
    L_0x0751:
        r0 = r1;
        goto L_0x0748;
    L_0x0753:
        r0 = r2;
        goto L_0x0748;
    L_0x0755:
        r0 = 92;
        goto L_0x0748;
    L_0x0758:
        r0 = r3;
        goto L_0x0748;
    L_0x075a:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x076b;
            case 1: goto L_0x076d;
            case 2: goto L_0x076f;
            case 3: goto L_0x0772;
            default: goto L_0x0761;
        };
    L_0x0761:
        r0 = r4;
    L_0x0762:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x00df;
    L_0x076b:
        r0 = r1;
        goto L_0x0762;
    L_0x076d:
        r0 = r2;
        goto L_0x0762;
    L_0x076f:
        r0 = 92;
        goto L_0x0762;
    L_0x0772:
        r0 = r3;
        goto L_0x0762;
    L_0x0774:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0785;
            case 1: goto L_0x0787;
            case 2: goto L_0x0789;
            case 3: goto L_0x078c;
            default: goto L_0x077b;
        };
    L_0x077b:
        r0 = r4;
    L_0x077c:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x00f9;
    L_0x0785:
        r0 = r1;
        goto L_0x077c;
    L_0x0787:
        r0 = r2;
        goto L_0x077c;
    L_0x0789:
        r0 = 92;
        goto L_0x077c;
    L_0x078c:
        r0 = r3;
        goto L_0x077c;
    L_0x078e:
        r10 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x079f;
            case 1: goto L_0x07a1;
            case 2: goto L_0x07a3;
            case 3: goto L_0x07a6;
            default: goto L_0x0795;
        };
    L_0x0795:
        r0 = r4;
    L_0x0796:
        r0 = r0 ^ r10;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0111;
    L_0x079f:
        r0 = r1;
        goto L_0x0796;
    L_0x07a1:
        r0 = r2;
        goto L_0x0796;
    L_0x07a3:
        r0 = 92;
        goto L_0x0796;
    L_0x07a6:
        r0 = r3;
        goto L_0x0796;
    L_0x07a8:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x07b9;
            case 1: goto L_0x07bb;
            case 2: goto L_0x07bd;
            case 3: goto L_0x07c0;
            default: goto L_0x07af;
        };
    L_0x07af:
        r0 = r4;
    L_0x07b0:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x012b;
    L_0x07b9:
        r0 = r1;
        goto L_0x07b0;
    L_0x07bb:
        r0 = r2;
        goto L_0x07b0;
    L_0x07bd:
        r0 = 92;
        goto L_0x07b0;
    L_0x07c0:
        r0 = r3;
        goto L_0x07b0;
    L_0x07c2:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x07d3;
            case 1: goto L_0x07d5;
            case 2: goto L_0x07d7;
            case 3: goto L_0x07da;
            default: goto L_0x07c9;
        };
    L_0x07c9:
        r0 = r4;
    L_0x07ca:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0145;
    L_0x07d3:
        r0 = r1;
        goto L_0x07ca;
    L_0x07d5:
        r0 = r2;
        goto L_0x07ca;
    L_0x07d7:
        r0 = 92;
        goto L_0x07ca;
    L_0x07da:
        r0 = r3;
        goto L_0x07ca;
    L_0x07dc:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x07ed;
            case 1: goto L_0x07ef;
            case 2: goto L_0x07f1;
            case 3: goto L_0x07f4;
            default: goto L_0x07e3;
        };
    L_0x07e3:
        r0 = r4;
    L_0x07e4:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x015f;
    L_0x07ed:
        r0 = r1;
        goto L_0x07e4;
    L_0x07ef:
        r0 = r2;
        goto L_0x07e4;
    L_0x07f1:
        r0 = 92;
        goto L_0x07e4;
    L_0x07f4:
        r0 = r3;
        goto L_0x07e4;
    L_0x07f6:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0807;
            case 1: goto L_0x0809;
            case 2: goto L_0x080b;
            case 3: goto L_0x080e;
            default: goto L_0x07fd;
        };
    L_0x07fd:
        r0 = r4;
    L_0x07fe:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0179;
    L_0x0807:
        r0 = r1;
        goto L_0x07fe;
    L_0x0809:
        r0 = r2;
        goto L_0x07fe;
    L_0x080b:
        r0 = 92;
        goto L_0x07fe;
    L_0x080e:
        r0 = r3;
        goto L_0x07fe;
    L_0x0810:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0821;
            case 1: goto L_0x0823;
            case 2: goto L_0x0825;
            case 3: goto L_0x0828;
            default: goto L_0x0817;
        };
    L_0x0817:
        r0 = r4;
    L_0x0818:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0193;
    L_0x0821:
        r0 = r1;
        goto L_0x0818;
    L_0x0823:
        r0 = r2;
        goto L_0x0818;
    L_0x0825:
        r0 = 92;
        goto L_0x0818;
    L_0x0828:
        r0 = r3;
        goto L_0x0818;
    L_0x082a:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x083b;
            case 1: goto L_0x083d;
            case 2: goto L_0x083f;
            case 3: goto L_0x0842;
            default: goto L_0x0831;
        };
    L_0x0831:
        r0 = r4;
    L_0x0832:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x01ad;
    L_0x083b:
        r0 = r1;
        goto L_0x0832;
    L_0x083d:
        r0 = r2;
        goto L_0x0832;
    L_0x083f:
        r0 = 92;
        goto L_0x0832;
    L_0x0842:
        r0 = r3;
        goto L_0x0832;
    L_0x0844:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0855;
            case 1: goto L_0x0857;
            case 2: goto L_0x0859;
            case 3: goto L_0x085c;
            default: goto L_0x084b;
        };
    L_0x084b:
        r0 = r4;
    L_0x084c:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x01c7;
    L_0x0855:
        r0 = r1;
        goto L_0x084c;
    L_0x0857:
        r0 = r2;
        goto L_0x084c;
    L_0x0859:
        r0 = 92;
        goto L_0x084c;
    L_0x085c:
        r0 = r3;
        goto L_0x084c;
    L_0x085e:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x086f;
            case 1: goto L_0x0871;
            case 2: goto L_0x0873;
            case 3: goto L_0x0876;
            default: goto L_0x0865;
        };
    L_0x0865:
        r0 = r4;
    L_0x0866:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x01e1;
    L_0x086f:
        r0 = r1;
        goto L_0x0866;
    L_0x0871:
        r0 = r2;
        goto L_0x0866;
    L_0x0873:
        r0 = 92;
        goto L_0x0866;
    L_0x0876:
        r0 = r3;
        goto L_0x0866;
    L_0x0878:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0889;
            case 1: goto L_0x088b;
            case 2: goto L_0x088d;
            case 3: goto L_0x0890;
            default: goto L_0x087f;
        };
    L_0x087f:
        r0 = r4;
    L_0x0880:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x01fb;
    L_0x0889:
        r0 = r1;
        goto L_0x0880;
    L_0x088b:
        r0 = r2;
        goto L_0x0880;
    L_0x088d:
        r0 = 92;
        goto L_0x0880;
    L_0x0890:
        r0 = r3;
        goto L_0x0880;
    L_0x0892:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x08a3;
            case 1: goto L_0x08a5;
            case 2: goto L_0x08a7;
            case 3: goto L_0x08aa;
            default: goto L_0x0899;
        };
    L_0x0899:
        r0 = r4;
    L_0x089a:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0215;
    L_0x08a3:
        r0 = r1;
        goto L_0x089a;
    L_0x08a5:
        r0 = r2;
        goto L_0x089a;
    L_0x08a7:
        r0 = 92;
        goto L_0x089a;
    L_0x08aa:
        r0 = r3;
        goto L_0x089a;
    L_0x08ac:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x08bd;
            case 1: goto L_0x08bf;
            case 2: goto L_0x08c1;
            case 3: goto L_0x08c4;
            default: goto L_0x08b3;
        };
    L_0x08b3:
        r0 = r4;
    L_0x08b4:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x022f;
    L_0x08bd:
        r0 = r1;
        goto L_0x08b4;
    L_0x08bf:
        r0 = r2;
        goto L_0x08b4;
    L_0x08c1:
        r0 = 92;
        goto L_0x08b4;
    L_0x08c4:
        r0 = r3;
        goto L_0x08b4;
    L_0x08c6:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x08d7;
            case 1: goto L_0x08d9;
            case 2: goto L_0x08db;
            case 3: goto L_0x08de;
            default: goto L_0x08cd;
        };
    L_0x08cd:
        r0 = r4;
    L_0x08ce:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0249;
    L_0x08d7:
        r0 = r1;
        goto L_0x08ce;
    L_0x08d9:
        r0 = r2;
        goto L_0x08ce;
    L_0x08db:
        r0 = 92;
        goto L_0x08ce;
    L_0x08de:
        r0 = r3;
        goto L_0x08ce;
    L_0x08e0:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x08f1;
            case 1: goto L_0x08f3;
            case 2: goto L_0x08f5;
            case 3: goto L_0x08f8;
            default: goto L_0x08e7;
        };
    L_0x08e7:
        r0 = r4;
    L_0x08e8:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0263;
    L_0x08f1:
        r0 = r1;
        goto L_0x08e8;
    L_0x08f3:
        r0 = r2;
        goto L_0x08e8;
    L_0x08f5:
        r0 = 92;
        goto L_0x08e8;
    L_0x08f8:
        r0 = r3;
        goto L_0x08e8;
    L_0x08fa:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x090b;
            case 1: goto L_0x090d;
            case 2: goto L_0x090f;
            case 3: goto L_0x0912;
            default: goto L_0x0901;
        };
    L_0x0901:
        r0 = r4;
    L_0x0902:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x027d;
    L_0x090b:
        r0 = r1;
        goto L_0x0902;
    L_0x090d:
        r0 = r2;
        goto L_0x0902;
    L_0x090f:
        r0 = 92;
        goto L_0x0902;
    L_0x0912:
        r0 = r3;
        goto L_0x0902;
    L_0x0914:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0925;
            case 1: goto L_0x0927;
            case 2: goto L_0x0929;
            case 3: goto L_0x092c;
            default: goto L_0x091b;
        };
    L_0x091b:
        r0 = r4;
    L_0x091c:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0297;
    L_0x0925:
        r0 = r1;
        goto L_0x091c;
    L_0x0927:
        r0 = r2;
        goto L_0x091c;
    L_0x0929:
        r0 = 92;
        goto L_0x091c;
    L_0x092c:
        r0 = r3;
        goto L_0x091c;
    L_0x092e:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x093f;
            case 1: goto L_0x0941;
            case 2: goto L_0x0943;
            case 3: goto L_0x0946;
            default: goto L_0x0935;
        };
    L_0x0935:
        r0 = r4;
    L_0x0936:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x02b1;
    L_0x093f:
        r0 = r1;
        goto L_0x0936;
    L_0x0941:
        r0 = r2;
        goto L_0x0936;
    L_0x0943:
        r0 = 92;
        goto L_0x0936;
    L_0x0946:
        r0 = r3;
        goto L_0x0936;
    L_0x0948:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0959;
            case 1: goto L_0x095b;
            case 2: goto L_0x095d;
            case 3: goto L_0x0960;
            default: goto L_0x094f;
        };
    L_0x094f:
        r0 = r4;
    L_0x0950:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x02cb;
    L_0x0959:
        r0 = r1;
        goto L_0x0950;
    L_0x095b:
        r0 = r2;
        goto L_0x0950;
    L_0x095d:
        r0 = 92;
        goto L_0x0950;
    L_0x0960:
        r0 = r3;
        goto L_0x0950;
    L_0x0962:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0973;
            case 1: goto L_0x0975;
            case 2: goto L_0x0977;
            case 3: goto L_0x097a;
            default: goto L_0x0969;
        };
    L_0x0969:
        r0 = r4;
    L_0x096a:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x02e5;
    L_0x0973:
        r0 = r1;
        goto L_0x096a;
    L_0x0975:
        r0 = r2;
        goto L_0x096a;
    L_0x0977:
        r0 = 92;
        goto L_0x096a;
    L_0x097a:
        r0 = r3;
        goto L_0x096a;
    L_0x097c:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x098d;
            case 1: goto L_0x098f;
            case 2: goto L_0x0991;
            case 3: goto L_0x0994;
            default: goto L_0x0983;
        };
    L_0x0983:
        r0 = r4;
    L_0x0984:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x02ff;
    L_0x098d:
        r0 = r1;
        goto L_0x0984;
    L_0x098f:
        r0 = r2;
        goto L_0x0984;
    L_0x0991:
        r0 = 92;
        goto L_0x0984;
    L_0x0994:
        r0 = r3;
        goto L_0x0984;
    L_0x0996:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x09a7;
            case 1: goto L_0x09a9;
            case 2: goto L_0x09ab;
            case 3: goto L_0x09ae;
            default: goto L_0x099d;
        };
    L_0x099d:
        r0 = r4;
    L_0x099e:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0319;
    L_0x09a7:
        r0 = r1;
        goto L_0x099e;
    L_0x09a9:
        r0 = r2;
        goto L_0x099e;
    L_0x09ab:
        r0 = 92;
        goto L_0x099e;
    L_0x09ae:
        r0 = r3;
        goto L_0x099e;
    L_0x09b0:
        r10 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x09c1;
            case 1: goto L_0x09c3;
            case 2: goto L_0x09c5;
            case 3: goto L_0x09c8;
            default: goto L_0x09b7;
        };
    L_0x09b7:
        r0 = r4;
    L_0x09b8:
        r0 = r0 ^ r10;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0331;
    L_0x09c1:
        r0 = r1;
        goto L_0x09b8;
    L_0x09c3:
        r0 = r2;
        goto L_0x09b8;
    L_0x09c5:
        r0 = 92;
        goto L_0x09b8;
    L_0x09c8:
        r0 = r3;
        goto L_0x09b8;
    L_0x09ca:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x09db;
            case 1: goto L_0x09dd;
            case 2: goto L_0x09df;
            case 3: goto L_0x09e2;
            default: goto L_0x09d1;
        };
    L_0x09d1:
        r0 = r4;
    L_0x09d2:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x034b;
    L_0x09db:
        r0 = r1;
        goto L_0x09d2;
    L_0x09dd:
        r0 = r2;
        goto L_0x09d2;
    L_0x09df:
        r0 = 92;
        goto L_0x09d2;
    L_0x09e2:
        r0 = r3;
        goto L_0x09d2;
    L_0x09e4:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x09f5;
            case 1: goto L_0x09f7;
            case 2: goto L_0x09f9;
            case 3: goto L_0x09fc;
            default: goto L_0x09eb;
        };
    L_0x09eb:
        r0 = r4;
    L_0x09ec:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0365;
    L_0x09f5:
        r0 = r1;
        goto L_0x09ec;
    L_0x09f7:
        r0 = r2;
        goto L_0x09ec;
    L_0x09f9:
        r0 = 92;
        goto L_0x09ec;
    L_0x09fc:
        r0 = r3;
        goto L_0x09ec;
    L_0x09fe:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0a0f;
            case 1: goto L_0x0a11;
            case 2: goto L_0x0a13;
            case 3: goto L_0x0a16;
            default: goto L_0x0a05;
        };
    L_0x0a05:
        r0 = r4;
    L_0x0a06:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x037f;
    L_0x0a0f:
        r0 = r1;
        goto L_0x0a06;
    L_0x0a11:
        r0 = r2;
        goto L_0x0a06;
    L_0x0a13:
        r0 = 92;
        goto L_0x0a06;
    L_0x0a16:
        r0 = r3;
        goto L_0x0a06;
    L_0x0a18:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0a29;
            case 1: goto L_0x0a2b;
            case 2: goto L_0x0a2d;
            case 3: goto L_0x0a30;
            default: goto L_0x0a1f;
        };
    L_0x0a1f:
        r0 = r4;
    L_0x0a20:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0399;
    L_0x0a29:
        r0 = r1;
        goto L_0x0a20;
    L_0x0a2b:
        r0 = r2;
        goto L_0x0a20;
    L_0x0a2d:
        r0 = 92;
        goto L_0x0a20;
    L_0x0a30:
        r0 = r3;
        goto L_0x0a20;
    L_0x0a32:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0a43;
            case 1: goto L_0x0a45;
            case 2: goto L_0x0a47;
            case 3: goto L_0x0a4a;
            default: goto L_0x0a39;
        };
    L_0x0a39:
        r0 = r4;
    L_0x0a3a:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x03b3;
    L_0x0a43:
        r0 = r1;
        goto L_0x0a3a;
    L_0x0a45:
        r0 = r2;
        goto L_0x0a3a;
    L_0x0a47:
        r0 = 92;
        goto L_0x0a3a;
    L_0x0a4a:
        r0 = r3;
        goto L_0x0a3a;
    L_0x0a4c:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0a5d;
            case 1: goto L_0x0a5f;
            case 2: goto L_0x0a61;
            case 3: goto L_0x0a64;
            default: goto L_0x0a53;
        };
    L_0x0a53:
        r0 = r4;
    L_0x0a54:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x03cd;
    L_0x0a5d:
        r0 = r1;
        goto L_0x0a54;
    L_0x0a5f:
        r0 = r2;
        goto L_0x0a54;
    L_0x0a61:
        r0 = 92;
        goto L_0x0a54;
    L_0x0a64:
        r0 = r3;
        goto L_0x0a54;
    L_0x0a66:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0a77;
            case 1: goto L_0x0a79;
            case 2: goto L_0x0a7b;
            case 3: goto L_0x0a7e;
            default: goto L_0x0a6d;
        };
    L_0x0a6d:
        r0 = r4;
    L_0x0a6e:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x03e7;
    L_0x0a77:
        r0 = r1;
        goto L_0x0a6e;
    L_0x0a79:
        r0 = r2;
        goto L_0x0a6e;
    L_0x0a7b:
        r0 = 92;
        goto L_0x0a6e;
    L_0x0a7e:
        r0 = r3;
        goto L_0x0a6e;
    L_0x0a80:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0a91;
            case 1: goto L_0x0a93;
            case 2: goto L_0x0a95;
            case 3: goto L_0x0a98;
            default: goto L_0x0a87;
        };
    L_0x0a87:
        r0 = r4;
    L_0x0a88:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0401;
    L_0x0a91:
        r0 = r1;
        goto L_0x0a88;
    L_0x0a93:
        r0 = r2;
        goto L_0x0a88;
    L_0x0a95:
        r0 = 92;
        goto L_0x0a88;
    L_0x0a98:
        r0 = r3;
        goto L_0x0a88;
    L_0x0a9a:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0aab;
            case 1: goto L_0x0aad;
            case 2: goto L_0x0aaf;
            case 3: goto L_0x0ab2;
            default: goto L_0x0aa1;
        };
    L_0x0aa1:
        r0 = r4;
    L_0x0aa2:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x041b;
    L_0x0aab:
        r0 = r1;
        goto L_0x0aa2;
    L_0x0aad:
        r0 = r2;
        goto L_0x0aa2;
    L_0x0aaf:
        r0 = 92;
        goto L_0x0aa2;
    L_0x0ab2:
        r0 = r3;
        goto L_0x0aa2;
    L_0x0ab4:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0ac5;
            case 1: goto L_0x0ac7;
            case 2: goto L_0x0ac9;
            case 3: goto L_0x0acc;
            default: goto L_0x0abb;
        };
    L_0x0abb:
        r0 = r4;
    L_0x0abc:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0435;
    L_0x0ac5:
        r0 = r1;
        goto L_0x0abc;
    L_0x0ac7:
        r0 = r2;
        goto L_0x0abc;
    L_0x0ac9:
        r0 = 92;
        goto L_0x0abc;
    L_0x0acc:
        r0 = r3;
        goto L_0x0abc;
    L_0x0ace:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0adf;
            case 1: goto L_0x0ae1;
            case 2: goto L_0x0ae3;
            case 3: goto L_0x0ae6;
            default: goto L_0x0ad5;
        };
    L_0x0ad5:
        r0 = r4;
    L_0x0ad6:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x044f;
    L_0x0adf:
        r0 = r1;
        goto L_0x0ad6;
    L_0x0ae1:
        r0 = r2;
        goto L_0x0ad6;
    L_0x0ae3:
        r0 = 92;
        goto L_0x0ad6;
    L_0x0ae6:
        r0 = r3;
        goto L_0x0ad6;
    L_0x0ae8:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0af9;
            case 1: goto L_0x0afb;
            case 2: goto L_0x0afd;
            case 3: goto L_0x0b00;
            default: goto L_0x0aef;
        };
    L_0x0aef:
        r0 = r4;
    L_0x0af0:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0469;
    L_0x0af9:
        r0 = r1;
        goto L_0x0af0;
    L_0x0afb:
        r0 = r2;
        goto L_0x0af0;
    L_0x0afd:
        r0 = 92;
        goto L_0x0af0;
    L_0x0b00:
        r0 = r3;
        goto L_0x0af0;
    L_0x0b02:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0b13;
            case 1: goto L_0x0b15;
            case 2: goto L_0x0b17;
            case 3: goto L_0x0b1a;
            default: goto L_0x0b09;
        };
    L_0x0b09:
        r0 = r4;
    L_0x0b0a:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0483;
    L_0x0b13:
        r0 = r1;
        goto L_0x0b0a;
    L_0x0b15:
        r0 = r2;
        goto L_0x0b0a;
    L_0x0b17:
        r0 = 92;
        goto L_0x0b0a;
    L_0x0b1a:
        r0 = r3;
        goto L_0x0b0a;
    L_0x0b1c:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0b2d;
            case 1: goto L_0x0b2f;
            case 2: goto L_0x0b31;
            case 3: goto L_0x0b34;
            default: goto L_0x0b23;
        };
    L_0x0b23:
        r0 = r4;
    L_0x0b24:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x049d;
    L_0x0b2d:
        r0 = r1;
        goto L_0x0b24;
    L_0x0b2f:
        r0 = r2;
        goto L_0x0b24;
    L_0x0b31:
        r0 = 92;
        goto L_0x0b24;
    L_0x0b34:
        r0 = r3;
        goto L_0x0b24;
    L_0x0b36:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0b47;
            case 1: goto L_0x0b49;
            case 2: goto L_0x0b4b;
            case 3: goto L_0x0b4e;
            default: goto L_0x0b3d;
        };
    L_0x0b3d:
        r0 = r4;
    L_0x0b3e:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x04b7;
    L_0x0b47:
        r0 = r1;
        goto L_0x0b3e;
    L_0x0b49:
        r0 = r2;
        goto L_0x0b3e;
    L_0x0b4b:
        r0 = 92;
        goto L_0x0b3e;
    L_0x0b4e:
        r0 = r3;
        goto L_0x0b3e;
    L_0x0b50:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0b61;
            case 1: goto L_0x0b63;
            case 2: goto L_0x0b65;
            case 3: goto L_0x0b68;
            default: goto L_0x0b57;
        };
    L_0x0b57:
        r0 = r4;
    L_0x0b58:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x04d1;
    L_0x0b61:
        r0 = r1;
        goto L_0x0b58;
    L_0x0b63:
        r0 = r2;
        goto L_0x0b58;
    L_0x0b65:
        r0 = 92;
        goto L_0x0b58;
    L_0x0b68:
        r0 = r3;
        goto L_0x0b58;
    L_0x0b6a:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0b7b;
            case 1: goto L_0x0b7d;
            case 2: goto L_0x0b7f;
            case 3: goto L_0x0b82;
            default: goto L_0x0b71;
        };
    L_0x0b71:
        r0 = r4;
    L_0x0b72:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x04eb;
    L_0x0b7b:
        r0 = r1;
        goto L_0x0b72;
    L_0x0b7d:
        r0 = r2;
        goto L_0x0b72;
    L_0x0b7f:
        r0 = 92;
        goto L_0x0b72;
    L_0x0b82:
        r0 = r3;
        goto L_0x0b72;
    L_0x0b84:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0b95;
            case 1: goto L_0x0b97;
            case 2: goto L_0x0b99;
            case 3: goto L_0x0b9c;
            default: goto L_0x0b8b;
        };
    L_0x0b8b:
        r0 = r4;
    L_0x0b8c:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0505;
    L_0x0b95:
        r0 = r1;
        goto L_0x0b8c;
    L_0x0b97:
        r0 = r2;
        goto L_0x0b8c;
    L_0x0b99:
        r0 = 92;
        goto L_0x0b8c;
    L_0x0b9c:
        r0 = r3;
        goto L_0x0b8c;
    L_0x0b9e:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0baf;
            case 1: goto L_0x0bb1;
            case 2: goto L_0x0bb3;
            case 3: goto L_0x0bb6;
            default: goto L_0x0ba5;
        };
    L_0x0ba5:
        r0 = r4;
    L_0x0ba6:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x051f;
    L_0x0baf:
        r0 = r1;
        goto L_0x0ba6;
    L_0x0bb1:
        r0 = r2;
        goto L_0x0ba6;
    L_0x0bb3:
        r0 = 92;
        goto L_0x0ba6;
    L_0x0bb6:
        r0 = r3;
        goto L_0x0ba6;
    L_0x0bb8:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0bc9;
            case 1: goto L_0x0bcb;
            case 2: goto L_0x0bcd;
            case 3: goto L_0x0bd0;
            default: goto L_0x0bbf;
        };
    L_0x0bbf:
        r0 = r4;
    L_0x0bc0:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0539;
    L_0x0bc9:
        r0 = r1;
        goto L_0x0bc0;
    L_0x0bcb:
        r0 = r2;
        goto L_0x0bc0;
    L_0x0bcd:
        r0 = 92;
        goto L_0x0bc0;
    L_0x0bd0:
        r0 = r3;
        goto L_0x0bc0;
    L_0x0bd2:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0be3;
            case 1: goto L_0x0be5;
            case 2: goto L_0x0be7;
            case 3: goto L_0x0bea;
            default: goto L_0x0bd9;
        };
    L_0x0bd9:
        r0 = r4;
    L_0x0bda:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0553;
    L_0x0be3:
        r0 = r1;
        goto L_0x0bda;
    L_0x0be5:
        r0 = r2;
        goto L_0x0bda;
    L_0x0be7:
        r0 = 92;
        goto L_0x0bda;
    L_0x0bea:
        r0 = r3;
        goto L_0x0bda;
    L_0x0bec:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0bfd;
            case 1: goto L_0x0bff;
            case 2: goto L_0x0c01;
            case 3: goto L_0x0c04;
            default: goto L_0x0bf3;
        };
    L_0x0bf3:
        r0 = r4;
    L_0x0bf4:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x056d;
    L_0x0bfd:
        r0 = r1;
        goto L_0x0bf4;
    L_0x0bff:
        r0 = r2;
        goto L_0x0bf4;
    L_0x0c01:
        r0 = 92;
        goto L_0x0bf4;
    L_0x0c04:
        r0 = r3;
        goto L_0x0bf4;
    L_0x0c06:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0c17;
            case 1: goto L_0x0c19;
            case 2: goto L_0x0c1b;
            case 3: goto L_0x0c1e;
            default: goto L_0x0c0d;
        };
    L_0x0c0d:
        r0 = r4;
    L_0x0c0e:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0587;
    L_0x0c17:
        r0 = r1;
        goto L_0x0c0e;
    L_0x0c19:
        r0 = r2;
        goto L_0x0c0e;
    L_0x0c1b:
        r0 = 92;
        goto L_0x0c0e;
    L_0x0c1e:
        r0 = r3;
        goto L_0x0c0e;
    L_0x0c20:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0c31;
            case 1: goto L_0x0c33;
            case 2: goto L_0x0c35;
            case 3: goto L_0x0c38;
            default: goto L_0x0c27;
        };
    L_0x0c27:
        r0 = r4;
    L_0x0c28:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x05a1;
    L_0x0c31:
        r0 = r1;
        goto L_0x0c28;
    L_0x0c33:
        r0 = r2;
        goto L_0x0c28;
    L_0x0c35:
        r0 = 92;
        goto L_0x0c28;
    L_0x0c38:
        r0 = r3;
        goto L_0x0c28;
    L_0x0c3a:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0c4b;
            case 1: goto L_0x0c4d;
            case 2: goto L_0x0c4f;
            case 3: goto L_0x0c52;
            default: goto L_0x0c41;
        };
    L_0x0c41:
        r0 = r4;
    L_0x0c42:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x05bb;
    L_0x0c4b:
        r0 = r1;
        goto L_0x0c42;
    L_0x0c4d:
        r0 = r2;
        goto L_0x0c42;
    L_0x0c4f:
        r0 = 92;
        goto L_0x0c42;
    L_0x0c52:
        r0 = r3;
        goto L_0x0c42;
    L_0x0c54:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0c65;
            case 1: goto L_0x0c67;
            case 2: goto L_0x0c69;
            case 3: goto L_0x0c6c;
            default: goto L_0x0c5b;
        };
    L_0x0c5b:
        r0 = r4;
    L_0x0c5c:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x05d5;
    L_0x0c65:
        r0 = r1;
        goto L_0x0c5c;
    L_0x0c67:
        r0 = r2;
        goto L_0x0c5c;
    L_0x0c69:
        r0 = 92;
        goto L_0x0c5c;
    L_0x0c6c:
        r0 = r3;
        goto L_0x0c5c;
    L_0x0c6e:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0c7f;
            case 1: goto L_0x0c81;
            case 2: goto L_0x0c83;
            case 3: goto L_0x0c86;
            default: goto L_0x0c75;
        };
    L_0x0c75:
        r0 = r4;
    L_0x0c76:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x05ef;
    L_0x0c7f:
        r0 = r1;
        goto L_0x0c76;
    L_0x0c81:
        r0 = r2;
        goto L_0x0c76;
    L_0x0c83:
        r0 = 92;
        goto L_0x0c76;
    L_0x0c86:
        r0 = r3;
        goto L_0x0c76;
    L_0x0c88:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0c99;
            case 1: goto L_0x0c9b;
            case 2: goto L_0x0c9d;
            case 3: goto L_0x0ca0;
            default: goto L_0x0c8f;
        };
    L_0x0c8f:
        r0 = r4;
    L_0x0c90:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0609;
    L_0x0c99:
        r0 = r1;
        goto L_0x0c90;
    L_0x0c9b:
        r0 = r2;
        goto L_0x0c90;
    L_0x0c9d:
        r0 = 92;
        goto L_0x0c90;
    L_0x0ca0:
        r0 = r3;
        goto L_0x0c90;
    L_0x0ca2:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0cb3;
            case 1: goto L_0x0cb5;
            case 2: goto L_0x0cb7;
            case 3: goto L_0x0cba;
            default: goto L_0x0ca9;
        };
    L_0x0ca9:
        r0 = r4;
    L_0x0caa:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0623;
    L_0x0cb3:
        r0 = r1;
        goto L_0x0caa;
    L_0x0cb5:
        r0 = r2;
        goto L_0x0caa;
    L_0x0cb7:
        r0 = 92;
        goto L_0x0caa;
    L_0x0cba:
        r0 = r3;
        goto L_0x0caa;
    L_0x0cbc:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0ccd;
            case 1: goto L_0x0ccf;
            case 2: goto L_0x0cd1;
            case 3: goto L_0x0cd4;
            default: goto L_0x0cc3;
        };
    L_0x0cc3:
        r0 = r4;
    L_0x0cc4:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x063d;
    L_0x0ccd:
        r0 = r1;
        goto L_0x0cc4;
    L_0x0ccf:
        r0 = r2;
        goto L_0x0cc4;
    L_0x0cd1:
        r0 = 92;
        goto L_0x0cc4;
    L_0x0cd4:
        r0 = r3;
        goto L_0x0cc4;
    L_0x0cd6:
        r11 = r5[r8];
        r0 = r8 % 5;
        switch(r0) {
            case 0: goto L_0x0ce7;
            case 1: goto L_0x0ce9;
            case 2: goto L_0x0ceb;
            case 3: goto L_0x0cee;
            default: goto L_0x0cdd;
        };
    L_0x0cdd:
        r0 = r4;
    L_0x0cde:
        r0 = r0 ^ r11;
        r0 = (char) r0;
        r5[r8] = r0;
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0657;
    L_0x0ce7:
        r0 = r1;
        goto L_0x0cde;
    L_0x0ce9:
        r0 = r2;
        goto L_0x0cde;
    L_0x0ceb:
        r0 = 92;
        goto L_0x0cde;
    L_0x0cee:
        r0 = r3;
        goto L_0x0cde;
    L_0x0cf0:
        r8 = r5[r7];
        r0 = r7 % 5;
        switch(r0) {
            case 0: goto L_0x0d01;
            case 1: goto L_0x0d03;
            case 2: goto L_0x0d05;
            case 3: goto L_0x0d08;
            default: goto L_0x0cf7;
        };
    L_0x0cf7:
        r0 = r4;
    L_0x0cf8:
        r0 = r0 ^ r8;
        r0 = (char) r0;
        r5[r7] = r0;
        r0 = r7 + 1;
        r7 = r0;
        goto L_0x0671;
    L_0x0d01:
        r0 = r1;
        goto L_0x0cf8;
    L_0x0d03:
        r0 = r2;
        goto L_0x0cf8;
    L_0x0d05:
        r0 = 92;
        goto L_0x0cf8;
    L_0x0d08:
        r0 = r3;
        goto L_0x0cf8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.<clinit>():void");
    }

    private int h() {
        return (this.a - this.c) + 1;
    }

    public void close() {
        this.g = 0;
        this.n[0] = 8;
        this.e = 1;
        this.p.close();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(java.lang.String r6) {
        /*
        r5 = this;
        r1 = 0;
        r2 = com.google.eE.h;
    L_0x0003:
        r0 = r5.a;
        r3 = r6.length();
        r0 = r0 + r3;
        r3 = r5.o;
        if (r0 <= r3) goto L_0x0018;
    L_0x000e:
        r0 = r6.length();	 Catch:{ NullPointerException -> 0x004c }
        r0 = r5.a(r0);	 Catch:{ NullPointerException -> 0x004c }
        if (r0 == 0) goto L_0x004b;
    L_0x0018:
        r0 = r5.b;	 Catch:{ NullPointerException -> 0x004e }
        r3 = r5.a;	 Catch:{ NullPointerException -> 0x004e }
        r0 = r0[r3];	 Catch:{ NullPointerException -> 0x004e }
        r3 = 10;
        if (r0 != r3) goto L_0x0030;
    L_0x0022:
        r0 = r5.f;	 Catch:{ NullPointerException -> 0x004e }
        r0 = r0 + 1;
        r5.f = r0;	 Catch:{ NullPointerException -> 0x004e }
        r0 = r5.a;	 Catch:{ NullPointerException -> 0x004e }
        r0 = r0 + 1;
        r5.c = r0;	 Catch:{ NullPointerException -> 0x004e }
        if (r2 == 0) goto L_0x0054;
    L_0x0030:
        r0 = r1;
    L_0x0031:
        r3 = r6.length();
        if (r0 >= r3) goto L_0x004a;
    L_0x0037:
        r3 = r5.b;	 Catch:{ NullPointerException -> 0x0050 }
        r4 = r5.a;	 Catch:{ NullPointerException -> 0x0050 }
        r4 = r4 + r0;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x0050 }
        r4 = r6.charAt(r0);	 Catch:{ NullPointerException -> 0x0050 }
        if (r3 == r4) goto L_0x0046;
    L_0x0044:
        if (r2 == 0) goto L_0x0054;
    L_0x0046:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0031;
    L_0x004a:
        r1 = 1;
    L_0x004b:
        return r1;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = r5.a;
        r0 = r0 + 1;
        r5.a = r0;
        if (r2 == 0) goto L_0x0003;
    L_0x005c:
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.b(java.lang.String):boolean");
    }

    public void c() {
        int i = this.g;
        if (i == 0) {
            i = s();
        }
        if (i == 3) {
            try {
                b(1);
                this.d[this.e - 1] = 0;
                this.g = 0;
                if (eE.h == 0) {
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        throw new IllegalStateException(z[39] + e() + z[40] + a() + z[38] + h() + z[37] + o());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long r() {
        /*
        r8 = this;
        r7 = 8;
        r6 = 0;
        r2 = com.google.eE.h;
        r0 = r8.g;
        if (r0 != 0) goto L_0x000d;
    L_0x0009:
        r0 = r8.s();
    L_0x000d:
        r1 = 15;
        if (r0 != r1) goto L_0x0025;
    L_0x0011:
        r0 = 0;
        r8.g = r0;	 Catch:{ NumberFormatException -> 0x0023 }
        r0 = r8.d;	 Catch:{ NumberFormatException -> 0x0023 }
        r1 = r8.e;	 Catch:{ NumberFormatException -> 0x0023 }
        r1 = r1 + -1;
        r2 = r0[r1];	 Catch:{ NumberFormatException -> 0x0023 }
        r2 = r2 + 1;
        r0[r1] = r2;	 Catch:{ NumberFormatException -> 0x0023 }
        r0 = r8.i;	 Catch:{ NumberFormatException -> 0x0023 }
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r1 = 16;
        if (r0 != r1) goto L_0x003f;
    L_0x0029:
        r1 = new java.lang.String;	 Catch:{ NumberFormatException -> 0x00c1 }
        r3 = r8.b;	 Catch:{ NumberFormatException -> 0x00c1 }
        r4 = r8.a;	 Catch:{ NumberFormatException -> 0x00c1 }
        r5 = r8.l;	 Catch:{ NumberFormatException -> 0x00c1 }
        r1.<init>(r3, r4, r5);	 Catch:{ NumberFormatException -> 0x00c1 }
        r8.m = r1;	 Catch:{ NumberFormatException -> 0x00c1 }
        r1 = r8.a;	 Catch:{ NumberFormatException -> 0x00c1 }
        r3 = r8.l;	 Catch:{ NumberFormatException -> 0x00c1 }
        r1 = r1 + r3;
        r8.a = r1;	 Catch:{ NumberFormatException -> 0x00c1 }
        if (r2 == 0) goto L_0x00cf;
    L_0x003f:
        if (r0 == r7) goto L_0x0045;
    L_0x0041:
        r1 = 9;
        if (r0 != r1) goto L_0x0068;
    L_0x0045:
        if (r0 != r7) goto L_0x00cb;
    L_0x0047:
        r0 = 39;
    L_0x0049:
        r0 = r8.c(r0);
        r8.m = r0;
        r0 = r8.m;	 Catch:{ NumberFormatException -> 0x0065 }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0065 }
        r3 = 0;
        r8.g = r3;	 Catch:{ NumberFormatException -> 0x0065 }
        r3 = r8.d;	 Catch:{ NumberFormatException -> 0x0065 }
        r4 = r8.e;	 Catch:{ NumberFormatException -> 0x0065 }
        r4 = r4 + -1;
        r5 = r3[r4];	 Catch:{ NumberFormatException -> 0x0065 }
        r5 = r5 + 1;
        r3[r4] = r5;	 Catch:{ NumberFormatException -> 0x0065 }
        goto L_0x0022;
    L_0x0065:
        r0 = move-exception;
        if (r2 == 0) goto L_0x00cf;
    L_0x0068:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00bf }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x00bf }
        r2 = z;	 Catch:{ NumberFormatException -> 0x00bf }
        r3 = 50;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00bf }
        r2 = r8.e();	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00bf }
        r2 = z;	 Catch:{ NumberFormatException -> 0x00bf }
        r3 = 48;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00bf }
        r2 = r8.a();	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00bf }
        r2 = z;	 Catch:{ NumberFormatException -> 0x00bf }
        r3 = 51;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00bf }
        r2 = r8.h();	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00bf }
        r2 = z;	 Catch:{ NumberFormatException -> 0x00bf }
        r3 = 46;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00bf }
        r2 = r8.o();	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x00bf }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x00bf }
        throw r0;	 Catch:{ NumberFormatException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c7 }
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = 34;
        goto L_0x0049;
    L_0x00cf:
        r0 = 11;
        r8.g = r0;
        r0 = r8.m;
        r2 = java.lang.Double.parseDouble(r0);
        r0 = (long) r2;
        r4 = (double) r0;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x0136;
    L_0x00df:
        r0 = new java.lang.NumberFormatException;	 Catch:{ NumberFormatException -> 0x0134 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0134 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x0134 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0134 }
        r3 = 52;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0134 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0134 }
        r2 = r8.m;	 Catch:{ NumberFormatException -> 0x0134 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0134 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0134 }
        r3 = 49;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0134 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0134 }
        r2 = r8.a();	 Catch:{ NumberFormatException -> 0x0134 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0134 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0134 }
        r3 = 47;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0134 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0134 }
        r2 = r8.h();	 Catch:{ NumberFormatException -> 0x0134 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0134 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0134 }
        r3 = 45;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0134 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0134 }
        r2 = r8.o();	 Catch:{ NumberFormatException -> 0x0134 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0134 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x0134 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0134 }
        throw r0;	 Catch:{ NumberFormatException -> 0x0134 }
    L_0x0134:
        r0 = move-exception;
        throw r0;
    L_0x0136:
        r2 = 0;
        r8.m = r2;
        r8.g = r6;
        r2 = r8.d;
        r3 = r8.e;
        r3 = r3 + -1;
        r4 = r2[r3];
        r4 = r4 + 1;
        r2[r3] = r4;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.r():long");
    }

    private IOException a(String str) {
        throw new fK(str + z[42] + a() + z[41] + h() + z[43] + o());
    }

    private String c(char c) {
        int i = eE.h;
        char[] cArr = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            int i2 = this.a;
            int i3 = this.o;
            int i4 = i2;
            while (i4 < i3) {
                int i5 = i4 + 1;
                char c2 = cArr[i4];
                if (c2 != c) {
                    if (c2 == '\\') {
                        this.a = i5;
                        stringBuilder.append(cArr, i2, (i5 - i2) - 1);
                        stringBuilder.append(n());
                        i2 = this.a;
                        i4 = this.o;
                        if (i == 0) {
                            i3 = i4;
                            i4 = i2;
                            continue;
                            if (i != 0) {
                                break;
                            }
                        }
                        i3 = i2;
                    } else {
                        i4 = i3;
                        i3 = i5;
                    }
                    int i6;
                    if (c2 == '\n') {
                        try {
                            this.f++;
                            this.c = i3;
                            i6 = i4;
                            i4 = i3;
                            i3 = i6;
                            continue;
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    }
                    i6 = i4;
                    i4 = i3;
                    i3 = i6;
                    continue;
                    if (i != 0) {
                        break;
                    }
                }
                try {
                    this.a = i5;
                    stringBuilder.append(cArr, i2, (i5 - i2) - 1);
                    return stringBuilder.toString();
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            try {
                stringBuilder.append(cArr, i2, i4 - i2);
                this.a = i4;
            } catch (NullPointerException e22) {
                throw e22;
            }
        } while (a(1));
        throw a(z[44]);
    }

    private int a() {
        return this.f + 1;
    }

    private boolean a(char c) {
        switch (c) {
            case Y.l /*9*/:
            case Y.t /*10*/:
            case Y.p /*12*/:
            case Y.q /*13*/:
            case arj.Theme_actionModeCutDrawable /*32*/:
            case arj.Theme_listDividerAlertDialog /*44*/:
            case arj.Theme_toolbarStyle /*58*/:
            case arj.Theme_alertDialogStyle /*91*/:
            case arj.Theme_alertDialogCenterButtons /*93*/:
            case '{':
            case '}':
                break;
            case arj.Theme_actionModeSelectAllDrawable /*35*/:
            case arj.Theme_spinnerDropDownItemStyle /*47*/:
            case arj.Theme_toolbarNavigationButtonStyle /*59*/:
            case arj.Theme_popupWindowStyle /*61*/:
            case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                try {
                    b();
                    break;
                } catch (NullPointerException e) {
                    throw e;
                }
            default:
                return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String o() {
        /*
        r6 = this;
        r1 = com.google.eE.h;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = 36;
        r2 = r0.append(r2);
        r0 = 0;
        r3 = r6.e;
    L_0x0010:
        if (r0 >= r3) goto L_0x001d;
    L_0x0012:
        r4 = r6.n;	 Catch:{ NullPointerException -> 0x004c }
        r4 = r4[r0];	 Catch:{ NullPointerException -> 0x004c }
        switch(r4) {
            case 1: goto L_0x0022;
            case 2: goto L_0x0022;
            case 3: goto L_0x0037;
            case 4: goto L_0x0037;
            case 5: goto L_0x0037;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0010;
    L_0x001d:
        r0 = r2.toString();
        return r0;
    L_0x0022:
        r4 = 91;
        r4 = r2.append(r4);	 Catch:{ NullPointerException -> 0x004e }
        r5 = r6.d;	 Catch:{ NullPointerException -> 0x004e }
        r5 = r5[r0];	 Catch:{ NullPointerException -> 0x004e }
        r4 = r4.append(r5);	 Catch:{ NullPointerException -> 0x004e }
        r5 = 93;
        r4.append(r5);	 Catch:{ NullPointerException -> 0x004e }
        if (r1 == 0) goto L_0x0019;
    L_0x0037:
        r4 = 46;
        r2.append(r4);	 Catch:{ NullPointerException -> 0x004a }
        r4 = r6.k;	 Catch:{ NullPointerException -> 0x004a }
        r4 = r4[r0];	 Catch:{ NullPointerException -> 0x004a }
        if (r4 == 0) goto L_0x0019;
    L_0x0042:
        r4 = r6.k;	 Catch:{ NullPointerException -> 0x004a }
        r4 = r4[r0];	 Catch:{ NullPointerException -> 0x004a }
        r2.append(r4);	 Catch:{ NullPointerException -> 0x004a }
        goto L_0x0019;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x004a }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.o():java.lang.String");
    }

    public void k() {
        int i = this.g;
        if (i == 0) {
            i = s();
        }
        if (i == 2) {
            try {
                this.e--;
                this.k[this.e] = null;
                int[] iArr = this.d;
                int i2 = this.e - 1;
                iArr[i2] = iArr[i2] + 1;
                this.g = 0;
                if (eE.h == 0) {
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        throw new IllegalStateException(z[6] + e() + z[7] + a() + z[5] + h() + z[4] + o());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int s() {
        /*
        r10 = this;
        r2 = 7;
        r9 = 5;
        r0 = 4;
        r3 = 2;
        r1 = 1;
        r4 = com.google.eE.h;
        r5 = r10.n;
        r6 = r10.e;
        r6 = r6 + -1;
        r5 = r5[r6];
        if (r5 != r1) goto L_0x001c;
    L_0x0011:
        r6 = r10.n;	 Catch:{ NullPointerException -> 0x0032 }
        r7 = r10.e;	 Catch:{ NullPointerException -> 0x0032 }
        r7 = r7 + -1;
        r8 = 2;
        r6[r7] = r8;	 Catch:{ NullPointerException -> 0x0032 }
        if (r4 == 0) goto L_0x0153;
    L_0x001c:
        if (r5 != r3) goto L_0x0041;
    L_0x001e:
        r6 = r10.a(r1);
        switch(r6) {
            case 44: goto L_0x003d;
            case 59: goto L_0x003a;
            case 93: goto L_0x0034;
            default: goto L_0x0025;
        };
    L_0x0025:
        r0 = z;	 Catch:{ NullPointerException -> 0x0030 }
        r1 = 60;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0030 }
        r0 = r10.a(r0);	 Catch:{ NullPointerException -> 0x0030 }
        throw r0;	 Catch:{ NullPointerException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r1 = 4;
        r10.g = r1;	 Catch:{ NullPointerException -> 0x0038 }
    L_0x0037:
        return r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r10.b();
    L_0x003d:
        if (r4 != 0) goto L_0x0025;
    L_0x003f:
        if (r4 == 0) goto L_0x0153;
    L_0x0041:
        r6 = 3;
        if (r5 == r6) goto L_0x0046;
    L_0x0044:
        if (r5 != r9) goto L_0x00bf;
    L_0x0046:
        r0 = r10.n;	 Catch:{ NullPointerException -> 0x0065 }
        r2 = r10.e;	 Catch:{ NullPointerException -> 0x0065 }
        r2 = r2 + -1;
        r6 = 4;
        r0[r2] = r6;	 Catch:{ NullPointerException -> 0x0065 }
        if (r5 != r9) goto L_0x0073;
    L_0x0051:
        r0 = r10.a(r1);
        switch(r0) {
            case 44: goto L_0x0071;
            case 59: goto L_0x006e;
            case 125: goto L_0x0067;
            default: goto L_0x0058;
        };
    L_0x0058:
        r0 = z;	 Catch:{ NullPointerException -> 0x0063 }
        r1 = 54;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0063 }
        r0 = r10.a(r0);	 Catch:{ NullPointerException -> 0x0063 }
        throw r0;	 Catch:{ NullPointerException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = 2;
        r10.g = r0;	 Catch:{ NullPointerException -> 0x006c }
        r0 = r3;
        goto L_0x0037;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r10.b();
    L_0x0071:
        if (r4 != 0) goto L_0x0058;
    L_0x0073:
        r0 = r10.a(r1);
        switch(r0) {
            case 34: goto L_0x0091;
            case 39: goto L_0x0098;
            case 125: goto L_0x00a0;
            default: goto L_0x007a;
        };
    L_0x007a:
        r10.b();	 Catch:{ NullPointerException -> 0x008f }
        r1 = r10.a;	 Catch:{ NullPointerException -> 0x008f }
        r1 = r1 + -1;
        r10.a = r1;	 Catch:{ NullPointerException -> 0x008f }
        r0 = (char) r0;	 Catch:{ NullPointerException -> 0x008f }
        r0 = r10.a(r0);	 Catch:{ NullPointerException -> 0x008f }
        if (r0 == 0) goto L_0x00b4;
    L_0x008a:
        r0 = 14;
        r10.g = r0;	 Catch:{ NullPointerException -> 0x008f }
        goto L_0x0037;
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r0 = 13;
        r10.g = r0;	 Catch:{ NullPointerException -> 0x0096 }
        goto L_0x0037;
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r10.b();
        r0 = 12;
        r10.g = r0;
        goto L_0x0037;
    L_0x00a0:
        if (r5 == r9) goto L_0x00a9;
    L_0x00a2:
        r0 = 2;
        r10.g = r0;	 Catch:{ NullPointerException -> 0x00a7 }
        r0 = r3;
        goto L_0x0037;
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        r0 = z;
        r1 = 58;
        r0 = r0[r1];
        r0 = r10.a(r0);
        throw r0;
    L_0x00b4:
        r0 = z;
        r1 = 57;
        r0 = r0[r1];
        r0 = r10.a(r0);
        throw r0;
    L_0x00bf:
        if (r5 != r0) goto L_0x0103;
    L_0x00c1:
        r6 = r10.n;
        r7 = r10.e;
        r7 = r7 + -1;
        r6[r7] = r9;
        r6 = r10.a(r1);
        switch(r6) {
            case 58: goto L_0x00dd;
            case 59: goto L_0x00d0;
            case 60: goto L_0x00d0;
            case 61: goto L_0x00df;
            default: goto L_0x00d0;
        };
    L_0x00d0:
        r0 = z;	 Catch:{ NullPointerException -> 0x00db }
        r1 = 56;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x00db }
        r0 = r10.a(r0);	 Catch:{ NullPointerException -> 0x00db }
        throw r0;	 Catch:{ NullPointerException -> 0x00db }
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        if (r4 == 0) goto L_0x0101;
    L_0x00df:
        r10.b();	 Catch:{ NullPointerException -> 0x012a }
        r6 = r10.a;	 Catch:{ NullPointerException -> 0x012a }
        r7 = r10.o;	 Catch:{ NullPointerException -> 0x012a }
        if (r6 < r7) goto L_0x00ef;
    L_0x00e8:
        r6 = 1;
        r6 = r10.a(r6);	 Catch:{ NullPointerException -> 0x012c }
        if (r6 == 0) goto L_0x0101;
    L_0x00ef:
        r6 = r10.b;	 Catch:{ NullPointerException -> 0x012e }
        r7 = r10.a;	 Catch:{ NullPointerException -> 0x012e }
        r6 = r6[r7];	 Catch:{ NullPointerException -> 0x012e }
        r7 = 62;
        if (r6 != r7) goto L_0x0101;
    L_0x00f9:
        r6 = r10.a;	 Catch:{ NullPointerException -> 0x00db }
        r6 = r6 + 1;
        r10.a = r6;	 Catch:{ NullPointerException -> 0x00db }
        if (r4 != 0) goto L_0x00d0;
    L_0x0101:
        if (r4 == 0) goto L_0x0153;
    L_0x0103:
        r6 = 6;
        if (r5 != r6) goto L_0x0118;
    L_0x0106:
        r6 = r10.h;	 Catch:{ NullPointerException -> 0x0130 }
        if (r6 == 0) goto L_0x010d;
    L_0x010a:
        r10.q();	 Catch:{ NullPointerException -> 0x0130 }
    L_0x010d:
        r6 = r10.n;	 Catch:{ NullPointerException -> 0x0132 }
        r7 = r10.e;	 Catch:{ NullPointerException -> 0x0132 }
        r7 = r7 + -1;
        r8 = 7;
        r6[r7] = r8;	 Catch:{ NullPointerException -> 0x0132 }
        if (r4 == 0) goto L_0x0153;
    L_0x0118:
        if (r5 != r2) goto L_0x013f;
    L_0x011a:
        r6 = 0;
        r6 = r10.a(r6);
        r7 = -1;
        if (r6 != r7) goto L_0x0134;
    L_0x0122:
        r0 = 17;
        r10.g = r0;	 Catch:{ NullPointerException -> 0x0128 }
        goto L_0x0037;
    L_0x0128:
        r0 = move-exception;
        throw r0;
    L_0x012a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x012c }
    L_0x012c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x012e }
    L_0x012e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00db }
    L_0x0130:
        r0 = move-exception;
        throw r0;
    L_0x0132:
        r0 = move-exception;
        throw r0;
    L_0x0134:
        r10.b();	 Catch:{ NullPointerException -> 0x0151 }
        r6 = r10.a;	 Catch:{ NullPointerException -> 0x0151 }
        r6 = r6 + -1;
        r10.a = r6;	 Catch:{ NullPointerException -> 0x0151 }
        if (r4 == 0) goto L_0x0153;
    L_0x013f:
        r4 = 8;
        if (r5 != r4) goto L_0x0153;
    L_0x0143:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NullPointerException -> 0x014f }
        r1 = z;	 Catch:{ NullPointerException -> 0x014f }
        r2 = 55;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x014f }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x014f }
        throw r0;	 Catch:{ NullPointerException -> 0x014f }
    L_0x014f:
        r0 = move-exception;
        throw r0;
    L_0x0151:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x014f }
    L_0x0153:
        r4 = r10.a(r1);
        switch(r4) {
            case 34: goto L_0x01be;
            case 39: goto L_0x01b5;
            case 44: goto L_0x0195;
            case 59: goto L_0x0195;
            case 91: goto L_0x01cd;
            case 93: goto L_0x018c;
            case 123: goto L_0x01d2;
            default: goto L_0x015a;
        };
    L_0x015a:
        r0 = r10.a;	 Catch:{ NullPointerException -> 0x01d7 }
        r0 = r0 + -1;
        r10.a = r0;	 Catch:{ NullPointerException -> 0x01d7 }
        r0 = r10.e;	 Catch:{ NullPointerException -> 0x01d7 }
        if (r0 != r1) goto L_0x0167;
    L_0x0164:
        r10.b();	 Catch:{ NullPointerException -> 0x01d7 }
    L_0x0167:
        r0 = r10.p();
        if (r0 != 0) goto L_0x0037;
    L_0x016d:
        r0 = r10.m();
        if (r0 != 0) goto L_0x0037;
    L_0x0173:
        r0 = r10.b;	 Catch:{ NullPointerException -> 0x018a }
        r1 = r10.a;	 Catch:{ NullPointerException -> 0x018a }
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x018a }
        r0 = r10.a(r0);	 Catch:{ NullPointerException -> 0x018a }
        if (r0 != 0) goto L_0x01d9;
    L_0x017f:
        r0 = z;	 Catch:{ NullPointerException -> 0x018a }
        r1 = 61;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x018a }
        r0 = r10.a(r0);	 Catch:{ NullPointerException -> 0x018a }
        throw r0;	 Catch:{ NullPointerException -> 0x018a }
    L_0x018a:
        r0 = move-exception;
        throw r0;
    L_0x018c:
        if (r5 != r1) goto L_0x0195;
    L_0x018e:
        r1 = 4;
        r10.g = r1;	 Catch:{ NullPointerException -> 0x0193 }
        goto L_0x0037;
    L_0x0193:
        r0 = move-exception;
        throw r0;
    L_0x0195:
        if (r5 == r1) goto L_0x0199;
    L_0x0197:
        if (r5 != r3) goto L_0x01aa;
    L_0x0199:
        r10.b();	 Catch:{ NullPointerException -> 0x01a8 }
        r0 = r10.a;	 Catch:{ NullPointerException -> 0x01a8 }
        r0 = r0 + -1;
        r10.a = r0;	 Catch:{ NullPointerException -> 0x01a8 }
        r0 = 7;
        r10.g = r0;	 Catch:{ NullPointerException -> 0x01a8 }
        r0 = r2;
        goto L_0x0037;
    L_0x01a8:
        r0 = move-exception;
        throw r0;
    L_0x01aa:
        r0 = z;
        r1 = 59;
        r0 = r0[r1];
        r0 = r10.a(r0);
        throw r0;
    L_0x01b5:
        r10.b();
        r0 = 8;
        r10.g = r0;
        goto L_0x0037;
    L_0x01be:
        r0 = r10.e;	 Catch:{ NullPointerException -> 0x01cb }
        if (r0 != r1) goto L_0x01c5;
    L_0x01c2:
        r10.b();	 Catch:{ NullPointerException -> 0x01cb }
    L_0x01c5:
        r0 = 9;
        r10.g = r0;
        goto L_0x0037;
    L_0x01cb:
        r0 = move-exception;
        throw r0;
    L_0x01cd:
        r0 = 3;
        r10.g = r0;
        goto L_0x0037;
    L_0x01d2:
        r10.g = r1;
        r0 = r1;
        goto L_0x0037;
    L_0x01d7:
        r0 = move-exception;
        throw r0;
    L_0x01d9:
        r10.b();
        r0 = 10;
        r10.g = r0;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.s():int");
    }

    public boolean d() {
        int i = this.g;
        if (i == 0) {
            i = s();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public void l() {
        int i = this.g;
        if (i == 0) {
            i = s();
        }
        if (i == 1) {
            try {
                b(3);
                this.g = 0;
                if (eE.h == 0) {
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        throw new IllegalStateException(z[15] + e() + z[14] + a() + z[13] + h() + z[12] + o());
    }

    private void t() {
        int i = eE.h;
        do {
            if (this.a < this.o || a(1)) {
                char[] cArr = this.b;
                int i2 = this.a;
                this.a = i2 + 1;
                char c = cArr[i2];
                if (c == '\n') {
                    try {
                        this.f++;
                        this.c = this.a;
                        if (i == 0) {
                            return;
                        }
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (NullPointerException e2) {
                        try {
                            throw e2;
                        } catch (NullPointerException e22) {
                            throw e22;
                        }
                    }
                }
                if (c == '\r' && i == 0) {
                    return;
                }
            } else {
                return;
            }
        } while (i == 0);
    }

    private void q() {
        int i = eE.h;
        try {
            a(true);
            this.a--;
            if (this.a + j.length > this.o) {
                if (!a(j.length)) {
                    return;
                }
            }
            int i2 = 0;
            while (i2 < j.length) {
                try {
                    if (this.b[this.a + i2] == j[i2]) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    return;
                } catch (NullPointerException e) {
                    throw e;
                }
            }
            this.a += j.length;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String i() {
        /*
        r4 = this;
        r3 = 0;
        r2 = com.google.eE.h;
        r0 = r4.g;
        if (r0 != 0) goto L_0x008e;
    L_0x0007:
        r0 = r4.s();
        r1 = r0;
    L_0x000c:
        r0 = 14;
        if (r1 != r0) goto L_0x0016;
    L_0x0010:
        r0 = r4.j();
        if (r2 == 0) goto L_0x0083;
    L_0x0016:
        r0 = 12;
        if (r1 != r0) goto L_0x0022;
    L_0x001a:
        r0 = 39;
        r0 = r4.c(r0);
        if (r2 == 0) goto L_0x0083;
    L_0x0022:
        r0 = 13;
        if (r1 != r0) goto L_0x002e;
    L_0x0026:
        r0 = 34;
        r0 = r4.c(r0);
        if (r2 == 0) goto L_0x0083;
    L_0x002e:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NullPointerException -> 0x0081 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0081 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x0081 }
        r2 = z;	 Catch:{ NullPointerException -> 0x0081 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0081 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0081 }
        r2 = r4.e();	 Catch:{ NullPointerException -> 0x0081 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0081 }
        r2 = z;	 Catch:{ NullPointerException -> 0x0081 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0081 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0081 }
        r2 = r4.a();	 Catch:{ NullPointerException -> 0x0081 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0081 }
        r2 = z;	 Catch:{ NullPointerException -> 0x0081 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0081 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0081 }
        r2 = r4.h();	 Catch:{ NullPointerException -> 0x0081 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0081 }
        r2 = z;	 Catch:{ NullPointerException -> 0x0081 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0081 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0081 }
        r2 = r4.o();	 Catch:{ NullPointerException -> 0x0081 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0081 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0081 }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x0081 }
        throw r0;	 Catch:{ NullPointerException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r4.g = r3;
        r1 = r4.k;
        r2 = r4.e;
        r2 = r2 + -1;
        r1[r2] = r0;
        return r0;
    L_0x008e:
        r1 = r0;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.i():java.lang.String");
    }

    public e_ e() {
        int i = this.g;
        if (i == 0) {
            i = s();
        }
        switch (i) {
            case at.g /*1*/:
                try {
                    return e_.BEGIN_OBJECT;
                } catch (NullPointerException e) {
                    throw e;
                }
            case at.i /*2*/:
                return e_.END_OBJECT;
            case at.o /*3*/:
                return e_.BEGIN_ARRAY;
            case at.p /*4*/:
                return e_.END_ARRAY;
            case at.m /*5*/:
            case Y.f /*6*/:
                return e_.BOOLEAN;
            case aF.v /*7*/:
                return e_.NULL;
            case aF.u /*8*/:
            case Y.l /*9*/:
            case Y.t /*10*/:
            case Y.j /*11*/:
                return e_.STRING;
            case Y.p /*12*/:
            case Y.q /*13*/:
            case arj.Toolbar_titleMarginEnd /*14*/:
                return e_.NAME;
            case arj.Toolbar_titleMarginTop /*15*/:
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                return e_.NUMBER;
            case arj.Toolbar_maxButtonHeight /*17*/:
                return e_.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String f() {
        /*
        r6 = this;
        r2 = com.google.eE.h;
        r0 = r6.g;
        if (r0 != 0) goto L_0x00c7;
    L_0x0006:
        r0 = r6.s();
        r1 = r0;
    L_0x000b:
        r0 = 10;
        if (r1 != r0) goto L_0x0015;
    L_0x000f:
        r0 = r6.j();
        if (r2 == 0) goto L_0x00b7;
    L_0x0015:
        r0 = 8;
        if (r1 != r0) goto L_0x0021;
    L_0x0019:
        r0 = 39;
        r0 = r6.c(r0);
        if (r2 == 0) goto L_0x00b7;
    L_0x0021:
        r0 = 9;
        if (r1 != r0) goto L_0x002d;
    L_0x0025:
        r0 = 34;
        r0 = r6.c(r0);
        if (r2 == 0) goto L_0x00b7;
    L_0x002d:
        r0 = 11;
        if (r1 != r0) goto L_0x0038;
    L_0x0031:
        r0 = r6.m;
        r3 = 0;
        r6.m = r3;	 Catch:{ NullPointerException -> 0x00b5 }
        if (r2 == 0) goto L_0x00b7;
    L_0x0038:
        r0 = 15;
        if (r1 != r0) goto L_0x0044;
    L_0x003c:
        r4 = r6.i;
        r0 = java.lang.Long.toString(r4);
        if (r2 == 0) goto L_0x00b7;
    L_0x0044:
        r0 = 16;
        if (r1 != r0) goto L_0x005c;
    L_0x0048:
        r0 = new java.lang.String;
        r1 = r6.b;
        r3 = r6.a;
        r4 = r6.l;
        r0.<init>(r1, r3, r4);
        r1 = r6.a;	 Catch:{ NullPointerException -> 0x00b3 }
        r3 = r6.l;	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = r1 + r3;
        r6.a = r1;	 Catch:{ NullPointerException -> 0x00b3 }
        if (r2 == 0) goto L_0x00b7;
    L_0x005c:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00b3 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x00b3 }
        r2 = z;	 Catch:{ NullPointerException -> 0x00b3 }
        r3 = 25;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b3 }
        r2 = r6.e();	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b3 }
        r2 = z;	 Catch:{ NullPointerException -> 0x00b3 }
        r3 = 27;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b3 }
        r2 = r6.a();	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b3 }
        r2 = z;	 Catch:{ NullPointerException -> 0x00b3 }
        r3 = 28;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b3 }
        r2 = r6.h();	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b3 }
        r2 = z;	 Catch:{ NullPointerException -> 0x00b3 }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b3 }
        r2 = r6.o();	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b3 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x00b3 }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x00b3 }
        throw r0;	 Catch:{ NullPointerException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r1 = 0;
        r6.g = r1;
        r1 = r6.d;
        r2 = r6.e;
        r2 = r2 + -1;
        r3 = r1[r2];
        r3 = r3 + 1;
        r1[r2] = r3;
        return r0;
    L_0x00c7:
        r1 = r0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.f():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m() {
        /*
        r19 = this;
        r14 = com.google.eE.h;
        r0 = r19;
        r15 = r0.b;
        r0 = r19;
        r3 = r0.a;
        r0 = r19;
        r2 = r0.o;
        r8 = 0;
        r7 = 0;
        r6 = 1;
        r4 = 0;
        r5 = 0;
    L_0x0014:
        r10 = r3 + r5;
        if (r10 != r2) goto L_0x0033;
    L_0x0018:
        r2 = r15.length;	 Catch:{ NullPointerException -> 0x001d }
        if (r5 != r2) goto L_0x001f;
    L_0x001b:
        r2 = 0;
    L_0x001c:
        return r2;
    L_0x001d:
        r2 = move-exception;
        throw r2;
    L_0x001f:
        r2 = r5 + 1;
        r0 = r19;
        r2 = r0.a(r2);	 Catch:{ NullPointerException -> 0x004e }
        if (r2 != 0) goto L_0x002b;
    L_0x0029:
        if (r14 == 0) goto L_0x012e;
    L_0x002b:
        r0 = r19;
        r3 = r0.a;
        r0 = r19;
        r2 = r0.o;
    L_0x0033:
        r10 = r3 + r5;
        r10 = r15[r10];
        switch(r10) {
            case 43: goto L_0x005e;
            case 45: goto L_0x0050;
            case 46: goto L_0x0071;
            case 69: goto L_0x0066;
            case 101: goto L_0x0066;
            default: goto L_0x003a;
        };
    L_0x003a:
        r11 = 48;
        if (r10 < r11) goto L_0x0042;
    L_0x003e:
        r11 = 57;
        if (r10 <= r11) goto L_0x007d;
    L_0x0042:
        r0 = r19;
        r2 = r0.a(r10);	 Catch:{ NullPointerException -> 0x0079 }
        if (r2 != 0) goto L_0x004c;
    L_0x004a:
        if (r14 == 0) goto L_0x012e;
    L_0x004c:
        r2 = 0;
        goto L_0x001c;
    L_0x004e:
        r2 = move-exception;
        throw r2;
    L_0x0050:
        if (r4 != 0) goto L_0x0056;
    L_0x0052:
        r7 = 1;
        r4 = 1;
        if (r14 == 0) goto L_0x0129;
    L_0x0056:
        r10 = 5;
        if (r4 != r10) goto L_0x005c;
    L_0x0059:
        r4 = 6;
        if (r14 == 0) goto L_0x0129;
    L_0x005c:
        r2 = 0;
        goto L_0x001c;
    L_0x005e:
        r10 = 5;
        if (r4 != r10) goto L_0x0064;
    L_0x0061:
        r4 = 6;
        if (r14 == 0) goto L_0x0129;
    L_0x0064:
        r2 = 0;
        goto L_0x001c;
    L_0x0066:
        r10 = 2;
        if (r4 == r10) goto L_0x006c;
    L_0x0069:
        r10 = 4;
        if (r4 != r10) goto L_0x006f;
    L_0x006c:
        r4 = 5;
        if (r14 == 0) goto L_0x0129;
    L_0x006f:
        r2 = 0;
        goto L_0x001c;
    L_0x0071:
        r10 = 2;
        if (r4 != r10) goto L_0x0077;
    L_0x0074:
        r4 = 3;
        if (r14 == 0) goto L_0x0129;
    L_0x0077:
        r2 = 0;
        goto L_0x001c;
    L_0x0079:
        r2 = move-exception;
        throw r2;	 Catch:{ NullPointerException -> 0x007b }
    L_0x007b:
        r2 = move-exception;
        throw r2;
    L_0x007d:
        r11 = 1;
        if (r4 == r11) goto L_0x0082;
    L_0x0080:
        if (r4 != 0) goto L_0x0089;
    L_0x0082:
        r4 = r10 + -48;
        r4 = -r4;
        r8 = (long) r4;
        r4 = 2;
        if (r14 == 0) goto L_0x0129;
    L_0x0089:
        r12 = r8;
        r8 = r4;
        r4 = 2;
        if (r8 != r4) goto L_0x0126;
    L_0x008e:
        r16 = 0;
        r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x0096;
    L_0x0094:
        r2 = 0;
        goto L_0x001c;
    L_0x0096:
        r16 = 10;
        r16 = r16 * r12;
        r4 = r10 + -48;
        r10 = (long) r4;
        r10 = r16 - r10;
        r16 = -922337203685477580; // 0xf333333333333334 float:4.1723254E-8 double:-8.390303882365713E246;
        r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1));
        if (r4 > 0) goto L_0x00b5;
    L_0x00a8:
        r16 = -922337203685477580; // 0xf333333333333334 float:4.1723254E-8 double:-8.390303882365713E246;
        r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x00f5;
    L_0x00b1:
        r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r4 >= 0) goto L_0x00f5;
    L_0x00b5:
        r4 = 1;
    L_0x00b6:
        r6 = r6 & r4;
        if (r14 == 0) goto L_0x011f;
    L_0x00b9:
        r4 = r6;
    L_0x00ba:
        r6 = 3;
        if (r8 != r6) goto L_0x011d;
    L_0x00bd:
        r6 = 4;
        if (r14 == 0) goto L_0x011a;
    L_0x00c0:
        r8 = 5;
        if (r6 == r8) goto L_0x00c6;
    L_0x00c3:
        r8 = 6;
        if (r6 != r8) goto L_0x011a;
    L_0x00c6:
        r6 = 7;
        r8 = r7;
        r7 = r4;
    L_0x00c9:
        r4 = r5 + 1;
        if (r14 == 0) goto L_0x0113;
    L_0x00cd:
        r5 = r6;
        r2 = r10;
        r6 = r7;
        r7 = r8;
    L_0x00d1:
        r8 = 2;
        if (r5 != r8) goto L_0x00f9;
    L_0x00d4:
        if (r6 == 0) goto L_0x00f9;
    L_0x00d6:
        r8 = -9223372036854775808;
        r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x00de;
    L_0x00dc:
        if (r7 == 0) goto L_0x00f9;
    L_0x00de:
        if (r7 == 0) goto L_0x00f7;
    L_0x00e0:
        r0 = r19;
        r0.i = r2;
        r0 = r19;
        r2 = r0.a;
        r2 = r2 + r4;
        r0 = r19;
        r0.a = r2;
        r2 = 15;
        r0 = r19;
        r0.g = r2;
        goto L_0x001c;
    L_0x00f5:
        r4 = 0;
        goto L_0x00b6;
    L_0x00f7:
        r2 = -r2;
        goto L_0x00e0;
    L_0x00f9:
        r2 = 2;
        if (r5 == r2) goto L_0x0102;
    L_0x00fc:
        r2 = 4;
        if (r5 == r2) goto L_0x0102;
    L_0x00ff:
        r2 = 7;
        if (r5 != r2) goto L_0x0110;
    L_0x0102:
        r0 = r19;
        r0.l = r4;	 Catch:{ NullPointerException -> 0x010e }
        r2 = 16;
        r0 = r19;
        r0.g = r2;	 Catch:{ NullPointerException -> 0x010e }
        goto L_0x001c;
    L_0x010e:
        r2 = move-exception;
        throw r2;
    L_0x0110:
        r2 = 0;
        goto L_0x001c;
    L_0x0113:
        r5 = r4;
        r4 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r10;
        goto L_0x0014;
    L_0x011a:
        r8 = r7;
        r7 = r4;
        goto L_0x00c9;
    L_0x011d:
        r6 = r8;
        goto L_0x00c0;
    L_0x011f:
        r18 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r18;
        goto L_0x00c9;
    L_0x0126:
        r4 = r6;
        r10 = r12;
        goto L_0x00ba;
    L_0x0129:
        r10 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r4;
        goto L_0x00c9;
    L_0x012e:
        r2 = r8;
        r18 = r4;
        r4 = r5;
        r5 = r18;
        goto L_0x00d1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.m():int");
    }

    private void b(int i) {
        if (this.e == this.n.length) {
            Object obj = new int[(this.e * 2)];
            Object obj2 = new int[(this.e * 2)];
            Object obj3 = new String[(this.e * 2)];
            System.arraycopy(this.n, 0, obj, 0, this.e);
            System.arraycopy(this.d, 0, obj2, 0, this.e);
            System.arraycopy(this.k, 0, obj3, 0, this.e);
            this.n = obj;
            this.d = obj2;
            this.k = obj3;
        }
        int[] iArr = this.n;
        int i2 = this.e;
        this.e = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void u() {
        /*
        r4 = this;
        r1 = com.google.eE.h;
    L_0x0002:
        r0 = 0;
    L_0x0003:
        r2 = r4.a;
        r2 = r2 + r0;
        r3 = r4.o;
        if (r2 >= r3) goto L_0x0018;
    L_0x000a:
        r2 = r4.b;	 Catch:{ NullPointerException -> 0x002e }
        r3 = r4.a;	 Catch:{ NullPointerException -> 0x002e }
        r3 = r3 + r0;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x002e }
        switch(r2) {
            case 9: goto L_0x0028;
            case 10: goto L_0x0028;
            case 12: goto L_0x0028;
            case 13: goto L_0x0028;
            case 32: goto L_0x0028;
            case 35: goto L_0x0025;
            case 44: goto L_0x0028;
            case 47: goto L_0x0025;
            case 58: goto L_0x0028;
            case 59: goto L_0x0025;
            case 61: goto L_0x0025;
            case 91: goto L_0x0028;
            case 92: goto L_0x0025;
            case 93: goto L_0x0028;
            case 123: goto L_0x0028;
            case 125: goto L_0x0028;
            default: goto L_0x0014;
        };
    L_0x0014:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0003;
    L_0x0018:
        r2 = r4.a;
        r0 = r0 + r2;
        r4.a = r0;
        r0 = 1;
        r0 = r4.a(r0);
        if (r0 != 0) goto L_0x0002;
    L_0x0024:
        return;
    L_0x0025:
        r4.b();	 Catch:{ NullPointerException -> 0x002e }
    L_0x0028:
        r1 = r4.a;
        r0 = r0 + r1;
        r4.a = r0;
        goto L_0x0024;
    L_0x002e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.u():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(char r8) {
        /*
        r7 = this;
        r3 = com.google.eE.h;
        r4 = r7.b;
    L_0x0004:
        r0 = r7.a;
        r1 = r7.o;
    L_0x0008:
        if (r0 >= r1) goto L_0x0035;
    L_0x000a:
        r2 = r0 + 1;
        r5 = r4[r0];
        if (r5 != r8) goto L_0x0015;
    L_0x0010:
        r7.a = r2;	 Catch:{ NullPointerException -> 0x0013 }
        return;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r0 = 92;
        if (r5 != r0) goto L_0x004f;
    L_0x0019:
        r7.a = r2;
        r7.n();
        r1 = r7.a;
        r0 = r7.o;
        if (r3 == 0) goto L_0x004b;
    L_0x0024:
        r2 = 10;
        if (r5 != r2) goto L_0x004b;
    L_0x0028:
        r2 = r7.f;	 Catch:{ NullPointerException -> 0x0049 }
        r2 = r2 + 1;
        r7.f = r2;	 Catch:{ NullPointerException -> 0x0049 }
        r7.c = r1;	 Catch:{ NullPointerException -> 0x0049 }
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x0033:
        if (r3 == 0) goto L_0x0008;
    L_0x0035:
        r7.a = r0;
        r0 = 1;
        r0 = r7.a(r0);
        if (r0 != 0) goto L_0x0004;
    L_0x003e:
        r0 = z;
        r1 = 53;
        r0 = r0[r1];
        r0 = r7.a(r0);
        throw r0;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r6 = r0;
        r0 = r1;
        r1 = r6;
        goto L_0x0033;
    L_0x004f:
        r0 = r1;
        r1 = r2;
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.b(char):void");
    }

    public void g() {
        int i = this.g;
        if (i == 0) {
            i = s();
        }
        if (i == 4) {
            try {
                this.e--;
                int[] iArr = this.d;
                int i2 = this.e - 1;
                iArr[i2] = iArr[i2] + 1;
                this.g = 0;
                if (eE.h == 0) {
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        throw new IllegalStateException(z[22] + e() + z[21] + a() + z[23] + h() + z[24] + o());
    }

    public fh(Reader reader) {
        boolean z = false;
        int i = eE.h;
        this.h = false;
        this.b = new char[1024];
        this.a = 0;
        this.o = 0;
        this.f = 0;
        this.c = 0;
        this.g = 0;
        this.n = new int[32];
        this.e = 0;
        int[] iArr = this.n;
        int i2 = this.e;
        this.e = i2 + 1;
        iArr[i2] = 6;
        this.k = new String[32];
        this.d = new int[32];
        if (reader == null) {
            throw new NullPointerException(z[19]);
        }
        try {
            this.p = reader;
            if (i != 0) {
                if (!aX.a) {
                    z = true;
                }
                aX.a = z;
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(int r7) {
        /*
        r6 = this;
        r0 = 0;
        r1 = com.google.eE.h;
        r2 = r6.b;
        r3 = r6.c;	 Catch:{ NullPointerException -> 0x0064 }
        r4 = r6.a;	 Catch:{ NullPointerException -> 0x0064 }
        r3 = r3 - r4;
        r6.c = r3;	 Catch:{ NullPointerException -> 0x0064 }
        r3 = r6.o;	 Catch:{ NullPointerException -> 0x0064 }
        r4 = r6.a;	 Catch:{ NullPointerException -> 0x0064 }
        if (r3 == r4) goto L_0x0023;
    L_0x0012:
        r3 = r6.o;	 Catch:{ NullPointerException -> 0x0066 }
        r4 = r6.a;	 Catch:{ NullPointerException -> 0x0066 }
        r3 = r3 - r4;
        r6.o = r3;	 Catch:{ NullPointerException -> 0x0066 }
        r3 = r6.a;	 Catch:{ NullPointerException -> 0x0066 }
        r4 = 0;
        r5 = r6.o;	 Catch:{ NullPointerException -> 0x0066 }
        java.lang.System.arraycopy(r2, r3, r2, r4, r5);	 Catch:{ NullPointerException -> 0x0066 }
        if (r1 == 0) goto L_0x0026;
    L_0x0023:
        r1 = 0;
        r6.o = r1;	 Catch:{ NullPointerException -> 0x0066 }
    L_0x0026:
        r6.a = r0;
    L_0x0028:
        r1 = r6.p;
        r3 = r6.o;
        r4 = r2.length;
        r5 = r6.o;
        r4 = r4 - r5;
        r1 = r1.read(r2, r3, r4);
        r3 = -1;
        if (r1 == r3) goto L_0x0063;
    L_0x0037:
        r3 = r6.o;	 Catch:{ NullPointerException -> 0x0068 }
        r1 = r1 + r3;
        r6.o = r1;	 Catch:{ NullPointerException -> 0x0068 }
        r1 = r6.f;	 Catch:{ NullPointerException -> 0x0068 }
        if (r1 != 0) goto L_0x005e;
    L_0x0040:
        r1 = r6.c;	 Catch:{ NullPointerException -> 0x006a }
        if (r1 != 0) goto L_0x005e;
    L_0x0044:
        r1 = r6.o;	 Catch:{ NullPointerException -> 0x006c }
        if (r1 <= 0) goto L_0x005e;
    L_0x0048:
        r1 = 0;
        r1 = r2[r1];	 Catch:{ NullPointerException -> 0x006e }
        r3 = 65279; // 0xfeff float:9.1475E-41 double:3.2252E-319;
        if (r1 != r3) goto L_0x005e;
    L_0x0050:
        r1 = r6.a;	 Catch:{ NullPointerException -> 0x006e }
        r1 = r1 + 1;
        r6.a = r1;	 Catch:{ NullPointerException -> 0x006e }
        r1 = r6.c;	 Catch:{ NullPointerException -> 0x006e }
        r1 = r1 + 1;
        r6.c = r1;	 Catch:{ NullPointerException -> 0x006e }
        r7 = r7 + 1;
    L_0x005e:
        r1 = r6.o;
        if (r1 < r7) goto L_0x0028;
    L_0x0062:
        r0 = 1;
    L_0x0063:
        return r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.a(int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(boolean r9) {
        /*
        r8 = this;
        r7 = 10;
        r6 = 9;
        r3 = com.google.eE.h;
        r4 = r8.b;
        r2 = r8.a;
        r0 = r8.o;
        r1 = r2;
    L_0x000d:
        if (r1 != r0) goto L_0x001e;
    L_0x000f:
        r8.a = r1;	 Catch:{ NullPointerException -> 0x0057 }
        r0 = 1;
        r0 = r8.a(r0);	 Catch:{ NullPointerException -> 0x0057 }
        if (r0 != 0) goto L_0x001a;
    L_0x0018:
        if (r3 == 0) goto L_0x00be;
    L_0x001a:
        r1 = r8.a;
        r0 = r8.o;
    L_0x001e:
        r2 = r1 + 1;
        r1 = r4[r1];
        if (r1 != r7) goto L_0x002e;
    L_0x0024:
        r5 = r8.f;	 Catch:{ NullPointerException -> 0x0059 }
        r5 = r5 + 1;
        r8.f = r5;	 Catch:{ NullPointerException -> 0x0059 }
        r8.c = r2;	 Catch:{ NullPointerException -> 0x0059 }
        if (r3 == 0) goto L_0x00a1;
    L_0x002e:
        r5 = 32;
        if (r1 == r5) goto L_0x00a1;
    L_0x0032:
        r5 = 13;
        if (r1 == r5) goto L_0x00a1;
    L_0x0036:
        if (r1 != r6) goto L_0x003a;
    L_0x0038:
        if (r3 == 0) goto L_0x00a1;
    L_0x003a:
        r5 = 47;
        if (r1 != r5) goto L_0x00a4;
    L_0x003e:
        r8.a = r2;	 Catch:{ NullPointerException -> 0x005b }
        if (r2 != r0) goto L_0x005f;
    L_0x0042:
        r0 = r8.a;
        r0 = r0 + -1;
        r8.a = r0;
        r0 = 2;
        r0 = r8.a(r0);
        r2 = r8.a;	 Catch:{ NullPointerException -> 0x005d }
        r2 = r2 + 1;
        r8.a = r2;	 Catch:{ NullPointerException -> 0x005d }
        if (r0 != 0) goto L_0x005f;
    L_0x0055:
        r0 = r1;
    L_0x0056:
        return r0;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r8.b();
        r0 = r8.a;
        r0 = r4[r0];
        switch(r0) {
            case 42: goto L_0x006b;
            case 47: goto L_0x0092;
            default: goto L_0x0069;
        };
    L_0x0069:
        r0 = r1;
        goto L_0x0056;
    L_0x006b:
        r0 = r8.a;	 Catch:{ NullPointerException -> 0x0088 }
        r0 = r0 + 1;
        r8.a = r0;	 Catch:{ NullPointerException -> 0x0088 }
        r0 = z;	 Catch:{ NullPointerException -> 0x0088 }
        r2 = 8;
        r0 = r0[r2];	 Catch:{ NullPointerException -> 0x0088 }
        r0 = r8.b(r0);	 Catch:{ NullPointerException -> 0x0088 }
        if (r0 != 0) goto L_0x008a;
    L_0x007d:
        r0 = z;	 Catch:{ NullPointerException -> 0x0088 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0088 }
        r0 = r8.a(r0);	 Catch:{ NullPointerException -> 0x0088 }
        throw r0;	 Catch:{ NullPointerException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = r8.a;
        r2 = r0 + 2;
        r0 = r8.o;
        if (r3 == 0) goto L_0x00a1;
    L_0x0092:
        r0 = r8.a;
        r0 = r0 + 1;
        r8.a = r0;
        r8.t();
        r2 = r8.a;
        r0 = r8.o;
        if (r3 != 0) goto L_0x0069;
    L_0x00a1:
        r1 = r2;
        goto L_0x000d;
    L_0x00a4:
        r0 = 35;
        if (r1 != r0) goto L_0x00fc;
    L_0x00a8:
        r8.a = r2;
        r8.b();
        r8.t();
        r0 = r8.a;
        r2 = r8.o;
        if (r3 == 0) goto L_0x00bc;
    L_0x00b6:
        r8.a = r0;	 Catch:{ NullPointerException -> 0x00ba }
        r0 = r1;
        goto L_0x0056;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        if (r3 == 0) goto L_0x00f8;
    L_0x00be:
        if (r9 == 0) goto L_0x00f5;
    L_0x00c0:
        r0 = new java.io.EOFException;	 Catch:{ NullPointerException -> 0x00f3 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00f3 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x00f3 }
        r2 = z;	 Catch:{ NullPointerException -> 0x00f3 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00f3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00f3 }
        r2 = r8.a();	 Catch:{ NullPointerException -> 0x00f3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00f3 }
        r2 = z;	 Catch:{ NullPointerException -> 0x00f3 }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00f3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00f3 }
        r2 = r8.h();	 Catch:{ NullPointerException -> 0x00f3 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00f3 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x00f3 }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x00f3 }
        throw r0;	 Catch:{ NullPointerException -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r0 = -1;
        goto L_0x0056;
    L_0x00f8:
        r1 = r0;
        r0 = r2;
        goto L_0x000d;
    L_0x00fc:
        r0 = r2;
        goto L_0x00b6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.a(boolean):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private char n() {
        /*
        r7 = this;
        r2 = com.google.eE.h;
        r0 = r7.a;	 Catch:{ NullPointerException -> 0x001c }
        r1 = r7.o;	 Catch:{ NullPointerException -> 0x001c }
        if (r0 != r1) goto L_0x001e;
    L_0x0008:
        r0 = 1;
        r0 = r7.a(r0);	 Catch:{ NullPointerException -> 0x001a }
        if (r0 != 0) goto L_0x001e;
    L_0x000f:
        r0 = z;	 Catch:{ NullPointerException -> 0x001a }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x001a }
        r0 = r7.a(r0);	 Catch:{ NullPointerException -> 0x001a }
        throw r0;	 Catch:{ NullPointerException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001a }
    L_0x001e:
        r0 = r7.b;
        r1 = r7.a;
        r3 = r1 + 1;
        r7.a = r3;
        r0 = r0[r1];
        switch(r0) {
            case 10: goto L_0x00d2;
            case 98: goto L_0x00c2;
            case 102: goto L_0x00ce;
            case 110: goto L_0x00c6;
            case 114: goto L_0x00ca;
            case 116: goto L_0x00be;
            case 117: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        return r0;
    L_0x002c:
        r0 = r7.a;	 Catch:{ NullPointerException -> 0x0048 }
        r0 = r0 + 4;
        r1 = r7.o;	 Catch:{ NullPointerException -> 0x0048 }
        if (r0 <= r1) goto L_0x004a;
    L_0x0034:
        r0 = 4;
        r0 = r7.a(r0);	 Catch:{ NullPointerException -> 0x0046 }
        if (r0 != 0) goto L_0x004a;
    L_0x003b:
        r0 = z;	 Catch:{ NullPointerException -> 0x0046 }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0046 }
        r0 = r7.a(r0);	 Catch:{ NullPointerException -> 0x0046 }
        throw r0;	 Catch:{ NullPointerException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0046 }
    L_0x004a:
        r1 = 0;
        r0 = r7.a;
        r3 = r0 + 4;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x0052:
        if (r1 >= r3) goto L_0x00b6;
    L_0x0054:
        r4 = r7.b;
        r4 = r4[r1];
        r0 = r0 << 4;
        r0 = (char) r0;
        r5 = 48;
        if (r4 < r5) goto L_0x0069;
    L_0x005f:
        r5 = 57;
        if (r4 > r5) goto L_0x0069;
    L_0x0063:
        r5 = r4 + -48;
        r0 = r0 + r5;
        r0 = (char) r0;
        if (r2 == 0) goto L_0x00b2;
    L_0x0069:
        r5 = 97;
        if (r4 < r5) goto L_0x0079;
    L_0x006d:
        r5 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r4 > r5) goto L_0x0079;
    L_0x0071:
        r5 = r4 + -97;
        r5 = r5 + 10;
        r0 = r0 + r5;
        r0 = (char) r0;
        if (r2 == 0) goto L_0x00b2;
    L_0x0079:
        r5 = 65;
        if (r4 < r5) goto L_0x0089;
    L_0x007d:
        r5 = 70;
        if (r4 > r5) goto L_0x0089;
    L_0x0081:
        r4 = r4 + -65;
        r4 = r4 + 10;
        r0 = r0 + r4;
        r0 = (char) r0;
        if (r2 == 0) goto L_0x00b2;
    L_0x0089:
        r0 = new java.lang.NumberFormatException;	 Catch:{ NullPointerException -> 0x00b0 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00b0 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x00b0 }
        r2 = z;	 Catch:{ NullPointerException -> 0x00b0 }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00b0 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b0 }
        r2 = new java.lang.String;	 Catch:{ NullPointerException -> 0x00b0 }
        r3 = r7.b;	 Catch:{ NullPointerException -> 0x00b0 }
        r4 = r7.a;	 Catch:{ NullPointerException -> 0x00b0 }
        r5 = 4;
        r2.<init>(r3, r4, r5);	 Catch:{ NullPointerException -> 0x00b0 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b0 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x00b0 }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x00b0 }
        throw r0;	 Catch:{ NullPointerException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0052;
    L_0x00b6:
        r1 = r7.a;
        r1 = r1 + 4;
        r7.a = r1;
        goto L_0x002b;
    L_0x00be:
        r0 = 9;
        goto L_0x002b;
    L_0x00c2:
        r0 = 8;
        goto L_0x002b;
    L_0x00c6:
        r0 = 10;
        goto L_0x002b;
    L_0x00ca:
        r0 = 13;
        goto L_0x002b;
    L_0x00ce:
        r0 = 12;
        goto L_0x002b;
    L_0x00d2:
        r1 = r7.f;
        r1 = r1 + 1;
        r7.f = r1;
        r1 = r7.a;
        r7.c = r1;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.n():char");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int p() {
        /*
        r9 = this;
        r3 = 0;
        r5 = com.google.eE.h;
        r0 = r9.b;
        r1 = r9.a;
        r4 = r0[r1];
        r0 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r4 == r0) goto L_0x0011;
    L_0x000d:
        r0 = 84;
        if (r4 != r0) goto L_0x0020;
    L_0x0011:
        r0 = z;
        r1 = 33;
        r2 = r0[r1];
        r0 = z;
        r1 = 30;
        r1 = r0[r1];
        r0 = 5;
        if (r5 == 0) goto L_0x0050;
    L_0x0020:
        r0 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r4 == r0) goto L_0x0028;
    L_0x0024:
        r0 = 70;
        if (r4 != r0) goto L_0x0037;
    L_0x0028:
        r0 = z;
        r1 = 31;
        r2 = r0[r1];
        r0 = z;
        r1 = 34;
        r1 = r0[r1];
        r0 = 6;
        if (r5 == 0) goto L_0x0050;
    L_0x0037:
        r0 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r4 == r0) goto L_0x003f;
    L_0x003b:
        r0 = 78;
        if (r4 != r0) goto L_0x004e;
    L_0x003f:
        r0 = z;
        r1 = 29;
        r2 = r0[r1];
        r0 = z;
        r1 = 32;
        r1 = r0[r1];
        r0 = 7;
        if (r5 == 0) goto L_0x0050;
    L_0x004e:
        r0 = r3;
    L_0x004f:
        return r0;
    L_0x0050:
        r6 = r2.length();
        r4 = 1;
    L_0x0055:
        if (r4 >= r6) goto L_0x0089;
    L_0x0057:
        r7 = r9.a;	 Catch:{ NullPointerException -> 0x0068 }
        r7 = r7 + r4;
        r8 = r9.o;	 Catch:{ NullPointerException -> 0x0068 }
        if (r7 < r8) goto L_0x006c;
    L_0x005e:
        r7 = r4 + 1;
        r7 = r9.a(r7);	 Catch:{ NullPointerException -> 0x006a }
        if (r7 != 0) goto L_0x006c;
    L_0x0066:
        r0 = r3;
        goto L_0x004f;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;
    L_0x006c:
        r7 = r9.b;
        r8 = r9.a;
        r8 = r8 + r4;
        r7 = r7[r8];
        r8 = r2.charAt(r4);	 Catch:{ NullPointerException -> 0x0081 }
        if (r7 == r8) goto L_0x0085;
    L_0x0079:
        r8 = r1.charAt(r4);	 Catch:{ NullPointerException -> 0x0083 }
        if (r7 == r8) goto L_0x0085;
    L_0x007f:
        r0 = r3;
        goto L_0x004f;
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x0055;
    L_0x0089:
        r1 = r9.a;	 Catch:{ NullPointerException -> 0x00a7 }
        r1 = r1 + r6;
        r2 = r9.o;	 Catch:{ NullPointerException -> 0x00a7 }
        if (r1 < r2) goto L_0x0098;
    L_0x0090:
        r1 = r6 + 1;
        r1 = r9.a(r1);	 Catch:{ NullPointerException -> 0x00a9 }
        if (r1 == 0) goto L_0x00ad;
    L_0x0098:
        r1 = r9.b;	 Catch:{ NullPointerException -> 0x00ab }
        r2 = r9.a;	 Catch:{ NullPointerException -> 0x00ab }
        r2 = r2 + r6;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x00ab }
        r1 = r9.a(r1);	 Catch:{ NullPointerException -> 0x00ab }
        if (r1 == 0) goto L_0x00ad;
    L_0x00a5:
        r0 = r3;
        goto L_0x004f;
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r1 = r9.a;
        r1 = r1 + r6;
        r9.a = r1;
        r9.g = r0;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.p():int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String j() {
        /*
        r6 = this;
        r2 = 0;
        r3 = com.google.eE.h;
        r0 = 0;
        r1 = r2;
    L_0x0005:
        r4 = r6.a;
        r4 = r4 + r1;
        r5 = r6.o;
        if (r4 >= r5) goto L_0x001a;
    L_0x000c:
        r4 = r6.b;	 Catch:{ NullPointerException -> 0x006a }
        r5 = r6.a;	 Catch:{ NullPointerException -> 0x006a }
        r5 = r5 + r1;
        r4 = r4[r5];	 Catch:{ NullPointerException -> 0x006a }
        switch(r4) {
            case 9: goto L_0x0066;
            case 10: goto L_0x0066;
            case 12: goto L_0x0066;
            case 13: goto L_0x0066;
            case 32: goto L_0x0066;
            case 35: goto L_0x0063;
            case 44: goto L_0x0066;
            case 47: goto L_0x0063;
            case 58: goto L_0x0066;
            case 59: goto L_0x0063;
            case 61: goto L_0x0063;
            case 91: goto L_0x0066;
            case 92: goto L_0x0063;
            case 93: goto L_0x0066;
            case 123: goto L_0x0066;
            case 125: goto L_0x0066;
            default: goto L_0x0016;
        };
    L_0x0016:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0005;
    L_0x001a:
        r4 = r6.b;	 Catch:{ NullPointerException -> 0x006c }
        r4 = r4.length;	 Catch:{ NullPointerException -> 0x006c }
        if (r1 >= r4) goto L_0x0029;
    L_0x001f:
        r4 = r1 + 1;
        r4 = r6.a(r4);	 Catch:{ NullPointerException -> 0x006e }
        if (r4 == 0) goto L_0x0068;
    L_0x0027:
        if (r3 == 0) goto L_0x0005;
    L_0x0029:
        if (r0 != 0) goto L_0x0030;
    L_0x002b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
    L_0x0030:
        r4 = r6.b;
        r5 = r6.a;
        r0.append(r4, r5, r1);
        r4 = r6.a;
        r1 = r1 + r4;
        r6.a = r1;
        r1 = 1;
        r1 = r6.a(r1);
        if (r1 != 0) goto L_0x0070;
    L_0x0043:
        r1 = r2;
        r2 = r0;
    L_0x0045:
        if (r2 != 0) goto L_0x0052;
    L_0x0047:
        r0 = new java.lang.String;
        r4 = r6.b;
        r5 = r6.a;
        r0.<init>(r4, r5, r1);
        if (r3 == 0) goto L_0x005d;
    L_0x0052:
        r0 = r6.b;
        r3 = r6.a;
        r2.append(r0, r3, r1);
        r0 = r2.toString();
    L_0x005d:
        r2 = r6.a;
        r1 = r1 + r2;
        r6.a = r1;
        return r0;
    L_0x0063:
        r6.b();	 Catch:{ NullPointerException -> 0x006a }
    L_0x0066:
        if (r3 != 0) goto L_0x0016;
    L_0x0068:
        r2 = r0;
        goto L_0x0045;
    L_0x006a:
        r0 = move-exception;
        throw r0;
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;
    L_0x0070:
        r1 = r2;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.j():java.lang.String");
    }

    public String toString() {
        return getClass().getSimpleName() + z[36] + a() + z[35] + h();
    }

    private void b() {
        try {
            if (!this.h) {
                throw a(z[20]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v() {
        /*
        r7 = this;
        r6 = 3;
        r5 = 1;
        r1 = 0;
        r3 = com.google.eE.h;
        r0 = r1;
    L_0x0006:
        r2 = r7.g;
        if (r2 != 0) goto L_0x000e;
    L_0x000a:
        r2 = r7.s();
    L_0x000e:
        if (r2 != r6) goto L_0x0018;
    L_0x0010:
        r4 = 1;
        r7.b(r4);	 Catch:{ NullPointerException -> 0x0099 }
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0072;
    L_0x0018:
        if (r2 != r5) goto L_0x0022;
    L_0x001a:
        r4 = 3;
        r7.b(r4);	 Catch:{ NullPointerException -> 0x009d }
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0072;
    L_0x0022:
        r4 = 4;
        if (r2 != r4) goto L_0x002f;
    L_0x0025:
        r4 = r7.e;	 Catch:{ NullPointerException -> 0x00a1 }
        r4 = r4 + -1;
        r7.e = r4;	 Catch:{ NullPointerException -> 0x00a1 }
        r0 = r0 + -1;
        if (r3 == 0) goto L_0x0072;
    L_0x002f:
        r4 = 2;
        if (r2 != r4) goto L_0x003c;
    L_0x0032:
        r4 = r7.e;	 Catch:{ NullPointerException -> 0x00a5 }
        r4 = r4 + -1;
        r7.e = r4;	 Catch:{ NullPointerException -> 0x00a5 }
        r0 = r0 + -1;
        if (r3 == 0) goto L_0x0072;
    L_0x003c:
        r4 = 14;
        if (r2 == r4) goto L_0x0044;
    L_0x0040:
        r4 = 10;
        if (r2 != r4) goto L_0x0049;
    L_0x0044:
        r7.u();	 Catch:{ NullPointerException -> 0x00ab }
        if (r3 == 0) goto L_0x0072;
    L_0x0049:
        r4 = 8;
        if (r2 == r4) goto L_0x0051;
    L_0x004d:
        r4 = 12;
        if (r2 != r4) goto L_0x0058;
    L_0x0051:
        r4 = 39;
        r7.b(r4);	 Catch:{ NullPointerException -> 0x00b1 }
        if (r3 == 0) goto L_0x0072;
    L_0x0058:
        r4 = 9;
        if (r2 == r4) goto L_0x0060;
    L_0x005c:
        r4 = 13;
        if (r2 != r4) goto L_0x0067;
    L_0x0060:
        r4 = 34;
        r7.b(r4);	 Catch:{ NullPointerException -> 0x00b7 }
        if (r3 == 0) goto L_0x0072;
    L_0x0067:
        r4 = 16;
        if (r2 != r4) goto L_0x0072;
    L_0x006b:
        r2 = r7.a;	 Catch:{ NullPointerException -> 0x00b9 }
        r4 = r7.l;	 Catch:{ NullPointerException -> 0x00b9 }
        r2 = r2 + r4;
        r7.a = r2;	 Catch:{ NullPointerException -> 0x00b9 }
    L_0x0072:
        r7.g = r1;
        if (r0 != 0) goto L_0x0006;
    L_0x0076:
        r0 = r7.d;	 Catch:{ NullPointerException -> 0x00bb }
        r1 = r7.e;	 Catch:{ NullPointerException -> 0x00bb }
        r1 = r1 + -1;
        r2 = r0[r1];	 Catch:{ NullPointerException -> 0x00bb }
        r2 = r2 + 1;
        r0[r1] = r2;	 Catch:{ NullPointerException -> 0x00bb }
        r0 = r7.k;	 Catch:{ NullPointerException -> 0x00bb }
        r1 = r7.e;	 Catch:{ NullPointerException -> 0x00bb }
        r1 = r1 + -1;
        r2 = z;	 Catch:{ NullPointerException -> 0x00bb }
        r4 = 62;
        r2 = r2[r4];	 Catch:{ NullPointerException -> 0x00bb }
        r0[r1] = r2;	 Catch:{ NullPointerException -> 0x00bb }
        r0 = com.google.aX.a;	 Catch:{ NullPointerException -> 0x00bb }
        if (r0 == 0) goto L_0x0098;
    L_0x0094:
        r0 = r3 + 1;
        com.google.eE.h = r0;	 Catch:{ NullPointerException -> 0x00bb }
    L_0x0098:
        return;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;
    L_0x00bb:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fh.v():void");
    }
}
