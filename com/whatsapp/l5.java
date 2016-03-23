package com.whatsapp;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.RawContacts;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.e2;
import com.google.e5;
import com.whatsapp.contact.ContactProvider;
import com.whatsapp.contact.d;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.a6;
import com.whatsapp.util.ag;
import com.whatsapp.util.cs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class l5 {
    private static final SparseArray h;
    public static boolean s;
    public static final String[] v;
    private static final String[] z;
    public transient boolean a;
    public String b;
    public int c;
    public int d;
    public boolean e;
    public String f;
    @Deprecated
    public String g;
    private Map i;
    public String j;
    public String k;
    public db l;
    public boolean m;
    public String n;
    public int o;
    public String p;
    public String q;
    public long r;
    public long t;
    public Integer u;
    public String w;
    public long x;

    public Bitmap w() {
        return b(z());
    }

    static {
        String[] strArr = new String[76];
        String str = "nm";
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
                        i3 = 52;
                        break;
                    case at.g /*1*/:
                        i3 = 55;
                        break;
                    case at.i /*2*/:
                        i3 = 14;
                        break;
                    case at.o /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "WX`\u0004>WC!\u00160FZo\u0004+QE#\u00191]C#\u0015'WR~\u00046[Y.\u001e*Y\r";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "VEa\u0011;WV}\u0004";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u001bTa\u00051@\u0017";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u001a]";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "uZo\n0Z\u007fa\u001d:c^j\u0017:@vx\u0011+UE}";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001a]~\u0017";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001aYa\u001d:P^o";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001a]~\u0017";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "dEa\u00166XR. 6WC{\u0002:G";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "WB}\u00040Yh|\u00191SCa\u001e:";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "PVz\u0011f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "BYj^>ZS|\u001f6P\u0019m\u0005-GX|^6@Rc_1UZk";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    str = "PVz\u0011m";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "FVy/<[Yz\u0011<@hg\u0014\u007f\t\u00171P\u001ezs.\u001d6YRz\t/Q\n1";
                    obj = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "PVz\u0011l";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "PVz\u0011l";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "PVz\u0011h";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "PVz\u0011h";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "PVz\u0011m";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "PVz\u0011f";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "@Rc\u0000";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0014\\k\tb";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u001cY{\u001c3\u001d";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u001cY{\u001c3\u001d";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0014^}\u0007>\t";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0014Dz\u0011+AD3";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0014]g\u0014b";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0014Gf\u001f1Q\n";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0014Yo\u001d:\t";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0014Yo\u001d:\t";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "FXy/6P\n";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "cvM\u001f1@Vm\u0004pPRb\u0015+Qh~\u00180@XQ\u00166XR}P";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "cvM\u001f1@Vm\u0004pPRb\u0015+Qh~\u00180@XQ\u00166XR}P";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0014Sa\u0015,\u0014Ya\u0004\u007fQOg\u0003+\u0018\u0017`\u001f+\\^`\u0017\u007f@X.\u0014:XRz\u0015q";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0014Sa\u0015,\u0014Ya\u0004\u007fQOg\u0003+\u0018\u0017`\u001f+\\^`\u0017\u007f@X.\u0014:XRz\u0015q";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "AGj\u0011+Qgf\u001f+[qg\u001c:G";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "FXy/6P\n";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u001cY{\u001c3\u001d";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u001cY{\u001c3\u001d";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0014^}\u0007>\t";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0014\\k\tb";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "DEa\u00123QZo\u00046W\u0017m\u001f1@Vm\u0004e";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0014Gf\u001f1Q\n";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0014]g\u0014b";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "tD \u00077UC}\u0011/D\u0019`\u0015+";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "SRz4:RV{\u001c+";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "SRz4:RV{\u001c+\u0014Zk\u00047[S.\u001d6GDg\u001e8\u0014X`P";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0014Df\u001f*XS.\u001e0@\u0017z\u0018-[@.\u00111M\u0017k\b<QGz\u00190ZD";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0014Df\u001f*XS.\u0012:\u0014G{\u00123]T";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "SRz4:RV{\u001c+\u0014Zk\u00047[S.\u001f1\u0014";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "SRz4:RV{\u001c+\u0014Zk\u00047[S.\u001f1\u0014";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "CVm\u001f1@Vm\u0004pSRz\u00007[Ca\u0003+FRo\u001dp";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0014Cf\u00052V\u0017h\u00193Q\u0017c\u0019,G^`\u0017\u007f]S4";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0014Q{\u001c3\u0014Qg\u001c:\u0014Zg\u0003,]YiP6P\r";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "CVm\u001f1@Vm\u0004pSRz\u00007[Ca\u0003+FRo\u001dp";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "CVm\u001f1@Vm\u0004pSRz\u00007[Ca\u0016>GC!";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0014Sk\u00130PR]\u0004-QVcP-QC{\u00021G\u0017`\u00053X";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "CVm\u001f1@Vm\u0004pSRz\u00007[Ca\u0016>GC!";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0014R|\u00020F\u0017m\u001c0G^`\u0017\u007fGC|\u0015>Y";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0014Dz\u0002:UZ.\u0019,\u0014Y{\u001c3";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "CVm\u001f1@Vm\u0004pSRz\u00007[Ca\u0016>GC!\u001f*@\u001aa\u0016rYRc\u001f-M\u0017";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "CVm\u001f1@Vm\u0004pSRz\u00007[Ca\u0016>GC!";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "CVm\u001f1@Vm\u0004pSRz\u00007[Ca\u0016>GC!";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u0014R|\u00020F\u0017i\u0015+@^`\u0017\u007f]Zo\u0017:\u0014Uw\u0004:G\u0017";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "CVm\u001f1@Vm\u0004pSRz\u00007[Ca\u0016>GC!\u0015-FX|P";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "@Rc\u0000";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "VEa\u0011;WV}\u0004";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "[Gk\u001e\u001c[Yz\u0011<@gf\u001f+[~`\u0000*@dz\u0002:UZ";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "tU|\u001f>PTo\u0003+";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "uAo\u0004>FD";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u001a]";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "WX`\u0004>WC!\u00007[Yk\u001e*YUk\u0002p^^j_1A[b";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "XXa\u001b*D";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "UYj\u00020]S \u0000:FZg\u0003,]X`^\rqvJ/\u001c{yZ1\u001c`d";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    z = strArr3;
                    strArr = new String[18];
                    str = "k^j";
                    obj = 75;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    str = "^^j";
                    obj = 76;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    str = "]DQ\u00077UC}\u0011/Dh{\u0003:F";
                    obj = 77;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    str = "GCo\u0004*G";
                    obj = 78;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "ZBc\u0012:F";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "FVy/<[Yz\u0011<@hg\u0014";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "P^}\u00003UNQ\u001e>YR";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "D_a\u001e:kCw\u0000:";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "D_a\u001e:k[o\u0012:X";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "AY}\u0015:Zhc\u00038kTa\u00051@";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "D_a\u00040kC}";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "@_{\u001d=kC}";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "D_a\u00040k^j/+]Zk\u0003+UZ~";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "S^x\u00151kYo\u001d:";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    str = "RVc\u00193Mh`\u00112Q";
                    obj = 89;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "CVQ\u001e>YR";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "GX|\u0004\u0000ZVc\u0015";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "GCo\u0004*Ghz\u00192QDz\u00112D";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    v = strArr3;
                    h = new SparseArray();
                    return;
                default:
                    strArr2[i] = str;
                    str = "WX`\u0004>WC!\u00160FZo\u0004+QE#\u0015'WR~\u00046[Y.\u001e*Y\r";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static l5 a(Cursor cursor) {
        boolean z = true;
        try {
            String string = cursor.getString(1);
            if (cursor.getInt(2) != 1) {
                z = false;
            }
            l5 l5Var = new l5(string, z, cursor.getString(3), cursor.getLong(4), cursor.getString(5), cursor.getInt(6), cursor.getString(7));
            l5Var.t = cursor.getLong(0);
            return l5Var;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream b(boolean r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = r4.a;	 Catch:{ FileNotFoundException -> 0x00a4 }
        if (r1 == 0) goto L_0x00a3;
    L_0x0005:
        if (r5 == 0) goto L_0x0056;
    L_0x0007:
        r0 = r4.x();
        r1 = r0.exists();
        if (r1 != 0) goto L_0x0097;
    L_0x0011:
        r0 = r4.r();
        r1 = r4.c;	 Catch:{ FileNotFoundException -> 0x00a6 }
        if (r1 <= 0) goto L_0x0097;
    L_0x0019:
        r1 = android.os.Environment.getExternalStorageState();	 Catch:{ FileNotFoundException -> 0x00a6 }
        r1 = com.whatsapp.App.p(r1);	 Catch:{ FileNotFoundException -> 0x00a6 }
        if (r1 == 0) goto L_0x0097;
    L_0x0023:
        r1 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x00a8 }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x00a8 }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x00a8 }
        r3 = 56;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x00a8 }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00a8 }
        r2 = r4.p;	 Catch:{ FileNotFoundException -> 0x00a8 }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00a8 }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x00a8 }
        r3 = 55;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x00a8 }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00a8 }
        r2 = r4.c;	 Catch:{ FileNotFoundException -> 0x00a8 }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00a8 }
        r1 = r1.toString();	 Catch:{ FileNotFoundException -> 0x00a8 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ FileNotFoundException -> 0x00a8 }
        r1 = 0;
        r4.c = r1;	 Catch:{ FileNotFoundException -> 0x00a8 }
        r1 = s;	 Catch:{ FileNotFoundException -> 0x00a8 }
        if (r1 == 0) goto L_0x0097;
    L_0x0056:
        r0 = r4.r();
        r1 = r0.exists();
        if (r1 != 0) goto L_0x0097;
    L_0x0060:
        r0 = r4.x();
        r1 = r4.o;	 Catch:{ FileNotFoundException -> 0x00aa }
        if (r1 <= 0) goto L_0x0097;
    L_0x0068:
        r1 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x00aa }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x00aa }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x00aa }
        r3 = 53;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x00aa }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00aa }
        r2 = r4.p;	 Catch:{ FileNotFoundException -> 0x00aa }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00aa }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x00aa }
        r3 = 54;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x00aa }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00aa }
        r2 = r4.o;	 Catch:{ FileNotFoundException -> 0x00aa }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00aa }
        r1 = r1.toString();	 Catch:{ FileNotFoundException -> 0x00aa }
        com.whatsapp.util.Log.e(r1);	 Catch:{ FileNotFoundException -> 0x00aa }
        r1 = 0;
        r4.o = r1;	 Catch:{ FileNotFoundException -> 0x00aa }
    L_0x0097:
        r1 = r0.exists();
        if (r1 == 0) goto L_0x00b2;
    L_0x009d:
        r1 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x00ac }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x00ac }
        r0 = r1;
    L_0x00a3:
        return r0;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x00a8 }
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        throw r0;
    L_0x00ac:
        r0 = move-exception;
        r0 = r4.a(r5);
        goto L_0x00a3;
    L_0x00b2:
        r0 = r4.a(r5);
        goto L_0x00a3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.b(boolean):java.io.InputStream");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r6 = this;
        r1 = s;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00be }
        r3 = 32;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00be }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00be }
        r4 = r6.t;	 Catch:{ IllegalArgumentException -> 0x00be }
        r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x00be }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00be }
        r3 = 28;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00be }
        r3 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00be }
        r0 = r6.p;	 Catch:{ IllegalArgumentException -> 0x00be }
        if (r0 != 0) goto L_0x00c0;
    L_0x0024:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00be }
        r4 = 25;
        r0 = r0[r4];	 Catch:{ IllegalArgumentException -> 0x00be }
    L_0x002a:
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r3 = 23;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r0 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        if (r0 != 0) goto L_0x0045;
    L_0x003a:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r3 = 24;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00c6 }
        if (r1 == 0) goto L_0x005b;
    L_0x0045:
        r0 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r4 = r0.a;	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r0 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r3 = "-";
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r3 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r3 = r3.b;	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c6 }
    L_0x005b:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3 = 29;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3 = r6.u;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3 = 26;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r0 = r6.c();	 Catch:{ IllegalArgumentException -> 0x00c8 }
        if (r0 == 0) goto L_0x00a5;
    L_0x007f:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00ca }
        r3 = 31;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00ca }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ca }
        r3 = com.whatsapp.App.z();	 Catch:{ IllegalArgumentException -> 0x00ca }
        r3 = r6.a(r3);	 Catch:{ IllegalArgumentException -> 0x00ca }
        r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00ca }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00ca }
        r3 = 27;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00ca }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ca }
        r3 = r6.w;	 Catch:{ IllegalArgumentException -> 0x00ca }
        r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00ca }
        if (r1 == 0) goto L_0x00b9;
    L_0x00a5:
        r0 = com.whatsapp.App.am;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r1 = 1;
        if (r0 < r1) goto L_0x00b9;
    L_0x00aa:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r1 = 30;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00cc }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00cc }
        r1 = r6.q;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00cc }
    L_0x00b9:
        r0 = r2.toString();
        return r0;
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r0 = r6.p;
        goto L_0x002a;
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.toString():java.lang.String");
    }

    public void a(Class cls, aqo com_whatsapp_aqo) {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    this.i = new HashMap();
                }
            }
        }
        this.i.put(cls, com_whatsapp_aqo);
    }

    public static String c(String str) {
        String str2 = '+' + str;
        try {
            e2 a = e2.a();
            str2 = a.a(a.b(str2, z[0]), e5.INTERNATIONAL);
        } catch (Exception e) {
            Log.e(z[1] + str2 + " " + e.getMessage());
        } catch (ExceptionInInitializerError e2) {
            Log.e(z[2] + str2 + " " + e2.getMessage());
        }
        return str2;
    }

    public Uri q() {
        return ContentUris.withAppendedId(ContactProvider.f, this.t);
    }

    public void a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            try {
                ag.a(bArr, x());
            } catch (IOException e) {
                throw e;
            } catch (IOException e2) {
                throw e2;
            } catch (Throwable e3) {
                Log.b(z[37], e3);
                return;
            }
        }
        if (bArr2 != null) {
            ag.a(bArr2, r());
        }
    }

    public String b(int i, float f) {
        return j() + "_" + Integer.toString(i) + "_" + Float.toString(f);
    }

    public static Bitmap b(int i) {
        Bitmap bitmap = (Bitmap) h.get(i);
        if (bitmap != null) {
            return bitmap;
        }
        bitmap = a(i, App.z().getResources().getDimensionPixelSize(2131427544), App.z().getResources().getDimension(2131427359));
        h.put(i, bitmap);
        return bitmap;
    }

    public l5(d dVar) {
        this(dVar.a(), dVar.b(), dVar.g(), dVar.f(), dVar.d());
        this.k = dVar.e();
    }

    public String s() {
        return h(this.p);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t() {
        /*
        r11 = this;
        r5 = 2;
        r10 = 1;
        r7 = 0;
        r6 = s;
        r0 = r11.l;
        if (r0 == 0) goto L_0x00d7;
    L_0x0009:
        r0 = 4;
        r2 = new java.lang.String[r0];
        r0 = z;
        r1 = 14;
        r0 = r0[r1];
        r2[r7] = r0;
        r0 = z;
        r1 = 16;
        r0 = r0[r1];
        r2[r10] = r0;
        r0 = z;
        r1 = 18;
        r0 = r0[r1];
        r2[r5] = r0;
        r0 = 3;
        r1 = z;
        r3 = 12;
        r1 = r1[r3];
        r2[r0] = r1;
        r0 = com.whatsapp.App.at;
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r3 = z;
        r4 = 15;
        r3 = r3[r4];
        r4 = new java.lang.String[r5];
        r5 = r11.l;
        r8 = r5.a;
        r5 = java.lang.Long.toString(r8);
        r4[r7] = r5;
        r5 = z;
        r7 = 13;
        r5 = r5[r7];
        r4[r10] = r5;
        r5 = 0;
        r0 = r0.query(r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x00d7;
    L_0x0052:
        r1 = r0.moveToNext();	 Catch:{ IllegalArgumentException -> 0x00ea }
        if (r1 == 0) goto L_0x00d4;
    L_0x0058:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r2 = 20;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00ea }
        r1 = r0.getColumnIndex(r1);	 Catch:{ IllegalArgumentException -> 0x00ea }
        r1 = r0.getString(r1);	 Catch:{ IllegalArgumentException -> 0x00ea }
        r11.b = r1;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00ea }
        r1 = r0.getColumnIndex(r1);	 Catch:{ IllegalArgumentException -> 0x00ea }
        r1 = r0.getString(r1);	 Catch:{ IllegalArgumentException -> 0x00ea }
        r11.n = r1;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r2 = 11;
        if (r1 >= r2) goto L_0x00d4;
    L_0x007e:
        r1 = z;
        r2 = 19;
        r1 = r1[r2];
        r1 = r0.getColumnIndex(r1);
        r1 = r0.getString(r1);
        r2 = z;
        r3 = 21;
        r2 = r2[r3];
        r2 = r0.getColumnIndex(r2);
        r2 = r0.getString(r2);
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IllegalArgumentException -> 0x00ec }
        if (r3 != 0) goto L_0x00c2;
    L_0x00a0:
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalArgumentException -> 0x00ee }
        if (r3 != 0) goto L_0x00c2;
    L_0x00a6:
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r3 = r3.append(r2);	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r3 = r3.append(r1);	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r11.k = r3;	 Catch:{ IllegalArgumentException -> 0x00f0 }
        if (r6 == 0) goto L_0x00d4;
    L_0x00c2:
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        if (r3 != 0) goto L_0x00cc;
    L_0x00c8:
        r11.k = r2;	 Catch:{ IllegalArgumentException -> 0x00f4 }
        if (r6 == 0) goto L_0x00d4;
    L_0x00cc:
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalArgumentException -> 0x00f6 }
        if (r2 != 0) goto L_0x00d4;
    L_0x00d2:
        r11.k = r1;	 Catch:{ IllegalArgumentException -> 0x00f6 }
    L_0x00d4:
        r0.close();
    L_0x00d7:
        r0 = r11.b;	 Catch:{ IllegalArgumentException -> 0x00f8 }
        if (r0 != 0) goto L_0x00e0;
    L_0x00db:
        r0 = "";
        r11.b = r0;	 Catch:{ IllegalArgumentException -> 0x00f8 }
    L_0x00e0:
        r0 = r11.n;	 Catch:{ IllegalArgumentException -> 0x00fa }
        if (r0 != 0) goto L_0x00e9;
    L_0x00e4:
        r0 = "";
        r11.n = r0;	 Catch:{ IllegalArgumentException -> 0x00fa }
    L_0x00e9:
        return;
    L_0x00ea:
        r0 = move-exception;
        throw r0;
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f2 }
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;
    L_0x00f8:
        r0 = move-exception;
        throw r0;
    L_0x00fa:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.t():void");
    }

    @TargetApi(17)
    public File y() {
        File file = new File(App.z().getFilesDir(), z[6]);
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            file.setExecutable(true, false);
            File file2 = new File(file, this.p + z[5]);
            try {
                if (file2.exists()) {
                    return file2;
                }
                OutputStream fileOutputStream;
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (IOException e) {
                    fileOutputStream = null;
                }
                Bitmap a = a(512, App.z().getResources().getDimension(2131427359), false);
                if (fileOutputStream == null || a == null) {
                    return null;
                }
                a.compress(CompressFormat.JPEG, 100, fileOutputStream);
                return file2;
            } catch (IOException e2) {
                throw e2;
            }
        } catch (IOException e22) {
            throw e22;
        }
    }

    public l5(String str, long j, String str2, int i, String str3) {
        this(new db(j, str), str2, i, str3);
    }

    public Uri b() {
        try {
            if (this.l != null) {
                if (this.l.a != -2) {
                    try {
                        if (this.l.a >= 0) {
                            return ContentUris.withAppendedId(RawContacts.CONTENT_URI, this.l.a);
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            return null;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap a(int r4, float r5, boolean r6) {
        /*
        r3 = this;
        if (r6 == 0) goto L_0x0011;
    L_0x0002:
        r0 = com.whatsapp.App.o;
        r1 = r3.b(r4, r5);
        r0 = r0.get(r1);
        r0 = (android.graphics.Bitmap) r0;
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = r3.c(r4, r5);
        if (r6 == 0) goto L_0x0010;
    L_0x0017:
        if (r0 == 0) goto L_0x0010;
    L_0x0019:
        r1 = com.whatsapp.App.o;	 Catch:{ IllegalArgumentException -> 0x0023 }
        r2 = r3.b(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0023 }
        r1.put(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0023 }
        goto L_0x0010;
    L_0x0023:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.a(int, float, boolean):android.graphics.Bitmap");
    }

    public static boolean f(String str) {
        return z[68].equals(str);
    }

    public static l5 b(Cursor cursor) {
        return new l5(cursor);
    }

    public String a() {
        if (qm.i(this.p)) {
            return this.p.substring(0, this.p.indexOf("-")) + z[46];
        }
        return null;
    }

    protected InputStream a(boolean z) {
        boolean z2 = s;
        ContentResolver contentResolver = App.z().getContentResolver();
        InputStream a = a(contentResolver, z);
        if (a == null) {
            Iterator it = App.as.b(this).iterator();
            while (it.hasNext()) {
                a = new l5(this.l.b, ((Long) it.next()).longValue(), this.q, 0, null).a(contentResolver, z);
                if (a == null || z2) {
                    if (z2) {
                        break;
                    }
                }
                break;
            }
        }
        return a;
    }

    public static boolean e(String str) {
        try {
            if (!g(str)) {
                if (!f(str)) {
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
        r6 = this;
        r0 = r6.p;
        if (r0 != 0) goto L_0x00b0;
    L_0x0004:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r2 = 38;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r0 = r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r2 = r6.t;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r2 = 45;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r2 = r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r0 = r6.p;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        if (r0 != 0) goto L_0x00a7;
    L_0x0026:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        r3 = 39;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00a5 }
    L_0x002c:
        r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00aa }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00aa }
        r2 = 42;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00aa }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00aa }
        r0 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00aa }
        if (r0 != 0) goto L_0x0049;
    L_0x003c:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00ac }
        r2 = 40;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00ac }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ac }
        r0 = s;	 Catch:{ IllegalArgumentException -> 0x00ac }
        if (r0 == 0) goto L_0x005f;
    L_0x0049:
        r0 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00ac }
        r2 = r0.a;	 Catch:{ IllegalArgumentException -> 0x00ac }
        r0 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ac }
        r2 = "-";
        r0 = r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ac }
        r2 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00ac }
        r2 = r2.b;	 Catch:{ IllegalArgumentException -> 0x00ac }
        r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ac }
    L_0x005f:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = 44;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = r6.u;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = 41;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = r6.t;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r4 = -1;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x00a3;
    L_0x0085:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r3 = 43;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00ae }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x00a3:
        r0 = 0;
    L_0x00a4:
        return r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = r6.p;
        goto L_0x002c;
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = r6.p;
        r0 = com.whatsapp.qm.i(r0);
        goto L_0x00a4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.c():boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            try {
                if (obj.getClass() == getClass()) {
                    l5 l5Var = (l5) obj;
                    try {
                        if (!TextUtils.equals(this.p, l5Var.p)) {
                            return false;
                        }
                        try {
                            if (this.l != null) {
                                return this.l.equals(l5Var.l);
                            }
                            if (l5Var.l != null) {
                                return false;
                            }
                            return true;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
        return false;
    }

    public boolean c(boolean z) {
        try {
            if (App.as.d(this.p)) {
                return App.as.e().c(z);
            }
            try {
                return this.x + 604800000 < System.currentTimeMillis();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(int r12, int r13, float r14) {
        /*
        r11 = 0;
        r2 = 0;
        r8 = s;
        r1 = com.whatsapp.App.z();
        r1 = r1.getResources();
        r7 = r1.getDrawable(r12);
        r1 = android.graphics.Bitmap.Config.ARGB_8888;
        r9 = android.graphics.Bitmap.createBitmap(r13, r13, r1);
        r1 = new android.graphics.Canvas;
        r1.<init>(r9);
        r7.setBounds(r2, r2, r13, r13);
        r2 = r7 instanceof android.graphics.drawable.BitmapDrawable;
        if (r2 == 0) goto L_0x006d;
    L_0x0022:
        r6 = new android.graphics.Paint;
        r6.<init>();
        r2 = new android.graphics.RectF;
        r3 = (float) r13;
        r4 = (float) r13;
        r2.<init>(r11, r11, r3, r4);
        r3 = 1;
        r6.setAntiAlias(r3);	 Catch:{ IllegalArgumentException -> 0x0071 }
        r3 = 1;
        r6.setDither(r3);	 Catch:{ IllegalArgumentException -> 0x0071 }
        r3 = 1;
        r6.setFilterBitmap(r3);	 Catch:{ IllegalArgumentException -> 0x0071 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r10 = 0;
        r1.drawARGB(r3, r4, r5, r10);	 Catch:{ IllegalArgumentException -> 0x0071 }
        r3 = -1;
        r6.setColor(r3);	 Catch:{ IllegalArgumentException -> 0x0071 }
        r3 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1));
        if (r3 < 0) goto L_0x004e;
    L_0x0049:
        r1.drawRoundRect(r2, r14, r14, r6);	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r8 == 0) goto L_0x0055;
    L_0x004e:
        r3 = 0;
        r4 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r5 = 1;
        r1.drawArc(r2, r3, r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0055:
        r3 = new android.graphics.PorterDuffXfermode;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r4 = android.graphics.PorterDuff.Mode.SRC_IN;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r6.setXfermode(r3);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r0 = r7;
        r0 = (android.graphics.drawable.BitmapDrawable) r0;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3 = r0;
        r3 = r3.getBitmap();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r4 = 0;
        r1.drawBitmap(r3, r4, r2, r6);	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r8 == 0) goto L_0x0070;
    L_0x006d:
        r7.draw(r1);	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0070:
        return r9;
    L_0x0071:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0073:
        r1 = move-exception;
        throw r1;
    L_0x0075:
        r1 = move-exception;
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.a(int, int, float):android.graphics.Bitmap");
    }

    public String a(Context context) {
        try {
            if (z[3].equals(this.p)) {
                return context.getString(2131230856);
            }
            try {
                if (!TextUtils.isEmpty(this.q)) {
                    return this.q;
                }
                try {
                    if (c()) {
                        return context.getString(2131231346);
                    }
                    if (!m()) {
                        return "\u202a" + s() + "\u202c";
                    }
                    return String.format(App.az.a(2131296262, qm.c(this.p).b()), new Object[]{Integer.valueOf(r0)});
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void c(int i) {
        try {
            if (this.d <= 0) {
                this.d = i;
                if (!s) {
                    return;
                }
            }
            this.d += i;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public String e() {
        if (l() == null) {
            long e = App.a1.e(this.p);
            try {
                if (1 != App.a1.e(this.p)) {
                    return cs.n(App.z(), App.b(e));
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return null;
    }

    public static void a(Collection collection, String str, String str2) {
        boolean z = s;
        int size = collection.size();
        try {
            Log.i(str + z[4] + size);
            if (App.am >= 1 && size < 5000) {
                for (l5 l5Var : collection) {
                    if (z) {
                        return;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean m() {
        return g(this.p);
    }

    public String j() {
        try {
            return this.l != null ? this.l.toString() : this.p;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void o() {
        boolean z = s;
        for (String str : App.o.snapshot().keySet()) {
            try {
                if (str.startsWith(j())) {
                    App.o.remove(str);
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.a = true;
    }

    public boolean A() {
        return this.p.substring(this.p.lastIndexOf("@") + 1, this.p.length()).equals(z[67]);
    }

    public static File d(String str) {
        File file = new File(App.z().getFilesDir(), z[71]);
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            return new File(file, str + z[72]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static boolean b(String str) {
        return str.substring(str.lastIndexOf("@") + 1, str.length()).equals(z[22]);
    }

    public l5(String str) {
        this.t = -1;
        this.l = null;
        this.u = null;
        this.e = false;
        this.g = null;
        this.a = true;
        this.p = str;
        this.m = true;
        this.l = null;
    }

    public static File a(String str) {
        File file = new File(App.a3, z[10]);
        if (!file.exists()) {
            file.mkdirs();
            try {
                new File(file, z[8]).createNewFile();
            } catch (IOException e) {
            }
        }
        int indexOf = str.indexOf("@");
        if (indexOf <= 0) {
            return new File(file, str + z[7]);
        }
        try {
            return new File(file, str.substring(0, indexOf) + z[9]);
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String h(java.lang.String r3) {
        /*
        if (r3 != 0) goto L_0x000f;
    L_0x0002:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x000d }
        r1 = 73;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x000d }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalArgumentException -> 0x000d }
        r3 = 0;
    L_0x000c:
        return r3;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = 64;
        r0 = r3.indexOf(r0);
        r1 = -1;
        if (r0 == r1) goto L_0x000c;
    L_0x0018:
        r1 = b(r3);	 Catch:{ IllegalArgumentException -> 0x0033 }
        if (r1 == 0) goto L_0x0035;
    L_0x001e:
        r0 = "-";
        r0 = r3.indexOf(r0);	 Catch:{ IllegalArgumentException -> 0x0033 }
        r0 = r0 + 1;
        r1 = "@";
        r1 = r3.lastIndexOf(r1);	 Catch:{ IllegalArgumentException -> 0x0033 }
        r3 = r3.substring(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0033 }
        goto L_0x000c;
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r1 = 0;
        r0 = r3.substring(r1, r0);
        r1 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r0);	 Catch:{ IllegalArgumentException -> 0x0064 }
        if (r1 == 0) goto L_0x0062;
    L_0x0040:
        r1 = com.whatsapp.qm.i(r3);	 Catch:{ IllegalArgumentException -> 0x0064 }
        if (r1 != 0) goto L_0x004e;
    L_0x0046:
        r0 = c(r0);
        r1 = s;
        if (r1 == 0) goto L_0x0062;
    L_0x004e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "+";
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
    L_0x0062:
        r3 = r0;
        goto L_0x000c;
    L_0x0064:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.h(java.lang.String):java.lang.String");
    }

    public boolean n() {
        try {
            if (!e(this.p)) {
                if (TextUtils.isEmpty(this.q)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    Map p() {
        try {
            if (this.i == null) {
                return Collections.emptyMap();
            }
            return this.i;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.util.ArrayList r14) {
        /*
        r13 = this;
        r4 = 0;
        r2 = 1;
        r7 = s;
        if (r14 == 0) goto L_0x000c;
    L_0x0006:
        r0 = r14.isEmpty();	 Catch:{ IllegalArgumentException -> 0x000d }
        if (r0 == 0) goto L_0x000f;
    L_0x000c:
        return r2;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = r13.q;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x001f;
    L_0x0017:
        r0 = r13.q;
        r0 = com.whatsapp.a28.a(r0);
        if (r7 == 0) goto L_0x0031;
    L_0x001f:
        r0 = r13.m();	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r0 == 0) goto L_0x002d;
    L_0x0025:
        r0 = r13.p;
        r0 = com.whatsapp.qm.b(r0);
        if (r7 == 0) goto L_0x0031;
    L_0x002d:
        r0 = r13.s();
    L_0x0031:
        if (r0 == 0) goto L_0x0086;
    L_0x0033:
        r1 = com.whatsapp.ael.q;
        r0 = r1.matcher(r0);
        r1 = " ";
        r8 = r0.replaceAll(r1);
        r9 = r14.iterator();
        r1 = r2;
    L_0x0045:
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x00dc;
    L_0x004b:
        r0 = r9.next();
        r0 = (java.lang.String) r0;
        r10 = com.whatsapp.util.l.a();
        r10.setText(r8);
        r5 = r10.first();
        r3 = r10.next();
        r6 = r5;
        r5 = r3;
        r3 = r4;
    L_0x0063:
        r11 = -1;
        if (r5 == r11) goto L_0x007d;
    L_0x0066:
        r6 = r8.substring(r6, r5);
        r6 = com.whatsapp.ael.o(r6);
        r6 = r6.startsWith(r0);
        if (r6 == 0) goto L_0x0077;
    L_0x0074:
        if (r7 == 0) goto L_0x00da;
    L_0x0076:
        r3 = r2;
    L_0x0077:
        r6 = r10.next();
        if (r7 == 0) goto L_0x00d6;
    L_0x007d:
        if (r3 != 0) goto L_0x00d4;
    L_0x007f:
        if (r7 == 0) goto L_0x00d2;
    L_0x0081:
        r0 = r4;
    L_0x0082:
        if (r7 == 0) goto L_0x00cf;
    L_0x0084:
        if (r0 != 0) goto L_0x000c;
    L_0x0086:
        r0 = r13.m();	 Catch:{ IllegalArgumentException -> 0x00c5 }
        if (r0 != 0) goto L_0x00c0;
    L_0x008c:
        r0 = r13.c();	 Catch:{ IllegalArgumentException -> 0x00c5 }
        if (r0 != 0) goto L_0x00c0;
    L_0x0092:
        r0 = r13.p;
        r1 = 64;
        r0 = r0.indexOf(r1);
        if (r0 <= 0) goto L_0x00c0;
    L_0x009c:
        r1 = r13.p;
        r3 = r1.substring(r4, r0);
        r5 = r14.iterator();
        r1 = r2;
    L_0x00a7:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x00cd;
    L_0x00ad:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r0 = r3.contains(r0);
        if (r0 != 0) goto L_0x00cb;
    L_0x00b9:
        if (r7 == 0) goto L_0x00c9;
    L_0x00bb:
        r0 = r4;
    L_0x00bc:
        if (r7 == 0) goto L_0x00c7;
    L_0x00be:
        if (r0 != 0) goto L_0x000c;
    L_0x00c0:
        r2 = r4;
        goto L_0x000c;
    L_0x00c3:
        r0 = move-exception;
        throw r0;
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r1 = r0;
        goto L_0x00a7;
    L_0x00c9:
        r0 = r4;
        goto L_0x00be;
    L_0x00cb:
        r0 = r1;
        goto L_0x00bc;
    L_0x00cd:
        r0 = r1;
        goto L_0x00be;
    L_0x00cf:
        r1 = r0;
        goto L_0x0045;
    L_0x00d2:
        r0 = r4;
        goto L_0x0084;
    L_0x00d4:
        r0 = r1;
        goto L_0x0082;
    L_0x00d6:
        r12 = r6;
        r6 = r5;
        r5 = r12;
        goto L_0x0063;
    L_0x00da:
        r3 = r2;
        goto L_0x007d;
    L_0x00dc:
        r0 = r1;
        goto L_0x0084;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.a(java.util.ArrayList):boolean");
    }

    public File x() {
        try {
            return App.as.d(this.p) ? App.as.e().x() : a(this.p);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static boolean g(String str) {
        if (str != null) {
            try {
                if (str.endsWith(z[70])) {
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
    public void u() {
        /*
        r5 = this;
        r0 = s;
        r1 = r5.x();
        r2 = r1.exists();	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r2 == 0) goto L_0x0011;
    L_0x000c:
        r1.delete();	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r0 == 0) goto L_0x0039;
    L_0x0011:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = 34;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = r1.getAbsolutePath();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = r2.append(r1);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r3 = 35;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0073 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0039:
        r1 = r5.r();
        r2 = r1.exists();	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r2 == 0) goto L_0x0048;
    L_0x0043:
        r1.delete();	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r0 == 0) goto L_0x0070;
    L_0x0048:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r3 = 33;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = r1.getAbsolutePath();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = 36;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0077 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0070:
        return;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.u():void");
    }

    public String k() {
        String a = a(App.z());
        if (a == null) {
            return null;
        }
        if (App.a1()) {
            return a;
        }
        return "\u200f" + a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String l() {
        /*
        r5 = this;
        r0 = 0;
        r4 = 1;
        r1 = r5.m();	 Catch:{ IllegalArgumentException -> 0x0009 }
        if (r1 == 0) goto L_0x000b;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r1 = r5.c();
        if (r1 == 0) goto L_0x005f;
    L_0x0011:
        r1 = com.whatsapp.App.a1;
        r2 = r5.p;
        r1 = r1.b(r2);
        if (r1 == 0) goto L_0x005b;
    L_0x001b:
        r2 = com.whatsapp.App.as;
        r3 = r1.b;
        r2 = r2.b(r3);
        r3 = r1.a;	 Catch:{ IllegalArgumentException -> 0x003d }
        if (r3 != 0) goto L_0x003f;
    L_0x0027:
        r0 = com.whatsapp.App.z();	 Catch:{ IllegalArgumentException -> 0x003d }
        r1 = 2131230990; // 0x7f08010e float:1.8078048E38 double:1.0529680155E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalArgumentException -> 0x003d }
        r4 = 0;
        r2 = r2.i();	 Catch:{ IllegalArgumentException -> 0x003d }
        r3[r4] = r2;	 Catch:{ IllegalArgumentException -> 0x003d }
        r0 = r0.getString(r1, r3);	 Catch:{ IllegalArgumentException -> 0x003d }
        goto L_0x0008;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r1 = r1.a;	 Catch:{ IllegalArgumentException -> 0x0059 }
        if (r1 != r4) goto L_0x005b;
    L_0x0043:
        r0 = com.whatsapp.App.z();	 Catch:{ IllegalArgumentException -> 0x0059 }
        r1 = 2131230991; // 0x7f08010f float:1.807805E38 double:1.052968016E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalArgumentException -> 0x0059 }
        r4 = 0;
        r2 = r2.i();	 Catch:{ IllegalArgumentException -> 0x0059 }
        r3[r4] = r2;	 Catch:{ IllegalArgumentException -> 0x0059 }
        r0 = r0.getString(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0059 }
        goto L_0x0008;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r1 = s;
        if (r1 == 0) goto L_0x0008;
    L_0x005f:
        r1 = com.whatsapp.App.a1;
        r2 = r5.p;
        r1 = r1.a(r2, r0);
        if (r1 != 0) goto L_0x0077;
    L_0x0069:
        r0 = com.whatsapp.App.z();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r1 = 2131230986; // 0x7f08010a float:1.807804E38 double:1.0529680135E-314;
        r0 = r0.getString(r1);	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0008;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        if (r1 != r4) goto L_0x0008;
    L_0x0079:
        r0 = com.whatsapp.App.z();	 Catch:{ IllegalArgumentException -> 0x0085 }
        r1 = 2131230987; // 0x7f08010b float:1.8078042E38 double:1.052968014E-314;
        r0 = r0.getString(r1);	 Catch:{ IllegalArgumentException -> 0x0085 }
        goto L_0x0008;
    L_0x0085:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.l():java.lang.String");
    }

    public String d() {
        String l = l();
        if (l != null) {
            return l;
        }
        long e = App.a1.e(this.p);
        if (e == 0) {
            try {
                return "";
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else if (e != 1) {
            return a(App.z(), 2131230988, new Object[0]) + " " + cs.n(App.z(), App.b(e));
        } else {
            try {
                return App.z().getString(2131230985);
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap c(int r14, float r15) {
        /*
        r13 = this;
        r12 = 0;
        r6 = 0;
        r0 = 1;
        r1 = 0;
        r10 = s;
        r2 = 0;
        r3 = (float) r14;
        r4 = com.whatsapp.a4d.a();	 Catch:{ IOException -> 0x00b0 }
        r4 = r4.g;	 Catch:{ IOException -> 0x00b0 }
        r5 = 1119879168; // 0x42c00000 float:96.0 double:5.532938244E-315;
        r4 = r4 * r5;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 < 0) goto L_0x00df;
    L_0x0015:
        r1 = r13.a;	 Catch:{ SQLiteException -> 0x00b2, OutOfMemoryError -> 0x02af, all -> 0x02e3 }
        if (r1 == 0) goto L_0x0310;
    L_0x0019:
        r1 = r13.b(r0);	 Catch:{ SQLiteException -> 0x00b2, OutOfMemoryError -> 0x02af, all -> 0x02e3 }
    L_0x001d:
        r3 = r13.p;	 Catch:{ IOException -> 0x00e2 }
        if (r3 == 0) goto L_0x0067;
    L_0x0021:
        r3 = r13.c();	 Catch:{ IOException -> 0x00e2 }
        if (r3 == 0) goto L_0x002d;
    L_0x0027:
        r3 = r13.A();	 Catch:{ IOException -> 0x00e4 }
        if (r3 == 0) goto L_0x003d;
    L_0x002d:
        r3 = r13.c();	 Catch:{ IOException -> 0x00e6 }
        if (r3 != 0) goto L_0x0067;
    L_0x0033:
        r3 = r13.m();	 Catch:{ IOException -> 0x00e8 }
        if (r3 != 0) goto L_0x0067;
    L_0x0039:
        r3 = r13.m;	 Catch:{ IOException -> 0x00ea }
        if (r3 == 0) goto L_0x0067;
    L_0x003d:
        if (r0 == 0) goto L_0x0054;
    L_0x003f:
        r3 = r13.c;	 Catch:{ IOException -> 0x00ee }
        if (r3 == 0) goto L_0x004a;
    L_0x0043:
        r3 = 1;
        r3 = r13.c(r3);	 Catch:{ IOException -> 0x00f0 }
        if (r3 == 0) goto L_0x0067;
    L_0x004a:
        r3 = r13.p;	 Catch:{ IOException -> 0x00f2 }
        r4 = r13.c;	 Catch:{ IOException -> 0x00f2 }
        r5 = 1;
        com.whatsapp.App.a(r3, r4, r5);	 Catch:{ IOException -> 0x00f2 }
        if (r10 == 0) goto L_0x0067;
    L_0x0054:
        r3 = r13.o;	 Catch:{ IOException -> 0x00f4 }
        if (r3 == 0) goto L_0x005f;
    L_0x0058:
        r3 = 0;
        r3 = r13.c(r3);	 Catch:{ IOException -> 0x00f6 }
        if (r3 == 0) goto L_0x0067;
    L_0x005f:
        r3 = r13.p;	 Catch:{ IOException -> 0x00f8 }
        r4 = r13.o;	 Catch:{ IOException -> 0x00f8 }
        r5 = 2;
        com.whatsapp.App.a(r3, r4, r5);	 Catch:{ IOException -> 0x00f8 }
    L_0x0067:
        if (r1 == 0) goto L_0x0292;
    L_0x0069:
        r3 = new android.graphics.BitmapFactory$Options;	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r3.<init>();	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r4 = 1;
        r3.inJustDecodeBounds = r4;	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r4 = 0;
        android.graphics.BitmapFactory.decodeStream(r1, r4, r3);	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r1.close();	 Catch:{ IOException -> 0x00fd }
        r8 = r13.b(r0);	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        if (r8 != 0) goto L_0x0141;
    L_0x007e:
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0.<init>();	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r1 = z;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r3 = 64;
        r1 = r1[r3];	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r1 = r13.p;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r1 = z;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r3 = 61;
        r1 = r1[r3];	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = r0.toString();	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        if (r8 == 0) goto L_0x00a9;
    L_0x00a6:
        r8.close();	 Catch:{ IOException -> 0x013a }
    L_0x00a9:
        if (r6 == 0) goto L_0x00ae;
    L_0x00ab:
        r2.recycle();	 Catch:{ IOException -> 0x013f }
    L_0x00ae:
        r0 = r6;
    L_0x00af:
        return r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x00b2, OutOfMemoryError -> 0x02af, all -> 0x02e3 }
    L_0x00b2:
        r0 = move-exception;
        r1 = r6;
        r2 = r6;
    L_0x00b5:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02fe }
        r3.<init>();	 Catch:{ all -> 0x02fe }
        r4 = z;	 Catch:{ all -> 0x02fe }
        r5 = 66;
        r4 = r4[r5];	 Catch:{ all -> 0x02fe }
        r3 = r3.append(r4);	 Catch:{ all -> 0x02fe }
        r0 = r0.toString();	 Catch:{ all -> 0x02fe }
        r0 = r3.append(r0);	 Catch:{ all -> 0x02fe }
        r0 = r0.toString();	 Catch:{ all -> 0x02fe }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x02fe }
        if (r1 == 0) goto L_0x00d8;
    L_0x00d5:
        r1.close();	 Catch:{ IOException -> 0x02a8 }
    L_0x00d8:
        if (r2 == 0) goto L_0x00dd;
    L_0x00da:
        r2.recycle();	 Catch:{ IOException -> 0x02ad }
    L_0x00dd:
        r0 = r6;
        goto L_0x00af;
    L_0x00df:
        r0 = r1;
        goto L_0x0015;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ea }
    L_0x00ea:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ec }
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00f2 }
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
    L_0x00fa:
        r0 = move-exception;
        r2 = r6;
        goto L_0x00b5;
    L_0x00fd:
        r0 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r3.<init>();	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r4 = z;	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r5 = 63;
        r4 = r4[r5];	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r3 = r3.append(r4);	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r4 = r13.p;	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r3 = r3.append(r4);	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r4 = z;	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r5 = 60;
        r4 = r4[r5];	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r3 = r3.append(r4);	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        r3 = r3.toString();	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        com.whatsapp.util.Log.e(r3);	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        com.whatsapp.util.Log.a(r0);	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        if (r1 == 0) goto L_0x012c;
    L_0x0129:
        r1.close();	 Catch:{ IOException -> 0x0134 }
    L_0x012c:
        if (r6 == 0) goto L_0x0131;
    L_0x012e:
        r2.recycle();	 Catch:{ IOException -> 0x0138 }
    L_0x0131:
        r0 = r6;
        goto L_0x00af;
    L_0x0134:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0136 }
    L_0x0136:
        r0 = move-exception;
        goto L_0x0131;
    L_0x0138:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0136 }
    L_0x013a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x013c }
    L_0x013c:
        r0 = move-exception;
        goto L_0x00ae;
    L_0x013f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x013c }
    L_0x0141:
        r0 = r3.outWidth;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = r0 / r14;
        r1 = r3.outHeight;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r1 = r1 / r14;
        r0 = java.lang.Math.max(r0, r1);	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r3.inSampleSize = r0;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = 1;
        r3.inDither = r0;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = 0;
        r3.inJustDecodeBounds = r0;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = 0;
        r3.inScaled = r0;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r3.inPreferredConfig = r0;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = 1;
        r3.inInputShareable = r0;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = 1;
        r3.inPurgeable = r0;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r0 = com.whatsapp.qi.a(r8);	 Catch:{ IOException -> 0x019f }
        r1 = 0;
        r4 = r0.length;	 Catch:{ IOException -> 0x019f }
        r9 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r4, r3);	 Catch:{ IOException -> 0x019f }
        if (r9 != 0) goto L_0x01e2;
    L_0x016c:
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r0.<init>();	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r1 = z;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r2 = 57;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r1 = r13.p;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r1 = z;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r0 = r0.toString();	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        if (r8 == 0) goto L_0x0197;
    L_0x0194:
        r8.close();	 Catch:{ IOException -> 0x01dc }
    L_0x0197:
        if (r9 == 0) goto L_0x019c;
    L_0x0199:
        r9.recycle();	 Catch:{ IOException -> 0x01e0 }
    L_0x019c:
        r0 = r6;
        goto L_0x00af;
    L_0x019f:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r1.<init>();	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r3 = z;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r4 = 59;
        r3 = r3[r4];	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r1 = r1.append(r3);	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r3 = r13.p;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r1 = r1.append(r3);	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r3 = z;	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r4 = 65;
        r3 = r3[r4];	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r1 = r1.append(r3);	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        r1 = r1.toString();	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        com.whatsapp.util.Log.a(r0);	 Catch:{ SQLiteException -> 0x030b, OutOfMemoryError -> 0x0306, all -> 0x02f9 }
        if (r8 == 0) goto L_0x01ce;
    L_0x01cb:
        r8.close();	 Catch:{ IOException -> 0x01d6 }
    L_0x01ce:
        if (r6 == 0) goto L_0x01d3;
    L_0x01d0:
        r2.recycle();	 Catch:{ IOException -> 0x01da }
    L_0x01d3:
        r0 = r6;
        goto L_0x00af;
    L_0x01d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01d8 }
    L_0x01d8:
        r0 = move-exception;
        goto L_0x01d3;
    L_0x01da:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01d8 }
    L_0x01dc:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01de }
    L_0x01de:
        r0 = move-exception;
        goto L_0x019c;
    L_0x01e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01de }
    L_0x01e2:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r7 = android.graphics.Bitmap.createBitmap(r14, r14, r0);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r0 = new android.graphics.Canvas;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r0.<init>(r7);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r5 = new android.graphics.Paint;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r5.<init>();	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r1 = new android.graphics.RectF;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r2 = 0;
        r3 = 0;
        r4 = (float) r14;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r11 = (float) r14;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r1.<init>(r2, r3, r4, r11);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r2 = 1;
        r5.setAntiAlias(r2);	 Catch:{ IOException -> 0x027f }
        r2 = 1;
        r5.setDither(r2);	 Catch:{ IOException -> 0x027f }
        r2 = 1;
        r5.setFilterBitmap(r2);	 Catch:{ IOException -> 0x027f }
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r11 = 0;
        r0.drawARGB(r2, r3, r4, r11);	 Catch:{ IOException -> 0x027f }
        r2 = -1;
        r5.setColor(r2);	 Catch:{ IOException -> 0x027f }
        r2 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1));
        if (r2 != 0) goto L_0x021b;
    L_0x0216:
        r0.drawRect(r1, r5);	 Catch:{ IOException -> 0x027f }
        if (r10 == 0) goto L_0x022b;
    L_0x021b:
        r2 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1));
        if (r2 <= 0) goto L_0x0224;
    L_0x021f:
        r0.drawRoundRect(r1, r15, r15, r5);	 Catch:{ IOException -> 0x0283 }
        if (r10 == 0) goto L_0x022b;
    L_0x0224:
        r2 = 0;
        r3 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r4 = 1;
        r0.drawArc(r1, r2, r3, r4, r5);	 Catch:{ IOException -> 0x0285 }
    L_0x022b:
        r1 = new android.graphics.PorterDuffXfermode;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r2 = android.graphics.PorterDuff.Mode.SRC_IN;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r1.<init>(r2);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r5.setXfermode(r1);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r2 = new android.graphics.RectF;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r1 = 0;
        r3 = 0;
        r4 = (float) r14;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r11 = (float) r14;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r2.<init>(r1, r3, r4, r11);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r1 = r9.getWidth();	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r3 = r9.getHeight();	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r1 = r1 - r3;
        r3 = r1 / 2;
        if (r3 <= 0) goto L_0x025c;
    L_0x024b:
        r1 = new android.graphics.Rect;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r4 = 0;
        r11 = r9.getWidth();	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r11 = r11 - r3;
        r12 = r9.getHeight();	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r1.<init>(r3, r4, r11, r12);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        if (r10 == 0) goto L_0x026c;
    L_0x025c:
        r1 = new android.graphics.Rect;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r4 = 0;
        r10 = -r3;
        r11 = r9.getWidth();	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r12 = r9.getHeight();	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r3 = r3 + r12;
        r1.<init>(r4, r10, r11, r3);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
    L_0x026c:
        r0.drawBitmap(r9, r1, r2, r5);	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        r9.recycle();	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
        if (r8 == 0) goto L_0x0277;
    L_0x0274:
        r8.close();	 Catch:{ IOException -> 0x028c }
    L_0x0277:
        if (r9 == 0) goto L_0x027c;
    L_0x0279:
        r9.recycle();	 Catch:{ IOException -> 0x0290 }
    L_0x027c:
        r0 = r7;
        goto L_0x00af;
    L_0x027f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0281 }
    L_0x0281:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0283 }
    L_0x0283:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0285 }
    L_0x0285:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0287, OutOfMemoryError -> 0x0309 }
    L_0x0287:
        r0 = move-exception;
        r1 = r8;
        r2 = r9;
        goto L_0x00b5;
    L_0x028c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x028e }
    L_0x028e:
        r0 = move-exception;
        goto L_0x027c;
    L_0x0290:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x028e }
    L_0x0292:
        r0 = 0;
        r13.a = r0;	 Catch:{ SQLiteException -> 0x00fa, OutOfMemoryError -> 0x0302, all -> 0x02f6 }
        if (r1 == 0) goto L_0x029a;
    L_0x0297:
        r1.close();	 Catch:{ IOException -> 0x02a2 }
    L_0x029a:
        if (r6 == 0) goto L_0x029f;
    L_0x029c:
        r2.recycle();	 Catch:{ IOException -> 0x02a6 }
    L_0x029f:
        r0 = r6;
        goto L_0x00af;
    L_0x02a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02a4 }
    L_0x02a4:
        r0 = move-exception;
        goto L_0x029f;
    L_0x02a6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02a4 }
    L_0x02a8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02aa }
    L_0x02aa:
        r0 = move-exception;
        goto L_0x00dd;
    L_0x02ad:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02aa }
    L_0x02af:
        r0 = move-exception;
        r8 = r6;
        r9 = r6;
    L_0x02b2:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02fb }
        r1.<init>();	 Catch:{ all -> 0x02fb }
        r2 = z;	 Catch:{ all -> 0x02fb }
        r3 = 62;
        r2 = r2[r3];	 Catch:{ all -> 0x02fb }
        r1 = r1.append(r2);	 Catch:{ all -> 0x02fb }
        r0 = r0.toString();	 Catch:{ all -> 0x02fb }
        r0 = r1.append(r0);	 Catch:{ all -> 0x02fb }
        r0 = r0.toString();	 Catch:{ all -> 0x02fb }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x02fb }
        if (r8 == 0) goto L_0x02d5;
    L_0x02d2:
        r8.close();	 Catch:{ IOException -> 0x02dd }
    L_0x02d5:
        if (r9 == 0) goto L_0x02da;
    L_0x02d7:
        r9.recycle();	 Catch:{ IOException -> 0x02e1 }
    L_0x02da:
        r0 = r6;
        goto L_0x00af;
    L_0x02dd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02df }
    L_0x02df:
        r0 = move-exception;
        goto L_0x02da;
    L_0x02e1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02df }
    L_0x02e3:
        r0 = move-exception;
        r8 = r6;
    L_0x02e5:
        if (r8 == 0) goto L_0x02ea;
    L_0x02e7:
        r8.close();	 Catch:{ IOException -> 0x02f0 }
    L_0x02ea:
        if (r6 == 0) goto L_0x02ef;
    L_0x02ec:
        r6.recycle();	 Catch:{ IOException -> 0x02f4 }
    L_0x02ef:
        throw r0;
    L_0x02f0:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x02f2 }
    L_0x02f2:
        r1 = move-exception;
        goto L_0x02ef;
    L_0x02f4:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x02f2 }
    L_0x02f6:
        r0 = move-exception;
        r8 = r1;
        goto L_0x02e5;
    L_0x02f9:
        r0 = move-exception;
        goto L_0x02e5;
    L_0x02fb:
        r0 = move-exception;
        r6 = r9;
        goto L_0x02e5;
    L_0x02fe:
        r0 = move-exception;
        r8 = r1;
        r6 = r2;
        goto L_0x02e5;
    L_0x0302:
        r0 = move-exception;
        r8 = r1;
        r9 = r6;
        goto L_0x02b2;
    L_0x0306:
        r0 = move-exception;
        r9 = r6;
        goto L_0x02b2;
    L_0x0309:
        r0 = move-exception;
        goto L_0x02b2;
    L_0x030b:
        r0 = move-exception;
        r1 = r8;
        r2 = r6;
        goto L_0x00b5;
    L_0x0310:
        r1 = r6;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.c(int, float):android.graphics.Bitmap");
    }

    public l5(db dbVar, String str, int i, String str2) {
        this.t = -1;
        this.l = null;
        this.u = null;
        this.e = false;
        this.g = null;
        this.a = true;
        this.l = dbVar;
        this.q = str;
        this.u = Integer.valueOf(i);
        this.j = str2;
    }

    public Bitmap g() {
        Bitmap a = a(96, 0.0f);
        return a == null ? a(App.z().getResources().getDimensionPixelSize(2131427544), (float) App.z().getResources().getDimensionPixelSize(2131427359)) : a;
    }

    public long f() {
        try {
            if (this.l == null) {
                return 0;
            }
            return this.l.a;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int hashCode() {
        try {
            return this.l != null ? this.l.hashCode() : this.p.hashCode();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream a(android.content.ContentResolver r7, boolean r8) {
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.c(r7);
        if (r1 == 0) goto L_0x0049;
    L_0x0007:
        if (r8 == 0) goto L_0x0050;
    L_0x0009:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ SecurityException -> 0x004a }
        r2 = 14;
        if (r0 < r2) goto L_0x0050;
    L_0x000f:
        r0 = android.provider.ContactsContract.Contacts.class;
        r2 = z;	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r3 = 69;
        r2 = r2[r3];	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r3 = 3;
        r3 = new java.lang.Class[r3];	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r4 = 0;
        r5 = android.content.ContentResolver.class;
        r3[r4] = r5;	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r4 = 1;
        r5 = android.net.Uri.class;
        r3[r4] = r5;	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r4 = 2;
        r5 = java.lang.Boolean.TYPE;	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r3[r4] = r5;	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r0 = r0.getDeclaredMethod(r2, r3);	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r2 = 1;
        r0.setAccessible(r2);	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r2 = 0;
        r3 = 3;
        r3 = new java.lang.Object[r3];	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r4 = 0;
        r3[r4] = r7;	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r4 = 1;
        r3[r4] = r1;	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r4 = 2;
        r5 = 1;
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r3[r4] = r5;	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r0 = r0.invoke(r2, r3);	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
        r0 = (java.io.InputStream) r0;	 Catch:{ SecurityException -> 0x005b, NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x0059, IllegalArgumentException -> 0x0055 }
    L_0x0049:
        return r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = move-exception;
    L_0x004d:
        com.whatsapp.util.Log.a(r0);
    L_0x0050:
        r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r7, r1);
        goto L_0x0049;
    L_0x0055:
        r0 = move-exception;
        goto L_0x004d;
    L_0x0057:
        r0 = move-exception;
        goto L_0x004d;
    L_0x0059:
        r0 = move-exception;
        goto L_0x004d;
    L_0x005b:
        r0 = move-exception;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.a(android.content.ContentResolver, boolean):java.io.InputStream");
    }

    public boolean h() {
        try {
            return a(App.z().getResources().getDimensionPixelSize(2131427544), App.z().getResources().getDimension(2131427359)) != null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap a(int r3) {
        /*
        r2 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x0012;
    L_0x0006:
        r0 = r2.z();
        r0 = b(r0);
        r1 = s;
        if (r1 == 0) goto L_0x0022;
    L_0x0012:
        r0 = com.whatsapp.App.z();
        r0 = r0.getResources();
        r1 = r2.z();
        r0 = android.graphics.BitmapFactory.decodeResource(r0, r1);
    L_0x0022:
        if (r3 != 0) goto L_0x0025;
    L_0x0024:
        return r0;
    L_0x0025:
        r1 = 1;
        r0 = android.graphics.Bitmap.createScaledBitmap(r0, r3, r3, r1);
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.a(int):android.graphics.Bitmap");
    }

    public static boolean a(List list, dk dkVar) {
        boolean z = s;
        if (list == null) {
            return false;
        }
        boolean z2 = false;
        for (l5 a : list) {
            try {
                boolean z3;
                if (dkVar.a(a) || z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z) {
                    return z3;
                }
                z2 = z3;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return z2;
    }

    public String a(Context context, int i, Object[] objArr) {
        return a6.a(context, this.p, i, objArr);
    }

    public Bitmap a(int i, float f) {
        return (Bitmap) App.o.get(b(i, f));
    }

    public int z() {
        try {
            if (e(this.p)) {
                return 2130837609;
            }
            try {
                if (qm.i(this.p)) {
                    return 2130837614;
                }
                return 2130837611;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void a(@NonNull aqo com_whatsapp_aqo) {
        a(com_whatsapp_aqo.getClass(), com_whatsapp_aqo);
    }

    public CharSequence a(Resources resources) {
        try {
            if (this.u == null) {
                return null;
            }
            if (this.u.intValue() == 0) {
                try {
                    if (this.j != null) {
                        return this.j;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return resources.getString(Phone.getTypeLabelResource(this.u.intValue()));
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    @Nullable
    public Uri a(ContentResolver contentResolver) {
        try {
            if (App.p.o(z[75]) == 0 && b() != null) {
                return RawContacts.getContactLookupUri(contentResolver, b());
            }
            return null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Bitmap a(int i, int i2) {
        int min = Math.min(i, i2);
        try {
            int i3;
            if (VERSION.SDK_INT >= 21) {
                i3 = -1;
            } else {
                i3 = 0;
            }
            Bitmap a = a(min, (float) i3);
            if (a == null) {
                try {
                    if (this.a && min > 0) {
                        return a(min, (float) i3, true);
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return a;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public Uri c(ContentResolver contentResolver) {
        Uri uri = null;
        Uri a = a(contentResolver);
        if (a != null) {
            try {
                uri = Contacts.lookupContact(contentResolver, a);
            } catch (Throwable e) {
                Log.a(e);
            } catch (Throwable e2) {
                Log.a(e2);
            } catch (SecurityException e3) {
                throw e3;
            }
        }
        return uri;
    }

    private l5(String str, boolean z, String str2, long j, String str3, int i, String str4) {
        this.t = -1;
        this.l = null;
        this.u = null;
        this.e = false;
        this.g = null;
        this.a = true;
        this.p = str;
        this.m = z;
        this.q = str3;
        if ((j > 0 || j == -2) && str2 != null) {
            try {
                if (d.a(str2)) {
                    this.l = new db(j, str2);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.u = Integer.valueOf(i);
        this.j = str4;
    }

    public String i() {
        try {
            if (this.l != null) {
                if (this.b != null) {
                    try {
                        if (this.b.length() != 0) {
                            return this.b;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            return a(App.z());
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.whatsapp.contact.d r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = s;
        r0 = 0;
        r3 = new com.whatsapp.db;
        r4 = r8.b();
        r6 = r8.a();
        r3.<init>(r4, r6);
        r4 = r7.l;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r4 == 0) goto L_0x001d;
    L_0x0015:
        r4 = r7.l;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r4 = r4.equals(r3);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r4 != 0) goto L_0x0020;
    L_0x001d:
        r7.l = r3;
        r0 = r1;
    L_0x0020:
        r3 = r8.g();	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        if (r3 != 0) goto L_0x0040;
    L_0x002a:
        r3 = r7.q;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r4 = r8.g();	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r3 = android.text.TextUtils.equals(r3, r4);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        if (r3 != 0) goto L_0x0040;
    L_0x0036:
        r0 = r8.g();
        r7.q = r0;
        r7.t();
        r0 = r1;
    L_0x0040:
        r3 = r7.u;
        r3 = r3.intValue();
        r4 = r8.f();
        if (r3 == r4) goto L_0x006c;
    L_0x004c:
        r0 = r8.f();	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r7.u = r0;	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r0 = r7.u;	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r0 = r0.intValue();	 Catch:{ IllegalArgumentException -> 0x00a8 }
        if (r0 == 0) goto L_0x0063;
    L_0x005e:
        r0 = 0;
        r7.j = r0;	 Catch:{ IllegalArgumentException -> 0x00aa }
        if (r2 == 0) goto L_0x0086;
    L_0x0063:
        r0 = r8.d();	 Catch:{ IllegalArgumentException -> 0x00ac }
        r7.j = r0;	 Catch:{ IllegalArgumentException -> 0x00ac }
        if (r2 == 0) goto L_0x0086;
    L_0x006b:
        r0 = r1;
    L_0x006c:
        r2 = r7.u;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x00ae }
        if (r2 != 0) goto L_0x0087;
    L_0x0074:
        r2 = r7.j;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r3 = r8.d();	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00ae }
        if (r2 != 0) goto L_0x0087;
    L_0x0080:
        r0 = r8.d();
        r7.j = r0;
    L_0x0086:
        r0 = r1;
    L_0x0087:
        r2 = r8.e();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        if (r2 != 0) goto L_0x00b2;
    L_0x0091:
        r2 = r7.k;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r3 = r8.e();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        if (r2 != 0) goto L_0x00b2;
    L_0x009d:
        r0 = r8.e();
        r7.k = r0;
    L_0x00a3:
        return r1;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00aa }
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r1 = r0;
        goto L_0x00a3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.a(com.whatsapp.contact.d):boolean");
    }

    @Nullable
    public Uri b(@NonNull ContentResolver contentResolver) {
        Uri uri = null;
        Uri a = a(contentResolver);
        if (a != null) {
            Cursor query = contentResolver.query(a, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        uri = Uri.withAppendedPath(Contacts.CONTENT_VCARD_URI, query.getString(query.getColumnIndex(z[74])));
                    } else {
                        query.close();
                    }
                } finally {
                    query.close();
                }
            }
        }
        return uri;
    }

    public void c(int i, int i2) {
        try {
            if (App.as.d(this.p)) {
                App.as.e().c(i, i2);
                if (!s) {
                    return;
                }
            }
            this.c = i;
            this.o = i2;
            this.x = System.currentTimeMillis();
            App.as.j(this);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private l5(android.database.Cursor r9) {
        /*
        r8 = this;
        r4 = 0;
        r1 = 0;
        r0 = 1;
        r8.<init>();
        r2 = -1;
        r8.t = r2;
        r8.l = r4;
        r8.u = r4;
        r8.e = r1;
        r8.g = r4;
        r8.a = r0;
        r2 = r9.getString(r0);
        r8.p = r2;
        r2 = 3;
        r2 = r9.getString(r2);
        r8.w = r2;
        r2 = 17;
        r2 = r9.getLong(r2);
        r8.r = r2;
        r2 = r9.getLong(r1);
        r8.t = r2;
        r2 = 6;
        r2 = r9.getString(r2);
        r8.q = r2;
        r2 = 7;
        r2 = r9.getInt(r2);
        r2 = java.lang.Integer.valueOf(r2);
        r8.u = r2;
        r2 = 8;
        r2 = r9.getString(r2);
        r8.j = r2;
        r2 = 4;
        r2 = r9.getString(r2);
        r3 = 5;
        r4 = r9.getLong(r3);
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 > 0) goto L_0x005f;
    L_0x0059:
        r6 = -2;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0072;
    L_0x005f:
        if (r2 == 0) goto L_0x0072;
    L_0x0061:
        r3 = com.whatsapp.contact.d.a(r2);	 Catch:{ IllegalArgumentException -> 0x00c0 }
        if (r3 == 0) goto L_0x0072;
    L_0x0067:
        r3 = new com.whatsapp.db;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r3.<init>(r4, r2);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r8.l = r3;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r3 = s;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r3 == 0) goto L_0x0076;
    L_0x0072:
        if (r2 == 0) goto L_0x0076;
    L_0x0074:
        r8.g = r2;	 Catch:{ IllegalArgumentException -> 0x00c4 }
    L_0x0076:
        r2 = 2;
        r2 = r9.getInt(r2);	 Catch:{ IllegalArgumentException -> 0x00c6 }
        if (r2 != r0) goto L_0x00c8;
    L_0x007d:
        r8.m = r0;
        r0 = 9;
        r0 = r9.getInt(r0);
        r8.d = r0;
        r0 = 10;
        r0 = r9.getInt(r0);
        r8.c = r0;
        r0 = 11;
        r0 = r9.getInt(r0);
        r8.o = r0;
        r0 = 12;
        r0 = r9.getLong(r0);
        r8.x = r0;
        r0 = 13;
        r0 = r9.getString(r0);
        r8.b = r0;
        r0 = 14;
        r0 = r9.getString(r0);
        r8.n = r0;
        r0 = 15;
        r0 = r9.getString(r0);
        r8.f = r0;
        r0 = 16;
        r0 = r9.getString(r0);
        r8.k = r0;
        return;
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = r1;
        goto L_0x007d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.<init>(android.database.Cursor):void");
    }

    public File r() {
        try {
            return App.as.d(this.p) ? App.as.e().r() : d(this.p);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public String v() {
        Cursor query;
        try {
            Uri c = c(App.at);
            if (c != null) {
                query = App.at.query(c, null, null, null, null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex(z[11]));
                        query.close();
                        return string;
                    }
                    query.close();
                }
            }
        } catch (Throwable e) {
            Log.a(e);
        } catch (Throwable th) {
            query.close();
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.aqo a(java.lang.Class r6) {
        /*
        r5 = this;
        r0 = r5.i;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r5.i;
        r0 = r0.get(r6);
        r0 = (com.whatsapp.aqo) r0;
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        return r0;
    L_0x000f:
        r0 = z;	 Catch:{ NoSuchMethodException -> 0x0027, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x006d }
        r1 = 47;
        r0 = r0[r1];	 Catch:{ NoSuchMethodException -> 0x0027, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x006d }
        r1 = 0;
        r1 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0027, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x006d }
        r0 = r6.getMethod(r0, r1);	 Catch:{ NoSuchMethodException -> 0x0027, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x006d }
        r1 = 0;
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ NoSuchMethodException -> 0x0027, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x006d }
        r0 = r0.invoke(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0027, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x006d }
        r0 = (com.whatsapp.aqo) r0;	 Catch:{ NoSuchMethodException -> 0x0027, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x006d }
        goto L_0x000e;
    L_0x0027:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 48;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r6);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x0045:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 51;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r6);
        r3 = z;
        r4 = 49;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x006d:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 52;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r6);
        r3 = z;
        r4 = 50;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l5.a(java.lang.Class):com.whatsapp.aqo");
    }

    public Bitmap b(int i, int i2) {
        Bitmap a = a(i, i2);
        if (a == null) {
            return w();
        }
        return a;
    }
}
