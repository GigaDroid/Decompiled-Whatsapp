package com.whatsapp;

import android.backport.util.Base64;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.a9;
import org.t;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class l9 {
    private static volatile l9 a;
    private static final String[] z;
    @NonNull
    private final Context b;
    private volatile a9 c;
    private volatile t d;
    private boolean e;

    static {
        String[] strArr = new String[13];
        String str = ",%}U>.d`V{.!g\\)#%xP!/dwU2/*`\u0019(>%`P8j/q@++-f";
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
                        i3 = 68;
                        break;
                    case at.i /*2*/:
                        i3 = 20;
                        break;
                    case at.o /*3*/:
                        i3 = 57;
                        break;
                    default:
                        i3 = 91;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "?*u[7/d`V{=6}M>j'xP>$04J/+0}Z{!!mI:#6";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ")(}\\5>\u001bgM:>-wf0/=dX28";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "!!mJ/%6q";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ")(}\\5>\u001bgM:>-wf0/=dX28";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "9!fO>8\u001bgM:>-wf+?&xP8";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ",%}U>.d`V{.!g\\)#%xP!/dg\\)<!f\u0019+?&xP8j/q@";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "!!mJ/%6q";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "?*u[7/d`V{=6}M>j7qK-/64J/+0}Z{!!mI:#6";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "9!fO>8\u001bgM:>-wf+?&xP8";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "9%bP5-dg\\)<!f\u0019(>%`P8j4a[7#'4R>3";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "!!mJ/%6q";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "-!z\\)+0}W<j*qN{)(}\\5>dgM:>-w\u00190/=dX28";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    @NonNull
    public t b() {
        t tVar = null;
        t tVar2 = this.d;
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (this) {
            tVar2 = this.d;
            if (tVar2 == null) {
                SharedPreferences sharedPreferences = this.b.getSharedPreferences(z[4], 0);
                String string = sharedPreferences.getString(z[5], "");
                try {
                    if (!TextUtils.isEmpty(string)) {
                        tVar = t.a(Base64.decode(string, 3));
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (Throwable e2) {
                    Log.c(z[0], e2);
                }
                if (tVar == null) {
                    Log.i(z[1]);
                    tVar = t.b();
                    if (!sharedPreferences.edit().putString(z[3], Base64.encodeToString(tVar.a(), 3)).commit()) {
                        try {
                            throw new AssertionError(z[2]);
                        } catch (IllegalArgumentException e3) {
                            throw e3;
                        }
                    }
                }
                this.d = tVar;
            } else {
                tVar = tVar2;
            }
        }
        return tVar;
    }

    @NonNull
    public static l9 a(@NonNull Context context) {
        l9 l9Var = a;
        if (l9Var == null) {
            synchronized (l9.class) {
                l9Var = a;
                if (l9Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        l9Var = new l9(context);
                        a = l9Var;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
        }
        return l9Var;
    }

    private l9(@NonNull Context context) {
        this.b = (Context) auv.a((Object) context);
    }

    public synchronized void a(a9 a9Var) {
        Log.i(z[11]);
        if (this.b.getSharedPreferences(z[12], 0).edit().putString(z[10], Base64.encodeToString(a9Var.a(), 3)).commit()) {
            this.c = a9Var;
            this.e = true;
        } else {
            try {
                throw new AssertionError(z[9]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.a9 a() {
        /*
        r4 = this;
        r1 = 0;
        r0 = r4.c;
        if (r0 != 0) goto L_0x0040;
    L_0x0005:
        monitor-enter(r4);
        r0 = r4.c;	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x003f;
    L_0x000a:
        r2 = r4.e;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r2 != 0) goto L_0x003f;
    L_0x000e:
        r0 = r4.b;	 Catch:{ all -> 0x0043 }
        r2 = z;	 Catch:{ all -> 0x0043 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ all -> 0x0043 }
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);	 Catch:{ all -> 0x0043 }
        r2 = z;	 Catch:{ all -> 0x0043 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ all -> 0x0043 }
        r3 = "";
        r0 = r0.getString(r2, r3);	 Catch:{ all -> 0x0043 }
        r2 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0046 }
        if (r2 == 0) goto L_0x0053;
    L_0x002d:
        r2 = r1;
    L_0x002e:
        if (r2 == 0) goto L_0x0039;
    L_0x0030:
        r0 = new org.a9;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0048 }
        if (r2 == 0) goto L_0x003a;
    L_0x0039:
        r0 = r1;
    L_0x003a:
        r4.c = r0;	 Catch:{ all -> 0x0043 }
        r1 = 1;
        r4.e = r1;	 Catch:{ all -> 0x0043 }
    L_0x003f:
        monitor-exit(r4);	 Catch:{ all -> 0x0043 }
    L_0x0040:
        return r0;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0043 }
        throw r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        r2 = z;	 Catch:{ all -> 0x0043 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ all -> 0x0043 }
        com.whatsapp.util.Log.c(r2, r0);	 Catch:{ all -> 0x0043 }
        r0 = r1;
        goto L_0x003a;
    L_0x0053:
        r2 = 3;
        r0 = android.backport.util.Base64.decode(r0, r2);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r2 = r0;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l9.a():org.a9");
    }
}
