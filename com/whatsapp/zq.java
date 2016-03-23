package com.whatsapp;

import android.os.Handler;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class zq extends Thread {
    private static final String[] z;
    private boolean a;
    private Handler b;
    final RegisterName c;
    private boolean d;
    private int e;

    static {
        String[] strArr = new String[30];
        String str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005kR]\u001a\u0011xC]\u0016\u0010gCK";
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
                        i3 = 38;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 127;
                        break;
                    case at.o /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0010gH\u0000\u001b\u0019`C";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005wHL \u0017bTJ\u001e\u0012wyJ\u0011\u0012kB";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005wHL \u0017bTJ\u001e\u0012wyJ\u0011\u0012kB";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005wHL \u0017bTJ\u001e\u0012wyJ\u0011\u0012kB";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0013|T@\r";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005wHL \u0017bTJ\u001e\u0012wyJ\u0011\u0012kB";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0006\u0007";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u001f`O[\u0016\u0017bOU\u001a\u0004!UV\u0011\u0015!B@\u0011\u0013.TJ\f\u0003bR\u0012";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0010gH\u0000\u001b\u0019`C";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005kRL\u0010\u0018`CL\u000b\u001faH\u0000\u001e\u0015zOY\u001a";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0015bCN\r\u0005wHL\u001b\u0017zG";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005wHL \u0017bTJ\u001e\u0012wyJ\u0011\u0012kB";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0006fIA\u001a\u0014aID_\u0015aSA\u000bVgU\u000f\u0011\u0003bJ";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005fIZ\u0013\u0012|CI\r\u0013}NC\u0016\u0005zU";
                    obj = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005wHL \u0017bTJ\u001e\u0012wyJ\u0011\u0012kB";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005wHL \u0017bTJ\u001e\u0012wyJ\u0011\u0012kB";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0015aH[\u001e\u0015zU\u0000\u001c\u0019{H[_";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0010gH\u0000\u001b\u0019`C";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0004{H_\u001a\u0004hI]\u0012\u0005wHL";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0010gH\u0000\u001b\u0019`C";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u001f`O[\u0016\u0017bOU\u001a\u0004!TZ\u0011";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0010gH\u0000\u001b\u0019`C";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0010gH\u0000\u001b\u0019`C";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005kR\\\u0006\u0018mRF\u0012\u0013";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0011kH\u0000\u001a\u0004|I]";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005wHL \u0017bTJ\u001e\u0012wy\\\u000b\u0017|RJ\u001b";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0010gH\u0000\u001b\u0019`C";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "TJ\u0018\u001f}RJ\r\u0018oKJP\u0005wHLP\u0012kJN\u0006\u0013j";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "tJ\u0018\u001f}RJ\r8oKJ6\u0018gR";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static boolean c(zq zqVar) {
        return zqVar.d;
    }

    static int b(zq zqVar) {
        return zqVar.e;
    }

    public zq(RegisterName registerName, Handler handler) {
        this.c = registerName;
        this.a = false;
        this.d = false;
        this.e = 0;
        this.b = handler;
        start();
    }

    public void a() {
        if (this.b != null) {
            this.b.removeMessages(0);
            this.b = null;
        }
    }

    static boolean a(zq zqVar) {
        return zqVar.a;
    }

    public void a(Handler handler) {
        if (this.a) {
            handler.sendEmptyMessage(0);
        }
        this.b = handler;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r12 = this;
        r11 = 2;
        r1 = 0;
        r4 = 1;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r0 = r0[r4];
        r6 = com.whatsapp.tp.b(r0);
        r6.e();	 Catch:{ InterruptedException -> 0x03e8, Exception -> 0x03e4, all -> 0x03db }
        r0 = z;	 Catch:{ InterruptedException -> 0x03e8, Exception -> 0x03e4, all -> 0x03db }
        r2 = 22;
        r0 = r0[r2];	 Catch:{ InterruptedException -> 0x03e8, Exception -> 0x03e4, all -> 0x03db }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x03e8, Exception -> 0x03e4, all -> 0x03db }
        r2 = com.whatsapp.contact.i.c();	 Catch:{ InterruptedException -> 0x03e8, Exception -> 0x03e4, all -> 0x03db }
        if (r2 != 0) goto L_0x0028;
    L_0x001f:
        r0 = z;	 Catch:{ Exception -> 0x00fe, InterruptedException -> 0x0100 }
        r3 = 27;
        r0 = r0[r3];	 Catch:{ Exception -> 0x00fe, InterruptedException -> 0x0100 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x00fe, InterruptedException -> 0x0100 }
    L_0x0028:
        r0 = com.whatsapp.App.as;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r7 = r0.b();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r0 = com.whatsapp.contact.f.BOTH;	 Catch:{ Exception -> 0x013b, InterruptedException -> 0x0100 }
        r0 = com.whatsapp.contact.b.a(r0);	 Catch:{ Exception -> 0x013b, InterruptedException -> 0x0100 }
        if (r0 != 0) goto L_0x0041;
    L_0x0038:
        r8 = z;	 Catch:{ Exception -> 0x0139, InterruptedException -> 0x0100 }
        r9 = 14;
        r8 = r8[r9];	 Catch:{ Exception -> 0x0139, InterruptedException -> 0x0100 }
        com.whatsapp.util.Log.w(r8);	 Catch:{ Exception -> 0x0139, InterruptedException -> 0x0100 }
    L_0x0041:
        if (r0 != 0) goto L_0x0188;
    L_0x0043:
        r0 = r1;
    L_0x0044:
        r3 = r0;
    L_0x0045:
        r0 = com.whatsapp.a5a.COUNT;	 Catch:{ Exception -> 0x018e, InterruptedException -> 0x0100 }
        r6.a(r0, r3);	 Catch:{ Exception -> 0x018e, InterruptedException -> 0x0100 }
        r8 = r12.c;	 Catch:{ Exception -> 0x018e, InterruptedException -> 0x0100 }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r3 > r0) goto L_0x01c4;
    L_0x0050:
        r0 = r4;
    L_0x0051:
        com.whatsapp.App.a(r8, r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r8 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r9 = 18;
        r8 = r8[r9];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r0.append(r8);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r0.append(r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r8 = 8;
        r3 = r3[r8];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r0.append(r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = r12.c;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = com.whatsapp.App.C(r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r0.append(r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = ")";
        r0 = r0.append(r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r12.c;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r0.getApplicationContext();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.contact.i.a(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = com.whatsapp.t4.FILL;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r6.b(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r12.c;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r0.getApplicationContext();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = com.whatsapp.contact.o.REGISTRATION_FULL;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = com.whatsapp.contact.i.c(r0, r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = com.whatsapp.t4.FILL;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r6.a(r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3.<init>();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r8 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r9 = 9;
        r8 = r8[r9];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = r3.append(r8);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = r3.append(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = r3.toString();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = com.whatsapp.contact.j.NETWORK_UNAVAILABLE;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        if (r0 != r3) goto L_0x01cf;
    L_0x00c6:
        r0 = 1;
        r12.e = r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r6.b();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r12.a = r4;
        r0 = z;
        r3 = 19;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.b;
        if (r0 == 0) goto L_0x00e0;
    L_0x00db:
        r0 = r12.b;
        r0.sendEmptyMessage(r1);
    L_0x00e0:
        if (r2 == 0) goto L_0x00f1;
    L_0x00e2:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x01c7 }
        if (r0 != 0) goto L_0x00f1;
    L_0x00e8:
        r0 = z;	 Catch:{ Exception -> 0x01c9 }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ Exception -> 0x01c9 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x01c9 }
    L_0x00f1:
        r0 = com.whatsapp.App.am;	 Catch:{ Exception -> 0x01cb }
        if (r0 != 0) goto L_0x00fa;
    L_0x00f5:
        r6.b();	 Catch:{ Exception -> 0x01cb }
        if (r5 == 0) goto L_0x00fd;
    L_0x00fa:
        r6.d();	 Catch:{ Exception -> 0x01cd }
    L_0x00fd:
        return;
    L_0x00fe:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
    L_0x0100:
        r0 = move-exception;
        r0 = r2;
    L_0x0102:
        r6.b();	 Catch:{ all -> 0x03df }
        r12.a = r4;
        r2 = z;
        r3 = 23;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = r12.b;
        if (r2 == 0) goto L_0x0119;
    L_0x0114:
        r2 = r12.b;
        r2.sendEmptyMessage(r1);
    L_0x0119:
        if (r0 == 0) goto L_0x012a;
    L_0x011b:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x03c7 }
        if (r0 != 0) goto L_0x012a;
    L_0x0121:
        r0 = z;	 Catch:{ Exception -> 0x03c9 }
        r1 = 17;
        r0 = r0[r1];	 Catch:{ Exception -> 0x03c9 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x03c9 }
    L_0x012a:
        r0 = com.whatsapp.App.am;	 Catch:{ Exception -> 0x03cb }
        if (r0 != 0) goto L_0x0133;
    L_0x012e:
        r6.b();	 Catch:{ Exception -> 0x03cb }
        if (r5 == 0) goto L_0x00fd;
    L_0x0133:
        r6.d();	 Catch:{ Exception -> 0x0137 }
        goto L_0x00fd;
    L_0x0137:
        r0 = move-exception;
        throw r0;
    L_0x0139:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x013b, InterruptedException -> 0x0100 }
    L_0x013b:
        r0 = move-exception;
        r8 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r9 = 6;
        r8 = r8[r9];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.util.Log.b(r8, r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        goto L_0x0045;
    L_0x0146:
        r0 = move-exception;
    L_0x0147:
        r3 = 3;
        r12.e = r3;	 Catch:{ all -> 0x0190 }
        r3 = z;	 Catch:{ all -> 0x0190 }
        r7 = 26;
        r3 = r3[r7];	 Catch:{ all -> 0x0190 }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ all -> 0x0190 }
        r6.b();	 Catch:{ all -> 0x0190 }
        r12.a = r4;
        r0 = z;
        r0 = r0[r11];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.b;
        if (r0 == 0) goto L_0x0168;
    L_0x0163:
        r0 = r12.b;
        r0.sendEmptyMessage(r1);
    L_0x0168:
        if (r2 == 0) goto L_0x0178;
    L_0x016a:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x03cd }
        if (r0 != 0) goto L_0x0178;
    L_0x0170:
        r0 = z;	 Catch:{ Exception -> 0x03cf }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ Exception -> 0x03cf }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x03cf }
    L_0x0178:
        r0 = com.whatsapp.App.am;	 Catch:{ Exception -> 0x03d1 }
        if (r0 != 0) goto L_0x0181;
    L_0x017c:
        r6.b();	 Catch:{ Exception -> 0x03d1 }
        if (r5 == 0) goto L_0x00fd;
    L_0x0181:
        r6.d();	 Catch:{ Exception -> 0x0186 }
        goto L_0x00fd;
    L_0x0186:
        r0 = move-exception;
        throw r0;
    L_0x0188:
        r0 = r0.intValue();	 Catch:{ Exception -> 0x013b, InterruptedException -> 0x0100 }
        goto L_0x0044;
    L_0x018e:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
    L_0x0190:
        r0 = move-exception;
    L_0x0191:
        r1 = 1;
        r12.a = r1;	 Catch:{ Exception -> 0x03d3 }
        r1 = z;	 Catch:{ Exception -> 0x03d3 }
        r3 = 10;
        r1 = r1[r3];	 Catch:{ Exception -> 0x03d3 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x03d3 }
        r1 = r12.b;	 Catch:{ Exception -> 0x03d3 }
        if (r1 == 0) goto L_0x01a7;
    L_0x01a1:
        r1 = r12.b;	 Catch:{ Exception -> 0x03d3 }
        r3 = 0;
        r1.sendEmptyMessage(r3);	 Catch:{ Exception -> 0x03d3 }
    L_0x01a7:
        if (r2 == 0) goto L_0x01b7;
    L_0x01a9:
        r1 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x03d5 }
        if (r1 != 0) goto L_0x01b7;
    L_0x01af:
        r1 = z;	 Catch:{ Exception -> 0x03d5 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ Exception -> 0x03d5 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ Exception -> 0x03d5 }
    L_0x01b7:
        r1 = com.whatsapp.App.am;	 Catch:{ Exception -> 0x03d7 }
        if (r1 != 0) goto L_0x01c0;
    L_0x01bb:
        r6.b();	 Catch:{ Exception -> 0x03d9 }
        if (r5 == 0) goto L_0x01c3;
    L_0x01c0:
        r6.d();	 Catch:{ Exception -> 0x03d9 }
    L_0x01c3:
        throw r0;
    L_0x01c4:
        r0 = r1;
        goto L_0x0051;
    L_0x01c7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01c9 }
    L_0x01c9:
        r0 = move-exception;
        throw r0;
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r3 = com.whatsapp.contact.j.FAILED;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        if (r0 != r3) goto L_0x0213;
    L_0x01d3:
        r0 = 3;
        r12.e = r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r6.b();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r12.a = r4;
        r0 = z;
        r3 = 21;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.b;
        if (r0 == 0) goto L_0x01ed;
    L_0x01e8:
        r0 = r12.b;
        r0.sendEmptyMessage(r1);
    L_0x01ed:
        if (r2 == 0) goto L_0x01fd;
    L_0x01ef:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x020d }
        if (r0 != 0) goto L_0x01fd;
    L_0x01f5:
        r0 = z;	 Catch:{ Exception -> 0x020f }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ Exception -> 0x020f }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x020f }
    L_0x01fd:
        r0 = com.whatsapp.App.am;	 Catch:{ Exception -> 0x0211 }
        if (r0 != 0) goto L_0x0206;
    L_0x0201:
        r6.b();	 Catch:{ Exception -> 0x0211 }
        if (r5 == 0) goto L_0x00fd;
    L_0x0206:
        r6.d();	 Catch:{ Exception -> 0x020b }
        goto L_0x00fd;
    L_0x020b:
        r0 = move-exception;
        throw r0;
    L_0x020d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x020f }
    L_0x020f:
        r0 = move-exception;
        throw r0;
    L_0x0211:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x020b }
    L_0x0213:
        r3 = com.whatsapp.contact.j.DELAYED;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        if (r0 != r3) goto L_0x0260;
    L_0x0217:
        r0 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 29;
        r0 = r0[r3];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = 3;
        r12.e = r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r6.b();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r12.a = r4;
        r0 = z;
        r3 = 24;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.b;
        if (r0 == 0) goto L_0x023a;
    L_0x0235:
        r0 = r12.b;
        r0.sendEmptyMessage(r1);
    L_0x023a:
        if (r2 == 0) goto L_0x024a;
    L_0x023c:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x025a }
        if (r0 != 0) goto L_0x024a;
    L_0x0242:
        r0 = z;	 Catch:{ Exception -> 0x025c }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ Exception -> 0x025c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x025c }
    L_0x024a:
        r0 = com.whatsapp.App.am;	 Catch:{ Exception -> 0x025e }
        if (r0 != 0) goto L_0x0253;
    L_0x024e:
        r6.b();	 Catch:{ Exception -> 0x025e }
        if (r5 == 0) goto L_0x00fd;
    L_0x0253:
        r6.d();	 Catch:{ Exception -> 0x0258 }
        goto L_0x00fd;
    L_0x0258:
        r0 = move-exception;
        throw r0;
    L_0x025a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x025c }
    L_0x025c:
        r0 = move-exception;
        throw r0;
    L_0x025e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0258 }
    L_0x0260:
        r0 = com.whatsapp.App.aA;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 1;
        r0.b(r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 25;
        r0 = r0[r3];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.App.c(r8);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 12;
        r0 = r0[r3];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r12.c;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.accountsync.PerformSyncManager.e(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 11;
        r0 = r0[r3];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = 1;
        com.whatsapp.App.i(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 20;
        r0 = r0[r3];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r12.c;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.accountsync.PerformSyncManager.c(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = new com.whatsapp.ad;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0.<init>(r12);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 1;
        r0.setPriority(r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0.start();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0.join();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 15;
        r0 = r0[r3];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = com.whatsapp.App.z();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 1;
        com.whatsapp.App.c(r0, r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = com.whatsapp.t4.REFRESH;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r6.b(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.App.k();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.App.P();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = com.whatsapp.App.as;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r0.k();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = com.whatsapp.a5a.COUNT_2;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r8 = r0.size();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r6.a(r3, r8);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r8 = r0.iterator();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = r1;
    L_0x02de:
        r0 = r8.hasNext();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        if (r0 == 0) goto L_0x02ff;
    L_0x02e4:
        r0 = r8.next();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r9 = r0.m;	 Catch:{ Exception -> 0x03b5, InterruptedException -> 0x0100 }
        if (r9 == 0) goto L_0x03ef;
    L_0x02ee:
        r0 = r0.p;	 Catch:{ Exception -> 0x03b5, InterruptedException -> 0x0100 }
        r9 = 0;
        r10 = 2;
        com.whatsapp.App.a(r0, r9, r10);	 Catch:{ Exception -> 0x03b5, InterruptedException -> 0x0100 }
        r0 = r3 + 1;
        r3 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        if (r0 <= r3) goto L_0x02fd;
    L_0x02fb:
        if (r5 == 0) goto L_0x02ff;
    L_0x02fd:
        if (r5 == 0) goto L_0x03ec;
    L_0x02ff:
        r0 = com.whatsapp.App.as;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r0.f();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = com.whatsapp.a5a.COUNT_3;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r8 = r0.size();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r6.a(r3, r8);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = r0.iterator();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
    L_0x0312:
        r0 = r3.hasNext();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        if (r0 == 0) goto L_0x032d;
    L_0x0318:
        r0 = r3.next();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r8 = r0.A();	 Catch:{ Exception -> 0x03bb, InterruptedException -> 0x0100 }
        if (r8 != 0) goto L_0x032b;
    L_0x0324:
        r0 = r0.p;	 Catch:{ Exception -> 0x03bb, InterruptedException -> 0x0100 }
        r8 = 0;
        r9 = 2;
        com.whatsapp.App.a(r0, r8, r9);	 Catch:{ Exception -> 0x03bb, InterruptedException -> 0x0100 }
    L_0x032b:
        if (r5 == 0) goto L_0x0312;
    L_0x032d:
        r0 = r12.c;	 Catch:{ Exception -> 0x03bd, InterruptedException -> 0x0100 }
        r0 = com.whatsapp.RegisterName.b(r0);	 Catch:{ Exception -> 0x03bd, InterruptedException -> 0x0100 }
        r0 = r0.c;	 Catch:{ Exception -> 0x03bd, InterruptedException -> 0x0100 }
        if (r0 != 0) goto L_0x0344;
    L_0x0337:
        r0 = r12.c;	 Catch:{ Exception -> 0x03bd, InterruptedException -> 0x0100 }
        r0 = com.whatsapp.RegisterName.b(r0);	 Catch:{ Exception -> 0x03bd, InterruptedException -> 0x0100 }
        r0 = r0.p;	 Catch:{ Exception -> 0x03bd, InterruptedException -> 0x0100 }
        r3 = 0;
        r8 = 1;
        com.whatsapp.App.a(r0, r3, r8);	 Catch:{ Exception -> 0x03bd, InterruptedException -> 0x0100 }
    L_0x0344:
        r0 = r1;
    L_0x0345:
        r3 = com.whatsapp.App.a2;	 Catch:{ Exception -> 0x03bf, InterruptedException -> 0x0100 }
        r3 = r3.a();	 Catch:{ Exception -> 0x03bf, InterruptedException -> 0x0100 }
        if (r3 != 0) goto L_0x035f;
    L_0x034d:
        r3 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        if (r0 >= r3) goto L_0x035f;
    L_0x0351:
        r0 = r0 + 200;
        r8 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        java.lang.Thread.sleep(r8);	 Catch:{ InterruptedException -> 0x0359, Exception -> 0x0146 }
        goto L_0x0345;
    L_0x0359:
        r3 = move-exception;
        r3.printStackTrace();	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        if (r5 == 0) goto L_0x0345;
    L_0x035f:
        r0 = com.whatsapp.App.aA;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0.a(r7);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = com.whatsapp.App.aB;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 1;
        r0.sendEmptyMessage(r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = com.whatsapp.t4.REFRESH;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r6.a(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = 1;
        r12.d = r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = r12.c;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 3;
        com.whatsapp.App.d(r0, r3);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r0 = z;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r3 = 0;
        r0 = r0[r3];	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
        r12.a = r4;
        r0 = z;
        r3 = 28;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.b;
        if (r0 == 0) goto L_0x0394;
    L_0x038f:
        r0 = r12.b;
        r0.sendEmptyMessage(r1);
    L_0x0394:
        if (r2 == 0) goto L_0x03a5;
    L_0x0396:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x03c1 }
        if (r0 != 0) goto L_0x03a5;
    L_0x039c:
        r0 = z;	 Catch:{ Exception -> 0x03c3 }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ Exception -> 0x03c3 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x03c3 }
    L_0x03a5:
        r0 = com.whatsapp.App.am;	 Catch:{ Exception -> 0x03c5 }
        if (r0 != 0) goto L_0x03ae;
    L_0x03a9:
        r6.b();	 Catch:{ Exception -> 0x03c5 }
        if (r5 == 0) goto L_0x00fd;
    L_0x03ae:
        r6.d();	 Catch:{ Exception -> 0x03b3 }
        goto L_0x00fd;
    L_0x03b3:
        r0 = move-exception;
        throw r0;
    L_0x03b5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x03b7, InterruptedException -> 0x0100 }
    L_0x03b7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x03b9, InterruptedException -> 0x0100 }
    L_0x03b9:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
    L_0x03bb:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
    L_0x03bd:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
    L_0x03bf:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0100, Exception -> 0x0146 }
    L_0x03c1:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x03c3 }
    L_0x03c3:
        r0 = move-exception;
        throw r0;
    L_0x03c5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x03b3 }
    L_0x03c7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x03c9 }
    L_0x03c9:
        r0 = move-exception;
        throw r0;
    L_0x03cb:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0137 }
    L_0x03cd:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x03cf }
    L_0x03cf:
        r0 = move-exception;
        throw r0;
    L_0x03d1:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0186 }
    L_0x03d3:
        r0 = move-exception;
        throw r0;
    L_0x03d5:
        r0 = move-exception;
        throw r0;
    L_0x03d7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x03d9 }
    L_0x03d9:
        r0 = move-exception;
        throw r0;
    L_0x03db:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0191;
    L_0x03df:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x0191;
    L_0x03e4:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0147;
    L_0x03e8:
        r0 = move-exception;
        r0 = r1;
        goto L_0x0102;
    L_0x03ec:
        r3 = r0;
        goto L_0x02de;
    L_0x03ef:
        r0 = r3;
        goto L_0x02fd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.zq.run():void");
    }
}
