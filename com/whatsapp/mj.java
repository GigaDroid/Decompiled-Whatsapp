package com.whatsapp;

import android.os.AsyncTask;
import android.support.v4.util.Pair;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class mj extends AsyncTask {
    private static final String[] z;
    final String a;
    final String b;
    final boolean c;
    final VerifySms d;

    static {
        String[] strArr = new String[75];
        String str = "0#nO\u0001m%s\n";
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
                        i3 = 31;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = 1;
                        break;
                    case at.o /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 115;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "09uK\u0007j9.O\u0001m%s\u0005\nz9,]\u001ak\",I\u001c{/";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "0/sX\u001cmj";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "l'r";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>!";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^k%n\u0007\u0001z)dD\u0007";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "0:sE\u0005v.dX^k#lO\u001cj>";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^o8n\\\u001a{/s\u0007\u0006q8n_\u0007~(mO";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "0<dX\u001ay#dN\\p!";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^z8sE\u00012?oY\u0003z)hL\u001az.";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "0<dX\u0000v%o\u0007\u0007p%,E\u001f{";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "0$dR\u00072'd^\u001bp.";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "0(`N^k%jO\u001d";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "0>sC\u0016{>nE\u001e~$x^\u001ar/rK\u001fs'd^\u001bp.r\u0005\u0007v'd\u0007\u001dp>,C\u001dk";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "i/sC\u0015f<nC\u0010zesO\u0002j/r^\\";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "0>dG\u0003p8`X\u001as3,_\u001d~<`C\u001f~(mO\\j$`H\u001fzguE^o+sY\u001628d^\u0001f\u000bg^\u0016m";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "0>nE^r+oS^x?dY\u0000z9.^\u001ar/,D\u001ckghD\u0007";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^z8sE\u00012)nD\u001dz)uC\u0005v>x";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "0>nE^m/bO\u001dkeuC\u001ezgoE\u00072#o^";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^}+e\u0007\u0007p!dD";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "0>dG\u00032?oK\u0005~#m";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^k/lZ^j$`\\\u0012v&`H\u001fz";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    str = "q?lH\u0016m";
                    obj = 30;
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    strArr2 = strArr3;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 31;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "0:sE\u0005v.dX^j$sE\u0006k+cF\u0016";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^k%n\u0007\u001e~$x\u0007\u0007m#dY^~&m\u0007\u001ez>iE\u0017l";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^}+e\u0007\u0003~8`G";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "0>nE^m/bO\u001dkeuC\u001ezgoE\u00072#o^";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "0$n\u0007\u0001p?uO\u00000>hG\u00162$n^^v$u";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "r#rY\u001aq-!Z\u0012m+lO\u0007z8";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "}+e\n\u0003~8`G\u0016k/s";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    str = "0>nE^m/bO\u001dkjvK\u001akj";
                    obj = 41;
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    strArr2 = strArr3;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^o8n\\\u001a{/s\u0007\u0007v'dE\u0006k";
                    obj = 42;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^q%,X\u001cj>dY";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "0(`N^o+sK\u001ez>dX\\";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^r#rY\u001aq-,Z\u0012m+l";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^k%n\u0007\u001e~$x\u0007\u0014j/rY\u0016l";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^j9dX^}&nI\u0018z.";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "D8d[\u0006z9ui\u001c{/SO\u0000j&u\n\u001aljo_\u001fs\u0017!Y\u0016|%oN\u0000";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "0'hY\u0000v$f\u0007\u0003~8`G\u0016k/s";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^k%n\u0007\u001e~$x\u0007\u0007m#dY";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "0>sC\u0016{>nE\u001e~$x^\u001ar/rK\u001fs'd^\u001bp.r\u0005\u0007v'd\u0007\u001dp>,C\u001dk";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "0>nE^r+oS^k8hO\u0000";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "0$n\u0007\u0001p?uO\u0000";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "0>nE^r+oS^x?dY\u0000z9";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "0?oY\u0003z)hL\u001az.";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "0>nE^r+oS^k8hO\u00002+mF^r/uB\u001c{9";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "0?oX\u001cj>`H\u001fzeuC\u001ezgoE\u00072#o^";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "l/s\\\u0016mgrO\u001d{gsO\u0002j/r^^q/y^^r/uB\u001c{";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "0(mE\u0010t/e";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "i/sC\u0015f9lY\\m/p_\u0016l>.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.support.v4.util.Pair a(java.lang.String[] r9) {
        /*
        r8 = this;
        r2 = com.whatsapp.qp.ERROR_UNSPECIFIED;
        r1 = 0;
        r0 = r8.d;	 Catch:{ IOException -> 0x00c2, Exception -> 0x0091 }
        r3 = r8.d;	 Catch:{ IOException -> 0x00c2, Exception -> 0x0091 }
        r3 = com.whatsapp.VerifySms.k(r3);	 Catch:{ IOException -> 0x00c2, Exception -> 0x0091 }
        r4 = r8.d;	 Catch:{ IOException -> 0x00c2, Exception -> 0x0091 }
        r4 = com.whatsapp.VerifySms.v(r4);	 Catch:{ IOException -> 0x00c2, Exception -> 0x0091 }
        r5 = r8.b;	 Catch:{ IOException -> 0x00c2, Exception -> 0x0091 }
        r6 = com.whatsapp.VerifyNumber.s;	 Catch:{ IOException -> 0x00c2, Exception -> 0x0091 }
        r0 = com.whatsapp.VerifyNumber.a(r0, r3, r4, r5, r6);	 Catch:{ IOException -> 0x00c2, Exception -> 0x0091 }
        r1 = r0.j;	 Catch:{ IOException -> 0x0061, Exception -> 0x00bb }
        r2 = com.whatsapp.qp.YES_WITH_CODE;	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        if (r1 != r2) goto L_0x0047;
    L_0x001f:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r2.<init>();	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r3 = z;	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r3 = r8.a;	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r3 = z;	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IOException -> 0x0059, Exception -> 0x00c0 }
        if (r2 == 0) goto L_0x0054;
    L_0x0047:
        r2 = com.whatsapp.qp.YES;	 Catch:{ IOException -> 0x005b, Exception -> 0x00c0 }
        if (r1 != r2) goto L_0x0054;
    L_0x004b:
        r2 = r0.d;	 Catch:{ IOException -> 0x005d, Exception -> 0x00c0 }
        if (r2 == 0) goto L_0x0054;
    L_0x004f:
        r2 = r0.d;	 Catch:{ IOException -> 0x005f, Exception -> 0x00c0 }
        com.whatsapp.VerifySms.c(r2);	 Catch:{ IOException -> 0x005f, Exception -> 0x00c0 }
    L_0x0054:
        r0 = android.support.v4.util.Pair.create(r1, r0);
        return r0;
    L_0x0059:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x005b, Exception -> 0x00c0 }
    L_0x005b:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x005d, Exception -> 0x00c0 }
    L_0x005d:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x005f, Exception -> 0x00c0 }
    L_0x005f:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0061, Exception -> 0x00c0 }
    L_0x0061:
        r1 = move-exception;
    L_0x0062:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r8.a;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        r1 = com.whatsapp.qp.ERROR_CONNECTIVITY;
        goto L_0x0054;
    L_0x0091:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r7;
    L_0x0096:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = r8.a;
        r3 = r3.append(r4);
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x0054;
    L_0x00bb:
        r1 = move-exception;
        r7 = r1;
        r1 = r2;
        r2 = r7;
        goto L_0x0096;
    L_0x00c0:
        r2 = move-exception;
        goto L_0x0096;
    L_0x00c2:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mj.a(java.lang.String[]):android.support.v4.util.Pair");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(@android.support.annotation.NonNull com.whatsapp.ne r13) {
        /*
        r12 = this;
        r10 = -1;
        r8 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r13.f;	 Catch:{ NumberFormatException -> 0x00a5 }
        if (r0 == 0) goto L_0x00a7;
    L_0x000a:
        r0 = r13.f;	 Catch:{ NumberFormatException -> 0x00a5 }
    L_0x000c:
        r2 = com.whatsapp.VerifyNumber.a(r0, r10);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r4;
        r0 = r12.d;
        r4 = 2131755940; // 0x7f1003a4 float:1.9142773E38 double:1.0532273753E-314;
        r0 = r0.findViewById(r4);
        r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r4 <= 0) goto L_0x0039;
    L_0x0020:
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ NumberFormatException -> 0x00ab }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x00ab }
        r4 = com.whatsapp.VerifySms.f(r4);	 Catch:{ NumberFormatException -> 0x00ab }
        r4.a(r2);	 Catch:{ NumberFormatException -> 0x00ab }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x00ab }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x00ab }
        r6 = r6 + r2;
        com.whatsapp.VerifySms.d(r4, r6);	 Catch:{ NumberFormatException -> 0x00ab }
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
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x00af }
        r0 = com.whatsapp.VerifySms.f(r0);	 Catch:{ NumberFormatException -> 0x00af }
        r2 = 1;
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x00af }
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x00af }
        com.whatsapp.VerifySms.c(r0);	 Catch:{ NumberFormatException -> 0x00af }
    L_0x0057:
        r0 = r13.i;
        r2 = com.whatsapp.VerifyNumber.a(r0, r10);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r4;
        r0 = r12.d;
        r4 = 2131755943; // 0x7f1003a7 float:1.914278E38 double:1.053227377E-314;
        r0 = r0.findViewById(r4);
        r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r4 <= 0) goto L_0x0086;
    L_0x006d:
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ NumberFormatException -> 0x00b1 }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x00b1 }
        r4 = com.whatsapp.VerifySms.a(r4);	 Catch:{ NumberFormatException -> 0x00b1 }
        r4.a(r2);	 Catch:{ NumberFormatException -> 0x00b1 }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x00b1 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x00b1 }
        r6 = r6 + r2;
        com.whatsapp.VerifySms.c(r4, r6);	 Catch:{ NumberFormatException -> 0x00b1 }
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
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x00b5 }
        r0 = com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x00b5 }
        r1 = 1;
        r0.a(r1);	 Catch:{ NumberFormatException -> 0x00b5 }
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x00b5 }
        com.whatsapp.VerifySms.l(r0);	 Catch:{ NumberFormatException -> 0x00b5 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mj.a(com.whatsapp.ne):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(android.support.v4.util.Pair r13) {
        /*
        r12 = this;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.c;	 Catch:{ NumberFormatException -> 0x020f }
        if (r0 == 0) goto L_0x0015;
    L_0x0006:
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x020f }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x020f }
        if (r0 != 0) goto L_0x0015;
    L_0x000e:
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x0211 }
        r1 = 39;
        r0.removeDialog(r1);	 Catch:{ NumberFormatException -> 0x0211 }
    L_0x0015:
        r0 = "";
        com.whatsapp.VerifyNumber.s = r0;
        r0 = r13.first;
        r0 = (com.whatsapp.qp) r0;
        r1 = r13.second;
        r1 = (com.whatsapp.ne) r1;
        r2 = com.whatsapp.qp.OK;	 Catch:{ NumberFormatException -> 0x0213 }
        if (r0 != r2) goto L_0x0067;
    L_0x0026:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0213 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0213 }
        r5 = 48;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0213 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0213 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0213 }
        r5 = 12;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0213 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0213 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0213 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = r1.c;	 Catch:{ NumberFormatException -> 0x0213 }
        com.whatsapp.App.f(r2, r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r2 = r1.g;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = r1.c;	 Catch:{ NumberFormatException -> 0x0213 }
        com.whatsapp.ve.b(r2, r4);	 Catch:{ NumberFormatException -> 0x0213 }
        r2 = r1.b;	 Catch:{ NumberFormatException -> 0x0213 }
        com.whatsapp.VerifyNumber.a(r2);	 Catch:{ NumberFormatException -> 0x0213 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0213 }
        r4 = 1;
        com.whatsapp.VerifySms.a(r2, r4);	 Catch:{ NumberFormatException -> 0x0213 }
        if (r3 == 0) goto L_0x01ed;
    L_0x0067:
        r2 = com.whatsapp.qp.YES;	 Catch:{ NumberFormatException -> 0x0215 }
        if (r0 == r2) goto L_0x086b;
    L_0x006b:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0217 }
        com.whatsapp.VerifySms.n(r2);	 Catch:{ NumberFormatException -> 0x0217 }
        r2 = com.whatsapp.qp.ERROR_TEMPORARILY_UNAVAILABLE;	 Catch:{ NumberFormatException -> 0x0217 }
        if (r0 != r2) goto L_0x00f6;
    L_0x0074:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0219 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0219 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0219 }
        r5 = 57;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0219 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0219 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0219 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0219 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0219 }
        r5 = 28;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0219 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0219 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0219 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x0219 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0219 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0219 }
        r5 = 30;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0219 }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x0219 }
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x0219 }
        if (r2 != 0) goto L_0x00b9;
    L_0x00a9:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x021b }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x021b }
        r5 = 2131231789; // 0x7f08042d float:1.8079669E38 double:1.0529684103E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x021b }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x021b }
        if (r3 == 0) goto L_0x00e1;
    L_0x00b9:
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x021d }
        r4 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x021d }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x021d }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x021d }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x021d }
        r6 = r12.d;	 Catch:{ NumberFormatException -> 0x021d }
        r7 = 2131231790; // 0x7f08042e float:1.807967E38 double:1.052968411E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x021d }
        r9 = 0;
        r10 = r12.d;	 Catch:{ NumberFormatException -> 0x021d }
        r4 = com.whatsapp.util.cs.f(r10, r4);	 Catch:{ NumberFormatException -> 0x021d }
        r8[r9] = r4;	 Catch:{ NumberFormatException -> 0x021d }
        r4 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x021d }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x021d }
    L_0x00e1:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0254 }
        r2 = r2.t;	 Catch:{ NumberFormatException -> 0x0254 }
        if (r2 != 0) goto L_0x00ef;
    L_0x00e7:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0254 }
        r2 = r2.isFinishing();	 Catch:{ NumberFormatException -> 0x0254 }
        if (r2 == 0) goto L_0x01ed;
    L_0x00ef:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0256 }
        r2.a();	 Catch:{ NumberFormatException -> 0x0256 }
        if (r3 == 0) goto L_0x01ed;
    L_0x00f6:
        r2 = com.whatsapp.qp.ERROR_UNSPECIFIED;	 Catch:{ NumberFormatException -> 0x0258 }
        if (r0 != r2) goto L_0x0147;
    L_0x00fa:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x025a }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x025a }
        r4 = z;	 Catch:{ NumberFormatException -> 0x025a }
        r5 = 64;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x025a }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x025a }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x025a }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x025a }
        r4 = z;	 Catch:{ NumberFormatException -> 0x025a }
        r5 = 68;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x025a }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x025a }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x025a }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x025a }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x025a }
        r4 = z;	 Catch:{ NumberFormatException -> 0x025a }
        r5 = 13;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x025a }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x025a }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x025a }
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x025a }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x025a }
        r2 = r2.t;	 Catch:{ NumberFormatException -> 0x025a }
        if (r2 != 0) goto L_0x0140;
    L_0x0138:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x025c }
        r2 = r2.isFinishing();	 Catch:{ NumberFormatException -> 0x025c }
        if (r2 == 0) goto L_0x01ed;
    L_0x0140:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x025e }
        r2.a();	 Catch:{ NumberFormatException -> 0x025e }
        if (r3 == 0) goto L_0x01ed;
    L_0x0147:
        r2 = com.whatsapp.qp.ERROR_TOO_MANY;	 Catch:{ NumberFormatException -> 0x0260 }
        if (r0 != r2) goto L_0x029b;
    L_0x014b:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0262 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0262 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0262 }
        r5 = 63;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0262 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0262 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0262 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0262 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0262 }
        r5 = 65;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0262 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0262 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0262 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x0262 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0262 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0262 }
        r5 = 56;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0262 }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x0262 }
        r2 = 1;
        com.whatsapp.VerifySms.b(r2);	 Catch:{ NumberFormatException -> 0x0262 }
        r12.a(r1);	 Catch:{ NumberFormatException -> 0x0262 }
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x0262 }
        if (r2 != 0) goto L_0x0195;
    L_0x0187:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0264 }
        r4 = 42;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x0264 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0264 }
        com.whatsapp.VerifySms.o(r2);	 Catch:{ NumberFormatException -> 0x0264 }
        if (r3 == 0) goto L_0x01ed;
    L_0x0195:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0266 }
        r4 = r1.h;	 Catch:{ NumberFormatException -> 0x0266 }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x0266 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        com.whatsapp.VerifySms.a(r2, r4);	 Catch:{ NumberFormatException -> 0x0266 }
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0266 }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x0266 }
        r4 = com.whatsapp.VerifySms.g(r4);	 Catch:{ NumberFormatException -> 0x0266 }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x0266 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0266 }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x0266 }
        r5 = 2131231801; // 0x7f080439 float:1.8079693E38 double:1.052968416E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0266 }
        r7 = 0;
        r8 = r12.d;	 Catch:{ NumberFormatException -> 0x0266 }
        r9 = r12.d;	 Catch:{ NumberFormatException -> 0x0266 }
        r10 = com.whatsapp.VerifySms.g(r9);	 Catch:{ NumberFormatException -> 0x0266 }
        r8 = com.whatsapp.util.cs.f(r8, r10);	 Catch:{ NumberFormatException -> 0x0266 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x0266 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x0266 }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x0266 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0266 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0266 }
        r6 = r12.d;	 Catch:{ NumberFormatException -> 0x0266 }
        r6 = com.whatsapp.VerifySms.g(r6);	 Catch:{ NumberFormatException -> 0x0266 }
        r4 = r4 + r6;
        com.whatsapp.VerifySms.d(r2, r4);	 Catch:{ NumberFormatException -> 0x0266 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0266 }
        r2 = com.whatsapp.VerifySms.f(r2);	 Catch:{ NumberFormatException -> 0x0266 }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x0266 }
        r4 = com.whatsapp.VerifySms.g(r4);	 Catch:{ NumberFormatException -> 0x0266 }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x0266 }
    L_0x01ed:
        if (r1 == 0) goto L_0x01f4;
    L_0x01ef:
        r12.a(r1);	 Catch:{ NumberFormatException -> 0x09c4 }
        if (r3 == 0) goto L_0x020e;
    L_0x01f4:
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x09c4 }
        r0 = com.whatsapp.VerifySms.f(r0);	 Catch:{ NumberFormatException -> 0x09c4 }
        r2 = com.whatsapp.h7.a();	 Catch:{ NumberFormatException -> 0x09c4 }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x09c4 }
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x09c4 }
        r0 = com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x09c4 }
        r2 = com.whatsapp.h7.a();	 Catch:{ NumberFormatException -> 0x09c4 }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x09c4 }
    L_0x020e:
        return;
    L_0x020f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0211 }
    L_0x0211:
        r0 = move-exception;
        throw r0;
    L_0x0213:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0215 }
    L_0x0215:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0217 }
    L_0x0217:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0219 }
    L_0x0219:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x021b }
    L_0x021b:
        r0 = move-exception;
        throw r0;
    L_0x021d:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 59;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r12.a;
        r2 = r2.append(r4);
        r4 = z;
        r5 = 21;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = r12.d;
        r4 = r12.d;
        r5 = 2131231789; // 0x7f08042d float:1.8079669E38 double:1.0529684103E-314;
        r4 = r4.getString(r5);
        r2.j(r4);
        goto L_0x00e1;
    L_0x0254:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0256 }
    L_0x0256:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0258 }
    L_0x0258:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x025a }
    L_0x025a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x025c }
    L_0x025c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x025e }
    L_0x025e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0260 }
    L_0x0260:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0262 }
    L_0x0262:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0264 }
    L_0x0264:
        r0 = move-exception;
        throw r0;
    L_0x0266:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0882 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0882 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0882 }
        r5 = 61;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0882 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0882 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0882 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0882 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0882 }
        r5 = 58;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0882 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0882 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0882 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x0882 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0882 }
        r4 = 42;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x0882 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0882 }
        com.whatsapp.VerifySms.o(r2);	 Catch:{ NumberFormatException -> 0x0882 }
        if (r3 == 0) goto L_0x01ed;
    L_0x029b:
        r2 = com.whatsapp.qp.ERROR_TOO_MANY_ALL_METHODS;	 Catch:{ NumberFormatException -> 0x0882 }
        if (r0 != r2) goto L_0x031c;
    L_0x029f:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0884 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0884 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0884 }
        r5 = 44;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0884 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0884 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0884 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0884 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0884 }
        r5 = 69;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0884 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0884 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0884 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x0884 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0884 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0884 }
        r5 = 34;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0884 }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x0884 }
        r2 = 1;
        com.whatsapp.VerifySms.b(r2);	 Catch:{ NumberFormatException -> 0x0884 }
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x0884 }
        if (r2 != 0) goto L_0x02e1;
    L_0x02d8:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0886 }
        r4 = 30;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x0886 }
        if (r3 == 0) goto L_0x0307;
    L_0x02e1:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0888 }
        r4 = r1.h;	 Catch:{ NumberFormatException -> 0x0888 }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x0888 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        com.whatsapp.VerifySms.a(r2, r4);	 Catch:{ NumberFormatException -> 0x0888 }
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0888 }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x0888 }
        r4 = com.whatsapp.VerifySms.g(r4);	 Catch:{ NumberFormatException -> 0x0888 }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x0888 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0888 }
        r4 = 1;
        com.whatsapp.VerifySms.b(r2, r4);	 Catch:{ NumberFormatException -> 0x0888 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0888 }
        r4 = 35;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x0888 }
    L_0x0307:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08b8 }
        r2 = r2.t;	 Catch:{ NumberFormatException -> 0x08b8 }
        if (r2 != 0) goto L_0x0315;
    L_0x030d:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08b8 }
        r2 = r2.isFinishing();	 Catch:{ NumberFormatException -> 0x08b8 }
        if (r2 == 0) goto L_0x01ed;
    L_0x0315:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08ba }
        r2.a();	 Catch:{ NumberFormatException -> 0x08ba }
        if (r3 == 0) goto L_0x01ed;
    L_0x031c:
        r2 = com.whatsapp.qp.ERROR_CONNECTIVITY;	 Catch:{ NumberFormatException -> 0x08bc }
        if (r0 != r2) goto L_0x035d;
    L_0x0320:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08be }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08be }
        r5 = 23;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08be }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x08be }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08be }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x08be }
        r5 = 2131231746; // 0x7f080402 float:1.8079582E38 double:1.052968389E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x08be }
        r7 = 0;
        r8 = r12.d;	 Catch:{ NumberFormatException -> 0x08be }
        r9 = 2131230939; // 0x7f0800db float:1.8077945E38 double:1.0529679903E-314;
        r8 = r8.getString(r9);	 Catch:{ NumberFormatException -> 0x08be }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x08be }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x08be }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x08be }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08be }
        r2 = r2.t;	 Catch:{ NumberFormatException -> 0x08be }
        if (r2 != 0) goto L_0x0356;
    L_0x034e:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08c0 }
        r2 = r2.isFinishing();	 Catch:{ NumberFormatException -> 0x08c0 }
        if (r2 == 0) goto L_0x01ed;
    L_0x0356:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08c2 }
        r2.a();	 Catch:{ NumberFormatException -> 0x08c2 }
        if (r3 == 0) goto L_0x01ed;
    L_0x035d:
        r2 = com.whatsapp.qp.ERROR_BAD_PARAMETER;	 Catch:{ NumberFormatException -> 0x08c4 }
        if (r0 != r2) goto L_0x03d4;
    L_0x0361:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08c6 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c6 }
        r5 = 29;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c6 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x08c6 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c6 }
        r5 = 46;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c6 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = r1.a;	 Catch:{ NumberFormatException -> 0x08c6 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x08c6 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x08c6 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = 41;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x08c6 }
        com.whatsapp.App.v(r2);	 Catch:{ NumberFormatException -> 0x08c6 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08c6 }
        r5 = 35;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08c6 }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = 31;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x08c6 }
        r4 = r1.a;	 Catch:{ NumberFormatException -> 0x08c6 }
        r2 = r2.equals(r4);	 Catch:{ NumberFormatException -> 0x08c6 }
        if (r2 == 0) goto L_0x03b8;
    L_0x03af:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08c8 }
        r4 = 38;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x08c8 }
        if (r3 == 0) goto L_0x01ed;
    L_0x03b8:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08ca }
        r4 = 27;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x08ca }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08ca }
        r2 = r2.t;	 Catch:{ NumberFormatException -> 0x08ca }
        if (r2 != 0) goto L_0x03cd;
    L_0x03c5:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08cc }
        r2 = r2.isFinishing();	 Catch:{ NumberFormatException -> 0x08cc }
        if (r2 == 0) goto L_0x01ed;
    L_0x03cd:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08ce }
        r2.a();	 Catch:{ NumberFormatException -> 0x08ce }
        if (r3 == 0) goto L_0x01ed;
    L_0x03d4:
        r2 = com.whatsapp.qp.ERROR_MISSING_PARAMETER;	 Catch:{ NumberFormatException -> 0x08d0 }
        if (r0 != r2) goto L_0x042e;
    L_0x03d8:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08d2 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x08d2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d2 }
        r5 = 60;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d2 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08d2 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x08d2 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08d2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d2 }
        r5 = 54;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d2 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08d2 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x08d2 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x08d2 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x08d2 }
        r4 = 38;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x08d2 }
        com.whatsapp.App.v(r2);	 Catch:{ NumberFormatException -> 0x08d2 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08d2 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08d2 }
        r5 = 47;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08d2 }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x08d2 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08d2 }
        r4 = 28;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x08d2 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08d2 }
        r2 = r2.t;	 Catch:{ NumberFormatException -> 0x08d2 }
        if (r2 != 0) goto L_0x0427;
    L_0x041f:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08d4 }
        r2 = r2.isFinishing();	 Catch:{ NumberFormatException -> 0x08d4 }
        if (r2 == 0) goto L_0x01ed;
    L_0x0427:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08d6 }
        r2.a();	 Catch:{ NumberFormatException -> 0x08d6 }
        if (r3 == 0) goto L_0x01ed;
    L_0x042e:
        r2 = com.whatsapp.qp.ERROR_OLD_VERSION;	 Catch:{ NumberFormatException -> 0x08d8 }
        if (r0 != r2) goto L_0x046e;
    L_0x0432:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08da }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x08da }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08da }
        r5 = 40;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08da }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08da }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x08da }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08da }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08da }
        r5 = 15;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08da }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08da }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x08da }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x08da }
        r2 = 1;
        com.whatsapp.App.r = r2;	 Catch:{ NumberFormatException -> 0x08da }
        r2 = 8;
        com.whatsapp.VerifySms.b(r2);	 Catch:{ NumberFormatException -> 0x08da }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08da }
        com.whatsapp.VerifySms.r(r2);	 Catch:{ NumberFormatException -> 0x08da }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08da }
        r4 = 23;
        r2.c(r4);	 Catch:{ NumberFormatException -> 0x08da }
        if (r3 == 0) goto L_0x01ed;
    L_0x046e:
        r2 = com.whatsapp.qp.ERROR_TOO_RECENT;	 Catch:{ NumberFormatException -> 0x08dc }
        if (r0 != r2) goto L_0x04fe;
    L_0x0472:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x08de }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x08de }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08de }
        r5 = 70;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08de }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08de }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x08de }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08de }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08de }
        r5 = 42;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08de }
        r4 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x08de }
        if (r1 == 0) goto L_0x08e2;
    L_0x0493:
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x08e0 }
    L_0x0495:
        r2 = r4.append(r2);	 Catch:{ NumberFormatException -> 0x08ea }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x08ea }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x08ea }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08ea }
        r4 = z;	 Catch:{ NumberFormatException -> 0x08ea }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x08ea }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x08ea }
        if (r1 == 0) goto L_0x04b1;
    L_0x04ad:
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x08ea }
        if (r2 != 0) goto L_0x04c1;
    L_0x04b1:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08ec }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x08ec }
        r5 = 2131231793; // 0x7f080431 float:1.8079677E38 double:1.052968412E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x08ec }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x08ec }
        if (r3 == 0) goto L_0x04e9;
    L_0x04c1:
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x08ee }
        r4 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x08ee }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x08ee }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x08ee }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x08ee }
        r6 = r12.d;	 Catch:{ NumberFormatException -> 0x08ee }
        r7 = 2131231792; // 0x7f080430 float:1.8079675E38 double:1.0529684118E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x08ee }
        r9 = 0;
        r10 = r12.d;	 Catch:{ NumberFormatException -> 0x08ee }
        r4 = com.whatsapp.util.cs.f(r10, r4);	 Catch:{ NumberFormatException -> 0x08ee }
        r8[r9] = r4;	 Catch:{ NumberFormatException -> 0x08ee }
        r4 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x08ee }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x08ee }
    L_0x04e9:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0925 }
        r2 = r2.t;	 Catch:{ NumberFormatException -> 0x0925 }
        if (r2 != 0) goto L_0x04f7;
    L_0x04ef:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0925 }
        r2 = r2.isFinishing();	 Catch:{ NumberFormatException -> 0x0925 }
        if (r2 == 0) goto L_0x01ed;
    L_0x04f7:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0927 }
        r2.a();	 Catch:{ NumberFormatException -> 0x0927 }
        if (r3 == 0) goto L_0x01ed;
    L_0x04fe:
        r2 = com.whatsapp.qp.ERROR_BLOCKED;	 Catch:{ NumberFormatException -> 0x0929 }
        if (r0 != r2) goto L_0x0557;
    L_0x0502:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x092b }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x092b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x092b }
        r5 = 62;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x092b }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x092b }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x092b }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x092b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x092b }
        r5 = 73;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x092b }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x092b }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x092b }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x092b }
        r2 = 12;
        com.whatsapp.VerifySms.b(r2);	 Catch:{ NumberFormatException -> 0x092b }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x092b }
        com.whatsapp.VerifySms.r(r2);	 Catch:{ NumberFormatException -> 0x092b }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x092b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x092b }
        r5 = 51;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x092b }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x092b }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x092b }
        com.whatsapp.VerifySms.m(r2);	 Catch:{ NumberFormatException -> 0x092b }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x092b }
        r2 = r2.t;	 Catch:{ NumberFormatException -> 0x092b }
        if (r2 != 0) goto L_0x0550;
    L_0x0548:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x092d }
        r2 = r2.isFinishing();	 Catch:{ NumberFormatException -> 0x092d }
        if (r2 == 0) goto L_0x01ed;
    L_0x0550:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x092f }
        r2.a();	 Catch:{ NumberFormatException -> 0x092f }
        if (r3 == 0) goto L_0x01ed;
    L_0x0557:
        r2 = com.whatsapp.qp.ERROR_NEXT_METHOD;	 Catch:{ NumberFormatException -> 0x0931 }
        if (r0 != r2) goto L_0x059d;
    L_0x055b:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0933 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0933 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0933 }
        r5 = 32;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0933 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0933 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0933 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0933 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0933 }
        r5 = 16;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0933 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0933 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0933 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x0933 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0933 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0933 }
        r5 = 72;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0933 }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x0933 }
        r12.a(r1);	 Catch:{ NumberFormatException -> 0x0933 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0933 }
        r4 = 40;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x0933 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0933 }
        com.whatsapp.VerifySms.o(r2);	 Catch:{ NumberFormatException -> 0x0933 }
        if (r3 == 0) goto L_0x01ed;
    L_0x059d:
        r2 = com.whatsapp.qp.ERROR_NO_ROUTES;	 Catch:{ NumberFormatException -> 0x0935 }
        if (r0 != r2) goto L_0x065a;
    L_0x05a1:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0937 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0937 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0937 }
        r5 = 24;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0937 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0937 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0937 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0937 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0937 }
        r5 = 66;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0937 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0937 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0937 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x0937 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0937 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0937 }
        r5 = 45;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0937 }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x0937 }
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x0937 }
        if (r2 != 0) goto L_0x05e6;
    L_0x05d6:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0939 }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x0939 }
        r5 = 2131231784; // 0x7f080428 float:1.8079659E38 double:1.052968408E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x0939 }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x0939 }
        if (r3 == 0) goto L_0x01ed;
    L_0x05e6:
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x0623 }
        r4 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x0623 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0623 }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x0623 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0623 }
        r6 = r12.d;	 Catch:{ NumberFormatException -> 0x0623 }
        r7 = 2131231783; // 0x7f080427 float:1.8079657E38 double:1.0529684073E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x0623 }
        r9 = 0;
        r10 = r12.d;	 Catch:{ NumberFormatException -> 0x0623 }
        r10 = com.whatsapp.util.cs.f(r10, r4);	 Catch:{ NumberFormatException -> 0x0623 }
        r8[r9] = r10;	 Catch:{ NumberFormatException -> 0x0623 }
        r6 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x0623 }
        r2.j(r6);	 Catch:{ NumberFormatException -> 0x0623 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0623 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0623 }
        r6 = r6 + r4;
        com.whatsapp.VerifySms.c(r2, r6);	 Catch:{ NumberFormatException -> 0x0623 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0623 }
        r2 = com.whatsapp.VerifySms.a(r2);	 Catch:{ NumberFormatException -> 0x0623 }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x0623 }
        goto L_0x01ed;
    L_0x0623:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x093b }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x093b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x093b }
        r5 = 50;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x093b }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x093b }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x093b }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x093b }
        r4 = z;	 Catch:{ NumberFormatException -> 0x093b }
        r5 = 37;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x093b }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x093b }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x093b }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x093b }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x093b }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x093b }
        r5 = 2131231784; // 0x7f080428 float:1.8079659E38 double:1.052968408E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x093b }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x093b }
        if (r3 == 0) goto L_0x01ed;
    L_0x065a:
        r2 = com.whatsapp.qp.ERROR_TOO_MANY_GUESSES;	 Catch:{ NumberFormatException -> 0x093b }
        if (r0 != r2) goto L_0x06d7;
    L_0x065e:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x093d }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x093d }
        r4 = z;	 Catch:{ NumberFormatException -> 0x093d }
        r5 = 53;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x093d }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x093d }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x093d }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x093d }
        r4 = z;	 Catch:{ NumberFormatException -> 0x093d }
        r5 = 67;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x093d }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x093d }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x093d }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x093d }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x093d }
        r4 = z;	 Catch:{ NumberFormatException -> 0x093d }
        r5 = 49;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x093d }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x093d }
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x093d }
        if (r2 != 0) goto L_0x069c;
    L_0x0693:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x093f }
        r4 = 31;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x093f }
        if (r3 == 0) goto L_0x06c2;
    L_0x069c:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0941 }
        r4 = r1.h;	 Catch:{ NumberFormatException -> 0x0941 }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x0941 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        com.whatsapp.VerifySms.a(r2, r4);	 Catch:{ NumberFormatException -> 0x0941 }
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0941 }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x0941 }
        r4 = com.whatsapp.VerifySms.g(r4);	 Catch:{ NumberFormatException -> 0x0941 }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x0941 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0941 }
        r4 = 1;
        com.whatsapp.VerifySms.b(r2, r4);	 Catch:{ NumberFormatException -> 0x0941 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0941 }
        r4 = 36;
        r2.e(r4);	 Catch:{ NumberFormatException -> 0x0941 }
    L_0x06c2:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0971 }
        r2 = r2.t;	 Catch:{ NumberFormatException -> 0x0971 }
        if (r2 != 0) goto L_0x06d0;
    L_0x06c8:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0971 }
        r2 = r2.isFinishing();	 Catch:{ NumberFormatException -> 0x0971 }
        if (r2 == 0) goto L_0x01ed;
    L_0x06d0:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0973 }
        r2.a();	 Catch:{ NumberFormatException -> 0x0973 }
        if (r3 == 0) goto L_0x01ed;
    L_0x06d7:
        r2 = com.whatsapp.qp.ERROR_PROVIDER_TIMEOUT;	 Catch:{ NumberFormatException -> 0x0975 }
        if (r0 != r2) goto L_0x0770;
    L_0x06db:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0977 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0977 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0977 }
        r5 = 25;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0977 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0977 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0977 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0977 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0977 }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0977 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x0977 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0977 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x0977 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0977 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0977 }
        r5 = 43;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0977 }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x0977 }
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x0977 }
        if (r2 != 0) goto L_0x0720;
    L_0x0710:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x0979 }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x0979 }
        r5 = 2131231782; // 0x7f080426 float:1.8079655E38 double:1.052968407E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x0979 }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x0979 }
        if (r3 == 0) goto L_0x075b;
    L_0x0720:
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x097b }
        r4 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x097b }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x097b }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x097b }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x097b }
        r6 = r12.d;	 Catch:{ NumberFormatException -> 0x097b }
        r7 = 2131231781; // 0x7f080425 float:1.8079653E38 double:1.0529684063E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x097b }
        r9 = 0;
        r10 = r12.d;	 Catch:{ NumberFormatException -> 0x097b }
        r10 = com.whatsapp.util.cs.f(r10, r4);	 Catch:{ NumberFormatException -> 0x097b }
        r8[r9] = r10;	 Catch:{ NumberFormatException -> 0x097b }
        r6 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x097b }
        r2.j(r6);	 Catch:{ NumberFormatException -> 0x097b }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x097b }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x097b }
        r6 = r6 + r4;
        com.whatsapp.VerifySms.d(r2, r6);	 Catch:{ NumberFormatException -> 0x097b }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x097b }
        r2 = com.whatsapp.VerifySms.f(r2);	 Catch:{ NumberFormatException -> 0x097b }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x097b }
    L_0x075b:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x09b2 }
        r2 = r2.t;	 Catch:{ NumberFormatException -> 0x09b2 }
        if (r2 != 0) goto L_0x0769;
    L_0x0761:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x09b2 }
        r2 = r2.isFinishing();	 Catch:{ NumberFormatException -> 0x09b2 }
        if (r2 == 0) goto L_0x01ed;
    L_0x0769:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x09b4 }
        r2.a();	 Catch:{ NumberFormatException -> 0x09b4 }
        if (r3 == 0) goto L_0x01ed;
    L_0x0770:
        r2 = com.whatsapp.qp.ERROR_PROVIDER_UNROUTABLE;	 Catch:{ NumberFormatException -> 0x09b6 }
        if (r0 != r2) goto L_0x082d;
    L_0x0774:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x09b8 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x09b8 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x09b8 }
        r5 = 18;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x09b8 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x09b8 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x09b8 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x09b8 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x09b8 }
        r5 = 33;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x09b8 }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x09b8 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x09b8 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x09b8 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x09b8 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x09b8 }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x09b8 }
        r2.d(r4);	 Catch:{ NumberFormatException -> 0x09b8 }
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x09b8 }
        if (r2 != 0) goto L_0x07b9;
    L_0x07a9:
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x09ba }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x09ba }
        r5 = 2131231784; // 0x7f080428 float:1.8079659E38 double:1.052968408E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x09ba }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x09ba }
        if (r3 == 0) goto L_0x01ed;
    L_0x07b9:
        r2 = r1.h;	 Catch:{ NumberFormatException -> 0x07f6 }
        r4 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x07f6 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x07f6 }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x07f6 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x07f6 }
        r6 = r12.d;	 Catch:{ NumberFormatException -> 0x07f6 }
        r7 = 2131231783; // 0x7f080427 float:1.8079657E38 double:1.0529684073E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ NumberFormatException -> 0x07f6 }
        r9 = 0;
        r10 = r12.d;	 Catch:{ NumberFormatException -> 0x07f6 }
        r10 = com.whatsapp.util.cs.f(r10, r4);	 Catch:{ NumberFormatException -> 0x07f6 }
        r8[r9] = r10;	 Catch:{ NumberFormatException -> 0x07f6 }
        r6 = r6.getString(r7, r8);	 Catch:{ NumberFormatException -> 0x07f6 }
        r2.j(r6);	 Catch:{ NumberFormatException -> 0x07f6 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x07f6 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x07f6 }
        r6 = r6 + r4;
        com.whatsapp.VerifySms.c(r2, r6);	 Catch:{ NumberFormatException -> 0x07f6 }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x07f6 }
        r2 = com.whatsapp.VerifySms.a(r2);	 Catch:{ NumberFormatException -> 0x07f6 }
        r2.a(r4);	 Catch:{ NumberFormatException -> 0x07f6 }
        goto L_0x01ed;
    L_0x07f6:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x09bc }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x09bc }
        r4 = z;	 Catch:{ NumberFormatException -> 0x09bc }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x09bc }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x09bc }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x09bc }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x09bc }
        r4 = z;	 Catch:{ NumberFormatException -> 0x09bc }
        r5 = 71;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x09bc }
        r2 = r2.append(r4);	 Catch:{ NumberFormatException -> 0x09bc }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x09bc }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x09bc }
        r2 = r12.d;	 Catch:{ NumberFormatException -> 0x09bc }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x09bc }
        r5 = 2131231784; // 0x7f080428 float:1.8079659E38 double:1.052968408E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x09bc }
        r2.j(r4);	 Catch:{ NumberFormatException -> 0x09bc }
        if (r3 == 0) goto L_0x01ed;
    L_0x082d:
        r2 = com.whatsapp.qp.ERROR_BAD_TOKEN;	 Catch:{ NumberFormatException -> 0x09be }
        if (r0 != r2) goto L_0x01ed;
    L_0x0831:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x09c0 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x09c0 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x09c0 }
        r4 = 55;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x09c0 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x09c0 }
        r2 = r12.a;	 Catch:{ NumberFormatException -> 0x09c0 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x09c0 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x09c0 }
        r4 = 17;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x09c0 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x09c0 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x09c0 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x09c0 }
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x09c0 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x09c0 }
        r4 = 27;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x09c0 }
        r0.d(r2);	 Catch:{ NumberFormatException -> 0x09c0 }
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x09c0 }
        r2 = 43;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x09c0 }
        if (r3 == 0) goto L_0x01ed;
    L_0x086b:
        r0 = r1.d;	 Catch:{ NumberFormatException -> 0x09c2 }
        if (r0 == 0) goto L_0x087b;
    L_0x086f:
        r0 = r1.d;	 Catch:{ NumberFormatException -> 0x09c2 }
        com.whatsapp.VerifySms.c(r0);	 Catch:{ NumberFormatException -> 0x09c2 }
        r0 = r12.d;	 Catch:{ NumberFormatException -> 0x09c2 }
        r2 = r1.d;	 Catch:{ NumberFormatException -> 0x09c2 }
        com.whatsapp.App.b(r0, r2);	 Catch:{ NumberFormatException -> 0x09c2 }
    L_0x087b:
        r0 = r12.d;
        com.whatsapp.VerifySms.h(r0);
        goto L_0x01ed;
    L_0x0882:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0884 }
    L_0x0884:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0886 }
    L_0x0886:
        r0 = move-exception;
        throw r0;
    L_0x0888:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 14;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r12.a;
        r2 = r2.append(r4);
        r4 = z;
        r5 = 19;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = r12.d;
        r4 = 30;
        r2.e(r4);
        goto L_0x0307;
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
        throw r0;	 Catch:{ NumberFormatException -> 0x08c0 }
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
        throw r0;	 Catch:{ NumberFormatException -> 0x08ce }
    L_0x08ce:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08d0 }
    L_0x08d0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08d2 }
    L_0x08d2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08d4 }
    L_0x08d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08d6 }
    L_0x08d6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08d8 }
    L_0x08d8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08da }
    L_0x08da:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08dc }
    L_0x08dc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08de }
    L_0x08de:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08e0 }
    L_0x08e0:
        r0 = move-exception;
        throw r0;
    L_0x08e2:
        r2 = z;
        r5 = 52;
        r2 = r2[r5];
        goto L_0x0495;
    L_0x08ea:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x08ec }
    L_0x08ec:
        r0 = move-exception;
        throw r0;
    L_0x08ee:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 39;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r12.a;
        r2 = r2.append(r4);
        r4 = z;
        r5 = 36;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = r12.d;
        r4 = r12.d;
        r5 = 2131231793; // 0x7f080431 float:1.8079677E38 double:1.052968412E-314;
        r4 = r4.getString(r5);
        r2.j(r4);
        goto L_0x04e9;
    L_0x0925:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0927 }
    L_0x0927:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0929 }
    L_0x0929:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x092b }
    L_0x092b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x092d }
    L_0x092d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x092f }
    L_0x092f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0931 }
    L_0x0931:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0933 }
    L_0x0933:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0935 }
    L_0x0935:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0937 }
    L_0x0937:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0939 }
    L_0x0939:
        r0 = move-exception;
        throw r0;
    L_0x093b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x093d }
    L_0x093d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x093f }
    L_0x093f:
        r0 = move-exception;
        throw r0;
    L_0x0941:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 74;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r12.a;
        r2 = r2.append(r4);
        r4 = z;
        r5 = 22;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = r12.d;
        r4 = 31;
        r2.e(r4);
        goto L_0x06c2;
    L_0x0971:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0973 }
    L_0x0973:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0975 }
    L_0x0975:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0977 }
    L_0x0977:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0979 }
    L_0x0979:
        r0 = move-exception;
        throw r0;
    L_0x097b:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 10;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r12.a;
        r2 = r2.append(r4);
        r4 = z;
        r5 = 26;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = r12.d;
        r4 = r12.d;
        r5 = 2131231782; // 0x7f080426 float:1.8079655E38 double:1.052968407E-314;
        r4 = r4.getString(r5);
        r2.j(r4);
        goto L_0x075b;
    L_0x09b2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x09b4 }
    L_0x09b4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x09b6 }
    L_0x09b6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x09b8 }
    L_0x09b8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x09ba }
    L_0x09ba:
        r0 = move-exception;
        throw r0;
    L_0x09bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x09be }
    L_0x09be:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x09c0 }
    L_0x09c0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x09c2 }
    L_0x09c2:
        r0 = move-exception;
        throw r0;
    L_0x09c4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mj.a(android.support.v4.util.Pair):void");
    }

    protected void onPostExecute(Object obj) {
        a((Pair) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }

    protected void onPreExecute() {
        try {
            VerifySms.b(0);
            VerifySms.f(this.d).c();
            VerifySms.a(this.d).c();
            VerifySms.u(this.d);
            App.p.a9();
            if (!this.c) {
                return;
            }
            if (!this.d.isFinishing()) {
                this.d.showDialog(39);
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    protected mj(VerifySms verifySms, boolean z) {
        this.d = verifySms;
        this.b = z[6];
        this.a = "s";
        this.c = z;
        Log.i(z[7] + this.a);
    }
}
