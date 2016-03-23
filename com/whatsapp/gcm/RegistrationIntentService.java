package com.whatsapp.gcm;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class RegistrationIntentService extends IntentService {
    public static int b;
    private static final String[] z;
    private final b a;

    static {
        String[] strArr = new String[42];
        String str = "M\\i&\u001cFRp{\n^C*i\bZZkfE|vBZ.}{";
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
                        i3 = 46;
                        break;
                    case at.g /*1*/:
                        i3 = 51;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 8;
                        break;
                    default:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "ipI2KXVva\rWZjoK\\Vca\u0018ZAe|\u0002A]?(\u0018KArm\u0019|Vca\u0018ZAe|\u0002A]MlV";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "M\\i&\u001cFRp{\n^C*i\bZZkfExvVA-w";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\\Vca\u0018ZAe|\u0002A]Ml";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "opGG>`g[E\"}`MF,";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "ipI2K\\Vca\u0018ZAe|\u0002A]$a\u0005ZVj|KOPpa\u0004@\u0013si\u0018\u000eFjc\u0005ADj3KG]pm\u0005Z\u000e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "ipI2K@\\p(\nXRmd\nL_a(\rAA$~\u000e\\@mg\u0005\u000e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "M\\i&\u001cFRp{\n^C*i\bZZkfE|vBZ.}{";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "\u0015\u0013ex\u001bBZgi\u001fG\\j^\u000e\\@mg\u0005\u0013";
                    obj = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "}vV^\"mv[F$zlE^*g\u007fEJ'k";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "czW[\"`t[A%}gEF(kz@W8kaRA(k";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "g}RI'gw[X*|rIM?kaW";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "M\\i&\fA\\cd\u000e\u0000Rjl\u0019AZ`&\b\u001cWi&\u001bKAia\u0018]ZkfE|vGM\"xv";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u007ffK\\*qv\\K.kwAL";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "ipI2K]Vjl\u0002@T$k\u0007GVj|KM\\jn\u0002I\u0013sa\u001fF\u0013jm\u001c\u000eGkc\u000e@\b$|\u0004EVj5";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "ipI2KK^t|\u0012\u000eGkc\u000e@\u0013vm\u001f[Ajm\u000f\u000eQq|K@\\$m\u0013MVt|\u0002A]$|\u0003\\\\sf";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "g]pm\u0019@Rh[\u000e\\Eaz.\\Akz";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "JVhi\u0012q^w";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "zzIM${g";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "ipI2KZ\\om\u0005\u000eAa|\u0019GVrm\u000f\u000e@qk\bK@wn\u001eB_}3KZ\\om\u0005\u0013";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "JVhi\u0012q^w";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "IPi";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\\Vca\u0018ZAe|\u0002A]Ml";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "ipI2KOGpm\u0006^GalKZ\\$z\u000eIZw|\u000e\\\u0013bg\u0019\u000etGEKLFp(\u0019KTm{\u001f\\Rpa\u0004@\u0013gg\u001e@G$\u007f\n]\u0013ap\bKV`m\u000f\u000eRhz\u000eOW}3KKKgm\u001bZZkf&K@wi\fK\u000e";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "ipI2K]Vg}\u0019GG}(\u000eVPax\u001fG\\j(\bOFc`\u001f\u0015\u0013w\u007f\u0002ZPla\u0005I\u0013pgKB\\joFM\\jf\u000eMG";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "M\\i&\u001cFRp{\n^C*i\bZZkfE|vBZ.}{";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "^Akk\u000e]@$a\u0018\u000eQel";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "M\\i&\u001cFRp{\n^C*i\bZZkfExvVA-w";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "z|KW&o}]W9ktM[?|rPA$``";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "ipI2K\\Vca\u0018ZAe|\u0002A]$a\u0005ZVj|KCZw{\u0002@T";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "|vPZ2q\u007fE\\.|";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "~{KF.qaAO\"}gVI?g|JW.|aKZ";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "ipI2KOGpm\u0006^GalKZ\\$z\u000eIZw|\u000e\\\u0013bg\u0019\u000etGEKLFp(,A\\cd\u000e\u000echi\u0012\u000e`az\u001dGPa{KYRw(\u0006G@wa\u0005I";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "ipI2K@\\$x\u0019KEmg\u001e]_}(\u0018OEalKZ\\om\u0005";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "M\\i&\u001cFRp{\n^C*i\bZZkfExvVA-w";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "ofP@.`gMK*zzKF4hrMD.j";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "O_ez\u0006";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "ipI2KOGpm\u0006^GalKZ\\$z\u000eIZw|\u000e\\\u0013bg\u0019\u000etGEKLFp(\u0019KPaa\u001dKW$}\u0005J\\g}\u0006K]pm\u000f\u000eVvz\u0004\\\b$m\u0013MVt|\u0002A]Im\u0018]RcmV";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "M\\i&\u001cFRp{\n^C*i\bZZkfE|vBZ.}{";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "M\\i&\u001cFRp{\n^C*i\bZZkfExvVA-w";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "ipI";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "ipI2K\\Vbz\u000e][mf\f\u000eTgeKZ\\om\u0005";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r13) {
        /*
        r12 = this;
        r3 = b;
        r4 = android.os.Binder.clearCallingIdentity();
        if (r13 != 0) goto L_0x0013;
    L_0x0008:
        r0 = z;	 Catch:{ IOException -> 0x0058 }
        r1 = 30;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0058 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0058 }
        if (r3 == 0) goto L_0x01bf;
    L_0x0013:
        r0 = z;	 Catch:{ IOException -> 0x005a }
        r1 = 26;
        r0 = r0[r1];	 Catch:{ IOException -> 0x005a }
        r1 = r13.getAction();	 Catch:{ IOException -> 0x005a }
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x005a }
        if (r0 != 0) goto L_0x0033;
    L_0x0023:
        r0 = z;	 Catch:{ IOException -> 0x005c }
        r1 = 28;
        r0 = r0[r1];	 Catch:{ IOException -> 0x005c }
        r1 = r13.getAction();	 Catch:{ IOException -> 0x005c }
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x005c }
        if (r0 == 0) goto L_0x01a6;
    L_0x0033:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x005e }
        r1 = 8;
        if (r0 >= r1) goto L_0x0065;
    L_0x0039:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0060 }
        r0.<init>();	 Catch:{ all -> 0x0060 }
        r1 = z;	 Catch:{ all -> 0x0060 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ all -> 0x0060 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0060 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0060 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0060 }
        r0 = r0.toString();	 Catch:{ all -> 0x0060 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x0060 }
        android.os.Binder.restoreCallingIdentity(r4);
    L_0x0057:
        return;
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        android.os.Binder.restoreCallingIdentity(r4);
        throw r0;
    L_0x0065:
        r0 = z;	 Catch:{ all -> 0x0060 }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ all -> 0x0060 }
        r6 = r13.getStringExtra(r0);	 Catch:{ all -> 0x0060 }
        r0 = r12.a;	 Catch:{ all -> 0x0060 }
        r7 = r0.e();	 Catch:{ all -> 0x0060 }
        r0 = r12.a;	 Catch:{ all -> 0x0060 }
        r8 = r0.i();	 Catch:{ all -> 0x0060 }
        r0 = r12.a;	 Catch:{ all -> 0x0060 }
        r9 = r0.c();	 Catch:{ all -> 0x0060 }
        r0 = z;	 Catch:{ IOException -> 0x010d }
        r1 = 40;
        r0 = r0[r1];	 Catch:{ IOException -> 0x010d }
        r1 = r13.getAction();	 Catch:{ IOException -> 0x010d }
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x010d }
        if (r0 == 0) goto L_0x0111;
    L_0x0091:
        r0 = android.text.TextUtils.isEmpty(r6);	 Catch:{ IOException -> 0x010d }
        if (r0 == 0) goto L_0x0111;
    L_0x0097:
        r0 = 1;
    L_0x0098:
        r1 = z;	 Catch:{ IOException -> 0x0113 }
        r2 = 35;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0113 }
        r2 = r13.getAction();	 Catch:{ IOException -> 0x0113 }
        r1 = r1.equals(r2);	 Catch:{ IOException -> 0x0113 }
        if (r1 == 0) goto L_0x0117;
    L_0x00a8:
        r1 = android.text.TextUtils.equals(r6, r8);	 Catch:{ IOException -> 0x0113 }
        if (r1 != 0) goto L_0x0117;
    L_0x00ae:
        r1 = 1;
        r2 = r1;
    L_0x00b0:
        r10 = android.text.TextUtils.isEmpty(r8);	 Catch:{ all -> 0x0060 }
        if (r7 <= 0) goto L_0x011a;
    L_0x00b6:
        if (r7 == r9) goto L_0x011a;
    L_0x00b8:
        r1 = 1;
    L_0x00b9:
        if (r0 != 0) goto L_0x00c1;
    L_0x00bb:
        if (r10 != 0) goto L_0x00c1;
    L_0x00bd:
        if (r2 != 0) goto L_0x00c1;
    L_0x00bf:
        if (r1 == 0) goto L_0x011c;
    L_0x00c1:
        r0 = 1;
    L_0x00c2:
        if (r0 != 0) goto L_0x00d4;
    L_0x00c4:
        r1 = z;	 Catch:{ IOException -> 0x011e }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ IOException -> 0x011e }
        r2 = r13.getAction();	 Catch:{ IOException -> 0x011e }
        r1 = r1.equals(r2);	 Catch:{ IOException -> 0x011e }
        if (r1 == 0) goto L_0x01a4;
    L_0x00d4:
        r1 = com.google.android.gms.iid.InstanceID.getInstance(r12);	 Catch:{ IOException -> 0x00fd, SecurityException -> 0x01c6 }
        r2 = 2131232314; // 0x7f08063a float:1.8080734E38 double:1.0529686697E-314;
        r2 = r12.getString(r2);	 Catch:{ IOException -> 0x00fd, SecurityException -> 0x01c6 }
        r9 = z;	 Catch:{ IOException -> 0x00fd, SecurityException -> 0x01c6 }
        r11 = 41;
        r9 = r9[r11];	 Catch:{ IOException -> 0x00fd, SecurityException -> 0x01c6 }
        r1 = r1.getToken(r2, r9);	 Catch:{ IOException -> 0x00fd, SecurityException -> 0x01c6 }
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IOException -> 0x00fb, SecurityException -> 0x01c6 }
        if (r2 == 0) goto L_0x0120;
    L_0x00ef:
        r0 = new java.lang.AssertionError;	 Catch:{ IOException -> 0x00fb, SecurityException -> 0x01c6 }
        r1 = z;	 Catch:{ IOException -> 0x00fb, SecurityException -> 0x01c6 }
        r2 = 16;
        r1 = r1[r2];	 Catch:{ IOException -> 0x00fb, SecurityException -> 0x01c6 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00fb, SecurityException -> 0x01c6 }
        throw r0;	 Catch:{ IOException -> 0x00fb, SecurityException -> 0x01c6 }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00fd, SecurityException -> 0x01c6 }
    L_0x00fd:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.getMessage();	 Catch:{ IOException -> 0x010b }
        if (r0 != 0) goto L_0x01fa;
    L_0x0105:
        r0 = new java.lang.AssertionError;	 Catch:{ IOException -> 0x010b }
        r0.<init>(r1);	 Catch:{ IOException -> 0x010b }
        throw r0;	 Catch:{ IOException -> 0x010b }
    L_0x010b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x0111:
        r0 = 0;
        goto L_0x0098;
    L_0x0113:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0115 }
    L_0x0115:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x0117:
        r1 = 0;
        r2 = r1;
        goto L_0x00b0;
    L_0x011a:
        r1 = 0;
        goto L_0x00b9;
    L_0x011c:
        r0 = 0;
        goto L_0x00c2;
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x0120:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r2.<init>();	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r9 = z;	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r11 = 20;
        r9 = r9[r11];	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r2 = r2.append(r9);	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r2 = r2.append(r1);	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r9 = z;	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r11 = 9;
        r9 = r9[r11];	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r2 = r2.append(r9);	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r2 = r2.append(r7);	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        if (r10 == 0) goto L_0x0157;
    L_0x014a:
        r2 = z;	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r9 = 34;
        r2 = r2[r9];	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
        r2 = 0;
        com.whatsapp.App.a(r12, r2);	 Catch:{ IOException -> 0x01c4, SecurityException -> 0x01c6 }
    L_0x0157:
        if (r0 != 0) goto L_0x015f;
    L_0x0159:
        r0 = android.text.TextUtils.equals(r1, r8);	 Catch:{ IOException -> 0x01f0, SecurityException -> 0x01c6 }
        if (r0 != 0) goto L_0x01a4;
    L_0x015f:
        r0 = r12.a;	 Catch:{ IOException -> 0x01f2, SecurityException -> 0x01c6 }
        r0.a(r1);	 Catch:{ IOException -> 0x01f2, SecurityException -> 0x01c6 }
        if (r7 <= 0) goto L_0x016b;
    L_0x0166:
        r0 = r12.a;	 Catch:{ IOException -> 0x01f4, SecurityException -> 0x01c6 }
        r0.a(r7);	 Catch:{ IOException -> 0x01f4, SecurityException -> 0x01c6 }
    L_0x016b:
        r0 = z;	 Catch:{ IOException -> 0x01f6, SecurityException -> 0x01c6 }
        r2 = 39;
        r0 = r0[r2];	 Catch:{ IOException -> 0x01f6, SecurityException -> 0x01c6 }
        r2 = r13.getAction();	 Catch:{ IOException -> 0x01f6, SecurityException -> 0x01c6 }
        r0 = r0.equals(r2);	 Catch:{ IOException -> 0x01f6, SecurityException -> 0x01c6 }
        if (r0 != 0) goto L_0x0181;
    L_0x017b:
        r0 = android.text.TextUtils.equals(r1, r6);	 Catch:{ IOException -> 0x01f6, SecurityException -> 0x01c6 }
        if (r0 != 0) goto L_0x01a4;
    L_0x0181:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
        r0.<init>();	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
        r2 = z;	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
        r6 = 15;
        r2 = r2[r6];	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
        r0 = z;	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
        r2 = 22;
        r0 = r0[r2];	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
        com.whatsapp.App.a(r1, r0);	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
    L_0x01a4:
        if (r3 == 0) goto L_0x01bf;
    L_0x01a6:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0383 }
        r0.<init>();	 Catch:{ IOException -> 0x0383 }
        r1 = z;	 Catch:{ IOException -> 0x0383 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0383 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0383 }
        r0 = r0.append(r13);	 Catch:{ IOException -> 0x0383 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0383 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0383 }
    L_0x01bf:
        android.os.Binder.restoreCallingIdentity(r4);
        goto L_0x0057;
    L_0x01c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00fd, SecurityException -> 0x01c6 }
    L_0x01c6:
        r0 = move-exception;
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x036f }
        if (r1 == 0) goto L_0x01ed;
    L_0x01cd:
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x036f }
        r2 = z;	 Catch:{ IOException -> 0x036f }
        r6 = 13;
        r2 = r2[r6];	 Catch:{ IOException -> 0x036f }
        r1 = r1.contains(r2);	 Catch:{ IOException -> 0x036f }
        if (r1 != 0) goto L_0x0373;
    L_0x01dd:
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x0371 }
        r2 = z;	 Catch:{ IOException -> 0x0371 }
        r6 = 27;
        r2 = r2[r6];	 Catch:{ IOException -> 0x0371 }
        r1 = r1.contains(r2);	 Catch:{ IOException -> 0x0371 }
        if (r1 != 0) goto L_0x0373;
    L_0x01ed:
        throw r0;	 Catch:{ IOException -> 0x01ee }
    L_0x01ee:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x01f0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01f2, SecurityException -> 0x01c6 }
    L_0x01f2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01f4, SecurityException -> 0x01c6 }
    L_0x01f4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00fd, SecurityException -> 0x01c6 }
    L_0x01f6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01f8, SecurityException -> 0x01c6 }
    L_0x01f8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00fd, SecurityException -> 0x01c6 }
    L_0x01fa:
        r2 = r1.getMessage();	 Catch:{ all -> 0x0060 }
        r0 = -1;
        r6 = r2.hashCode();	 Catch:{ IOException -> 0x02b8 }
        switch(r6) {
            case -2146020875: goto L_0x0220;
            case -1992442893: goto L_0x022f;
            case -1943616152: goto L_0x02a8;
            case -1800638118: goto L_0x024d;
            case -1579216525: goto L_0x0298;
            case -1515255836: goto L_0x0279;
            case -829011630: goto L_0x0288;
            case -595928767: goto L_0x0211;
            case 855732677: goto L_0x025c;
            case 901541140: goto L_0x026b;
            case 1750400351: goto L_0x023e;
            default: goto L_0x0206;
        };
    L_0x0206:
        switch(r0) {
            case 0: goto L_0x02ce;
            case 1: goto L_0x02ce;
            case 2: goto L_0x02ce;
            case 3: goto L_0x030d;
            case 4: goto L_0x031d;
            case 5: goto L_0x031d;
            case 6: goto L_0x0342;
            case 7: goto L_0x0342;
            case 8: goto L_0x0342;
            case 9: goto L_0x0342;
            case 10: goto L_0x0342;
            default: goto L_0x0209;
        };
    L_0x0209:
        r0 = new java.lang.AssertionError;	 Catch:{ IOException -> 0x020f }
        r0.<init>(r1);	 Catch:{ IOException -> 0x020f }
        throw r0;	 Catch:{ IOException -> 0x020f }
    L_0x020f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x0211:
        r6 = z;	 Catch:{ IOException -> 0x02b8 }
        r7 = 19;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02b8 }
        r6 = r2.equals(r6);	 Catch:{ IOException -> 0x02b8 }
        if (r6 == 0) goto L_0x0206;
    L_0x021d:
        r0 = 0;
        if (r3 == 0) goto L_0x0206;
    L_0x0220:
        r6 = z;	 Catch:{ IOException -> 0x02ba }
        r7 = 31;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02ba }
        r6 = r2.equals(r6);	 Catch:{ IOException -> 0x02ba }
        if (r6 == 0) goto L_0x0206;
    L_0x022c:
        r0 = 1;
        if (r3 == 0) goto L_0x0206;
    L_0x022f:
        r6 = z;	 Catch:{ IOException -> 0x02bc }
        r7 = 10;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02bc }
        r6 = r2.equals(r6);	 Catch:{ IOException -> 0x02bc }
        if (r6 == 0) goto L_0x0206;
    L_0x023b:
        r0 = 2;
        if (r3 == 0) goto L_0x0206;
    L_0x023e:
        r6 = z;	 Catch:{ IOException -> 0x02be }
        r7 = 11;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02be }
        r6 = r2.equals(r6);	 Catch:{ IOException -> 0x02be }
        if (r6 == 0) goto L_0x0206;
    L_0x024a:
        r0 = 3;
        if (r3 == 0) goto L_0x0206;
    L_0x024d:
        r6 = z;	 Catch:{ IOException -> 0x02c0 }
        r7 = 14;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02c0 }
        r6 = r2.equals(r6);	 Catch:{ IOException -> 0x02c0 }
        if (r6 == 0) goto L_0x0206;
    L_0x0259:
        r0 = 4;
        if (r3 == 0) goto L_0x0206;
    L_0x025c:
        r6 = z;	 Catch:{ IOException -> 0x02c2 }
        r7 = 29;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02c2 }
        r6 = r2.equals(r6);	 Catch:{ IOException -> 0x02c2 }
        if (r6 == 0) goto L_0x0206;
    L_0x0268:
        r0 = 5;
        if (r3 == 0) goto L_0x0206;
    L_0x026b:
        r6 = z;	 Catch:{ IOException -> 0x02c4 }
        r7 = 5;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02c4 }
        r6 = r2.equals(r6);	 Catch:{ IOException -> 0x02c4 }
        if (r6 == 0) goto L_0x0206;
    L_0x0276:
        r0 = 6;
        if (r3 == 0) goto L_0x0206;
    L_0x0279:
        r6 = z;	 Catch:{ IOException -> 0x02c6 }
        r7 = 36;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02c6 }
        r6 = r2.equals(r6);	 Catch:{ IOException -> 0x02c6 }
        if (r6 == 0) goto L_0x0206;
    L_0x0285:
        r0 = 7;
        if (r3 == 0) goto L_0x0206;
    L_0x0288:
        r6 = z;	 Catch:{ IOException -> 0x02c8 }
        r7 = 12;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02c8 }
        r6 = r2.equals(r6);	 Catch:{ IOException -> 0x02c8 }
        if (r6 == 0) goto L_0x0206;
    L_0x0294:
        r0 = 8;
        if (r3 == 0) goto L_0x0206;
    L_0x0298:
        r6 = z;	 Catch:{ IOException -> 0x02ca }
        r7 = 32;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02ca }
        r6 = r2.equals(r6);	 Catch:{ IOException -> 0x02ca }
        if (r6 == 0) goto L_0x0206;
    L_0x02a4:
        r0 = 9;
        if (r3 == 0) goto L_0x0206;
    L_0x02a8:
        r6 = z;	 Catch:{ IOException -> 0x02cc }
        r7 = 17;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02cc }
        r2 = r2.equals(r6);	 Catch:{ IOException -> 0x02cc }
        if (r2 == 0) goto L_0x0206;
    L_0x02b4:
        r0 = 10;
        goto L_0x0206;
    L_0x02b8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02ba:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02bc:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02be:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02c0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02c2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02c4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02c6:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02c8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02ca:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02cc:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x02ce:
        r0 = z;	 Catch:{ all -> 0x0060 }
        r2 = 18;
        r0 = r0[r2];	 Catch:{ all -> 0x0060 }
        r6 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        r6 = r13.getLongExtra(r0, r6);	 Catch:{ all -> 0x0060 }
        r8 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r6 = java.lang.Math.max(r6, r8);	 Catch:{ all -> 0x0060 }
        r0 = z;	 Catch:{ all -> 0x0060 }
        r2 = 21;
        r0 = r0[r2];	 Catch:{ all -> 0x0060 }
        r8 = 2;
        r8 = r8 * r6;
        r13.putExtra(r0, r8);	 Catch:{ all -> 0x0060 }
        r0 = z;	 Catch:{ all -> 0x0060 }
        r2 = 37;
        r0 = r0[r2];	 Catch:{ all -> 0x0060 }
        r0 = r12.getSystemService(r0);	 Catch:{ all -> 0x0060 }
        r0 = (android.app.AlarmManager) r0;	 Catch:{ all -> 0x0060 }
        r2 = 0;
        r8 = 0;
        r2 = android.app.PendingIntent.getService(r12, r2, r13, r8);	 Catch:{ all -> 0x0060 }
        r0.cancel(r2);	 Catch:{ IOException -> 0x0369 }
        r8 = 3;
        r10 = android.os.SystemClock.elapsedRealtime();	 Catch:{ IOException -> 0x0369 }
        r6 = r6 + r10;
        r0.set(r8, r6, r2);	 Catch:{ IOException -> 0x0369 }
        if (r3 == 0) goto L_0x01a4;
    L_0x030d:
        r0 = z;	 Catch:{ IOException -> 0x0369 }
        r2 = 33;
        r0 = r0[r2];	 Catch:{ IOException -> 0x0369 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0369 }
        r0 = r12.a;	 Catch:{ IOException -> 0x0369 }
        r0.h();	 Catch:{ IOException -> 0x0369 }
        if (r3 == 0) goto L_0x01a4;
    L_0x031d:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x036b }
        r0.<init>();	 Catch:{ IOException -> 0x036b }
        r2 = z;	 Catch:{ IOException -> 0x036b }
        r6 = 24;
        r2 = r2[r6];	 Catch:{ IOException -> 0x036b }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x036b }
        r2 = r1.getMessage();	 Catch:{ IOException -> 0x036b }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x036b }
        r0 = r0.toString();	 Catch:{ IOException -> 0x036b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x036b }
        r0 = r12.a;	 Catch:{ IOException -> 0x036b }
        r0.h();	 Catch:{ IOException -> 0x036b }
        if (r3 == 0) goto L_0x01a4;
    L_0x0342:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x036d }
        r0.<init>();	 Catch:{ IOException -> 0x036d }
        r2 = z;	 Catch:{ IOException -> 0x036d }
        r6 = 38;
        r2 = r2[r6];	 Catch:{ IOException -> 0x036d }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x036d }
        r2 = r1.getMessage();	 Catch:{ IOException -> 0x036d }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x036d }
        r0 = r0.toString();	 Catch:{ IOException -> 0x036d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x036d }
        r0 = r12.a;	 Catch:{ IOException -> 0x036d }
        r0.h();	 Catch:{ IOException -> 0x036d }
        if (r3 == 0) goto L_0x01a4;
    L_0x0367:
        goto L_0x0209;
    L_0x0369:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x036b }
    L_0x036b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x036d }
    L_0x036d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x020f }
    L_0x036f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0371 }
    L_0x0371:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01ee }
    L_0x0373:
        r1 = z;	 Catch:{ all -> 0x0060 }
        r2 = 25;
        r1 = r1[r2];	 Catch:{ all -> 0x0060 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x0060 }
        r0 = r12.a;	 Catch:{ all -> 0x0060 }
        r0.h();	 Catch:{ all -> 0x0060 }
        goto L_0x01a4;
    L_0x0383:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gcm.RegistrationIntentService.onHandleIntent(android.content.Intent):void");
    }

    public static void a(Context context, String str) {
        Log.i(z[2] + str);
        Intent intent = new Intent(z[3], null, context, RegistrationIntentService.class);
        try {
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra(z[4], str);
            }
            context.startService(intent);
        } catch (SecurityException e) {
            throw e;
        }
    }

    public static boolean a(Context context) {
        return new b(context).d();
    }

    public RegistrationIntentService() {
        super(RegistrationIntentService.class.getName());
        setIntentRedelivery(true);
        this.a = new b(this);
    }

    public static void b(Context context) {
        Log.i(z[1]);
        context.startService(new Intent(z[0], null, context, RegistrationIntentService.class));
    }
}
