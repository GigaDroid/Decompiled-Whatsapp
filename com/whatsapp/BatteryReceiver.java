package com.whatsapp;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.PowerManager;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

final class BatteryReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "jC\u001bmY";
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
                        i3 = 26;
                        break;
                    case at.g /*1*/:
                        i3 = 44;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 8;
                        break;
                    default:
                        i3 = 43;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "OB\tp[\u007fO\u0018mO:M\u000f|BuBV(";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "{B\bzDsHBaEnI\u0002|\u0005{O\u0018aDt\u0002.I\u007fNi>QtYd-Fl_h";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "{B\bzDsHBgX4M\u000f|BuBBXdMi>Wx[z)WfUh)WhRm\"On^";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "{B\bzDsHBaEnI\u0002|\u0005{O\u0018aDt\u0002.I\u007fNi>QtYd-Fl_h";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "{B\bzDsHBgX4M\u000f|BuBBXdMi>Wx[z)WfUh)WhRm\"On^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        try {
            intentFilter.addAction(z[5]);
            if (VERSION.SDK_INT >= 21) {
                intentFilter.addAction(z[4]);
            }
            try {
                context.registerReceiver(this, intentFilter);
                if (VERSION.SDK_INT >= 21) {
                    b(context);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                h.b().d(new x6(false));
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private void a(Intent intent) {
        vr vrVar = new vr(intent);
        try {
            if (!vrVar.equals((vr) h.b().b(vr.class))) {
                h.b().d(vrVar);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
        r6 = this;
        r1 = 1;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = r8.getAction();
        r0 = -1;
        r4 = r3.hashCode();	 Catch:{ IllegalArgumentException -> 0x004f }
        switch(r4) {
            case -1538406691: goto L_0x0034;
            case 1779291251: goto L_0x0042;
            default: goto L_0x000f;
        };
    L_0x000f:
        switch(r0) {
            case 0: goto L_0x0053;
            case 1: goto L_0x0058;
            default: goto L_0x0012;
        };
    L_0x0012:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2 = r8.getAction();	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0032 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x004f }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x004f }
        r4 = r3.equals(r4);	 Catch:{ IllegalArgumentException -> 0x004f }
        if (r4 == 0) goto L_0x000f;
    L_0x003f:
        r0 = 0;
        if (r2 == 0) goto L_0x000f;
    L_0x0042:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0051 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0051 }
        r3 = r3.equals(r4);	 Catch:{ IllegalArgumentException -> 0x0051 }
        if (r3 == 0) goto L_0x000f;
    L_0x004d:
        r0 = r1;
        goto L_0x000f;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = move-exception;
        throw r0;
    L_0x0053:
        r6.a(r8);	 Catch:{ IllegalArgumentException -> 0x005e }
        if (r2 == 0) goto L_0x005d;
    L_0x0058:
        r6.b(r7);	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r2 != 0) goto L_0x0012;
    L_0x005d:
        return;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.BatteryReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    BatteryReceiver() {
    }

    @TargetApi(21)
    private void b(Context context) {
        h.b().d(new x6(((PowerManager) context.getSystemService(z[0])).isPowerSaveMode()));
    }
}
