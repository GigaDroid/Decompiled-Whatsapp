package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.text.TextUtils;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.preference.WaLanguageListPreference;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.cs;
import java.util.Calendar;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SettingsChat extends DialogToastPreferenceActivity {
    private static ue i;
    private static final String[] z;
    private WaLanguageListPreference j;
    private final as8 k;

    static {
        String[] strArr = new String[38];
        String str = "\u000fB\u0014m{\u0012@\u0013Fq\u0014F\u0014Fz\u0015T\u0014v`\u0005";
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
                        i3 = 39;
                        break;
                    case at.i /*2*/:
                        i3 = 96;
                        break;
                    case at.o /*3*/:
                        i3 = 25;
                        break;
                    default:
                        i3 = 18;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0015I\u0010lf#B\u000emw\u000ex\u0013||\u0018";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u000fB\u0014m{\u0012@\u0013Fp\u001dD\u000blb";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u000fB\u0014m{\u0012@\u0013Fe\u001dK\fis\fB\u0012";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0015I\u0014|`\u001aF\u0003|M\u001aH\u000emM\u000fN\u001a|";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\tI\rvg\u0012S\u0005}";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000bF\fub\u001dW\u0005k2\u001aU\u000ft2\f@\u000b#";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001fH\u000eow\u000eT\u0001m{\u0013IOxq\bN\u0016pf\u0005U\u0005j=\u0013H\r4w\u000eU\u000fk";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0019U\u0012v`QH\u000ft";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\\|";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0013H\r";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0013R\u0014ig\b~";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0015T?}w\u001aF\u0015uf";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0013R\u0014ig\b";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u000fD\u0001uw)W)\u007f\\\u0019B\u0004|v";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u000eB\u0004Pv";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0015T?kw\u000fB\u0014";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    str = "\\[@";
                    obj = 17;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "\u001eR\u0003rw\bx\u0004pa\fK\u0001`M\u0012F\r|";
                    obj = 18;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u001fH\u000eow\u000eT\u0001m{\u0013IOxq\bN\u0016pf\u0005U\u0005j=\u0012HMjb\u001dD\u0005";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0015HM|`\u000eH\u0012";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u000fD\u0001uw";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u000bF\fub\u001dW\u0005k=\u001fU\u000fi=\u0014B\t~z\b\u001d";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u000bF\fub\u001dW\u0005k=\u000fB\u0014lbSA\tuwQI\u000fm?\u001aH\u0015wv";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    str = "\u001fU\u000fiP\u0005h\u0015mb\tS3ph\u0019";
                    obj = 24;
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    strArr2 = strArr3;
                    str = "+F\fuB\u001dW\u0005k";
                    obj = 25;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u000bF\fub\u001dW\u0005k=\u000fB\u0014lbST\u0012z(";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u000fB\u0014m{\u0012@\u00136e\u001dK\fis\fB\u00126{\u0012Q\u0001u{\u0018x\u0006p~\u0019\u001d";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0013R\u0014ig\b\u007f";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u000fB\u0014m{\u0012@\u00136e\u001dK\fis\fB\u00126`\u0019T\u0005m";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u001fH\u000eow\u000eT\u0001m{\u0013IOxq\bN\u0016pf\u0005U\u0005jg\u0010SOz`\u0013W\tts\u001bBOv}\u0011\n\u0005k`\u0013U";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0012HMjb\u001dD\u0005";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u001fH\u000eow\u000eT\u0001m{\u0013IOxq\bN\u0016pf\u0005U\u0005j=\u001aF\tu=\u0010H\u0001}?\u0015J\u0001~w";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0013R\u0014ig\ba\u000fk\u007f\u001dS";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u000fB\u0014m{\u0012@\u00136e\u001dK\fis\fB\u00126v\u0019A\u0001l~\b";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "E\u0016";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u000fB\u0014m{\u0012@\u0013Fp\u001dD\u000blb";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000fB\u0014m{\u0012@\u0013F~\u001dI\u0007ls\u001bB";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void b() {
        by an = App.an();
        if (an instanceof SettingsChat) {
            ((SettingsChat) an).g();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
        r10 = this;
        r5 = -1;
        r9 = 1;
        r2 = 0;
        r8 = 0;
        r6 = com.whatsapp.DialogToastActivity.f;
        if (r12 != 0) goto L_0x0076;
    L_0x0008:
        if (r13 == 0) goto L_0x0076;
    L_0x000a:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x007d }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x007d }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x007d }
        if (r0 == 0) goto L_0x002e;
    L_0x0017:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x007f }
        r1 = 8;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x007f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x007f }
        r0 = com.whatsapp.App.z();	 Catch:{ FileNotFoundException -> 0x007f }
        r1 = 2131231116; // 0x7f08018c float:1.8078304E38 double:1.052968078E-314;
        r0 = r0.getString(r1);	 Catch:{ FileNotFoundException -> 0x007f }
        com.whatsapp.App.a(r10, r0);	 Catch:{ FileNotFoundException -> 0x007f }
    L_0x002e:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0081 }
        r1 = 32;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0081 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x0081 }
        if (r0 == 0) goto L_0x0052;
    L_0x003b:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0081 }
        r1 = 20;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0081 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x0081 }
        r0 = com.whatsapp.App.z();	 Catch:{ FileNotFoundException -> 0x0081 }
        r1 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r0 = r0.getString(r1);	 Catch:{ FileNotFoundException -> 0x0081 }
        com.whatsapp.App.a(r10, r0);	 Catch:{ FileNotFoundException -> 0x0081 }
    L_0x0052:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0083 }
        r1 = 21;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0083 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x0083 }
        if (r0 == 0) goto L_0x0076;
    L_0x005f:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0083 }
        r1 = 33;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0083 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x0083 }
        r0 = com.whatsapp.App.z();	 Catch:{ FileNotFoundException -> 0x0083 }
        r1 = 2131231107; // 0x7f080183 float:1.8078286E38 double:1.0529680733E-314;
        r0 = r0.getString(r1);	 Catch:{ FileNotFoundException -> 0x0083 }
        com.whatsapp.App.a(r10, r0);	 Catch:{ FileNotFoundException -> 0x0083 }
    L_0x0076:
        switch(r11) {
            case 17: goto L_0x00b9;
            case 18: goto L_0x0085;
            default: goto L_0x0079;
        };
    L_0x0079:
        super.onActivityResult(r11, r12, r13);
    L_0x007c:
        return;
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        if (r12 != r5) goto L_0x009b;
    L_0x0087:
        if (r13 == 0) goto L_0x0079;
    L_0x0089:
        r0 = r13.getData();	 Catch:{ FileNotFoundException -> 0x014d }
        if (r0 == 0) goto L_0x0079;
    L_0x008f:
        r0 = r13.getData();	 Catch:{ FileNotFoundException -> 0x014f }
        r1 = -1;
        r3 = 0;
        r4 = 0;
        r10.a(r0, r1, r3, r4);	 Catch:{ FileNotFoundException -> 0x014f }
        if (r6 == 0) goto L_0x0079;
    L_0x009b:
        if (r13 == 0) goto L_0x0079;
    L_0x009d:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0153 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0153 }
        r1 = 1;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x0153 }
        if (r0 == 0) goto L_0x0079;
    L_0x00aa:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0155 }
        r1 = 31;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0155 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x0155 }
        r0 = 7;
        r10.showDialog(r0);	 Catch:{ FileNotFoundException -> 0x0155 }
        if (r6 == 0) goto L_0x0079;
    L_0x00b9:
        if (r12 != r5) goto L_0x0079;
    L_0x00bb:
        if (r13 == 0) goto L_0x0079;
    L_0x00bd:
        r7 = com.whatsapp.wallpaper.k.d(r10);
        r0 = r13.getData();
        if (r0 == 0) goto L_0x0206;
    L_0x00c7:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 27;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r13.getData();
        r1 = r1.toString();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.at;
        r1 = r13.getData();
        r3 = r2;
        r4 = r2;
        r5 = r2;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x0173;
    L_0x00f8:
        r1.moveToFirst();	 Catch:{ all -> 0x015d }
        r0 = z;	 Catch:{ all -> 0x015d }
        r3 = 19;
        r0 = r0[r3];	 Catch:{ all -> 0x015d }
        r0 = r1.getColumnIndex(r0);	 Catch:{ all -> 0x015d }
        if (r0 < 0) goto L_0x0173;
    L_0x0107:
        r0 = r1.getString(r0);	 Catch:{ FileNotFoundException -> 0x015b }
        r3 = z;	 Catch:{ FileNotFoundException -> 0x015b }
        r4 = 26;
        r3 = r3[r4];	 Catch:{ FileNotFoundException -> 0x015b }
        r0 = r0.equals(r3);	 Catch:{ FileNotFoundException -> 0x015b }
        if (r0 == 0) goto L_0x0173;
    L_0x0117:
        r0 = new android.graphics.BitmapFactory$Options;	 Catch:{ all -> 0x015d }
        r0.<init>();	 Catch:{ all -> 0x015d }
        r3 = 1;
        r0.inJustDecodeBounds = r3;	 Catch:{ all -> 0x015d }
        r3 = com.whatsapp.App.at;	 Catch:{ FileNotFoundException -> 0x0166 }
        r4 = r13.getData();	 Catch:{ FileNotFoundException -> 0x0166 }
        r2 = r3.openInputStream(r4);	 Catch:{ FileNotFoundException -> 0x0166 }
        r3 = 0;
        android.graphics.BitmapFactory.decodeStream(r2, r3, r0);	 Catch:{ FileNotFoundException -> 0x0164 }
        r3 = r0.outWidth;	 Catch:{ FileNotFoundException -> 0x0164 }
        r4 = r7.x;	 Catch:{ FileNotFoundException -> 0x0164 }
        if (r3 != r4) goto L_0x02de;
    L_0x0133:
        r0 = r0.outHeight;	 Catch:{ FileNotFoundException -> 0x0164 }
        r3 = r7.y;	 Catch:{ FileNotFoundException -> 0x0164 }
        if (r0 != r3) goto L_0x02de;
    L_0x0139:
        r0 = r13.getData();	 Catch:{ FileNotFoundException -> 0x0166 }
        r3 = -1;
        r4 = 0;
        r5 = 0;
        r10.a(r0, r3, r4, r5);	 Catch:{ FileNotFoundException -> 0x0166 }
        com.whatsapp.util.ao.a(r2);	 Catch:{ all -> 0x015d }
        if (r1 == 0) goto L_0x007c;
    L_0x0148:
        r1.close();
        goto L_0x007c;
    L_0x014d:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x014f }
    L_0x014f:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0151 }
    L_0x0151:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0153 }
    L_0x0153:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0155 }
    L_0x0155:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0157 }
    L_0x0157:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0159 }
    L_0x0159:
        r0 = move-exception;
        throw r0;
    L_0x015b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x015d }
    L_0x015d:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0163;
    L_0x0160:
        r1.close();	 Catch:{ FileNotFoundException -> 0x02ea }
    L_0x0163:
        throw r0;
    L_0x0164:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0166 }
    L_0x0166:
        r0 = move-exception;
        r3 = z;	 Catch:{ all -> 0x02e3 }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ all -> 0x02e3 }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ all -> 0x02e3 }
        com.whatsapp.util.ao.a(r2);	 Catch:{ all -> 0x015d }
    L_0x0173:
        if (r1 == 0) goto L_0x0178;
    L_0x0175:
        r1.close();	 Catch:{ FileNotFoundException -> 0x02e8 }
    L_0x0178:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 23;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r7.x;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r7.y;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.wallpaper.CropImage.class;
        r0.<init>(r10, r1);
        r1 = z;
        r2 = 29;
        r1 = r1[r2];
        r2 = r7.x;
        r0.putExtra(r1, r2);
        r1 = z;
        r2 = 12;
        r1 = r1[r2];
        r2 = r7.y;
        r0.putExtra(r1, r2);
        r1 = z;
        r2 = 22;
        r1 = r1[r2];
        r0.putExtra(r1, r9);
        r1 = z;
        r2 = 15;
        r1 = r1[r2];
        r0.putExtra(r1, r9);
        r1 = z;
        r2 = 25;
        r1 = r1[r2];
        r0.putExtra(r1, r9);
        r1 = r13.getData();
        r0.setData(r1);
        r1 = z;
        r2 = 14;
        r1 = r1[r2];
        r2 = com.whatsapp.wallpaper.k.a();
        r0.putExtra(r1, r2);
        r1 = z;
        r2 = 34;
        r1 = r1[r2];
        r2 = android.graphics.Bitmap.CompressFormat.JPEG;
        r2 = r2.toString();
        r0.putExtra(r1, r2);
        r1 = 18;
        r10.startActivityForResult(r0, r1);
        if (r6 == 0) goto L_0x0079;
    L_0x0206:
        r0 = z;
        r1 = 16;
        r0 = r0[r1];
        r0 = r13.getIntExtra(r0, r8);
        if (r0 == 0) goto L_0x0259;
    L_0x0212:
        r1 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x02ec }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x02ec }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x02ec }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x02ec }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02ec }
        r1 = r1.append(r0);	 Catch:{ FileNotFoundException -> 0x02ec }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x02ec }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x02ec }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02ec }
        r2 = r7.x;	 Catch:{ FileNotFoundException -> 0x02ec }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02ec }
        r2 = ",";
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02ec }
        r2 = r7.y;	 Catch:{ FileNotFoundException -> 0x02ec }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02ec }
        r2 = "]";
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02ec }
        r1 = r1.toString();	 Catch:{ FileNotFoundException -> 0x02ec }
        com.whatsapp.util.Log.i(r1);	 Catch:{ FileNotFoundException -> 0x02ec }
        r1 = 0;
        r2 = r7.x;	 Catch:{ FileNotFoundException -> 0x02ec }
        r3 = r7.y;	 Catch:{ FileNotFoundException -> 0x02ec }
        r10.a(r1, r0, r2, r3);	 Catch:{ FileNotFoundException -> 0x02ec }
        if (r6 == 0) goto L_0x0079;
    L_0x0259:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x02ee }
        r1 = 17;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x02ee }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x02ee }
        if (r0 == 0) goto L_0x0283;
    L_0x0266:
        com.whatsapp.wallpaper.k.e(r10);	 Catch:{ FileNotFoundException -> 0x02f0 }
        r0 = r10.getBaseContext();	 Catch:{ FileNotFoundException -> 0x02f0 }
        r1 = 2131232274; // 0x7f080612 float:1.8080653E38 double:1.05296865E-314;
        r1 = r10.getString(r1);	 Catch:{ FileNotFoundException -> 0x02f0 }
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x02f0 }
        r0 = z;	 Catch:{ FileNotFoundException -> 0x02f0 }
        r1 = 30;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x02f0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ FileNotFoundException -> 0x02f0 }
        if (r6 == 0) goto L_0x0079;
    L_0x0283:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x02f2 }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x02f2 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x02f2 }
        if (r0 == 0) goto L_0x02ad;
    L_0x0290:
        com.whatsapp.wallpaper.k.f(r10);	 Catch:{ FileNotFoundException -> 0x02dc }
        r0 = r10.getBaseContext();	 Catch:{ FileNotFoundException -> 0x02dc }
        r1 = 2131232275; // 0x7f080613 float:1.8080655E38 double:1.0529686504E-314;
        r1 = r10.getString(r1);	 Catch:{ FileNotFoundException -> 0x02dc }
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x02dc }
        r0 = z;	 Catch:{ FileNotFoundException -> 0x02dc }
        r1 = 35;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x02dc }
        com.whatsapp.util.Log.i(r0);	 Catch:{ FileNotFoundException -> 0x02dc }
        if (r6 == 0) goto L_0x0079;
    L_0x02ad:
        r0 = r10.getBaseContext();	 Catch:{ FileNotFoundException -> 0x02dc }
        r1 = 2131231129; // 0x7f080199 float:1.807833E38 double:1.052968084E-314;
        r1 = r10.getString(r1);	 Catch:{ FileNotFoundException -> 0x02dc }
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x02dc }
        r0 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x02dc }
        r0.<init>();	 Catch:{ FileNotFoundException -> 0x02dc }
        r1 = z;	 Catch:{ FileNotFoundException -> 0x02dc }
        r2 = 28;
        r1 = r1[r2];	 Catch:{ FileNotFoundException -> 0x02dc }
        r0 = r0.append(r1);	 Catch:{ FileNotFoundException -> 0x02dc }
        r1 = r13.toString();	 Catch:{ FileNotFoundException -> 0x02dc }
        r0 = r0.append(r1);	 Catch:{ FileNotFoundException -> 0x02dc }
        r0 = r0.toString();	 Catch:{ FileNotFoundException -> 0x02dc }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x02dc }
        goto L_0x0079;
    L_0x02dc:
        r0 = move-exception;
        throw r0;
    L_0x02de:
        com.whatsapp.util.ao.a(r2);	 Catch:{ all -> 0x015d }
        goto L_0x0173;
    L_0x02e3:
        r0 = move-exception;
        com.whatsapp.util.ao.a(r2);	 Catch:{ all -> 0x015d }
        throw r0;	 Catch:{ all -> 0x015d }
    L_0x02e8:
        r0 = move-exception;
        throw r0;
    L_0x02ea:
        r0 = move-exception;
        throw r0;
    L_0x02ec:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02ee }
    L_0x02ee:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02f0 }
    L_0x02f0:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02f2 }
    L_0x02f2:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02dc }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsChat.onActivityResult(int, int, android.content.Intent):void");
    }

    static as8 a(SettingsChat settingsChat) {
        return settingsChat.k;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b().setTitle(2131231906);
        addPreferencesFromResource(2131099655);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(z[2]);
        checkBoxPreference.setOnPreferenceClickListener(new jk(this, checkBoxPreference));
        this.j = (WaLanguageListPreference) findPreference(z[1]);
        this.j.setOnPreferenceChangeListener(new aeb(this));
        ListPreference listPreference = (ListPreference) findPreference(z[5]);
        listPreference.setTitle(getString(2131231921, new Object[]{listPreference.getEntry()}));
        listPreference.setOnPreferenceChangeListener(new hs(this));
        findPreference(z[4]).setOnPreferenceClickListener(new aq0(this));
        findPreference(z[0]).setOnPreferenceClickListener(new b7(this));
        Preference findPreference = findPreference(z[3]);
        if (!GoogleDriveService.z()) {
            g();
            findPreference.setOnPreferenceClickListener(new aex(this));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        findPreference.setOnPreferenceClickListener(new bk(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Dialog c(@android.support.annotation.NonNull android.content.Context r4) {
        /*
        r0 = 0;
        r1 = com.whatsapp.App.V();
        if (r1 == 0) goto L_0x0052;
    L_0x0007:
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r2 = android.os.Environment.getExternalStorageState();
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0048;
    L_0x0016:
        r2 = 2131231483; // 0x7f0802fb float:1.8079048E38 double:1.052968259E-314;
        r1 = 2131231482; // 0x7f0802fa float:1.8079046E38 double:1.0529682586E-314;
        r0 = new com.whatsapp.x9;
        r0.<init>(r4);
    L_0x0021:
        r3 = new android.support.v7.app.AlertDialog$Builder;
        r3.<init>(r4);
        r2 = r3.setTitle(r2);
        r1 = r2.setMessage(r1);
        r2 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r3 = new com.whatsapp.r_;
        r3.<init>();
        r1 = r1.setPositiveButton(r2, r3);
        if (r0 == 0) goto L_0x0059;
    L_0x003c:
        r2 = 2131230860; // 0x7f08008c float:1.8077785E38 double:1.0529679513E-314;
        r0 = r1.setPositiveButton(r2, r0);
    L_0x0043:
        r0 = r0.create();
        return r0;
    L_0x0048:
        r2 = 2131231481; // 0x7f0802f9 float:1.8079044E38 double:1.052968258E-314;
        r1 = 2131231480; // 0x7f0802f8 float:1.8079042E38 double:1.0529682576E-314;
        r3 = com.whatsapp.DialogToastActivity.f;
        if (r3 == 0) goto L_0x0021;
    L_0x0052:
        r2 = 2131231479; // 0x7f0802f7 float:1.807904E38 double:1.052968257E-314;
        r1 = 2131231559; // 0x7f080347 float:1.8079202E38 double:1.0529682966E-314;
        goto L_0x0021;
    L_0x0059:
        r0 = r1;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsChat.c(android.content.Context):android.app.Dialog");
    }

    static Calendar f() {
        return c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.net.Uri r8, int r9, int r10, int r11) {
        /*
        r7 = this;
        r6 = 0;
        if (r8 != 0) goto L_0x0010;
    L_0x0003:
        r1 = 1;
        r3 = 0;
        r0 = r7;
        r2 = r9;
        r4 = r10;
        r5 = r11;
        com.whatsapp.wallpaper.k.a(r0, r1, r2, r3, r4, r5);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0019;
    L_0x0010:
        r2 = -1;
        r0 = r7;
        r1 = r6;
        r3 = r8;
        r4 = r6;
        r5 = r6;
        com.whatsapp.wallpaper.k.a(r0, r1, r2, r3, r4, r5);
    L_0x0019:
        com.whatsapp.util.ag.a(r7, r8);
        r0 = r7.getBaseContext();
        r1 = 2131232275; // 0x7f080613 float:1.8080655E38 double:1.0529686504E-314;
        r1 = r7.getString(r1);
        com.whatsapp.App.b(r0, r1, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsChat.a(android.net.Uri, int, int, int):void");
    }

    public static Dialog b(Context context) {
        long timeInMillis = c().getTimeInMillis();
        i = new ue(context);
        i.setTitle(context.getString(2131231471));
        i.setMessage(context.getString(2131231895, new Object[]{cs.c(context, timeInMillis)}));
        i.setIndeterminate(true);
        i.setCancelable(false);
        return i;
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 600:
                return b((Context) this);
            case 602:
                return c(this);
            default:
                return super.onCreateDialog(i);
        }
    }

    public SettingsChat() {
        this.k = new xl(this);
    }

    private void d() {
        if (a()) {
            this.j.a();
            int findIndexOfValue = this.j.findIndexOfValue(aqu.g());
            if (findIndexOfValue < 0) {
                findIndexOfValue = 0;
            }
            this.j.setValueIndex(findIndexOfValue);
            this.j.setSummary(this.j.getEntries()[findIndexOfValue]);
            return;
        }
        getPreferenceScreen().removePreference(this.j);
    }

    private boolean a() {
        return !TextUtils.isEmpty(App.ay.cc) && App.ay.cc.equals(z[36]);
    }

    protected void onResume() {
        super.onResume();
        g();
        d();
    }

    static void b(SettingsChat settingsChat) {
        settingsChat.g();
    }

    private static Calendar c() {
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 2);
        return instance;
    }

    private void g() {
        Preference findPreference = findPreference(z[37]);
        String a = a((Context) this);
        if (findPreference != null && !GoogleDriveService.z()) {
            findPreference.setTitle(2131231975);
            if (App.aO()) {
                findPreference.setSummary(String.format(getString(2131231977), new Object[]{a}));
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            findPreference.setSummary(2131231976);
        }
    }

    public static String a(Context context) {
        String string;
        boolean z = DialogToastActivity.f;
        long aH = App.aH();
        if (aH == 0) {
            string = context.getString(2131231542);
            if (!z) {
                return string;
            }
        }
        if (aH == -1) {
            string = context.getString(2131232182);
            if (!z) {
                return string;
            }
        }
        return cs.o(context, aH);
    }

    static ue e() {
        return i;
    }
}
