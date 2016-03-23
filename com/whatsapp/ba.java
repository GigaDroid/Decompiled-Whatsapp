package com.whatsapp;

import android.os.AsyncTask;
import android.support.v4.util.Pair;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ba extends AsyncTask {
    private static final String[] z;
    final String a;
    final VerifySms b;
    final String c;

    static {
        String[] strArr = new String[74];
        String str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
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
                        i3 = 41;
                        break;
                    case at.i /*2*/:
                        i3 = 54;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 42;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "_LP<YHM";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0002LD;E_\t";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0002ZB(^XZ\u0019,X_FDfSHZ\u001b>CYA\u001b*EIL";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0002KZ&IFLR";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0002]S$ZB[W;CAP\u001b<DL_W FLKZ,\u0005XGW+FH\u0004B&\u0007]HD:O\u0000[S=XThP=O_";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0002YD&\\DMS;\u0007Y@[,EX]";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "[F_*O\u0000LD;E_\u0004B&E\u0000DW'S\u0000]D O^";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "[F_*O\u0000]Y&\u0007_LU,DY";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "[F_*O\u0000KW-\u0007]HD(G";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "@@E:CCN\u00169K_H[,^H[";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "[F_*O\u0000KW-\u0007YF],D";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0002KW-\u0007]HD(GH]S;\u0005";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "[F_*O\u0000GYdXB\\B,Y";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "[F_*O\u0000YD&\\DMS;\u0007XGD&_YHT%O";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0002YD&\\DMS;\u0007XGD&_YHT%O";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "[F_*O\u0000]S$Z\u0000\\X(\\L@Z";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "[F_*O\u0000D_:YDGQdZL[W$";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0002\\X;EX]W+FH\u0006B GH\u0004X&^\u0000@X=";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0002\\X:ZHJ_/CHM";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "OHRiZL[W$OYLD";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "[F_*O\u0000GS1^\u0000DS=BBM";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0002GYdXB\\B,Y\u0002]_$O\u0000GY=\u0007DGB";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "[F_*O\u0000LD;E_\u0004B&E\u0000DW'S\u0000]D O^\u0004W%F\u0000DS=BBME";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0002]Y&\u0007_LU,DY\u0006B GH\u0004X&^\u0000@X=";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    str = "\u0002]Y&\u0007@HX0\u0007Y[_,Y\u0000HZ%\u0007@LB!EIZ";
                    obj = 40;
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    str = "\u0002]Y&\u0007@HX0\u0007Y[_,Y";
                    i = 42;
                    strArr2 = strArr3;
                    obj = 41;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    strArr2 = strArr3;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 42;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0002]S$Z\u0000\\X(\\L@Z";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    str = "\u0002]D OI]Y&GLGO=C@LE(FADS=BBMEf^DDSdDB]\u001b DY";
                    obj = 44;
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    strArr2 = strArr3;
                    str = "\u0002D_:YDGQdZL[W$OYLD";
                    obj = 45;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0002KW-\u0007YF],D";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0002JY-O\u0002F]";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "[F_*O\u0000LD;E_";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "[F_*O\u0000KZ&IFLR";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 53;
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    strArr2 = strArr3;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 54;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0002]Y&\u0007_LU,DY\t";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0002_S;YDFXd^BF\u001b&FI";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "[F_*O\u0000_S;YDFXd^BF\u001b&FI";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "[F_*O\u0000]Y&\u0007@HX0\u0007J\\S:YHZ";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0002GYdXB\\B,Y";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0002]Y&\u0007_LU,DY\u0006B GH\u0004X&^\u0000@X=";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "[F_*O\u0000YD&\\DMS;\u0007Y@[,EX]";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "C\\[+O_";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0002]Y&\u0007@HX0\u0007J\\S:YHZ";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "[LD LT_Y IH\u0006D,[XLE=\u0005";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u0002]D OI]Y&GLGO=C@LE(FADS=BBMEf^DDSdDB]\u001b DY";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u0002]Y&\u0007@HX0\u0007J\\S:YHZ\u0019=C@L\u001b'EY\u0004_'^";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u0002GS1^\u0000DS=BBM";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "[F_*O";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0002@Y,X_FDi";
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(android.support.v4.util.Pair r15) {
        /*
        r14 = this;
        r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = "";
        com.whatsapp.VerifyNumber.s = r0;
        r0 = r14.b;
        r1 = 25;
        r0.removeDialog(r1);
        r0 = r15.first;
        r0 = (com.whatsapp.qp) r0;
        r1 = r15.second;
        r1 = (com.whatsapp.ne) r1;
        r3 = com.whatsapp.qp.OK;	 Catch:{ NumberFormatException -> 0x00ee }
        if (r0 != r3) goto L_0x005d;
    L_0x001c:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00ee }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x00ee }
        r4 = z;	 Catch:{ NumberFormatException -> 0x00ee }
        r5 = 43;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00ee }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x00ee }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x00ee }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x00ee }
        r4 = z;	 Catch:{ NumberFormatException -> 0x00ee }
        r5 = 50;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00ee }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x00ee }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x00ee }
        com.whatsapp.util.Log.i(r3);	 Catch:{ NumberFormatException -> 0x00ee }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x00ee }
        r4 = r1.c;	 Catch:{ NumberFormatException -> 0x00ee }
        com.whatsapp.App.f(r3, r4);	 Catch:{ NumberFormatException -> 0x00ee }
        r3 = r1.g;	 Catch:{ NumberFormatException -> 0x00ee }
        r4 = r1.c;	 Catch:{ NumberFormatException -> 0x00ee }
        com.whatsapp.ve.b(r3, r4);	 Catch:{ NumberFormatException -> 0x00ee }
        r3 = r1.b;	 Catch:{ NumberFormatException -> 0x00ee }
        com.whatsapp.VerifyNumber.a(r3);	 Catch:{ NumberFormatException -> 0x00ee }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x00ee }
        r4 = 1;
        com.whatsapp.VerifySms.a(r3, r4);	 Catch:{ NumberFormatException -> 0x00ee }
        if (r2 == 0) goto L_0x00e3;
    L_0x005d:
        r3 = com.whatsapp.qp.YES;	 Catch:{ NumberFormatException -> 0x00f0 }
        if (r0 == r3) goto L_0x087a;
    L_0x0061:
        r3 = com.whatsapp.qp.ERROR_TEMPORARILY_UNAVAILABLE;	 Catch:{ NumberFormatException -> 0x00f2 }
        if (r0 != r3) goto L_0x012f;
    L_0x0065:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00f4 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x00f4 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x00f4 }
        r5 = 55;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00f4 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x00f4 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x00f4 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x00f4 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x00f4 }
        r5 = 44;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00f4 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x00f4 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x00f4 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x00f4 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x00f4 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x00f4 }
        r5 = 27;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00f4 }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x00f4 }
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x00f4 }
        if (r3 != 0) goto L_0x00aa;
    L_0x009a:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x00f6 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x00f6 }
        r5 = 2131231789; // 0x7f08042d float:1.8079669E38 double:1.0529684103E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x00f6 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x00f6 }
        if (r2 == 0) goto L_0x00e3;
    L_0x00aa:
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x00f8 }
        r4 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x00f8 }
        r4 = r4 * r12;
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x00f8 }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x00f8 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x00f8 }
        r6 = r14.b;	 Catch:{ NumberFormatException -> 0x00f8 }
        r7 = 2131231790; // 0x7f08042e float:1.807967E38 double:1.052968411E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x00f8 }
        r9 = 0;
        r10 = r14.b;	 Catch:{ NumberFormatException -> 0x00f8 }
        r10 = com.whatsapp.util.cs.f(r10, r4);	 Catch:{ NumberFormatException -> 0x00f8 }
        r8[r9] = r10;	 Catch:{ NumberFormatException -> 0x00f8 }
        r6 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x00f8 }
        r3.j(r6);	 Catch:{ NumberFormatException -> 0x00f8 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x00f8 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x00f8 }
        r6 = r6 + r4;
        com.whatsapp.VerifySms.c(r3, r6);	 Catch:{ NumberFormatException -> 0x00f8 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x00f8 }
        r3 = com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x00f8 }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x00f8 }
    L_0x00e3:
        r0 = r14.b;	 Catch:{ NumberFormatException -> 0x08e8 }
        com.whatsapp.VerifySms.j(r0);	 Catch:{ NumberFormatException -> 0x08e8 }
        if (r1 == 0) goto L_0x00ed;
    L_0x00ea:
        r14.a(r1);	 Catch:{ NumberFormatException -> 0x08e8 }
    L_0x00ed:
        return;
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f2 }
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;
    L_0x00f8:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0896 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x0896 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0896 }
        r5 = 54;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0896 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x0896 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x0896 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x0896 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0896 }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0896 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x0896 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x0896 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x0896 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0896 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x0896 }
        r5 = 2131231789; // 0x7f08042d float:1.8079669E38 double:1.0529684103E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x0896 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x0896 }
        if (r2 == 0) goto L_0x00e3;
    L_0x012f:
        r3 = com.whatsapp.qp.ERROR_UNSPECIFIED;	 Catch:{ NumberFormatException -> 0x0896 }
        if (r0 != r3) goto L_0x016d;
    L_0x0133:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0898 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x0898 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0898 }
        r5 = 39;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0898 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x0898 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x0898 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x0898 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0898 }
        r5 = 32;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0898 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x0898 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x0898 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x0898 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0898 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0898 }
        r5 = 51;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0898 }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x0898 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0898 }
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x0898 }
        if (r2 == 0) goto L_0x00e3;
    L_0x016d:
        r3 = com.whatsapp.qp.ERROR_TOO_MANY;	 Catch:{ NumberFormatException -> 0x089a }
        if (r0 != r3) goto L_0x0248;
    L_0x0171:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x089c }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x089c }
        r4 = z;	 Catch:{ NumberFormatException -> 0x089c }
        r5 = 40;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x089c }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x089c }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x089c }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x089c }
        r4 = z;	 Catch:{ NumberFormatException -> 0x089c }
        r5 = 42;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x089c }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x089c }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x089c }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x089c }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x089c }
        r4 = z;	 Catch:{ NumberFormatException -> 0x089c }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x089c }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x089c }
        r3 = 1;
        com.whatsapp.VerifySms.b(r3);	 Catch:{ NumberFormatException -> 0x089c }
        r14.a(r1);	 Catch:{ NumberFormatException -> 0x089c }
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x089c }
        if (r3 != 0) goto L_0x01bb;
    L_0x01ad:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x089e }
        r4 = 29;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x089e }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x089e }
        com.whatsapp.VerifySms.o(r3);	 Catch:{ NumberFormatException -> 0x089e }
        if (r2 == 0) goto L_0x00e3;
    L_0x01bb:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = r1.h;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = r4 * r12;
        com.whatsapp.VerifySms.a(r3, r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = com.whatsapp.VerifySms.g(r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x0213 }
        r5 = 2131231801; // 0x7f080439 float:1.8079693E38 double:1.052968416E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0213 }
        r7 = 0;
        r8 = r14.b;	 Catch:{ NumberFormatException -> 0x0213 }
        r9 = r14.b;	 Catch:{ NumberFormatException -> 0x0213 }
        r10 = com.whatsapp.VerifySms.g(r9);	 Catch:{ NumberFormatException -> 0x0213 }
        r8 = com.whatsapp.util.cs.f(r8, r10);	 Catch:{ NumberFormatException -> 0x0213 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x0213 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0213 }
        r6 = r14.b;	 Catch:{ NumberFormatException -> 0x0213 }
        r6 = com.whatsapp.VerifySms.g(r6);	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = r4 + r6;
        com.whatsapp.VerifySms.c(r3, r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0213 }
        r3 = com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = com.whatsapp.VerifySms.g(r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x0213 }
        goto L_0x00e3;
    L_0x0213:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08a0 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08a0 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08a0 }
        r5 = 48;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08a0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08a0 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08a0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08a0 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08a0 }
        r5 = 70;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08a0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08a0 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08a0 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08a0 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08a0 }
        r4 = 29;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x08a0 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08a0 }
        com.whatsapp.VerifySms.o(r3);	 Catch:{ NumberFormatException -> 0x08a0 }
        if (r2 == 0) goto L_0x00e3;
    L_0x0248:
        r3 = com.whatsapp.qp.ERROR_TOO_MANY_ALL_METHODS;	 Catch:{ NumberFormatException -> 0x08a0 }
        if (r0 != r3) goto L_0x02fd;
    L_0x024c:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08a2 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08a2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08a2 }
        r5 = 53;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08a2 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08a2 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08a2 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08a2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08a2 }
        r5 = 41;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08a2 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08a2 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08a2 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08a2 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08a2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08a2 }
        r5 = 37;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08a2 }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08a2 }
        r3 = 1;
        com.whatsapp.VerifySms.b(r3);	 Catch:{ NumberFormatException -> 0x08a2 }
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x08a2 }
        if (r3 != 0) goto L_0x028e;
    L_0x0285:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08a4 }
        r4 = 30;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x08a4 }
        if (r2 == 0) goto L_0x00e3;
    L_0x028e:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x02cd }
        r4 = r1.h;	 Catch:{ NumberFormatException -> 0x02cd }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x02cd }
        r4 = r4 * r12;
        com.whatsapp.VerifySms.a(r3, r4);	 Catch:{ NumberFormatException -> 0x02cd }
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x02cd }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x02cd }
        r4 = com.whatsapp.VerifySms.g(r4);	 Catch:{ NumberFormatException -> 0x02cd }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x02cd }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x02cd }
        r4 = 35;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x02cd }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x02cd }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x02cd }
        r6 = r14.b;	 Catch:{ NumberFormatException -> 0x02cd }
        r6 = com.whatsapp.VerifySms.g(r6);	 Catch:{ NumberFormatException -> 0x02cd }
        r4 = r4 + r6;
        com.whatsapp.VerifySms.c(r3, r4);	 Catch:{ NumberFormatException -> 0x02cd }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x02cd }
        r3 = com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x02cd }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x02cd }
        r4 = com.whatsapp.VerifySms.g(r4);	 Catch:{ NumberFormatException -> 0x02cd }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x02cd }
        goto L_0x00e3;
    L_0x02cd:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08a6 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08a6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08a6 }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08a6 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08a6 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08a6 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08a6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08a6 }
        r5 = 45;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08a6 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08a6 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08a6 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08a6 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08a6 }
        r4 = 30;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x08a6 }
        if (r2 == 0) goto L_0x00e3;
    L_0x02fd:
        r3 = com.whatsapp.qp.ERROR_CONNECTIVITY;	 Catch:{ NumberFormatException -> 0x08a6 }
        if (r0 != r3) goto L_0x0320;
    L_0x0301:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08a8 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x08a8 }
        r5 = 2131231746; // 0x7f080402 float:1.8079582E38 double:1.052968389E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x08a8 }
        r7 = 0;
        r8 = r14.b;	 Catch:{ NumberFormatException -> 0x08a8 }
        r9 = 2131230939; // 0x7f0800db float:1.8077945E38 double:1.0529679903E-314;
        r8 = r8.getString(r9);	 Catch:{ NumberFormatException -> 0x08a8 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x08a8 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x08a8 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x08a8 }
        if (r2 == 0) goto L_0x00e3;
    L_0x0320:
        r3 = com.whatsapp.qp.ERROR_BAD_PARAMETER;	 Catch:{ NumberFormatException -> 0x08aa }
        if (r0 != r3) goto L_0x0384;
    L_0x0324:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08ac }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08ac }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08ac }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08ac }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08ac }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08ac }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08ac }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08ac }
        r5 = 19;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08ac }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08ac }
        r4 = r1.a;	 Catch:{ NumberFormatException -> 0x08ac }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08ac }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08ac }
        com.whatsapp.util.Log.e(r3);	 Catch:{ NumberFormatException -> 0x08ac }
        r3 = z;	 Catch:{ NumberFormatException -> 0x08ac }
        r4 = 33;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x08ac }
        com.whatsapp.App.v(r3);	 Catch:{ NumberFormatException -> 0x08ac }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08ac }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08ac }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08ac }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08ac }
        r3 = z;	 Catch:{ NumberFormatException -> 0x08ac }
        r4 = 65;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x08ac }
        r4 = r1.a;	 Catch:{ NumberFormatException -> 0x08ac }
        r3 = r3.equals(r4);	 Catch:{ NumberFormatException -> 0x08ac }
        if (r3 == 0) goto L_0x037b;
    L_0x0372:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08ae }
        r4 = 38;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x08ae }
        if (r2 == 0) goto L_0x00e3;
    L_0x037b:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08b0 }
        r4 = 27;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x08b0 }
        if (r2 == 0) goto L_0x00e3;
    L_0x0384:
        r3 = com.whatsapp.qp.ERROR_MISSING_PARAMETER;	 Catch:{ NumberFormatException -> 0x08b2 }
        if (r0 != r3) goto L_0x03cb;
    L_0x0388:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08b4 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08b4 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08b4 }
        r5 = 26;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08b4 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08b4 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08b4 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08b4 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08b4 }
        r5 = 46;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08b4 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08b4 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08b4 }
        com.whatsapp.util.Log.e(r3);	 Catch:{ NumberFormatException -> 0x08b4 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x08b4 }
        r4 = 15;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x08b4 }
        com.whatsapp.App.v(r3);	 Catch:{ NumberFormatException -> 0x08b4 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08b4 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08b4 }
        r5 = 28;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08b4 }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08b4 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08b4 }
        r4 = 28;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x08b4 }
        if (r2 == 0) goto L_0x00e3;
    L_0x03cb:
        r3 = com.whatsapp.qp.ERROR_OLD_VERSION;	 Catch:{ NumberFormatException -> 0x08b6 }
        if (r0 != r3) goto L_0x0409;
    L_0x03cf:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08b8 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08b8 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08b8 }
        r5 = 67;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08b8 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08b8 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08b8 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08b8 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08b8 }
        r5 = 58;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08b8 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08b8 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08b8 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08b8 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08b8 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08b8 }
        r5 = 60;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08b8 }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08b8 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08b8 }
        r4 = 23;
        r3.c(r4);	 Catch:{ NumberFormatException -> 0x08b8 }
        if (r2 == 0) goto L_0x00e3;
    L_0x0409:
        r3 = com.whatsapp.qp.ERROR_TOO_RECENT;	 Catch:{ NumberFormatException -> 0x08ba }
        if (r0 != r3) goto L_0x04ca;
    L_0x040d:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08bc }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08bc }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08bc }
        r5 = 31;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08bc }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08bc }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08bc }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08bc }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08bc }
        r5 = 57;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08bc }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08bc }
        r4 = r1.h;	 Catch:{ NumberFormatException -> 0x08bc }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08bc }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08bc }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08bc }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08bc }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08bc }
        r5 = 13;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08bc }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08bc }
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x08bc }
        if (r3 != 0) goto L_0x0458;
    L_0x0448:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08be }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x08be }
        r5 = 2131231793; // 0x7f080431 float:1.8079677E38 double:1.052968412E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x08be }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x08be }
        if (r2 == 0) goto L_0x00e3;
    L_0x0458:
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x0493 }
        r4 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0493 }
        r4 = r4 * r12;
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0493 }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x0493 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0493 }
        r6 = r14.b;	 Catch:{ NumberFormatException -> 0x0493 }
        r7 = 2131231792; // 0x7f080430 float:1.8079675E38 double:1.0529684118E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x0493 }
        r9 = 0;
        r10 = r14.b;	 Catch:{ NumberFormatException -> 0x0493 }
        r10 = com.whatsapp.util.cs.f(r10, r4);	 Catch:{ NumberFormatException -> 0x0493 }
        r8[r9] = r10;	 Catch:{ NumberFormatException -> 0x0493 }
        r6 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x0493 }
        r3.j(r6);	 Catch:{ NumberFormatException -> 0x0493 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0493 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0493 }
        r6 = r6 + r4;
        com.whatsapp.VerifySms.c(r3, r6);	 Catch:{ NumberFormatException -> 0x0493 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0493 }
        r3 = com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x0493 }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x0493 }
        goto L_0x00e3;
    L_0x0493:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08c0 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08c0 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c0 }
        r5 = 56;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08c0 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08c0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08c0 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c0 }
        r5 = 63;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08c0 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08c0 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08c0 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08c0 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x08c0 }
        r5 = 2131231793; // 0x7f080431 float:1.8079677E38 double:1.052968412E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x08c0 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x08c0 }
        if (r2 == 0) goto L_0x00e3;
    L_0x04ca:
        r3 = com.whatsapp.qp.ERROR_BLOCKED;	 Catch:{ NumberFormatException -> 0x08c0 }
        if (r0 != r3) goto L_0x0514;
    L_0x04ce:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08c2 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08c2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c2 }
        r5 = 23;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c2 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08c2 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08c2 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08c2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c2 }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c2 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08c2 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08c2 }
        com.whatsapp.util.Log.e(r3);	 Catch:{ NumberFormatException -> 0x08c2 }
        r3 = 12;
        com.whatsapp.VerifySms.b(r3);	 Catch:{ NumberFormatException -> 0x08c2 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08c2 }
        com.whatsapp.VerifySms.r(r3);	 Catch:{ NumberFormatException -> 0x08c2 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08c2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c2 }
        r5 = 52;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c2 }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08c2 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08c2 }
        com.whatsapp.VerifySms.m(r3);	 Catch:{ NumberFormatException -> 0x08c2 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08c2 }
        com.whatsapp.VerifySms.j(r3);	 Catch:{ NumberFormatException -> 0x08c2 }
        if (r2 == 0) goto L_0x00e3;
    L_0x0514:
        r3 = com.whatsapp.qp.ERROR_NEXT_METHOD;	 Catch:{ NumberFormatException -> 0x08c4 }
        if (r0 != r3) goto L_0x055a;
    L_0x0518:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08c6 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c6 }
        r5 = 69;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c6 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08c6 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c6 }
        r5 = 72;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c6 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08c6 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08c6 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c6 }
        r5 = 35;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c6 }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        r14.a(r1);	 Catch:{ NumberFormatException -> 0x08c6 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = 41;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08c6 }
        com.whatsapp.VerifySms.o(r3);	 Catch:{ NumberFormatException -> 0x08c6 }
        if (r2 == 0) goto L_0x00e3;
    L_0x055a:
        r3 = com.whatsapp.qp.ERROR_TOO_MANY_GUESSES;	 Catch:{ NumberFormatException -> 0x08c8 }
        if (r0 != r3) goto L_0x060b;
    L_0x055e:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08ca }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08ca }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08ca }
        r5 = 68;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08ca }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08ca }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08ca }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08ca }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08ca }
        r5 = 66;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08ca }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08ca }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08ca }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08ca }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08ca }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08ca }
        r5 = 61;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08ca }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08ca }
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x08ca }
        if (r3 != 0) goto L_0x059c;
    L_0x0593:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08cc }
        r4 = 31;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x08cc }
        if (r2 == 0) goto L_0x00e3;
    L_0x059c:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x05db }
        r4 = r1.h;	 Catch:{ NumberFormatException -> 0x05db }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x05db }
        r4 = r4 * r12;
        com.whatsapp.VerifySms.a(r3, r4);	 Catch:{ NumberFormatException -> 0x05db }
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x05db }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x05db }
        r4 = com.whatsapp.VerifySms.g(r4);	 Catch:{ NumberFormatException -> 0x05db }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x05db }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x05db }
        r4 = 36;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x05db }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x05db }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x05db }
        r6 = r14.b;	 Catch:{ NumberFormatException -> 0x05db }
        r6 = com.whatsapp.VerifySms.g(r6);	 Catch:{ NumberFormatException -> 0x05db }
        r4 = r4 + r6;
        com.whatsapp.VerifySms.c(r3, r4);	 Catch:{ NumberFormatException -> 0x05db }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x05db }
        r3 = com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x05db }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x05db }
        r4 = com.whatsapp.VerifySms.g(r4);	 Catch:{ NumberFormatException -> 0x05db }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x05db }
        goto L_0x00e3;
    L_0x05db:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08ce }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08ce }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08ce }
        r5 = 18;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08ce }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08ce }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08ce }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08ce }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08ce }
        r5 = 71;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08ce }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08ce }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08ce }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08ce }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08ce }
        r4 = 31;
        r3.e(r4);	 Catch:{ NumberFormatException -> 0x08ce }
        if (r2 == 0) goto L_0x00e3;
    L_0x060b:
        r3 = com.whatsapp.qp.ERROR_PROVIDER_TIMEOUT;	 Catch:{ NumberFormatException -> 0x08ce }
        if (r0 != r3) goto L_0x06c6;
    L_0x060f:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08d0 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08d0 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d0 }
        r5 = 30;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08d0 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08d0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08d0 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d0 }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08d0 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08d0 }
        com.whatsapp.util.Log.e(r3);	 Catch:{ NumberFormatException -> 0x08d0 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08d0 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d0 }
        r5 = 64;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d0 }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08d0 }
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x08d0 }
        if (r3 != 0) goto L_0x0654;
    L_0x0644:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08d2 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x08d2 }
        r5 = 2131231807; // 0x7f08043f float:1.8079705E38 double:1.052968419E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x08d2 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x08d2 }
        if (r2 == 0) goto L_0x00e3;
    L_0x0654:
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x068f }
        r4 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x068f }
        r4 = r4 * r12;
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x068f }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x068f }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x068f }
        r6 = r14.b;	 Catch:{ NumberFormatException -> 0x068f }
        r7 = 2131231806; // 0x7f08043e float:1.8079703E38 double:1.0529684187E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x068f }
        r9 = 0;
        r10 = r14.b;	 Catch:{ NumberFormatException -> 0x068f }
        r10 = com.whatsapp.util.cs.f(r10, r4);	 Catch:{ NumberFormatException -> 0x068f }
        r8[r9] = r10;	 Catch:{ NumberFormatException -> 0x068f }
        r6 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x068f }
        r3.j(r6);	 Catch:{ NumberFormatException -> 0x068f }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x068f }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x068f }
        r6 = r6 + r4;
        com.whatsapp.VerifySms.c(r3, r6);	 Catch:{ NumberFormatException -> 0x068f }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x068f }
        r3 = com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x068f }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x068f }
        goto L_0x00e3;
    L_0x068f:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08d4 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08d4 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d4 }
        r5 = 34;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d4 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08d4 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08d4 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08d4 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d4 }
        r5 = 38;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d4 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08d4 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08d4 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08d4 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08d4 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x08d4 }
        r5 = 2131231807; // 0x7f08043f float:1.8079705E38 double:1.052968419E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x08d4 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x08d4 }
        if (r2 == 0) goto L_0x00e3;
    L_0x06c6:
        r3 = com.whatsapp.qp.ERROR_PROVIDER_UNROUTABLE;	 Catch:{ NumberFormatException -> 0x08d4 }
        if (r0 != r3) goto L_0x0781;
    L_0x06ca:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08d6 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08d6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d6 }
        r5 = 12;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d6 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08d6 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08d6 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08d6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d6 }
        r5 = 25;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d6 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08d6 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08d6 }
        com.whatsapp.util.Log.e(r3);	 Catch:{ NumberFormatException -> 0x08d6 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08d6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d6 }
        r5 = 24;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d6 }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08d6 }
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x08d6 }
        if (r3 != 0) goto L_0x070f;
    L_0x06ff:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08d8 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x08d8 }
        r5 = 2131231809; // 0x7f080441 float:1.807971E38 double:1.05296842E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x08d8 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x08d8 }
        if (r2 == 0) goto L_0x00e3;
    L_0x070f:
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x074a }
        r4 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x074a }
        r4 = r4 * r12;
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x074a }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x074a }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x074a }
        r6 = r14.b;	 Catch:{ NumberFormatException -> 0x074a }
        r7 = 2131231808; // 0x7f080440 float:1.8079707E38 double:1.0529684197E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x074a }
        r9 = 0;
        r10 = r14.b;	 Catch:{ NumberFormatException -> 0x074a }
        r10 = com.whatsapp.util.cs.f(r10, r4);	 Catch:{ NumberFormatException -> 0x074a }
        r8[r9] = r10;	 Catch:{ NumberFormatException -> 0x074a }
        r6 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x074a }
        r3.j(r6);	 Catch:{ NumberFormatException -> 0x074a }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x074a }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x074a }
        r6 = r6 + r4;
        com.whatsapp.VerifySms.c(r3, r6);	 Catch:{ NumberFormatException -> 0x074a }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x074a }
        r3 = com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x074a }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x074a }
        goto L_0x00e3;
    L_0x074a:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08da }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08da }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08da }
        r5 = 22;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08da }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08da }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08da }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08da }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08da }
        r5 = 29;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08da }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08da }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08da }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08da }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08da }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x08da }
        r5 = 2131231809; // 0x7f080441 float:1.807971E38 double:1.05296842E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x08da }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x08da }
        if (r2 == 0) goto L_0x00e3;
    L_0x0781:
        r3 = com.whatsapp.qp.ERROR_NO_ROUTES;	 Catch:{ NumberFormatException -> 0x08da }
        if (r0 != r3) goto L_0x083c;
    L_0x0785:
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08dc }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08dc }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08dc }
        r5 = 16;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08dc }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08dc }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08dc }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08dc }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08dc }
        r5 = 62;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08dc }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08dc }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08dc }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08dc }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08dc }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08dc }
        r5 = 21;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08dc }
        r3.d(r4);	 Catch:{ NumberFormatException -> 0x08dc }
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x08dc }
        if (r3 != 0) goto L_0x07ca;
    L_0x07ba:
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08de }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x08de }
        r5 = 2131231809; // 0x7f080441 float:1.807971E38 double:1.05296842E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x08de }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x08de }
        if (r2 == 0) goto L_0x00e3;
    L_0x07ca:
        r3 = r1.h;	 Catch:{ NumberFormatException -> 0x0805 }
        r4 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0805 }
        r4 = r4 * r12;
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0805 }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x0805 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0805 }
        r6 = r14.b;	 Catch:{ NumberFormatException -> 0x0805 }
        r7 = 2131231808; // 0x7f080440 float:1.8079707E38 double:1.0529684197E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x0805 }
        r9 = 0;
        r10 = r14.b;	 Catch:{ NumberFormatException -> 0x0805 }
        r10 = com.whatsapp.util.cs.f(r10, r4);	 Catch:{ NumberFormatException -> 0x0805 }
        r8[r9] = r10;	 Catch:{ NumberFormatException -> 0x0805 }
        r6 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x0805 }
        r3.j(r6);	 Catch:{ NumberFormatException -> 0x0805 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0805 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0805 }
        r6 = r6 + r4;
        com.whatsapp.VerifySms.c(r3, r6);	 Catch:{ NumberFormatException -> 0x0805 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x0805 }
        r3 = com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x0805 }
        r3.a(r4);	 Catch:{ NumberFormatException -> 0x0805 }
        goto L_0x00e3;
    L_0x0805:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08e0 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x08e0 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08e0 }
        r5 = 59;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08e0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08e0 }
        r4 = r14.a;	 Catch:{ NumberFormatException -> 0x08e0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08e0 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08e0 }
        r5 = 36;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08e0 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x08e0 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x08e0 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ NumberFormatException -> 0x08e0 }
        r3 = r14.b;	 Catch:{ NumberFormatException -> 0x08e0 }
        r4 = r14.b;	 Catch:{ NumberFormatException -> 0x08e0 }
        r5 = 2131231809; // 0x7f080441 float:1.807971E38 double:1.05296842E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x08e0 }
        r3.j(r4);	 Catch:{ NumberFormatException -> 0x08e0 }
        if (r2 == 0) goto L_0x00e3;
    L_0x083c:
        r3 = com.whatsapp.qp.ERROR_BAD_TOKEN;	 Catch:{ NumberFormatException -> 0x08e2 }
        if (r0 != r3) goto L_0x00e3;
    L_0x0840:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08e4 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x08e4 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x08e4 }
        r4 = 47;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x08e4 }
        r0 = r0.append(r3);	 Catch:{ NumberFormatException -> 0x08e4 }
        r3 = r14.a;	 Catch:{ NumberFormatException -> 0x08e4 }
        r0 = r0.append(r3);	 Catch:{ NumberFormatException -> 0x08e4 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x08e4 }
        r4 = 49;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x08e4 }
        r0 = r0.append(r3);	 Catch:{ NumberFormatException -> 0x08e4 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x08e4 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x08e4 }
        r0 = r14.b;	 Catch:{ NumberFormatException -> 0x08e4 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x08e4 }
        r4 = 17;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x08e4 }
        r0.d(r3);	 Catch:{ NumberFormatException -> 0x08e4 }
        r0 = r14.b;	 Catch:{ NumberFormatException -> 0x08e4 }
        r3 = 43;
        r0.e(r3);	 Catch:{ NumberFormatException -> 0x08e4 }
        if (r2 == 0) goto L_0x00e3;
    L_0x087a:
        r0 = r1.d;	 Catch:{ NumberFormatException -> 0x08e6 }
        if (r0 == 0) goto L_0x088f;
    L_0x087e:
        r0 = r1.d;	 Catch:{ NumberFormatException -> 0x08e6 }
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x08e6 }
        r0 = r1.d;	 Catch:{ NumberFormatException -> 0x08e6 }
        com.whatsapp.registration.CodeInputField.setRegistrationVoiceCodeLength(r0);	 Catch:{ NumberFormatException -> 0x08e6 }
        r0 = r14.b;	 Catch:{ NumberFormatException -> 0x08e6 }
        r2 = r1.d;	 Catch:{ NumberFormatException -> 0x08e6 }
        com.whatsapp.App.e(r0, r2);	 Catch:{ NumberFormatException -> 0x08e6 }
    L_0x088f:
        r0 = r14.b;
        com.whatsapp.VerifySms.h(r0);
        goto L_0x00e3;
    L_0x0896:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0898 }
    L_0x0898:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x089a }
    L_0x089a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x089c }
    L_0x089c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x089e }
    L_0x089e:
        r0 = move-exception;
        throw r0;
    L_0x08a0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08a2 }
    L_0x08a2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08a4 }
    L_0x08a4:
        r0 = move-exception;
        throw r0;
    L_0x08a6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08a8 }
    L_0x08a8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08aa }
    L_0x08aa:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08ac }
    L_0x08ac:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08ae }
    L_0x08ae:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08b0 }
    L_0x08b0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08b2 }
    L_0x08b2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08b4 }
    L_0x08b4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08b6 }
    L_0x08b6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08b8 }
    L_0x08b8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08ba }
    L_0x08ba:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08bc }
    L_0x08bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08be }
    L_0x08be:
        r0 = move-exception;
        throw r0;
    L_0x08c0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08c2 }
    L_0x08c2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08c4 }
    L_0x08c4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08c6 }
    L_0x08c6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08c8 }
    L_0x08c8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08ca }
    L_0x08ca:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08cc }
    L_0x08cc:
        r0 = move-exception;
        throw r0;
    L_0x08ce:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08d0 }
    L_0x08d0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08d2 }
    L_0x08d2:
        r0 = move-exception;
        throw r0;
    L_0x08d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08d6 }
    L_0x08d6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08d8 }
    L_0x08d8:
        r0 = move-exception;
        throw r0;
    L_0x08da:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08dc }
    L_0x08dc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08de }
    L_0x08de:
        r0 = move-exception;
        throw r0;
    L_0x08e0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08e2 }
    L_0x08e2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08e4 }
    L_0x08e4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08e6 }
    L_0x08e6:
        r0 = move-exception;
        throw r0;
    L_0x08e8:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ba.a(android.support.v4.util.Pair):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(@android.support.annotation.NonNull com.whatsapp.ne r13) {
        /*
        r12 = this;
        r10 = -1;
        r8 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r13.i;	 Catch:{ NumberFormatException -> 0x00a5 }
        if (r0 == 0) goto L_0x00a7;
    L_0x000a:
        r0 = r13.i;	 Catch:{ NumberFormatException -> 0x00a5 }
    L_0x000c:
        r2 = com.whatsapp.VerifyNumber.a(r0, r10);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r4;
        r0 = r12.b;
        r4 = 2131755943; // 0x7f1003a7 float:1.914278E38 double:1.053227377E-314;
        r0 = r0.findViewById(r4);
        r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r4 <= 0) goto L_0x0039;
    L_0x0020:
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ NumberFormatException -> 0x00ab }
        r4 = r12.b;	 Catch:{ NumberFormatException -> 0x00ab }
        r4 = com.whatsapp.VerifySms.a(r4);	 Catch:{ NumberFormatException -> 0x00ab }
        r4.a(r2);	 Catch:{ NumberFormatException -> 0x00ab }
        r4 = r12.b;	 Catch:{ NumberFormatException -> 0x00ab }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x00ab }
        r6 = r6 + r2;
        com.whatsapp.VerifySms.c(r4, r6);	 Catch:{ NumberFormatException -> 0x00ab }
        if (r1 == 0) goto L_0x0057;
    L_0x0039:
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x0044;
    L_0x003d:
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x00af }
        if (r1 == 0) goto L_0x0057;
    L_0x0044:
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x00af }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x00af }
        r0 = com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x00af }
        r2 = 1;
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x00af }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x00af }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x00af }
    L_0x0057:
        r0 = r13.f;
        r2 = com.whatsapp.VerifyNumber.a(r0, r10);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r4;
        r0 = r12.b;
        r4 = 2131755940; // 0x7f1003a4 float:1.9142773E38 double:1.0532273753E-314;
        r0 = r0.findViewById(r4);
        r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r4 <= 0) goto L_0x0086;
    L_0x006d:
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ NumberFormatException -> 0x00b1 }
        r4 = r12.b;	 Catch:{ NumberFormatException -> 0x00b1 }
        r4 = com.whatsapp.VerifySms.f(r4);	 Catch:{ NumberFormatException -> 0x00b1 }
        r4.a(r2);	 Catch:{ NumberFormatException -> 0x00b1 }
        r4 = r12.b;	 Catch:{ NumberFormatException -> 0x00b1 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x00b1 }
        r6 = r6 + r2;
        com.whatsapp.VerifySms.d(r4, r6);	 Catch:{ NumberFormatException -> 0x00b1 }
        if (r1 == 0) goto L_0x00a4;
    L_0x0086:
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x0091;
    L_0x008a:
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x00b5 }
        if (r1 == 0) goto L_0x00a4;
    L_0x0091:
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x00b5 }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x00b5 }
        r0 = com.whatsapp.VerifySms.f(r0);	 Catch:{ NumberFormatException -> 0x00b5 }
        r1 = 1;
        r0.a(r1);	 Catch:{ NumberFormatException -> 0x00b5 }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x00b5 }
        com.whatsapp.VerifySms.c(r0);	 Catch:{ NumberFormatException -> 0x00b5 }
    L_0x00a4:
        return;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = r13.h;
        goto L_0x000c;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ba.a(com.whatsapp.ne):void");
    }

    protected void onPostExecute(Object obj) {
        a((Pair) obj);
    }

    protected void onPreExecute() {
        try {
            if (!this.b.isFinishing()) {
                this.b.showDialog(25);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.support.v4.util.Pair a(java.lang.String[] r9) {
        /*
        r8 = this;
        r2 = com.whatsapp.qp.ERROR_UNSPECIFIED;
        r1 = 0;
        r0 = r8.b;	 Catch:{ IOException -> 0x00c6, Exception -> 0x0095 }
        r3 = r8.b;	 Catch:{ IOException -> 0x00c6, Exception -> 0x0095 }
        r3 = com.whatsapp.VerifySms.k(r3);	 Catch:{ IOException -> 0x00c6, Exception -> 0x0095 }
        r4 = r8.b;	 Catch:{ IOException -> 0x00c6, Exception -> 0x0095 }
        r4 = com.whatsapp.VerifySms.v(r4);	 Catch:{ IOException -> 0x00c6, Exception -> 0x0095 }
        r5 = r8.c;	 Catch:{ IOException -> 0x00c6, Exception -> 0x0095 }
        r6 = com.whatsapp.VerifyNumber.s;	 Catch:{ IOException -> 0x00c6, Exception -> 0x0095 }
        r0 = com.whatsapp.VerifyNumber.a(r0, r3, r4, r5, r6);	 Catch:{ IOException -> 0x00c6, Exception -> 0x0095 }
        r1 = r0.j;	 Catch:{ IOException -> 0x004a, Exception -> 0x00bf }
        r2 = com.whatsapp.qp.YES_WITH_CODE;	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        if (r1 != r2) goto L_0x0043;
    L_0x001f:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        r2.<init>();	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        r3 = z;	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        r3 = r8.a;	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        r3 = z;	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0048, Exception -> 0x00c4 }
    L_0x0043:
        r0 = android.support.v4.util.Pair.create(r1, r0);
        return r0;
    L_0x0048:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x004a, Exception -> 0x00c4 }
    L_0x004a:
        r1 = move-exception;
        r7 = r1;
        r1 = r0;
        r0 = r7;
    L_0x004e:
        r0 = r0.toString();
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0093 }
        r2.<init>();	 Catch:{ IOException -> 0x0093 }
        r3 = z;	 Catch:{ IOException -> 0x0093 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0093 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0093 }
        r3 = r8.a;	 Catch:{ IOException -> 0x0093 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0093 }
        r3 = z;	 Catch:{ IOException -> 0x0093 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0093 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0093 }
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0093 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0093 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0093 }
        if (r0 == 0) goto L_0x008d;
    L_0x007c:
        r2 = z;	 Catch:{ IOException -> 0x0093 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0093 }
        r0 = r0.contains(r2);	 Catch:{ IOException -> 0x0093 }
        if (r0 == 0) goto L_0x008d;
    L_0x0087:
        r0 = com.whatsapp.qp.ERROR_UNSPECIFIED;
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x008f;
    L_0x008d:
        r0 = com.whatsapp.qp.ERROR_CONNECTIVITY;
    L_0x008f:
        r7 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x0043;
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r7;
    L_0x009a:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = r8.a;
        r3 = r3.append(r4);
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x0043;
    L_0x00bf:
        r1 = move-exception;
        r7 = r1;
        r1 = r2;
        r2 = r7;
        goto L_0x009a;
    L_0x00c4:
        r2 = move-exception;
        goto L_0x009a;
    L_0x00c6:
        r0 = move-exception;
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ba.a(java.lang.String[]):android.support.v4.util.Pair");
    }

    protected ba(VerifySms verifySms) {
        this.b = verifySms;
        this.c = z[73];
        this.a = "v";
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }
}
