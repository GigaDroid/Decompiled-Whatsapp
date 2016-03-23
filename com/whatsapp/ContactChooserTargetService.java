package com.whatsapp;

import android.annotation.TargetApi;
import android.service.chooser.ChooserTargetService;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.at;

@TargetApi(23)
public class ContactChooserTargetService extends ChooserTargetService {
    private static final AtomicReference a;
    private static final String[] z;

    public static void a() {
        Log.i(z[0]);
        List a = App.aK.a(604800000, 20);
        App.p.e(a);
        a(a);
        Log.i(z[1]);
    }

    public static void a(List list) {
        if (list != null && !list.isEmpty()) {
            a.set(list);
        }
    }

    static {
        String[] strArr = new String[6];
        String str = ".9\\\u0002\u000f>#F\u0006\u001e/\u007f[\u0017\b+$K\u0014\u0018+\"Z\u0002\b";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 80;
                        break;
                    case at.i /*2*/:
                        i3 = 46;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    default:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "j$O\u0015\u000b/$]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ".9\\\u0002\u000f>#F\u0006\u001e/\u007fM\u0015\t+$K\u0003L";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ".9\\\u0002\u000f>#F\u0006\u001e/\u007f]\u0013\r8$K\u0003";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = " 9J";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new AtomicReference();
                    return;
                default:
                    strArr2[i] = str;
                    str = ".9\\\u0002\u000f>#F\u0006\u001e/\u007f[\u0017\b+$K\u0001\u0005$9]\u000f\t.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List onGetChooserTargets(android.content.ComponentName r16, android.content.IntentFilter r17) {
        /*
        r15 = this;
        r8 = com.whatsapp.DialogToastActivity.f;
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r10 = android.os.Binder.clearCallingIdentity();
        r9 = new java.util.ArrayList;
        r9.<init>();
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x010f }
        r3.<init>();	 Catch:{ all -> 0x010f }
        r2 = a;	 Catch:{ all -> 0x010f }
        r2 = r2.get();	 Catch:{ all -> 0x010f }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x010f }
        if (r2 == 0) goto L_0x003f;
    L_0x0022:
        r4 = r2.iterator();	 Catch:{ all -> 0x010f }
    L_0x0026:
        r2 = r4.hasNext();	 Catch:{ all -> 0x010f }
        if (r2 == 0) goto L_0x003f;
    L_0x002c:
        r2 = r4.next();	 Catch:{ all -> 0x010f }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x010f }
        r5 = com.whatsapp.App.as;	 Catch:{ all -> 0x010f }
        r2 = r5.f(r2);	 Catch:{ all -> 0x010f }
        if (r2 == 0) goto L_0x003d;
    L_0x003a:
        r3.add(r2);	 Catch:{ all -> 0x010f }
    L_0x003d:
        if (r8 == 0) goto L_0x0026;
    L_0x003f:
        r2 = r3.isEmpty();	 Catch:{ all -> 0x010f }
        if (r2 == 0) goto L_0x0114;
    L_0x0045:
        r2 = 20;
        r2 = com.whatsapp.qa.a(r2);	 Catch:{ all -> 0x010f }
        r3 = r2.isEmpty();	 Catch:{ all -> 0x010f }
        if (r3 == 0) goto L_0x0056;
    L_0x0051:
        r3 = com.whatsapp.App.as;	 Catch:{ all -> 0x010f }
        r3.a(r2);	 Catch:{ all -> 0x010f }
    L_0x0056:
        r3 = com.whatsapp.App.z();	 Catch:{ all -> 0x010f }
        r3 = r3.getResources();	 Catch:{ all -> 0x010f }
        r4 = 2131427544; // 0x7f0b00d8 float:1.8476707E38 double:1.053065126E-314;
        r12 = r3.getDimensionPixelSize(r4);	 Catch:{ all -> 0x010f }
        r3 = com.whatsapp.App.z();	 Catch:{ all -> 0x010f }
        r3 = r3.getResources();	 Catch:{ all -> 0x010f }
        r4 = 2131427359; // 0x7f0b001f float:1.8476332E38 double:1.0530650347E-314;
        r13 = r3.getDimensionPixelSize(r4);	 Catch:{ all -> 0x010f }
        r6 = new android.content.ComponentName;	 Catch:{ all -> 0x010f }
        r3 = com.whatsapp.ContactPicker.class;
        r6.<init>(r15, r3);	 Catch:{ all -> 0x010f }
        r14 = r2.iterator();	 Catch:{ all -> 0x010f }
    L_0x007f:
        r2 = r14.hasNext();	 Catch:{ all -> 0x010f }
        if (r2 == 0) goto L_0x00e5;
    L_0x0085:
        r2 = r14.next();	 Catch:{ all -> 0x010f }
        r0 = r2;
        r0 = (com.whatsapp.l5) r0;	 Catch:{ all -> 0x010f }
        r3 = r0;
        r2 = r9.size();	 Catch:{ all -> 0x010f }
        r4 = 8;
        if (r2 < r4) goto L_0x0097;
    L_0x0095:
        if (r8 == 0) goto L_0x00e5;
    L_0x0097:
        r2 = (float) r13;	 Catch:{ all -> 0x010f }
        r4 = 1;
        r2 = r3.a(r12, r2, r4);	 Catch:{ all -> 0x010f }
        if (r2 != 0) goto L_0x00ae;
    L_0x009f:
        r4 = r3.z();	 Catch:{ all -> 0x010f }
        r5 = (float) r13;	 Catch:{ all -> 0x010f }
        r4 = com.whatsapp.l5.a(r4, r12, r5);	 Catch:{ all -> 0x010f }
        r4 = android.graphics.drawable.Icon.createWithBitmap(r4);	 Catch:{ all -> 0x010f }
        if (r8 == 0) goto L_0x00b2;
    L_0x00ae:
        r4 = android.graphics.drawable.Icon.createWithBitmap(r2);	 Catch:{ all -> 0x010f }
    L_0x00b2:
        r2 = r3.p;	 Catch:{ all -> 0x010f }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x010f }
        if (r2 != 0) goto L_0x00e3;
    L_0x00ba:
        r2 = r3.p;	 Catch:{ all -> 0x010f }
        r2 = com.whatsapp.aup.a(r2);	 Catch:{ all -> 0x010f }
        if (r2 != 0) goto L_0x00e3;
    L_0x00c2:
        r7 = new android.os.Bundle;	 Catch:{ all -> 0x010f }
        r7.<init>();	 Catch:{ all -> 0x010f }
        r2 = z;	 Catch:{ all -> 0x010f }
        r5 = 5;
        r2 = r2[r5];	 Catch:{ all -> 0x010f }
        r5 = r3.p;	 Catch:{ all -> 0x010f }
        r7.putString(r2, r5);	 Catch:{ all -> 0x010f }
        r2 = new android.service.chooser.ChooserTarget;	 Catch:{ all -> 0x010f }
        r5 = com.whatsapp.App.z();	 Catch:{ all -> 0x010f }
        r3 = r3.a(r5);	 Catch:{ all -> 0x010f }
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x010f }
        r9.add(r2);	 Catch:{ all -> 0x010f }
    L_0x00e3:
        if (r8 == 0) goto L_0x007f;
    L_0x00e5:
        android.os.Binder.restoreCallingIdentity(r10);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.size();
        r2 = r2.append(r3);
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        return r9;
    L_0x010f:
        r2 = move-exception;
        android.os.Binder.restoreCallingIdentity(r10);
        throw r2;
    L_0x0114:
        r2 = r3;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactChooserTargetService.onGetChooserTargets(android.content.ComponentName, android.content.IntentFilter):java.util.List");
    }
}
