package com.whatsapp;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.annotation.NonNull;
import com.facebook.phoneid.b;
import com.whatsapp.phoneid.a;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import de.greenrobot.event.h;
import java.util.Calendar;
import java.util.Date;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class AlarmService extends IntentService {
    private static final String[] z;
    private String a;

    static {
        String[] strArr = new String[83];
        String str = "m+Q\u0006Jf%H[\\~4cXOk\"YZX`'Y[";
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
                        i3 = 14;
                        break;
                    case at.g /*1*/:
                        i3 = 68;
                        break;
                    case at.i /*2*/:
                        i3 = 60;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 61;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "O(]ZP]!N^Tm!\u001fL\\g(EkOa*\u0007\bT`0YFI3";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "~,SFXg cD\\}0c[D`'c\\Tc!O\\\\c4";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "O(]ZP]!N^Tm!\u001fL\\g(EkOa*";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "~+KMO";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "b%O\\b{*OMSz\u001bRGIg\"UK\\z-SFbz-QM";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "m+Q\u0006Jf%H[\\~4cXOk\"YZX`'Y[";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "b%O\\b{*OMSz\u001bRGIg\"UK\\z-SFbz-QM";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "^+O\\T`#\u001cFRz-ZA^o0UGS.%^GHzdIFNk*H\bPk7OIZk7";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "m+Q\u0006Za+[DX 4NG^k7O\u0006Zo4L[";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "m+RFXm0U^Tz=";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "O(]ZP]!N^Tm!\u001f@R{6PQ~|+R\u0013\u001dg*HMSzy";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "j!JA^kk^I^e#NGH` \u0011L\\z%\u0013MSo&PMY.";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    str = "o(]ZP";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "m+Q\u0006Jf%H[\\~4\u0012I^z-SF\u0013J\u0005uddQ\u0007ngs";
                    obj = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "O(]ZP]!N^Tm!\u001c[Xz0UFZ.*YPI. ]AQwd_ZR`\u007f\u001cIQo6Q|Tc!qAQb-O\u0015";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "m+Q\u0006Jf%H[\\~4\u0012I^z-SF\u0013L\u0005\u007fch^\u001bqmn]\u0005{mn";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "O(]ZP]!N^Tm!\u001cZXm!U^XjdR]QbdUFIk*H";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "m+Q\u0006Jf%H[\\~4\u0012I^z-SF\u0013]\u0001h}m";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "m+Q\u0006Jf%H[\\~4\u0012I^z-SF\u0013F\u000bizqW\u001b\u007fzr@";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "m+Q\u0006Jf%H[\\~4\u0012I^z-SF\u0013J\u0005uddQ\u0007ngs";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "m+Q\u0006Jf%H[\\~4\u0012I^z-SF\u0013[\u0014xiiK\u001br|m";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "O(]ZP]!N^Tm!\u001cZXm!U^XjdIFOk'SOSg>YL\u001dg*HMSz\u007f\u001cASz!R\\\u0000";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "O(]ZP]!N^Tm!\u001cZXm!U^XjdR]Qbd]KIg+R\bT`dUFIk*H";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "o(]ZP";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "m+Q\u0006Jf%H[\\~4\u0012I^z-SF\u0013[\u0014xiiK\u001br|m";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "j!JA^kkQMPa6E\bM|+_MN}!O\u0015";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "j!JA^kkLZRm!O[X}kYZOa6\u001c";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "e\u0006\u001cXN}y";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "e\u0006";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "j!JA^kkQMPa6E\bM|-JIIk\u001bXAOz=\u0001";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "o'HAKg0E";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = ".0S\\\\by";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "j!JA^kk^IIz!NQ\u001d";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "e\u0006\u001c[Uo6YLbj-N\\D3";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "j!JA^kkLZRm!O[X}kRGSk";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "<j]FY|+UL\u0013~+SD\u0013`0L\u0006R|#";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "O(]ZP]!N^Tm!";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = ".%H\bOk7SDKk \u001cIYj6Y[N.";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    str = "O(]ZP]!N^Tm!\u001f]Mj%HMsz4";
                    obj = 39;
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    strArr2 = strArr3;
                    str = "O(]ZP]!N^Tm!\u001f]Mj%HMsz4\u0007\bT`0YFI3";
                    obj = 40;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "}+_CXzdHAPk+I\\\u001da'_]O|!X\bJf-PM\u001d|!HZTk2UFZ.*HX\u001dz-QM\u001dh6SE\u001d";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = ".%H\bOk7SDKk \u001cIYj6Y[N.";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "{*]JQkdHG\u001d|!HZTk2Y\bSz4\u001c\\Tc!\u001cNOa)\u001cISwdSN\u001dz,Y\bOk7SDKk \u001cIYj6Y[Nk7\u001cNR|d";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "~+KMO";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "{*]JQkdHG\u001d|!HZTk2Y\bSz4\u001c\\Tc!\u001cNOa)\u001c";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "{*]JQkdHG\u001d|!OGQx!\u001cFI~dOMOx!N\b";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "m+Q\u0006Jf%H[\\~4\u0012I^z-SF\u0013F\u000bizqW\u001b\u007fzr@";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "o(]ZP";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "m+Q\u0006Jf%H[\\~4\u0012I^z-SF\u0013L\u0005\u007fch^\u001bqmn]\u0005{mn";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "o(]ZP";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "O(]ZP]!N^Tm!\u001c[Xz0UFZ.*YPI.)Y[No#Y\b_o'W]M.%PIOc\u007f\u001cIQo6Q|Tc!qAQb-O\u0015";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "~+KMO";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "O(]ZP]!N^Tm!\u001c[Vg4LASidQMN}%[M\u001dl%_CH~dX]X.0S\bSa0\u001cQXzdNMZg7HMOk ";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "O(]ZP]!N^Tm!\u001fL\\g(EkOa*";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "O(]ZP]!N^Tm!\u001fL\\g(EkOa*\u001fEXj-]kQk%R]M";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "O(]ZP]!N^Tm!\u001c[Vg4LASidQMN}%[M\u001dl%_CH~dX]X.0S\bPg7OASidYPIk6RIQ.)YLTo";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "O(]ZP]!N^Tm!\u001c[Vg4LASidQMN}%[M\u001dl%_CH~dX]X.0S\bSa0\u001cXQ{#[MY.-R\b\\` \u001cDRyd^IIz!NQ";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "O(]ZP]!N^Tm!\u001c[Io6HASidQMN}%[M\u001dl%_CH~";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    str = "O(]ZP]!N^Tm!\u001fJ\\m/IXpk7OIZk7\u0007\bT`0YFI3";
                    obj = 59;
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    str = "O(]ZP]!N^Tm!\u001c[Vg4LASidQMN}%[M\u001dl%_CH~dX]X.0S\bOk%X\u0005R`(E\bXv0YZSo(";
                    i = 61;
                    strArr2 = strArr3;
                    obj = 60;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    strArr2 = strArr3;
                    str = "o(]ZP#7YZKg'Y\u0007H~ ]\\X#!DXX`7U^X#\"UMQj7HII}k[LOg2Y\u0005_o'W]M!1RME~!_\\XjiRMIy+NC\u0010}!H\\T`#\u0013";
                    obj = 61;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "o*XZRg \u0012XX|)U[Ng+R\u0006oK\u0007yakK\u001boen";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "o*XZRg \u0012XX|)U[Ng+R\u0006|M\u0007y{nQ\u0007sio]\u0001cdrM\u0005har@";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "o*XZRg \u0012XX|)U[Ng+R\u0006oK\u0005xwxV\u0010yzsO\bc{iA\u0016}ox";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "o(]ZP#7YZKg'Y\u0007H~ ]\\X#!DXX`7U^X#\"UMQj7HII}k[LOg2Y\u0005_o'W]M!1RME~!_\\XjiZZX\u007f1YF^wk";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "c!H@RjdO@R{(X\bSk2YZ\u001dl!\u001cZH`dZZRcdH@X.\u0011u\bIf6YIY";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "o*XZRg \u0012XX|)U[Ng+R\u0006zK\u0010ci~M\u000bifi]";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "o*XZRg \u0012XX|)U[Ng+R\u0006j\\\rhmbK\u001chmo@\u0005pwnZ\u000bnizK";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "o*XZRg \u0012XX|)U[Ng+R\u0006oK\u0007szyQ\u0005iltA";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "o*XZRg \u0012XX|)U[Ng+R\u0006j\\\rhmbM\u000br||M\u0010o";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "o(]ZP#7YZKg'Y\u0007H~ ]\\X#!DXX`7U^X#\"UMQj7HII}kPINzi^I^e1L\u0005Ig)Y[Io)L\u0007\u0018j";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "o*XZRg \u0012XX|)U[Ng+R\u0006oK\u0005xw~A\nhi~Z\u0017";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "o*XZRg \u0012XX|)U[Ng+R\u0006~O\tyz|";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "o*XZRg \u0012XX|)U[Ng+R\u0006|M\u0007y{nQ\u0002ufxQ\bsk|Z\rsf";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "k)L\\D.*HX\u001d}!N^X|d_GSh-[]Oo0UGS";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "<j]FY|+UL\u0013~+SD\u0013`0L\u0006R|#";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "<j]FY|+UL\u0013~+SD\u0013`0L\u0006R|#";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "{*NMNa(JI_b!\u001cFI~dOMOx!N\b^a*ZAZ{6]\\Ta*";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "o*XZRg \u0006[I|-RO\u0012m+RNTi\u001bR\\M]!N^X|";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "O(]ZP]!N^Tm!\u001f[Xz1L\u0013\u001dg*HMSzy";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "<j]FY|+UL\u0013~+SD\u0013`0L\u0006R|#";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "~,SFXg cD\\}0c[D`'c\\Tc!O\\\\c4";
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(@android.support.annotation.NonNull android.content.Intent r5) {
        /*
        r4 = this;
        r3 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 81;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r5);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r4.a();
        r4.b();
        r4.e();
        r4.d();
        r0 = android.content.res.Resources.getSystem();
        r1 = z;
        r2 = 80;
        r1 = r1[r2];
        r0 = r0.getIdentifier(r1, r3, r3);
        if (r0 != 0) goto L_0x0043;
    L_0x0037:
        r1 = z;	 Catch:{ NotFoundException -> 0x006b }
        r2 = 78;
        r1 = r1[r2];	 Catch:{ NotFoundException -> 0x006b }
        r4.a = r1;	 Catch:{ NotFoundException -> 0x006b }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NotFoundException -> 0x006b }
        if (r1 == 0) goto L_0x0062;
    L_0x0043:
        r1 = r4.getResources();	 Catch:{ NotFoundException -> 0x006d }
        r0 = r1.getString(r0);	 Catch:{ NotFoundException -> 0x006d }
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NotFoundException -> 0x006d }
        if (r1 == 0) goto L_0x0060;
    L_0x0051:
        r0 = z;	 Catch:{ NotFoundException -> 0x006d }
        r1 = 76;
        r0 = r0[r1];	 Catch:{ NotFoundException -> 0x006d }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NotFoundException -> 0x006d }
        r0 = z;	 Catch:{ NotFoundException -> 0x006d }
        r1 = 82;
        r0 = r0[r1];	 Catch:{ NotFoundException -> 0x006d }
    L_0x0060:
        r4.a = r0;
    L_0x0062:
        r0 = new com.whatsapp.qd;
        r0.<init>(r4);
        com.whatsapp.util.bq.a(r0);
        return;
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        r1 = z;
        r2 = 79;
        r1 = r1[r2];
        com.whatsapp.util.Log.c(r1, r0);
        r0 = z;
        r1 = 77;
        r0 = r0[r1];
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.e(android.content.Intent):void");
    }

    static void a(AlarmService alarmService, Intent intent) {
        alarmService.a(intent);
    }

    static void b(AlarmService alarmService) {
        alarmService.g();
    }

    private void e() {
        ((AlarmManager) getSystemService(z[49])).setInexactRepeating(3, 0, 3600000, PendingIntent.getBroadcast(this, 0, new Intent(z[48], null, this, AlarmBroadcastReceiver.class), 0));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
        r9 = this;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = android.os.Looper.myLooper();	 Catch:{ NotFoundException -> 0x0019 }
        r1 = android.os.Looper.getMainLooper();	 Catch:{ NotFoundException -> 0x0019 }
        if (r0 != r1) goto L_0x001b;
    L_0x000d:
        r0 = new java.lang.IllegalThreadStateException;	 Catch:{ NotFoundException -> 0x0019 }
        r1 = z;	 Catch:{ NotFoundException -> 0x0019 }
        r2 = 67;
        r1 = r1[r2];	 Catch:{ NotFoundException -> 0x0019 }
        r0.<init>(r1);	 Catch:{ NotFoundException -> 0x0019 }
        throw r0;	 Catch:{ NotFoundException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;
    L_0x001b:
        r0 = com.whatsapp.fieldstats.bn.CLASS_COUNT;	 Catch:{ NotFoundException -> 0x0273 }
        r1 = com.whatsapp.ve.u();	 Catch:{ NotFoundException -> 0x0273 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NotFoundException -> 0x0273 }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x0273 }
        r0 = com.whatsapp.ve.u();	 Catch:{ NotFoundException -> 0x0273 }
        r1 = 10;
        if (r0 > r1) goto L_0x0040;
    L_0x0030:
        r0 = com.whatsapp.fieldstats.bn.CLASS_NAMES;	 Catch:{ NotFoundException -> 0x0273 }
        r1 = com.whatsapp.ve.v();	 Catch:{ NotFoundException -> 0x0273 }
        r4 = 0;
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r1.substring(r4, r5);	 Catch:{ NotFoundException -> 0x0273 }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x0273 }
    L_0x0040:
        r0 = com.whatsapp.fieldstats.bn.IS_BLUESTACKS;	 Catch:{ NotFoundException -> 0x0275 }
        r1 = com.whatsapp.ve.L();	 Catch:{ NotFoundException -> 0x0275 }
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ NotFoundException -> 0x0275 }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x0275 }
        r0 = com.whatsapp.fieldstats.bn.IS_GENYMOTION;	 Catch:{ NotFoundException -> 0x0275 }
        r1 = com.whatsapp.ve.B();	 Catch:{ NotFoundException -> 0x0275 }
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ NotFoundException -> 0x0275 }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x0275 }
        r0 = com.whatsapp.fieldstats.bn.SIGNATURE_HASH;	 Catch:{ NotFoundException -> 0x0275 }
        r1 = com.whatsapp.ve.b(r9);	 Catch:{ NotFoundException -> 0x0275 }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x0275 }
        r0 = com.whatsapp.ve.G();	 Catch:{ NotFoundException -> 0x0275 }
        if (r0 == 0) goto L_0x0073;
    L_0x0069:
        r0 = com.whatsapp.fieldstats.bn.IS_MONKEYRUNNER_RUNNING;	 Catch:{ NotFoundException -> 0x0275 }
        r1 = 1;
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ NotFoundException -> 0x0275 }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x0275 }
    L_0x0073:
        r0 = com.whatsapp.fieldstats.bn.IS_WHATSAPP_PLUS_USER;
        r1 = com.whatsapp.ve.x();
        r1 = java.lang.Boolean.valueOf(r1);
        com.whatsapp.fieldstats.i.a(r9, r0, r1);
        r0 = com.whatsapp.fieldstats.bn.GOOGLE_ACCOUNT_COUNT;
        r1 = com.whatsapp.ve.a();
        r1 = java.lang.Integer.valueOf(r1);
        com.whatsapp.fieldstats.i.a(r9, r0, r1);
        r0 = com.whatsapp.fieldstats.bn.ANDROID_HAS_SD_CARD;
        r1 = com.whatsapp.ve.K();
        com.whatsapp.fieldstats.i.a(r9, r0, r1);
        r0 = com.whatsapp.fieldstats.bn.ANDROID_IS_SD_CARD_REMOVABLE;
        r1 = com.whatsapp.App.V();
        r1 = java.lang.Boolean.valueOf(r1);
        com.whatsapp.fieldstats.i.a(r9, r0, r1);
        r0 = com.whatsapp.contact.f.BOTH;
        r0 = com.whatsapp.contact.b.a(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x00ab:
        r1 = com.whatsapp.fieldstats.bn.ADDRESSBOOK_SIZE;	 Catch:{ NotFoundException -> 0x0277 }
        com.whatsapp.fieldstats.i.a(r9, r1, r0);	 Catch:{ NotFoundException -> 0x0277 }
    L_0x00b0:
        r0 = com.whatsapp.App.as;
        r0 = r0.d();
        r1 = -1;
        if (r0 == r1) goto L_0x00c2;
    L_0x00b9:
        r1 = com.whatsapp.fieldstats.bn.ADDRESSBOOK_WHATSAPP_SIZE;	 Catch:{ NotFoundException -> 0x0279 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NotFoundException -> 0x0279 }
        com.whatsapp.fieldstats.i.a(r9, r1, r0);	 Catch:{ NotFoundException -> 0x0279 }
    L_0x00c2:
        com.whatsapp.nf.b();
        r0 = com.whatsapp.ael.n();
        if (r0 == 0) goto L_0x00d9;
    L_0x00cb:
        r1 = com.whatsapp.fieldstats.bn.CHAT_DATABASE_SIZE;	 Catch:{ NotFoundException -> 0x027b }
        r4 = r0.longValue();	 Catch:{ NotFoundException -> 0x027b }
        r4 = (double) r4;	 Catch:{ NotFoundException -> 0x027b }
        r0 = java.lang.Double.valueOf(r4);	 Catch:{ NotFoundException -> 0x027b }
        com.whatsapp.fieldstats.i.a(r9, r1, r0);	 Catch:{ NotFoundException -> 0x027b }
    L_0x00d9:
        r0 = com.whatsapp.fieldstats.bn.ANDROID_IS_JID_GOOGLE_DRIVE_ELIGIBLE;
        r1 = com.whatsapp.App.j;
        r4 = com.whatsapp.App.am;
        r1 = com.whatsapp.gdrive.fn.b(r1, r4);
        r1 = java.lang.Boolean.valueOf(r1);
        com.whatsapp.fieldstats.i.a(r9, r0, r1);
        r0 = com.whatsapp.fieldstats.bn.ANDROID_IS_JID_GOOGLE_DRIVE_CAPABLE;
        r1 = com.whatsapp.gdrive.GoogleDriveService.z();
        r1 = java.lang.Boolean.valueOf(r1);
        com.whatsapp.fieldstats.i.a(r9, r0, r1);
        r0 = com.whatsapp.App.aJ();
        r1 = com.whatsapp.fieldstats.bn.GOOGLE_PLAY_SERVICES_AVAILABLE;
        r0 = java.lang.Boolean.valueOf(r0);
        com.whatsapp.fieldstats.i.a(r9, r1, r0);
        r1 = com.whatsapp.gdrive.GoogleDriveService.Y();
        switch(r1) {
            case 0: goto L_0x027d;
            case 1: goto L_0x0285;
            case 2: goto L_0x028d;
            case 3: goto L_0x0295;
            case 4: goto L_0x029d;
            default: goto L_0x010b;
        };
    L_0x010b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 66;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r1;
    L_0x0126:
        r1 = com.whatsapp.fieldstats.bn.BACKUP_SCHEDULE;
        r4 = (double) r0;
        r0 = java.lang.Double.valueOf(r4);
        com.whatsapp.fieldstats.i.a(r9, r1, r0);
        r0 = com.whatsapp.gdrive.GoogleDriveService.g();
        if (r0 == 0) goto L_0x0195;
    L_0x0136:
        r0 = com.whatsapp.gdrive.GoogleDriveService.d(r0);
        r4 = 0;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x0169;
    L_0x0140:
        r4 = -1;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x0169;
    L_0x0146:
        r4 = java.util.Locale.ENGLISH;	 Catch:{ NotFoundException -> 0x02a7 }
        r5 = z;	 Catch:{ NotFoundException -> 0x02a7 }
        r6 = 72;
        r5 = r5[r6];	 Catch:{ NotFoundException -> 0x02a7 }
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NotFoundException -> 0x02a7 }
        r7 = 0;
        r8 = java.lang.Long.valueOf(r0);	 Catch:{ NotFoundException -> 0x02a7 }
        r6[r7] = r8;	 Catch:{ NotFoundException -> 0x02a7 }
        r4 = java.lang.String.format(r4, r5, r6);	 Catch:{ NotFoundException -> 0x02a7 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ NotFoundException -> 0x02a7 }
        r4 = com.whatsapp.fieldstats.bn.LAST_BACKUP_TIMESTAMP;	 Catch:{ NotFoundException -> 0x02a7 }
        r0 = (double) r0;	 Catch:{ NotFoundException -> 0x02a7 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ NotFoundException -> 0x02a7 }
        com.whatsapp.fieldstats.i.a(r9, r4, r0);	 Catch:{ NotFoundException -> 0x02a7 }
    L_0x0169:
        r1 = com.whatsapp.gdrive.GoogleDriveService.j();
        switch(r1) {
            case 0: goto L_0x02a9;
            case 1: goto L_0x02b1;
            default: goto L_0x0170;
        };
    L_0x0170:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r4 = 62;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r1;
    L_0x018b:
        r1 = com.whatsapp.fieldstats.bn.BACKUP_NETWORK_SETTING;
        r4 = (double) r0;
        r0 = java.lang.Double.valueOf(r4);
        com.whatsapp.fieldstats.i.a(r9, r1, r0);
    L_0x0195:
        r0 = com.whatsapp.fieldstats.bn.PERMISSION_ACCESS_COARSE_LOCATION;	 Catch:{ NotFoundException -> 0x02bb }
        r1 = z;	 Catch:{ NotFoundException -> 0x02bb }
        r3 = 64;
        r1 = r1[r3];	 Catch:{ NotFoundException -> 0x02bb }
        r1 = com.whatsapp.App.h(r9, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NotFoundException -> 0x02bb }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r0 = com.whatsapp.fieldstats.bn.PERMISSION_ACCESS_FINE_LOCATION;	 Catch:{ NotFoundException -> 0x02bb }
        r1 = z;	 Catch:{ NotFoundException -> 0x02bb }
        r3 = 75;
        r1 = r1[r3];	 Catch:{ NotFoundException -> 0x02bb }
        r1 = com.whatsapp.App.h(r9, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NotFoundException -> 0x02bb }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r0 = com.whatsapp.fieldstats.bn.PERMISSION_CAMERA;	 Catch:{ NotFoundException -> 0x02bb }
        r1 = z;	 Catch:{ NotFoundException -> 0x02bb }
        r3 = 74;
        r1 = r1[r3];	 Catch:{ NotFoundException -> 0x02bb }
        r1 = com.whatsapp.App.h(r9, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NotFoundException -> 0x02bb }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r0 = com.whatsapp.fieldstats.bn.PERMISSION_GET_ACCOUNTS;	 Catch:{ NotFoundException -> 0x02bb }
        r1 = z;	 Catch:{ NotFoundException -> 0x02bb }
        r3 = 68;
        r1 = r1[r3];	 Catch:{ NotFoundException -> 0x02bb }
        r1 = com.whatsapp.App.h(r9, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NotFoundException -> 0x02bb }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r0 = com.whatsapp.fieldstats.bn.PERMISSION_READ_CONTACTS;	 Catch:{ NotFoundException -> 0x02bb }
        r1 = z;	 Catch:{ NotFoundException -> 0x02bb }
        r3 = 73;
        r1 = r1[r3];	 Catch:{ NotFoundException -> 0x02bb }
        r1 = com.whatsapp.App.h(r9, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NotFoundException -> 0x02bb }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r0 = com.whatsapp.fieldstats.bn.PERMISSION_WRITE_CONTACTS;	 Catch:{ NotFoundException -> 0x02bb }
        r1 = z;	 Catch:{ NotFoundException -> 0x02bb }
        r3 = 71;
        r1 = r1[r3];	 Catch:{ NotFoundException -> 0x02bb }
        r1 = com.whatsapp.App.h(r9, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NotFoundException -> 0x02bb }
        com.whatsapp.fieldstats.i.a(r9, r0, r1);	 Catch:{ NotFoundException -> 0x02bb }
        r1 = com.whatsapp.fieldstats.bn.PERMISSION_READ_EXTERNAL_STORAGE;	 Catch:{ NotFoundException -> 0x02bb }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NotFoundException -> 0x02bb }
        r3 = 23;
        if (r0 >= r3) goto L_0x02bd;
    L_0x020f:
        r0 = r2;
    L_0x0210:
        r0 = java.lang.Integer.valueOf(r0);
        com.whatsapp.fieldstats.i.a(r9, r1, r0);
        r0 = com.whatsapp.fieldstats.bn.PERMISSION_WRITE_EXTERNAL_STORAGE;
        r1 = z;
        r2 = 69;
        r1 = r1[r2];
        r1 = com.whatsapp.App.h(r9, r1);
        r1 = java.lang.Integer.valueOf(r1);
        com.whatsapp.fieldstats.i.a(r9, r0, r1);
        r0 = com.whatsapp.fieldstats.bn.PERMISSION_RECORD_AUDIO;
        r1 = z;
        r2 = 70;
        r1 = r1[r2];
        r1 = com.whatsapp.App.h(r9, r1);
        r1 = java.lang.Integer.valueOf(r1);
        com.whatsapp.fieldstats.i.a(r9, r0, r1);
        r0 = com.whatsapp.fieldstats.bn.PERMISSION_RECEIVE_SMS;
        r1 = z;
        r2 = 63;
        r1 = r1[r2];
        r1 = com.whatsapp.App.h(r9, r1);
        r1 = java.lang.Integer.valueOf(r1);
        com.whatsapp.fieldstats.i.a(r9, r0, r1);
        r0 = 0;
        r1 = com.whatsapp.amg.a;
        r2 = com.whatsapp.akr.e();
        r2 = r2.ordinal();
        r1 = r1[r2];
        switch(r1) {
            case 1: goto L_0x02c9;
            case 2: goto L_0x02cc;
            case 3: goto L_0x02cf;
            case 4: goto L_0x02d2;
            default: goto L_0x0260;
        };
    L_0x0260:
        if (r0 == 0) goto L_0x026f;
    L_0x0262:
        r1 = com.whatsapp.fieldstats.bn.ANDROID_VIDEO_TRANSCODE_SUPPORTED;	 Catch:{ NotFoundException -> 0x02d5 }
        r0 = r0.getCode();	 Catch:{ NotFoundException -> 0x02d5 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NotFoundException -> 0x02d5 }
        com.whatsapp.fieldstats.i.a(r9, r1, r0);	 Catch:{ NotFoundException -> 0x02d5 }
    L_0x026f:
        com.whatsapp.nf.c();
        return;
    L_0x0273:
        r0 = move-exception;
        throw r0;
    L_0x0275:
        r0 = move-exception;
        throw r0;
    L_0x0277:
        r0 = move-exception;
        throw r0;
    L_0x0279:
        r0 = move-exception;
        throw r0;
    L_0x027b:
        r0 = move-exception;
        throw r0;
    L_0x027d:
        r0 = com.whatsapp.fieldstats.t.OFF;
        r0 = r0.getCode();
        if (r3 == 0) goto L_0x0126;
    L_0x0285:
        r0 = com.whatsapp.fieldstats.t.DAILY;
        r0 = r0.getCode();
        if (r3 == 0) goto L_0x0126;
    L_0x028d:
        r0 = com.whatsapp.fieldstats.t.WEEKLY;
        r0 = r0.getCode();
        if (r3 == 0) goto L_0x0126;
    L_0x0295:
        r0 = com.whatsapp.fieldstats.t.MONTHLY;
        r0 = r0.getCode();
        if (r3 == 0) goto L_0x0126;
    L_0x029d:
        r0 = com.whatsapp.fieldstats.t.MANUAL;
        r0 = r0.getCode();
        if (r3 == 0) goto L_0x0126;
    L_0x02a5:
        goto L_0x010b;
    L_0x02a7:
        r0 = move-exception;
        throw r0;
    L_0x02a9:
        r0 = com.whatsapp.fieldstats.bc.WIFI_ONLY;
        r0 = r0.getCode();
        if (r3 == 0) goto L_0x018b;
    L_0x02b1:
        r0 = com.whatsapp.fieldstats.bc.WIFI_OR_CELLULAR;
        r0 = r0.getCode();
        if (r3 == 0) goto L_0x018b;
    L_0x02b9:
        goto L_0x0170;
    L_0x02bb:
        r0 = move-exception;
        throw r0;
    L_0x02bd:
        r0 = z;
        r2 = 65;
        r0 = r0[r2];
        r0 = com.whatsapp.App.h(r9, r0);
        goto L_0x0210;
    L_0x02c9:
        r0 = com.whatsapp.fieldstats.b0.SUPPORTED;
        goto L_0x0260;
    L_0x02cc:
        r0 = com.whatsapp.fieldstats.b0.UNSUPPORTED_OLD_API;
        goto L_0x0260;
    L_0x02cf:
        r0 = com.whatsapp.fieldstats.b0.UNSUPPORTED_BAD_DEVICE;
        goto L_0x0260;
    L_0x02d2:
        r0 = com.whatsapp.fieldstats.b0.UNSUPPORTED_NO_ENCODERS;
        goto L_0x0260;
    L_0x02d5:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.g():void");
    }

    static void a(AlarmService alarmService) {
        alarmService.c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onHandleIntent(android.content.Intent r6) {
        /*
        r5 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = 10;
        android.os.Process.setThreadPriority(r0);	 Catch:{ NotFoundException -> 0x0013 }
        if (r6 != 0) goto L_0x0015;
    L_0x0009:
        r0 = z;	 Catch:{ NotFoundException -> 0x0013 }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ NotFoundException -> 0x0013 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NotFoundException -> 0x0013 }
    L_0x0012:
        return;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r0 = r6.getAction();	 Catch:{ NotFoundException -> 0x0028 }
        if (r0 != 0) goto L_0x002a;
    L_0x001b:
        r0 = z;	 Catch:{ NotFoundException -> 0x0028 }
        r1 = 24;
        r0 = r0[r1];	 Catch:{ NotFoundException -> 0x0028 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NotFoundException -> 0x0028 }
        android.support.v4.content.WakefulBroadcastReceiver.completeWakefulIntent(r6);	 Catch:{ NotFoundException -> 0x0028 }
        goto L_0x0012;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r2 = r6.getAction();
        r0 = -1;
        r3 = r2.hashCode();	 Catch:{ NotFoundException -> 0x00a1 }
        switch(r3) {
            case -1693714720: goto L_0x0057;
            case -1621475587: goto L_0x0066;
            case -1516858669: goto L_0x0075;
            case -452751660: goto L_0x0084;
            case 822666429: goto L_0x0093;
            default: goto L_0x0036;
        };
    L_0x0036:
        switch(r0) {
            case 0: goto L_0x00ab;
            case 1: goto L_0x00b0;
            case 2: goto L_0x00b5;
            case 3: goto L_0x00ba;
            case 4: goto L_0x00bf;
            default: goto L_0x0039;
        };
    L_0x0039:
        r0 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x00ce }
        r0.<init>();	 Catch:{ NotFoundException -> 0x00ce }
        r1 = z;	 Catch:{ NotFoundException -> 0x00ce }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ NotFoundException -> 0x00ce }
        r0 = r0.append(r1);	 Catch:{ NotFoundException -> 0x00ce }
        r0 = r0.append(r6);	 Catch:{ NotFoundException -> 0x00ce }
        r0 = r0.toString();	 Catch:{ NotFoundException -> 0x00ce }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NotFoundException -> 0x00ce }
    L_0x0053:
        android.support.v4.content.WakefulBroadcastReceiver.completeWakefulIntent(r6);
        goto L_0x0012;
    L_0x0057:
        r3 = z;	 Catch:{ NotFoundException -> 0x00a1 }
        r4 = 17;
        r3 = r3[r4];	 Catch:{ NotFoundException -> 0x00a1 }
        r3 = r2.equals(r3);	 Catch:{ NotFoundException -> 0x00a1 }
        if (r3 == 0) goto L_0x0036;
    L_0x0063:
        r0 = 0;
        if (r1 == 0) goto L_0x0036;
    L_0x0066:
        r3 = z;	 Catch:{ NotFoundException -> 0x00a3 }
        r4 = 21;
        r3 = r3[r4];	 Catch:{ NotFoundException -> 0x00a3 }
        r3 = r2.equals(r3);	 Catch:{ NotFoundException -> 0x00a3 }
        if (r3 == 0) goto L_0x0036;
    L_0x0072:
        r0 = 1;
        if (r1 == 0) goto L_0x0036;
    L_0x0075:
        r3 = z;	 Catch:{ NotFoundException -> 0x00a5 }
        r4 = 20;
        r3 = r3[r4];	 Catch:{ NotFoundException -> 0x00a5 }
        r3 = r2.equals(r3);	 Catch:{ NotFoundException -> 0x00a5 }
        if (r3 == 0) goto L_0x0036;
    L_0x0081:
        r0 = 2;
        if (r1 == 0) goto L_0x0036;
    L_0x0084:
        r3 = z;	 Catch:{ NotFoundException -> 0x00a7 }
        r4 = 19;
        r3 = r3[r4];	 Catch:{ NotFoundException -> 0x00a7 }
        r3 = r2.equals(r3);	 Catch:{ NotFoundException -> 0x00a7 }
        if (r3 == 0) goto L_0x0036;
    L_0x0090:
        r0 = 3;
        if (r1 == 0) goto L_0x0036;
    L_0x0093:
        r3 = z;	 Catch:{ NotFoundException -> 0x00a9 }
        r4 = 22;
        r3 = r3[r4];	 Catch:{ NotFoundException -> 0x00a9 }
        r2 = r2.equals(r3);	 Catch:{ NotFoundException -> 0x00a9 }
        if (r2 == 0) goto L_0x0036;
    L_0x009f:
        r0 = 4;
        goto L_0x0036;
    L_0x00a1:
        r0 = move-exception;
        throw r0;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r5.d(r6);	 Catch:{ NotFoundException -> 0x00c6 }
        if (r1 == 0) goto L_0x0053;
    L_0x00b0:
        r5.b(r6);	 Catch:{ NotFoundException -> 0x00c8 }
        if (r1 == 0) goto L_0x0053;
    L_0x00b5:
        r5.c(r6);	 Catch:{ NotFoundException -> 0x00ca }
        if (r1 == 0) goto L_0x0053;
    L_0x00ba:
        r5.e(r6);	 Catch:{ NotFoundException -> 0x00cc }
        if (r1 == 0) goto L_0x0053;
    L_0x00bf:
        r5.a(r6);	 Catch:{ NotFoundException -> 0x00ce }
        if (r1 == 0) goto L_0x0053;
    L_0x00c4:
        goto L_0x0039;
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00c8 }
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.onHandleIntent(android.content.Intent):void");
    }

    private void b(@NonNull Intent intent) {
        Log.i(z[2] + intent);
        WakeLock newWakeLock = ((PowerManager) getSystemService(z[5])).newWakeLock(1, z[4]);
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire(600000);
        try {
            if (Log.a()) {
                Log.b();
            }
            Log.d();
            SharedPreferences sharedPreferences = getSharedPreferences(z[0], 0);
            long j = sharedPreferences.getLong(z[1], Long.MIN_VALUE);
            long a = ((amm) h.b().b(amm.class)).a();
            if (j < 0 || j > a || j + 4233600000L < a) {
                new b(this, a.a((Context) this), null).a();
                sharedPreferences.edit().putLong(z[3], a).commit();
            }
            try {
                if (ael.Q()) {
                    if (VERSION.SDK_INT >= 23) {
                        bq.a(new asa(this));
                    }
                    App.aK.a();
                }
                b();
            } catch (NotFoundException e) {
                throw e;
            } catch (NotFoundException e2) {
                throw e2;
            }
        } finally {
            newWakeLock.release();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r14 = this;
        r12 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r10 = 9;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.aK;	 Catch:{ NotFoundException -> 0x0088 }
        if (r0 == 0) goto L_0x0087;
    L_0x000b:
        r0 = com.whatsapp.App.aK;	 Catch:{ NotFoundException -> 0x0088 }
        r0 = r0.E();	 Catch:{ NotFoundException -> 0x0088 }
        if (r0 == 0) goto L_0x0087;
    L_0x0013:
        r0 = com.whatsapp.App.aK;
        r0 = r0.C();
        r2 = r0.iterator();
    L_0x001d:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0087;
    L_0x0023:
        r0 = r2.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r4 = com.whatsapp.App.av();
        r6 = r0.b;	 Catch:{ NotFoundException -> 0x008a }
        r8 = 10800000; // 0xa4cb80 float:1.5134023E-38 double:5.335909E-317;
        r6 = r6 + r8;
        r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x0085;
    L_0x0037:
        r6 = r0.b;	 Catch:{ NotFoundException -> 0x008a }
        r6 = r6 + r12;
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 < 0) goto L_0x0085;
    L_0x003e:
        r0 = com.whatsapp.App.z();
        r3 = z;
        r6 = 7;
        r3 = r3[r6];
        r6 = 0;
        r0 = r0.getSharedPreferences(r3, r6);
        r3 = z;
        r6 = 8;
        r3 = r3[r6];
        r6 = 0;
        r6 = r0.getLong(r3, r6);
        r6 = r6 + r12;
        r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x0087;
    L_0x005d:
        r3 = z;
        r3 = r3[r10];
        com.whatsapp.util.Log.i(r3);
        r0 = r0.edit();
        r3 = z;	 Catch:{ NotFoundException -> 0x008c }
        r6 = 6;
        r3 = r3[r6];	 Catch:{ NotFoundException -> 0x008c }
        r0.putLong(r3, r4);	 Catch:{ NotFoundException -> 0x008c }
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NotFoundException -> 0x008c }
        if (r3 < r10) goto L_0x0079;
    L_0x0074:
        r0.apply();	 Catch:{ NotFoundException -> 0x008e }
        if (r1 == 0) goto L_0x007c;
    L_0x0079:
        r0.commit();	 Catch:{ NotFoundException -> 0x008e }
    L_0x007c:
        r0 = r14.getApplicationContext();	 Catch:{ NotFoundException -> 0x0090 }
        com.whatsapp.notification.at.a(r0);	 Catch:{ NotFoundException -> 0x0090 }
        if (r1 == 0) goto L_0x0087;
    L_0x0085:
        if (r1 == 0) goto L_0x001d;
    L_0x0087:
        return;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.c():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(@android.support.annotation.NonNull android.content.Intent r7) {
        /*
        r6 = this;
        r5 = 1;
        r4 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 60;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r0 = r0.append(r7);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 53;
        r0 = r0[r1];
        r0 = r6.getSystemService(r0);
        r0 = (android.os.PowerManager) r0;
        r1 = z;
        r3 = 55;
        r1 = r1[r3];
        r3 = r0.newWakeLock(r5, r1);
        r3.setReferenceCounted(r4);
        r4 = 600000; // 0x927c0 float:8.40779E-40 double:2.964394E-318;
        r3.acquire(r4);
        r1 = com.whatsapp.App.ay;	 Catch:{ all -> 0x00e0 }
        if (r1 == 0) goto L_0x0049;
    L_0x0041:
        r1 = com.whatsapp.App.aK;	 Catch:{ NotFoundException -> 0x00d6 }
        r1 = r1.c();	 Catch:{ NotFoundException -> 0x00d6 }
        if (r1 != 0) goto L_0x0054;
    L_0x0049:
        r1 = z;	 Catch:{ NotFoundException -> 0x00d6 }
        r4 = 54;
        r1 = r1[r4];	 Catch:{ NotFoundException -> 0x00d6 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NotFoundException -> 0x00d6 }
        if (r2 == 0) goto L_0x00cf;
    L_0x0054:
        r1 = com.whatsapp.App.E;	 Catch:{ NotFoundException -> 0x00d8 }
        if (r1 == 0) goto L_0x0066;
    L_0x0058:
        r1 = z;	 Catch:{ NotFoundException -> 0x00da }
        r4 = 57;
        r1 = r1[r4];	 Catch:{ NotFoundException -> 0x00da }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NotFoundException -> 0x00da }
        r1 = 1;
        com.whatsapp.App.an = r1;	 Catch:{ NotFoundException -> 0x00da }
        if (r2 == 0) goto L_0x00cf;
    L_0x0066:
        r1 = com.whatsapp.App.aX;	 Catch:{ NotFoundException -> 0x00dc }
        if (r1 == 0) goto L_0x0078;
    L_0x006a:
        r1 = z;	 Catch:{ NotFoundException -> 0x00de }
        r4 = 61;
        r1 = r1[r4];	 Catch:{ NotFoundException -> 0x00de }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NotFoundException -> 0x00de }
        r1 = 0;
        com.whatsapp.App.an = r1;	 Catch:{ NotFoundException -> 0x00de }
        if (r2 == 0) goto L_0x00cf;
    L_0x0078:
        r1 = de.greenrobot.event.h.b();	 Catch:{ all -> 0x00e0 }
        r4 = com.whatsapp.vr.class;
        r1 = r1.b(r4);	 Catch:{ all -> 0x00e0 }
        r1 = (com.whatsapp.vr) r1;	 Catch:{ all -> 0x00e0 }
        if (r1 == 0) goto L_0x009a;
    L_0x0086:
        r1 = r1.c();	 Catch:{ NotFoundException -> 0x00e5 }
        if (r1 != 0) goto L_0x009a;
    L_0x008c:
        r1 = z;	 Catch:{ NotFoundException -> 0x00e7 }
        r4 = 58;
        r1 = r1[r4];	 Catch:{ NotFoundException -> 0x00e7 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NotFoundException -> 0x00e7 }
        r1 = 1;
        com.whatsapp.App.an = r1;	 Catch:{ NotFoundException -> 0x00e7 }
        if (r2 == 0) goto L_0x00cf;
    L_0x009a:
        r1 = z;	 Catch:{ all -> 0x00e0 }
        r2 = 59;
        r1 = r1[r2];	 Catch:{ all -> 0x00e0 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x00e0 }
        r1 = 0;
        com.whatsapp.App.an = r1;	 Catch:{ all -> 0x00e0 }
        r1 = new com.whatsapp.a3l;	 Catch:{ all -> 0x00e0 }
        r2 = 1;
        r1.<init>(r2);	 Catch:{ all -> 0x00e0 }
        r2 = 0;
        r2 = new java.lang.Void[r2];	 Catch:{ all -> 0x00e0 }
        com.whatsapp.util.bq.a(r1, r2);	 Catch:{ all -> 0x00e0 }
        r1 = 1;
        r2 = z;	 Catch:{ all -> 0x00e0 }
        r4 = 56;
        r2 = r2[r4];	 Catch:{ all -> 0x00e0 }
        r0 = r0.newWakeLock(r1, r2);	 Catch:{ all -> 0x00e0 }
        r1 = 0;
        r0.setReferenceCounted(r1);	 Catch:{ all -> 0x00e0 }
        r4 = 120000; // 0x1d4c0 float:1.68156E-40 double:5.9288E-319;
        r0.acquire(r4);	 Catch:{ all -> 0x00e0 }
        r1 = new com.whatsapp.lw;	 Catch:{ all -> 0x00e0 }
        r1.<init>(r6, r0);	 Catch:{ all -> 0x00e0 }
        com.whatsapp.util.bq.a(r1);	 Catch:{ all -> 0x00e0 }
    L_0x00cf:
        r6.a();	 Catch:{ all -> 0x00e0 }
        r3.release();
        return;
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        r3.release();
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e0 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.d(android.content.Intent):void");
    }

    public AlarmService() {
        super(z[38]);
        this.a = z[37];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(@android.support.annotation.NonNull android.content.Intent r5) {
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x007b }
        r0.<init>();	 Catch:{ NotFoundException -> 0x007b }
        r1 = z;	 Catch:{ NotFoundException -> 0x007b }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ NotFoundException -> 0x007b }
        r0 = r0.append(r1);	 Catch:{ NotFoundException -> 0x007b }
        r0 = r0.append(r5);	 Catch:{ NotFoundException -> 0x007b }
        r0 = r0.toString();	 Catch:{ NotFoundException -> 0x007b }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NotFoundException -> 0x007b }
        r4.f();	 Catch:{ NotFoundException -> 0x007b }
        r0 = com.whatsapp.App.aK();	 Catch:{ NotFoundException -> 0x007b }
        if (r0 == 0) goto L_0x0033;
    L_0x0023:
        r0 = new com.whatsapp.a3l;	 Catch:{ NotFoundException -> 0x007d }
        r1 = 0;
        r0.<init>(r1);	 Catch:{ NotFoundException -> 0x007d }
        r1 = 0;
        r1 = new java.lang.Void[r1];	 Catch:{ NotFoundException -> 0x007d }
        com.whatsapp.util.bq.a(r0, r1);	 Catch:{ NotFoundException -> 0x007d }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NotFoundException -> 0x007d }
        if (r0 == 0) goto L_0x003b;
    L_0x0033:
        r0 = new com.whatsapp.rx;	 Catch:{ NotFoundException -> 0x007d }
        r0.<init>(r4);	 Catch:{ NotFoundException -> 0x007d }
        com.whatsapp.util.bq.a(r0);	 Catch:{ NotFoundException -> 0x007d }
    L_0x003b:
        r0 = z;
        r1 = 11;
        r0 = r0[r1];
        r0 = r4.getSystemService(r0);
        r0 = (android.net.ConnectivityManager) r0;
        r0 = r0.getBackgroundDataSetting();
        r1 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x007f }
        r1.<init>();	 Catch:{ NotFoundException -> 0x007f }
        r2 = z;	 Catch:{ NotFoundException -> 0x007f }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ NotFoundException -> 0x007f }
        r1 = r1.append(r2);	 Catch:{ NotFoundException -> 0x007f }
        r1 = r1.append(r0);	 Catch:{ NotFoundException -> 0x007f }
        r1 = r1.toString();	 Catch:{ NotFoundException -> 0x007f }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NotFoundException -> 0x007f }
        if (r0 != 0) goto L_0x0077;
    L_0x0067:
        r0 = 1;
        com.whatsapp.App.d(r4, r0);	 Catch:{ NotFoundException -> 0x007f }
        com.whatsapp.App.a(r4);	 Catch:{ NotFoundException -> 0x007f }
        r0 = z;	 Catch:{ NotFoundException -> 0x007f }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ NotFoundException -> 0x007f }
        com.whatsapp.App.H(r0);	 Catch:{ NotFoundException -> 0x007f }
    L_0x0077:
        com.whatsapp.App.bb();
        return;
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.c(android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(@android.support.annotation.Nullable android.content.Intent r11) {
        /*
        r10 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 41;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r11);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 45;
        r0 = r0[r1];
        r0 = r10.getSystemService(r0);
        r0 = (android.os.PowerManager) r0;
        r1 = 1;
        r2 = z;
        r3 = 40;
        r2 = r2[r3];
        r3 = r0.newWakeLock(r1, r2);
        r0 = 0;
        r3.setReferenceCounted(r0);
        r0 = 300000; // 0x493e0 float:4.2039E-40 double:1.482197E-318;
        r3.acquire(r0);
        r0 = com.whatsapp.util.dns.i.a();	 Catch:{ UnknownHostException -> 0x008c }
        r1 = r10.a;	 Catch:{ UnknownHostException -> 0x008c }
        r0 = r0.d(r1);	 Catch:{ UnknownHostException -> 0x008c }
        r4 = new org.C;	 Catch:{ all -> 0x0135 }
        r4.<init>();	 Catch:{ all -> 0x0135 }
        r1 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r4.a(r1);	 Catch:{ all -> 0x0135 }
        r1 = 0;
        r5 = r0.iterator();	 Catch:{ all -> 0x0135 }
    L_0x0054:
        r0 = r5.hasNext();	 Catch:{ all -> 0x0135 }
        if (r0 == 0) goto L_0x006a;
    L_0x005a:
        r0 = r5.next();	 Catch:{ all -> 0x0135 }
        r0 = (java.net.InetAddress) r0;	 Catch:{ all -> 0x0135 }
        r4.a();	 Catch:{ SocketTimeoutException -> 0x00ad, IOException -> 0x00dd }
        r1 = r4.a(r0);	 Catch:{ SocketTimeoutException -> 0x00ad, IOException -> 0x00dd }
        r4.c();	 Catch:{ SocketTimeoutException -> 0x00ad, IOException -> 0x00dd }
    L_0x006a:
        if (r1 != 0) goto L_0x010d;
    L_0x006c:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r0.<init>();	 Catch:{ all -> 0x0135 }
        r1 = z;	 Catch:{ all -> 0x0135 }
        r2 = 44;
        r1 = r1[r2];	 Catch:{ all -> 0x0135 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0135 }
        r1 = r10.a;	 Catch:{ all -> 0x0135 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0135 }
        r0 = r0.toString();	 Catch:{ all -> 0x0135 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x0135 }
        r3.release();
    L_0x008b:
        return;
    L_0x008c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r1.<init>();	 Catch:{ all -> 0x0135 }
        r2 = z;	 Catch:{ all -> 0x0135 }
        r4 = 47;
        r2 = r2[r4];	 Catch:{ all -> 0x0135 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0135 }
        r2 = r10.a;	 Catch:{ all -> 0x0135 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0135 }
        r1 = r1.toString();	 Catch:{ all -> 0x0135 }
        com.whatsapp.util.Log.c(r1, r0);	 Catch:{ all -> 0x0135 }
        r3.release();
        goto L_0x008b;
    L_0x00ad:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r2.<init>();	 Catch:{ all -> 0x0135 }
        r6 = z;	 Catch:{ all -> 0x0135 }
        r7 = 42;
        r6 = r6[r7];	 Catch:{ all -> 0x0135 }
        r2 = r2.append(r6);	 Catch:{ all -> 0x0135 }
        r6 = r10.a;	 Catch:{ all -> 0x0135 }
        r2 = r2.append(r6);	 Catch:{ all -> 0x0135 }
        r6 = z;	 Catch:{ all -> 0x0135 }
        r7 = 43;
        r6 = r6[r7];	 Catch:{ all -> 0x0135 }
        r2 = r2.append(r6);	 Catch:{ all -> 0x0135 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x0135 }
        r0 = r0.toString();	 Catch:{ all -> 0x0135 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x0135 }
    L_0x00d8:
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ all -> 0x0135 }
        if (r0 == 0) goto L_0x0054;
    L_0x00dc:
        goto L_0x006a;
    L_0x00dd:
        r2 = move-exception;
        r9 = r2;
        r2 = r1;
        r1 = r9;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r6.<init>();	 Catch:{ all -> 0x0135 }
        r7 = z;	 Catch:{ all -> 0x0135 }
        r8 = 46;
        r7 = r7[r8];	 Catch:{ all -> 0x0135 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x0135 }
        r7 = r10.a;	 Catch:{ all -> 0x0135 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x0135 }
        r7 = z;	 Catch:{ all -> 0x0135 }
        r8 = 39;
        r7 = r7[r8];	 Catch:{ all -> 0x0135 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x0135 }
        r0 = r6.append(r0);	 Catch:{ all -> 0x0135 }
        r0 = r0.toString();	 Catch:{ all -> 0x0135 }
        com.whatsapp.util.Log.c(r0, r1);	 Catch:{ all -> 0x0135 }
        r1 = r2;
        goto L_0x00d8;
    L_0x010d:
        r1.b();	 Catch:{ all -> 0x0135 }
        r0 = r1.a();	 Catch:{ all -> 0x0135 }
        if (r0 == 0) goto L_0x0130;
    L_0x0116:
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0135 }
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0135 }
        r0 = r0.longValue();	 Catch:{ all -> 0x0135 }
        r0 = r0 + r4;
        r0 = r0 - r6;
        r2 = de.greenrobot.event.h.b();	 Catch:{ all -> 0x0135 }
        r4 = new com.whatsapp.amm;	 Catch:{ all -> 0x0135 }
        r4.<init>(r0);	 Catch:{ all -> 0x0135 }
        r2.d(r4);	 Catch:{ all -> 0x0135 }
    L_0x0130:
        r3.release();
        goto L_0x008b;
    L_0x0135:
        r0 = move-exception;
        r3.release();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.a(android.content.Intent):void");
    }

    private void d() {
        ((AlarmManager) getSystemService(z[25])).setInexactRepeating(3, 0, 43200000, PendingIntent.getBroadcast(this, 0, new Intent(z[26], null, this, AlarmBroadcastReceiver.class), 0));
    }

    private void a() {
        boolean z = DialogToastActivity.f;
        Calendar instance = Calendar.getInstance();
        try {
            if (instance.get(11) >= 2) {
                instance.add(5, 1);
            }
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 2);
            long timeInMillis = instance.getTimeInMillis();
            Log.i(z[52] + new Date(timeInMillis));
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(z[50], null, this, AlarmBroadcastReceiver.class), 0);
            AlarmManager alarmManager = (AlarmManager) getSystemService(z[51]);
            try {
                alarmManager.cancel(broadcast);
                if (VERSION.SDK_INT >= 23) {
                    alarmManager.setExactAndAllowWhileIdle(0, timeInMillis, broadcast);
                    if (!z) {
                        return;
                    }
                }
                try {
                    if (VERSION.SDK_INT >= 19) {
                        try {
                            alarmManager.setExact(0, timeInMillis, broadcast);
                            if (!z) {
                                return;
                            }
                        } catch (NotFoundException e) {
                            throw e;
                        }
                    }
                    alarmManager.set(0, timeInMillis, broadcast);
                } catch (NotFoundException e2) {
                    throw e2;
                }
            } catch (NotFoundException e22) {
                throw e22;
            } catch (NotFoundException e222) {
                throw e222;
            }
        } catch (NotFoundException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
        r7 = this;
        r2 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r1 = 32;
        r0 = r0[r1];
        r0 = r7.getSystemService(r0);
        r0 = (android.app.ActivityManager) r0;
        r1 = new android.os.Debug$MemoryInfo;
        r1.<init>();
        android.os.Debug.getMemoryInfo(r1);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = z;
        r6 = 31;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r5 = r1.getTotalPrivateDirty();
        r3 = r3.append(r5);
        r5 = z;
        r6 = 29;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r5 = r1.getTotalPss();
        r3 = r3.append(r5);
        r5 = z;
        r6 = 35;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r1 = r1.getTotalSharedDirty();
        r1 = r3.append(r1);
        r3 = z;
        r5 = 30;
        r3 = r3[r5];
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r5 = r0.getRunningAppProcesses();
        if (r5 != 0) goto L_0x0074;
    L_0x0069:
        r1 = z;	 Catch:{ Exception -> 0x00fc }
        r3 = 36;
        r1 = r1[r3];	 Catch:{ Exception -> 0x00fc }
        com.whatsapp.util.Log.w(r1);	 Catch:{ Exception -> 0x00fc }
        if (r4 == 0) goto L_0x00ce;
    L_0x0074:
        r1 = r5.size();	 Catch:{ Exception -> 0x00fe }
        r6 = new int[r1];	 Catch:{ Exception -> 0x00fe }
        r3 = r2;
    L_0x007b:
        r1 = r5.size();	 Catch:{ Exception -> 0x00fe }
        if (r3 >= r1) goto L_0x008f;
    L_0x0081:
        r1 = r5.get(r3);	 Catch:{ Exception -> 0x00fe }
        r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1;	 Catch:{ Exception -> 0x00fe }
        r1 = r1.pid;	 Catch:{ Exception -> 0x00fe }
        r6[r3] = r1;	 Catch:{ Exception -> 0x00fe }
        r1 = r3 + 1;
        if (r4 == 0) goto L_0x011a;
    L_0x008f:
        r3 = r0.getProcessMemoryInfo(r6);	 Catch:{ Exception -> 0x00fe }
        if (r3 == 0) goto L_0x00ce;
    L_0x0095:
        r5 = r3.length;	 Catch:{ Exception -> 0x00fe }
        r1 = r2;
        r0 = r2;
    L_0x0098:
        if (r1 >= r5) goto L_0x00a5;
    L_0x009a:
        r2 = r3[r1];	 Catch:{ Exception -> 0x00fe }
        r2 = r2.getTotalPss();	 Catch:{ Exception -> 0x00fe }
        r0 = r0 + r2;
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0098;
    L_0x00a5:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00fe }
        r1.<init>();	 Catch:{ Exception -> 0x00fe }
        r2 = z;	 Catch:{ Exception -> 0x00fe }
        r4 = 27;
        r2 = r2[r4];	 Catch:{ Exception -> 0x00fe }
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x00fe }
        r2 = r3.length;	 Catch:{ Exception -> 0x00fe }
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x00fe }
        r2 = z;	 Catch:{ Exception -> 0x00fe }
        r3 = 33;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00fe }
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x00fe }
        r0 = r1.append(r0);	 Catch:{ Exception -> 0x00fe }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00fe }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00fe }
    L_0x00ce:
        r0 = de.greenrobot.event.h.b();
        r1 = com.whatsapp.vr.class;
        r0 = r0.b(r1);
        r0 = (com.whatsapp.vr) r0;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 34;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r7.getApplicationContext();
        com.whatsapp.App.w(r0);
        return;
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 28;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x00ce;
    L_0x011a:
        r3 = r1;
        goto L_0x007b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.f():void");
    }

    private void b() {
        boolean z = DialogToastActivity.f;
        Calendar instance = Calendar.getInstance();
        instance.add(5, 1);
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis();
        Log.i(z[16] + new Date(timeInMillis));
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(z[15], null, this, AlarmBroadcastReceiver.class), 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(z[14]);
        try {
            alarmManager.cancel(broadcast);
            if (VERSION.SDK_INT >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, timeInMillis, broadcast);
                if (!z) {
                    return;
                }
            }
            try {
                if (VERSION.SDK_INT >= 19) {
                    try {
                        alarmManager.setExact(0, timeInMillis, broadcast);
                        if (!z) {
                            return;
                        }
                    } catch (NotFoundException e) {
                        throw e;
                    }
                }
                alarmManager.set(0, timeInMillis, broadcast);
            } catch (NotFoundException e2) {
                throw e2;
            }
        } catch (NotFoundException e22) {
            throw e22;
        } catch (NotFoundException e222) {
            throw e222;
        }
    }
}
