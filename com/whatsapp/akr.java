package com.whatsapp;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

@TargetApi(16)
public class akr implements aiv {
    private static final byte[] b;
    private static String e;
    private static ns n;
    private static final String[] z;
    private File a;
    private File c;
    private float d;
    private int f;
    private long g;
    private long h;
    private x5 i;
    private long j;
    private boolean k;
    private long l;
    protected File m;
    private File o;

    public void a(float f) {
        this.d = f;
    }

    public boolean h() {
        return this.k;
    }

    public static boolean g() {
        try {
            return e() == ns.SUPPORTED;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static x5 a(akr com_whatsapp_akr) {
        return com_whatsapp_akr.i;
    }

    public boolean m455a() {
        try {
            return this.c != null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static boolean b(akr com_whatsapp_akr) {
        return com_whatsapp_akr.k;
    }

    static {
        String[] strArr = new String[217];
        String str = "O%\u0016p}M>\u0013{aZ#\u0016pcL)\u0007p=U%\u0010xb\r!\u0007mwA/\u0017efP#\u001c";
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
                        i4 = 57;
                        break;
                    case at.g /*1*/:
                        i4 = 76;
                        break;
                    case at.i /*2*/:
                        i4 = 114;
                        break;
                    case at.o /*3*/:
                        i4 = 21;
                        break;
                    default:
                        i4 = 18;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    str = "T8D %\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016/\u001dy}Kl\u0014z`T-\u0006f(\u0019";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u0000:aR%\u00025";
                    i = 3;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u0000:v\\=\u0007pg\\c\u001b{bL8R)2\t";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "J \u001bvw\u0014$\u0017|uQ8";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016/\u0013{5Ml\u0011gwX8\u00175v\\/\u001dqwKl\u0014z`\u0019";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "u\u000b7";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005aM-\u0000aw]";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "w#R~|V;\u001c5qV \u001dg2_#\u0000xsM?RfgI#\u0000aw]";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "Z>\u001de?U)\u0014a";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "v\u0001*;_m\u0007\\C[}\t=;Ww\u000f=QWkb3CQ";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0019(\u0017v}])\u0000Wg_*\u0017g[W*\u001d;aP6\u0017/";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005aM#\u0002ew]";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\u0019.\u001ba`X8\u0017/";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    str = "j\r?FGw\u000b_FUqa;\"%\u000e";
                    i = 17;
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    strArr2 = strArr3;
                    str = "\u0019(\u0007gsM%\u001d{(";
                    i = 18;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016*\u0000t\u007f\\l\u0001~{I<\u0017q2";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    str = "\u0019*\u0000t\u007f\\?H";
                    i = 20;
                    i2 = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    strArr2 = strArr3;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005tV>\u001ftf\u0003";
                    i = 21;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u0000:v\\=\u0007pg\\c\u001b{bL8R";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\u0019*\u0000t\u007f\\?H";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005`\\ \u0017ta\\(";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "Z#\u001ez`\u0014*\u001dg\u007fX8";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005eV>\u0019t`V9\u001cq2J-\u001ffgW+R||Z#\u0000gwZ8R}wP+\u001aa";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016:\u001bqwV#\u0007abL8\u0001``_-\u0011p2Z>\u0017tf\\(";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "\u0019(\u0007gsM%\u001d{(";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016/\u001eza\\";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "w#Rv}])\u00115aL<\u0002z`M%\u001cr2O%\u0016p}\u0016-\u0004v";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u0016(\u0017v}])\u0000:v\\=\u0007pg\\c\u001b{bL8R";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "Z>\u001de?[#\u0006a}T";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "u\u000b_Q*\t";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\u0019-\u0011agX H";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005]L8\u0002`f{9\u0014swKl0@T\u007f\t JTu\r5JWw\b-ZTf\u001f&GWx\u0001";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005vK-\u001b{w]";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "T#\u0006z`V \u0013";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "\u0019!\u001bxw\u0003";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005}L8\u0002`f\u0019*\u001dg\u007fX8R}sJl\u0011}sW+\u0017q2M#R";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005vK-\u001b{{W+R";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "O%\u0016p}\u0016-\u0004v";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "\u0019?\u001bow\u0003";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005eV>\u0019t`V9\u001cq2N>\u001d{u\u0019/\u001dy}Kl\u0014z`T-\u00065tV>R}gX;\u0017|";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "O%\u0016p}\u0016-\u0004v";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016*\u001d`|]l";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "\u0019*\u0000z\u007f\u0003";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "j\u0004$8W\u000b}B";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016\"\u0007xp\\>Rzt\u00198\u0000tqR?H";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u0000:cL)\u0007p=P\"\u0002`f";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016/\u001d{d\\>\u00065v\\/\u001dqwK\u000e\u0007st\\>;{tVb\u001dstJ)\u0006/";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "Q)\u001brzM";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016?\u001d``Z)H";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "v\u0001*;y\nb\u0004|v\\#\\p|Z#\u0016p`\u0017-\u0004v";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "z-\u001c2f\u0019/\u0000psM)RqwZ#\u0016p`\u0019*\u001dg2";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "o\u001fK-\"fx5";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005}L8\u0002`f\u0019.\u0007st\\>\u00015zX:\u00175qQ-\u001crw]";
                    i = 56;
                    i2 = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    strArr2 = strArr3;
                    str = "v\u0001*;cZ#\u001f;dP(\u0017z<\\\"\u0011zv\\>\\tdZ";
                    i = 57;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "\u0019)\u001cv}])\u0000S`X!\u0017F{C)H";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "\u0019*\u0000t\u007f\\v";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "J8\u0000|v\\";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "O%\u0016p}\u0016-\u0004v";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016/\u001d{tP+\u0007gw\u0019)\u001cv}])\u00005eP8\u001a5}L8\u0002`f\u0019*\u001dg\u007fX8R";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "w#RqwZ#\u0016p`Jl";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u001d{w\u0019/\u0013{q\\ \u001epv\u0003";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016?\u0019|bI%\u001cr2";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016!\u001bxw\u0019";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005qV\"\u0014|uL>\u0017q";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "\u0019(\u0007gsM%\u001d{(";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\na`X/\u0006z`\u0016-\u0016csW/\u00175";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005}L8\u0002`f\u0019*\u001dg\u007fX8R}sJl\u0011}sW+\u0017q2M#R";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u0000:v\\=\u0007pg\\c\u001d`fI9\u00065";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u0000:`\\ \u0017ta\\c\u001d`fI9\u0006";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "T8D *\u0000";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "v\u0001*;A|\u000f\\tdZb\u0017{q";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u00168\u0000tqRv";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "u\u000b_S!\u000b|";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "\u0019?\u0019|b_%\u0000ff_>\u0013xwJv";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016*\u001b{{J$\u0017q(\u0019";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "\u00198\u001d/:";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "x!\u0013o}W";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005tX%\u001epv\u00198\u001d5qV\"\u0014|uL>\u001792N%\u001ey2M>\u000b5vP*\u0014p`\\\"\u00065}W)R";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005vK-\u001b{{W+R";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "Pa\u0014gsT)_||M)\u0000csU";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "Z>\u001de?K%\u0015}f";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "Z#\u001ez`\u0014*\u001dg\u007fX8";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005}L8\u0002`f\u0019.\u0007st\\>\u00015zX:\u00175qQ-\u001crw]";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "_>\u0013xw\u0014>\u0013aw";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\na`X/\u0006z`\u0019\u000e'ST|\u001e-S^x\u000b-P\\}\u0013=SMj\u0018 PSt";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005aM-\u0000aw]";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005qK)\u0013aw]";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\na`X/\u0006z`\u0016?\u0013xbU)Rf{C)H";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "[%\u0006gsM)";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "~\u0018_\\+\b|B";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "\u0003l";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = "J \u001bvw\u0014$\u0017|uQ8";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = "O%\u0016p}\u0016-\u0004v";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u0000:v\\=\u0007pg\\c\u001d`fI9\u00065";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = "v\u0001*;A|\u000f\\tdZb\u0017{q";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016 \u001dzb\u0019";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_buttonStyleSmall;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkboxStyle;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016?\u0019|bI%\u001cr2L\"\u0001`bI#\u0000aw]l\u0011z~V>Rs}K!\u0013a2";
                    i = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkedTextViewStyle;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016\"\u0007xp\\>Rzt\u0019/\u001dqwZ?H5";
                    i = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_editTextStyle;
                    str = "T%\u001fp";
                    i = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_radioButtonStyle;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cq2M%\u001fp2])\u0006pqM)\u00165";
                    i = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_ratingBarStyle;
                    str = "v\u0001*;\\O%\u0016|s\u0017";
                    i = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_seekBarStyle;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005qK)\u0013aw]";
                    i = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_spinnerStyle;
                    str = "\u0019/\u0000psM)\u0016";
                    i = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_switchStyle;
                    str = "u\u000b_CA\u0000tB";
                    i = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i2] = str;
                    i2 = 110;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016<\u0000zuK)\u0001f2";
                    i = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i2] = str;
                    i2 = 111;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005`\\ \u0017ta\\(";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    i2 = 112;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005`\\ \u0017ta\\(";
                    i = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 113;
                    str = "j\bF,!\t\u0019 ";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 114;
                    str = "N%\u0016az";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 115;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005eV>\u0019t`V9\u001cq2N>\u001d{u\u0019/\u001dy}Kl\u0014z`T-\u00065tV>RfsT?\u0007{u";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 116;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 117;
                    str = "\u0019?\u0019|b_%\u0000ff_>\u0013xwJv";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 118;
                    str = "\u0019>\u001dasM%\u001d{(";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 119;
                    str = "\u0019(\u0007gsM%\u001d{(";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 120;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016/\u001d{tP+\u0007gw\u0019*\u0000t\u007f\\l\u0011z|O)\u0000awKl\u0014g}TvZ";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 121;
                    str = "\u0019*\u0000t\u007f\\?H";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    i2 = 122;
                    str = "\u0019?\u0007ebV>\u0006||^l";
                    i = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i2] = str;
                    i2 = 123;
                    str = "\u0019(\u0017v}])\u0000Wg_*\u0017g[W*\u001d;bK)\u0001p|M-\u0006|}W\u0018\u001bxwl?H";
                    i = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i2] = str;
                    i2 = 124;
                    str = "Z>\u001de?M#\u0002";
                    i = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i2] = str;
                    i2 = 125;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016\"\u001da2Xl\u0004|v\\#Rs{U)";
                    i = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i2] = str;
                    i2 = 126;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005aM#\u0002ew]";
                    i = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i2] = str;
                    i2 = 127;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016*\u001dgq\\l\u0014gsT)Rq{T)\u001cf{V\"\u00015tV>Rx}M#\u0000z~Xl\u0006z2";
                    i = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i2] = str;
                    i2 = 128;
                    str = "\u0019?\u001bow\u0003";
                    i = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i2] = str;
                    i2 = 129;
                    str = "\u00198\u001d/";
                    i = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i2] = str;
                    i2 = 130;
                    str = "v\u0001*;y\nb\u0004|v\\#\\p|Z#\u0016p`\u0017-\u0004v";
                    i = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i2] = str;
                    i2 = 131;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005aM#\u0002ew]";
                    i = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i2] = str;
                    i2 = 132;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016\"\u001d5yW#\u0005{2Z#\u001ez`\u0019*\u001dg\u007fX8\u00015aL<\u001dgf\\(";
                    i = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i2] = str;
                    i2 = 133;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005vK-\u001b{w]";
                    i = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i2] = str;
                    i2 = 134;
                    str = "~\u0018_[%\t|B";
                    i = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i2] = str;
                    i2 = 135;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u0000:fK5R";
                    i = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i2] = str;
                    i2 = 136;
                    str = "\u0019*\u001dg\u007fX8H";
                    i = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i2] = str;
                    i2 = 137;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u0000:`\\ \u0017ta\\c\u001d`fI9\u0006";
                    i = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i2] = str;
                    i2 = 138;
                    str = "z-\u001c2f\u0019/\u0000psM)RqwZ#\u0016p`\u0019*\u001dg2";
                    i = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i2] = str;
                    i2 = 139;
                    str = "\u0019%\u00015}R";
                    i = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i2] = str;
                    i2 = 140;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u001d{w\u0019/\u0013{q\\ \u001epv\u0003";
                    i = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i2] = str;
                    i2 = 141;
                    str = "\u00198\u001bxw\u0003";
                    i = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i2] = str;
                    i2 = 142;
                    str = "O%\u0016p}";
                    i = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i2] = str;
                    i2 = 143;
                    str = "v\u0001*;{M8\u001bt\u007f\u0017:\u001bqwVb\u0016pqV(\u0017g<X:\u0011";
                    i = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i2] = str;
                    i2 = 144;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\na`X/\u0006z`\u0019>\u0017ywX?\u0017q";
                    i = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i2] = str;
                    i2 = 145;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005qV \u001dg2_#\u0000xsMl\u0014z`\u0019\u0004\u0007t{N)\u001b5{Jl@$!\t{B#$\u0001t";
                    i = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i2] = str;
                    i2 = 146;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016(\u0017v}])\u00005qV\"\u0014|uL>\u0017q";
                    i = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i2] = str;
                    i2 = 147;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u0016(\u0017v}])\u0000:cL)\u0007p=P\"\u0002`f\u0019";
                    i = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i2] = str;
                    i2 = 148;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005`\\ \u0017ta\\(";
                    i = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i2] = str;
                    i2 = 149;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016\"\u001d5qV(\u0017v2J9\u0002e}K8\u001b{u\u0019:\u001bqwVc\u0013cq";
                    i = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i2] = str;
                    i2 = 150;
                    str = "o%\u0016p}m>\u0013{aZ#\u0016p`f8\u0000t|J/\u001dqwo%\u0016p}";
                    i = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i2] = str;
                    i2 = 151;
                    str = "\u0019*\u001dg2v\u0001*;A|\u000f\\tdZb\u0017{q";
                    i = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i2] = str;
                    i2 = 152;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\na`X/\u0006z`\u0019>\u0017ywX?\u0017q";
                    i = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i2] = str;
                    i2 = 153;
                    str = "J8\u0000|v\\";
                    i = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i2] = str;
                    i2 = 154;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016?\u0017py\u00198\u001d/";
                    i = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i2] = str;
                    i2 = 155;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016/\u001d{d\\>\u0006pv";
                    i = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i2] = str;
                    i2 = 156;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016)\u001cv}])\u00005aM#\u0002ew]";
                    i = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i2] = str;
                    i2 = 157;
                    str = "T%\u001fp";
                    i = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i2] = str;
                    i2 = 158;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u00168\u0000t|J/\u001dqw\u0016/\u0013{5Ml\u0011gwX8\u00175v\\/\u001dqwKl\u0014z`\u0019";
                    i = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i2] = str;
                    i2 = 159;
                    str = "O%\u0016p}\u00169\u001c~|V;\u001c";
                    i = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i2] = str;
                    i2 = 160;
                    str = "\u0019(\u0017v}])\u0000Wg_*\u0017g[W*\u001d;tU-\u0015f(";
                    i = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i2] = str;
                    i2 = 161;
                    str = "]9\u0000tfP#\u001c@a";
                    i = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i2] = str;
                    i2 = 162;
                    str = "v\u0001*;Amb$S_\u0017\u0004@#&|\"\u0011";
                    i = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i2] = str;
                    i2 = 163;
                    str = "v\u0001*;_x\u001e$P^ub$\\V|\u0003\\] \u000fx7[Qv\b7G";
                    i = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i2] = str;
                    i2 = 164;
                    str = "v\u0001*;WA5\u001cza\u0017-\u0004v<\\\"\u0011";
                    i = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i2] = str;
                    i2 = 165;
                    str = "v\u0001*;_x\u001e$P^ub$\\V|\u0003\\]E\u0017\u000f=QS\u000eyF'Ww\u000f=QWk";
                    i = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i2] = str;
                    i2 = 166;
                    str = "v\u0001*;uV#\u0015yw\u0017$@#&\u0017)\u001cv}])\u0000";
                    i = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i2] = str;
                    i2 = 167;
                    str = "\u0017-\u0013v";
                    i = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i2] = str;
                    i2 = 168;
                    str = "\u0019%\u00015|V8R|aVl\u0010ta\\l\u001fpvP-Rv}W8\u0013||\\>";
                    i = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i2] = str;
                    i2 = 169;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u0016%\u0001|aV!\u0017q{Xc";
                    i = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i2] = str;
                    i2 = 170;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u0016%\u0001|aV!\u0017q{Xc";
                    i = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i2] = str;
                    i2 = 171;
                    str = "T9\n";
                    i = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i2] = str;
                    i2 = 172;
                    str = "o%\u0016p}m>\u0013{aZ#\u0016p`f8\u0000t|J/\u001dqw";
                    i = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i2] = str;
                    i2 = 173;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016pcL)\u0007p=U%\u0010xb\r!\u0007mwA/\u0017efP#\u001c";
                    i = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i2] = str;
                    i2 = 174;
                    str = "\u0017$@#&";
                    i = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i2] = str;
                    i2 = 175;
                    str = "v\u0001*;[W8\u0017y<o%\u0016p}|\"\u0011zv\\>\\TDz";
                    i = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i2] = str;
                    i2 = 176;
                    str = "\u0016?\u000bff\\!]w{Wc\u0015pfI>\u001de";
                    i = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i2] = str;
                    i2 = 177;
                    str = "^)\u0006fkJ8\u0017xbK#\u0002p`M5]";
                    i = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i2] = str;
                    i2 = 178;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u0016%\u0001a`X\"\u0001v}])\u0001`bI#\u0000aw]c\u0007{aL<\u0002z`M)\u00165\u007fV(\u0017y2";
                    i = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i2] = str;
                    i2 = 179;
                    str = "~\u0018_F$\n}@";
                    i = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i2] = str;
                    i2 = 180;
                    str = "v\u0001*;_m\u0007\\C[}\t=;Ww\u000f=QWkb3CQ";
                    i = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i2] = str;
                    i2 = 181;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u0016%\u0001a`X\"\u0001v}])\u0001`bI#\u0000aw]c\u0010zsK(]";
                    i = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i2] = str;
                    i2 = 182;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u0016%\u0001a`X\"\u0001v}])\u0001`bI#\u0000aw]c\u001c`\u007f[)\u00005}_l\u0011zv\\/\u0001/2";
                    i = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i2] = str;
                    i2 = 183;
                    str = "j\u0001_R!\u0001z4";
                    i = 182;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i2] = str;
                    i2 = 184;
                    str = "~\u0018_F$\n}B";
                    i = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i2] = str;
                    i2 = 185;
                    str = "~\u0018_F%\u000b{A";
                    i = 184;
                    strArr2 = strArr3;
                    break;
                case 184:
                    strArr2[i2] = str;
                    i2 = 186;
                    str = "J-\u001ffgW+";
                    i = 185;
                    strArr2 = strArr3;
                    break;
                case 185:
                    strArr2[i2] = str;
                    i2 = 187;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u0016%\u0001a`X\"\u0001v}])\u0001`bI#\u0000aw]c\u001cz2\\\"\u0011zv\\>Rs}L\"\u0016";
                    i = 186;
                    strArr2 = strArr3;
                    break;
                case 186:
                    strArr2[i2] = str;
                    i2 = 188;
                    str = "~\u0018_F$\n}A";
                    i = 187;
                    strArr2 = strArr3;
                    break;
                case 187:
                    strArr2[i2] = str;
                    i2 = 189;
                    str = "~\u0018_\\*\u000bzB";
                    i = 188;
                    strArr2 = strArr3;
                    break;
                case 188:
                    strArr2[i2] = str;
                    i2 = 190;
                    str = "~\u0018_F%\u000b{G";
                    i = 189;
                    strArr2 = strArr3;
                    break;
                case 189:
                    strArr2[i2] = str;
                    i2 = 191;
                    str = "~\u0018_F%\u000b{@";
                    i = 190;
                    strArr2 = strArr3;
                    break;
                case 190:
                    strArr2[i2] = str;
                    i2 = 192;
                    str = "\u007f\u001fG%&";
                    i = 191;
                    strArr2 = strArr3;
                    break;
                case 191:
                    strArr2[i2] = str;
                    i2 = 193;
                    str = "[=-TcL-\u0000|a\f";
                    i = 192;
                    strArr2 = strArr3;
                    break;
                case 192:
                    strArr2[i2] = str;
                    i2 = 194;
                    str = "~\u0018_\\+\b|BR";
                    i = 193;
                    strArr2 = strArr3;
                    break;
                case 193:
                    strArr2[i2] = str;
                    i2 = 195;
                    str = "~\u0018_E!\b}A";
                    i = 194;
                    strArr2 = strArr3;
                    break;
                case 194:
                    strArr2[i2] = str;
                    i2 = 196;
                    str = "~\u0018_E'\b}A";
                    i = 195;
                    strArr2 = strArr3;
                    break;
                case 195:
                    strArr2[i2] = str;
                    i2 = 197;
                    str = "~\u0018_E'\b|B";
                    i = 196;
                    strArr2 = strArr3;
                    break;
                case 196:
                    strArr2[i2] = str;
                    i2 = 198;
                    str = "~\u0018_\\*\u000bz@";
                    i = 197;
                    strArr2 = strArr3;
                    break;
                case 197:
                    strArr2[i2] = str;
                    i2 = 199;
                    str = "O%\u0016p}M>\u0013{aZ#\u0016p`\u0016%\u0001a`X\"\u0001v}])\u0001`bI#\u0000aw]c\u0014zgW(R";
                    i = 198;
                    strArr2 = strArr3;
                    break;
                case 198:
                    strArr2[i2] = str;
                    i2 = 200;
                    str = "~\u0018_\\*\fyB";
                    i = 199;
                    strArr2 = strArr3;
                    break;
                case 199:
                    strArr2[i2] = str;
                    i2 = 201;
                    str = "~\u0018_E'\b}B";
                    i = 200;
                    strArr2 = strArr3;
                    break;
                case 200:
                    strArr2[i2] = str;
                    i2 = 202;
                    str = "~\u0018_\\*\fy@";
                    i = 201;
                    strArr2 = strArr3;
                    break;
                case 201:
                    strArr2[i2] = str;
                    i2 = 203;
                    str = "~\u0018_E!\b}B";
                    i = 202;
                    strArr2 = strArr3;
                    break;
                case 202:
                    strArr2[i2] = str;
                    i2 = 204;
                    str = "[=";
                    i = 203;
                    strArr2 = strArr3;
                    break;
                case 203:
                    strArr2[i2] = str;
                    i2 = 205;
                    str = "K#\\w}X>\u0016;bU-\u0006s}K!";
                    i = 204;
                    strArr2 = strArr3;
                    break;
                case 204:
                    strArr2[i2] = str;
                    i2 = 206;
                    str = "K#\\xw]%\u0013awRb\u0002ysM*\u001dg\u007f";
                    i = 205;
                    strArr2 = strArr3;
                    break;
                case 205:
                    strArr2[i2] = str;
                    i2 = 207;
                    str = "\u007f \u000b";
                    i = 206;
                    strArr2 = strArr3;
                    break;
                case 206:
                    strArr2[i2] = str;
                    i2 = 208;
                    str = "O%\u0016p}\u0016-\u0004v";
                    i = 207;
                    strArr2 = strArr3;
                    break;
                case 207:
                    strArr2[i2] = str;
                    i2 = 209;
                    str = "~\u0018_E!\b|B";
                    i = 208;
                    strArr2 = strArr3;
                    break;
                case 208:
                    strArr2[i2] = str;
                    i2 = 210;
                    str = "J-\u001ffgW+";
                    i = 209;
                    strArr2 = strArr3;
                    break;
                case 209:
                    strArr2[i2] = str;
                    i2 = 211;
                    str = "~\u0018_F%\u000b{B";
                    i = 210;
                    strArr2 = strArr3;
                    break;
                case 210:
                    strArr2[i2] = str;
                    i2 = 212;
                    str = "J-\u001ffgW+";
                    i = 211;
                    strArr2 = strArr3;
                    break;
                case 211:
                    strArr2[i2] = str;
                    i2 = 213;
                    str = "v\u0001*;WA5\u001cza\u0017\r$V<|\"\u0011zv\\>";
                    i = 212;
                    strArr2 = strArr3;
                    break;
                case 212:
                    strArr2[i2] = str;
                    i2 = 214;
                    str = "v\u0001*;A|\u000f\\tdZb\u0017{q";
                    i = 213;
                    strArr2 = strArr3;
                    break;
                case 213:
                    strArr2[i2] = str;
                    i2 = 215;
                    str = "M%\u001fpTK#\u001f/";
                    i = 214;
                    strArr2 = strArr3;
                    break;
                case 214:
                    strArr2[i2] = str;
                    i2 = 216;
                    str = "\u00198\u001bxwm#H";
                    i = 215;
                    strArr2 = strArr3;
                    break;
                case 215:
                    strArr2[i2] = str;
                    z = strArr3;
                    b = new byte[]{(byte) 102, (byte) 116, (byte) 121, (byte) 112};
                    return;
                default:
                    strArr2[i2] = str;
                    i2 = 1;
                    strArr2 = strArr3;
                    str = "M>\u001bx";
                    i = 0;
                    break;
            }
        }
    }

    public static boolean d(File file) {
        return g();
    }

    private static boolean b(String str) {
        try {
            if (!a(str)) {
                if (!z[175].equals(str)) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public akr(File file, File file2, long j, long j2) {
        this.f = 640;
        this.d = 3.0f;
        this.a = file;
        this.m = file2;
        this.h = j;
        this.g = j2;
        if (j >= 0 && j2 > 0 && j == j2) {
            try {
                throw new IllegalArgumentException(z[215] + j + z[216] + j2);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public void a(x5 x5Var) {
        this.i = x5Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d(java.lang.String r8) {
        /*
        r2 = com.whatsapp.DialogToastActivity.f;
        r1 = "";
        r0 = new java.lang.ProcessBuilder;	 Catch:{ IOException -> 0x0042 }
        r3 = 2;
        r3 = new java.lang.String[r3];	 Catch:{ IOException -> 0x0042 }
        r4 = 0;
        r5 = z;	 Catch:{ IOException -> 0x0042 }
        r6 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0042 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x0042 }
        r4 = 1;
        r3[r4] = r8;	 Catch:{ IOException -> 0x0042 }
        r0.<init>(r3);	 Catch:{ IOException -> 0x0042 }
        r3 = 1;
        r0 = r0.redirectErrorStream(r3);	 Catch:{ IOException -> 0x0042 }
        r3 = r0.start();	 Catch:{ IOException -> 0x0042 }
        r4 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x0042 }
        r0 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x0042 }
        r5 = r3.getInputStream();	 Catch:{ IOException -> 0x0042 }
        r0.<init>(r5);	 Catch:{ IOException -> 0x0042 }
        r4.<init>(r0);	 Catch:{ IOException -> 0x0042 }
        r0 = "";
    L_0x0033:
        r0 = r4.readLine();	 Catch:{ IOException -> 0x0042 }
        if (r0 == 0) goto L_0x0065;
    L_0x0039:
        if (r2 == 0) goto L_0x0063;
    L_0x003b:
        r4.close();	 Catch:{ IOException -> 0x0061 }
        r3.destroy();	 Catch:{ IOException -> 0x0061 }
    L_0x0041:
        return r0;
    L_0x0042:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
    L_0x0046:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x0041;
    L_0x0061:
        r1 = move-exception;
        goto L_0x0046;
    L_0x0063:
        r1 = r0;
        goto L_0x0033;
    L_0x0065:
        r0 = r1;
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.akr.d(java.lang.String):java.lang.String");
    }

    public void c() {
        ce b = tp.b(z[172]);
        b.e();
        this.c = new File(this.m.getAbsoluteFile() + z[174]);
        try {
            d();
            if (!this.k) {
                if (!a(this.a)) {
                    f();
                }
            }
            if (!this.k) {
                long j = 30000;
                if (this.j > 0) {
                    j = (1000000000 * this.l) / this.j;
                }
                try {
                    File file;
                    Object obj = (this.o == null || this.o.exists()) ? null : 1;
                    if (obj != null) {
                        file = null;
                    } else {
                        file = this.a;
                    }
                    try {
                        File file2;
                        File file3 = this.m;
                        if (obj != null) {
                            file2 = null;
                        } else {
                            file2 = this.o;
                        }
                        Mp4Ops.a(file, file3, file2, this.c, this.h, j, this.j / 1000);
                        Mp4Ops.a(this.m, true);
                    } catch (at_ e) {
                        throw e;
                    } catch (at_ e2) {
                        Log.b(z[173], (Throwable) e2);
                        Mp4Ops.a(this.a, e2, z[171]);
                        throw e2;
                    }
                } catch (at_ e22) {
                    throw e22;
                } catch (at_ e222) {
                    throw e222;
                }
            }
            try {
                this.c.delete();
                if (this.o != null) {
                    this.o.delete();
                }
                try {
                    if (this.k) {
                        this.m.delete();
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    }
                    b.d();
                } catch (at_ e2222) {
                    throw e2222;
                } catch (at_ e22222) {
                    throw e22222;
                }
            } catch (at_ e222222) {
                throw e222222;
            }
        } catch (at_ e2222222) {
            throw e2222222;
        } catch (Throwable th) {
            try {
                this.c.delete();
                if (this.o != null) {
                    this.o.delete();
                }
            } catch (at_ e22222222) {
                throw e22222222;
            }
        }
    }

    private static boolean a(String str) {
        try {
            if (!z[214].equals(str)) {
                if (!z[213].equals(str)) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static boolean b(File file) {
        try {
            if (VERSION.SDK_INT < 9) {
                return false;
            }
            return a(file);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void b() {
        this.k = true;
    }

    public static boolean c(File file) {
        try {
            if (!b(file)) {
                if (!d(file)) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void a() {
        try {
            Mp4Ops.a(this.a, this.m, this.h, this.g);
            Mp4Ops.a(this.m, true);
        } catch (at_ e) {
            Log.b(z[0], (Throwable) e);
            Mp4Ops.a(this.a, e, z[1]);
            throw e;
        }
    }

    public static boolean a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[4];
            fileInputStream.skip(4);
            fileInputStream.read(bArr);
            fileInputStream.close();
            if (Arrays.equals(bArr, b)) {
                return true;
            }
            Log.w(z[170] + file.getAbsolutePath() + z[168]);
            return false;
        } catch (IOException e) {
            Log.w(z[169] + e.toString());
            return false;
        }
    }

    private void f() {
        this.o = new File(this.m.getAbsoluteFile() + z[167]);
        mn a = new mb(this.a, this.o).b(this.h).a(this.g).a(96000).a();
        a.a(new aaw(this));
        a.d();
    }

    private void d() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Iterative traversal limit reached, method: com.whatsapp.akr.d():void
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r44 = this;
        r32 = com.whatsapp.DialogToastActivity.f;
        r2 = z;
        r3 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r2 = r2[r3];
        r33 = com.whatsapp.tp.b(r2);
        r33.e();
        r2 = 0;
        r0 = r44;
        r0.j = r2;
        r2 = 0;
        r0 = r44;
        r0.l = r2;
        r2 = new com.whatsapp.util.a4;
        r0 = r44;
        r3 = r0.a;
        r2.<init>(r3);
        r5 = r2.a();
        r3 = r2.d();
        r4 = r2.e();
        r2 = r2.f();
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 53;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r0 = r44;
        r7 = r0.a;
        r7 = r7.getAbsolutePath();
        r6 = r6.append(r7);
        r7 = z;
        r8 = 43;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r0 = r44;
        r7 = r0.a;
        r8 = r7.length();
        r6 = r6.append(r8);
        r7 = z;
        r8 = 17;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r4 = r6.append(r4);
        r6 = z;
        r7 = 60;
        r6 = r6[r7];
        r4 = r4.append(r6);
        r4 = r4.append(r5);
        r6 = "x";
        r4 = r4.append(r6);
        r4 = r4.append(r3);
        r6 = z;
        r7 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r6 = r6[r7];
        r4 = r4.append(r6);
        r2 = r4.append(r2);
        r4 = z;
        r6 = 47;
        r4 = r4[r6];
        r2 = r2.append(r4);
        r0 = r44;
        r6 = r0.h;
        r2 = r2.append(r6);
        r4 = z;
        r6 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r4 = r4[r6];
        r2 = r2.append(r4);
        r0 = r44;
        r6 = r0.g;
        r2 = r2.append(r6);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        if (r5 <= r3) goto L_0x122e;
    L_0x00c7:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x016c }
        r2 = r0.f;	 Catch:{ IllegalStateException -> 0x016c }
        if (r5 <= r2) goto L_0x122a;
    L_0x00cd:
        r0 = r44;
        r4 = r0.f;
        r2 = r3 * r4;
        r2 = r2 / r5;
        if (r32 == 0) goto L_0x1227;
    L_0x00d6:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x016e }
        r6 = r0.f;	 Catch:{ IllegalStateException -> 0x016e }
        if (r2 <= r6) goto L_0x1227;
    L_0x00dc:
        r0 = r44;
        r2 = r0.f;
        r4 = r5 * r2;
        r3 = r4 / r3;
    L_0x00e4:
        r4 = r3 * r2;
        r4 = (float) r4;
        r0 = r44;
        r5 = r0.d;
        r4 = r4 * r5;
        r9 = (int) r4;
        r11 = 30;
        r12 = android.media.MediaCodecList.getCodecCount();
        r6 = 0;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r7 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r5 = r5[r7];
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = 0;
        r7 = r4;
    L_0x0110:
        if (r7 >= r12) goto L_0x121f;
    L_0x0112:
        if (r6 != 0) goto L_0x121f;
    L_0x0114:
        r8 = android.media.MediaCodecList.getCodecInfoAt(r7);
        r4 = r8.isEncoder();	 Catch:{ IllegalStateException -> 0x0170 }
        if (r4 != 0) goto L_0x0120;
    L_0x011e:
        if (r32 == 0) goto L_0x121c;
    L_0x0120:
        r4 = r8.getName();	 Catch:{ IllegalStateException -> 0x0172 }
        r4 = c(r4);	 Catch:{ IllegalStateException -> 0x0172 }
        if (r4 != 0) goto L_0x012c;
    L_0x012a:
        if (r32 == 0) goto L_0x121c;
    L_0x012c:
        r10 = r8.getSupportedTypes();
        r5 = 0;
        r4 = 0;
    L_0x0132:
        r13 = r10.length;
        if (r4 >= r13) goto L_0x014a;
    L_0x0135:
        if (r5 != 0) goto L_0x014a;
    L_0x0137:
        r13 = r10[r4];	 Catch:{ IllegalStateException -> 0x0176 }
        r14 = z;	 Catch:{ IllegalStateException -> 0x0176 }
        r15 = 42;	 Catch:{ IllegalStateException -> 0x0176 }
        r14 = r14[r15];	 Catch:{ IllegalStateException -> 0x0176 }
        r13 = r13.equals(r14);	 Catch:{ IllegalStateException -> 0x0176 }
        if (r13 == 0) goto L_0x0146;
    L_0x0145:
        r5 = 1;
    L_0x0146:
        r4 = r4 + 1;
        if (r32 == 0) goto L_0x0132;
    L_0x014a:
        if (r5 == 0) goto L_0x121c;
    L_0x014c:
        r4 = r8;
    L_0x014d:
        r5 = r7 + 1;
        if (r32 == 0) goto L_0x1223;
    L_0x0151:
        r31 = r4;
    L_0x0153:
        if (r31 != 0) goto L_0x0178;
    L_0x0155:
        r2 = z;	 Catch:{ IllegalStateException -> 0x016a }
        r3 = 149; // 0x95 float:2.09E-43 double:7.36E-322;	 Catch:{ IllegalStateException -> 0x016a }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x016a }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x016a }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IllegalStateException -> 0x016a }
        r3 = z;	 Catch:{ IllegalStateException -> 0x016a }
        r4 = 31;	 Catch:{ IllegalStateException -> 0x016a }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x016a }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x016a }
        throw r2;	 Catch:{ IllegalStateException -> 0x016a }
    L_0x016a:
        r2 = move-exception;
        throw r2;
    L_0x016c:
        r2 = move-exception;
        throw r2;
    L_0x016e:
        r2 = move-exception;
        throw r2;
    L_0x0170:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0172 }
    L_0x0172:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0174 }
    L_0x0174:
        r2 = move-exception;
        throw r2;
    L_0x0176:
        r2 = move-exception;
        throw r2;
    L_0x0178:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 46;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = r31.getName();
        r4 = r4.append(r5);
        r5 = z;
        r6 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = z;
        r6 = 45;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r5 = 0;
        r4 = z;
        r6 = 62;
        r4 = r4[r6];
        r0 = r31;
        r7 = r0.getCapabilitiesForType(r4);
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0247 }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x0247 }
        r6 = z;	 Catch:{ IllegalStateException -> 0x0247 }
        r8 = 3;	 Catch:{ IllegalStateException -> 0x0247 }
        r6 = r6[r8];	 Catch:{ IllegalStateException -> 0x0247 }
        r4 = r4.append(r6);	 Catch:{ IllegalStateException -> 0x0247 }
        r6 = r7.colorFormats;	 Catch:{ IllegalStateException -> 0x0247 }
        r6 = r6.length;	 Catch:{ IllegalStateException -> 0x0247 }
        r4 = r4.append(r6);	 Catch:{ IllegalStateException -> 0x0247 }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x0247 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IllegalStateException -> 0x0247 }
        r4 = e;	 Catch:{ IllegalStateException -> 0x0247 }
        if (r4 == 0) goto L_0x0200;	 Catch:{ IllegalStateException -> 0x0247 }
    L_0x01d7:
        r4 = e;	 Catch:{ IllegalStateException -> 0x0247 }
        r4 = r4.toLowerCase();	 Catch:{ IllegalStateException -> 0x0247 }
        r6 = z;	 Catch:{ IllegalStateException -> 0x0247 }
        r8 = 2;	 Catch:{ IllegalStateException -> 0x0247 }
        r6 = r6[r8];	 Catch:{ IllegalStateException -> 0x0247 }
        r4 = r4.startsWith(r6);	 Catch:{ IllegalStateException -> 0x0247 }
        if (r4 == 0) goto L_0x0200;
    L_0x01e8:
        r4 = 0;
    L_0x01e9:
        r6 = r7.colorFormats;
        r6 = r6.length;
        if (r4 >= r6) goto L_0x0200;
    L_0x01ee:
        if (r5 != 0) goto L_0x0200;
    L_0x01f0:
        r6 = r7.colorFormats;	 Catch:{ IllegalStateException -> 0x0249 }
        r6 = r6[r4];	 Catch:{ IllegalStateException -> 0x0249 }
        r8 = 2130706944; // 0x7f000200 float:1.7015157E38 double:1.0527091024E-314;
        if (r6 != r8) goto L_0x01fc;
    L_0x01f9:
        r5 = 2130706944; // 0x7f000200 float:1.7015157E38 double:1.0527091024E-314;
    L_0x01fc:
        r4 = r4 + 1;
        if (r32 == 0) goto L_0x01e9;
    L_0x0200:
        r4 = 0;
    L_0x0201:
        r6 = r7.colorFormats;
        r6 = r6.length;
        if (r4 >= r6) goto L_0x022d;
    L_0x0206:
        if (r5 != 0) goto L_0x022d;
    L_0x0208:
        r6 = r7.colorFormats;
        r6 = r6[r4];
        switch(r6) {
            case 19: goto L_0x024b;
            case 20: goto L_0x024b;
            case 21: goto L_0x024b;
            case 39: goto L_0x024b;
            case 2130706688: goto L_0x024b;
            default: goto L_0x020f;
        };
    L_0x020f:
        r8 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x028f }
        r8.<init>();	 Catch:{ IllegalStateException -> 0x028f }
        r10 = z;	 Catch:{ IllegalStateException -> 0x028f }
        r13 = 102; // 0x66 float:1.43E-43 double:5.04E-322;	 Catch:{ IllegalStateException -> 0x028f }
        r10 = r10[r13];	 Catch:{ IllegalStateException -> 0x028f }
        r8 = r8.append(r10);	 Catch:{ IllegalStateException -> 0x028f }
        r6 = r8.append(r6);	 Catch:{ IllegalStateException -> 0x028f }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x028f }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x028f }
    L_0x0229:
        r4 = r4 + 1;
        if (r32 == 0) goto L_0x0201;
    L_0x022d:
        r10 = r5;
        if (r10 != 0) goto L_0x0291;
    L_0x0230:
        r2 = z;	 Catch:{ IllegalStateException -> 0x0245 }
        r3 = 132; // 0x84 float:1.85E-43 double:6.5E-322;	 Catch:{ IllegalStateException -> 0x0245 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0245 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0245 }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IllegalStateException -> 0x0245 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0245 }
        r4 = 12;	 Catch:{ IllegalStateException -> 0x0245 }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0245 }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x0245 }
        throw r2;	 Catch:{ IllegalStateException -> 0x0245 }
    L_0x0245:
        r2 = move-exception;
        throw r2;
    L_0x0247:
        r2 = move-exception;
        throw r2;
    L_0x0249:
        r2 = move-exception;
        throw r2;
    L_0x024b:
        r8 = z;	 Catch:{ IllegalStateException -> 0x0289 }
        r10 = 75;	 Catch:{ IllegalStateException -> 0x0289 }
        r8 = r8[r10];	 Catch:{ IllegalStateException -> 0x0289 }
        r10 = r31.getName();	 Catch:{ IllegalStateException -> 0x0289 }
        r8 = r8.equals(r10);	 Catch:{ IllegalStateException -> 0x0289 }
        if (r8 == 0) goto L_0x025f;
    L_0x025b:
        r8 = 19;
        if (r6 == r8) goto L_0x0262;
    L_0x025f:
        if (r32 == 0) goto L_0x1219;
    L_0x0261:
        r5 = r6;
    L_0x0262:
        r8 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x028d }
        r8.<init>();	 Catch:{ IllegalStateException -> 0x028d }
        r10 = z;	 Catch:{ IllegalStateException -> 0x028d }
        r13 = 66;	 Catch:{ IllegalStateException -> 0x028d }
        r10 = r10[r13];	 Catch:{ IllegalStateException -> 0x028d }
        r8 = r8.append(r10);	 Catch:{ IllegalStateException -> 0x028d }
        r8 = r8.append(r6);	 Catch:{ IllegalStateException -> 0x028d }
        r10 = z;	 Catch:{ IllegalStateException -> 0x028d }
        r13 = 151; // 0x97 float:2.12E-43 double:7.46E-322;	 Catch:{ IllegalStateException -> 0x028d }
        r10 = r10[r13];	 Catch:{ IllegalStateException -> 0x028d }
        r8 = r8.append(r10);	 Catch:{ IllegalStateException -> 0x028d }
        r8 = r8.toString();	 Catch:{ IllegalStateException -> 0x028d }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IllegalStateException -> 0x028d }
        if (r32 == 0) goto L_0x0229;
    L_0x0288:
        goto L_0x020f;
    L_0x0289:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x028b }
    L_0x028b:
        r2 = move-exception;
        throw r2;
    L_0x028d:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x028f }
    L_0x028f:
        r2 = move-exception;
        throw r2;
    L_0x0291:
        r4 = r31.getName();
        r5 = z;
        r6 = 58;
        r5 = r5[r6];
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x02ab;
    L_0x02a1:
        r2 = r2 + 15;
        r2 = r2 & -32;
        r3 = r3 + 15;
        r3 = r3 & -32;
        if (r32 == 0) goto L_0x1215;
    L_0x02ab:
        r2 = r2 + 7;
        r5 = r2 & -16;
        r2 = r3 + 7;
        r4 = r2 & -16;
    L_0x02b3:
        r2 = r31.getName();	 Catch:{ IllegalStateException -> 0x051f }
        r3 = z;	 Catch:{ IllegalStateException -> 0x051f }
        r6 = 14;	 Catch:{ IllegalStateException -> 0x051f }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x051f }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x051f }
        if (r2 == 0) goto L_0x0327;	 Catch:{ IllegalStateException -> 0x051f }
    L_0x02c3:
        r2 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalStateException -> 0x051f }
        r3 = z;	 Catch:{ IllegalStateException -> 0x051f }
        r6 = 38;	 Catch:{ IllegalStateException -> 0x051f }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x051f }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x051f }
        if (r2 == 0) goto L_0x0327;
    L_0x02d1:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0521 }
        r3 = 18;
        if (r2 >= r3) goto L_0x0327;
    L_0x02d7:
        r2 = r4 * r5;
        r3 = 306176; // 0x4ac00 float:4.29044E-40 double:1.51271E-318;
        if (r2 <= r3) goto L_0x0327;
    L_0x02de:
        r2 = 4689003676092596224; // 0x4112b00000000000 float:0.0 double:306176.0;
        r6 = r4 * r5;
        r6 = (double) r6;
        r2 = r2 / r6;
        r2 = java.lang.Math.sqrt(r2);
        r6 = (double) r4;
        r2 = r2 * r6;
        r2 = (int) r2;
        r6 = 4689003676092596224; // 0x4112b00000000000 float:0.0 double:306176.0;
        r3 = r4 * r5;
        r14 = (double) r3;
        r6 = r6 / r14;
        r6 = java.lang.Math.sqrt(r6);
        r4 = (double) r5;
        r4 = r4 * r6;
        r3 = (int) r4;
        r4 = r2 & -16;
        r5 = r3 & -8;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r6 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r2 = r2.append(r4);
        r3 = "x";
        r2 = r2.append(r3);
        r2 = r2.append(r5);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
    L_0x0327:
        r2 = r31.getName();
        r3 = z;
        r6 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r3 = r3[r6];
        r2 = r2.startsWith(r3);
        if (r2 == 0) goto L_0x1211;
    L_0x0337:
        r2 = r4 + 15;
        r2 = r2 / 16;
        r3 = r2 * 16;
        r2 = r5 + 15;
        r2 = r2 / 16;
        r2 = r2 * 16;
    L_0x0343:
        r6 = r3 / 2;
        r7 = r3 * r2;
        r6 = r6 * 2;
        r6 = r6 * r2;
        r6 = r6 / 2;
        r34 = r7 + r6;
        r6 = r31.getName();
        r35 = android.media.MediaCodec.createByCodecName(r6);
        r6 = z;
        r7 = 91;
        r6 = r6[r7];
        com.whatsapp.util.Log.i(r6);
        r6 = z;
        r7 = 97;
        r6 = r6[r7];
        r6 = android.media.MediaFormat.createVideoFormat(r6, r4, r5);
        r7 = z;	 Catch:{ IllegalStateException -> 0x0525 }
        r8 = 93;	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0525 }
        r6.setInteger(r7, r9);	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0525 }
        r8 = 88;	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0525 }
        r6.setInteger(r7, r11);	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0525 }
        r8 = 86;	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0525 }
        r6.setInteger(r7, r10);	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0525 }
        r8 = 84;	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0525 }
        r8 = 10;	 Catch:{ IllegalStateException -> 0x0525 }
        r6.setInteger(r7, r8);	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0525 }
        r8 = 153; // 0x99 float:2.14E-43 double:7.56E-322;	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0525 }
        r6.setInteger(r7, r3);	 Catch:{ IllegalStateException -> 0x0525 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = 7;	 Catch:{ IllegalStateException -> 0x0525 }
        r3 = r3[r7];	 Catch:{ IllegalStateException -> 0x0525 }
        r6.setInteger(r3, r2);	 Catch:{ IllegalStateException -> 0x0525 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0525 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0525 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = 63;	 Catch:{ IllegalStateException -> 0x0525 }
        r3 = r3[r7];	 Catch:{ IllegalStateException -> 0x0525 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0525 }
        r2 = r2.append(r6);	 Catch:{ IllegalStateException -> 0x0525 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0525 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0525 }
        r2 = 0;	 Catch:{ IllegalStateException -> 0x0525 }
        r3 = 0;	 Catch:{ IllegalStateException -> 0x0525 }
        r7 = 1;	 Catch:{ IllegalStateException -> 0x0525 }
        r0 = r35;	 Catch:{ IllegalStateException -> 0x0525 }
        r0.configure(r6, r2, r3, r7);	 Catch:{ IllegalStateException -> 0x0525 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0525 }
        r3 = 68;	 Catch:{ IllegalStateException -> 0x0525 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0525 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0525 }
        r35.start();	 Catch:{ IllegalStateException -> 0x0525 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0525 }
        r3 = 11;	 Catch:{ IllegalStateException -> 0x0525 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0525 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0525 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0525 }
        r3 = 16;
        if (r2 != r3) goto L_0x0437;
    L_0x03dd:
        r2 = 21;
        if (r10 != r2) goto L_0x0437;
    L_0x03e1:
        r2 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0527 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0527 }
        r6 = 134; // 0x86 float:1.88E-43 double:6.6E-322;	 Catch:{ IllegalStateException -> 0x0527 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x0527 }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x0527 }
        if (r2 != 0) goto L_0x0437;
    L_0x03ef:
        r2 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0529 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0529 }
        r6 = 18;	 Catch:{ IllegalStateException -> 0x0529 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x0529 }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x0529 }
        if (r2 != 0) goto L_0x0437;
    L_0x03fd:
        r2 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x052b }
        r3 = z;	 Catch:{ IllegalStateException -> 0x052b }
        r6 = 94;	 Catch:{ IllegalStateException -> 0x052b }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x052b }
        r2 = r2.startsWith(r3);	 Catch:{ IllegalStateException -> 0x052b }
        if (r2 != 0) goto L_0x0437;
    L_0x040b:
        r2 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x052d }
        r3 = z;	 Catch:{ IllegalStateException -> 0x052d }
        r6 = 48;	 Catch:{ IllegalStateException -> 0x052d }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x052d }
        r2 = r2.startsWith(r3);	 Catch:{ IllegalStateException -> 0x052d }
        if (r2 != 0) goto L_0x0437;
    L_0x0419:
        r2 = z;	 Catch:{ IllegalStateException -> 0x052f }
        r3 = 99;	 Catch:{ IllegalStateException -> 0x052f }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x052f }
        r3 = r31.getName();	 Catch:{ IllegalStateException -> 0x052f }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x052f }
        if (r2 == 0) goto L_0x0437;
    L_0x0429:
        r10 = 2141391872; // 0x7fa30c00 float:NaN double:1.057988158E-314;
        r2 = z;	 Catch:{ IllegalStateException -> 0x0531 }
        r3 = 115; // 0x73 float:1.61E-43 double:5.7E-322;	 Catch:{ IllegalStateException -> 0x0531 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0531 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0531 }
        if (r32 == 0) goto L_0x0463;	 Catch:{ IllegalStateException -> 0x0531 }
    L_0x0437:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0531 }
        r3 = 16;
        if (r2 == r3) goto L_0x0443;
    L_0x043d:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0533 }
        r3 = 17;
        if (r2 != r3) goto L_0x0463;
    L_0x0443:
        r2 = 21;
        if (r10 != r2) goto L_0x0463;
    L_0x0447:
        r2 = z;	 Catch:{ IllegalStateException -> 0x0537 }
        r3 = 130; // 0x82 float:1.82E-43 double:6.4E-322;	 Catch:{ IllegalStateException -> 0x0537 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0537 }
        r3 = r31.getName();	 Catch:{ IllegalStateException -> 0x0537 }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x0537 }
        if (r2 == 0) goto L_0x0463;
    L_0x0457:
        r10 = 2141391872; // 0x7fa30c00 float:NaN double:1.057988158E-314;
        r2 = z;
        r3 = 44;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
    L_0x0463:
        r36 = r35.getInputBuffers();
        r26 = r35.getOutputBuffers();
        r37 = new java.io.FileOutputStream;
        r0 = r44;
        r2 = r0.c;
        r0 = r37;
        r0.<init>(r2);
        r38 = r37.getChannel();
        r39 = new android.media.MediaExtractor;
        r39.<init>();
        r0 = r44;
        r2 = r0.a;
        r2 = r2.getAbsolutePath();
        r0 = r39;
        r0.setDataSource(r2);
        r6 = r39.getTrackCount();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r7 = 49;
        r3 = r3[r7];
        r2 = r2.append(r3);
        r2 = r2.append(r6);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r4 + -1;
        r2 = r4 + -1;
        r3 = -1;
        r2 = 0;
    L_0x04b0:
        if (r2 >= r6) goto L_0x120e;
    L_0x04b2:
        r0 = r39;
        r7 = r0.getTrackFormat(r2);
        r8 = z;
        r9 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r8 = r8[r9];
        r8 = r7.getString(r8);
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r11 = z;
        r13 = 76;
        r11 = r11[r13];
        r9 = r9.append(r11);
        r9 = r9.append(r2);
        r11 = z;
        r13 = 39;
        r11 = r11[r13];
        r9 = r9.append(r11);
        r9 = r9.append(r8);
        r11 = z;
        r13 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r11 = r11[r13];
        r9 = r9.append(r11);
        r7 = r9.append(r7);
        r7 = r7.toString();
        com.whatsapp.util.Log.i(r7);
        r7 = z;
        r9 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r7 = r7[r9];
        r7 = r8.startsWith(r7);
        if (r7 == 0) goto L_0x0507;
    L_0x0504:
        if (r32 == 0) goto L_0x050c;
    L_0x0506:
        r3 = r2;
    L_0x0507:
        r2 = r2 + 1;
        if (r32 == 0) goto L_0x04b0;
    L_0x050b:
        r2 = r3;
    L_0x050c:
        if (r2 >= 0) goto L_0x0539;
    L_0x050e:
        r2 = z;	 Catch:{ IllegalStateException -> 0x051d }
        r3 = 125; // 0x7d float:1.75E-43 double:6.2E-322;	 Catch:{ IllegalStateException -> 0x051d }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x051d }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x051d }
        r2 = new com.whatsapp.util.cq;	 Catch:{ IllegalStateException -> 0x051d }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x051d }
        throw r2;	 Catch:{ IllegalStateException -> 0x051d }
    L_0x051d:
        r2 = move-exception;
        throw r2;
    L_0x051f:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0521 }
    L_0x0521:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0523 }
    L_0x0523:
        r2 = move-exception;
        throw r2;
    L_0x0525:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0527 }
    L_0x0527:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0529 }
    L_0x0529:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x052b }
    L_0x052b:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x052d }
    L_0x052d:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x052f }
    L_0x052f:
        r2 = move-exception;
        throw r2;
    L_0x0531:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0533 }
    L_0x0533:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0535 }
    L_0x0535:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0537 }
    L_0x0537:
        r2 = move-exception;
        throw r2;
    L_0x0539:
        r0 = r39;
        r9 = r0.getTrackFormat(r2);
        r3 = z;
        r6 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r3 = r3[r6];
        r11 = r9.getString(r3);
        r3 = z;	 Catch:{ IllegalStateException -> 0x0575 }
        r6 = 159; // 0x9f float:2.23E-43 double:7.86E-322;	 Catch:{ IllegalStateException -> 0x0575 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x0575 }
        r3 = r3.equals(r11);	 Catch:{ IllegalStateException -> 0x0575 }
        if (r3 == 0) goto L_0x0577;	 Catch:{ IllegalStateException -> 0x0575 }
    L_0x0555:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0575 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0575 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0575 }
        r4 = 67;	 Catch:{ IllegalStateException -> 0x0575 }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0575 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0575 }
        r2 = r2.append(r11);	 Catch:{ IllegalStateException -> 0x0575 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0575 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x0575 }
        r2 = new com.whatsapp.util.cq;	 Catch:{ IllegalStateException -> 0x0575 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0575 }
        throw r2;	 Catch:{ IllegalStateException -> 0x0575 }
    L_0x0575:
        r2 = move-exception;
        throw r2;
    L_0x0577:
        r0 = r39;
        r0.selectTrack(r2);
        r2 = z;
        r3 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r2 = r2[r3];
        r28 = r9.getLong(r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r6 = 22;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r3 = r9.toString();
        r2 = r2.append(r3);
        r3 = z;
        r6 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r0 = r28;
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r6 = android.media.MediaCodec.createDecoderByType(r11);
        if (r6 != 0) goto L_0x05f3;
    L_0x05ba:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x05f1 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x05f1 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x05f1 }
        r4 = 158; // 0x9e float:2.21E-43 double:7.8E-322;	 Catch:{ IllegalStateException -> 0x05f1 }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x05f1 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x05f1 }
        r2 = r2.append(r11);	 Catch:{ IllegalStateException -> 0x05f1 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x05f1 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x05f1 }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IllegalStateException -> 0x05f1 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x05f1 }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x05f1 }
        r4 = z;	 Catch:{ IllegalStateException -> 0x05f1 }
        r5 = 138; // 0x8a float:1.93E-43 double:6.8E-322;	 Catch:{ IllegalStateException -> 0x05f1 }
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x05f1 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x05f1 }
        r3 = r3.append(r11);	 Catch:{ IllegalStateException -> 0x05f1 }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x05f1 }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x05f1 }
        throw r2;	 Catch:{ IllegalStateException -> 0x05f1 }
    L_0x05f1:
        r2 = move-exception;
        throw r2;
    L_0x05f3:
        r2 = z;
        r3 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0df9 }
        r7 = 17;	 Catch:{ IllegalStateException -> 0x0df9 }
        if (r3 != r7) goto L_0x120a;	 Catch:{ IllegalStateException -> 0x0df9 }
    L_0x0603:
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalStateException -> 0x0df9 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0df9 }
        r8 = 9;	 Catch:{ IllegalStateException -> 0x0df9 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0df9 }
        r3 = r3.equals(r7);	 Catch:{ IllegalStateException -> 0x0df9 }
        if (r3 == 0) goto L_0x0e03;
    L_0x0611:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0dfb }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0dfb }
        r8 = 34;	 Catch:{ IllegalStateException -> 0x0dfb }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0dfb }
        r3 = r3.startsWith(r7);	 Catch:{ IllegalStateException -> 0x0dfb }
        if (r3 != 0) goto L_0x0649;
    L_0x061f:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0dfd }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0dfd }
        r8 = 109; // 0x6d float:1.53E-43 double:5.4E-322;	 Catch:{ IllegalStateException -> 0x0dfd }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0dfd }
        r3 = r3.startsWith(r7);	 Catch:{ IllegalStateException -> 0x0dfd }
        if (r3 != 0) goto L_0x0649;
    L_0x062d:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0dff }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0dff }
        r8 = 56;	 Catch:{ IllegalStateException -> 0x0dff }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0dff }
        r3 = r3.startsWith(r7);	 Catch:{ IllegalStateException -> 0x0dff }
        if (r3 != 0) goto L_0x0649;
    L_0x063b:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0e01 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0e01 }
        r8 = 77;	 Catch:{ IllegalStateException -> 0x0e01 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0e01 }
        r3 = r3.startsWith(r7);	 Catch:{ IllegalStateException -> 0x0e01 }
        if (r3 == 0) goto L_0x120a;
    L_0x0649:
        r2 = new com.whatsapp.aiu;
        r2.<init>(r4, r5);
        r3 = z;
        r7 = 28;
        r3 = r3[r7];
        com.whatsapp.util.Log.i(r3);
        r30 = r2;
    L_0x0659:
        if (r30 != 0) goto L_0x0e2a;
    L_0x065b:
        r2 = 0;
    L_0x065c:
        r3 = 0;
        r7 = 0;
        r6.configure(r9, r2, r3, r7);	 Catch:{ IllegalStateException -> 0x0e30 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0e30 }
        r3 = 146; // 0x92 float:2.05E-43 double:7.2E-322;	 Catch:{ IllegalStateException -> 0x0e30 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0e30 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0e30 }
        r22 = r6;
    L_0x066c:
        r22.start();
        r2 = z;
        r3 = 90;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r40 = r22.getInputBuffers();
        r19 = r22.getOutputBuffers();
        r41 = new android.media.MediaCodec$BufferInfo;
        r41.<init>();
        r42 = new android.media.MediaCodec$BufferInfo;
        r42.<init>();
        r24 = 0;
        r0 = r44;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2 = r0.h;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r6 = 0;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));	 Catch:{ IllegalStateException -> 0x0fd9 }
        if (r2 <= 0) goto L_0x06d6;	 Catch:{ IllegalStateException -> 0x0fd9 }
    L_0x0696:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2 = r0.h;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2 = r2 * r6;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r6 = 0;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r0 = r39;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r0.seekTo(r2, r6);	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0fd9 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r6 = 154; // 0x9a float:2.16E-43 double:7.6E-322;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0fd9 }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r6 = r0.h;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r6 = r6 * r8;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2 = r2.append(r6);	 Catch:{ IllegalStateException -> 0x0fd9 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r6 = 35;	 Catch:{ IllegalStateException -> 0x0fd9 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0fd9 }
        r6 = r39.getSampleTime();	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2 = r2.append(r6);	 Catch:{ IllegalStateException -> 0x0fd9 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0fd9 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0fd9 }
    L_0x06d6:
        r2 = new com.whatsapp.VideoFrameConverter;
        r2.<init>();
        r14 = 0;
        r3 = 0;
        if (r30 == 0) goto L_0x06f4;
    L_0x06df:
        r3 = r4 * 4;
        r3 = r3 * r5;
        r13 = java.nio.ByteBuffer.allocateDirect(r3);	 Catch:{ Exception -> 0x1181, all -> 0x1179 }
        r3 = 11;	 Catch:{ Exception -> 0x1181, all -> 0x1179 }
        r6 = 0;	 Catch:{ Exception -> 0x1181, all -> 0x1179 }
        r7 = 0;	 Catch:{ Exception -> 0x1181, all -> 0x1179 }
        r8 = r4 + -1;	 Catch:{ Exception -> 0x1181, all -> 0x1179 }
        r9 = r5 + -1;	 Catch:{ Exception -> 0x1181, all -> 0x1179 }
        r11 = r4;	 Catch:{ Exception -> 0x1181, all -> 0x1179 }
        r12 = r5;	 Catch:{ Exception -> 0x1181, all -> 0x1179 }
        r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ Exception -> 0x1181, all -> 0x1179 }
        r3 = r13;
    L_0x06f4:
        r23 = 0;
        r6 = 0;
        r8 = r14;
    L_0x06f8:
        if (r23 != 0) goto L_0x11fd;
    L_0x06fa:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x0fdb }
        r7 = r0.k;	 Catch:{ IllegalStateException -> 0x0fdb }
        if (r7 != 0) goto L_0x11fd;
    L_0x0700:
        r27 = r6 + 1;
        if (r27 >= 0) goto L_0x0720;
    L_0x0704:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fdd }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x0fdd }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0fdd }
        r9 = 100;	 Catch:{ IllegalStateException -> 0x0fdd }
        r7 = r7[r9];	 Catch:{ IllegalStateException -> 0x0fdd }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x0fdd }
        r0 = r27;	 Catch:{ IllegalStateException -> 0x0fdd }
        r6 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x0fdd }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x0fdd }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x0fdd }
    L_0x0720:
        r6 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r22;	 Catch:{ Exception -> 0x0fdf }
        r13 = r0.dequeueInputBuffer(r6);	 Catch:{ Exception -> 0x0fdf }
        if (r27 >= 0) goto L_0x0745;
    L_0x072b:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10be }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x10be }
        r7 = z;	 Catch:{ IllegalStateException -> 0x10be }
        r9 = 32;	 Catch:{ IllegalStateException -> 0x10be }
        r7 = r7[r9];	 Catch:{ IllegalStateException -> 0x10be }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x10be }
        r6 = r6.append(r13);	 Catch:{ IllegalStateException -> 0x10be }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x10be }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10be }
    L_0x0745:
        if (r13 >= 0) goto L_0x0762;
    L_0x0747:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10c0 }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x10c0 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x10c0 }
        r9 = 6;	 Catch:{ IllegalStateException -> 0x10c0 }
        r7 = r7[r9];	 Catch:{ IllegalStateException -> 0x10c0 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x10c0 }
        r6 = r6.append(r13);	 Catch:{ IllegalStateException -> 0x10c0 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x10c0 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10c0 }
        if (r32 == 0) goto L_0x11fd;
    L_0x0762:
        r6 = r40[r13];	 Catch:{ Exception -> 0x0fdf }
        r7 = 0;	 Catch:{ Exception -> 0x0fdf }
        r0 = r39;	 Catch:{ Exception -> 0x0fdf }
        r6 = r0.readSampleData(r6, r7);	 Catch:{ Exception -> 0x0fdf }
        if (r6 >= 0) goto L_0x0785;	 Catch:{ Exception -> 0x0fdf }
    L_0x076d:
        r7 = z;	 Catch:{ Exception -> 0x0fdf }
        r9 = 89;	 Catch:{ Exception -> 0x0fdf }
        r7 = r7[r9];	 Catch:{ Exception -> 0x0fdf }
        com.whatsapp.util.Log.i(r7);	 Catch:{ Exception -> 0x0fdf }
        r14 = 0;	 Catch:{ Exception -> 0x0fdf }
        r15 = 0;	 Catch:{ Exception -> 0x0fdf }
        r16 = 0;	 Catch:{ Exception -> 0x0fdf }
        r18 = 4;	 Catch:{ Exception -> 0x0fdf }
        r12 = r22;	 Catch:{ Exception -> 0x0fdf }
        r12.queueInputBuffer(r13, r14, r15, r16, r18);	 Catch:{ Exception -> 0x0fdf }
        r23 = 1;
        if (r32 == 0) goto L_0x07fc;
    L_0x0785:
        if (r27 >= 0) goto L_0x07b3;
    L_0x0787:
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10c2 }
        r7.<init>();	 Catch:{ IllegalStateException -> 0x10c2 }
        r9 = z;	 Catch:{ IllegalStateException -> 0x10c2 }
        r11 = 92;	 Catch:{ IllegalStateException -> 0x10c2 }
        r9 = r9[r11];	 Catch:{ IllegalStateException -> 0x10c2 }
        r7 = r7.append(r9);	 Catch:{ IllegalStateException -> 0x10c2 }
        r7 = r7.append(r6);	 Catch:{ IllegalStateException -> 0x10c2 }
        r9 = z;	 Catch:{ IllegalStateException -> 0x10c2 }
        r11 = 141; // 0x8d float:1.98E-43 double:6.97E-322;	 Catch:{ IllegalStateException -> 0x10c2 }
        r9 = r9[r11];	 Catch:{ IllegalStateException -> 0x10c2 }
        r7 = r7.append(r9);	 Catch:{ IllegalStateException -> 0x10c2 }
        r14 = r39.getSampleTime();	 Catch:{ IllegalStateException -> 0x10c2 }
        r7 = r7.append(r14);	 Catch:{ IllegalStateException -> 0x10c2 }
        r7 = r7.toString();	 Catch:{ IllegalStateException -> 0x10c2 }
        com.whatsapp.util.Log.i(r7);	 Catch:{ IllegalStateException -> 0x10c2 }
    L_0x07b3:
        r14 = 0;
        r16 = r39.getSampleTime();	 Catch:{ IllegalStateException -> 0x10c4 }
        r18 = 0;	 Catch:{ IllegalStateException -> 0x10c4 }
        r12 = r22;	 Catch:{ IllegalStateException -> 0x10c4 }
        r15 = r6;	 Catch:{ IllegalStateException -> 0x10c4 }
        r12.queueInputBuffer(r13, r14, r15, r16, r18);	 Catch:{ IllegalStateException -> 0x10c4 }
        if (r27 >= 0) goto L_0x07dc;	 Catch:{ IllegalStateException -> 0x10c4 }
    L_0x07c2:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10c4 }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x10c4 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x10c4 }
        r9 = 147; // 0x93 float:2.06E-43 double:7.26E-322;	 Catch:{ IllegalStateException -> 0x10c4 }
        r7 = r7[r9];	 Catch:{ IllegalStateException -> 0x10c4 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x10c4 }
        r6 = r6.append(r13);	 Catch:{ IllegalStateException -> 0x10c4 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x10c4 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10c4 }
    L_0x07dc:
        r6 = r39.advance();	 Catch:{ Exception -> 0x0fdf }
        if (r27 >= 0) goto L_0x07fc;
    L_0x07e2:
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10c6 }
        r7.<init>();	 Catch:{ IllegalStateException -> 0x10c6 }
        r9 = z;	 Catch:{ IllegalStateException -> 0x10c6 }
        r11 = 70;	 Catch:{ IllegalStateException -> 0x10c6 }
        r9 = r9[r11];	 Catch:{ IllegalStateException -> 0x10c6 }
        r7 = r7.append(r9);	 Catch:{ IllegalStateException -> 0x10c6 }
        r6 = r7.append(r6);	 Catch:{ IllegalStateException -> 0x10c6 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x10c6 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10c6 }
    L_0x07fc:
        r6 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r22;	 Catch:{ Exception -> 0x0fdf }
        r1 = r41;	 Catch:{ Exception -> 0x0fdf }
        r20 = r0.dequeueOutputBuffer(r1, r6);	 Catch:{ Exception -> 0x0fdf }
        if (r27 >= 0) goto L_0x0825;
    L_0x0809:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10c8 }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x10c8 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x10c8 }
        r9 = 98;	 Catch:{ IllegalStateException -> 0x10c8 }
        r7 = r7[r9];	 Catch:{ IllegalStateException -> 0x10c8 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x10c8 }
        r0 = r20;	 Catch:{ IllegalStateException -> 0x10c8 }
        r6 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x10c8 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x10c8 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10c8 }
    L_0x0825:
        if (r20 < 0) goto L_0x11fa;
    L_0x0827:
        r6 = 0;
        r0 = r41;	 Catch:{ Exception -> 0x0fdf }
        r12 = r0.presentationTimeUs;	 Catch:{ Exception -> 0x0fdf }
        r0 = r44;	 Catch:{ Exception -> 0x0fdf }
        r14 = r0.h;	 Catch:{ Exception -> 0x0fdf }
        r16 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x0fdf }
        r14 = r14 * r16;	 Catch:{ Exception -> 0x0fdf }
        r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));	 Catch:{ Exception -> 0x0fdf }
        if (r7 < 0) goto L_0x11f2;	 Catch:{ Exception -> 0x0fdf }
    L_0x0838:
        r12 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;	 Catch:{ Exception -> 0x0fdf }
        r0 = r35;	 Catch:{ Exception -> 0x0fdf }
        r7 = r0.dequeueInputBuffer(r12);	 Catch:{ Exception -> 0x0fdf }
        if (r27 >= 0) goto L_0x085d;
    L_0x0843:
        r9 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10ca }
        r9.<init>();	 Catch:{ IllegalStateException -> 0x10ca }
        r11 = z;	 Catch:{ IllegalStateException -> 0x10ca }
        r12 = 23;	 Catch:{ IllegalStateException -> 0x10ca }
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x10ca }
        r9 = r9.append(r11);	 Catch:{ IllegalStateException -> 0x10ca }
        r9 = r9.append(r7);	 Catch:{ IllegalStateException -> 0x10ca }
        r9 = r9.toString();	 Catch:{ IllegalStateException -> 0x10ca }
        com.whatsapp.util.Log.i(r9);	 Catch:{ IllegalStateException -> 0x10ca }
    L_0x085d:
        if (r7 < 0) goto L_0x11ec;
    L_0x085f:
        r18 = r36[r7];	 Catch:{ Exception -> 0x0fdf }
        r18.clear();	 Catch:{ Exception -> 0x0fdf }
        if (r30 == 0) goto L_0x11e9;	 Catch:{ Exception -> 0x0fdf }
    L_0x0866:
        r9 = 1;	 Catch:{ Exception -> 0x0fdf }
        r30.d();	 Catch:{ Exception -> 0x0fdf }
        r6 = 1;	 Catch:{ Exception -> 0x0fdf }
        r0 = r22;	 Catch:{ Exception -> 0x0fdf }
        r1 = r20;	 Catch:{ Exception -> 0x0fdf }
        r0.releaseOutputBuffer(r1, r6);	 Catch:{ Exception -> 0x0fdf }
        r30.e();	 Catch:{ Exception -> 0x0fdf }
        r30.a();	 Catch:{ Exception -> 0x0fdf }
        r11 = 0;	 Catch:{ Exception -> 0x0fdf }
        r12 = 0;	 Catch:{ Exception -> 0x0fdf }
        r15 = 6407; // 0x1907 float:8.978E-42 double:3.1655E-320;	 Catch:{ Exception -> 0x0fdf }
        r16 = 5121; // 0x1401 float:7.176E-42 double:2.53E-320;	 Catch:{ Exception -> 0x0fdf }
        r13 = r4;	 Catch:{ Exception -> 0x0fdf }
        r14 = r5;	 Catch:{ Exception -> 0x0fdf }
        r17 = r3;	 Catch:{ Exception -> 0x0fdf }
        android.opengl.GLES20.glReadPixels(r11, r12, r13, r14, r15, r16, r17);	 Catch:{ Exception -> 0x0fdf }
        r6 = 0;	 Catch:{ Exception -> 0x0fdf }
        r3.position(r6);	 Catch:{ Exception -> 0x0fdf }
        r0 = r18;	 Catch:{ Exception -> 0x0fdf }
        r2.a(r3, r0);	 Catch:{ Exception -> 0x0fdf }
        if (r32 == 0) goto L_0x092f;	 Catch:{ Exception -> 0x0fdf }
    L_0x0890:
        r6 = r19[r20];	 Catch:{ Exception -> 0x0fdf }
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10cc }
        r11 = r0.offset;	 Catch:{ IllegalStateException -> 0x10cc }
        r6.position(r11);	 Catch:{ IllegalStateException -> 0x10cc }
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10cc }
        r11 = r0.offset;	 Catch:{ IllegalStateException -> 0x10cc }
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10cc }
        r12 = r0.size;	 Catch:{ IllegalStateException -> 0x10cc }
        r11 = r11 + r12;	 Catch:{ IllegalStateException -> 0x10cc }
        r6.limit(r11);	 Catch:{ IllegalStateException -> 0x10cc }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10cc }
        r12 = r0.l;	 Catch:{ IllegalStateException -> 0x10cc }
        r14 = 0;
        r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r11 == 0) goto L_0x08b1;
    L_0x08af:
        if (r27 >= 0) goto L_0x0915;
    L_0x08b1:
        r11 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10ce }
        r11.<init>();	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = z;	 Catch:{ IllegalStateException -> 0x10ce }
        r13 = 51;	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ce }
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = r0.offset;	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = z;	 Catch:{ IllegalStateException -> 0x10ce }
        r13 = 15;	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ce }
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = r0.size;	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = z;	 Catch:{ IllegalStateException -> 0x10ce }
        r13 = 123; // 0x7b float:1.72E-43 double:6.1E-322;	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ce }
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = z;	 Catch:{ IllegalStateException -> 0x10ce }
        r13 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ce }
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = r0.flags;	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = z;	 Catch:{ IllegalStateException -> 0x10ce }
        r13 = 59;	 Catch:{ IllegalStateException -> 0x10ce }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ce }
        r0 = r34;	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.append(r0);	 Catch:{ IllegalStateException -> 0x10ce }
        r11 = r11.toString();	 Catch:{ IllegalStateException -> 0x10ce }
        com.whatsapp.util.Log.i(r11);	 Catch:{ IllegalStateException -> 0x10ce }
    L_0x0915:
        r0 = r18;	 Catch:{ IllegalStateException -> 0x10d0 }
        r2.a(r6, r0);	 Catch:{ IllegalStateException -> 0x10d0 }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10d0 }
        r12 = r0.l;	 Catch:{ IllegalStateException -> 0x10d0 }
        r14 = 0;
        r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r6 == 0) goto L_0x0926;
    L_0x0924:
        if (r27 >= 0) goto L_0x092f;
    L_0x0926:
        r6 = z;	 Catch:{ IllegalStateException -> 0x10d2 }
        r11 = 155; // 0x9b float:2.17E-43 double:7.66E-322;	 Catch:{ IllegalStateException -> 0x10d2 }
        r6 = r6[r11];	 Catch:{ IllegalStateException -> 0x10d2 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10d2 }
    L_0x092f:
        r14 = 0;
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10d4 }
        r0 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x10d4 }
        r16 = r0;	 Catch:{ IllegalStateException -> 0x10d4 }
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10d4 }
        r0 = r0.flags;	 Catch:{ IllegalStateException -> 0x10d4 }
        r18 = r0;	 Catch:{ IllegalStateException -> 0x10d4 }
        r12 = r35;	 Catch:{ IllegalStateException -> 0x10d4 }
        r13 = r7;	 Catch:{ IllegalStateException -> 0x10d4 }
        r15 = r34;	 Catch:{ IllegalStateException -> 0x10d4 }
        r12.queueInputBuffer(r13, r14, r15, r16, r18);	 Catch:{ IllegalStateException -> 0x10d4 }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10d4 }
        r6 = r0.l;	 Catch:{ IllegalStateException -> 0x10d4 }
        r12 = 0;
        r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x0950;
    L_0x094e:
        if (r27 >= 0) goto L_0x0959;
    L_0x0950:
        r6 = z;	 Catch:{ IllegalStateException -> 0x10d6 }
        r7 = 50;	 Catch:{ IllegalStateException -> 0x10d6 }
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x10d6 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10d6 }
    L_0x0959:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10d8 }
        r6 = r0.l;	 Catch:{ IllegalStateException -> 0x10d8 }
        r12 = 1;	 Catch:{ IllegalStateException -> 0x10d8 }
        r6 = r6 + r12;	 Catch:{ IllegalStateException -> 0x10d8 }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10d8 }
        r0.l = r6;	 Catch:{ IllegalStateException -> 0x10d8 }
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10d8 }
        r6 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x10d8 }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10d8 }
        r12 = r0.h;	 Catch:{ IllegalStateException -> 0x10d8 }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IllegalStateException -> 0x10d8 }
        r12 = r12 * r14;	 Catch:{ IllegalStateException -> 0x10d8 }
        r6 = r6 - r12;	 Catch:{ IllegalStateException -> 0x10d8 }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10d8 }
        r0.j = r6;	 Catch:{ IllegalStateException -> 0x10d8 }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10d8 }
        r6 = r0.g;	 Catch:{ IllegalStateException -> 0x10d8 }
        r12 = 0;	 Catch:{ IllegalStateException -> 0x10d8 }
        r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));	 Catch:{ IllegalStateException -> 0x10d8 }
        if (r6 <= 0) goto L_0x09bf;	 Catch:{ IllegalStateException -> 0x10d8 }
    L_0x097e:
        r0 = r41;	 Catch:{ IllegalStateException -> 0x10d8 }
        r6 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x10d8 }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10d8 }
        r12 = r0.g;	 Catch:{ IllegalStateException -> 0x10d8 }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12 = r12 * r14;
        r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r6 <= 0) goto L_0x09bf;
    L_0x098d:
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0fdf }
        r6.<init>();	 Catch:{ Exception -> 0x0fdf }
        r7 = z;	 Catch:{ Exception -> 0x0fdf }
        r11 = 105; // 0x69 float:1.47E-43 double:5.2E-322;	 Catch:{ Exception -> 0x0fdf }
        r7 = r7[r11];	 Catch:{ Exception -> 0x0fdf }
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x0fdf }
        r0 = r41;	 Catch:{ Exception -> 0x0fdf }
        r12 = r0.presentationTimeUs;	 Catch:{ Exception -> 0x0fdf }
        r6 = r6.append(r12);	 Catch:{ Exception -> 0x0fdf }
        r7 = " ";	 Catch:{ Exception -> 0x0fdf }
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x0fdf }
        r0 = r44;	 Catch:{ Exception -> 0x0fdf }
        r12 = r0.g;	 Catch:{ Exception -> 0x0fdf }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x0fdf }
        r12 = r12 * r14;	 Catch:{ Exception -> 0x0fdf }
        r6 = r6.append(r12);	 Catch:{ Exception -> 0x0fdf }
        r6 = r6.toString();	 Catch:{ Exception -> 0x0fdf }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x0fdf }
        r23 = 1;
    L_0x09bf:
        r6 = 0;
        r6 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1));
        if (r6 == 0) goto L_0x11e2;
    L_0x09c5:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10da }
        r6 = r0.h;	 Catch:{ IllegalStateException -> 0x10da }
        r12 = 0;
        r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r6 > 0) goto L_0x10de;
    L_0x09cf:
        r6 = 0;
    L_0x09d1:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10e7 }
        r12 = r0.g;	 Catch:{ IllegalStateException -> 0x10e7 }
        r14 = 0;
        r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r11 > 0) goto L_0x10e9;
    L_0x09db:
        r12 = r28;
    L_0x09dd:
        r14 = 100;
        r0 = r41;	 Catch:{ Exception -> 0x0fdf }
        r0 = r0.presentationTimeUs;	 Catch:{ Exception -> 0x0fdf }
        r16 = r0;	 Catch:{ Exception -> 0x0fdf }
        r16 = r16 - r6;	 Catch:{ Exception -> 0x0fdf }
        r14 = r14 * r16;	 Catch:{ Exception -> 0x0fdf }
        r6 = r12 - r6;	 Catch:{ Exception -> 0x0fdf }
        r6 = r14 / r6;	 Catch:{ Exception -> 0x0fdf }
        r6 = (int) r6;
        r0 = r24;
        if (r6 == r0) goto L_0x11e2;
    L_0x09f2:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10f2 }
        r7 = r0.i;	 Catch:{ IllegalStateException -> 0x10f2 }
        if (r7 == 0) goto L_0x11e2;
    L_0x09f8:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10f4 }
        r7 = r0.k;	 Catch:{ IllegalStateException -> 0x10f4 }
        if (r7 != 0) goto L_0x0a08;	 Catch:{ IllegalStateException -> 0x10f4 }
    L_0x09fe:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10f4 }
        r7 = r0.i;	 Catch:{ IllegalStateException -> 0x10f4 }
        r7 = r7.a(r6);	 Catch:{ IllegalStateException -> 0x10f4 }
        if (r7 == 0) goto L_0x10f8;
    L_0x0a08:
        r7 = 1;
    L_0x0a09:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10fb }
        r0.k = r7;	 Catch:{ IllegalStateException -> 0x10fb }
        r7 = 5;	 Catch:{ IllegalStateException -> 0x10fb }
        if (r6 < r7) goto L_0x0a14;	 Catch:{ IllegalStateException -> 0x10fb }
    L_0x0a10:
        r7 = r6 % 5;	 Catch:{ IllegalStateException -> 0x10fb }
        if (r7 != 0) goto L_0x11d9;
    L_0x0a14:
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10fd }
        r7.<init>();	 Catch:{ IllegalStateException -> 0x10fd }
        r11 = z;	 Catch:{ IllegalStateException -> 0x10fd }
        r12 = 110; // 0x6e float:1.54E-43 double:5.43E-322;	 Catch:{ IllegalStateException -> 0x10fd }
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x10fd }
        r7 = r7.append(r11);	 Catch:{ IllegalStateException -> 0x10fd }
        r7 = r7.append(r6);	 Catch:{ IllegalStateException -> 0x10fd }
        r11 = z;	 Catch:{ IllegalStateException -> 0x10fd }
        r12 = 24;	 Catch:{ IllegalStateException -> 0x10fd }
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x10fd }
        r7 = r7.append(r11);	 Catch:{ IllegalStateException -> 0x10fd }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10fd }
        r12 = r0.l;	 Catch:{ IllegalStateException -> 0x10fd }
        r7 = r7.append(r12);	 Catch:{ IllegalStateException -> 0x10fd }
        r11 = z;	 Catch:{ IllegalStateException -> 0x10fd }
        r12 = 29;	 Catch:{ IllegalStateException -> 0x10fd }
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x10fd }
        r7 = r7.append(r11);	 Catch:{ IllegalStateException -> 0x10fd }
        r0 = r44;	 Catch:{ IllegalStateException -> 0x10fd }
        r12 = r0.j;	 Catch:{ IllegalStateException -> 0x10fd }
        r7 = r7.append(r12);	 Catch:{ IllegalStateException -> 0x10fd }
        r7 = r7.toString();	 Catch:{ IllegalStateException -> 0x10fd }
        com.whatsapp.util.Log.i(r7);	 Catch:{ IllegalStateException -> 0x10fd }
        r7 = r23;
        r43 = r9;
        r9 = r6;
        r6 = r43;
    L_0x0a59:
        r12 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r35;	 Catch:{ Exception -> 0x0fdf }
        r1 = r42;	 Catch:{ Exception -> 0x0fdf }
        r12 = r0.dequeueOutputBuffer(r1, r12);	 Catch:{ Exception -> 0x0fdf }
        if (r27 >= 0) goto L_0x0a80;
    L_0x0a66:
        r11 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10ff }
        r11.<init>();	 Catch:{ IllegalStateException -> 0x10ff }
        r13 = z;	 Catch:{ IllegalStateException -> 0x10ff }
        r14 = 72;	 Catch:{ IllegalStateException -> 0x10ff }
        r13 = r13[r14];	 Catch:{ IllegalStateException -> 0x10ff }
        r11 = r11.append(r13);	 Catch:{ IllegalStateException -> 0x10ff }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ff }
        r11 = r11.toString();	 Catch:{ IllegalStateException -> 0x10ff }
        com.whatsapp.util.Log.i(r11);	 Catch:{ IllegalStateException -> 0x10ff }
    L_0x0a80:
        if (r12 < 0) goto L_0x0ab2;
    L_0x0a82:
        r11 = r26[r12];	 Catch:{ Exception -> 0x0fdf }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x1101 }
        r13 = r0.offset;	 Catch:{ IllegalStateException -> 0x1101 }
        r11.position(r13);	 Catch:{ IllegalStateException -> 0x1101 }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x1101 }
        r13 = r0.offset;	 Catch:{ IllegalStateException -> 0x1101 }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x1101 }
        r14 = r0.size;	 Catch:{ IllegalStateException -> 0x1101 }
        r13 = r13 + r14;	 Catch:{ IllegalStateException -> 0x1101 }
        r11.limit(r13);	 Catch:{ IllegalStateException -> 0x1101 }
        r0 = r38;	 Catch:{ IllegalStateException -> 0x1101 }
        r0.write(r11);	 Catch:{ IllegalStateException -> 0x1101 }
        r11.clear();	 Catch:{ IllegalStateException -> 0x1101 }
        r11 = 0;	 Catch:{ IllegalStateException -> 0x1101 }
        r0 = r35;	 Catch:{ IllegalStateException -> 0x1101 }
        r0.releaseOutputBuffer(r12, r11);	 Catch:{ IllegalStateException -> 0x1101 }
        if (r27 >= 0) goto L_0x0ab0;	 Catch:{ IllegalStateException -> 0x1101 }
    L_0x0aa7:
        r11 = z;	 Catch:{ IllegalStateException -> 0x1101 }
        r13 = 73;	 Catch:{ IllegalStateException -> 0x1101 }
        r11 = r11[r13];	 Catch:{ IllegalStateException -> 0x1101 }
        com.whatsapp.util.Log.i(r11);	 Catch:{ IllegalStateException -> 0x1101 }
    L_0x0ab0:
        if (r32 == 0) goto L_0x11d5;
    L_0x0ab2:
        r11 = -3;
        if (r12 != r11) goto L_0x11d1;
    L_0x0ab5:
        r11 = r35.getOutputBuffers();	 Catch:{ Exception -> 0x0fdf }
        r13 = z;	 Catch:{ IllegalStateException -> 0x1103 }
        r14 = 57;	 Catch:{ IllegalStateException -> 0x1103 }
        r13 = r13[r14];	 Catch:{ IllegalStateException -> 0x1103 }
        com.whatsapp.util.Log.i(r13);	 Catch:{ IllegalStateException -> 0x1103 }
        if (r32 == 0) goto L_0x0ae5;
    L_0x0ac4:
        r13 = -2;
        if (r12 != r13) goto L_0x0ae5;
    L_0x0ac7:
        r12 = r35.getOutputFormat();	 Catch:{ Exception -> 0x0fdf }
        r13 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0fdf }
        r13.<init>();	 Catch:{ Exception -> 0x0fdf }
        r14 = z;	 Catch:{ Exception -> 0x0fdf }
        r15 = 40;	 Catch:{ Exception -> 0x0fdf }
        r14 = r14[r15];	 Catch:{ Exception -> 0x0fdf }
        r13 = r13.append(r14);	 Catch:{ Exception -> 0x0fdf }
        r12 = r13.append(r12);	 Catch:{ Exception -> 0x0fdf }
        r12 = r12.toString();	 Catch:{ Exception -> 0x0fdf }
        com.whatsapp.util.Log.i(r12);	 Catch:{ Exception -> 0x0fdf }
    L_0x0ae5:
        if (r32 == 0) goto L_0x11c8;
    L_0x0ae7:
        r8 = r8 + 1;
        if (r27 >= 0) goto L_0x11c8;
    L_0x0aeb:
        r12 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x1105 }
        r12.<init>();	 Catch:{ IllegalStateException -> 0x1105 }
        r13 = z;	 Catch:{ IllegalStateException -> 0x1105 }
        r14 = 20;	 Catch:{ IllegalStateException -> 0x1105 }
        r13 = r13[r14];	 Catch:{ IllegalStateException -> 0x1105 }
        r12 = r12.append(r13);	 Catch:{ IllegalStateException -> 0x1105 }
        r12 = r12.append(r8);	 Catch:{ IllegalStateException -> 0x1105 }
        r12 = r12.toString();	 Catch:{ IllegalStateException -> 0x1105 }
        com.whatsapp.util.Log.i(r12);	 Catch:{ IllegalStateException -> 0x1105 }
        r43 = r6;
        r6 = r7;
        r7 = r9;
        r9 = r11;
        r11 = r43;
    L_0x0b0c:
        if (r11 != 0) goto L_0x0b16;
    L_0x0b0e:
        r11 = 0;
        r0 = r22;	 Catch:{ IllegalStateException -> 0x1107 }
        r1 = r20;	 Catch:{ IllegalStateException -> 0x1107 }
        r0.releaseOutputBuffer(r1, r11);	 Catch:{ IllegalStateException -> 0x1107 }
    L_0x0b16:
        if (r27 >= 0) goto L_0x0b21;
    L_0x0b18:
        r11 = z;	 Catch:{ IllegalStateException -> 0x1109 }
        r12 = 137; // 0x89 float:1.92E-43 double:6.77E-322;	 Catch:{ IllegalStateException -> 0x1109 }
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x1109 }
        com.whatsapp.util.Log.i(r11);	 Catch:{ IllegalStateException -> 0x1109 }
    L_0x0b21:
        if (r32 == 0) goto L_0x11bd;
    L_0x0b23:
        r23 = r6;
        r24 = r7;
        r26 = r9;
        r9 = r8;
    L_0x0b2a:
        r6 = -3;
        r0 = r20;
        if (r0 != r6) goto L_0x11b9;
    L_0x0b2f:
        r6 = r22.getOutputBuffers();	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r7 = z;	 Catch:{ IllegalStateException -> 0x110b }
        r8 = 87;	 Catch:{ IllegalStateException -> 0x110b }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x110b }
        com.whatsapp.util.Log.i(r7);	 Catch:{ IllegalStateException -> 0x110b }
        if (r32 == 0) goto L_0x11ac;
    L_0x0b3e:
        r25 = r6;
    L_0x0b40:
        r6 = -2;
        r0 = r20;
        if (r0 != r6) goto L_0x1195;
    L_0x0b45:
        r11 = r22.getOutputFormat();	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = z;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r7 = 26;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6[r7];	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r12 = r11.getInteger(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = z;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r7 = 114; // 0x72 float:1.6E-43 double:5.63E-322;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6[r7];	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r8 = r11.getInteger(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = z;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r7 = 52;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6[r7];	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r7 = r11.getInteger(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = z;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r13 = 13;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6[r13];	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r15 = r11.getInteger(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = z;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r13 = 85;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6[r13];	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r17 = r11.getInteger(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = z;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r13 = 124; // 0x7c float:1.74E-43 double:6.13E-322;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6[r13];	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r16 = r11.getInteger(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = z;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r13 = 33;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6[r13];	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r18 = r11.getInteger(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6.<init>();	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r13 = z;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r14 = 71;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r13 = r13[r14];	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6.append(r13);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6.append(r11);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6.toString();	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r31.getName();	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = b(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        if (r6 != 0) goto L_0x11a9;
    L_0x0bb3:
        r6 = z;	 Catch:{ Exception -> 0x1111, all -> 0x111f }
        r13 = 96;	 Catch:{ Exception -> 0x1111, all -> 0x111f }
        r6 = r6[r13];	 Catch:{ Exception -> 0x1111, all -> 0x111f }
        r6 = r11.getInteger(r6);	 Catch:{ Exception -> 0x1111, all -> 0x111f }
        if (r6 <= r7) goto L_0x11a6;
    L_0x0bbf:
        r14 = r6;
    L_0x0bc0:
        r6 = r31.getName();	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = b(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        if (r6 != 0) goto L_0x11a3;
    L_0x0bca:
        r6 = z;	 Catch:{ Exception -> 0x1115, all -> 0x111f }
        r7 = 61;	 Catch:{ Exception -> 0x1115, all -> 0x111f }
        r6 = r6[r7];	 Catch:{ Exception -> 0x1115, all -> 0x111f }
        r6 = r11.getInteger(r6);	 Catch:{ Exception -> 0x1115, all -> 0x111f }
        if (r6 <= r8) goto L_0x11a0;
    L_0x0bd6:
        r13 = r6;
    L_0x0bd7:
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x1119 }
        r7 = 21;
        if (r6 >= r7) goto L_0x0bfc;
    L_0x0bdd:
        r6 = 1079; // 0x437 float:1.512E-42 double:5.33E-321;
        r0 = r18;
        if (r0 != r6) goto L_0x0bfc;
    L_0x0be3:
        r6 = 1088; // 0x440 float:1.525E-42 double:5.375E-321;
        if (r14 != r6) goto L_0x0bfc;
    L_0x0be7:
        r6 = r31.getName();	 Catch:{ IllegalStateException -> 0x111d }
        r6 = a(r6);	 Catch:{ IllegalStateException -> 0x111d }
        if (r6 == 0) goto L_0x0bfc;
    L_0x0bf1:
        r6 = z;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r7 = 27;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6[r7];	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r14 = 1080; // 0x438 float:1.513E-42 double:5.336E-321;
    L_0x0bfc:
        r6 = 25;
        if (r12 != r6) goto L_0x0c1c;
    L_0x0c00:
        r6 = z;	 Catch:{ IllegalStateException -> 0x1123 }
        r7 = 54;	 Catch:{ IllegalStateException -> 0x1123 }
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x1123 }
        r7 = r31.getName();	 Catch:{ IllegalStateException -> 0x1123 }
        r6 = r6.equals(r7);	 Catch:{ IllegalStateException -> 0x1123 }
        if (r6 == 0) goto L_0x0c1c;
    L_0x0c10:
        r6 = z;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r7 = 145; // 0x91 float:2.03E-43 double:7.16E-322;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r6 = r6[r7];	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r12 = 2130706688; // 0x7f000100 float:1.7014638E38 double:1.052708976E-314;
    L_0x0c1c:
        r6 = 2141391876; // 0x7fa30c04 float:NaN double:1.05798816E-314;
        if (r12 != r6) goto L_0x0c25;
    L_0x0c21:
        r12 = 21;
        if (r32 == 0) goto L_0x0c42;
    L_0x0c25:
        r6 = 2130706433; // 0x7f000001 float:1.701412E38 double:1.05270885E-314;
        if (r12 != r6) goto L_0x0c42;
    L_0x0c2a:
        r6 = e;	 Catch:{ IllegalStateException -> 0x1125 }
        if (r6 == 0) goto L_0x0c40;
    L_0x0c2e:
        r6 = e;	 Catch:{ IllegalStateException -> 0x1127 }
        r6 = r6.toLowerCase();	 Catch:{ IllegalStateException -> 0x1127 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x1127 }
        r8 = 74;	 Catch:{ IllegalStateException -> 0x1127 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x1127 }
        r6 = r6.startsWith(r7);	 Catch:{ IllegalStateException -> 0x1127 }
        if (r6 != 0) goto L_0x0c42;
    L_0x0c40:
        r12 = 19;
    L_0x0c42:
        if (r30 != 0) goto L_0x1195;
    L_0x0c44:
        r11 = r2;
        r19 = r10;
        r20 = r4;
        r21 = r5;
        r11.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x1129 }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x1129 }
        r8 = 120; // 0x78 float:1.68E-43 double:5.93E-322;	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r12);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r13);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r14);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r15);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r0 = r16;	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r0 = r17;	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r0 = r18;	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = ")";	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x1129 }
        r8 = 80;	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r10);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r4);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r5);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = ")";	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1129 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x1129 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x1129 }
        r7 = r23;
        r6 = r9;
        r8 = r24;
        r11 = r26;
        r9 = r25;
    L_0x0ceb:
        r0 = r41;	 Catch:{ IllegalStateException -> 0x112b }
        r12 = r0.flags;	 Catch:{ IllegalStateException -> 0x112b }
        r12 = r12 & 4;	 Catch:{ IllegalStateException -> 0x112b }
        if (r12 == 0) goto L_0x0cfe;	 Catch:{ IllegalStateException -> 0x112b }
    L_0x0cf3:
        r12 = z;	 Catch:{ IllegalStateException -> 0x112b }
        r13 = 36;	 Catch:{ IllegalStateException -> 0x112b }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x112b }
        com.whatsapp.util.Log.i(r12);	 Catch:{ IllegalStateException -> 0x112b }
        if (r32 == 0) goto L_0x1192;
    L_0x0cfe:
        if (r32 == 0) goto L_0x1185;
    L_0x0d00:
        r3 = r6;
    L_0x0d01:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 65;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r44;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r44;
        r6 = r0.l;
        r4 = r4.append(r6);
        r5 = z;
        r6 = 19;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r44;
        r6 = r0.j;
        r4 = r4.append(r6);
        r5 = z;
        r6 = 78;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r22.stop();
        r3 = z;
        r4 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r22.release();
        r3 = z;
        r4 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r35;
        r1 = r42;
        r3 = r0.dequeueOutputBuffer(r1, r4);
    L_0x0d74:
        if (r3 < 0) goto L_0x0da3;
    L_0x0d76:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 83;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r3);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = 0;
        r0 = r35;
        r0.releaseOutputBuffer(r3, r4);
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r35;
        r1 = r42;
        r3 = r0.dequeueOutputBuffer(r1, r4);
        if (r32 == 0) goto L_0x0d74;
    L_0x0da3:
        r3 = z;
        r4 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r35.stop();
        r3 = z;
        r4 = 16;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r35.release();
        r3 = z;
        r4 = 25;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r39.release();
        r3 = z;
        r4 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r2.a();
        r38.close();	 Catch:{ IOException -> 0x1133 }
        r37.close();	 Catch:{ IOException -> 0x1133 }
    L_0x0dd9:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x113f }
        r2 = r0.c;	 Catch:{ IllegalStateException -> 0x113f }
        r2 = r2.length();	 Catch:{ IllegalStateException -> 0x113f }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x0df1;
    L_0x0de7:
        r0 = r44;	 Catch:{ IllegalStateException -> 0x0df7 }
        r2 = r0.j;	 Catch:{ IllegalStateException -> 0x0df7 }
        r4 = 0;	 Catch:{ IllegalStateException -> 0x0df7 }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ IllegalStateException -> 0x0df7 }
        if (r2 != 0) goto L_0x1141;	 Catch:{ IllegalStateException -> 0x0df7 }
    L_0x0df1:
        r2 = new com.whatsapp.util.cq;	 Catch:{ IllegalStateException -> 0x0df7 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0df7 }
        throw r2;	 Catch:{ IllegalStateException -> 0x0df7 }
    L_0x0df7:
        r2 = move-exception;
        throw r2;
    L_0x0df9:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0dfb }
    L_0x0dfb:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0dfd }
    L_0x0dfd:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0dff }
    L_0x0dff:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0e01 }
    L_0x0e01:
        r2 = move-exception;
        throw r2;
    L_0x0e03:
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalStateException -> 0x0e28 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0e28 }
        r8 = 81;	 Catch:{ IllegalStateException -> 0x0e28 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0e28 }
        r3 = r3.equals(r7);	 Catch:{ IllegalStateException -> 0x0e28 }
        if (r3 == 0) goto L_0x120a;	 Catch:{ IllegalStateException -> 0x0e28 }
    L_0x0e11:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0e28 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0e28 }
        r8 = 113; // 0x71 float:1.58E-43 double:5.6E-322;	 Catch:{ IllegalStateException -> 0x0e28 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0e28 }
        r3 = r3.startsWith(r7);	 Catch:{ IllegalStateException -> 0x0e28 }
        if (r3 == 0) goto L_0x120a;
    L_0x0e1f:
        r2 = new com.whatsapp.aiu;
        r2.<init>(r4, r5);
        r30 = r2;
        goto L_0x0659;
    L_0x0e28:
        r2 = move-exception;
        throw r2;
    L_0x0e2a:
        r2 = r30.b();	 Catch:{ IllegalStateException -> 0x0e30 }
        goto L_0x065c;
    L_0x0e30:
        r2 = move-exception;
        r7 = r2;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r8 = 82;
        r3 = r3[r8];
        r2 = r2.append(r3);
        r3 = r7.toString();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r6.release();
        r13 = new java.util.ArrayList;
        r13.<init>();
        r2 = 0;
        r8 = r2;
    L_0x0e5a:
        if (r8 >= r12) goto L_0x0ebf;
    L_0x0e5c:
        r14 = android.media.MediaCodecList.getCodecInfoAt(r8);
        r2 = r14.isEncoder();	 Catch:{ IllegalStateException -> 0x0ed3 }
        if (r2 == 0) goto L_0x0e68;
    L_0x0e66:
        if (r32 == 0) goto L_0x0ebb;
    L_0x0e68:
        r15 = r14.getSupportedTypes();
        r3 = 0;
        r2 = 0;
    L_0x0e6e:
        r0 = r15.length;
        r16 = r0;
        r0 = r16;
        if (r2 >= r0) goto L_0x0e86;
    L_0x0e75:
        if (r3 != 0) goto L_0x0e86;
    L_0x0e77:
        r16 = r15[r2];	 Catch:{ IllegalStateException -> 0x0ed5 }
        r0 = r16;	 Catch:{ IllegalStateException -> 0x0ed5 }
        r16 = r0.equals(r11);	 Catch:{ IllegalStateException -> 0x0ed5 }
        if (r16 == 0) goto L_0x0e82;
    L_0x0e81:
        r3 = 1;
    L_0x0e82:
        r2 = r2 + 1;
        if (r32 == 0) goto L_0x0e6e;
    L_0x0e86:
        if (r3 == 0) goto L_0x0ebb;
    L_0x0e88:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0ed7 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0ed7 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0ed7 }
        r16 = 116; // 0x74 float:1.63E-43 double:5.73E-322;	 Catch:{ IllegalStateException -> 0x0ed7 }
        r3 = r3[r16];	 Catch:{ IllegalStateException -> 0x0ed7 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0ed7 }
        r3 = r14.getName();	 Catch:{ IllegalStateException -> 0x0ed7 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0ed7 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0ed7 }
        r16 = 95;	 Catch:{ IllegalStateException -> 0x0ed7 }
        r3 = r3[r16];	 Catch:{ IllegalStateException -> 0x0ed7 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0ed7 }
        r3 = java.util.Arrays.deepToString(r15);	 Catch:{ IllegalStateException -> 0x0ed7 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0ed7 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0ed7 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0ed7 }
        r13.add(r14);	 Catch:{ IllegalStateException -> 0x0ed7 }
    L_0x0ebb:
        r2 = r8 + 1;
        if (r32 == 0) goto L_0x1207;
    L_0x0ebf:
        r2 = r13.isEmpty();	 Catch:{ IllegalStateException -> 0x0ed1 }
        if (r2 == 0) goto L_0x0ed9;	 Catch:{ IllegalStateException -> 0x0ed1 }
    L_0x0ec5:
        r2 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0ed1 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0ed1 }
        r4 = 64;	 Catch:{ IllegalStateException -> 0x0ed1 }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0ed1 }
        r2.<init>(r3, r7);	 Catch:{ IllegalStateException -> 0x0ed1 }
        throw r2;	 Catch:{ IllegalStateException -> 0x0ed1 }
    L_0x0ed1:
        r2 = move-exception;
        throw r2;
    L_0x0ed3:
        r2 = move-exception;
        throw r2;
    L_0x0ed5:
        r2 = move-exception;
        throw r2;
    L_0x0ed7:
        r2 = move-exception;
        throw r2;
    L_0x0ed9:
        r7 = r13.iterator();
        r3 = r6;
    L_0x0ede:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x1204;
    L_0x0ee4:
        r2 = r7.next();
        r2 = (android.media.MediaCodecInfo) r2;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fcf }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x0fcf }
        r8 = z;	 Catch:{ IllegalStateException -> 0x0fcf }
        r12 = 135; // 0x87 float:1.89E-43 double:6.67E-322;	 Catch:{ IllegalStateException -> 0x0fcf }
        r8 = r8[r12];	 Catch:{ IllegalStateException -> 0x0fcf }
        r6 = r6.append(r8);	 Catch:{ IllegalStateException -> 0x0fcf }
        r8 = r2.getName();	 Catch:{ IllegalStateException -> 0x0fcf }
        r6 = r6.append(r8);	 Catch:{ IllegalStateException -> 0x0fcf }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x0fcf }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x0fcf }
        r6 = z;	 Catch:{ IllegalStateException -> 0x0fcf }
        r8 = 143; // 0x8f float:2.0E-43 double:7.07E-322;	 Catch:{ IllegalStateException -> 0x0fcf }
        r6 = r6[r8];	 Catch:{ IllegalStateException -> 0x0fcf }
        r8 = r2.getName();	 Catch:{ IllegalStateException -> 0x0fcf }
        r6 = r6.equals(r8);	 Catch:{ IllegalStateException -> 0x0fcf }
        if (r6 == 0) goto L_0x0f37;	 Catch:{ IllegalStateException -> 0x0fcf }
    L_0x0f18:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fcf }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x0fcf }
        r8 = z;	 Catch:{ IllegalStateException -> 0x0fcf }
        r12 = 4;	 Catch:{ IllegalStateException -> 0x0fcf }
        r8 = r8[r12];	 Catch:{ IllegalStateException -> 0x0fcf }
        r6 = r6.append(r8);	 Catch:{ IllegalStateException -> 0x0fcf }
        r8 = r2.getName();	 Catch:{ IllegalStateException -> 0x0fcf }
        r6 = r6.append(r8);	 Catch:{ IllegalStateException -> 0x0fcf }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x0fcf }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x0fcf }
        if (r32 == 0) goto L_0x0ede;
    L_0x0f37:
        r3 = r2.getName();
        r6 = android.media.MediaCodec.createByCodecName(r3);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r8 = z;
        r12 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r8 = r8[r12];
        r3 = r3.append(r8);
        r8 = r2.getName();
        r3 = r3.append(r8);
        r8 = z;
        r12 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r8 = r8[r12];
        r3 = r3.append(r8);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = 0;
        r8 = 0;
        r12 = 0;
        r6.configure(r9, r3, r8, r12);	 Catch:{ Exception -> 0x0fd1 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0fd1 }
        r3.<init>();	 Catch:{ Exception -> 0x0fd1 }
        r8 = z;	 Catch:{ Exception -> 0x0fd1 }
        r12 = 5;	 Catch:{ Exception -> 0x0fd1 }
        r8 = r8[r12];	 Catch:{ Exception -> 0x0fd1 }
        r3 = r3.append(r8);	 Catch:{ Exception -> 0x0fd1 }
        r2 = r2.getName();	 Catch:{ Exception -> 0x0fd1 }
        r2 = r3.append(r2);	 Catch:{ Exception -> 0x0fd1 }
        r3 = z;	 Catch:{ Exception -> 0x0fd1 }
        r8 = 139; // 0x8b float:1.95E-43 double:6.87E-322;	 Catch:{ Exception -> 0x0fd1 }
        r3 = r3[r8];	 Catch:{ Exception -> 0x0fd1 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0fd1 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0fd1 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0fd1 }
    L_0x0f94:
        if (r6 != 0) goto L_0x1200;
    L_0x0f96:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fcd }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0fcd }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0fcd }
        r4 = 8;	 Catch:{ IllegalStateException -> 0x0fcd }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0fcd }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0fcd }
        r2 = r2.append(r11);	 Catch:{ IllegalStateException -> 0x0fcd }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0fcd }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x0fcd }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IllegalStateException -> 0x0fcd }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fcd }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x0fcd }
        r4 = z;	 Catch:{ IllegalStateException -> 0x0fcd }
        r5 = 55;	 Catch:{ IllegalStateException -> 0x0fcd }
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0fcd }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x0fcd }
        r3 = r3.append(r11);	 Catch:{ IllegalStateException -> 0x0fcd }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x0fcd }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x0fcd }
        throw r2;	 Catch:{ IllegalStateException -> 0x0fcd }
    L_0x0fcd:
        r2 = move-exception;
        throw r2;
    L_0x0fcf:
        r2 = move-exception;
        throw r2;
    L_0x0fd1:
        r2 = move-exception;
        r6.release();
        r2 = 0;
        r3 = r2;
        goto L_0x0ede;
    L_0x0fd9:
        r2 = move-exception;
        throw r2;
    L_0x0fdb:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x0fdd }
    L_0x0fdd:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x0fdf:
        r3 = move-exception;
    L_0x0fe0:
        r4 = z;	 Catch:{ all -> 0x0fea }
        r5 = 10;	 Catch:{ all -> 0x0fea }
        r4 = r4[r5];	 Catch:{ all -> 0x0fea }
        com.whatsapp.util.Log.b(r4, r3);	 Catch:{ all -> 0x0fea }
        throw r3;	 Catch:{ all -> 0x0fea }
    L_0x0fea:
        r3 = move-exception;
    L_0x0feb:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r44;
        r5 = r0.k;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 21;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r44;
        r6 = r0.l;
        r4 = r4.append(r6);
        r5 = z;
        r6 = 69;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r44;
        r6 = r0.j;
        r4 = r4.append(r6);
        r5 = z;
        r6 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r8);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r22.stop();
        r4 = z;
        r5 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r22.release();
        r4 = z;
        r5 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r35;
        r1 = r42;
        r4 = r0.dequeueOutputBuffer(r1, r4);
    L_0x105e:
        if (r4 < 0) goto L_0x108d;
    L_0x1060:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 41;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r5 = 0;
        r0 = r35;
        r0.releaseOutputBuffer(r4, r5);
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r35;
        r1 = r42;
        r4 = r0.dequeueOutputBuffer(r1, r4);
        if (r32 == 0) goto L_0x105e;
    L_0x108d:
        r4 = z;
        r5 = 37;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r35.stop();
        r4 = z;
        r5 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r35.release();
        r4 = z;
        r5 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r39.release();
        r4 = z;
        r5 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r2.a();
        throw r3;
    L_0x10be:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10c0:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10c2:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10c4:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10c6:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10c8:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10ca:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10cc:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10ce }
    L_0x10ce:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10d0:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10d2 }
    L_0x10d2:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10d4:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10d6 }
    L_0x10d6:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10d8:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10da:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10dc }
    L_0x10dc:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10de:
        r0 = r44;	 Catch:{ Exception -> 0x0fdf }
        r6 = r0.h;	 Catch:{ Exception -> 0x0fdf }
        r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x0fdf }
        r6 = r6 * r12;	 Catch:{ Exception -> 0x0fdf }
        goto L_0x09d1;	 Catch:{ Exception -> 0x0fdf }
    L_0x10e7:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10e9:
        r0 = r44;	 Catch:{ Exception -> 0x0fdf }
        r12 = r0.g;	 Catch:{ Exception -> 0x0fdf }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x0fdf }
        r12 = r12 * r14;	 Catch:{ Exception -> 0x0fdf }
        goto L_0x09dd;	 Catch:{ Exception -> 0x0fdf }
    L_0x10f2:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10f4:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10f6 }
    L_0x10f6:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10f8:
        r7 = 0;
        goto L_0x0a09;
    L_0x10fb:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10fd }
    L_0x10fd:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x10ff:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x1101:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x1103:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x1105:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x1107:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x1109:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fdf }
        throw r3;	 Catch:{ Exception -> 0x0fdf }
    L_0x110b:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
    L_0x110d:
        r3 = move-exception;
        r8 = r9;
        goto L_0x0fe0;
    L_0x1111:
        r6 = move-exception;
        r14 = r7;
        goto L_0x0bc0;
    L_0x1115:
        r6 = move-exception;
        r13 = r8;
        goto L_0x0bd7;
    L_0x1119:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x111b }
    L_0x111b:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x111d }
    L_0x111d:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
    L_0x111f:
        r3 = move-exception;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        r8 = r9;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        goto L_0x0feb;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
    L_0x1123:
        r3 = move-exception;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        throw r3;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
    L_0x1125:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x1127 }
    L_0x1127:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
    L_0x1129:
        r3 = move-exception;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
        throw r3;	 Catch:{ Exception -> 0x110d, all -> 0x111f }
    L_0x112b:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x112d }
    L_0x112d:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x112f, all -> 0x117d }
    L_0x112f:
        r3 = move-exception;
        r8 = r6;
        goto L_0x0fe0;
    L_0x1133:
        r2 = move-exception;
        r3 = z;
        r4 = 30;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x0dd9;
    L_0x113f:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0df7 }
    L_0x1141:
        r33.d();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 79;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r4 = r33.a();
        r2 = r2.append(r4);
        r3 = z;
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r44;
        r3 = r0.c;
        r4 = r3.length();
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        return;
    L_0x1179:
        r3 = move-exception;
        r8 = r14;
        goto L_0x0feb;
    L_0x117d:
        r3 = move-exception;
        r8 = r6;
        goto L_0x0feb;
    L_0x1181:
        r3 = move-exception;
        r8 = r14;
        goto L_0x0fe0;
    L_0x1185:
        r23 = r7;
        r24 = r8;
        r19 = r9;
        r26 = r11;
        r8 = r6;
        r6 = r27;
        goto L_0x06f8;
    L_0x1192:
        r3 = r6;
        goto L_0x0d01;
    L_0x1195:
        r7 = r23;
        r6 = r9;
        r8 = r24;
        r11 = r26;
        r9 = r25;
        goto L_0x0ceb;
    L_0x11a0:
        r6 = r8;
        goto L_0x0bd6;
    L_0x11a3:
        r13 = r8;
        goto L_0x0bd7;
    L_0x11a6:
        r6 = r7;
        goto L_0x0bbf;
    L_0x11a9:
        r14 = r7;
        goto L_0x0bc0;
    L_0x11ac:
        r7 = r23;
        r8 = r24;
        r11 = r26;
        r43 = r6;
        r6 = r9;
        r9 = r43;
        goto L_0x0ceb;
    L_0x11b9:
        r25 = r19;
        goto L_0x0b40;
    L_0x11bd:
        r11 = r9;
        r9 = r19;
        r43 = r7;
        r7 = r6;
        r6 = r8;
        r8 = r43;
        goto L_0x0ceb;
    L_0x11c8:
        r43 = r6;
        r6 = r7;
        r7 = r9;
        r9 = r11;
        r11 = r43;
        goto L_0x0b0c;
    L_0x11d1:
        r11 = r26;
        goto L_0x0ac4;
    L_0x11d5:
        r11 = r26;
        goto L_0x0ae5;
    L_0x11d9:
        r7 = r23;
        r43 = r9;
        r9 = r6;
        r6 = r43;
        goto L_0x0a59;
    L_0x11e2:
        r6 = r9;
        r7 = r23;
        r9 = r24;
        goto L_0x0a59;
    L_0x11e9:
        r9 = r6;
        goto L_0x0890;
    L_0x11ec:
        r7 = r23;
        r9 = r24;
        goto L_0x0a59;
    L_0x11f2:
        r7 = r23;
        r9 = r24;
        r11 = r26;
        goto L_0x0ae7;
    L_0x11fa:
        r9 = r8;
        goto L_0x0b2a;
    L_0x11fd:
        r3 = r8;
        goto L_0x0d01;
    L_0x1200:
        r22 = r6;
        goto L_0x066c;
    L_0x1204:
        r6 = r3;
        goto L_0x0f94;
    L_0x1207:
        r8 = r2;
        goto L_0x0e5a;
    L_0x120a:
        r30 = r2;
        goto L_0x0659;
    L_0x120e:
        r2 = r3;
        goto L_0x050c;
    L_0x1211:
        r2 = r5;
        r3 = r4;
        goto L_0x0343;
    L_0x1215:
        r5 = r2;
        r4 = r3;
        goto L_0x02b3;
    L_0x1219:
        r5 = r6;
        goto L_0x0229;
    L_0x121c:
        r4 = r6;
        goto L_0x014d;
    L_0x121f:
        r31 = r6;
        goto L_0x0153;
    L_0x1223:
        r7 = r5;
        r6 = r4;
        goto L_0x0110;
    L_0x1227:
        r3 = r4;
        goto L_0x00e4;
    L_0x122a:
        r2 = r3;
        r3 = r5;
        goto L_0x00e4;
    L_0x122e:
        r2 = r3;
        r4 = r5;
        goto L_0x00d6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.akr.d():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    public static synchronized com.whatsapp.ns e() {
        /*
        r1 = 16;
        r4 = 0;
        r2 = 1;
        r6 = com.whatsapp.akr.class;
        monitor-enter(r6);
        r7 = com.whatsapp.DialogToastActivity.f;	 Catch:{ all -> 0x02a9 }
        r0 = n;	 Catch:{ IllegalArgumentException -> 0x02a7 }
        if (r0 != 0) goto L_0x02a3;
    L_0x000d:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x02a7 }
        if (r0 < r1) goto L_0x029f;
    L_0x0011:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x02ac }
        if (r0 != r1) goto L_0x02f1;
    L_0x0015:
        r0 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x02ae }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02ae }
        r3 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02ae }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x02ae }
        if (r0 == 0) goto L_0x02f1;
    L_0x0023:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02b0 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02b0 }
        r3 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02b0 }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x02b0 }
        if (r0 != 0) goto L_0x00e7;
    L_0x0031:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02b2 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02b2 }
        r3 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02b2 }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x02b2 }
        if (r0 != 0) goto L_0x00e7;
    L_0x003f:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02b4 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02b4 }
        r3 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02b4 }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x02b4 }
        if (r0 != 0) goto L_0x00e7;
    L_0x004d:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02b6 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02b6 }
        r3 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02b6 }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x02b6 }
        if (r0 != 0) goto L_0x00e7;
    L_0x005b:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02b8 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02b8 }
        r3 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02b8 }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x02b8 }
        if (r0 != 0) goto L_0x00e7;
    L_0x0069:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02ba }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02ba }
        r3 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02ba }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x02ba }
        if (r0 != 0) goto L_0x00e7;
    L_0x0077:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02bc }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02bc }
        r3 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02bc }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x02bc }
        if (r0 != 0) goto L_0x00e7;
    L_0x0085:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02be }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02be }
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02be }
        r0 = r0.startsWith(r1);	 Catch:{ IllegalArgumentException -> 0x02be }
        if (r0 != 0) goto L_0x00e7;
    L_0x0093:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02c0 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02c0 }
        r3 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02c0 }
        r0 = r0.startsWith(r1);	 Catch:{ IllegalArgumentException -> 0x02c0 }
        if (r0 != 0) goto L_0x00e7;
    L_0x00a1:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02c2 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02c2 }
        r3 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02c2 }
        r0 = r0.startsWith(r1);	 Catch:{ IllegalArgumentException -> 0x02c2 }
        if (r0 != 0) goto L_0x00e7;
    L_0x00af:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02c4 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02c4 }
        r3 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02c4 }
        r0 = r0.startsWith(r1);	 Catch:{ IllegalArgumentException -> 0x02c4 }
        if (r0 != 0) goto L_0x00e7;
    L_0x00bd:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02c6 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02c6 }
        r3 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02c6 }
        r0 = r0.startsWith(r1);	 Catch:{ IllegalArgumentException -> 0x02c6 }
        if (r0 != 0) goto L_0x00e7;
    L_0x00cb:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02c8 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02c8 }
        r3 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02c8 }
        r0 = r0.startsWith(r1);	 Catch:{ IllegalArgumentException -> 0x02c8 }
        if (r0 != 0) goto L_0x00e7;
    L_0x00d9:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02c8 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02c8 }
        r3 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02c8 }
        r0 = r0.startsWith(r1);	 Catch:{ IllegalArgumentException -> 0x02c8 }
        if (r0 == 0) goto L_0x02f1;
    L_0x00e7:
        r0 = r2;
    L_0x00e8:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x02ca }
        r3 = 17;
        if (r1 != r3) goto L_0x0135;
    L_0x00ee:
        r1 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x02cc }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02cc }
        r5 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02cc }
        r1 = r1.equals(r3);	 Catch:{ IllegalArgumentException -> 0x02cc }
        if (r1 == 0) goto L_0x0135;
    L_0x00fc:
        r1 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02ce }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02ce }
        r5 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02ce }
        r1 = r1.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x02ce }
        if (r1 != 0) goto L_0x0134;
    L_0x010a:
        r1 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02d0 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02d0 }
        r5 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02d0 }
        r1 = r1.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x02d0 }
        if (r1 != 0) goto L_0x0134;
    L_0x0118:
        r1 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02d2 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02d2 }
        r5 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02d2 }
        r1 = r1.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x02d2 }
        if (r1 != 0) goto L_0x0134;
    L_0x0126:
        r1 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02d2 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02d2 }
        r5 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02d2 }
        r1 = r1.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x02d2 }
        if (r1 == 0) goto L_0x0135;
    L_0x0134:
        r0 = r2;
    L_0x0135:
        r1 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x02d4 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02d4 }
        r5 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02d4 }
        r1 = r1.equals(r3);	 Catch:{ IllegalArgumentException -> 0x02d4 }
        if (r1 == 0) goto L_0x0152;
    L_0x0143:
        r1 = android.os.Build.DEVICE;	 Catch:{ IllegalArgumentException -> 0x02d4 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02d4 }
        r5 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02d4 }
        r1 = r1.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x02d4 }
        if (r1 == 0) goto L_0x0152;
    L_0x0151:
        r0 = r2;
    L_0x0152:
        r1 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x02d6 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02d6 }
        r5 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02d6 }
        r1 = r1.equals(r3);	 Catch:{ IllegalArgumentException -> 0x02d6 }
        if (r1 == 0) goto L_0x016f;
    L_0x0160:
        r1 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x02d6 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02d6 }
        r5 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02d6 }
        r1 = r1.equals(r3);	 Catch:{ IllegalArgumentException -> 0x02d6 }
        if (r1 == 0) goto L_0x016f;
    L_0x016e:
        r0 = r2;
    L_0x016f:
        r1 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x02d8 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02d8 }
        r5 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02d8 }
        r1 = r1.equals(r3);	 Catch:{ IllegalArgumentException -> 0x02d8 }
        if (r1 == 0) goto L_0x02ee;
    L_0x017d:
        r1 = android.os.Build.DEVICE;	 Catch:{ IllegalArgumentException -> 0x02d8 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02d8 }
        r5 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x02d8 }
        r1 = r1.equals(r3);	 Catch:{ IllegalArgumentException -> 0x02d8 }
        if (r1 == 0) goto L_0x02ee;
    L_0x018b:
        r1 = r2;
    L_0x018c:
        r0 = 0;
        if (r1 == 0) goto L_0x01bc;
    L_0x018f:
        r1 = com.whatsapp.ns.UNSUPPORTED_BAD_DEVICE;	 Catch:{ all -> 0x02a9 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02a9 }
        r3.<init>();	 Catch:{ all -> 0x02a9 }
        r5 = z;	 Catch:{ all -> 0x02a9 }
        r8 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r5 = r5[r8];	 Catch:{ all -> 0x02a9 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x02a9 }
        r5 = android.os.Build.MANUFACTURER;	 Catch:{ all -> 0x02a9 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x02a9 }
        r5 = "-";
        r3 = r3.append(r5);	 Catch:{ all -> 0x02a9 }
        r5 = android.os.Build.MODEL;	 Catch:{ all -> 0x02a9 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x02a9 }
        r3 = r3.toString();	 Catch:{ all -> 0x02a9 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ all -> 0x02a9 }
        if (r7 == 0) goto L_0x02e9;
    L_0x01bc:
        r8 = android.media.MediaCodecList.getCodecCount();	 Catch:{ all -> 0x02a9 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02a9 }
        r1.<init>();	 Catch:{ all -> 0x02a9 }
        r3 = z;	 Catch:{ all -> 0x02a9 }
        r5 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r3 = r3[r5];	 Catch:{ all -> 0x02a9 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x02a9 }
        r1 = r1.append(r8);	 Catch:{ all -> 0x02a9 }
        r1 = r1.toString();	 Catch:{ all -> 0x02a9 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x02a9 }
        r5 = r4;
        r1 = r0;
        r0 = r4;
    L_0x01dd:
        if (r5 >= r8) goto L_0x023e;
    L_0x01df:
        if (r0 != 0) goto L_0x023e;
    L_0x01e1:
        r9 = android.media.MediaCodecList.getCodecInfoAt(r5);	 Catch:{ all -> 0x02a9 }
        r3 = r9.isEncoder();	 Catch:{ IllegalArgumentException -> 0x02da }
        if (r3 != 0) goto L_0x01ed;
    L_0x01eb:
        if (r7 == 0) goto L_0x023a;
    L_0x01ed:
        r3 = r9.getName();	 Catch:{ IllegalArgumentException -> 0x02de }
        r3 = c(r3);	 Catch:{ IllegalArgumentException -> 0x02de }
        if (r3 != 0) goto L_0x01f9;
    L_0x01f7:
        if (r7 == 0) goto L_0x023a;
    L_0x01f9:
        r10 = r9.getSupportedTypes();	 Catch:{ all -> 0x02a9 }
        r3 = r4;
    L_0x01fe:
        r11 = r10.length;	 Catch:{ all -> 0x02a9 }
        if (r3 >= r11) goto L_0x0216;
    L_0x0201:
        if (r0 != 0) goto L_0x0216;
    L_0x0203:
        r11 = r10[r3];	 Catch:{ IllegalArgumentException -> 0x02e0 }
        r12 = z;	 Catch:{ IllegalArgumentException -> 0x02e0 }
        r13 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r12 = r12[r13];	 Catch:{ IllegalArgumentException -> 0x02e0 }
        r11 = r11.equals(r12);	 Catch:{ IllegalArgumentException -> 0x02e0 }
        if (r11 == 0) goto L_0x0212;
    L_0x0211:
        r0 = r2;
    L_0x0212:
        r3 = r3 + 1;
        if (r7 == 0) goto L_0x01fe;
    L_0x0216:
        if (r0 == 0) goto L_0x023a;
    L_0x0218:
        r1 = r9.getName();	 Catch:{ all -> 0x02a9 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02a9 }
        r3.<init>();	 Catch:{ all -> 0x02a9 }
        r10 = z;	 Catch:{ all -> 0x02a9 }
        r11 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r10 = r10[r11];	 Catch:{ all -> 0x02a9 }
        r3 = r3.append(r10);	 Catch:{ all -> 0x02a9 }
        r9 = r9.getName();	 Catch:{ all -> 0x02a9 }
        r3 = r3.append(r9);	 Catch:{ all -> 0x02a9 }
        r3 = r3.toString();	 Catch:{ all -> 0x02a9 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ all -> 0x02a9 }
    L_0x023a:
        r3 = r5 + 1;
        if (r7 == 0) goto L_0x02e6;
    L_0x023e:
        r14 = r0;
        r0 = r1;
        r1 = r14;
        if (r1 == 0) goto L_0x0247;
    L_0x0243:
        r1 = com.whatsapp.ns.SUPPORTED;	 Catch:{ all -> 0x02a9 }
        if (r7 == 0) goto L_0x0252;
    L_0x0247:
        r1 = com.whatsapp.ns.UNSUPPORTED_NO_ENCODER;	 Catch:{ all -> 0x02a9 }
        r2 = z;	 Catch:{ all -> 0x02a9 }
        r3 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r2 = r2[r3];	 Catch:{ all -> 0x02a9 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ all -> 0x02a9 }
    L_0x0252:
        r14 = r0;
        r0 = r1;
        r1 = r14;
    L_0x0255:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x02e2 }
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x02e2 }
        r1 = r2.equals(r1);	 Catch:{ IllegalArgumentException -> 0x02e2 }
        if (r1 == 0) goto L_0x029d;
    L_0x0261:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02e4 }
        r2 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x02e4 }
        r1 = d(r1);	 Catch:{ IllegalArgumentException -> 0x02e4 }
        e = r1;	 Catch:{ IllegalArgumentException -> 0x02e4 }
        r1 = e;	 Catch:{ IllegalArgumentException -> 0x02e4 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalArgumentException -> 0x02e4 }
        if (r1 == 0) goto L_0x0281;
    L_0x0275:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02e4 }
        r2 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x02e4 }
        r1 = d(r1);	 Catch:{ IllegalArgumentException -> 0x02e4 }
        e = r1;	 Catch:{ IllegalArgumentException -> 0x02e4 }
    L_0x0281:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02a9 }
        r1.<init>();	 Catch:{ all -> 0x02a9 }
        r2 = z;	 Catch:{ all -> 0x02a9 }
        r3 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r2 = r2[r3];	 Catch:{ all -> 0x02a9 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x02a9 }
        r2 = e;	 Catch:{ all -> 0x02a9 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x02a9 }
        r1 = r1.toString();	 Catch:{ all -> 0x02a9 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x02a9 }
    L_0x029d:
        if (r7 == 0) goto L_0x02a1;
    L_0x029f:
        r0 = com.whatsapp.ns.UNSUPPORTED_OLD_API;	 Catch:{ all -> 0x02a9 }
    L_0x02a1:
        n = r0;	 Catch:{ all -> 0x02a9 }
    L_0x02a3:
        r0 = n;	 Catch:{ all -> 0x02a9 }
        monitor-exit(r6);
        return r0;
    L_0x02a7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x02a9 }
    L_0x02a9:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x02ac:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02ae }
    L_0x02ae:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02b0 }
    L_0x02b0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02b2 }
    L_0x02b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02b4 }
    L_0x02b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02b6 }
    L_0x02b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02b8 }
    L_0x02b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02ba }
    L_0x02ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02bc }
    L_0x02bc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02be }
    L_0x02be:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02c0 }
    L_0x02c0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02c2 }
    L_0x02c2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02c4 }
    L_0x02c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02c6 }
    L_0x02c6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02c8 }
    L_0x02c8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x02a9 }
    L_0x02ca:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02cc }
    L_0x02cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02ce }
    L_0x02ce:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02d0 }
    L_0x02d0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02d2 }
    L_0x02d2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x02a9 }
    L_0x02d4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x02a9 }
    L_0x02d6:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x02a9 }
    L_0x02d8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x02a9 }
    L_0x02da:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02dc }
    L_0x02dc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02de }
    L_0x02de:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x02a9 }
    L_0x02e0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x02a9 }
    L_0x02e2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02e4 }
    L_0x02e4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x02a9 }
    L_0x02e6:
        r5 = r3;
        goto L_0x01dd;
    L_0x02e9:
        r14 = r0;
        r0 = r1;
        r1 = r14;
        goto L_0x0255;
    L_0x02ee:
        r1 = r0;
        goto L_0x018c;
    L_0x02f1:
        r0 = r4;
        goto L_0x00e8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.akr.e():com.whatsapp.ns");
    }

    static boolean a(akr com_whatsapp_akr, boolean z) {
        com_whatsapp_akr.k = z;
        return z;
    }

    private static boolean c(String str) {
        if (str == null) {
            return false;
        }
        try {
            if (str.equals(z[166])) {
                return false;
            }
            try {
                if (str.equals(z[162])) {
                    return false;
                }
                try {
                    if (str.equals(z[164])) {
                        return false;
                    }
                    try {
                        if (str.equals(z[165])) {
                            return false;
                        }
                        try {
                            if (str.equals(z[163])) {
                                return false;
                            }
                            return true;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }
}
