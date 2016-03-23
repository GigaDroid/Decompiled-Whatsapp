package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.appcompat.R;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.DialogToastActivity.UnsupportedDeviceDialogFragment;
import com.whatsapp.contact.i;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.ag;
import com.whatsapp.util.bq;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ContactPicker extends VerifyMessageStoreActivity implements tm {
    private static boolean C;
    private static final String[] ab;
    private Handler A;
    private ArrayList B;
    private Intent D;
    private boolean E;
    private ArrayList F;
    private String G;
    private a2_ H;
    private boolean I;
    private boolean J;
    private boolean K;
    private String L;
    private String M;
    private l5 N;
    private ActionMode O;
    private String P;
    private final Set Q;
    private auz R;
    private auz S;
    private boolean T;
    private ArrayList U;
    private MenuItem V;
    private auz W;
    private boolean X;
    private ArrayList Y;
    private boolean Z;
    private String aa;
    private ViewPager o;
    private Callback p;
    private String q;
    private byte r;
    private HashMap s;
    private boolean t;
    private boolean u;
    private ArrayList v;
    private String w;
    private ArrayList x;
    private boolean y;
    private final ArrayList z;

    static boolean z(ContactPicker contactPicker) {
        return contactPicker.y;
    }

    static int a(ContactPicker contactPicker, ListView listView, int i) {
        return contactPicker.a(listView, i);
    }

    private int a(ListView listView, int i) {
        ListAdapter adapter = listView.getAdapter();
        try {
            return adapter instanceof HeaderViewListAdapter ? i - ((HeaderViewListAdapter) adapter).getHeadersCount() : i;
        } catch (SecurityException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[95];
        String str = "8\b(0@8\u00136-B0\u00024kS>\u00143(U{\u0004)*U:\u00042dO4\u0013f%E?\u0002\"";
        boolean z = true;
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
                        i3 = 91;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 70;
                        break;
                    case at.o /*3*/:
                        i3 = 68;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "(\u0002( ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e(\u00134!@6H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e8\b(0@8\u0013i!S)\b4d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e.\t51Q+\b40D?G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "1\u000e\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "9\u000b)'J>\u0003\u0019(H(\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f>\u001f26@u3\u0003\u001cu";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e8\b(0@8\u0013i!S)\b4d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e8\b(0@8\u0013i!S)\b4d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "8\b(0@8\u00136-B0\u00024kQ>\u0015+-R(\u000e)*\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "8\b(0@8\u0013\u00194H8\f#6\u000e(\u000f'6Dt\u001426D:\ni\"Ef\t3(M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e.\u0015/7\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "tM";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f:\u00042-N5I\u0005\u0016d\u001a3\u0003\u001br\u0013(\u0014\u0010b\u000e3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "9\u000b)'J\u0004\u0004)*U:\u00042";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e9\u0006\"\"H7\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e.\u0015/d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f>\u001f26@u4\u0012\u0016d\u001a*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "8\u0006*(q2\u0004-!S";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "<\u000e\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f>\u001f26@u3\u0003\u001cu";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f>\u001f26@u4\u0012\u0016d\u001a*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f>\u001f26@u4\u0012\u0016d\u001a*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "8\u000660H4\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e8\b(0@8\u0013i\"H7\u0002f N>\u0014(cU{\u0002>-R/G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "=\u000e*!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!~.\u0015/7\u000e5\u0012*(\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f>\u001f26@u3\u0003\u001cu";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "=\u000e*!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "4\u00042!Uv\u001426D:\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "(\u00022\u001bF)\b34~2\u0004)*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    str = "8\b+jK.\u0000!!S(\b 0\u000f,\u000f'0R:\u00176\"H7\u00025!O?\u00024";
                    z = true;
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    strArr2 = strArr3;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e4\u00042!Uv\u001426D:\nf";
                    z = true;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = ">\n'-M\u0004\u000f/7U4\u0015?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = ",\u000f'0R:\u00176";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "6\u000257@<\u0002\u00190X+\u00025";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e8\b(0@8\u0013i!S)\b4d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e.\u0015/d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!Ev\u000e(0D)\t'(\f=\u000e*!\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e8\b(0@8\u0013i!S)\b4d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "8\b+jV3\u000627@+\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "8\b(0@8\u00136-B0\u00024kU\"\u0017#kO.\u000b*d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0018\b3(E{\t)0\u0001+\u000647D{\u0011\u0005%S?G -M>]f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "-\u0004'6Ea";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "/\u0002>0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f>\u001f26@u3\u0003\u001cu";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "=\b43@)\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f>\u001f26@u4\u0012\u0016d\u001a*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "8\b+jV3\u000627D5\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u000e3\u0000i\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "1\u000e\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "2\t2!O/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "1\u000e\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "2\t2!O/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "8\b(0@8\u00136-B0\u00024kE>\u001426N\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "5\bk)@/\u0004.!R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "(\u0002'6B3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "8\b(0@8\u00136-B0\u00024kB)\u0002'0D";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "8\b(0@8\u00136-B0\u00024kE>\u0011/'Dv\t)0\f(\u001264N)\u0013# ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = ":\u0005)6U2\t!dE.\u0002f0N{\t'0H-\u0002f(H9\u0015'6H>\u0014f)H(\u0014/*F";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "8\b+j@5\u00034+H?I%+O/\u0006%0R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "8\b(0@8\u0013\u00194H8\f#6\u000e4\u00172-N5\u0014i7X(\u0013#)\u00018\b(0@8\u00135d@+\u0017f'N.\u000b\"dO4\u0013f\"N.\t\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f:\u00042-N5I\u0010\rd\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u001b\u0014h3I:\u00135%Q+I(!U";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "5\bk)@/\u0004.!R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "5\bk)@/\u0004.!R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    str = "5\bk)@/\u0004.!R";
                    z = true;
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    strArr2 = strArr3;
                    str = "5\bk)@/\u0004.!R";
                    z = true;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    str = "5\bk)@/\u0004.!R";
                    z = true;
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    strArr2 = strArr3;
                    str = "5\bk)@/\u0004.!R";
                    z = true;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "3\u00065\u001bR3\u00064!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = ":\t\"6N2\u0003h-O/\u0002(0\u000f>\u001f26@u4\u0012\u0016d\u001a*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = ")\u000221S5G/*U>\t2";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "1\u000e\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "(\f/4~+\u0015#2H>\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "(\u000f'6D\u0004\n5#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = ",\u0006\u00190X+\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "6\u000e+!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "3\u00065\u001bR3\u00064!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "(\f/4~+\u0015#2H>\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "-\u0004'6E\u0004\t')D";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "8\b(\"H)\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "-\u0004'6E\u0004\u001426";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "3\u00065\u001bR3\u00064!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "1\u000e\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "1\u000e\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "8\b(0@8\u00136-B0\u00024kQ2\u0004-!E{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "(\f/4~+\u0015#2H>\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "8\b(0@8\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    str = "8\b(0@8\u0013";
                    z = true;
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    strArr2 = strArr3;
                    str = "8\b(0@8\u0013";
                    z = true;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = ",\u0006\u00190X+\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = ",\u0006\u00190X+\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    ab = strArr3;
                    C = false;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "8\b(0@8\u00136-B0\u00024kR3\u00064!\u000e8\b(0@8\u0013i!S)\b4d";
                    z = false;
                    break;
            }
        }
    }

    static void g(ContactPicker contactPicker) {
        contactPicker.j();
    }

    public void onResume() {
        try {
            super.onResume();
            if (!C) {
                e(true);
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        try {
            if (aup.a(((l5) ((ListView) view).getItemAtPosition(((AdapterContextMenuInfo) contextMenuInfo).position)).p)) {
                contextMenu.add(0, 0, 0, String.format(getString(2131230843), new Object[]{r0.a((Context) this)}));
                super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    public boolean onSearchRequested() {
        try {
            if (this.V != null) {
                MenuItemCompat.expandActionView(this.V);
            }
            return false;
        } catch (SecurityException e) {
            throw e;
        }
    }

    static auz s(ContactPicker contactPicker) {
        return contactPicker.W;
    }

    static boolean r(ContactPicker contactPicker) {
        return contactPicker.K;
    }

    private void j() {
        try {
            if (App.b(this.r)) {
                if (!App.aO()) {
                    RequestPermissionActivity.a(this, 2131231674, 2131231673);
                    return;
                }
            }
            Conversation.ad = true;
            startActivity(this.D);
            finish();
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public void b(String str) {
    }

    static HashMap n(ContactPicker contactPicker) {
        return contactPicker.s;
    }

    public void a(Collection collection) {
        d();
    }

    static auz a(ContactPicker contactPicker, ListView listView) {
        return contactPicker.a(listView);
    }

    static String t(ContactPicker contactPicker) {
        return contactPicker.M;
    }

    static void d(ContactPicker contactPicker) {
        contactPicker.i();
    }

    private void k() {
        startActivity(new Intent(this, ContactPickerHelp.class));
    }

    public void onPause() {
        super.onPause();
    }

    static void a(ContactPicker contactPicker) {
        contactPicker.d();
    }

    static boolean a(ContactPicker contactPicker, l5 l5Var) {
        return contactPicker.b(l5Var);
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        String string = bundle.getString(ab[52]);
        if (string != null) {
            try {
                this.N = App.as.b(string);
            } catch (SecurityException e) {
                throw e;
            }
        }
        this.D = (Intent) bundle.getParcelable(ab[53]);
    }

    static void k(ContactPicker contactPicker) {
        contactPicker.m();
    }

    static ActionMode a(ContactPicker contactPicker, ActionMode actionMode) {
        contactPicker.O = actionMode;
        return actionMode;
    }

    static String w(ContactPicker contactPicker) {
        return contactPicker.L;
    }

    static auz h(ContactPicker contactPicker) {
        return contactPicker.R;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(com.whatsapp.l5 r10) {
        /*
        r9 = this;
        r7 = 9;
        r6 = -1;
        r8 = 335544320; // 0x14000000 float:6.4623485E-27 double:1.65780921E-315;
        r0 = 0;
        r2 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r1 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x002c }
        r1.<init>();	 Catch:{ SecurityException -> 0x002c }
        r4 = ab;	 Catch:{ SecurityException -> 0x002c }
        r5 = 88;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x002c }
        r1 = r1.append(r4);	 Catch:{ SecurityException -> 0x002c }
        r4 = r10.p;	 Catch:{ SecurityException -> 0x002c }
        r1 = r1.append(r4);	 Catch:{ SecurityException -> 0x002c }
        r1 = r1.toString();	 Catch:{ SecurityException -> 0x002c }
        com.whatsapp.util.Log.i(r1);	 Catch:{ SecurityException -> 0x002c }
        r1 = c(r10);	 Catch:{ SecurityException -> 0x002c }
        if (r1 == 0) goto L_0x002e;
    L_0x002b:
        return r2;
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r1 = r10.p;	 Catch:{ SecurityException -> 0x0075 }
        r1 = com.whatsapp.aup.a(r1);	 Catch:{ SecurityException -> 0x0075 }
        if (r1 != 0) goto L_0x002b;
    L_0x0036:
        r1 = r10.p;
        r4 = r9.J;	 Catch:{ SecurityException -> 0x0077 }
        if (r4 == 0) goto L_0x0044;
    L_0x003c:
        r4 = r9.Q;	 Catch:{ SecurityException -> 0x0079 }
        r4 = r4.contains(r1);	 Catch:{ SecurityException -> 0x0079 }
        if (r4 != 0) goto L_0x002b;
    L_0x0044:
        r4 = r9.t;	 Catch:{ SecurityException -> 0x007b }
        if (r4 != 0) goto L_0x0050;
    L_0x0048:
        r4 = r9.E;	 Catch:{ SecurityException -> 0x007d }
        if (r4 != 0) goto L_0x0050;
    L_0x004c:
        r4 = r9.K;	 Catch:{ SecurityException -> 0x007f }
        if (r4 == 0) goto L_0x005c;
    L_0x0050:
        r4 = r10.c();	 Catch:{ SecurityException -> 0x0081 }
        if (r4 == 0) goto L_0x005c;
    L_0x0056:
        r4 = com.whatsapp.qm.h(r1);	 Catch:{ SecurityException -> 0x0083 }
        if (r4 == 0) goto L_0x002b;
    L_0x005c:
        r9.N = r10;	 Catch:{ SecurityException -> 0x0085 }
        r4 = r9.J;	 Catch:{ SecurityException -> 0x0085 }
        if (r4 == 0) goto L_0x0089;
    L_0x0062:
        r4 = r9.Z;	 Catch:{ SecurityException -> 0x0087 }
        if (r4 == 0) goto L_0x0089;
    L_0x0066:
        r4 = r9.M;	 Catch:{ SecurityException -> 0x0073 }
        r4 = com.whatsapp.l5.g(r4);	 Catch:{ SecurityException -> 0x0073 }
        if (r4 != 0) goto L_0x0089;
    L_0x006e:
        r0 = 0;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x0073 }
        goto L_0x002b;
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0073 }
    L_0x0089:
        r4 = r9.X;	 Catch:{ SecurityException -> 0x00a5 }
        if (r4 == 0) goto L_0x00a7;
    L_0x008d:
        r0 = ab;	 Catch:{ SecurityException -> 0x00a5 }
        r1 = 74;
        r0 = r0[r1];	 Catch:{ SecurityException -> 0x00a5 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SecurityException -> 0x00a5 }
        r0 = -1;
        r1 = com.whatsapp.App.as;	 Catch:{ SecurityException -> 0x00a5 }
        r3 = 1;
        r1 = r1.a(r10, r3);	 Catch:{ SecurityException -> 0x00a5 }
        r9.setResult(r0, r1);	 Catch:{ SecurityException -> 0x00a5 }
        r9.finish();	 Catch:{ SecurityException -> 0x00a5 }
        goto L_0x002b;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r4 = r9.Y;	 Catch:{ SecurityException -> 0x00c0 }
        if (r4 == 0) goto L_0x0165;
    L_0x00ab:
        r4 = r9.r;	 Catch:{ SecurityException -> 0x00c2 }
        if (r4 != r7) goto L_0x00c4;
    L_0x00af:
        r4 = com.whatsapp.App.as;	 Catch:{ SecurityException -> 0x00be }
        r5 = com.whatsapp.air.ALLOW;	 Catch:{ SecurityException -> 0x00be }
        r4 = r4.a(r1, r5);	 Catch:{ SecurityException -> 0x00be }
        if (r4 != 0) goto L_0x00c4;
    L_0x00b9:
        com.whatsapp.App.a(r10, r9);	 Catch:{ SecurityException -> 0x00be }
        goto L_0x002b;
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00be }
    L_0x00c4:
        r4 = new android.content.Intent;
        r5 = com.whatsapp.Conversation.class;
        r4.<init>(r9, r5);
        r9.D = r4;
        r4 = r9.D;
        r5 = ab;
        r6 = 75;
        r5 = r5[r6];
        r4.putExtra(r5, r1);
        r1 = r9.D;
        r4 = ab;
        r5 = 93;
        r4 = r4[r5];
        r5 = r9.r;
        r1.putExtra(r4, r5);
        r1 = r9.D;
        r4 = ab;
        r5 = 79;
        r4 = r4[r5];
        r5 = r9.q;
        r1.putExtra(r4, r5);
        r1 = r9.D;
        r4 = ab;
        r5 = 72;
        r4 = r4[r5];
        r1.putExtra(r4, r2);
        r1 = r9.D;
        r4 = ab;
        r5 = 81;
        r4 = r4[r5];
        r5 = r9.getIntent();
        r6 = ab;
        r7 = 89;
        r6 = r6[r7];
        r5 = r5.getBooleanExtra(r6, r0);
        r1.putExtra(r4, r5);
        r1 = r9.D;
        r4 = ab;
        r5 = 73;
        r4 = r4[r5];
        r5 = r9.Y;
        r1.putParcelableArrayListExtra(r4, r5);
        r1 = r9.D;
        r1.addFlags(r8);
        r1 = r9.getIntent();
        r4 = ab;
        r5 = 76;
        r4 = r4[r5];
        r0 = r1.getBooleanExtra(r4, r0);
        if (r0 != 0) goto L_0x0156;
    L_0x0138:
        r1 = r9.Y;
        r4 = r1.iterator();
        r1 = r0;
    L_0x013f:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x02bf;
    L_0x0145:
        r0 = r4.next();
        r0 = (android.net.Uri) r0;
        r0 = com.whatsapp.util.ag.e(r0);
        if (r0 == r2) goto L_0x02bc;
    L_0x0151:
        if (r3 == 0) goto L_0x02b9;
    L_0x0153:
        r0 = r2;
    L_0x0154:
        if (r3 == 0) goto L_0x02b6;
    L_0x0156:
        if (r0 == 0) goto L_0x015e;
    L_0x0158:
        r0 = 1;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x0163 }
        if (r3 == 0) goto L_0x002b;
    L_0x015e:
        r9.j();	 Catch:{ SecurityException -> 0x0163 }
        goto L_0x002b;
    L_0x0163:
        r0 = move-exception;
        throw r0;
    L_0x0165:
        r4 = r9.G;	 Catch:{ SecurityException -> 0x01d3 }
        if (r4 == 0) goto L_0x01db;
    L_0x0169:
        r4 = r9.G;	 Catch:{ SecurityException -> 0x01d5 }
        r4 = r4.length();	 Catch:{ SecurityException -> 0x01d5 }
        if (r4 <= 0) goto L_0x01db;
    L_0x0171:
        r4 = new android.content.Intent;	 Catch:{ SecurityException -> 0x01d7 }
        r5 = com.whatsapp.Conversation.class;
        r4.<init>(r9, r5);	 Catch:{ SecurityException -> 0x01d7 }
        r9.D = r4;	 Catch:{ SecurityException -> 0x01d7 }
        r4 = r9.D;	 Catch:{ SecurityException -> 0x01d7 }
        r5 = ab;	 Catch:{ SecurityException -> 0x01d7 }
        r6 = 86;
        r5 = r5[r6];	 Catch:{ SecurityException -> 0x01d7 }
        r4.putExtra(r5, r1);	 Catch:{ SecurityException -> 0x01d7 }
        r1 = r9.D;	 Catch:{ SecurityException -> 0x01d7 }
        r4 = ab;	 Catch:{ SecurityException -> 0x01d7 }
        r5 = 94;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x01d7 }
        r5 = r9.r;	 Catch:{ SecurityException -> 0x01d7 }
        r1.putExtra(r4, r5);	 Catch:{ SecurityException -> 0x01d7 }
        r1 = r9.D;	 Catch:{ SecurityException -> 0x01d7 }
        r4 = ab;	 Catch:{ SecurityException -> 0x01d7 }
        r5 = 77;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x01d7 }
        r5 = r9.G;	 Catch:{ SecurityException -> 0x01d7 }
        r1.putExtra(r4, r5);	 Catch:{ SecurityException -> 0x01d7 }
        r1 = r9.D;	 Catch:{ SecurityException -> 0x01d7 }
        r4 = ab;	 Catch:{ SecurityException -> 0x01d7 }
        r5 = 80;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x01d7 }
        r5 = 1;
        r1.putExtra(r4, r5);	 Catch:{ SecurityException -> 0x01d7 }
        r1 = r9.D;	 Catch:{ SecurityException -> 0x01d7 }
        r4 = ab;	 Catch:{ SecurityException -> 0x01d7 }
        r5 = 83;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x01d7 }
        r5 = r9.Z;	 Catch:{ SecurityException -> 0x01d7 }
        if (r5 != 0) goto L_0x01b8;
    L_0x01b7:
        r0 = r2;
    L_0x01b8:
        r1.putExtra(r4, r0);	 Catch:{ SecurityException -> 0x01d9 }
        r0 = r9.D;	 Catch:{ SecurityException -> 0x01d9 }
        r1 = 335544320; // 0x14000000 float:6.4623485E-27 double:1.65780921E-315;
        r0.addFlags(r1);	 Catch:{ SecurityException -> 0x01d9 }
        r0 = r9.Z;	 Catch:{ SecurityException -> 0x01d9 }
        if (r0 == 0) goto L_0x01cc;
    L_0x01c6:
        r0 = 1;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x01d1 }
        if (r3 == 0) goto L_0x002b;
    L_0x01cc:
        r9.j();	 Catch:{ SecurityException -> 0x01d1 }
        goto L_0x002b;
    L_0x01d1:
        r0 = move-exception;
        throw r0;
    L_0x01d3:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01d5 }
    L_0x01d5:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01d7 }
    L_0x01d7:
        r0 = move-exception;
        throw r0;
    L_0x01d9:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01d1 }
    L_0x01db:
        r0 = r9.w;	 Catch:{ SecurityException -> 0x0233 }
        if (r0 == 0) goto L_0x0235;
    L_0x01df:
        r0 = new android.content.Intent;	 Catch:{ SecurityException -> 0x0233 }
        r3 = com.whatsapp.Conversation.class;
        r0.<init>(r9, r3);	 Catch:{ SecurityException -> 0x0233 }
        r9.D = r0;	 Catch:{ SecurityException -> 0x0233 }
        r0 = r9.D;	 Catch:{ SecurityException -> 0x0233 }
        r3 = ab;	 Catch:{ SecurityException -> 0x0233 }
        r4 = 87;
        r3 = r3[r4];	 Catch:{ SecurityException -> 0x0233 }
        r0.putExtra(r3, r1);	 Catch:{ SecurityException -> 0x0233 }
        r0 = r9.D;	 Catch:{ SecurityException -> 0x0233 }
        r1 = ab;	 Catch:{ SecurityException -> 0x0233 }
        r3 = 84;
        r1 = r1[r3];	 Catch:{ SecurityException -> 0x0233 }
        r3 = r9.w;	 Catch:{ SecurityException -> 0x0233 }
        r0.putExtra(r1, r3);	 Catch:{ SecurityException -> 0x0233 }
        r0 = r9.D;	 Catch:{ SecurityException -> 0x0233 }
        r1 = ab;	 Catch:{ SecurityException -> 0x0233 }
        r3 = 82;
        r1 = r1[r3];	 Catch:{ SecurityException -> 0x0233 }
        r3 = r9.P;	 Catch:{ SecurityException -> 0x0233 }
        r0.putExtra(r1, r3);	 Catch:{ SecurityException -> 0x0233 }
        r0 = r9.D;	 Catch:{ SecurityException -> 0x0233 }
        r1 = ab;	 Catch:{ SecurityException -> 0x0233 }
        r3 = 78;
        r1 = r1[r3];	 Catch:{ SecurityException -> 0x0233 }
        r3 = r9.r;	 Catch:{ SecurityException -> 0x0233 }
        r0.putExtra(r1, r3);	 Catch:{ SecurityException -> 0x0233 }
        r0 = r9.D;	 Catch:{ SecurityException -> 0x0233 }
        r1 = ab;	 Catch:{ SecurityException -> 0x0233 }
        r3 = 85;
        r1 = r1[r3];	 Catch:{ SecurityException -> 0x0233 }
        r3 = 1;
        r0.putExtra(r1, r3);	 Catch:{ SecurityException -> 0x0233 }
        r0 = r9.D;	 Catch:{ SecurityException -> 0x0233 }
        r1 = 335544320; // 0x14000000 float:6.4623485E-27 double:1.65780921E-315;
        r0.addFlags(r1);	 Catch:{ SecurityException -> 0x0233 }
        r0 = 1;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x0233 }
        goto L_0x002b;
    L_0x0233:
        r0 = move-exception;
        throw r0;
    L_0x0235:
        r0 = r9.E;	 Catch:{ SecurityException -> 0x0264 }
        if (r0 == 0) goto L_0x0282;
    L_0x0239:
        r0 = r9.B;	 Catch:{ SecurityException -> 0x0266 }
        if (r0 == 0) goto L_0x026a;
    L_0x023d:
        r0 = r9.B;	 Catch:{ SecurityException -> 0x0268 }
        r3 = 9;
        r3 = java.lang.Byte.valueOf(r3);	 Catch:{ SecurityException -> 0x0268 }
        r3 = r3.intValue();	 Catch:{ SecurityException -> 0x0268 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ SecurityException -> 0x0268 }
        r0 = r0.contains(r3);	 Catch:{ SecurityException -> 0x0268 }
        if (r0 == 0) goto L_0x026a;
    L_0x0253:
        r0 = com.whatsapp.App.as;	 Catch:{ SecurityException -> 0x0262 }
        r3 = com.whatsapp.air.ALLOW;	 Catch:{ SecurityException -> 0x0262 }
        r0 = r0.a(r1, r3);	 Catch:{ SecurityException -> 0x0262 }
        if (r0 != 0) goto L_0x026a;
    L_0x025d:
        com.whatsapp.App.a(r10, r9);	 Catch:{ SecurityException -> 0x0262 }
        goto L_0x002b;
    L_0x0262:
        r0 = move-exception;
        throw r0;
    L_0x0264:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0266 }
    L_0x0266:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0268 }
    L_0x0268:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0262 }
    L_0x026a:
        r0 = new android.content.Intent;
        r0.<init>();
        r9.D = r0;
        r0 = r9.D;
        r3 = ab;
        r4 = 91;
        r3 = r3[r4];
        r0.putExtra(r3, r1);
        r0 = 2;
        r9.showDialog(r0);
        goto L_0x002b;
    L_0x0282:
        r0 = r9.K;	 Catch:{ SecurityException -> 0x029e }
        if (r0 == 0) goto L_0x02a0;
    L_0x0286:
        r0 = new android.content.Intent;	 Catch:{ SecurityException -> 0x029e }
        r0.<init>();	 Catch:{ SecurityException -> 0x029e }
        r9.D = r0;	 Catch:{ SecurityException -> 0x029e }
        r0 = r9.D;	 Catch:{ SecurityException -> 0x029e }
        r3 = ab;	 Catch:{ SecurityException -> 0x029e }
        r4 = 92;
        r3 = r3[r4];	 Catch:{ SecurityException -> 0x029e }
        r0.putExtra(r3, r1);	 Catch:{ SecurityException -> 0x029e }
        r0 = 3;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x029e }
        goto L_0x002b;
    L_0x029e:
        r0 = move-exception;
        throw r0;
    L_0x02a0:
        r0 = new android.content.Intent;
        r0.<init>();
        r3 = ab;
        r4 = 90;
        r3 = r3[r4];
        r0.putExtra(r3, r1);
        r9.setResult(r6, r0);
        r9.finish();
        goto L_0x002b;
    L_0x02b6:
        r1 = r0;
        goto L_0x013f;
    L_0x02b9:
        r0 = r2;
        goto L_0x0156;
    L_0x02bc:
        r0 = r1;
        goto L_0x0154;
    L_0x02bf:
        r0 = r1;
        goto L_0x0156;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.b(com.whatsapp.l5):boolean");
    }

    static String a(ContactPicker contactPicker, String str) {
        contactPicker.L = str;
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void n() {
        /*
        r6 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = r6.x;
        monitor-enter(r2);
        r0 = r6.K;	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x0013;
    L_0x0009:
        r0 = com.whatsapp.App.as;	 Catch:{ SecurityException -> 0x0068 }
        r0 = r0.f();	 Catch:{ SecurityException -> 0x0068 }
        r6.x = r0;	 Catch:{ SecurityException -> 0x0068 }
        if (r1 == 0) goto L_0x0058;
    L_0x0013:
        r0 = r6.I;	 Catch:{ SecurityException -> 0x0068 }
        if (r0 == 0) goto L_0x003f;
    L_0x0017:
        r0 = r6.x;	 Catch:{ all -> 0x006a }
        r0.clear();	 Catch:{ all -> 0x006a }
        r0 = com.whatsapp.qa.g();	 Catch:{ all -> 0x006a }
        r3 = r0.iterator();	 Catch:{ all -> 0x006a }
    L_0x0024:
        r0 = r3.hasNext();	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x003d;
    L_0x002a:
        r0 = r3.next();	 Catch:{ all -> 0x006a }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x006a }
        r4 = r6.x;	 Catch:{ all -> 0x006a }
        r5 = com.whatsapp.App.as;	 Catch:{ all -> 0x006a }
        r0 = r5.b(r0);	 Catch:{ all -> 0x006a }
        r4.add(r0);	 Catch:{ all -> 0x006a }
        if (r1 == 0) goto L_0x0024;
    L_0x003d:
        if (r1 == 0) goto L_0x0058;
    L_0x003f:
        r0 = r6.x;	 Catch:{ SecurityException -> 0x006d }
        r0.clear();	 Catch:{ SecurityException -> 0x006d }
        r0 = r6.y;	 Catch:{ SecurityException -> 0x006d }
        if (r0 != 0) goto L_0x0051;
    L_0x0048:
        r0 = com.whatsapp.App.as;	 Catch:{ SecurityException -> 0x006f }
        r3 = r6.x;	 Catch:{ SecurityException -> 0x006f }
        r0.a(r3);	 Catch:{ SecurityException -> 0x006f }
        if (r1 == 0) goto L_0x0058;
    L_0x0051:
        r0 = com.whatsapp.App.as;	 Catch:{ SecurityException -> 0x0071 }
        r3 = r6.x;	 Catch:{ SecurityException -> 0x0071 }
        r0.c(r3);	 Catch:{ SecurityException -> 0x0071 }
    L_0x0058:
        r0 = r6.F;	 Catch:{ SecurityException -> 0x0073 }
        if (r0 == 0) goto L_0x0063;
    L_0x005c:
        r0 = r6.F;	 Catch:{ SecurityException -> 0x0073 }
        r6.a(r0);	 Catch:{ SecurityException -> 0x0073 }
        if (r1 == 0) goto L_0x0066;
    L_0x0063:
        r6.i();	 Catch:{ SecurityException -> 0x0075 }
    L_0x0066:
        monitor-exit(r2);	 Catch:{ all -> 0x006a }
        return;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x006a }
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x006a }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x006a }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.n():void");
    }

    static HashMap a(ContactPicker contactPicker, HashMap hashMap) {
        contactPicker.s = hashMap;
        return hashMap;
    }

    static ArrayList u(ContactPicker contactPicker) {
        return contactPicker.F;
    }

    static auz l(ContactPicker contactPicker) {
        return contactPicker.S;
    }

    public boolean l() {
        try {
            if (this.O != null) {
                return false;
            }
            try {
                if (this.p == null) {
                    this.p = new anp(this);
                }
                d();
                this.O = startSupportActionMode(this.p);
                return true;
            } catch (SecurityException e) {
                throw e;
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public void m469a(String str) {
        try {
            if (l5.a(this.x, new aa_(App.as.b(str)))) {
                d();
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    static Handler q(ContactPicker contactPicker) {
        return contactPicker.A;
    }

    private void d() {
        this.W.notifyDataSetChanged();
        this.R.notifyDataSetChanged();
        this.S.notifyDataSetChanged();
    }

    private int a(String str) {
        this.r = ag.d(str);
        return this.r;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r6) {
        /*
        r5 = this;
        r4 = 1;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r6.getItemId();	 Catch:{ ActivityNotFoundException -> 0x0014 }
        switch(r1) {
            case 0: goto L_0x000b;
            case 1: goto L_0x0066;
            case 2: goto L_0x0016;
            case 3: goto L_0x0075;
            case 4: goto L_0x0071;
            case 16908332: goto L_0x0079;
            default: goto L_0x000a;
        };	 Catch:{ ActivityNotFoundException -> 0x0014 }
    L_0x000a:
        return r4;
    L_0x000b:
        r0 = 1;
        r5.setSupportProgressBarIndeterminateVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x0014 }
        r0 = 1;
        r5.f(r0);	 Catch:{ ActivityNotFoundException -> 0x0014 }
        goto L_0x000a;
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r1 = new android.content.Intent;
        r2 = ab;
        r3 = 64;
        r2 = r2[r3];
        r3 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r1.<init>(r2, r3);
        r2 = r5.getPackageManager();	 Catch:{ ActivityNotFoundException -> 0x0062 }
        r2 = r1.resolveActivity(r2);	 Catch:{ ActivityNotFoundException -> 0x0062 }
        r1.setComponent(r2);	 Catch:{ ActivityNotFoundException -> 0x0062 }
        r2 = r1.getComponent();	 Catch:{ ActivityNotFoundException -> 0x0062 }
        if (r2 == 0) goto L_0x0039;
    L_0x0034:
        r5.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0062 }
        if (r0 == 0) goto L_0x000a;
    L_0x0039:
        r1 = r5.getPackageManager();	 Catch:{ ActivityNotFoundException -> 0x0054 }
        r2 = ab;	 Catch:{ ActivityNotFoundException -> 0x0054 }
        r3 = 62;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0054 }
        r1 = r1.getLaunchIntentForPackage(r2);	 Catch:{ ActivityNotFoundException -> 0x0054 }
        if (r1 != 0) goto L_0x004e;
    L_0x0049:
        com.whatsapp.App.aR();	 Catch:{ ActivityNotFoundException -> 0x0064 }
        if (r0 == 0) goto L_0x000a;
    L_0x004e:
        r5.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0052 }
        goto L_0x000a;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        r0 = ab;
        r1 = 63;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        com.whatsapp.App.aR();
        goto L_0x000a;
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0052 }
    L_0x0066:
        r0 = com.whatsapp.fieldstats.k.TELL_A_FRIEND;
        r1 = com.whatsapp.fieldstats.c.CONTACTPICKER_MENU;
        com.whatsapp.nf.a(r0, r1);
        com.whatsapp.App.b(r5);
        goto L_0x000a;
    L_0x0071:
        r5.onSearchRequested();
        goto L_0x000a;
    L_0x0075:
        r5.k();
        goto L_0x000a;
    L_0x0079:
        r5.finish();
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    static boolean m(ContactPicker contactPicker) {
        return contactPicker.T;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        l5 l5Var = (l5) ((ListView) this.o.findViewWithTag(Integer.valueOf(this.o.getCurrentItem()))).getItemAtPosition(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        try {
            switch (menuItem.getItemId()) {
                case v.m /*0*/:
                    aup.a(this, false, l5Var.p);
                    return true;
                default:
                    return super.onContextItemSelected(menuItem);
            }
        } catch (SecurityException e) {
            throw e;
        }
        throw e;
    }

    private void f() {
        boolean z = DialogToastActivity.f;
        ArrayList g = qa.g();
        ArrayList arrayList = new ArrayList();
        Iterator it = g.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            l5 b = App.as.b(str);
            try {
                if (b.l == null) {
                    if (str.endsWith(ab[65])) {
                        arrayList.add(b.p);
                        continue;
                    } else {
                        continue;
                    }
                }
                if (z) {
                    break;
                }
            } catch (SecurityException e) {
                throw e;
            } catch (SecurityException e2) {
                throw e2;
            }
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = App.as.l((String) it.next()).iterator();
            while (it2.hasNext()) {
                l5 l5Var = (l5) it2.next();
                if (z) {
                    break;
                    continue;
                }
            }
            if (z) {
                break;
            }
        }
        if (arrayList.size() > 0) {
            str = (String) arrayList.get(0);
            ArrayList k = App.as.k();
            it2 = k.iterator();
            while (it2.hasNext()) {
                l5 l5Var2 = (l5) it2.next();
                try {
                    if (l5Var2.p != null && !l5Var2.p.startsWith(str)) {
                        if (z) {
                            break;
                        }
                    } else if (z) {
                        break;
                    }
                } catch (SecurityException e22) {
                    throw e22;
                }
            }
            k.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130903103);
        ActionBar supportActionBar = getSupportActionBar();
        try {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setTitle(2131232290);
            Log.i(ab[59]);
            if (WhatsAppLibLoader.a(null)) {
                try {
                    if (App.ay == null || App.t((Context) this) != 3) {
                        App.a((Context) this, 2131231151, 1);
                        startActivity(new Intent(this, Main.class));
                        finish();
                        return;
                    }
                    try {
                        if (App.U()) {
                            Log.w(ab[60]);
                            b(new UnsupportedDeviceDialogFragment());
                        }
                        try {
                            setSupportProgressBarIndeterminateVisibility(i.a());
                            if (bundle == null) {
                                this.aa = getIntent().getStringExtra(ab[58]);
                            }
                            try {
                                if (!App.aK.E()) {
                                    C = true;
                                    if (a()) {
                                        try {
                                            c();
                                            if (!DialogToastActivity.f) {
                                                return;
                                            }
                                        } catch (SecurityException e) {
                                            throw e;
                                        }
                                    }
                                    return;
                                }
                                b();
                                return;
                            } catch (SecurityException e2) {
                                throw e2;
                            } catch (SecurityException e22) {
                                throw e22;
                            }
                        } catch (SecurityException e222) {
                            throw e222;
                        }
                    } catch (SecurityException e2222) {
                        throw e2222;
                    }
                } catch (SecurityException e22222) {
                    throw e22222;
                }
            }
            Log.i(ab[61]);
            finish();
        } catch (SecurityException e222222) {
            throw e222222;
        }
    }

    static void i(ContactPicker contactPicker) {
        contactPicker.k();
    }

    private static boolean c(l5 l5Var) {
        return ab[57].equals(l5Var.p);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
        r4 = this;
        r3 = -1;
        r0 = com.whatsapp.DialogToastActivity.f;
        switch(r5) {
            case 1: goto L_0x000a;
            case 151: goto L_0x001c;
            default: goto L_0x0006;
        };
    L_0x0006:
        super.onActivityResult(r5, r6, r7);	 Catch:{ SecurityException -> 0x002a }
    L_0x0009:
        return;
    L_0x000a:
        if (r6 != r3) goto L_0x0012;
    L_0x000c:
        r1 = 0;
        r4.f(r1);	 Catch:{ SecurityException -> 0x0024 }
        if (r0 == 0) goto L_0x0009;
    L_0x0012:
        r1 = ab;	 Catch:{ SecurityException -> 0x0026 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x0026 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ SecurityException -> 0x0026 }
        if (r0 == 0) goto L_0x0009;
    L_0x001c:
        if (r6 != r3) goto L_0x0009;
    L_0x001e:
        r4.j();	 Catch:{ SecurityException -> 0x002a }
        if (r0 == 0) goto L_0x0009;
    L_0x0023:
        goto L_0x0006;
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.onActivityResult(int, int, android.content.Intent):void");
    }

    private void f(boolean z) {
        try {
            if (App.ay == null) {
                App.a((Context) this, 2131231151, 1);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            setSupportProgressBarIndeterminateVisibility(true);
            bq.a(new vb(this, z));
        } catch (SecurityException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r5 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r5.U;	 Catch:{ SecurityException -> 0x01a3 }
        r0.clear();	 Catch:{ SecurityException -> 0x01a3 }
        r0 = r5.z;	 Catch:{ SecurityException -> 0x01a3 }
        r0.clear();	 Catch:{ SecurityException -> 0x01a3 }
        r0 = r5.v;	 Catch:{ SecurityException -> 0x01a3 }
        r0.clear();	 Catch:{ SecurityException -> 0x01a3 }
        r0 = r5.J;	 Catch:{ SecurityException -> 0x01a3 }
        if (r0 != 0) goto L_0x0019;
    L_0x0015:
        r0 = r5.T;	 Catch:{ SecurityException -> 0x01a3 }
        if (r0 == 0) goto L_0x004c;
    L_0x0019:
        r0 = r5.x;
        r2 = r0.iterator();
    L_0x001f:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x004a;
    L_0x0025:
        r0 = r2.next();
        r0 = (com.whatsapp.l5) r0;
        r3 = r0.c();	 Catch:{ SecurityException -> 0x01a5 }
        if (r3 != 0) goto L_0x0048;
    L_0x0031:
        r3 = r0.l;	 Catch:{ SecurityException -> 0x01a7 }
        if (r3 == 0) goto L_0x0048;
    L_0x0035:
        r3 = r5.J;	 Catch:{ SecurityException -> 0x01a9 }
        if (r3 != 0) goto L_0x0043;
    L_0x0039:
        r3 = r5.Q;	 Catch:{ SecurityException -> 0x01ab }
        r4 = r0.p;	 Catch:{ SecurityException -> 0x01ab }
        r3 = r3.contains(r4);	 Catch:{ SecurityException -> 0x01ab }
        if (r3 != 0) goto L_0x0048;
    L_0x0043:
        r3 = r5.z;	 Catch:{ SecurityException -> 0x01ab }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01ab }
    L_0x0048:
        if (r1 == 0) goto L_0x001f;
    L_0x004a:
        if (r1 == 0) goto L_0x00d3;
    L_0x004c:
        r0 = r5.I;	 Catch:{ SecurityException -> 0x01ad }
        if (r0 == 0) goto L_0x0075;
    L_0x0050:
        r0 = r5.x;
        r2 = r0.iterator();
    L_0x0056:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0073;
    L_0x005c:
        r0 = r2.next();
        r0 = (com.whatsapp.l5) r0;
        r3 = com.whatsapp.App.aK;	 Catch:{ SecurityException -> 0x01af }
        r4 = r0.p;	 Catch:{ SecurityException -> 0x01af }
        r3 = r3.t(r4);	 Catch:{ SecurityException -> 0x01af }
        if (r3 == 0) goto L_0x0071;
    L_0x006c:
        r3 = r5.U;	 Catch:{ SecurityException -> 0x01af }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01af }
    L_0x0071:
        if (r1 == 0) goto L_0x0056;
    L_0x0073:
        if (r1 == 0) goto L_0x00d3;
    L_0x0075:
        r0 = r5.x;
        r2 = r0.iterator();
    L_0x007b:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00d3;
    L_0x0081:
        r0 = r2.next();
        r0 = (com.whatsapp.l5) r0;
        r3 = r0.c();	 Catch:{ SecurityException -> 0x01b1 }
        if (r3 != 0) goto L_0x0096;
    L_0x008d:
        r3 = r0.l;	 Catch:{ SecurityException -> 0x01b3 }
        if (r3 == 0) goto L_0x0096;
    L_0x0091:
        r3 = r5.z;	 Catch:{ SecurityException -> 0x01b3 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01b3 }
    L_0x0096:
        r3 = r0.c();	 Catch:{ SecurityException -> 0x01b5 }
        if (r3 == 0) goto L_0x00ab;
    L_0x009c:
        r3 = r0.A();	 Catch:{ SecurityException -> 0x01b7 }
        if (r3 != 0) goto L_0x00ab;
    L_0x00a2:
        r3 = r0.q;	 Catch:{ SecurityException -> 0x01b9 }
        if (r3 == 0) goto L_0x00ab;
    L_0x00a6:
        r3 = r5.v;	 Catch:{ SecurityException -> 0x01b9 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01b9 }
    L_0x00ab:
        r3 = r0.c();	 Catch:{ SecurityException -> 0x01bb }
        if (r3 == 0) goto L_0x00c2;
    L_0x00b1:
        r3 = r0.A();	 Catch:{ SecurityException -> 0x01bd }
        if (r3 != 0) goto L_0x00d1;
    L_0x00b7:
        r3 = r0.q;	 Catch:{ SecurityException -> 0x01bf }
        if (r3 == 0) goto L_0x00d1;
    L_0x00bb:
        r3 = r5.U;	 Catch:{ SecurityException -> 0x01c1 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01c1 }
        if (r1 == 0) goto L_0x00d1;
    L_0x00c2:
        r3 = com.whatsapp.App.aK;	 Catch:{ SecurityException -> 0x01c3 }
        r4 = r0.p;	 Catch:{ SecurityException -> 0x01c3 }
        r3 = r3.t(r4);	 Catch:{ SecurityException -> 0x01c3 }
        if (r3 == 0) goto L_0x00d1;
    L_0x00cc:
        r3 = r5.U;	 Catch:{ SecurityException -> 0x01c3 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01c3 }
    L_0x00d1:
        if (r1 == 0) goto L_0x007b;
    L_0x00d3:
        r0 = r5.U;	 Catch:{ SecurityException -> 0x01c5 }
        r1 = new com.whatsapp.eh;	 Catch:{ SecurityException -> 0x01c5 }
        r2 = r5.getApplicationContext();	 Catch:{ SecurityException -> 0x01c5 }
        r1.<init>(r2);	 Catch:{ SecurityException -> 0x01c5 }
        java.util.Collections.sort(r0, r1);	 Catch:{ SecurityException -> 0x01c5 }
        r0 = r5.z;	 Catch:{ SecurityException -> 0x01c5 }
        r1 = new com.whatsapp.a3d;	 Catch:{ SecurityException -> 0x01c5 }
        r2 = r5.getApplicationContext();	 Catch:{ SecurityException -> 0x01c5 }
        r1.<init>(r2);	 Catch:{ SecurityException -> 0x01c5 }
        java.util.Collections.sort(r0, r1);	 Catch:{ SecurityException -> 0x01c5 }
        r0 = r5.v;	 Catch:{ SecurityException -> 0x01c5 }
        r1 = new com.whatsapp.a3d;	 Catch:{ SecurityException -> 0x01c5 }
        r2 = r5.getApplicationContext();	 Catch:{ SecurityException -> 0x01c5 }
        r1.<init>(r2);	 Catch:{ SecurityException -> 0x01c5 }
        java.util.Collections.sort(r0, r1);	 Catch:{ SecurityException -> 0x01c5 }
        r0 = r5.X;	 Catch:{ SecurityException -> 0x01c5 }
        if (r0 != 0) goto L_0x013f;
    L_0x0101:
        r0 = r5.E;	 Catch:{ SecurityException -> 0x01c7 }
        if (r0 != 0) goto L_0x013f;
    L_0x0105:
        r0 = r5.t;	 Catch:{ SecurityException -> 0x01c9 }
        if (r0 != 0) goto L_0x013f;
    L_0x0109:
        r0 = r5.K;	 Catch:{ SecurityException -> 0x01cb }
        if (r0 != 0) goto L_0x013f;
    L_0x010d:
        r0 = r5.z;	 Catch:{ SecurityException -> 0x01cd }
        r0 = r0.isEmpty();	 Catch:{ SecurityException -> 0x01cd }
        if (r0 != 0) goto L_0x013f;
    L_0x0115:
        r0 = r5.getSupportActionBar();	 Catch:{ SecurityException -> 0x01cd }
        r1 = com.whatsapp.App.az;	 Catch:{ SecurityException -> 0x01cd }
        r2 = 2131296292; // 0x7f090024 float:1.8210497E38 double:1.053000279E-314;
        r3 = r5.z;	 Catch:{ SecurityException -> 0x01cd }
        r3 = r3.size();	 Catch:{ SecurityException -> 0x01cd }
        r1 = r1.a(r2, r3);	 Catch:{ SecurityException -> 0x01cd }
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ SecurityException -> 0x01cd }
        r3 = 0;
        r4 = r5.z;	 Catch:{ SecurityException -> 0x01cd }
        r4 = r4.size();	 Catch:{ SecurityException -> 0x01cd }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ SecurityException -> 0x01cd }
        r2[r3] = r4;	 Catch:{ SecurityException -> 0x01cd }
        r1 = java.lang.String.format(r1, r2);	 Catch:{ SecurityException -> 0x01cd }
        r0.setSubtitle(r1);	 Catch:{ SecurityException -> 0x01cd }
    L_0x013f:
        r0 = r5.U;
        r0 = r0.size();
        if (r0 != 0) goto L_0x0160;
    L_0x0147:
        r0 = new com.whatsapp.l5;
        r1 = ab;
        r2 = 67;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = 2131230960; // 0x7f0800f0 float:1.8077988E38 double:1.0529680007E-314;
        r1 = r5.getString(r1);
        r0.q = r1;
        r1 = r5.U;
        r1.add(r0);
    L_0x0160:
        r0 = r5.z;
        r0 = r0.size();
        if (r0 != 0) goto L_0x0181;
    L_0x0168:
        r0 = new com.whatsapp.l5;
        r1 = ab;
        r2 = 68;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = 2131230958; // 0x7f0800ee float:1.8077983E38 double:1.0529679997E-314;
        r1 = r5.getString(r1);
        r0.q = r1;
        r1 = r5.z;
        r1.add(r0);
    L_0x0181:
        r0 = r5.v;
        r0 = r0.size();
        if (r0 != 0) goto L_0x01a2;
    L_0x0189:
        r0 = new com.whatsapp.l5;
        r1 = ab;
        r2 = 66;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = 2131230959; // 0x7f0800ef float:1.8077985E38 double:1.052968E-314;
        r1 = r5.getString(r1);
        r0.q = r1;
        r1 = r5.v;
        r1.add(r0);
    L_0x01a2:
        return;
    L_0x01a3:
        r0 = move-exception;
        throw r0;
    L_0x01a5:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01a7 }
    L_0x01a7:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01a9 }
    L_0x01a9:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01ab }
    L_0x01ab:
        r0 = move-exception;
        throw r0;
    L_0x01ad:
        r0 = move-exception;
        throw r0;
    L_0x01af:
        r0 = move-exception;
        throw r0;
    L_0x01b1:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01b3 }
    L_0x01b3:
        r0 = move-exception;
        throw r0;
    L_0x01b5:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01b7 }
    L_0x01b7:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01b9 }
    L_0x01b9:
        r0 = move-exception;
        throw r0;
    L_0x01bb:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01bd }
    L_0x01bd:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01bf }
    L_0x01bf:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01c1 }
    L_0x01c1:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01c3 }
    L_0x01c3:
        r0 = move-exception;
        throw r0;
    L_0x01c5:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01c7 }
    L_0x01c7:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01c9 }
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01cb }
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.i():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.ArrayList r9) {
        /*
        r8 = this;
        r7 = 2131231851; // 0x7f08046b float:1.8079795E38 double:1.052968441E-314;
        r6 = 1;
        r5 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.U;	 Catch:{ SecurityException -> 0x0181 }
        r0.clear();	 Catch:{ SecurityException -> 0x0181 }
        r0 = r8.z;	 Catch:{ SecurityException -> 0x0181 }
        r0.clear();	 Catch:{ SecurityException -> 0x0181 }
        r0 = r8.v;	 Catch:{ SecurityException -> 0x0181 }
        r0.clear();	 Catch:{ SecurityException -> 0x0181 }
        r0 = r8.J;	 Catch:{ SecurityException -> 0x0181 }
        if (r0 != 0) goto L_0x001e;
    L_0x001a:
        r0 = r8.T;	 Catch:{ SecurityException -> 0x0181 }
        if (r0 == 0) goto L_0x0057;
    L_0x001e:
        r0 = r8.x;
        r2 = r0.iterator();
    L_0x0024:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0055;
    L_0x002a:
        r0 = r2.next();
        r0 = (com.whatsapp.l5) r0;
        r3 = r0.l;	 Catch:{ SecurityException -> 0x0183 }
        if (r3 == 0) goto L_0x0053;
    L_0x0034:
        r3 = r0.c();	 Catch:{ SecurityException -> 0x0185 }
        if (r3 != 0) goto L_0x0053;
    L_0x003a:
        r3 = r0.a(r9);	 Catch:{ SecurityException -> 0x0187 }
        if (r3 == 0) goto L_0x0053;
    L_0x0040:
        r3 = r8.J;	 Catch:{ SecurityException -> 0x0189 }
        if (r3 != 0) goto L_0x004e;
    L_0x0044:
        r3 = r8.Q;	 Catch:{ SecurityException -> 0x018b }
        r4 = r0.p;	 Catch:{ SecurityException -> 0x018b }
        r3 = r3.contains(r4);	 Catch:{ SecurityException -> 0x018b }
        if (r3 != 0) goto L_0x0053;
    L_0x004e:
        r3 = r8.z;	 Catch:{ SecurityException -> 0x018b }
        r3.add(r0);	 Catch:{ SecurityException -> 0x018b }
    L_0x0053:
        if (r1 == 0) goto L_0x0024;
    L_0x0055:
        if (r1 == 0) goto L_0x00ea;
    L_0x0057:
        r0 = r8.I;	 Catch:{ SecurityException -> 0x018d }
        if (r0 == 0) goto L_0x0086;
    L_0x005b:
        r0 = r8.x;
        r2 = r0.iterator();
    L_0x0061:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0084;
    L_0x0067:
        r0 = r2.next();
        r0 = (com.whatsapp.l5) r0;
        r3 = com.whatsapp.App.aK;	 Catch:{ SecurityException -> 0x018f }
        r4 = r0.p;	 Catch:{ SecurityException -> 0x018f }
        r3 = r3.t(r4);	 Catch:{ SecurityException -> 0x018f }
        if (r3 == 0) goto L_0x0082;
    L_0x0077:
        r3 = r0.a(r9);	 Catch:{ SecurityException -> 0x0191 }
        if (r3 == 0) goto L_0x0082;
    L_0x007d:
        r3 = r8.U;	 Catch:{ SecurityException -> 0x0191 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x0191 }
    L_0x0082:
        if (r1 == 0) goto L_0x0061;
    L_0x0084:
        if (r1 == 0) goto L_0x00ea;
    L_0x0086:
        r0 = r8.x;
        r2 = r0.iterator();
    L_0x008c:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00ea;
    L_0x0092:
        r0 = r2.next();
        r0 = (com.whatsapp.l5) r0;
        r3 = r0.a(r9);	 Catch:{ SecurityException -> 0x0193 }
        if (r3 == 0) goto L_0x00e8;
    L_0x009e:
        r3 = r0.c();	 Catch:{ SecurityException -> 0x0195 }
        if (r3 != 0) goto L_0x00ad;
    L_0x00a4:
        r3 = r0.l;	 Catch:{ SecurityException -> 0x0197 }
        if (r3 == 0) goto L_0x00ad;
    L_0x00a8:
        r3 = r8.z;	 Catch:{ SecurityException -> 0x0197 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x0197 }
    L_0x00ad:
        r3 = r0.c();	 Catch:{ SecurityException -> 0x0199 }
        if (r3 == 0) goto L_0x00c2;
    L_0x00b3:
        r3 = r0.A();	 Catch:{ SecurityException -> 0x019b }
        if (r3 != 0) goto L_0x00c2;
    L_0x00b9:
        r3 = r0.q;	 Catch:{ SecurityException -> 0x019d }
        if (r3 == 0) goto L_0x00c2;
    L_0x00bd:
        r3 = r8.v;	 Catch:{ SecurityException -> 0x019d }
        r3.add(r0);	 Catch:{ SecurityException -> 0x019d }
    L_0x00c2:
        r3 = r0.c();	 Catch:{ SecurityException -> 0x019f }
        if (r3 == 0) goto L_0x00d9;
    L_0x00c8:
        r3 = r0.A();	 Catch:{ SecurityException -> 0x01a1 }
        if (r3 != 0) goto L_0x00e8;
    L_0x00ce:
        r3 = r0.q;	 Catch:{ SecurityException -> 0x01a3 }
        if (r3 == 0) goto L_0x00e8;
    L_0x00d2:
        r3 = r8.U;	 Catch:{ SecurityException -> 0x01a5 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01a5 }
        if (r1 == 0) goto L_0x00e8;
    L_0x00d9:
        r3 = com.whatsapp.App.aK;	 Catch:{ SecurityException -> 0x01a7 }
        r4 = r0.p;	 Catch:{ SecurityException -> 0x01a7 }
        r3 = r3.t(r4);	 Catch:{ SecurityException -> 0x01a7 }
        if (r3 == 0) goto L_0x00e8;
    L_0x00e3:
        r3 = r8.U;	 Catch:{ SecurityException -> 0x01a7 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01a7 }
    L_0x00e8:
        if (r1 == 0) goto L_0x008c;
    L_0x00ea:
        r0 = r8.U;
        r1 = new com.whatsapp.eh;
        r2 = r8.getApplicationContext();
        r1.<init>(r2);
        java.util.Collections.sort(r0, r1);
        r0 = r8.z;
        r1 = new com.whatsapp.a3d;
        r2 = r8.getApplicationContext();
        r1.<init>(r2);
        java.util.Collections.sort(r0, r1);
        r0 = r8.v;
        r1 = new com.whatsapp.a3d;
        r2 = r8.getApplicationContext();
        r1.<init>(r2);
        java.util.Collections.sort(r0, r1);
        r0 = r8.U;
        r0 = r0.size();
        if (r0 != 0) goto L_0x0138;
    L_0x011c:
        r0 = new com.whatsapp.l5;
        r1 = ab;
        r2 = 70;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = new java.lang.Object[r6];
        r2 = r8.L;
        r1[r5] = r2;
        r1 = r8.getString(r7, r1);
        r0.q = r1;
        r1 = r8.U;
        r1.add(r0);
    L_0x0138:
        r0 = r8.z;
        r0 = r0.size();
        if (r0 != 0) goto L_0x015c;
    L_0x0140:
        r0 = new com.whatsapp.l5;
        r1 = ab;
        r2 = 69;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = new java.lang.Object[r6];
        r2 = r8.L;
        r1[r5] = r2;
        r1 = r8.getString(r7, r1);
        r0.q = r1;
        r1 = r8.z;
        r1.add(r0);
    L_0x015c:
        r0 = r8.v;
        r0 = r0.size();
        if (r0 != 0) goto L_0x0180;
    L_0x0164:
        r0 = new com.whatsapp.l5;
        r1 = ab;
        r2 = 71;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = new java.lang.Object[r6];
        r2 = r8.L;
        r1[r5] = r2;
        r1 = r8.getString(r7, r1);
        r0.q = r1;
        r1 = r8.v;
        r1.add(r0);
    L_0x0180:
        return;
    L_0x0181:
        r0 = move-exception;
        throw r0;
    L_0x0183:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0185 }
    L_0x0185:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0187 }
    L_0x0187:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0189 }
    L_0x0189:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x018b }
    L_0x018b:
        r0 = move-exception;
        throw r0;
    L_0x018d:
        r0 = move-exception;
        throw r0;
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        throw r0;
    L_0x0193:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0195 }
    L_0x0195:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0197 }
    L_0x0197:
        r0 = move-exception;
        throw r0;
    L_0x0199:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x019b }
    L_0x019b:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x019d }
    L_0x019d:
        r0 = move-exception;
        throw r0;
    L_0x019f:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01a1 }
    L_0x01a1:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01a3 }
    L_0x01a3:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01a5 }
    L_0x01a5:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01a7 }
    L_0x01a7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.a(java.util.ArrayList):void");
    }

    public void a() {
        try {
            if (!C) {
                n();
                d();
                setSupportProgressBarIndeterminateVisibility(i.a());
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    public void d(String str) {
        try {
            if (l5.a(this.x, new aas(App.as.b(str)))) {
                d();
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    static boolean p(ContactPicker contactPicker) {
        return contactPicker.E;
    }

    public void c(String str) {
        try {
            if (l5.a(this.x, new aad(App.as.b(str)))) {
                d();
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    protected void b() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ContactPicker.b():void. bs: [B:246:0x0332, B:305:0x049a]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r14 = this;
        r13 = 4;
        r12 = 2131232023; // 0x7f080517 float:1.8080144E38 double:1.052968526E-314;
        r2 = 0;
        r11 = 1;
        r4 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r6 = r14.getIntent();
        r0 = r6.getAction();	 Catch:{ Exception -> 0x0143 }
        if (r0 == 0) goto L_0x0028;	 Catch:{ Exception -> 0x0143 }
    L_0x0013:
        r0 = r6.getAction();	 Catch:{ Exception -> 0x0143 }
        r1 = ab;	 Catch:{ Exception -> 0x0143 }
        r3 = 15;	 Catch:{ Exception -> 0x0143 }
        r1 = r1[r3];	 Catch:{ Exception -> 0x0143 }
        r0 = r0.equals(r1);	 Catch:{ Exception -> 0x0143 }
        if (r0 == 0) goto L_0x0028;
    L_0x0023:
        r0 = 1;
        r14.X = r0;	 Catch:{ Exception -> 0x0145 }
        if (r5 == 0) goto L_0x07b8;
    L_0x0028:
        r0 = ab;	 Catch:{ Exception -> 0x0147 }
        r1 = 20;	 Catch:{ Exception -> 0x0147 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0147 }
        r1 = 0;	 Catch:{ Exception -> 0x0147 }
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x0147 }
        if (r0 == 0) goto L_0x003a;
    L_0x0035:
        r0 = 1;
        r14.y = r0;	 Catch:{ Exception -> 0x0149 }
        if (r5 == 0) goto L_0x07b8;
    L_0x003a:
        r0 = ab;	 Catch:{ Exception -> 0x014b }
        r1 = 48;	 Catch:{ Exception -> 0x014b }
        r0 = r0[r1];	 Catch:{ Exception -> 0x014b }
        r1 = 0;	 Catch:{ Exception -> 0x014b }
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x014b }
        if (r0 == 0) goto L_0x0058;
    L_0x0047:
        r0 = 1;
        r14.E = r0;	 Catch:{ Exception -> 0x014d }
        r0 = ab;	 Catch:{ Exception -> 0x014d }
        r1 = 37;	 Catch:{ Exception -> 0x014d }
        r0 = r0[r1];	 Catch:{ Exception -> 0x014d }
        r0 = r6.getIntegerArrayListExtra(r0);	 Catch:{ Exception -> 0x014d }
        r14.B = r0;	 Catch:{ Exception -> 0x014d }
        if (r5 == 0) goto L_0x07b8;
    L_0x0058:
        r0 = ab;	 Catch:{ Exception -> 0x014f }
        r1 = 32;	 Catch:{ Exception -> 0x014f }
        r0 = r0[r1];	 Catch:{ Exception -> 0x014f }
        r1 = 0;	 Catch:{ Exception -> 0x014f }
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x014f }
        if (r0 == 0) goto L_0x0074;
    L_0x0065:
        r0 = r14.getSupportActionBar();	 Catch:{ Exception -> 0x0151 }
        r1 = 2131230957; // 0x7f0800ed float:1.8077981E38 double:1.052967999E-314;	 Catch:{ Exception -> 0x0151 }
        r0.setTitle(r1);	 Catch:{ Exception -> 0x0151 }
        r0 = 1;	 Catch:{ Exception -> 0x0151 }
        r14.K = r0;	 Catch:{ Exception -> 0x0151 }
        if (r5 == 0) goto L_0x07b8;
    L_0x0074:
        r0 = ab;	 Catch:{ Exception -> 0x0153 }
        r1 = 21;	 Catch:{ Exception -> 0x0153 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0153 }
        r0 = r6.getStringExtra(r0);	 Catch:{ Exception -> 0x0153 }
        r14.M = r0;	 Catch:{ Exception -> 0x0153 }
        if (r0 == 0) goto L_0x009e;
    L_0x0082:
        r0 = 1;
        r14.J = r0;	 Catch:{ Exception -> 0x0155 }
        r0 = 1;	 Catch:{ Exception -> 0x0155 }
        r14.Z = r0;	 Catch:{ Exception -> 0x0155 }
        r0 = r14.Q;	 Catch:{ Exception -> 0x0155 }
        r0.clear();	 Catch:{ Exception -> 0x0155 }
        r0 = r14.Q;	 Catch:{ Exception -> 0x0155 }
        r1 = r14.M;	 Catch:{ Exception -> 0x0155 }
        r1 = com.whatsapp.qm.c(r1);	 Catch:{ Exception -> 0x0155 }
        r1 = r1.l();	 Catch:{ Exception -> 0x0155 }
        r0.addAll(r1);	 Catch:{ Exception -> 0x0155 }
        if (r5 == 0) goto L_0x07b8;
    L_0x009e:
        r0 = ab;	 Catch:{ Exception -> 0x0157 }
        r1 = 35;	 Catch:{ Exception -> 0x0157 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0157 }
        r1 = 0;	 Catch:{ Exception -> 0x0157 }
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x0157 }
        if (r0 == 0) goto L_0x00ba;
    L_0x00ab:
        r0 = r14.getSupportActionBar();	 Catch:{ Exception -> 0x0159 }
        r1 = 2131230956; // 0x7f0800ec float:1.807798E38 double:1.0529679987E-314;	 Catch:{ Exception -> 0x0159 }
        r0.setTitle(r1);	 Catch:{ Exception -> 0x0159 }
        r0 = 1;	 Catch:{ Exception -> 0x0159 }
        r14.I = r0;	 Catch:{ Exception -> 0x0159 }
        if (r5 == 0) goto L_0x07b8;
    L_0x00ba:
        r0 = ab;	 Catch:{ Exception -> 0x015b }
        r1 = 16;	 Catch:{ Exception -> 0x015b }
        r0 = r0[r1];	 Catch:{ Exception -> 0x015b }
        r1 = 0;	 Catch:{ Exception -> 0x015b }
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x015b }
        if (r0 == 0) goto L_0x00f8;
    L_0x00c7:
        r14.T = r11;
        r0 = ab;
        r1 = 7;
        r0 = r0[r1];
        r0 = r6.getStringExtra(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x00d4:
        r1 = r0.length();	 Catch:{ Exception -> 0x015d }
        if (r1 <= r11) goto L_0x00f6;
    L_0x00da:
        r1 = ",";
        r1 = r0.split(r1);
        r3 = r1.length;
        r0 = r4;
    L_0x00e3:
        if (r0 >= r3) goto L_0x00f6;
    L_0x00e5:
        r7 = r1[r0];
        r8 = r7.length();	 Catch:{ Exception -> 0x015f }
        if (r8 <= 0) goto L_0x00f2;	 Catch:{ Exception -> 0x015f }
    L_0x00ed:
        r8 = r14.Q;	 Catch:{ Exception -> 0x015f }
        r8.add(r7);	 Catch:{ Exception -> 0x015f }
    L_0x00f2:
        r0 = r0 + 1;
        if (r5 == 0) goto L_0x00e3;
    L_0x00f6:
        if (r5 == 0) goto L_0x07b8;
    L_0x00f8:
        r0 = ab;	 Catch:{ Exception -> 0x0161 }
        r1 = 36;	 Catch:{ Exception -> 0x0161 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0161 }
        r1 = r6.getScheme();	 Catch:{ Exception -> 0x0161 }
        r0 = r0.equals(r1);	 Catch:{ Exception -> 0x0161 }
        if (r0 == 0) goto L_0x0184;
    L_0x0108:
        r0 = r6.getData();
        if (r0 == 0) goto L_0x0171;
    L_0x010e:
        r1 = ab;	 Catch:{ Exception -> 0x0163 }
        r3 = 2;	 Catch:{ Exception -> 0x0163 }
        r1 = r1[r3];	 Catch:{ Exception -> 0x0163 }
        r3 = r0.getHost();	 Catch:{ Exception -> 0x0163 }
        r1 = r1.equals(r3);	 Catch:{ Exception -> 0x0163 }
        if (r1 == 0) goto L_0x0171;
    L_0x011d:
        r1 = 0;
        r14.r = r1;	 Catch:{ Exception -> 0x0165 }
        r1 = ab;	 Catch:{ Exception -> 0x0165 }
        r3 = 46;	 Catch:{ Exception -> 0x0165 }
        r1 = r1[r3];	 Catch:{ Exception -> 0x0165 }
        r0 = r0.getQueryParameter(r1);	 Catch:{ Exception -> 0x0165 }
        r14.G = r0;	 Catch:{ Exception -> 0x0165 }
        r0 = r14.G;	 Catch:{ Exception -> 0x0165 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x0165 }
        if (r0 == 0) goto L_0x0169;
    L_0x0134:
        r0 = r14.getBaseContext();	 Catch:{ Exception -> 0x0167 }
        r1 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;	 Catch:{ Exception -> 0x0167 }
        r2 = 0;	 Catch:{ Exception -> 0x0167 }
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ Exception -> 0x0167 }
        r14.finish();	 Catch:{ Exception -> 0x0167 }
    L_0x0142:
        return;
    L_0x0143:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0145 }
    L_0x0145:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0147 }
    L_0x0147:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0149 }
    L_0x0149:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x014b }
    L_0x014b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x014d }
    L_0x014d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x014f }
    L_0x014f:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0151 }
    L_0x0151:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0153 }
    L_0x0153:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0155 }
    L_0x0155:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0157 }
    L_0x0157:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0159 }
    L_0x0159:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x015b }
    L_0x015b:
        r0 = move-exception;
        throw r0;
    L_0x015d:
        r0 = move-exception;
        throw r0;
    L_0x015f:
        r0 = move-exception;
        throw r0;
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0165 }
    L_0x0165:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0167 }
    L_0x0167:
        r0 = move-exception;
        throw r0;
    L_0x0169:
        r0 = 0;
        r14.Z = r0;	 Catch:{ Exception -> 0x0180 }
        r0 = 1;	 Catch:{ Exception -> 0x0180 }
        r14.t = r0;	 Catch:{ Exception -> 0x0180 }
        if (r5 == 0) goto L_0x0182;	 Catch:{ Exception -> 0x0180 }
    L_0x0171:
        r0 = r14.getBaseContext();	 Catch:{ Exception -> 0x0180 }
        r1 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;	 Catch:{ Exception -> 0x0180 }
        r2 = 0;	 Catch:{ Exception -> 0x0180 }
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ Exception -> 0x0180 }
        r14.finish();	 Catch:{ Exception -> 0x0180 }
        goto L_0x0142;
    L_0x0180:
        r0 = move-exception;
        throw r0;
    L_0x0182:
        if (r5 == 0) goto L_0x07b8;
    L_0x0184:
        r0 = r6.getExtras();	 Catch:{ Exception -> 0x01e7 }
        if (r0 == 0) goto L_0x07b8;
    L_0x018a:
        r0 = r14.aa;	 Catch:{ Exception -> 0x01e9 }
        if (r0 != 0) goto L_0x07b8;
    L_0x018e:
        r0 = 1;
        r14.Z = r0;	 Catch:{ Exception -> 0x01eb }
        r0 = 1;	 Catch:{ Exception -> 0x01eb }
        r14.t = r0;	 Catch:{ Exception -> 0x01eb }
        r0 = r14.getIntent();	 Catch:{ Exception -> 0x01eb }
        r0 = r0.getType();	 Catch:{ Exception -> 0x01eb }
        r14.q = r0;	 Catch:{ Exception -> 0x01eb }
        r0 = r14.q;	 Catch:{ Exception -> 0x01eb }
        if (r0 != 0) goto L_0x01f1;
    L_0x01a2:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01ed }
        r0.<init>();	 Catch:{ Exception -> 0x01ed }
        r1 = ab;	 Catch:{ Exception -> 0x01ed }
        r3 = 43;	 Catch:{ Exception -> 0x01ed }
        r1 = r1[r3];	 Catch:{ Exception -> 0x01ed }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x01ed }
        r1 = r6.toString();	 Catch:{ Exception -> 0x01ed }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x01ed }
        r0 = r0.toString();	 Catch:{ Exception -> 0x01ed }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x01ed }
        r0 = r14.getIntent();	 Catch:{ Exception -> 0x01ed }
        r1 = ab;	 Catch:{ Exception -> 0x01ed }
        r3 = 29;	 Catch:{ Exception -> 0x01ed }
        r1 = r1[r3];	 Catch:{ Exception -> 0x01ed }
        r0 = r0.hasExtra(r1);	 Catch:{ Exception -> 0x01ed }
        if (r0 == 0) goto L_0x01d5;
    L_0x01d0:
        r0 = 0;
        r14.r = r0;	 Catch:{ Exception -> 0x01ef }
        if (r5 == 0) goto L_0x01fc;
    L_0x01d5:
        r0 = r14.getBaseContext();	 Catch:{ Exception -> 0x01e5 }
        r1 = 2131232023; // 0x7f080517 float:1.8080144E38 double:1.052968526E-314;	 Catch:{ Exception -> 0x01e5 }
        r2 = 0;	 Catch:{ Exception -> 0x01e5 }
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ Exception -> 0x01e5 }
        r14.finish();	 Catch:{ Exception -> 0x01e5 }
        goto L_0x0142;
    L_0x01e5:
        r0 = move-exception;
        throw r0;
    L_0x01e7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01e9 }
    L_0x01e9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01eb }
    L_0x01eb:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01ed }
    L_0x01ed:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01ef }
    L_0x01ef:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01e5 }
    L_0x01f1:
        r0 = r14.getIntent();
        r0 = r0.getType();
        r14.a(r0);
    L_0x01fc:
        r0 = r14.r;	 Catch:{ Exception -> 0x034a }
        if (r0 != 0) goto L_0x0224;	 Catch:{ Exception -> 0x034a }
    L_0x0200:
        r0 = r14.getIntent();	 Catch:{ Exception -> 0x034a }
        r1 = ab;	 Catch:{ Exception -> 0x034a }
        r3 = 8;	 Catch:{ Exception -> 0x034a }
        r1 = r1[r3];	 Catch:{ Exception -> 0x034a }
        r0 = r0.hasExtra(r1);	 Catch:{ Exception -> 0x034a }
        if (r0 != 0) goto L_0x0224;
    L_0x0210:
        r0 = r14.getIntent();	 Catch:{ Exception -> 0x034c }
        r1 = ab;	 Catch:{ Exception -> 0x034c }
        r3 = 24;	 Catch:{ Exception -> 0x034c }
        r1 = r1[r3];	 Catch:{ Exception -> 0x034c }
        r0 = r0.hasExtra(r1);	 Catch:{ Exception -> 0x034c }
        if (r0 == 0) goto L_0x0224;
    L_0x0220:
        r0 = 9;
        r14.r = r0;	 Catch:{ Exception -> 0x034e }
    L_0x0224:
        r0 = r14.r;
        if (r0 == 0) goto L_0x0280;
    L_0x0228:
        r0 = com.whatsapp.App.w;	 Catch:{ Exception -> 0x027f }
        r1 = 4;	 Catch:{ Exception -> 0x027f }
        r3 = 1;	 Catch:{ Exception -> 0x027f }
        r0 = r0.getRecentTasks(r1, r3);	 Catch:{ Exception -> 0x027f }
        r1 = r0.iterator();	 Catch:{ Exception -> 0x027f }
    L_0x0234:
        r0 = r1.hasNext();	 Catch:{ Exception -> 0x027f }
        if (r0 == 0) goto L_0x0280;	 Catch:{ Exception -> 0x027f }
    L_0x023a:
        r0 = r1.next();	 Catch:{ Exception -> 0x027f }
        r0 = (android.app.ActivityManager.RecentTaskInfo) r0;	 Catch:{ Exception -> 0x027f }
        r0 = r0.baseIntent;	 Catch:{ Exception -> 0x027f }
        if (r0 == 0) goto L_0x0352;	 Catch:{ Exception -> 0x027f }
    L_0x0244:
        r0 = r0.getComponent();	 Catch:{ Exception -> 0x027f }
        if (r0 == 0) goto L_0x0352;	 Catch:{ Exception -> 0x027f }
    L_0x024a:
        r0 = r0.getPackageName();	 Catch:{ Exception -> 0x027f }
        r3 = ab;	 Catch:{ Exception -> 0x0350 }
        r7 = 33;	 Catch:{ Exception -> 0x0350 }
        r3 = r3[r7];	 Catch:{ Exception -> 0x0350 }
        r3 = r3.equals(r0);	 Catch:{ Exception -> 0x0350 }
        if (r3 != 0) goto L_0x0266;	 Catch:{ Exception -> 0x0350 }
    L_0x025a:
        r3 = ab;	 Catch:{ Exception -> 0x0350 }
        r7 = 50;	 Catch:{ Exception -> 0x0350 }
        r3 = r3[r7];	 Catch:{ Exception -> 0x0350 }
        r0 = r3.equals(r0);	 Catch:{ Exception -> 0x0350 }
        if (r0 == 0) goto L_0x0352;
    L_0x0266:
        r0 = ab;	 Catch:{ Exception -> 0x027f }
        r1 = 17;	 Catch:{ Exception -> 0x027f }
        r0 = r0[r1];	 Catch:{ Exception -> 0x027f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x027f }
        r0 = r14.getBaseContext();	 Catch:{ Exception -> 0x027f }
        r1 = 2131230893; // 0x7f0800ad float:1.8077852E38 double:1.0529679676E-314;	 Catch:{ Exception -> 0x027f }
        r3 = 0;	 Catch:{ Exception -> 0x027f }
        com.whatsapp.App.a(r0, r1, r3);	 Catch:{ Exception -> 0x027f }
        r14.finish();	 Catch:{ Exception -> 0x027f }
        goto L_0x0142;
    L_0x027f:
        r0 = move-exception;
    L_0x0280:
        r0 = r14.r;
        if (r0 != 0) goto L_0x02c8;
    L_0x0284:
        r0 = r14.getIntent();
        r1 = ab;
        r3 = 47;
        r1 = r1[r3];
        r0 = r0.getStringExtra(r1);
        if (r0 == 0) goto L_0x02b9;
    L_0x0294:
        r1 = r0.getBytes();
        r3 = r1.length;
        r7 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r3 <= r7) goto L_0x02a4;
    L_0x029d:
        r0 = new java.lang.String;
        r3 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0.<init>(r1, r4, r3);
    L_0x02a4:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r14.G;
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        r14.G = r0;
    L_0x02b9:
        r0 = r14.G;	 Catch:{ Exception -> 0x0356 }
        r0 = com.whatsapp.util.ac.d(r0);	 Catch:{ Exception -> 0x0356 }
        r1 = 0;	 Catch:{ Exception -> 0x0356 }
        com.whatsapp.ae2.a(r0, r1);	 Catch:{ Exception -> 0x0356 }
        r0 = 0;	 Catch:{ Exception -> 0x0356 }
        r14.Z = r0;	 Catch:{ Exception -> 0x0356 }
        if (r5 == 0) goto L_0x07b8;	 Catch:{ Exception -> 0x0356 }
    L_0x02c8:
        r0 = r14.r;	 Catch:{ Exception -> 0x0356 }
        if (r0 != r13) goto L_0x04aa;
    L_0x02cc:
        r0 = ab;
        r1 = 19;
        r0 = r0[r1];
        r0 = r6.getParcelableExtra(r0);
        r0 = r0.toString();
        r3 = android.net.Uri.parse(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = ab;
        r7 = 3;
        r1 = r1[r7];
        r0 = r0.append(r1);
        r1 = r3.toString();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = -1;
        r1 = r3.getScheme();	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r7 = ab;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r8 = 30;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r7 = r7[r8];	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1 = r1.equals(r7);	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        if (r1 == 0) goto L_0x0378;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
    L_0x030c:
        r7 = new java.io.File;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1 = r3.getSchemeSpecificPart();	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r3 = 2;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1 = r1.substring(r3);	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r7.<init>(r1);	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1 = r7.exists();	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        if (r1 == 0) goto L_0x0358;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
    L_0x0320:
        r1 = new java.io.FileInputStream;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r0 = r7.getAbsolutePath();	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1.<init>(r0);	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r8 = r7.length();	 Catch:{ d -> 0x08de, IOException -> 0x08cd, all -> 0x08bc }
        r0 = (int) r8;
    L_0x032e:
        r3 = r1;
        r1 = r2;
    L_0x0330:
        if (r0 > 0) goto L_0x03f6;
    L_0x0332:
        r0 = r14.getBaseContext();	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r7 = 2131230893; // 0x7f0800ad float:1.8077852E38 double:1.0529679676E-314;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r8 = 0;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        com.whatsapp.App.a(r0, r7, r8);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r14.finish();	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        if (r1 == 0) goto L_0x0345;
    L_0x0342:
        r1.close();	 Catch:{ IOException -> 0x03d5 }
    L_0x0345:
        com.whatsapp.util.ao.a(r3);
        goto L_0x0142;
    L_0x034a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x034c }
    L_0x034c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x034e }
    L_0x034e:
        r0 = move-exception;
        throw r0;
    L_0x0350:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x027f }
    L_0x0352:
        if (r5 == 0) goto L_0x0234;
    L_0x0354:
        goto L_0x0280;
    L_0x0356:
        r0 = move-exception;
        throw r0;
    L_0x0358:
        r1 = new java.lang.StringBuilder;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1.<init>();	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r3 = ab;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r8 = 26;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r3 = r3[r8];	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1 = r1.append(r3);	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r3 = r7.getPath();	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1 = r1.append(r3);	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1 = r1.toString();	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        com.whatsapp.util.Log.e(r1);	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1 = r2;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        goto L_0x032e;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
    L_0x0378:
        r0 = com.whatsapp.App.at;	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1 = "r";	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        r1 = r0.openAssetFileDescriptor(r3, r1);	 Catch:{ d -> 0x08d9, IOException -> 0x08c8, all -> 0x05cd }
        if (r1 != 0) goto L_0x03ca;
    L_0x0383:
        r0 = new java.lang.StringBuilder;	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        r0.<init>();	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        r7 = ab;	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        r8 = 12;	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        r7 = r7[r8];	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        r0 = r0.append(r7);	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        r0 = r0.append(r3);	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        r0 = r0.toString();	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        com.whatsapp.App.e(r14, r0);	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        r14.finish();	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        if (r1 == 0) goto L_0x03a5;
    L_0x03a2:
        r1.close();	 Catch:{ IOException -> 0x03aa }
    L_0x03a5:
        com.whatsapp.util.ao.a(r2);
        goto L_0x0142;
    L_0x03aa:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = ab;
        r4 = 38;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x03a5;
    L_0x03ca:
        r3 = r1.createInputStream();	 Catch:{ d -> 0x08e3, IOException -> 0x08d2, all -> 0x08c1 }
        r8 = r1.getDeclaredLength();	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = (int) r8;
        goto L_0x0330;
    L_0x03d5:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = ab;
        r4 = 9;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0345;
    L_0x03f6:
        com.whatsapp.util.ag.a(r3);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = new byte[r0];	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r7 = r3.read(r0);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        if (r7 <= 0) goto L_0x04a0;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
    L_0x0401:
        r7 = new java.lang.String;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r7.<init>(r0);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = new java.lang.StringBuilder;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0.<init>();	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r8 = ab;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r9 = 45;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r8 = r8[r9];	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = r0.append(r8);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = r0.append(r7);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = r0.toString();	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = new l;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0.<init>();	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r8 = new h;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r8.<init>();	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r9 = ab;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r10 = 51;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r9 = r9[r10];	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = r0.a(r7, r9, r8);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        if (r0 != 0) goto L_0x0485;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
    L_0x0436:
        r0 = new java.lang.StringBuilder;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0.<init>();	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r8 = ab;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r9 = 44;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r8 = r8[r9];	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = r0.append(r8);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = r0.append(r7);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = r0.toString();	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = r14.getBaseContext();	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r7 = 2131232193; // 0x7f0805c1 float:1.8080488E38 double:1.05296861E-314;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r8 = 0;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        com.whatsapp.App.a(r0, r7, r8);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        if (r1 == 0) goto L_0x0460;
    L_0x045d:
        r1.close();	 Catch:{ IOException -> 0x0465 }
    L_0x0460:
        com.whatsapp.util.ao.a(r3);
        goto L_0x0142;
    L_0x0465:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = ab;
        r4 = 10;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0460;
    L_0x0485:
        r0 = 4;
        r14.r = r0;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r14.w = r7;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = r8.d;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r8 = 0;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = r0.get(r8);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = (s) r0;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r8 = 0;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        r0 = q.a(r0, r8, r7);	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
        if (r0 == 0) goto L_0x04a0;
    L_0x049a:
        r0 = r0.j;	 Catch:{ Exception -> 0x057e }
        r0 = r0.e;	 Catch:{ Exception -> 0x057e }
        r14.P = r0;	 Catch:{ Exception -> 0x057e }
    L_0x04a0:
        if (r1 == 0) goto L_0x04a5;
    L_0x04a2:
        r1.close();	 Catch:{ IOException -> 0x0590, d -> 0x058e }
    L_0x04a5:
        com.whatsapp.util.ao.a(r3);
    L_0x04a8:
        if (r5 == 0) goto L_0x07b8;
    L_0x04aa:
        r0 = ab;	 Catch:{ Exception -> 0x05fb }
        r1 = 49;	 Catch:{ Exception -> 0x05fb }
        r0 = r0[r1];	 Catch:{ Exception -> 0x05fb }
        r0 = r6.getParcelableArrayListExtra(r0);	 Catch:{ Exception -> 0x05fb }
        r14.Y = r0;	 Catch:{ Exception -> 0x05fb }
        r0 = r14.Y;	 Catch:{ Exception -> 0x05fb }
        if (r0 != 0) goto L_0x04f4;
    L_0x04ba:
        r0 = r6.getExtras();
        r1 = ab;
        r3 = 23;
        r1 = r1[r3];
        r0 = r0.getParcelable(r1);
        r0 = (android.net.Uri) r0;
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x05fd }
        r1.<init>();	 Catch:{ Exception -> 0x05fd }
        r3 = ab;	 Catch:{ Exception -> 0x05fd }
        r7 = 18;	 Catch:{ Exception -> 0x05fd }
        r3 = r3[r7];	 Catch:{ Exception -> 0x05fd }
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x05fd }
        r1 = r1.append(r0);	 Catch:{ Exception -> 0x05fd }
        r1 = r1.toString();	 Catch:{ Exception -> 0x05fd }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x05fd }
        if (r0 == 0) goto L_0x04f2;	 Catch:{ Exception -> 0x05fd }
    L_0x04e6:
        r1 = new java.util.ArrayList;	 Catch:{ Exception -> 0x05fd }
        r1.<init>();	 Catch:{ Exception -> 0x05fd }
        r14.Y = r1;	 Catch:{ Exception -> 0x05fd }
        r1 = r14.Y;	 Catch:{ Exception -> 0x05fd }
        r1.add(r0);	 Catch:{ Exception -> 0x05fd }
    L_0x04f2:
        if (r5 == 0) goto L_0x0542;
    L_0x04f4:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = ab;
        r3 = 13;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r14.Y;
        r1 = r1.size();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r14.Y;
        r1 = r0.iterator();
    L_0x051a:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0542;
    L_0x0520:
        r0 = r1.next();
        r0 = (android.net.Uri) r0;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r7 = ab;
        r8 = 39;
        r7 = r7[r8];
        r3 = r3.append(r7);
        r0 = r3.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r5 == 0) goto L_0x051a;
    L_0x0542:
        r0 = r14.Y;	 Catch:{ Exception -> 0x05ff }
        if (r0 == 0) goto L_0x054e;	 Catch:{ Exception -> 0x05ff }
    L_0x0546:
        r0 = r14.Y;	 Catch:{ Exception -> 0x05ff }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x05ff }
        if (r0 == 0) goto L_0x0601;
    L_0x054e:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x057c }
        r0.<init>();	 Catch:{ Exception -> 0x057c }
        r1 = ab;	 Catch:{ Exception -> 0x057c }
        r2 = 28;	 Catch:{ Exception -> 0x057c }
        r1 = r1[r2];	 Catch:{ Exception -> 0x057c }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x057c }
        r1 = r6.toString();	 Catch:{ Exception -> 0x057c }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x057c }
        r0 = r0.toString();	 Catch:{ Exception -> 0x057c }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x057c }
        r0 = r14.getBaseContext();	 Catch:{ Exception -> 0x057c }
        r1 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;	 Catch:{ Exception -> 0x057c }
        r2 = 0;	 Catch:{ Exception -> 0x057c }
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ Exception -> 0x057c }
        r14.finish();	 Catch:{ Exception -> 0x057c }
        goto L_0x0142;
    L_0x057c:
        r0 = move-exception;
        throw r0;
    L_0x057e:
        r0 = move-exception;
        throw r0;	 Catch:{ d -> 0x0580, IOException -> 0x08d6 }
    L_0x0580:
        r0 = move-exception;
    L_0x0581:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x08c5 }
        if (r1 == 0) goto L_0x0589;
    L_0x0586:
        r1.close();	 Catch:{ IOException -> 0x05af }
    L_0x0589:
        com.whatsapp.util.ao.a(r3);
        goto L_0x04a8;
    L_0x058e:
        r0 = move-exception;
        throw r0;
    L_0x0590:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r7 = ab;
        r7 = r7[r13];
        r1 = r1.append(r7);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x04a5;
    L_0x05af:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r7 = ab;
        r7 = r7[r11];
        r1 = r1.append(r7);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0589;
    L_0x05cd:
        r0 = move-exception;
        r1 = r2;
        r3 = r2;
    L_0x05d0:
        if (r1 == 0) goto L_0x05d5;
    L_0x05d2:
        r1.close();	 Catch:{ IOException -> 0x05db, d -> 0x05d9 }
    L_0x05d5:
        com.whatsapp.util.ao.a(r3);
        throw r0;
    L_0x05d9:
        r0 = move-exception;
        throw r0;
    L_0x05db:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = ab;
        r5 = 41;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x05d5;
    L_0x05fb:
        r0 = move-exception;
        throw r0;
    L_0x05fd:
        r0 = move-exception;
        throw r0;
    L_0x05ff:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x057c }
    L_0x0601:
        r0 = r14.r;	 Catch:{ Exception -> 0x0662 }
        r1 = -1;	 Catch:{ Exception -> 0x0662 }
        if (r0 != r1) goto L_0x0664;	 Catch:{ Exception -> 0x0662 }
    L_0x0606:
        r0 = r14.Y;	 Catch:{ Exception -> 0x0662 }
        r1 = 0;	 Catch:{ Exception -> 0x0662 }
        r0 = r0.get(r1);	 Catch:{ Exception -> 0x0662 }
        r0 = (android.net.Uri) r0;	 Catch:{ Exception -> 0x0662 }
        r0 = com.whatsapp.util.ag.e(r0);	 Catch:{ Exception -> 0x0662 }
        r14.r = r0;	 Catch:{ Exception -> 0x0662 }
        r0 = r14.r;	 Catch:{ Exception -> 0x0662 }
        r1 = -1;
        if (r0 != r1) goto L_0x0664;
    L_0x061a:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0660 }
        r0.<init>();	 Catch:{ Exception -> 0x0660 }
        r1 = ab;	 Catch:{ Exception -> 0x0660 }
        r2 = 5;	 Catch:{ Exception -> 0x0660 }
        r1 = r1[r2];	 Catch:{ Exception -> 0x0660 }
        r1 = r0.append(r1);	 Catch:{ Exception -> 0x0660 }
        r0 = r14.Y;	 Catch:{ Exception -> 0x0660 }
        r2 = 0;	 Catch:{ Exception -> 0x0660 }
        r0 = r0.get(r2);	 Catch:{ Exception -> 0x0660 }
        r0 = (android.net.Uri) r0;	 Catch:{ Exception -> 0x0660 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0660 }
        r0 = r1.append(r0);	 Catch:{ Exception -> 0x0660 }
        r1 = " ";	 Catch:{ Exception -> 0x0660 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0660 }
        r1 = r14.q;	 Catch:{ Exception -> 0x0660 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0660 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0660 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x0660 }
        r0 = r14.getBaseContext();	 Catch:{ Exception -> 0x0660 }
        r1 = 2131232023; // 0x7f080517 float:1.8080144E38 double:1.052968526E-314;	 Catch:{ Exception -> 0x0660 }
        r2 = 0;	 Catch:{ Exception -> 0x0660 }
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ Exception -> 0x0660 }
        r0 = 0;	 Catch:{ Exception -> 0x0660 }
        r14.Y = r0;	 Catch:{ Exception -> 0x0660 }
        r14.finish();	 Catch:{ Exception -> 0x0660 }
        goto L_0x0142;
    L_0x0660:
        r0 = move-exception;
        throw r0;
    L_0x0662:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0660 }
    L_0x0664:
        r0 = r14.r;	 Catch:{ Exception -> 0x06ac }
        r1 = 9;	 Catch:{ Exception -> 0x06ac }
        if (r0 != r1) goto L_0x06b2;	 Catch:{ Exception -> 0x06ac }
    L_0x066a:
        r0 = r14.q;	 Catch:{ Exception -> 0x06ac }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x06ac }
        if (r0 != 0) goto L_0x0680;
    L_0x0672:
        r0 = r14.q;	 Catch:{ Exception -> 0x06ae }
        r1 = ab;	 Catch:{ Exception -> 0x06ae }
        r3 = 14;	 Catch:{ Exception -> 0x06ae }
        r1 = r1[r3];	 Catch:{ Exception -> 0x06ae }
        r0 = r0.contains(r1);	 Catch:{ Exception -> 0x06ae }
        if (r0 == 0) goto L_0x068f;
    L_0x0680:
        r0 = r14.Y;	 Catch:{ Exception -> 0x06b0 }
        r1 = 0;	 Catch:{ Exception -> 0x06b0 }
        r0 = r0.get(r1);	 Catch:{ Exception -> 0x06b0 }
        r0 = (android.net.Uri) r0;	 Catch:{ Exception -> 0x06b0 }
        r0 = com.whatsapp.util.ag.h(r0);	 Catch:{ Exception -> 0x06b0 }
        r14.q = r0;	 Catch:{ Exception -> 0x06b0 }
    L_0x068f:
        r0 = r14.q;	 Catch:{ Exception -> 0x06aa }
        r0 = com.whatsapp.a59.b(r0);	 Catch:{ Exception -> 0x06aa }
        if (r0 != 0) goto L_0x06b2;	 Catch:{ Exception -> 0x06aa }
    L_0x0697:
        r0 = r14.getBaseContext();	 Catch:{ Exception -> 0x06aa }
        r1 = 2131232023; // 0x7f080517 float:1.8080144E38 double:1.052968526E-314;	 Catch:{ Exception -> 0x06aa }
        r2 = 0;	 Catch:{ Exception -> 0x06aa }
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ Exception -> 0x06aa }
        r0 = 0;	 Catch:{ Exception -> 0x06aa }
        r14.Y = r0;	 Catch:{ Exception -> 0x06aa }
        r14.finish();	 Catch:{ Exception -> 0x06aa }
        goto L_0x0142;
    L_0x06aa:
        r0 = move-exception;
        throw r0;
    L_0x06ac:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x06ae }
    L_0x06ae:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x06b0 }
    L_0x06b0:
        r0 = move-exception;
        throw r0;
    L_0x06b2:
        r0 = r14.Y;	 Catch:{ Exception -> 0x06cf }
        r0 = r0.size();	 Catch:{ Exception -> 0x06cf }
        r1 = 10;	 Catch:{ Exception -> 0x06cf }
        if (r0 <= r1) goto L_0x06d1;	 Catch:{ Exception -> 0x06cf }
    L_0x06bc:
        r0 = r14.getBaseContext();	 Catch:{ Exception -> 0x06cf }
        r1 = 2131232024; // 0x7f080518 float:1.8080146E38 double:1.0529685264E-314;	 Catch:{ Exception -> 0x06cf }
        r2 = 0;	 Catch:{ Exception -> 0x06cf }
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ Exception -> 0x06cf }
        r0 = 0;	 Catch:{ Exception -> 0x06cf }
        r14.Y = r0;	 Catch:{ Exception -> 0x06cf }
        r14.finish();	 Catch:{ Exception -> 0x06cf }
        goto L_0x0142;
    L_0x06cf:
        r0 = move-exception;
        throw r0;
    L_0x06d1:
        r0 = r14.Y;
        r3 = r0.iterator();
    L_0x06d7:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0750;
    L_0x06dd:
        r0 = r3.next();
        r0 = (android.net.Uri) r0;
        r1 = r0.toString();	 Catch:{ Exception -> 0x0724 }
        r7 = ab;	 Catch:{ Exception -> 0x0724 }
        r8 = 31;	 Catch:{ Exception -> 0x0724 }
        r7 = r7[r8];	 Catch:{ Exception -> 0x0724 }
        r1 = r1.contains(r7);	 Catch:{ Exception -> 0x0724 }
        if (r1 == 0) goto L_0x0726;	 Catch:{ Exception -> 0x0724 }
    L_0x06f3:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0724 }
        r1.<init>();	 Catch:{ Exception -> 0x0724 }
        r2 = ab;	 Catch:{ Exception -> 0x0724 }
        r3 = 34;	 Catch:{ Exception -> 0x0724 }
        r2 = r2[r3];	 Catch:{ Exception -> 0x0724 }
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x0724 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0724 }
        r0 = r1.append(r0);	 Catch:{ Exception -> 0x0724 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0724 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x0724 }
        r0 = r14.getBaseContext();	 Catch:{ Exception -> 0x0724 }
        r1 = 2131232023; // 0x7f080517 float:1.8080144E38 double:1.052968526E-314;	 Catch:{ Exception -> 0x0724 }
        r2 = 0;	 Catch:{ Exception -> 0x0724 }
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ Exception -> 0x0724 }
        r0 = 0;	 Catch:{ Exception -> 0x0724 }
        r14.Y = r0;	 Catch:{ Exception -> 0x0724 }
        r14.finish();	 Catch:{ Exception -> 0x0724 }
        goto L_0x0142;
    L_0x0724:
        r0 = move-exception;
        throw r0;
    L_0x0726:
        r1 = ab;	 Catch:{ Exception -> 0x085f }
        r7 = 27;	 Catch:{ Exception -> 0x085f }
        r1 = r1[r7];	 Catch:{ Exception -> 0x085f }
        r7 = r0.getScheme();	 Catch:{ Exception -> 0x085f }
        r1 = r1.equalsIgnoreCase(r7);	 Catch:{ Exception -> 0x085f }
        if (r1 != 0) goto L_0x073c;	 Catch:{ Exception -> 0x085f }
    L_0x0736:
        r1 = r0.getScheme();	 Catch:{ Exception -> 0x085f }
        if (r1 != 0) goto L_0x074e;
    L_0x073c:
        r1 = r0.getScheme();	 Catch:{ Exception -> 0x0861 }
        if (r1 != 0) goto L_0x0865;
    L_0x0742:
        r1 = r0.toString();	 Catch:{ Exception -> 0x0863 }
    L_0x0746:
        r7 = new java.io.File;
        r7.<init>(r1);
        com.whatsapp.util.ag.a(r14, r7);	 Catch:{ IOException -> 0x0870 }
    L_0x074e:
        if (r5 == 0) goto L_0x06d7;
    L_0x0750:
        r0 = r14.Y;
        r1 = r0.iterator();
    L_0x0756:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x076e;
    L_0x075c:
        r0 = r1.next();
        r0 = (android.net.Uri) r0;
        r3 = ab;	 Catch:{ SecurityException -> 0x0895 }
        r4 = 42;	 Catch:{ SecurityException -> 0x0895 }
        r3 = r3[r4];	 Catch:{ SecurityException -> 0x0895 }
        r4 = 1;	 Catch:{ SecurityException -> 0x0895 }
        r14.grantUriPermission(r3, r0, r4);	 Catch:{ SecurityException -> 0x0895 }
    L_0x076c:
        if (r5 == 0) goto L_0x0756;
    L_0x076e:
        r0 = r14.getIntent();
        r1 = ab;
        r3 = 22;
        r1 = r1[r3];
        r1 = r0.getStringExtra(r1);
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x07b8;
    L_0x0782:
        r3 = new java.util.ArrayList;
        r0 = r14.Y;
        r0 = r0.size();
        r3.<init>(r0);
        r0 = r14.Y;
        r4 = r0.iterator();
    L_0x0793:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x07b6;
    L_0x0799:
        r0 = r4.next();
        r0 = (android.net.Uri) r0;
        r0 = r0.buildUpon();
        r7 = ab;
        r8 = 25;
        r7 = r7[r8];
        r0 = r0.appendQueryParameter(r7, r1);
        r0 = r0.build();
        r3.add(r0);
        if (r5 == 0) goto L_0x0793;
    L_0x07b6:
        r14.Y = r3;
    L_0x07b8:
        r0 = ab;
        r1 = 6;
        r0 = r0[r1];
        r0 = r6.getStringExtra(r0);
        if (r0 == 0) goto L_0x07ce;
    L_0x07c3:
        r1 = com.whatsapp.App.as;
        r0 = r1.f(r0);
        if (r0 == 0) goto L_0x07ce;
    L_0x07cb:
        r14.b(r0);	 Catch:{ Exception -> 0x08b2 }
    L_0x07ce:
        r0 = 2131755457; // 0x7f1001c1 float:1.9141794E38 double:1.0532271366E-314;
        r0 = r14.findViewById(r0);
        r0 = (com.whatsapp.PagerSlidingTabStrip) r0;
        r14.n();
        r3 = new com.whatsapp.cg;
        r3.<init>(r14, r2);
        r1 = 2131755458; // 0x7f1001c2 float:1.9141796E38 double:1.053227137E-314;
        r1 = r14.findViewById(r1);	 Catch:{ Exception -> 0x08b4 }
        r1 = (android.support.v4.view.ViewPager) r1;	 Catch:{ Exception -> 0x08b4 }
        r14.o = r1;	 Catch:{ Exception -> 0x08b4 }
        r1 = r14.o;	 Catch:{ Exception -> 0x08b4 }
        r2 = 3;	 Catch:{ Exception -> 0x08b4 }
        r1.setOffscreenPageLimit(r2);	 Catch:{ Exception -> 0x08b4 }
        r1 = r14.o;	 Catch:{ Exception -> 0x08b4 }
        r1.setAdapter(r3);	 Catch:{ Exception -> 0x08b4 }
        r1 = r14.X;	 Catch:{ Exception -> 0x08b4 }
        if (r1 != 0) goto L_0x0801;
    L_0x07f9:
        r1 = r14.E;	 Catch:{ Exception -> 0x08b6 }
        if (r1 != 0) goto L_0x0801;
    L_0x07fd:
        r1 = r14.t;	 Catch:{ Exception -> 0x08b8 }
        if (r1 == 0) goto L_0x0822;
    L_0x0801:
        r1 = 0;
        android.support.v4.view.ViewCompat.setLayoutDirection(r0, r1);	 Catch:{ Exception -> 0x08ba }
        r1 = r14.o;	 Catch:{ Exception -> 0x08ba }
        r0.setViewPager(r1);	 Catch:{ Exception -> 0x08ba }
        r1 = new com.whatsapp.am_;	 Catch:{ Exception -> 0x08ba }
        r1.<init>(r14);	 Catch:{ Exception -> 0x08ba }
        r0.setOnPageChangeListener(r1);	 Catch:{ Exception -> 0x08ba }
        r1 = r14.getResources();	 Catch:{ Exception -> 0x08ba }
        r2 = 2131427411; // 0x7f0b0053 float:1.8476437E38 double:1.0530650604E-314;	 Catch:{ Exception -> 0x08ba }
        r1 = r1.getDimension(r2);	 Catch:{ Exception -> 0x08ba }
        android.support.v4.view.ViewCompat.setElevation(r0, r1);	 Catch:{ Exception -> 0x08ba }
        if (r5 == 0) goto L_0x0839;	 Catch:{ Exception -> 0x08ba }
    L_0x0822:
        r1 = 8;	 Catch:{ Exception -> 0x08ba }
        r0.setVisibility(r1);	 Catch:{ Exception -> 0x08ba }
        r0 = r14.getSupportActionBar();	 Catch:{ Exception -> 0x08ba }
        r1 = r14.getResources();	 Catch:{ Exception -> 0x08ba }
        r2 = 2131427411; // 0x7f0b0053 float:1.8476437E38 double:1.0530650604E-314;	 Catch:{ Exception -> 0x08ba }
        r1 = r1.getDimension(r2);	 Catch:{ Exception -> 0x08ba }
        r0.setElevation(r1);	 Catch:{ Exception -> 0x08ba }
    L_0x0839:
        r0 = new com.whatsapp.auz;
        r1 = r14.U;
        r0.<init>(r14, r14, r1);
        r14.W = r0;
        r0 = new com.whatsapp.aua;
        r1 = r14.z;
        r0.<init>(r14, r14, r1);
        r14.R = r0;
        r0 = new com.whatsapp.aua;
        r1 = r14.v;
        r0.<init>(r14, r14, r1);
        r14.S = r0;
        r0 = com.whatsapp.App.C(r14);
        r14.u = r0;
        com.whatsapp.App.b(r14);
        goto L_0x0142;
    L_0x085f:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0861 }
    L_0x0861:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0863 }
    L_0x0863:
        r0 = move-exception;
        throw r0;
    L_0x0865:
        r1 = r0.getSchemeSpecificPart();
        r7 = 2;
        r1 = r1.substring(r7);
        goto L_0x0746;
    L_0x0870:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = ab;
        r5 = 40;
        r3 = r3[r5];
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.App.a(r14, r12, r4);
        r14.Y = r2;
        r14.finish();
        goto L_0x0142;
    L_0x0895:
        r0 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = ab;
        r7 = 11;
        r4 = r4[r7];
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x076c;
    L_0x08b2:
        r0 = move-exception;
        throw r0;
    L_0x08b4:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x08b6 }
    L_0x08b6:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x08b8 }
    L_0x08b8:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x08ba }
    L_0x08ba:
        r0 = move-exception;
        throw r0;
    L_0x08bc:
        r0 = move-exception;
        r3 = r1;
        r1 = r2;
        goto L_0x05d0;
    L_0x08c1:
        r0 = move-exception;
        r3 = r2;
        goto L_0x05d0;
    L_0x08c5:
        r0 = move-exception;
        goto L_0x05d0;
    L_0x08c8:
        r0 = move-exception;
        r1 = r2;
        r3 = r2;
        goto L_0x0581;
    L_0x08cd:
        r0 = move-exception;
        r3 = r1;
        r1 = r2;
        goto L_0x0581;
    L_0x08d2:
        r0 = move-exception;
        r3 = r2;
        goto L_0x0581;
    L_0x08d6:
        r0 = move-exception;
        goto L_0x0581;
    L_0x08d9:
        r0 = move-exception;
        r1 = r2;
        r3 = r2;
        goto L_0x0581;
    L_0x08de:
        r0 = move-exception;
        r3 = r1;
        r1 = r2;
        goto L_0x0581;
    L_0x08e3:
        r0 = move-exception;
        r3 = r2;
        goto L_0x0581;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.b():void");
    }

    public ContactPicker() {
        this.A = new Handler(Looper.getMainLooper());
        this.Q = new HashSet();
        this.Y = null;
        this.G = "";
        this.w = null;
        this.P = null;
        this.x = new ArrayList();
        this.U = new ArrayList();
        this.z = new ArrayList();
        this.v = new ArrayList();
        this.H = new a2_();
    }

    static void e(ContactPicker contactPicker) {
        contactPicker.n();
    }

    static l5 x(ContactPicker contactPicker) {
        return contactPicker.N;
    }

    static Intent o(ContactPicker contactPicker) {
        return contactPicker.D;
    }

    static boolean j(ContactPicker contactPicker) {
        return contactPicker.J;
    }

    static a2_ v(ContactPicker contactPicker) {
        return contactPicker.H;
    }

    static ArrayList b(ContactPicker contactPicker, ArrayList arrayList) {
        contactPicker.F = arrayList;
        return arrayList;
    }

    private auz a(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        try {
            return adapter instanceof HeaderViewListAdapter ? (auz) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (auz) adapter;
        } catch (SecurityException e) {
            throw e;
        }
    }

    static boolean c(ContactPicker contactPicker) {
        return contactPicker.t;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.app.Dialog onCreateDialog(int r10) {
        /*
        r9 = this;
        r8 = 2;
        r7 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r6 = 2131230884; // 0x7f0800a4 float:1.8077833E38 double:1.052967963E-314;
        r5 = 0;
        r4 = 1;
        r1 = com.whatsapp.DialogToastActivity.f;
        switch(r10) {
            case 0: goto L_0x0013;
            case 1: goto L_0x0067;
            case 2: goto L_0x013d;
            case 3: goto L_0x019f;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = super.onCreateDialog(r10);
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = 2131231692; // 0x7f0803cc float:1.8079472E38 double:1.0529683623E-314;
        r1 = new java.lang.Object[r8];
        r2 = r9.N;
        r2 = r2.a(r9);
        r1[r5] = r2;
        r2 = com.whatsapp.App.as;
        r3 = r9.M;
        r2 = r2.c(r3);
        r2 = r2.a(r9);
        r1[r4] = r2;
        r0 = r9.getString(r0, r1);
        r1 = new android.support.v7.app.AlertDialog$Builder;
        r1.<init>(r9);
        r2 = r9.getBaseContext();
        r0 = com.whatsapp.a28.b(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r4);
        r1 = new com.whatsapp.all;
        r1.<init>(r9);
        r0 = r0.setNegativeButton(r6, r1);
        r1 = new com.whatsapp._r;
        r1.<init>(r9);
        r0 = r0.setPositiveButton(r7, r1);
        r1 = new com.whatsapp.kf;
        r1.<init>(r9);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0012;
    L_0x0067:
        r0 = r9.N;	 Catch:{ SecurityException -> 0x0137 }
        r0 = r0.c();	 Catch:{ SecurityException -> 0x0137 }
        if (r0 == 0) goto L_0x00b9;
    L_0x006f:
        r0 = r9.Y;	 Catch:{ SecurityException -> 0x0139 }
        if (r0 == 0) goto L_0x00a6;
    L_0x0073:
        r0 = r9.Y;	 Catch:{ SecurityException -> 0x0139 }
        r0 = r0.size();	 Catch:{ SecurityException -> 0x0139 }
        if (r0 <= r4) goto L_0x00a6;
    L_0x007b:
        r0 = com.whatsapp.App.az;
        r2 = 2131296278; // 0x7f090016 float:1.8210468E38 double:1.053000272E-314;
        r3 = r9.Y;
        r3 = r3.size();
        r0 = r0.a(r2, r3);
        r2 = new java.lang.Object[r8];
        r3 = r9.Y;
        r3 = r3.size();
        r3 = java.lang.Integer.valueOf(r3);
        r2[r5] = r3;
        r3 = r9.N;
        r3 = r3.a(r9);
        r2[r4] = r3;
        r0 = java.lang.String.format(r0, r2);
        if (r1 == 0) goto L_0x0101;
    L_0x00a6:
        r0 = 2131231278; // 0x7f08022e float:1.8078633E38 double:1.052968158E-314;
        r2 = new java.lang.Object[r4];
        r3 = r9.N;
        r3 = r3.a(r9);
        r2[r5] = r3;
        r0 = r9.getString(r0, r2);
        if (r1 == 0) goto L_0x0101;
    L_0x00b9:
        r0 = r9.Y;	 Catch:{ SecurityException -> 0x013b }
        if (r0 == 0) goto L_0x00f0;
    L_0x00bd:
        r0 = r9.Y;	 Catch:{ SecurityException -> 0x013b }
        r0 = r0.size();	 Catch:{ SecurityException -> 0x013b }
        if (r0 <= r4) goto L_0x00f0;
    L_0x00c5:
        r0 = com.whatsapp.App.az;
        r2 = 2131296267; // 0x7f09000b float:1.8210446E38 double:1.0530002666E-314;
        r3 = r9.Y;
        r3 = r3.size();
        r0 = r0.a(r2, r3);
        r2 = new java.lang.Object[r8];
        r3 = r9.Y;
        r3 = r3.size();
        r3 = java.lang.Integer.valueOf(r3);
        r2[r5] = r3;
        r3 = r9.N;
        r3 = r3.a(r9);
        r2[r4] = r3;
        r0 = java.lang.String.format(r0, r2);
        if (r1 == 0) goto L_0x0101;
    L_0x00f0:
        r0 = 2131230936; // 0x7f0800d8 float:1.8077939E38 double:1.052967989E-314;
        r1 = new java.lang.Object[r4];
        r2 = r9.N;
        r2 = r2.a(r9);
        r1[r5] = r2;
        r0 = r9.getString(r0, r1);
    L_0x0101:
        r1 = new android.support.v7.app.AlertDialog$Builder;
        r1.<init>(r9);
        r2 = r9.getBaseContext();
        r0 = com.whatsapp.a28.b(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r4);
        r1 = new com.whatsapp.n2;
        r1.<init>(r9);
        r0 = r0.setNegativeButton(r6, r1);
        r1 = new com.whatsapp.jr;
        r1.<init>(r9);
        r0 = r0.setPositiveButton(r7, r1);
        r1 = new com.whatsapp.r6;
        r1.<init>(r9);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0012;
    L_0x0137:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0139 }
    L_0x0139:
        r0 = move-exception;
        throw r0;
    L_0x013b:
        r0 = move-exception;
        throw r0;
    L_0x013d:
        r0 = r9.N;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0158;
    L_0x0145:
        r0 = 2131231275; // 0x7f08022b float:1.8078626E38 double:1.0529681563E-314;
        r2 = new java.lang.Object[r4];
        r3 = r9.N;
        r3 = r3.a(r9);
        r2[r5] = r3;
        r0 = r9.getString(r0, r2);
        if (r1 == 0) goto L_0x0169;
    L_0x0158:
        r0 = 2131230934; // 0x7f0800d6 float:1.8077935E38 double:1.052967988E-314;
        r1 = new java.lang.Object[r4];
        r2 = r9.N;
        r2 = r2.a(r9);
        r1[r5] = r2;
        r0 = r9.getString(r0, r1);
    L_0x0169:
        r1 = new android.support.v7.app.AlertDialog$Builder;
        r1.<init>(r9);
        r2 = r9.getBaseContext();
        r0 = com.whatsapp.a28.b(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r4);
        r1 = new com.whatsapp.vt;
        r1.<init>(r9);
        r0 = r0.setNegativeButton(r6, r1);
        r1 = new com.whatsapp.a_5;
        r1.<init>(r9);
        r0 = r0.setPositiveButton(r7, r1);
        r1 = new com.whatsapp.a_m;
        r1.<init>(r9);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0012;
    L_0x019f:
        r0 = 2131231277; // 0x7f08022d float:1.807863E38 double:1.0529681573E-314;
        r1 = new java.lang.Object[r4];
        r2 = r9.N;
        r2 = r2.a(r9);
        r1[r5] = r2;
        r0 = r9.getString(r0, r1);
        r1 = new android.support.v7.app.AlertDialog$Builder;
        r1.<init>(r9);
        r2 = r9.getBaseContext();
        r0 = com.whatsapp.a28.b(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r4);
        r1 = new com.whatsapp.g8;
        r1.<init>(r9);
        r0 = r0.setNegativeButton(r6, r1);
        r1 = new com.whatsapp.jx;
        r1.<init>(r9);
        r0 = r0.setPositiveButton(r7, r1);
        r1 = new com.whatsapp.azh;
        r1.<init>(r9);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.onCreateDialog(int):android.app.Dialog");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    protected void e(boolean z) {
        try {
            d();
            C = false;
            if (App.C((Context) this) != this.u) {
                this.u = App.C((Context) this);
                a();
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    static Set A(ContactPicker contactPicker) {
        return contactPicker.Q;
    }

    static void a(ContactPicker contactPicker, ArrayList arrayList) {
        contactPicker.a(arrayList);
    }

    static boolean y(ContactPicker contactPicker) {
        return contactPicker.I;
    }

    static boolean f(ContactPicker contactPicker) {
        return contactPicker.X;
    }

    private void m() {
        try {
            if (this.O != null) {
                if (this.s.size() == 0) {
                    try {
                        this.O.finish();
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (SecurityException e) {
                        throw e;
                    }
                }
                this.O.setTitle(NumberFormat.getInstance().format((long) this.s.size()));
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    public void onDestroy() {
        Log.i(ab[56]);
        super.onDestroy();
        App.a((tm) this);
        this.H.a();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            if (this.N != null) {
                bundle.putCharSequence(ab[54], this.N.p);
            }
            try {
                if (this.D != null) {
                    bundle.putParcelable(ab[55], this.D);
                }
            } catch (SecurityException e) {
                throw e;
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    static void b(ContactPicker contactPicker) {
        contactPicker.f();
    }

    static boolean a(l5 l5Var) {
        return c(l5Var);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Resources resources = getResources();
        CharSequence string = getString(2131231436);
        if (!this.x.isEmpty()) {
            View searchView = new SearchView(getSupportActionBar().getThemedContext());
            try {
                ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(getResources().getColor(R.color.primary_text_default_material_dark));
                searchView.setQueryHint(getString(2131231848));
                searchView.setOnQueryTextListener(new avv(this));
                this.V = menu.add(0, 4, 0, 2131231845).setIcon(2130839445);
                MenuItemCompat.setActionView(this.V, searchView);
                MenuItemCompat.setShowAsAction(this.V, 10);
                MenuItemCompat.setOnActionExpandListener(this.V, new ei(this));
                if (!TextUtils.isEmpty(this.aa)) {
                    MenuItemCompat.expandActionView(this.V);
                    searchView.setQuery(this.aa, true);
                    this.aa = null;
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
        menu.add(0, 1, 0, 2131232141).setIcon(2130839521);
        menu.add(0, 2, 0, 2131231427).setIcon(2130839510);
        menu.add(0, 0, 0, string).setIcon(resources.getDrawable(2130839517));
        menu.add(0, 3, 0, 2131231970).setIcon(2130839514);
        return super.onCreateOptionsMenu(menu);
    }
}
