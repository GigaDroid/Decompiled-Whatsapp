package com.whatsapp;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.net.Uri;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class MediaProvider extends ContentProvider {
    public static final Uri a;
    private static final UriMatcher b;
    private static final String[] z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 18;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 3);
        }
        return toCharArray;
    }

    public String getType(Uri uri) {
        try {
            switch (b.match(uri)) {
                case at.g /*1*/:
                    return z[5];
                case at.i /*2*/:
                    return z[7];
                default:
                    throw new IllegalArgumentException(z[6] + uri);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    public boolean onCreate() {
        return true;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    static {
        String[] strArr = new String[8];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "o\u0019\u0004yfy%\u0003";
        int i2 = -1;
        while (true) {
            str = z(z(str));
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "{\u0005\u0003wl";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "X\u0002\f|lz\u0002GGQDL";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "d\u0001\u0006uf~";
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "{\u0002\u0003<bc\b\u0015}jiB\u0004gq~\u0003\u0015<gd\u001eHdmiB\u0004}n#\u001b\u000fsw~\r\u0017b-}\u001e\bdji\t\u0015<nh\b\u000es-o\u0019\u0004yfy\u001f";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "X\u0002\f|lz\u0002GGQDL";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "{\u0002\u0003<bc\b\u0015}jiB\u0004gq~\u0003\u0015<gd\u001eHdmiB\u0004}n#\u001b\u000fsw~\r\u0017b-}\u001e\bdji\t\u0015<nh\b\u000es-d\u0018\u0002\u007fp";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = Uri.parse(z(z("n\u0003\tffc\u0018]=,n\u0003\n<te\r\u0013ab}\u001cIbqb\u001a\u000evf\u007fB\nwgd\r")));
                    b = new UriMatcher(-1);
                    UriMatcher uriMatcher = b;
                    String str2 = "n\u0003\n<te\r\u0013ab}\u001cIbqb\u001a\u000evf\u007fB\nwgd\r";
                    i2 = -1;
                    while (true) {
                        String z = z(z(str2));
                        switch (i2) {
                            case v.m /*0*/:
                                str2 = "d\u0018\u0002\u007fp";
                                i2 = 0;
                                break;
                            default:
                                str2 = "o\u0019\u0004yfy\u001f";
                                i2 = -1;
                                break;
                        }
                        str2 = z(z(str2));
                        switch (i2) {
                            case v.m /*0*/:
                                uriMatcher.addURI(z, str2, 2);
                                return;
                            default:
                                uriMatcher.addURI(z, str2, 1);
                                uriMatcher = b;
                                str2 = "n\u0003\n<te\r\u0013ab}\u001cIbqb\u001a\u000evf\u007fB\nwgd\r";
                                i2 = 0;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "d\u0002\u0004~vi\t";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12) {
        /*
        r7 = this;
        r3 = 3;
        r0 = 0;
        r2 = 1;
        r1 = b;	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1 = r1.match(r8);	 Catch:{ IllegalArgumentException -> 0x0031 }
        switch(r1) {
            case 1: goto L_0x0027;
            case 2: goto L_0x0033;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0027:
        r0 = new com.whatsapp.tk;	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1 = r7.getContext();	 Catch:{ IllegalArgumentException -> 0x0031 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0031 }
    L_0x0030:
        return r0;
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        r1 = z;
        r1 = r1[r0];
        r3 = r8.getQueryParameter(r1);
        r1 = z;
        r1 = r1[r2];
        r4 = r8.getQueryParameter(r1);
        if (r4 != 0) goto L_0x0053;
    L_0x0045:
        r0 = new com.whatsapp.a9u;	 Catch:{ IllegalArgumentException -> 0x0051 }
        r1 = com.whatsapp.App.aK;	 Catch:{ IllegalArgumentException -> 0x0051 }
        r1 = r1.e(r3);	 Catch:{ IllegalArgumentException -> 0x0051 }
        r0.<init>(r3, r1);	 Catch:{ IllegalArgumentException -> 0x0051 }
        goto L_0x0030;
    L_0x0051:
        r0 = move-exception;
        throw r0;
    L_0x0053:
        r1 = -1;
        r5 = r4.hashCode();	 Catch:{ IllegalArgumentException -> 0x0087 }
        switch(r5) {
            case -1185250696: goto L_0x00a6;
            case 112202875: goto L_0x006b;
            default: goto L_0x005b;
        };
    L_0x005b:
        r0 = r1;
    L_0x005c:
        switch(r0) {
            case 0: goto L_0x008b;
            case 1: goto L_0x009a;
            default: goto L_0x005f;
        };
    L_0x005f:
        r0 = new com.whatsapp.a9u;
        r1 = com.whatsapp.App.aK;
        r1 = r1.e(r3);
        r0.<init>(r3, r1);
        goto L_0x0030;
    L_0x006b:
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x0087 }
        r5 = r4.equals(r5);	 Catch:{ IllegalArgumentException -> 0x0087 }
        if (r5 == 0) goto L_0x005b;
    L_0x0076:
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0089 }
        if (r1 == 0) goto L_0x005c;
    L_0x007a:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0089 }
        r5 = 4;
        r1 = r1[r5];	 Catch:{ IllegalArgumentException -> 0x0089 }
        r1 = r4.equals(r1);	 Catch:{ IllegalArgumentException -> 0x0089 }
        if (r1 == 0) goto L_0x005c;
    L_0x0085:
        r0 = r2;
        goto L_0x005c;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r0 = new com.whatsapp.a9u;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r1 = com.whatsapp.App.aK;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = 3;
        r1 = r1.a(r3, r2);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r0.<init>(r3, r1);	 Catch:{ IllegalArgumentException -> 0x0098 }
        goto L_0x0030;
    L_0x0098:
        r0 = move-exception;
        throw r0;
    L_0x009a:
        r0 = new com.whatsapp.a9u;
        r1 = com.whatsapp.App.aK;
        r1 = r1.a(r3, r2);
        r0.<init>(r3, r1);
        goto L_0x0030;
    L_0x00a6:
        r0 = r1;
        goto L_0x007a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }
}
