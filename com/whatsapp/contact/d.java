package com.whatsapp.contact;

import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.support.annotation.Nullable;
import android.telephony.PhoneNumberUtils;
import com.whatsapp.App;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class d {
    private static final String[] f;
    private static final String[] g;
    private static boolean h;
    private static final String[] k;
    private static final String[] z;
    private final String a;
    private final long b;
    private final String c;
    private final String d;
    private boolean e;
    private final int i;
    private String j;
    private final String l;

    public int f() {
        return this.i;
    }

    public static boolean a(String str) {
        try {
            if (5 <= str.length()) {
                if (str.length() <= 20) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    @Nullable
    static Cursor a(f fVar, String str) {
        Cursor cursor = null;
        try {
            if (App.p.o(z[8]) != 0) {
                Log.i(z[7]);
            } else {
                Log.i(z[10]);
                cursor = App.at.query(Phone.CONTENT_URI, f, fVar.getWhereClause(), fVar.getWhereArgs(), null);
                try {
                    Log.i(z[9]);
                    if (cursor != null) {
                        Log.i(str + fVar.name() + '/' + cursor.getCount());
                    }
                } catch (NullPointerException e) {
                    throw e;
                }
            }
            return cursor;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static d a(Cursor cursor) {
        String str = null;
        String stripSeparators = PhoneNumberUtils.stripSeparators(cursor.getString(2));
        try {
            if (!PhoneNumberUtils.isGlobalPhoneNumber(stripSeparators)) {
                return null;
            }
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            int i = cursor.getInt(3);
            String string2 = cursor.getString(4);
            try {
                if (h) {
                    str = cursor.getString(5);
                }
                return new d(j, string, stripSeparators, i, string2, str);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public int hashCode() {
        boolean z = false;
        boolean z2 = i.d;
        try {
            int hashCode = (a() == null ? 0 : a().hashCode()) + ((((((((int) (this.b >>> 32)) + 0) * 31) + ((int) this.b)) * 31) + this.i) * 31);
            try {
                if (WAAppCompatActivity.c != 0) {
                    if (!z2) {
                        z = true;
                    }
                    i.d = z;
                }
                return hashCode;
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    private d(long j, String str, String str2, int i, String str3, String str4) {
        if (str2 == null) {
            throw new NullPointerException(z[11]);
        }
        try {
            this.b = j;
            this.c = str;
            this.a = str2;
            this.i = i;
            this.d = str3;
            this.l = str4;
            this.e = h;
            if (h) {
                this.j = str4;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public String g() {
        return this.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        if (r7 != 0) goto L_0x0005;
    L_0x0004:
        return r1;
    L_0x0005:
        if (r6 != r7) goto L_0x0009;
    L_0x0007:
        r1 = r0;
        goto L_0x0004;
    L_0x0009:
        r2 = r6.getClass();	 Catch:{ NullPointerException -> 0x0065 }
        r3 = r7.getClass();	 Catch:{ NullPointerException -> 0x0065 }
        if (r2 != r3) goto L_0x0004;
    L_0x0013:
        r7 = (com.whatsapp.contact.d) r7;
        r2 = r6.b();	 Catch:{ NullPointerException -> 0x0067 }
        r4 = r7.b();	 Catch:{ NullPointerException -> 0x0067 }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0073;
    L_0x0021:
        r2 = r6.g();	 Catch:{ NullPointerException -> 0x0069 }
        r3 = r7.g();	 Catch:{ NullPointerException -> 0x0069 }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ NullPointerException -> 0x0069 }
        if (r2 == 0) goto L_0x0073;
    L_0x002f:
        r2 = r6.a();	 Catch:{ NullPointerException -> 0x006b }
        r3 = r7.a();	 Catch:{ NullPointerException -> 0x006b }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ NullPointerException -> 0x006b }
        if (r2 == 0) goto L_0x0073;
    L_0x003d:
        r2 = r6.f();	 Catch:{ NullPointerException -> 0x006d }
        r3 = r7.f();	 Catch:{ NullPointerException -> 0x006d }
        if (r2 != r3) goto L_0x0073;
    L_0x0047:
        r2 = r6.d();	 Catch:{ NullPointerException -> 0x006f }
        r3 = r7.d();	 Catch:{ NullPointerException -> 0x006f }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ NullPointerException -> 0x006f }
        if (r2 == 0) goto L_0x0073;
    L_0x0055:
        r2 = r6.c();	 Catch:{ NullPointerException -> 0x0071 }
        r3 = r7.c();	 Catch:{ NullPointerException -> 0x0071 }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ NullPointerException -> 0x0071 }
        if (r2 == 0) goto L_0x0073;
    L_0x0063:
        r1 = r0;
        goto L_0x0004;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = r1;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.d.equals(java.lang.Object):boolean");
    }

    static {
        boolean z = true;
        String[] strArr = new String[12];
        String str = "Q\\I\"x\u0015\u0000\u001d|";
        boolean z2 = true;
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
                        i3 = 53;
                        break;
                    case at.g /*1*/:
                        i3 = 61;
                        break;
                    case at.i /*2*/:
                        i3 = 61;
                        break;
                    case at.o /*3*/:
                        i3 = 67;
                        break;
                    default:
                        i3 = 73;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001aMX1$\\NN*&[bY&'\\XY";
                    i = 2;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "G\\J\u001c*ZSI\"*AbT'i\b\u001d\u0002c\b{y\u001d. XXI:9P\u001d\u0000cv";
                    i = 3;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "Q\\I\"~";
                    i = 4;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "CSYm([YO, Q\u0013^6;FROm AXPl'TPX";
                    z2 = true;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Q\\I\"p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "EUR-,\u001aZX7*@ON,;\u001aMX1$\\NN*&[bY&'\\XY";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "TSY1&\\Y\u00133,GPT0:\\RSm\u001bp|y\u001c\nzsi\u0002\nan";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "EUR-,\u001aZX7*@ON,;\u001aLH&;L\u0012X--";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "EUR-,\u001aZX7*@ON,;\u001aLH&;L\u0012N7(GI";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "[HP!,G\u001dP6:A\u001dS,=\u0015_Xc'@QQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    strArr = new String[5];
                    str = "G\\J\u001c*ZSI\"*AbT'";
                    z2 = true;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case Y.j /*11*/:
                    try {
                        strArr2[i] = str;
                        str = "QTN3%TDb-(XX";
                        z2 = true;
                        i = 1;
                        strArr2 = strArr3;
                        break;
                    } catch (NullPointerException e) {
                        throw e;
                    }
                case Y.p /*12*/:
                    strArr2[i] = str;
                    str = "Q\\I\"x";
                    z2 = true;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    str = "Q\\I\"{";
                    z2 = true;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    str = "Q\\I\"z";
                    z2 = true;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    k = strArr3;
                    strArr = new String[6];
                    str = "G\\J\u001c*ZSI\"*AbT'";
                    z2 = true;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    str = "QTN3%TDb-(XX";
                    z2 = true;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    str = "Q\\I\"x";
                    z2 = true;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    str = "Q\\I\"{";
                    z2 = true;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    str = "Q\\I\"z";
                    z2 = true;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "FRO7\u0016^XD";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    g = strArr3;
                    if (VERSION.SDK_INT < 11) {
                        z = false;
                    }
                    try {
                        String[] strArr4;
                        h = z;
                        if (VERSION.SDK_INT >= 11) {
                            strArr4 = g;
                        } else {
                            strArr4 = k;
                        }
                        f = strArr4;
                        return;
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                default:
                    strArr2[i] = str;
                    str = "TSY1&\\Y\u00133,GPT0:\\RSm\u001bp|y\u001c\nzsi\u0002\nan";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    public String d() {
        return this.d;
    }

    public String c() {
        return this.l;
    }

    static Cursor a(String str, String str2) {
        Cursor cursor = null;
        try {
            if (App.p.o(z[1]) != 0) {
                Log.i(str2 + str + z[2]);
            } else {
                cursor = App.at.query(Phone.CONTENT_URI, f, z[0], new String[]{str}, null);
                if (cursor != null) {
                    Log.i(str2 + str + '/' + cursor.getCount());
                }
            }
            return cursor;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public String a() {
        return this.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String e() {
        /*
        r10 = this;
        r6 = 0;
        r1 = 2;
        r4 = 0;
        r3 = 1;
        r7 = com.whatsapp.contact.i.d;
        r0 = r10.e;	 Catch:{ NullPointerException -> 0x000d }
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        r0 = r10.j;	 Catch:{ NullPointerException -> 0x000d }
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r2 = new java.lang.String[r1];
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        r2[r4] = r0;
        r0 = z;
        r1 = 6;
        r0 = r0[r1];
        r2[r3] = r0;
        r0 = com.whatsapp.App.at;	 Catch:{ all -> 0x00b4 }
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;	 Catch:{ all -> 0x00b4 }
        r3 = z;	 Catch:{ all -> 0x00b4 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ all -> 0x00b4 }
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x00b4 }
        r5 = 0;
        r8 = r10.b();	 Catch:{ all -> 0x00b4 }
        r8 = java.lang.Long.toString(r8);	 Catch:{ all -> 0x00b4 }
        r4[r5] = r8;	 Catch:{ all -> 0x00b4 }
        r5 = 1;
        r8 = z;	 Catch:{ all -> 0x00b4 }
        r9 = 5;
        r8 = r8[r9];	 Catch:{ all -> 0x00b4 }
        r4[r5] = r8;	 Catch:{ all -> 0x00b4 }
        r5 = 0;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00b4 }
        if (r1 == 0) goto L_0x0092;
    L_0x0045:
        r0 = 1;
        r10.e = r0;	 Catch:{ NullPointerException -> 0x009b }
        r0 = r1.moveToNext();	 Catch:{ NullPointerException -> 0x009b }
        if (r0 == 0) goto L_0x0092;
    L_0x004e:
        r0 = 0;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x009d }
        r2 = 1;
        r2 = r1.getString(r2);	 Catch:{ all -> 0x009d }
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ NullPointerException -> 0x00a4 }
        if (r3 != 0) goto L_0x0080;
    L_0x005e:
        r3 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NullPointerException -> 0x00a4 }
        if (r3 != 0) goto L_0x0080;
    L_0x0064:
        r3 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00a6 }
        r3.<init>();	 Catch:{ NullPointerException -> 0x00a6 }
        r3 = r3.append(r2);	 Catch:{ NullPointerException -> 0x00a6 }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ NullPointerException -> 0x00a6 }
        r3 = r3.append(r0);	 Catch:{ NullPointerException -> 0x00a6 }
        r3 = r3.toString();	 Catch:{ NullPointerException -> 0x00a6 }
        r10.j = r3;	 Catch:{ NullPointerException -> 0x00a6 }
        if (r7 == 0) goto L_0x0092;
    L_0x0080:
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ NullPointerException -> 0x00a8 }
        if (r3 != 0) goto L_0x008a;
    L_0x0086:
        r10.j = r2;	 Catch:{ NullPointerException -> 0x00aa }
        if (r7 == 0) goto L_0x0092;
    L_0x008a:
        r2 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NullPointerException -> 0x00ac }
        if (r2 != 0) goto L_0x0092;
    L_0x0090:
        r10.j = r0;	 Catch:{ NullPointerException -> 0x00ae }
    L_0x0092:
        if (r1 == 0) goto L_0x0097;
    L_0x0094:
        r1.close();	 Catch:{ NullPointerException -> 0x00b0 }
    L_0x0097:
        r0 = r10.j;
        goto L_0x000c;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009d }
    L_0x009d:
        r0 = move-exception;
    L_0x009e:
        if (r1 == 0) goto L_0x00a3;
    L_0x00a0:
        r1.close();	 Catch:{ NullPointerException -> 0x00b2 }
    L_0x00a3:
        throw r0;
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a8 }
    L_0x00a8:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00aa }
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009d }
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r0 = move-exception;
        r1 = r6;
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.d.e():java.lang.String");
    }

    public long b() {
        return this.b;
    }

    static d a(Context context, String str, String str2) {
        String stripSeparators = PhoneNumberUtils.stripSeparators(str2);
        try {
            if (!PhoneNumberUtils.isGlobalPhoneNumber(stripSeparators)) {
                return null;
            }
            return new d(-2, str, stripSeparators, 0, context.getString(2131230961), null);
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
