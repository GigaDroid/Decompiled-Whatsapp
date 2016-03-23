package com.whatsapp;

import java.util.Collection;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class k6 implements Runnable {
    private static final String[] z;
    final boolean a;
    final boolean b;
    final ael c;
    final Collection d;

    static {
        String[] strArr = new String[10];
        String str = "1Db\fE=L";
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
                        i3 = 92;
                        break;
                    case at.g /*1*/:
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 6;
                        break;
                    case at.o /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 49;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "1Xa E3Yc|B(Jt>B;\u0004e;P(Go EsBh T._)5P5Gc7\u00116Bbn";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "7N\u007f\fC9Fi'T\u0003Ao7\fc";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "1Nu P;Nu";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "/_g!C9O";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "?Cg'n0Bu'";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "1Xa E3Yc|B(Jt|U5O&=^(\u000bs#U=_cs";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "7N\u007f\fC9Fi'T\u0003Ao7";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "?Cg'n0Bu'";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "7N\u007f\fC9Fi'T\u0003Ao7\fc\u000bG\u001du|@c*n:Yi>n1N;l\u0011\u001deBsZ9RY:Ua\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    k6(ael com_whatsapp_ael, boolean z, Collection collection, boolean z2) {
        this.c = com_whatsapp_ael;
        this.b = z;
        this.d = collection;
        this.a = z2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r13 = this;
        r1 = 0;
        r5 = 0;
        r4 = 1;
        r6 = com.whatsapp.l5.s;
        r0 = r13.b;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0174 }
        if (r0 == 0) goto L_0x0176;
    L_0x0009:
        r0 = new java.util.HashMap;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0174 }
        r0.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0174 }
        r2 = r0;
    L_0x000f:
        r0 = r13.c;
        r7 = com.whatsapp.ael.b(r0);
        monitor-enter(r7);
        r0 = r13.c;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b9, all -> 0x01b6 }
        r0 = com.whatsapp.ael.b(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b9, all -> 0x01b6 }
        r3 = r0.getWritableDatabase();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b9, all -> 0x01b6 }
        r3.beginTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r0 = r13.d;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r8 = r0.iterator();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
    L_0x0029:
        r0 = r8.hasNext();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        if (r0 == 0) goto L_0x009f;
    L_0x002f:
        r0 = r8.next();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r9 = new android.content.ContentValues;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r9.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r1 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0179, all -> 0x01a1 }
        r10 = 5;
        r10 = r1[r10];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0179, all -> 0x01a1 }
        r1 = r0.P;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0179, all -> 0x01a1 }
        if (r1 == 0) goto L_0x019c;
    L_0x0043:
        r1 = r4;
    L_0x0044:
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x019f, all -> 0x01a1 }
        r9.put(r10, r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x019f, all -> 0x01a1 }
        r1 = 3;
        r10 = new java.lang.String[r1];	 Catch:{ SQLiteDatabaseCorruptException -> 0x019f, all -> 0x01a1 }
        r1 = 0;
        r11 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x019f, all -> 0x01a1 }
        r11 = r11.c;	 Catch:{ SQLiteDatabaseCorruptException -> 0x019f, all -> 0x01a1 }
        r10[r1] = r11;	 Catch:{ SQLiteDatabaseCorruptException -> 0x019f, all -> 0x01a1 }
        r11 = 1;
        r1 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x019f, all -> 0x01a1 }
        r1 = r1.a;	 Catch:{ SQLiteDatabaseCorruptException -> 0x019f, all -> 0x01a1 }
        if (r1 == 0) goto L_0x01a3;
    L_0x005c:
        r1 = "1";
    L_0x005f:
        r10[r11] = r1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r1 = 2;
        r11 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r11 = r11.b;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r10[r1] = r11;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r1 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r11 = 4;
        r1 = r1[r11];	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r11 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r12 = 1;
        r11 = r11[r12];	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r1 = r3.update(r1, r9, r11, r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        if (r1 != 0) goto L_0x0093;
    L_0x0078:
        r1 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01a8, all -> 0x01a1 }
        r1.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01a8, all -> 0x01a1 }
        r9 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01a8, all -> 0x01a1 }
        r10 = 7;
        r9 = r9[r10];	 Catch:{ SQLiteDatabaseCorruptException -> 0x01a8, all -> 0x01a1 }
        r1 = r1.append(r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01a8, all -> 0x01a1 }
        r9 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01a8, all -> 0x01a1 }
        r1 = r1.append(r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01a8, all -> 0x01a1 }
        r1 = r1.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01a8, all -> 0x01a1 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01a8, all -> 0x01a1 }
    L_0x0093:
        if (r2 == 0) goto L_0x009d;
    L_0x0095:
        r0 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01aa, all -> 0x01a1 }
        r0 = r0.c;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01aa, all -> 0x01a1 }
        r1 = 0;
        r2.put(r0, r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01aa, all -> 0x01a1 }
    L_0x009d:
        if (r6 == 0) goto L_0x0029;
    L_0x009f:
        if (r2 == 0) goto L_0x0138;
    L_0x00a1:
        r0 = new java.util.HashSet;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r1 = r2.keySet();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r0.<init>(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r4 = r0.iterator();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
    L_0x00ae:
        r0 = r4.hasNext();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        if (r0 == 0) goto L_0x0138;
    L_0x00b4:
        r0 = r4.next();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r0 = (java.lang.String) r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r1 = r13.c;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r1 = com.whatsapp.ael.c(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r1 = r1.get(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r1 = (com.whatsapp.a5w) r1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        if (r1 == 0) goto L_0x0133;
    L_0x00c8:
        r5 = com.whatsapp.ael.g();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r8 = new android.content.ContentValues;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r9 = 1;
        r8.<init>(r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r9 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r10 = 0;
        r9 = r9[r10];	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r10 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r8.put(r9, r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r9 = 1;
        r9 = new java.lang.String[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r10 = 0;
        r9[r10] = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r10 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r11 = 6;
        r10 = r10[r11];	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r11 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r12 = 3;
        r11 = r11[r12];	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r9 = r3.update(r10, r8, r11, r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        if (r9 != 0) goto L_0x0127;
    L_0x00f4:
        r9 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r10 = 8;
        r9 = r9[r10];	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r8.put(r9, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r9 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r10 = 9;
        r9 = r9[r10];	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r10 = 0;
        r8 = r3.insert(r9, r10, r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        r10 = -1;
        r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r8 != 0) goto L_0x0127;
    L_0x010e:
        r8 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ac, all -> 0x01a1 }
        r8.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ac, all -> 0x01a1 }
        r9 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ac, all -> 0x01a1 }
        r10 = 2;
        r9 = r9[r10];	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ac, all -> 0x01a1 }
        r8 = r8.append(r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ac, all -> 0x01a1 }
        r8 = r8.append(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ac, all -> 0x01a1 }
        r8 = r8.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ac, all -> 0x01a1 }
        com.whatsapp.util.Log.e(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ac, all -> 0x01a1 }
    L_0x0127:
        com.whatsapp.a5w.b(r1, r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ae, all -> 0x01a1 }
        r1 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ae, all -> 0x01a1 }
        r2.put(r0, r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ae, all -> 0x01a1 }
        if (r6 == 0) goto L_0x0136;
    L_0x0133:
        r2.remove(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01ae, all -> 0x01a1 }
    L_0x0136:
        if (r6 == 0) goto L_0x00ae;
    L_0x0138:
        r3.setTransactionSuccessful();	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
        if (r3 == 0) goto L_0x0146;
    L_0x013d:
        r0 = r3.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b0 }
        if (r0 == 0) goto L_0x0146;
    L_0x0143:
        r3.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b0 }
    L_0x0146:
        r0 = r13.d;	 Catch:{ all -> 0x0199 }
        r1 = r0.iterator();	 Catch:{ all -> 0x0199 }
    L_0x014c:
        r0 = r1.hasNext();	 Catch:{ all -> 0x0199 }
        if (r0 == 0) goto L_0x0164;
    L_0x0152:
        r0 = r1.next();	 Catch:{ all -> 0x0199 }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ all -> 0x0199 }
        r3 = r13.c;	 Catch:{ all -> 0x0199 }
        r4 = new com.whatsapp.d5;	 Catch:{ all -> 0x0199 }
        r4.<init>(r13, r0);	 Catch:{ all -> 0x0199 }
        com.whatsapp.ael.a(r3, r4);	 Catch:{ all -> 0x0199 }
        if (r6 == 0) goto L_0x014c;
    L_0x0164:
        r0 = r13.c;	 Catch:{ all -> 0x0199 }
        r0 = com.whatsapp.ael.a(r0);	 Catch:{ all -> 0x0199 }
        r1 = new com.whatsapp.asd;	 Catch:{ all -> 0x0199 }
        r1.<init>(r13, r2);	 Catch:{ all -> 0x0199 }
        r0.post(r1);	 Catch:{ all -> 0x0199 }
        monitor-exit(r7);	 Catch:{ all -> 0x0199 }
        return;
    L_0x0174:
        r0 = move-exception;
        throw r0;
    L_0x0176:
        r2 = r1;
        goto L_0x000f;
    L_0x0179:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
    L_0x017b:
        r0 = move-exception;
        r1 = r3;
    L_0x017d:
        com.whatsapp.util.Log.a(r0);	 Catch:{ all -> 0x018b }
        r2 = r13.c;	 Catch:{ all -> 0x018b }
        r2.r();	 Catch:{ all -> 0x018b }
        r2 = new java.lang.AssertionError;	 Catch:{ all -> 0x018b }
        r2.<init>(r0);	 Catch:{ all -> 0x018b }
        throw r2;	 Catch:{ all -> 0x018b }
    L_0x018b:
        r0 = move-exception;
        r3 = r1;
    L_0x018d:
        if (r3 == 0) goto L_0x0198;
    L_0x018f:
        r1 = r3.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b2 }
        if (r1 == 0) goto L_0x0198;
    L_0x0195:
        r3.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b4 }
    L_0x0198:
        throw r0;	 Catch:{ all -> 0x0199 }
    L_0x0199:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0199 }
        throw r0;
    L_0x019c:
        r1 = r5;
        goto L_0x0044;
    L_0x019f:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
    L_0x01a1:
        r0 = move-exception;
        goto L_0x018d;
    L_0x01a3:
        r1 = "0";
        goto L_0x005f;
    L_0x01a8:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
    L_0x01aa:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
    L_0x01ac:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
    L_0x01ae:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017b, all -> 0x01a1 }
    L_0x01b0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0199 }
    L_0x01b2:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b4 }
    L_0x01b4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0199 }
    L_0x01b6:
        r0 = move-exception;
        r3 = r1;
        goto L_0x018d;
    L_0x01b9:
        r0 = move-exception;
        goto L_0x017d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.k6.run():void");
    }
}
