package com.whatsapp.gdrive;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog.Builder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.whatsapp.App;
import com.whatsapp.a1;
import com.whatsapp.arj;
import com.whatsapp.fieldstats.aq;
import com.whatsapp.js;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.Map.Entry;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class fn {
    private static final String[] z;

    static {
        String[] strArr = new String[49];
        String str = "Dwd";
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
                        i3 = 110;
                        break;
                    case at.g /*1*/:
                        i3 = 93;
                        break;
                    case at.i /*2*/:
                        i3 = 78;
                        break;
                    case at.o /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "1\u0014\u0000. <\u0013\u000f6:(\u0014\u0002?61";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "1\u0014\u0000. <\u0013\u000f6:(\u0014\u0002?61";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "N3!\u000eE\u00073n!";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\t9<\u0013\u0013\u000bp;\u000e\f\u0002r-\u0015\u000b\u00188<\u000eH\u001b-\"\u0015\u0004\np:\u0013\u0011\u00028c\u000e\nC1!\u0019\u0004\u0002p>\u001b\u0011\u0006";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\t9<\u0013\u0013\u000bgn\u000f\u0015\u00022/\u001eE\u001a4:\u0016\u0000N0/\n\u0016N)!Z\f\u0000+/\u0016\f\n}\"\u0015\u0006\u000f1n\n\u0004\u001a5";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "N3!\u000eE\u00073n";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\t9<\u0013\u0013\u000bp;\u000e\f\u0002r-\u0015\u000b\u00188<\u000eH\u001b-\"\u0015\u0004\np:\u0013\u0011\u00028c\u000e\nC1!\u0019\u0004\u0002p>\u001b\u0011\u0006r\"\u0015\u0006\u000f1c\n\u0004\u001a5c\u000f\u000b\u000b%>\u001f\u0006\u001a8*U\u0017\u000b);\b\u000bC3;\u0016\tN";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\t9<\u0013\u0013\u000bp;\u000e\f\u0002r-\u0015\u000b\u00188<\u000eH\u001b-\"\u0015\u0004\np:\u0013\u0011\u00028c\u000e\nC1!\u0019\u0004\u0002p>\u001b\u0011\u0006r\"\u0015\u0006\u000f1c\n\u0004\u001a5c\u000f\u000b\u000b%>\u001f\u0006\u001a8*U\u0017\u000b);\b\u000bC3;\u0016\tN";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001a2:\u001b\tN.'\u0000\u0000Tx*VE\r5/\u000eE\u001d44\u001f_K9bZ\b\u000b9'\u001bE\u001d44\u001f_K9bZ\b\u000b9'\u001bE\b4\"\u001f\u0016N>!\u000f\u000b\u001agk\u001eE\u001c8:\b\u001c-2;\u0014\u0011Tx*Z\f\u0000>\"\u000f\u0001\u000b\u000b'\u001e\u0000\u0001.t_\u0007N*'\u001c\fC2 W\u0003\u00073'\t\rTx,Z\u0003\u000f4\"\u000f\u0017\u000bp=\u000e\u0004\t8t_\u0001N/+\t\u0010\u0002)t_\u0001";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u00198+\u0011\t\u0017";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u00032 \u000e\r\u0002$";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ";3+\u0002\u0015\u000b>:\u001f\u0001N?/\u0019\u000e\u001b-n\u001c\u0017\u000b,;\u001f\u000b\r$tZ";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0001;(";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\n<'\u0016\u001c";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0003< \u000f\u0004\u0002";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u00022-\u001b\tC;'\u0016\u0000C9!\u001f\u0016C3!\u000eH\u000b%'\t\u0011";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u001b3+\u0002\u0015\u000b>:\u001f\u0001N;'\u0016\u0000C.:\u001b\u0011\u001b.tZ";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u001c8#\u0015\u0011\u000bp(\u0013\t\u000bp*\u0015\u0000\u001dp \u0015\u0011C86\u0013\u0016\u001a";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u001c8#\u0015\u0011\u000bp(\u0013\t\u000bp*\u0013\u0003\b8<\u001f\u000b\u001ap(\b\n\u0003p\"\u0015\u0006\u000f1";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001c8#\u0015\u0011\u000bp(\u0013\t\u000bp=\u001b\b\u000bp/\tH\u00022-\u001b\t";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "1\u0014\u0000. <\u0013\u000f6:(\u0014\u0002?61";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = ";3+\u0002\u0015\u000b>:\u001f\u0001N;'\u0016\u0000T}";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "1\u0014\u0000. <\u0013\u000f6:(\u0014\u0002?61";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\t2!\u001d\t\u000bp*\b\f\u00188c\u001c\u0010\u00021";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\b4\"\u001fH\u00002:W\u0003\u0001( \u001e";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u00002 \u001f";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\t2!\u001d\t\u000bp*\b\f\u00188c\u0014\n\u001ap<\u001f\u0004\r5/\u0018\t\u000b";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u00022-\u001b\tC:*\b\f\u00188c\u001c\f\u00028c\u0017\u0004\u001ep'\tH\u00034=\t\f\u0000:";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u00022-\u001b\tC>&\u001b\u0011C?/\u0019\u000e\u001b-c\u0017\f\u001d.'\u0014\u0002";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\t9<\u0013\u0013\u000bp=\u001f\u0017\u00188<\tH\u000f/+W\u000b\u0001)c\r\n\u001c6'\u0014\u0002C-<\u0015\u0015\u000b/\"\u0003";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u001b3+\u0002\u0015\u000b>:\u001f\u0001N8<\b\n\u001cgn";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u000f(:\u0012H\b<'\u0016\u0000\n";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u001c8/\u001eH\u000b%:\u001f\u0017\u0000<\"W\u0016\u001a2<\u001b\u0002\u000bp>\u001f\u0017\u00034=\t\f\u00013c\u0013\u0016C0'\t\u0016\u00073)";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\t-=W\u0010\u0000<8\u001b\f\u0002<,\u0016\u0000";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u000f>-\u0015\u0010\u0000)c\u0017\f\u001d.'\u0014\u0002";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\f<=\u001fH\b2\"\u001e\u0000\u001cp*\u0015\u0000\u001dp \u0015\u0011C86\u0013\u0016\u001a";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\b<'\u0016\u0000\np:\u0015H\u000f(:\u0012\u0000\u0000)'\u0019\u0004\u001a8c\r\f\u001a5c\r\r\u000f)=\u001b\u0015\u001ep=\u001f\u0017\u00188<\t";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u00022-\u001b\tC.:\u0015\u0017\u000f:+W\u0003\u001b1\"";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "#\u0019{";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\t9<\u0013\u0013\u000bp;\u000e\f\u0002r)\u001f\u0011C0*O";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u001d8<\f\f\r8c\u0013\u000b\u0018<\"\u0013\u0001";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u001b3+\u0002\u0015\u000b>:\u001f\u0001C/+\u000e\u0010\u001c3c\u0019\n\n8tZ";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u001d8<\f\f\r8c\u0017\f\u001d.'\u0014\u0002";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u001d8<\f\f\r8c\f\u0000\u001c.'\u0015\u000bC(>\u001e\u0004\u001a8c\b\u0000\u001f('\b\u0000\n";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u001d8<\f\f\r8c\u001e\f\u001d<,\u0016\u0000\n";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u001d(-\u0019\u0000\u001d.";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "'38\u001b\t\u00079n\u001e\f\u001d)<\u0013\u0007\u001b)'\u0015\u000bN)7\n\u0000";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\t9<\u0013\u0013\u000bgn\u000f\u0015\u00022/\u001eE\u001a4:\u0016\u0000N0/\n\u0016N)!Z\f\u0000+/\u0016\f\n}\"\u0015\u0006\u000f1n\n\u0004\u001a5";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static String a(@NonNull aq aqVar) {
        return String.format(Locale.ENGLISH, z[10], new Object[]{Integer.valueOf(a(aqVar.l)), Integer.valueOf(a(aqVar.i)), Integer.valueOf(a(aqVar.c)), Integer.valueOf(a(aqVar.a)), Integer.valueOf(a(aqVar.h)), aqVar.e, aqVar.o, Integer.valueOf(a(aqVar.b)), Integer.valueOf(a(aqVar.k))});
    }

    public static String a() {
        return z[22];
    }

    static String a(String str, String str2, String str3) {
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build().toString();
    }

    static void a(HttpURLConnection httpURLConnection) {
        boolean z = GoogleDriveService.c;
        for (Entry entry : httpURLConnection.getRequestProperties().entrySet()) {
            if (z) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(@com.whatsapp.a1 int r5, @com.whatsapp.js int r6) {
        /*
        r4 = 3;
        r3 = 2;
        r1 = 1;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        switch(r5) {
            case 0: goto L_0x001f;
            case 1: goto L_0x0029;
            case 2: goto L_0x0018;
            case 3: goto L_0x0016;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = new java.lang.IllegalStateException;	 Catch:{ RuntimeException -> 0x0014 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0014 }
        r2 = 48;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0014 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0014 }
        throw r0;	 Catch:{ RuntimeException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        if (r2 == 0) goto L_0x0033;
    L_0x0018:
        if (r6 == r3) goto L_0x001c;
    L_0x001a:
        if (r6 != r4) goto L_0x0034;
    L_0x001c:
        r0 = r1;
    L_0x001d:
        if (r2 == 0) goto L_0x0038;
    L_0x001f:
        if (r6 == r3) goto L_0x0023;
    L_0x0021:
        if (r6 != r4) goto L_0x0025;
    L_0x0023:
        if (r2 == 0) goto L_0x0033;
    L_0x0025:
        r0 = com.whatsapp.a59.r;
        if (r2 == 0) goto L_0x0036;
    L_0x0029:
        if (r6 == r3) goto L_0x002d;
    L_0x002b:
        if (r6 != r4) goto L_0x002f;
    L_0x002d:
        if (r2 == 0) goto L_0x0033;
    L_0x002f:
        r1 = com.whatsapp.a59.k;
        if (r2 != 0) goto L_0x0008;
    L_0x0033:
        return r1;
    L_0x0034:
        r0 = 0;
        goto L_0x001d;
    L_0x0036:
        r1 = r0;
        goto L_0x0033;
    L_0x0038:
        r1 = r0;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fn.b(int, int):boolean");
    }

    static Dialog a(int i, Activity activity, int i2, OnCancelListener onCancelListener, boolean z) {
        OnClickListener bmVar = new bm(i, activity, i2);
        Builder builder = new Builder(activity);
        try {
            builder.setCancelable(false);
            builder.setNegativeButton(2131232028, new b(onCancelListener));
            int i3;
            switch (i) {
                case v.m /*0*/:
                    return null;
                case at.g /*1*/:
                    if (z) {
                        i3 = 2131231254;
                    } else {
                        i3 = 2131231255;
                    }
                    return builder.setTitle(2131231257).setMessage(i3).setPositiveButton(2131231256, bmVar).create();
                case at.i /*2*/:
                    if (z) {
                        i3 = 2131231263;
                    } else {
                        i3 = 2131231264;
                    }
                    return builder.setTitle(2131231265).setMessage(i3).setPositiveButton(2131231262, bmVar).create();
                case at.o /*3*/:
                    if (z) {
                        i3 = 2131231258;
                    } else {
                        i3 = 2131231259;
                    }
                    return builder.setTitle(2131231261).setMessage(i3).setPositiveButton(2131231260, bmVar).create();
                default:
                    return GooglePlayServicesUtil.getErrorDialog(i, activity, i2, onCancelListener);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static void a(HttpRequestBase httpRequestBase) {
        boolean z = GoogleDriveService.c;
        Header[] allHeaders = httpRequestBase.getAllHeaders();
        int length = allHeaders.length;
        int i = 0;
        while (i < length) {
            Header header = allHeaders[i];
            i++;
            if (z) {
                return;
            }
        }
    }

    private static int a(@Nullable Double d) {
        if (d == null) {
            return -1;
        }
        try {
            return (int) d.doubleValue();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static String a(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("@");
        if (indexOf <= 1) {
            return str;
        }
        try {
            return str.charAt(0) + z[0] + str.substring(indexOf - 1);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static boolean a(@NonNull Activity activity) {
        try {
            if (activity.isFinishing()) {
                return true;
            }
            try {
                if (activity instanceof GoogleDriveActivity) {
                    if (((GoogleDriveActivity) activity).c()) {
                        return true;
                    }
                }
                try {
                    if (activity instanceof SettingsGoogleDrive) {
                        if (((SettingsGoogleDrive) activity).j()) {
                            return true;
                        }
                    }
                    try {
                        if (VERSION.SDK_INT >= 17) {
                            return activity.isDestroyed();
                        }
                        return false;
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (RuntimeException e22) {
                    throw e22;
                }
            } catch (RuntimeException e222) {
                throw e222;
            } catch (RuntimeException e2222) {
                throw e2222;
            }
        } catch (RuntimeException e22222) {
            throw e22222;
        }
    }

    public static String a(@fk int i) {
        switch (i) {
            case Y.t /*10*/:
                try {
                    return z[27];
                } catch (RuntimeException e) {
                    throw e;
                }
            case Y.j /*11*/:
                return z[33];
            case Y.p /*12*/:
                return z[36];
            case Y.q /*13*/:
                return z[25];
            case arj.Toolbar_titleMarginEnd /*14*/:
                return z[28];
            case arj.Toolbar_titleMarginTop /*15*/:
                return z[39];
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                return z[30];
            case arj.Toolbar_maxButtonHeight /*17*/:
                return z[26];
            case arj.Toolbar_collapseIcon /*18*/:
                return z[37];
            case arj.Toolbar_collapseContentDescription /*19*/:
                return z[31];
            case arj.Toolbar_navigationIcon /*20*/:
                return z[38];
            case arj.Toolbar_navigationContentDescription /*21*/:
                return z[35];
            case arj.Toolbar_logoDescription /*22*/:
                return z[29];
            case arj.Toolbar_titleTextColor /*23*/:
                return z[34];
            default:
                throw new IllegalArgumentException(z[32] + i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.io.File r13, long r14) {
        /*
        r0 = 0;
        r1 = 0;
        r3 = com.whatsapp.gdrive.GoogleDriveService.c;
        r2 = z;	 Catch:{ NoSuchAlgorithmException -> 0x0015 }
        r4 = 40;
        r2 = r2[r4];	 Catch:{ NoSuchAlgorithmException -> 0x0015 }
        r6 = java.security.MessageDigest.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0015 }
        r2 = r13.exists();	 Catch:{ NoSuchAlgorithmException -> 0x001c }
        if (r2 != 0) goto L_0x001e;
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r4 = r13.length();	 Catch:{ NoSuchAlgorithmException -> 0x0069 }
        r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x0014;
    L_0x0026:
        r2 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r7 = new byte[r2];
        r6.reset();
        r4 = 0;
        r2 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x00a7, all -> 0x00a3 }
        r8 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00a7, all -> 0x00a3 }
        r8.<init>(r13);	 Catch:{ IOException -> 0x00a7, all -> 0x00a3 }
        r2.<init>(r8);	 Catch:{ IOException -> 0x00a7, all -> 0x00a3 }
    L_0x0039:
        r8 = -1;
        if (r1 == r8) goto L_0x005d;
    L_0x003c:
        r1 = 0;
        r8 = r7.length;	 Catch:{ IOException -> 0x006f }
        r1 = r2.read(r7, r1, r8);	 Catch:{ IOException -> 0x006f }
        if (r1 <= 0) goto L_0x0039;
    L_0x0044:
        r8 = (long) r1;
        r8 = r8 + r4;
        r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r8 >= 0) goto L_0x0050;
    L_0x004a:
        r8 = 0;
        r6.update(r7, r8, r1);	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        if (r3 == 0) goto L_0x0059;
    L_0x0050:
        r8 = 0;
        r10 = r14 - r4;
        r9 = (int) r10;
        r6.update(r7, r8, r9);	 Catch:{ NoSuchAlgorithmException -> 0x006d }
        if (r3 == 0) goto L_0x005d;
    L_0x0059:
        r8 = (long) r1;
        r4 = r4 + r8;
        if (r3 == 0) goto L_0x0039;
    L_0x005d:
        r1 = r6.digest();	 Catch:{ IOException -> 0x006f }
        r0 = com.whatsapp.ve.b(r1);	 Catch:{ IOException -> 0x006f }
        com.whatsapp.util.ao.a(r2);
        goto L_0x0014;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r1 = move-exception;
        throw r1;	 Catch:{ NoSuchAlgorithmException -> 0x006d }
    L_0x006d:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x006f }
    L_0x006f:
        r1 = move-exception;
    L_0x0070:
        r3 = r13.getAbsolutePath();	 Catch:{ NoSuchAlgorithmException -> 0x0093 }
        r4 = com.whatsapp.App.a3;	 Catch:{ NoSuchAlgorithmException -> 0x0093 }
        r4 = r4.getAbsolutePath();	 Catch:{ NoSuchAlgorithmException -> 0x0093 }
        r3 = r3.startsWith(r4);	 Catch:{ NoSuchAlgorithmException -> 0x0093 }
        if (r3 == 0) goto L_0x0095;
    L_0x0080:
        r3 = com.whatsapp.App.aO();	 Catch:{ NoSuchAlgorithmException -> 0x0093 }
        if (r3 != 0) goto L_0x0095;
    L_0x0086:
        r0 = new com.whatsapp.gdrive.ez;	 Catch:{ NoSuchAlgorithmException -> 0x008c }
        r0.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x008c }
        throw r0;	 Catch:{ NoSuchAlgorithmException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008e }
    L_0x008e:
        r0 = move-exception;
    L_0x008f:
        com.whatsapp.util.ao.a(r2);
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchAlgorithmException -> 0x008c }
    L_0x0095:
        r3 = z;	 Catch:{ all -> 0x008e }
        r4 = 41;
        r3 = r3[r4];	 Catch:{ all -> 0x008e }
        com.whatsapp.util.Log.b(r3, r1);	 Catch:{ all -> 0x008e }
        com.whatsapp.util.ao.a(r2);
        goto L_0x0014;
    L_0x00a3:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x008f;
    L_0x00a7:
        r1 = move-exception;
        r2 = r0;
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fn.a(java.io.File, long):java.lang.String");
    }

    @Nullable
    public static String a(@Nullable InputStream inputStream) {
        boolean z = GoogleDriveService.c;
        if (inputStream == null) {
            return null;
        }
        char[] cArr = new char[8192];
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        StringWriter stringWriter = new StringWriter();
        do {
            int read = inputStreamReader.read(cArr);
            if (read <= 0 && !z) {
                break;
            }
            try {
                stringWriter.write(cArr, 0, read);
            } catch (RuntimeException e) {
                throw e;
            }
        } while (!z);
        inputStreamReader.close();
        return stringWriter.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static long a(java.io.File r13, boolean r14) {
        /*
        r4 = 1;
        r2 = 0;
        r9 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = r13.exists();	 Catch:{ RuntimeException -> 0x000e }
        if (r0 != 0) goto L_0x0010;
    L_0x000c:
        r0 = r2;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = r13.isDirectory();	 Catch:{ RuntimeException -> 0x0022 }
        if (r0 != 0) goto L_0x002a;
    L_0x0016:
        if (r14 != 0) goto L_0x0020;
    L_0x0018:
        r0 = r13.length();	 Catch:{ RuntimeException -> 0x0026 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0028;
    L_0x0020:
        r0 = r4;
        goto L_0x000d;
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = r2;
        goto L_0x000d;
    L_0x002a:
        r10 = new java.util.LinkedList;
        r10.<init>();
        r10.add(r13);
        r6 = r2;
    L_0x0033:
        r0 = r10.peek();
        if (r0 == 0) goto L_0x0085;
    L_0x0039:
        r0 = r10.poll();
        r0 = (java.io.File) r0;
        r11 = r0.listFiles();
        if (r11 == 0) goto L_0x0083;
    L_0x0045:
        r12 = r11.length;
        r0 = 0;
        r8 = r0;
    L_0x0048:
        if (r8 >= r12) goto L_0x0083;
    L_0x004a:
        r0 = r11[r8];
        r1 = r0.exists();	 Catch:{ RuntimeException -> 0x0072 }
        if (r1 == 0) goto L_0x0081;
    L_0x0052:
        r1 = r0.isDirectory();	 Catch:{ RuntimeException -> 0x0074 }
        if (r1 == 0) goto L_0x005d;
    L_0x0058:
        r10.add(r0);	 Catch:{ RuntimeException -> 0x0076 }
        if (r9 == 0) goto L_0x0081;
    L_0x005d:
        if (r14 != 0) goto L_0x0067;
    L_0x005f:
        r0 = r0.length();	 Catch:{ RuntimeException -> 0x007a }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x007c;
    L_0x0067:
        r0 = r4;
    L_0x0068:
        r6 = r6 + r0;
        r0 = r6;
    L_0x006a:
        r6 = r8 + 1;
        if (r9 == 0) goto L_0x007e;
    L_0x006e:
        if (r9 != 0) goto L_0x000d;
    L_0x0070:
        r6 = r0;
        goto L_0x0033;
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r0 = r2;
        goto L_0x0068;
    L_0x007e:
        r8 = r6;
        r6 = r0;
        goto L_0x0048;
    L_0x0081:
        r0 = r6;
        goto L_0x006a;
    L_0x0083:
        r0 = r6;
        goto L_0x006e;
    L_0x0085:
        r0 = r6;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fn.a(java.io.File, boolean):long");
    }

    public static String b(String str) {
        try {
            String replace;
            if (str.startsWith(App.a3.getAbsolutePath())) {
                replace = str.replace(App.a3.getAbsolutePath() + "/", "");
            } else {
                File filesDir = App.z().getFilesDir();
                try {
                    if (str.startsWith(filesDir.getAbsolutePath())) {
                        replace = str.replace(filesDir.getAbsolutePath(), z[24]);
                    } else {
                        throw new IllegalArgumentException(z[23] + str);
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            return replace;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static String c(int i) {
        switch (i) {
            case v.m /*0*/:
                try {
                    return z[47];
                } catch (RuntimeException e) {
                    throw e;
                }
            case at.g /*1*/:
                return z[44];
            case at.i /*2*/:
                return z[45];
            case at.o /*3*/:
                return z[46];
            case Y.l /*9*/:
                return z[42];
            default:
                return z[43] + i;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(java.lang.String r9) {
        /*
        r8 = 7;
        r7 = 3;
        r6 = 1;
        r1 = 0;
        r0 = z;
        r2 = 2;
        r0 = r0[r2];
        r0 = r9.startsWith(r0);
        if (r0 == 0) goto L_0x00af;
    L_0x000f:
        r0 = z;	 Catch:{ IOException -> 0x0041 }
        r2 = 3;
        r0 = r0[r2];	 Catch:{ IOException -> 0x0041 }
        r2 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0041 }
        r2 = r2.getFilesDir();	 Catch:{ IOException -> 0x0041 }
        r2 = r2.getAbsolutePath();	 Catch:{ IOException -> 0x0041 }
        r0 = r9.replace(r0, r2);	 Catch:{ IOException -> 0x0041 }
        r2 = new java.io.File;	 Catch:{ IOException -> 0x0041 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0041 }
        r0 = r2.getCanonicalPath();	 Catch:{ IOException -> 0x0041 }
        r2 = com.whatsapp.App.z();
        r2 = com.whatsapp.gdrive.GoogleDriveService.b(r2);
        r3 = new java.io.File;	 Catch:{ IOException -> 0x004c }
        r3.<init>(r0);	 Catch:{ IOException -> 0x004c }
        r3 = r2.contains(r3);	 Catch:{ IOException -> 0x004c }
        if (r3 == 0) goto L_0x004e;
    L_0x0040:
        return r0;
    L_0x0041:
        r0 = move-exception;
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = r1;
        goto L_0x0040;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00a5 }
        r3.<init>();	 Catch:{ IOException -> 0x00a5 }
        r4 = z;	 Catch:{ IOException -> 0x00a5 }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ IOException -> 0x00a5 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x00a5 }
        r0 = r3.append(r0);	 Catch:{ IOException -> 0x00a5 }
        r3 = z;	 Catch:{ IOException -> 0x00a5 }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00a5 }
        r0 = r0.append(r3);	 Catch:{ IOException -> 0x00a5 }
        r3 = " ";
        r2 = android.text.TextUtils.join(r3, r2);	 Catch:{ IOException -> 0x00a5 }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x00a5 }
        r2 = "]";
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x00a5 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x00a5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x00a5 }
        r0 = com.whatsapp.App.am;	 Catch:{ IOException -> 0x00a5 }
        if (r0 == 0) goto L_0x008b;
    L_0x0087:
        r0 = com.whatsapp.App.j;	 Catch:{ IOException -> 0x00a7 }
        if (r0 == 0) goto L_0x008f;
    L_0x008b:
        r0 = com.whatsapp.App.j;	 Catch:{ IOException -> 0x00a9 }
        if (r0 != r6) goto L_0x00a3;
    L_0x008f:
        r0 = com.whatsapp.App.am;	 Catch:{ IOException -> 0x00ab }
        if (r0 == r7) goto L_0x00a3;
    L_0x0093:
        r0 = com.whatsapp.auq.a();	 Catch:{ IOException -> 0x00ad }
        if (r0 > r8) goto L_0x00a3;
    L_0x0099:
        r0 = z;	 Catch:{ IOException -> 0x00ad }
        r2 = 6;
        r0 = r0[r2];	 Catch:{ IOException -> 0x00ad }
        r2 = 0;
        r3 = 0;
        com.whatsapp.App.a(r0, r2, r3);	 Catch:{ IOException -> 0x00ad }
    L_0x00a3:
        r0 = r1;
        goto L_0x0040;
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = new java.io.File;
        r2 = com.whatsapp.App.a3;
        r2 = r2.getAbsolutePath();
        r0.<init>(r2, r9);
        r0 = r0.getAbsolutePath();
        r2 = com.whatsapp.App.a3;	 Catch:{ IOException -> 0x011a }
        r2 = r2.getAbsolutePath();	 Catch:{ IOException -> 0x011a }
        r2 = r0.startsWith(r2);	 Catch:{ IOException -> 0x011a }
        if (r2 != 0) goto L_0x0040;
    L_0x00ca:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x011c }
        r2.<init>();	 Catch:{ IOException -> 0x011c }
        r3 = z;	 Catch:{ IOException -> 0x011c }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ IOException -> 0x011c }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x011c }
        r0 = r2.append(r0);	 Catch:{ IOException -> 0x011c }
        r2 = z;	 Catch:{ IOException -> 0x011c }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ IOException -> 0x011c }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x011c }
        r2 = com.whatsapp.App.a3;	 Catch:{ IOException -> 0x011c }
        r2 = r2.getAbsolutePath();	 Catch:{ IOException -> 0x011c }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x011c }
        r0 = r0.toString();	 Catch:{ IOException -> 0x011c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x011c }
        r0 = com.whatsapp.App.am;	 Catch:{ IOException -> 0x011c }
        if (r0 == 0) goto L_0x00ff;
    L_0x00fb:
        r0 = com.whatsapp.App.j;	 Catch:{ IOException -> 0x011e }
        if (r0 == 0) goto L_0x0103;
    L_0x00ff:
        r0 = com.whatsapp.App.j;	 Catch:{ IOException -> 0x0120 }
        if (r0 != r6) goto L_0x0117;
    L_0x0103:
        r0 = com.whatsapp.App.am;	 Catch:{ IOException -> 0x0122 }
        if (r0 == r7) goto L_0x0117;
    L_0x0107:
        r0 = com.whatsapp.auq.a();	 Catch:{ IOException -> 0x0124 }
        if (r0 > r8) goto L_0x0117;
    L_0x010d:
        r0 = z;	 Catch:{ IOException -> 0x0124 }
        r2 = 1;
        r0 = r0[r2];	 Catch:{ IOException -> 0x0124 }
        r2 = 0;
        r3 = 0;
        com.whatsapp.App.a(r0, r2, r3);	 Catch:{ IOException -> 0x0124 }
    L_0x0117:
        r0 = r1;
        goto L_0x0040;
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x011c }
    L_0x011c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x011e }
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0120 }
    L_0x0120:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0122 }
    L_0x0122:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0124 }
    L_0x0124:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fn.c(java.lang.String):java.lang.String");
    }

    static String a(File file) {
        return a(file, file.length());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static long a(java.io.File r11, @android.support.annotation.Nullable com.whatsapp.gdrive.d9 r12) {
        /*
        r4 = 0;
        r7 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = r11.exists();	 Catch:{ RuntimeException -> 0x000b }
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        return r4;
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r0 = r11.isDirectory();	 Catch:{ RuntimeException -> 0x0018 }
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r4 = r11.length();	 Catch:{ RuntimeException -> 0x0018 }
        goto L_0x000a;
    L_0x0018:
        r0 = move-exception;
        throw r0;
    L_0x001a:
        r8 = new java.util.LinkedList;
        r8.<init>();
        r8.add(r11);
        r2 = r4;
    L_0x0023:
        r0 = r8.peek();
        if (r0 == 0) goto L_0x007e;
    L_0x0029:
        r0 = r8.poll();
        r0 = (java.io.File) r0;
        r9 = r0.listFiles();
        if (r9 == 0) goto L_0x007c;
    L_0x0035:
        r10 = r9.length;
        r0 = 0;
        r6 = r0;
    L_0x0038:
        if (r6 >= r10) goto L_0x007c;
    L_0x003a:
        r1 = r9[r6];
        r0 = r1.exists();	 Catch:{ RuntimeException -> 0x0069 }
        if (r0 == 0) goto L_0x007a;
    L_0x0042:
        r0 = r1.isDirectory();	 Catch:{ RuntimeException -> 0x006b }
        if (r0 == 0) goto L_0x004d;
    L_0x0048:
        r8.add(r1);	 Catch:{ RuntimeException -> 0x006d }
        if (r7 == 0) goto L_0x007a;
    L_0x004d:
        if (r12 == 0) goto L_0x005b;
    L_0x004f:
        r0 = r12.a(r1);	 Catch:{ RuntimeException -> 0x0071 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ RuntimeException -> 0x0071 }
        r0 = r0.booleanValue();	 Catch:{ RuntimeException -> 0x0071 }
        if (r0 == 0) goto L_0x0073;
    L_0x005b:
        r0 = r1.length();	 Catch:{ RuntimeException -> 0x0071 }
    L_0x005f:
        r2 = r2 + r0;
        r0 = r2;
    L_0x0061:
        r2 = r6 + 1;
        if (r7 == 0) goto L_0x0077;
    L_0x0065:
        if (r7 == 0) goto L_0x0075;
    L_0x0067:
        r4 = r0;
        goto L_0x000a;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = r4;
        goto L_0x005f;
    L_0x0075:
        r2 = r0;
        goto L_0x0023;
    L_0x0077:
        r6 = r2;
        r2 = r0;
        goto L_0x0038;
    L_0x007a:
        r0 = r2;
        goto L_0x0061;
    L_0x007c:
        r0 = r2;
        goto L_0x0065;
    L_0x007e:
        r0 = r2;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fn.a(java.io.File, com.whatsapp.gdrive.d9):long");
    }

    static long b(File file) {
        return a(file, null);
    }

    static void b(HttpURLConnection httpURLConnection) {
        boolean z = GoogleDriveService.c;
        for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            if (z) {
                return;
            }
        }
    }

    static String d(@db int i) {
        switch (i) {
            case at.g /*1*/:
                try {
                    return z[17];
                } catch (RuntimeException e) {
                    throw e;
                }
            case at.i /*2*/:
                return z[19];
            case at.o /*3*/:
                return z[21];
            case at.p /*4*/:
                return z[20];
            default:
                throw new IllegalArgumentException(z[18] + i);
        }
    }

    static String b(int i) {
        switch (i) {
            case v.m /*0*/:
                try {
                    return z[14];
                } catch (RuntimeException e) {
                    throw e;
                }
            case at.g /*1*/:
                return z[15];
            case at.i /*2*/:
                return z[11];
            case at.o /*3*/:
                return z[12];
            case at.p /*4*/:
                return z[16];
            default:
                throw new IllegalArgumentException(z[13] + i);
        }
    }

    public static boolean a(@a1 int i, @js int i2) {
        try {
            return b(i, i2) || i == 1 || i == 0;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            try {
                throw e2;
            } catch (RuntimeException e22) {
                throw e22;
            }
        }
    }

    static void a(HttpResponse httpResponse) {
        boolean z = GoogleDriveService.c;
        Header[] allHeaders = httpResponse.getAllHeaders();
        int length = allHeaders.length;
        int i = 0;
        while (i < length) {
            Header header = allHeaders[i];
            i++;
            if (z) {
                return;
            }
        }
    }
}
