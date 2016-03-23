package com.google;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class fL {
    private static final Object a;
    private static final Object[][] b;
    private static final Object[][] c;
    private static final Object[][] d;
    private static final Object[][] e;

    private static String a(int i, int i2, String str) {
        if (str.length() < i) {
            throw aN.a();
        }
        String substring = str.substring(0, i);
        if (str.length() < i + i2) {
            throw aN.a();
        }
        String substring2 = str.substring(i, i + i2);
        String substring3 = str.substring(i + i2);
        substring = '(' + substring + ')' + substring2;
        substring2 = a(substring3);
        return substring2 == null ? substring : substring + substring2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(int r5, int r6, java.lang.String r7) {
        /*
        r0 = 0;
        r1 = r7.substring(r0, r5);
        r0 = r7.length();
        r2 = r5 + r6;
        if (r0 >= r2) goto L_0x0015;
    L_0x000d:
        r0 = r7.length();
        r2 = com.google.dt.c;
        if (r2 == 0) goto L_0x0017;
    L_0x0015:
        r0 = r5 + r6;
    L_0x0017:
        r2 = r7.substring(r5, r0);
        r3 = r7.substring(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = 40;
        r0 = r0.append(r4);
        r0 = r0.append(r1);
        r1 = 41;
        r0 = r0.append(r1);
        r0 = r0.append(r2);
        r0 = r0.toString();
        r1 = a(r3);
        if (r1 != 0) goto L_0x0043;
    L_0x0042:
        return r0;
    L_0x0043:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r2.append(r0);
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fL.b(int, int, java.lang.String):java.lang.String");
    }

    static String a(String str) {
        boolean z = dt.c;
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw aN.a();
        }
        String substring = str.substring(0, 2);
        Object[][] objArr = c;
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object[] objArr2 = objArr[i];
            if (!objArr2[0].equals(substring)) {
                i++;
                if (z) {
                    break;
                }
            } else if (objArr2[1] == a) {
                return b(2, ((Integer) objArr2[2]).intValue(), str);
            } else {
                return a(2, ((Integer) objArr2[1]).intValue(), str);
            }
        }
        if (str.length() < 3) {
            throw aN.a();
        }
        substring = str.substring(0, 3);
        objArr = b;
        length = objArr.length;
        i = 0;
        while (i < length) {
            objArr2 = objArr[i];
            if (!objArr2[0].equals(substring)) {
                i++;
                if (z) {
                    break;
                }
            } else if (objArr2[1] == a) {
                return b(3, ((Integer) objArr2[2]).intValue(), str);
            } else {
                return a(3, ((Integer) objArr2[1]).intValue(), str);
            }
        }
        objArr = d;
        length = objArr.length;
        i = 0;
        while (i < length) {
            objArr2 = objArr[i];
            if (!objArr2[0].equals(substring)) {
                i++;
                if (z) {
                    break;
                }
            } else if (objArr2[1] == a) {
                return b(4, ((Integer) objArr2[2]).intValue(), str);
            } else {
                return a(4, ((Integer) objArr2[1]).intValue(), str);
            }
        }
        if (str.length() < 4) {
            throw aN.a();
        }
        substring = str.substring(0, 4);
        objArr = e;
        length = objArr.length;
        i = 0;
        while (i < length) {
            objArr2 = objArr[i];
            if (!objArr2[0].equals(substring)) {
                i++;
                if (z) {
                    break;
                }
            }
            return objArr2[1] == a ? b(4, ((Integer) objArr2[2]).intValue(), str) : a(4, ((Integer) objArr2[1]).intValue(), str);
        }
        throw aN.a();
    }

    static {
        a = new Object();
        Object[][] objArr = new Object[24][];
        Object[] objArr2 = new Object[2];
        String str = "<=";
        int i = -1;
        int i2 = 0;
        Object[][] objArr3 = objArr;
        Object[][] objArr4 = objArr;
        Integer[] numArr = objArr2;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 12;
                        break;
                    case at.g /*1*/:
                        i4 = 13;
                        break;
                    case at.i /*2*/:
                        i4 = 9;
                        break;
                    case at.o /*3*/:
                        i4 = 44;
                        break;
                    default:
                        i4 = 48;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            Integer[] numArr2;
            switch (i) {
                case v.m /*0*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(14);
                    objArr3[i2] = numArr;
                    numArr2 = new Object[2];
                    objArr2 = numArr2;
                    numArr = numArr2;
                    i2 = 2;
                    objArr3 = objArr4;
                    str = "<?";
                    i = 1;
                    break;
                case at.g /*1*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(14);
                    objArr3[i2] = numArr;
                    numArr2 = new Object[3];
                    objArr2 = numArr2;
                    numArr = numArr2;
                    i2 = 3;
                    objArr3 = objArr4;
                    str = "==";
                    i = 2;
                    break;
                case at.i /*2*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(20);
                    objArr3[i2] = numArr;
                    numArr2 = new Object[2];
                    numArr = numArr2;
                    i2 = 4;
                    objArr3 = objArr4;
                    objArr2 = numArr2;
                    str = "=<";
                    i = 3;
                    break;
                case at.o /*3*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "=?";
                    i = 4;
                    i2 = 5;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case at.p /*4*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "=>";
                    i = 5;
                    numArr = objArr2;
                    i2 = 6;
                    objArr3 = objArr4;
                    break;
                case at.m /*5*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    numArr2 = new Object[2];
                    numArr = numArr2;
                    i2 = 7;
                    objArr3 = objArr4;
                    objArr2 = numArr2;
                    str = "=8";
                    i = 6;
                    break;
                case Y.f /*6*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "=:";
                    i = 7;
                    i2 = 8;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case aF.v /*7*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = ">=";
                    i = 8;
                    i2 = 9;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case aF.u /*8*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(2);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "><";
                    i = 9;
                    i2 = 10;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case Y.l /*9*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(20);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = ">?";
                    i = 10;
                    i2 = 11;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case Y.t /*10*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(29);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "?=";
                    i = 11;
                    i2 = 12;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case Y.j /*11*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(8);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "?:";
                    i = 12;
                    i2 = 13;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case Y.p /*12*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(8);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "5=";
                    i = 13;
                    i2 = 14;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case Y.q /*13*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "5<";
                    i = 14;
                    i2 = 15;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "5?";
                    i = 15;
                    i2 = 16;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "5>";
                    i = 16;
                    i2 = 17;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "59";
                    i = 17;
                    i2 = 18;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "58";
                    i = 18;
                    i2 = 19;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "5;";
                    i = 19;
                    i2 = 20;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "5:";
                    i = 20;
                    i2 = 21;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "55";
                    i = 21;
                    i2 = 22;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "54";
                    i = 22;
                    i2 = 23;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    c = objArr4;
                    objArr = new Object[23][];
                    objArr2 = new Object[3];
                    str = ">99";
                    i = 23;
                    i2 = 0;
                    objArr3 = objArr;
                    objArr4 = objArr;
                    numArr = objArr2;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = ">98";
                    i = 24;
                    numArr = objArr2;
                    i2 = 1;
                    objArr3 = objArr4;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = ">9;";
                    i = 25;
                    numArr = objArr2;
                    i2 = 2;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = ">89";
                    i = 26;
                    numArr = objArr2;
                    i2 = 3;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = ">88";
                    i = 27;
                    i2 = 4;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = ">8:";
                    i = 28;
                    i2 = 5;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(17);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = ">8=";
                    i = 29;
                    numArr = objArr2;
                    i2 = 6;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(20);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "8=9";
                    i = 30;
                    i2 = 7;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "8=8";
                    i = 31;
                    i2 = 8;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "8=;";
                    i = 32;
                    i2 = 9;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(17);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "8=:";
                    i = 33;
                    i2 = 10;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "8<9";
                    i = 34;
                    i2 = 11;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(13);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "8<8";
                    i = 35;
                    i2 = 12;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(13);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "8<;";
                    i = 36;
                    i2 = 13;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(13);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "8<:";
                    i = 37;
                    i2 = 14;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(13);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "8<=";
                    i = 38;
                    i2 = 15;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(13);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "8?9";
                    i = 39;
                    i2 = 16;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(20);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "8?8";
                    i = 40;
                    i2 = 17;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(15);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "8?;";
                    i = 41;
                    i2 = 18;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(3);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "8?:";
                    i = 42;
                    i2 = 19;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(15);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "8?=";
                    i = 43;
                    i2 = 20;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(3);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "8?<";
                    i = 44;
                    i2 = 21;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(3);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "8??";
                    i = 45;
                    i2 = 22;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(3);
                    objArr3[i2] = numArr;
                    b = objArr4;
                    objArr = new Object[57][];
                    objArr2 = new Object[2];
                    str = "?<9";
                    i = 46;
                    i2 = 0;
                    objArr3 = objArr;
                    objArr4 = objArr;
                    numArr = objArr2;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?<8";
                    i = 47;
                    numArr = objArr2;
                    i2 = 1;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?<;";
                    i = 48;
                    numArr = objArr2;
                    i2 = 2;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?<:";
                    i = 49;
                    numArr = objArr2;
                    i2 = 3;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?<=";
                    i = 50;
                    i2 = 4;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?<<";
                    i = 51;
                    i2 = 5;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?<?";
                    i = 52;
                    numArr = objArr2;
                    i2 = 6;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "??9";
                    i = 53;
                    i2 = 7;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "??8";
                    i = 54;
                    i2 = 8;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "??;";
                    i = 55;
                    i2 = 9;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "??:";
                    i = 56;
                    i2 = 10;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "??=";
                    i = 57;
                    i2 = 11;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "??<";
                    i = 58;
                    i2 = 12;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "???";
                    i = 59;
                    i2 = 13;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "??>";
                    i = 60;
                    i2 = 14;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "??1";
                    i = 61;
                    i2 = 15;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "??0";
                    i = 62;
                    i2 = 16;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?>9";
                    i = 63;
                    i2 = 17;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?>8";
                    i = 64;
                    i2 = 18;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?>;";
                    i = 65;
                    i2 = 19;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?>:";
                    i = 66;
                    i2 = 20;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?>=";
                    i = 67;
                    i2 = 21;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?><";
                    i = 68;
                    i2 = 22;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?>?";
                    i = 69;
                    i2 = 23;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?99";
                    i = 70;
                    i2 = 24;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?98";
                    i = 71;
                    i2 = 25;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?9;";
                    i = 72;
                    i2 = 26;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?9:";
                    i = 73;
                    i2 = 27;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?9=";
                    i = 74;
                    i2 = 28;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?9<";
                    i = 75;
                    i2 = 29;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?9?";
                    i = 76;
                    i2 = 30;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?9>";
                    i = 77;
                    i2 = 31;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?91";
                    i = 78;
                    i2 = 32;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?90";
                    i = 79;
                    i2 = 33;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?89";
                    i = 80;
                    i2 = 34;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?88";
                    i = 81;
                    i2 = 35;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?8;";
                    i = 82;
                    i2 = 36;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?8:";
                    i = 83;
                    i2 = 37;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?8=";
                    i = 84;
                    i2 = 38;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?8<";
                    i = 85;
                    i2 = 39;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?8?";
                    i = 86;
                    i2 = 40;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?8>";
                    i = 87;
                    i2 = 41;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?;9";
                    i = 88;
                    i2 = 42;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?;8";
                    i = 89;
                    i2 = 43;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?;;";
                    i = 90;
                    i2 = 44;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?;:";
                    i = 91;
                    i2 = 45;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?;=";
                    i = 92;
                    i2 = 46;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?;<";
                    i = 93;
                    i2 = 47;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?;?";
                    i = 94;
                    i2 = 48;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?;>";
                    i = 95;
                    i2 = 49;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?;1";
                    i = 96;
                    i2 = 50;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "?;0";
                    i = 97;
                    i2 = 51;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "?49";
                    i = 98;
                    i2 = 52;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(15);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "?48";
                    i = 99;
                    i2 = 53;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(18);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "?4;";
                    i = 100;
                    i2 = 54;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(15);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "?4:";
                    i = arj.Theme_buttonStyleSmall;
                    i2 = 55;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(18);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = ";=:";
                    i = arj.Theme_checkboxStyle;
                    i2 = 56;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    d = objArr4;
                    objArr = new Object[18][];
                    objArr2 = new Object[2];
                    str = ";=9\u001d";
                    i = arj.Theme_checkedTextViewStyle;
                    i2 = 0;
                    objArr3 = objArr;
                    objArr4 = objArr;
                    numArr = objArr2;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(13);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = ";=9\u001e";
                    i = arj.Theme_editTextStyle;
                    numArr = objArr2;
                    i2 = 1;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = ";=9\u001f";
                    i = arj.Theme_radioButtonStyle;
                    numArr = objArr2;
                    i2 = 2;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(10);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "4=9\u001d";
                    i = arj.Theme_ratingBarStyle;
                    numArr = objArr2;
                    i2 = 3;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(14);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "4=9\u001e";
                    i = arj.Theme_seekBarStyle;
                    i2 = 4;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(20);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "4=9\u001f";
                    i = arj.Theme_spinnerStyle;
                    i2 = 5;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "4=9\u0018";
                    i = arj.Theme_switchStyle;
                    numArr = objArr2;
                    i2 = 6;
                    objArr3 = objArr4;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "4=9\u0019";
                    i = 110;
                    i2 = 7;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 110:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "4=9\u001a";
                    i = 111;
                    i2 = 8;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 111:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(18);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "4=9\u001b";
                    i = 112;
                    i2 = 9;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 112:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(30);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "4=9\u0014";
                    i = 113;
                    i2 = 10;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 113:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(12);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "4=8\u0014";
                    i = 114;
                    i2 = 11;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 114:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(18);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "4=;\u001c";
                    i = 115;
                    i2 = 12;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 115:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(25);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "4<9\u001c";
                    i = 116;
                    i2 = 13;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 116:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(6);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "4<9\u001d";
                    i = 117;
                    i2 = 14;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 117:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(10);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[2];
                    str = "4<9\u001e";
                    i = 118;
                    i2 = 15;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 118:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(2);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "4<8\u001c";
                    i = 119;
                    i2 = 16;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 119:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(70);
                    objArr3[i2] = numArr;
                    objArr2 = new Object[3];
                    str = "4?9\u001c";
                    i = 120;
                    i2 = 17;
                    objArr3 = objArr4;
                    numArr = objArr2;
                    break;
                case 120:
                    objArr2[0] = str;
                    numArr[1] = a;
                    numArr[2] = Integer.valueOf(70);
                    objArr3[i2] = numArr;
                    e = objArr4;
                    return;
                default:
                    objArr2[0] = str;
                    numArr[1] = Integer.valueOf(18);
                    objArr3[i2] = numArr;
                    numArr2 = new Object[2];
                    objArr2 = numArr2;
                    numArr = numArr2;
                    i2 = 1;
                    objArr3 = objArr4;
                    str = "<<";
                    i = 0;
                    break;
            }
        }
    }
}
