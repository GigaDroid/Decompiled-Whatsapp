package com.whatsapp.gdrive;

import android.app.Activity;
import android.support.v4.app.DialogFragment;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SingleChoiceListDialogFragment extends DialogFragment {
    private static final String[] z;
    private fv b;

    static {
        String[] strArr = new String[29];
        String str = "\u001aP\"i\u0015\u001aT:j\r_P2t\u0015\u001an>t\u0006VX\u0014r\u000eS^2V\bII\u001bs\u0012NX9\u007f\u0013";
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
                        i3 = 58;
                        break;
                    case at.g /*1*/:
                        i3 = 61;
                        break;
                    case at.i /*2*/:
                        i3 = 87;
                        break;
                    case at.o /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 97;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "SI2w\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "QX.iOVX9}\u0015R\u001dj:";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "NT#v\u0004";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "wH$nAJO8l\b^Xww\u0014VI>E\rSS2E\rSN#E\bNX:i>QX.";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "^T${\u0003VX3E\bNX:E\u0015U\\$n>QX.";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "WH;n\beQ>t\u0004eQ>i\u0015eT#\u007f\fIb<\u007f\u0018";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "VT9\u007fP";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "WH;n\beQ>t\u0004eQ>i\u0015eT#\u007f\fIb<\u007f\u0018";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "WH;n\beQ>t\u0004eQ>i\u0015eT#\u007f\feK6v\u0014_N\bq\u0004C";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "VT9\u007fS";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001a\u225dw";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "y\\9t\u000eN\u001d'h\u000eLT3\u007fAXR#rASI2w\u0012\u001a\\9~AWH;n\beQ>t\u0004eQ>i\u0015eT#\u007f\fIb<\u007f\u0018";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "^T6v\u000e]b>~";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "^T6v\u000e]b>~";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "SI2w\u0012";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "SI2w\u0012";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "SI2w\u0012";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "VT$n>SI2w>_S6x\r_Y\bq\u0004C";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "IX;\u007f\u0002NX3E\bNX:E\bTY2b";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001aK6v\u0014_Nyv\u0004TZ#r";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "VT9\u007fS";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "VT9\u007fS";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "VT9\u007fP";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "VT9\u007fP";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    str = "^T6v\u000e]b>~AIU8o\r^\u001d5\u007fAJO8l\b^X34";
                    obj = 25;
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    strArr2 = strArr3;
                    str = "wH$nAJO8l\b^Xw\u007f\bNU2hASI2w\u0012\u001aR%:\fOQ#s>VT9\u007f>VT$n>SI2w\u0012eV2c";
                    obj = 26;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "WH;n\beQ>t\u0004eQ>i\u0015eT#\u007f\fIb<\u007f\u0018";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "WH;n\beQ>t\u0004eQ>i\u0015eT#\u007f\fIb<\u007f\u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (fv) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + z[0]);
        }
    }

    static fv a(SingleChoiceListDialogFragment singleChoiceListDialogFragment) {
        return singleChoiceListDialogFragment.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    public android.app.Dialog onCreateDialog(android.os.Bundle r15) {
        /*
        r14 = this;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = r14.getArguments();
        r1 = z;	 Catch:{ ClassCastException -> 0x001e }
        r3 = 14;
        r1 = r1[r3];	 Catch:{ ClassCastException -> 0x001e }
        r1 = r0.containsKey(r1);	 Catch:{ ClassCastException -> 0x001e }
        if (r1 != 0) goto L_0x0020;
    L_0x0012:
        r0 = new java.lang.IllegalStateException;	 Catch:{ ClassCastException -> 0x001e }
        r1 = z;	 Catch:{ ClassCastException -> 0x001e }
        r2 = 26;
        r1 = r1[r2];	 Catch:{ ClassCastException -> 0x001e }
        r0.<init>(r1);	 Catch:{ ClassCastException -> 0x001e }
        throw r0;	 Catch:{ ClassCastException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r1 = z;
        r3 = 15;
        r1 = r1[r3];
        r10 = r0.getInt(r1);
        r1 = new android.support.v7.app.AlertDialog$Builder;
        r3 = r14.getActivity();
        r1.<init>(r3);
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r3 = r0.getString(r3);
        r1 = r1.setTitle(r3);
        r3 = 2131230884; // 0x7f0800a4 float:1.8077833E38 double:1.052967963E-314;
        r4 = new com.whatsapp.gdrive.dz;
        r4.<init>(r14, r10);
        r11 = r1.setPositiveButton(r3, r4);
        r1 = z;	 Catch:{ ClassCastException -> 0x0071 }
        r3 = 2;
        r1 = r1[r3];	 Catch:{ ClassCastException -> 0x0071 }
        r1 = r0.containsKey(r1);	 Catch:{ ClassCastException -> 0x0071 }
        if (r1 == 0) goto L_0x0073;
    L_0x0057:
        r1 = z;	 Catch:{ ClassCastException -> 0x006f }
        r3 = 9;
        r1 = r1[r3];	 Catch:{ ClassCastException -> 0x006f }
        r1 = r0.containsKey(r1);	 Catch:{ ClassCastException -> 0x006f }
        if (r1 == 0) goto L_0x0073;
    L_0x0063:
        r0 = new java.lang.IllegalStateException;	 Catch:{ ClassCastException -> 0x006f }
        r1 = z;	 Catch:{ ClassCastException -> 0x006f }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ ClassCastException -> 0x006f }
        r0.<init>(r1);	 Catch:{ ClassCastException -> 0x006f }
        throw r0;	 Catch:{ ClassCastException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassCastException -> 0x006f }
    L_0x0073:
        r1 = z;	 Catch:{ ClassCastException -> 0x0098 }
        r3 = 17;
        r1 = r1[r3];	 Catch:{ ClassCastException -> 0x0098 }
        r1 = r0.containsKey(r1);	 Catch:{ ClassCastException -> 0x0098 }
        if (r1 != 0) goto L_0x009a;
    L_0x007f:
        r1 = z;	 Catch:{ ClassCastException -> 0x0096 }
        r3 = 7;
        r1 = r1[r3];	 Catch:{ ClassCastException -> 0x0096 }
        r1 = r0.containsKey(r1);	 Catch:{ ClassCastException -> 0x0096 }
        if (r1 != 0) goto L_0x009a;
    L_0x008a:
        r0 = new java.lang.IllegalStateException;	 Catch:{ ClassCastException -> 0x0096 }
        r1 = z;	 Catch:{ ClassCastException -> 0x0096 }
        r2 = 27;
        r1 = r1[r2];	 Catch:{ ClassCastException -> 0x0096 }
        r0.<init>(r1);	 Catch:{ ClassCastException -> 0x0096 }
        throw r0;	 Catch:{ ClassCastException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassCastException -> 0x0096 }
    L_0x009a:
        r1 = z;
        r3 = 20;
        r1 = r1[r3];
        r3 = -1;
        r8 = r0.getInt(r1, r3);
        r1 = z;	 Catch:{ ClassCastException -> 0x00ee }
        r3 = 18;
        r1 = r1[r3];	 Catch:{ ClassCastException -> 0x00ee }
        r1 = r0.containsKey(r1);	 Catch:{ ClassCastException -> 0x00ee }
        if (r1 == 0) goto L_0x00c5;
    L_0x00b1:
        r1 = z;	 Catch:{ ClassCastException -> 0x00f0 }
        r3 = 16;
        r1 = r1[r3];	 Catch:{ ClassCastException -> 0x00f0 }
        r1 = r0.getStringArray(r1);	 Catch:{ ClassCastException -> 0x00f0 }
        r3 = new com.whatsapp.gdrive.ct;	 Catch:{ ClassCastException -> 0x00f0 }
        r3.<init>(r14, r10, r0);	 Catch:{ ClassCastException -> 0x00f0 }
        r11.setSingleChoiceItems(r1, r8, r3);	 Catch:{ ClassCastException -> 0x00f0 }
        if (r2 == 0) goto L_0x01b6;
    L_0x00c5:
        r1 = z;	 Catch:{ ClassCastException -> 0x00f0 }
        r3 = 28;
        r1 = r1[r3];	 Catch:{ ClassCastException -> 0x00f0 }
        r1 = r0.containsKey(r1);	 Catch:{ ClassCastException -> 0x00f0 }
        if (r1 == 0) goto L_0x01b6;
    L_0x00d1:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r1 = z;
        r4 = 1;
        r1 = r1[r4];
        r9 = r0.getStringArray(r1);
        if (r9 != 0) goto L_0x00f2;
    L_0x00e1:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ ClassCastException -> 0x00ec }
        r1 = z;	 Catch:{ ClassCastException -> 0x00ec }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ ClassCastException -> 0x00ec }
        r0.<init>(r1);	 Catch:{ ClassCastException -> 0x00ec }
        throw r0;	 Catch:{ ClassCastException -> 0x00ec }
    L_0x00ec:
        r0 = move-exception;
        throw r0;
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassCastException -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        throw r0;
    L_0x00f2:
        r1 = z;
        r4 = 10;
        r1 = r1[r4];
        r4 = r0.getStringArray(r1);
        r1 = z;
        r5 = 19;
        r1 = r1[r5];
        r7 = r0.getBooleanArray(r1);
        r1 = z;
        r5 = 6;
        r1 = r1[r5];
        r12 = r0.getString(r1);
        if (r4 == 0) goto L_0x014d;
    L_0x0111:
        r0 = r9.length;	 Catch:{ ClassCastException -> 0x014b }
        r1 = r4.length;	 Catch:{ ClassCastException -> 0x014b }
        if (r0 == r1) goto L_0x014d;
    L_0x0115:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ ClassCastException -> 0x014b }
        r1 = new java.lang.StringBuilder;	 Catch:{ ClassCastException -> 0x014b }
        r1.<init>();	 Catch:{ ClassCastException -> 0x014b }
        r2 = z;	 Catch:{ ClassCastException -> 0x014b }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ ClassCastException -> 0x014b }
        r1 = r1.append(r2);	 Catch:{ ClassCastException -> 0x014b }
        r2 = r9.length;	 Catch:{ ClassCastException -> 0x014b }
        r1 = r1.append(r2);	 Catch:{ ClassCastException -> 0x014b }
        r2 = z;	 Catch:{ ClassCastException -> 0x014b }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ ClassCastException -> 0x014b }
        r1 = r1.append(r2);	 Catch:{ ClassCastException -> 0x014b }
        r2 = r4.length;	 Catch:{ ClassCastException -> 0x014b }
        r1 = r1.append(r2);	 Catch:{ ClassCastException -> 0x014b }
        r2 = z;	 Catch:{ ClassCastException -> 0x014b }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ ClassCastException -> 0x014b }
        r1 = r1.append(r2);	 Catch:{ ClassCastException -> 0x014b }
        r1 = r1.toString();	 Catch:{ ClassCastException -> 0x014b }
        r0.<init>(r1);	 Catch:{ ClassCastException -> 0x014b }
        throw r0;	 Catch:{ ClassCastException -> 0x014b }
    L_0x014b:
        r0 = move-exception;
        throw r0;
    L_0x014d:
        r0 = z;
        r1 = 25;
        r0 = r0[r1];
        r0 = z;
        r1 = 11;
        r0 = r0[r1];
        r0 = 0;
    L_0x015a:
        r1 = r9.length;
        if (r0 >= r1) goto L_0x0181;
    L_0x015d:
        r5 = new java.util.HashMap;
        r5.<init>();
        r1 = z;	 Catch:{ ClassCastException -> 0x01bb }
        r6 = 24;
        r1 = r1[r6];	 Catch:{ ClassCastException -> 0x01bb }
        r6 = r9[r0];	 Catch:{ ClassCastException -> 0x01bb }
        r5.put(r1, r6);	 Catch:{ ClassCastException -> 0x01bb }
        r1 = z;	 Catch:{ ClassCastException -> 0x01bb }
        r6 = 23;
        r6 = r1[r6];	 Catch:{ ClassCastException -> 0x01bb }
        if (r4 == 0) goto L_0x01bd;
    L_0x0175:
        r1 = r4[r0];	 Catch:{ ClassCastException -> 0x01bb }
    L_0x0177:
        r5.put(r6, r1);
        r3.add(r5);
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x015a;
    L_0x0181:
        r0 = new com.whatsapp.gdrive.dv;
        r2 = r14.getContext();
        r4 = 2130903274; // 0x7f0300ea float:1.7413361E38 double:1.0528061023E-314;
        r1 = 2;
        r5 = new java.lang.String[r1];
        r1 = 0;
        r6 = z;
        r13 = 8;
        r6 = r6[r13];
        r5[r1] = r6;
        r1 = 1;
        r6 = z;
        r13 = 22;
        r6 = r6[r13];
        r5[r1] = r6;
        r1 = 2;
        r6 = new int[r1];
        r6 = {16908308, 16908309};
        r1 = r14;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);
        r1 = new com.whatsapp.gdrive.e;
        r2 = r14;
        r3 = r7;
        r4 = r10;
        r5 = r9;
        r6 = r12;
        r1.<init>(r2, r3, r4, r5, r6);
        r11.setSingleChoiceItems(r0, r8, r1);
    L_0x01b6:
        r0 = r11.create();
        return r0;
    L_0x01bb:
        r0 = move-exception;
        throw r0;
    L_0x01bd:
        r1 = 0;
        goto L_0x0177;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SingleChoiceListDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }
}
