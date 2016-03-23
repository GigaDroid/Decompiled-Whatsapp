package com.whatsapp;

import android.os.Build.VERSION;
import android.os.Process;
import android.util.Pair;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.RequestExpectContinue;
import org.json.JSONException;
import org.json.JSONObject;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class amb {
    public static int a;
    private static final String[] z;

    static {
        String[] strArr = new String[191];
        String str = "94";
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
                        i3 = 80;
                        break;
                    case at.g /*1*/:
                        i3 = 80;
                        break;
                    case at.i /*2*/:
                        i3 = 98;
                        break;
                    case at.o /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 37;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "3?\u0006P";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "$?\rjH1>\u001bjB%5\u0011F@#";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "<7";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "2<\rVN54";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "61\u000bY";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "$)\u0012P";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\"5\u0016G\\\u000f1\u0004A@\"";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "$5\u000fEJ\"1\u0010\\I)\u000f\u0017[D&1\u000bYD2<\u0007";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "=9\u0011XD$3\n";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "8$\u0016E\n&5\u0010\\C)3\rQ@\u007f\"\u0007FP<$MPW\"?\u0010\u001aP>;\fZR>}\u0011AD$%\u0011\u0015";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\"5\u0016G\\\u000f1\u0004A@\"";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "=9\u0011FL>7";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "33";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "?;";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\"5\u0003FJ>";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ">?BG@# \r[V5";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = " '";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "#$\u0003Y@";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "8$\u0016E\n&5\u0010\\C)3\rQ@\u007f5\u0010GJ\"p\u0011AD$%\u0011\b";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "5>\u0016PW54";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "9>";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "<3";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "=9\u0011A\\ 5\u0006";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "8$\u0016E\n&5\u0010\\C)3\rQ@\u007f#\u0016TQ%#MPW\"?\u0010\u0018K?}\u0011AD$%\u0011";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = ">5\u0015";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "$)\u0012P";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "?;BFQ1$\u0017F\u00052%\u0016\u0015I?7\u000b[\u0005?\"BERp9\u0011\u0015K%<\u000e";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "8$\u0016E\n&5\u0010\\C)3\rQ@\u007f8\u0016AU5\"\u0010ZW";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "#$\u0003AP#";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "8$\u0016E\n&5\u0010\\C)3\rQ@\u007f#\u0016TQ%#MPW\"?\u0010\u0018V$1\u0016@V}?\t\u0018K?}\u000eZB9>OZW} \u0015";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "31\f[J$p\u0012TW#5B\u007fv\u001f\u001eBSW?=BF@\"&\u0007G";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "<?\u0005\\K";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0007GW?\"BFQ1$\u0017F\u0018";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u000fPQ8?\u0006\u001aL<<\u0007RD<p";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\"5\u0003FJ>";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0010PV%<\u0016\u001a@\"\"\rG\n \"\rCL45\u0010\u0018P>\"\r@Q12\u000eP";
                    obj = 36;
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    strArr2 = strArr3;
                    str = "&?\u000bV@\u000f'\u0003\\Q";
                    obj = 37;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0004TL<\u007f\fZ\b\"5\u0003FJ>}\u0005\\S5>";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0010PV%<\u0016\u001a@\"\"\rG\n21\u0006ED\"1\u000f\u001a";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "#$\u0003AP#";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "$?\rjH1>\u001bjB%5\u0011F@#";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = " 1\u0010TH";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "=9\u0011FL>7=ED\"1\u000f";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "$5\u000fEJ\"1\u0010\\I)\u000f\u0017[D&1\u000bYD2<\u0007";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "&?\u000bV@\u000f'\u0003\\Q";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "21\u0006jQ?;\u0007[";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\"5\u0003FJ>";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = ">?BG@# \r[V5";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = ">5\u0015";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "#5\fA";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "#=\u0011jR19\u0016";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0010PV%<\u0016\u001a@\"\"\rG\n21\u0006\u0018Q?;\u0007[";
                    obj = 52;
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    strArr2 = strArr3;
                    str = "8$\u0016E\n\"5\u0013@@#$MVJ45MTQ$1\u0001]@4\u007f\fZ\b3?\u0006P\b6?\u0017[A";
                    obj = 53;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = " \"\rCL45\u0010jQ9=\u0007ZP$";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "?;";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\"5\u0016G\\\u000f1\u0004A@\"";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "94";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "$)\u0012P";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "=5\u0016]J4";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\"5\u0016G\\\u000f1\u0004A@\"";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "<?\u0005\\K";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "#=\u0011jR19\u0016";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "8$\u0016E\n38\u0007VN\"5\u000b[V$1\u000eY\n#$\u0003AP#\u007f\u0007GW?\"OFQ1$\u0017F\b?;O[J}<\rRL>}\rG\b '";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = " 1\u0010TH";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "#=\u0011jR19\u0016";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = " \"\rCL45\u0010jP>\"\r@Q12\u000eP";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "2<\rVN54";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "<7";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "&?\u000bV@\u000f'\u0003\\Q";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0010PV%<\u0016\u001a@\"\"\rG\n \"\rCL45\u0010\u0018Q9=\u0007ZP$";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "3?\u0006P";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "21\u0006jU1\"\u0003X";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0010PV%<\u0016\u001a@\"\"\rG\n>?OGJ%$\u0007F";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "$)\u0012P";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0011@F35\u0011F\n<5\fRQ8}\rG\b$9\u000fP\b>?\u0016\u0018C?%\fQ";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "&?\u000bV@\u000f'\u0003\\Q";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "#=\u0011jR19\u0016";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0011AD$%\u0011\u001a@\"\"\rG\b>?OFQ1$\u0017F";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    str = "?;BFQ1$\u0017F\u00052%\u0016\u0015I?7\u000b[\u0005?\"BERp9\u0011\u0015K%<\u000e";
                    obj = 79;
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    strArr2 = strArr3;
                    str = "#9\u000fjH33";
                    obj = 80;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "=5\u0016]J4";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "\"5\u0016G\\\u000f1\u0004A@\"";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "33";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "#9\u000fjH>3";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "=9\u0011A\\ 5\u0006";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "\"5\u0016G\\\u000f1\u0004A@\"";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "#=\u0011";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "=>\u0001";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "$?\tPK";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0010PV%<\u0016\u001a@\"\"\rG\n%>\t[J'>OFQ1$\u0017F\u0005";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "1$\u0016TF85\u0006";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "#=\u0011jR19\u0016";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "\"5\u0016G\\\u000f1\u0004A@\"";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "$?\rjH1>\u001bjD<<=X@$8\rQV";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = ">5\u001aAz=5\u0016]J4";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0010PV%<\u0016\u001a@\"\"\rG\n2<\rVN54";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0010PV%<\u0016\u001a@\"\"\rG\n$?\r\u0018H1>\u001b\u0018D<<OX@$8\rQV";
                    obj = 97;
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    strArr2 = strArr3;
                    str = "9>";
                    obj = 98;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "&?\u000bV@\u000f'\u0003\\Q";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "<3";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "?<\u0006jS5\"\u0011\\J>";
                    obj = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "=3\u0001";
                    obj = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "31\f[J$p\u0012TW#5B\u007fv\u001f\u001eBSW?=BF@\"&\u0007G";
                    obj = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "#5\u000eS";
                    obj = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "\"5\u0016G\\\u000f1\u0004A@\"";
                    obj = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "#=\u0011jR19\u0016";
                    obj = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = " '";
                    obj = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "&?\u000bV@";
                    obj = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "61\u000bY";
                    obj = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "8$\u0016E\n\"5\u0013@@#$\u0001ZA5\u007f\u0010PV%<\u0016\u001a@\"\"\rG\n=9\u0011FL>7OED\"1\u000f\u001a";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "&?\u000bV@\u000f'\u0003\\Q";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "$?\rjH1>\u001b";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "<5\fRQ8";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = ">?=GJ%$\u0007F";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "$?\rjW53\u0007[Q";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = "=?\u0017[Q54";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = "38\u0007VN9>\u0005";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = "%>\u000fZP>$\u0007Q";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "%>\u000fZP>$\u0003WI5";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "=?\u0017[Q54=GJ";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "#8\u0003G@4";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "21\u0006jW5=\rCD<";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "\"5\u000fZS54";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "%>\t[J'>";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = ">?\u0004F";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = "#9\u000f[P=";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = " 9\u0006";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "3?\u0012\\@4\"\u0001";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = "81\u0011\\K\"3";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = "\"3\nTV8";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = "5(\u0016FQ1$\u0007";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = ">5\u0016BJ\";=GD49\rjQ) \u0007";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = "5(\u0016P]9#\u0016";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "\"3\u000fTQ38";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "1>\nTV8";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "<5\fRQ8\u000f\u000eZK7";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = "31\f[J$p\u0012TW#5B\u007fv\u001f\u001eBSW?=BF@\"&\u0007G";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = "?;BFQ1$\u0017F\u00052%\u0016\u0015H9#\u0011\\K7p\u0006TQ1";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = " '";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = "&?\u000bV@\u000f'\u0003\\Q";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = "\"5\u0016G\\\u000f1\u0004A@\"";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = "94";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = "<?\u0005\\K";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    i = 145;
                    str = "9>";
                    obj = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i] = str;
                    i = 146;
                    str = "6?\u0010XD$\u000f\u0015GJ>7";
                    obj = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i] = str;
                    i = 147;
                    str = "%>\t[J'>BFQ1$\u0017F";
                    obj = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i] = str;
                    i = 148;
                    str = "8$\u0016E\n38\u0007VN\"5\u000b[V$1\u000eY\n#$\u0003AP#\u007f\u0007GW?\"OFQ1$\u0017F\b?;OXL##\u000b[B}4\u0003AD";
                    obj = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i] = str;
                    i = 149;
                    str = ">?BFQ1$\u0017F";
                    obj = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i] = str;
                    i = 150;
                    str = "?<\u0006jS5\"\u0011\\J>";
                    obj = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i] = str;
                    i = 151;
                    str = "8$\u0016E\n38\u0007VN\"5\u000b[V$1\u000eY\n61\u000bY\n\"5\u0003FJ>jB@K;>\rBKp\"\u0007TV?>X\u0015";
                    obj = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i] = str;
                    i = 152;
                    str = "9>\u0001ZW\"5\u0001A";
                    obj = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i] = str;
                    i = 153;
                    str = "2<\rVN54";
                    obj = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i] = str;
                    i = 154;
                    str = "&?\u000bV@\u000f<\u0007[B$8";
                    obj = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i] = str;
                    i = 155;
                    str = "#=\u0011jR19\u0016";
                    obj = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i] = str;
                    i = 156;
                    str = "8$\u0016E\n38\u0007VN\"5\u000b[V$1\u000eY\n#$\u0003AP#\u007f\u0007GW?\"O[J}#\u0016TQ%#";
                    obj = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i] = str;
                    i = 157;
                    str = "&?\u000bV@\u000f'\u0003\\Q";
                    obj = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i] = str;
                    i = 158;
                    str = ">?BG@# \r[V5";
                    obj = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i] = str;
                    i = 159;
                    str = "#$\u0003AP#";
                    obj = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i] = str;
                    i = 160;
                    str = "8$\u0016E\n38\u0007VN\"5\u000b[V$1\u000eY\n\"5\u0011@I$\u007f\u0007GW?\"M@K;>\rBK}#\u0016TQ%#B";
                    obj = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i] = str;
                    i = 161;
                    str = "61\u000bY\tp%\f^K?'\f\u0015W51\u0011ZK";
                    obj = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i] = str;
                    i = 162;
                    str = "\"5\u0003FJ>";
                    obj = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i] = str;
                    i = 163;
                    str = "#=\u0011jR19\u0016";
                    obj = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i] = str;
                    i = 164;
                    str = "#=\u0011jI5>\u0005AM";
                    obj = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i] = str;
                    i = 165;
                    str = "61\u000bY";
                    obj = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i] = str;
                    i = 166;
                    str = "$5\u000fEJ\"1\u0010\\I)\u000f\u0017[D&1\u000bYD2<\u0007";
                    obj = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i] = str;
                    i = 167;
                    str = "\"5\u0016G\\\u000f1\u0004A@\"";
                    obj = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i] = str;
                    i = 168;
                    str = "33";
                    obj = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i] = str;
                    i = 169;
                    str = "?;";
                    obj = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i] = str;
                    i = 170;
                    str = ">5\u0015";
                    obj = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i] = str;
                    i = 171;
                    str = "21\u0006jQ?;\u0007[";
                    obj = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i] = str;
                    i = 172;
                    str = "8$\u0016E\n38\u0007VN\"5\u000b[V$1\u000eY\n5\"\u0010ZWp#\u0016TQ%#_";
                    obj = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i] = str;
                    i = 173;
                    str = "21\u0006\u0015M$$\u0012\u0015V$1\u0016@Vp3\rQ@jp";
                    obj = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i] = str;
                    i = 174;
                    str = "=9\u0011A\\ 5\u0006";
                    obj = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i] = str;
                    i = 175;
                    str = "<3";
                    obj = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i] = str;
                    i = 176;
                    str = "$)\u0012P";
                    obj = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i] = str;
                    i = 177;
                    str = "<7";
                    obj = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i] = str;
                    i = 178;
                    str = "$?\tPK";
                    obj = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i] = str;
                    i = 179;
                    str = "<5\fRQ8\u000f\u0011]J\"$";
                    obj = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i] = str;
                    i = 180;
                    str = "$)\u0012P";
                    obj = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i] = str;
                    i = 181;
                    str = "\u0005\u0004$\u0018\u001d";
                    obj = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i] = str;
                    i = 182;
                    str = "8$\u0016E\n5>\u0016G\\=5\u0016]J4\u007f\u0017[N>?\u0015[";
                    obj = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i] = str;
                    i = 183;
                    str = "$\"\u0017P";
                    obj = 182;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i] = str;
                    i = 184;
                    str = "\u0005\u0004$\u0018\u001d";
                    obj = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i] = str;
                    i = 185;
                    str = "1&\u0003\\I12\u000eP";
                    obj = 184;
                    strArr2 = strArr3;
                    break;
                case 184:
                    strArr2[i] = str;
                    i = 186;
                    str = "5\"\u0010ZWp \u0003GV9>\u0005\u0015O#?\f\u000f\u0005";
                    obj = 185;
                    strArr2 = strArr3;
                    break;
                case 185:
                    strArr2[i] = str;
                    i = 187;
                    str = "8$\u0016E\n#5\u0010C@\"#\u0016TQ%#MPW\"?\u0010\u0015";
                    obj = 186;
                    strArr2 = strArr3;
                    break;
                case 186:
                    strArr2[i] = str;
                    i = 188;
                    str = "5\"\u0010ZWp \u0003GV9>\u0005\u0015O#?\f";
                    obj = 187;
                    strArr2 = strArr3;
                    break;
                case 187:
                    strArr2[i] = str;
                    i = 189;
                    str = "8$\u0016E\n#5\u0010C@\"#\u0016TQ%#MPW\"?\u0010\u0015V$1\u0016@Vm";
                    obj = 188;
                    strArr2 = strArr3;
                    break;
                case 188:
                    strArr2[i] = str;
                    i = 190;
                    str = "61\u000eF@";
                    obj = 189;
                    strArr2 = strArr3;
                    break;
                case 189:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "7%\u0007FV54=AJ?\u000f\u0004TV$";
                    obj = null;
                    break;
            }
        }
    }

    private static boolean a() {
        String j = VerifyNumber.j();
        if (j != null) {
            try {
                if (j.length() >= 6) {
                    return true;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.ut a(java.lang.String r11, java.lang.String r12, java.lang.String r13, com.whatsapp.as r14, java.lang.String r15) {
        /*
        r1 = 1;
        r2 = 0;
        r4 = a;
        r3 = com.whatsapp.aqu.c();
        r5 = com.whatsapp.aqu.g();
        if (r11 == 0) goto L_0x010f;
    L_0x000e:
        r0 = r1;
    L_0x000f:
        com.whatsapp.util.Log.b(r0);	 Catch:{ HttpException -> 0x0112 }
        if (r12 == 0) goto L_0x0114;
    L_0x0014:
        r0 = r1;
    L_0x0015:
        com.whatsapp.util.Log.b(r0);	 Catch:{ HttpException -> 0x0117 }
        if (r13 == 0) goto L_0x0119;
    L_0x001a:
        r0 = r1;
    L_0x001b:
        com.whatsapp.util.Log.b(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r11);
        r0 = r0.append(r12);
        r0 = r0.toString();
        r6 = com.whatsapp.App.D(r0);
        r0 = com.whatsapp.ve.e(r6);
        if (r0 != 0) goto L_0x0040;
    L_0x0039:
        r0 = com.whatsapp.ve.d();
        com.whatsapp.ve.a(r0, r6);
    L_0x0040:
        r6 = new java.util.ArrayList;
        r6.<init>();
        if (r15 == 0) goto L_0x0058;
    L_0x0047:
        r7 = z;	 Catch:{ HttpException -> 0x011c }
        r8 = 24;
        r7 = r7[r8];	 Catch:{ HttpException -> 0x011c }
        r8 = r15.getBytes();	 Catch:{ HttpException -> 0x011c }
        r7 = android.util.Pair.create(r7, r8);	 Catch:{ HttpException -> 0x011c }
        r6.add(r7);	 Catch:{ HttpException -> 0x011c }
    L_0x0058:
        r7 = z;
        r8 = 14;
        r7 = r7[r8];
        r8 = r11.getBytes();
        r7 = android.util.Pair.create(r7, r8);
        r6.add(r7);
        r7 = z;
        r8 = 22;
        r7 = r7[r8];
        r8 = r12.getBytes();
        r7 = android.util.Pair.create(r7, r8);
        r6.add(r7);
        r7 = z;
        r8 = 4;
        r7 = r7[r8];
        r5 = r5.getBytes();
        r5 = android.util.Pair.create(r7, r5);
        r6.add(r5);
        r5 = z;
        r7 = 23;
        r5 = r5[r7];
        r3 = r3.getBytes();
        r3 = android.util.Pair.create(r5, r3);
        r6.add(r3);
        r3 = z;
        r3 = r3[r2];
        r0 = android.util.Pair.create(r3, r0);
        r6.add(r0);
        r0 = z;
        r3 = 2;
        r0 = r0[r3];
        r3 = r13.getBytes();
        r0 = android.util.Pair.create(r0, r3);
        r6.add(r0);
        r0 = z;
        r3 = 21;
        r0 = r0[r3];
        r3 = a(r14);
        r3 = java.lang.String.valueOf(r3);
        r3 = r3.getBytes();
        r0 = android.util.Pair.create(r0, r3);
        r6.add(r0);
        a(r6);
        r0 = b(r6);
        r3 = new java.lang.StringBuilder;	 Catch:{ HttpException -> 0x00fd }
        r3.<init>();	 Catch:{ HttpException -> 0x00fd }
        r5 = com.whatsapp.azx.o;	 Catch:{ HttpException -> 0x00fd }
        r3 = r3.append(r5);	 Catch:{ HttpException -> 0x00fd }
        r0 = r3.append(r0);	 Catch:{ HttpException -> 0x00fd }
        r0 = r0.toString();	 Catch:{ HttpException -> 0x00fd }
        r0 = com.whatsapp.avp.a(r0);	 Catch:{ HttpException -> 0x00fd }
        if (r0 != 0) goto L_0x011e;
    L_0x00ef:
        r0 = new java.io.IOException;	 Catch:{ HttpException -> 0x00fb }
        r1 = z;	 Catch:{ HttpException -> 0x00fb }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x00fb }
        r0.<init>(r1);	 Catch:{ HttpException -> 0x00fb }
        throw r0;	 Catch:{ HttpException -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        r0 = z;
        r1 = 29;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = new com.whatsapp.ut;
        r1 = com.whatsapp.v4.ERROR_UNSPECIFIED;
        r0.<init>(r1);
    L_0x010e:
        return r0;
    L_0x010f:
        r0 = r2;
        goto L_0x000f;
    L_0x0112:
        r0 = move-exception;
        throw r0;
    L_0x0114:
        r0 = r2;
        goto L_0x0015;
    L_0x0117:
        r0 = move-exception;
        throw r0;
    L_0x0119:
        r0 = r2;
        goto L_0x001b;
    L_0x011c:
        r0 = move-exception;
        throw r0;
    L_0x011e:
        r3 = r0.getStatusLine();	 Catch:{ HttpException -> 0x00fd }
        r3 = r3.getStatusCode();	 Catch:{ HttpException -> 0x00fd }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 == r5) goto L_0x014c;
    L_0x012a:
        r0 = new java.lang.StringBuilder;	 Catch:{ HttpException -> 0x00fd }
        r0.<init>();	 Catch:{ HttpException -> 0x00fd }
        r1 = z;	 Catch:{ HttpException -> 0x00fd }
        r2 = 20;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x00fd }
        r0 = r0.append(r1);	 Catch:{ HttpException -> 0x00fd }
        r0 = r0.append(r3);	 Catch:{ HttpException -> 0x00fd }
        r0 = r0.toString();	 Catch:{ HttpException -> 0x00fd }
        com.whatsapp.util.Log.e(r0);	 Catch:{ HttpException -> 0x00fd }
        r0 = new com.whatsapp.ut;	 Catch:{ HttpException -> 0x00fd }
        r1 = com.whatsapp.v4.ERROR_UNSPECIFIED;	 Catch:{ HttpException -> 0x00fd }
        r0.<init>(r1);	 Catch:{ HttpException -> 0x00fd }
        goto L_0x010e;
    L_0x014c:
        r0 = r0.getEntity();	 Catch:{ HttpException -> 0x00fd }
        r0 = r0.getContent();	 Catch:{ HttpException -> 0x00fd }
        r0 = a(r0);	 Catch:{ HttpException -> 0x00fd }
        if (r0 != 0) goto L_0x0168;
    L_0x015a:
        r0 = new org.json.JSONException;	 Catch:{ HttpException -> 0x0166 }
        r1 = z;	 Catch:{ HttpException -> 0x0166 }
        r2 = 32;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x0166 }
        r0.<init>(r1);	 Catch:{ HttpException -> 0x0166 }
        throw r0;	 Catch:{ HttpException -> 0x0166 }
    L_0x0166:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x00fd }
    L_0x0168:
        r3 = new com.whatsapp.ut;	 Catch:{ HttpException -> 0x00fd }
        r5 = com.whatsapp.v4.ERROR_UNSPECIFIED;	 Catch:{ HttpException -> 0x00fd }
        r3.<init>(r5);	 Catch:{ HttpException -> 0x00fd }
        r5 = z;	 Catch:{ HttpException -> 0x00fd }
        r6 = 30;
        r5 = r5[r6];	 Catch:{ HttpException -> 0x00fd }
        r5 = r0.getString(r5);	 Catch:{ HttpException -> 0x00fd }
        if (r5 != 0) goto L_0x0186;
    L_0x017b:
        r6 = z;	 Catch:{ HttpException -> 0x01e2 }
        r7 = 25;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x01e2 }
        com.whatsapp.util.Log.e(r6);	 Catch:{ HttpException -> 0x01e2 }
        if (r4 == 0) goto L_0x02cd;
    L_0x0186:
        r6 = z;	 Catch:{ HttpException -> 0x01e4 }
        r7 = 15;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x01e4 }
        r6 = r5.equals(r6);	 Catch:{ HttpException -> 0x01e4 }
        if (r6 == 0) goto L_0x01fd;
    L_0x0192:
        r6 = z;	 Catch:{ HttpException -> 0x00fd }
        r7 = 33;
        r6 = r6[r7];	 Catch:{ HttpException -> 0x00fd }
        r6 = r0.getString(r6);	 Catch:{ HttpException -> 0x00fd }
        r7 = z;	 Catch:{ HttpException -> 0x00fd }
        r8 = 18;
        r7 = r7[r8];	 Catch:{ HttpException -> 0x00fd }
        r7 = r0.getString(r7);	 Catch:{ HttpException -> 0x00fd }
        r8 = z;	 Catch:{ HttpException -> 0x01e6 }
        r9 = 7;
        r8 = r8[r9];	 Catch:{ HttpException -> 0x01e6 }
        r8 = r0.has(r8);	 Catch:{ HttpException -> 0x01e6 }
        if (r8 == 0) goto L_0x01ea;
    L_0x01b1:
        r8 = z;	 Catch:{ HttpException -> 0x01e6 }
        r9 = 26;
        r8 = r8[r9];	 Catch:{ HttpException -> 0x01e6 }
        r9 = z;	 Catch:{ HttpException -> 0x01e6 }
        r10 = 27;
        r9 = r9[r10];	 Catch:{ HttpException -> 0x01e6 }
        r9 = r0.getString(r9);	 Catch:{ HttpException -> 0x01e6 }
        r8 = r8.equals(r9);	 Catch:{ HttpException -> 0x01e6 }
        if (r8 == 0) goto L_0x01ea;
    L_0x01c7:
        if (r6 == 0) goto L_0x01cb;
    L_0x01c9:
        if (r7 != 0) goto L_0x01ec;
    L_0x01cb:
        r0 = z;	 Catch:{ HttpException -> 0x01e0 }
        r1 = 31;
        r0 = r0[r1];	 Catch:{ HttpException -> 0x01e0 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ HttpException -> 0x01e0 }
        r0 = new java.io.IOException;	 Catch:{ HttpException -> 0x01e0 }
        r1 = z;	 Catch:{ HttpException -> 0x01e0 }
        r2 = 28;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x01e0 }
        r0.<init>(r1);	 Catch:{ HttpException -> 0x01e0 }
        throw r0;	 Catch:{ HttpException -> 0x01e0 }
    L_0x01e0:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x00fd }
    L_0x01e2:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x01e4 }
    L_0x01e4:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x00fd }
    L_0x01e6:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x01e8 }
    L_0x01e8:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x00fd }
    L_0x01ea:
        r1 = r2;
        goto L_0x01c7;
    L_0x01ec:
        r2 = com.whatsapp.v4.YES;	 Catch:{ HttpException -> 0x02d0 }
        r3.e = r2;	 Catch:{ HttpException -> 0x02d0 }
        r3.c = r6;	 Catch:{ HttpException -> 0x02d0 }
        r2 = 0;
        r2 = android.backport.util.Base64.decode(r7, r2);	 Catch:{ HttpException -> 0x02d0 }
        r3.a = r2;	 Catch:{ HttpException -> 0x02d0 }
        r3.b = r1;	 Catch:{ HttpException -> 0x02d0 }
        if (r4 == 0) goto L_0x02cd;
    L_0x01fd:
        r1 = z;	 Catch:{ HttpException -> 0x02d0 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x02d0 }
        r1 = r5.equals(r1);	 Catch:{ HttpException -> 0x02d0 }
        if (r1 == 0) goto L_0x02b3;
    L_0x0208:
        r1 = z;	 Catch:{ HttpException -> 0x00fd }
        r2 = 16;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x00fd }
        r1 = r0.getString(r1);	 Catch:{ HttpException -> 0x00fd }
        r2 = z;	 Catch:{ HttpException -> 0x02d2 }
        r6 = 8;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x02d2 }
        r2 = r0.has(r2);	 Catch:{ HttpException -> 0x02d2 }
        if (r2 == 0) goto L_0x02d4;
    L_0x021e:
        r2 = z;	 Catch:{ HttpException -> 0x02d2 }
        r6 = 12;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x02d2 }
        r0 = r0.getString(r2);	 Catch:{ HttpException -> 0x02d2 }
    L_0x0228:
        r2 = z;	 Catch:{ HttpException -> 0x02d7 }
        r6 = 5;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x02d7 }
        r2 = r2.equals(r1);	 Catch:{ HttpException -> 0x02d7 }
        if (r2 == 0) goto L_0x0239;
    L_0x0233:
        r2 = com.whatsapp.v4.FAIL_BLOCKED;	 Catch:{ HttpException -> 0x02d7 }
        r3.e = r2;	 Catch:{ HttpException -> 0x02d7 }
        if (r4 == 0) goto L_0x02b1;
    L_0x0239:
        r2 = z;	 Catch:{ HttpException -> 0x02d9 }
        r6 = 10;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x02d9 }
        r2 = r2.equals(r1);	 Catch:{ HttpException -> 0x02d9 }
        if (r2 == 0) goto L_0x0255;
    L_0x0245:
        if (r0 != 0) goto L_0x024d;
    L_0x0247:
        r2 = com.whatsapp.v4.FAIL_TOO_MANY_GUESSES;	 Catch:{ HttpException -> 0x02dd }
        r3.e = r2;	 Catch:{ HttpException -> 0x02dd }
        if (r4 == 0) goto L_0x0251;
    L_0x024d:
        r2 = com.whatsapp.v4.FAIL_MISMATCH;	 Catch:{ HttpException -> 0x02df }
        r3.e = r2;	 Catch:{ HttpException -> 0x02df }
    L_0x0251:
        r3.d = r0;	 Catch:{ HttpException -> 0x02e1 }
        if (r4 == 0) goto L_0x02b1;
    L_0x0255:
        r2 = z;	 Catch:{ HttpException -> 0x02e1 }
        r6 = 13;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x02e1 }
        r2 = r2.equals(r1);	 Catch:{ HttpException -> 0x02e1 }
        if (r2 == 0) goto L_0x0267;
    L_0x0261:
        r2 = com.whatsapp.v4.FAIL_MISSING;	 Catch:{ HttpException -> 0x02e3 }
        r3.e = r2;	 Catch:{ HttpException -> 0x02e3 }
        if (r4 == 0) goto L_0x02b1;
    L_0x0267:
        r2 = z;	 Catch:{ HttpException -> 0x02e5 }
        r6 = 3;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x02e5 }
        r2 = r2.equals(r1);	 Catch:{ HttpException -> 0x02e5 }
        if (r2 == 0) goto L_0x027a;
    L_0x0272:
        r2 = com.whatsapp.v4.FAIL_TOO_MANY_GUESSES;	 Catch:{ HttpException -> 0x02e7 }
        r3.e = r2;	 Catch:{ HttpException -> 0x02e7 }
        r3.d = r0;	 Catch:{ HttpException -> 0x02e7 }
        if (r4 == 0) goto L_0x02b1;
    L_0x027a:
        r2 = z;	 Catch:{ HttpException -> 0x02e9 }
        r6 = 1;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x02e9 }
        r2 = r2.equals(r1);	 Catch:{ HttpException -> 0x02e9 }
        if (r2 == 0) goto L_0x028d;
    L_0x0285:
        r2 = com.whatsapp.v4.FAIL_GUESSED_TOO_FAST;	 Catch:{ HttpException -> 0x02eb }
        r3.e = r2;	 Catch:{ HttpException -> 0x02eb }
        r3.d = r0;	 Catch:{ HttpException -> 0x02eb }
        if (r4 == 0) goto L_0x02b1;
    L_0x028d:
        r2 = z;	 Catch:{ HttpException -> 0x02ed }
        r6 = 19;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x02ed }
        r2 = r2.equals(r1);	 Catch:{ HttpException -> 0x02ed }
        if (r2 == 0) goto L_0x029f;
    L_0x0299:
        r2 = com.whatsapp.v4.FAIL_STALE;	 Catch:{ HttpException -> 0x02ef }
        r3.e = r2;	 Catch:{ HttpException -> 0x02ef }
        if (r4 == 0) goto L_0x02b1;
    L_0x029f:
        r2 = z;	 Catch:{ HttpException -> 0x02f1 }
        r6 = 9;
        r2 = r2[r6];	 Catch:{ HttpException -> 0x02f1 }
        r1 = r2.equals(r1);	 Catch:{ HttpException -> 0x02f1 }
        if (r1 == 0) goto L_0x02b1;
    L_0x02ab:
        r1 = com.whatsapp.v4.FAIL_TEMPORARILY_UNAVAILABLE;	 Catch:{ HttpException -> 0x02f3 }
        r3.e = r1;	 Catch:{ HttpException -> 0x02f3 }
        r3.d = r0;	 Catch:{ HttpException -> 0x02f3 }
    L_0x02b1:
        if (r4 == 0) goto L_0x02cd;
    L_0x02b3:
        r0 = new java.lang.StringBuilder;	 Catch:{ HttpException -> 0x02f5 }
        r0.<init>();	 Catch:{ HttpException -> 0x02f5 }
        r1 = z;	 Catch:{ HttpException -> 0x02f5 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ HttpException -> 0x02f5 }
        r0 = r0.append(r1);	 Catch:{ HttpException -> 0x02f5 }
        r0 = r0.append(r5);	 Catch:{ HttpException -> 0x02f5 }
        r0 = r0.toString();	 Catch:{ HttpException -> 0x02f5 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ HttpException -> 0x02f5 }
    L_0x02cd:
        r0 = r3;
        goto L_0x010e;
    L_0x02d0:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x00fd }
    L_0x02d2:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x00fd }
    L_0x02d4:
        r0 = 0;
        goto L_0x0228;
    L_0x02d7:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02d9 }
    L_0x02d9:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02db }
    L_0x02db:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02dd }
    L_0x02dd:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02df }
    L_0x02df:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x00fd }
    L_0x02e1:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02e3 }
    L_0x02e3:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02e5 }
    L_0x02e5:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02e7 }
    L_0x02e7:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02e9 }
    L_0x02e9:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02eb }
    L_0x02eb:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02ed }
    L_0x02ed:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02ef }
    L_0x02ef:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02f1 }
    L_0x02f1:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x02f3 }
    L_0x02f3:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x00fd }
    L_0x02f5:
        r0 = move-exception;
        throw r0;	 Catch:{ HttpException -> 0x00fd }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amb.a(java.lang.String, java.lang.String, java.lang.String, com.whatsapp.as, java.lang.String):com.whatsapp.ut");
    }

    public static HashMap b() {
        int i = a;
        HashMap hashMap = new HashMap();
        HttpUriRequest httpGet = new HttpGet(azx.p);
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpProtocolParams.setUserAgent(basicHttpParams, vn.a());
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
        defaultHttpClient.removeRequestInterceptorByClass(RequestExpectContinue.class);
        HttpResponse execute = defaultHttpClient.execute(httpGet);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode != 200) {
            try {
                Log.e(z[189] + statusCode);
                return hashMap;
            } catch (JSONException e) {
                throw e;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        Reader inputStreamReader = new InputStreamReader(execute.getEntity().getContent(), z[184]);
        char[] cArr = new char[4096];
        do {
            int read = inputStreamReader.read(cArr);
            if (read < 0) {
                break;
            }
            stringBuilder.append(cArr, 0, read);
        } while (i == 0);
        WAAppCompatActivity.c++;
        inputStreamReader.close();
        try {
            JSONObject jSONObject = new JSONObject(stringBuilder.toString());
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                String string = jSONObject.getJSONObject(str).getString(z[185]);
                try {
                    if (z[190].equals(string)) {
                        hashMap.put(str, Boolean.FALSE);
                        if (i == 0) {
                            continue;
                            if (i != 0) {
                                break;
                            }
                        }
                    }
                    if (z[183].equals(string)) {
                        try {
                            hashMap.put(str, Boolean.TRUE);
                            if (i == 0) {
                                continue;
                                if (i != 0) {
                                    break;
                                }
                            }
                        } catch (JSONException e2) {
                            throw e2;
                        }
                    }
                    try {
                        Log.e(z[187] + str + "=" + string);
                        if (i != 0) {
                            break;
                        }
                    } catch (JSONException e22) {
                        throw e22;
                    }
                } catch (JSONException e222) {
                    throw e222;
                } catch (JSONException e2222) {
                    throw e2222;
                }
            }
            return hashMap;
        } catch (Throwable e3) {
            try {
                if (VERSION.SDK_INT >= 9) {
                    throw new IOException(z[188], e3);
                }
                throw new IOException(z[186] + e3);
            } catch (JSONException e22222) {
                throw e22222;
            }
        }
    }

    private static int a(as asVar) {
        try {
            switch (xv.a[asVar.ordinal()]) {
                case at.g /*1*/:
                    return 1;
                case at.i /*2*/:
                    return 2;
                case at.o /*3*/:
                    return 3;
                case at.p /*4*/:
                    return 4;
                default:
                    Log.w(z[182]);
                    return 0;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static void a(List list) {
        try {
            String str;
            list.add(Pair.create(z[133], String.valueOf(nf.a()).getBytes()));
            Object obj = z[127];
            if (a()) {
                str = "1";
            } else {
                str = "0";
            }
            list.add(Pair.create(obj, str.getBytes()));
            str = VerifyNumber.j();
            try {
                if (App.j == 1) {
                    String str2 = "s";
                    if (str == null) {
                        str = "";
                    }
                    list.add(Pair.create(str2, str.getBytes()));
                }
                try {
                    obj = z[129];
                    if (ve.m()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    try {
                        list.add(Pair.create(obj, str.getBytes()));
                        obj = z[130];
                        if (ve.N()) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        list.add(Pair.create(obj, str.getBytes()));
                        Boolean P = ve.P();
                        if (P != null) {
                            try {
                                obj = z[135];
                                if (P.booleanValue()) {
                                    str = "1";
                                } else {
                                    str = "0";
                                }
                                list.add(Pair.create(obj, str.getBytes()));
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        list.add(Pair.create(z[128], String.valueOf(Process.myPid()).getBytes()));
                        str = ve.h();
                        if (str != null) {
                            try {
                                list.add(Pair.create(z[131], str.getBytes()));
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                        str = ve.Q();
                        if (str != null) {
                            try {
                                list.add(Pair.create(z[136], str.getBytes()));
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                        P = ve.O();
                        if (P != null) {
                            try {
                                obj = z[134];
                                if (P.booleanValue()) {
                                    str = "1";
                                } else {
                                    str = "0";
                                }
                                list.add(Pair.create(obj, str.getBytes()));
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            }
                        }
                        str = ve.e();
                        if (str != null) {
                            try {
                                list.add(Pair.create(z[132], String.valueOf(a(str)).getBytes()));
                            } catch (IllegalArgumentException e2222) {
                                throw e2222;
                            }
                        }
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                }
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            } catch (IllegalArgumentException e22222222) {
                throw e22222222;
            }
        } catch (IllegalArgumentException e222222222) {
            throw e222222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.ne a(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.whatsapp.util.a_ r12, com.whatsapp.util.a_ r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
        r2 = a;
        r1 = com.whatsapp.aqu.c();
        r3 = com.whatsapp.aqu.g();
        if (r9 == 0) goto L_0x00a8;
    L_0x000c:
        r0 = 1;
    L_0x000d:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00ab }
        if (r10 == 0) goto L_0x00ad;
    L_0x0012:
        r0 = 1;
    L_0x0013:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00b0 }
        if (r11 == 0) goto L_0x00b2;
    L_0x0018:
        r0 = 1;
    L_0x0019:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00b5 }
        if (r3 == 0) goto L_0x00b7;
    L_0x001e:
        r0 = 1;
    L_0x001f:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00ba }
        if (r1 == 0) goto L_0x00bc;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00bf }
        if (r12 == 0) goto L_0x00c1;
    L_0x002a:
        r0 = 1;
    L_0x002b:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00c4 }
        r0 = r12.a();	 Catch:{ JSONException -> 0x00c4 }
        if (r0 == 0) goto L_0x00c6;
    L_0x0034:
        r0 = 1;
    L_0x0035:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00c9 }
        r0 = r12.b();	 Catch:{ JSONException -> 0x00c9 }
        if (r0 == 0) goto L_0x00cb;
    L_0x003e:
        r0 = 1;
    L_0x003f:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00ce }
        if (r13 == 0) goto L_0x00d0;
    L_0x0044:
        r0 = 1;
    L_0x0045:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00d3 }
        r0 = r13.a();	 Catch:{ JSONException -> 0x00d3 }
        if (r0 == 0) goto L_0x00d5;
    L_0x004e:
        r0 = 1;
    L_0x004f:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00d8 }
        r0 = r13.b();	 Catch:{ JSONException -> 0x00d8 }
        if (r0 == 0) goto L_0x00da;
    L_0x0058:
        r0 = 1;
    L_0x0059:
        com.whatsapp.util.Log.b(r0);	 Catch:{ JSONException -> 0x00dd }
        r0 = z;	 Catch:{ JSONException -> 0x00dd }
        r4 = 88;
        r0 = r0[r4];	 Catch:{ JSONException -> 0x00dd }
        r0 = r14.equals(r0);	 Catch:{ JSONException -> 0x00dd }
        if (r0 != 0) goto L_0x00e1;
    L_0x0068:
        r0 = z;	 Catch:{ JSONException -> 0x00dd }
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0 = r0[r4];	 Catch:{ JSONException -> 0x00dd }
        r0 = r14.equals(r0);	 Catch:{ JSONException -> 0x00dd }
        if (r0 != 0) goto L_0x00e1;
    L_0x0074:
        r0 = z;	 Catch:{ JSONException -> 0x00df }
        r4 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r0 = r0[r4];	 Catch:{ JSONException -> 0x00df }
        r0 = r14.equals(r0);	 Catch:{ JSONException -> 0x00df }
        if (r0 != 0) goto L_0x00e1;
    L_0x0080:
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x00a6 }
        r0.<init>();	 Catch:{ JSONException -> 0x00a6 }
        r1 = z;	 Catch:{ JSONException -> 0x00a6 }
        r2 = 35;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x00a6 }
        r0 = r0.append(r1);	 Catch:{ JSONException -> 0x00a6 }
        r0 = r0.append(r14);	 Catch:{ JSONException -> 0x00a6 }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x00a6 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x00a6 }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ JSONException -> 0x00a6 }
        r1 = z;	 Catch:{ JSONException -> 0x00a6 }
        r2 = 60;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x00a6 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x00a6 }
        throw r0;	 Catch:{ JSONException -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = 0;
        goto L_0x000d;
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = 0;
        goto L_0x0013;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = 0;
        goto L_0x0019;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = 0;
        goto L_0x001f;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = 0;
        goto L_0x0025;
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = 0;
        goto L_0x002b;
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r0 = 0;
        goto L_0x0035;
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = 0;
        goto L_0x003f;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
    L_0x00d0:
        r0 = 0;
        goto L_0x0045;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = 0;
        goto L_0x004f;
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r0 = 0;
        goto L_0x0059;
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x00a6 }
    L_0x00e1:
        if (r16 == 0) goto L_0x0216;
    L_0x00e3:
        r0 = 1;
    L_0x00e4:
        com.whatsapp.util.Log.b(r0);
        r4 = com.whatsapp.App.D(r10);
        r0 = com.whatsapp.ve.e(r4);
        if (r0 != 0) goto L_0x00f8;
    L_0x00f1:
        r0 = com.whatsapp.ve.d();
        com.whatsapp.ve.a(r0, r4);
    L_0x00f8:
        r4 = new java.util.ArrayList;
        r4.<init>();
        if (r17 == 0) goto L_0x0110;
    L_0x00ff:
        r5 = z;	 Catch:{ JSONException -> 0x0219 }
        r6 = 86;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0219 }
        r6 = r17.getBytes();	 Catch:{ JSONException -> 0x0219 }
        r5 = android.util.Pair.create(r5, r6);	 Catch:{ JSONException -> 0x0219 }
        r4.add(r5);	 Catch:{ JSONException -> 0x0219 }
    L_0x0110:
        r5 = z;
        r6 = 84;
        r5 = r5[r6];
        r6 = r9.getBytes();
        r5 = android.util.Pair.create(r5, r6);
        r4.add(r5);
        r5 = z;
        r6 = 99;
        r5 = r5[r6];
        r6 = r11.getBytes();
        r5 = android.util.Pair.create(r5, r6);
        r4.add(r5);
        r5 = z;
        r6 = 58;
        r5 = r5[r6];
        r0 = android.util.Pair.create(r5, r0);
        r4.add(r0);
        r0 = z;
        r5 = 69;
        r0 = r0[r5];
        r3 = r3.getBytes();
        r0 = android.util.Pair.create(r0, r3);
        r4.add(r0);
        r0 = z;
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r0 = r0[r3];
        r1 = r1.getBytes();
        r0 = android.util.Pair.create(r0, r1);
        r4.add(r0);
        r0 = z;
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r0 = r0[r1];
        r1 = r12.a();
        r1 = r1.getBytes();
        r0 = android.util.Pair.create(r0, r1);
        r4.add(r0);
        r0 = z;
        r1 = 89;
        r0 = r0[r1];
        r1 = r12.b();
        r1 = r1.getBytes();
        r0 = android.util.Pair.create(r0, r1);
        r4.add(r0);
        r0 = z;
        r1 = 81;
        r0 = r0[r1];
        r1 = r13.a();
        r1 = r1.getBytes();
        r0 = android.util.Pair.create(r0, r1);
        r4.add(r0);
        r0 = z;
        r1 = 85;
        r0 = r0[r1];
        r1 = r13.b();
        r1 = r1.getBytes();
        r0 = android.util.Pair.create(r0, r1);
        r4.add(r0);
        r0 = z;
        r1 = 82;
        r0 = r0[r1];
        r1 = r14.getBytes();
        r0 = android.util.Pair.create(r0, r1);
        r4.add(r0);
        r0 = z;
        r1 = 48;
        r0 = r0[r1];
        r1 = r15.getBytes();
        r0 = android.util.Pair.create(r0, r1);
        r4.add(r0);
        r0 = z;
        r1 = 90;
        r0 = r0[r1];
        r1 = r16.getBytes();
        r0 = android.util.Pair.create(r0, r1);
        r4.add(r0);
        a(r4);
        r0 = b(r4);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = com.whatsapp.azx.f;
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        r0 = com.whatsapp.avp.a(r0);
        if (r0 != 0) goto L_0x021b;
    L_0x0208:
        r0 = new java.io.IOException;	 Catch:{ JSONException -> 0x0214 }
        r1 = z;	 Catch:{ JSONException -> 0x0214 }
        r2 = 49;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x0214 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0214 }
        throw r0;	 Catch:{ JSONException -> 0x0214 }
    L_0x0214:
        r0 = move-exception;
        throw r0;
    L_0x0216:
        r0 = 0;
        goto L_0x00e4;
    L_0x0219:
        r0 = move-exception;
        throw r0;
    L_0x021b:
        r1 = r0.getStatusLine();
        r1 = r1.getStatusCode();
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 == r3) goto L_0x024b;
    L_0x0227:
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0249 }
        r0.<init>();	 Catch:{ JSONException -> 0x0249 }
        r2 = z;	 Catch:{ JSONException -> 0x0249 }
        r3 = 34;
        r2 = r2[r3];	 Catch:{ JSONException -> 0x0249 }
        r0 = r0.append(r2);	 Catch:{ JSONException -> 0x0249 }
        r0 = r0.append(r1);	 Catch:{ JSONException -> 0x0249 }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x0249 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0249 }
        r0 = new com.whatsapp.ne;	 Catch:{ JSONException -> 0x0249 }
        r1 = com.whatsapp.qp.ERROR_UNSPECIFIED;	 Catch:{ JSONException -> 0x0249 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0249 }
    L_0x0248:
        return r0;
    L_0x0249:
        r0 = move-exception;
        throw r0;
    L_0x024b:
        r0 = r0.getEntity();
        r0 = r0.getContent();
        r3 = a(r0);
        if (r3 != 0) goto L_0x0267;
    L_0x0259:
        r0 = new org.json.JSONException;	 Catch:{ JSONException -> 0x0265 }
        r1 = z;	 Catch:{ JSONException -> 0x0265 }
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x0265 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0265 }
        throw r0;	 Catch:{ JSONException -> 0x0265 }
    L_0x0265:
        r0 = move-exception;
        throw r0;
    L_0x0267:
        r1 = new com.whatsapp.ne;
        r0 = com.whatsapp.qp.ERROR_UNSPECIFIED;
        r1.<init>(r0);
        r0 = z;
        r4 = 41;
        r0 = r0[r4];
        r4 = r3.getString(r0);
        if (r4 != 0) goto L_0x0285;
    L_0x027a:
        r0 = z;	 Catch:{ JSONException -> 0x02e3 }
        r5 = 79;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x02e3 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x02e3 }
        if (r2 == 0) goto L_0x0362;
    L_0x0285:
        r0 = z;	 Catch:{ JSONException -> 0x02e5 }
        r5 = 56;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x02e5 }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x02e5 }
        if (r0 == 0) goto L_0x02fe;
    L_0x0291:
        r0 = z;
        r5 = 62;
        r0 = r0[r5];
        r5 = r3.getString(r0);
        r0 = z;
        r6 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r0 = r0[r6];
        r6 = r3.getString(r0);
        r0 = z;	 Catch:{ JSONException -> 0x02e7 }
        r7 = 75;
        r0 = r0[r7];	 Catch:{ JSONException -> 0x02e7 }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x02e7 }
        if (r0 == 0) goto L_0x02eb;
    L_0x02b1:
        r0 = z;	 Catch:{ JSONException -> 0x02e7 }
        r7 = 50;
        r0 = r0[r7];	 Catch:{ JSONException -> 0x02e7 }
        r7 = z;	 Catch:{ JSONException -> 0x02e7 }
        r8 = 59;
        r7 = r7[r8];	 Catch:{ JSONException -> 0x02e7 }
        r7 = r3.getString(r7);	 Catch:{ JSONException -> 0x02e7 }
        r0 = r0.equals(r7);	 Catch:{ JSONException -> 0x02e7 }
        if (r0 == 0) goto L_0x02eb;
    L_0x02c7:
        r0 = 1;
    L_0x02c8:
        if (r5 == 0) goto L_0x02cc;
    L_0x02ca:
        if (r6 != 0) goto L_0x02ed;
    L_0x02cc:
        r0 = z;	 Catch:{ JSONException -> 0x02e1 }
        r1 = 64;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x02e1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x02e1 }
        r0 = new java.io.IOException;	 Catch:{ JSONException -> 0x02e1 }
        r1 = z;	 Catch:{ JSONException -> 0x02e1 }
        r2 = 80;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x02e1 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x02e1 }
        throw r0;	 Catch:{ JSONException -> 0x02e1 }
    L_0x02e1:
        r0 = move-exception;
        throw r0;
    L_0x02e3:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x02e5 }
    L_0x02e5:
        r0 = move-exception;
        throw r0;
    L_0x02e7:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x02e9 }
    L_0x02e9:
        r0 = move-exception;
        throw r0;
    L_0x02eb:
        r0 = 0;
        goto L_0x02c8;
    L_0x02ed:
        r7 = com.whatsapp.qp.OK;	 Catch:{ JSONException -> 0x0365 }
        r1.j = r7;	 Catch:{ JSONException -> 0x0365 }
        r1.c = r5;	 Catch:{ JSONException -> 0x0365 }
        r5 = 0;
        r5 = android.backport.util.Base64.decode(r6, r5);	 Catch:{ JSONException -> 0x0365 }
        r1.g = r5;	 Catch:{ JSONException -> 0x0365 }
        r1.b = r0;	 Catch:{ JSONException -> 0x0365 }
        if (r2 == 0) goto L_0x0362;
    L_0x02fe:
        r0 = z;	 Catch:{ JSONException -> 0x0365 }
        r5 = 51;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0365 }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x0365 }
        if (r0 == 0) goto L_0x0379;
    L_0x030a:
        r0 = z;	 Catch:{ JSONException -> 0x0367 }
        r5 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0367 }
        r0 = r3.getInt(r0);	 Catch:{ JSONException -> 0x0367 }
        r1.d = r0;	 Catch:{ JSONException -> 0x0367 }
        r0 = z;	 Catch:{ JSONException -> 0x0367 }
        r5 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0367 }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x0367 }
        if (r0 == 0) goto L_0x05ff;
    L_0x0322:
        r0 = z;	 Catch:{ JSONException -> 0x0367 }
        r5 = 87;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0367 }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x0367 }
    L_0x032c:
        r1.h = r0;	 Catch:{ JSONException -> 0x0602 }
        r0 = z;	 Catch:{ JSONException -> 0x0602 }
        r5 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0602 }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x0602 }
        if (r0 == 0) goto L_0x0604;
    L_0x033a:
        r0 = z;	 Catch:{ JSONException -> 0x0602 }
        r5 = 78;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0602 }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x0602 }
    L_0x0344:
        r1.f = r0;	 Catch:{ JSONException -> 0x0607 }
        r0 = z;	 Catch:{ JSONException -> 0x0607 }
        r5 = 46;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0607 }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x0607 }
        if (r0 == 0) goto L_0x0609;
    L_0x0352:
        r0 = z;	 Catch:{ JSONException -> 0x0607 }
        r5 = 77;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0607 }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x0607 }
    L_0x035c:
        r1.i = r0;	 Catch:{ JSONException -> 0x0369 }
        r0 = com.whatsapp.qp.YES;	 Catch:{ JSONException -> 0x0369 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0369 }
    L_0x0362:
        r0 = r1;
        goto L_0x0248;
    L_0x0365:
        r0 = move-exception;
        throw r0;
    L_0x0367:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0369 }
    L_0x0369:
        r0 = move-exception;
        r0 = z;	 Catch:{ JSONException -> 0x060c }
        r5 = 76;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x060c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ JSONException -> 0x060c }
        r0 = com.whatsapp.qp.ERROR_UNSPECIFIED;	 Catch:{ JSONException -> 0x060c }
        r1.j = r0;	 Catch:{ JSONException -> 0x060c }
        if (r2 == 0) goto L_0x0362;
    L_0x0379:
        r0 = z;	 Catch:{ JSONException -> 0x060e }
        r5 = 92;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x060e }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x060e }
        if (r0 == 0) goto L_0x03f0;
    L_0x0385:
        r0 = z;	 Catch:{ JSONException -> 0x0610 }
        r5 = 93;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0610 }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x0610 }
        if (r0 == 0) goto L_0x0612;
    L_0x0391:
        r0 = z;	 Catch:{ JSONException -> 0x0610 }
        r5 = 63;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0610 }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x0610 }
    L_0x039b:
        r1.f = r0;	 Catch:{ JSONException -> 0x0615 }
        r0 = z;	 Catch:{ JSONException -> 0x0615 }
        r5 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0615 }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x0615 }
        if (r0 == 0) goto L_0x0617;
    L_0x03a9:
        r0 = z;	 Catch:{ JSONException -> 0x0615 }
        r5 = 38;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0615 }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x0615 }
    L_0x03b3:
        r1.i = r0;
        r0 = z;
        r5 = 72;
        r0 = r0[r5];
        r0 = r3.getString(r0);
        if (r0 != 0) goto L_0x03d0;
    L_0x03c1:
        r5 = z;	 Catch:{ JSONException -> 0x061a }
        r6 = 54;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x061a }
        com.whatsapp.util.Log.w(r5);	 Catch:{ JSONException -> 0x061a }
        r5 = com.whatsapp.qp.ERROR_UNSPECIFIED;	 Catch:{ JSONException -> 0x061a }
        r1.j = r5;	 Catch:{ JSONException -> 0x061a }
        if (r2 == 0) goto L_0x03ee;
    L_0x03d0:
        r5 = com.whatsapp.qp.YES_WITH_CODE;	 Catch:{ JSONException -> 0x061c }
        r1.j = r5;	 Catch:{ JSONException -> 0x061c }
        r1.e = r0;	 Catch:{ JSONException -> 0x061c }
        r0 = z;	 Catch:{ JSONException -> 0x061c }
        r5 = 94;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x061c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x061c }
        if (r0 == 0) goto L_0x061e;
    L_0x03e2:
        r0 = z;	 Catch:{ JSONException -> 0x061c }
        r5 = 61;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x061c }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x061c }
    L_0x03ec:
        r1.h = r0;
    L_0x03ee:
        if (r2 == 0) goto L_0x0362;
    L_0x03f0:
        r0 = z;	 Catch:{ JSONException -> 0x0621 }
        r5 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r0 = r0[r5];	 Catch:{ JSONException -> 0x0621 }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x0621 }
        if (r0 == 0) goto L_0x05e1;
    L_0x03fc:
        r0 = z;
        r5 = 36;
        r0 = r0[r5];
        r5 = r3.getString(r0);
        r0 = z;	 Catch:{ JSONException -> 0x0623 }
        r6 = 83;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x0623 }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x0623 }
        if (r0 == 0) goto L_0x0625;
    L_0x0412:
        r0 = z;	 Catch:{ JSONException -> 0x0623 }
        r6 = 57;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x0623 }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x0623 }
    L_0x041c:
        r1.h = r0;	 Catch:{ JSONException -> 0x0628 }
        r0 = z;	 Catch:{ JSONException -> 0x0628 }
        r6 = 43;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x0628 }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x0628 }
        if (r0 == 0) goto L_0x062a;
    L_0x042a:
        r0 = z;	 Catch:{ JSONException -> 0x0628 }
        r6 = 65;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x0628 }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x0628 }
    L_0x0434:
        r1.a = r0;	 Catch:{ JSONException -> 0x062d }
        r0 = z;	 Catch:{ JSONException -> 0x062d }
        r6 = 66;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x062d }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x062d }
        if (r0 == 0) goto L_0x062f;
    L_0x0442:
        r0 = z;	 Catch:{ JSONException -> 0x062d }
        r6 = 52;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x062d }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x062d }
    L_0x044c:
        r1.f = r0;	 Catch:{ JSONException -> 0x0632 }
        r0 = z;	 Catch:{ JSONException -> 0x0632 }
        r6 = 100;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x0632 }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x0632 }
        if (r0 == 0) goto L_0x0634;
    L_0x045a:
        r0 = z;	 Catch:{ JSONException -> 0x0632 }
        r6 = 70;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x0632 }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x0632 }
    L_0x0464:
        r1.i = r0;	 Catch:{ JSONException -> 0x0637 }
        if (r5 != 0) goto L_0x0477;
    L_0x0468:
        r0 = z;	 Catch:{ JSONException -> 0x0639 }
        r3 = 39;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0639 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ JSONException -> 0x0639 }
        r0 = com.whatsapp.qp.ERROR_UNSPECIFIED;	 Catch:{ JSONException -> 0x0639 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0639 }
        if (r2 == 0) goto L_0x05df;
    L_0x0477:
        r0 = z;	 Catch:{ JSONException -> 0x063b }
        r3 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x063b }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x063b }
        if (r0 == 0) goto L_0x0489;
    L_0x0483:
        r0 = com.whatsapp.qp.ERROR_TOO_RECENT;	 Catch:{ JSONException -> 0x063d }
        r1.j = r0;	 Catch:{ JSONException -> 0x063d }
        if (r2 == 0) goto L_0x05df;
    L_0x0489:
        r0 = z;	 Catch:{ JSONException -> 0x063f }
        r3 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x063f }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x063f }
        if (r0 == 0) goto L_0x049b;
    L_0x0495:
        r0 = com.whatsapp.qp.ERROR_TOO_MANY;	 Catch:{ JSONException -> 0x0641 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0641 }
        if (r2 == 0) goto L_0x05df;
    L_0x049b:
        r0 = z;	 Catch:{ JSONException -> 0x0643 }
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0643 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x0643 }
        if (r0 == 0) goto L_0x04ad;
    L_0x04a7:
        r0 = com.whatsapp.qp.ERROR_OLD_VERSION;	 Catch:{ JSONException -> 0x0645 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0645 }
        if (r2 == 0) goto L_0x05df;
    L_0x04ad:
        r0 = z;	 Catch:{ JSONException -> 0x0647 }
        r3 = 45;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0647 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x0647 }
        if (r0 == 0) goto L_0x04bf;
    L_0x04b9:
        r0 = com.whatsapp.qp.ERROR_TEMPORARILY_UNAVAILABLE;	 Catch:{ JSONException -> 0x0649 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0649 }
        if (r2 == 0) goto L_0x05df;
    L_0x04bf:
        r0 = z;	 Catch:{ JSONException -> 0x064b }
        r3 = 96;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x064b }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x064b }
        if (r0 == 0) goto L_0x04d1;
    L_0x04cb:
        r0 = com.whatsapp.qp.ERROR_NEXT_METHOD;	 Catch:{ JSONException -> 0x064d }
        r1.j = r0;	 Catch:{ JSONException -> 0x064d }
        if (r2 == 0) goto L_0x05df;
    L_0x04d1:
        r0 = z;	 Catch:{ JSONException -> 0x064f }
        r3 = 42;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x064f }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x064f }
        if (r0 == 0) goto L_0x04e3;
    L_0x04dd:
        r0 = com.whatsapp.qp.ERROR_TOO_MANY_GUESSES;	 Catch:{ JSONException -> 0x0651 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0651 }
        if (r2 == 0) goto L_0x05df;
    L_0x04e3:
        r0 = z;	 Catch:{ JSONException -> 0x0653 }
        r3 = 68;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0653 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x0653 }
        if (r0 == 0) goto L_0x04fe;
    L_0x04ef:
        r0 = z;	 Catch:{ JSONException -> 0x0655 }
        r3 = 97;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0655 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0655 }
        r0 = com.whatsapp.qp.ERROR_BLOCKED;	 Catch:{ JSONException -> 0x0655 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0655 }
        if (r2 == 0) goto L_0x05df;
    L_0x04fe:
        r0 = z;	 Catch:{ JSONException -> 0x0657 }
        r3 = 73;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0657 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x0657 }
        if (r0 == 0) goto L_0x052c;
    L_0x050a:
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0659 }
        r0.<init>();	 Catch:{ JSONException -> 0x0659 }
        r3 = z;	 Catch:{ JSONException -> 0x0659 }
        r6 = 40;
        r3 = r3[r6];	 Catch:{ JSONException -> 0x0659 }
        r0 = r0.append(r3);	 Catch:{ JSONException -> 0x0659 }
        r3 = r1.a;	 Catch:{ JSONException -> 0x0659 }
        r0 = r0.append(r3);	 Catch:{ JSONException -> 0x0659 }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x0659 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0659 }
        r0 = com.whatsapp.qp.ERROR_BAD_PARAMETER;	 Catch:{ JSONException -> 0x0659 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0659 }
        if (r2 == 0) goto L_0x05df;
    L_0x052c:
        r0 = z;	 Catch:{ JSONException -> 0x065b }
        r3 = 44;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x065b }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x065b }
        if (r0 == 0) goto L_0x055a;
    L_0x0538:
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x065d }
        r0.<init>();	 Catch:{ JSONException -> 0x065d }
        r3 = z;	 Catch:{ JSONException -> 0x065d }
        r6 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r3 = r3[r6];	 Catch:{ JSONException -> 0x065d }
        r0 = r0.append(r3);	 Catch:{ JSONException -> 0x065d }
        r3 = r1.a;	 Catch:{ JSONException -> 0x065d }
        r0 = r0.append(r3);	 Catch:{ JSONException -> 0x065d }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x065d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x065d }
        r0 = com.whatsapp.qp.ERROR_MISSING_PARAMETER;	 Catch:{ JSONException -> 0x065d }
        r1.j = r0;	 Catch:{ JSONException -> 0x065d }
        if (r2 == 0) goto L_0x05df;
    L_0x055a:
        r0 = z;	 Catch:{ JSONException -> 0x065f }
        r3 = 55;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x065f }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x065f }
        if (r0 == 0) goto L_0x0575;
    L_0x0566:
        r0 = z;	 Catch:{ JSONException -> 0x0661 }
        r3 = 71;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0661 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0661 }
        r0 = com.whatsapp.qp.ERROR_PROVIDER_TIMEOUT;	 Catch:{ JSONException -> 0x0661 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0661 }
        if (r2 == 0) goto L_0x05df;
    L_0x0575:
        r0 = z;	 Catch:{ JSONException -> 0x0663 }
        r3 = 67;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0663 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x0663 }
        if (r0 == 0) goto L_0x0590;
    L_0x0581:
        r0 = z;	 Catch:{ JSONException -> 0x0665 }
        r3 = 37;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0665 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0665 }
        r0 = com.whatsapp.qp.ERROR_PROVIDER_UNROUTABLE;	 Catch:{ JSONException -> 0x0665 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0665 }
        if (r2 == 0) goto L_0x05df;
    L_0x0590:
        r0 = z;	 Catch:{ JSONException -> 0x0667 }
        r3 = 47;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0667 }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x0667 }
        if (r0 == 0) goto L_0x05ab;
    L_0x059c:
        r0 = z;	 Catch:{ JSONException -> 0x0669 }
        r3 = 53;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x0669 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0669 }
        r0 = com.whatsapp.qp.ERROR_BAD_TOKEN;	 Catch:{ JSONException -> 0x0669 }
        r1.j = r0;	 Catch:{ JSONException -> 0x0669 }
        if (r2 == 0) goto L_0x05df;
    L_0x05ab:
        r0 = z;	 Catch:{ JSONException -> 0x066b }
        r3 = 95;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x066b }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x066b }
        if (r0 == 0) goto L_0x05c6;
    L_0x05b7:
        r0 = z;	 Catch:{ JSONException -> 0x066d }
        r3 = 98;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x066d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x066d }
        r0 = com.whatsapp.qp.ERROR_TOO_MANY_ALL_METHODS;	 Catch:{ JSONException -> 0x066d }
        r1.j = r0;	 Catch:{ JSONException -> 0x066d }
        if (r2 == 0) goto L_0x05df;
    L_0x05c6:
        r0 = z;	 Catch:{ JSONException -> 0x066f }
        r3 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x066f }
        r0 = r5.equals(r0);	 Catch:{ JSONException -> 0x066f }
        if (r0 == 0) goto L_0x05df;
    L_0x05d2:
        r0 = z;	 Catch:{ JSONException -> 0x066f }
        r3 = 74;
        r0 = r0[r3];	 Catch:{ JSONException -> 0x066f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x066f }
        r0 = com.whatsapp.qp.ERROR_NO_ROUTES;	 Catch:{ JSONException -> 0x066f }
        r1.j = r0;	 Catch:{ JSONException -> 0x066f }
    L_0x05df:
        if (r2 == 0) goto L_0x0362;
    L_0x05e1:
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x05fd }
        r0.<init>();	 Catch:{ JSONException -> 0x05fd }
        r2 = z;	 Catch:{ JSONException -> 0x05fd }
        r3 = 91;
        r2 = r2[r3];	 Catch:{ JSONException -> 0x05fd }
        r0 = r0.append(r2);	 Catch:{ JSONException -> 0x05fd }
        r0 = r0.append(r4);	 Catch:{ JSONException -> 0x05fd }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x05fd }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x05fd }
        goto L_0x0362;
    L_0x05fd:
        r0 = move-exception;
        throw r0;
    L_0x05ff:
        r0 = 0;
        goto L_0x032c;
    L_0x0602:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0369 }
    L_0x0604:
        r0 = 0;
        goto L_0x0344;
    L_0x0607:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0369 }
    L_0x0609:
        r0 = 0;
        goto L_0x035c;
    L_0x060c:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x060e }
    L_0x060e:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0610 }
    L_0x0610:
        r0 = move-exception;
        throw r0;
    L_0x0612:
        r0 = 0;
        goto L_0x039b;
    L_0x0615:
        r0 = move-exception;
        throw r0;
    L_0x0617:
        r0 = 0;
        goto L_0x03b3;
    L_0x061a:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x061c }
    L_0x061c:
        r0 = move-exception;
        throw r0;
    L_0x061e:
        r0 = 0;
        goto L_0x03ec;
    L_0x0621:
        r0 = move-exception;
        throw r0;
    L_0x0623:
        r0 = move-exception;
        throw r0;
    L_0x0625:
        r0 = 0;
        goto L_0x041c;
    L_0x0628:
        r0 = move-exception;
        throw r0;
    L_0x062a:
        r0 = 0;
        goto L_0x0434;
    L_0x062d:
        r0 = move-exception;
        throw r0;
    L_0x062f:
        r0 = 0;
        goto L_0x044c;
    L_0x0632:
        r0 = move-exception;
        throw r0;
    L_0x0634:
        r0 = 0;
        goto L_0x0464;
    L_0x0637:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0639 }
    L_0x0639:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x063b }
    L_0x063b:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x063d }
    L_0x063d:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x063f }
    L_0x063f:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0641 }
    L_0x0641:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0643 }
    L_0x0643:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0645 }
    L_0x0645:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0647 }
    L_0x0647:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0649 }
    L_0x0649:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x064b }
    L_0x064b:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x064d }
    L_0x064d:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x064f }
    L_0x064f:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0651 }
    L_0x0651:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0653 }
    L_0x0653:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0655 }
    L_0x0655:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0657 }
    L_0x0657:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0659 }
    L_0x0659:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x065b }
    L_0x065b:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x065d }
    L_0x065d:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x065f }
    L_0x065f:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0661 }
    L_0x0661:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0663 }
    L_0x0663:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0665 }
    L_0x0665:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0667 }
    L_0x0667:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0669 }
    L_0x0669:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x066b }
    L_0x066b:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x066d }
    L_0x066d:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x066f }
    L_0x066f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amb.a(java.lang.String, java.lang.String, java.lang.String, com.whatsapp.util.a_, com.whatsapp.util.a_, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.whatsapp.ne");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(java.util.List r11) {
        /*
        r10 = 48;
        r2 = 0;
        r5 = a;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = r11.iterator();
        r1 = r2;
    L_0x000f:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00ab;
    L_0x0015:
        r0 = r7.next();
        r0 = (android.util.Pair) r0;
        r3 = r1 + 1;
        if (r1 != 0) goto L_0x0026;
    L_0x001f:
        r1 = 63;
        r6.append(r1);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        if (r5 == 0) goto L_0x002b;
    L_0x0026:
        r1 = 38;
        r6.append(r1);	 Catch:{ IllegalArgumentException -> 0x00b0 }
    L_0x002b:
        r1 = r0.first;
        r1 = (java.lang.String) r1;
        r6.append(r1);
        r1 = 61;
        r6.append(r1);
        r4 = r2;
    L_0x0038:
        r1 = r0.second;
        r1 = (byte[]) r1;
        r1 = r1.length;
        if (r4 >= r1) goto L_0x00a9;
    L_0x003f:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00b2 }
        if (r1 < r10) goto L_0x0051;
    L_0x0047:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r8 = 57;
        if (r1 <= r8) goto L_0x0079;
    L_0x0051:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r8 = 65;
        if (r1 < r8) goto L_0x0065;
    L_0x005b:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00b8 }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00b8 }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00b8 }
        r8 = 90;
        if (r1 <= r8) goto L_0x0079;
    L_0x0065:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00ba }
        r8 = 97;
        if (r1 < r8) goto L_0x0085;
    L_0x006f:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00bc }
        r8 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r1 > r8) goto L_0x0085;
    L_0x0079:
        r1 = r0.second;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = (byte[]) r1;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x00bc }
        r1 = (char) r1;	 Catch:{ IllegalArgumentException -> 0x00bc }
        r6.append(r1);	 Catch:{ IllegalArgumentException -> 0x00bc }
        if (r5 == 0) goto L_0x00a5;
    L_0x0085:
        r1 = 37;
        r6.append(r1);
        r1 = r0.second;
        r1 = (byte[]) r1;
        r1 = r1[r4];
        r1 = r1 & 255;
        r1 = java.lang.Integer.toHexString(r1);
        r8 = r1.length();	 Catch:{ IllegalArgumentException -> 0x00be }
        r9 = 1;
        if (r8 != r9) goto L_0x00a2;
    L_0x009d:
        r8 = 48;
        r6.append(r8);	 Catch:{ IllegalArgumentException -> 0x00be }
    L_0x00a2:
        r6.append(r1);
    L_0x00a5:
        r1 = r4 + 1;
        if (r5 == 0) goto L_0x00c3;
    L_0x00a9:
        if (r5 == 0) goto L_0x00c0;
    L_0x00ab:
        r0 = r6.toString();
        return r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r1 = r3;
        goto L_0x000f;
    L_0x00c3:
        r4 = r1;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amb.b(java.util.List):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.an9 a(byte[] r11, byte[] r12, byte[] r13, java.lang.String r14, byte[] r15) {
        /*
        r3 = 0;
        r0 = 1;
        r1 = 0;
        r4 = a;
        r5 = com.whatsapp.aqu.g();
        r6 = com.whatsapp.aqu.c();
        if (r12 == 0) goto L_0x0024;
    L_0x000f:
        r2 = r12.length;	 Catch:{ IllegalArgumentException -> 0x0022 }
        if (r2 <= 0) goto L_0x0024;
    L_0x0012:
        r2 = r0;
    L_0x0013:
        com.whatsapp.util.Log.b(r2);	 Catch:{ IllegalArgumentException -> 0x0026 }
        if (r13 != 0) goto L_0x0028;
    L_0x0018:
        r0 = new com.whatsapp.an9;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r1 = com.whatsapp.dq.FAIL;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r2 = com.whatsapp.s2.INCORRECT;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0.<init>(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x0021:
        return r0;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r2 = r1;
        goto L_0x0013;
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r7 = z;
        r8 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r7 = r7[r8];
        r7 = android.util.Pair.create(r7, r11);
        r2.add(r7);
        r7 = z;
        r8 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r7 = r7[r8];
        r7 = android.util.Pair.create(r7, r12);
        r2.add(r7);
        r7 = z;
        r8 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r7 = r7[r8];
        r5 = r5.getBytes();
        r5 = android.util.Pair.create(r7, r5);
        r2.add(r5);
        r5 = z;
        r7 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r5 = r5[r7];
        r6 = r6.getBytes();
        r5 = android.util.Pair.create(r5, r6);
        r2.add(r5);
        r5 = z;
        r6 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r5 = r5[r6];
        r5 = android.util.Pair.create(r5, r13);
        r2.add(r5);
        r5 = z;
        r6 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r5 = r5[r6];
        r6 = r14.getBytes();
        r5 = android.util.Pair.create(r5, r6);
        r2.add(r5);
        r5 = z;
        r6 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r5 = r5[r6];
        r5 = android.util.Pair.create(r5, r15);
        r2.add(r5);
        a(r2);
        r2 = b(r2);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = com.whatsapp.azx.h;
        r5 = r5.append(r6);
        r2 = r5.append(r2);
        r2 = r2.toString();
        r2 = com.whatsapp.avp.a(r2);
        if (r2 != 0) goto L_0x00c2;
    L_0x00b4:
        r0 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r2 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00c0 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x00c0 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r5 = r2.getStatusLine();
        r5 = r5.getStatusCode();
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r5 == r6) goto L_0x0107;
    L_0x00ce:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0105 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r2 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0105 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r0 = r0.append(r5);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0105 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r0 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0105 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r3 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0105 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0105 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0105 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0105 }
    L_0x0105:
        r0 = move-exception;
        throw r0;
    L_0x0107:
        r2 = r2.getEntity();
        r2 = r2.getContent();
        r5 = a(r2);
        if (r5 != 0) goto L_0x0123;
    L_0x0115:
        r0 = new org.json.JSONException;	 Catch:{ IllegalArgumentException -> 0x0121 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0121 }
        r2 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0121 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0121 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0121 }
    L_0x0121:
        r0 = move-exception;
        throw r0;
    L_0x0123:
        r2 = z;
        r6 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r2 = r2[r6];
        r6 = r5.getString(r2);
        if (r6 != 0) goto L_0x0146;
    L_0x012f:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r1 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0144 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x0144 }
        r0 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r2 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0144 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0144 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0144 }
    L_0x0144:
        r0 = move-exception;
        throw r0;
    L_0x0146:
        r2 = z;
        r7 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r2 = r2[r7];
        r2 = r6.equals(r2);
        if (r2 == 0) goto L_0x01b6;
    L_0x0152:
        r2 = z;
        r7 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r2 = r2[r7];
        r7 = r5.getString(r2);
        r2 = z;
        r8 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r2 = r2[r8];
        r8 = r5.getString(r2);
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x01a3 }
        r9 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r2 = r2[r9];	 Catch:{ IllegalArgumentException -> 0x01a3 }
        r2 = r5.has(r2);	 Catch:{ IllegalArgumentException -> 0x01a3 }
        if (r2 == 0) goto L_0x01a7;
    L_0x0172:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r9 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r2 = r2[r9];	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r10 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r9 = r5.getString(r9);	 Catch:{ IllegalArgumentException -> 0x01a5 }
        r2 = r2.equals(r9);	 Catch:{ IllegalArgumentException -> 0x01a5 }
        if (r2 == 0) goto L_0x01a7;
    L_0x0188:
        if (r7 == 0) goto L_0x018c;
    L_0x018a:
        if (r8 != 0) goto L_0x01a9;
    L_0x018c:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x01a1 }
        r1 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x01a1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x01a1 }
        r0 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x01a1 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x01a1 }
        r2 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x01a1 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x01a1 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01a1 }
    L_0x01a1:
        r0 = move-exception;
        throw r0;
    L_0x01a3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01a5 }
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = r1;
        goto L_0x0188;
    L_0x01a9:
        r2 = new com.whatsapp.an9;
        r9 = com.whatsapp.dq.OK;
        r1 = android.backport.util.Base64.decode(r8, r1);
        r2.<init>(r9, r7, r1, r0);
        if (r4 == 0) goto L_0x0352;
    L_0x01b6:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x02f4 }
        r1 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x02f4 }
        r0 = r0.equals(r6);	 Catch:{ IllegalArgumentException -> 0x02f4 }
        if (r0 == 0) goto L_0x032a;
    L_0x01c2:
        r0 = z;
        r1 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r0 = r0[r1];
        r2 = r5.getString(r0);
        r0 = z;
        r1 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r0 = r0[r1];
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x01e3;
    L_0x01d8:
        r0 = new com.whatsapp.an9;
        r1 = com.whatsapp.dq.FAIL;
        r7 = com.whatsapp.s2.BLOCKED;
        r0.<init>(r1, r7);
        if (r4 == 0) goto L_0x0310;
    L_0x01e3:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x02f6 }
        r1 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x02f6 }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x02f6 }
        if (r0 == 0) goto L_0x022a;
    L_0x01ef:
        r0 = new com.whatsapp.an9;
        r1 = com.whatsapp.dq.FAIL;
        r7 = com.whatsapp.s2.INCORRECT;
        r0.<init>(r1, r7);
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02f8 }
        r7 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r1 = r1[r7];	 Catch:{ IllegalArgumentException -> 0x02f8 }
        r1 = r5.has(r1);	 Catch:{ IllegalArgumentException -> 0x02f8 }
        if (r1 == 0) goto L_0x02fa;
    L_0x0204:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02f8 }
        r7 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r1 = r1[r7];	 Catch:{ IllegalArgumentException -> 0x02f8 }
        r1 = r5.getString(r1);	 Catch:{ IllegalArgumentException -> 0x02f8 }
    L_0x020e:
        r0.b = r1;	 Catch:{ IllegalArgumentException -> 0x02fd }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02fd }
        r7 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r1 = r1[r7];	 Catch:{ IllegalArgumentException -> 0x02fd }
        r1 = r5.has(r1);	 Catch:{ IllegalArgumentException -> 0x02fd }
        if (r1 == 0) goto L_0x02ff;
    L_0x021c:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02fd }
        r3 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02fd }
        r1 = r5.getString(r1);	 Catch:{ IllegalArgumentException -> 0x02fd }
    L_0x0226:
        r0.j = r1;	 Catch:{ IllegalArgumentException -> 0x0302 }
        if (r4 == 0) goto L_0x0310;
    L_0x022a:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0302 }
        r1 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0302 }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0302 }
        if (r0 == 0) goto L_0x0241;
    L_0x0236:
        r0 = new com.whatsapp.an9;
        r1 = com.whatsapp.dq.FAIL;
        r3 = com.whatsapp.s2.LENGTH_LONG;
        r0.<init>(r1, r3);
        if (r4 == 0) goto L_0x0310;
    L_0x0241:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r1 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0304 }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0304 }
        if (r0 == 0) goto L_0x0258;
    L_0x024d:
        r0 = new com.whatsapp.an9;
        r1 = com.whatsapp.dq.FAIL;
        r3 = com.whatsapp.s2.LENGTH_SHORT;
        r0.<init>(r1, r3);
        if (r4 == 0) goto L_0x0310;
    L_0x0258:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0306 }
        r1 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0306 }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0306 }
        if (r0 == 0) goto L_0x026f;
    L_0x0264:
        r0 = new com.whatsapp.an9;
        r1 = com.whatsapp.dq.FAIL;
        r3 = com.whatsapp.s2.FORMAT_WRONG;
        r0.<init>(r1, r3);
        if (r4 == 0) goto L_0x0310;
    L_0x026f:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0308 }
        r1 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0308 }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0308 }
        if (r0 == 0) goto L_0x029e;
    L_0x027b:
        r0 = new com.whatsapp.an9;
        r1 = com.whatsapp.dq.FAIL;
        r3 = com.whatsapp.s2.TEMPORARILY_UNAVAILABLE;
        r0.<init>(r1, r3);
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x030a }
        r3 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x030a }
        r1 = r5.has(r1);	 Catch:{ IllegalArgumentException -> 0x030a }
        if (r1 == 0) goto L_0x0310;
    L_0x0290:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x030c }
        r3 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x030c }
        r1 = r5.getString(r1);	 Catch:{ IllegalArgumentException -> 0x030c }
        r0.c = r1;	 Catch:{ IllegalArgumentException -> 0x030c }
        if (r4 == 0) goto L_0x0310;
    L_0x029e:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x030c }
        r1 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x030c }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x030c }
        if (r0 == 0) goto L_0x02b5;
    L_0x02aa:
        r0 = new com.whatsapp.an9;
        r1 = com.whatsapp.dq.FAIL;
        r3 = com.whatsapp.s2.OLD_VERSION;
        r0.<init>(r1, r3);
        if (r4 == 0) goto L_0x0310;
    L_0x02b5:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x030e }
        r1 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x030e }
        r0 = r2.equals(r0);	 Catch:{ IllegalArgumentException -> 0x030e }
        if (r0 == 0) goto L_0x02cc;
    L_0x02c1:
        r0 = new com.whatsapp.an9;
        r1 = com.whatsapp.dq.FAIL;
        r3 = com.whatsapp.s2.ERROR_BAD_TOKEN;
        r0.<init>(r1, r3);
        if (r4 == 0) goto L_0x0310;
    L_0x02cc:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02f2 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x02f2 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02f2 }
        r3 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x02f2 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x02f2 }
        r0 = r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x02f2 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x02f2 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x02f2 }
        r0 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x02f2 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02f2 }
        r2 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x02f2 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x02f2 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02f2 }
    L_0x02f2:
        r0 = move-exception;
        throw r0;
    L_0x02f4:
        r0 = move-exception;
        throw r0;
    L_0x02f6:
        r0 = move-exception;
        throw r0;
    L_0x02f8:
        r0 = move-exception;
        throw r0;
    L_0x02fa:
        r1 = r3;
        goto L_0x020e;
    L_0x02fd:
        r0 = move-exception;
        throw r0;
    L_0x02ff:
        r1 = r3;
        goto L_0x0226;
    L_0x0302:
        r0 = move-exception;
        throw r0;
    L_0x0304:
        r0 = move-exception;
        throw r0;
    L_0x0306:
        r0 = move-exception;
        throw r0;
    L_0x0308:
        r0 = move-exception;
        throw r0;
    L_0x030a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x030c }
    L_0x030c:
        r0 = move-exception;
        throw r0;
    L_0x030e:
        r0 = move-exception;
        throw r0;
    L_0x0310:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0350 }
        r2 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0350 }
        r1 = r5.optInt(r1);	 Catch:{ IllegalArgumentException -> 0x0350 }
        r0.h = r1;	 Catch:{ IllegalArgumentException -> 0x0350 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0350 }
        r2 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0350 }
        r1 = r5.optInt(r1);	 Catch:{ IllegalArgumentException -> 0x0350 }
        r0.d = r1;	 Catch:{ IllegalArgumentException -> 0x0350 }
        if (r4 == 0) goto L_0x0021;
    L_0x032a:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0350 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0350 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0350 }
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0350 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0350 }
        r0 = r0.append(r6);	 Catch:{ IllegalArgumentException -> 0x0350 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0350 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x0350 }
        r0 = new java.io.IOException;	 Catch:{ IllegalArgumentException -> 0x0350 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0350 }
        r2 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0350 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0350 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0350 }
    L_0x0350:
        r0 = move-exception;
        throw r0;
    L_0x0352:
        r0 = r2;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amb.a(byte[], byte[], byte[], java.lang.String, byte[]):com.whatsapp.an9");
    }

    private static JSONObject a(InputStream inputStream) {
        Throwable e;
        int i = a;
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, z[181]));
            try {
                StringBuilder stringBuilder = new StringBuilder();
                String readLine = bufferedReader.readLine();
                while (readLine != null) {
                    stringBuilder.append(readLine);
                    readLine = bufferedReader.readLine();
                    if (i != 0) {
                        break;
                    }
                }
                JSONObject jSONObject = new JSONObject(stringBuilder.toString());
                try {
                    bufferedReader.close();
                    return jSONObject;
                } catch (IOException e2) {
                    return jSONObject;
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    Log.a(e);
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                    }
                    return null;
                } catch (Throwable th) {
                    e = th;
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                    }
                    throw e;
                }
            } catch (JSONException e6) {
                e = e6;
                Log.a(e);
                bufferedReader.close();
                return null;
            }
        } catch (IOException e7) {
            e = e7;
            bufferedReader = null;
            Log.a(e);
            bufferedReader.close();
            return null;
        } catch (JSONException e8) {
            e = e8;
            bufferedReader = null;
            Log.a(e);
            bufferedReader.close();
            return null;
        } catch (Throwable th2) {
            e = th2;
            bufferedReader = null;
            bufferedReader.close();
            throw e;
        }
    }

    private static int a(String str) {
        int i = a;
        int i2 = 0;
        if (z[117].equals(str)) {
            i2 = 1;
            if (i == 0) {
                return 1;
            }
        }
        try {
            if (z[121].equals(str)) {
                i2 = 2;
                if (i == 0) {
                    return 2;
                }
            }
            try {
                if (z[119].equals(str)) {
                    i2 = 3;
                    if (i == 0) {
                        return 3;
                    }
                }
                try {
                    if (z[125].equals(str)) {
                        i2 = 10;
                        if (i == 0) {
                            return 10;
                        }
                    }
                    try {
                        if (z[123].equals(str)) {
                            i2 = 4;
                            if (i == 0) {
                                return 4;
                            }
                        }
                        try {
                            if (z[118].equals(str)) {
                                i2 = 5;
                                if (i == 0) {
                                    return 5;
                                }
                            }
                            try {
                                if (z[126].equals(str)) {
                                    i2 = 6;
                                    if (i == 0) {
                                        return 6;
                                    }
                                }
                                try {
                                    if (z[124].equals(str)) {
                                        i2 = 7;
                                        if (i == 0) {
                                            return 7;
                                        }
                                    }
                                    try {
                                        if (z[122].equals(str)) {
                                            i2 = 8;
                                            if (i == 0) {
                                                return 8;
                                            }
                                        }
                                        try {
                                            if (z[120].equals(str)) {
                                                return 9;
                                            }
                                            return i2;
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
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                }
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            }
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        }
    }
}
