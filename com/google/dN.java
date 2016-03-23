package com.google;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.HashMap;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum dN {
    ;
    
    public static final dN ASCII;
    public static final dN Big5;
    public static final dN Cp1250;
    public static final dN Cp1251;
    public static final dN Cp1252;
    public static final dN Cp1256;
    public static final dN Cp437;
    public static final dN EUC_KR;
    public static final dN GB18030;
    public static final dN ISO8859_1;
    public static final dN ISO8859_10;
    public static final dN ISO8859_11;
    public static final dN ISO8859_13;
    public static final dN ISO8859_14;
    public static final dN ISO8859_15;
    public static final dN ISO8859_16;
    public static final dN ISO8859_2;
    public static final dN ISO8859_3;
    public static final dN ISO8859_4;
    public static final dN ISO8859_5;
    public static final dN ISO8859_6;
    public static final dN ISO8859_7;
    public static final dN ISO8859_8;
    public static final dN ISO8859_9;
    public static final dN SJIS;
    public static final dN UTF8;
    public static final dN UnicodeBigUnmarked;
    private static final Map b;
    private static final Map d;
    private static final String[] z;
    private final String[] a;
    private final int[] c;

    public static dN getCharacterSetECIByName(String str) {
        return (dN) d.get(str);
    }

    public static dN getCharacterSetECIByValue(int i) {
        if (i >= 0 && i < 900) {
            return (dN) b.get(Integer.valueOf(i));
        }
        throw aG.a();
    }

    public int getValue() {
        return this.c[0];
    }

    private dN(int i, String[] strArr) {
        this.c = new int[]{i};
        this.a = strArr;
    }

    static {
        String[] strArr = new String[55];
        String str = "@.Z\u0016\u0007@4\u0019CZ\u0002w";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 55;
                        break;
                    case at.g /*1*/:
                        i4 = 71;
                        break;
                    case at.i /*2*/:
                        i4 = 52;
                        break;
                    case at.o /*3*/:
                        i4 = 114;
                        break;
                    default:
                        i4 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "b\u0013r_P";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "~\u0014{JP\u0002~kCX";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "r\u0012w-+y";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "~\u0014{_P\u000fr\r_Y\u0001";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "p\u0005\u0005JX\u0004w";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "~\u0014{_P\u000fr\r__";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "~\u0014{_P\u000fr\r_Y\u0002";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "b\u0013r_Y\u0001\u0005q";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "~\u0014{_P\u000fr\r_]";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "@.Z\u0016\u0007@4\u0019CZ\u0002q";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "@.Z\u0016\u0007@4\u0019CZ\u0002v";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "r\u0012w_#e";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "t7\u0005@]\u0005";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "b\u0014\u00193;t\u000e}";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "p\u0005\u007f";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "r\u0012w-#e";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "~\u0014{JP\u0002~kF";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "~\u0014{_P\u000fr\r_^";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "t7\u0005@]\u0007";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "~\u0014{JP\u0002~kK";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "~\u0014{JP\u0002~kC[";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "b)]\u0011\u0007S\"v\u001b\u000fb)Y\u0013\u001a\\\"P";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "~\u0014{JP\u0002~kG";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "t7\u0005@]\u0001";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "~\u0014{JP\u0002~kE";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "~\u0014{JP\u0002~kC^";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "@.Z\u0016\u0007@4\u0019CZ\u0002u";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "b\u0013rJ";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "~\u0014{JP\u0002~kC\\";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "~\u0014{_P\u000fr\r_Y\u0004";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "b)]\u0011\u0007S\"v\u001b\u000f";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "~\u0014{JP\u0002~kCY";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "~\u0014{JP\u0002~kA";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "~\u0014{_P\u000fr\r_\\";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "~\u0014{JP\u0002~kC";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "~\u0014{JP\u0002~kD";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "~\u0014{_P\u000fr\r_Z";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "~\u0014{_P\u000fr\r_[";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "~\u0014{_P\u000fr\r_Q";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "~\u0014{JP\u0002~kC]";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "v\u0014w;!";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "~\u0014{_P\u000fr\r_Y\u0007";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "d\r}!";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "~\u0014{_P\u000fr\r_Y";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "t7\u0005@]\u0006";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "~\u0014{JP\u0002~kJ";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "t7\u0000A_";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "~\u0014{_P\u000fr\r_Y\u0003";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "~\u0014{_P\u000fr\r_P";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "~\u0014{JP\u0002~k@";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "u.SG";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "p\u0005\u0006AY\u0005";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "~\u0014{_P\u000fr\r_Y\u0006";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    Cp437 = new dN(z[48], 0, new int[]{0, 2}, new String[0]);
                    ISO8859_1 = new dN(z[36], 1, new int[]{1, 3}, new String[]{z[45]});
                    ISO8859_2 = new dN(z[51], 2, 4, new String[]{z[38]});
                    ISO8859_3 = new dN(z[34], 3, 5, new String[]{z[39]});
                    ISO8859_4 = new dN(z[18], 4, 6, new String[]{z[35]});
                    ISO8859_5 = new dN(z[24], 5, 7, new String[]{z[10]});
                    ISO8859_6 = new dN(z[37], 6, 8, new String[]{z[19]});
                    ISO8859_7 = new dN(z[26], 7, 9, new String[]{z[7]});
                    ISO8859_8 = new dN(z[47], 8, 10, new String[]{z[50]});
                    ISO8859_9 = new dN(z[21], 9, 11, new String[]{z[40]});
                    ISO8859_10 = new dN(z[3], 10, 12, new String[]{z[43]});
                    ISO8859_11 = new dN(z[33], 11, 13, new String[]{z[54]});
                    ISO8859_13 = new dN(z[22], 12, 15, new String[]{z[31]});
                    ISO8859_14 = new dN(z[30], 13, 16, new String[]{z[49]});
                    ISO8859_15 = new dN(z[41], 14, 17, new String[]{z[8]});
                    ISO8859_16 = new dN(z[27], 15, 18, new String[]{z[5]});
                    SJIS = new dN(z[44], 16, 20, new String[]{z[1]});
                    Cp1250 = new dN(z[20], 17, 21, new String[]{z[0]});
                    Cp1251 = new dN(z[46], 18, 22, new String[]{z[12]});
                    Cp1252 = new dN(z[14], 19, 23, new String[]{z[28]});
                    Cp1256 = new dN(z[25], 20, 24, new String[]{z[11]});
                    UnicodeBigUnmarked = new dN(z[23], 21, 25, new String[]{z[9], z[32]});
                    UTF8 = new dN(z[29], 22, 26, new String[]{z[2]});
                    ASCII = new dN(z[42], 23, new int[]{27, 170}, new String[]{z[15]});
                    Big5 = new dN(z[52], 24, 28);
                    GB18030 = new dN(z[6], 25, 29, new String[]{z[53], z[4], z[16]});
                    EUC_KR = new dN(z[17], 26, 30, new String[]{z[13]});
                    e = new dN[]{Cp437, ISO8859_1, ISO8859_2, ISO8859_3, ISO8859_4, ISO8859_5, ISO8859_6, ISO8859_7, ISO8859_8, ISO8859_9, ISO8859_10, ISO8859_11, ISO8859_13, ISO8859_14, ISO8859_15, ISO8859_16, SJIS, Cp1250, Cp1251, Cp1252, Cp1256, UnicodeBigUnmarked, UTF8, ASCII, Big5, GB18030, EUC_KR};
                    b = new HashMap();
                    d = new HashMap();
                    for (dN dNVar : values()) {
                        for (int valueOf : dNVar.c) {
                            b.put(Integer.valueOf(valueOf), dNVar);
                        }
                        d.put(dNVar.name(), dNVar);
                        for (Object put : dNVar.a) {
                            d.put(put, dNVar);
                        }
                    }
                    return;
                default:
                    strArr2[i2] = str;
                    str = "d/]\u0014\u001ch\r}!";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private dN(int[] iArr, String[] strArr) {
        this.c = iArr;
        this.a = strArr;
    }

    private dN(int i) {
        this(r3, r4, new int[]{i}, new String[0]);
    }
}
