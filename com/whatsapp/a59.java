package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class a59 {
    public static int a;
    public static String b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static boolean k;
    public static int l;
    public static boolean m;
    public static int n;
    public static ArrayList o;
    public static boolean p;
    public static boolean q;
    public static boolean r;
    private static final HashSet s;
    public static int t;
    private static final String[] z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 31;
                    break;
                case at.g /*1*/:
                    i2 = 39;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 53;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 53);
        }
        return toCharArray;
    }

    public static boolean d() {
        try {
            return !s.isEmpty();
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static long a(int i) {
        try {
            if (o.size() >= i) {
                return ((Long) o.get(i - 1)).longValue();
            }
            Log.e(z[80] + i + " " + App.z().getSharedPreferences(z[83], 0).getString(z[81], null) + z[82] + o.size());
            return 0;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static {
        boolean z = true;
        String[] strArr = new String[85];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "oWEX";
        boolean z2 = true;
        while (true) {
            str = z(z(str));
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "~WAL\\|FEIZq\bGNQ1HAE[gJ]FZmJPTF2HWF\\|BUOVjJTNA1P^RQoU^CPlTXNRrK\u001fDZ|R\\E[k";
                    i = 2;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "kBIT\u001amSW";
                    i = 3;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "{HR";
                    z2 = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "~WAL\\|FEIZq\bGNQ1JB\rEpPTREpN_T";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "gKB";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "{HRX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "k_E";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "mSW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "~WAL\\|FEIZq\b\\SBpUU";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "kBIT\u001aoKPI[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "~WAL\\|FEIZq\bADS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "~WAL\\|FEIZq\bCTS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "oCW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "~WAL\\|FEIZq\bGNQ1HAE[gJ]FZmJPTF2HWF\\|BUOVjJTNA1TARP~CBHPzS\\L\u001blOTEA";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "mSW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "~WAL\\|FEIZq\bGNQ1HAE[gJ]FZmJPTF2HWF\\|BUOVjJTNA1WCEFzIEAAvH_MY1WCEFzIEAAvH_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "oWE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "gKBX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "~REOQpP_LZ~CnW\\yNnMTlL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "kHB\u007f@oCPTP";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "yHCCP@K^NR@D^N[zDE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "vCTNAvSH\u007fCzUXF\\|FEIZq";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "kHB\u007f@oCPTP";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "{HRUXzIES";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "lBCVPmxARZoT\u000bLTlSnVPmTXO[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "kHBUE{FEE\u001a|OPNRzC\u0011FGpJ\u0011";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "pAW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "lBCVPmWCOEl\b^NfzUGEGOU^PPmSXEF0APIYzC";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "rBUIT@JPXj~REOQpP_LZ~C";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "~URH\\iB";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "kHB";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "lRSJP|SnLPq@EHjsN\\IA";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "xU^UElxBEGiBC\u007fEmHASjsFBTjmBWRPlOnT\\rB";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "rFI\u007fYvTE\u007fGzDXP\\zIES";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "~REOQpP_LZ~CnW\\yNnMTlL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "hEPRVwNGE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "vJPGP@JPXjzCVE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "rBUIT";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "vJPGP@JPXjtEHTPl";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "rFI\u007fE~UEIVvWPNAl";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "rBUIT@KXM\\kx\\B";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "rBUIT@KXM\\kxPUApxUOBqK^AQ@JS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "yHCCP@K^NR@D^N[zDE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "|H\\\u000eBwFESToWnPGzATRPqDTS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "yN]EjrFI\u007fFv]T";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "sHRAAvH_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "sHRAAvH_\u007fPqFSLP{";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "kHB\u007f@oCPTP";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "vCTNAvSH\u007fCzUXF\\|FEIZq";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "xCCICzxTNT}KTDjhBSS\\kB";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "rFI\u007fFjE[EVk";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "rFI\u007fRmHDPF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "vJPGP@JPXjzCVE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "oFCT\\|NAA[kTnS\\eBnL\\rNE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "vJPGP@VDAYvSH";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "vJPGP@VDAYvSH";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "pAW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "xU^UE@IDMWzUnL\\rNE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "xCCICzxTNT}KTDjoKPY";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "{HR\u007fAfWTS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "{HRUXzIE\u007fYvJXTjrE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "lHDRVz";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "vJPGP@JPXjtEHTPl";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "}U^AQ|FBTjsNBTjlNKEjsN\\IA";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "oKPCPlxBO@mDT";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "?S^\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "~WAL\\|FEIZq\b\\SBpUU";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "~WAL\\|FEIZq\bGNQ1HAE[gJ]FZmJPTF2HWF\\|BUOVjJTNA1TARP~CBHPzS\\L\u001blOTEA";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "~WAL\\|FEIZq\bADS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "~WAL\\|FEIZq\bGNQ1JB\rPgDTL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "~WAL\\|FEIZq\bGNQ1HAE[gJ]FZmJPTF2HWF\\|BUOVjJTNA1P^RQoU^CPlTXNRrK\u001fDZ|R\\E[k";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "kBIT\u001aoKPI[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "~WAL\\|FEIZq\bCTS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "~WAL\\|FEIZq\bGNQ1HAE[gJ]FZmJPTF2HWF\\|BUOVjJTNA1WCEFzIEAAvH_MY1WCEFzIEAAvH_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "~WAL\\|FEIZq\bGNQ1JB\rEpPTREpN_T";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "kBIT\u001amSW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "kHB\u007f@oCPTP";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "|H\\\u000eBwFESToWnPGzATRPqDTS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "lBCVPmWCOEl\bVEAkHBSA~@T\u000f\\qCTX\u0015";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "kHB\u007f@oCPTP";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "?KTNRkO\u000b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "|H\\\u000eBwFESToWnPGzATRPqDTS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "lBCVPmWCOEl\b^NfzUGEGOU^PPmSXEF0A^RX~S\u0011EGmHC\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        String z3;
                        n = 9999;
                        c = 50;
                        h = 25;
                        j = 256;
                        e = 16;
                        t = 32;
                        q = false;
                        l = 5120;
                        d = 80;
                        f = 1600;
                        k = false;
                        r = false;
                        p = false;
                        g = -1;
                        if (App.am >= 3) {
                            z3 = z(z("oCW\fQpDI\fQpD\u001dPEk_\u001dPEk\u000bILFg\u000bILF3SIT\u0019mSW"));
                        } else {
                            z3 = "";
                        }
                        b = z3;
                        s = new HashSet();
                        i = 64;
                        m = false;
                        SharedPreferences sharedPreferences = App.z().getSharedPreferences(z(z("|H\\\u000eBwFESToWnPGzATRPqDTS")), 0);
                        str = "lBCVPmxARZoT\u000bLTlSnVPmTXO[";
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        z2 = true;
                        while (true) {
                            str = z(z(str));
                            switch (z2) {
                                case v.m /*0*/:
                                    n = sharedPreferences2.getInt(str, n);
                                    str = "oFCT\\|NAA[kTnS\\eBnL\\rNE";
                                    sharedPreferences2 = sharedPreferences;
                                    z2 = true;
                                    break;
                                case at.g /*1*/:
                                    c = sharedPreferences2.getInt(str, c);
                                    str = "lRSJP|SnLPq@EHjsN\\IA";
                                    sharedPreferences2 = sharedPreferences;
                                    z2 = true;
                                    break;
                                case at.i /*2*/:
                                    h = sharedPreferences2.getInt(str, h);
                                    str = "rBUIT@KXM\\kx\\B";
                                    sharedPreferences2 = sharedPreferences;
                                    z2 = true;
                                    break;
                                case at.o /*3*/:
                                    e = sharedPreferences2.getInt(str, e);
                                    str = "rBUIT@KXM\\kxPUApxUOBqK^AQ@JS";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case at.p /*4*/:
                                    t = sharedPreferences2.getInt(str, t);
                                    str = "}U^AQ|FBTjsNBTjlNKEjsN\\IA";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case at.m /*5*/:
                                    j = sharedPreferences2.getInt(str, j);
                                    str = "sHRAAvH_\u007fPqFSLP{";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case Y.f /*6*/:
                                    q = sharedPreferences2.getBoolean(str, q);
                                    str = "vJPGP@JPXjtEHTPl";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case aF.v /*7*/:
                                    l = sharedPreferences2.getInt(str, l);
                                    str = "vJPGP@VDAYvSH";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case aF.u /*8*/:
                                    d = sharedPreferences2.getInt(str, d);
                                    str = "vJPGP@JPXjzCVE";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case Y.l /*9*/:
                                    f = sharedPreferences2.getInt(str, f);
                                    str = "xCCICzxTNT}KTDjhBSS\\kB";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case Y.t /*10*/:
                                    k = sharedPreferences2.getBoolean(str, k);
                                    str = "xCCICzxTNT}KTDjoKPY";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case Y.j /*11*/:
                                    r = sharedPreferences2.getBoolean(str, r);
                                    str = "yHCCP@K^NR@D^N[zDE";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case Y.p /*12*/:
                                    p = sharedPreferences2.getBoolean(str, p);
                                    str = "oKPCPlxBO@mDT";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case Y.q /*13*/:
                                    g = sharedPreferences2.getInt(str, g);
                                    str = "{HRUXzIES";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case arj.Toolbar_titleMarginEnd /*14*/:
                                    b = sharedPreferences2.getString(str, b);
                                    if (!TextUtils.isEmpty(b)) {
                                        s.addAll(Arrays.asList(b.split(",")));
                                    }
                                    str = "{HRUXzIE\u007fYvJXTjrE";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case arj.Toolbar_titleMarginTop /*15*/:
                                    i = sharedPreferences2.getInt(str, i);
                                    str = "vCTNAvSH\u007fCzUXF\\|FEIZq";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                                    m = sharedPreferences2.getBoolean(str, m);
                                    str = "kHB\u007f@oCPTP";
                                    z2 = true;
                                    sharedPreferences2 = sharedPreferences;
                                    break;
                                case arj.Toolbar_maxButtonHeight /*17*/:
                                    o = a(sharedPreferences2.getString(str, null));
                                    Editor edit = sharedPreferences.edit();
                                    z3 = "oKPI[kBITj{NBAWsBU";
                                    Editor editor = edit;
                                    while (true) {
                                        z3 = z(z(z3));
                                        switch (z) {
                                            case v.m /*0*/:
                                                editor.remove(z3);
                                                z3 = "rBBSTxBB\u007fFkFCTjoB_D\\q@nE\u0007zxBEFlN^N";
                                                z = true;
                                                editor = edit;
                                                break;
                                            case at.g /*1*/:
                                                editor.remove(z3);
                                                z3 = "z\u0015T\u007fRmHDPF";
                                                z = true;
                                                editor = edit;
                                                break;
                                            case at.i /*2*/:
                                                editor.remove(z3);
                                                z3 = "z\u0015T\u007fWsNBTF";
                                                z = true;
                                                editor = edit;
                                                break;
                                            case at.o /*3*/:
                                                editor.remove(z3);
                                                z3 = "z\u0015T\u007fCvCTO";
                                                z = true;
                                                editor = edit;
                                                break;
                                            case at.p /*4*/:
                                                editor.remove(z3);
                                                z3 = "z\u0015T\u007fTjCXO";
                                                z = true;
                                                editor = edit;
                                                break;
                                            case at.m /*5*/:
                                                editor.remove(z3);
                                                z3 = "z\u0015T\u007fCpNA";
                                                z = true;
                                                editor = edit;
                                                break;
                                            case Y.f /*6*/:
                                                editor.remove(z3);
                                                z3 = "z\u0015T\u007f\\rFVEF";
                                                z = true;
                                                editor = edit;
                                                break;
                                            case aF.v /*7*/:
                                                editor.remove(z3);
                                                z3 = "~RUIZ@HAUF";
                                                z = true;
                                                editor = edit;
                                                break;
                                            case aF.u /*8*/:
                                                editor.remove(z3);
                                                z3 = "lJPLY@DPLY@EEN";
                                                z = true;
                                                editor = edit;
                                                break;
                                            case Y.l /*9*/:
                                                editor.remove(z3);
                                                edit.commit();
                                                return;
                                            default:
                                                editor.remove(z3);
                                                z3 = "oKPI[kBITjmBTNT}KT\u007fAwUTS]pKU";
                                                z = false;
                                                editor = edit;
                                                break;
                                        }
                                    }
                                default:
                                    try {
                                        a = sharedPreferences2.getInt(str, 0);
                                        str = "xU^UE@IDMWzUnL\\rNE";
                                        sharedPreferences2 = sharedPreferences;
                                        z2 = false;
                                        break;
                                    } catch (NumberFormatException e) {
                                        throw e;
                                    }
                            }
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                default:
                    strArr2[i] = str;
                    str = "~WAL\\|FEIZq\bGNQ1JB\rPgDTL";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    public static boolean b() {
        try {
            return !o.isEmpty();
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.lang.String r9) {
        /*
        r2 = 4;
        r3 = 3;
        r4 = 2;
        r5 = 1;
        r1 = 0;
        r6 = com.whatsapp.DialogToastActivity.f;
        if (r9 != 0) goto L_0x000b;
    L_0x0009:
        r0 = r1;
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = -1;
        r7 = r9.hashCode();	 Catch:{ NumberFormatException -> 0x00ac }
        switch(r7) {
            case -1248334925: goto L_0x0018;
            case -1248332507: goto L_0x009c;
            case -1073633483: goto L_0x0044;
            case -1071817359: goto L_0x0070;
            case -1050893613: goto L_0x0027;
            case -1004732798: goto L_0x008d;
            case -366307023: goto L_0x0062;
            case 817335912: goto L_0x007e;
            case 904647503: goto L_0x0053;
            case 1993842850: goto L_0x0035;
            default: goto L_0x0013;
        };	 Catch:{ NumberFormatException -> 0x00ac }
    L_0x0013:
        switch(r0) {
            case 0: goto L_0x00c0;
            case 1: goto L_0x00c8;
            case 2: goto L_0x00cf;
            case 3: goto L_0x00d7;
            case 4: goto L_0x00dd;
            case 5: goto L_0x00e3;
            case 6: goto L_0x00ea;
            case 7: goto L_0x00f2;
            case 8: goto L_0x00fa;
            case 9: goto L_0x0102;
            default: goto L_0x0016;
        };	 Catch:{ NumberFormatException -> 0x00ac }
    L_0x0016:
        r0 = r1;
        goto L_0x000a;
    L_0x0018:
        r7 = z;	 Catch:{ NumberFormatException -> 0x00ac }
        r8 = 12;
        r7 = r7[r8];	 Catch:{ NumberFormatException -> 0x00ac }
        r7 = r9.equals(r7);	 Catch:{ NumberFormatException -> 0x00ac }
        if (r7 == 0) goto L_0x0013;
    L_0x0024:
        if (r6 == 0) goto L_0x011e;
    L_0x0026:
        r0 = r1;
    L_0x0027:
        r7 = z;	 Catch:{ NumberFormatException -> 0x00ae }
        r8 = 2;
        r7 = r7[r8];	 Catch:{ NumberFormatException -> 0x00ae }
        r7 = r9.equals(r7);	 Catch:{ NumberFormatException -> 0x00ae }
        if (r7 == 0) goto L_0x0013;
    L_0x0032:
        if (r6 == 0) goto L_0x011b;
    L_0x0034:
        r0 = r5;
    L_0x0035:
        r5 = z;	 Catch:{ NumberFormatException -> 0x00b0 }
        r7 = 15;
        r5 = r5[r7];	 Catch:{ NumberFormatException -> 0x00b0 }
        r5 = r9.equals(r5);	 Catch:{ NumberFormatException -> 0x00b0 }
        if (r5 == 0) goto L_0x0013;
    L_0x0041:
        if (r6 == 0) goto L_0x0118;
    L_0x0043:
        r0 = r4;
    L_0x0044:
        r4 = z;	 Catch:{ NumberFormatException -> 0x00b2 }
        r5 = 17;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00b2 }
        r4 = r9.equals(r4);	 Catch:{ NumberFormatException -> 0x00b2 }
        if (r4 == 0) goto L_0x0013;
    L_0x0050:
        if (r6 == 0) goto L_0x0115;
    L_0x0052:
        r0 = r3;
    L_0x0053:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00b4 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00b4 }
        r3 = r9.equals(r3);	 Catch:{ NumberFormatException -> 0x00b4 }
        if (r3 == 0) goto L_0x0013;
    L_0x005f:
        if (r6 == 0) goto L_0x0112;
    L_0x0061:
        r0 = r2;
    L_0x0062:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00b6 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00b6 }
        r3 = r9.equals(r3);	 Catch:{ NumberFormatException -> 0x00b6 }
        if (r3 == 0) goto L_0x0013;
    L_0x006d:
        r0 = 5;
        if (r6 == 0) goto L_0x0013;
    L_0x0070:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00b8 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00b8 }
        r3 = r9.equals(r3);	 Catch:{ NumberFormatException -> 0x00b8 }
        if (r3 == 0) goto L_0x0013;
    L_0x007b:
        r0 = 6;
        if (r6 == 0) goto L_0x0013;
    L_0x007e:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00ba }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00ba }
        r3 = r9.equals(r3);	 Catch:{ NumberFormatException -> 0x00ba }
        if (r3 == 0) goto L_0x0013;
    L_0x008a:
        r0 = 7;
        if (r6 == 0) goto L_0x0013;
    L_0x008d:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00bc }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00bc }
        r3 = r9.equals(r3);	 Catch:{ NumberFormatException -> 0x00bc }
        if (r3 == 0) goto L_0x0013;
    L_0x0098:
        r0 = 8;
        if (r6 == 0) goto L_0x0013;
    L_0x009c:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00be }
        r4 = 13;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00be }
        r3 = r9.equals(r3);	 Catch:{ NumberFormatException -> 0x00be }
        if (r3 == 0) goto L_0x0013;
    L_0x00a8:
        r0 = 9;
        goto L_0x0013;
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r0 = move-exception;
        throw r0;
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r0 = z;
        r3 = 14;
        r0 = r0[r3];
        if (r6 == 0) goto L_0x010a;
    L_0x00c8:
        r0 = z;
        r3 = 7;
        r0 = r0[r3];
        if (r6 == 0) goto L_0x010a;
    L_0x00cf:
        r0 = z;
        r3 = 19;
        r0 = r0[r3];
        if (r6 == 0) goto L_0x010a;
    L_0x00d7:
        r0 = z;
        r0 = r0[r1];
        if (r6 == 0) goto L_0x010a;
    L_0x00dd:
        r0 = z;
        r0 = r0[r2];
        if (r6 == 0) goto L_0x010a;
    L_0x00e3:
        r0 = z;
        r2 = 6;
        r0 = r0[r2];
        if (r6 == 0) goto L_0x010a;
    L_0x00ea:
        r0 = z;
        r2 = 18;
        r0 = r0[r2];
        if (r6 == 0) goto L_0x010a;
    L_0x00f2:
        r0 = z;
        r2 = 8;
        r0 = r0[r2];
        if (r6 == 0) goto L_0x010a;
    L_0x00fa:
        r0 = z;
        r2 = 16;
        r0 = r0[r2];
        if (r6 == 0) goto L_0x010a;
    L_0x0102:
        r0 = z;
        r2 = 9;
        r0 = r0[r2];
        if (r6 != 0) goto L_0x0016;
    L_0x010a:
        r1 = s;
        r0 = r1.contains(r0);
        goto L_0x000a;
    L_0x0112:
        r0 = r2;
        goto L_0x0013;
    L_0x0115:
        r0 = r3;
        goto L_0x0013;
    L_0x0118:
        r0 = r4;
        goto L_0x0013;
    L_0x011b:
        r0 = r5;
        goto L_0x0013;
    L_0x011e:
        r0 = r1;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a59.b(java.lang.String):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r8, java.util.Hashtable r9) {
        /*
        r1 = 1;
        r2 = 0;
        r0 = com.whatsapp.App.z();
        r3 = z;
        r4 = 45;
        r3 = r3[r4];
        r3 = r0.getSharedPreferences(r3, r2);
        r4 = r3.edit();
        a = r8;
        r0 = z;
        r5 = 26;
        r0 = r0[r5];
        r4.putInt(r0, r8);
        r0 = z;
        r5 = 41;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03a3 }
        if (r5 != 0) goto L_0x0044;
    L_0x0031:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03a3 }
        r0 = r0 + -1;
        c = r0;	 Catch:{ NumberFormatException -> 0x03a3 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03a3 }
        r5 = 55;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03a3 }
        r5 = c;	 Catch:{ NumberFormatException -> 0x03a3 }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03a3 }
    L_0x0044:
        r0 = z;
        r5 = 52;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03a5 }
        if (r5 != 0) goto L_0x0067;
    L_0x0056:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03a5 }
        h = r0;	 Catch:{ NumberFormatException -> 0x03a5 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03a5 }
        r5 = 33;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03a5 }
        r5 = h;	 Catch:{ NumberFormatException -> 0x03a5 }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03a5 }
    L_0x0067:
        r0 = z;
        r5 = 53;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03a7 }
        if (r5 != 0) goto L_0x008a;
    L_0x0079:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03a7 }
        n = r0;	 Catch:{ NumberFormatException -> 0x03a7 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03a7 }
        r5 = 59;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03a7 }
        r5 = n;	 Catch:{ NumberFormatException -> 0x03a7 }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03a7 }
    L_0x008a:
        r0 = z;
        r5 = 39;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03a9 }
        if (r5 != 0) goto L_0x00ad;
    L_0x009c:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03a9 }
        e = r0;	 Catch:{ NumberFormatException -> 0x03a9 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03a9 }
        r5 = 42;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03a9 }
        r5 = e;	 Catch:{ NumberFormatException -> 0x03a9 }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03a9 }
    L_0x00ad:
        r0 = z;
        r5 = 30;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);
        if (r5 != 0) goto L_0x00d4;
    L_0x00bf:
        r0 = java.lang.Integer.parseInt(r0);
        r5 = t;	 Catch:{ NumberFormatException -> 0x03ab }
        if (r0 == r5) goto L_0x00d4;
    L_0x00c7:
        t = r0;	 Catch:{ NumberFormatException -> 0x03ab }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03ab }
        r5 = 43;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03ab }
        r5 = t;	 Catch:{ NumberFormatException -> 0x03ab }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03ab }
    L_0x00d4:
        r0 = z;
        r5 = 35;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);
        if (r5 != 0) goto L_0x00fb;
    L_0x00e6:
        r0 = java.lang.Integer.parseInt(r0);
        r5 = j;	 Catch:{ NumberFormatException -> 0x03ad }
        if (r0 == r5) goto L_0x00fb;
    L_0x00ee:
        j = r0;	 Catch:{ NumberFormatException -> 0x03ad }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03ad }
        r5 = 65;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03ad }
        r5 = j;	 Catch:{ NumberFormatException -> 0x03ad }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03ad }
    L_0x00fb:
        r0 = z;
        r5 = 47;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03af }
        if (r5 != 0) goto L_0x0125;
    L_0x010d:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03b1 }
        if (r0 == 0) goto L_0x03b3;
    L_0x0113:
        r0 = r1;
    L_0x0114:
        r5 = q;	 Catch:{ NumberFormatException -> 0x03b6 }
        if (r0 == r5) goto L_0x0125;
    L_0x0118:
        q = r0;	 Catch:{ NumberFormatException -> 0x03b6 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03b6 }
        r5 = 48;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03b6 }
        r5 = q;	 Catch:{ NumberFormatException -> 0x03b6 }
        r4.putBoolean(r0, r5);	 Catch:{ NumberFormatException -> 0x03b6 }
    L_0x0125:
        r0 = z;
        r5 = 64;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03b8 }
        if (r5 != 0) goto L_0x0148;
    L_0x0137:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03b8 }
        l = r0;	 Catch:{ NumberFormatException -> 0x03b8 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03b8 }
        r5 = 40;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03b8 }
        r5 = l;	 Catch:{ NumberFormatException -> 0x03b8 }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03b8 }
    L_0x0148:
        r0 = z;
        r5 = 56;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03ba }
        if (r5 != 0) goto L_0x016b;
    L_0x015a:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03ba }
        d = r0;	 Catch:{ NumberFormatException -> 0x03ba }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03ba }
        r5 = 57;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03ba }
        r5 = d;	 Catch:{ NumberFormatException -> 0x03ba }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03ba }
    L_0x016b:
        r0 = z;
        r5 = 38;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03bc }
        if (r5 != 0) goto L_0x018e;
    L_0x017d:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03bc }
        f = r0;	 Catch:{ NumberFormatException -> 0x03bc }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03bc }
        r5 = 54;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03bc }
        r5 = f;	 Catch:{ NumberFormatException -> 0x03bc }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03bc }
    L_0x018e:
        r0 = z;
        r5 = 61;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x01ef;
    L_0x019c:
        r5 = b;	 Catch:{ NumberFormatException -> 0x03be }
        r5 = android.text.TextUtils.equals(r0, r5);	 Catch:{ NumberFormatException -> 0x03be }
        if (r5 != 0) goto L_0x01ef;
    L_0x01a4:
        r5 = b;	 Catch:{ NumberFormatException -> 0x03be }
        r5 = android.text.TextUtils.isEmpty(r5);	 Catch:{ NumberFormatException -> 0x03be }
        if (r5 == 0) goto L_0x01c3;
    L_0x01ac:
        r5 = z;
        r6 = 36;
        r5 = r5[r6];
        r5 = r3.getInt(r5, r2);
        if (r5 == 0) goto L_0x01c3;
    L_0x01b8:
        r6 = z;	 Catch:{ NumberFormatException -> 0x03c0 }
        r7 = 20;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x03c0 }
        r5 = r5 | 8;
        r4.putInt(r6, r5);	 Catch:{ NumberFormatException -> 0x03c0 }
    L_0x01c3:
        b = r0;	 Catch:{ NumberFormatException -> 0x03c2 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03c2 }
        r5 = 25;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03c2 }
        r5 = b;	 Catch:{ NumberFormatException -> 0x03c2 }
        r4.putString(r0, r5);	 Catch:{ NumberFormatException -> 0x03c2 }
        r0 = s;	 Catch:{ NumberFormatException -> 0x03c2 }
        r0.clear();	 Catch:{ NumberFormatException -> 0x03c2 }
        r0 = b;	 Catch:{ NumberFormatException -> 0x03c2 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03c2 }
        if (r0 != 0) goto L_0x01ef;
    L_0x01dd:
        r0 = s;	 Catch:{ NumberFormatException -> 0x03c2 }
        r5 = b;	 Catch:{ NumberFormatException -> 0x03c2 }
        r6 = ",";
        r5 = r5.split(r6);	 Catch:{ NumberFormatException -> 0x03c2 }
        r5 = java.util.Arrays.asList(r5);	 Catch:{ NumberFormatException -> 0x03c2 }
        r0.addAll(r5);	 Catch:{ NumberFormatException -> 0x03c2 }
    L_0x01ef:
        r0 = z;
        r5 = 46;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03c4 }
        if (r5 != 0) goto L_0x0212;
    L_0x0201:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03c4 }
        i = r0;	 Catch:{ NumberFormatException -> 0x03c4 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03c4 }
        r5 = 62;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03c4 }
        r5 = i;	 Catch:{ NumberFormatException -> 0x03c4 }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03c4 }
    L_0x0212:
        r0 = z;
        r5 = 37;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03c6 }
        if (r5 != 0) goto L_0x023c;
    L_0x0224:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03c8 }
        if (r0 == 0) goto L_0x03ca;
    L_0x022a:
        r0 = r1;
    L_0x022b:
        r5 = k;	 Catch:{ NumberFormatException -> 0x03cd }
        if (r0 == r5) goto L_0x023c;
    L_0x022f:
        k = r0;	 Catch:{ NumberFormatException -> 0x03cd }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03cd }
        r5 = 51;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03cd }
        r5 = k;	 Catch:{ NumberFormatException -> 0x03cd }
        r4.putBoolean(r0, r5);	 Catch:{ NumberFormatException -> 0x03cd }
    L_0x023c:
        r0 = z;
        r5 = 31;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03cf }
        if (r5 != 0) goto L_0x0266;
    L_0x024e:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03d1 }
        if (r0 == 0) goto L_0x03d3;
    L_0x0254:
        r0 = r1;
    L_0x0255:
        r5 = r;	 Catch:{ NumberFormatException -> 0x03d6 }
        if (r0 == r5) goto L_0x0266;
    L_0x0259:
        r = r0;	 Catch:{ NumberFormatException -> 0x03d6 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03d6 }
        r5 = 60;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03d6 }
        r5 = r;	 Catch:{ NumberFormatException -> 0x03d6 }
        r4.putBoolean(r0, r5);	 Catch:{ NumberFormatException -> 0x03d6 }
    L_0x0266:
        r0 = z;
        r5 = 22;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03d8 }
        if (r5 != 0) goto L_0x0290;
    L_0x0278:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03da }
        if (r0 == 0) goto L_0x03dc;
    L_0x027e:
        r0 = r1;
    L_0x027f:
        r5 = p;	 Catch:{ NumberFormatException -> 0x03df }
        if (r0 == r5) goto L_0x0290;
    L_0x0283:
        p = r0;	 Catch:{ NumberFormatException -> 0x03df }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03df }
        r5 = 44;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03df }
        r5 = p;	 Catch:{ NumberFormatException -> 0x03df }
        r4.putBoolean(r0, r5);	 Catch:{ NumberFormatException -> 0x03df }
    L_0x0290:
        r0 = z;
        r5 = 63;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);
        if (r5 != 0) goto L_0x02b7;
    L_0x02a2:
        r0 = java.lang.Integer.parseInt(r0);
        r5 = g;	 Catch:{ NumberFormatException -> 0x03e1 }
        if (r0 == r5) goto L_0x02b7;
    L_0x02aa:
        g = r0;	 Catch:{ NumberFormatException -> 0x03e1 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03e1 }
        r5 = 66;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x03e1 }
        r5 = g;	 Catch:{ NumberFormatException -> 0x03e1 }
        r4.putInt(r0, r5);	 Catch:{ NumberFormatException -> 0x03e1 }
    L_0x02b7:
        r0 = z;
        r5 = 50;
        r0 = r0[r5];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03e3 }
        if (r5 != 0) goto L_0x02e0;
    L_0x02c9:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x03e5 }
        if (r0 == 0) goto L_0x03e7;
    L_0x02cf:
        r0 = m;	 Catch:{ NumberFormatException -> 0x03ea }
        if (r1 == r0) goto L_0x02e0;
    L_0x02d3:
        m = r1;	 Catch:{ NumberFormatException -> 0x03ea }
        r0 = z;	 Catch:{ NumberFormatException -> 0x03ea }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03ea }
        r1 = m;	 Catch:{ NumberFormatException -> 0x03ea }
        r4.putBoolean(r0, r1);	 Catch:{ NumberFormatException -> 0x03ea }
    L_0x02e0:
        r0 = z;
        r1 = 32;
        r0 = r0[r1];
        r0 = r9.get(r0);
        r0 = (java.lang.String) r0;
        r1 = z;
        r2 = 49;
        r1 = r1[r2];
        r2 = 0;
        r1 = r3.getString(r1, r2);
        r2 = android.text.TextUtils.equals(r0, r1);	 Catch:{ NumberFormatException -> 0x03ec }
        if (r2 != 0) goto L_0x035f;
    L_0x02fd:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x03ee }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x03ee }
        r3 = z;	 Catch:{ NumberFormatException -> 0x03ee }
        r5 = 27;
        r3 = r3[r5];	 Catch:{ NumberFormatException -> 0x03ee }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x03ee }
        r1 = r2.append(r1);	 Catch:{ NumberFormatException -> 0x03ee }
        r2 = z;	 Catch:{ NumberFormatException -> 0x03ee }
        r3 = 67;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x03ee }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x03ee }
        r1 = r1.append(r0);	 Catch:{ NumberFormatException -> 0x03ee }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x03ee }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x03ee }
        r1 = o;	 Catch:{ NumberFormatException -> 0x03ee }
        r1.clear();	 Catch:{ NumberFormatException -> 0x03ee }
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03ee }
        if (r1 != 0) goto L_0x033c;
    L_0x0330:
        r1 = z;	 Catch:{ NumberFormatException -> 0x03f0 }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x03f0 }
        r1 = r1.equals(r0);	 Catch:{ NumberFormatException -> 0x03f0 }
        if (r1 == 0) goto L_0x0350;
    L_0x033c:
        r1 = z;	 Catch:{ NumberFormatException -> 0x03f2 }
        r2 = 21;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x03f2 }
        r4.remove(r1);	 Catch:{ NumberFormatException -> 0x03f2 }
        r1 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x03f2 }
        com.whatsapp.vh.h(r1);	 Catch:{ NumberFormatException -> 0x03f2 }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x03f2 }
        if (r1 == 0) goto L_0x035f;
    L_0x0350:
        r1 = z;	 Catch:{ NumberFormatException -> 0x03f2 }
        r2 = 24;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x03f2 }
        r4.putString(r1, r0);	 Catch:{ NumberFormatException -> 0x03f2 }
        r1 = a(r0);	 Catch:{ NumberFormatException -> 0x03f2 }
        o = r1;	 Catch:{ NumberFormatException -> 0x03f2 }
    L_0x035f:
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x03f4 }
        if (r1 != 0) goto L_0x0386;
    L_0x0365:
        r1 = z;	 Catch:{ NumberFormatException -> 0x03f6 }
        r2 = 28;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x03f6 }
        r0 = r1.equals(r0);	 Catch:{ NumberFormatException -> 0x03f6 }
        if (r0 != 0) goto L_0x0386;
    L_0x0371:
        r0 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x03f8 }
        r0 = com.whatsapp.vh.i(r0);	 Catch:{ NumberFormatException -> 0x03f8 }
        if (r0 == 0) goto L_0x0386;
    L_0x037b:
        r0 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x03f8 }
        r0 = com.whatsapp.vh.g(r0);	 Catch:{ NumberFormatException -> 0x03f8 }
        com.whatsapp.App.k(r0);	 Catch:{ NumberFormatException -> 0x03f8 }
    L_0x0386:
        r0 = z;	 Catch:{ NumberFormatException -> 0x03fa }
        r1 = 34;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03fa }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x03fa }
        r4.putLong(r0, r2);	 Catch:{ NumberFormatException -> 0x03fa }
        r0 = r4.commit();	 Catch:{ NumberFormatException -> 0x03fa }
        if (r0 != 0) goto L_0x03a2;
    L_0x0399:
        r0 = z;	 Catch:{ NumberFormatException -> 0x03fa }
        r1 = 29;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03fa }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x03fa }
    L_0x03a2:
        return;
    L_0x03a3:
        r0 = move-exception;
        throw r0;
    L_0x03a5:
        r0 = move-exception;
        throw r0;
    L_0x03a7:
        r0 = move-exception;
        throw r0;
    L_0x03a9:
        r0 = move-exception;
        throw r0;
    L_0x03ab:
        r0 = move-exception;
        throw r0;
    L_0x03ad:
        r0 = move-exception;
        throw r0;
    L_0x03af:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03b1 }
    L_0x03b1:
        r0 = move-exception;
        throw r0;
    L_0x03b3:
        r0 = r2;
        goto L_0x0114;
    L_0x03b6:
        r0 = move-exception;
        throw r0;
    L_0x03b8:
        r0 = move-exception;
        throw r0;
    L_0x03ba:
        r0 = move-exception;
        throw r0;
    L_0x03bc:
        r0 = move-exception;
        throw r0;
    L_0x03be:
        r0 = move-exception;
        throw r0;
    L_0x03c0:
        r0 = move-exception;
        throw r0;
    L_0x03c2:
        r0 = move-exception;
        throw r0;
    L_0x03c4:
        r0 = move-exception;
        throw r0;
    L_0x03c6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03c8 }
    L_0x03c8:
        r0 = move-exception;
        throw r0;
    L_0x03ca:
        r0 = r2;
        goto L_0x022b;
    L_0x03cd:
        r0 = move-exception;
        throw r0;
    L_0x03cf:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03d1 }
    L_0x03d1:
        r0 = move-exception;
        throw r0;
    L_0x03d3:
        r0 = r2;
        goto L_0x0255;
    L_0x03d6:
        r0 = move-exception;
        throw r0;
    L_0x03d8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03da }
    L_0x03da:
        r0 = move-exception;
        throw r0;
    L_0x03dc:
        r0 = r2;
        goto L_0x027f;
    L_0x03df:
        r0 = move-exception;
        throw r0;
    L_0x03e1:
        r0 = move-exception;
        throw r0;
    L_0x03e3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03e5 }
    L_0x03e5:
        r0 = move-exception;
        throw r0;
    L_0x03e7:
        r1 = r2;
        goto L_0x02cf;
    L_0x03ea:
        r0 = move-exception;
        throw r0;
    L_0x03ec:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ee }
    L_0x03ee:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03f0 }
    L_0x03f0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03f2 }
    L_0x03f2:
        r0 = move-exception;
        throw r0;
    L_0x03f4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03f6 }
    L_0x03f6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03f8 }
    L_0x03f8:
        r0 = move-exception;
        throw r0;
    L_0x03fa:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a59.a(int, java.util.Hashtable):void");
    }

    public static ArrayList c() {
        int i = 0;
        boolean z = DialogToastActivity.f;
        String[] strArr = new String[]{z[70], z[72], z[69], z[75], z[68], z[71], z[76], z[73], z[74], z[77]};
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        while (i < length) {
            String str = strArr[i];
            try {
                if (b(str)) {
                    arrayList.add(str);
                }
                i++;
                if (z) {
                    break;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return arrayList;
    }

    public static void a() {
        o.clear();
        App.z().getSharedPreferences(z[79], 0).edit().remove(z[78]).commit();
    }

    private static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    for (String parseInt : str.split("-")) {
                        arrayList.add(Long.valueOf(((long) Integer.parseInt(parseInt)) * 3600000));
                    }
                } catch (NumberFormatException e) {
                    arrayList.clear();
                    Log.e(z[84] + str);
                }
            }
            return arrayList;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }
}
