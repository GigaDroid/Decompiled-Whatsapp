package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.fieldstats.bd;
import com.whatsapp.fieldstats.bi;
import com.whatsapp.fieldstats.i;
import com.whatsapp.protocol.ay;
import com.whatsapp.protocol.b5;
import com.whatsapp.protocol.bb;
import java.util.HashMap;
import java.util.Timer;
import org.v;
import org.whispersystems.at;

public class aw2 implements b5, ay {
    private static HashMap c;
    public static Handler j;
    private static final String[] z;
    public byte[] a;
    private long b;
    private boolean d;
    private Long e;
    public byte[] f;
    private az3 g;
    public String h;
    public boolean i;
    public boolean k;
    public bb l;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r5) {
        /*
        r4 = this;
        r3 = 3;
        r2 = 2;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r5);
        r1 = z;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r4.h;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = 1;
        r4.d = r0;
        r0 = r4.g;
        r0.cancel();
        r0 = c;
        r1 = r4.e;
        r1 = r1.toString();
        r0.remove(r1);
        r0 = com.whatsapp.fieldstats.bd.ERROR_UNKNOWN;
        r4.a(r0);
        r0 = r4.i;
        if (r0 != 0) goto L_0x007e;
    L_0x0044:
        r0 = com.whatsapp.App.as;
        r1 = r4.h;
        r0 = r0.b(r1);
        r1 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r5 != r1) goto L_0x0071;
    L_0x0050:
        if (r0 == 0) goto L_0x0071;
    L_0x0052:
        r1 = r0.c();	 Catch:{ NumberFormatException -> 0x008a }
        if (r1 == 0) goto L_0x0071;
    L_0x0058:
        r0 = r0.p;	 Catch:{ NumberFormatException -> 0x008c }
        r0 = com.whatsapp.qm.h(r0);	 Catch:{ NumberFormatException -> 0x008c }
        if (r0 != 0) goto L_0x0071;
    L_0x0060:
        r0 = j;	 Catch:{ NumberFormatException -> 0x008e }
        r1 = 3;
        r2 = 0;
        r3 = r4.h;	 Catch:{ NumberFormatException -> 0x008e }
        r0 = r0.obtainMessage(r1, r5, r2, r3);	 Catch:{ NumberFormatException -> 0x008e }
        r0.sendToTarget();	 Catch:{ NumberFormatException -> 0x008e }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x008e }
        if (r0 == 0) goto L_0x007e;
    L_0x0071:
        r0 = j;	 Catch:{ NumberFormatException -> 0x008e }
        r1 = 2;
        r2 = 0;
        r3 = r4.h;	 Catch:{ NumberFormatException -> 0x008e }
        r0 = r0.obtainMessage(r1, r5, r2, r3);	 Catch:{ NumberFormatException -> 0x008e }
        r0.sendToTarget();	 Catch:{ NumberFormatException -> 0x008e }
    L_0x007e:
        r0 = r4.l;	 Catch:{ NumberFormatException -> 0x0090 }
        if (r0 == 0) goto L_0x0089;
    L_0x0082:
        r0 = r4.l;	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.b;	 Catch:{ NumberFormatException -> 0x0090 }
        com.whatsapp.wn.a(r0, r5);	 Catch:{ NumberFormatException -> 0x0090 }
    L_0x0089:
        return;
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aw2.a(int):void");
    }

    static void a(aw2 com_whatsapp_aw2, bd bdVar) {
        com_whatsapp_aw2.a(bdVar);
    }

    static {
        String[] strArr = new String[4];
        String str = "M8[[ZQ/DU\\I%\\\\]Y&QO\u001cO/EHVN>\u0014NF^)QN@\u001dp\u0014";
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
                        i3 = 61;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = 52;
                        break;
                    case at.o /*3*/:
                        i3 = 61;
                        break;
                    default:
                        i3 = 51;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "M8[[ZQ/DU\\I%\\\\]Y&QO\u001cO/EHVN>\u0014[RT&QY\u0013\u0007j";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001d6\u0014";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new HashMap();
                    j = new a2x(Looper.getMainLooper());
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001d6\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static boolean a(aw2 com_whatsapp_aw2) {
        return com_whatsapp_aw2.d;
    }

    public static boolean a(String str) {
        boolean z = DialogToastActivity.f;
        if (str == null) {
            return false;
        }
        for (aw2 com_whatsapp_aw2 : c.values()) {
            try {
                if (!str.equals(com_whatsapp_aw2.h)) {
                    if (z) {
                        break;
                    }
                }
                return true;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m459a(java.lang.String r6) {
        /*
        r5 = this;
        r2 = 0;
        r1 = 1;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r3 = r3[r2];
        r0 = r0.append(r3);
        r0 = r0.append(r6);
        r3 = z;
        r3 = r3[r1];
        r0 = r0.append(r3);
        r3 = r5.h;
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r5.d = r1;
        r0 = r5.g;
        r0.cancel();
        r0 = c;
        r3 = r5.e;
        r3 = r3.toString();
        r0.remove(r3);
        r0 = com.whatsapp.fieldstats.bd.OK;
        r5.a(r0);
        r0 = com.whatsapp.App.as;
        r3 = r5.h;
        r3 = r0.b(r3);
        if (r3 == 0) goto L_0x0080;
    L_0x0049:
        if (r6 != 0) goto L_0x008e;
    L_0x004b:
        r0 = -1;
    L_0x004c:
        r3.c(r0, r0);	 Catch:{ NumberFormatException -> 0x00a3 }
    L_0x004f:
        r0 = r5.i;	 Catch:{ NumberFormatException -> 0x0093 }
        if (r0 != 0) goto L_0x0080;
    L_0x0053:
        r0 = r5.f;	 Catch:{ NumberFormatException -> 0x0095 }
        if (r0 != 0) goto L_0x0062;
    L_0x0057:
        r0 = r5.a;	 Catch:{ NumberFormatException -> 0x0097 }
        if (r0 != 0) goto L_0x0062;
    L_0x005b:
        r3.u();	 Catch:{ NumberFormatException -> 0x0099 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x0099 }
        if (r0 == 0) goto L_0x0069;
    L_0x0062:
        r0 = r5.f;	 Catch:{ NumberFormatException -> 0x0099 }
        r4 = r5.a;	 Catch:{ NumberFormatException -> 0x0099 }
        r3.a(r0, r4);	 Catch:{ NumberFormatException -> 0x0099 }
    L_0x0069:
        r3.o();	 Catch:{ NumberFormatException -> 0x009b }
        r3 = j;	 Catch:{ NumberFormatException -> 0x009b }
        r0 = r5.f;	 Catch:{ NumberFormatException -> 0x009b }
        if (r0 != 0) goto L_0x009f;
    L_0x0072:
        r0 = r5.a;	 Catch:{ NumberFormatException -> 0x009d }
        if (r0 != 0) goto L_0x009f;
    L_0x0076:
        r0 = r1;
    L_0x0077:
        r4 = r5.h;
        r0 = r3.obtainMessage(r1, r0, r2, r4);
        r0.sendToTarget();
    L_0x0080:
        r0 = r5.l;	 Catch:{ NumberFormatException -> 0x00a1 }
        if (r0 == 0) goto L_0x008d;
    L_0x0084:
        r0 = r5.l;	 Catch:{ NumberFormatException -> 0x00a1 }
        r0 = r0.b;	 Catch:{ NumberFormatException -> 0x00a1 }
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        com.whatsapp.wn.a(r0, r1);	 Catch:{ NumberFormatException -> 0x00a1 }
    L_0x008d:
        return;
    L_0x008e:
        r0 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x00a3 }
        goto L_0x004c;
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        throw r0;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = r2;
        goto L_0x0077;
    L_0x00a1:
        r0 = move-exception;
        throw r0;
    L_0x00a3:
        r0 = move-exception;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aw2.a(java.lang.String):void");
    }

    public aw2(String str, byte[] bArr, byte[] bArr2) {
        this.k = false;
        this.d = false;
        this.h = str;
        this.f = bArr;
        this.a = bArr2;
        this.e = Long.valueOf(System.currentTimeMillis());
        c.put(this.e.toString(), this);
        this.b = System.currentTimeMillis();
        this.g = new az3(this);
        new Timer().schedule(this.g, 32000);
    }

    static HashMap a() {
        return c;
    }

    static Long b(aw2 com_whatsapp_aw2) {
        return com_whatsapp_aw2.e;
    }

    public aw2(String str, byte[] bArr, byte[] bArr2, bb bbVar) {
        this(str, bArr, bArr2);
        this.l = bbVar;
    }

    private void a(bd bdVar) {
        int i = 0;
        av biVar = new bi();
        try {
            int i2;
            if (this.f == null) {
                i2 = 0;
            } else {
                i2 = this.f.length;
            }
            try {
                if (this.a != null) {
                    i = this.a.length;
                }
                biVar.c = Double.valueOf((double) (i + i2));
                biVar.d = Double.valueOf((double) (System.currentTimeMillis() - this.b));
                biVar.a = Double.valueOf((double) bdVar.getCode());
                i.a(App.z(), biVar);
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }
}
