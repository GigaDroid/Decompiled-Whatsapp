package org.whispersystems;

import com.google.bJ;
import com.google.fn;
import com.google.gB;
import com.google.hh;
import com.google.i;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;

final class bs implements gB {
    private static final String[] z;

    static {
        String[] strArr = new String[56];
        String str = "x#;Zj_;";
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
                        i3 = 58;
                        break;
                    case at.g /*1*/:
                        i3 = 66;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 63;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "j7*SHY\t-F";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "i'&[DH\u0001 ^HT\t-F";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "n+%ZRN#%O";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "i'&[DH\u0010)KBR'<tDC\u0012:VW[6-";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "v-+^Mh#<\\I_6\u0003ZXj0!I@N'";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "{.!\\Dx#;Zj_;";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "w';L@]'\u0003ZXI";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "s,,ZY";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "i+/Q@N7:Z";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "v-+^Ms&-QUS61tDC\u0012:VW[6-";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "j'&[HT%\u0018MDq'1";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "j7*SHY\t-F";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "h-'Kj_;";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "s4";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "j7*SHY";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "s,,ZY";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "j0!I@N'";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "q'1";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "y7:MDT6\u001bZRI+'Q";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "i'&[DH\t-FrN#<ZR";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "y*)VOq'1";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "s6-M@N+'Q";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "s6-M@N+'Q";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "j0!I@N'\u0003ZX";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "t'-[Rh'.MDI*";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "i'9JDT!-";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "i'&[DH\u0001 ^HT";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "s&";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "j0!I@N'\u0003ZX";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "v-+^Ms&-QUS61tDC";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "i'&[DH\t-Fh^";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    str = "h'%PU_\u0010-XHI6:^US-&vE";
                    obj = 32;
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    strArr2 = strArr3;
                    str = "v-+^Mx#;Zj_;";
                    obj = 33;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "v-+^Mx#;Zj_;\u0018MHL#<Z";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "y+8WDH\t-F";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "i'&[DH\u0011!XOS,/tDC";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "j0-IHU7;|NO,<ZS";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "s&";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "i'-[";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "v-+^Mh'/VRN0)KHU,\u0001[";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "w#+tDC";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "j0-tDC\u000b,";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "v-+^Mh#<\\I_6\u0003ZX";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "i'-[";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "j7*SHY\t-F";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "i'&[DH\u000f-LR[%-tDC1";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "v-+^Ms&-QUS61oTX.!\\";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "i+/QD^\u0012:Zj_;\u0001[";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "h'%PU_\u000b,ZON+<FqO $VB";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "j0-IHU7;lDI1!POI";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "i';LHU,\u001eZSI+'Q";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "i'&[DH\u0010)KBR'<tDC";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "j0!I@N'\u0003ZX";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "h'+ZHL':|I[+&L";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "j'&[HT%\u0003ZX\u007f:+W@T%-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public i assignDescriptors(hh hhVar) {
        int i = Y.r;
        a5.a(hhVar);
        a5.k((fn) a5.x().a().get(0));
        a5.f(new bJ(a5.A(), new String[]{z[52], z[48], z[50], z[14], z[38], z[28], z[55], z[1], z[12], z[33], z[41], z[26], z[7]}));
        a5.c((fn) a5.A().e().get(0));
        a5.h(new bJ(a5.t(), new String[]{z[53], z[5], z[22], z[8]}));
        a5.n((fn) a5.t().e().get(0));
        a5.n(new bJ(a5.l(), new String[]{z[17], z[19]}));
        a5.o((fn) a5.t().e().get(1));
        a5.k(new bJ(a5.d(), new String[]{z[9], z[36], z[42], z[15]}));
        a5.h((fn) a5.A().e().get(1));
        a5.b(new bJ(a5.r(), new String[]{z[27], z[34], z[35], z[44], z[6], z[31], z[11]}));
        a5.i((fn) a5.A().e().get(2));
        a5.m(new bJ(a5.b(), new String[]{z[43], z[49], z[0]}));
        a5.d((fn) a5.x().a().get(1));
        a5.e(new bJ(a5.B(), new String[]{z[20], z[51]}));
        a5.f((fn) a5.x().a().get(2));
        a5.d(new bJ(a5.w(), new String[]{z[39], z[13], z[25]}));
        a5.b((fn) a5.x().a().get(3));
        a5.o(new bJ(a5.z(), new String[]{z[29], z[46], z[30], z[10], z[4]}));
        a5.e((fn) a5.x().a().get(4));
        a5.j(new bJ(a5.k(), new String[]{z[2], z[54]}));
        a5.l((fn) a5.x().a().get(5));
        a5.g(new bJ(a5.y(), new String[]{z[32], z[3], z[37], z[47]}));
        a5.a((fn) a5.y().e().get(0));
        a5.a(new bJ(a5.a(), new String[]{z[23], z[45]}));
        a5.g((fn) a5.y().e().get(1));
        a5.i(new bJ(a5.v(), new String[]{z[24], z[40]}));
        a5.m((fn) a5.y().e().get(2));
        a5.l(new bJ(a5.u(), new String[]{z[16], z[18]}));
        a5.j((fn) a5.x().a().get(6));
        a5.c(new bJ(a5.i(), new String[]{z[21]}));
        if (i != 0) {
            a5.o = !a5.o;
        }
        return null;
    }

    bs() {
    }
}
