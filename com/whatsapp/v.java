package com.whatsapp;

import android.app.Activity;
import android.backport.util.Base64;
import android.graphics.Point;
import android.media.CamcorderProfile;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.a1;
import com.whatsapp.util.ag;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class v extends AsyncTask {
    private static final HashMap e;
    private static final HashMap i;
    private static final String[] z;
    private final co a;
    private final MediaData b;
    private final as8 c;
    private Activity d;
    private final URL f;
    private final File g;
    private final boolean h;

    private static URL a(co coVar) {
        Object obj;
        Uri parse;
        MediaData mediaData = (MediaData) coVar.Q;
        if (mediaData != null) {
            try {
                if (mediaData.refKey != null) {
                    obj = 1;
                    if (obj == null) {
                        try {
                            parse = Uri.parse(coVar.q);
                        } catch (MalformedURLException e) {
                            throw e;
                        }
                    }
                    parse = b(coVar);
                    if (TextUtils.isEmpty(parse.getHost())) {
                        Log.w(z[13] + coVar.k + z[10] + coVar.q);
                        if (!DialogToastActivity.f) {
                            return null;
                        }
                    }
                    return new URL(parse.toString());
                }
            } catch (MalformedURLException e2) {
                throw e2;
            } catch (MalformedURLException e22) {
                throw e22;
            }
        }
        obj = null;
        if (obj == null) {
            parse = b(coVar);
        } else {
            parse = Uri.parse(coVar.q);
        }
        if (TextUtils.isEmpty(parse.getHost())) {
            Log.w(z[13] + coVar.k + z[10] + coVar.q);
            if (DialogToastActivity.f) {
                return null;
            }
        }
        try {
            return new URL(parse.toString());
        } catch (Throwable e3) {
            Log.c(z[12] + coVar.k + z[11] + coVar.q, e3);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r8 = this;
        r7 = 3;
        r6 = 2;
        r2 = 0;
        r1 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.a;	 Catch:{ aw -> 0x008a }
        r0 = r0.c;	 Catch:{ aw -> 0x008a }
        r4 = 9;
        if (r0 != r4) goto L_0x0036;
    L_0x000e:
        r0 = z;	 Catch:{ aw -> 0x008a }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r0[r4];	 Catch:{ aw -> 0x008a }
        r4 = r8.a;	 Catch:{ aw -> 0x008a }
        r4 = r4.n;	 Catch:{ aw -> 0x008a }
        r0 = r0.equals(r4);	 Catch:{ aw -> 0x008a }
        if (r0 == 0) goto L_0x0036;
    L_0x001e:
        r0 = new com.whatsapp.util.i;
        r4 = r8.g;
        r0.<init>(r4);
        r0.a();	 Catch:{ aw -> 0x008c, IOException -> 0x00a2 }
        r4 = r8.b;	 Catch:{ aw -> 0x008c, IOException -> 0x00a2 }
        r0 = r0.c();	 Catch:{ aw -> 0x008c, IOException -> 0x00a2 }
        if (r0 == 0) goto L_0x009f;
    L_0x0030:
        r0 = com.whatsapp.MediaData.SUSPICIOUS_CONTENT_YES;	 Catch:{ aw -> 0x008c, IOException -> 0x00a2 }
    L_0x0032:
        r4.suspiciousContent = r0;	 Catch:{ aw -> 0x008e, IOException -> 0x00a2 }
    L_0x0034:
        if (r3 == 0) goto L_0x00df;
    L_0x0036:
        r0 = r8.a;	 Catch:{ aw -> 0x00ad }
        r0 = r0.c;	 Catch:{ aw -> 0x00ad }
        if (r0 == r7) goto L_0x0042;
    L_0x003c:
        r0 = r8.a;	 Catch:{ aw -> 0x00af }
        r0 = r0.c;	 Catch:{ aw -> 0x00af }
        if (r0 != r6) goto L_0x00df;
    L_0x0042:
        r0 = r8.a;	 Catch:{ aw -> 0x00b1 }
        r0 = r0.c;	 Catch:{ aw -> 0x00b1 }
        if (r0 != r7) goto L_0x0055;
    L_0x0048:
        r0 = r8.g;	 Catch:{ aw -> 0x00b3 }
        r0 = com.whatsapp.util.b.c(r0);	 Catch:{ aw -> 0x00b3 }
        r0 = r0.c;	 Catch:{ aw -> 0x00b3 }
        if (r0 == 0) goto L_0x00b7;
    L_0x0052:
        r0 = r1;
    L_0x0053:
        if (r3 == 0) goto L_0x00c2;
    L_0x0055:
        r0 = r8.a;	 Catch:{ aw -> 0x00b9 }
        r0 = r0.c;	 Catch:{ aw -> 0x00b9 }
        if (r0 != r6) goto L_0x0067;
    L_0x005b:
        r0 = r8.g;	 Catch:{ aw -> 0x00bb }
        r0 = com.whatsapp.util.b.a(r0);	 Catch:{ aw -> 0x00bb }
        r0 = r0.b;	 Catch:{ aw -> 0x00bb }
        if (r0 != r1) goto L_0x00bf;
    L_0x0065:
        if (r3 == 0) goto L_0x00c1;
    L_0x0067:
        r0 = new java.lang.IllegalStateException;	 Catch:{ aw -> 0x0088 }
        r1 = new java.lang.StringBuilder;	 Catch:{ aw -> 0x0088 }
        r1.<init>();	 Catch:{ aw -> 0x0088 }
        r2 = z;	 Catch:{ aw -> 0x0088 }
        r3 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r2 = r2[r3];	 Catch:{ aw -> 0x0088 }
        r1 = r1.append(r2);	 Catch:{ aw -> 0x0088 }
        r2 = r8.a;	 Catch:{ aw -> 0x0088 }
        r2 = r2.c;	 Catch:{ aw -> 0x0088 }
        r1 = r1.append(r2);	 Catch:{ aw -> 0x0088 }
        r1 = r1.toString();	 Catch:{ aw -> 0x0088 }
        r0.<init>(r1);	 Catch:{ aw -> 0x0088 }
        throw r0;	 Catch:{ aw -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ aw -> 0x008e, IOException -> 0x00a2 }
    L_0x008e:
        r0 = move-exception;
        r4 = r8.b;
        r5 = com.whatsapp.MediaData.SUSPICIOUS_CONTENT_YES;
        r4.suspiciousContent = r5;
        r4 = z;
        r5 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.b(r4, r0);
        goto L_0x0034;
    L_0x009f:
        r0 = com.whatsapp.MediaData.SUSPICIOUS_CONTENT_NO;	 Catch:{ aw -> 0x008e, IOException -> 0x00a2 }
        goto L_0x0032;
    L_0x00a2:
        r0 = move-exception;
        r4 = z;
        r5 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.b(r4, r0);
        goto L_0x0034;
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ aw -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ aw -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ aw -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ aw -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = r2;
        goto L_0x0053;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ aw -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ aw -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r1 = r2;
        goto L_0x0065;
    L_0x00c1:
        r0 = r1;
    L_0x00c2:
        if (r0 == 0) goto L_0x00df;
    L_0x00c4:
        r0 = r8.g;	 Catch:{ at_ -> 0x00e2, IOException -> 0x0113 }
        r0 = com.whatsapp.Mp4Ops.a(r0);	 Catch:{ at_ -> 0x00e2, IOException -> 0x0113 }
        if (r0 == 0) goto L_0x00df;
    L_0x00cc:
        r1 = z;	 Catch:{ aw -> 0x00e0 }
        r2 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r1 = r1[r2];	 Catch:{ aw -> 0x00e0 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ aw -> 0x00e0 }
        r1 = r8.g;	 Catch:{ aw -> 0x00e0 }
        r1.delete();	 Catch:{ aw -> 0x00e0 }
        r1 = r8.g;	 Catch:{ aw -> 0x00e0 }
        r0.renameTo(r1);	 Catch:{ aw -> 0x00e0 }
    L_0x00df:
        return;
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ at_ -> 0x00e2, IOException -> 0x0113 }
    L_0x00e2:
        r0 = move-exception;
    L_0x00e3:
        r1 = r0 instanceof com.whatsapp.at_;	 Catch:{ aw -> 0x0111 }
        if (r1 == 0) goto L_0x00f4;
    L_0x00e7:
        r1 = r8.g;	 Catch:{ aw -> 0x0111 }
        r0 = (com.whatsapp.at_) r0;	 Catch:{ aw -> 0x0111 }
        r2 = z;	 Catch:{ aw -> 0x0111 }
        r3 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r2 = r2[r3];	 Catch:{ aw -> 0x0111 }
        com.whatsapp.Mp4Ops.a(r1, r0, r2);	 Catch:{ aw -> 0x0111 }
    L_0x00f4:
        r0 = r8.b;	 Catch:{ aw -> 0x010f }
        r0 = r0.mediaKey;	 Catch:{ aw -> 0x010f }
        if (r0 == 0) goto L_0x00df;
    L_0x00fa:
        r0 = z;	 Catch:{ aw -> 0x010f }
        r1 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r0 = r0[r1];	 Catch:{ aw -> 0x010f }
        com.whatsapp.util.Log.w(r0);	 Catch:{ aw -> 0x010f }
        r0 = r8.b;	 Catch:{ aw -> 0x010f }
        r1 = com.whatsapp.MediaData.SUSPICIOUS_CONTENT_YES;	 Catch:{ aw -> 0x010f }
        r0.suspiciousContent = r1;	 Catch:{ aw -> 0x010f }
        r0 = r8.g;	 Catch:{ aw -> 0x010f }
        r0.delete();	 Catch:{ aw -> 0x010f }
        goto L_0x00df;
    L_0x010f:
        r0 = move-exception;
        throw r0;
    L_0x0111:
        r0 = move-exception;
        throw r0;
    L_0x0113:
        r0 = move-exception;
        goto L_0x00e3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.a():void");
    }

    public static Collection b() {
        Collection arrayList;
        synchronized (e) {
            arrayList = new ArrayList(e.values());
        }
        return arrayList;
    }

    @NonNull
    private static String a(@Nullable String str) {
        if (str == null) {
            try {
                return z[15];
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        String c = ag.c(str);
        try {
            if (TextUtils.isEmpty(c)) {
                return z[14];
            }
            return c;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private static Uri b(co coVar) {
        Uri parse = Uri.parse(coVar.q);
        Builder buildUpon = parse.buildUpon();
        try {
            buildUpon.appendQueryParameter("x", "2");
            if (coVar.c == 3) {
                a(buildUpon);
            }
            App.a(parse, buildUpon);
            return buildUpon.build();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean c() {
        return this.h;
    }

    static {
        String[] strArr = new String[238];
        String str = "\u00192\u0018b\u0004";
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
                    case org.v.m /*0*/:
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = 71;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = 57;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case org.v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "\u0019&\u001fzV}(\u001d`UV&\u000e3";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0019&\tzPO.\u001ew\u0017W.\u00061\u0004";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "t\n9.]V0\u0004bVX#JoUK\"\u000bj@\u0019$\u0005cIU\"\u001ek]\u0002g\u0007kJJ&\rk\u0017R\"\u00133";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "t\n9.LW&\bb\\\u00193\u0005.]V0\u0004bVX#JjL\\g\u001ea\u0019T.\u0019}PW Jc\\].\u000b.]X3\u000b5\u0019T\"\u0019}X^\"De\\@z";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u00196\u001fkL\\i\u0019gC\\z";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "t\n9.]V0\u0004bVX#JoUK\"\u000bj@\u0019.\u0004.IK(\r|\\J4J&W\\0Jc\\J4\u000bi\\\u00195\u000fm\\P1\u000fj\u0010\u0002g\u0007kJJ&\rk\u0017R\"\u00133";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "t\n9.]V0\u0004bVX#JoUK\"\u000bj@\u0019.\u0004.IK(\r|\\J4J&XZ$\u0005|]P)\r.MVg\u0007k]P&JjXM&C5\u0019T\"\u0019}X^\"De\\@z";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "t\n9.]V0\u0004bVX#JoUK\"\u000bj@\u0019.\u0004.IK(\r|\\J4J&XZ$\u0005|]P)\r.MVg\t{KK\"\u0004z\u0019](\u001d`UV&\u000e}\u0010\u0019";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u00192\u0018b\u0004";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u00192\u0018b\u0004";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "t\n9.LK+JoMM&\tf\\]g\u001ea\u0019T\"\u0019}X^\"JgJ\u0019*\u000bb_V5\u0007k]\u0002g\u0007kJJ&\rk\u0017R\"\u00133";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "t\n9.LK+JoMM&\tf\\]g\u001ea\u0019T\"\u0019}X^\"JfXJg\u0004a\u0019Q(\u0019z\u0002\u0019*\u000f}JX \u000f R\\>W";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    str = "\\)\t";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "\\)\t";
                    obj = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "t\n9._X.\u0006k]\u00193\u0005.ZV)\u0004kZMg\u001dgMQg\u000b`\u0019q\u0013>^j\u0019$\u0005`W\\$\u001egVWg\u001dfPU\"JyKP3\u0003`^\u0019&\te\u0019_(\u0018.\\W$\u0018wIM\"\u000e.T\\#\u0003o\u0002\u0019*\u000f}JX \u000f R\\>W";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "t\n9._X.\u0006k]\u00193\u0005.NK.\u001ek\u0019X$\u0001._V5JkWZ5\u0013~M\\#Jc\\].\u000b5\u0019T\"\u0019}X^\"De\\@z";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "x$\tkIMj/`ZV#\u0003`^";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "l4\u000f|\u0014x \u000f`M";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0002g\u0018k_\u0004";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "X$\u0001";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "i\b9Z";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0002g\u0018k_\u0004";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0002g\u0018kJI(\u0004}\\z(\u000ek\u0004";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0002g\u0018k_\u0004";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "t\n9.XZ,J|\\J7\u0005`J\\g\ta]\\g\u001doJ\u0019)\u0005z\u0019\u000bwZ5\u0019T\"\u0019}X^\"De\\@z";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0002g\u0018k_\u0004";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "t\n9._X.\u0006k]\u00193\u0005.ZV)\u0004kZMg\u001dfPU\"JyKP3\u0003`^\u0019&\te\u0019_(\u0018.\\W$\u0018wIM\"\u000e.T\\#\u0003o\u0002\u0019*\u000f}JX \u000f R\\>W";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0002g\u0018k_\u0004";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0002g\u0018k_\u0004";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "t\n9.NK.\u001egW^g\u000bmR\u0019!\u0005|\u0019\\)\t|@I3\u000fj\u0019T\"\u000egX\u0002g\u0007kJJ&\rk\u0017R\"\u00133";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "t\n9.LW&\bb\\\u00193\u0005.ZV*\u001a{M\\g\u000bmR\u0019!\u0005|\u0019\\)\t|@I3\u000fj\u0019T\"\u000egX\u0002g\u0007kJJ&\rk\u0017R\"\u00133";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "P#\u000f`MP3\u0013";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "t\n9.LW&\bb\\\u00193\u0005.[L.\u0006j\u0019L5\u0006._V5JkWZ5\u0013~M\\#Jc\\].\u000b.XZ,Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u00192\u0018b\u0004";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "t\n9.T\\#\u0003o\u0019](\u001d`UV&\u000e.ZX)\tkU\\#Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "t\n9.ZX)\tkU\\#Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u00192\u0018b\u0004";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "bxPR\u0016\u0013eV0Ed";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "bxPR\u0016\u0013eV0Ed";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f._P+\u000f.VL3\u001a{M\u00194\u001e|\\X*JjLK.\u0004i\u0019T\"\u000egX\u0019#\u000fmK@7\u001egVW|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0002g\u000eaNW+\u0005o]\u007f.\u0006k\u0004";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "j\u000f+#\u000b\fq";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0002g\u0007k]P&\"oJQz";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0002g\u0006aZX+\"oJQz";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PT&\rk\u0019Z.\u001af\\Kg\u0003`IL3J}MK\"\u000bc\u0019]2\u0018gW^g\u0007k]P&Jj\\Z5\u0013~MP(\u00045\u0019T\"\u0019}X^\"De\\@z";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PT&\rk\u0019Z.\u001af\\Kg\u0003`IL3J}MK\"\u000bc\u0019]2\u0018gW^g\u0007k]P&Jj\\Z5\u0013~MP(\u00045\u0019T\"\u0019}X^\"De\\@z";
                    obj = 56;
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    strArr2 = strArr3;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PT&\rk\u0019Z.\u001af\\Kg\u0003`IL3J}MK\"\u000bc\u0019]2\u0018gW^g\u0007k]P&Jj\\Z5\u0013~MP(\u00045\u0019T\"\u0019}X^\"De\\@z";
                    obj = 57;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0002g\u0018kZ\\.\u001ck]q&\u0019f\u0004";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f._P+\u000f.VL3\u001a{M\u00194\u001e|\\X*JjLK.\u0004i\u0019T\"\u000egX\u0019#\u000fmK@7\u001egVW|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019]2\u000f.MVg\u0002oJQg\u0007gJT&\u001emQ\u0002g\u0007kJJ&\rk\u0017R\"\u00133";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PT&\rk\u0019Z.\u001af\\Kg\u0003`IL3J}MK\"\u000bc\u0019]2\u0018gW^g\u0007k]P&Jj\\Z5\u0013~MP(\u00045\u0019T\"\u0019}X^\"De\\@z";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u0002g\u001eaMX+(wM\\48kX]z";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    str = "\u0002g\u000eaNW+\u0005o]\u007f.\u0006k\u0017\\?\u0003}MJxW";
                    obj = 70;
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    strArr2 = strArr3;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019]2\u0018gW^g\u0007k]P&Jj\\Z5\u0013~MP(\u0004.]L\"JzV\u0019)\u001fbU\u0019\u0014\"O\u0014\u000br\\.]P \u000f}M\u0002g\u0007kJJ&\rk\u0017R\"\u00133";
                    obj = 71;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "\u0002g\u0007k]P&9gC\\z";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f._P+\u000f.VL3\u001a{M\u00194\u001e|\\X*JjLK.\u0004i\u0019T\"\u000egX\u0019#\u000fmK@7\u001egVW|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f._P+\u000f.VL3\u001a{M\u00194\u001e|\\X*JjLK.\u0004i\u0019T\"\u000egX\u0019#\u000fmK@7\u001egVW|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmXU$\u001fbXM\"JfXJ/Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f._P+\u000f.VL3\u001a{M\u00194\u001e|\\X*JjLK.\u0004i\u0019T\"\u000egX\u0019#\u000fmK@7\u001egVW|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0002g\toUZ2\u0006oM\\#\"oJQz";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019]2\u0018gW^g\u0007k]P&Jj\\Z5\u0013~MP(\u00045\u0019T\"\u0019}X^\"De\\@z";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PT&\rk\u0019Z.\u001af\\Kg\u0003`IL3J}MK\"\u000bc\u0019]2\u0018gW^g\u0007k]P&Jj\\Z5\u0013~MP(\u00045\u0019T\"\u0019}X^\"De\\@z";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019]2\u0018gW^g\u0007k]P&Jj\\Z5\u0013~MP(\u0004.]L\"JzV\u00197\u0006oPW3\u000fvM\u0019/\u000b}Q\u0019*\u0003}TX3\tf\u0002\u0019*\u000f}JX \u000f R\\>W";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019]2\u0018gW^g\u0007k]P&Jj\\Z5\u0013~MP(\u0004.]L\"JzV\u0019*\u0003}JP)\r.J\\$\u001f|PM>JoU^(\u0018gMQ*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "t\n9.IV4\u001e.\\A\"\t{M\\|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0017$\u000e`\u0017N/\u000bzJX7\u001a W\\3";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u00194\u001eoML4W";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "\u00192\u0018b\u0004";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019]2\u000f.MVg\u0005{MI2\u001e.JM5\u000foT\u0019!\u000bgUL5\u000f.VM/\u000f|\u0019M/\u000b`\u0019j\u0003JmXK#J}MX3\u000f5\u0019T\"\u0019}X^\"De\\@z";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u00192\u0018b\u0004";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "T\"\u000egX](\u001d`UV&\u000e!WV3\u0003h@L4\u000f|\u0016W(\u001exPJ.\bb\\\u00164\u0001gI";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmVI>JhPU\"JzV\u0019#\u001f~UP$\u000bz\\\u0019#\u0005yWU(\u000bj\u0002\u0019(\u0018g^P)\u000bbt\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "\u0019#\u001f~UP$\u000bz\\t\"\u0019}X^\"De\\@z";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "t\n9.]V0\u0004bVX#JcPJ4\u0003`^\u0019#\u001f~UP$\u000bz\\\u0019#\u0005yWU(\u000bjJ\u0019+\u0003}M";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "N.\u000ezQ";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "X7\u001akW].\u0004i\u0019N.\u000ezQ\u0019&\u0004j\u0019Q\"\u0003iQMg\u001ea\u0019T\"\u000egX\u00193\u0018oWJ$\u0005j\\\u00192\u0018b\u0002\u00190\u0003jMQz";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "N.\u0004jVN";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "\u0019/\u000fg^Q3W";
                    obj = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "Q\"\u0003iQM";
                    obj = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "\u0019!\u0003b\\\u0004";
                    obj = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "\u0002g\u0019kKO\"\u0018HPU\"W";
                    obj = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019V)JzQ\\g\boZR2\u001a.QV4\u001e`XT\"Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = arj.Theme_radioButtonStyle;
                    i = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    str = "t\n9.pv\u0002\u0012m\\I3\u0003aW\u0019#\u001f|PW JkAP4\u001egW^g\fgU\\g\taI@|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 106;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "t\n9.]V0\u0004bVX#J|\\M5\u0013gW^g\u001dgMQg\u0004kN\u0019\u00128B\u0002\u0019*\u000f}JX \u000f R\\>W";
                    obj = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "\u00192\u0018b\u0004";
                    obj = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "t\n9._X.\u0006k]\u00193\u0005.]\\+\u000fz\\\u0019#\u0005yWU(\u000bj\u0019_.\u0006k\u0019X!\u001ekK\u0019!\u000bgUL5\u000f5\u0019T\"\u0019}X^\"De\\@z";
                    obj = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "\u0010kJ~KV%\u000blU@g\u001ef\\\u0019!\u0003b\\\u0019/\u000b}\u0019[\"\u000f`\u0019K\"\u001abXZ\"\u000e";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "M5\u000b`JZ(\u000ek\u0019P)\taTP)\r.x}\u00139._X.\u0006k]";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "\u0019!\u0003b\\\u0004";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "t\n9._X.\u0006k]\u00193\u0005.]\\+\u000fz\\\u00194\u000f|O\\5JhPU\"Jo_M\"\u0018._X.\u0006{K\\|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = "\u0017*^o";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "M5\u000b`JZ(\u000ek\u0019P)\taTP)\r.x}\u00139._X.\u0006k]";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = "t\n9._P+\u000f.\\A.\u0019zJ\u0019!\u0005|\u0019Q&\u0019f\u0015\u0019%\u001fz\u0019\\?\u0003}MP)\r._P+\u000f.QX4\u0002.\u0011";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = "T*\u0019 NQ&\u001e}XI7D`\\M";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = "\u0019/\u000b}Q\u0004";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "\u0019!\u0003b\\\u0004";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "\u0019/\u000b}Q\u0004";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019]2\u000f.MVg\u000fvIP5\u000bzPV)Ja_\u0019*\u000fjPX|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "\u0010g\u000ea\\Jg\u0004aM\u0019*\u000bzZQg\u001ea\u0019J3\u0005|\\]g\u001coUL\"J&";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "X2\u000egV\u0016*\u001a:";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "t\n9._P+\u000f.\\A.\u0019zJ\u0019!\u0005|\u0019Q&\u0019f\u0002\u0019*\u000f}JX \u000f R\\>W";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = "q*\u000bmjq\u0006X;\u000f";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = "q*\u000bmjq\u0006X;\u000f";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "X7\u001abPZ&\u001egVWh\u001aj_";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "\u007f&\u0003b\\]g\u001ea\u0019I&\u0018}\\\u0019#\u0005mLT\"\u0004z";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = "Z/\u000fmR\u0019(\u0004.]V0\u0004bVX#";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = "\u007f&\u0003b\\]g\u001ea\u0019I&\u0018}\\\u0019#\u0005mLT\"\u0004z";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = "t\"\u000egX}(\u001d`UV&\u000e.ZQ\"\tejL4\u001agZP(\u001f}zV)\u001ekWMkJ{W\\?\u001akZM\"\u000e._V5\u0007oM\u0004";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = "t\"\u000egX}(\u001d`UV&\u000e!JL4\u001agZP(\u001f}\u0019O.\u000ekV\u0016&\u001fjPVg\faLW#F._P+\u000f.]\\+\u000fz\\]";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = "t\"\u000egX}(\u001d`UV&\u000e!JL4\u001agZP(\u001f}\u0019O.\u000ekV\u00165\u000f~XP5\u000fj\u0019_.\u0006k\u0019T(\u001ck]\u00193\u0005.]V0\u0004bVX#JhPU\"JbVZ&\u001egVW";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "\u00173\u0007~";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "X7\u001a!]V0\u0004bVX#\u0007k]P&E`Vf2\u0018b";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "\u0017\"\u0004m\u0017M*\u001a";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = "aj=O\u0014t\n9#k\\3\u0018w";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019N.\u001ef\u0019p\b/vZ\\7\u001egVWg\u001dfPU\"J|\\M5\u0003kOP)\r.K\\4\u001aaWJ\"JmV]\"Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    i = 145;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019]2\u000f.MVg\u0007kJJ&\rk\u0019X+\u0006aN\\#JgWM(JjVN)\u0006aX]g\u000f`ZK>\u001az\\]g\u001dgMQ(\u001fz\u0019J2\fhPZ.\u000f`M\u0019.\u0004hVK*\u000bzPV)JzV\u0019$\u0005cIL3\u000f.X\u0019#\u0005yWU(\u000bj\u0019_.\u0006k\u0002\u0019*\u000f}JX \u000f R\\>W";
                    obj = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i] = str;
                    i = 146;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i] = str;
                    i = 147;
                    str = "t\n9.]V0\u0004bVX#J~XK4\u000f.V_g)aWM\"\u0004z\u0014k&\u0004i\\\u00195\u000f}IV)\u0019k\u0019Q\"\u000bj\\Kg\foPU\"\u000e5\u0019T\"\u0019}X^\"De\\@z";
                    obj = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i] = str;
                    i = 148;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JaI\\)J{KUg\taWW\"\tzPV)JgWI2\u001e.JM5\u000foT\u0002g\u0007kJJ&\rk\u0017R\"\u00133";
                    obj = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i] = str;
                    i = 149;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i] = str;
                    i = 150;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i] = str;
                    i = 151;
                    str = "\u0013h";
                    obj = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i] = str;
                    i = 152;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i] = str;
                    i = 153;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i] = str;
                    i = 154;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i] = str;
                    i = 155;
                    str = "\u0002g\u0019kKO\"\u0018HPU\"W";
                    obj = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i] = str;
                    i = 156;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i] = str;
                    i = 157;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i] = str;
                    i = 158;
                    str = "l4\u000f|\u0014x \u000f`M";
                    obj = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i] = str;
                    i = 159;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i] = str;
                    i = 160;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i] = str;
                    i = 161;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i] = str;
                    i = 162;
                    str = "k&\u0004i\\";
                    obj = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i] = str;
                    i = 163;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i] = str;
                    i = 164;
                    str = "P#\u000f`MP3\u0013";
                    obj = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i] = str;
                    i = 165;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0002\u0019*\u000f}JX \u000f R\\>W";
                    obj = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i] = str;
                    i = 166;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i] = str;
                    i = 167;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i] = str;
                    i = 168;
                    str = "\u0002g\u0006kW^3\u00023";
                    obj = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i] = str;
                    i = 169;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i] = str;
                    i = 170;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i] = str;
                    i = 171;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i] = str;
                    i = 172;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i] = str;
                    i = 173;
                    str = "\u0002g\u000e|N\u0004";
                    obj = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i] = str;
                    i = 174;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i] = str;
                    i = 175;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019N.\u001ef\u0019p\b/vZ\\7\u001egVW|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i] = str;
                    i = 176;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i] = str;
                    i = 177;
                    str = "t\n9.]V0\u0004bVX#J}\\W#\u0003`^\u00195\u000f}LT\"Jf\\X#\u000f|\u0002\u0019*\u000f}JX \u000f R\\>W";
                    obj = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i] = str;
                    i = 178;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JaI\\)JaLM7\u001fz\u0019_.\u0006k\u0002\u0019*\u000f}JX \u000f R\\>W";
                    obj = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i] = str;
                    i = 179;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i] = str;
                    i = 180;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i] = str;
                    i = 181;
                    str = "\u0002g\u0018kJI(\u0004}\\z(\u0004z\\W38oW^\"W";
                    obj = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i] = str;
                    i = 182;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i] = str;
                    i = 183;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 182;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i] = str;
                    i = 184;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i] = str;
                    i = 185;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 184;
                    strArr2 = strArr3;
                    break;
                case 184:
                    strArr2[i] = str;
                    i = 186;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 185;
                    strArr2 = strArr3;
                    break;
                case 185:
                    strArr2[i] = str;
                    i = 187;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 186;
                    strArr2 = strArr3;
                    break;
                case 186:
                    strArr2[i] = str;
                    i = 188;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 187;
                    strArr2 = strArr3;
                    break;
                case 187:
                    strArr2[i] = str;
                    i = 189;
                    str = "z(\u0004z\\W3G\\XW \u000f";
                    obj = 188;
                    strArr2 = strArr3;
                    break;
                case 188:
                    strArr2[i] = str;
                    i = 190;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 189;
                    strArr2 = strArr3;
                    break;
                case 189:
                    strArr2[i] = str;
                    i = 191;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 190;
                    strArr2 = strArr3;
                    break;
                case 190:
                    strArr2[i] = str;
                    i = 192;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 191;
                    strArr2 = strArr3;
                    break;
                case 191:
                    strArr2[i] = str;
                    i = 193;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 192;
                    strArr2 = strArr3;
                    break;
                case 192:
                    strArr2[i] = str;
                    i = 194;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 193;
                    strArr2 = strArr3;
                    break;
                case 193:
                    strArr2[i] = str;
                    i = 195;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 194;
                    strArr2 = strArr3;
                    break;
                case 194:
                    strArr2[i] = str;
                    i = 196;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 195;
                    strArr2 = strArr3;
                    break;
                case 195:
                    strArr2[i] = str;
                    i = 197;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 196;
                    strArr2 = strArr3;
                    break;
                case 196:
                    strArr2[i] = str;
                    i = 198;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 197;
                    strArr2 = strArr3;
                    break;
                case 197:
                    strArr2[i] = str;
                    i = 199;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 198;
                    strArr2 = strArr3;
                    break;
                case 198:
                    strArr2[i] = str;
                    i = 200;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 199;
                    strArr2 = strArr3;
                    break;
                case 199:
                    strArr2[i] = str;
                    i = 201;
                    str = "[>\u001ekJ\u0004";
                    obj = 200;
                    strArr2 = strArr3;
                    break;
                case 200:
                    strArr2[i] = str;
                    i = 202;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 201;
                    strArr2 = strArr3;
                    break;
                case 201:
                    strArr2[i] = str;
                    i = 203;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JaI\\)JmVW)\u000fmMP(\u00045\u0019T\"\u0019}X^\"De\\@z";
                    obj = 202;
                    strArr2 = strArr3;
                    break;
                case 202:
                    strArr2[i] = str;
                    i = 204;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 203;
                    strArr2 = strArr3;
                    break;
                case 203:
                    strArr2[i] = str;
                    i = 205;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 204;
                    strArr2 = strArr3;
                    break;
                case 204:
                    strArr2[i] = str;
                    i = 206;
                    str = "\u0002g\u000eaNW+\u0005o]\u007f.\u0006k\u0004";
                    obj = 205;
                    strArr2 = strArr3;
                    break;
                case 205:
                    strArr2[i] = str;
                    i = 207;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 206;
                    strArr2 = strArr3;
                    break;
                case 206:
                    strArr2[i] = str;
                    i = 208;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 207;
                    strArr2 = strArr3;
                    break;
                case 207:
                    strArr2[i] = str;
                    i = 209;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 208;
                    strArr2 = strArr3;
                    break;
                case 208:
                    strArr2[i] = str;
                    i = 210;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 209;
                    strArr2 = strArr3;
                    break;
                case 209:
                    strArr2[i] = str;
                    i = 211;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 210;
                    strArr2 = strArr3;
                    break;
                case 210:
                    strArr2[i] = str;
                    i = 212;
                    str = "\u00192\u0018b\u0004";
                    obj = 211;
                    strArr2 = strArr3;
                    break;
                case 211:
                    strArr2[i] = str;
                    i = 213;
                    str = "x$\tkIMj/`ZV#\u0003`^";
                    obj = 212;
                    strArr2 = strArr3;
                    break;
                case 212:
                    strArr2[i] = str;
                    i = 214;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 213;
                    strArr2 = strArr3;
                    break;
                case 213:
                    strArr2[i] = str;
                    i = 215;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 214;
                    strArr2 = strArr3;
                    break;
                case 214:
                    strArr2[i] = str;
                    i = 216;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 215;
                    strArr2 = strArr3;
                    break;
                case 215:
                    strArr2[i] = str;
                    i = 217;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 216;
                    strArr2 = strArr3;
                    break;
                case 216:
                    strArr2[i] = str;
                    i = 218;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 217;
                    strArr2 = strArr3;
                    break;
                case 217:
                    strArr2[i] = str;
                    i = 219;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 218;
                    strArr2 = strArr3;
                    break;
                case 218:
                    strArr2[i] = str;
                    i = 220;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 219;
                    strArr2 = strArr3;
                    break;
                case 219:
                    strArr2[i] = str;
                    i = 221;
                    str = "\u0002g\u000eaNW+\u0005o]\u007f(\u0006j\\Kz";
                    obj = 220;
                    strArr2 = strArr3;
                    break;
                case 220:
                    strArr2[i] = str;
                    i = 222;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 221;
                    strArr2 = strArr3;
                    break;
                case 221:
                    strArr2[i] = str;
                    i = 223;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 222;
                    strArr2 = strArr3;
                    break;
                case 222:
                    strArr2[i] = str;
                    i = 224;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 223;
                    strArr2 = strArr3;
                    break;
                case 223:
                    strArr2[i] = str;
                    i = 225;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 224;
                    strArr2 = strArr3;
                    break;
                case 224:
                    strArr2[i] = str;
                    i = 226;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 225;
                    strArr2 = strArr3;
                    break;
                case 225:
                    strArr2[i] = str;
                    i = 227;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 226;
                    strArr2 = strArr3;
                    break;
                case 226:
                    strArr2[i] = str;
                    i = 228;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019]2\u000f.MVg\u0003`JL!\fgZP\"\u0004z\u0019J7\u000bm\\\u0002g\u0007kJJ&\rk\u0017R\"\u00133";
                    obj = 227;
                    strArr2 = strArr3;
                    break;
                case 227:
                    strArr2[i] = str;
                    i = 229;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 228;
                    strArr2 = strArr3;
                    break;
                case 228:
                    strArr2[i] = str;
                    i = 230;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 229;
                    strArr2 = strArr3;
                    break;
                case 229:
                    strArr2[i] = str;
                    i = 231;
                    str = "\u00195\u000f}IV)\u0019kzV#\u000f3";
                    obj = 230;
                    strArr2 = strArr3;
                    break;
                case 230:
                    strArr2[i] = str;
                    i = 232;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 231;
                    strArr2 = strArr3;
                    break;
                case 231:
                    strArr2[i] = str;
                    i = 233;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.PW7\u001fz\u0019J3\u0018kXT|Jc\\J4\u000bi\\\u0017,\u000fw\u0004";
                    obj = 232;
                    strArr2 = strArr3;
                    break;
                case 232:
                    strArr2[i] = str;
                    i = 234;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 233;
                    strArr2 = strArr3;
                    break;
                case 233:
                    strArr2[i] = str;
                    i = 235;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JaI\\)JfMM7\u0019.LK+JmVW)\u000fmMP(\u00045\u0019T\"\u0019}X^\"De\\@z";
                    obj = 234;
                    strArr2 = strArr3;
                    break;
                case 234:
                    strArr2[i] = str;
                    i = 236;
                    str = "t\n9.]V0\u0004bVX#JhXP+\u000fj\u0019M(JmUV4\u000f.VL3\u001a{M\u00194\u001e|\\X*Q.T\\4\u0019o^\\i\u0001k@\u0004";
                    obj = 235;
                    strArr2 = strArr3;
                    break;
                case 235:
                    strArr2[i] = str;
                    i = 237;
                    str = "\u0002g\u001f|U\u0004";
                    obj = 236;
                    strArr2 = strArr3;
                    break;
                case 236:
                    strArr2[i] = str;
                    z = strArr3;
                    e = new HashMap();
                    i = new HashMap();
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "t\n9.T\\#\u0003o\u0019](\u001d`UV&\u000e.PW.\u001egXU.\u0010k]\u0002g\u0007kJJ&\rk\u0017R\"\u00133";
                    obj = null;
                    break;
            }
        }
    }

    @NonNull
    private static ta a(@NonNull co coVar, @NonNull File file, @NonNull File file2, @NonNull URL url, long j, @NonNull m2 m2Var) {
        zf zfVar;
        Throwable e;
        boolean z = DialogToastActivity.f;
        MediaData mediaData = (MediaData) coVar.Q;
        String b = ag.b(file);
        if (b == null) {
            try {
                Log.w(z[78] + coVar.k + z[65] + a(url) + z[50] + file2.getAbsolutePath() + z[71] + file2.exists());
                file2.delete();
                return new ta(aqs.FAILED_GENERIC, null, true, j);
            } catch (IOException e2) {
                throw e2;
            }
        }
        try {
            if (b.equals(m2Var.c())) {
                try {
                    if (file.equals(file2)) {
                        return new ta(aqs.SUCCESS, m2Var.b(), true, j);
                    }
                    FileOutputStream fileOutputStream;
                    ta taVar;
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            zfVar = new zf(new FileInputStream(file), new vq(mediaData.cipherKey, mediaData.hmacKey, mediaData.iv, mediaData.refKey), file.length());
                        } catch (IOException e3) {
                            e = e3;
                            zfVar = null;
                            try {
                                Log.c(z[83] + coVar.k + z[66] + a(url), e);
                                taVar = new ta(aqs.FAILED_GENERIC, null, true, j);
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable e4) {
                                        Log.c(z[74] + coVar.k + z[59] + a(url), e4);
                                    } catch (NoSuchAlgorithmException e5) {
                                        throw e5;
                                    }
                                }
                                if (zfVar != null) {
                                    return taVar;
                                }
                                try {
                                    zfVar.close();
                                    return taVar;
                                } catch (Throwable e42) {
                                    Log.c(z[84] + coVar.k + z[77] + a(url), e42);
                                    return taVar;
                                } catch (NoSuchAlgorithmException e52) {
                                    throw e52;
                                }
                            } catch (Throwable th) {
                                e = th;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable e422) {
                                        Log.c(z[76] + coVar.k + z[85] + a(url), e422);
                                    } catch (NoSuchAlgorithmException e522) {
                                        throw e522;
                                    }
                                }
                                if (zfVar != null) {
                                    try {
                                        zfVar.close();
                                    } catch (Throwable e4222) {
                                        Log.c(z[57] + coVar.k + z[49] + a(url), e4222);
                                    } catch (NoSuchAlgorithmException e5222) {
                                        throw e5222;
                                    }
                                }
                                throw e;
                            }
                        } catch (NoSuchAlgorithmException e6) {
                            e = e6;
                            zfVar = null;
                            Log.c(z[87] + coVar.k + z[75] + a(url), e);
                            taVar = new ta(aqs.FAILED_GENERIC, null, true, j);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable e42222) {
                                    Log.c(z[80] + coVar.k + z[60] + a(url), e42222);
                                } catch (NoSuchAlgorithmException e52222) {
                                    throw e52222;
                                }
                            }
                            if (zfVar == null) {
                                return taVar;
                            }
                            try {
                                zfVar.close();
                                return taVar;
                            } catch (Throwable e422222) {
                                Log.c(z[55] + coVar.k + z[64] + a(url), e422222);
                                return taVar;
                            } catch (NoSuchAlgorithmException e522222) {
                                throw e522222;
                            }
                        } catch (Throwable th2) {
                            e = th2;
                            zfVar = null;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (zfVar != null) {
                                zfVar.close();
                            }
                            throw e;
                        }
                        try {
                            MessageDigest instance = MessageDigest.getInstance(z[51]);
                            if (instance == null) {
                                Log.w(z[72] + coVar.k + z[82] + a(url));
                                taVar = new ta(aqs.FAILED_GENERIC, null, true, j);
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable e4222222) {
                                        Log.c(z[48] + coVar.k + z[79] + a(url), e4222222);
                                    } catch (NoSuchAlgorithmException e5222222) {
                                        throw e5222222;
                                    }
                                }
                                if (zfVar == null) {
                                    return taVar;
                                }
                                try {
                                    zfVar.close();
                                    return taVar;
                                } catch (Throwable e42222222) {
                                    Log.c(z[69] + coVar.k + z[54] + a(url), e42222222);
                                    return taVar;
                                } catch (NoSuchAlgorithmException e52222222) {
                                    throw e52222222;
                                }
                            }
                            byte[] bArr = new byte[8192];
                            long j2 = 0;
                            do {
                                int read = zfVar.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                instance.update(bArr, 0, read);
                                fileOutputStream.write(bArr, 0, read);
                                j2 += (long) read;
                            } while (!z);
                            byte[] digest = instance.digest();
                            if (!Arrays.equals(digest, Base64.decode(coVar.o, 0))) {
                                Log.w(z[86] + coVar.k + z[67] + a(url) + z[52] + coVar.o + z[81] + Base64.encodeToString(digest, 2) + z[70] + j2 + z[73] + coVar.z);
                                coVar.o = Base64.encodeToString(digest, 2);
                            }
                            fileOutputStream.close();
                            fileOutputStream = null;
                            file.delete();
                            a(coVar, url, mediaData.refKey);
                            taVar = new ta(aqs.SUCCESS, a(coVar.n), true, j);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable e422222222) {
                                    Log.c(z[62] + coVar.k + z[88] + a(url), e422222222);
                                } catch (NoSuchAlgorithmException e522222222) {
                                    throw e522222222;
                                }
                            }
                            if (zfVar == null) {
                                return taVar;
                            }
                            try {
                                zfVar.close();
                                return taVar;
                            } catch (Throwable e4222222222) {
                                Log.c(z[58] + coVar.k + z[63] + a(url), e4222222222);
                                return taVar;
                            } catch (NoSuchAlgorithmException e5222222222) {
                                throw e5222222222;
                            }
                        } catch (IOException e22) {
                            throw e22;
                        } catch (NoSuchAlgorithmException e7) {
                            e = e7;
                            Log.c(z[87] + coVar.k + z[75] + a(url), e);
                            taVar = new ta(aqs.FAILED_GENERIC, null, true, j);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (zfVar == null) {
                                return taVar;
                            }
                            zfVar.close();
                            return taVar;
                        } catch (IOException e8) {
                            e = e8;
                        }
                    } catch (IOException e9) {
                        e = e9;
                        zfVar = null;
                        fileOutputStream = null;
                        Log.c(z[83] + coVar.k + z[66] + a(url), e);
                        taVar = new ta(aqs.FAILED_GENERIC, null, true, j);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (zfVar != null) {
                            return taVar;
                        }
                        zfVar.close();
                        return taVar;
                    } catch (NoSuchAlgorithmException e10) {
                        e = e10;
                        zfVar = null;
                        fileOutputStream = null;
                        Log.c(z[87] + coVar.k + z[75] + a(url), e);
                        taVar = new ta(aqs.FAILED_GENERIC, null, true, j);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (zfVar == null) {
                            return taVar;
                        }
                        zfVar.close();
                        return taVar;
                    } catch (Throwable th3) {
                        e = th3;
                        zfVar = null;
                        fileOutputStream = null;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (zfVar != null) {
                            zfVar.close();
                        }
                        throw e;
                    }
                } catch (IOException e222) {
                    throw e222;
                }
            }
            Log.w(z[68] + coVar.k + z[56] + a(url) + z[61] + m2Var.c() + z[53] + b);
            return new ta(aqs.FAILED_HASH_MISMATCH, null, true, j);
        } catch (IOException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.ta r9) {
        /*
        r8 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.d;
        r0 = (com.whatsapp.by) r0;
        r1 = com.whatsapp.App.an();	 Catch:{ IllegalStateException -> 0x0016 }
        if (r0 == r1) goto L_0x0018;
    L_0x000c:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0016 }
        r1 = 95;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0016 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0016 }
    L_0x0015:
        return;
    L_0x0016:
        r0 = move-exception;
        throw r0;
    L_0x0018:
        r1 = r9.d;	 Catch:{ IllegalStateException -> 0x00ff }
        r1 = r1.isTransientError;	 Catch:{ IllegalStateException -> 0x00ff }
        if (r1 == 0) goto L_0x002c;
    L_0x001e:
        r1 = 2131231076; // 0x7f080164 float:1.8078223E38 double:1.052968058E-314;
        r3 = 2131232169; // 0x7f0805a9 float:1.808044E38 double:1.052968598E-314;
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ IllegalStateException -> 0x0101 }
        r0.a(r1, r3, r4);	 Catch:{ IllegalStateException -> 0x0101 }
        if (r2 == 0) goto L_0x0015;
    L_0x002c:
        r1 = r9.d;	 Catch:{ IllegalStateException -> 0x0103 }
        r3 = com.whatsapp.aqs.FAILED_OUTPUT_STREAM;	 Catch:{ IllegalStateException -> 0x0103 }
        if (r1 != r3) goto L_0x007a;
    L_0x0032:
        r1 = r8.c;	 Catch:{ IllegalStateException -> 0x0105 }
        r1 = com.whatsapp.App.a(r1);	 Catch:{ IllegalStateException -> 0x0105 }
        if (r1 == 0) goto L_0x0015;
    L_0x003a:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0107 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0107 }
        r4 = 93;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = r8.a;	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = r3.k;	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0107 }
        r4 = 94;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = r8.f;	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = a(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0107 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = 2131231076; // 0x7f080164 float:1.8078223E38 double:1.052968058E-314;
        r3 = 2131232169; // 0x7f0805a9 float:1.808044E38 double:1.052968598E-314;
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ IllegalStateException -> 0x0107 }
        r0.a(r1, r3, r4);	 Catch:{ IllegalStateException -> 0x0107 }
        if (r2 == 0) goto L_0x0015;
    L_0x007a:
        r1 = r9.d;	 Catch:{ IllegalStateException -> 0x0109 }
        r3 = com.whatsapp.aqs.FAILED_INSUFFICIENT_SPACE;	 Catch:{ IllegalStateException -> 0x0109 }
        if (r1 != r3) goto L_0x0094;
    L_0x0080:
        r3 = 2131231076; // 0x7f080164 float:1.8078223E38 double:1.052968058E-314;
        r1 = com.whatsapp.App.V();	 Catch:{ IllegalStateException -> 0x010b }
        if (r1 == 0) goto L_0x010d;
    L_0x0089:
        r1 = 2131231377; // 0x7f080291 float:1.8078833E38 double:1.0529682067E-314;
    L_0x008c:
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ IllegalStateException -> 0x0112 }
        r0.a(r3, r1, r4);	 Catch:{ IllegalStateException -> 0x0112 }
        if (r2 == 0) goto L_0x0015;
    L_0x0094:
        r1 = r9.d;	 Catch:{ IllegalStateException -> 0x0114 }
        r3 = com.whatsapp.aqs.FAILED_TOO_OLD;	 Catch:{ IllegalStateException -> 0x0114 }
        if (r1 != r3) goto L_0x00d5;
    L_0x009a:
        r1 = r8.a;	 Catch:{ IllegalStateException -> 0x0116 }
        r1 = r1.k;	 Catch:{ IllegalStateException -> 0x0116 }
        r1 = r1.c;	 Catch:{ IllegalStateException -> 0x0116 }
        r1 = com.whatsapp.qm.i(r1);	 Catch:{ IllegalStateException -> 0x0116 }
        if (r1 == 0) goto L_0x0118;
    L_0x00a6:
        r1 = r8.a;	 Catch:{ IllegalStateException -> 0x0116 }
        r1 = r1.t;	 Catch:{ IllegalStateException -> 0x0116 }
    L_0x00aa:
        if (r1 == 0) goto L_0x00c7;
    L_0x00ac:
        r1 = com.whatsapp.qa.d(r1);
        r3 = 2131231076; // 0x7f080164 float:1.8078223E38 double:1.052968058E-314;
        r4 = 2131232152; // 0x7f080598 float:1.8080405E38 double:1.0529685896E-314;
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ IllegalStateException -> 0x011f }
        r6 = 0;
        r7 = r8.d;	 Catch:{ IllegalStateException -> 0x011f }
        r1 = r1.a(r7);	 Catch:{ IllegalStateException -> 0x011f }
        r5[r6] = r1;	 Catch:{ IllegalStateException -> 0x011f }
        r0.a(r3, r4, r5);	 Catch:{ IllegalStateException -> 0x011f }
        if (r2 == 0) goto L_0x00d3;
    L_0x00c7:
        r1 = 2131231076; // 0x7f080164 float:1.8078223E38 double:1.052968058E-314;
        r3 = 2131231382; // 0x7f080296 float:1.8078843E38 double:1.052968209E-314;
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ IllegalStateException -> 0x011f }
        r0.a(r1, r3, r4);	 Catch:{ IllegalStateException -> 0x011f }
    L_0x00d3:
        if (r2 == 0) goto L_0x0015;
    L_0x00d5:
        r1 = r9.d;	 Catch:{ IllegalStateException -> 0x0121 }
        r3 = com.whatsapp.aqs.FAILED_BAD_MEDIA;	 Catch:{ IllegalStateException -> 0x0121 }
        if (r1 != r3) goto L_0x00e9;
    L_0x00db:
        r1 = 2131231076; // 0x7f080164 float:1.8078223E38 double:1.052968058E-314;
        r3 = 2131232023; // 0x7f080517 float:1.8080144E38 double:1.052968526E-314;
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ IllegalStateException -> 0x0123 }
        r0.a(r1, r3, r4);	 Catch:{ IllegalStateException -> 0x0123 }
        if (r2 == 0) goto L_0x0015;
    L_0x00e9:
        r1 = r9.d;	 Catch:{ IllegalStateException -> 0x00fd }
        r2 = com.whatsapp.aqs.FAILED_INVALID_URL;	 Catch:{ IllegalStateException -> 0x00fd }
        if (r1 != r2) goto L_0x0015;
    L_0x00ef:
        r1 = 2131231076; // 0x7f080164 float:1.8078223E38 double:1.052968058E-314;
        r2 = 2131231382; // 0x7f080296 float:1.8078843E38 double:1.052968209E-314;
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ IllegalStateException -> 0x00fd }
        r0.a(r1, r2, r3);	 Catch:{ IllegalStateException -> 0x00fd }
        goto L_0x0015;
    L_0x00fd:
        r0 = move-exception;
        throw r0;
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0101 }
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0103 }
    L_0x0103:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0105 }
    L_0x0105:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0107 }
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0109 }
    L_0x0109:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x010b }
    L_0x010b:
        r0 = move-exception;
        throw r0;
    L_0x010d:
        r1 = 2131231378; // 0x7f080292 float:1.8078835E38 double:1.052968207E-314;
        goto L_0x008c;
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0116 }
    L_0x0116:
        r0 = move-exception;
        throw r0;
    L_0x0118:
        r1 = r8.a;
        r1 = r1.k;
        r1 = r1.c;
        goto L_0x00aa;
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0123 }
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00fd }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.a(com.whatsapp.ta):void");
    }

    private static void a(@NonNull co coVar, @NonNull URL url, @NonNull byte[] bArr) {
        Builder buildUpon = Uri.parse(url.toString()).buildUpon();
        String a = a(bArr);
        if (a == null) {
            try {
                Log.w(z[39] + coVar.k + z[16] + url);
                return;
            } catch (MalformedURLException e) {
                throw e;
            }
        }
        buildUpon.appendQueryParameter(z[23], a);
        try {
            URL url2 = new URL(buildUpon.toString());
            Log.i(z[38] + coVar.k + z[28] + url + z[37] + a);
            try {
                URLConnection openConnection = url2.openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod(z[24]);
                    httpsURLConnection.setSSLSocketFactory(com.whatsapp.messaging.at.b());
                    httpsURLConnection.setConnectTimeout(15000);
                    httpsURLConnection.setReadTimeout(30000);
                    httpsURLConnection.setRequestProperty(z[21], vn.a());
                    httpsURLConnection.setRequestProperty(z[20], z[40]);
                    if (!DialogToastActivity.f) {
                        try {
                            int responseCode = httpsURLConnection.getResponseCode();
                            if (responseCode != 200) {
                                Log.w(z[30] + coVar.k + z[36] + url + z[31] + a + z[26] + responseCode);
                            }
                            httpsURLConnection.disconnect();
                            return;
                        } catch (MalformedURLException e2) {
                            throw e2;
                        } catch (Throwable e3) {
                            Log.c(z[19] + coVar.k + z[27] + url + z[22] + a, e3);
                            return;
                        }
                    }
                }
                Log.w(z[18] + coVar.k + z[32] + url + z[25] + a);
            } catch (Throwable e32) {
                Log.c(z[33] + coVar.k + z[34] + url + z[29] + a, e32);
            }
        } catch (Throwable e322) {
            Log.c(z[41] + coVar.k + z[17] + url + z[35] + a, e322);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    private static com.whatsapp.ta a(@android.support.annotation.NonNull com.whatsapp.v r20, @android.support.annotation.NonNull com.whatsapp.protocol.co r21, boolean r22, @android.support.annotation.NonNull java.io.File r23, @android.support.annotation.NonNull java.net.URL r24) {
        /*
        r13 = com.whatsapp.DialogToastActivity.f;
        r0 = r21;
        r2 = r0.Q;
        r2 = (com.whatsapp.MediaData) r2;
        if (r2 == 0) goto L_0x0056;
    L_0x000a:
        r3 = r2.refKey;	 Catch:{ IOException -> 0x0052 }
        if (r3 == 0) goto L_0x0056;
    L_0x000e:
        r3 = 1;
        r4 = r3;
    L_0x0010:
        if (r4 == 0) goto L_0x005b;
    L_0x0012:
        r3 = 1;
        r0 = r21;
        r3 = a(r0, r3);	 Catch:{ IOException -> 0x0059 }
    L_0x0019:
        if (r4 == 0) goto L_0x005e;
    L_0x001b:
        if (r3 != 0) goto L_0x005e;
    L_0x001d:
        r2 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x0050 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0050 }
        r3.<init>();	 Catch:{ IOException -> 0x0050 }
        r4 = z;	 Catch:{ IOException -> 0x0050 }
        r5 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0050 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0050 }
        r0 = r21;
        r4 = r0.k;	 Catch:{ IOException -> 0x0050 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0050 }
        r4 = z;	 Catch:{ IOException -> 0x0050 }
        r5 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0050 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0050 }
        r4 = a(r24);	 Catch:{ IOException -> 0x0050 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0050 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0050 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x0050 }
        throw r2;	 Catch:{ IOException -> 0x0050 }
    L_0x0050:
        r2 = move-exception;
        throw r2;
    L_0x0052:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0054 }
    L_0x0054:
        r2 = move-exception;
        throw r2;
    L_0x0056:
        r3 = 0;
        r4 = r3;
        goto L_0x0010;
    L_0x0059:
        r2 = move-exception;
        throw r2;
    L_0x005b:
        r3 = r23;
        goto L_0x0019;
    L_0x005e:
        r6 = android.os.SystemClock.elapsedRealtime();
        r11 = 0;
        r10 = 0;
        r9 = 0;
        r4 = r24.openConnection();	 Catch:{ IOException -> 0x0240 }
        r5 = r4 instanceof javax.net.ssl.HttpsURLConnection;	 Catch:{ IOException -> 0x0240 }
        if (r5 == 0) goto L_0x018d;
    L_0x006d:
        r0 = r4;
        r0 = (javax.net.ssl.HttpsURLConnection) r0;	 Catch:{ IOException -> 0x0240 }
        r9 = r0;
        r4 = com.whatsapp.messaging.at.b();	 Catch:{ IOException -> 0x02f6 }
        r9.setSSLSocketFactory(r4);	 Catch:{ IOException -> 0x02f6 }
        r4 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        r9.setConnectTimeout(r4);	 Catch:{ IOException -> 0x02f6 }
        r0 = r21;
        r4 = r0.c;	 Catch:{ IOException -> 0x02f6 }
        r5 = 3;
        if (r4 != r5) goto L_0x030b;
    L_0x0084:
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
    L_0x0087:
        r9.setReadTimeout(r4);	 Catch:{ all -> 0x02f8 }
        r4 = z;	 Catch:{ all -> 0x02f8 }
        r5 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x02f8 }
        r5 = com.whatsapp.vn.a();	 Catch:{ all -> 0x02f8 }
        r9.setRequestProperty(r4, r5);	 Catch:{ all -> 0x02f8 }
        r4 = z;	 Catch:{ all -> 0x02f8 }
        r5 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x02f8 }
        r5 = z;	 Catch:{ all -> 0x02f8 }
        r8 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r5 = r5[r8];	 Catch:{ all -> 0x02f8 }
        r9.setRequestProperty(r4, r5);	 Catch:{ all -> 0x02f8 }
        r4 = r3.length();	 Catch:{ all -> 0x02f8 }
        r14 = 0;
        r8 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1));
        if (r8 <= 0) goto L_0x0102;
    L_0x00b0:
        r8 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x030f }
        r8.<init>();	 Catch:{ IOException -> 0x030f }
        r12 = z;	 Catch:{ IOException -> 0x030f }
        r14 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r12 = r12[r14];	 Catch:{ IOException -> 0x030f }
        r8 = r8.append(r12);	 Catch:{ IOException -> 0x030f }
        r0 = r21;
        r12 = r0.k;	 Catch:{ IOException -> 0x030f }
        r8 = r8.append(r12);	 Catch:{ IOException -> 0x030f }
        r12 = z;	 Catch:{ IOException -> 0x030f }
        r14 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r12 = r12[r14];	 Catch:{ IOException -> 0x030f }
        r8 = r8.append(r12);	 Catch:{ IOException -> 0x030f }
        r8 = r8.append(r4);	 Catch:{ IOException -> 0x030f }
        r8 = r8.toString();	 Catch:{ IOException -> 0x030f }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IOException -> 0x030f }
        r8 = z;	 Catch:{ IOException -> 0x030f }
        r12 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r8 = r8[r12];	 Catch:{ IOException -> 0x030f }
        r12 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x030f }
        r12.<init>();	 Catch:{ IOException -> 0x030f }
        r14 = z;	 Catch:{ IOException -> 0x030f }
        r15 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r14 = r14[r15];	 Catch:{ IOException -> 0x030f }
        r12 = r12.append(r14);	 Catch:{ IOException -> 0x030f }
        r12 = r12.append(r4);	 Catch:{ IOException -> 0x030f }
        r14 = 45;
        r12 = r12.append(r14);	 Catch:{ IOException -> 0x030f }
        r12 = r12.toString();	 Catch:{ IOException -> 0x030f }
        r9.setRequestProperty(r8, r12);	 Catch:{ IOException -> 0x030f }
    L_0x0102:
        r8 = r2.failErrorCode;	 Catch:{ all -> 0x02f8 }
        if (r8 < 0) goto L_0x0119;
    L_0x0106:
        r2 = r2.failErrorCode;	 Catch:{ all -> 0x02f8 }
        r2 = com.whatsapp.aqs.fromErrorCode(r2);	 Catch:{ all -> 0x02f8 }
        if (r2 == 0) goto L_0x0119;
    L_0x010e:
        r8 = z;	 Catch:{ IOException -> 0x0311 }
        r12 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r8 = r8[r12];	 Catch:{ IOException -> 0x0311 }
        r2 = r2.name;	 Catch:{ IOException -> 0x0311 }
        r9.setRequestProperty(r8, r2);	 Catch:{ IOException -> 0x0311 }
    L_0x0119:
        r2 = r9.getResponseCode();	 Catch:{ IOException -> 0x0313 }
        r8 = new com.whatsapp.m2;	 Catch:{ all -> 0x02f8 }
        r8.<init>(r9);	 Catch:{ all -> 0x02f8 }
        r8 = r8.a();	 Catch:{ all -> 0x02f8 }
        r12 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 == r12) goto L_0x06d6;
    L_0x012a:
        r12 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        if (r2 == r12) goto L_0x06d6;
    L_0x012e:
        r12 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03df }
        r12.<init>();	 Catch:{ IOException -> 0x03df }
        r13 = z;	 Catch:{ IOException -> 0x03df }
        r14 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r13 = r13[r14];	 Catch:{ IOException -> 0x03df }
        r12 = r12.append(r13);	 Catch:{ IOException -> 0x03df }
        r0 = r21;
        r13 = r0.k;	 Catch:{ IOException -> 0x03df }
        r12 = r12.append(r13);	 Catch:{ IOException -> 0x03df }
        r13 = z;	 Catch:{ IOException -> 0x03df }
        r14 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r13 = r13[r14];	 Catch:{ IOException -> 0x03df }
        r12 = r12.append(r13);	 Catch:{ IOException -> 0x03df }
        r13 = a(r24);	 Catch:{ IOException -> 0x03df }
        r12 = r12.append(r13);	 Catch:{ IOException -> 0x03df }
        r13 = z;	 Catch:{ IOException -> 0x03df }
        r14 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r13 = r13[r14];	 Catch:{ IOException -> 0x03df }
        r12 = r12.append(r13);	 Catch:{ IOException -> 0x03df }
        r12 = r12.append(r2);	 Catch:{ IOException -> 0x03df }
        r12 = r12.toString();	 Catch:{ IOException -> 0x03df }
        com.whatsapp.util.Log.w(r12);	 Catch:{ IOException -> 0x03df }
        r12 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r2 == r12) goto L_0x0174;
    L_0x0170:
        r12 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        if (r2 != r12) goto L_0x044f;
    L_0x0174:
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x02f8 }
        r3 = com.whatsapp.aqs.FAILED_TOO_OLD;	 Catch:{ all -> 0x02f8 }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x02f8 }
        if (r9 == 0) goto L_0x0182;
    L_0x017f:
        r9.disconnect();	 Catch:{ IOException -> 0x03e3 }
    L_0x0182:
        if (r10 == 0) goto L_0x0187;
    L_0x0184:
        r10.close();	 Catch:{ IOException -> 0x03e7, NumberFormatException -> 0x03e5 }
    L_0x0187:
        if (r11 == 0) goto L_0x018c;
    L_0x0189:
        r11.close();	 Catch:{ IOException -> 0x041c, NumberFormatException -> 0x041a }
    L_0x018c:
        return r2;
    L_0x018d:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0240 }
        r2.<init>();	 Catch:{ IOException -> 0x0240 }
        r3 = z;	 Catch:{ IOException -> 0x0240 }
        r4 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0240 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0240 }
        r0 = r21;
        r3 = r0.k;	 Catch:{ IOException -> 0x0240 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0240 }
        r3 = z;	 Catch:{ IOException -> 0x0240 }
        r4 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0240 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0240 }
        r3 = a(r24);	 Catch:{ IOException -> 0x0240 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0240 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0240 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IOException -> 0x0240 }
        r2 = new com.whatsapp.ta;	 Catch:{ IOException -> 0x0240 }
        r3 = com.whatsapp.aqs.FAILED_GENERIC;	 Catch:{ IOException -> 0x0240 }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ IOException -> 0x0240 }
        if (r9 == 0) goto L_0x01cb;
    L_0x01c8:
        r9.disconnect();	 Catch:{ IOException -> 0x0208 }
    L_0x01cb:
        if (r10 == 0) goto L_0x01d0;
    L_0x01cd:
        r10.close();	 Catch:{ IOException -> 0x020c, NumberFormatException -> 0x020a }
    L_0x01d0:
        if (r11 == 0) goto L_0x018c;
    L_0x01d2:
        r11.close();	 Catch:{ IOException -> 0x01d6, NumberFormatException -> 0x023e }
        goto L_0x018c;
    L_0x01d6:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x0208:
        r2 = move-exception;
        throw r2;
    L_0x020a:
        r2 = move-exception;
        throw r2;
    L_0x020c:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x01d0;
    L_0x023e:
        r2 = move-exception;
        throw r2;
    L_0x0240:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02f8 }
        r3.<init>();	 Catch:{ all -> 0x02f8 }
        r4 = z;	 Catch:{ all -> 0x02f8 }
        r5 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r0 = r21;
        r4 = r0.k;	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r4 = z;	 Catch:{ all -> 0x02f8 }
        r5 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r4 = a(r24);	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r3 = r3.toString();	 Catch:{ all -> 0x02f8 }
        com.whatsapp.util.Log.c(r3, r2);	 Catch:{ all -> 0x02f8 }
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x02f8 }
        r3 = com.whatsapp.aqs.FAILED_GENERIC;	 Catch:{ all -> 0x02f8 }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x02f8 }
        if (r9 == 0) goto L_0x027f;
    L_0x027c:
        r9.disconnect();	 Catch:{ IOException -> 0x02be }
    L_0x027f:
        if (r10 == 0) goto L_0x0284;
    L_0x0281:
        r10.close();	 Catch:{ IOException -> 0x02c2, NumberFormatException -> 0x02c0 }
    L_0x0284:
        if (r11 == 0) goto L_0x018c;
    L_0x0286:
        r11.close();	 Catch:{ IOException -> 0x028b, NumberFormatException -> 0x02f4 }
        goto L_0x018c;
    L_0x028b:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x02be:
        r2 = move-exception;
        throw r2;
    L_0x02c0:
        r2 = move-exception;
        throw r2;
    L_0x02c2:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0284;
    L_0x02f4:
        r2 = move-exception;
        throw r2;
    L_0x02f6:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x02f8 }
    L_0x02f8:
        r2 = move-exception;
        r3 = r10;
        r4 = r11;
    L_0x02fb:
        if (r9 == 0) goto L_0x0300;
    L_0x02fd:
        r9.disconnect();	 Catch:{ IOException -> 0x0c60 }
    L_0x0300:
        if (r3 == 0) goto L_0x0305;
    L_0x0302:
        r3.close();	 Catch:{ IOException -> 0x0c64, NumberFormatException -> 0x0c62 }
    L_0x0305:
        if (r4 == 0) goto L_0x030a;
    L_0x0307:
        r4.close();	 Catch:{ IOException -> 0x0c99, NumberFormatException -> 0x0c97 }
    L_0x030a:
        throw r2;
    L_0x030b:
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        goto L_0x0087;
    L_0x030f:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x02f8 }
    L_0x0311:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x02f8 }
    L_0x0313:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02f8 }
        r3.<init>();	 Catch:{ all -> 0x02f8 }
        r4 = z;	 Catch:{ all -> 0x02f8 }
        r5 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r0 = r21;
        r4 = r0.k;	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r4 = z;	 Catch:{ all -> 0x02f8 }
        r5 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r4 = a(r24);	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r3 = r3.toString();	 Catch:{ all -> 0x02f8 }
        com.whatsapp.util.Log.c(r3, r2);	 Catch:{ all -> 0x02f8 }
        r3 = com.whatsapp.aqs.FAILED_GENERIC;	 Catch:{ all -> 0x02f8 }
        r4 = r2 instanceof java.net.UnknownHostException;	 Catch:{ all -> 0x02f8 }
        if (r4 == 0) goto L_0x034e;
    L_0x034a:
        r3 = com.whatsapp.aqs.FAILED_DNS_LOOKUP;	 Catch:{ all -> 0x02f8 }
        if (r13 == 0) goto L_0x0358;
    L_0x034e:
        r4 = r2 instanceof java.net.SocketTimeoutException;	 Catch:{ IOException -> 0x03a3 }
        if (r4 != 0) goto L_0x0356;
    L_0x0352:
        r2 = r2 instanceof java.net.ConnectException;	 Catch:{ IOException -> 0x03a5 }
        if (r2 == 0) goto L_0x0358;
    L_0x0356:
        r3 = com.whatsapp.aqs.FAILED_TIMEOUT;	 Catch:{ all -> 0x02f8 }
    L_0x0358:
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x02f8 }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x02f8 }
        if (r9 == 0) goto L_0x0364;
    L_0x0361:
        r9.disconnect();	 Catch:{ IOException -> 0x03a7 }
    L_0x0364:
        if (r10 == 0) goto L_0x0369;
    L_0x0366:
        r10.close();	 Catch:{ IOException -> 0x03ab, NumberFormatException -> 0x03a9 }
    L_0x0369:
        if (r11 == 0) goto L_0x018c;
    L_0x036b:
        r11.close();	 Catch:{ IOException -> 0x0370, NumberFormatException -> 0x03dd }
        goto L_0x018c;
    L_0x0370:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x03a3:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x03a5 }
    L_0x03a5:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x02f8 }
    L_0x03a7:
        r2 = move-exception;
        throw r2;
    L_0x03a9:
        r2 = move-exception;
        throw r2;
    L_0x03ab:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0369;
    L_0x03dd:
        r2 = move-exception;
        throw r2;
    L_0x03df:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x03e1 }
    L_0x03e1:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x02f8 }
    L_0x03e3:
        r2 = move-exception;
        throw r2;
    L_0x03e5:
        r2 = move-exception;
        throw r2;
    L_0x03e7:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0187;
    L_0x041a:
        r2 = move-exception;
        throw r2;
    L_0x041c:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x044f:
        r12 = 415; // 0x19f float:5.82E-43 double:2.05E-321;
        if (r2 != r12) goto L_0x04d8;
    L_0x0453:
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x02f8 }
        r3 = com.whatsapp.aqs.FAILED_BAD_MEDIA;	 Catch:{ all -> 0x02f8 }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x02f8 }
        if (r9 == 0) goto L_0x0461;
    L_0x045e:
        r9.disconnect();	 Catch:{ IOException -> 0x04a0 }
    L_0x0461:
        if (r10 == 0) goto L_0x0466;
    L_0x0463:
        r10.close();	 Catch:{ IOException -> 0x04a4, NumberFormatException -> 0x04a2 }
    L_0x0466:
        if (r11 == 0) goto L_0x018c;
    L_0x0468:
        r11.close();	 Catch:{ IOException -> 0x046d, NumberFormatException -> 0x04d6 }
        goto L_0x018c;
    L_0x046d:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x04a0:
        r2 = move-exception;
        throw r2;
    L_0x04a2:
        r2 = move-exception;
        throw r2;
    L_0x04a4:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0466;
    L_0x04d6:
        r2 = move-exception;
        throw r2;
    L_0x04d8:
        r12 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        if (r2 != r12) goto L_0x0651;
    L_0x04dc:
        r2 = z;	 Catch:{ all -> 0x02f8 }
        r12 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r2 = r2[r12];	 Catch:{ all -> 0x02f8 }
        r12 = r9.getHeaderField(r2);	 Catch:{ all -> 0x02f8 }
        r2 = android.text.TextUtils.isEmpty(r12);	 Catch:{ IOException -> 0x0553 }
        if (r2 != 0) goto L_0x05cc;
    L_0x04ec:
        r2 = z;	 Catch:{ IOException -> 0x0553 }
        r13 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r2 = r2[r13];	 Catch:{ IOException -> 0x0553 }
        r2 = r12.startsWith(r2);	 Catch:{ IOException -> 0x0553 }
        if (r2 == 0) goto L_0x05cc;
    L_0x04f8:
        r2 = 2;
        r2 = r12.substring(r2);	 Catch:{ NumberFormatException -> 0x058d }
        r14 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x058d }
        r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x05cc;
    L_0x0505:
        r2 = r21;
        r4 = r23;
        r5 = r24;
        r2 = a(r2, r3, r4, r5, r6, r8);	 Catch:{ NumberFormatException -> 0x058d }
        if (r9 == 0) goto L_0x0514;
    L_0x0511:
        r9.disconnect();	 Catch:{ IOException -> 0x0555 }
    L_0x0514:
        if (r10 == 0) goto L_0x0519;
    L_0x0516:
        r10.close();	 Catch:{ IOException -> 0x0559, NumberFormatException -> 0x0557 }
    L_0x0519:
        if (r11 == 0) goto L_0x018c;
    L_0x051b:
        r11.close();	 Catch:{ IOException -> 0x0520, NumberFormatException -> 0x058b }
        goto L_0x018c;
    L_0x0520:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x0553:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x02f8 }
    L_0x0555:
        r2 = move-exception;
        throw r2;
    L_0x0557:
        r2 = move-exception;
        throw r2;
    L_0x0559:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0519;
    L_0x058b:
        r2 = move-exception;
        throw r2;
    L_0x058d:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02f8 }
        r3.<init>();	 Catch:{ all -> 0x02f8 }
        r4 = z;	 Catch:{ all -> 0x02f8 }
        r5 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r0 = r21;
        r4 = r0.k;	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r4 = z;	 Catch:{ all -> 0x02f8 }
        r5 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r4 = a(r24);	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r4 = z;	 Catch:{ all -> 0x02f8 }
        r5 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r12);	 Catch:{ all -> 0x02f8 }
        r3 = r3.toString();	 Catch:{ all -> 0x02f8 }
        com.whatsapp.util.Log.c(r3, r2);	 Catch:{ all -> 0x02f8 }
    L_0x05cc:
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x02f8 }
        r3 = com.whatsapp.aqs.FAILED_CANNOT_RESUME;	 Catch:{ all -> 0x02f8 }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x02f8 }
        if (r9 == 0) goto L_0x05da;
    L_0x05d7:
        r9.disconnect();	 Catch:{ IOException -> 0x0619 }
    L_0x05da:
        if (r10 == 0) goto L_0x05df;
    L_0x05dc:
        r10.close();	 Catch:{ IOException -> 0x061d, NumberFormatException -> 0x061b }
    L_0x05df:
        if (r11 == 0) goto L_0x018c;
    L_0x05e1:
        r11.close();	 Catch:{ IOException -> 0x05e6, NumberFormatException -> 0x064f }
        goto L_0x018c;
    L_0x05e6:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x0619:
        r2 = move-exception;
        throw r2;
    L_0x061b:
        r2 = move-exception;
        throw r2;
    L_0x061d:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x05df;
    L_0x064f:
        r2 = move-exception;
        throw r2;
    L_0x0651:
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x02f8 }
        r3 = com.whatsapp.aqs.FAILED_GENERIC;	 Catch:{ all -> 0x02f8 }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x02f8 }
        if (r9 == 0) goto L_0x065f;
    L_0x065c:
        r9.disconnect();	 Catch:{ IOException -> 0x069e }
    L_0x065f:
        if (r10 == 0) goto L_0x0664;
    L_0x0661:
        r10.close();	 Catch:{ IOException -> 0x06a2, NumberFormatException -> 0x06a0 }
    L_0x0664:
        if (r11 == 0) goto L_0x018c;
    L_0x0666:
        r11.close();	 Catch:{ IOException -> 0x066b, NumberFormatException -> 0x06d4 }
        goto L_0x018c;
    L_0x066b:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x069e:
        r2 = move-exception;
        throw r2;
    L_0x06a0:
        r2 = move-exception;
        throw r2;
    L_0x06a2:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0664;
    L_0x06d4:
        r2 = move-exception;
        throw r2;
    L_0x06d6:
        r2 = r9.getContentLength();	 Catch:{ all -> 0x02f8 }
        r14 = (long) r2;	 Catch:{ all -> 0x02f8 }
        r14 = r14 + r4;
        r16 = com.whatsapp.App.T();	 Catch:{ all -> 0x02f8 }
        r2 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1));
        if (r2 >= 0) goto L_0x0799;
    L_0x06e4:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02f8 }
        r2.<init>();	 Catch:{ all -> 0x02f8 }
        r3 = z;	 Catch:{ all -> 0x02f8 }
        r4 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r3 = r3[r4];	 Catch:{ all -> 0x02f8 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x02f8 }
        r0 = r21;
        r3 = r0.k;	 Catch:{ all -> 0x02f8 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x02f8 }
        r3 = z;	 Catch:{ all -> 0x02f8 }
        r4 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r3 = r3[r4];	 Catch:{ all -> 0x02f8 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x02f8 }
        r3 = a(r24);	 Catch:{ all -> 0x02f8 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x02f8 }
        r2 = r2.toString();	 Catch:{ all -> 0x02f8 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ all -> 0x02f8 }
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x02f8 }
        r3 = com.whatsapp.aqs.FAILED_INSUFFICIENT_SPACE;	 Catch:{ all -> 0x02f8 }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x02f8 }
        if (r9 == 0) goto L_0x0722;
    L_0x071f:
        r9.disconnect();	 Catch:{ IOException -> 0x0761 }
    L_0x0722:
        if (r10 == 0) goto L_0x0727;
    L_0x0724:
        r10.close();	 Catch:{ IOException -> 0x0765, NumberFormatException -> 0x0763 }
    L_0x0727:
        if (r11 == 0) goto L_0x018c;
    L_0x0729:
        r11.close();	 Catch:{ IOException -> 0x072e, NumberFormatException -> 0x0797 }
        goto L_0x018c;
    L_0x072e:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x0761:
        r2 = move-exception;
        throw r2;
    L_0x0763:
        r2 = move-exception;
        throw r2;
    L_0x0765:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0727;
    L_0x0797:
        r2 = move-exception;
        throw r2;
    L_0x0799:
        if (r22 == 0) goto L_0x07a1;
    L_0x079b:
        r2 = com.whatsapp.App.i(r21);	 Catch:{ IOException -> 0x07f4 }
        if (r2 == 0) goto L_0x07a7;
    L_0x07a1:
        r2 = r20.isCancelled();	 Catch:{ IOException -> 0x07f6 }
        if (r2 == 0) goto L_0x0830;
    L_0x07a7:
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x02f8 }
        r3 = com.whatsapp.aqs.CANCEL;	 Catch:{ all -> 0x02f8 }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x02f8 }
        if (r9 == 0) goto L_0x07b5;
    L_0x07b2:
        r9.disconnect();	 Catch:{ IOException -> 0x07f8 }
    L_0x07b5:
        if (r10 == 0) goto L_0x07ba;
    L_0x07b7:
        r10.close();	 Catch:{ IOException -> 0x07fc, NumberFormatException -> 0x07fa }
    L_0x07ba:
        if (r11 == 0) goto L_0x018c;
    L_0x07bc:
        r11.close();	 Catch:{ IOException -> 0x07c1, NumberFormatException -> 0x082e }
        goto L_0x018c;
    L_0x07c1:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x07f4:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x07f6 }
    L_0x07f6:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x02f8 }
    L_0x07f8:
        r2 = move-exception;
        throw r2;
    L_0x07fa:
        r2 = move-exception;
        throw r2;
    L_0x07fc:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x07ba;
    L_0x082e:
        r2 = move-exception;
        throw r2;
    L_0x0830:
        r12 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x08cd }
        r2 = 1;
        r12.<init>(r3, r2);	 Catch:{ FileNotFoundException -> 0x08cd }
        r16 = 0;
        r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1));
        if (r2 <= 0) goto L_0x0851;
    L_0x083c:
        r2 = 1;
        r2 = new java.lang.Long[r2];	 Catch:{ IOException -> 0x0a0b }
        r11 = 0;
        r16 = 100;
        r16 = r16 * r4;
        r16 = r16 / r14;
        r16 = java.lang.Long.valueOf(r16);	 Catch:{ IOException -> 0x0a0b }
        r2[r11] = r16;	 Catch:{ IOException -> 0x0a0b }
        r0 = r20;
        r0.publishProgress(r2);	 Catch:{ IOException -> 0x0a0b }
    L_0x0851:
        r11 = new com.whatsapp.vf;	 Catch:{ IOException -> 0x0a12 }
        r2 = r9.getInputStream();	 Catch:{ IOException -> 0x0a12 }
        r16 = 0;
        r0 = r16;
        r11.<init>(r2, r0);	 Catch:{ IOException -> 0x0a12 }
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r10 = new byte[r2];	 Catch:{ IOException -> 0x0b71 }
        r2 = 0;
        r0 = r10.length;	 Catch:{ IOException -> 0x0b71 }
        r16 = r0;
        r0 = r16;
        r2 = r11.read(r10, r2, r0);	 Catch:{ IOException -> 0x0b71 }
    L_0x086c:
        if (r2 < 0) goto L_0x0b23;
    L_0x086e:
        r16 = 0;
        r0 = r16;
        r12.write(r10, r0, r2);	 Catch:{ IOException -> 0x0b71 }
        r0 = (long) r2;	 Catch:{ IOException -> 0x0b71 }
        r16 = r0;
        r4 = r4 + r16;
        r2 = r20.isCancelled();	 Catch:{ IOException -> 0x0b71 }
        if (r2 == 0) goto L_0x0b01;
    L_0x0880:
        r2 = new com.whatsapp.ta;	 Catch:{ IOException -> 0x0b71 }
        r3 = com.whatsapp.aqs.CANCEL;	 Catch:{ IOException -> 0x0b71 }
        r4 = 0;
        r5 = 1;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ IOException -> 0x0b71 }
        if (r9 == 0) goto L_0x088e;
    L_0x088b:
        r9.disconnect();	 Catch:{ IOException -> 0x0ac8 }
    L_0x088e:
        if (r11 == 0) goto L_0x0893;
    L_0x0890:
        r11.close();	 Catch:{ IOException -> 0x0acc, NumberFormatException -> 0x0aca }
    L_0x0893:
        if (r12 == 0) goto L_0x018c;
    L_0x0895:
        r12.close();	 Catch:{ IOException -> 0x089a, NumberFormatException -> 0x0aff }
        goto L_0x018c;
    L_0x089a:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x08cd:
        r2 = move-exception;
        r5 = r3.getParentFile();	 Catch:{ all -> 0x02f8 }
        r8 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x09bd }
        r8.<init>();	 Catch:{ IOException -> 0x09bd }
        r4 = r5.isDirectory();	 Catch:{ IOException -> 0x09bd }
        if (r4 == 0) goto L_0x09bf;
    L_0x08dd:
        r4 = "1";
    L_0x08e0:
        r8 = r8.append(r4);	 Catch:{ IOException -> 0x09c4 }
        r4 = r5.canRead();	 Catch:{ IOException -> 0x09c4 }
        if (r4 == 0) goto L_0x09c6;
    L_0x08ea:
        r4 = "1";
    L_0x08ed:
        r8 = r8.append(r4);	 Catch:{ IOException -> 0x09cb }
        r4 = r5.canWrite();	 Catch:{ IOException -> 0x09cb }
        if (r4 == 0) goto L_0x09cd;
    L_0x08f7:
        r4 = "1";
    L_0x08fa:
        r4 = r8.append(r4);	 Catch:{ all -> 0x02f8 }
        r4 = r4.toString();	 Catch:{ all -> 0x02f8 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02f8 }
        r8.<init>();	 Catch:{ all -> 0x02f8 }
        r12 = z;	 Catch:{ all -> 0x02f8 }
        r13 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r12 = r12[r13];	 Catch:{ all -> 0x02f8 }
        r8 = r8.append(r12);	 Catch:{ all -> 0x02f8 }
        r0 = r21;
        r12 = r0.k;	 Catch:{ all -> 0x02f8 }
        r8 = r8.append(r12);	 Catch:{ all -> 0x02f8 }
        r12 = z;	 Catch:{ all -> 0x02f8 }
        r13 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r12 = r12[r13];	 Catch:{ all -> 0x02f8 }
        r8 = r8.append(r12);	 Catch:{ all -> 0x02f8 }
        r12 = a(r24);	 Catch:{ all -> 0x02f8 }
        r8 = r8.append(r12);	 Catch:{ all -> 0x02f8 }
        r12 = z;	 Catch:{ all -> 0x02f8 }
        r13 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r12 = r12[r13];	 Catch:{ all -> 0x02f8 }
        r8 = r8.append(r12);	 Catch:{ all -> 0x02f8 }
        r3 = r8.append(r3);	 Catch:{ all -> 0x02f8 }
        r8 = z;	 Catch:{ all -> 0x02f8 }
        r12 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r8 = r8[r12];	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r8);	 Catch:{ all -> 0x02f8 }
        r0 = r23;
        r3 = r3.append(r0);	 Catch:{ all -> 0x02f8 }
        r8 = z;	 Catch:{ all -> 0x02f8 }
        r12 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r8 = r8[r12];	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r8);	 Catch:{ all -> 0x02f8 }
        r5 = r5.getPath();	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x02f8 }
        r5 = z;	 Catch:{ all -> 0x02f8 }
        r8 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r5 = r5[r8];	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x02f8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02f8 }
        r3 = r3.toString();	 Catch:{ all -> 0x02f8 }
        com.whatsapp.util.Log.c(r3, r2);	 Catch:{ all -> 0x02f8 }
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x02f8 }
        r3 = com.whatsapp.aqs.FAILED_OUTPUT_STREAM;	 Catch:{ all -> 0x02f8 }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x02f8 }
        if (r9 == 0) goto L_0x097e;
    L_0x097b:
        r9.disconnect();	 Catch:{ IOException -> 0x09d2 }
    L_0x097e:
        if (r10 == 0) goto L_0x0983;
    L_0x0980:
        r10.close();	 Catch:{ IOException -> 0x09d6, NumberFormatException -> 0x09d4 }
    L_0x0983:
        if (r11 == 0) goto L_0x018c;
    L_0x0985:
        r11.close();	 Catch:{ IOException -> 0x098a, NumberFormatException -> 0x0a09 }
        goto L_0x018c;
    L_0x098a:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x09bd:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x02f8 }
    L_0x09bf:
        r4 = "0";
        goto L_0x08e0;
    L_0x09c4:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x02f8 }
    L_0x09c6:
        r4 = "0";
        goto L_0x08ed;
    L_0x09cb:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x02f8 }
    L_0x09cd:
        r4 = "0";
        goto L_0x08fa;
    L_0x09d2:
        r2 = move-exception;
        throw r2;
    L_0x09d4:
        r2 = move-exception;
        throw r2;
    L_0x09d6:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0983;
    L_0x0a09:
        r2 = move-exception;
        throw r2;
    L_0x0a0b:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0a0d }
    L_0x0a0d:
        r2 = move-exception;
        r3 = r10;
        r4 = r12;
        goto L_0x02fb;
    L_0x0a12:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0a0d }
        r3.<init>();	 Catch:{ all -> 0x0a0d }
        r4 = z;	 Catch:{ all -> 0x0a0d }
        r5 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x0a0d }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0a0d }
        r0 = r21;
        r4 = r0.k;	 Catch:{ all -> 0x0a0d }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0a0d }
        r4 = z;	 Catch:{ all -> 0x0a0d }
        r5 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0a0d }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0a0d }
        r4 = a(r24);	 Catch:{ all -> 0x0a0d }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0a0d }
        r3 = r3.toString();	 Catch:{ all -> 0x0a0d }
        com.whatsapp.util.Log.c(r3, r2);	 Catch:{ all -> 0x0a0d }
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x0a0d }
        r3 = com.whatsapp.aqs.FAILED_GENERIC;	 Catch:{ all -> 0x0a0d }
        r4 = 0;
        r5 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x0a0d }
        if (r9 == 0) goto L_0x0a51;
    L_0x0a4e:
        r9.disconnect();	 Catch:{ IOException -> 0x0a90 }
    L_0x0a51:
        if (r10 == 0) goto L_0x0a56;
    L_0x0a53:
        r10.close();	 Catch:{ IOException -> 0x0a94, NumberFormatException -> 0x0a92 }
    L_0x0a56:
        if (r12 == 0) goto L_0x018c;
    L_0x0a58:
        r12.close();	 Catch:{ IOException -> 0x0a5d, NumberFormatException -> 0x0ac6 }
        goto L_0x018c;
    L_0x0a5d:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x0a90:
        r2 = move-exception;
        throw r2;
    L_0x0a92:
        r2 = move-exception;
        throw r2;
    L_0x0a94:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0a56;
    L_0x0ac6:
        r2 = move-exception;
        throw r2;
    L_0x0ac8:
        r2 = move-exception;
        throw r2;
    L_0x0aca:
        r2 = move-exception;
        throw r2;
    L_0x0acc:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0893;
    L_0x0aff:
        r2 = move-exception;
        throw r2;
    L_0x0b01:
        r2 = 1;
        r2 = new java.lang.Long[r2];	 Catch:{ IOException -> 0x0b71 }
        r16 = 0;
        r18 = 100;
        r18 = r18 * r4;
        r18 = r18 / r14;
        r17 = java.lang.Long.valueOf(r18);	 Catch:{ IOException -> 0x0b71 }
        r2[r16] = r17;	 Catch:{ IOException -> 0x0b71 }
        r0 = r20;
        r0.publishProgress(r2);	 Catch:{ IOException -> 0x0b71 }
        r2 = 0;
        r0 = r10.length;	 Catch:{ IOException -> 0x0b71 }
        r16 = r0;
        r0 = r16;
        r2 = r11.read(r10, r2, r0);	 Catch:{ IOException -> 0x0b71 }
        if (r13 == 0) goto L_0x086c;
    L_0x0b23:
        r2 = r21;
        r4 = r23;
        r5 = r24;
        r2 = a(r2, r3, r4, r5, r6, r8);	 Catch:{ all -> 0x0ccc }
        if (r9 == 0) goto L_0x0b32;
    L_0x0b2f:
        r9.disconnect();	 Catch:{ IOException -> 0x0c27 }
    L_0x0b32:
        if (r11 == 0) goto L_0x0b37;
    L_0x0b34:
        r11.close();	 Catch:{ IOException -> 0x0c2b, NumberFormatException -> 0x0c29 }
    L_0x0b37:
        if (r12 == 0) goto L_0x018c;
    L_0x0b39:
        r12.close();	 Catch:{ IOException -> 0x0b3e, NumberFormatException -> 0x0c5e }
        goto L_0x018c;
    L_0x0b3e:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x0b71:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0ccc }
        r3.<init>();	 Catch:{ all -> 0x0ccc }
        r4 = z;	 Catch:{ all -> 0x0ccc }
        r5 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x0ccc }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0ccc }
        r0 = r21;
        r4 = r0.k;	 Catch:{ all -> 0x0ccc }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0ccc }
        r4 = z;	 Catch:{ all -> 0x0ccc }
        r5 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x0ccc }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0ccc }
        r4 = a(r24);	 Catch:{ all -> 0x0ccc }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0ccc }
        r3 = r3.toString();	 Catch:{ all -> 0x0ccc }
        com.whatsapp.util.Log.c(r3, r2);	 Catch:{ all -> 0x0ccc }
        r2 = new com.whatsapp.ta;	 Catch:{ all -> 0x0ccc }
        r3 = com.whatsapp.aqs.FAILED_GENERIC;	 Catch:{ all -> 0x0ccc }
        r4 = 0;
        r5 = 1;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x0ccc }
        if (r9 == 0) goto L_0x0bb0;
    L_0x0bad:
        r9.disconnect();	 Catch:{ IOException -> 0x0bef }
    L_0x0bb0:
        if (r11 == 0) goto L_0x0bb5;
    L_0x0bb2:
        r11.close();	 Catch:{ IOException -> 0x0bf3, NumberFormatException -> 0x0bf1 }
    L_0x0bb5:
        if (r12 == 0) goto L_0x018c;
    L_0x0bb7:
        r12.close();	 Catch:{ IOException -> 0x0bbc, NumberFormatException -> 0x0c25 }
        goto L_0x018c;
    L_0x0bbc:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x018c;
    L_0x0bef:
        r2 = move-exception;
        throw r2;
    L_0x0bf1:
        r2 = move-exception;
        throw r2;
    L_0x0bf3:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0bb5;
    L_0x0c25:
        r2 = move-exception;
        throw r2;
    L_0x0c27:
        r2 = move-exception;
        throw r2;
    L_0x0c29:
        r2 = move-exception;
        throw r2;
    L_0x0c2b:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x0b37;
    L_0x0c5e:
        r2 = move-exception;
        throw r2;
    L_0x0c60:
        r2 = move-exception;
        throw r2;
    L_0x0c62:
        r2 = move-exception;
        throw r2;
    L_0x0c64:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r0 = r21;
        r6 = r0.k;
        r5 = r5.append(r6);
        r6 = z;
        r7 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r6 = a(r24);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.c(r5, r3);
        goto L_0x0305;
    L_0x0c97:
        r2 = move-exception;
        throw r2;
    L_0x0c99:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r21;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = a(r24);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.c(r4, r3);
        goto L_0x030a;
    L_0x0ccc:
        r2 = move-exception;
        r3 = r11;
        r4 = r12;
        goto L_0x02fb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.a(com.whatsapp.v, com.whatsapp.protocol.co, boolean, java.io.File, java.net.URL):com.whatsapp.ta");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.whatsapp.ta a(java.lang.Void[] r13) {
        /*
        r12 = this;
        r11 = 12;
        r6 = 1;
        r7 = 0;
        r8 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.f;	 Catch:{ IOException -> 0x0012 }
        if (r0 != 0) goto L_0x0014;
    L_0x000a:
        r0 = new com.whatsapp.ta;	 Catch:{ IOException -> 0x0012 }
        r1 = com.whatsapp.aqs.FAILED_INVALID_URL;	 Catch:{ IOException -> 0x0012 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0012 }
    L_0x0011:
        return r0;
    L_0x0012:
        r0 = move-exception;
        throw r0;
    L_0x0014:
        r0 = com.whatsapp.App.z();
        com.whatsapp.util.ag.b(r0);
        r0 = com.whatsapp.App.aK;
        r1 = r12.a;
        r1 = r1.o;
        r9 = r0.a(r1);
        if (r9 == 0) goto L_0x011b;
    L_0x0027:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r12.a;
        r1 = r1.k;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r12.a;
        r1 = r1.o;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r9.getAbsolutePath();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r10 = com.whatsapp.util.ag.b(r9);
        r0 = r12.a;
        r0 = r0.o;
        r0 = r0.equals(r10);
        if (r0 == 0) goto L_0x00e5;
    L_0x0077:
        r0 = r12.g;	 Catch:{ IOException -> 0x0331 }
        com.whatsapp.util.ag.a(r9, r0);	 Catch:{ IOException -> 0x0331 }
        r12.a();	 Catch:{ IOException -> 0x0331 }
        r0 = r12.b;	 Catch:{ IOException -> 0x0331 }
        r0 = r0.refKey;	 Catch:{ IOException -> 0x0331 }
        if (r0 == 0) goto L_0x0090;
    L_0x0085:
        r0 = r12.a;	 Catch:{ IOException -> 0x0331 }
        r1 = r12.f;	 Catch:{ IOException -> 0x0331 }
        r2 = r12.b;	 Catch:{ IOException -> 0x0331 }
        r2 = r2.refKey;	 Catch:{ IOException -> 0x0331 }
        a(r0, r1, r2);	 Catch:{ IOException -> 0x0331 }
    L_0x0090:
        r0 = new com.whatsapp.ta;	 Catch:{ IOException -> 0x00a0 }
        r1 = com.whatsapp.aqs.SUCCESS;	 Catch:{ IOException -> 0x00a0 }
        r2 = com.whatsapp.util.a1.b(r9);	 Catch:{ IOException -> 0x00a0 }
        r3 = 0;
        r4 = -1;
        r0.<init>(r1, r2, r3, r4);	 Catch:{ IOException -> 0x00a0 }
        goto L_0x0011;
    L_0x00a0:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0333 }
        r0.<init>();	 Catch:{ IOException -> 0x0333 }
        r1 = z;	 Catch:{ IOException -> 0x0333 }
        r2 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0333 }
        r1 = r12.a;	 Catch:{ IOException -> 0x0333 }
        r1 = r1.k;	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0333 }
        r1 = z;	 Catch:{ IOException -> 0x0333 }
        r2 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0333 }
        r1 = r12.a;	 Catch:{ IOException -> 0x0333 }
        r1 = r1.o;	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0333 }
        r1 = z;	 Catch:{ IOException -> 0x0333 }
        r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0333 }
        r1 = r9.getAbsolutePath();	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0333 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0333 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0333 }
        if (r8 == 0) goto L_0x011b;
    L_0x00e5:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0333 }
        r0.<init>();	 Catch:{ IOException -> 0x0333 }
        r1 = z;	 Catch:{ IOException -> 0x0333 }
        r2 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r10);	 Catch:{ IOException -> 0x0333 }
        r1 = z;	 Catch:{ IOException -> 0x0333 }
        r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0333 }
        r1 = r12.a;	 Catch:{ IOException -> 0x0333 }
        r1 = r1.o;	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0333 }
        r1 = z;	 Catch:{ IOException -> 0x0333 }
        r2 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0333 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0333 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0333 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0333 }
    L_0x011b:
        r0 = r12.g;	 Catch:{ IOException -> 0x0335 }
        r0 = r0.length();	 Catch:{ IOException -> 0x0335 }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0337;
    L_0x0127:
        r0 = r6;
    L_0x0128:
        r1 = r12.a;
        r2 = r12.h;
        r3 = r12.g;
        r4 = r12.f;
        r1 = a(r12, r1, r2, r3, r4);
        r2 = r1.d;	 Catch:{ IOException -> 0x033a }
        r3 = com.whatsapp.aqs.FAILED_CANNOT_RESUME;	 Catch:{ IOException -> 0x033a }
        if (r2 == r3) goto L_0x0140;
    L_0x013a:
        r2 = r1.d;	 Catch:{ IOException -> 0x033a }
        r3 = com.whatsapp.aqs.FAILED_HASH_MISMATCH;	 Catch:{ IOException -> 0x033a }
        if (r2 != r3) goto L_0x03a8;
    L_0x0140:
        r2 = r12.g;	 Catch:{ IOException -> 0x033c }
        r2 = r2.delete();	 Catch:{ IOException -> 0x033c }
        if (r2 != 0) goto L_0x017a;
    L_0x0148:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x033e }
        r2.<init>();	 Catch:{ IOException -> 0x033e }
        r3 = z;	 Catch:{ IOException -> 0x033e }
        r4 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r3 = r3[r4];	 Catch:{ IOException -> 0x033e }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x033e }
        r3 = r12.a;	 Catch:{ IOException -> 0x033e }
        r3 = r3.k;	 Catch:{ IOException -> 0x033e }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x033e }
        r3 = z;	 Catch:{ IOException -> 0x033e }
        r4 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r3 = r3[r4];	 Catch:{ IOException -> 0x033e }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x033e }
        r3 = r12.g;	 Catch:{ IOException -> 0x033e }
        r3 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x033e }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x033e }
        r2 = r2.toString();	 Catch:{ IOException -> 0x033e }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IOException -> 0x033e }
    L_0x017a:
        r2 = r12.b;	 Catch:{ IOException -> 0x0340 }
        if (r2 == 0) goto L_0x01be;
    L_0x017e:
        r2 = r12.b;	 Catch:{ IOException -> 0x0340 }
        r2 = r2.refKey;	 Catch:{ IOException -> 0x0340 }
        if (r2 == 0) goto L_0x01be;
    L_0x0184:
        r2 = r12.a;
        r2 = a(r2, r6);
        if (r2 == 0) goto L_0x01be;
    L_0x018c:
        r3 = r2.delete();	 Catch:{ IOException -> 0x0342 }
        if (r3 != 0) goto L_0x01be;
    L_0x0192:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0344 }
        r3.<init>();	 Catch:{ IOException -> 0x0344 }
        r4 = z;	 Catch:{ IOException -> 0x0344 }
        r5 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0344 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0344 }
        r4 = r12.a;	 Catch:{ IOException -> 0x0344 }
        r4 = r4.k;	 Catch:{ IOException -> 0x0344 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0344 }
        r4 = z;	 Catch:{ IOException -> 0x0344 }
        r5 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0344 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0344 }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x0344 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0344 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IOException -> 0x0344 }
    L_0x01be:
        if (r0 == 0) goto L_0x03a5;
    L_0x01c0:
        r0 = r12.a;
        r1 = r12.h;
        r2 = r12.g;
        r3 = r12.f;
        r0 = a(r12, r0, r1, r2, r3);
        if (r8 == 0) goto L_0x029b;
    L_0x01ce:
        r1 = r0.d;	 Catch:{ IOException -> 0x0346 }
        r2 = com.whatsapp.aqs.FAILED_TOO_OLD;	 Catch:{ IOException -> 0x0346 }
        if (r1 != r2) goto L_0x0267;
    L_0x01d4:
        r1 = r12.a;	 Catch:{ IOException -> 0x0348 }
        r1 = r1.d;	 Catch:{ IOException -> 0x0348 }
        if (r1 == r11) goto L_0x0267;
    L_0x01da:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r12.a;
        r2 = r2.k;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = com.whatsapp.App.aK;
        r2 = r12.a;
        r2 = r2.k;
        r3 = 11;
        r1.b(r2, r3);
        r1 = r12.a;
        com.whatsapp.App.t(r1);
        r1 = r12.a;
        r1 = r1.q;
    L_0x020c:
        if (r7 > r11) goto L_0x0265;
    L_0x020e:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x034a }
    L_0x0213:
        r2 = r12.a;	 Catch:{ IOException -> 0x0356 }
        r2 = r2.q;	 Catch:{ IOException -> 0x0356 }
        r2 = r1.equals(r2);	 Catch:{ IOException -> 0x0356 }
        if (r2 != 0) goto L_0x0261;
    L_0x021d:
        r2 = r12.a;
        r2 = a(r2);
        if (r2 == 0) goto L_0x0265;
    L_0x0225:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r4 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r3 = r12.a;
        r3 = r3.k;
        r0 = r0.append(r3);
        r3 = z;
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r3 = a(r2);
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r12.a;
        r3 = r12.h;
        r4 = r12.g;
        r0 = a(r12, r0, r3, r4, r2);
        if (r8 == 0) goto L_0x0265;
    L_0x0261:
        r7 = r7 + 1;
        if (r8 == 0) goto L_0x020c;
    L_0x0265:
        if (r8 == 0) goto L_0x029b;
    L_0x0267:
        r1 = r0.d;	 Catch:{ IOException -> 0x0358 }
        r1 = r1.isTransientError;	 Catch:{ IOException -> 0x0358 }
        if (r1 == 0) goto L_0x029b;
    L_0x026d:
        r1 = r0.b;	 Catch:{ IOException -> 0x035a }
        if (r1 != 0) goto L_0x029b;
    L_0x0271:
        r1 = r12.f;
        r1 = r1.toString();
        r1 = android.net.Uri.parse(r1);
        r1 = r1.buildUpon();
        r2 = z;
        r3 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r2 = r2[r3];
        r1.authority(r2);
        r2 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x035c }
        r1 = r1.toString();	 Catch:{ MalformedURLException -> 0x035c }
        r2.<init>(r1);	 Catch:{ MalformedURLException -> 0x035c }
        r1 = r12.a;	 Catch:{ MalformedURLException -> 0x035c }
        r3 = r12.h;	 Catch:{ MalformedURLException -> 0x035c }
        r4 = r12.g;	 Catch:{ MalformedURLException -> 0x035c }
        r0 = a(r12, r1, r3, r4, r2);	 Catch:{ MalformedURLException -> 0x035c }
    L_0x029b:
        r1 = r0.a();	 Catch:{ IOException -> 0x037d }
        if (r1 == 0) goto L_0x031f;
    L_0x02a1:
        r1 = r12.a;	 Catch:{ IOException -> 0x037d }
        r1 = r1.c;	 Catch:{ IOException -> 0x037d }
        if (r1 != r6) goto L_0x02be;
    L_0x02a7:
        r1 = r12.a;	 Catch:{ Exception -> 0x0381, OutOfMemoryError -> 0x03a2 }
        r1 = com.whatsapp.util.bd.a(r1);	 Catch:{ Exception -> 0x0381, OutOfMemoryError -> 0x03a2 }
        r2 = r1.getHeight();	 Catch:{ IOException -> 0x037f }
        r1 = r1.getWidth();	 Catch:{ IOException -> 0x037f }
        if (r2 <= r1) goto L_0x02be;
    L_0x02b7:
        r1 = r12.g;	 Catch:{ IOException -> 0x037f }
        r2 = r12.b;	 Catch:{ IOException -> 0x037f }
        com.whatsapp.util.ag.a(r1, r2);	 Catch:{ IOException -> 0x037f }
    L_0x02be:
        r12.a();	 Catch:{ IOException -> 0x0384 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0384 }
        if (r1 >= r11) goto L_0x031f;
    L_0x02c5:
        r1 = r12.a;	 Catch:{ IOException -> 0x0384 }
        r1 = r1.c;	 Catch:{ IOException -> 0x0384 }
        r2 = 2;
        if (r1 != r2) goto L_0x031f;
    L_0x02cc:
        r1 = r12.g;
        r1 = com.whatsapp.util.b.a(r1);
        r2 = r1.b;	 Catch:{ IOException -> 0x0386 }
        if (r2 != 0) goto L_0x031f;
    L_0x02d6:
        r1 = r1.a;	 Catch:{ IOException -> 0x0386 }
        r2 = 5;
        if (r1 != r2) goto L_0x031f;
    L_0x02db:
        r1 = new java.io.File;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r12.g;
        r3 = r3.getAbsolutePath();
        r2 = r2.append(r3);
        r3 = z;
        r4 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        r2 = new com.whatsapp.mb;
        r3 = r12.g;
        r2.<init>(r3, r1);
        r2 = r2.a();
        r2.c();	 Catch:{ at_ -> 0x0388, IOException -> 0x0396 }
        r2 = r12.g;	 Catch:{ at_ -> 0x0388, IOException -> 0x0396 }
        r2.delete();	 Catch:{ at_ -> 0x0388, IOException -> 0x0396 }
        r2 = r12.g;	 Catch:{ at_ -> 0x0388, IOException -> 0x0396 }
        r1.renameTo(r2);	 Catch:{ at_ -> 0x0388, IOException -> 0x0396 }
        r1 = r12.a;	 Catch:{ at_ -> 0x0388, IOException -> 0x0396 }
        r2 = z;	 Catch:{ at_ -> 0x0388, IOException -> 0x0396 }
        r3 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r2 = r2[r3];	 Catch:{ at_ -> 0x0388, IOException -> 0x0396 }
        r1.n = r2;	 Catch:{ at_ -> 0x0388, IOException -> 0x0396 }
    L_0x031f:
        r1 = e;
        monitor-enter(r1);
        r2 = e;	 Catch:{ all -> 0x032e }
        r3 = r12.a;	 Catch:{ all -> 0x032e }
        r3 = r3.k;	 Catch:{ all -> 0x032e }
        r2.remove(r3);	 Catch:{ all -> 0x032e }
        monitor-exit(r1);	 Catch:{ all -> 0x032e }
        goto L_0x0011;
    L_0x032e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x032e }
        throw r0;
    L_0x0331:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a0 }
    L_0x0333:
        r0 = move-exception;
        throw r0;
    L_0x0335:
        r0 = move-exception;
        throw r0;
    L_0x0337:
        r0 = r7;
        goto L_0x0128;
    L_0x033a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x033c }
    L_0x033c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x033e }
    L_0x033e:
        r0 = move-exception;
        throw r0;
    L_0x0340:
        r0 = move-exception;
        throw r0;
    L_0x0342:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0344 }
    L_0x0344:
        r0 = move-exception;
        throw r0;
    L_0x0346:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0348 }
    L_0x0348:
        r0 = move-exception;
        throw r0;
    L_0x034a:
        r2 = move-exception;
        r2 = java.lang.Thread.currentThread();	 Catch:{ IOException -> 0x0356 }
        r2.interrupt();	 Catch:{ IOException -> 0x0356 }
        if (r8 == 0) goto L_0x0265;
    L_0x0354:
        goto L_0x0213;
    L_0x0356:
        r0 = move-exception;
        throw r0;
    L_0x0358:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x035a }
    L_0x035a:
        r0 = move-exception;
        throw r0;
    L_0x035c:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r12.a;
        r2 = r2.k;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x029b;
    L_0x037d:
        r0 = move-exception;
        throw r0;
    L_0x037f:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0381, OutOfMemoryError -> 0x03a2 }
    L_0x0381:
        r1 = move-exception;
        goto L_0x02be;
    L_0x0384:
        r0 = move-exception;
        throw r0;
    L_0x0386:
        r0 = move-exception;
        throw r0;
    L_0x0388:
        r1 = move-exception;
        r2 = z;
        r3 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        com.whatsapp.tw.a(r1);
        goto L_0x031f;
    L_0x0396:
        r1 = move-exception;
        r2 = z;
        r3 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x031f;
    L_0x03a2:
        r1 = move-exception;
        goto L_0x02be;
    L_0x03a5:
        r0 = r1;
        goto L_0x029b;
    L_0x03a8:
        r0 = r1;
        goto L_0x01ce;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.a(java.lang.Void[]):com.whatsapp.ta");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
        r6 = this;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = e;
        monitor-enter(r4);
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e9 }
        r0.<init>();	 Catch:{ all -> 0x00e9 }
        r1 = z;	 Catch:{ all -> 0x00e9 }
        r5 = 43;
        r1 = r1[r5];	 Catch:{ all -> 0x00e9 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00e9 }
        r1 = r6.a;	 Catch:{ all -> 0x00e9 }
        r1 = r1.k;	 Catch:{ all -> 0x00e9 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00e9 }
        r1 = z;	 Catch:{ all -> 0x00e9 }
        r5 = 42;
        r1 = r1[r5];	 Catch:{ all -> 0x00e9 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00e9 }
        r1 = r6.f;	 Catch:{ all -> 0x00e9 }
        r1 = a(r1);	 Catch:{ all -> 0x00e9 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00e9 }
        r0 = r0.toString();	 Catch:{ all -> 0x00e9 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00e9 }
        r0 = i;	 Catch:{ all -> 0x00e9 }
        r1 = r6.a;	 Catch:{ all -> 0x00e9 }
        r1 = r1.o;	 Catch:{ all -> 0x00e9 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x00e9 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x00e9 }
        if (r0 == 0) goto L_0x0055;
    L_0x0046:
        r1 = 0;
        r1 = r0.get(r1);	 Catch:{ all -> 0x00e9 }
        r1 = (com.whatsapp.protocol.co) r1;	 Catch:{ all -> 0x00e9 }
        r1 = r1.Q;	 Catch:{ all -> 0x00e9 }
        r1 = (com.whatsapp.MediaData) r1;	 Catch:{ all -> 0x00e9 }
        r1 = r1.downloader;	 Catch:{ all -> 0x00e9 }
        if (r3 == 0) goto L_0x0056;
    L_0x0055:
        r1 = r2;
    L_0x0056:
        if (r1 == 0) goto L_0x005f;
    L_0x0058:
        if (r1 == r6) goto L_0x005f;
    L_0x005a:
        r1.d();	 Catch:{ IllegalStateException -> 0x00e3 }
        if (r3 == 0) goto L_0x00e1;
    L_0x005f:
        r1 = 1;
        r6.cancel(r1);	 Catch:{ IllegalStateException -> 0x00e5 }
        r1 = com.whatsapp.u1.a();	 Catch:{ IllegalStateException -> 0x00e5 }
        r2 = r6.a;	 Catch:{ IllegalStateException -> 0x00e5 }
        r1.b(r2);	 Catch:{ IllegalStateException -> 0x00e5 }
        r1 = e;	 Catch:{ IllegalStateException -> 0x00e5 }
        r2 = r6.a;	 Catch:{ IllegalStateException -> 0x00e5 }
        r2 = r2.k;	 Catch:{ IllegalStateException -> 0x00e5 }
        r1.remove(r2);	 Catch:{ IllegalStateException -> 0x00e5 }
        r1 = r6.b;	 Catch:{ IllegalStateException -> 0x00e5 }
        r1 = r1.transferred;	 Catch:{ IllegalStateException -> 0x00e5 }
        if (r1 != 0) goto L_0x0091;
    L_0x007b:
        r1 = r6.b;	 Catch:{ IllegalStateException -> 0x00e7 }
        r2 = 0;
        r1.transferring = r2;	 Catch:{ IllegalStateException -> 0x00e7 }
        r1 = r6.b;	 Catch:{ IllegalStateException -> 0x00e7 }
        r2 = 0;
        r1.transferred = r2;	 Catch:{ IllegalStateException -> 0x00e7 }
        r1 = r6.b;	 Catch:{ IllegalStateException -> 0x00e7 }
        r2 = 0;
        r1.autodownloadRetryEnabled = r2;	 Catch:{ IllegalStateException -> 0x00e7 }
        r1 = com.whatsapp.App.aK;	 Catch:{ IllegalStateException -> 0x00e7 }
        r2 = r6.a;	 Catch:{ IllegalStateException -> 0x00e7 }
        r1.c(r2);	 Catch:{ IllegalStateException -> 0x00e7 }
    L_0x0091:
        r1 = i;	 Catch:{ all -> 0x00e9 }
        r2 = r6.a;	 Catch:{ all -> 0x00e9 }
        r2 = r2.o;	 Catch:{ all -> 0x00e9 }
        r1.remove(r2);	 Catch:{ all -> 0x00e9 }
        if (r0 == 0) goto L_0x00de;
    L_0x009c:
        r2 = r0.iterator();	 Catch:{ all -> 0x00e9 }
    L_0x00a0:
        r0 = r2.hasNext();	 Catch:{ all -> 0x00e9 }
        if (r0 == 0) goto L_0x00de;
    L_0x00a6:
        r0 = r2.next();	 Catch:{ all -> 0x00e9 }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ all -> 0x00e9 }
        r1 = r6.a;	 Catch:{ all -> 0x00e9 }
        if (r0 == r1) goto L_0x00dc;
    L_0x00b0:
        r1 = com.whatsapp.u1.a();	 Catch:{ all -> 0x00e9 }
        r1.b(r0);	 Catch:{ all -> 0x00e9 }
        r1 = r0.Q;	 Catch:{ all -> 0x00e9 }
        r1 = (com.whatsapp.MediaData) r1;	 Catch:{ all -> 0x00e9 }
        r5 = 0;
        r1.transferring = r5;	 Catch:{ IllegalStateException -> 0x00ec }
        r5 = r6.b;	 Catch:{ IllegalStateException -> 0x00ec }
        r5 = r5.transferred;	 Catch:{ IllegalStateException -> 0x00ec }
        r1.transferred = r5;	 Catch:{ IllegalStateException -> 0x00ec }
        r5 = 0;
        r1.autodownloadRetryEnabled = r5;	 Catch:{ IllegalStateException -> 0x00ec }
        r5 = r1.downloader;	 Catch:{ IllegalStateException -> 0x00ec }
        if (r5 == 0) goto L_0x00d0;
    L_0x00cb:
        r1 = r1.downloader;	 Catch:{ IllegalStateException -> 0x00ec }
        r5 = 0;
        r1.d = r5;	 Catch:{ IllegalStateException -> 0x00ec }
    L_0x00d0:
        r1 = com.whatsapp.App.aK;	 Catch:{ all -> 0x00e9 }
        r1.c(r0);	 Catch:{ all -> 0x00e9 }
        r1 = e;	 Catch:{ all -> 0x00e9 }
        r0 = r0.k;	 Catch:{ all -> 0x00e9 }
        r1.remove(r0);	 Catch:{ all -> 0x00e9 }
    L_0x00dc:
        if (r3 == 0) goto L_0x00a0;
    L_0x00de:
        r0 = 0;
        r6.d = r0;	 Catch:{ all -> 0x00e9 }
    L_0x00e1:
        monitor-exit(r4);	 Catch:{ all -> 0x00e9 }
        return;
    L_0x00e3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00e9 }
        throw r0;
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e9 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.d():void");
    }

    protected void a(Long[] lArr) {
        this.b.progress = lArr[0].longValue();
        App.aK.a(this.a, false, -1);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    private static File a(co coVar, String str) {
        if (coVar.c != 9) {
            return ag.a(App.z(), "." + str, null, coVar.c, coVar.r, false);
        }
        CharSequence c = ag.c(coVar.n);
        try {
            String str2;
            if (TextUtils.isEmpty(c) && !TextUtils.isEmpty(coVar.A)) {
                c = a1.b(coVar.A);
            }
            if (!TextUtils.isEmpty(c)) {
                CharSequence charSequence = c;
            }
            if (!TextUtils.isEmpty(str)) {
                str = str.replaceAll(z[47], "");
            }
            String str3 = coVar.a;
            if (!TextUtils.isEmpty(coVar.A)) {
                str3 = a1.a(coVar.A);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = coVar.a;
            }
            if (TextUtils.isEmpty(str3)) {
                str2 = str3;
            } else {
                str2 = str3.replaceAll(z[46], "");
            }
            return ag.a(App.z(), "." + str, str2, coVar.c, coVar.r, false);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static Activity a(v vVar) {
        return vVar.d;
    }

    private static String a(URL url) {
        return ag.a(url);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.ta r10, java.lang.String r11) {
        /*
        r9 = this;
        r8 = 3;
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = e;
        monitor-enter(r4);
        r0 = i;	 Catch:{ all -> 0x0088 }
        r1 = r9.a;	 Catch:{ all -> 0x0088 }
        r1 = r1.o;	 Catch:{ all -> 0x0088 }
        r0 = r0.remove(r1);	 Catch:{ all -> 0x0088 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0088 }
        if (r0 == 0) goto L_0x0077;
    L_0x0014:
        r5 = r0.iterator();	 Catch:{ all -> 0x0088 }
    L_0x0018:
        r0 = r5.hasNext();	 Catch:{ all -> 0x0088 }
        if (r0 == 0) goto L_0x0075;
    L_0x001e:
        r0 = r5.next();	 Catch:{ all -> 0x0088 }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ all -> 0x0088 }
        r1 = r9.a;	 Catch:{ all -> 0x0088 }
        if (r0 == r1) goto L_0x0073;
    L_0x0028:
        r1 = r0.Q;	 Catch:{ all -> 0x0088 }
        r1 = (com.whatsapp.MediaData) r1;	 Catch:{ all -> 0x0088 }
        r2 = 0;
        r1.transferring = r2;	 Catch:{ IOException -> 0x0082 }
        r2 = r9.b;	 Catch:{ IOException -> 0x0082 }
        r2 = r2.transferred;	 Catch:{ IOException -> 0x0082 }
        r1.transferred = r2;	 Catch:{ IOException -> 0x0082 }
        r2 = r9.b;	 Catch:{ IOException -> 0x0082 }
        r2 = r2.dedupeDownload;	 Catch:{ IOException -> 0x0082 }
        r1.dedupeDownload = r2;	 Catch:{ IOException -> 0x0082 }
        r2 = r10.a();	 Catch:{ IOException -> 0x0082 }
        if (r2 == 0) goto L_0x006c;
    L_0x0041:
        r2 = r9.b;	 Catch:{ IOException -> 0x0082 }
        r6 = r2.fileSize;	 Catch:{ IOException -> 0x0082 }
        r1.fileSize = r6;	 Catch:{ IOException -> 0x0082 }
        r2 = r0.c;	 Catch:{ IOException -> 0x0082 }
        if (r2 != r8) goto L_0x005d;
    L_0x004b:
        r2 = r0.a();	 Catch:{ IOException -> 0x0084 }
        if (r2 != 0) goto L_0x005d;
    L_0x0051:
        r2 = r9.a;	 Catch:{ IOException -> 0x0086 }
        r2 = r2.e();	 Catch:{ IOException -> 0x0086 }
        r0.a(r2);	 Catch:{ IOException -> 0x0086 }
        r2 = 1;
        r0.u = r2;	 Catch:{ IOException -> 0x0086 }
    L_0x005d:
        r2 = a(r0, r11);	 Catch:{ all -> 0x0088 }
        r1.file = r2;	 Catch:{ all -> 0x0088 }
        r2 = r9.b;	 Catch:{ IOException -> 0x008b }
        r2 = r2.file;	 Catch:{ IOException -> 0x008b }
        r6 = r1.file;	 Catch:{ IOException -> 0x008b }
        com.whatsapp.util.ag.a(r2, r6);	 Catch:{ IOException -> 0x008b }
    L_0x006c:
        r1 = com.whatsapp.App.aK;	 Catch:{ all -> 0x0088 }
        r2 = 1;
        r6 = 3;
        r1.a(r0, r2, r6);	 Catch:{ all -> 0x0088 }
    L_0x0073:
        if (r3 == 0) goto L_0x0018;
    L_0x0075:
        if (r3 == 0) goto L_0x0080;
    L_0x0077:
        r0 = z;	 Catch:{ IOException -> 0x00be }
        r1 = 98;
        r0 = r0[r1];	 Catch:{ IOException -> 0x00be }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x00be }
    L_0x0080:
        monitor-exit(r4);	 Catch:{ all -> 0x0088 }
        return;
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0084 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0088 }
        throw r0;
    L_0x008b:
        r2 = move-exception;
        r6 = 0;
        r1.transferred = r6;	 Catch:{ all -> 0x0088 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0088 }
        r1.<init>();	 Catch:{ all -> 0x0088 }
        r6 = z;	 Catch:{ all -> 0x0088 }
        r7 = 96;
        r6 = r6[r7];	 Catch:{ all -> 0x0088 }
        r1 = r1.append(r6);	 Catch:{ all -> 0x0088 }
        r6 = r9.a;	 Catch:{ all -> 0x0088 }
        r6 = r6.k;	 Catch:{ all -> 0x0088 }
        r1 = r1.append(r6);	 Catch:{ all -> 0x0088 }
        r6 = z;	 Catch:{ all -> 0x0088 }
        r7 = 97;
        r6 = r6[r7];	 Catch:{ all -> 0x0088 }
        r1 = r1.append(r6);	 Catch:{ all -> 0x0088 }
        r6 = r0.k;	 Catch:{ all -> 0x0088 }
        r1 = r1.append(r6);	 Catch:{ all -> 0x0088 }
        r1 = r1.toString();	 Catch:{ all -> 0x0088 }
        com.whatsapp.util.Log.b(r1, r2);	 Catch:{ all -> 0x0088 }
        goto L_0x006c;
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0088 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.a(com.whatsapp.ta, java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b(com.whatsapp.ta r11) {
        /*
        r10 = this;
        r9 = 17;
        r8 = 3;
        r0 = 1;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 89;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r10.a;
        r4 = r4.k;
        r2 = r2.append(r4);
        r4 = z;
        r5 = 92;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r10.f;
        r4 = a(r4);
        r2 = r2.append(r4);
        r4 = z;
        r5 = 91;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r11);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r10.b;
        r2.transferring = r1;
        r2 = r10.b;
        r4 = r11.a();
        r2.transferred = r4;
        r2 = "";
        r4 = r11.a();	 Catch:{ IllegalStateException -> 0x0133 }
        if (r4 == 0) goto L_0x00ba;
    L_0x005c:
        r4 = r10.b;	 Catch:{ IllegalStateException -> 0x0133 }
        r5 = r10.g;	 Catch:{ IllegalStateException -> 0x0133 }
        r6 = r5.length();	 Catch:{ IllegalStateException -> 0x0133 }
        r4.fileSize = r6;	 Catch:{ IllegalStateException -> 0x0133 }
        r4 = r11.a;	 Catch:{ IllegalStateException -> 0x0133 }
        if (r4 == 0) goto L_0x006e;
    L_0x006a:
        r2 = r11.a;
        if (r3 == 0) goto L_0x007c;
    L_0x006e:
        r4 = r10.a;	 Catch:{ IllegalStateException -> 0x0135 }
        r4 = r4.q;	 Catch:{ IllegalStateException -> 0x0135 }
        if (r4 == 0) goto L_0x007c;
    L_0x0074:
        r2 = r10.a;
        r2 = r2.q;
        r2 = com.whatsapp.util.a1.b(r2);
    L_0x007c:
        r4 = r10.b;	 Catch:{ IllegalStateException -> 0x0137 }
        r5 = r10.a;	 Catch:{ IllegalStateException -> 0x0137 }
        r5 = a(r5, r2);	 Catch:{ IllegalStateException -> 0x0137 }
        r4.file = r5;	 Catch:{ IllegalStateException -> 0x0137 }
        r4 = r10.g;	 Catch:{ IllegalStateException -> 0x0137 }
        r5 = r10.b;	 Catch:{ IllegalStateException -> 0x0137 }
        r5 = r5.file;	 Catch:{ IllegalStateException -> 0x0137 }
        r4.renameTo(r5);	 Catch:{ IllegalStateException -> 0x0137 }
        r4 = r10.g;	 Catch:{ IllegalStateException -> 0x0137 }
        r4.delete();	 Catch:{ IllegalStateException -> 0x0137 }
        r4 = r10.a;	 Catch:{ IllegalStateException -> 0x0137 }
        r4 = r4.c;	 Catch:{ IllegalStateException -> 0x0137 }
        if (r4 != r8) goto L_0x00d3;
    L_0x009a:
        r4 = r10.a;	 Catch:{ IllegalStateException -> 0x0139 }
        r4 = r4.a();	 Catch:{ IllegalStateException -> 0x0139 }
        if (r4 != 0) goto L_0x00d3;
    L_0x00a2:
        r4 = r10.a;	 Catch:{ IllegalStateException -> 0x013b }
        r5 = r10.b;	 Catch:{ IllegalStateException -> 0x013b }
        r5 = r5.file;	 Catch:{ IllegalStateException -> 0x013b }
        r5 = r5.getAbsolutePath();	 Catch:{ IllegalStateException -> 0x013b }
        r5 = com.whatsapp.util.ag.b(r5);	 Catch:{ IllegalStateException -> 0x013b }
        r4.a(r5);	 Catch:{ IllegalStateException -> 0x013b }
        r4 = r10.a;	 Catch:{ IllegalStateException -> 0x013b }
        r5 = 1;
        r4.u = r5;	 Catch:{ IllegalStateException -> 0x013b }
        if (r3 == 0) goto L_0x00d3;
    L_0x00ba:
        r3 = r10.g;	 Catch:{ IllegalStateException -> 0x013d }
        r4 = r3.length();	 Catch:{ IllegalStateException -> 0x013d }
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x00d3;
    L_0x00c6:
        r3 = r10.g;	 Catch:{ IllegalStateException -> 0x013d }
        r3.delete();	 Catch:{ IllegalStateException -> 0x013d }
        r3 = r10.b;	 Catch:{ IllegalStateException -> 0x013d }
        r4 = r11.d;	 Catch:{ IllegalStateException -> 0x013d }
        r4 = r4.errorCode;	 Catch:{ IllegalStateException -> 0x013d }
        r3.failErrorCode = r4;	 Catch:{ IllegalStateException -> 0x013d }
    L_0x00d3:
        r3 = r11.d;	 Catch:{ IllegalStateException -> 0x013f }
        r4 = com.whatsapp.aqs.FAILED_BAD_MEDIA;	 Catch:{ IllegalStateException -> 0x013f }
        if (r3 == r4) goto L_0x00df;
    L_0x00d9:
        r3 = r11.d;	 Catch:{ IllegalStateException -> 0x0141 }
        r4 = com.whatsapp.aqs.FAILED_TOO_OLD;	 Catch:{ IllegalStateException -> 0x0141 }
        if (r3 != r4) goto L_0x00e4;
    L_0x00df:
        r3 = r10.b;	 Catch:{ IllegalStateException -> 0x0141 }
        r4 = 0;
        r3.autodownloadRetryEnabled = r4;	 Catch:{ IllegalStateException -> 0x0141 }
    L_0x00e4:
        r3 = r10.a;	 Catch:{ IllegalStateException -> 0x0143 }
        com.whatsapp.util.bd.b(r3);	 Catch:{ IllegalStateException -> 0x0143 }
        r3 = com.whatsapp.App.aK;	 Catch:{ IllegalStateException -> 0x0143 }
        r4 = r10.a;	 Catch:{ IllegalStateException -> 0x0143 }
        r5 = 1;
        r6 = 3;
        r3.a(r4, r5, r6);	 Catch:{ IllegalStateException -> 0x0143 }
        r10.a(r11, r2);	 Catch:{ IllegalStateException -> 0x0143 }
        r2 = r10.d;	 Catch:{ IllegalStateException -> 0x0143 }
        if (r2 == 0) goto L_0x0114;
    L_0x00f9:
        r2 = r10.d;	 Catch:{ IllegalStateException -> 0x0145 }
        r2 = r2.isFinishing();	 Catch:{ IllegalStateException -> 0x0145 }
        if (r2 != 0) goto L_0x0114;
    L_0x0101:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0147 }
        if (r2 < r9) goto L_0x0111;
    L_0x0105:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0149 }
        if (r2 < r9) goto L_0x0114;
    L_0x0109:
        r2 = r10.d;	 Catch:{ IllegalStateException -> 0x014b }
        r2 = r2.isDestroyed();	 Catch:{ IllegalStateException -> 0x014b }
        if (r2 != 0) goto L_0x0114;
    L_0x0111:
        r10.a(r11);	 Catch:{ IllegalStateException -> 0x014b }
    L_0x0114:
        r2 = r10.f;	 Catch:{ IllegalStateException -> 0x014d }
        if (r2 == 0) goto L_0x0151;
    L_0x0118:
        r2 = r10.f;	 Catch:{ IllegalStateException -> 0x014f }
        r2 = r2.getHost();	 Catch:{ IllegalStateException -> 0x014f }
        r3 = z;	 Catch:{ IllegalStateException -> 0x014f }
        r4 = 90;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x014f }
        r2 = r2.endsWith(r3);	 Catch:{ IllegalStateException -> 0x014f }
        if (r2 == 0) goto L_0x0151;
    L_0x012a:
        r1 = r10.a;
        com.whatsapp.wo.a(r1, r11, r0);
        r0 = 0;
        r10.d = r0;
        return;
    L_0x0133:
        r0 = move-exception;
        throw r0;
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0139 }
    L_0x0139:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x013b }
    L_0x013b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x013d }
    L_0x013d:
        r0 = move-exception;
        throw r0;
    L_0x013f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0141 }
    L_0x0141:
        r0 = move-exception;
        throw r0;
    L_0x0143:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0145 }
    L_0x0145:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0147 }
    L_0x0147:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0149 }
    L_0x0149:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x014b }
    L_0x014b:
        r0 = move-exception;
        throw r0;
    L_0x014d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x014f }
    L_0x014f:
        r0 = move-exception;
        throw r0;
    L_0x0151:
        r0 = r1;
        goto L_0x012a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.b(com.whatsapp.ta):void");
    }

    protected void onPostExecute(Object obj) {
        b((ta) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    private static java.io.File a(@android.support.annotation.NonNull com.whatsapp.protocol.co r6, boolean r7) {
        /*
        r5 = 47;
        r4 = 45;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r6.o;	 Catch:{ IllegalStateException -> 0x0066 }
        if (r0 == 0) goto L_0x004a;
    L_0x000a:
        if (r7 == 0) goto L_0x002b;
    L_0x000c:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = r6.o;
        r2 = r2.replace(r5, r4);
        r0 = r0.append(r2);
        r2 = z;
        r3 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        if (r1 == 0) goto L_0x006c;
    L_0x002b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = r6.o;
        r2 = r2.replace(r5, r4);
        r0 = r0.append(r2);
        r2 = z;
        r3 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        if (r1 == 0) goto L_0x006c;
    L_0x004a:
        r0 = r6.q;	 Catch:{ IllegalStateException -> 0x0068 }
        if (r0 == 0) goto L_0x005b;
    L_0x004e:
        r0 = new java.io.File;
        r2 = r6.q;
        r0.<init>(r2);
        r0 = r0.getName();
        if (r1 == 0) goto L_0x006c;
    L_0x005b:
        r0 = z;	 Catch:{ IllegalStateException -> 0x006a }
        r1 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x006a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x006a }
        r0 = 0;
    L_0x0065:
        return r0;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = move-exception;
        throw r0;
    L_0x006c:
        r0 = com.whatsapp.App.j(r0);
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.a(com.whatsapp.protocol.co, boolean):java.io.File");
    }

    private v(co coVar, boolean z, Activity activity) {
        boolean z2;
        this.c = new dd(this);
        this.g = a(coVar, false);
        this.a = coVar;
        this.h = z;
        this.b = (MediaData) coVar.Q;
        this.f = a(coVar);
        this.d = activity;
        StringBuilder append = new StringBuilder().append(z[1]).append(coVar.k).append(z[0]).append(a(this.f)).append(z[2]).append(z).append(z[3]);
        if (activity == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Log.i(append.append(z2).toString());
    }

    public static co a(c3 c3Var) {
        co coVar;
        synchronized (e) {
            coVar = (co) e.get(c3Var);
        }
        return coVar;
    }

    private static void a(Builder builder) {
        int i;
        Display defaultDisplay;
        int height;
        Point point;
        int i2;
        Object obj = null;
        boolean z = DialogToastActivity.f;
        int i3 = 640;
        int i4 = 480;
        if (VERSION.SDK_INT >= 8) {
            try {
                CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
                if (camcorderProfile != null) {
                    i3 = Math.max(640, camcorderProfile.videoFrameWidth);
                    i4 = Math.max(480, camcorderProfile.videoFrameHeight);
                    if (!z) {
                        i = i3;
                        i3 = i4;
                        i4 = 1;
                        obj = r0;
                        defaultDisplay = ((WindowManager) App.z().getSystemService(z[arj.Theme_buttonStyleSmall])).getDefaultDisplay();
                        i4 = defaultDisplay.getWidth();
                        height = defaultDisplay.getHeight();
                        if (VERSION.SDK_INT >= 14) {
                            try {
                                point = new Point();
                                defaultDisplay.getRealSize(point);
                                i4 = point.x;
                                height = point.y;
                            } catch (NoSuchMethodError e) {
                            }
                        }
                        if (i4 >= height) {
                            i2 = height;
                            height = i4;
                            i4 = i2;
                        }
                        if (obj == null || (r2 > height && r1 > i4)) {
                            i3 = i4;
                            i = height;
                        }
                        builder.appendQueryParameter(z[99], String.valueOf(i));
                        builder.appendQueryParameter(z[arj.Theme_checkedTextViewStyle], String.valueOf(i3));
                        Log.i(z[100] + i + z[arj.Theme_checkboxStyle] + i3);
                    }
                }
                i = i3;
                i3 = i4;
                Object obj2 = null;
                obj = obj2;
            } catch (Throwable e2) {
                Log.b(e2);
                if (!z) {
                    i = 640;
                    i3 = 480;
                }
            }
            defaultDisplay = ((WindowManager) App.z().getSystemService(z[arj.Theme_buttonStyleSmall])).getDefaultDisplay();
            i4 = defaultDisplay.getWidth();
            height = defaultDisplay.getHeight();
            if (VERSION.SDK_INT >= 14) {
                point = new Point();
                defaultDisplay.getRealSize(point);
                i4 = point.x;
                height = point.y;
            }
            if (i4 >= height) {
                i2 = height;
                height = i4;
                i4 = i2;
            }
            i3 = i4;
            i = height;
            builder.appendQueryParameter(z[99], String.valueOf(i));
            builder.appendQueryParameter(z[arj.Theme_checkedTextViewStyle], String.valueOf(i3));
            Log.i(z[100] + i + z[arj.Theme_checkboxStyle] + i3);
        }
        i = 640;
        i3 = 480;
        defaultDisplay = ((WindowManager) App.z().getSystemService(z[arj.Theme_buttonStyleSmall])).getDefaultDisplay();
        i4 = defaultDisplay.getWidth();
        height = defaultDisplay.getHeight();
        if (VERSION.SDK_INT >= 14) {
            point = new Point();
            defaultDisplay.getRealSize(point);
            i4 = point.x;
            height = point.y;
        }
        if (i4 >= height) {
            i2 = height;
            height = i4;
            i4 = i2;
        }
        i3 = i4;
        i = height;
        builder.appendQueryParameter(z[99], String.valueOf(i));
        builder.appendQueryParameter(z[arj.Theme_checkedTextViewStyle], String.valueOf(i3));
        Log.i(z[100] + i + z[arj.Theme_checkboxStyle] + i3);
    }

    private static String a(@NonNull byte[] bArr) {
        try {
            Mac instance = Mac.getInstance(z[127]);
            try {
                instance.init(new SecretKeySpec(bArr, z[126]));
                return Base64.encodeToString(instance.doFinal(App.as.e().p.getBytes()), 0, 20, 10);
            } catch (Throwable e) {
                Log.c(e);
                return null;
            }
        } catch (Throwable e2) {
            Log.c(e2);
            return null;
        }
    }

    protected void onCancelled() {
        Log.i(z[44] + this.a.k + z[45] + a(this.f));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.v a(com.whatsapp.protocol.co r7, boolean r8, android.app.Activity r9) {
        /*
        r1 = 0;
        r3 = e;
        monitor-enter(r3);
        r0 = r7.Q;	 Catch:{ all -> 0x0107 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ all -> 0x0107 }
        if (r0 != 0) goto L_0x0028;
    L_0x000a:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0107 }
        r0.<init>();	 Catch:{ all -> 0x0107 }
        r2 = z;	 Catch:{ all -> 0x0107 }
        r4 = 5;
        r2 = r2[r4];	 Catch:{ all -> 0x0107 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0107 }
        r2 = r7.k;	 Catch:{ all -> 0x0107 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0107 }
        r0 = r0.toString();	 Catch:{ all -> 0x0107 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x0107 }
        monitor-exit(r3);	 Catch:{ all -> 0x0107 }
        r0 = r1;
    L_0x0027:
        return r0;
    L_0x0028:
        r2 = r0.transferred;	 Catch:{ all -> 0x0107 }
        if (r2 == 0) goto L_0x004a;
    L_0x002c:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0107 }
        r0.<init>();	 Catch:{ all -> 0x0107 }
        r2 = z;	 Catch:{ all -> 0x0107 }
        r4 = 4;
        r2 = r2[r4];	 Catch:{ all -> 0x0107 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0107 }
        r2 = r7.k;	 Catch:{ all -> 0x0107 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0107 }
        r0 = r0.toString();	 Catch:{ all -> 0x0107 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x0107 }
        monitor-exit(r3);	 Catch:{ all -> 0x0107 }
        r0 = r1;
        goto L_0x0027;
    L_0x004a:
        r2 = r0.transferring;	 Catch:{ all -> 0x0107 }
        if (r2 == 0) goto L_0x006d;
    L_0x004e:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0107 }
        r0.<init>();	 Catch:{ all -> 0x0107 }
        r2 = z;	 Catch:{ all -> 0x0107 }
        r4 = 8;
        r2 = r2[r4];	 Catch:{ all -> 0x0107 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0107 }
        r2 = r7.k;	 Catch:{ all -> 0x0107 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0107 }
        r0 = r0.toString();	 Catch:{ all -> 0x0107 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x0107 }
        monitor-exit(r3);	 Catch:{ all -> 0x0107 }
        r0 = r1;
        goto L_0x0027;
    L_0x006d:
        r2 = e;	 Catch:{ all -> 0x0107 }
        r4 = r7.k;	 Catch:{ all -> 0x0107 }
        r2 = r2.containsKey(r4);	 Catch:{ all -> 0x0107 }
        if (r2 != 0) goto L_0x00d0;
    L_0x0077:
        r2 = e;	 Catch:{ all -> 0x0107 }
        r4 = r7.k;	 Catch:{ all -> 0x0107 }
        r2.put(r4, r7);	 Catch:{ all -> 0x0107 }
        r2 = new com.whatsapp.v;	 Catch:{ all -> 0x0107 }
        r2.<init>(r7, r8, r9);	 Catch:{ all -> 0x0107 }
        r0.downloader = r2;	 Catch:{ all -> 0x0107 }
        r4 = 1;
        r0.transferring = r4;	 Catch:{ all -> 0x0107 }
        r4 = 0;
        r0.progress = r4;	 Catch:{ all -> 0x0107 }
        r4 = 1;
        r0.autodownloadRetryEnabled = r4;	 Catch:{ all -> 0x0107 }
        r0 = i;	 Catch:{ all -> 0x0107 }
        r4 = r7.o;	 Catch:{ all -> 0x0107 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0107 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0107 }
        if (r0 == 0) goto L_0x00f7;
    L_0x009b:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0107 }
        r2.<init>();	 Catch:{ all -> 0x0107 }
        r4 = z;	 Catch:{ all -> 0x0107 }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ all -> 0x0107 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x0107 }
        r4 = r7.k;	 Catch:{ all -> 0x0107 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x0107 }
        r4 = z;	 Catch:{ all -> 0x0107 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ all -> 0x0107 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x0107 }
        r4 = r0.size();	 Catch:{ all -> 0x0107 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x0107 }
        r2 = r2.toString();	 Catch:{ all -> 0x0107 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ all -> 0x0107 }
        r2 = r0;
        r0 = r1;
    L_0x00c9:
        r2.add(r7);	 Catch:{ all -> 0x0107 }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ all -> 0x0107 }
        if (r2 == 0) goto L_0x00ed;
    L_0x00d0:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0107 }
        r0.<init>();	 Catch:{ all -> 0x0107 }
        r2 = z;	 Catch:{ all -> 0x0107 }
        r4 = 9;
        r2 = r2[r4];	 Catch:{ all -> 0x0107 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0107 }
        r2 = r7.k;	 Catch:{ all -> 0x0107 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0107 }
        r0 = r0.toString();	 Catch:{ all -> 0x0107 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x0107 }
        r0 = r1;
    L_0x00ed:
        monitor-exit(r3);	 Catch:{ all -> 0x0107 }
        r1 = com.whatsapp.App.aK;
        r2 = 0;
        r3 = -1;
        r1.a(r7, r2, r3);
        goto L_0x0027;
    L_0x00f7:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0107 }
        r0.<init>();	 Catch:{ all -> 0x0107 }
        r4 = i;	 Catch:{ all -> 0x0107 }
        r5 = r7.o;	 Catch:{ all -> 0x0107 }
        r4.put(r5, r0);	 Catch:{ all -> 0x0107 }
        r6 = r0;
        r0 = r2;
        r2 = r6;
        goto L_0x00c9;
    L_0x0107:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0107 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.a(com.whatsapp.protocol.co, boolean, android.app.Activity):com.whatsapp.v");
    }

    protected void onProgressUpdate(Object[] objArr) {
        a((Long[]) objArr);
    }
}
