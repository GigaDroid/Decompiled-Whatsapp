package com.whatsapp;

import android.backport.util.Base64;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.be;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.util.b;
import com.whatsapp.util.bq;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class sx extends AsyncTask {
    protected static final LinkedHashMap b;
    private static final SecureRandom g;
    protected static final LinkedHashMap i;
    private static final Random j;
    private static final Object o;
    private static Timer s;
    private static final String[] z;
    private mk a;
    private final long c;
    private TimerTask d;
    protected boolean e;
    protected be f;
    private final boolean h;
    protected boolean k;
    private boolean l;
    protected long m;
    private long n;
    protected final co p;
    private final MediaData q;
    private boolean r;
    private boolean t;

    static boolean b(sx sxVar, boolean z) {
        sxVar.t = z;
        return z;
    }

    public static boolean a(co coVar) {
        try {
            if (!b.containsKey(coVar.k)) {
                if (!i.containsKey(coVar.k)) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static MediaData c(sx sxVar) {
        return sxVar.q;
    }

    @Deprecated
    protected long f() {
        return this.q.file.length();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.aki a(com.whatsapp.l[] r6) {
        /*
        r5 = this;
        r0 = 0;
        r1 = r6[r0];
        r0 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0011 }
        com.whatsapp.util.ag.b(r0);	 Catch:{ IOException -> 0x0011 }
        r0 = r5.e;	 Catch:{ IOException -> 0x0011 }
        if (r0 == 0) goto L_0x0013;
    L_0x000e:
        r0 = com.whatsapp.aki.SUCCESS;	 Catch:{ IOException -> 0x0011 }
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        if (r1 != 0) goto L_0x0022;
    L_0x0015:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0020 }
        r1 = z;	 Catch:{ IOException -> 0x0020 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0020 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0020 }
        throw r0;	 Catch:{ IOException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = r5.a(r1);	 Catch:{ IOException -> 0x002f }
        r5.a = r0;	 Catch:{ IOException -> 0x002f }
        r0 = r5.a;	 Catch:{ IOException -> 0x002f }
        if (r0 != 0) goto L_0x0031;
    L_0x002c:
        r0 = com.whatsapp.aki.FAILED_GENERIC;	 Catch:{ IOException -> 0x002f }
        goto L_0x0010;
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        r0 = r5.a;	 Catch:{ IOException -> 0x0050, Exception -> 0x00ad }
        r0 = r5.a(r0);	 Catch:{ IOException -> 0x0050, Exception -> 0x00ad }
        r2 = com.whatsapp.aki.SUCCESS;	 Catch:{ IOException -> 0x00ab, Exception -> 0x00ad }
        if (r0 != r2) goto L_0x0010;
    L_0x003b:
        r2 = r5.i();	 Catch:{ IOException -> 0x00ab, Exception -> 0x00ad }
        if (r2 == 0) goto L_0x0010;
    L_0x0041:
        r2 = r5.p;	 Catch:{ IOException -> 0x004e, Exception -> 0x00ad }
        r3 = r5.q;	 Catch:{ IOException -> 0x004e, Exception -> 0x00ad }
        r3 = r3.file;	 Catch:{ IOException -> 0x004e, Exception -> 0x00ad }
        r3 = com.whatsapp.util.ag.b(r3);	 Catch:{ IOException -> 0x004e, Exception -> 0x00ad }
        r2.o = r3;	 Catch:{ IOException -> 0x004e, Exception -> 0x00ad }
        goto L_0x0010;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0050, Exception -> 0x00ad }
    L_0x0050:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00cf }
        r2.<init>();	 Catch:{ IOException -> 0x00cf }
        r3 = z;	 Catch:{ IOException -> 0x00cf }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00cf }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x00cf }
        r3 = r5.p;	 Catch:{ IOException -> 0x00cf }
        r3 = r3.k;	 Catch:{ IOException -> 0x00cf }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x00cf }
        r2 = r2.toString();	 Catch:{ IOException -> 0x00cf }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ IOException -> 0x00cf }
        r0 = r5.e;	 Catch:{ IOException -> 0x00cf }
        if (r0 != 0) goto L_0x00cb;
    L_0x0072:
        r0 = r1.b;	 Catch:{ IOException -> 0x00cf }
        if (r0 != 0) goto L_0x00cb;
    L_0x0076:
        r0 = z;
        r2 = 5;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r1.d;
        r0 = android.net.Uri.parse(r0);
        r0 = r0.buildUpon();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r0.authority(r2);
        r2 = new com.whatsapp.l;
        r0 = r0.toString();
        r3 = r1.c;
        r1 = r1.b;
        r2.<init>(r5, r0, r3, r1);
        r0 = r5.a(r2);	 Catch:{ IOException -> 0x00d1 }
        r5.a = r0;	 Catch:{ IOException -> 0x00d1 }
        r0 = r5.a;	 Catch:{ IOException -> 0x00d1 }
        if (r0 != 0) goto L_0x00d3;
    L_0x00a7:
        r0 = com.whatsapp.aki.FAILED_GENERIC;	 Catch:{ IOException -> 0x00d1 }
        goto L_0x0010;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x004e, Exception -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.p;
        r2 = r2.k;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.b(r1, r0);
    L_0x00cb:
        r0 = com.whatsapp.aki.FAILED_GENERIC;
        goto L_0x0010;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = r5.a;	 Catch:{ IOException -> 0x00f3, Exception -> 0x0114 }
        r0 = r5.a(r0);	 Catch:{ IOException -> 0x00f3, Exception -> 0x0114 }
        r1 = com.whatsapp.aki.SUCCESS;	 Catch:{ IOException -> 0x0112, Exception -> 0x0114 }
        if (r0 != r1) goto L_0x0010;
    L_0x00dd:
        r1 = r5.i();	 Catch:{ IOException -> 0x0112, Exception -> 0x0114 }
        if (r1 == 0) goto L_0x0010;
    L_0x00e3:
        r1 = r5.p;	 Catch:{ IOException -> 0x00f1, Exception -> 0x0114 }
        r2 = r5.q;	 Catch:{ IOException -> 0x00f1, Exception -> 0x0114 }
        r2 = r2.file;	 Catch:{ IOException -> 0x00f1, Exception -> 0x0114 }
        r2 = com.whatsapp.util.ag.b(r2);	 Catch:{ IOException -> 0x00f1, Exception -> 0x0114 }
        r1.o = r2;	 Catch:{ IOException -> 0x00f1, Exception -> 0x0114 }
        goto L_0x0010;
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00f3, Exception -> 0x0114 }
    L_0x00f3:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.p;
        r2 = r2.k;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x00cb;
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00f1, Exception -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.p;
        r2 = r2.k;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x00cb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.sx.a(com.whatsapp.l[]):com.whatsapp.aki");
    }

    public static void j() {
        boolean z = DialogToastActivity.f;
        Log.i(z[8] + i.size() + z[7] + b.size());
        Collection values = i.values();
        sx[] sxVarArr = (sx[]) values.toArray(new sx[values.size()]);
        int length = sxVarArr.length;
        int i = 0;
        while (i < length) {
            sxVarArr[i].a(false);
            i++;
            if (z) {
                break;
            }
        }
        i.clear();
        values = b.values();
        sxVarArr = (sx[]) values.toArray(new sx[values.size()]);
        length = sxVarArr.length;
        i = 0;
        while (i < length) {
            sxVarArr[i].a(false);
            i++;
            if (z) {
                break;
            }
        }
        b.clear();
    }

    @NonNull
    private String a(@NonNull String str, @Nullable String str2, @NonNull byte[] bArr) {
        boolean z = DialogToastActivity.f;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Mac instance = Mac.getInstance(z[10]);
            try {
                instance.init(new SecretKeySpec(bArr, z[11]));
                lu e = App.as.e();
                try {
                    Collection singleton;
                    if (this.k) {
                        singleton = Collections.singleton(e.p);
                    } else {
                        singleton = App.as.a(str, str2);
                    }
                    for (String str3 : r0) {
                        if (e != null) {
                            try {
                                if (!this.k) {
                                    if (TextUtils.equals(str3, e.p) && !z) {
                                    }
                                }
                            } catch (NoSuchAlgorithmException e2) {
                                throw e2;
                            } catch (NoSuchAlgorithmException e22) {
                                throw e22;
                            }
                        }
                        instance.reset();
                        String str32 = Base64.encodeToString(instance.doFinal(str32.getBytes()), 0, 20, 10);
                        try {
                            if (stringBuilder.length() > 0) {
                                stringBuilder.append(z[12]);
                            }
                            stringBuilder.append(str32);
                            if (z) {
                                break;
                            }
                        } catch (NoSuchAlgorithmException e222) {
                            throw e222;
                        }
                    }
                    return stringBuilder.toString();
                } catch (NoSuchAlgorithmException e2222) {
                    throw e2222;
                }
            } catch (InvalidKeyException e3) {
                throw new AssertionError(e3);
            }
        } catch (NoSuchAlgorithmException e22222) {
            throw new AssertionError(e22222);
        }
    }

    static String a(sx sxVar, String str, String str2, byte[] bArr) {
        return sxVar.a(str, str2, bArr);
    }

    static InputStream c(sx sxVar, boolean z) {
        return sxVar.b(z);
    }

    public sx(co coVar, boolean z, boolean z2) {
        this.e = false;
        this.p = coVar;
        this.q = (MediaData) coVar.Q;
        this.c = coVar.z;
        this.m = 0;
        this.r = z;
        this.h = z2;
        if (!z) {
            try {
                coVar.d = 1;
                this.q.transferring = true;
                this.q.progress = 0;
                if (coVar.c == 1) {
                    if (this.q.file == null) {
                        this.q.autodownloadRetryEnabled = false;
                    }
                }
                App.aK.a(coVar, false, -1);
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    private aki a(mk mkVar) {
        boolean b = mkVar.b();
        try {
            if (this.a.d() == 415) {
                return aki.FAILED_BAD_MEDIA;
            }
            if (!b) {
                return aki.FAILED_GENERIC;
            }
            try {
                return aki.SUCCESS;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    @Nullable
    private InputStream b(boolean z) {
        try {
            InputStream k = k();
            return z ? new cz(k, new vq(this.q.cipherKey, this.q.hmacKey, this.q.iv, this.q.refKey)) : k;
        } catch (Throwable e) {
            Log.b(z[13], e);
            return null;
        }
    }

    static boolean b(sx sxVar) {
        return sxVar.r;
    }

    public co m() {
        return this.p;
    }

    protected MediaData l() {
        return this.q;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r11) {
        /*
        r10 = this;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 21;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r10.p;
        r1 = r1.k;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 22;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r11);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r5 = new com.whatsapp.b0;
        r5.<init>(r10);
        r0 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r0 = r0.k;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r5.d = r0;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r0 = r10.f();	 Catch:{ IllegalArgumentException -> 0x0224 }
        r5.f = r0;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r0 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r0 = com.whatsapp.protocol.co.a(r0);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r5.c = r0;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r5.g = r11;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r0 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r0 = r0.o;	 Catch:{ IllegalArgumentException -> 0x0224 }
        if (r0 != 0) goto L_0x0059;
    L_0x0053:
        r0 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0.o = r11;	 Catch:{ IllegalArgumentException -> 0x0226 }
        if (r4 == 0) goto L_0x0069;
    L_0x0059:
        r0 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r0 = r0.o;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r0 = r0.equals(r11);	 Catch:{ IllegalArgumentException -> 0x0228 }
        if (r0 != 0) goto L_0x0069;
    L_0x0063:
        r0 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r0 = r0.o;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r5.a = r0;	 Catch:{ IllegalArgumentException -> 0x0228 }
    L_0x0069:
        r0 = r10.p;	 Catch:{ IllegalArgumentException -> 0x022a }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x022a }
        r1 = 2;
        if (r0 != r1) goto L_0x0087;
    L_0x0070:
        r0 = r10.p;	 Catch:{ IllegalArgumentException -> 0x022c }
        r0 = r0.r;	 Catch:{ IllegalArgumentException -> 0x022c }
        r1 = 1;
        if (r0 != r1) goto L_0x0087;
    L_0x0077:
        r0 = r5.g;	 Catch:{ IllegalArgumentException -> 0x022e }
        if (r0 == 0) goto L_0x0087;
    L_0x007b:
        r0 = r5.a;	 Catch:{ IllegalArgumentException -> 0x022e }
        if (r0 == 0) goto L_0x0087;
    L_0x007f:
        r0 = r5.a;
        r1 = r5.g;
        r5.a = r1;
        r5.g = r0;
    L_0x0087:
        r0 = new com.whatsapp.awe;
        r0.<init>(r10);
        r10.d = r0;
        r0 = s;
        r1 = r10.d;
        r2 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r0.schedule(r1, r2);
        r0 = com.whatsapp.App.as;
        r1 = r10.p;
        r1 = r1.k;
        r1 = r1.c;
        r2 = r10.p;
        r2 = r2.g;
        r3 = com.whatsapp.it.ALLOW;
        r6 = r0.a(r1, r2, r3);
        r0 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0230 }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x0230 }
        r1 = 1;
        if (r0 != r1) goto L_0x0234;
    L_0x00b0:
        r0 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x0232 }
        r1 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0232 }
        r1 = r1.k;	 Catch:{ IllegalArgumentException -> 0x0232 }
        r1 = r1.c;	 Catch:{ IllegalArgumentException -> 0x0232 }
        r2 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0232 }
        r2 = r2.g;	 Catch:{ IllegalArgumentException -> 0x0232 }
        r3 = com.whatsapp.tq.ALLOW;	 Catch:{ IllegalArgumentException -> 0x0232 }
        r0 = r0.a(r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0232 }
        if (r0 == 0) goto L_0x0234;
    L_0x00c4:
        r0 = 1;
    L_0x00c5:
        r1 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0237 }
        r1 = r1.c;	 Catch:{ IllegalArgumentException -> 0x0237 }
        r2 = 2;
        if (r1 != r2) goto L_0x023d;
    L_0x00cc:
        r1 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = r2.k;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r3 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r3 = r3.g;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r7 = com.whatsapp.a3m.ALLOW;	 Catch:{ IllegalArgumentException -> 0x0239 }
        r1 = r1.a(r2, r3, r7);	 Catch:{ IllegalArgumentException -> 0x0239 }
        if (r1 == 0) goto L_0x023d;
    L_0x00e0:
        r1 = r10.e();	 Catch:{ IllegalArgumentException -> 0x023b }
        if (r1 == 0) goto L_0x023d;
    L_0x00e6:
        r1 = 1;
    L_0x00e7:
        r2 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0240 }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0240 }
        r3 = 3;
        if (r2 != r3) goto L_0x0246;
    L_0x00ee:
        r2 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x0242 }
        r3 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0242 }
        r3 = r3.k;	 Catch:{ IllegalArgumentException -> 0x0242 }
        r3 = r3.c;	 Catch:{ IllegalArgumentException -> 0x0242 }
        r7 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0242 }
        r7 = r7.g;	 Catch:{ IllegalArgumentException -> 0x0242 }
        r8 = com.whatsapp.c7.ALLOW;	 Catch:{ IllegalArgumentException -> 0x0242 }
        r2 = r2.a(r3, r7, r8);	 Catch:{ IllegalArgumentException -> 0x0242 }
        if (r2 == 0) goto L_0x0246;
    L_0x0102:
        r2 = r10.q;	 Catch:{ IllegalArgumentException -> 0x0244 }
        r2 = r2.file;	 Catch:{ IllegalArgumentException -> 0x0244 }
        r2 = com.whatsapp.util.b.e(r2);	 Catch:{ IllegalArgumentException -> 0x0244 }
        if (r2 == 0) goto L_0x0246;
    L_0x010c:
        r2 = 1;
    L_0x010d:
        r3 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r3 = r3.c;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r7 = 9;
        if (r3 != r7) goto L_0x024f;
    L_0x0115:
        r3 = r10.p;	 Catch:{ IllegalArgumentException -> 0x024b }
        r3 = r3.n;	 Catch:{ IllegalArgumentException -> 0x024b }
        r3 = com.whatsapp.a59.b(r3);	 Catch:{ IllegalArgumentException -> 0x024b }
        if (r3 == 0) goto L_0x024f;
    L_0x011f:
        r3 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x024d }
        r7 = r10.p;	 Catch:{ IllegalArgumentException -> 0x024d }
        r7 = r7.k;	 Catch:{ IllegalArgumentException -> 0x024d }
        r7 = r7.c;	 Catch:{ IllegalArgumentException -> 0x024d }
        r8 = r10.p;	 Catch:{ IllegalArgumentException -> 0x024d }
        r8 = r8.g;	 Catch:{ IllegalArgumentException -> 0x024d }
        r9 = com.whatsapp.air.ALLOW;	 Catch:{ IllegalArgumentException -> 0x024d }
        r3 = r3.a(r7, r8, r9);	 Catch:{ IllegalArgumentException -> 0x024d }
        if (r3 == 0) goto L_0x024f;
    L_0x0133:
        r3 = 1;
    L_0x0134:
        if (r1 == 0) goto L_0x014c;
    L_0x0136:
        r7 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0252 }
        r7 = r7.c;	 Catch:{ IllegalArgumentException -> 0x0252 }
        r8 = 2;
        if (r7 != r8) goto L_0x014c;
    L_0x013d:
        r7 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0254 }
        r7 = r7.r;	 Catch:{ IllegalArgumentException -> 0x0254 }
        r8 = 1;
        if (r7 != r8) goto L_0x014c;
    L_0x0144:
        r7 = z;	 Catch:{ IllegalArgumentException -> 0x0254 }
        r8 = 20;
        r7 = r7[r8];	 Catch:{ IllegalArgumentException -> 0x0254 }
        r5.c = r7;	 Catch:{ IllegalArgumentException -> 0x0254 }
    L_0x014c:
        if (r1 == 0) goto L_0x0158;
    L_0x014e:
        r7 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0256 }
        r8 = r10.g();	 Catch:{ IllegalArgumentException -> 0x0256 }
        r7.n = r8;	 Catch:{ IllegalArgumentException -> 0x0256 }
        if (r4 == 0) goto L_0x0166;
    L_0x0158:
        if (r2 == 0) goto L_0x0166;
    L_0x015a:
        r7 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0258 }
        r8 = r10.q;	 Catch:{ IllegalArgumentException -> 0x0258 }
        r8 = r8.file;	 Catch:{ IllegalArgumentException -> 0x0258 }
        r8 = com.whatsapp.util.b.d(r8);	 Catch:{ IllegalArgumentException -> 0x0258 }
        r7.n = r8;	 Catch:{ IllegalArgumentException -> 0x0258 }
    L_0x0166:
        if (r0 != 0) goto L_0x016e;
    L_0x0168:
        if (r1 != 0) goto L_0x016e;
    L_0x016a:
        if (r2 != 0) goto L_0x016e;
    L_0x016c:
        if (r3 == 0) goto L_0x01dd;
    L_0x016e:
        r0 = r10.p;
        r0.o = r11;
        r0 = 32;
        r0 = new byte[r0];
        r1 = j;	 Catch:{ IllegalArgumentException -> 0x025a }
        r1.nextBytes(r0);	 Catch:{ IllegalArgumentException -> 0x025a }
        r5.b = r0;	 Catch:{ IllegalArgumentException -> 0x025a }
        r0 = r10.q;	 Catch:{ IllegalArgumentException -> 0x025a }
        r0 = r0.mediaKey;	 Catch:{ IllegalArgumentException -> 0x025a }
        if (r0 == 0) goto L_0x0194;
    L_0x0183:
        r0 = r10.q;	 Catch:{ IllegalArgumentException -> 0x025c }
        r0 = r0.uploadUrl;	 Catch:{ IllegalArgumentException -> 0x025c }
        if (r0 == 0) goto L_0x0194;
    L_0x0189:
        r0 = r10.q;	 Catch:{ IllegalArgumentException -> 0x025e }
        r0 = r0.uploadUrl;	 Catch:{ IllegalArgumentException -> 0x025e }
        r1 = 0;
        r2 = 0;
        r5.a(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x025e }
        if (r4 == 0) goto L_0x01db;
    L_0x0194:
        r0 = r10.q;	 Catch:{ IllegalArgumentException -> 0x025e }
        r0 = r0.mediaKey;	 Catch:{ IllegalArgumentException -> 0x025e }
        if (r0 != 0) goto L_0x01d3;
    L_0x019a:
        r0 = 32;
        r0 = new byte[r0];
        r1 = g;
        r1.nextBytes(r0);
        r1 = r10.p;
        r1 = r1.c;
        r1 = com.whatsapp.App.a(r1);
        r1 = com.whatsapp.mt.a(r0, r1);
        r2 = r10.q;
        r2.mediaKey = r0;
        r0 = r10.q;
        r2 = r1.c();
        r0.refKey = r2;
        r0 = r10.q;
        r2 = r1.a();
        r0.cipherKey = r2;
        r0 = r10.q;
        r2 = r1.d();
        r0.hmacKey = r2;
        r0 = r10.q;
        r1 = r1.b();
        r0.iv = r1;
    L_0x01d3:
        r0 = r10.q;
        r1 = 0;
        r0.uploadUrl = r1;
        com.whatsapp.App.a(r5);
    L_0x01db:
        if (r4 == 0) goto L_0x0223;
    L_0x01dd:
        if (r6 == 0) goto L_0x01ff;
    L_0x01df:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0260 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0260 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0260 }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0260 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0260 }
        r1 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0260 }
        r1 = r1.k;	 Catch:{ IllegalArgumentException -> 0x0260 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0260 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0260 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x0260 }
        if (r4 == 0) goto L_0x0223;
    L_0x01ff:
        r0 = r10.p;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r1 = 9;
        if (r0 == r1) goto L_0x0223;
    L_0x0207:
        r0 = r10.q;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r1 = 0;
        r0.mediaKey = r1;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r0 = r10.q;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r1 = 0;
        r0.refKey = r1;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r0 = r10.q;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r1 = 0;
        r0.cipherKey = r1;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r0 = r10.q;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r1 = 0;
        r0.hmacKey = r1;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r0 = r10.q;	 Catch:{ IllegalArgumentException -> 0x0262 }
        r1 = 0;
        r0.iv = r1;	 Catch:{ IllegalArgumentException -> 0x0262 }
        com.whatsapp.App.b(r5);	 Catch:{ IllegalArgumentException -> 0x0262 }
    L_0x0223:
        return;
    L_0x0224:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0226 }
    L_0x0226:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0228 }
    L_0x0228:
        r0 = move-exception;
        throw r0;
    L_0x022a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x022c }
    L_0x022c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x022e }
    L_0x022e:
        r0 = move-exception;
        throw r0;
    L_0x0230:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0232 }
    L_0x0232:
        r0 = move-exception;
        throw r0;
    L_0x0234:
        r0 = 0;
        goto L_0x00c5;
    L_0x0237:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0239 }
    L_0x0239:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x023b }
    L_0x023b:
        r0 = move-exception;
        throw r0;
    L_0x023d:
        r1 = 0;
        goto L_0x00e7;
    L_0x0240:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0242 }
    L_0x0242:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0244 }
    L_0x0244:
        r0 = move-exception;
        throw r0;
    L_0x0246:
        r2 = 0;
        goto L_0x010d;
    L_0x0249:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x024b }
    L_0x024b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x024d }
    L_0x024d:
        r0 = move-exception;
        throw r0;
    L_0x024f:
        r3 = 0;
        goto L_0x0134;
    L_0x0252:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0254 }
    L_0x0254:
        r0 = move-exception;
        throw r0;
    L_0x0256:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0258 }
    L_0x0258:
        r0 = move-exception;
        throw r0;
    L_0x025a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x025c }
    L_0x025c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x025e }
    L_0x025e:
        r0 = move-exception;
        throw r0;
    L_0x0260:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0262 }
    L_0x0262:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.sx.a(java.lang.String):void");
    }

    public void b() {
        a(true);
    }

    protected void onCancelled() {
        Log.i(z[9] + this.p.k);
        a(aki.CANCEL);
    }

    static void a(sx sxVar, Object[] objArr) {
        sxVar.publishProgress(objArr);
    }

    static {
        String[] strArr = new String[39];
        String str = "\u0011JoDj\t_gBj\u0018\u0000bB&\u0019]yBy\\";
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
                        i3 = 124;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 11;
                        break;
                    case at.o /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 11;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0011JoDj\t_gBj\u0018\u0000iLh\u0017Z{\u0000f\u0011\\$Hy\u000e@y\r";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0011Bx\u0003|\u0014N\u007f^j\f_%Cn\b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ")_gBj\u0018\u007fj_j\u0011\\+Dx\\A~Ag";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0011JoDj\t_gBj\u0018\u0000jY\u007f\u0019B{Yb\u0012H+Yd\\LdCe\u0019L\u007f\r\u007f\u0013\u000fmLg\u0010MjN`\\Bf^+\u000fJy[n\u000e";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0011JoDj\t_gBj\u0018\u0000iLh\u0017Z{\u0000f\u0011\\$DdQJy_d\u000e\u000f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\\_nCo\u0015Al\u0017";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0011JoDj\t_gBj\u0018\u0000hLe\u001fJgLg\u0010\u000fhXy\u000eJeY1";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0011JoDj\t_gBj\u0018\u0000dCh\u001dAhHg\u0010Jo\r";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "4BjNX4n9\u0018=";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    str = "4BjNX4n9\u0018=";
                    obj = 10;
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    strArr2 = strArr3;
                    str = "q%";
                    obj = 11;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "1bX\r~\fCdLo\\IjDg\u0019K+Yd\\_yH{\u001d]n\rb\u0012_~Y+\u000f[yHj\u0011";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0011JoDj\t_gBj\u0018\u0000hLe\u001fJg\r";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0011JoDj\t_gBj\u0018\u0000nCo\\";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u001fZy_n\u0012[1";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\\]n^~\u0010[1";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\\_nCo\u0015Al\u0017";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0011JoDj\t_gBj\u0018\u0000nCoSAdY+\bGb^+";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\f[\u007f";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0011JoDj\t_gBj\u0018\u0000yHz\tJxY~\fCdLo\\";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\\_gLb\u0012[nU\u007fQ\\cL&N\u001a=\u0017";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\tAjOg\u0019\u000f\u007fB+\u000fJeI+\u0011JoDjG\u000f|Lx\\AdY+\u0019CbJb\u001eCn\rm\u0013]+He\u001f]r]\u007f\u0015@e\ri\t[+@~\u000f[+On\\JeNy\u0005_\u007fHoG\u000ffHx\u000fNlH%\u0017Jr\u0010";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0011JoDj\t_gBj\u0018\u0000fDx\u000fFeJ+\u0017Jr^+\u0015A+X{\u0010@jI+\u000eJxXg\b";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0011JoDj\t_gBj\u0018\u0000~_gSAd\u0000c\u0013\\\u007f";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0011JoDj\t_gBj\u0018\u0000+^n\u000eYn_T\u0014NxE+\u0011Fx^b\u0012H";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\\\\n_}\u0019]TEj\u000fG1";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0011JoDj\t_gBj\u0018\u0000~_gSJy_d\u000e\u000f";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0011JoDj\t_gBj\u0018\u0000+Ad\u001fNgrc\u001d\\c\u0017";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "<\\%Zc\u001d[xL{\f\u0001eH\u007f";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0014NxE";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u001a]d@";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\b@";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u001aFgH";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u000eJm^";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0011JoDj\t_gBj\u0018\u0000xYj\u000e[+";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\\_nCo\u0015Al\u0017";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\\L~_y\u0019A\u007f\u0017";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    z = strArr3;
                    j = new Random();
                    g = new SecureRandom();
                    s = new Timer();
                    i = new LinkedHashMap();
                    b = new LinkedHashMap();
                    o = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0011JoDj\t_gBj\u0018\u0000n_y\u0013]+";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected boolean e() {
        return b.b(this.q.file);
    }

    static TimerTask a(sx sxVar) {
        return sxVar.d;
    }

    protected String h() {
        return ag.b(this.q.file);
    }

    public Object doInBackground(Object[] objArr) {
        return a((l[]) objArr);
    }

    public void d() {
        try {
            Log.i(z[36] + this.p.k + z[38] + i.size() + z[37] + b.size());
            if (i.size() > 10) {
                b.put(this.p.k, this);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            i.put(this.p.k, this);
            this.n = System.currentTimeMillis();
            bq.a(new fg(this), new Void[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static Object c() {
        return o;
    }

    protected InputStream k() {
        FileInputStream fileInputStream = new FileInputStream(this.q.file);
        ag.a(fileInputStream);
        return fileInputStream;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.mk a(com.whatsapp.l r7) {
        /*
        r6 = this;
        r0 = 0;
        r1 = r7.c;
        r2 = r6.b(r1);
        if (r2 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = new com.whatsapp.m;
        r3.<init>(r6);
        r1 = new com.whatsapp.aw5;
        r1.<init>(r2);
        r0 = new com.whatsapp.mk;
        r2 = r7.d;
        r0.<init>(r2, r3);
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0093 }
        r3 = 34;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0093 }
        r3 = 0;
        r4 = r7.b;	 Catch:{ IllegalArgumentException -> 0x0093 }
        r4 = (long) r4;	 Catch:{ IllegalArgumentException -> 0x0093 }
        r0.a(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x0093 }
        r2 = r7.c;	 Catch:{ IllegalArgumentException -> 0x0093 }
        if (r2 == 0) goto L_0x005c;
    L_0x002c:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0091 }
        r3 = new com.whatsapp.a38;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r3.<init>(r6, r1);	 Catch:{ IllegalArgumentException -> 0x0091 }
        r0.a(r2, r3);	 Catch:{ IllegalArgumentException -> 0x0091 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = 35;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r6.p;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r2.k;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r3 = r6.p;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r3 = r3.g;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r4 = r6.q;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r4 = r4.refKey;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r6.a(r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x0091 }
        r0.b(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0091 }
        r1 = 1;
        r6.t = r1;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0091 }
        if (r1 == 0) goto L_0x0009;
    L_0x005c:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = 32;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0091 }
        r3 = com.whatsapp.App.ay;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r3 = r3.jabber_id;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0091 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r4 = 30;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0091 }
        r0.b(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0091 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = 33;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r6.p;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r2.k;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r0.b(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0091 }
        goto L_0x0009;
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0091 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.sx.a(com.whatsapp.l):com.whatsapp.mk");
    }

    static void a(sx sxVar, String str) {
        sxVar.a(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Long[] r11) {
        /*
        r10 = this;
        r8 = 0;
        r6 = 0;
        r0 = r11[r6];
        r0 = r0.longValue();
        r2 = r10.m;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r0 - r2;
        r4 = 0;
        com.whatsapp.amd.b(r2, r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r10.m = r0;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r10.r;	 Catch:{ IllegalArgumentException -> 0x003a }
        if (r2 != 0) goto L_0x0039;
    L_0x0017:
        r2 = r10.c;	 Catch:{ IllegalArgumentException -> 0x003c }
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 == 0) goto L_0x002b;
    L_0x001d:
        r2 = r10.q;	 Catch:{ IllegalArgumentException -> 0x003e }
        r4 = 100;
        r0 = r0 * r4;
        r4 = r10.c;	 Catch:{ IllegalArgumentException -> 0x003e }
        r0 = r0 / r4;
        r2.progress = r0;	 Catch:{ IllegalArgumentException -> 0x003e }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x003e }
        if (r0 == 0) goto L_0x0031;
    L_0x002b:
        r0 = r10.q;	 Catch:{ IllegalArgumentException -> 0x003e }
        r2 = 0;
        r0.progress = r2;	 Catch:{ IllegalArgumentException -> 0x003e }
    L_0x0031:
        r0 = com.whatsapp.App.aK;
        r1 = r10.p;
        r2 = -1;
        r0.a(r1, r6, r2);
    L_0x0039:
        return;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.sx.a(java.lang.Long[]):void");
    }

    protected boolean i() {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.aki r9) {
        /*
        r8 = this;
        r2 = 1;
        r3 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.q;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = 0;
        r0.transferring = r1;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r5 = 15;
        r1 = r1[r5];	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = r8.p;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = r1.k;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r5 = 16;
        r1 = r1[r5];	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = i;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = r1.size();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r5 = 18;
        r1 = r1[r5];	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = b;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = r1.size();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r5 = 17;
        r1 = r1[r5];	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = r0.append(r9);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0 = r8.d;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        if (r0 == 0) goto L_0x0066;
    L_0x0061:
        r0 = r8.d;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r0.cancel();	 Catch:{ IllegalArgumentException -> 0x00d5 }
    L_0x0066:
        r0 = i;
        r1 = r8.p;
        r1 = r1.k;
        r0 = r0.remove(r1);
        r0 = (com.whatsapp.sx) r0;
        r1 = b;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x009c;
    L_0x007a:
        r1 = b;
        r1 = r1.entrySet();
        r1 = r1.iterator();
        r1 = r1.next();
        r1 = (java.util.Map.Entry) r1;
        r5 = b;
        r6 = r1.getKey();
        r5.remove(r6);
        r1 = r1.getValue();
        r1 = (com.whatsapp.sx) r1;
        r1.d();
    L_0x009c:
        if (r0 == r8) goto L_0x00dd;
    L_0x009e:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r5 = 19;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r1 = r1.append(r4);	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r4 = r8.p;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r4 = r4.k;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r1 = r1.append(r4);	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r4 = " ";
        r1 = r1.append(r4);	 Catch:{ IllegalArgumentException -> 0x00d7 }
        if (r0 != 0) goto L_0x00d9;
    L_0x00be:
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00db }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x00db }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalArgumentException -> 0x00db }
        if (r0 == 0) goto L_0x00d4;
    L_0x00cb:
        r1 = i;	 Catch:{ IllegalArgumentException -> 0x00db }
        r2 = r8.p;	 Catch:{ IllegalArgumentException -> 0x00db }
        r2 = r2.k;	 Catch:{ IllegalArgumentException -> 0x00db }
        r1.put(r2, r0);	 Catch:{ IllegalArgumentException -> 0x00db }
    L_0x00d4:
        return;
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r2 = r3;
        goto L_0x00be;
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        r0 = r8.r;	 Catch:{ IllegalArgumentException -> 0x0174 }
        if (r0 != 0) goto L_0x00d4;
    L_0x00e1:
        r0 = com.whatsapp.aki.SUCCESS;	 Catch:{ IllegalArgumentException -> 0x0176 }
        if (r9 != r0) goto L_0x00f6;
    L_0x00e5:
        r0 = r8.e;	 Catch:{ IllegalArgumentException -> 0x0178 }
        if (r0 == 0) goto L_0x00f6;
    L_0x00e9:
        r0 = r8.a();	 Catch:{ IllegalArgumentException -> 0x017a }
        if (r0 == 0) goto L_0x00d4;
    L_0x00ef:
        r0 = r8.p;	 Catch:{ IllegalArgumentException -> 0x017c }
        r1 = 2;
        r0.d = r1;	 Catch:{ IllegalArgumentException -> 0x017c }
        if (r4 == 0) goto L_0x00fb;
    L_0x00f6:
        r0 = r8.p;	 Catch:{ IllegalArgumentException -> 0x017c }
        r1 = 0;
        r0.d = r1;	 Catch:{ IllegalArgumentException -> 0x017c }
    L_0x00fb:
        r0 = r8.isCancelled();	 Catch:{ IllegalArgumentException -> 0x017e }
        if (r0 != 0) goto L_0x0155;
    L_0x0101:
        r0 = com.whatsapp.aki.SUCCESS;	 Catch:{ IllegalArgumentException -> 0x0180 }
        if (r9 == r0) goto L_0x0113;
    L_0x0105:
        r0 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x0180 }
        r0 = r0.M();	 Catch:{ IllegalArgumentException -> 0x0180 }
        r1 = new com.whatsapp.a_4;	 Catch:{ IllegalArgumentException -> 0x0180 }
        r1.<init>(r8, r9);	 Catch:{ IllegalArgumentException -> 0x0180 }
        r0.post(r1);	 Catch:{ IllegalArgumentException -> 0x0180 }
    L_0x0113:
        r0 = com.whatsapp.aki.SUCCESS;	 Catch:{ IllegalArgumentException -> 0x0182 }
        if (r9 != r0) goto L_0x0127;
    L_0x0117:
        r0 = r8.e;	 Catch:{ IllegalArgumentException -> 0x0184 }
        if (r0 == 0) goto L_0x0127;
    L_0x011b:
        r0 = r8.a;	 Catch:{ IllegalArgumentException -> 0x0184 }
        if (r0 == 0) goto L_0x0123;
    L_0x011f:
        r0 = com.whatsapp.fieldstats.ck.OK;
        if (r4 == 0) goto L_0x0194;
    L_0x0123:
        r0 = com.whatsapp.fieldstats.ck.DUPLICATE;
        if (r4 == 0) goto L_0x0194;
    L_0x0127:
        r0 = com.whatsapp.fieldstats.ck.ERROR_UNKNOWN;
        r1 = r0;
    L_0x012a:
        r4 = com.whatsapp.App.z();	 Catch:{ IllegalArgumentException -> 0x0186 }
        r5 = com.whatsapp.fieldstats.bn.RETRY_COUNT;	 Catch:{ IllegalArgumentException -> 0x0186 }
        r0 = r8.h;	 Catch:{ IllegalArgumentException -> 0x0186 }
        if (r0 == 0) goto L_0x0188;
    L_0x0134:
        r0 = r2;
    L_0x0135:
        r0 = java.lang.Integer.valueOf(r0);
        com.whatsapp.fieldstats.i.a(r4, r5, r0);
        r0 = r8.p;
        r4 = java.lang.System.currentTimeMillis();
        r6 = r8.n;
        r4 = r4 - r6;
        r3 = r8.q;
        r3 = r3.transcoded;
        com.whatsapp.wo.a(r0, r1, r4, r3);
        r0 = com.whatsapp.App.z();
        r1 = com.whatsapp.fieldstats.bn.RETRY_COUNT;
        com.whatsapp.fieldstats.i.a(r0, r1);
    L_0x0155:
        r0 = com.whatsapp.aki.FAILED_BAD_MEDIA;	 Catch:{ IllegalArgumentException -> 0x018a }
        if (r9 == r0) goto L_0x015d;
    L_0x0159:
        r0 = com.whatsapp.aki.FAILED_FNF;	 Catch:{ IllegalArgumentException -> 0x018c }
        if (r9 != r0) goto L_0x0162;
    L_0x015d:
        r0 = r8.q;	 Catch:{ IllegalArgumentException -> 0x018c }
        r1 = 0;
        r0.autodownloadRetryEnabled = r1;	 Catch:{ IllegalArgumentException -> 0x018c }
    L_0x0162:
        r1 = com.whatsapp.App.aK;	 Catch:{ IllegalArgumentException -> 0x018e }
        r3 = r8.p;	 Catch:{ IllegalArgumentException -> 0x018e }
        r0 = com.whatsapp.aki.SUCCESS;	 Catch:{ IllegalArgumentException -> 0x018e }
        if (r9 != r0) goto L_0x0192;
    L_0x016a:
        r0 = r8.e;	 Catch:{ IllegalArgumentException -> 0x0190 }
        if (r0 == 0) goto L_0x0192;
    L_0x016e:
        r0 = r2;
    L_0x016f:
        r1.a(r3, r2, r0);
        goto L_0x00d4;
    L_0x0174:
        r0 = move-exception;
        throw r0;
    L_0x0176:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0178 }
    L_0x0178:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x017a }
    L_0x017a:
        r0 = move-exception;
        throw r0;
    L_0x017c:
        r0 = move-exception;
        throw r0;
    L_0x017e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0180 }
    L_0x0180:
        r0 = move-exception;
        throw r0;
    L_0x0182:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0184 }
    L_0x0184:
        r0 = move-exception;
        throw r0;
    L_0x0186:
        r0 = move-exception;
        throw r0;
    L_0x0188:
        r0 = r3;
        goto L_0x0135;
    L_0x018a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x018c }
    L_0x018c:
        r0 = move-exception;
        throw r0;
    L_0x018e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0190 }
    L_0x0190:
        r0 = move-exception;
        throw r0;
    L_0x0192:
        r0 = -1;
        goto L_0x016f;
    L_0x0194:
        r1 = r0;
        goto L_0x012a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.sx.a(com.whatsapp.aki):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean a() {
        /*
        r6 = this;
        r1 = 1;
        r0 = 0;
        r2 = new java.net.URL;	 Catch:{ Exception -> 0x0030 }
        r3 = r6.f;	 Catch:{ Exception -> 0x0030 }
        r3 = r3.a;	 Catch:{ Exception -> 0x0030 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x0030 }
        r3 = r2.getHost();	 Catch:{ Exception -> 0x002e }
        if (r3 == 0) goto L_0x001b;
    L_0x0011:
        r2 = r2.getHost();	 Catch:{ Exception -> 0x002e }
        r2 = r2.length();	 Catch:{ Exception -> 0x002e }
        if (r2 != 0) goto L_0x004f;
    L_0x001b:
        r2 = z;	 Catch:{ Exception -> 0x0030 }
        r3 = 25;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0030 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ Exception -> 0x0030 }
        r2 = com.whatsapp.App.aK;	 Catch:{ Exception -> 0x0030 }
        r3 = r6.p;	 Catch:{ Exception -> 0x0030 }
        r4 = 0;
        r5 = -1;
        r2.a(r3, r4, r5);	 Catch:{ Exception -> 0x0030 }
    L_0x002d:
        return r0;
    L_0x002e:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0030 }
    L_0x0030:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 28;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r2.toString();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
    L_0x004f:
        r2 = r6.f;	 Catch:{ Exception -> 0x007a }
        r2 = r2.c;	 Catch:{ Exception -> 0x007a }
        if (r2 == 0) goto L_0x0065;
    L_0x0055:
        r2 = r6.f;	 Catch:{ Exception -> 0x007c }
        r2 = r2.a;	 Catch:{ Exception -> 0x007c }
        if (r2 == 0) goto L_0x0065;
    L_0x005b:
        r2 = r6.f;	 Catch:{ Exception -> 0x0078 }
        r2 = r2.d;	 Catch:{ Exception -> 0x0078 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x007e;
    L_0x0065:
        r1 = z;	 Catch:{ Exception -> 0x0078 }
        r2 = 24;
        r1 = r1[r2];	 Catch:{ Exception -> 0x0078 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ Exception -> 0x0078 }
        r1 = com.whatsapp.App.aK;	 Catch:{ Exception -> 0x0078 }
        r2 = r6.p;	 Catch:{ Exception -> 0x0078 }
        r3 = 0;
        r4 = -1;
        r1.a(r2, r3, r4);	 Catch:{ Exception -> 0x0078 }
        goto L_0x002d;
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0078 }
    L_0x007e:
        r0 = r6.l;	 Catch:{ Exception -> 0x0121 }
        if (r0 != 0) goto L_0x00f0;
    L_0x0082:
        r0 = r6.f;	 Catch:{ Exception -> 0x0123 }
        r0 = r0.e;	 Catch:{ Exception -> 0x0123 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x0123 }
        if (r0 == 0) goto L_0x0099;
    L_0x008c:
        r0 = z;	 Catch:{ Exception -> 0x0125 }
        r2 = 26;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0125 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x0125 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ Exception -> 0x0125 }
        if (r0 == 0) goto L_0x00f0;
    L_0x0099:
        r0 = r6.t;	 Catch:{ Exception -> 0x0127 }
        if (r0 != 0) goto L_0x00f0;
    L_0x009d:
        r0 = r6.f;	 Catch:{ Exception -> 0x0129 }
        r0 = r0.e;	 Catch:{ Exception -> 0x0129 }
        r2 = r6.p;	 Catch:{ Exception -> 0x0129 }
        r2 = r2.o;	 Catch:{ Exception -> 0x0129 }
        r0 = r0.equals(r2);	 Catch:{ Exception -> 0x0129 }
        if (r0 != 0) goto L_0x00e8;
    L_0x00ab:
        r0 = r6.p;	 Catch:{ Exception -> 0x012b }
        r0 = r0.c;	 Catch:{ Exception -> 0x012b }
        r2 = 2;
        if (r0 != r2) goto L_0x00b8;
    L_0x00b2:
        r0 = r6.p;	 Catch:{ Exception -> 0x012d }
        r0 = r0.r;	 Catch:{ Exception -> 0x012d }
        if (r0 == r1) goto L_0x00e8;
    L_0x00b8:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x012d }
        r0.<init>();	 Catch:{ Exception -> 0x012d }
        r2 = z;	 Catch:{ Exception -> 0x012d }
        r3 = 29;
        r2 = r2[r3];	 Catch:{ Exception -> 0x012d }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x012d }
        r2 = r6.p;	 Catch:{ Exception -> 0x012d }
        r2 = r2.o;	 Catch:{ Exception -> 0x012d }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x012d }
        r2 = z;	 Catch:{ Exception -> 0x012d }
        r3 = 27;
        r2 = r2[r3];	 Catch:{ Exception -> 0x012d }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x012d }
        r2 = r6.f;	 Catch:{ Exception -> 0x012d }
        r2 = r2.e;	 Catch:{ Exception -> 0x012d }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x012d }
        r0 = r0.toString();	 Catch:{ Exception -> 0x012d }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x012d }
    L_0x00e8:
        r0 = r6.p;
        r2 = r6.f;
        r2 = r2.e;
        r0.o = r2;
    L_0x00f0:
        r0 = r6.t;	 Catch:{ Exception -> 0x012f }
        if (r0 != 0) goto L_0x0104;
    L_0x00f4:
        r0 = r6.p;	 Catch:{ Exception -> 0x012f }
        r2 = r6.f;	 Catch:{ Exception -> 0x012f }
        r2 = r2.d;	 Catch:{ Exception -> 0x012f }
        r0.z = r2;	 Catch:{ Exception -> 0x012f }
        r0 = r6.p;	 Catch:{ Exception -> 0x012f }
        r2 = r6.f;	 Catch:{ Exception -> 0x012f }
        r2 = r2.c;	 Catch:{ Exception -> 0x012f }
        r0.n = r2;	 Catch:{ Exception -> 0x012f }
    L_0x0104:
        r0 = r6.p;	 Catch:{ Exception -> 0x0131 }
        r2 = r6.f;	 Catch:{ Exception -> 0x0131 }
        r2 = r2.a;	 Catch:{ Exception -> 0x0131 }
        r0.q = r2;	 Catch:{ Exception -> 0x0131 }
        r0 = r6.p;	 Catch:{ Exception -> 0x0131 }
        r0 = r0.H;	 Catch:{ Exception -> 0x0131 }
        if (r0 != 0) goto L_0x011a;
    L_0x0112:
        r0 = r6.p;	 Catch:{ Exception -> 0x0131 }
        r2 = r6.f;	 Catch:{ Exception -> 0x0131 }
        r2 = r2.f;	 Catch:{ Exception -> 0x0131 }
        r0.H = r2;	 Catch:{ Exception -> 0x0131 }
    L_0x011a:
        r0 = r6.q;
        r0.transferred = r1;
        r0 = r1;
        goto L_0x002d;
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0123 }
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0125 }
    L_0x0125:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0127 }
    L_0x0127:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0129 }
    L_0x0129:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x012d }
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r0 = move-exception;
        throw r0;
    L_0x0131:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.sx.a():boolean");
    }

    public void onProgressUpdate(Object[] objArr) {
        a((Long[]) objArr);
    }

    static boolean a(sx sxVar, boolean z) {
        sxVar.l = z;
        return z;
    }

    public void onPostExecute(Object obj) {
        a((aki) obj);
    }

    protected String g() {
        return b.a(b.a(this.q.file));
    }

    private void a(boolean z) {
        boolean z2 = true;
        try {
            Log.i(z[14] + this.p.k);
            cancel(true);
            if (!this.r) {
                this.p.d = 0;
                this.q.transferring = false;
                this.q.transferred = false;
                MediaData mediaData = this.q;
                if (z) {
                    z2 = false;
                }
                mediaData.autodownloadRetryEnabled = z2;
                App.aK.c(this.p);
            }
            i.remove(this.p.k);
            b.remove(this.p.k);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
