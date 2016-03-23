package com.whatsapp;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.whatsapp.contact.ContactProvider;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.ce;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class a24 {
    private static final String[] z;
    private gv a;

    static {
        String[] strArr = new String[350];
        String str = "\u0003\u007f{Bc\u0002:tHy\u0013{tSdGyvK{\u0002~7P~\u0013rxRcG{y^7\u0004uySv\u0004nd";
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
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 26;
                        break;
                    case at.i /*2*/:
                        i3 = 23;
                        break;
                    case at.o /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "\u0003\u007f{Bc\u0002~7Dx\tnvDc\u0014:k\u0007c\u000ewr\u001d7";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0012tvE{\u0002:cH7\u0015\u007fzHa\u0002:sFc\u0006xvTrG";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\rss";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\rss\u001a(";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0004{gFu\u000ev~Sn";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u000buvCr\u0003:tFg\u0006x~K~\u0013srT7\u0001ue\u0007";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0011{{Rr";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0012tvE{\u0002:cH7\u000buvC7\u0004uySv\u0004n7Dv\u0017{uN{\u000en~Bd\\:tHy\u0013{tS*";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0012jpUv\u0003\u007f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0001uePv\u0015~";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\tuyB";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0006v{H`";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "GyxIc\u0006ycT7\u0005c7Re\u000e'";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0001\u007fcD\u007f\u0002~7";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007t\btcFt\u0013:u^7\u0012h~\u0007";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015:*\u0007&G[Yc7\rss\u0007Y(N7k^,_7\u00002J?0\u0007V)^7M~\u0003:6\u001a7X";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007v\u000bv7Ny\u0003saNs\u0012{{\u0007t\u000f{cT";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "GsyC~\u0011ssRv\u000b:tHy\u0013{tSdGf7S~\n\u007f-\u0007";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "'i9P\u007f\u0006ndFg\u00174yBc";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015:*\u0007&G[Yc7\rss\u0007Y(N7k^,_7\u00002J?0\u0007V)^7M~\u0003:6\u001a7X";
                    obj = 22;
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    strArr2 = strArr3;
                    str = "\u0015\u007fcRe\t\u007fs\u0007";
                    obj = 23;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0003\u007f{Bc\u0002:tHy\u0013{tS7";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    str = "\u0012tvE{\u0002:cH7\u0003\u007f{Bc\u0002:tHy\u0013{tS7";
                    obj = 25;
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    strArr2 = strArr3;
                    str = "Gf7S~\n\u007f7\u001d7";
                    obj = 26;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0004{gFu\u000ev~Sn";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\to{K7\u0004oeTx\u0015:`O~\u000b\u007f7Vb\u0002hnNy\u0000:pUx\u0012j7HqGp~CdG|xU7\u0004{gFu\u000ev~Sn";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "Gsy\u0007?";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0011{{Rr";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "Z%7Fy\u0003:";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\rss";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\rss";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "Z%7Fy\u0003:";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0001ubIsG";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0015{`xt\btcFt\u0013E~C7&IT";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007~\u0003i7HqGi~J~\u000b{e\u0007t\btcFt\u0013i7";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 38;
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    strArr2 = strArr3;
                    str = "\u0015{`xt\btcFt\u0013E~C";
                    obj = 39;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\rss\u0007*G%7fY#:sNd\u0017vv^H\t{zB7Z:(\u0007V)^7Uv\u0010EtHy\u0013{tSH\u000e~7\u0006*G%";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "Gi~J~\u000b{e\u0007t\btcFt\u0013i7SxG";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0001hxJC\u0002bc\u0007z\u0002n\u007fHsGi\u007fHb\u000b~7ErGjbE{\u000ey7NyG";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0001hxJC\u0002bc\u0007z\u0002n\u007fHsGi\u007fHb\u000b~7Ix\u0013:cOe\bm7Bo\u0004\u007fgS~\bt7NyG";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0001hxJC\u0002bc";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0001hxJC\u0002bc\u0007z\u0002n\u007fHsGw~Td\u000etp\u0007~\t:";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0012jsFc\u0002~7Dx\tnvDcGicFc\u0012i7M~\u0003'";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0014nvSb\u0014EcNz\u0002icFz\u0017";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0014nvSb\u0014";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "K:";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\rss\u0007*G%";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0012tvE{\u0002:cH7\u0012jsFc\u0002:tHy\u0013{tS7\u0014nvSb\u0014:";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007v\u000bv7@e\bog\u0007t\u000f{cT";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "G}eHb\u0017:tOv\u0013i7[7\u0013szB-G";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0015\u007fcRe\t\u007fs\u0007";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\rss\u0007[.QR\u00070B72\u0000";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0012t|Ix\u0010t7Dx\tnvDcG{sCr\u0003 7";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u0014nvSb\u0014";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0014nvSb\u0014EcNz\u0002icFz\u0017";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0012tvE{\u0002:cH7\u0006~s\u0007b\tqyH`\t:tHy\u0013{tS7\u0010scO7\to{K7\rss";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\rss";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0012tvE{\u0002:cH7\u0006~s\u0007b\tqyH`\t:tHy\u0013{tS7";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0012tvE{\u0002:cH7\u0006~s\u0007b\tqyH`\t:tHy\u0013{tS7\u0003or\u0007c\b:yR{\u000b:zB7\u0015\u007ftHe\u0003";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0012tvE{\u0002:cH7\u0006~s\u0007b\tqyH`\t:tHy\u0013{tS7\u0003or\u0007c\b:zFc\u0004r~IpGp~C7\u0017hrA~\u001f";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "\rss\u0007[.QR\u0007(";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "GyxIc\u0006ycT7\u0005c7W\u007f\btr\u0007y\u0012wuBeG";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u0001\u007fcD\u007f\u0002~7";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007t\btcFt\u0013i7EnGj\u007fHy\u0002:yRz\u0005\u007fe\u0007";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "\u0012tvE{\u0002:cH7\u0003\u007f{Bc\u0002:cFu\u000b\u007fd";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "\u0003\u007f{Bc\u0002~7F{\u000b:tHy\u0013{tSdGf7S~\n\u007f-\u0007";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0003sdW{\u0006cHIv\n\u007f";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "\tozEr\u0015";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0017rxIr8vvEr\u000b";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u0012tdBr\tEzTp8yxRy\u0013";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0012jsFc\u0002~7@e\bog\u0007~\t|x\u0007q\bh7M~\u0003'";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u0015\u007fcRe\t\u007fs\u0007";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007v\u000bv7CuGyxIc\u0006ycT";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "G~u\u0007t\btcFt\u0013i7[7\u0013szB-G";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u000e~rIc\u000ennxa\u0002h~A~\u0004{cNx\t";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u0014q~Wg\u000etp\u0007b\u0017~vS~\t}7Dv\u0017{uN{\u000enn\u0007s\u0012\u007f7SxG\u007fzWc\u001e:|BnGue\u0007a\u0006vbB,Gp~C*";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u0002ttUn\u0017nHKx\u0004{cNx\t";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\\:tFg\u0006x~K~\u0013c*";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u0002ttUn\u0017nHFb\u0003sx";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0002ttUn\u0017nHQ~\u0003\u007fx";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u0002ttUn\u0017nHQ%";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "\u0012teBt\b}yNm\u0002~7Dv\u0017{uN{\u000enn\u001c7\rss\u001a";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "\u0002ttUn\u0017nHRe\u000b";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u0002ttUn\u0017nHDx\tnvDc";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "\u0003utRz\u0002tc";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "\u0002ttUn\u0017nH@e\bogxp\u0002t%";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "\u0011u~W";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "\u0002ttUn\u0017nHNz\u0006}r";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "\u0014q~Wg\u000etp\u0007b\u0017~vS~\t}7Dv\u0017{uN{\u000en~BdG|xU7\u0002wgSnGp~C";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "\u0012jsFc\u0002~7Dv\u0017{uN{\u000en~BdGf7S~\n\u007f-\u0007";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "\\:tFg\u0006x~K~\u0013c*";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "\u0002ttUn\u0017nHE{\u000eic";
                    obj = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    str = "\u0012tvE{\u0002:cH7\u0012jsFc\u0002:tHy\u0013{tS7\u0005c7M~\u0003:";
                    obj = arj.Theme_checkboxStyle;
                    i = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    str = "\rss\u0007*G%";
                    obj = 103;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "\u0001\u007fcD\u007f\u0002~7Dx\tnvDcGxn\u0007g\u000fuyB7\tozEr\u0015:";
                    obj = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007t\btcFt\u0013:u^7\u0017rxIrGtbJu\u0002h7";
                    obj = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "\tozEr\u0015:*\u0007(";
                    obj = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007t\btcFt\u0013:u^7\f\u007fn\u0007";
                    obj = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "\u0015{`xt\btcFt\u0013E~C7Z:(\u0007V)^7Ib\nxrU7Z:(";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "GyxIc\u0006ycT7\u0005c7Lr\u001e'";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "\u0001\u007fcD\u007f\u0002~7";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "N:k\u0007c\u000ewr\u001d7";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = "\u000f{d\u0007s\u0012j{Nt\u0006nr\u0007t\u000f\u007ftL7\u0001{~Kr\u0003:";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "N:k\u0007c\u000ewr\u001d7";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = "\rss\u0007*G%";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = "G~bW{\u000eyvSrGyxIc\u0006ycT7\u0003\u007fcBt\u0013\u007fs\u0007`\u000en\u007f\u0007}\u000e~7\u000f";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = "\u0001{~Kr\u0003:sRe\u000etp\u0007s\u0012j{Nt\u0006nr\u0007t\btcFt\u0013:sBc\u0002ycNx\t:qHeGp~C7O";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "Z%7Fy\u0003:";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "\u0011{{Rr";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "Z%7Fy\u0003:";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "\u0004{gFu\u000ev~Sn";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "\rss";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "\rss";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = "Gsy\u0007?";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = "\to{K7\u0004oeTx\u0015:`O~\u000b\u007f7Vb\u0002hnNy\u0000:pUx\u0012j7HqGp~CdG|xU7\u0004{gFu\u000ev~Sn";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015:*\u0007&G[Yc7\u0015{`xt\btcFt\u0013E~C7)UC\u0007Y2V[\u0007V)^7Uv\u0010EtHy\u0013{tSH\u000e~7\u0006*G7&\u0007V)^7M~\u0003:6\u001a7X";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = "'i9P\u007f\u0006ndFg\u00174yBc";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = "\u000etsNa\u000e~bF{GyxIc\u0006yc\u0007t\boyS-G";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007~\t~~Q~\u0003ovK7\u0004uySv\u0004n7Dx\u0012tc";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = "\u000etsNa\u000e~bF{GyxIc\u0006yc\u0007t\boyS7\nsdT~\t}7Db\u0015ixU";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = "\u0002ttUn\u0017nHQ%";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "\u0002ttUn\u0017nHRe\u000b";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "\u0002ttUn\u0017nHFb\u0003sx";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "\u0003utRz\u0002tc";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = "\u0002ttUn\u0017nH@e\bogxp\u0002t%";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = "\u0002ttUn\u0017nHNz\u0006}r";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = "\u000e~rIc\u000ennxa\u0002h~A~\u0004{cNx\t";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = "\u0002ttUn\u0017nHDx\tnvDc";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = "\u0002ttUn\u0017nHKx\u0004{cNx\t";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = "\u0002ttUn\u0017nHQ~\u0003\u007fx";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = "\u0012t|Ix\u0010t7Dv\u0017{uN{\u000enn\u0007t\u000b{dT7\u0003oeNy\u0000:dSe\u000etp\u0007{\bu|Rg\\:tFg\u0006x~K~\u0013cTKv\u0014i*";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    i = 145;
                    str = "\u0002ttUn\u0017nHE{\u000eic";
                    obj = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i] = str;
                    i = 146;
                    str = "\u0011u~W";
                    obj = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i] = str;
                    i = 147;
                    str = "\u0004{gFu\u000ev~Sn";
                    obj = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i] = str;
                    i = 148;
                    str = "\u0015{`xt\btcFt\u0013E~C";
                    obj = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i] = str;
                    i = 149;
                    str = "\u0017rxIr8nnWr";
                    obj = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i] = str;
                    i = 150;
                    str = "8E~Id\u0002hcxx\u0015EeBg\u000b{tBH8";
                    obj = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i] = str;
                    i = 151;
                    str = "\u0014q~Wg\u0002~7Fs\u0003sy@7\u0004uySv\u0004n7Cb\u0002:cH7\u0002wgSnGp~C-G";
                    obj = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i] = str;
                    i = 152;
                    str = "\u0017rxIr8vvEr\u000b";
                    obj = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i] = str;
                    i = 153;
                    str = "\rss";
                    obj = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i] = str;
                    i = 154;
                    str = "\u0000saBy8tvJr";
                    obj = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i] = str;
                    i = 155;
                    str = "\u0012jsFc\u0002~HFc";
                    obj = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i] = str;
                    i = 156;
                    str = "\u0012tvE{\u0002:cH7\u0006~s\u0007";
                    obj = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i] = str;
                    i = 157;
                    str = "Gm\u007fFc\u0014{gW>Gf7S~\n\u007f-\u0007";
                    obj = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i] = str;
                    i = 158;
                    str = "\u0014nvSb\u0014";
                    obj = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i] = str;
                    i = 159;
                    str = "\tozEr\u0015";
                    obj = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i] = str;
                    i = 160;
                    str = "GyxIc\u0006ycT7O";
                    obj = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i] = str;
                    i = 161;
                    str = "\u0003sdW{\u0006cHIv\n\u007f";
                    obj = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i] = str;
                    i = 162;
                    str = "\rss";
                    obj = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i] = str;
                    i = 163;
                    str = "\u0014nvSb\u0014EcNz\u0002icFz\u0017";
                    obj = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i] = str;
                    i = 164;
                    str = "\u0014ueSH\t{zB";
                    obj = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i] = str;
                    i = 165;
                    str = "\u0011{{Rr";
                    obj = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i] = str;
                    i = 166;
                    str = "GyxIc\u0006ycT7";
                    obj = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i] = str;
                    i = 167;
                    str = "\u0006~sBsG";
                    obj = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i] = str;
                    i = 168;
                    str = "\u0001{zN{\u001eEyFz\u0002";
                    obj = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i] = str;
                    i = 169;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015";
                    obj = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i] = str;
                    i = 170;
                    str = "\u0006~s\u0007t\btcFt\u0013i7Dv\u000bvrC7\u0010scOx\u0012n7Fy\u001e:tHy\u0013{tSd";
                    obj = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i] = str;
                    i = 171;
                    str = "\u000b}r";
                    obj = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i] = str;
                    i = 172;
                    str = "GhrTb\u000bn*";
                    obj = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i] = str;
                    i = 173;
                    str = "GyxRy\u0013'";
                    obj = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i] = str;
                    i = 174;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i] = str;
                    i = 175;
                    str = "\u0004{yIx\u0013:pBcGyxIc\u0006yc\u0007u\u001e:yR{\u000b:}Ns";
                    obj = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i] = str;
                    i = 176;
                    str = "\u0004uySv\u0004n7Ar\u0013y\u007fBsGxn\u0007}\u000e~*";
                    obj = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i] = str;
                    i = 177;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007t\btcFt\u0013:u^7\rss\u0007";
                    obj = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i] = str;
                    i = 178;
                    str = "\rss\u0007*G%";
                    obj = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i] = str;
                    i = 179;
                    str = "\u0015{`xt\btcFt\u0013E~C";
                    obj = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i] = str;
                    i = 180;
                    str = "N:k\u0007c\u000ewr\u001d7";
                    obj = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i] = str;
                    i = 181;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007t\btcFt\u0013:gNt\f\u007fe\u0007{\u000eic";
                    obj = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i] = str;
                    i = 182;
                    str = "\u0015\u007fzHa\u000etp\u0007d\u000ew7Dv\u0015~7Cb\u0017v~Dv\u0013\u007f7Dx\tnvDcG";
                    obj = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i] = str;
                    i = 183;
                    str = "\u0015\u007fzHa\u000etp\u0007s\u0012j{Nt\u0006nr\u0007t\btcFt\u0013:`Nc\u000f:gUr\u0001\u007feBy\u0004\u007f7Ax\u0015:{H`\u0002h7NsG";
                    obj = 182;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i] = str;
                    i = 184;
                    str = "\u0015{`xt\btcFt\u0013E~C";
                    obj = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i] = str;
                    i = 185;
                    str = "G'7";
                    obj = 184;
                    strArr2 = strArr3;
                    break;
                case 184:
                    strArr2[i] = str;
                    i = 186;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007t\btcFt\u0013:gNt\f\u007fe\u0007{\u000eic\u0007s\u0012\u007f7SxGw~Td\u000etp\u0007t\u0006jvE~\u000bscNr\u0014:tRe\u0014ue";
                    obj = 185;
                    strArr2 = strArr3;
                    break;
                case 185:
                    strArr2[i] = str;
                    i = 187;
                    str = "GyxIc\u0006ycT7\u0014\u007f{Bt\u0013\u007fs\u0007q\bh7W~\u0004qrU7OyxIc\u0002bc\u001a";
                    obj = 186;
                    strArr2 = strArr3;
                    break;
                case 186:
                    strArr2[i] = str;
                    i = 188;
                    str = "G[Yc7O";
                    obj = 187;
                    strArr2 = strArr3;
                    break;
                case 187:
                    strArr2[i] = str;
                    i = 189;
                    str = "\u0003sdW{\u0006cHIv\n\u007f;\u0007}\u000e~;\u0007g\u000fuyBH\u0013cgB7&IT";
                    obj = 188;
                    strArr2 = strArr3;
                    break;
                case 188:
                    strArr2[i] = str;
                    i = 190;
                    str = "\u0004uySv\u0004nd\u0007v\u0015\u007f7Ns\u0002tcNt\u0006v;\u0007n\u0002n7Ix\u0013:?";
                    obj = 189;
                    strArr2 = strArr3;
                    break;
                case 189:
                    strArr2[i] = str;
                    i = 191;
                    str = "\u0003sdW{\u0006cHIv\n\u007f;\u0007}\u000e~;\u0007g\u000fuyBH\u0013cgB7&IT";
                    obj = 190;
                    strArr2 = strArr3;
                    break;
                case 190:
                    strArr2[i] = str;
                    i = 192;
                    str = "G'7\u00167&TS\u0007";
                    obj = 191;
                    strArr2 = strArr3;
                    break;
                case 191:
                    strArr2[i] = str;
                    i = 193;
                    str = "\rss";
                    obj = 192;
                    strArr2 = strArr3;
                    break;
                case 192:
                    strArr2[i] = str;
                    i = 194;
                    str = "G$7\u00177(H7";
                    obj = 193;
                    strArr2 = strArr3;
                    break;
                case 193:
                    strArr2[i] = str;
                    i = 195;
                    str = "\u0015\u007fzHa\u000etp\u0007s\u0012j{Nt\u0006nr\u0007t\btcFt\u0013:`Nc\u000f:yR{\u000b:|BnG";
                    obj = 194;
                    strArr2 = strArr3;
                    break;
                case 194:
                    strArr2[i] = str;
                    i = 196;
                    str = "\u0012tvE{\u0002:cH7\u0006jgKnGyxIc\u0006yc\u0007g\u000ey|BeGv~TcG~r\ns\u0012jr\u0007u\u0006ntO7";
                    obj = 195;
                    strArr2 = strArr3;
                    break;
                case 195:
                    strArr2[i] = str;
                    i = 197;
                    str = "G;*\u0007(";
                    obj = 196;
                    strArr2 = strArr3;
                    break;
                case 196:
                    strArr2[i] = str;
                    i = 198;
                    str = "\u0004{gFu\u000ev~SnZ=aH~\u0017=7fY#:aF{\u0012\u007f6\u001a0";
                    obj = 197;
                    strArr2 = strArr3;
                    break;
                case 197:
                    strArr2[i] = str;
                    i = 199;
                    str = "\u0015\u007fzHa\u000etp\u0007s\u0012j{Nt\u0006nr\u0007t\btcFt\u0013:`Nc\u000f:zFc\u0004r~IpGqr^7";
                    obj = 198;
                    strArr2 = strArr3;
                    break;
                case 198:
                    strArr2[i] = str;
                    i = 200;
                    str = "\rss";
                    obj = 199;
                    strArr2 = strArr3;
                    break;
                case 199:
                    strArr2[i] = str;
                    i = 201;
                    str = "'i9P\u007f\u0006ndFg\u00174yBc";
                    obj = 200;
                    strArr2 = strArr3;
                    break;
                case 200:
                    strArr2[i] = str;
                    i = 202;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015";
                    obj = 201;
                    strArr2 = strArr3;
                    break;
                case 201:
                    strArr2[i] = str;
                    i = 203;
                    str = "K:";
                    obj = 202;
                    strArr2 = strArr3;
                    break;
                case 202:
                    strArr2[i] = str;
                    i = 204;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 203;
                    strArr2 = strArr3;
                    break;
                case 203:
                    strArr2[i] = str;
                    i = 205;
                    str = "\u0012tvE{\u0002:cH7\u0006yfR~\u0015\u007f7Db\u0015ixU7\u0001ue\u0007b\tqyH`\t:eBv\u0014uy";
                    obj = 204;
                    strArr2 = strArr3;
                    break;
                case 204:
                    strArr2[i] = str;
                    i = 206;
                    str = "\u0003x7Ny\u000en~F{\u000e`vS~\bt7Sr\u0014n7\u001a7";
                    obj = 205;
                    strArr2 = strArr3;
                    break;
                case 205:
                    strArr2[i] = str;
                    i = 207;
                    str = "\u0012tvE{\u0002:cH7\u0001syC7\u0004uySv\u0004n7We\bl~Cr\u0015:tK~\u0002tc\u0007u\u001e:bU~G";
                    obj = 206;
                    strArr2 = strArr3;
                    break;
                case 206:
                    strArr2[i] = str;
                    i = 208;
                    str = "\u0014ueSH\t{zB";
                    obj = 207;
                    strArr2 = strArr3;
                    break;
                case 207:
                    strArr2[i] = str;
                    i = 209;
                    str = "\u0000saBy8tvJr";
                    obj = 208;
                    strArr2 = strArr3;
                    break;
                case 208:
                    strArr2[i] = str;
                    i = 210;
                    str = "\u0015{`xt\btcFt\u0013E~C";
                    obj = 209;
                    strArr2 = strArr3;
                    break;
                case 209:
                    strArr2[i] = str;
                    i = 211;
                    str = "\u0017rxIr8nnWr";
                    obj = 210;
                    strArr2 = strArr3;
                    break;
                case 210:
                    strArr2[i] = str;
                    i = 212;
                    str = "\u0006tsUx\u000e~7Ny\u0001u7Ib\u000bv~A~\u0002~7Ax\u0015:tHy\u0013{tS7";
                    obj = 211;
                    strArr2 = strArr3;
                    break;
                case 211:
                    strArr2[i] = str;
                    i = 213;
                    str = "\u0003sdW{\u0006cHIv\n\u007f";
                    obj = 212;
                    strArr2 = strArr3;
                    break;
                case 212:
                    strArr2[i] = str;
                    i = 214;
                    str = "\u0012tvE{\u0002:cH7\to{K~\u0001c7Dx\tnvDcG{yCe\bss\u0007~\t|x\u0007";
                    obj = 213;
                    strArr2 = strArr3;
                    break;
                case 213:
                    strArr2[i] = str;
                    i = 215;
                    str = "\u0017rxIr8vvEr\u000b";
                    obj = 214;
                    strArr2 = strArr3;
                    break;
                case 214:
                    strArr2[i] = str;
                    i = 216;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 215;
                    strArr2 = strArr3;
                    break;
                case 215:
                    strArr2[i] = str;
                    i = 217;
                    str = "\u0001{zN{\u001eEyFz\u0002";
                    obj = 216;
                    strArr2 = strArr3;
                    break;
                case 216:
                    strArr2[i] = str;
                    i = 218;
                    str = "\u000buvCr\u0003:";
                    obj = 217;
                    strArr2 = strArr3;
                    break;
                case 217:
                    strArr2[i] = str;
                    i = 219;
                    str = "\rss";
                    obj = 218;
                    strArr2 = strArr3;
                    break;
                case 218:
                    strArr2[i] = str;
                    i = 220;
                    str = "GSY\u0007?";
                    obj = 219;
                    strArr2 = strArr3;
                    break;
                case 219:
                    strArr2[i] = str;
                    i = 221;
                    str = "Gp~CdGf7S~\n\u007f-\u0007";
                    obj = 220;
                    strArr2 = strArr3;
                    break;
                case 220:
                    strArr2[i] = str;
                    i = 222;
                    str = "\u0012tvE{\u0002:cH7\u000buvC7\u0004uyQr\u0015ivS~\btd\u0007{\u000eic\u0007t\btcFt\u0013i7";
                    obj = 221;
                    strArr2 = strArr3;
                    break;
                case 221:
                    strArr2[i] = str;
                    i = 223;
                    str = "GyxIa\u0002hdFc\u000euyT7\u000bsdS7\u0004uySv\u0004nd\u0007q\u0015uz\u0007";
                    obj = 222;
                    strArr2 = strArr3;
                    break;
                case 222:
                    strArr2[i] = str;
                    i = 224;
                    str = "\u000b{dSH\u0013szBH\u0004uySv\u0004nrC7Y:(";
                    obj = 223;
                    strArr2 = strArr3;
                    break;
                case 223:
                    strArr2[i] = str;
                    i = 225;
                    str = "\u0003sdW{\u0006cHIv\n\u007f;\u0007y\u0012wuBeK:gOx\t\u007fHSn\u0017\u007f7fD$";
                    obj = 224;
                    strArr2 = strArr3;
                    break;
                case 224:
                    strArr2[i] = str;
                    i = 226;
                    str = "'i9P\u007f\u0006ndFg\u00174yBc";
                    obj = 225;
                    strArr2 = strArr3;
                    break;
                case 225:
                    strArr2[i] = str;
                    i = 227;
                    str = "GyxIc\u0006ycT7\u0014\u007f{Bt\u0013\u007fs\u0007q\bh7Ny\u0011scB7\u001b:cNz\u0002 7";
                    obj = 226;
                    strArr2 = strArr3;
                    break;
                case 226:
                    strArr2[i] = str;
                    i = 228;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015:*\u0007'G[Yc7\tozEr\u0015:^t7)UC\u0007Y2V[\u0007V)^7C~\u0014j{Fn8tvJrGSD\u0007Y(N7iB+V7fY#:gOx\t\u007fHSn\u0017\u007f7\u001a7U:ViSGp~C7F'7\u0018";
                    obj = 227;
                    strArr2 = strArr3;
                    break;
                case 227:
                    strArr2[i] = str;
                    i = 229;
                    str = "\u0003sdW{\u0006cHIv\n\u007f;\u0007y\u0012wuBeK:gOx\t\u007fHSn\u0017\u007f7fD$";
                    obj = 228;
                    strArr2 = strArr3;
                    break;
                case 228:
                    strArr2[i] = str;
                    i = 230;
                    str = "\u000b{dSH\u0013szBH\u0004uySv\u0004nrC7#_Dd7+SZnCG+'\u0017";
                    obj = 229;
                    strArr2 = strArr3;
                    break;
                case 229:
                    strArr2[i] = str;
                    i = 231;
                    str = "\u0015{`xt\btcFt\u0013E~C";
                    obj = 230;
                    strArr2 = strArr3;
                    break;
                case 230:
                    strArr2[i] = str;
                    i = 232;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007t\btcFt\u0013:gNt\f\u007fe\u0007{\u000eic";
                    obj = 231;
                    strArr2 = strArr3;
                    break;
                case 231:
                    strArr2[i] = str;
                    i = 233;
                    str = "\u0012jsFc\u0002~7P\u007f\u0006ndFg\u0017:yFz\u0002:qHeGyxIc\u0006yc\u0007}\u000e~*";
                    obj = 232;
                    strArr2 = strArr3;
                    break;
                case 232:
                    strArr2[i] = str;
                    i = 234;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 233;
                    strArr2 = strArr3;
                    break;
                case 233:
                    strArr2[i] = str;
                    i = 235;
                    str = "\u0010{HIv\n\u007f";
                    obj = 234;
                    strArr2 = strArr3;
                    break;
                case 234:
                    strArr2[i] = str;
                    i = 236;
                    str = "\u0012jsFc\u0002~7Ry\u0014\u007frI7\n\u007fdTv\u0000\u007f7Dx\u0012tc\u0007q\bh7Dx\tnvDcGp~C*";
                    obj = 235;
                    strArr2 = strArr3;
                    break;
                case 235:
                    strArr2[i] = str;
                    i = 237;
                    str = "\u0012tdBr\tEzTp8yxRy\u0013";
                    obj = 236;
                    strArr2 = strArr3;
                    break;
                case 236:
                    strArr2[i] = str;
                    i = 238;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 237;
                    strArr2 = strArr3;
                    break;
                case 237:
                    strArr2[i] = str;
                    i = 239;
                    str = "\rss";
                    obj = 238;
                    strArr2 = strArr3;
                    break;
                case 238:
                    strArr2[i] = str;
                    i = 240;
                    str = "\u0003sdW{\u0006cHIv\n\u007f";
                    obj = 239;
                    strArr2 = strArr3;
                    break;
                case 239:
                    strArr2[i] = str;
                    i = 241;
                    str = "\u0017rxIr8vvEr\u000b";
                    obj = 240;
                    strArr2 = strArr3;
                    break;
                case 240:
                    strArr2[i] = str;
                    i = 242;
                    str = "\u0012jsFc\u0002~7Sr\nj7@e\bog\u0007d\u0012x}Bt\u0013'";
                    obj = 241;
                    strArr2 = strArr3;
                    break;
                case 241:
                    strArr2[i] = str;
                    i = 243;
                    str = "GyeBv\u0013sxIC\u000ewr\u001a";
                    obj = 242;
                    strArr2 = strArr3;
                    break;
                case 242:
                    strArr2[i] = str;
                    i = 244;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 243;
                    strArr2 = strArr3;
                    break;
                case 243:
                    strArr2[i] = str;
                    i = 245;
                    str = "GtrP]\u000e~*";
                    obj = 244;
                    strArr2 = strArr3;
                    break;
                case 244:
                    strArr2[i] = str;
                    i = 246;
                    str = "Gu{C]\u000e~*";
                    obj = 245;
                    strArr2 = strArr3;
                    break;
                case 245:
                    strArr2[i] = str;
                    i = 247;
                    str = "\u0011u~W";
                    obj = 246;
                    strArr2 = strArr3;
                    break;
                case 246:
                    strArr2[i] = str;
                    i = 248;
                    str = "\u0002ttUn\u0017nHQ~\u0003\u007fx";
                    obj = 247;
                    strArr2 = strArr3;
                    break;
                case 247:
                    strArr2[i] = str;
                    i = 249;
                    str = "\u0003utRz\u0002tc";
                    obj = 248;
                    strArr2 = strArr3;
                    break;
                case 248:
                    strArr2[i] = str;
                    i = 250;
                    str = "\u0014q~Wg\u000etp\u0007b\tqyH`\t:tFg\u0006x~K~\u0013c7NyGyxIc\u0006ycT7\u0003{cFu\u0006ir\u001c7\rss\u001a";
                    obj = 249;
                    strArr2 = strArr3;
                    break;
                case 249:
                    strArr2[i] = str;
                    i = 251;
                    str = "\u0002ttUn\u0017nHDx\tnvDc";
                    obj = 250;
                    strArr2 = strArr3;
                    break;
                case 250:
                    strArr2[i] = str;
                    i = 252;
                    str = "\u0002ttUn\u0017nHRe\u000b";
                    obj = 251;
                    strArr2 = strArr3;
                    break;
                case 251:
                    strArr2[i] = str;
                    i = 253;
                    str = "\u0002ttUn\u0017nHNz\u0006}r";
                    obj = 252;
                    strArr2 = strArr3;
                    break;
                case 252:
                    strArr2[i] = str;
                    i = 254;
                    str = "\u0002ttUn\u0017nHKx\u0004{cNx\t";
                    obj = 253;
                    strArr2 = strArr3;
                    break;
                case 253:
                    strArr2[i] = str;
                    i = 255;
                    str = "\u0002ttUn\u0017nHQ%";
                    obj = 254;
                    strArr2 = strArr3;
                    break;
                case 254:
                    strArr2[i] = str;
                    i = 256;
                    str = "\u000e~rIc\u000ennxa\u0002h~A~\u0004{cNx\t";
                    obj = 255;
                    strArr2 = strArr3;
                    break;
                case 255:
                    strArr2[i] = str;
                    i = 257;
                    str = "\u0002ttUn\u0017nH@e\bogxp\u0002t%";
                    obj = 256;
                    strArr2 = strArr3;
                    break;
                case 256:
                    strArr2[i] = str;
                    i = 258;
                    str = "\u0002ttUn\u0017nHFb\u0003sx";
                    obj = 257;
                    strArr2 = strArr3;
                    break;
                case 257:
                    strArr2[i] = str;
                    i = 259;
                    str = "\u0002ttUn\u0017nHE{\u000eic";
                    obj = 258;
                    strArr2 = strArr3;
                    break;
                case 258:
                    strArr2[i] = str;
                    i = 260;
                    str = "\\:tFg\u0006x~K~\u0013c*";
                    obj = 259;
                    strArr2 = strArr3;
                    break;
                case 259:
                    strArr2[i] = str;
                    i = 261;
                    str = "\u0017rxSx8ssxc\u000ewrTc\u0006wg";
                    obj = 260;
                    strArr2 = strArr3;
                    break;
                case 260:
                    strArr2[i] = str;
                    i = 262;
                    str = "\u0012jsFc\u0002~7W\u007f\bnx\u0007~\u0003:qHeGyxIc\u0006yc\u0007}\u000e~*";
                    obj = 261;
                    strArr2 = strArr3;
                    break;
                case 261:
                    strArr2[i] = str;
                    i = 263;
                    str = "\u0017rxSx8nd";
                    obj = 262;
                    strArr2 = strArr3;
                    break;
                case 262:
                    strArr2[i] = str;
                    i = 264;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 263;
                    strArr2 = strArr3;
                    break;
                case 263:
                    strArr2[i] = str;
                    i = 265;
                    str = "\u0013rbJu8nd";
                    obj = 264;
                    strArr2 = strArr3;
                    break;
                case 264:
                    strArr2[i] = str;
                    i = 266;
                    str = "\rss\u0007*G%";
                    obj = 265;
                    strArr2 = strArr3;
                    break;
                case 265:
                    strArr2[i] = str;
                    i = 267;
                    str = "GyxIc\u0006ycT7\u0005c7M~\u0003'";
                    obj = 266;
                    strArr2 = strArr3;
                    break;
                case 266:
                    strArr2[i] = str;
                    i = 268;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 267;
                    strArr2 = strArr3;
                    break;
                case 267:
                    strArr2[i] = str;
                    i = 269;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007t\btcFt\u0013i7EnGp~C7";
                    obj = 268;
                    strArr2 = strArr3;
                    break;
                case 268:
                    strArr2[i] = str;
                    i = 270;
                    str = "\u0001\u007fcD\u007f\u0002~7";
                    obj = 269;
                    strArr2 = strArr3;
                    break;
                case 269:
                    strArr2[i] = str;
                    i = 271;
                    str = "\rss";
                    obj = 270;
                    strArr2 = strArr3;
                    break;
                case 270:
                    strArr2[i] = str;
                    i = 272;
                    str = "\u0004{gFu\u000ev~Sn";
                    obj = 271;
                    strArr2 = strArr3;
                    break;
                case 271:
                    strArr2[i] = str;
                    i = 273;
                    str = "\u0011{{Rr";
                    obj = 272;
                    strArr2 = strArr3;
                    break;
                case 272:
                    strArr2[i] = str;
                    i = 274;
                    str = "\u0006v{H`";
                    obj = 273;
                    strArr2 = strArr3;
                    break;
                case 273:
                    strArr2[i] = str;
                    i = 275;
                    str = "8E~Id\u0002hcxx\u0015EeBg\u000b{tBH8";
                    obj = 274;
                    strArr2 = strArr3;
                    break;
                case 274:
                    strArr2[i] = str;
                    i = 276;
                    str = "\u0012jsFc\u0002~HFc";
                    obj = 275;
                    strArr2 = strArr3;
                    break;
                case 275:
                    strArr2[i] = str;
                    i = 277;
                    str = "8ss";
                    obj = 276;
                    strArr2 = strArr3;
                    break;
                case 276:
                    strArr2[i] = str;
                    i = 278;
                    str = "\u0017rxSx8nd";
                    obj = 277;
                    strArr2 = strArr3;
                    break;
                case 277:
                    strArr2[i] = str;
                    i = 279;
                    str = "\rss";
                    obj = 278;
                    strArr2 = strArr3;
                    break;
                case 278:
                    strArr2[i] = str;
                    i = 280;
                    str = "\rss";
                    obj = 279;
                    strArr2 = strArr3;
                    break;
                case 279:
                    strArr2[i] = str;
                    i = 281;
                    str = "GyxIc\u0006ycT7\u0001hxJ7\u0006:{Nd\u0013:xA7";
                    obj = 280;
                    strArr2 = strArr3;
                    break;
                case 280:
                    strArr2[i] = str;
                    i = 282;
                    str = "\u0014nvSb\u0014EcNz\u0002icFz\u0017";
                    obj = 281;
                    strArr2 = strArr3;
                    break;
                case 281:
                    strArr2[i] = str;
                    i = 283;
                    str = "\u0003sdW{\u0006cHIv\n\u007f";
                    obj = 282;
                    strArr2 = strArr3;
                    break;
                case 282:
                    strArr2[i] = str;
                    i = 284;
                    str = "\u0014nvSb\u0014";
                    obj = 283;
                    strArr2 = strArr3;
                    break;
                case 283:
                    strArr2[i] = str;
                    i = 285;
                    str = "\u0004{gFu\u000ev~Sn";
                    obj = 284;
                    strArr2 = strArr3;
                    break;
                case 284:
                    strArr2[i] = str;
                    i = 286;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015";
                    obj = 285;
                    strArr2 = strArr3;
                    break;
                case 285:
                    strArr2[i] = str;
                    i = 287;
                    str = "\u0012jsFc\u0002~7HeG{sCr\u0003:";
                    obj = 286;
                    strArr2 = strArr3;
                    break;
                case 286:
                    strArr2[i] = str;
                    i = 288;
                    str = "GyxIc\u0006ycT7\u001b:cNz\u0002 7";
                    obj = 287;
                    strArr2 = strArr3;
                    break;
                case 287:
                    strArr2[i] = str;
                    i = 289;
                    str = "\u0000saBy8tvJr";
                    obj = 288;
                    strArr2 = strArr3;
                    break;
                case 288:
                    strArr2[i] = str;
                    i = 290;
                    str = "\u0012tvE{\u0002:cH7\u0012jsFc\u0002:xU7\u0006~s\u0007t\btcFt\u0013i7";
                    obj = 289;
                    strArr2 = strArr3;
                    break;
                case 289:
                    strArr2[i] = str;
                    i = 291;
                    str = "\u0017rxSx8ssxc\u000ewrTc\u0006wg";
                    obj = 290;
                    strArr2 = strArr3;
                    break;
                case 290:
                    strArr2[i] = str;
                    i = 292;
                    str = "\u0012jsFc\u0002:xU7\u0006~s\u0007t\btcFt\u0013:dL~\u0017jrC7\u0001ue\u0007}\u000e~*";
                    obj = 291;
                    strArr2 = strArr3;
                    break;
                case 291:
                    strArr2[i] = str;
                    i = 293;
                    str = "\u0015{`xt\btcFt\u0013E~C";
                    obj = 292;
                    strArr2 = strArr3;
                    break;
                case 292:
                    strArr2[i] = str;
                    i = 294;
                    str = "\u0017rxIr8vvEr\u000b";
                    obj = 293;
                    strArr2 = strArr3;
                    break;
                case 293:
                    strArr2[i] = str;
                    i = 295;
                    str = "\u0013rbJu8nd";
                    obj = 294;
                    strArr2 = strArr3;
                    break;
                case 294:
                    strArr2[i] = str;
                    i = 296;
                    str = "\u0012jsFc\u0002~HFc";
                    obj = 295;
                    strArr2 = strArr3;
                    break;
                case 295:
                    strArr2[i] = str;
                    i = 297;
                    str = "8E~Id\u0002hcxx\u0015EeBg\u000b{tBH8";
                    obj = 296;
                    strArr2 = strArr3;
                    break;
                case 296:
                    strArr2[i] = str;
                    i = 298;
                    str = "\u0012tdBr\tEzTp8yxRy\u0013";
                    obj = 297;
                    strArr2 = strArr3;
                    break;
                case 297:
                    strArr2[i] = str;
                    i = 299;
                    str = "\u0014ueSH\t{zB";
                    obj = 298;
                    strArr2 = strArr3;
                    break;
                case 298:
                    strArr2[i] = str;
                    i = 300;
                    str = "\tozEr\u0015";
                    obj = 299;
                    strArr2 = strArr3;
                    break;
                case 299:
                    strArr2[i] = str;
                    i = 301;
                    str = "\u0001{zN{\u001eEyFz\u0002";
                    obj = 300;
                    strArr2 = strArr3;
                    break;
                case 300:
                    strArr2[i] = str;
                    i = 302;
                    str = "\u0017rxIr8nnWr";
                    obj = 301;
                    strArr2 = strArr3;
                    break;
                case 301:
                    strArr2[i] = str;
                    i = 303;
                    str = "\u0011{{Rr";
                    obj = 302;
                    strArr2 = strArr3;
                    break;
                case 302:
                    strArr2[i] = str;
                    i = 304;
                    str = "\u0010{HIv\n\u007f";
                    obj = 303;
                    strArr2 = strArr3;
                    break;
                case 303:
                    strArr2[i] = str;
                    i = 305;
                    str = "8E~Id\u0002hcxx\u0015EeBg\u000b{tBH8";
                    obj = 304;
                    strArr2 = strArr3;
                    break;
                case 304:
                    strArr2[i] = str;
                    i = 306;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015:*\u0007&";
                    obj = 305;
                    strArr2 = strArr3;
                    break;
                case 305:
                    strArr2[i] = str;
                    i = 307;
                    str = "\u0015{`xt\btcFt\u0013E~C";
                    obj = 306;
                    strArr2 = strArr3;
                    break;
                case 306:
                    strArr2[i] = str;
                    i = 308;
                    str = "\u0017rxIr8vvEr\u000b";
                    obj = 307;
                    strArr2 = strArr3;
                    break;
                case 307:
                    strArr2[i] = str;
                    i = 309;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007`\u0006yxIc\u0006ycT7\u0001ue\u0007v\u0004yxRy\u0013:d^y\u0004";
                    obj = 308;
                    strArr2 = strArr3;
                    break;
                case 308:
                    strArr2[i] = str;
                    i = 310;
                    str = "8ss";
                    obj = 309;
                    strArr2 = strArr3;
                    break;
                case 309:
                    strArr2[i] = str;
                    i = 311;
                    str = "\tozEr\u0015";
                    obj = 310;
                    strArr2 = strArr3;
                    break;
                case 310:
                    strArr2[i] = str;
                    i = 312;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015";
                    obj = 311;
                    strArr2 = strArr3;
                    break;
                case 311:
                    strArr2[i] = str;
                    i = 313;
                    str = "\u0003sdW{\u0006cHIv\n\u007f";
                    obj = 312;
                    strArr2 = strArr3;
                    break;
                case 312:
                    strArr2[i] = str;
                    i = 314;
                    str = "Gm\u007fFc\u0014{gW7\u0004uySv\u0004nd\u0007q\bh7Ft\u0004ubIcGinItGf7S~\n\u007f-\u0007";
                    obj = 313;
                    strArr2 = strArr3;
                    break;
                case 313:
                    strArr2[i] = str;
                    i = 315;
                    str = "\rss";
                    obj = 314;
                    strArr2 = strArr3;
                    break;
                case 314:
                    strArr2[i] = str;
                    i = 316;
                    str = "\u0015\u007fcU~\u0002lrC7";
                    obj = 315;
                    strArr2 = strArr3;
                    break;
                case 315:
                    strArr2[i] = str;
                    i = 317;
                    str = "\u0017rxIr8nnWr";
                    obj = 316;
                    strArr2 = strArr3;
                    break;
                case 316:
                    strArr2[i] = str;
                    i = 318;
                    str = "\u0017rxIr8nnWr";
                    obj = 317;
                    strArr2 = strArr3;
                    break;
                case 317:
                    strArr2[i] = str;
                    i = 319;
                    str = "\u0014ueSH\t{zB";
                    obj = 318;
                    strArr2 = strArr3;
                    break;
                case 318:
                    strArr2[i] = str;
                    i = 320;
                    str = "\u0012tvE{\u0002:cH7\u0012jsFc\u0002:\u007fH{\u0003ubS7\u0004uySv\u0004n7Fy\u0003hxNsGsyAxG";
                    obj = 319;
                    strArr2 = strArr3;
                    break;
                case 319:
                    strArr2[i] = str;
                    i = 321;
                    str = "\u0004uyQr\u0015ivS~\btd\bv\u0003~rC7\u0004uySv\u0004n-\u0007";
                    obj = 320;
                    strArr2 = strArr3;
                    break;
                case 320:
                    strArr2[i] = str;
                    i = 322;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 321;
                    strArr2 = strArr3;
                    break;
                case 321:
                    strArr2[i] = str;
                    i = 323;
                    str = "\u0012jsFc\u0002~7Ox\u000b~xRcGyxIc\u0006yc\u0007v\t~eH~\u0003:~Iq\b:eBd\u0012vc\u001a";
                    obj = 322;
                    strArr2 = strArr3;
                    break;
                case 322:
                    strArr2[i] = str;
                    i = 324;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015";
                    obj = 323;
                    strArr2 = strArr3;
                    break;
                case 323:
                    strArr2[i] = str;
                    i = 325;
                    str = "\u0015{`xt\btcFt\u0013E~C";
                    obj = 324;
                    strArr2 = strArr3;
                    break;
                case 324:
                    strArr2[i] = str;
                    i = 326;
                    str = "\u0003sdW{\u0006cHIv\n\u007f";
                    obj = 325;
                    strArr2 = strArr3;
                    break;
                case 325:
                    strArr2[i] = str;
                    i = 327;
                    str = "\u0017rxIr8vvEr\u000b";
                    obj = 326;
                    strArr2 = strArr3;
                    break;
                case 326:
                    strArr2[i] = str;
                    i = 328;
                    str = "\rss\u0007*G%";
                    obj = 327;
                    strArr2 = strArr3;
                    break;
                case 327:
                    strArr2[i] = str;
                    i = 329;
                    str = "\tozEr\u0015";
                    obj = 328;
                    strArr2 = strArr3;
                    break;
                case 328:
                    strArr2[i] = str;
                    i = 330;
                    str = "\rss\u0007*G%7fY#:YhCG_OnD3I7\u000fD\"VRdCG+7aE(W7Pv8yxIc\u0006ycT70RRuRGp~C7Z:(\u000e";
                    obj = 329;
                    strArr2 = strArr3;
                    break;
                case 329:
                    strArr2[i] = str;
                    i = 331;
                    str = "8ss\u0007*G%";
                    obj = 330;
                    strArr2 = strArr3;
                    break;
                case 330:
                    strArr2[i] = str;
                    i = 332;
                    str = "\u0015\u007fcRe\t\u007fs\u0007";
                    obj = 331;
                    strArr2 = strArr3;
                    break;
                case 331:
                    strArr2[i] = str;
                    i = 333;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007v\u000bv7CuGyxIc\u0006ycT7\u0001ue\u0007d\u001ett";
                    obj = 332;
                    strArr2 = strArr3;
                    break;
                case 332:
                    strArr2[i] = str;
                    i = 334;
                    str = "G~u\u0007t\btcFt\u0013i7Ax\u0015:d^y\u0004:k\u0007c\u000ewr\u001d7";
                    obj = 333;
                    strArr2 = strArr3;
                    break;
                case 333:
                    strArr2[i] = str;
                    i = 335;
                    str = "\rss";
                    obj = 334;
                    strArr2 = strArr3;
                    break;
                case 334:
                    strArr2[i] = str;
                    i = 336;
                    str = "\u0014nvSb\u0014EcNz\u0002icFz\u0017";
                    obj = 335;
                    strArr2 = strArr3;
                    break;
                case 335:
                    strArr2[i] = str;
                    i = 337;
                    str = "\u000eiHP\u007f\u0006ndFg\u0017EbTr\u0015";
                    obj = 336;
                    strArr2 = strArr3;
                    break;
                case 336:
                    strArr2[i] = str;
                    i = 338;
                    str = "\u0003sdW{\u0006cHIv\n\u007f";
                    obj = 337;
                    strArr2 = strArr3;
                    break;
                case 337:
                    strArr2[i] = str;
                    i = 339;
                    str = "Gf7S~\n\u007f-\u0007";
                    obj = 338;
                    strArr2 = strArr3;
                    break;
                case 338:
                    strArr2[i] = str;
                    i = 340;
                    str = "\u0017rxIr8vvEr\u000b";
                    obj = 339;
                    strArr2 = strArr3;
                    break;
                case 339:
                    strArr2[i] = str;
                    i = 341;
                    str = "\u0012tdBr\tEzTp8yxRy\u0013";
                    obj = 340;
                    strArr2 = strArr3;
                    break;
                case 340:
                    strArr2[i] = str;
                    i = 342;
                    str = "\u0000hxRgGy\u007fFcG{sCr\u0003 7";
                    obj = 341;
                    strArr2 = strArr3;
                    break;
                case 341:
                    strArr2[i] = str;
                    i = 343;
                    str = "\u0012tvE{\u0002:cH7\u0006~s\u0007p\u0015ubW7\u0004rvS7\u0010scO7\to{K7\rss";
                    obj = 342;
                    strArr2 = strArr3;
                    break;
                case 342:
                    strArr2[i] = str;
                    i = 344;
                    str = "\u0014nvSb\u0014";
                    obj = 343;
                    strArr2 = strArr3;
                    break;
                case 343:
                    strArr2[i] = str;
                    i = 345;
                    str = "\u0012tvE{\u0002:cH7\u0006~s\u0007p\u0015ubW7\u0004rvS7";
                    obj = 344;
                    strArr2 = strArr3;
                    break;
                case 344:
                    strArr2[i] = str;
                    i = 346;
                    str = "\u0015\u007fcRe\t\u007fs\u0007";
                    obj = 345;
                    strArr2 = strArr3;
                    break;
                case 345:
                    strArr2[i] = str;
                    i = 347;
                    str = "GxeHv\u0003yvTcGv~TcGy\u007fFc\u0014:k\u0007c\u000ewr\u001d7";
                    obj = 346;
                    strArr2 = strArr3;
                    break;
                case 346:
                    strArr2[i] = str;
                    i = 348;
                    str = "\u0012tvE{\u0002:cH7\u0000\u007fc\u0007v\u000bv7Ee\b{sDv\u0014n{Nd\u0013:tOv\u0013i";
                    obj = 347;
                    strArr2 = strArr3;
                    break;
                case 347:
                    strArr2[i] = str;
                    i = 349;
                    str = "\rss\u0007[.QR\u00070BxeHv\u0003yvTc@";
                    obj = 348;
                    strArr2 = strArr3;
                    break;
                case 348:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0012tvE{\u0002:cH7\u0003\u007f{Bc\u0002:tHy\u0013{tSdG";
                    obj = null;
                    break;
            }
        }
    }

    public void d(l5 l5Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(5);
        contentValues.put(z[75], l5Var.q);
        contentValues.put(z[79], l5Var.j);
        contentValues.put(z[80], Integer.valueOf(l5Var.d));
        contentValues.put(z[78], l5Var.g);
        contentValues.put(z[77], Boolean.valueOf(l5Var.m));
        a(contentValues, l5Var.p);
        Log.i(z[81] + l5Var.p + ' ' + contentValues + z[76] + (System.currentTimeMillis() - currentTimeMillis));
    }

    public boolean f(l5 l5Var) {
        boolean z = true;
        try {
            if (l5Var.q == null) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues(7);
            contentValues.put(z[324], Boolean.valueOf(true));
            contentValues.put(z[329], l5Var.l.b);
            contentValues.put(z[325], Long.valueOf(l5Var.l.a));
            contentValues.put(z[326], l5Var.q);
            contentValues.put(z[318], l5Var.u);
            contentValues.put(z[327], l5Var.j);
            contentValues.put(z[319], l5Var.k);
            try {
                int a = this.a.a(ContactProvider.f, contentValues, z[328], new String[]{l5Var.p});
                try {
                    kl.c(l5Var);
                    App.aB.sendEmptyMessage(1);
                    Log.i(z[321] + l5Var);
                    if (a <= 0) {
                        z = false;
                    }
                    Log.i(z[323] + z + ' ' + l5Var + z[322] + (System.currentTimeMillis() - currentTimeMillis));
                    return z;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                Log.e(z[320] + l5Var + ' ' + e2);
                return false;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private void g(l5 l5Var) {
        Throwable e;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        a(l5Var, arrayList);
        try {
            this.a.a(arrayList);
        } catch (Throwable e2) {
            Log.b(z[26] + l5Var.t, e2);
        } catch (RemoteException e3) {
            e2 = e3;
            throw new RuntimeException(e2);
        } catch (OperationApplicationException e4) {
            e2 = e4;
            throw new RuntimeException(e2);
        }
        Log.i(z[25] + l5Var + z[27] + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    private java.lang.Class a(@android.support.annotation.NonNull java.lang.String r5, @android.support.annotation.NonNull java.lang.String r6) {
        /*
        r4 = this;
        r1 = com.whatsapp.l5.s;
        r0 = -1;
        r2 = r6.hashCode();	 Catch:{ IllegalArgumentException -> 0x00ef }
        switch(r2) {
            case -1701218628: goto L_0x0082;
            case -1512641898: goto L_0x00bf;
            case -335212164: goto L_0x0055;
            case -334551642: goto L_0x0064;
            case -328065279: goto L_0x0091;
            case -316175839: goto L_0x00cf;
            case -166824964: goto L_0x0037;
            case 3625376: goto L_0x00df;
            case 352742549: goto L_0x00af;
            case 418611279: goto L_0x00a0;
            case 861720859: goto L_0x0046;
            case 1596442694: goto L_0x0073;
            default: goto L_0x000a;
        };
    L_0x000a:
        switch(r0) {
            case 0: goto L_0x0107;
            case 1: goto L_0x010d;
            case 2: goto L_0x0111;
            case 3: goto L_0x0115;
            case 4: goto L_0x0119;
            case 5: goto L_0x011d;
            case 6: goto L_0x0121;
            case 7: goto L_0x0125;
            case 8: goto L_0x0129;
            case 9: goto L_0x012d;
            case 10: goto L_0x0131;
            case 11: goto L_0x0135;
            default: goto L_0x000d;
        };
    L_0x000d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r5);
        r1 = z;
        r2 = 260; // 0x104 float:3.64E-43 double:1.285E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = 0;
    L_0x0036:
        return r0;
    L_0x0037:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00ef }
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00ef }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00ef }
        if (r2 == 0) goto L_0x000a;
    L_0x0043:
        r0 = 0;
        if (r1 == 0) goto L_0x000a;
    L_0x0046:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00f1 }
        r3 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00f1 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00f1 }
        if (r2 == 0) goto L_0x000a;
    L_0x0052:
        r0 = 1;
        if (r1 == 0) goto L_0x000a;
    L_0x0055:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r3 = 258; // 0x102 float:3.62E-43 double:1.275E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        if (r2 == 0) goto L_0x000a;
    L_0x0061:
        r0 = 2;
        if (r1 == 0) goto L_0x000a;
    L_0x0064:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00f5 }
        r3 = 259; // 0x103 float:3.63E-43 double:1.28E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00f5 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00f5 }
        if (r2 == 0) goto L_0x000a;
    L_0x0070:
        r0 = 3;
        if (r1 == 0) goto L_0x000a;
    L_0x0073:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00f7 }
        r3 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00f7 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00f7 }
        if (r2 == 0) goto L_0x000a;
    L_0x007f:
        r0 = 4;
        if (r1 == 0) goto L_0x000a;
    L_0x0082:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00f9 }
        r3 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00f9 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00f9 }
        if (r2 == 0) goto L_0x000a;
    L_0x008e:
        r0 = 5;
        if (r1 == 0) goto L_0x000a;
    L_0x0091:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00fb }
        r3 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00fb }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00fb }
        if (r2 == 0) goto L_0x000a;
    L_0x009d:
        r0 = 6;
        if (r1 == 0) goto L_0x000a;
    L_0x00a0:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00fd }
        r3 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00fd }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00fd }
        if (r2 == 0) goto L_0x000a;
    L_0x00ac:
        r0 = 7;
        if (r1 == 0) goto L_0x000a;
    L_0x00af:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00ff }
        r3 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00ff }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00ff }
        if (r2 == 0) goto L_0x000a;
    L_0x00bb:
        r0 = 8;
        if (r1 == 0) goto L_0x000a;
    L_0x00bf:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0101 }
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0101 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0101 }
        if (r2 == 0) goto L_0x000a;
    L_0x00cb:
        r0 = 9;
        if (r1 == 0) goto L_0x000a;
    L_0x00cf:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0103 }
        r3 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0103 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0103 }
        if (r2 == 0) goto L_0x000a;
    L_0x00db:
        r0 = 10;
        if (r1 == 0) goto L_0x000a;
    L_0x00df:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r2 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0105 }
        r1 = r6.equals(r1);	 Catch:{ IllegalArgumentException -> 0x0105 }
        if (r1 == 0) goto L_0x000a;
    L_0x00eb:
        r0 = 11;
        goto L_0x000a;
    L_0x00ef:
        r0 = move-exception;
        throw r0;
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r0 = move-exception;
        throw r0;
    L_0x00fb:
        r0 = move-exception;
        throw r0;
    L_0x00fd:
        r0 = move-exception;
        throw r0;
    L_0x00ff:
        r0 = move-exception;
        throw r0;
    L_0x0101:
        r0 = move-exception;
        throw r0;
    L_0x0103:
        r0 = move-exception;
        throw r0;
    L_0x0105:
        r0 = move-exception;
        throw r0;
    L_0x0107:
        r0 = com.whatsapp.it.class;
        goto L_0x0036;
    L_0x010b:
        r0 = move-exception;
        throw r0;
    L_0x010d:
        r0 = com.whatsapp.air.class;
        goto L_0x0036;
    L_0x0111:
        r0 = com.whatsapp.a3m.class;
        goto L_0x0036;
    L_0x0115:
        r0 = com.whatsapp.a5i.class;
        goto L_0x0036;
    L_0x0119:
        r0 = com.whatsapp.a2t.class;
        goto L_0x0036;
    L_0x011d:
        r0 = com.whatsapp.ao4.class;
        goto L_0x0036;
    L_0x0121:
        r0 = com.whatsapp.tq.class;
        goto L_0x0036;
    L_0x0125:
        r0 = com.whatsapp.asu.class;
        goto L_0x0036;
    L_0x0129:
        r0 = com.whatsapp.uq.class;
        goto L_0x0036;
    L_0x012d:
        r0 = com.whatsapp.ms.class;
        goto L_0x0036;
    L_0x0131:
        r0 = com.whatsapp.c7.class;
        goto L_0x0036;
    L_0x0135:
        r0 = com.whatsapp.arz.class;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a24.a(java.lang.String, java.lang.String):java.lang.Class");
    }

    public l5 a(Uri uri) {
        l5 l5Var = null;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = this.a.a(uri, l5.v, null, null, null);
        if (a == null) {
            try {
                Log.e(z[18] + uri);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (a.moveToNext()) {
            l5Var = l5.b(a);
        }
        int count = a.getCount();
        a.close();
        Log.i(z[17] + count + z[15] + uri + ' ' + l5Var + z[16] + (System.currentTimeMillis() - currentTimeMillis));
        return l5Var;
    }

    public ArrayList a(Collection collection, aqo com_whatsapp_aqo) {
        boolean z = l5.s;
        ArrayList arrayList = new ArrayList();
        try {
            if (collection.isEmpty()) {
                return arrayList;
            }
            int size = collection.size();
            try {
                int i;
                int i2 = size / 200;
                if (size % 200 == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                int i3 = i2 + i;
                String[] strArr = new String[]{z[34]};
                Iterator it = collection.iterator();
                Set hashSet = new HashSet();
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i4 * 200;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(z[28]);
                    stringBuilder.append(z[35]);
                    stringBuilder.append(z[31]);
                    stringBuilder.append(z[32]);
                    stringBuilder.append(z[33]);
                    stringBuilder.append(z[30]);
                    int min = Math.min(i5 + 200, size);
                    String[] strArr2 = new String[((min + 2) - i5)];
                    strArr2[0] = a(com_whatsapp_aqo.getClass());
                    strArr2[1] = com_whatsapp_aqo.getText();
                    i2 = i5;
                    while (i2 < min) {
                        if (i2 > i5) {
                            try {
                                stringBuilder.append(',');
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        stringBuilder.append('?');
                        strArr2[(i2 + 2) - i5] = (String) it.next();
                        i = i2 + 1;
                        if (z) {
                            break;
                        }
                        i2 = i;
                    }
                    stringBuilder.append(')');
                    Cursor a = this.a.a(ContactProvider.a, strArr, stringBuilder.toString(), strArr2, null);
                    if (a == null) {
                        try {
                            Log.e(z[29]);
                            return arrayList;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    do {
                        try {
                            if (!a.moveToNext()) {
                                break;
                            }
                            hashSet.add(a.getString(0));
                        } catch (Throwable th) {
                            a.close();
                        }
                    } while (!z);
                    a.close();
                    i = i4 + 1;
                    if (z) {
                        break;
                    }
                    i4 = i;
                }
                for (String str : collection) {
                    try {
                        if (!hashSet.contains(str)) {
                            arrayList.add(str);
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                return arrayList;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.ArrayList r14, com.whatsapp.u7 r15) {
        /*
        r13 = this;
        r7 = com.whatsapp.l5.s;
        r8 = java.lang.System.currentTimeMillis();
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r1 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r1 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r1 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0 = com.whatsapp.u7.BROADCAST;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        if (r15 != r0) goto L_0x006a;
    L_0x0033:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r1 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r1 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r1 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r1 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r1 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0 = -2;
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0 = 41;
        r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b9 }
    L_0x006a:
        r0 = com.whatsapp.u7.CALL;
        if (r15 != r0) goto L_0x00d2;
    L_0x006e:
        r6 = new java.util.HashSet;
        r6.<init>();
        r0 = r13.a;
        r1 = com.whatsapp.contact.ContactProvider.a;
        r2 = 1;
        r2 = new java.lang.String[r2];
        r3 = 0;
        r4 = z;
        r5 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r4 = r4[r5];
        r2[r3] = r4;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = com.whatsapp.arz.ALLOW;
        r4 = r4.getText();
        r3 = r3.append(r4);
        r4 = "'";
        r3 = r3.append(r4);
        r3 = r3.toString();
        r4 = 0;
        r5 = 0;
        r1 = r0.a(r1, r2, r3, r4, r5);
        if (r1 != 0) goto L_0x00bd;
    L_0x00af:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00bb }
        r1 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00bb }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x00bb }
    L_0x00b8:
        return;
    L_0x00b9:
        r0 = move-exception;
        throw r0;
    L_0x00bb:
        r0 = move-exception;
        throw r0;
    L_0x00bd:
        r0 = r1.moveToNext();	 Catch:{ all -> 0x0120 }
        if (r0 == 0) goto L_0x00cd;
    L_0x00c3:
        r0 = 0;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x0120 }
        r6.add(r0);	 Catch:{ all -> 0x0120 }
        if (r7 == 0) goto L_0x00bd;
    L_0x00cd:
        r1.close();
        if (r7 == 0) goto L_0x00d7;
    L_0x00d2:
        r0 = java.util.Collections.emptySet();
        r6 = r0;
    L_0x00d7:
        r0 = z;
        r1 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r0 = r0[r1];
        r0 = r13.a;
        r1 = com.whatsapp.contact.ContactProvider.f;
        r2 = com.whatsapp.l5.v;
        r3 = r10.toString();
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r11 = com.whatsapp.App.ad();
        r10 = r10.append(r11);
        r11 = z;
        r12 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r11 = r11[r12];
        r10 = r10.append(r11);
        r10 = r10.toString();
        r4[r5] = r10;
        r5 = z;
        r10 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r5 = r5[r10];
        r1 = r0.a(r1, r2, r3, r4, r5);
        if (r1 != 0) goto L_0x0125;
    L_0x0114:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x011e }
        r1 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x011e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x011e }
        goto L_0x00b8;
    L_0x011e:
        r0 = move-exception;
        throw r0;
    L_0x0120:
        r0 = move-exception;
        r1.close();
        throw r0;
    L_0x0125:
        r2 = new java.util.ArrayList;
        r2.<init>();
    L_0x012a:
        r0 = r1.moveToNext();
        if (r0 == 0) goto L_0x027c;
    L_0x0130:
        r3 = com.whatsapp.l5.b(r1);
        r0 = r3.p;
        r0 = com.whatsapp.l5.f(r0);
        if (r0 != 0) goto L_0x012a;
    L_0x013c:
        r0 = r3.p;	 Catch:{ IllegalArgumentException -> 0x02bb }
        r0 = r6.contains(r0);	 Catch:{ IllegalArgumentException -> 0x02bb }
        if (r0 == 0) goto L_0x0146;
    L_0x0144:
        if (r7 == 0) goto L_0x012a;
    L_0x0146:
        r0 = r14.isEmpty();	 Catch:{ IllegalArgumentException -> 0x02bd }
        if (r0 == 0) goto L_0x0151;
    L_0x014c:
        r14.add(r3);	 Catch:{ IllegalArgumentException -> 0x02bd }
        if (r7 == 0) goto L_0x012a;
    L_0x0151:
        r0 = r14.size();
        r0 = r0 + -1;
        r0 = r14.get(r0);
        r0 = (com.whatsapp.l5) r0;
        r4 = r3.l;	 Catch:{ IllegalArgumentException -> 0x02bf }
        if (r4 == 0) goto L_0x017d;
    L_0x0161:
        r4 = r0.q;	 Catch:{ IllegalArgumentException -> 0x02bf }
        if (r4 == 0) goto L_0x017d;
    L_0x0165:
        r4 = r0.q;	 Catch:{ IllegalArgumentException -> 0x02c1 }
        r5 = r3.q;	 Catch:{ IllegalArgumentException -> 0x02c1 }
        r4 = r4.equalsIgnoreCase(r5);	 Catch:{ IllegalArgumentException -> 0x02c1 }
        if (r4 == 0) goto L_0x017d;
    L_0x016f:
        r4 = r0.p;	 Catch:{ IllegalArgumentException -> 0x02c3 }
        if (r4 == 0) goto L_0x017d;
    L_0x0173:
        r4 = r0.p;	 Catch:{ IllegalArgumentException -> 0x02c5 }
        r5 = r3.p;	 Catch:{ IllegalArgumentException -> 0x02c5 }
        r4 = r4.equals(r5);	 Catch:{ IllegalArgumentException -> 0x02c5 }
        if (r4 != 0) goto L_0x0182;
    L_0x017d:
        r14.add(r3);	 Catch:{ IllegalArgumentException -> 0x02c7 }
        if (r7 == 0) goto L_0x012a;
    L_0x0182:
        r4 = r0.l;	 Catch:{ IllegalArgumentException -> 0x02c9 }
        if (r4 != 0) goto L_0x01b1;
    L_0x0186:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02c9 }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x02c9 }
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x02c9 }
        r10 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r5 = r5[r10];	 Catch:{ IllegalArgumentException -> 0x02c9 }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x02c9 }
        r4 = r4.append(r0);	 Catch:{ IllegalArgumentException -> 0x02c9 }
        r4 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x02c9 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IllegalArgumentException -> 0x02c9 }
        r4 = r14.size();	 Catch:{ IllegalArgumentException -> 0x02c9 }
        r4 = r4 + -1;
        r14.remove(r4);	 Catch:{ IllegalArgumentException -> 0x02c9 }
        r14.add(r3);	 Catch:{ IllegalArgumentException -> 0x02c9 }
        r13.a(r0, r2);	 Catch:{ IllegalArgumentException -> 0x02c9 }
        if (r7 == 0) goto L_0x012a;
    L_0x01b1:
        r4 = r3.l;	 Catch:{ IllegalArgumentException -> 0x02cb }
        r5 = r0.l;	 Catch:{ IllegalArgumentException -> 0x02cb }
        r4 = r4.equals(r5);	 Catch:{ IllegalArgumentException -> 0x02cb }
        if (r4 == 0) goto L_0x01da;
    L_0x01bb:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02cb }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x02cb }
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x02cb }
        r10 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r5 = r5[r10];	 Catch:{ IllegalArgumentException -> 0x02cb }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x02cb }
        r4 = r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x02cb }
        r4 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x02cb }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IllegalArgumentException -> 0x02cb }
        r13.a(r3, r2);	 Catch:{ IllegalArgumentException -> 0x02cb }
        if (r7 == 0) goto L_0x012a;
    L_0x01da:
        r4 = r3.l;	 Catch:{ IllegalArgumentException -> 0x02cd }
        r4 = r4.a;	 Catch:{ IllegalArgumentException -> 0x02cd }
        r10 = -2;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0219;
    L_0x01e4:
        r4 = r0.l;	 Catch:{ IllegalArgumentException -> 0x02cd }
        r4 = r4.a;	 Catch:{ IllegalArgumentException -> 0x02cd }
        r10 = -2;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 != 0) goto L_0x0219;
    L_0x01ee:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02cf }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x02cf }
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x02cf }
        r10 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r5 = r5[r10];	 Catch:{ IllegalArgumentException -> 0x02cf }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x02cf }
        r4 = r4.append(r0);	 Catch:{ IllegalArgumentException -> 0x02cf }
        r4 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x02cf }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IllegalArgumentException -> 0x02cf }
        r4 = r14.size();	 Catch:{ IllegalArgumentException -> 0x02cf }
        r4 = r4 + -1;
        r14.remove(r4);	 Catch:{ IllegalArgumentException -> 0x02cf }
        r14.add(r3);	 Catch:{ IllegalArgumentException -> 0x02cf }
        r13.a(r0, r2);	 Catch:{ IllegalArgumentException -> 0x02cf }
        if (r7 == 0) goto L_0x012a;
    L_0x0219:
        r4 = r3.t;	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r10 = r0.t;	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 >= 0) goto L_0x024c;
    L_0x0221:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r10 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r5 = r5[r10];	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r4 = r4.append(r0);	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r4 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x02d1 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r4 = r14.size();	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r4 = r4 + -1;
        r14.remove(r4);	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r14.add(r3);	 Catch:{ IllegalArgumentException -> 0x02d1 }
        r13.a(r0, r2);	 Catch:{ IllegalArgumentException -> 0x02d1 }
        if (r7 == 0) goto L_0x012a;
    L_0x024c:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r10 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r5 = r5[r10];
        r4 = r4.append(r5);
        r0 = r4.append(r0);
        r4 = z;
        r5 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.append(r3);
        r3 = 41;
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        if (r7 == 0) goto L_0x012a;
    L_0x027c:
        r1.close();
        r0 = r13.a;	 Catch:{ IllegalArgumentException -> 0x02d3, RemoteException -> 0x02ef, OperationApplicationException -> 0x02f6 }
        r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x02d3, RemoteException -> 0x02ef, OperationApplicationException -> 0x02f6 }
    L_0x0284:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r14.size();
        r0 = r0.append(r1);
        r1 = z;
        r2 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r15);
        r1 = z;
        r2 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r2 = java.lang.System.currentTimeMillis();
        r2 = r2 - r8;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x00b8;
    L_0x02bb:
        r0 = move-exception;
        throw r0;
    L_0x02bd:
        r0 = move-exception;
        throw r0;
    L_0x02bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02c1 }
    L_0x02c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02c3 }
    L_0x02c3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02c5 }
    L_0x02c5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02c7 }
    L_0x02c7:
        r0 = move-exception;
        throw r0;
    L_0x02c9:
        r0 = move-exception;
        throw r0;
    L_0x02cb:
        r0 = move-exception;
        throw r0;
    L_0x02cd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02cf }
    L_0x02cf:
        r0 = move-exception;
        throw r0;
    L_0x02d1:
        r0 = move-exception;
        throw r0;
    L_0x02d3:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0284;
    L_0x02ef:
        r0 = move-exception;
    L_0x02f0:
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x02f6:
        r0 = move-exception;
        goto L_0x02f0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a24.a(java.util.ArrayList, com.whatsapp.u7):void");
    }

    public void d(ArrayList arrayList) {
        boolean z = l5.s;
        long currentTimeMillis = System.currentTimeMillis();
        int size = arrayList.size();
        Cursor a = this.a.a(ContactProvider.f, l5.v, z[349], null, null);
        if (a == null) {
            try {
                Log.e(z[348]);
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(l5.b(a));
            if (z) {
                break;
            }
        }
        a.close();
        Log.i(z[346] + (arrayList.size() - size) + z[347] + (System.currentTimeMillis() - currentTimeMillis));
    }

    public ArrayList h() {
        boolean z = l5.s;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor a = this.a.a(ContactProvider.f, l5.v, null, null, null);
        if (a == null) {
            try {
                Log.e(z[83]);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(l5.b(a));
            if (z) {
                break;
            }
        }
        a.close();
        Log.i(z[82] + arrayList.size() + z[84] + (System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    public void a(String str, long j, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(z[50], str2);
        contentValues.put(z[49], Long.valueOf(j));
        try {
            this.a.a(ContactProvider.f, contentValues, z[52], new String[]{str});
        } catch (IllegalArgumentException e) {
            Log.e(z[53] + str + z[51] + str2 + ' ' + e);
        }
        kl.k(str);
        Log.i(z[48] + str + ' ' + contentValues + z[47] + (System.currentTimeMillis() - currentTimeMillis));
    }

    public ArrayList g() {
        boolean z = l5.s;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor a = this.a.a(ContactProvider.f, new String[]{z[310], z[315], z[312], z[311], z[307], z[313], z[317], z[308]}, z[306], null, null);
        if (a == null) {
            try {
                Log.e(z[309]);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            l5 a2 = l5.a(a);
            try {
                if (!a2.c()) {
                    arrayList.add(a2);
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        a.close();
        Log.i(z[316] + arrayList.size() + z[314] + (System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    private int a(ContentValues contentValues, String str) {
        int i = 0;
        try {
            i = this.a.a(ContactProvider.f, contentValues, z[arj.Theme_editTextStyle], new String[]{str});
        } catch (IllegalArgumentException e) {
            Log.e(z[arj.Theme_checkedTextViewStyle] + str + ' ' + e);
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public com.whatsapp.l5 b(@android.support.annotation.NonNull java.lang.String r15) {
        /*
        r14 = this;
        r12 = -2;
        r5 = 0;
        r6 = com.whatsapp.l5.s;
        r8 = java.lang.System.currentTimeMillis();
        if (r15 != 0) goto L_0x0017;
    L_0x000b:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0015 }
        r1 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0015 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalArgumentException -> 0x0015 }
    L_0x0014:
        return r5;
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r0 = r14.a;
        r1 = com.whatsapp.contact.ContactProvider.f;
        r2 = com.whatsapp.l5.v;
        r3 = z;
        r4 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r3 = r3[r4];
        r4 = 1;
        r4 = new java.lang.String[r4];
        r7 = 0;
        r4[r7] = r15;
        r2 = r0.a(r1, r2, r3, r4, r5);
        if (r2 != 0) goto L_0x004c;
    L_0x002f:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004a }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x004a }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x004a }
        r2 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x004a }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x004a }
        r0 = r0.append(r15);	 Catch:{ IllegalArgumentException -> 0x004a }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x004a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x004a }
        goto L_0x0014;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = r5;
    L_0x004d:
        r1 = r2.moveToNext();
        if (r1 == 0) goto L_0x009d;
    L_0x0053:
        r1 = com.whatsapp.l5.b(r2);
        if (r0 == 0) goto L_0x0061;
    L_0x0059:
        r3 = r0.l;	 Catch:{ IllegalArgumentException -> 0x00fc }
        if (r3 != 0) goto L_0x0064;
    L_0x005d:
        r3 = r1.l;	 Catch:{ IllegalArgumentException -> 0x00fc }
        if (r3 == 0) goto L_0x0064;
    L_0x0061:
        if (r6 == 0) goto L_0x010c;
    L_0x0063:
        r0 = r1;
    L_0x0064:
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x00fe }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x00fe }
        r7 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r4 = r4[r7];	 Catch:{ IllegalArgumentException -> 0x00fe }
        r3 = r3.equalsIgnoreCase(r4);	 Catch:{ IllegalArgumentException -> 0x00fe }
        if (r3 == 0) goto L_0x008d;
    L_0x0072:
        r3 = r0.l;	 Catch:{ IllegalArgumentException -> 0x0100 }
        if (r3 == 0) goto L_0x008d;
    L_0x0076:
        r3 = r0.l;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r10 = r3.a;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 != 0) goto L_0x008d;
    L_0x007e:
        r3 = r1.l;	 Catch:{ IllegalArgumentException -> 0x0104 }
        if (r3 == 0) goto L_0x008d;
    L_0x0082:
        r3 = r1.l;	 Catch:{ IllegalArgumentException -> 0x0104 }
        r10 = r3.a;	 Catch:{ IllegalArgumentException -> 0x0104 }
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x008d;
    L_0x008a:
        if (r6 == 0) goto L_0x010c;
    L_0x008c:
        r0 = r1;
    L_0x008d:
        r3 = r0.m;	 Catch:{ IllegalArgumentException -> 0x0106 }
        if (r3 != 0) goto L_0x0096;
    L_0x0091:
        r3 = r1.m;	 Catch:{ IllegalArgumentException -> 0x0106 }
        if (r3 == 0) goto L_0x0096;
    L_0x0095:
        r0 = r1;
    L_0x0096:
        r3 = r1.l;
        if (r3 != 0) goto L_0x009b;
    L_0x009a:
        r5 = r1;
    L_0x009b:
        if (r6 == 0) goto L_0x004d;
    L_0x009d:
        r1 = r2.getCount();
        r2.close();	 Catch:{ IllegalArgumentException -> 0x0108 }
        if (r0 == 0) goto L_0x00a9;
    L_0x00a6:
        com.whatsapp.kl.o(r0);	 Catch:{ IllegalArgumentException -> 0x0108 }
    L_0x00a9:
        if (r5 == 0) goto L_0x00b0;
    L_0x00ab:
        if (r5 == r0) goto L_0x00b0;
    L_0x00ad:
        r14.g(r5);	 Catch:{ IllegalArgumentException -> 0x010a }
    L_0x00b0:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r15);
        r3 = z;
        r4 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r3 = z;
        r4 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r2 = z;
        r3 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = java.lang.System.currentTimeMillis();
        r2 = r2 - r8;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r5 = r0;
        goto L_0x0014;
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0100 }
    L_0x0100:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0102 }
    L_0x0102:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0104 }
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r0 = move-exception;
        throw r0;
    L_0x0108:
        r0 = move-exception;
        throw r0;
    L_0x010a:
        r0 = move-exception;
        throw r0;
    L_0x010c:
        r0 = r1;
        goto L_0x0096;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a24.b(java.lang.String):com.whatsapp.l5");
    }

    public boolean k(l5 l5Var) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = this.a.a(ContactProvider.f, ContactProvider.d, z[117], new String[]{l5Var.p}, null);
        if (a == null) {
            try {
                Log.e(z[115] + l5Var);
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (a.moveToNext()) {
            long j = a.getLong(0);
            if (j > 1) {
                try {
                    Log.i(Long.toString(j) + z[118] + l5Var.p + z[116] + (System.currentTimeMillis() - currentTimeMillis));
                    a.close();
                    return true;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            a.close();
            return false;
        } else {
            a.close();
            Log.w(z[119] + l5Var.p + z[114] + (System.currentTimeMillis() - currentTimeMillis));
            return false;
        }
    }

    public void f() {
        try {
            this.a.a(ContactProvider.e, null, null);
        } catch (IllegalArgumentException e) {
            Log.e(z[3] + e);
        }
    }

    public l5 d(String str) {
        l5 l5Var = null;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = this.a.a(ContactProvider.f, l5.v, z[arj.Theme_seekBarStyle], new String[]{str}, null);
        if (a == null) {
            try {
                Log.e(z[arj.Theme_ratingBarStyle] + str);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (a.moveToFirst()) {
            l5Var = l5.b(a);
        }
        a.close();
        Log.i(z[arj.Theme_radioButtonStyle] + str + z[arj.Theme_spinnerStyle] + (System.currentTimeMillis() - currentTimeMillis));
        return l5Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.ArrayList r7) {
        /*
        r6 = this;
        r1 = com.whatsapp.l5.s;
        r0 = r7.isEmpty();	 Catch:{ IllegalArgumentException -> 0x0011 }
        if (r0 == 0) goto L_0x0013;
    L_0x0008:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0011 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0011 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x0011 }
    L_0x0010:
        return;
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r2 = java.lang.System.currentTimeMillis();
        r4 = new java.util.ArrayList;
        r0 = r7.size();
        r0 = r0 * 2;
        r4.<init>(r0);
        r5 = r7.iterator();
    L_0x0026:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0037;
    L_0x002c:
        r0 = r5.next();
        r0 = (com.whatsapp.l5) r0;
        r6.a(r0, r4);
        if (r1 == 0) goto L_0x0026;
    L_0x0037:
        r0 = r6.a;	 Catch:{ IllegalArgumentException -> 0x005c, RemoteException -> 0x0077, OperationApplicationException -> 0x007e }
        r0.a(r4);	 Catch:{ IllegalArgumentException -> 0x005c, RemoteException -> 0x0077, OperationApplicationException -> 0x007e }
    L_0x003c:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r4 = 2;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r4 = java.lang.System.currentTimeMillis();
        r2 = r4 - r2;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0010;
    L_0x005c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r1 = r1.append(r7);
        r1 = r1.toString();
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x003c;
    L_0x0077:
        r0 = move-exception;
    L_0x0078:
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x007e:
        r0 = move-exception;
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a24.a(java.util.ArrayList):void");
    }

    public void b(l5 l5Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (l5Var.p == null) {
                Log.w(z[343]);
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(z[335], l5Var.p);
            contentValues.put(z[337], Boolean.valueOf(true));
            contentValues.put(z[344], l5Var.w);
            contentValues.put(z[336], Long.valueOf(l5Var.r));
            contentValues.put(z[338], l5Var.q);
            contentValues.put(z[340], l5Var.j);
            contentValues.put(z[341], Integer.valueOf(l5Var.d));
            try {
                l5Var.t = ContentUris.parseId(this.a.a(ContactProvider.f, contentValues));
            } catch (IllegalArgumentException e) {
                Log.e(z[345] + l5Var + ' ' + e);
            }
            Log.i(z[342] + l5Var + z[339] + (System.currentTimeMillis() - currentTimeMillis));
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public l5 a(db dbVar) {
        l5 l5Var = null;
        long currentTimeMillis = System.currentTimeMillis();
        String str = z[111];
        Cursor a = this.a.a(ContactProvider.f, l5.v, str, new String[]{String.valueOf(dbVar.a), dbVar.b}, null);
        if (a == null) {
            try {
                Log.e(z[110] + dbVar);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (a.moveToNext()) {
            l5Var = l5.b(a);
        }
        int count = a.getCount();
        a.close();
        Log.i(z[113] + count + z[112] + dbVar + ' ' + l5Var + z[arj.Theme_switchStyle] + (System.currentTimeMillis() - currentTimeMillis));
        return l5Var;
    }

    public void c(ArrayList arrayList) {
        a(arrayList, u7.NORMAL);
    }

    public ArrayList c(String str) {
        boolean z = l5.s;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        String str2 = z[69];
        Cursor a = this.a.a(ContactProvider.f, l5.v, str2, new String[]{"%" + str + "%"}, null);
        if (a == null) {
            try {
                Log.e(z[72] + str);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(l5.b(a));
            if (z) {
                break;
            }
        }
        a.close();
        Log.i(z[71] + arrayList.size() + z[70] + str + z[68] + (System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    public ArrayList i() {
        boolean z = l5.s;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        String str = z[23];
        Cursor a = this.a.a(ContactProvider.f, l5.v, z[19], new String[]{App.ad() + z[22]}, null);
        if (a == null) {
            try {
                Log.e(z[20]);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(l5.b(a));
            if (z) {
                break;
            }
        }
        a.close();
        Log.i(z[24] + arrayList.size() + z[21] + (System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    public ArrayList j(l5 l5Var) {
        boolean z = l5.s;
        if (l5Var != null) {
            try {
                if (l5Var.l != null) {
                    if (l5Var.p != null) {
                        try {
                            if (l5Var.q != null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                String str = z[41];
                                ArrayList arrayList = new ArrayList();
                                Cursor a = this.a.a(ContactProvider.f, new String[]{z[40]}, str, new String[]{l5Var.p, l5Var.q, String.valueOf(l5Var.l.a)}, z[37]);
                                if (a == null) {
                                    try {
                                        Log.e(z[38] + l5Var);
                                        return arrayList;
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                                while (a.moveToNext()) {
                                    arrayList.add(Long.valueOf(a.getLong(0)));
                                    if (z) {
                                        break;
                                    }
                                }
                                a.close();
                                Log.i(z[36] + arrayList.size() + z[42] + l5Var + z[39] + (System.currentTimeMillis() - currentTimeMillis));
                                return arrayList;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
        return new ArrayList();
    }

    public void c(l5 l5Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(7);
        contentValues.put(z[210], Integer.valueOf(-1));
        contentValues.put(z[213], null);
        contentValues.put(z[209], null);
        contentValues.put(z[217], null);
        contentValues.put(z[208], null);
        contentValues.put(z[211], Integer.valueOf(-1));
        contentValues.put(z[215], null);
        try {
            this.a.a(ContentUris.withAppendedId(ContactProvider.f, l5Var.t), contentValues, null, null);
        } catch (IllegalArgumentException e) {
            Log.e(z[214] + l5Var + ' ' + e);
        }
        l5Var.l = null;
        l5Var.q = null;
        l5Var.u = Integer.valueOf(-1);
        l5Var.j = null;
        l5Var.b = null;
        l5Var.n = null;
        l5Var.k = null;
        kl.c(l5Var);
        Log.i(z[212] + l5Var + z[216] + (System.currentTimeMillis() - currentTimeMillis));
    }

    private static void a(ArrayList arrayList, long j, String str, ce ceVar, aqo com_whatsapp_aqo) {
        CharSequence a = a(ceVar.b, com_whatsapp_aqo);
        try {
            if (com_whatsapp_aqo instanceof it) {
                if (!TextUtils.equals(z[274], a)) {
                    return;
                }
            }
            arrayList.add(ContentProviderOperation.newInsert(ContactProvider.a).withValue(z[271], str).withValue(z[272], ceVar.a).withValue(z[273], a).withValue(z[276], Long.valueOf(j)).withValue(z[275], Boolean.valueOf(true)).build());
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int b() {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = this.a.a(ContactProvider.f, ContactProvider.d, z[128], new String[]{App.ad() + z[130]}, null);
        if (a == null) {
            try {
                Log.e(z[132]);
                return 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (a.moveToNext()) {
            int i = a.getInt(0);
            Log.i(z[131] + i + z[129] + (System.currentTimeMillis() - currentTimeMillis));
            a.close();
            return i;
        } else {
            a.close();
            Log.w(z[133]);
            return -1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.Map r15) {
        /*
        r14 = this;
        r7 = com.whatsapp.l5.s;
        r8 = android.os.SystemClock.elapsedRealtime();
        r2 = java.lang.System.currentTimeMillis();
        r1 = new java.util.ArrayList;
        r0 = r15.size();
        r1.<init>(r0);
        r0 = r15.entrySet();
        r10 = r0.iterator();
    L_0x001b:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x00cb;
    L_0x0021:
        r0 = r10.next();
        r0 = (java.util.Map.Entry) r0;
        r4 = r0.getKey();
        r4 = (java.lang.String) r4;
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ RemoteException -> 0x00f0 }
        if (r5 == 0) goto L_0x003c;
    L_0x0033:
        r5 = z;	 Catch:{ RemoteException -> 0x00f0 }
        r6 = 99;
        r5 = r5[r6];	 Catch:{ RemoteException -> 0x00f0 }
        com.whatsapp.util.Log.w(r5);	 Catch:{ RemoteException -> 0x00f0 }
    L_0x003c:
        r0 = r0.getValue();
        r0 = (java.util.Vector) r0;
        r11 = r0.iterator();
    L_0x0046:
        r0 = r11.hasNext();
        if (r0 == 0) goto L_0x00b9;
    L_0x004c:
        r5 = r11.next();
        r5 = (com.whatsapp.protocol.ce) r5;
        r0 = r5.a;	 Catch:{ RemoteException -> 0x00f2 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ RemoteException -> 0x00f2 }
        if (r0 == 0) goto L_0x0082;
    L_0x005a:
        r0 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x00f2 }
        r0.<init>();	 Catch:{ RemoteException -> 0x00f2 }
        r6 = z;	 Catch:{ RemoteException -> 0x00f2 }
        r12 = 86;
        r6 = r6[r12];	 Catch:{ RemoteException -> 0x00f2 }
        r0 = r0.append(r6);	 Catch:{ RemoteException -> 0x00f2 }
        r0 = r0.append(r4);	 Catch:{ RemoteException -> 0x00f2 }
        r6 = z;	 Catch:{ RemoteException -> 0x00f2 }
        r12 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r6 = r6[r12];	 Catch:{ RemoteException -> 0x00f2 }
        r0 = r0.append(r6);	 Catch:{ RemoteException -> 0x00f2 }
        r0 = r0.append(r5);	 Catch:{ RemoteException -> 0x00f2 }
        r0 = r0.toString();	 Catch:{ RemoteException -> 0x00f2 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ RemoteException -> 0x00f2 }
    L_0x0082:
        r6 = r5.a;
        r0 = -1;
        r12 = r6.hashCode();	 Catch:{ RemoteException -> 0x01ac }
        switch(r12) {
            case -1701218628: goto L_0x013f;
            case -1512641898: goto L_0x017c;
            case -335212164: goto L_0x0112;
            case -334551642: goto L_0x0121;
            case -328065279: goto L_0x014e;
            case -316175839: goto L_0x018c;
            case -166824964: goto L_0x00f4;
            case 3625376: goto L_0x019c;
            case 352742549: goto L_0x016c;
            case 418611279: goto L_0x015d;
            case 861720859: goto L_0x0103;
            case 1596442694: goto L_0x0130;
            default: goto L_0x008c;
        };
    L_0x008c:
        switch(r0) {
            case 0: goto L_0x01c4;
            case 1: goto L_0x01cd;
            case 2: goto L_0x01d6;
            case 3: goto L_0x01df;
            case 4: goto L_0x01e8;
            case 5: goto L_0x01f1;
            case 6: goto L_0x01fa;
            case 7: goto L_0x0203;
            case 8: goto L_0x020c;
            case 9: goto L_0x0215;
            case 10: goto L_0x021e;
            case 11: goto L_0x0227;
            default: goto L_0x008f;
        };
    L_0x008f:
        r0 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x024a }
        r0.<init>();	 Catch:{ RemoteException -> 0x024a }
        r6 = z;	 Catch:{ RemoteException -> 0x024a }
        r12 = 92;
        r6 = r6[r12];	 Catch:{ RemoteException -> 0x024a }
        r0 = r0.append(r6);	 Catch:{ RemoteException -> 0x024a }
        r0 = r0.append(r4);	 Catch:{ RemoteException -> 0x024a }
        r6 = z;	 Catch:{ RemoteException -> 0x024a }
        r12 = 88;
        r6 = r6[r12];	 Catch:{ RemoteException -> 0x024a }
        r0 = r0.append(r6);	 Catch:{ RemoteException -> 0x024a }
        r0 = r0.append(r5);	 Catch:{ RemoteException -> 0x024a }
        r0 = r0.toString();	 Catch:{ RemoteException -> 0x024a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ RemoteException -> 0x024a }
    L_0x00b7:
        if (r7 == 0) goto L_0x0046;
    L_0x00b9:
        r0 = r1.size();	 Catch:{ IllegalArgumentException -> 0x024c }
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r0 <= r4) goto L_0x00c9;
    L_0x00c1:
        r0 = r14.a;	 Catch:{ RemoteException -> 0x024e, OperationApplicationException -> 0x025e }
        r0.a(r1);	 Catch:{ RemoteException -> 0x024e, OperationApplicationException -> 0x025e }
        r1.clear();	 Catch:{ RemoteException -> 0x024e, OperationApplicationException -> 0x025e }
    L_0x00c9:
        if (r7 == 0) goto L_0x001b;
    L_0x00cb:
        r0 = r14.a;	 Catch:{ RemoteException -> 0x0255, OperationApplicationException -> 0x025c }
        r0.a(r1);	 Catch:{ RemoteException -> 0x0255, OperationApplicationException -> 0x025c }
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 100;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r2 = android.os.SystemClock.elapsedRealtime();
        r2 = r2 - r8;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return;
    L_0x00f0:
        r0 = move-exception;
        throw r0;
    L_0x00f2:
        r0 = move-exception;
        throw r0;
    L_0x00f4:
        r12 = z;	 Catch:{ RemoteException -> 0x01ac }
        r13 = 85;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01ac }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01ac }
        if (r12 == 0) goto L_0x008c;
    L_0x0100:
        r0 = 0;
        if (r7 == 0) goto L_0x008c;
    L_0x0103:
        r12 = z;	 Catch:{ RemoteException -> 0x01ae }
        r13 = 95;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01ae }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01ae }
        if (r12 == 0) goto L_0x008c;
    L_0x010f:
        r0 = 1;
        if (r7 == 0) goto L_0x008c;
    L_0x0112:
        r12 = z;	 Catch:{ RemoteException -> 0x01b0 }
        r13 = 89;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01b0 }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01b0 }
        if (r12 == 0) goto L_0x008c;
    L_0x011e:
        r0 = 2;
        if (r7 == 0) goto L_0x008c;
    L_0x0121:
        r12 = z;	 Catch:{ RemoteException -> 0x01b2 }
        r13 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01b2 }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01b2 }
        if (r12 == 0) goto L_0x008c;
    L_0x012d:
        r0 = 3;
        if (r7 == 0) goto L_0x008c;
    L_0x0130:
        r12 = z;	 Catch:{ RemoteException -> 0x01b4 }
        r13 = 94;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01b4 }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01b4 }
        if (r12 == 0) goto L_0x008c;
    L_0x013c:
        r0 = 4;
        if (r7 == 0) goto L_0x008c;
    L_0x013f:
        r12 = z;	 Catch:{ RemoteException -> 0x01b6 }
        r13 = 96;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01b6 }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01b6 }
        if (r12 == 0) goto L_0x008c;
    L_0x014b:
        r0 = 5;
        if (r7 == 0) goto L_0x008c;
    L_0x014e:
        r12 = z;	 Catch:{ RemoteException -> 0x01b8 }
        r13 = 98;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01b8 }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01b8 }
        if (r12 == 0) goto L_0x008c;
    L_0x015a:
        r0 = 6;
        if (r7 == 0) goto L_0x008c;
    L_0x015d:
        r12 = z;	 Catch:{ RemoteException -> 0x01ba }
        r13 = 87;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01ba }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01ba }
        if (r12 == 0) goto L_0x008c;
    L_0x0169:
        r0 = 7;
        if (r7 == 0) goto L_0x008c;
    L_0x016c:
        r12 = z;	 Catch:{ RemoteException -> 0x01bc }
        r13 = 93;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01bc }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01bc }
        if (r12 == 0) goto L_0x008c;
    L_0x0178:
        r0 = 8;
        if (r7 == 0) goto L_0x008c;
    L_0x017c:
        r12 = z;	 Catch:{ RemoteException -> 0x01be }
        r13 = 91;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01be }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01be }
        if (r12 == 0) goto L_0x008c;
    L_0x0188:
        r0 = 9;
        if (r7 == 0) goto L_0x008c;
    L_0x018c:
        r12 = z;	 Catch:{ RemoteException -> 0x01c0 }
        r13 = 90;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01c0 }
        r12 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01c0 }
        if (r12 == 0) goto L_0x008c;
    L_0x0198:
        r0 = 10;
        if (r7 == 0) goto L_0x008c;
    L_0x019c:
        r12 = z;	 Catch:{ RemoteException -> 0x01c2 }
        r13 = 97;
        r12 = r12[r13];	 Catch:{ RemoteException -> 0x01c2 }
        r6 = r6.equals(r12);	 Catch:{ RemoteException -> 0x01c2 }
        if (r6 == 0) goto L_0x008c;
    L_0x01a8:
        r0 = 11;
        goto L_0x008c;
    L_0x01ac:
        r0 = move-exception;
        throw r0;
    L_0x01ae:
        r0 = move-exception;
        throw r0;
    L_0x01b0:
        r0 = move-exception;
        throw r0;
    L_0x01b2:
        r0 = move-exception;
        throw r0;
    L_0x01b4:
        r0 = move-exception;
        throw r0;
    L_0x01b6:
        r0 = move-exception;
        throw r0;
    L_0x01b8:
        r0 = move-exception;
        throw r0;
    L_0x01ba:
        r0 = move-exception;
        throw r0;
    L_0x01bc:
        r0 = move-exception;
        throw r0;
    L_0x01be:
        r0 = move-exception;
        throw r0;
    L_0x01c0:
        r0 = move-exception;
        throw r0;
    L_0x01c2:
        r0 = move-exception;
        throw r0;
    L_0x01c4:
        r6 = com.whatsapp.it.getDefault();	 Catch:{ RemoteException -> 0x0232 }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x0232 }
        if (r7 == 0) goto L_0x00b7;
    L_0x01cd:
        r6 = com.whatsapp.air.getDefault();	 Catch:{ RemoteException -> 0x0234 }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x0234 }
        if (r7 == 0) goto L_0x00b7;
    L_0x01d6:
        r6 = com.whatsapp.a3m.getDefault();	 Catch:{ RemoteException -> 0x0236 }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x0236 }
        if (r7 == 0) goto L_0x00b7;
    L_0x01df:
        r6 = com.whatsapp.a5i.getDefault();	 Catch:{ RemoteException -> 0x0238 }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x0238 }
        if (r7 == 0) goto L_0x00b7;
    L_0x01e8:
        r6 = com.whatsapp.a2t.getDefault();	 Catch:{ RemoteException -> 0x023a }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x023a }
        if (r7 == 0) goto L_0x00b7;
    L_0x01f1:
        r6 = com.whatsapp.ao4.getDefault();	 Catch:{ RemoteException -> 0x023c }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x023c }
        if (r7 == 0) goto L_0x00b7;
    L_0x01fa:
        r6 = com.whatsapp.tq.getDefault();	 Catch:{ RemoteException -> 0x023e }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x023e }
        if (r7 == 0) goto L_0x00b7;
    L_0x0203:
        r6 = com.whatsapp.asu.getDefault();	 Catch:{ RemoteException -> 0x0240 }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x0240 }
        if (r7 == 0) goto L_0x00b7;
    L_0x020c:
        r6 = com.whatsapp.uq.getDefault();	 Catch:{ RemoteException -> 0x0242 }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x0242 }
        if (r7 == 0) goto L_0x00b7;
    L_0x0215:
        r6 = com.whatsapp.ms.getDefault();	 Catch:{ RemoteException -> 0x0244 }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x0244 }
        if (r7 == 0) goto L_0x00b7;
    L_0x021e:
        r6 = com.whatsapp.c7.getDefault();	 Catch:{ RemoteException -> 0x0246 }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x0246 }
        if (r7 == 0) goto L_0x00b7;
    L_0x0227:
        r6 = com.whatsapp.arz.getDefault();	 Catch:{ RemoteException -> 0x0248 }
        a(r1, r2, r4, r5, r6);	 Catch:{ RemoteException -> 0x0248 }
        if (r7 == 0) goto L_0x00b7;
    L_0x0230:
        goto L_0x008f;
    L_0x0232:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0234 }
    L_0x0234:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0236 }
    L_0x0236:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0238 }
    L_0x0238:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x023a }
    L_0x023a:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x023c }
    L_0x023c:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x023e }
    L_0x023e:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0240 }
    L_0x0240:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0242 }
    L_0x0242:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0244 }
    L_0x0244:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0246 }
    L_0x0246:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0248 }
    L_0x0248:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x024a }
    L_0x024a:
        r0 = move-exception;
        throw r0;
    L_0x024c:
        r0 = move-exception;
        throw r0;
    L_0x024e:
        r0 = move-exception;
    L_0x024f:
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0255:
        r0 = move-exception;
    L_0x0256:
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x025c:
        r0 = move-exception;
        goto L_0x0256;
    L_0x025e:
        r0 = move-exception;
        goto L_0x024f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a24.a(java.util.Map):void");
    }

    public void b(ArrayList arrayList) {
        a(arrayList, u7.CALL);
    }

    public void a(l5 l5Var, String str, String str2, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(z[239], str);
        contentValues.put(z[240], str2);
        contentValues.put(z[241], Long.toString(j));
        a(contentValues, l5Var.p);
        kl.k(l5Var.p);
        kl.k(str);
        Log.i(z[242] + str2 + z[243] + j + z[246] + l5Var.p + z[245] + str + z[244] + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Nullable
    private aqo a(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        aqo com_whatsapp_aqo = null;
        Class a = a(str, str2);
        if (a != null) {
            try {
                com_whatsapp_aqo = (aqo) a.getMethod(z[45], new Class[]{String.class}).invoke(null, new Object[]{str3});
            } catch (Throwable e) {
                throw new RuntimeException(z[46] + a, e);
            } catch (Throwable e2) {
                throw new RuntimeException(z[44] + a, e2);
            } catch (Throwable e22) {
                throw new RuntimeException(z[43] + a, e22);
            }
        }
        return com_whatsapp_aqo;
    }

    public void b(Collection collection) {
        Throwable e;
        boolean z = l5.s;
        try {
            if (collection.isEmpty()) {
                Log.i(z[170]);
                return;
            }
            int i;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList(collection.size());
            int i2 = 0;
            for (l5 l5Var : collection) {
                try {
                    if (TextUtils.isEmpty(l5Var.p)) {
                        Log.i(z[151] + l5Var);
                        if (!z) {
                            continue;
                        }
                    }
                    try {
                        if (l5Var.b == null && l5Var.n == null) {
                            l5Var.t();
                        }
                        try {
                            if (l5Var.m) {
                                i = i2 + 1;
                            } else {
                                i = i2;
                            }
                            arrayList.add(ContentProviderOperation.newInsert(ContactProvider.f).withYieldAllowed(true).withValue(z[162], l5Var.p).withValue(z[169], Boolean.valueOf(l5Var.m)).withValue(z[158], l5Var.w).withValue(z[163], Long.valueOf(l5Var.r)).withValue(z[159], l5Var.l.b).withValue(z[148], Long.valueOf(l5Var.l.a)).withValue(z[161], l5Var.q).withValue(z[149], l5Var.u).withValue(z[152], l5Var.j).withValue(z[154], l5Var.b).withValue(z[168], l5Var.n).withValue(z[164], l5Var.k).build());
                            for (aqo com_whatsapp_aqo : l5Var.p().values()) {
                                arrayList.add(ContentProviderOperation.newInsert(ContactProvider.a).withValue(z[153], l5Var.p).withValue(z[147], a(com_whatsapp_aqo.getClass())).withValue(z[165], com_whatsapp_aqo.getText()).withValue(z[155], Long.valueOf(currentTimeMillis)).withValue(z[150], Boolean.valueOf(true)).build());
                                if (z) {
                                    break;
                                }
                            }
                            if (!z) {
                                i2 = i;
                            }
                            break;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            }
            i = i2;
            try {
                break;
                this.a.a(arrayList);
            } catch (IllegalArgumentException e22222) {
                Log.e(z[156] + collection.size() + z[166] + e22222);
            } catch (RemoteException e3) {
                e = e3;
                throw new RuntimeException(e);
            } catch (OperationApplicationException e4) {
                e = e4;
                throw new RuntimeException(e);
            }
            Log.i(z[167] + collection.size() + z[160] + i + z[157] + (SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }

    public boolean e() {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = this.a.a(ContactProvider.f, ContactProvider.d, null, null, null);
        if (a == null) {
            try {
                Log.e(z[205]);
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            boolean z;
            if (a.moveToNext()) {
                if (a.getLong(0) > 0) {
                    z = true;
                    a.close();
                    Log.i(z[206] + z + z[204] + (System.currentTimeMillis() - currentTimeMillis));
                    return z;
                }
            }
            z = false;
            a.close();
            Log.i(z[206] + z + z[204] + (System.currentTimeMillis() - currentTimeMillis));
            return z;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void a(Collection collection) {
        int i;
        Throwable e;
        boolean z = l5.s;
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList(collection.size());
        int i2 = 0;
        for (l5 l5Var : collection) {
            try {
                if (l5Var.q == null || TextUtils.isEmpty(l5Var.p)) {
                    Log.i(z[292] + l5Var.p);
                    if (!z) {
                        continue;
                    }
                }
                i = i2 + 1;
                Builder newInsert = ContentProviderOperation.newInsert(ContactProvider.f);
                try {
                    newInsert.withYieldAllowed(true);
                    if (l5Var.t > 0) {
                        newInsert.withValue(z[277], Long.valueOf(l5Var.t));
                    }
                    try {
                        newInsert.withValue(z[280], l5Var.p);
                        newInsert.withValue(z[286], Boolean.valueOf(l5Var.m));
                        newInsert.withValue(z[284], l5Var.w);
                        newInsert.withValue(z[282], Long.valueOf(l5Var.r));
                        try {
                            Object valueOf;
                            newInsert.withValue(z[300], l5Var.l != null ? l5Var.l.b : null);
                            String str = z[293];
                            if (l5Var.l != null) {
                                valueOf = Long.valueOf(l5Var.l.a);
                            } else {
                                valueOf = null;
                            }
                            try {
                                newInsert.withValue(str, valueOf);
                                newInsert.withValue(z[283], l5Var.q);
                                newInsert.withValue(z[302], l5Var.u);
                                newInsert.withValue(z[294], l5Var.j);
                                if (l5Var.b == null && l5Var.n == null) {
                                    l5Var.t();
                                }
                                newInsert.withValue(z[289], l5Var.b);
                                newInsert.withValue(z[301], l5Var.n);
                                newInsert.withValue(z[299], l5Var.k);
                                newInsert.withValue(z[298], Integer.valueOf(l5Var.d));
                                newInsert.withValue(z[278], Integer.valueOf(l5Var.c));
                                newInsert.withValue(z[295], Integer.valueOf(l5Var.o));
                                newInsert.withValue(z[291], Long.valueOf(l5Var.x));
                                newInsert.withValue(z[304], l5Var.f);
                                newInsert.withValue(z[305], Boolean.valueOf(true));
                                arrayList.add(newInsert.build());
                                for (aqo com_whatsapp_aqo : l5Var.p().values()) {
                                    arrayList.add(ContentProviderOperation.newInsert(ContactProvider.a).withValue(z[279], l5Var.p).withValue(z[285], a(com_whatsapp_aqo.getClass())).withValue(z[303], com_whatsapp_aqo.getText()).withValue(z[296], Long.valueOf(currentTimeMillis)).withValue(z[297], Boolean.valueOf(true)).build());
                                    if (z) {
                                        break;
                                    }
                                }
                                if (!z) {
                                    i2 = i;
                                }
                                break;
                            } catch (IllegalArgumentException e2) {
                                throw e2;
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
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            }
        }
        i = i2;
        try {
            break;
            this.a.a(arrayList);
        } catch (IllegalArgumentException e22222222) {
            Log.e(z[290] + e22222222);
        } catch (RemoteException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (OperationApplicationException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
        Log.i(z[287] + i + z[281] + collection.size() + z[288] + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void l(l5 l5Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(z[235], l5Var.f);
        a(contentValues, l5Var.p);
        Log.i(z[233] + l5Var.p + ' ' + contentValues + z[234] + (System.currentTimeMillis() - currentTimeMillis));
    }

    public void e(ArrayList arrayList) {
        a(arrayList, u7.BROADCAST);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.ArrayList r17, java.util.Set r18) {
        /*
        r16 = this;
        r9 = com.whatsapp.l5.s;
        r10 = new java.util.HashSet;
        r10.<init>();
        r8 = 0;
        r2 = com.whatsapp.App.at;	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r5 = 0;
        r6 = z;	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r7 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r4[r5] = r6;	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r5 = z;	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r6 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r5 = r5[r6];	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r6 = 1;
        r6 = new java.lang.String[r6];	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r7 = 0;
        r12 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r14 = 31536000000; // 0x757b12c00 float:3.89605073E14 double:1.55808542072E-313;
        r12 = r12 - r14;
        r11 = java.lang.String.valueOf(r12);	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r6[r7] = r11;	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r7 = z;	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r11 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r7 = r7[r11];	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
        r2 = r2.query(r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x00a6, all -> 0x00b0 }
    L_0x003c:
        r3 = r2.moveToNext();	 Catch:{ Exception -> 0x0178, all -> 0x0173 }
        if (r3 == 0) goto L_0x0050;
    L_0x0042:
        r3 = 0;
        r4 = r2.getLong(r3);	 Catch:{ Exception -> 0x0178, all -> 0x0173 }
        r3 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x0178, all -> 0x0173 }
        r10.add(r3);	 Catch:{ Exception -> 0x0178, all -> 0x0173 }
        if (r9 == 0) goto L_0x003c;
    L_0x0050:
        if (r2 == 0) goto L_0x0055;
    L_0x0052:
        r2.close();	 Catch:{ Exception -> 0x00a4 }
    L_0x0055:
        r12 = java.lang.System.currentTimeMillis();
        r2 = z;
        r3 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r5 = r2[r3];
        r2 = z;
        r3 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r2 = r2[r3];
        r0 = r16;
        r2 = r0.a;
        r3 = com.whatsapp.contact.ContactProvider.f;
        r4 = com.whatsapp.l5.v;
        r6 = 1;
        r6 = new java.lang.String[r6];
        r7 = 0;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r11 = com.whatsapp.App.ad();
        r8 = r8.append(r11);
        r11 = z;
        r14 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r11 = r11[r14];
        r8 = r8.append(r11);
        r8 = r8.toString();
        r6[r7] = r8;
        r7 = z;
        r8 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r7 = r7[r8];
        r3 = r2.a(r3, r4, r5, r6, r7);
        if (r3 != 0) goto L_0x00bb;
    L_0x009a:
        r2 = z;	 Catch:{ Exception -> 0x00b9 }
        r3 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00b9 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ Exception -> 0x00b9 }
    L_0x00a3:
        return;
    L_0x00a4:
        r2 = move-exception;
        throw r2;
    L_0x00a6:
        r2 = move-exception;
        r2 = r8;
    L_0x00a8:
        if (r2 == 0) goto L_0x0055;
    L_0x00aa:
        r2.close();	 Catch:{ Exception -> 0x00ae }
        goto L_0x0055;
    L_0x00ae:
        r2 = move-exception;
        throw r2;
    L_0x00b0:
        r2 = move-exception;
    L_0x00b1:
        if (r8 == 0) goto L_0x00b6;
    L_0x00b3:
        r8.close();	 Catch:{ Exception -> 0x00b7 }
    L_0x00b6:
        throw r2;
    L_0x00b7:
        r2 = move-exception;
        throw r2;
    L_0x00b9:
        r2 = move-exception;
        throw r2;
    L_0x00bb:
        r2 = r3.moveToNext();
        if (r2 == 0) goto L_0x0135;
    L_0x00c1:
        r4 = com.whatsapp.l5.b(r3);
        r2 = r4.p;
        r2 = com.whatsapp.l5.e(r2);
        if (r2 != 0) goto L_0x00bb;
    L_0x00cd:
        r2 = r4.c();	 Catch:{ Exception -> 0x0165 }
        if (r2 == 0) goto L_0x00d5;
    L_0x00d3:
        if (r9 == 0) goto L_0x00bb;
    L_0x00d5:
        if (r18 == 0) goto L_0x00e3;
    L_0x00d7:
        r2 = r4.q;	 Catch:{ Exception -> 0x0167 }
        r0 = r18;
        r2 = r0.contains(r2);	 Catch:{ Exception -> 0x0167 }
        if (r2 == 0) goto L_0x00e3;
    L_0x00e1:
        if (r9 == 0) goto L_0x00bb;
    L_0x00e3:
        r6 = r4.f();	 Catch:{ Exception -> 0x0169 }
        r2 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x0169 }
        r2 = r10.contains(r2);	 Catch:{ Exception -> 0x0169 }
        if (r2 != 0) goto L_0x00f9;
    L_0x00f1:
        r2 = r10.isEmpty();	 Catch:{ Exception -> 0x016b }
        if (r2 != 0) goto L_0x00f9;
    L_0x00f7:
        if (r9 == 0) goto L_0x00bb;
    L_0x00f9:
        r2 = r17.isEmpty();	 Catch:{ Exception -> 0x016d }
        if (r2 == 0) goto L_0x0106;
    L_0x00ff:
        r0 = r17;
        r0.add(r4);	 Catch:{ Exception -> 0x016d }
        if (r9 == 0) goto L_0x00bb;
    L_0x0106:
        r2 = r17.size();
        r2 = r2 + -1;
        r0 = r17;
        r2 = r0.get(r2);
        r2 = (com.whatsapp.l5) r2;
        r5 = r2.q;	 Catch:{ Exception -> 0x016f }
        r6 = r4.q;	 Catch:{ Exception -> 0x016f }
        r5 = r5.equalsIgnoreCase(r6);	 Catch:{ Exception -> 0x016f }
        if (r5 == 0) goto L_0x012c;
    L_0x011e:
        r2 = r2.l;	 Catch:{ Exception -> 0x0171 }
        r2 = r2.b;	 Catch:{ Exception -> 0x0171 }
        r5 = r4.l;	 Catch:{ Exception -> 0x0171 }
        r5 = r5.b;	 Catch:{ Exception -> 0x0171 }
        r2 = r2.equals(r5);	 Catch:{ Exception -> 0x0171 }
        if (r2 != 0) goto L_0x0133;
    L_0x012c:
        r0 = r17;
        r0.add(r4);	 Catch:{ Exception -> 0x0171 }
        if (r9 == 0) goto L_0x00bb;
    L_0x0133:
        if (r9 == 0) goto L_0x00bb;
    L_0x0135:
        r3.close();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r17.size();
        r3 = java.lang.Integer.toString(r3);
        r2 = r2.append(r3);
        r3 = z;
        r4 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r4 = java.lang.System.currentTimeMillis();
        r4 = r4 - r12;
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        goto L_0x00a3;
    L_0x0165:
        r2 = move-exception;
        throw r2;
    L_0x0167:
        r2 = move-exception;
        throw r2;
    L_0x0169:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x016b }
    L_0x016b:
        r2 = move-exception;
        throw r2;
    L_0x016d:
        r2 = move-exception;
        throw r2;
    L_0x016f:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0171 }
    L_0x0171:
        r2 = move-exception;
        throw r2;
    L_0x0173:
        r3 = move-exception;
        r8 = r2;
        r2 = r3;
        goto L_0x00b1;
    L_0x0178:
        r3 = move-exception;
        goto L_0x00a8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a24.a(java.util.ArrayList, java.util.Set):void");
    }

    private static String a(String str, aqo com_whatsapp_aqo) {
        try {
            if (TextUtils.equals(str, z[14])) {
                return str;
            }
            if (TextUtils.equals(str, z[11])) {
                return str;
            }
            try {
                if (TextUtils.equals(str, z[12])) {
                    return str;
                }
                try {
                    return TextUtils.equals(str, z[13]) ? str : com_whatsapp_aqo.getText();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public a24(Context context) {
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(ContactProvider.f);
        if (acquireContentProviderClient != null) {
            try {
                this.a = new gb(acquireContentProviderClient, null);
                if (!l5.s) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        Log.e(z[207] + ContactProvider.f);
        ContentProvider contactProvider = new ContactProvider();
        contactProvider.attachInfo(context, null);
        this.a = new ax_(contactProvider);
    }

    public void e(l5 l5Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (l5Var.p == null) {
                Log.w(z[61]);
                return;
            }
            String ad = App.ad();
            if (ad == null) {
                try {
                    Log.w(z[66]);
                    return;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            try {
                if (l5Var.c() || !l5Var.p.startsWith(ad)) {
                    ContentValues contentValues = new ContentValues(3);
                    contentValues.put(z[62], l5Var.p);
                    contentValues.put(z[63], Boolean.valueOf(true));
                    contentValues.put(z[59], l5Var.w);
                    contentValues.put(z[60], Long.valueOf(l5Var.r));
                    try {
                        l5Var.t = ContentUris.parseId(this.a.a(ContactProvider.f, contentValues));
                    } catch (IllegalArgumentException e2) {
                        Log.e(z[64] + l5Var + ' ' + e2);
                    }
                    Log.i(z[58] + l5Var + z[65] + (System.currentTimeMillis() - currentTimeMillis));
                    return;
                }
                Log.i(z[67]);
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public boolean b(Collection collection, aqo com_whatsapp_aqo) {
        boolean z = l5.s;
        try {
            if (collection.isEmpty()) {
                return true;
            }
            int size = collection.size();
            try {
                int i;
                int i2 = size / 200;
                if (size % 200 == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                int i3 = i2 + i;
                String[] strArr = new String[]{z[124]};
                Iterator it = collection.iterator();
                Set hashSet = new HashSet();
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i4 * 200;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(z[123]);
                    stringBuilder.append(z[122]);
                    stringBuilder.append(z[121]);
                    stringBuilder.append(z[120]);
                    stringBuilder.append(z[125]);
                    stringBuilder.append(z[126]);
                    int min = Math.min(i5 + 200, size);
                    String[] strArr2 = new String[((min + 2) - i5)];
                    strArr2[0] = a(com_whatsapp_aqo.getClass());
                    strArr2[1] = com_whatsapp_aqo.getText();
                    i2 = i5;
                    while (i2 < min) {
                        if (i2 > i5) {
                            try {
                                stringBuilder.append(',');
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        stringBuilder.append('?');
                        strArr2[(i2 + 2) - i5] = (String) it.next();
                        i = i2 + 1;
                        if (z) {
                            break;
                        }
                        i2 = i;
                    }
                    stringBuilder.append(')');
                    Cursor a = this.a.a(ContactProvider.a, strArr, stringBuilder.toString(), strArr2, null);
                    if (a == null) {
                        try {
                            Log.e(z[127]);
                            return false;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    do {
                        try {
                            if (!a.moveToNext()) {
                                break;
                            }
                            hashSet.add(a.getString(0));
                        } catch (Throwable th) {
                            a.close();
                        }
                    } while (!z);
                    a.close();
                    i = i4 + 1;
                    if (z) {
                        break;
                    }
                    i4 = i;
                }
                for (String contains : collection) {
                    try {
                        if (hashSet.contains(contains)) {
                            if (z) {
                                break;
                            }
                        }
                        return false;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                return true;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public void c() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.a.a(ContactProvider.f, null, null);
        } catch (Throwable e) {
            Log.b(z[73], e);
        }
        Log.i(z[74] + (System.currentTimeMillis() - currentTimeMillis));
    }

    public Map a() {
        boolean z = l5.s;
        long currentTimeMillis = System.currentTimeMillis();
        Map hashMap = new HashMap();
        Cursor a = this.a.a(ContactProvider.f, l5.v, null, null, null);
        if (a == null) {
            try {
                Log.e(z[333]);
                return hashMap;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            l5 b = l5.b(a);
            try {
                if (b.l != null) {
                    if (TextUtils.isEmpty(b.l.b)) {
                        continue;
                    } else {
                        hashMap.put(b.l.b, b);
                        continue;
                    }
                }
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        a.close();
        Log.i(z[332] + hashMap.size() + z[334] + (System.currentTimeMillis() - currentTimeMillis));
        return hashMap;
    }

    public void a(l5 l5Var) {
        boolean z = l5.s;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Cursor a = this.a.a(ContactProvider.a, new String[]{z[4], z[7], z[9]}, z[5], new String[]{l5Var.p}, null);
        if (a == null) {
            try {
                Log.e(z[10] + l5Var);
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        do {
            try {
                if (!a.moveToNext()) {
                    break;
                }
                aqo a2 = a(a.getString(0), a.getString(1), a.getString(2));
                if (a2 != null) {
                    l5Var.a(a2);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (Throwable th) {
                a.close();
            }
        } while (!z);
        a.close();
        Log.i(z[8] + l5Var.p + z[6] + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.Collection r13, java.util.Map r14) {
        /*
        r12 = this;
        r4 = 0;
        r7 = com.whatsapp.l5.s;
        r8 = java.lang.System.currentTimeMillis();
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = z;
        r1 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r0 = r0[r1];
        r0 = r3.append(r0);
        r1 = z;
        r2 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r1 = r1[r2];
        r0.append(r1);
        r1 = r13.iterator();
    L_0x0023:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0039;
    L_0x0029:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        android.database.DatabaseUtils.appendEscapedSQLString(r3, r0);
        r0 = 44;
        r3.append(r0);
        if (r7 == 0) goto L_0x0023;
    L_0x0039:
        r0 = r3.length();
        r0 = r0 + -1;
        r1 = r3.length();
        r2 = ")";
        r3.replace(r0, r1, r2);
        r6 = 0;
        r0 = r12.a;
        r1 = com.whatsapp.contact.ContactProvider.f;
        r2 = com.whatsapp.l5.v;
        r3 = r3.toString();
        r5 = r4;
        r2 = r0.a(r1, r2, r3, r4, r5);
        if (r2 != 0) goto L_0x011d;
    L_0x005b:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0076 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r2 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0076 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0076 }
        r0 = r0.append(r13);	 Catch:{ IllegalArgumentException -> 0x0076 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0076 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x0075:
        return;
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r1 = r0;
    L_0x0079:
        r0 = r2.moveToNext();
        if (r0 == 0) goto L_0x011b;
    L_0x007f:
        r3 = com.whatsapp.l5.b(r2);
        r0 = r3.p;
        r0 = r14.get(r0);
        r0 = (com.whatsapp.l5) r0;
        if (r0 == 0) goto L_0x00af;
    L_0x008d:
        r4 = r0.l;	 Catch:{ IllegalArgumentException -> 0x010b }
        if (r4 != 0) goto L_0x0095;
    L_0x0091:
        r4 = r3.l;	 Catch:{ IllegalArgumentException -> 0x010d }
        if (r4 != 0) goto L_0x00af;
    L_0x0095:
        r4 = r0.l;	 Catch:{ IllegalArgumentException -> 0x010f }
        if (r4 == 0) goto L_0x00a7;
    L_0x0099:
        r4 = r3.l;	 Catch:{ IllegalArgumentException -> 0x0111 }
        if (r4 == 0) goto L_0x00a7;
    L_0x009d:
        r4 = r0.l;	 Catch:{ IllegalArgumentException -> 0x0113 }
        r4 = r4.a;	 Catch:{ IllegalArgumentException -> 0x0113 }
        r10 = -2;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x00af;
    L_0x00a7:
        r4 = r3.m;	 Catch:{ IllegalArgumentException -> 0x0115 }
        if (r4 == 0) goto L_0x0119;
    L_0x00ab:
        r0 = r0.m;	 Catch:{ IllegalArgumentException -> 0x0117 }
        if (r0 != 0) goto L_0x0119;
    L_0x00af:
        r0 = r3.p;	 Catch:{ IllegalArgumentException -> 0x0117 }
        r14.put(r0, r3);	 Catch:{ IllegalArgumentException -> 0x0117 }
        r1 = r1 + 1;
        r0 = r1;
    L_0x00b7:
        if (r7 == 0) goto L_0x0078;
    L_0x00b9:
        r2.close();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = 47;
        r0 = r0.append(r1);
        r1 = r14.size();
        r0 = r0.append(r1);
        r1 = z;
        r2 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r13.size();
        r0 = r0.append(r1);
        r1 = z;
        r2 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r2 = java.lang.System.currentTimeMillis();
        r2 = r2 - r8;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0075;
    L_0x010b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x010d }
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0111 }
    L_0x0111:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0113 }
    L_0x0113:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0115 }
    L_0x0115:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0117 }
    L_0x0117:
        r0 = move-exception;
        throw r0;
    L_0x0119:
        r0 = r1;
        goto L_0x00b7;
    L_0x011b:
        r0 = r1;
        goto L_0x00b9;
    L_0x011d:
        r1 = r6;
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a24.a(java.util.Collection, java.util.Map):void");
    }

    public void h(l5 l5Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(z[237], Integer.valueOf(l5Var.d));
        a(contentValues, l5Var.p);
        Log.i(z[236] + l5Var.p + ' ' + contentValues + z[238] + (System.currentTimeMillis() - currentTimeMillis));
    }

    private void a(l5 l5Var, ArrayList arrayList) {
        arrayList.add(ContentProviderOperation.newDelete(ContactProvider.f).withSelection(z[331], new String[]{String.valueOf(l5Var.t)}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactProvider.a).withSelection(z[330], new String[]{l5Var.p, l5Var.p}).build());
    }

    public ArrayList d() {
        boolean z = l5.s;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor a = this.a.a(ContactProvider.f, l5.v, z[57], null, null);
        if (a == null) {
            try {
                Log.e(z[54]);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(l5.b(a));
            if (z) {
                break;
            }
        }
        a.close();
        Log.i(z[56] + arrayList.size() + z[55] + (System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    @Nullable
    private String a(@Nullable Class cls) {
        try {
            if (cls == it.class) {
                return z[140];
            }
            try {
                if (cls == air.class) {
                    return z[137];
                }
                try {
                    if (cls == a3m.class) {
                        return z[136];
                    }
                    try {
                        if (cls == a5i.class) {
                            return z[145];
                        }
                        try {
                            if (cls == a2t.class) {
                                return z[141];
                            }
                            try {
                                if (cls == ao4.class) {
                                    return z[138];
                                }
                                try {
                                    if (cls == tq.class) {
                                        return z[139];
                                    }
                                    try {
                                        if (cls == asu.class) {
                                            return z[142];
                                        }
                                        try {
                                            if (cls == uq.class) {
                                                return z[135];
                                            }
                                            try {
                                                if (cls == ms.class) {
                                                    return z[134];
                                                }
                                                try {
                                                    if (cls == c7.class) {
                                                        return z[143];
                                                    }
                                                    try {
                                                        if (cls == arz.class) {
                                                            return z[146];
                                                        }
                                                        Log.w(z[144] + cls);
                                                        return null;
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
                } catch (IllegalArgumentException e222222222) {
                    throw e222222222;
                }
            } catch (IllegalArgumentException e2222222222) {
                throw e2222222222;
            }
        } catch (IllegalArgumentException e22222222222) {
            throw e22222222222;
        }
    }

    public ArrayList a(String str) {
        boolean z = l5.s;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor a = this.a.a(ContactProvider.f, l5.v, z[266], new String[]{str}, null);
        if (a == null) {
            try {
                Log.e(z[269] + str);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(l5.b(a));
            if (z) {
                break;
            }
        }
        a.close();
        Log.i(z[270] + arrayList.size() + z[267] + str + z[268] + (System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    public void i(l5 l5Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(z[263], Integer.valueOf(l5Var.c));
        contentValues.put(z[265], Integer.valueOf(l5Var.o));
        contentValues.put(z[261], Long.valueOf(l5Var.x));
        a(contentValues, l5Var.p);
        Log.i(z[262] + l5Var.p + ' ' + contentValues + z[264] + (System.currentTimeMillis() - currentTimeMillis));
    }
}
