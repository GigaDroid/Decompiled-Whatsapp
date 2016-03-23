package com.whatsapp;

import com.whatsapp.util.m;
import org.v;
import org.whispersystems.at;

class ash implements m {
    private static final String[] z;
    final boolean a;
    final Conversation b;

    static {
        String[] strArr = new String[5];
        String str = "(}\u0007\t\u0018/`\u0003";
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
                        i3 = 78;
                        break;
                    case at.g /*1*/:
                        i3 = 20;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    default:
                        i3 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "$}\u000f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "=u\u0006\u001f\u001d s";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ">x\n\u0015\n/w\u00003\u0007 x\u0012";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "'g4\u001c\u001a+b\u0002\t\u001f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.io.File r10) {
        /*
        r9 = this;
        r8 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = android.os.Build.MANUFACTURER;
        r2 = 32;
        r3 = 95;
        r1 = r1.replace(r2, r3);
        r2 = z;	 Catch:{ IOException -> 0x008d }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ IOException -> 0x008d }
        r1 = r1.equalsIgnoreCase(r2);	 Catch:{ IOException -> 0x008d }
        if (r1 == 0) goto L_0x0079;
    L_0x0018:
        r1 = r9.a;	 Catch:{ IOException -> 0x008d }
        if (r1 == 0) goto L_0x0079;
    L_0x001c:
        r1 = r9.b;	 Catch:{ IOException -> 0x008f }
        r1 = r1.aI;	 Catch:{ IOException -> 0x008f }
        r1 = r1.p;	 Catch:{ IOException -> 0x008f }
        r2 = 2;
        r1 = com.whatsapp.util.ag.a(r1, r2, r10);	 Catch:{ IOException -> 0x008f }
        if (r1 == 0) goto L_0x0030;
    L_0x0029:
        r1 = 2;
        r1 = com.whatsapp.util.ag.a(r1, r10);	 Catch:{ IOException -> 0x0091 }
        if (r1 == 0) goto L_0x006c;
    L_0x0030:
        r1 = new android.content.Intent;
        r2 = r9.b;
        r3 = com.whatsapp.RecordAudio.class;
        r1.<init>(r2, r3);
        r2 = z;	 Catch:{ IOException -> 0x0093 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0093 }
        r3 = 1;
        r1.putExtra(r2, r3);	 Catch:{ IOException -> 0x0093 }
        r2 = z;	 Catch:{ IOException -> 0x0093 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0093 }
        r3 = 1;
        r1.putExtra(r2, r3);	 Catch:{ IOException -> 0x0093 }
        r2 = z;	 Catch:{ IOException -> 0x0093 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0093 }
        r3 = r9.b;	 Catch:{ IOException -> 0x0093 }
        r3 = r3.aI;	 Catch:{ IOException -> 0x0093 }
        r3 = r3.p;	 Catch:{ IOException -> 0x0093 }
        r1.putExtra(r2, r3);	 Catch:{ IOException -> 0x0093 }
        r2 = z;	 Catch:{ IOException -> 0x0093 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0093 }
        r3 = r10.getAbsolutePath();	 Catch:{ IOException -> 0x0093 }
        r1.putExtra(r2, r3);	 Catch:{ IOException -> 0x0093 }
        r2 = r9.b;	 Catch:{ IOException -> 0x0093 }
        r2.startActivity(r1);	 Catch:{ IOException -> 0x0093 }
        if (r0 == 0) goto L_0x008c;
    L_0x006c:
        r1 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0093 }
        r2 = 2131232023; // 0x7f080517 float:1.8080144E38 double:1.052968526E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ IOException -> 0x0093 }
        if (r0 == 0) goto L_0x008c;
    L_0x0079:
        r0 = r9.b;	 Catch:{ IOException -> 0x0095 }
        r1 = r9.b;	 Catch:{ IOException -> 0x0095 }
        r2 = r9.b;	 Catch:{ IOException -> 0x0095 }
        r2 = r2.aI;	 Catch:{ IOException -> 0x0095 }
        r2 = r2.p;	 Catch:{ IOException -> 0x0095 }
        r4 = 2;
        r5 = 0;
        r6 = r9.a;	 Catch:{ IOException -> 0x0095 }
        r7 = 0;
        r3 = r10;
        com.whatsapp.util.ag.a(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x0095 }
    L_0x008c:
        return;
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = move-exception;
        r1 = r9.b;
        r1 = r1.getBaseContext();
        r2 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        com.whatsapp.App.a(r1, r2, r8);
        com.whatsapp.util.Log.a(r0);
        goto L_0x008c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ash.a(java.io.File):void");
    }

    ash(Conversation conversation, boolean z) {
        this.b = conversation;
        this.a = z;
    }
}
