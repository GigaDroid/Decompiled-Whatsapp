package com.whatsapp.util;

import android.backport.util.Base64;
import com.whatsapp.arj;
import com.whatsapp.azx;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.ve;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class b2 {
    private static b2 g;
    private static final String[] z;
    private Cipher a;
    private Cipher b;
    private Cipher c;
    private Cipher d;
    private Cipher e;
    private Cipher f;
    private Cipher h;
    private Cipher i;
    private Cipher j;
    private Cipher k;
    private Cipher l;
    private Cipher m;
    private boolean n;
    private Cipher o;
    private Cipher p;
    private Cipher q;
    byte[] r;
    private Cipher s;
    private Cipher t;
    private Cipher u;

    static {
        String[] strArr = new String[48];
        String str = "lk\n\u000bxomvtpn}ltZIJ0J\\";
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
                        i3 = 45;
                        break;
                    case at.g /*1*/:
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = 89;
                        break;
                    case at.o /*3*/:
                        i3 = 36;
                        break;
                    default:
                        i3 = 59;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "lk\n";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "H@:VB]Z<V\u0014X@*QK]A+P^IK7GTIG7C";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "lk\n";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "lk\n\u000bxomvtpn}ltZIJ0J\\";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "lk\n\u000b|ncvjT}O=@RCI";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "lk\n\u000bxomvtpn}ltZIJ0J\\";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "lk\n\u000b|ncvjT}O=@RCI";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "G{*rc`@vC^ub`RK\u0019i\r~J}]\u0000LKAt\u001bFuHz";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "lk\n";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "lk\n";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "H@:VB]Z<V\u0014D@/EWDJ8H\\]O+EV";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "lk\n\u000bxomvtpn}ltZIJ0J\\";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "g^\tvm}doHch}\u001ffS\u001cg>BMiB\u0016]H[^\fv}bb";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "lk\n";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "lk\n";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "H@:VB]Z<V\u0014CA*QXE^8@_D@>";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "H@:VB]Z<V\u0014CA*QXEO5C";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "lk\n";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "lk\n\u000bxy|vjT}O=@RCI";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "lk\n\u000bxomvtpn}ltZIJ0J\\";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "lk\n\u000bxomvtpn}ltZIJ0J\\";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "lk\n\u000bxomvtpn}ltZIJ0J\\";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "lk\n";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "lk\n\u000bxomvtpn}ltZIJ0J\\";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "l}\u001amr";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "lk\n";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "eD7^ZHE\u0017WA\\@\u0016\u0014j_[nELX\u007fd\u0019";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "lk\n\u000bxy|vjT}O=@RCI";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "lk\n";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "H@:VB]Z<V\u0014IK:VB]ZvMU[O5M_FK ";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "H@:VB]Z<V\u0014IK:VB]ZvMU[O5M_LB>TZ_O4";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "H@:VB]Z<V\u0014IK:VB]ZvMU[O5M_FK ";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "IK:VB]Z0KU\r@6P\u001bLX8MWLL5A";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "H@:VB]Z<V\u0014IK:VB]ZvMU[O5M_LB>TZ_O4";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    str = "lk\n";
                    obj = 35;
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    strArr2 = strArr3;
                    str = "H@:VB]Z<V\u0014H@:\u000bTXZvMT\r";
                    obj = 36;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "H@:VB]Z<V\u0014H@:\u000bTXZvMT\r";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "lk\n";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "lk\n";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "H@:VB]Z<V\u0014H@:VB]ZvMU[O5M_LB>TZ_O4";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "H@:VB]Z<V\u0014H@:VB]ZvMU[O5M_FK ";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "H@:VB]Z<V\u0014H@:\u000bRB\u000e";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "H@:VB]Z<V\u0014H@:\u000bTXZvMT\r";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    str = "H@:VB]Z0KU\r@6P\u001bLX8MWLL5A";
                    obj = 44;
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    str = "H@:VB]Z<V\u0014H@:VB]ZvMU[O5M_FK ";
                    i = 46;
                    strArr2 = strArr3;
                    obj = 45;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    strArr2 = strArr3;
                    str = "H@:VB]Z<V\u0014H@:VB]ZvMU[O5M_LB>TZ_O4";
                    obj = 46;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    z = strArr3;
                    g = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = "H@:VB]Z<V\u0014D@/EWDJ2AB";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean b() {
        return this.n;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.io.InputStream r11, long r12, java.io.OutputStream r14, com.whatsapp.util.z r15, byte[] r16, byte[] r17, @android.support.annotation.Nullable com.whatsapp.gdrive.d9 r18) {
        /*
        r10 = this;
        r6 = com.whatsapp.util.Log.h;
        r2 = r10.n;
        if (r2 == 0) goto L_0x003d;
    L_0x0006:
        r2 = com.whatsapp.util.s.a;	 Catch:{ IOException -> 0x00e8 }
        r3 = r15.ordinal();	 Catch:{ IOException -> 0x00e8 }
        r2 = r2[r3];	 Catch:{ IOException -> 0x00e8 }
        switch(r2) {
            case 1: goto L_0x004b;
            case 2: goto L_0x01bf;
            case 3: goto L_0x01bc;
            case 4: goto L_0x01b9;
            case 5: goto L_0x01b6;
            case 6: goto L_0x007c;
            case 7: goto L_0x007c;
            case 8: goto L_0x01b3;
            case 9: goto L_0x01b3;
            default: goto L_0x0011;
        };	 Catch:{ IOException -> 0x00e8 }
    L_0x0011:
        r4 = 0;
        r3 = -1;
    L_0x0014:
        r2 = r10.r;	 Catch:{ IOException -> 0x00e8 }
        r2 = r11.read(r2);	 Catch:{ IOException -> 0x00e8 }
        if (r2 < 0) goto L_0x0038;
    L_0x001c:
        r7 = r10.r;	 Catch:{ IOException -> 0x00e8 }
        r8 = 0;
        r14.write(r7, r8, r2);	 Catch:{ IOException -> 0x00e8 }
        r8 = (long) r2;	 Catch:{ IOException -> 0x00e8 }
        r4 = r4 + r8;
        r8 = 100;
        r8 = r8 * r4;
        r8 = r8 / r12;
        r2 = (int) r8;
        if (r3 == r2) goto L_0x01ad;
    L_0x002b:
        if (r18 == 0) goto L_0x0036;
    L_0x002d:
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidKeyException -> 0x0156 }
        r0 = r18;
        r0.a(r3);	 Catch:{ InvalidKeyException -> 0x0156 }
    L_0x0036:
        if (r6 == 0) goto L_0x01aa;
    L_0x0038:
        r14.close();	 Catch:{ IOException -> 0x0158 }
    L_0x003b:
        if (r6 == 0) goto L_0x0199;
    L_0x003d:
        r2 = new java.lang.IllegalStateException;	 Catch:{ InvalidKeyException -> 0x0049 }
        r3 = z;	 Catch:{ InvalidKeyException -> 0x0049 }
        r4 = 45;
        r3 = r3[r4];	 Catch:{ InvalidKeyException -> 0x0049 }
        r2.<init>(r3);	 Catch:{ InvalidKeyException -> 0x0049 }
        throw r2;	 Catch:{ InvalidKeyException -> 0x0049 }
    L_0x0049:
        r2 = move-exception;
        throw r2;
    L_0x004b:
        r2 = new javax.crypto.CipherOutputStream;	 Catch:{ IOException -> 0x00e8 }
        r3 = r10.e;	 Catch:{ IOException -> 0x00e8 }
        r2.<init>(r14, r3);	 Catch:{ IOException -> 0x00e8 }
        if (r6 == 0) goto L_0x01b0;
    L_0x0054:
        r3 = r2;
    L_0x0055:
        r14 = new javax.crypto.CipherOutputStream;	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        r2 = r10.d;	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        r14.<init>(r3, r2);	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        if (r6 == 0) goto L_0x0011;
    L_0x005e:
        r3 = r14;
    L_0x005f:
        r14 = new javax.crypto.CipherOutputStream;	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        r2 = r10.l;	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        r14.<init>(r3, r2);	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        if (r6 == 0) goto L_0x0011;
    L_0x0068:
        r3 = r14;
    L_0x0069:
        r14 = new javax.crypto.CipherOutputStream;	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        r2 = r10.b;	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        r14.<init>(r3, r2);	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        if (r6 == 0) goto L_0x0011;
    L_0x0072:
        r3 = r14;
    L_0x0073:
        r14 = new javax.crypto.CipherOutputStream;	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        r2 = r10.p;	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        r14.<init>(r3, r2);	 Catch:{ IOException -> 0x01a1, all -> 0x019a }
        if (r6 == 0) goto L_0x0011;
    L_0x007c:
        r4 = new javax.crypto.spec.IvParameterSpec;	 Catch:{ IOException -> 0x00e8 }
        r0 = r17;
        r4.<init>(r0);	 Catch:{ IOException -> 0x00e8 }
        r5 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ IOException -> 0x00e8 }
        r2 = z;	 Catch:{ IOException -> 0x00e8 }
        r3 = 39;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00e8 }
        r0 = r16;
        r5.<init>(r0, r2);	 Catch:{ IOException -> 0x00e8 }
        r2 = com.whatsapp.util.z.CRYPT6;	 Catch:{ InvalidKeyException -> 0x00db, InvalidAlgorithmParameterException -> 0x0132 }
        if (r15 != r2) goto L_0x012d;
    L_0x0094:
        r2 = r10.c;	 Catch:{ InvalidKeyException -> 0x00db, InvalidAlgorithmParameterException -> 0x0132 }
        r3 = r2;
    L_0x0097:
        r2 = 1;
        r3.init(r2, r5, r4);	 Catch:{ InvalidKeyException -> 0x00dd, InvalidAlgorithmParameterException -> 0x0132 }
        r2 = new javax.crypto.CipherOutputStream;	 Catch:{ InvalidKeyException -> 0x00dd, InvalidAlgorithmParameterException -> 0x0132 }
        r2.<init>(r14, r3);	 Catch:{ InvalidKeyException -> 0x00dd, InvalidAlgorithmParameterException -> 0x0132 }
        r14 = r2;
    L_0x00a1:
        if (r6 == 0) goto L_0x0011;
    L_0x00a3:
        r2 = r14;
    L_0x00a4:
        r4 = new javax.crypto.spec.IvParameterSpec;	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        r0 = r17;
        r4.<init>(r0);	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        r5 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        r3 = z;	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        r7 = 40;
        r3 = r3[r7];	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        r0 = r16;
        r5.<init>(r0, r3);	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        r3 = com.whatsapp.util.z.CRYPT8;	 Catch:{ InvalidKeyException -> 0x0143, InvalidAlgorithmParameterException -> 0x0145 }
        if (r15 != r3) goto L_0x0152;
    L_0x00bc:
        r3 = r10.h;	 Catch:{ InvalidKeyException -> 0x0143, InvalidAlgorithmParameterException -> 0x0145 }
    L_0x00be:
        r7 = 1;
        r3.init(r7, r5, r4);	 Catch:{ InvalidKeyException -> 0x00ce, InvalidAlgorithmParameterException -> 0x0145 }
        r14 = new java.util.zip.GZIPOutputStream;	 Catch:{ InvalidKeyException -> 0x00ce, InvalidAlgorithmParameterException -> 0x0145 }
        r4 = new javax.crypto.CipherOutputStream;	 Catch:{ InvalidKeyException -> 0x00ce, InvalidAlgorithmParameterException -> 0x0145 }
        r4.<init>(r2, r3);	 Catch:{ InvalidKeyException -> 0x00ce, InvalidAlgorithmParameterException -> 0x0145 }
        r14.<init>(r4);	 Catch:{ InvalidKeyException -> 0x00ce, InvalidAlgorithmParameterException -> 0x0145 }
        goto L_0x0011;
    L_0x00ce:
        r3 = move-exception;
        r4 = z;	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        r5 = 46;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        com.whatsapp.util.Log.c(r4, r3);	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        r14 = r2;
        goto L_0x0011;
    L_0x00db:
        r2 = move-exception;
        throw r2;	 Catch:{ InvalidKeyException -> 0x00dd, InvalidAlgorithmParameterException -> 0x0132 }
    L_0x00dd:
        r2 = move-exception;
        r3 = z;	 Catch:{ IOException -> 0x00e8 }
        r4 = 42;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00e8 }
        com.whatsapp.util.Log.c(r3, r2);	 Catch:{ IOException -> 0x00e8 }
        goto L_0x00a1;
    L_0x00e8:
        r2 = move-exception;
    L_0x00e9:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x013e }
        r3.<init>();	 Catch:{ all -> 0x013e }
        r4 = z;	 Catch:{ all -> 0x013e }
        r5 = 43;
        r4 = r4[r5];	 Catch:{ all -> 0x013e }
        r3 = r3.append(r4);	 Catch:{ all -> 0x013e }
        r2 = r2.toString();	 Catch:{ all -> 0x013e }
        r2 = r3.append(r2);	 Catch:{ all -> 0x013e }
        r2 = r2.toString();	 Catch:{ all -> 0x013e }
        com.whatsapp.util.Log.e(r2);	 Catch:{ all -> 0x013e }
        r14.close();	 Catch:{ IOException -> 0x010c }
        goto L_0x003b;
    L_0x010c:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 44;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r2.toString();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        goto L_0x003b;
    L_0x012d:
        r2 = r10.j;	 Catch:{ InvalidKeyException -> 0x00dd, InvalidAlgorithmParameterException -> 0x0132 }
        r3 = r2;
        goto L_0x0097;
    L_0x0132:
        r2 = move-exception;
        r3 = z;	 Catch:{ IOException -> 0x00e8 }
        r4 = 47;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00e8 }
        com.whatsapp.util.Log.c(r3, r2);	 Catch:{ IOException -> 0x00e8 }
        goto L_0x00a1;
    L_0x013e:
        r2 = move-exception;
    L_0x013f:
        r14.close();	 Catch:{ IOException -> 0x0179 }
    L_0x0142:
        throw r2;
    L_0x0143:
        r3 = move-exception;
        throw r3;	 Catch:{ InvalidKeyException -> 0x00ce, InvalidAlgorithmParameterException -> 0x0145 }
    L_0x0145:
        r3 = move-exception;
        r4 = z;	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        r5 = 41;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        com.whatsapp.util.Log.c(r4, r3);	 Catch:{ IOException -> 0x01a5, all -> 0x019d }
        r14 = r2;
        goto L_0x0011;
    L_0x0152:
        r3 = r10.s;	 Catch:{ InvalidKeyException -> 0x00ce, InvalidAlgorithmParameterException -> 0x0145 }
        goto L_0x00be;
    L_0x0156:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x00e8 }
    L_0x0158:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 38;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r2.toString();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        goto L_0x003b;
    L_0x0179:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 37;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.e(r3);
        goto L_0x0142;
    L_0x0199:
        return;
    L_0x019a:
        r2 = move-exception;
        r14 = r3;
        goto L_0x013f;
    L_0x019d:
        r3 = move-exception;
        r14 = r2;
        r2 = r3;
        goto L_0x013f;
    L_0x01a1:
        r2 = move-exception;
        r14 = r3;
        goto L_0x00e9;
    L_0x01a5:
        r3 = move-exception;
        r14 = r2;
        r2 = r3;
        goto L_0x00e9;
    L_0x01aa:
        r3 = r2;
        goto L_0x0014;
    L_0x01ad:
        r2 = r3;
        goto L_0x0036;
    L_0x01b0:
        r14 = r2;
        goto L_0x0011;
    L_0x01b3:
        r2 = r14;
        goto L_0x00a4;
    L_0x01b6:
        r3 = r14;
        goto L_0x0073;
    L_0x01b9:
        r3 = r14;
        goto L_0x0069;
    L_0x01bc:
        r3 = r14;
        goto L_0x005f;
    L_0x01bf:
        r3 = r14;
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b2.a(java.io.InputStream, long, java.io.OutputStream, com.whatsapp.util.z, byte[], byte[], com.whatsapp.gdrive.d9):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.io.InputStream r16, java.io.OutputStream r17, int r18, int r19, long r20, com.whatsapp.gj r22, com.whatsapp.util.z r23, byte[] r24, byte[] r25) {
        /*
        r15 = this;
        r11 = com.whatsapp.util.Log.h;
        r2 = r15.n;	 Catch:{ InvalidKeyException -> 0x0012 }
        if (r2 != 0) goto L_0x0014;
    L_0x0006:
        r2 = new java.lang.IllegalStateException;	 Catch:{ InvalidKeyException -> 0x0012 }
        r3 = z;	 Catch:{ InvalidKeyException -> 0x0012 }
        r4 = 34;
        r3 = r3[r4];	 Catch:{ InvalidKeyException -> 0x0012 }
        r2.<init>(r3);	 Catch:{ InvalidKeyException -> 0x0012 }
        throw r2;	 Catch:{ InvalidKeyException -> 0x0012 }
    L_0x0012:
        r2 = move-exception;
        throw r2;
    L_0x0014:
        r4 = 0;
        r3 = 0;
        r2 = com.whatsapp.util.s.a;
        r5 = r23.ordinal();
        r2 = r2[r5];
        switch(r2) {
            case 1: goto L_0x0052;
            case 2: goto L_0x005f;
            case 3: goto L_0x006c;
            case 4: goto L_0x0079;
            case 5: goto L_0x0086;
            case 6: goto L_0x0093;
            case 7: goto L_0x0093;
            case 8: goto L_0x00e1;
            case 9: goto L_0x00e1;
            default: goto L_0x0021;
        };
    L_0x0021:
        r2 = r3;
        r10 = r4;
    L_0x0023:
        r4 = 0;
    L_0x0025:
        r3 = r15.r;
        r0 = r16;
        r3 = r0.read(r3);
        if (r3 < 0) goto L_0x0051;
    L_0x002f:
        r6 = r15.r;
        r7 = 0;
        r0 = r17;
        r0.write(r6, r7, r3);
        r6 = (long) r3;
        r12 = r4 + r6;
        if (r22 == 0) goto L_0x014e;
    L_0x003c:
        if (r19 <= 0) goto L_0x014e;
    L_0x003e:
        if (r2 == 0) goto L_0x0143;
    L_0x0040:
        r4 = r10.get();	 Catch:{ InvalidKeyException -> 0x0141 }
    L_0x0044:
        r3 = r22;
        r6 = r20;
        r8 = r18;
        r9 = r19;
        r3.a(r4, r6, r8, r9);
        if (r11 == 0) goto L_0x014e;
    L_0x0051:
        return;
    L_0x0052:
        r2 = new javax.crypto.CipherInputStream;
        r5 = r15.q;
        r0 = r16;
        r2.<init>(r0, r5);
        if (r11 == 0) goto L_0x0169;
    L_0x005d:
        r16 = r2;
    L_0x005f:
        r2 = new javax.crypto.CipherInputStream;
        r5 = r15.u;
        r0 = r16;
        r2.<init>(r0, r5);
        if (r11 == 0) goto L_0x0163;
    L_0x006a:
        r16 = r2;
    L_0x006c:
        r2 = new javax.crypto.CipherInputStream;
        r5 = r15.m;
        r0 = r16;
        r2.<init>(r0, r5);
        if (r11 == 0) goto L_0x015d;
    L_0x0077:
        r16 = r2;
    L_0x0079:
        r2 = new javax.crypto.CipherInputStream;
        r5 = r15.k;
        r0 = r16;
        r2.<init>(r0, r5);
        if (r11 == 0) goto L_0x0157;
    L_0x0084:
        r16 = r2;
    L_0x0086:
        r2 = new javax.crypto.CipherInputStream;
        r5 = r15.t;
        r0 = r16;
        r2.<init>(r0, r5);
        if (r11 == 0) goto L_0x0151;
    L_0x0091:
        r16 = r2;
    L_0x0093:
        r6 = new javax.crypto.spec.SecretKeySpec;
        r2 = z;
        r5 = 30;
        r2 = r2[r5];
        r0 = r24;
        r6.<init>(r0, r2);
        r7 = new javax.crypto.spec.IvParameterSpec;
        r0 = r25;
        r7.<init>(r0);
        r2 = com.whatsapp.util.z.CRYPT6;	 Catch:{ InvalidKeyException -> 0x00c1, InvalidAlgorithmParameterException -> 0x00d5 }
        r0 = r23;
        if (r0 != r2) goto L_0x00d1;
    L_0x00ad:
        r2 = r15.o;	 Catch:{ InvalidKeyException -> 0x00c1, InvalidAlgorithmParameterException -> 0x00d5 }
        r5 = r2;
    L_0x00b0:
        r2 = 2;
        r5.init(r2, r6, r7);	 Catch:{ InvalidKeyException -> 0x00c3, InvalidAlgorithmParameterException -> 0x00d5 }
        r2 = new javax.crypto.CipherInputStream;	 Catch:{ InvalidKeyException -> 0x00c3, InvalidAlgorithmParameterException -> 0x00d5 }
        r0 = r16;
        r2.<init>(r0, r5);	 Catch:{ InvalidKeyException -> 0x00c3, InvalidAlgorithmParameterException -> 0x00d5 }
        r10 = r4;
        r16 = r2;
        r2 = r3;
        goto L_0x0023;
    L_0x00c1:
        r2 = move-exception;
        throw r2;	 Catch:{ InvalidKeyException -> 0x00c3, InvalidAlgorithmParameterException -> 0x00d5 }
    L_0x00c3:
        r2 = move-exception;
        r5 = z;
        r6 = 33;
        r5 = r5[r6];
        com.whatsapp.util.Log.c(r5, r2);
        r2 = r3;
        r10 = r4;
        goto L_0x0023;
    L_0x00d1:
        r2 = r15.a;	 Catch:{ InvalidKeyException -> 0x00c3, InvalidAlgorithmParameterException -> 0x00d5 }
        r5 = r2;
        goto L_0x00b0;
    L_0x00d5:
        r2 = move-exception;
        r5 = z;
        r6 = 35;
        r5 = r5[r6];
        com.whatsapp.util.Log.c(r5, r2);
        if (r11 == 0) goto L_0x0021;
    L_0x00e1:
        r5 = new javax.crypto.spec.SecretKeySpec;
        r2 = z;
        r6 = 36;
        r2 = r2[r6];
        r0 = r24;
        r5.<init>(r0, r2);
        r7 = new javax.crypto.spec.IvParameterSpec;
        r0 = r25;
        r7.<init>(r0);
        r2 = com.whatsapp.util.z.CRYPT8;	 Catch:{ InvalidKeyException -> 0x0119, InvalidAlgorithmParameterException -> 0x0130 }
        r0 = r23;
        if (r0 != r2) goto L_0x012c;
    L_0x00fb:
        r2 = r15.f;	 Catch:{ InvalidKeyException -> 0x0119, InvalidAlgorithmParameterException -> 0x0130 }
        r6 = r2;
    L_0x00fe:
        r2 = 2;
        r6.init(r2, r5, r7);	 Catch:{ InvalidKeyException -> 0x011b, InvalidAlgorithmParameterException -> 0x0130 }
        r5 = new java.util.concurrent.atomic.AtomicLong;	 Catch:{ InvalidKeyException -> 0x011b, InvalidAlgorithmParameterException -> 0x0130 }
        r5.<init>();	 Catch:{ InvalidKeyException -> 0x011b, InvalidAlgorithmParameterException -> 0x0130 }
        r2 = 1;
        r3 = new java.util.zip.GZIPInputStream;	 Catch:{ InvalidKeyException -> 0x014a, InvalidAlgorithmParameterException -> 0x0146 }
        r4 = new com.whatsapp.util.ay;	 Catch:{ InvalidKeyException -> 0x014a, InvalidAlgorithmParameterException -> 0x0146 }
        r0 = r16;
        r4.<init>(r0, r6, r5);	 Catch:{ InvalidKeyException -> 0x014a, InvalidAlgorithmParameterException -> 0x0146 }
        r3.<init>(r4);	 Catch:{ InvalidKeyException -> 0x014a, InvalidAlgorithmParameterException -> 0x0146 }
        r10 = r5;
        r16 = r3;
        goto L_0x0023;
    L_0x0119:
        r2 = move-exception;
        throw r2;	 Catch:{ InvalidKeyException -> 0x011b, InvalidAlgorithmParameterException -> 0x0130 }
    L_0x011b:
        r2 = move-exception;
        r14 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r14;
    L_0x0120:
        r5 = z;
        r6 = 31;
        r5 = r5[r6];
        com.whatsapp.util.Log.c(r5, r4);
        r10 = r3;
        goto L_0x0023;
    L_0x012c:
        r2 = r15.i;	 Catch:{ InvalidKeyException -> 0x011b, InvalidAlgorithmParameterException -> 0x0130 }
        r6 = r2;
        goto L_0x00fe;
    L_0x0130:
        r2 = move-exception;
        r14 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r14;
    L_0x0135:
        r5 = z;
        r6 = 32;
        r5 = r5[r6];
        com.whatsapp.util.Log.c(r5, r4);
        r10 = r3;
        goto L_0x0023;
    L_0x0141:
        r2 = move-exception;
        throw r2;
    L_0x0143:
        r4 = r12;
        goto L_0x0044;
    L_0x0146:
        r3 = move-exception;
        r4 = r3;
        r3 = r5;
        goto L_0x0135;
    L_0x014a:
        r3 = move-exception;
        r4 = r3;
        r3 = r5;
        goto L_0x0120;
    L_0x014e:
        r4 = r12;
        goto L_0x0025;
    L_0x0151:
        r10 = r4;
        r16 = r2;
        r2 = r3;
        goto L_0x0023;
    L_0x0157:
        r10 = r4;
        r16 = r2;
        r2 = r3;
        goto L_0x0023;
    L_0x015d:
        r10 = r4;
        r16 = r2;
        r2 = r3;
        goto L_0x0023;
    L_0x0163:
        r10 = r4;
        r16 = r2;
        r2 = r3;
        goto L_0x0023;
    L_0x0169:
        r10 = r4;
        r16 = r2;
        r2 = r3;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b2.a(java.io.InputStream, java.io.OutputStream, int, int, long, com.whatsapp.gj, com.whatsapp.util.z, byte[], byte[]):void");
    }

    public static b2 a() {
        try {
            if (g == null) {
                g = new b2();
            }
            return g;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private b2() {
        this.r = new byte[131072];
        this.n = false;
        try {
            Key secretKeySpec = new SecretKeySpec(azx.b.getBytes(z[26]), z[10]);
            Key secretKeySpec2 = new SecretKeySpec(Base64.decode(z[14], 0), z[24]);
            Key secretKeySpec3 = new SecretKeySpec(ve.c(Base64.decode(z[9], 0)), z[15]);
            AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode(z[28], 0));
            this.e = Cipher.getInstance(z[19]);
            this.d = Cipher.getInstance(z[11]);
            this.l = Cipher.getInstance(z[2]);
            this.b = Cipher.getInstance(z[29]);
            this.p = Cipher.getInstance(z[7]);
            this.c = Cipher.getInstance(z[21]);
            this.j = Cipher.getInstance(z[5]);
            this.h = Cipher.getInstance(z[25]);
            this.s = Cipher.getInstance(z[6]);
            this.q = Cipher.getInstance(z[27]);
            this.u = Cipher.getInstance(z[16]);
            this.m = Cipher.getInstance(z[4]);
            this.k = Cipher.getInstance(z[20]);
            this.t = Cipher.getInstance(z[0]);
            this.o = Cipher.getInstance(z[13]);
            this.a = Cipher.getInstance(z[22]);
            this.f = Cipher.getInstance(z[23]);
            this.i = Cipher.getInstance(z[8]);
            this.e.init(1, secretKeySpec);
            this.d.init(1, secretKeySpec2);
            this.l.init(1, secretKeySpec3);
            this.b.init(1, secretKeySpec3, ivParameterSpec);
            this.p.init(1, secretKeySpec3, ivParameterSpec);
            this.q.init(2, secretKeySpec);
            this.u.init(2, secretKeySpec2);
            this.m.init(2, secretKeySpec3);
            this.k.init(2, secretKeySpec3, ivParameterSpec);
            this.t.init(2, secretKeySpec3, ivParameterSpec);
            this.n = true;
        } catch (Throwable e) {
            Log.c(z[3], e);
        } catch (Throwable e2) {
            Log.c(z[17], e2);
        } catch (Throwable e22) {
            Log.c(z[18], e22);
        } catch (Throwable e222) {
            Log.c(z[1], e222);
        } catch (Throwable e2222) {
            Log.c(z[12], e2222);
        }
    }
}
