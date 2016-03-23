package com.whatsapp.contact;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ContactProvider extends ContentProvider {
    public static final Uri a;
    public static boolean c;
    public static final String[] d;
    public static final Uri e;
    public static final Uri f;
    private static final UriMatcher g;
    private static final String[] z;
    private c b;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 77;
                    break;
                case at.g /*1*/:
                    i2 = 97;
                    break;
                case at.i /*2*/:
                    i2 = 24;
                    break;
                case at.o /*3*/:
                    i2 = 19;
                    break;
                default:
                    i2 = 6;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 6);
        }
        return toCharArray;
    }

    private String a(Uri uri, int i) {
        switch (i) {
            case at.g /*1*/:
            case at.i /*2*/:
                try {
                    return z[27];
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case at.p /*4*/:
            case at.m /*5*/:
                return z[28];
            default:
                throw new IllegalArgumentException(z[29] + uri);
        }
    }

    public boolean onCreate() {
        this.b = new c(getContext());
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r8, android.content.ContentValues r9) {
        /*
        r7 = this;
        r6 = 3;
        r0 = 0;
        r5 = 0;
        r2 = c;
        r1 = g;
        r1 = r1.match(r8);
        if (r1 != r6) goto L_0x003a;
    L_0x000d:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0024 }
        r0 = r9.containsKey(r0);	 Catch:{ IllegalArgumentException -> 0x0024 }
        if (r0 != 0) goto L_0x0026;
    L_0x0018:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0024 }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0024 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0024 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = r7.b;
        r1 = new java.io.File;
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r2 = r9.getAsString(r2);
        r1.<init>(r2);
        r0.a(r1);
    L_0x0039:
        return r8;
    L_0x003a:
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x007a }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x007a }
        r3 = r9.containsKey(r3);	 Catch:{ IllegalArgumentException -> 0x007a }
        if (r3 == 0) goto L_0x0052;
    L_0x0045:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x007a }
        r3 = 2;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x007a }
        r0 = r9.getAsBoolean(r0);	 Catch:{ IllegalArgumentException -> 0x007a }
        r0 = r0.booleanValue();	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x0052:
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x00af }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00af }
        r9.remove(r3);	 Catch:{ IllegalArgumentException -> 0x00af }
        switch(r1) {
            case 1: goto L_0x007c;
            case 2: goto L_0x005d;
            case 3: goto L_0x005d;
            case 4: goto L_0x00b1;
            default: goto L_0x005d;
        };
    L_0x005d:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        if (r0 == 0) goto L_0x008e;
    L_0x007e:
        r0 = r7.b;
        r0 = r0.getWritableDatabase();
        r1 = z;
        r1 = r1[r6];
        r0 = r0.replaceOrThrow(r1, r5, r9);
        if (r2 == 0) goto L_0x009d;
    L_0x008e:
        r0 = r7.b;
        r0 = r0.getWritableDatabase();
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.insertOrThrow(r1, r5, r9);
    L_0x009d:
        r2 = f;
        r8 = android.content.ContentUris.withAppendedId(r2, r0);
        r0 = r7.getContext();
        r0 = r0.getContentResolver();
        r0.notifyChange(r8, r5);
        goto L_0x0039;
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        if (r0 == 0) goto L_0x00c4;
    L_0x00b3:
        r0 = r7.b;
        r0 = r0.getWritableDatabase();
        r1 = z;
        r3 = 6;
        r1 = r1[r3];
        r0 = r0.replaceOrThrow(r1, r5, r9);
        if (r2 == 0) goto L_0x00d4;
    L_0x00c4:
        r0 = r7.b;
        r0 = r0.getWritableDatabase();
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        r0 = r0.insertOrThrow(r1, r5, r9);
    L_0x00d4:
        r2 = f;
        r8 = android.content.ContentUris.withAppendedId(r2, r0);
        r0 = r7.getContext();
        r0 = r0.getContentResolver();
        r0.notifyChange(r8, r5);
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.ContactProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        int match = g.match(uri);
        if (match == 3) {
            try {
                if (this.b.b()) {
                    match = 1;
                } else {
                    match = 0;
                }
                getContext().getContentResolver().notifyChange(uri, null);
                return match;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        String a = a(uri, match);
        if (match == 2 || match == 5) {
            long parseId = ContentUris.parseId(uri);
            str = a(str);
            strArr = a(strArr, parseId);
        }
        match = this.b.getWritableDatabase().delete(a, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return match;
    }

    private String a(String str) {
        try {
            return TextUtils.isEmpty(str) ? z[18] : z[19] + str + ")";
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public String getType(Uri uri) {
        try {
            switch (g.match(uri)) {
                case at.g /*1*/:
                    return z[16];
                case at.i /*2*/:
                    return z[13];
                case at.p /*4*/:
                    return z[14];
                case at.m /*5*/:
                    return z[15];
                default:
                    throw new IllegalArgumentException(z[17] + uri);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    public static boolean a(Uri uri) {
        if (uri != null) {
            try {
                if (TextUtils.equals(uri.getScheme(), z[11])) {
                    if (TextUtils.equals(uri.getAuthority(), z[12])) {
                        return true;
                    }
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return false;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int match = g.match(uri);
        String a = a(uri, match);
        if (match == 2 || match == 5) {
            long parseId = ContentUris.parseId(uri);
            str = a(str);
            strArr = a(strArr, parseId);
        }
        match = this.b.getWritableDatabase().update(a, contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return match;
    }

    static {
        String[] strArr = new String[30];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "\u0012>q}u(\u0013lLi?>jvv!\u0000{vY\u0012";
        int i2 = -1;
        while (true) {
            str = z(z(str));
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0012>q}u(\u0013lLi?>jvv!\u0000{vY\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ":\u0000Gpi#\u0015ypr>";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0012>q}u(\u0013lLi?>jvv!\u0000{vY\u0012";
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ":\u0000Gpi#\u0015ypr>";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ":\u0000Gpi#\u0015ypr\u0012\u0002ycg/\btzr$\u0004k";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "=\u0000l{";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0018\u000fs}i:\u000f8FT\u0004A";
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "=\u0000l{&$\u00128r&?\u0004ifo?\u0004|3p,\rmv";
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ":\u0000Gpi#\u0015ypr\u0012\u0002ycg/\btzr$\u0004k";
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ".\u000evgc#\u0015";
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ".\u000eu=q%\u0000l`g=\u00116ct\"\u0017qwc?O{|h9\u0000{g";
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ";\u000f|=g#\u0005j|o)O{ft>\u000ej=o9\u0004u<p#\u00056pi Oo{g9\u0012ycvc\u0011j|p$\u0005}a(.\u000evgg.\u0015";
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ";\u000f|=g#\u0005j|o)O{ft>\u000ej=b$\u00137eh)O{|kc\u0016prr>\u0000hc(=\u0013weo)\u0004j=e\"\u000flre9O{rv,\u0003q\u007fo9\u0018";
                    i2 = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ";\u000f|=g#\u0005j|o)O{ft>\u000ej=o9\u0004u<p#\u00056pi Oo{g9\u0012ycvc\u0011j|p$\u0005}a(.\u000evgg.\u00156pg=\u0000zzj$\u0015a";
                    i2 = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ";\u000f|=g#\u0005j|o)O{ft>\u000ej=b$\u00137eh)O{|kc\u0016prr>\u0000hc(=\u0013weo)\u0004j=e\"\u000flre9";
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0018\u000fs}i:\u000f8FT\u0004A";
                    i2 = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0012\b|3;m^";
                    i2 = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0012\b|3;m^8RH\tA0";
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = ":\u0000Gpi#\u0015ypr>";
                    i2 = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = ":\u0000Gpi#\u0015ypr\u0012\u0002ycg/\btzr$\u0004k";
                    i2 = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ":\u0000Gpi#\u0015ypr\u0012\u0002ycg/\btzr$\u0004k";
                    i2 = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0012\b|3;m";
                    i2 = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0018\u000fs}i:\u000f8FT\u0004A";
                    i2 = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0012\b|3;m";
                    i2 = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = ":\u0000Gpi#\u0015ypr>";
                    i2 = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = ":\u0000Gpi#\u0015ypr>";
                    i2 = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = ":\u0000Gpi#\u0015ypr\u0012\u0002ycg/\btzr$\u0004k";
                    i2 = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0018\u000fs}i:\u000f8FT\u0004A";
                    i2 = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    z = strArr3;
                    str = ".\u000evgc#\u0015\"<).\u000eu=q%\u0000l`g=\u00116ct\"\u0017qwc?O{|h9\u0000{g).\u000evgg.\u0015k";
                    i2 = -1;
                    while (true) {
                        str = z(z(str));
                        switch (i2) {
                            case v.m /*0*/:
                                e = Uri.parse(str);
                                str = ".\u000evgc#\u0015\"<).\u000eu=q%\u0000l`g=\u00116ct\"\u0017qwc?O{|h9\u0000{g).\u000evgg.\u0015k<e,\u0011yqo!\blzc>";
                                i2 = 1;
                                break;
                            case at.g /*1*/:
                                a = Uri.parse(str);
                                String[] strArr4 = new String[1];
                                str = ".\u000em}re>qw/m K3Y.\u000em}r";
                                i2 = 29;
                                strArr2 = strArr4;
                                strArr3 = strArr4;
                                i = 0;
                                continue;
                            default:
                                f = Uri.parse(str);
                                str = ".\u000evgc#\u0015\"<).\u000eu=q%\u0000l`g=\u00116ct\"\u0017qwc?O{|h9\u0000{g).\u000evgg.\u0015k<b/\u0007q\u007fc";
                                i2 = 0;
                                break;
                        }
                    }
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    d = strArr3;
                    g = new UriMatcher(-1);
                    UriMatcher uriMatcher = g;
                    str = ".\u000eu=q%\u0000l`g=\u00116ct\"\u0017qwc?O{|h9\u0000{g";
                    i2 = -1;
                    while (true) {
                        String z = z(z(str));
                        switch (i2) {
                            case v.m /*0*/:
                                str = ".\u000evgg.\u0015k<%";
                                i2 = 0;
                                break;
                            case at.g /*1*/:
                                str = ".\u000evgg.\u0015k<b/\u0007q\u007fc";
                                i2 = 1;
                                break;
                            case at.i /*2*/:
                                str = ".\u000evgg.\u0015k<e,\u0011yqo!\blzc>";
                                i2 = 2;
                                break;
                            case at.o /*3*/:
                                str = ".\u000evgg.\u0015k<e,\u0011yqo!\blzc>N;";
                                i2 = 3;
                                break;
                            default:
                                str = ".\u000evgg.\u0015k";
                                i2 = -1;
                                break;
                        }
                        str = z(z(str));
                        switch (i2) {
                            case v.m /*0*/:
                                uriMatcher.addURI(z, str, 2);
                                uriMatcher = g;
                                str = ".\u000eu=q%\u0000l`g=\u00116ct\"\u0017qwc?O{|h9\u0000{g";
                                i2 = 1;
                                break;
                            case at.g /*1*/:
                                uriMatcher.addURI(z, str, 3);
                                uriMatcher = g;
                                str = ".\u000eu=q%\u0000l`g=\u00116ct\"\u0017qwc?O{|h9\u0000{g";
                                i2 = 2;
                                break;
                            case at.i /*2*/:
                                uriMatcher.addURI(z, str, 4);
                                uriMatcher = g;
                                str = ".\u000eu=q%\u0000l`g=\u00116ct\"\u0017qwc?O{|h9\u0000{g";
                                i2 = 3;
                                break;
                            case at.o /*3*/:
                                uriMatcher.addURI(z, str, 5);
                                return;
                            default:
                                uriMatcher.addURI(z, str, 1);
                                uriMatcher = g;
                                str = ".\u000eu=q%\u0000l`g=\u00116ct\"\u0017qwc?O{|h9\u0000{g";
                                i2 = 0;
                                break;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "=\u0000l{";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r10, java.lang.String[] r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14) {
        /*
        r9 = this;
        r5 = 0;
        r8 = c;
        r0 = new android.database.sqlite.SQLiteQueryBuilder;
        r0.<init>();
        r1 = r9.b;
        r1 = r1.getReadableDatabase();
        r2 = g;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r2 = r2.match(r10);	 Catch:{ IllegalArgumentException -> 0x00bc }
        switch(r2) {
            case 1: goto L_0x0036;
            case 2: goto L_0x0041;
            case 3: goto L_0x0017;
            case 4: goto L_0x006a;
            case 5: goto L_0x0075;
            default: goto L_0x0017;
        };
    L_0x0017:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3 = 24;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = r1.append(r10);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00be }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00be }
        r0.setTables(r2);	 Catch:{ IllegalArgumentException -> 0x00be }
        if (r8 == 0) goto L_0x009e;
    L_0x0041:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r0.setTables(r2);	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r4 = 25;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r6 = android.content.ContentUris.parseId(r10);	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r2 = r2.append(r6);	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r0.appendWhere(r2);	 Catch:{ IllegalArgumentException -> 0x00c0 }
        if (r8 == 0) goto L_0x009e;
    L_0x006a:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r0.setTables(r2);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r8 == 0) goto L_0x009e;
    L_0x0075:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0034 }
        r0.setTables(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 23;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r6 = android.content.ContentUris.parseId(r10);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.append(r6);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r0.appendWhere(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r8 != 0) goto L_0x0017;
    L_0x009e:
        r2 = r11;
        r3 = r12;
        r4 = r13;
        r6 = r5;
        r7 = r14;
        r1 = r0.query(r1, r2, r3, r4, r5, r6, r7);
        r0 = r9.getContext();	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r0 = r0.getContentResolver();	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r1.setNotificationUri(r0, r10);	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r0 = com.whatsapp.WAAppCompatActivity.c;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        if (r0 == 0) goto L_0x00bb;
    L_0x00b6:
        if (r8 == 0) goto L_0x00c8;
    L_0x00b8:
        r0 = 0;
    L_0x00b9:
        c = r0;
    L_0x00bb:
        return r1;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = 1;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.ContactProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    private String[] a(String[] strArr, long j) {
        if (strArr == null) {
            try {
                return new String[]{String.valueOf(j)};
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        strArr2[0] = String.valueOf(j);
        return strArr2;
    }
}
