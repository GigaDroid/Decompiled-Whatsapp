package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class _k extends AsyncTask {
    private static final String[] z;
    final VerifySms a;
    ut b;

    static {
        String[] strArr = new String[23];
        String str = "+B\u000b4~ L\u0012ih8]9j{-K\u0003hl&N\u0003i";
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
                        i3 = 72;
                        break;
                    case at.g /*1*/:
                        i3 = 45;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035j'I\u00035";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "+B\u000b4~ L\u0012ih8]HHl/D\u0015nl:}\u000eug-\u0003\u000bsz<T\u0016\u007fm\u0017^\u0012{}-";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035`'H\u0014hf:\r";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ":H\u0000oz-I";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035l:_\th$+B\btl+Y\u000fl`<T";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035}-@\u0016u{)_\u000fvpeX\b{\u007f)D\n{k$H";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035l:_\th";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035l:_\th$*A\tyb-I";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035n=H\u0015il,\u0000\u0012ufeK\u0007i}gX\b{k$HKnfe]\u0007hz-\u0000\u0014\u007f}:T'|}-_";
                    obj = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "-_\u0014u{h@\u000fiz!C\u0001";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035l:_\th$%D\u0015i`&J";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ">B\u000fyleY\u0003wy'_\u0007h`$TKog)[\u0007se)O\n\u007f";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035l:_\th$<B\t7d)C\u001f7n=H\u0015il;";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035}'BKwh&TK}|-^\u0015\u007fzgX\b{k$HKnfe]\u0007hz-\u0000\u0014\u007f}:T'|}-_";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035z<L\n\u007f";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035l:_\th$/X\u0003iz-IKnf'\u0000\u0000{z<";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035|&L\u0004vleY\t7y)_\u0015\u007f$:H\u0012hp\tK\u0012\u007f{";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035{-Y\u0014ch.Y\u0003h).L\u000fvl,\r\u0012u)8L\u0014il";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035`&N\th{-N\u0012";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035\u007f-_\u000f|`-I";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u0003";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ">H\u0014so1[\tsj-\u0002\u0010\u007f{!K\u001flf!N\u00035l:_\th)";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected _k(VerifySms verifySms) {
        this.a = verifySms;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.v4 r13) {
        /*
        r12 = this;
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r9 = 2131231789; // 0x7f08042d float:1.8079669E38 double:1.0529684103E-314;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0151 }
        r1 = 24;
        r0.removeDialog(r1);	 Catch:{ NumberFormatException -> 0x0151 }
        r0 = com.whatsapp.v4.YES;	 Catch:{ NumberFormatException -> 0x0151 }
        if (r13 != r0) goto L_0x0035;
    L_0x0012:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0151 }
        r1 = 21;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0151 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0151 }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x0151 }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x0151 }
        r1 = r12.b;	 Catch:{ NumberFormatException -> 0x0151 }
        r1 = r1.c;	 Catch:{ NumberFormatException -> 0x0151 }
        com.whatsapp.ve.b(r0, r1);	 Catch:{ NumberFormatException -> 0x0151 }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x0151 }
        r0 = r0.b;	 Catch:{ NumberFormatException -> 0x0151 }
        com.whatsapp.VerifyNumber.a(r0);	 Catch:{ NumberFormatException -> 0x0151 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0151 }
        r1 = 1;
        com.whatsapp.VerifySms.a(r0, r1);	 Catch:{ NumberFormatException -> 0x0151 }
        if (r2 == 0) goto L_0x014b;
    L_0x0035:
        r0 = com.whatsapp.v4.FAIL_MISMATCH;	 Catch:{ NumberFormatException -> 0x0153 }
        if (r13 != r0) goto L_0x0097;
    L_0x0039:
        r0 = z;
        r1 = 20;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.a;
        r0 = com.whatsapp.VerifySms.p(r0);
        r1 = "";
        r0.setText(r1);
        r0 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r3 = r12.b;
        r3 = r3.d;
        if (r3 == 0) goto L_0x0060;
    L_0x0057:
        r3 = r12.b;	 Catch:{ NumberFormatException -> 0x0155 }
        r3 = r3.d;	 Catch:{ NumberFormatException -> 0x0155 }
        r0 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0155 }
        r0 = r0 * r10;
    L_0x0060:
        r4 = 0;
        r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x0082;
    L_0x0066:
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x0161 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0161 }
        r5 = 2131231803; // 0x7f08043b float:1.8079697E38 double:1.052968417E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0161 }
        r7 = 0;
        r8 = r12.a;	 Catch:{ NumberFormatException -> 0x0161 }
        r8 = com.whatsapp.util.cs.f(r8, r0);	 Catch:{ NumberFormatException -> 0x0161 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x0161 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x0161 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x0161 }
        if (r2 == 0) goto L_0x0090;
    L_0x0082:
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x0163 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0163 }
        r5 = 2131231802; // 0x7f08043a float:1.8079695E38 double:1.0529684167E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x0163 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x0163 }
    L_0x0090:
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x0165 }
        com.whatsapp.VerifySms.b(r3, r0);	 Catch:{ NumberFormatException -> 0x0165 }
        if (r2 == 0) goto L_0x014b;
    L_0x0097:
        r0 = com.whatsapp.v4.ERROR_UNSPECIFIED;	 Catch:{ NumberFormatException -> 0x0165 }
        if (r13 != r0) goto L_0x00b7;
    L_0x009b:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0167 }
        r1 = 8;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0167 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0167 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0167 }
        r0 = com.whatsapp.VerifySms.q(r0);	 Catch:{ NumberFormatException -> 0x0167 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0167 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0167 }
        r1 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0.e(r1);	 Catch:{ NumberFormatException -> 0x0167 }
        if (r2 == 0) goto L_0x014b;
    L_0x00b7:
        r0 = com.whatsapp.v4.FAIL_MISSING;	 Catch:{ NumberFormatException -> 0x0169 }
        if (r13 != r0) goto L_0x0104;
    L_0x00bb:
        r0 = z;	 Catch:{ NumberFormatException -> 0x016b }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x016b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x016b }
        r0 = z;	 Catch:{ NumberFormatException -> 0x016b }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x016b }
        com.whatsapp.App.v(r0);	 Catch:{ NumberFormatException -> 0x016b }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x016b }
        r0 = com.whatsapp.VerifySms.p(r0);	 Catch:{ NumberFormatException -> 0x016b }
        r1 = "";
        r0.setText(r1);	 Catch:{ NumberFormatException -> 0x016b }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x016b }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x016b }
        r3 = 2131232197; // 0x7f0805c5 float:1.8080496E38 double:1.052968612E-314;
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x016b }
        r5 = 0;
        r6 = r12.a;	 Catch:{ NumberFormatException -> 0x016b }
        r7 = 2131232208; // 0x7f0805d0 float:1.8080519E38 double:1.0529686173E-314;
        r6 = r6.getString(r7);	 Catch:{ NumberFormatException -> 0x016b }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x016b }
        r5 = 1;
        r6 = r12.a;	 Catch:{ NumberFormatException -> 0x016b }
        r7 = 2131232215; // 0x7f0805d7 float:1.8080533E38 double:1.0529686207E-314;
        r6 = r6.getString(r7);	 Catch:{ NumberFormatException -> 0x016b }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x016b }
        r1 = r1.getString(r3, r4);	 Catch:{ NumberFormatException -> 0x016b }
        r0.j(r1);	 Catch:{ NumberFormatException -> 0x016b }
        if (r2 == 0) goto L_0x014b;
    L_0x0104:
        r0 = com.whatsapp.v4.FAIL_TOO_MANY_GUESSES;	 Catch:{ NumberFormatException -> 0x016d }
        if (r13 != r0) goto L_0x0186;
    L_0x0108:
        r0 = z;	 Catch:{ NumberFormatException -> 0x016f }
        r1 = 14;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x016f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x016f }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x016f }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x016f }
        if (r0 != 0) goto L_0x0120;
    L_0x0117:
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0171 }
        r1 = 31;
        r0.e(r1);	 Catch:{ NumberFormatException -> 0x0171 }
        if (r2 == 0) goto L_0x014b;
    L_0x0120:
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0173 }
        r1 = r12.b;	 Catch:{ NumberFormatException -> 0x0173 }
        r1 = r1.d;	 Catch:{ NumberFormatException -> 0x0173 }
        r4 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x0173 }
        r4 = r4 * r10;
        com.whatsapp.VerifySms.a(r0, r4);	 Catch:{ NumberFormatException -> 0x0173 }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0173 }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x0173 }
        r4 = com.whatsapp.VerifySms.g(r1);	 Catch:{ NumberFormatException -> 0x0173 }
        r0.a(r4);	 Catch:{ NumberFormatException -> 0x0173 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0173 }
        r1 = 36;
        r0.e(r1);	 Catch:{ NumberFormatException -> 0x0173 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0173 }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x0173 }
        r4 = com.whatsapp.VerifySms.g(r1);	 Catch:{ NumberFormatException -> 0x0173 }
        com.whatsapp.VerifySms.b(r0, r4);	 Catch:{ NumberFormatException -> 0x0173 }
    L_0x014b:
        r0 = r12.a;
        com.whatsapp.VerifySms.j(r0);
        return;
    L_0x0151:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0153 }
    L_0x0153:
        r0 = move-exception;
        throw r0;
    L_0x0155:
        r3 = move-exception;
        r3 = z;
        r4 = 19;
        r3 = r3[r4];
        com.whatsapp.util.Log.w(r3);
        goto L_0x0060;
    L_0x0161:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0163 }
    L_0x0163:
        r0 = move-exception;
        throw r0;
    L_0x0165:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0167 }
    L_0x0167:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0169 }
    L_0x0169:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x016b }
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x016d }
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        throw r0;
    L_0x0173:
        r0 = move-exception;
        r0 = z;	 Catch:{ NumberFormatException -> 0x02d6 }
        r1 = 15;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x02d6 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x02d6 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x02d6 }
        r1 = 31;
        r0.e(r1);	 Catch:{ NumberFormatException -> 0x02d6 }
        if (r2 == 0) goto L_0x014b;
    L_0x0186:
        r0 = com.whatsapp.v4.FAIL_GUESSED_TOO_FAST;	 Catch:{ NumberFormatException -> 0x02d6 }
        if (r13 != r0) goto L_0x01f2;
    L_0x018a:
        r0 = z;	 Catch:{ NumberFormatException -> 0x02d8 }
        r1 = 17;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x02d8 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x02d8 }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x02d8 }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x02d8 }
        if (r0 != 0) goto L_0x01a9;
    L_0x0199:
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x02da }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x02da }
        r3 = 2131231789; // 0x7f08042d float:1.8079669E38 double:1.0529684103E-314;
        r1 = r1.getString(r3);	 Catch:{ NumberFormatException -> 0x02da }
        r0.j(r1);	 Catch:{ NumberFormatException -> 0x02da }
        if (r2 == 0) goto L_0x014b;
    L_0x01a9:
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x01d8 }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x01d8 }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x01d8 }
        r0 = r0 * r10;
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x01d8 }
        r3.a(r0);	 Catch:{ NumberFormatException -> 0x01d8 }
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x01d8 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x01d8 }
        r5 = 2131231790; // 0x7f08042e float:1.807967E38 double:1.052968411E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x01d8 }
        r7 = 0;
        r8 = r12.a;	 Catch:{ NumberFormatException -> 0x01d8 }
        r8 = com.whatsapp.util.cs.f(r8, r0);	 Catch:{ NumberFormatException -> 0x01d8 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x01d8 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x01d8 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x01d8 }
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x01d8 }
        com.whatsapp.VerifySms.b(r3, r0);	 Catch:{ NumberFormatException -> 0x01d8 }
        goto L_0x014b;
    L_0x01d8:
        r0 = move-exception;
        r0 = z;	 Catch:{ NumberFormatException -> 0x02dc }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x02dc }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x02dc }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x02dc }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x02dc }
        r3 = 2131231789; // 0x7f08042d float:1.8079669E38 double:1.0529684103E-314;
        r1 = r1.getString(r3);	 Catch:{ NumberFormatException -> 0x02dc }
        r0.j(r1);	 Catch:{ NumberFormatException -> 0x02dc }
        if (r2 == 0) goto L_0x014b;
    L_0x01f2:
        r0 = com.whatsapp.v4.ERROR_CONNECTIVITY;	 Catch:{ NumberFormatException -> 0x02dc }
        if (r13 != r0) goto L_0x0227;
    L_0x01f6:
        r0 = z;	 Catch:{ NumberFormatException -> 0x02de }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x02de }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x02de }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x02de }
        r0 = com.whatsapp.VerifySms.q(r0);	 Catch:{ NumberFormatException -> 0x02de }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x02de }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x02de }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x02de }
        r3 = 2131231746; // 0x7f080402 float:1.8079582E38 double:1.052968389E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x02de }
        r5 = 0;
        r6 = r12.a;	 Catch:{ NumberFormatException -> 0x02de }
        r7 = 2131230939; // 0x7f0800db float:1.8077945E38 double:1.0529679903E-314;
        r6 = r6.getString(r7);	 Catch:{ NumberFormatException -> 0x02de }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x02de }
        r1 = r1.getString(r3, r4);	 Catch:{ NumberFormatException -> 0x02de }
        r0.j(r1);	 Catch:{ NumberFormatException -> 0x02de }
        if (r2 == 0) goto L_0x014b;
    L_0x0227:
        r0 = com.whatsapp.v4.FAIL_BLOCKED;	 Catch:{ NumberFormatException -> 0x02e0 }
        if (r13 != r0) goto L_0x0240;
    L_0x022b:
        r0 = z;	 Catch:{ NumberFormatException -> 0x02e2 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x02e2 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x02e2 }
        r0 = 12;
        com.whatsapp.VerifySms.b(r0);	 Catch:{ NumberFormatException -> 0x02e2 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x02e2 }
        com.whatsapp.VerifySms.m(r0);	 Catch:{ NumberFormatException -> 0x02e2 }
        if (r2 == 0) goto L_0x014b;
    L_0x0240:
        r0 = com.whatsapp.v4.FAIL_STALE;	 Catch:{ NumberFormatException -> 0x02e4 }
        if (r13 != r0) goto L_0x0263;
    L_0x0244:
        r0 = z;	 Catch:{ NumberFormatException -> 0x02e6 }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x02e6 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x02e6 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x02e6 }
        r0 = com.whatsapp.VerifySms.p(r0);	 Catch:{ NumberFormatException -> 0x02e6 }
        r1 = "";
        r0.setText(r1);	 Catch:{ NumberFormatException -> 0x02e6 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x02e6 }
        r1 = 2131231787; // 0x7f08042b float:1.8079665E38 double:1.0529684093E-314;
        r0.b(r1);	 Catch:{ NumberFormatException -> 0x02e6 }
        if (r2 == 0) goto L_0x014b;
    L_0x0263:
        r0 = com.whatsapp.v4.FAIL_TEMPORARILY_UNAVAILABLE;	 Catch:{ NumberFormatException -> 0x02e8 }
        if (r13 != r0) goto L_0x014b;
    L_0x0267:
        r0 = z;	 Catch:{ NumberFormatException -> 0x02ea }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x02ea }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x02ea }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x02ea }
        r1 = z;	 Catch:{ NumberFormatException -> 0x02ea }
        r3 = 13;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x02ea }
        r0.d(r1);	 Catch:{ NumberFormatException -> 0x02ea }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x02ea }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x02ea }
        if (r0 != 0) goto L_0x0290;
    L_0x0280:
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x02ec }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x02ec }
        r3 = 2131231789; // 0x7f08042d float:1.8079669E38 double:1.0529684103E-314;
        r1 = r1.getString(r3);	 Catch:{ NumberFormatException -> 0x02ec }
        r0.j(r1);	 Catch:{ NumberFormatException -> 0x02ec }
        if (r2 == 0) goto L_0x014b;
    L_0x0290:
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x02bf }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x02bf }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x02bf }
        r0 = r0 * r10;
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x02bf }
        r2.a(r0);	 Catch:{ NumberFormatException -> 0x02bf }
        r2 = r12.a;	 Catch:{ NumberFormatException -> 0x02bf }
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x02bf }
        r4 = 2131231790; // 0x7f08042e float:1.807967E38 double:1.052968411E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x02bf }
        r6 = 0;
        r7 = r12.a;	 Catch:{ NumberFormatException -> 0x02bf }
        r7 = com.whatsapp.util.cs.f(r7, r0);	 Catch:{ NumberFormatException -> 0x02bf }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x02bf }
        r3 = r3.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x02bf }
        r2.j(r3);	 Catch:{ NumberFormatException -> 0x02bf }
        r2 = r12.a;	 Catch:{ NumberFormatException -> 0x02bf }
        com.whatsapp.VerifySms.b(r2, r0);	 Catch:{ NumberFormatException -> 0x02bf }
        goto L_0x014b;
    L_0x02bf:
        r0 = move-exception;
        r0 = z;
        r1 = 18;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = r12.a;
        r1 = r12.a;
        r1 = r1.getString(r9);
        r0.j(r1);
        goto L_0x014b;
    L_0x02d6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02d8 }
    L_0x02d8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02da }
    L_0x02da:
        r0 = move-exception;
        throw r0;
    L_0x02dc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02de }
    L_0x02de:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02e0 }
    L_0x02e0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02e2 }
    L_0x02e2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02e4 }
    L_0x02e4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02e6 }
    L_0x02e6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02e8 }
    L_0x02e8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02ea }
    L_0x02ea:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02ec }
    L_0x02ec:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._k.a(com.whatsapp.v4):void");
    }

    protected v4 a(String[] strArr) {
        Log.i(z[2] + strArr[0]);
        v4 v4Var = v4.ERROR_UNSPECIFIED;
        try {
            this.b = amb.a(VerifySms.k(this.a), VerifySms.v(this.a), strArr[0], as.TYPED, this.a.getSharedPreferences(z[0], 0).getString(z[3], null));
            App.f(this.a, this.b.c);
            return this.b.e;
        } catch (IOException e) {
            String iOException = e.toString();
            try {
                Log.w(z[4] + iOException);
                if (iOException != null && iOException.contains(z[5])) {
                    v4Var = v4.ERROR_UNSPECIFIED;
                    if (!DialogToastActivity.f) {
                        return v4Var;
                    }
                }
                return v4.ERROR_CONNECTIVITY;
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Exception e3) {
            Log.e(z[1] + e3.toString());
            return v4Var;
        }
    }

    protected void onPreExecute() {
        try {
            Log.i(z[22]);
            if (!this.a.isFinishing()) {
                this.a.showDialog(24);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((v4) obj);
    }
}
