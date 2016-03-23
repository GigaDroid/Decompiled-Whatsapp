package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SystemStatusActivity extends DialogToastActivity {
    private static final String[] z;
    private ArrayList n;
    private boolean o;
    private String p;
    private final List q;
    private boolean r;
    private boolean s;
    private String t;
    private int u;

    static {
        String[] strArr = new String[38];
        String str = "9PVN\u001a+]PNA8LVH\u0003/";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 41;
                        break;
                    case at.i /*2*/:
                        i3 = 37;
                        break;
                    case at.o /*3*/:
                        i3 = 61;
                        break;
                    default:
                        i3 = 110;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "9PK^";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "8LBT\u001d>[DI\u0007%G";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "9]DI\u001b9";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "9PVN\u001a+]PNA)[@\\\u001a/\u0006H\u0010\n%^K\u0012\u001d>[LS\tgGJIC,FPS\nj";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\u001a3Y@";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "j\t\u2007\u001d";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\u001d>HQH\u001d%GID";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "8LBT\u001d>[DI\u0007%G";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "@#";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "8LBT\u001d>[DI\u0007%G";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "8LBT\u001d>[DI\u0007%G";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0015[@^\u000b$]ID";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "9]WT\u0000-";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "9PVI\u000b'vVI\u000f>\\Vb";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "a_@O\u001d#FK";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\u001d/[SX\u001c,LDI\u001b8LVH\u0000+_DT\u0002+KIX";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ")ADI";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0015O@\\\u001a?[@";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "9PVN\u001a+]PNA)[@\\\u001a/\u0006AR\u0019$\u0006VI\u001c#GB\u0010\u0000%]\b[\u0001?GA\u001d";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "9]WT\u0000-";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "9PVN\u001a+]PNA)[@\\\u001a/";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\u000b'HLQ";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\"]QM\u001dp\u0006\nJ\u0006+]V\\\u001e:\u0007FR\u0003eHKY\u001c%@A";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "9PVI\u000b'vVI\u000f>\\Vb";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\b8FH";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\u0018/[VT\u0001$";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "@#";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0015M@N\r8@UI\u0007%G";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "9PVN\u001a+]PNA.LVI\u001c%P";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "9PVN\u001a+]PNA:HPN\u000b";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\u0018/[VT\u0001$";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\u001d>HQH\u001d%GID";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\u001a3Y@";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\u000b'HLQ";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\u001d/[SX\u001c,LDI\u001b8LVH\u0000+_DT\u0002+KIX";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = ")FH\u0013\u0019\"HQN\u000f:Y\u000bn\u00179]@P=>HQH\u001d\u000bJQT\u0018#]\\\u0013\b8FH";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "([J\\\n)HVI";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static String a(SystemStatusActivity systemStatusActivity) {
        return systemStatusActivity.p;
    }

    static int c(SystemStatusActivity systemStatusActivity) {
        return systemStatusActivity.u;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
        r11 = this;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r1 = 22;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r12);
        r0 = r11.getSupportActionBar();
        r1 = 1;
        r0.setDisplayHomeAsUpEnabled(r1);
        r0 = r11.getSupportActionBar();
        r1 = 1;
        r0.setDisplayShowCustomEnabled(r1);
        r0 = 2130903279; // 0x7f0300ef float:1.7413371E38 double:1.052806105E-314;
        r11.setContentView(r0);
        r0 = r11.getIntent();
        r1 = z;
        r2 = 26;
        r1 = r1[r2];
        r1 = r0.getStringExtra(r1);
        r11.p = r1;
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r2 = 0;
        r1 = r0.getIntExtra(r1, r2);
        r11.u = r1;
        r1 = r11.getSupportActionBar();
        r2 = 2131232126; // 0x7f08057e float:1.8080352E38 double:1.052968577E-314;
        r1.setTitle(r2);
        r1 = z;
        r2 = 23;
        r1 = r1[r2];
        r2 = 1;
        r1 = r0.getBooleanExtra(r1, r2);
        r11.o = r1;
        r1 = z;
        r2 = 27;
        r1 = r1[r2];
        r2 = 1;
        r1 = r0.getBooleanExtra(r1, r2);
        r11.s = r1;
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r2 = 0;
        r1 = r0.getBooleanExtra(r1, r2);
        r11.r = r1;
        r1 = z;
        r2 = 17;
        r1 = r1[r2];
        r0 = r0.getStringArrayListExtra(r1);
        r11.n = r0;
        r0 = r11.n;
        r1 = z;
        r2 = 11;
        r1 = r1[r2];
        r0 = r0.remove(r1);
        r4 = 0;
        r1 = r11.s;
        if (r1 != 0) goto L_0x0179;
    L_0x008e:
        r0 = com.whatsapp.App.j;
        r1 = 2;
        if (r0 != r1) goto L_0x0152;
    L_0x0093:
        r0 = 2131231778; // 0x7f080422 float:1.8079647E38 double:1.052968405E-314;
        r0 = r11.getString(r0);
    L_0x009a:
        r1 = r11.o;
        if (r1 == 0) goto L_0x0174;
    L_0x009e:
        r1 = 2131232128; // 0x7f080580 float:1.8080357E38 double:1.052968578E-314;
    L_0x00a1:
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r2[r3] = r0;
        r0 = r11.getString(r1, r2);
    L_0x00ab:
        if (r0 != 0) goto L_0x00ca;
    L_0x00ad:
        r1 = r11.r;
        if (r1 == 0) goto L_0x00ba;
    L_0x00b1:
        r0 = 2131231978; // 0x7f0804ea float:1.8080052E38 double:1.0529685036E-314;
        r0 = r11.getString(r0);
        if (r5 == 0) goto L_0x00ca;
    L_0x00ba:
        r1 = r11.p;
        r2 = r11.t;
        r3 = r11.u;
        r3 = java.lang.Integer.valueOf(r3);
        com.whatsapp.UserFeedbackActivity.a(r11, r1, r2, r3);
        r11.finish();
    L_0x00ca:
        r1 = r0;
        r0 = 2131755907; // 0x7f100383 float:1.9142707E38 double:1.053227359E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0.setText(r1);
        r0 = r11.r;
        if (r0 != 0) goto L_0x0145;
    L_0x00db:
        r0 = r11.o;
        if (r0 == 0) goto L_0x0145;
    L_0x00df:
        r0 = r11.t;
        if (r0 != 0) goto L_0x0121;
    L_0x00e3:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "+";
        r0 = r0.append(r1);
        r1 = "+";
        r2 = r11.n;
        r1 = android.text.TextUtils.join(r1, r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r11.t = r0;
        r0 = r11.s;
        if (r0 != 0) goto L_0x0121;
    L_0x0106:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r11.t;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 16;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        r11.t = r0;
    L_0x0121:
        r1 = new com.whatsapp.qz;
        r1.<init>(r11);
        r0 = 2131755910; // 0x7f100386 float:1.9142713E38 double:1.0532273605E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r0.setOnClickListener(r1);
        r0 = 2131755911; // 0x7f100387 float:1.9142715E38 double:1.053227361E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.gg;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        if (r5 == 0) goto L_0x0151;
    L_0x0145:
        r0 = 2131755908; // 0x7f100384 float:1.9142709E38 double:1.0532273595E-314;
        r0 = r11.findViewById(r0);
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0151:
        return;
    L_0x0152:
        r0 = com.whatsapp.App.j;
        if (r0 != 0) goto L_0x015f;
    L_0x0156:
        r0 = 2131231779; // 0x7f080423 float:1.8079649E38 double:1.0529684053E-314;
        r0 = r11.getString(r0);
        goto L_0x009a;
    L_0x015f:
        r0 = 2131231780; // 0x7f080424 float:1.807965E38 double:1.052968406E-314;
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r3 = z;
        r4 = 24;
        r3 = r3[r4];
        r1[r2] = r3;
        r0 = r11.getString(r0, r1);
        goto L_0x009a;
    L_0x0174:
        r1 = 2131232127; // 0x7f08057f float:1.8080354E38 double:1.0529685773E-314;
        goto L_0x00a1;
    L_0x0179:
        r1 = r11.u;
        r2 = 1;
        if (r1 == r2) goto L_0x01c8;
    L_0x017e:
        if (r0 == 0) goto L_0x039f;
    L_0x0180:
        r0 = r11.o;
        if (r0 != 0) goto L_0x01be;
    L_0x0184:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = 2131232119; // 0x7f080577 float:1.8080338E38 double:1.0529685733E-314;
        r1 = r11.getString(r1);
        r0 = r0.append(r1);
        r1 = " ";
        r1 = r0.append(r1);
        r0 = r11.q;
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r0 = r0.contains(r2);
        if (r0 == 0) goto L_0x01ba;
    L_0x01a9:
        r0 = 2131232095; // 0x7f08055f float:1.808029E38 double:1.0529685615E-314;
    L_0x01ac:
        r0 = r11.getString(r0);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x00ab;
    L_0x01ba:
        r0 = 2131232093; // 0x7f08055d float:1.8080286E38 double:1.0529685605E-314;
        goto L_0x01ac;
    L_0x01be:
        r0 = z;
        r1 = 12;
        r0 = r0[r1];
        r11.t = r0;
        if (r5 == 0) goto L_0x039f;
    L_0x01c8:
        r0 = r11.n;
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x01e7;
    L_0x01d6:
        r0 = r11.o;
        if (r0 == 0) goto L_0x01e3;
    L_0x01da:
        r0 = 2131232092; // 0x7f08055c float:1.8080283E38 double:1.05296856E-314;
    L_0x01dd:
        r0 = r11.getString(r0);
        goto L_0x00ab;
    L_0x01e3:
        r0 = 2131232091; // 0x7f08055b float:1.8080281E38 double:1.0529685595E-314;
        goto L_0x01dd;
    L_0x01e7:
        r0 = r11.n;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x039f;
    L_0x01ef:
        r3 = "";
        r2 = 0;
        r1 = 0;
        r0 = r11.n;
        r6 = r0.iterator();
    L_0x01fa:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0281;
    L_0x0200:
        r0 = r6.next();
        r0 = (java.lang.String) r0;
        r7 = r11.getResources();
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = z;
        r10 = 15;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r8 = r8.append(r0);
        r9 = z;
        r10 = 19;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r8 = r8.toString();
        r9 = z;
        r10 = 14;
        r9 = r9[r10];
        r10 = r11.getPackageName();
        r7 = r7.getIdentifier(r8, r9, r10);
        if (r7 == 0) goto L_0x0266;
    L_0x023b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1 = r1.append(r3);
        r3 = z;
        r8 = 7;
        r3 = r3[r8];
        r1 = r1.append(r3);
        r3 = r11.getString(r7);
        r1 = r1.append(r3);
        r3 = "\n";
        r1 = r1.append(r3);
        r3 = r1.toString();
        r1 = r2 + 1;
        if (r5 == 0) goto L_0x03a2;
    L_0x0264:
        r2 = r1;
        r1 = r0;
    L_0x0266:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 5;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r0 = r7.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x027f:
        if (r5 == 0) goto L_0x01fa;
    L_0x0281:
        r0 = 1;
        if (r2 <= r0) goto L_0x02fa;
    L_0x0284:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r3);
        r1 = "\n";
        r0 = r0.append(r1);
        r0 = r0.toString();
        r1 = r11.o;
        if (r1 == 0) goto L_0x02cb;
    L_0x029c:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = 2131232107; // 0x7f08056b float:1.8080314E38 double:1.0529685674E-314;
        r2 = r11.getString(r2);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 28;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = 2131232109; // 0x7f08056d float:1.8080318E38 double:1.0529685684E-314;
        r1 = r11.getString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x00ab;
    L_0x02cb:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = 2131232106; // 0x7f08056a float:1.8080312E38 double:1.052968567E-314;
        r2 = r11.getString(r2);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = 2131232108; // 0x7f08056c float:1.8080316E38 double:1.052968568E-314;
        r1 = r11.getString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x00ab;
    L_0x02fa:
        if (r2 <= 0) goto L_0x039f;
    L_0x02fc:
        r2 = r11.getPackageName();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r6 = 25;
        r3 = r3[r6];
        r0 = r0.append(r3);
        r0 = r0.append(r1);
        r3 = z;
        r6 = 29;
        r3 = r3[r6];
        r3 = r0.append(r3);
        r0 = r11.o;
        if (r0 == 0) goto L_0x0368;
    L_0x0321:
        r0 = z;
        r6 = 13;
        r0 = r0[r6];
    L_0x0327:
        r0 = r3.append(r0);
        r0 = r0.toString();
        r3 = r11.getResources();
        r6 = z;
        r7 = 21;
        r6 = r6[r7];
        r0 = r3.getIdentifier(r0, r6, r2);
        if (r0 == 0) goto L_0x037c;
    L_0x033f:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r11.getString(r0);
        r0 = r2.append(r0);
        r2 = " ";
        r2 = r0.append(r2);
        r0 = r11.o;
        if (r0 == 0) goto L_0x036c;
    L_0x0357:
        r0 = 2131232094; // 0x7f08055e float:1.8080288E38 double:1.052968561E-314;
    L_0x035a:
        r0 = r11.getString(r0);
        r0 = r2.append(r0);
        r0 = r0.toString();
        goto L_0x00ab;
    L_0x0368:
        r0 = "";
        goto L_0x0327;
    L_0x036c:
        r0 = r11.q;
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x0378;
    L_0x0374:
        r0 = 2131232095; // 0x7f08055f float:1.808029E38 double:1.0529685615E-314;
        goto L_0x035a;
    L_0x0378:
        r0 = 2131232093; // 0x7f08055d float:1.8080286E38 double:1.0529685605E-314;
        goto L_0x035a;
    L_0x037c:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 20;
        r1 = r1[r2];
        r1 = r0.append(r1);
        r0 = r11.n;
        r2 = 0;
        r0 = r0.get(r2);
        r0 = (java.lang.String) r0;
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x039f:
        r0 = r4;
        goto L_0x00ab;
    L_0x03a2:
        r2 = r1;
        r1 = r0;
        goto L_0x027f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SystemStatusActivity.onCreate(android.os.Bundle):void");
    }

    static String b(SystemStatusActivity systemStatusActivity) {
        return systemStatusActivity.t;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[30]);
    }

    public static void a(Context context, String str, Integer num, boolean z, boolean z2, ArrayList arrayList, boolean z3) {
        Intent intent = new Intent(context, SystemStatusActivity.class);
        intent.putExtra(z[37], str);
        intent.putExtra(z[35], z);
        intent.putExtra(z[32], z2);
        intent.putStringArrayListExtra(z[36], arrayList);
        intent.putExtra(z[33], z3);
        if (num != null) {
            intent.putExtra(z[34], num);
        }
        context.startActivity(intent);
    }

    public void onPause() {
        super.onPause();
        Log.i(z[31]);
    }

    public SystemStatusActivity() {
        this.q = Arrays.asList(new String[]{z[1], z[3], z[2], z[4]});
    }

    public void onResume() {
        super.onResume();
        Log.i(z[0]);
    }
}
