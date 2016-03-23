package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class u0 {
    private static ArrayList a;
    private static String[][] b;
    private static boolean c;
    private static String[][] d;
    private static String[][] e;
    private static final String[] z;

    public static String d(String str) {
        boolean z = DialogToastActivity.f;
        a();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            i7 i7Var = (i7) it.next();
            try {
                if (!i7Var.h.startsWith(str)) {
                    if (z) {
                        break;
                    }
                }
                return i7Var.d;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return "";
    }

    static {
        String[] strArr = new String[6];
        int i = 0;
        String str = "R\u000b\u00077x";
        Object obj = -1;
        String[] strArr2 = strArr;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 7;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 65;
                        break;
                    case at.o /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 64;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr[i] = str;
                    i = 2;
                    str = "d04t4u6$iok0 ~or12o0w03n%cr$t#h;(t'=\u007f\u0014N\u0006*g";
                    obj = 1;
                    strArr = strArr2;
                    break;
                case at.g /*1*/:
                    strArr[i] = str;
                    i = 3;
                    str = "d04t4u6$iok0 ~oe>%7,n1$ `";
                    obj = 2;
                    strArr = strArr2;
                    break;
                case at.i /*2*/:
                    strArr[i] = str;
                    i = 4;
                    str = "d04t4u6$iok0 ~oe>%7.r2#\u007f2=\u007f";
                    obj = 3;
                    strArr = strArr2;
                    break;
                case at.o /*3*/:
                    strArr[i] = str;
                    i = 5;
                    str = ">fx";
                    obj = 4;
                    strArr = strArr2;
                    break;
                case at.p /*4*/:
                    strArr[i] = str;
                    z = strArr2;
                    c = false;
                    String[][] strArr3 = new String[18][];
                    strArr = new String[2];
                    strArr[0] = "1";
                    i = 1;
                    str = "T/3s.s";
                    obj = -1;
                    String[][] strArr4 = strArr3;
                    String[][] strArr5 = strArr3;
                    int i4 = 0;
                    strArr2 = strArr;
                    while (true) {
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i5 = 0; length2 > i5; i5++) {
                            char c2 = cArr2[i5];
                            switch (i5 % 5) {
                                case v.m /*0*/:
                                    i3 = 7;
                                    break;
                                case at.g /*1*/:
                                    i3 = 95;
                                    break;
                                case at.i /*2*/:
                                    i3 = 65;
                                    break;
                                case at.o /*3*/:
                                    i3 = 26;
                                    break;
                                default:
                                    i3 = 64;
                                    break;
                            }
                            cArr2[i5] = (char) (i3 ^ c2);
                        }
                        str = new String(cArr2).intern();
                        switch (obj) {
                            case v.m /*0*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "J:5h/W\u001c\u0012";
                                obj = 1;
                                i4 = 2;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case at.g /*1*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "Q:3s:h1aM)u:-\u007f3t";
                                obj = 2;
                                i4 = 3;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case at.i /*2*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "D:-v5k>3:\u0013h*5r";
                                obj = 3;
                                i4 = 4;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case at.o /*3*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "Rq\u00124\u0003b3-o,f-";
                                obj = 4;
                                i4 = 5;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case at.p /*4*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "Rq\u00124`D:-v5k>3";
                                obj = 5;
                                i4 = 6;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case at.m /*5*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "B'5\u007f.c:%:\u000eb+6u2l";
                                obj = 6;
                                i4 = 7;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case Y.f /*6*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "4g";
                                obj = 7;
                                i4 = 8;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case aF.v /*7*/:
                                strArr[i] = str;
                                i = 1;
                                str = "T/3s.s";
                                obj = 8;
                                strArr = strArr2;
                                break;
                            case aF.u /*8*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "4g";
                                obj = 9;
                                i4 = 9;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case Y.l /*9*/:
                                strArr[i] = str;
                                i = 1;
                                str = "Q:3s:h1";
                                obj = 10;
                                strArr = strArr2;
                                break;
                            case Y.t /*10*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "4g";
                                obj = 11;
                                i4 = 10;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case Y.j /*11*/:
                                strArr[i] = str;
                                i = 1;
                                str = "Q:3s:h1aM)u:-\u007f3t";
                                obj = 12;
                                strArr = strArr2;
                                break;
                            case Y.p /*12*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "2m";
                                obj = 13;
                                i4 = 11;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case Y.q /*13*/:
                                strArr[i] = str;
                                i = 1;
                                str = "T/3s.s";
                                obj = 14;
                                strArr = strArr2;
                                break;
                            case arj.Toolbar_titleMarginEnd /*14*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?jq";
                                obj = 15;
                                i4 = 12;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Toolbar_titleMarginTop /*15*/:
                                strArr[i] = str;
                                i = 1;
                                str = "K\u0018aOk";
                                obj = 16;
                                strArr = strArr2;
                                break;
                            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?jr";
                                obj = 17;
                                i4 = 13;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Toolbar_maxButtonHeight /*17*/:
                                strArr[i] = str;
                                i = 1;
                                str = "D\u000b\u0002";
                                obj = 18;
                                strArr = strArr2;
                                break;
                            case arj.Toolbar_collapseIcon /*18*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1i";
                                obj = 19;
                                i4 = 14;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Toolbar_collapseContentDescription /*19*/:
                                strArr[i] = str;
                                i = 1;
                                str = "K\u0018aOk";
                                obj = 20;
                                strArr = strArr2;
                                break;
                            case arj.Toolbar_navigationIcon /*20*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?i";
                                obj = 21;
                                i4 = 15;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Toolbar_navigationContentDescription /*21*/:
                                strArr[i] = str;
                                i = 1;
                                str = "D\u000b\u0002";
                                obj = 22;
                                strArr = strArr2;
                                break;
                            case arj.Toolbar_logoDescription /*22*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?gw";
                                obj = 23;
                                i4 = 16;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Toolbar_titleTextColor /*23*/:
                                strArr[i] = str;
                                i = 1;
                                str = "F\u000f\u0003M";
                                obj = 24;
                                strArr = strArr2;
                                break;
                            case arj.Toolbar_subtitleTextColor /*24*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?gw";
                                obj = 25;
                                i4 = 17;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionMenuTextAppearance /*25*/:
                                strArr[i] = str;
                                i = 1;
                                str = "F\u000f\u0015";
                                obj = 26;
                                strArr = strArr2;
                                break;
                            case arj.Theme_actionMenuTextColor /*26*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                e = strArr5;
                                strArr3 = new String[30][];
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "T/3s.s";
                                obj = 27;
                                strArr4 = strArr3;
                                strArr5 = strArr3;
                                i4 = 0;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionModeStyle /*27*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "Q:3s:h1";
                                obj = 28;
                                i4 = 1;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionModeCloseButtonStyle /*28*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "Q:3s:h1aM)u:-\u007f3t";
                                obj = 29;
                                i4 = 2;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionModeBackground /*29*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "R\f\u0002Y";
                                obj = 30;
                                i4 = 3;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionModeSplitBackground /*30*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "Rq\u00124\u0003b3-o,f-";
                                obj = 31;
                                i4 = 4;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionModeCloseDrawable /*31*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "B'5\u007f.c:%:\u000eb+6u2l";
                                obj = 32;
                                i4 = 5;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionModeCutDrawable /*32*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "J:5h/W\u001c\u0012";
                                obj = 33;
                                i4 = 6;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionModeCopyDrawable /*33*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "4g";
                                obj = 34;
                                i4 = 7;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionModePasteDrawable /*34*/:
                                strArr[i] = str;
                                i = 1;
                                str = "T/3s.s";
                                obj = 35;
                                strArr = strArr2;
                                break;
                            case arj.Theme_actionModeSelectAllDrawable /*35*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "4g";
                                obj = 36;
                                i4 = 8;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionModeShareDrawable /*36*/:
                                strArr[i] = str;
                                i = 1;
                                str = "Q:3s:h1";
                                obj = 37;
                                strArr = strArr2;
                                break;
                            case arj.Theme_actionModeFindDrawable /*37*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "4g";
                                obj = 38;
                                i4 = 9;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_actionModeWebSearchDrawable /*38*/:
                                strArr[i] = str;
                                i = 1;
                                str = "Q:3s:h1aM)u:-\u007f3t";
                                obj = 39;
                                strArr = strArr2;
                                break;
                            case arj.Theme_actionModePopupWindowStyle /*39*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "2m";
                                obj = 40;
                                i4 = 10;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                                strArr[i] = str;
                                i = 1;
                                str = "T/3s.s";
                                obj = 41;
                                strArr = strArr2;
                                break;
                            case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1m";
                                obj = 42;
                                i4 = 11;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_dialogTheme /*42*/:
                                strArr[i] = str;
                                i = 1;
                                str = "b,({nd0os$";
                                obj = 43;
                                strArr = strArr2;
                                break;
                            case arj.Theme_dialogPreferredPadding /*43*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1m";
                                obj = 44;
                                i4 = 12;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_listDividerAlertDialog /*44*/:
                                strArr[i] = str;
                                i = 1;
                                str = "S:-q/j\u007f\u0007v%\u007f6";
                                obj = 45;
                                strArr = strArr2;
                                break;
                            case arj.Theme_actionDropDownStyle /*45*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1m";
                                obj = 46;
                                i4 = 13;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                                strArr[i] = str;
                                i = 1;
                                str = "T/3s.s";
                                obj = 47;
                                strArr = strArr2;
                                break;
                            case arj.Theme_spinnerDropDownItemStyle /*47*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1m";
                                obj = 48;
                                i4 = 14;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_homeAsUpIndicator /*48*/:
                                strArr[i] = str;
                                i = 1;
                                str = "Q:3s:h1";
                                obj = 49;
                                strArr = strArr2;
                                break;
                            case arj.Theme_actionButtonStyle /*49*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1m";
                                obj = 50;
                                i4 = 15;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_buttonBarStyle /*50*/:
                                strArr[i] = str;
                                i = 1;
                                str = "Q:3s:h1aM)u:-\u007f3t";
                                obj = 51;
                                strArr = strArr2;
                                break;
                            case arj.Theme_buttonBarButtonStyle /*51*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1i";
                                obj = 52;
                                i4 = 16;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_selectableItemBackground /*52*/:
                                strArr[i] = str;
                                i = 1;
                                str = "K\u0018aOk";
                                obj = 53;
                                strArr = strArr2;
                                break;
                            case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?n";
                                obj = 54;
                                i4 = 17;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_borderlessButtonStyle /*54*/:
                                strArr[i] = str;
                                i = 1;
                                str = "L\u001b\u0005S";
                                obj = 55;
                                strArr = strArr2;
                                break;
                            case arj.Theme_dividerVertical /*55*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?jq";
                                obj = 56;
                                i4 = 18;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_dividerHorizontal /*56*/:
                                strArr[i] = str;
                                i = 1;
                                str = "K\u0018aOk";
                                obj = 57;
                                strArr = strArr2;
                                break;
                            case arj.Theme_activityChooserViewStyle /*57*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?jr";
                                obj = 58;
                                i4 = 19;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_toolbarStyle /*58*/:
                                strArr[i] = str;
                                i = 1;
                                str = "D\u000b\u0002";
                                obj = 59;
                                strArr = strArr2;
                                break;
                            case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?i";
                                obj = 60;
                                i4 = 20;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_popupMenuStyle /*60*/:
                                strArr[i] = str;
                                i = 1;
                                str = "D\u000b\u0002";
                                obj = 61;
                                strArr = strArr2;
                                break;
                            case arj.Theme_popupWindowStyle /*61*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?gw";
                                obj = 62;
                                i4 = 21;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_editTextColor /*62*/:
                                strArr[i] = str;
                                i = 1;
                                str = "F\u000f\u0003M";
                                obj = 63;
                                strArr = strArr2;
                                break;
                            case arj.Theme_editTextBackground /*63*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?gw";
                                obj = 64;
                                i4 = 22;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_imageButtonStyle /*64*/:
                                strArr[i] = str;
                                i = 1;
                                str = "F\u000f\u0015";
                                obj = 65;
                                strArr = strArr2;
                                break;
                            case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 66;
                                i4 = 23;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                                strArr[i] = str;
                                i = 1;
                                str = "T/3s.s";
                                obj = 67;
                                strArr = strArr2;
                                break;
                            case arj.Theme_textColorSearchUrl /*67*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 68;
                                i4 = 24;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_searchViewStyle /*68*/:
                                strArr[i] = str;
                                i = 1;
                                str = "T/3s.s\u007fa:`'\u007f";
                                obj = 69;
                                strArr = strArr2;
                                break;
                            case arj.Theme_listPreferredItemHeight /*69*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 70;
                                i4 = 25;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_listPreferredItemHeightSmall /*70*/:
                                strArr[i] = str;
                                i = 1;
                                str = "Q:3s:h1";
                                obj = 71;
                                strArr = strArr2;
                                break;
                            case arj.Theme_listPreferredItemHeightLarge /*71*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 72;
                                i4 = 26;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                                strArr[i] = str;
                                i = 1;
                                str = "Q:3s:h1aM)u:-\u007f3t";
                                obj = 73;
                                strArr = strArr2;
                                break;
                            case arj.Theme_listPreferredItemPaddingRight /*73*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 74;
                                i4 = 27;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_dropDownListViewStyle /*74*/:
                                strArr[i] = str;
                                i = 1;
                                str = "U:-s!i<$:`'\u007f";
                                obj = 75;
                                strArr = strArr2;
                                break;
                            case arj.Theme_listPopupWindowStyle /*75*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 76;
                                i4 = 28;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_textAppearanceListItem /*76*/:
                                strArr[i] = str;
                                i = 1;
                                str = "U\u001a\rS\u0001I\u001c\u0004:`'\u007f";
                                obj = 77;
                                strArr = strArr2;
                                break;
                            case arj.Theme_textAppearanceListItemSmall /*77*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 78;
                                i4 = 29;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_panelBackground /*78*/:
                                strArr[i] = str;
                                i = 1;
                                str = "U:-s!i<$";
                                obj = 79;
                                strArr = strArr2;
                                break;
                            case arj.Theme_panelMenuListWidth /*79*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                b = strArr5;
                                strArr3 = new String[45][];
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq*";
                                obj = 80;
                                strArr4 = strArr3;
                                strArr5 = strArr3;
                                i4 = 0;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_panelMenuListTheme /*80*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq.";
                                obj = 81;
                                i4 = 1;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq*p";
                                obj = 82;
                                i4 = 2;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_colorPrimary /*82*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq*t";
                                obj = 83;
                                i4 = 3;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_colorPrimaryDark /*83*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq+r";
                                obj = 84;
                                i4 = 4;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_colorAccent /*84*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq(x";
                                obj = 85;
                                i4 = 5;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_colorControlNormal /*85*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4np(s";
                                obj = 86;
                                i4 = 6;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_colorControlActivated /*86*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4np-r";
                                obj = 87;
                                i4 = 7;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_colorControlHighlight /*87*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq*p7";
                                obj = 88;
                                i4 = 8;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_colorButtonNormal /*88*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq*p3";
                                obj = 89;
                                i4 = 9;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_colorSwitchThumbNormal /*89*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq*q5";
                                obj = 90;
                                i4 = 10;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_controlBackground /*90*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq*r?";
                                obj = 91;
                                i4 = 11;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_alertDialogStyle /*91*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq*s?";
                                obj = 92;
                                i4 = 12;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq+r7";
                                obj = 93;
                                i4 = 13;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_alertDialogCenterButtons /*93*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4nq#y2";
                                obj = 94;
                                i4 = 14;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_alertDialogTheme /*94*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4lu*";
                                obj = 95;
                                i4 = 15;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_textColorAlertDialogListItem /*95*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4lu*p";
                                obj = 96;
                                i4 = 16;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "4lu*p7";
                                obj = 97;
                                i4 = 17;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "4g";
                                obj = 98;
                                i4 = 18;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                                strArr[i] = str;
                                i = 1;
                                str = "5jt*t";
                                obj = 99;
                                strArr = strArr2;
                                break;
                            case arj.Theme_autoCompleteTextViewStyle /*99*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "2m";
                                obj = 100;
                                i4 = 19;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_buttonStyle /*100*/:
                                strArr[i] = str;
                                i = 1;
                                str = "4nq*p";
                                obj = arj.Theme_buttonStyleSmall;
                                strArr = strArr2;
                                break;
                            case arj.Theme_buttonStyleSmall /*101*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "2m";
                                obj = arj.Theme_checkboxStyle;
                                i4 = 20;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_checkboxStyle /*102*/:
                                strArr[i] = str;
                                i = 1;
                                str = "4lu*";
                                obj = arj.Theme_checkedTextViewStyle;
                                strArr = strArr2;
                                break;
                            case arj.Theme_checkedTextViewStyle /*103*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "2m";
                                obj = arj.Theme_editTextStyle;
                                i4 = 21;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_editTextStyle /*104*/:
                                strArr[i] = str;
                                i = 1;
                                str = "4lu*p";
                                obj = arj.Theme_radioButtonStyle;
                                strArr = strArr2;
                                break;
                            case arj.Theme_radioButtonStyle /*105*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "2m";
                                obj = arj.Theme_ratingBarStyle;
                                i4 = 22;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_ratingBarStyle /*106*/:
                                strArr[i] = str;
                                i = 1;
                                str = "4lu*p7";
                                obj = arj.Theme_seekBarStyle;
                                strArr = strArr2;
                                break;
                            case arj.Theme_seekBarStyle /*107*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1m";
                                obj = arj.Theme_spinnerStyle;
                                i4 = 23;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case arj.Theme_spinnerStyle /*108*/:
                                strArr[i] = str;
                                i = 1;
                                str = "4nq+r7";
                                obj = arj.Theme_switchStyle;
                                strArr = strArr2;
                                break;
                            case arj.Theme_switchStyle /*109*/:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1m";
                                obj = 110;
                                i4 = 24;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 110:
                                strArr[i] = str;
                                i = 1;
                                str = "2nq*p";
                                obj = 111;
                                strArr = strArr2;
                                break;
                            case 111:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1m";
                                obj = 112;
                                i4 = 25;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 112:
                                strArr[i] = str;
                                i = 1;
                                str = "2nq*p7";
                                obj = 113;
                                strArr = strArr2;
                                break;
                            case 113:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1m";
                                obj = 114;
                                i4 = 26;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 114:
                                strArr[i] = str;
                                i = 1;
                                str = "2nq#y";
                                obj = 115;
                                strArr = strArr2;
                                break;
                            case 115:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1m";
                                obj = 116;
                                i4 = 27;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 116:
                                strArr[i] = str;
                                i = 1;
                                str = "2nq*y";
                                obj = 117;
                                strArr = strArr2;
                                break;
                            case 117:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "1i";
                                obj = 118;
                                i4 = 28;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 118:
                                strArr[i] = str;
                                i = 1;
                                str = "3jq*v";
                                obj = 119;
                                strArr = strArr2;
                                break;
                            case 119:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?n";
                                obj = 120;
                                i4 = 29;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 120:
                                strArr[i] = str;
                                i = 1;
                                str = "3kq+r0";
                                obj = 121;
                                strArr = strArr2;
                                break;
                            case 121:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?m";
                                obj = 122;
                                i4 = 30;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 122:
                                strArr[i] = str;
                                i = 1;
                                str = "3jq*";
                                obj = 123;
                                strArr = strArr2;
                                break;
                            case 123:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?m";
                                obj = 124;
                                i4 = 31;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 124:
                                strArr[i] = str;
                                i = 1;
                                str = "3jq,";
                                obj = 125;
                                strArr = strArr2;
                                break;
                            case 125:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?m";
                                obj = 126;
                                i4 = 32;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 126:
                                strArr[i] = str;
                                i = 1;
                                str = "3jq*p";
                                obj = 127;
                                strArr = strArr2;
                                break;
                            case 127:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?m";
                                obj = 128;
                                i4 = 33;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 128:
                                strArr[i] = str;
                                i = 1;
                                str = "3jq*v";
                                obj = 129;
                                strArr = strArr2;
                                break;
                            case 129:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?m";
                                obj = 130;
                                i4 = 34;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 130:
                                strArr[i] = str;
                                i = 1;
                                str = "3jq*p7";
                                obj = 131;
                                strArr = strArr2;
                                break;
                            case 131:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?m";
                                obj = 132;
                                i4 = 35;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 132:
                                strArr[i] = str;
                                i = 1;
                                str = "3jq*p1";
                                obj = 133;
                                strArr = strArr2;
                                break;
                            case 133:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?jq";
                                obj = 134;
                                i4 = 36;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 134:
                                strArr[i] = str;
                                i = 1;
                                str = "3jq*p";
                                obj = 135;
                                strArr = strArr2;
                                break;
                            case 135:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?i";
                                obj = 136;
                                i4 = 37;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 136:
                                strArr[i] = str;
                                i = 1;
                                str = "3iq*p4";
                                obj = 137;
                                strArr = strArr2;
                                break;
                            case 137:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?i";
                                obj = 138;
                                i4 = 38;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 138:
                                strArr[i] = str;
                                i = 1;
                                str = "3iq*s";
                                obj = 139;
                                strArr = strArr2;
                                break;
                            case 139:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = "?gw";
                                obj = 140;
                                i4 = 39;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 140:
                                strArr[i] = str;
                                i = 1;
                                str = "3iw*u";
                                obj = 141;
                                strArr = strArr2;
                                break;
                            case 141:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 142;
                                i4 = 40;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 142:
                                strArr[i] = str;
                                i = 1;
                                str = "3ou*";
                                obj = 143;
                                strArr = strArr2;
                                break;
                            case 143:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 144;
                                i4 = 41;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 144:
                                strArr[i] = str;
                                i = 1;
                                str = "3ou*p";
                                obj = 145;
                                strArr = strArr2;
                                break;
                            case 145:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 146;
                                i4 = 42;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 146:
                                strArr[i] = str;
                                i = 1;
                                str = "3ou*p7";
                                obj = 147;
                                strArr = strArr2;
                                break;
                            case 147:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 148;
                                i4 = 43;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 148:
                                strArr[i] = str;
                                i = 1;
                                str = "4nq+r7";
                                obj = 149;
                                strArr = strArr2;
                                break;
                            case 149:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                i = 0;
                                str = ">n";
                                obj = 150;
                                i4 = 44;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                            case 150:
                                strArr[i] = str;
                                i = 1;
                                str = "6os)q5h";
                                obj = 151;
                                strArr = strArr2;
                                break;
                            case 151:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                d = strArr5;
                                return;
                            default:
                                strArr[i] = str;
                                strArr4[i4] = strArr2;
                                strArr = new String[2];
                                strArr[0] = "1";
                                i = 1;
                                str = "Q:3s:h1";
                                obj = null;
                                i4 = 1;
                                strArr4 = strArr5;
                                strArr2 = strArr;
                                break;
                        }
                    }
                default:
                    strArr[i] = str;
                    i = 1;
                    str = "d04t4u6$ioh/$t";
                    obj = null;
                    strArr = strArr2;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a() {
        /*
        r7 = 1;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = c;	 Catch:{ UnsupportedEncodingException -> 0x0008 }
        if (r0 == 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = new java.util.ArrayList;
        r0.<init>();
        a = r0;
        r0 = com.whatsapp.App.z();
        r0 = r0.getResources();
        r1 = 2131165184; // 0x7f070000 float:1.7944578E38 double:1.052935503E-314;
        r1 = r0.openRawResource(r1);
        if (r1 != 0) goto L_0x002e;
    L_0x0021:
        r0 = new java.io.IOException;	 Catch:{ UnsupportedEncodingException -> 0x002c }
        r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x002c }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x002c }
        r0.<init>(r1);	 Catch:{ UnsupportedEncodingException -> 0x002c }
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = new java.io.BufferedReader;	 Catch:{ UnsupportedEncodingException -> 0x0074 }
        r3 = new java.io.InputStreamReader;	 Catch:{ UnsupportedEncodingException -> 0x0074 }
        r4 = z;	 Catch:{ UnsupportedEncodingException -> 0x0074 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ UnsupportedEncodingException -> 0x0074 }
        r3.<init>(r1, r4);	 Catch:{ UnsupportedEncodingException -> 0x0074 }
        r0.<init>(r3);	 Catch:{ UnsupportedEncodingException -> 0x0074 }
    L_0x003d:
        r3 = r0.readLine();
        if (r3 == 0) goto L_0x00a6;
    L_0x0043:
        r1 = "\t";
        r1 = android.text.TextUtils.split(r3, r1);	 Catch:{ NumberFormatException -> 0x0059, IllegalArgumentException -> 0x008a }
        if (r1 == 0) goto L_0x0051;
    L_0x004c:
        r4 = r1.length;	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r5 = 12;
        if (r4 >= r5) goto L_0x00aa;
    L_0x0051:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ UnsupportedEncodingException -> 0x0057 }
        r1.<init>();	 Catch:{ UnsupportedEncodingException -> 0x0057 }
        throw r1;	 Catch:{ UnsupportedEncodingException -> 0x0057 }
    L_0x0057:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0059, IllegalArgumentException -> 0x008a }
    L_0x0059:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x003d;
    L_0x0074:
        r0 = move-exception;
        r0 = z;
        r3 = 2;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = new java.io.BufferedReader;
        r3 = new java.io.InputStreamReader;
        r3.<init>(r1);
        r0.<init>(r3);
        goto L_0x003d;
    L_0x0088:
        r1 = move-exception;
        throw r1;	 Catch:{ UnsupportedEncodingException -> 0x0057 }
    L_0x008a:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        if (r2 == 0) goto L_0x003d;
    L_0x00a6:
        c = r7;
        goto L_0x0007;
    L_0x00aa:
        r4 = a;	 Catch:{ NumberFormatException -> 0x0059, IllegalArgumentException -> 0x008a }
        r5 = new com.whatsapp.i7;	 Catch:{ NumberFormatException -> 0x0059, IllegalArgumentException -> 0x008a }
        r6 = 0;
        r5.<init>(r1, r6);	 Catch:{ NumberFormatException -> 0x0059, IllegalArgumentException -> 0x008a }
        r4.add(r5);	 Catch:{ NumberFormatException -> 0x0059, IllegalArgumentException -> 0x008a }
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.u0.a():void");
    }

    static int[] g(String str) {
        return e(str);
    }

    public static String f(String str) {
        boolean z = DialogToastActivity.f;
        a();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            i7 i7Var = (i7) it.next();
            try {
                if (!i7Var.h.equals(str)) {
                    if (z) {
                        break;
                    }
                }
                return Integer.toString(i7Var.c);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return null;
    }

    public static int a(int i, int i2) {
        boolean z = DialogToastActivity.f;
        a();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            i7 i7Var = (i7) it.next();
            try {
                if (i7Var.c != i) {
                    if (z) {
                        break;
                    }
                }
                return i7Var.a(i2);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return 0;
    }

    private static int[] e(String str) {
        int[] iArr = null;
        boolean z = DialogToastActivity.f;
        String[] split = TextUtils.split(str, ",");
        if (split != null) {
            int length = split.length;
            if (length != 0) {
                iArr = new int[length];
                int i = 0;
                while (i < length) {
                    iArr[i] = Integer.parseInt(split[i]);
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
        }
        return iArr;
    }

    public static String a(int i, String str) {
        boolean z = DialogToastActivity.f;
        a();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            i7 i7Var = (i7) it.next();
            try {
                if (i7Var.c != i) {
                    if (z) {
                        break;
                    }
                }
                str = i7Var.a(str);
                break;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return str;
    }

    public static ArrayList b() {
        a();
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r7) {
        /*
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        a();	 Catch:{ IllegalArgumentException -> 0x000a }
        if (r7 != 0) goto L_0x000c;
    L_0x0008:
        r0 = r2;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r0 = r7.length();
        switch(r0) {
            case 2: goto L_0x0015;
            case 3: goto L_0x0042;
            default: goto L_0x0013;
        };
    L_0x0013:
        r0 = r2;
        goto L_0x0009;
    L_0x0015:
        r0 = java.util.Locale.US;
        r1 = r7.toUpperCase(r0);
        r0 = a;
        r4 = r0.iterator();
    L_0x0021:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0040;
    L_0x0027:
        r0 = r4.next();
        r0 = (com.whatsapp.i7) r0;
        r5 = r0.d;	 Catch:{ IllegalArgumentException -> 0x003c }
        r5 = r5.equals(r1);	 Catch:{ IllegalArgumentException -> 0x003c }
        if (r5 == 0) goto L_0x003e;
    L_0x0035:
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x003c }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ IllegalArgumentException -> 0x003c }
        goto L_0x0009;
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        if (r3 == 0) goto L_0x0021;
    L_0x0040:
        if (r3 == 0) goto L_0x0013;
    L_0x0042:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x004f }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x004f }
        r0 = r7.equals(r0);	 Catch:{ IllegalArgumentException -> 0x004f }
        if (r0 == 0) goto L_0x0051;
    L_0x004d:
        r0 = r2;
        goto L_0x0009;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = a;
        r4 = r0.iterator();
    L_0x0057:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0013;
    L_0x005d:
        r0 = r4.next();
        r0 = (com.whatsapp.i7) r0;
        r1 = 0;
    L_0x0064:
        r5 = r0.f;
        r5 = r5.length;
        if (r1 >= r5) goto L_0x0095;
    L_0x0069:
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x008f }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x008f }
        r6 = r0.f;	 Catch:{ IllegalArgumentException -> 0x008f }
        r6 = r6[r1];	 Catch:{ IllegalArgumentException -> 0x008f }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x008f }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x008f }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x008f }
        r5 = r7.equals(r5);	 Catch:{ IllegalArgumentException -> 0x008f }
        if (r5 == 0) goto L_0x0091;
    L_0x0087:
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x008f }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ IllegalArgumentException -> 0x008f }
        goto L_0x0009;
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0064;
    L_0x0095:
        if (r3 == 0) goto L_0x0057;
    L_0x0097:
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.u0.a(java.lang.String):java.lang.String");
    }

    public static String c(String str) {
        boolean z = DialogToastActivity.f;
        a();
        Iterator it = a.iterator();
        String str2 = null;
        while (it.hasNext()) {
            i7 i7Var = (i7) it.next();
            try {
                String str3;
                if (Integer.toString(i7Var.c).equals(str)) {
                    if (i7Var.i) {
                        str2 = i7Var.h;
                        if (!z) {
                            break;
                        }
                    }
                    if (str2 == null) {
                        str3 = i7Var.h;
                        if (z) {
                            return str3;
                        }
                        str2 = str3;
                    }
                }
                str3 = str2;
                if (z) {
                    return str3;
                }
                str2 = str3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return str2;
    }

    public static i7 b(String str) {
        boolean z = DialogToastActivity.f;
        a();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            i7 i7Var = (i7) it.next();
            try {
                if (!str.equals(i7Var.d)) {
                    if (z) {
                        break;
                    }
                }
                return i7Var;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return null;
    }
}
