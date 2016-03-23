package com.whatsapp.notification;

import android.app.Activity;
import com.whatsapp.App;
import com.whatsapp.a9z;
import com.whatsapp.arj;
import com.whatsapp.by;
import com.whatsapp.i8;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class y extends a9z {
    private static final String[] G;
    final PopupNotification F;

    static {
        String[] strArr = new String[25];
        String str = "s&\\\u00037p0G\u00010p";
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
                        i3 = 3;
                        break;
                    case at.g /*1*/:
                        i3 = 67;
                        break;
                    case at.i /*2*/:
                        i3 = 46;
                        break;
                    case at.o /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = 94;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "o,M\u0005;g\u001cC\u001d9\\*J";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "o,M\u0005;g\u001c^\u000b,n\u001cJ\u000b0j\"B13p$q\u0007:";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "b-J\u001c1j'\u0000\u001e;q.G\u001d-j,@@\fF\u0000a<\u001a\\\u0002{*\u0017L";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "g1O\u0019?a/K\u001d";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "b-J\u001c1j'\u0000\u001e;q.G\u001d-j,@@\tQ\nz+\u0001F\u001bz+\fM\u0002b1\rW\f|/\u0019F";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "s&\\\u00037p0G\u00010p";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "b-J\u001c1j'\u0000\u001e;q.G\u001d-j,@@\fF\u0000a<\u001a\\\u0002{*\u0017L";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "b-J\u001c1j'\u0000\u001e;q.G\u001d-j,@@\tQ\nz+\u0001F\u001bz+\fM\u0002b1\rW\f|/\u0019F";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "b-J\u001c1j'\u0000\u001e;q.G\u001d-j,@@\fF\u0000a<\u001a\\\u0002{*\u0017L";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "s&\\\u0003\u0001g&@\u0007?o\u001cC\u001d9\\*J";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "b-J\u001c1j'\u0000\u001e;q.G\u001d-j,@@\fF\u0002j1\u001b[\u0017k<\u0010B\u000fq=\nL\u0011o)\u001b";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "s&\\\u0003\u0001g&@\u0007?o\u001cC\u001d9\\*J";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "b-J\u001c1j'\u0000\u001e;q.G\u001d-j,@@\fF\u0002j1\u001b[\u0017k<\u0010B\u000fq=\nL\u0011o)\u001b";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "s&\\\u0003\u0001g&@\u0007?o\u001cC\u001d9\\*J";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "g1O\u0019?a/K\u001d";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "o,M\u0005;g\u001cC\u001d9\\*J";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "n0I17g";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "o,M\u0005;g\u001c^\u000b,n\u001cJ\u000b0j\"B13p$q\u0007:";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "n0I17g";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "g1O\u0019?a/K\u001d";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "n0I17g";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "s&\\\u00037p0G\u00010p";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "o,M\u0005;g\u001cC\u001d9\\*J";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    G = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "o,M\u0005;g\u001c^\u000b,n\u001cJ\u000b0j\"B13p$q\u0007:";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void j() {
        PopupNotification.j(this.F);
    }

    y(PopupNotification popupNotification, Activity activity, by byVar) {
        this.F = popupNotification;
        super(activity, byVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean b() {
        /*
        r12 = this;
        r11 = 3;
        r10 = 2;
        r1 = 1;
        r2 = 0;
        r4 = com.whatsapp.notification.PopupNotification.p;
        r0 = com.whatsapp.App.aO();
        if (r0 != 0) goto L_0x0021;
    L_0x000c:
        r0 = r1;
    L_0x000d:
        r3 = r12.F;
        r5 = G;
        r6 = 8;
        r5 = r5[r6];
        r3 = com.whatsapp.App.h(r3, r5);
        if (r3 == 0) goto L_0x0023;
    L_0x001b:
        r3 = r1;
    L_0x001c:
        if (r3 != 0) goto L_0x0025;
    L_0x001e:
        if (r0 != 0) goto L_0x0025;
    L_0x0020:
        return r1;
    L_0x0021:
        r0 = r2;
        goto L_0x000d;
    L_0x0023:
        r3 = r2;
        goto L_0x001c;
    L_0x0025:
        r5 = new com.whatsapp.RequestPermissionsDialogFragment;
        r5.<init>();
        r6 = new android.os.Bundle;
        r6.<init>();
        if (r3 == 0) goto L_0x0094;
    L_0x0031:
        if (r0 == 0) goto L_0x0094;
    L_0x0033:
        r3 = G;
        r7 = 16;
        r3 = r3[r7];
        r7 = new int[r11];
        r7 = {2130839701, 2130839702, 2130839704};
        r6.putIntArray(r3, r7);
        r3 = G;
        r3 = r3[r2];
        r7 = new java.lang.String[r11];
        r8 = G;
        r9 = 10;
        r8 = r8[r9];
        r7[r2] = r8;
        r8 = G;
        r9 = 9;
        r8 = r8[r9];
        r7[r1] = r8;
        r8 = G;
        r9 = 14;
        r8 = r8[r9];
        r7[r10] = r8;
        r6.putStringArray(r3, r7);
        r3 = G;
        r7 = 18;
        r3 = r3[r7];
        r7 = 2131231646; // 0x7f08039e float:1.8079379E38 double:1.0529683396E-314;
        r6.putInt(r3, r7);
        r3 = G;
        r7 = 11;
        r3 = r3[r7];
        r7 = 2131231643; // 0x7f08039b float:1.8079373E38 double:1.052968338E-314;
        r6.putInt(r3, r7);
        r3 = G;
        r7 = 17;
        r3 = r3[r7];
        r7 = 2131231645; // 0x7f08039d float:1.8079377E38 double:1.052968339E-314;
        r6.putInt(r3, r7);
        r3 = G;
        r7 = 19;
        r3 = r3[r7];
        r7 = 2131231644; // 0x7f08039c float:1.8079375E38 double:1.0529683386E-314;
        r6.putInt(r3, r7);
        if (r4 == 0) goto L_0x013c;
    L_0x0094:
        if (r0 == 0) goto L_0x00ef;
    L_0x0096:
        r0 = G;
        r3 = 5;
        r0 = r0[r3];
        r3 = new int[r1];
        r7 = 2130839704; // 0x7f020898 float:1.7284426E38 double:1.0527746945E-314;
        r3[r2] = r7;
        r6.putIntArray(r0, r3);
        r0 = G;
        r3 = 23;
        r0 = r0[r3];
        r3 = new java.lang.String[r10];
        r7 = G;
        r8 = 6;
        r7 = r7[r8];
        r3[r2] = r7;
        r7 = G;
        r8 = 12;
        r7 = r7[r8];
        r3[r1] = r7;
        r6.putStringArray(r0, r3);
        r0 = G;
        r3 = 20;
        r0 = r0[r3];
        r3 = 2131231666; // 0x7f0803b2 float:1.807942E38 double:1.0529683495E-314;
        r6.putInt(r0, r3);
        r0 = G;
        r3 = 13;
        r0 = r0[r3];
        r3 = 2131231663; // 0x7f0803af float:1.8079413E38 double:1.052968348E-314;
        r6.putInt(r0, r3);
        r0 = G;
        r3 = 24;
        r0 = r0[r3];
        r3 = 2131231665; // 0x7f0803b1 float:1.8079417E38 double:1.052968349E-314;
        r6.putInt(r0, r3);
        r0 = G;
        r0 = r0[r1];
        r3 = 2131231664; // 0x7f0803b0 float:1.8079415E38 double:1.0529683485E-314;
        r6.putInt(r0, r3);
        if (r4 == 0) goto L_0x013c;
    L_0x00ef:
        r0 = G;
        r3 = 21;
        r0 = r0[r3];
        r3 = new int[r1];
        r4 = 2130839701; // 0x7f020895 float:1.728442E38 double:1.052774693E-314;
        r3[r2] = r4;
        r6.putIntArray(r0, r3);
        r0 = G;
        r3 = 7;
        r0 = r0[r3];
        r1 = new java.lang.String[r1];
        r3 = G;
        r4 = 4;
        r3 = r3[r4];
        r1[r2] = r3;
        r6.putStringArray(r0, r1);
        r0 = G;
        r1 = 22;
        r0 = r0[r1];
        r1 = 2131231626; // 0x7f08038a float:1.8079338E38 double:1.0529683297E-314;
        r6.putInt(r0, r1);
        r0 = G;
        r1 = 15;
        r0 = r0[r1];
        r1 = 2131231625; // 0x7f080389 float:1.8079336E38 double:1.052968329E-314;
        r6.putInt(r0, r1);
        r0 = G;
        r0 = r0[r10];
        r1 = 2131231678; // 0x7f0803be float:1.8079444E38 double:1.0529683554E-314;
        r6.putInt(r0, r1);
        r0 = G;
        r0 = r0[r11];
        r1 = 2131231679; // 0x7f0803bf float:1.8079446E38 double:1.052968356E-314;
        r6.putInt(r0, r1);
    L_0x013c:
        r5.setArguments(r6);
        r0 = r12.F;
        r0 = r0.getSupportFragmentManager();
        r1 = com.whatsapp.notification.PopupNotification.a();
        r5.show(r0, r1);
        r1 = r2;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.y.b():boolean");
    }

    public void b(boolean z) {
        super.b(z);
        if (z) {
            App.a(PopupNotification.a(this.F), false, true);
        }
    }

    public void h() {
        App.a_();
        i8.f();
        super.h();
    }
}
