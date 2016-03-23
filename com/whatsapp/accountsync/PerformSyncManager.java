package com.whatsapp.accountsync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.BroadcastReceiver;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.contact.i;
import com.whatsapp.l5;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class PerformSyncManager extends BroadcastReceiver {
    private static int a;
    private static final AtomicBoolean b;
    public static int c;
    private static final Object d;
    private static final AtomicBoolean e;
    private static final String[] z;

    static AtomicBoolean b() {
        return b;
    }

    public static boolean a() {
        boolean z;
        synchronized (d) {
            z = App.z().getSharedPreferences(z[6], 0).getBoolean(z[7], true);
        }
        return z;
    }

    private static void a(Context context, Account account, String str, String str2, String str3, int i, String str4) {
        Log.i(z[1] + str + z[0] + str2 + ')');
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = context.getContentResolver();
        a(context, arrayList, account, str, str2, str3, Integer.valueOf(i), str4);
        try {
            contentResolver.applyBatch(z[5], arrayList);
        } catch (Throwable e) {
            Log.b(z[4] + str + z[3] + str2 + z[2], e);
        }
    }

    public static synchronized void a(Context context, l5 l5Var) {
        synchronized (PerformSyncManager.class) {
            try {
                String a;
                App.aA.c(true);
                if (l5Var.l != null) {
                    a = l5Var.l.a();
                } else {
                    a = null;
                }
                Context context2 = context;
                a(context2, d(context), l5Var.q, l5Var.p, a, l5Var.u.intValue(), l5Var.j);
                App.aA.c(false);
            } catch (SecurityException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.accounts.Account d(android.content.Context r5) {
        /*
        r0 = 0;
        r2 = android.accounts.AccountManager.get(r5);
        r1 = z;
        r3 = 61;
        r1 = r1[r3];
        r1 = r2.getAccountsByType(r1);
        r3 = r1.length;
        if (r3 != 0) goto L_0x0019;
    L_0x0012:
        r1 = a(r5, r2);
        if (r1 != 0) goto L_0x0034;
    L_0x0018:
        return r0;
    L_0x0019:
        r3 = 0;
        r1 = r1[r3];
        r3 = 2131232306; // 0x7f080632 float:1.8080718E38 double:1.0529686657E-314;
        r3 = r5.getString(r3);
        r4 = r1.name;
        r3 = android.text.TextUtils.equals(r3, r4);
        if (r3 != 0) goto L_0x0034;
    L_0x002b:
        r2.removeAccount(r1, r0, r0);
        r1 = a(r5, r2);
        if (r1 == 0) goto L_0x0018;
    L_0x0034:
        r0 = r1;
        r1 = z;	 Catch:{ SecurityException -> 0x004c }
        r2 = 60;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x004c }
        r1 = android.content.ContentResolver.getSyncAutomatically(r0, r1);	 Catch:{ SecurityException -> 0x004c }
        if (r1 != 0) goto L_0x0018;
    L_0x0041:
        r1 = z;	 Catch:{ SecurityException -> 0x004c }
        r2 = 62;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x004c }
        r2 = 1;
        android.content.ContentResolver.setSyncAutomatically(r0, r1, r2);	 Catch:{ SecurityException -> 0x004c }
        goto L_0x0018;
    L_0x004c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.PerformSyncManager.d(android.content.Context):android.accounts.Account");
    }

    static {
        String[] strArr = new String[147];
        String str = "Z$";
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
                        i3 = 122;
                        break;
                    case at.g /*1*/:
                        i3 = 12;
                        break;
                    case at.i /*2*/:
                        i3 = 19;
                        break;
                    case at.o /*3*/:
                        i3 = 3;
                        break;
                    default:
                        i3 = 52;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "S,gl\u0014\u001bbwq[\u0013h3`[\u0014xr`@\t,cq[\fewfF";
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Z$";
                    z = true;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u001f~alFZ{{jX\u001f,dq]\u000ee}d\u0014\u0019c}wU\u0019x3";
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0019c~-U\u0014hal]\u001e\"plZ\u000empwG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0019c~-C\u0012mgpU\n|LsF\u001fjvqQ\u0014ovp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\tu}`k\u001emgbk\u0019`vbF\u001fh";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0019c~-U\u0014hal]\u001e\"plZ\u000empwG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Zo|m@\u001bogp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0019c~-U\u0014hal]\u001e\"plZ\u000empwG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001f~alFZ{{jX\u001f,dq]\u000ee}d\u0014\u000ec3bZ\u001e~|jPZo|m@\u001bogp\u0014\n~|u]\u001eia";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "\u0013bebX\u0013h3`[\u0014xr`@\t,ulA\u0014h3gA\be}d\u0014\u001bbwq[\u0013h3`[\u0014xr`@\t,`zZ\u001973qQ\u0017cejZ\u001d,";
                    z = true;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "\biplF\u001ee}d\u0014\bmd#W\u0015bgbW\u000e\u007f3jZ\u001ccanU\u000ee|m\u0014\u000ec3bZ\u001e~|jPZo|m@\u001bogp\u0014\u0019c}wQ\u0014x3sF\u0015zzgQ\b";
                    z = true;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001f~alFZ{{jX\u001f,dq]\u000ee}d\u0014\u000ec3bZ\u001e~|jPZo|m@\u001bogp\u0014\n~|u]\u001eia";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u001ce}jG\u0012iw#F\u001fo|qP\u0013bt#F\u001b{3`[\u0014xr`@\t,zmR\u0015~~b@\u0013c}#@\u0015,rmP\bczg\u0014\u0019c}wU\u0019x`#W\u0015bgfZ\u000e,cq[\fewfF";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u000e~ff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\tu}`\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u001emgb\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    str = "\u0017e~f@\u0003|v";
                    z = true;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "\u001emgb\u0007";
                    z = true;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,Z\u001bav";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,B\u0014h=`[\u0017\"dkU\u000e\u007frsDT|alR\u0013`v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0019m\u007foQ\bSzpk\tu}`U\u001emcwQ\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\bmd\\W\u0015bgbW\u000eSzg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\bmd\\W\u0015bgbW\u000eSzg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,B\u0014h=`[\u0017\"dkU\u000e\u007frsDTz|jDToroX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001emgb\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u001boplA\u0014xLwM\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u001emgb\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u001emgb\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u001emgb\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u001emgb\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u001emgb\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\bmd\\W\u0015bgbW\u000eSzg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0017e~f@\u0003|v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,D\u0012c}fk\f>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u001boplA\u0014xLmU\u0017i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0017e~f@\u0003|v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0017e~f@\u0003|v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u001emgb\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\bmd\\W\u0015bgbW\u000eSzg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u001emgb\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\niae[\ba>pM\u0014o>nU\u0014mtfFUkvw\u0019\u0015~>`F\u001fmgf\u0019\u001boplA\u0014x3eU\u0013`vg\u0014\u000ec3bP\u001e,r`W\u0015y}w";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0019c~-C\u0012mgpU\n|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\niae[\ba>pM\u0014o>nU\u0014mtfFUkvw\u0019\u0015~>`F\u001fmgf\u0019\u001boplA\u0014x3mA\u0016`3i]\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0019c~-U\u0014hal]\u001e\"plZ\u000empwG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u0019c~-C\u0012mgpU\n|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\niae[\ba`zZ\u0019#poQ\u001b~`zZ\u0019hrwUU|vqY\u0013\u007f`j[\u0014SwfZ\u0013iw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u000e~ff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0019m\u007foQ\bSzpk\tu}`U\u001emcwQ\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\niae[\ba`zZ\u0019#poQ\u001b~`zZ\u0019hrwUUhvoQ\u000ei";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u001boplA\u0014xLwM\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u001boplA\u0014xLmU\u0017i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0019c~-C\u0012mgpU\n|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u001boplA\u0014xLmU\u0017i3>\u0014E,RMpZmp`[\u000fbg\\@\u0003|v#\tZ3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\niae[\ba`zZ\u0019#`zZ\u0019hrwU\u0019`vbF\u001fh<pQ\u000e#vqF\u0015~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0019c~-C\u0012mgpU\n|LsF\u001fjvqQ\u0014ovp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\niae[\ba`zZ\u0019#`zZ\u0019hrwU\u0019`vbF\u001fh<pQ\u000e#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\tu}`k\u001emgbk\u0019`vbF\u001fh";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0019c~-U\u0014hal]\u001e\"plZ\u000empwG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0019c~-C\u0012mgpU\n|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0019c~-U\u0014hal]\u001e\"plZ\u000empwG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\niae[\baLpM\u0014oLnU\u0014mtfFU\u007fjmW%m\u007fqQ\u001bhj\\]\u0014Scq[\u001d~vpG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\niae[\baLpM\u0014oLnU\u0014mtfFU\u007fjmW%m\u007fqQ\u001bhj\\Q\u0014hvg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u001boplA\u0014xLwM\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,B\u0014h=`[\u0017\"dkU\u000e\u007frsDTz|jDToroX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u001emgb\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u001f~alFZycgU\u000ee}d\u0014\u0019c}wU\u0019x3gU\u000em3bW\u000ee|m\u0014\txajZ\u001d\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "%ew";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "\bmd\\W\u0015bgbW\u000eSzg\tE,rmPZaznQ\u000eucf\tE";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,B\u0014h=`[\u0017\"dkU\u000e\u007frsDT|alR\u0013`v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u000e~ff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "\tu}`\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "\bmd\\W\u0015bgbW\u000eSzg\tE,rmPZaznQ\u000eucf\tE";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u000e~ff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "\u0019m\u007foQ\bSzpk\tu}`U\u001emcwQ\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u001boplA\u0014xLmU\u0017i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "\u001emgb\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0019m\u007foQ\bSzpk\tu}`U\u001emcwQ\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u0019c~-U\u0014hal]\u001e\"plZ\u000empwG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u001bhwjZ\u001d,~jG\te}d\u0014\bmd#W\u0015bgbW\u000e\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "\bmd\\W\u0015bgbW\u000eSzg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "%ew";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "\bmd\\W\u0015bgbW\u000eSzg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "\tgzsD\u0013bt#F\u001b{3`[\u0014xr`@\t,`zZ\u0019,gl\u0014;bwq[\u0013h3`[\u0014xr`@\t,plZ\u000ei}w\u0014\n~|u]\u001eia#P\u000fi3w[Z|vqY\u0013\u007f`j[\u0014\u007f3gQ\u0014evg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u0019yaqQ\u0014xLgU\u000emLbW\u000ee|mk\txajZ\u001dSefF\te|m";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "\bmd\\W\u0015bgbW\u000eSzg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,B\u0014h=`[\u0017\"dkU\u000e\u007frsDTz|jDToroX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "Ze}#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u000e~ff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u001emgb\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "\bmd\\W\u0015bgbW\u000eSzg\tE,RMpZaznQ\u000eucf\tE";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "\u001bbwq[\u0013h=sQ\bazpG\u0013c}-f?MW\\w5BGBw._";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "\bmd\\W\u0015bgbW\u000eSzg\tE,RMpZaznQ\u000eucf\tE";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "\niae[\ba`zZ\u0019#vmPZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "\u001boplA\u0014xLmU\u0017i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "\u001emgb\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = ")iauQ\bL`-C\u0012mgpU\n|=mQ\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "\u000e~ff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,B\u0014h=`[\u0017\"dkU\u000e\u007frsDT|alR\u0013`v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "\u001emgb\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "\bmd\\W\u0015bgbW\u000eSzg\tE,RMpZaznQ\u000eucf\tE";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,D\u0012c}fk\f>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,D\u0012c}fk\f>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "\tu}`\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "\u0017e~f@\u0003|v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "\u001emgb\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "\tgzsD\u0013bt#F\u001b{3`[\u0014xr`@\t,`zZ\u0019,gl\u0014;bwq[\u0013h3`[\u0014xr`@\t,plZ\u000ei}w\u0014\n~|u]\u001eia#P\u000fi3w[ZbfoXZmp`[\u000fbg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "\u001ce}jG\u0012iw#E\u000fiaz\u0014\u0015j3`A\b~vm@Z~rt\u0014\u0019c}wU\u0019x`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "%ew>\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "\u001emgb\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "\u001emgb\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "\u0019yaqQ\u0014xLgU\u000emLbW\u000ee|mk\txajZ\u001dSefF\te|m";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,B\u0014h=`[\u0017\"dkU\u000e\u007frsDT|alR\u0013`v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = "\u0017e`p]\u0014k3qU\r,plZ\u000empwGZmwgQ\u001e,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "\u001boplA\u0014xLwM\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "%ew>\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "\niae[\ba`zZ\u0019#`wU\bx";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "\u001f~alFZhvoQ\u000ee}d\u0014\bmd#W\u0015bgbW\u000e\u007f3gA\be}d\u0014\tu}`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = ")iauQ\bL`-C\u0012mgpU\n|=mQ\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "\u0017e~f@\u0003|v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u0019c~-U\u0014hal]\u001e\"plZ\u000empwG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "\u0019m\u007foQ\bSzpk\tu}`U\u001emcwQ\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "\u0017e~f@\u0003|v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "\u001emgb\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "\u0019m\u007foQ\bSzpk\tu}`U\u001emcwQ\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "\u0017\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "\u001bbwq[\u0013h=sQ\bazpG\u0013c}-c(EGFk9C]Wu9X@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "\bmd\\W\u0015bgbW\u000eSzg\tE,RMpZaznQ\u000eucf\tE";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,D\u0012c}fk\f>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "\u001emgb\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "\niae[\ba@zZ\u0019/0sQ\bj|qY)u}`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "\u001emgb\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,B\u0014h=`[\u0017\"dkU\u000e\u007frsDT|alR\u0013`v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "\u001emgb\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "\u0019c~-U\u0014hal]\u001e\"plZ\u000empwG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "\u001emgb\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "\u001emgb\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "\bmd\\W\u0015bgbW\u000eSzg\tE,RMpZaznQ\u000eucf\tE";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "\txrq@\u0013bt#G\u0003bp#[\u001c,abCZo|m@\u001bogp\u0014\u000ec3BZ\u001e~|jPZo|m@\u001bogp\u0014\u0019c}wQ\u0014x3sF\u0015zzgQ\b 3p]\u0000i.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "\u001f~alFZhvoQ\u000ee}d\u0014\bmd#W\u0015bgbW\u000e\u007f3gA\be}d\u0014\tu}`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "%ew>\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "\u001emgb\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "\u0019c~-C\u0012mgpU\n|LsF\u001fjvqQ\u0014ovp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "\fbw-U\u0014hal]\u001e\"pvF\tca-]\u000ei~,B\u0014h=`[\u0017\"dkU\u000e\u007frsDTz|jDToroX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "\u001emgb\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    z = strArr3;
                    a = 1;
                    d = new Object();
                    b = new AtomicBoolean(false);
                    e = new AtomicBoolean(false);
                    return;
                default:
                    strArr2[i] = str;
                    str = "\biplF\u001ee}d\u0014\bmd#W\u0015bgbW\u000e,zmR\u0015~~b@\u0013c}#@\u0015,rmP\bczg\u0014\u0019c}wU\u0019x`#W\u0015bgfZ\u000e,cq[\fewfFZj|q\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public static synchronized void e(Context context) {
        synchronized (PerformSyncManager.class) {
            try {
                if (App.v(context)) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri build = RawContacts.CONTENT_URI.buildUpon().appendQueryParameter(z[53], context.getString(2131232306)).appendQueryParameter(z[52], z[54]).appendQueryParameter(z[50], z[49]).build();
                    Log.i(z[51]);
                    contentResolver.delete(build, z[55], new String[]{context.getString(2131232306), z[47]});
                    a(true);
                } else {
                    Log.w(z[48]);
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
    }

    public static void c(Context context) {
        synchronized (b) {
            if (!b.compareAndSet(false, true) || e.get()) {
                return;
            }
            bq.a(new f(context));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(boolean r4) {
        /*
        r1 = d;
        monitor-enter(r1);
        r0 = com.whatsapp.App.z();	 Catch:{ all -> 0x0051 }
        r2 = z;	 Catch:{ all -> 0x0051 }
        r3 = 57;
        r2 = r2[r3];	 Catch:{ all -> 0x0051 }
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);	 Catch:{ all -> 0x0051 }
        r0 = r0.edit();	 Catch:{ all -> 0x0051 }
        r2 = z;	 Catch:{ all -> 0x0051 }
        r3 = 59;
        r2 = r2[r3];	 Catch:{ all -> 0x0051 }
        r0 = r0.putBoolean(r2, r4);	 Catch:{ all -> 0x0051 }
        r0 = r0.commit();	 Catch:{ all -> 0x0051 }
        if (r0 != 0) goto L_0x0033;
    L_0x0026:
        r0 = z;	 Catch:{ SecurityException -> 0x004f }
        r2 = 56;
        r0 = r0[r2];	 Catch:{ SecurityException -> 0x004f }
        com.whatsapp.util.Log.w(r0);	 Catch:{ SecurityException -> 0x004f }
        r0 = c;	 Catch:{ SecurityException -> 0x004f }
        if (r0 == 0) goto L_0x004d;
    L_0x0033:
        r0 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x004f }
        r0.<init>();	 Catch:{ SecurityException -> 0x004f }
        r2 = z;	 Catch:{ SecurityException -> 0x004f }
        r3 = 58;
        r2 = r2[r3];	 Catch:{ SecurityException -> 0x004f }
        r0 = r0.append(r2);	 Catch:{ SecurityException -> 0x004f }
        r0 = r0.append(r4);	 Catch:{ SecurityException -> 0x004f }
        r0 = r0.toString();	 Catch:{ SecurityException -> 0x004f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SecurityException -> 0x004f }
    L_0x004d:
        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
        return;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.PerformSyncManager.a(boolean):void");
    }

    private static void a(Context context, ArrayList arrayList, Account account, String str, String str2, String str3, Integer num, String str4) {
        Uri build = Data.CONTENT_URI.buildUpon().appendQueryParameter(z[23], z[16]).build();
        int size = arrayList.size();
        String c = l5.c(str2.substring(0, str2.indexOf(64)));
        arrayList.add(ContentProviderOperation.newInsert(RawContacts.CONTENT_URI).withValue(z[37], account.name).withValue(z[28], account.type).withValue(z[17], str2).withYieldAllowed(true).build());
        arrayList.add(ContentProviderOperation.newInsert(build).withValueBackReference(z[24], size).withValue(z[35], z[21]).withValue(z[29], str).build());
        arrayList.add(ContentProviderOperation.newInsert(build).withValueBackReference(z[34], size).withValue(z[19], z[22]).withValue(z[32], str2).withValue(z[40], context.getString(2131230776)).withValue(z[30], String.format(context.getString(2131230775), new Object[]{c})).build());
        arrayList.add(ContentProviderOperation.newInsert(build).withValueBackReference(z[25], size).withValue(z[39], z[26]).withValue(z[27], str2).withValue(z[31], context.getString(2131230776)).withValue(z[33], String.format(context.getString(2131230777), new Object[]{c})).build());
        if (str3 != null) {
            int intValue;
            Builder withValue = ContentProviderOperation.newInsert(build).withValueBackReference(z[41], size).withValue(z[38], z[36]).withValue(z[18], str3);
            if (num != null) {
                try {
                    intValue = num.intValue();
                } catch (SecurityException e) {
                    throw e;
                }
            }
            intValue = 0;
            try {
                withValue.withValue(z[42], Integer.valueOf(intValue));
                if (intValue == 0) {
                    String str5 = z[20];
                    if (TextUtils.isEmpty(str4)) {
                        str4 = context.getString(2131232306);
                    }
                    withValue.withValue(str5, str4);
                }
                arrayList.add(withValue.build());
            } catch (SecurityException e2) {
                throw e2;
            } catch (SecurityException e22) {
                throw e22;
            }
        }
    }

    private static synchronized void b(android.content.Context r30, android.accounts.Account r31) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.accountsync.PerformSyncManager.b(android.content.Context, android.accounts.Account):void. bs: [B:6:0x0025, B:13:0x0035, B:19:0x0051, B:32:0x006d, B:36:0x0073, B:53:0x010f, B:157:0x0309, B:188:0x0512, B:245:0x0669]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r15 = com.whatsapp.accountsync.PerformSyncManager.class;
        monitor-enter(r15);
        r16 = c;	 Catch:{ all -> 0x0032 }
        r4 = z;	 Catch:{ all -> 0x0032 }
        r5 = 132; // 0x84 float:1.85E-43 double:6.5E-322;	 Catch:{ all -> 0x0032 }
        r4 = r4[r5];	 Catch:{ all -> 0x0032 }
        r17 = com.whatsapp.tp.a(r4);	 Catch:{ all -> 0x0032 }
        r17.e();	 Catch:{ all -> 0x0032 }
        r4 = z;	 Catch:{ all -> 0x0032 }
        r5 = 118; // 0x76 float:1.65E-43 double:5.83E-322;	 Catch:{ all -> 0x0032 }
        r4 = r4[r5];	 Catch:{ all -> 0x0032 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ all -> 0x0032 }
        r18 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0032 }
        r4 = r30.getContentResolver();	 Catch:{ all -> 0x0032 }
        if (r31 != 0) goto L_0x0035;
    L_0x0025:
        r4 = z;	 Catch:{ Exception -> 0x0030 }
        r5 = 108; // 0x6c float:1.51E-43 double:5.34E-322;	 Catch:{ Exception -> 0x0030 }
        r4 = r4[r5];	 Catch:{ Exception -> 0x0030 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ Exception -> 0x0030 }
    L_0x002e:
        monitor-exit(r15);
        return;
    L_0x0030:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r4 = move-exception;
        monitor-exit(r15);
        throw r4;
    L_0x0035:
        r5 = z;	 Catch:{ Exception -> 0x005d }
        r6 = 93;	 Catch:{ Exception -> 0x005d }
        r5 = r5[r6];	 Catch:{ Exception -> 0x005d }
        r0 = r30;	 Catch:{ Exception -> 0x005d }
        r5 = com.whatsapp.App.h(r0, r5);	 Catch:{ Exception -> 0x005d }
        if (r5 != 0) goto L_0x0051;	 Catch:{ Exception -> 0x005d }
    L_0x0043:
        r5 = z;	 Catch:{ Exception -> 0x005d }
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x005d }
        r5 = r5[r6];	 Catch:{ Exception -> 0x005d }
        r0 = r30;	 Catch:{ Exception -> 0x005d }
        r5 = com.whatsapp.App.h(r0, r5);	 Catch:{ Exception -> 0x005d }
        if (r5 == 0) goto L_0x005f;
    L_0x0051:
        r4 = z;	 Catch:{ Exception -> 0x005b }
        r5 = 85;	 Catch:{ Exception -> 0x005b }
        r4 = r4[r5];	 Catch:{ Exception -> 0x005b }
        com.whatsapp.util.Log.i(r4);	 Catch:{ Exception -> 0x005b }
        goto L_0x002e;
    L_0x005b:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x005d:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x005b }
    L_0x005f:
        r5 = com.whatsapp.App.aA;	 Catch:{ all -> 0x0032 }
        r6 = 1;	 Catch:{ all -> 0x0032 }
        r5.c(r6);	 Catch:{ all -> 0x0032 }
        r5 = com.whatsapp.App.as;	 Catch:{ all -> 0x0032 }
        r10 = r5.i();	 Catch:{ all -> 0x0032 }
        if (r10 == 0) goto L_0x0073;
    L_0x006d:
        r5 = r10.isEmpty();	 Catch:{ Exception -> 0x007c }
        if (r5 == 0) goto L_0x007e;
    L_0x0073:
        r4 = com.whatsapp.App.aA;	 Catch:{ Exception -> 0x007a }
        r5 = 0;	 Catch:{ Exception -> 0x007a }
        r4.c(r5);	 Catch:{ Exception -> 0x007a }
        goto L_0x002e;
    L_0x007a:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x007c:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x007a }
    L_0x007e:
        r11 = new java.util.HashMap;	 Catch:{ all -> 0x0032 }
        r11.<init>();	 Catch:{ all -> 0x0032 }
        r6 = r10.iterator();	 Catch:{ all -> 0x0032 }
    L_0x0087:
        r5 = r6.hasNext();	 Catch:{ all -> 0x0032 }
        if (r5 == 0) goto L_0x009a;	 Catch:{ all -> 0x0032 }
    L_0x008d:
        r5 = r6.next();	 Catch:{ all -> 0x0032 }
        r5 = (com.whatsapp.l5) r5;	 Catch:{ all -> 0x0032 }
        r7 = r5.p;	 Catch:{ all -> 0x0032 }
        r11.put(r7, r5);	 Catch:{ all -> 0x0032 }
        if (r16 == 0) goto L_0x0087;	 Catch:{ all -> 0x0032 }
    L_0x009a:
        r5 = android.provider.ContactsContract.RawContacts.CONTENT_URI;	 Catch:{ all -> 0x0032 }
        r5 = r5.buildUpon();	 Catch:{ all -> 0x0032 }
        r6 = z;	 Catch:{ all -> 0x0032 }
        r7 = 96;	 Catch:{ all -> 0x0032 }
        r6 = r6[r7];	 Catch:{ all -> 0x0032 }
        r0 = r31;	 Catch:{ all -> 0x0032 }
        r7 = r0.name;	 Catch:{ all -> 0x0032 }
        r5 = r5.appendQueryParameter(r6, r7);	 Catch:{ all -> 0x0032 }
        r6 = z;	 Catch:{ all -> 0x0032 }
        r7 = 116; // 0x74 float:1.63E-43 double:5.73E-322;	 Catch:{ all -> 0x0032 }
        r6 = r6[r7];	 Catch:{ all -> 0x0032 }
        r0 = r31;	 Catch:{ all -> 0x0032 }
        r7 = r0.type;	 Catch:{ all -> 0x0032 }
        r5 = r5.appendQueryParameter(r6, r7);	 Catch:{ all -> 0x0032 }
        r6 = z;	 Catch:{ all -> 0x0032 }
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;	 Catch:{ all -> 0x0032 }
        r6 = r6[r7];	 Catch:{ all -> 0x0032 }
        r7 = z;	 Catch:{ all -> 0x0032 }
        r8 = 90;	 Catch:{ all -> 0x0032 }
        r7 = r7[r8];	 Catch:{ all -> 0x0032 }
        r5 = r5.appendQueryParameter(r6, r7);	 Catch:{ all -> 0x0032 }
        r5 = r5.build();	 Catch:{ all -> 0x0032 }
        r20 = new java.util.HashMap;	 Catch:{ all -> 0x0032 }
        r20.<init>();	 Catch:{ all -> 0x0032 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0032 }
        r6.<init>();	 Catch:{ all -> 0x0032 }
        r7 = z;	 Catch:{ all -> 0x0032 }
        r8 = 140; // 0x8c float:1.96E-43 double:6.9E-322;	 Catch:{ all -> 0x0032 }
        r7 = r7[r8];	 Catch:{ all -> 0x0032 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x0032 }
        r7 = r10.size();	 Catch:{ all -> 0x0032 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x0032 }
        r6 = r6.toString();	 Catch:{ all -> 0x0032 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ all -> 0x0032 }
        r6 = 2;	 Catch:{ all -> 0x0032 }
        r6 = new java.lang.String[r6];	 Catch:{ all -> 0x0032 }
        r7 = 0;	 Catch:{ all -> 0x0032 }
        r8 = z;	 Catch:{ all -> 0x0032 }
        r9 = 83;	 Catch:{ all -> 0x0032 }
        r8 = r8[r9];	 Catch:{ all -> 0x0032 }
        r6[r7] = r8;	 Catch:{ all -> 0x0032 }
        r7 = 1;	 Catch:{ all -> 0x0032 }
        r8 = z;	 Catch:{ all -> 0x0032 }
        r9 = 105; // 0x69 float:1.47E-43 double:5.2E-322;	 Catch:{ all -> 0x0032 }
        r8 = r8[r9];	 Catch:{ all -> 0x0032 }
        r6[r7] = r8;	 Catch:{ all -> 0x0032 }
        r7 = 0;	 Catch:{ all -> 0x0032 }
        r8 = 0;	 Catch:{ all -> 0x0032 }
        r9 = 0;	 Catch:{ all -> 0x0032 }
        r7 = r4.query(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0032 }
        r6 = z;	 Catch:{ Exception -> 0x06fc }
        r8 = 109; // 0x6d float:1.53E-43 double:5.4E-322;	 Catch:{ Exception -> 0x06fc }
        r6 = r6[r8];	 Catch:{ Exception -> 0x06fc }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x06fc }
        if (r7 == 0) goto L_0x014b;	 Catch:{ Exception -> 0x06fc }
    L_0x011a:
        r6 = r7.moveToNext();	 Catch:{ Exception -> 0x06fc }
        if (r6 == 0) goto L_0x0148;
    L_0x0120:
        r6 = 0;
        r8 = r7.getLong(r6);	 Catch:{ all -> 0x0032 }
        r6 = 1;	 Catch:{ all -> 0x0032 }
        r12 = r7.getString(r6);	 Catch:{ all -> 0x0032 }
        r13 = new com.whatsapp.accountsync.d;	 Catch:{ all -> 0x0032 }
        r13.<init>(r8, r12);	 Catch:{ all -> 0x0032 }
        r0 = r20;	 Catch:{ all -> 0x0032 }
        r6 = r0.get(r12);	 Catch:{ all -> 0x0032 }
        r6 = (java.util.ArrayList) r6;	 Catch:{ all -> 0x0032 }
        if (r6 != 0) goto L_0x0143;	 Catch:{ all -> 0x0032 }
    L_0x0139:
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x0032 }
        r6.<init>();	 Catch:{ all -> 0x0032 }
        r0 = r20;	 Catch:{ all -> 0x0032 }
        r0.put(r12, r6);	 Catch:{ all -> 0x0032 }
    L_0x0143:
        r6.add(r13);	 Catch:{ all -> 0x0032 }
        if (r16 == 0) goto L_0x011a;	 Catch:{ all -> 0x0032 }
    L_0x0148:
        r7.close();	 Catch:{ all -> 0x0032 }
    L_0x014b:
        r12 = new java.util.HashSet;	 Catch:{ all -> 0x0032 }
        r12.<init>();	 Catch:{ all -> 0x0032 }
        r21 = new java.util.ArrayList;	 Catch:{ all -> 0x0032 }
        r21.<init>();	 Catch:{ all -> 0x0032 }
        r6 = r20.entrySet();	 Catch:{ all -> 0x0032 }
        r13 = r6.iterator();	 Catch:{ all -> 0x0032 }
    L_0x015d:
        r6 = r13.hasNext();	 Catch:{ all -> 0x0032 }
        if (r6 == 0) goto L_0x0235;	 Catch:{ all -> 0x0032 }
    L_0x0163:
        r6 = r13.next();	 Catch:{ all -> 0x0032 }
        r6 = (java.util.Map.Entry) r6;	 Catch:{ all -> 0x0032 }
        r7 = r6.getKey();	 Catch:{ all -> 0x0032 }
        r7 = (java.lang.String) r7;	 Catch:{ all -> 0x0032 }
        r8 = r11.get(r7);	 Catch:{ all -> 0x0032 }
        r8 = (com.whatsapp.l5) r8;	 Catch:{ all -> 0x0032 }
        if (r8 == 0) goto L_0x070a;
    L_0x0177:
        r9 = r8.l;	 Catch:{ Exception -> 0x06fe }
        if (r9 == 0) goto L_0x070a;
    L_0x017b:
        r9 = r8.m;	 Catch:{ Exception -> 0x0700 }
        if (r9 == 0) goto L_0x070a;
    L_0x017f:
        r9 = r8.c();	 Catch:{ Exception -> 0x0702 }
        if (r9 != 0) goto L_0x070a;
    L_0x0185:
        r9 = r8.m();	 Catch:{ Exception -> 0x0704 }
        if (r9 != 0) goto L_0x070a;
    L_0x018b:
        r8 = r8.p;	 Catch:{ Exception -> 0x0706 }
        r9 = z;	 Catch:{ Exception -> 0x0706 }
        r14 = 120; // 0x78 float:1.68E-43 double:5.93E-322;	 Catch:{ Exception -> 0x0706 }
        r9 = r9[r14];	 Catch:{ Exception -> 0x0706 }
        r8 = r8.equals(r9);	 Catch:{ Exception -> 0x0706 }
        if (r8 != 0) goto L_0x070a;
    L_0x0199:
        r8 = 1;
    L_0x019a:
        r6 = r6.getValue();	 Catch:{ all -> 0x0032 }
        r6 = (java.util.ArrayList) r6;	 Catch:{ all -> 0x0032 }
        if (r8 == 0) goto L_0x01ec;	 Catch:{ all -> 0x0032 }
    L_0x01a2:
        r14 = r6.size();	 Catch:{ all -> 0x0032 }
        r8 = 1;	 Catch:{ all -> 0x0032 }
        if (r14 <= r8) goto L_0x01ea;	 Catch:{ all -> 0x0032 }
    L_0x01a9:
        r8 = 0;	 Catch:{ all -> 0x0032 }
        r9 = r8;	 Catch:{ all -> 0x0032 }
    L_0x01ab:
        r8 = r14 + -1;	 Catch:{ all -> 0x0032 }
        if (r9 >= r8) goto L_0x01ea;	 Catch:{ all -> 0x0032 }
    L_0x01af:
        r8 = r6.get(r9);	 Catch:{ all -> 0x0032 }
        r8 = (com.whatsapp.accountsync.d) r8;	 Catch:{ all -> 0x0032 }
        r22 = android.content.ContentProviderOperation.newDelete(r5);	 Catch:{ all -> 0x0032 }
        r23 = 1;	 Catch:{ all -> 0x0032 }
        r22 = r22.withYieldAllowed(r23);	 Catch:{ all -> 0x0032 }
        r23 = z;	 Catch:{ all -> 0x0032 }
        r24 = 110; // 0x6e float:1.54E-43 double:5.43E-322;	 Catch:{ all -> 0x0032 }
        r23 = r23[r24];	 Catch:{ all -> 0x0032 }
        r24 = 1;	 Catch:{ all -> 0x0032 }
        r0 = r24;	 Catch:{ all -> 0x0032 }
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x0032 }
        r24 = r0;	 Catch:{ all -> 0x0032 }
        r25 = 0;	 Catch:{ all -> 0x0032 }
        r0 = r8.a;	 Catch:{ all -> 0x0032 }
        r26 = r0;	 Catch:{ all -> 0x0032 }
        r8 = java.lang.String.valueOf(r26);	 Catch:{ all -> 0x0032 }
        r24[r25] = r8;	 Catch:{ all -> 0x0032 }
        r8 = r22.withSelection(r23, r24);	 Catch:{ all -> 0x0032 }
        r8 = r8.build();	 Catch:{ all -> 0x0032 }
        r0 = r21;	 Catch:{ all -> 0x0032 }
        r0.add(r8);	 Catch:{ all -> 0x0032 }
        r8 = r9 + 1;	 Catch:{ all -> 0x0032 }
        if (r16 == 0) goto L_0x0786;	 Catch:{ all -> 0x0032 }
    L_0x01ea:
        if (r16 == 0) goto L_0x0233;	 Catch:{ all -> 0x0032 }
    L_0x01ec:
        r8 = r6.iterator();	 Catch:{ all -> 0x0032 }
    L_0x01f0:
        r6 = r8.hasNext();	 Catch:{ all -> 0x0032 }
        if (r6 == 0) goto L_0x0230;	 Catch:{ all -> 0x0032 }
    L_0x01f6:
        r6 = r8.next();	 Catch:{ all -> 0x0032 }
        r6 = (com.whatsapp.accountsync.d) r6;	 Catch:{ all -> 0x0032 }
        r9 = android.content.ContentProviderOperation.newDelete(r5);	 Catch:{ all -> 0x0032 }
        r14 = 1;	 Catch:{ all -> 0x0032 }
        r9 = r9.withYieldAllowed(r14);	 Catch:{ all -> 0x0032 }
        r14 = z;	 Catch:{ all -> 0x0032 }
        r22 = 142; // 0x8e float:1.99E-43 double:7.0E-322;	 Catch:{ all -> 0x0032 }
        r14 = r14[r22];	 Catch:{ all -> 0x0032 }
        r22 = 1;	 Catch:{ all -> 0x0032 }
        r0 = r22;	 Catch:{ all -> 0x0032 }
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x0032 }
        r22 = r0;	 Catch:{ all -> 0x0032 }
        r23 = 0;	 Catch:{ all -> 0x0032 }
        r0 = r6.a;	 Catch:{ all -> 0x0032 }
        r24 = r0;	 Catch:{ all -> 0x0032 }
        r6 = java.lang.String.valueOf(r24);	 Catch:{ all -> 0x0032 }
        r22[r23] = r6;	 Catch:{ all -> 0x0032 }
        r0 = r22;	 Catch:{ all -> 0x0032 }
        r6 = r9.withSelection(r14, r0);	 Catch:{ all -> 0x0032 }
        r6 = r6.build();	 Catch:{ all -> 0x0032 }
        r0 = r21;	 Catch:{ all -> 0x0032 }
        r0.add(r6);	 Catch:{ all -> 0x0032 }
        if (r16 == 0) goto L_0x01f0;	 Catch:{ all -> 0x0032 }
    L_0x0230:
        r12.add(r7);	 Catch:{ all -> 0x0032 }
    L_0x0233:
        if (r16 == 0) goto L_0x015d;	 Catch:{ all -> 0x0032 }
    L_0x0235:
        r6 = r20.keySet();	 Catch:{ all -> 0x0032 }
        r6.removeAll(r12);	 Catch:{ all -> 0x0032 }
        r6 = r21.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r6 != 0) goto L_0x0250;
    L_0x0242:
        r6 = z;	 Catch:{ Exception -> 0x070d }
        r7 = 136; // 0x88 float:1.9E-43 double:6.7E-322;	 Catch:{ Exception -> 0x070d }
        r6 = r6[r7];	 Catch:{ Exception -> 0x070d }
        r0 = r21;	 Catch:{ Exception -> 0x070d }
        r4.applyBatch(r6, r0);	 Catch:{ Exception -> 0x070d }
        r21.clear();	 Catch:{ all -> 0x0032 }
    L_0x0250:
        r22 = new java.util.ArrayList;	 Catch:{ all -> 0x0032 }
        r22.<init>();	 Catch:{ all -> 0x0032 }
        r23 = new java.util.HashSet;	 Catch:{ all -> 0x0032 }
        r23.<init>();	 Catch:{ all -> 0x0032 }
        r24 = new java.util.HashSet;	 Catch:{ all -> 0x0032 }
        r24.<init>();	 Catch:{ all -> 0x0032 }
        r25 = new java.util.HashSet;	 Catch:{ all -> 0x0032 }
        r25.<init>();	 Catch:{ all -> 0x0032 }
        r6 = z;	 Catch:{ all -> 0x0032 }
        r7 = 81;	 Catch:{ all -> 0x0032 }
        r6 = r6[r7];	 Catch:{ all -> 0x0032 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ all -> 0x0032 }
        r26 = r10.iterator();	 Catch:{ all -> 0x0032 }
    L_0x0271:
        r6 = r26.hasNext();	 Catch:{ all -> 0x0032 }
        if (r6 == 0) goto L_0x0649;	 Catch:{ all -> 0x0032 }
    L_0x0277:
        r6 = r26.next();	 Catch:{ all -> 0x0032 }
        r0 = r6;	 Catch:{ all -> 0x0032 }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ all -> 0x0032 }
        r12 = r0;	 Catch:{ all -> 0x0032 }
        r6 = r12.l;	 Catch:{ Exception -> 0x0721 }
        if (r6 == 0) goto L_0x072b;	 Catch:{ Exception -> 0x0721 }
    L_0x0283:
        r6 = r12.m;	 Catch:{ Exception -> 0x0721 }
        if (r6 == 0) goto L_0x072b;
    L_0x0287:
        r6 = r12.c();	 Catch:{ Exception -> 0x0723 }
        if (r6 != 0) goto L_0x072b;
    L_0x028d:
        r6 = r12.m();	 Catch:{ Exception -> 0x0725 }
        if (r6 != 0) goto L_0x072b;
    L_0x0293:
        r6 = r12.p;	 Catch:{ Exception -> 0x0727 }
        r7 = z;	 Catch:{ Exception -> 0x0727 }
        r8 = 98;	 Catch:{ Exception -> 0x0727 }
        r7 = r7[r8];	 Catch:{ Exception -> 0x0727 }
        r6 = r6.equals(r7);	 Catch:{ Exception -> 0x0727 }
        if (r6 != 0) goto L_0x072b;
    L_0x02a1:
        r6 = 1;
    L_0x02a2:
        if (r6 == 0) goto L_0x02b5;
    L_0x02a4:
        r7 = r12.p;	 Catch:{ Exception -> 0x072e }
        r0 = r20;	 Catch:{ Exception -> 0x072e }
        r7 = r0.containsKey(r7);	 Catch:{ Exception -> 0x072e }
        if (r7 != 0) goto L_0x02b5;
    L_0x02ae:
        r0 = r22;	 Catch:{ Exception -> 0x0730 }
        r0.add(r12);	 Catch:{ Exception -> 0x0730 }
        if (r16 == 0) goto L_0x0647;
    L_0x02b5:
        if (r6 != 0) goto L_0x0309;
    L_0x02b7:
        r6 = r12.p;	 Catch:{ Exception -> 0x0734 }
        r0 = r20;	 Catch:{ Exception -> 0x0734 }
        r6 = r0.containsKey(r6);	 Catch:{ Exception -> 0x0734 }
        if (r6 == 0) goto L_0x0309;
    L_0x02c1:
        r6 = r12.p;	 Catch:{ all -> 0x0032 }
        r0 = r20;	 Catch:{ all -> 0x0032 }
        r6 = r0.get(r6);	 Catch:{ all -> 0x0032 }
        r6 = (java.util.ArrayList) r6;	 Catch:{ all -> 0x0032 }
        r7 = r6.iterator();	 Catch:{ all -> 0x0032 }
    L_0x02cf:
        r6 = r7.hasNext();	 Catch:{ all -> 0x0032 }
        if (r6 == 0) goto L_0x0307;	 Catch:{ all -> 0x0032 }
    L_0x02d5:
        r6 = r7.next();	 Catch:{ all -> 0x0032 }
        r6 = (com.whatsapp.accountsync.d) r6;	 Catch:{ all -> 0x0032 }
        r8 = android.content.ContentProviderOperation.newDelete(r5);	 Catch:{ all -> 0x0032 }
        r9 = 1;	 Catch:{ all -> 0x0032 }
        r8 = r8.withYieldAllowed(r9);	 Catch:{ all -> 0x0032 }
        r9 = z;	 Catch:{ all -> 0x0032 }
        r10 = 117; // 0x75 float:1.64E-43 double:5.8E-322;	 Catch:{ all -> 0x0032 }
        r9 = r9[r10];	 Catch:{ all -> 0x0032 }
        r10 = 1;	 Catch:{ all -> 0x0032 }
        r10 = new java.lang.String[r10];	 Catch:{ all -> 0x0032 }
        r11 = 0;	 Catch:{ all -> 0x0032 }
        r0 = r6.a;	 Catch:{ all -> 0x0032 }
        r28 = r0;	 Catch:{ all -> 0x0032 }
        r6 = java.lang.String.valueOf(r28);	 Catch:{ all -> 0x0032 }
        r10[r11] = r6;	 Catch:{ all -> 0x0032 }
        r6 = r8.withSelection(r9, r10);	 Catch:{ all -> 0x0032 }
        r6 = r6.build();	 Catch:{ all -> 0x0032 }
        r0 = r21;	 Catch:{ all -> 0x0032 }
        r0.add(r6);	 Catch:{ all -> 0x0032 }
        if (r16 == 0) goto L_0x02cf;
    L_0x0307:
        if (r16 == 0) goto L_0x0647;
    L_0x0309:
        r6 = r12.p;	 Catch:{ Exception -> 0x0736 }
        r0 = r20;	 Catch:{ Exception -> 0x0736 }
        r6 = r0.containsKey(r6);	 Catch:{ Exception -> 0x0736 }
        if (r6 == 0) goto L_0x0647;
    L_0x0313:
        r6 = android.provider.ContactsContract.Data.CONTENT_URI;	 Catch:{ all -> 0x0032 }
        r6 = r6.buildUpon();	 Catch:{ all -> 0x0032 }
        r7 = z;	 Catch:{ all -> 0x0032 }
        r8 = 123; // 0x7b float:1.72E-43 double:6.1E-322;	 Catch:{ all -> 0x0032 }
        r7 = r7[r8];	 Catch:{ all -> 0x0032 }
        r8 = z;	 Catch:{ all -> 0x0032 }
        r9 = 99;	 Catch:{ all -> 0x0032 }
        r8 = r8[r9];	 Catch:{ all -> 0x0032 }
        r6 = r6.appendQueryParameter(r7, r8);	 Catch:{ all -> 0x0032 }
        r7 = r6.build();	 Catch:{ all -> 0x0032 }
        r6 = r12.p;	 Catch:{ all -> 0x0032 }
        r0 = r20;	 Catch:{ all -> 0x0032 }
        r6 = r0.get(r6);	 Catch:{ all -> 0x0032 }
        r6 = (java.util.List) r6;	 Catch:{ all -> 0x0032 }
        r8 = r6.size();	 Catch:{ all -> 0x0032 }
        r8 = r8 + -1;	 Catch:{ all -> 0x0032 }
        r6 = r6.get(r8);	 Catch:{ all -> 0x0032 }
        r0 = r6;	 Catch:{ all -> 0x0032 }
        r0 = (com.whatsapp.accountsync.d) r0;	 Catch:{ all -> 0x0032 }
        r13 = r0;	 Catch:{ all -> 0x0032 }
        r8 = 0;	 Catch:{ all -> 0x0032 }
        r6 = z;	 Catch:{ all -> 0x0032 }
        r9 = 129; // 0x81 float:1.81E-43 double:6.37E-322;	 Catch:{ all -> 0x0032 }
        r9 = r6[r9];	 Catch:{ all -> 0x0032 }
        r6 = 2;	 Catch:{ all -> 0x0032 }
        r10 = new java.lang.String[r6];	 Catch:{ all -> 0x0032 }
        r6 = 0;	 Catch:{ all -> 0x0032 }
        r0 = r13.a;	 Catch:{ all -> 0x0032 }
        r28 = r0;	 Catch:{ all -> 0x0032 }
        r11 = java.lang.String.valueOf(r28);	 Catch:{ all -> 0x0032 }
        r10[r6] = r11;	 Catch:{ all -> 0x0032 }
        r6 = 1;	 Catch:{ all -> 0x0032 }
        r11 = z;	 Catch:{ all -> 0x0032 }
        r14 = 114; // 0x72 float:1.6E-43 double:5.63E-322;	 Catch:{ all -> 0x0032 }
        r11 = r11[r14];	 Catch:{ all -> 0x0032 }
        r10[r6] = r11;	 Catch:{ all -> 0x0032 }
        r11 = 0;	 Catch:{ all -> 0x0032 }
        r6 = r4;	 Catch:{ all -> 0x0032 }
        r6 = r6.query(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0032 }
        r8 = r12.p;	 Catch:{ all -> 0x0032 }
        r9 = 0;	 Catch:{ all -> 0x0032 }
        r10 = r12.p;	 Catch:{ all -> 0x0032 }
        r11 = 64;	 Catch:{ all -> 0x0032 }
        r10 = r10.indexOf(r11);	 Catch:{ all -> 0x0032 }
        r8 = r8.substring(r9, r10);	 Catch:{ all -> 0x0032 }
        r14 = com.whatsapp.l5.c(r8);	 Catch:{ all -> 0x0032 }
        if (r6 == 0) goto L_0x040f;
    L_0x037e:
        r8 = r6.moveToNext();	 Catch:{ Exception -> 0x0738 }
        if (r8 != 0) goto L_0x040c;	 Catch:{ Exception -> 0x0738 }
    L_0x0384:
        r8 = r13.a;	 Catch:{ Exception -> 0x0738 }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ Exception -> 0x0738 }
        r0 = r23;	 Catch:{ Exception -> 0x0738 }
        r8 = r0.contains(r8);	 Catch:{ Exception -> 0x0738 }
        if (r8 != 0) goto L_0x040c;
    L_0x0392:
        r8 = android.content.ContentProviderOperation.newInsert(r7);	 Catch:{ Exception -> 0x073a }
        r9 = 1;	 Catch:{ Exception -> 0x073a }
        r8 = r8.withYieldAllowed(r9);	 Catch:{ Exception -> 0x073a }
        r9 = z;	 Catch:{ Exception -> 0x073a }
        r10 = 82;	 Catch:{ Exception -> 0x073a }
        r9 = r9[r10];	 Catch:{ Exception -> 0x073a }
        r10 = r13.a;	 Catch:{ Exception -> 0x073a }
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ Exception -> 0x073a }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x073a }
        r9 = z;	 Catch:{ Exception -> 0x073a }
        r10 = 106; // 0x6a float:1.49E-43 double:5.24E-322;	 Catch:{ Exception -> 0x073a }
        r9 = r9[r10];	 Catch:{ Exception -> 0x073a }
        r10 = z;	 Catch:{ Exception -> 0x073a }
        r11 = 134; // 0x86 float:1.88E-43 double:6.6E-322;	 Catch:{ Exception -> 0x073a }
        r10 = r10[r11];	 Catch:{ Exception -> 0x073a }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x073a }
        r9 = z;	 Catch:{ Exception -> 0x073a }
        r10 = 133; // 0x85 float:1.86E-43 double:6.57E-322;	 Catch:{ Exception -> 0x073a }
        r9 = r9[r10];	 Catch:{ Exception -> 0x073a }
        r10 = r12.p;	 Catch:{ Exception -> 0x073a }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x073a }
        r9 = z;	 Catch:{ Exception -> 0x073a }
        r10 = 107; // 0x6b float:1.5E-43 double:5.3E-322;	 Catch:{ Exception -> 0x073a }
        r9 = r9[r10];	 Catch:{ Exception -> 0x073a }
        r10 = 2131230776; // 0x7f080038 float:1.8077614E38 double:1.05296791E-314;	 Catch:{ Exception -> 0x073a }
        r0 = r30;	 Catch:{ Exception -> 0x073a }
        r10 = r0.getString(r10);	 Catch:{ Exception -> 0x073a }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x073a }
        r9 = z;	 Catch:{ Exception -> 0x073a }
        r10 = 143; // 0x8f float:2.0E-43 double:7.07E-322;	 Catch:{ Exception -> 0x073a }
        r9 = r9[r10];	 Catch:{ Exception -> 0x073a }
        r10 = 2131230775; // 0x7f080037 float:1.8077612E38 double:1.0529679093E-314;	 Catch:{ Exception -> 0x073a }
        r0 = r30;	 Catch:{ Exception -> 0x073a }
        r10 = r0.getString(r10);	 Catch:{ Exception -> 0x073a }
        r11 = 1;	 Catch:{ Exception -> 0x073a }
        r11 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x073a }
        r27 = 0;	 Catch:{ Exception -> 0x073a }
        r11[r27] = r14;	 Catch:{ Exception -> 0x073a }
        r10 = java.lang.String.format(r10, r11);	 Catch:{ Exception -> 0x073a }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x073a }
        r8 = r8.build();	 Catch:{ Exception -> 0x073a }
        r0 = r21;	 Catch:{ Exception -> 0x073a }
        r0.add(r8);	 Catch:{ Exception -> 0x073a }
        r8 = r13.a;	 Catch:{ Exception -> 0x073a }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ Exception -> 0x073a }
        r0 = r23;	 Catch:{ Exception -> 0x073a }
        r0.add(r8);	 Catch:{ Exception -> 0x073a }
    L_0x040c:
        r6.close();	 Catch:{ all -> 0x0032 }
    L_0x040f:
        r8 = 0;	 Catch:{ all -> 0x0032 }
        r6 = z;	 Catch:{ all -> 0x0032 }
        r9 = 94;	 Catch:{ all -> 0x0032 }
        r9 = r6[r9];	 Catch:{ all -> 0x0032 }
        r6 = 2;	 Catch:{ all -> 0x0032 }
        r10 = new java.lang.String[r6];	 Catch:{ all -> 0x0032 }
        r6 = 0;	 Catch:{ all -> 0x0032 }
        r0 = r13.a;	 Catch:{ all -> 0x0032 }
        r28 = r0;	 Catch:{ all -> 0x0032 }
        r11 = java.lang.String.valueOf(r28);	 Catch:{ all -> 0x0032 }
        r10[r6] = r11;	 Catch:{ all -> 0x0032 }
        r6 = 1;	 Catch:{ all -> 0x0032 }
        r11 = z;	 Catch:{ all -> 0x0032 }
        r27 = 145; // 0x91 float:2.03E-43 double:7.16E-322;	 Catch:{ all -> 0x0032 }
        r11 = r11[r27];	 Catch:{ all -> 0x0032 }
        r10[r6] = r11;	 Catch:{ all -> 0x0032 }
        r11 = 0;	 Catch:{ all -> 0x0032 }
        r6 = r4;	 Catch:{ all -> 0x0032 }
        r6 = r6.query(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0032 }
        if (r6 == 0) goto L_0x0512;
    L_0x0435:
        r8 = r6.moveToNext();	 Catch:{ Exception -> 0x0741 }
        if (r8 != 0) goto L_0x050f;	 Catch:{ Exception -> 0x0741 }
    L_0x043b:
        r8 = r13.a;	 Catch:{ Exception -> 0x0741 }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ Exception -> 0x0741 }
        r0 = r24;	 Catch:{ Exception -> 0x0741 }
        r8 = r0.contains(r8);	 Catch:{ Exception -> 0x0741 }
        if (r8 != 0) goto L_0x050f;
    L_0x0449:
        r8 = android.content.ContentProviderOperation.newInsert(r7);	 Catch:{ Exception -> 0x0743 }
        r9 = 1;	 Catch:{ Exception -> 0x0743 }
        r8 = r8.withYieldAllowed(r9);	 Catch:{ Exception -> 0x0743 }
        r9 = z;	 Catch:{ Exception -> 0x0743 }
        r10 = 84;	 Catch:{ Exception -> 0x0743 }
        r9 = r9[r10];	 Catch:{ Exception -> 0x0743 }
        r10 = r13.a;	 Catch:{ Exception -> 0x0743 }
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ Exception -> 0x0743 }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x0743 }
        r9 = z;	 Catch:{ Exception -> 0x0743 }
        r10 = 121; // 0x79 float:1.7E-43 double:6.0E-322;	 Catch:{ Exception -> 0x0743 }
        r9 = r9[r10];	 Catch:{ Exception -> 0x0743 }
        r10 = z;	 Catch:{ Exception -> 0x0743 }
        r11 = 88;	 Catch:{ Exception -> 0x0743 }
        r10 = r10[r11];	 Catch:{ Exception -> 0x0743 }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x0743 }
        r9 = z;	 Catch:{ Exception -> 0x0743 }
        r10 = 125; // 0x7d float:1.75E-43 double:6.2E-322;	 Catch:{ Exception -> 0x0743 }
        r9 = r9[r10];	 Catch:{ Exception -> 0x0743 }
        r10 = r12.p;	 Catch:{ Exception -> 0x0743 }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x0743 }
        r9 = z;	 Catch:{ Exception -> 0x0743 }
        r10 = 138; // 0x8a float:1.93E-43 double:6.8E-322;	 Catch:{ Exception -> 0x0743 }
        r9 = r9[r10];	 Catch:{ Exception -> 0x0743 }
        r10 = 2131230776; // 0x7f080038 float:1.8077614E38 double:1.05296791E-314;	 Catch:{ Exception -> 0x0743 }
        r0 = r30;	 Catch:{ Exception -> 0x0743 }
        r10 = r0.getString(r10);	 Catch:{ Exception -> 0x0743 }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x0743 }
        r9 = z;	 Catch:{ Exception -> 0x0743 }
        r10 = 137; // 0x89 float:1.92E-43 double:6.77E-322;	 Catch:{ Exception -> 0x0743 }
        r9 = r9[r10];	 Catch:{ Exception -> 0x0743 }
        r10 = 2131230777; // 0x7f080039 float:1.8077616E38 double:1.0529679103E-314;	 Catch:{ Exception -> 0x0743 }
        r0 = r30;	 Catch:{ Exception -> 0x0743 }
        r10 = r0.getString(r10);	 Catch:{ Exception -> 0x0743 }
        r11 = 1;	 Catch:{ Exception -> 0x0743 }
        r11 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x0743 }
        r27 = 0;	 Catch:{ Exception -> 0x0743 }
        r11[r27] = r14;	 Catch:{ Exception -> 0x0743 }
        r10 = java.lang.String.format(r10, r11);	 Catch:{ Exception -> 0x0743 }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x0743 }
        r8 = r8.build();	 Catch:{ Exception -> 0x0743 }
        r0 = r21;	 Catch:{ Exception -> 0x0743 }
        r0.add(r8);	 Catch:{ Exception -> 0x0743 }
        r8 = android.content.ContentProviderOperation.newUpdate(r7);	 Catch:{ Exception -> 0x0743 }
        r9 = z;	 Catch:{ Exception -> 0x0743 }
        r10 = 139; // 0x8b float:1.95E-43 double:6.87E-322;	 Catch:{ Exception -> 0x0743 }
        r9 = r9[r10];	 Catch:{ Exception -> 0x0743 }
        r10 = 2;	 Catch:{ Exception -> 0x0743 }
        r10 = new java.lang.String[r10];	 Catch:{ Exception -> 0x0743 }
        r11 = 0;	 Catch:{ Exception -> 0x0743 }
        r0 = r13.a;	 Catch:{ Exception -> 0x0743 }
        r28 = r0;	 Catch:{ Exception -> 0x0743 }
        r27 = java.lang.String.valueOf(r28);	 Catch:{ Exception -> 0x0743 }
        r10[r11] = r27;	 Catch:{ Exception -> 0x0743 }
        r11 = 1;	 Catch:{ Exception -> 0x0743 }
        r27 = z;	 Catch:{ Exception -> 0x0743 }
        r28 = 100;	 Catch:{ Exception -> 0x0743 }
        r27 = r27[r28];	 Catch:{ Exception -> 0x0743 }
        r10[r11] = r27;	 Catch:{ Exception -> 0x0743 }
        r8 = r8.withSelection(r9, r10);	 Catch:{ Exception -> 0x0743 }
        r9 = z;	 Catch:{ Exception -> 0x0743 }
        r10 = 146; // 0x92 float:2.05E-43 double:7.2E-322;	 Catch:{ Exception -> 0x0743 }
        r9 = r9[r10];	 Catch:{ Exception -> 0x0743 }
        r10 = 2131230775; // 0x7f080037 float:1.8077612E38 double:1.0529679093E-314;	 Catch:{ Exception -> 0x0743 }
        r0 = r30;	 Catch:{ Exception -> 0x0743 }
        r10 = r0.getString(r10);	 Catch:{ Exception -> 0x0743 }
        r11 = 1;	 Catch:{ Exception -> 0x0743 }
        r11 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x0743 }
        r27 = 0;	 Catch:{ Exception -> 0x0743 }
        r11[r27] = r14;	 Catch:{ Exception -> 0x0743 }
        r10 = java.lang.String.format(r10, r11);	 Catch:{ Exception -> 0x0743 }
        r8 = r8.withValue(r9, r10);	 Catch:{ Exception -> 0x0743 }
        r8 = r8.build();	 Catch:{ Exception -> 0x0743 }
        r0 = r21;	 Catch:{ Exception -> 0x0743 }
        r0.add(r8);	 Catch:{ Exception -> 0x0743 }
        r8 = r13.a;	 Catch:{ Exception -> 0x0743 }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ Exception -> 0x0743 }
        r0 = r24;	 Catch:{ Exception -> 0x0743 }
        r0.add(r8);	 Catch:{ Exception -> 0x0743 }
    L_0x050f:
        r6.close();	 Catch:{ all -> 0x0032 }
    L_0x0512:
        r6 = r12.l;	 Catch:{ Exception -> 0x074a }
        if (r6 == 0) goto L_0x074c;	 Catch:{ Exception -> 0x074a }
    L_0x0516:
        r6 = r12.l;	 Catch:{ Exception -> 0x074a }
        r6 = r6.a();	 Catch:{ Exception -> 0x074a }
        r14 = r6;
    L_0x051d:
        r6 = android.text.TextUtils.isEmpty(r14);	 Catch:{ all -> 0x0032 }
        if (r6 != 0) goto L_0x0647;	 Catch:{ all -> 0x0032 }
    L_0x0523:
        r8 = 0;	 Catch:{ all -> 0x0032 }
        r6 = z;	 Catch:{ all -> 0x0032 }
        r9 = 102; // 0x66 float:1.43E-43 double:5.04E-322;	 Catch:{ all -> 0x0032 }
        r9 = r6[r9];	 Catch:{ all -> 0x0032 }
        r6 = 2;	 Catch:{ all -> 0x0032 }
        r10 = new java.lang.String[r6];	 Catch:{ all -> 0x0032 }
        r6 = 0;	 Catch:{ all -> 0x0032 }
        r0 = r13.a;	 Catch:{ all -> 0x0032 }
        r28 = r0;	 Catch:{ all -> 0x0032 }
        r11 = java.lang.String.valueOf(r28);	 Catch:{ all -> 0x0032 }
        r10[r6] = r11;	 Catch:{ all -> 0x0032 }
        r6 = 1;	 Catch:{ all -> 0x0032 }
        r11 = z;	 Catch:{ all -> 0x0032 }
        r27 = 103; // 0x67 float:1.44E-43 double:5.1E-322;	 Catch:{ all -> 0x0032 }
        r11 = r11[r27];	 Catch:{ all -> 0x0032 }
        r10[r6] = r11;	 Catch:{ all -> 0x0032 }
        r11 = 0;	 Catch:{ all -> 0x0032 }
        r6 = r4;	 Catch:{ all -> 0x0032 }
        r9 = r6.query(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0032 }
        if (r9 == 0) goto L_0x0647;
    L_0x0549:
        r6 = r12.u;	 Catch:{ Exception -> 0x0750 }
        if (r6 == 0) goto L_0x0757;	 Catch:{ Exception -> 0x0750 }
    L_0x054d:
        r6 = r12.u;	 Catch:{ Exception -> 0x0750 }
        r6 = r6.intValue();	 Catch:{ Exception -> 0x0750 }
    L_0x0553:
        if (r6 != 0) goto L_0x0769;
    L_0x0555:
        r8 = r12.j;	 Catch:{ Exception -> 0x075a }
        r8 = android.text.TextUtils.isEmpty(r8);	 Catch:{ Exception -> 0x075a }
        if (r8 != 0) goto L_0x075e;
    L_0x055d:
        r8 = r12.j;	 Catch:{ Exception -> 0x075c }
    L_0x055f:
        r10 = r9.moveToNext();	 Catch:{ all -> 0x0752 }
        if (r10 != 0) goto L_0x05de;
    L_0x0565:
        r0 = r13.a;	 Catch:{ Exception -> 0x076c }
        r28 = r0;	 Catch:{ Exception -> 0x076c }
        r11 = java.lang.Long.valueOf(r28);	 Catch:{ Exception -> 0x076c }
        r0 = r25;	 Catch:{ Exception -> 0x076c }
        r11 = r0.contains(r11);	 Catch:{ Exception -> 0x076c }
        if (r11 != 0) goto L_0x05de;
    L_0x0575:
        r11 = android.content.ContentProviderOperation.newInsert(r7);	 Catch:{ Exception -> 0x076e }
        r12 = 1;	 Catch:{ Exception -> 0x076e }
        r11 = r11.withYieldAllowed(r12);	 Catch:{ Exception -> 0x076e }
        r12 = z;	 Catch:{ Exception -> 0x076e }
        r27 = 87;	 Catch:{ Exception -> 0x076e }
        r12 = r12[r27];	 Catch:{ Exception -> 0x076e }
        r0 = r13.a;	 Catch:{ Exception -> 0x076e }
        r28 = r0;	 Catch:{ Exception -> 0x076e }
        r27 = java.lang.Long.valueOf(r28);	 Catch:{ Exception -> 0x076e }
        r0 = r27;	 Catch:{ Exception -> 0x076e }
        r11 = r11.withValue(r12, r0);	 Catch:{ Exception -> 0x076e }
        r12 = z;	 Catch:{ Exception -> 0x076e }
        r27 = 124; // 0x7c float:1.74E-43 double:6.13E-322;	 Catch:{ Exception -> 0x076e }
        r12 = r12[r27];	 Catch:{ Exception -> 0x076e }
        r27 = z;	 Catch:{ Exception -> 0x076e }
        r28 = 130; // 0x82 float:1.82E-43 double:6.4E-322;	 Catch:{ Exception -> 0x076e }
        r27 = r27[r28];	 Catch:{ Exception -> 0x076e }
        r0 = r27;	 Catch:{ Exception -> 0x076e }
        r11 = r11.withValue(r12, r0);	 Catch:{ Exception -> 0x076e }
        r12 = z;	 Catch:{ Exception -> 0x076e }
        r27 = 131; // 0x83 float:1.84E-43 double:6.47E-322;	 Catch:{ Exception -> 0x076e }
        r12 = r12[r27];	 Catch:{ Exception -> 0x076e }
        r11 = r11.withValue(r12, r14);	 Catch:{ Exception -> 0x076e }
        r12 = z;	 Catch:{ Exception -> 0x076e }
        r14 = 97;	 Catch:{ Exception -> 0x076e }
        r12 = r12[r14];	 Catch:{ Exception -> 0x076e }
        r14 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x076e }
        r11 = r11.withValue(r12, r14);	 Catch:{ Exception -> 0x076e }
        r12 = z;	 Catch:{ Exception -> 0x076e }
        r14 = 101; // 0x65 float:1.42E-43 double:5.0E-322;	 Catch:{ Exception -> 0x076e }
        r12 = r12[r14];	 Catch:{ Exception -> 0x076e }
        r11 = r11.withValue(r12, r8);	 Catch:{ Exception -> 0x076e }
        r11 = r11.build();	 Catch:{ Exception -> 0x076e }
        r0 = r21;	 Catch:{ Exception -> 0x076e }
        r0.add(r11);	 Catch:{ Exception -> 0x076e }
        r0 = r13.a;	 Catch:{ Exception -> 0x076e }
        r28 = r0;	 Catch:{ Exception -> 0x076e }
        r11 = java.lang.Long.valueOf(r28);	 Catch:{ Exception -> 0x076e }
        r0 = r25;	 Catch:{ Exception -> 0x076e }
        r0.add(r11);	 Catch:{ Exception -> 0x076e }
        if (r16 == 0) goto L_0x0644;
    L_0x05de:
        if (r10 == 0) goto L_0x0644;
    L_0x05e0:
        r10 = z;	 Catch:{ Exception -> 0x0772 }
        r11 = 91;	 Catch:{ Exception -> 0x0772 }
        r10 = r10[r11];	 Catch:{ Exception -> 0x0772 }
        r10 = r9.getColumnIndex(r10);	 Catch:{ Exception -> 0x0772 }
        r10 = r9.getInt(r10);	 Catch:{ Exception -> 0x0772 }
        if (r10 != 0) goto L_0x0644;
    L_0x05f0:
        r10 = z;	 Catch:{ Exception -> 0x0774 }
        r11 = 111; // 0x6f float:1.56E-43 double:5.5E-322;	 Catch:{ Exception -> 0x0774 }
        r10 = r10[r11];	 Catch:{ Exception -> 0x0774 }
        r10 = r9.getColumnIndex(r10);	 Catch:{ Exception -> 0x0774 }
        r10 = r9.getString(r10);	 Catch:{ Exception -> 0x0774 }
        if (r10 != 0) goto L_0x0644;
    L_0x0600:
        r7 = android.content.ContentProviderOperation.newUpdate(r7);	 Catch:{ Exception -> 0x0776 }
        r10 = z;	 Catch:{ Exception -> 0x0776 }
        r11 = 135; // 0x87 float:1.89E-43 double:6.67E-322;	 Catch:{ Exception -> 0x0776 }
        r10 = r10[r11];	 Catch:{ Exception -> 0x0776 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x0776 }
        r6 = r7.withValue(r10, r6);	 Catch:{ Exception -> 0x0776 }
        r7 = z;	 Catch:{ Exception -> 0x0776 }
        r10 = 112; // 0x70 float:1.57E-43 double:5.53E-322;	 Catch:{ Exception -> 0x0776 }
        r7 = r7[r10];	 Catch:{ Exception -> 0x0776 }
        r6 = r6.withValue(r7, r8);	 Catch:{ Exception -> 0x0776 }
        r7 = z;	 Catch:{ Exception -> 0x0776 }
        r8 = 92;	 Catch:{ Exception -> 0x0776 }
        r7 = r7[r8];	 Catch:{ Exception -> 0x0776 }
        r8 = 2;	 Catch:{ Exception -> 0x0776 }
        r8 = new java.lang.String[r8];	 Catch:{ Exception -> 0x0776 }
        r10 = 0;	 Catch:{ Exception -> 0x0776 }
        r12 = r13.a;	 Catch:{ Exception -> 0x0776 }
        r11 = java.lang.String.valueOf(r12);	 Catch:{ Exception -> 0x0776 }
        r8[r10] = r11;	 Catch:{ Exception -> 0x0776 }
        r10 = 1;	 Catch:{ Exception -> 0x0776 }
        r11 = z;	 Catch:{ Exception -> 0x0776 }
        r12 = 104; // 0x68 float:1.46E-43 double:5.14E-322;	 Catch:{ Exception -> 0x0776 }
        r11 = r11[r12];	 Catch:{ Exception -> 0x0776 }
        r8[r10] = r11;	 Catch:{ Exception -> 0x0776 }
        r6 = r6.withSelection(r7, r8);	 Catch:{ Exception -> 0x0776 }
        r6 = r6.build();	 Catch:{ Exception -> 0x0776 }
        r0 = r21;	 Catch:{ Exception -> 0x0776 }
        r0.add(r6);	 Catch:{ Exception -> 0x0776 }
    L_0x0644:
        r9.close();	 Catch:{ all -> 0x0032 }
    L_0x0647:
        if (r16 == 0) goto L_0x0271;	 Catch:{ all -> 0x0032 }
    L_0x0649:
        r5 = r21.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r5 != 0) goto L_0x065a;
    L_0x064f:
        r5 = z;	 Catch:{ Exception -> 0x0778 }
        r6 = 122; // 0x7a float:1.71E-43 double:6.03E-322;	 Catch:{ Exception -> 0x0778 }
        r5 = r5[r6];	 Catch:{ Exception -> 0x0778 }
        r0 = r21;	 Catch:{ Exception -> 0x0778 }
        r4.applyBatch(r5, r0);	 Catch:{ Exception -> 0x0778 }
    L_0x065a:
        r4 = z;	 Catch:{ all -> 0x0032 }
        r5 = 144; // 0x90 float:2.02E-43 double:7.1E-322;	 Catch:{ all -> 0x0032 }
        r4 = r4[r5];	 Catch:{ all -> 0x0032 }
        r5 = 0;	 Catch:{ all -> 0x0032 }
        r0 = r30;	 Catch:{ all -> 0x0032 }
        r4 = r0.getSharedPreferences(r4, r5);	 Catch:{ all -> 0x0032 }
        if (r4 == 0) goto L_0x068e;
    L_0x0669:
        r5 = z;	 Catch:{ Exception -> 0x0784 }
        r6 = 86;	 Catch:{ Exception -> 0x0784 }
        r5 = r5[r6];	 Catch:{ Exception -> 0x0784 }
        r6 = 0;	 Catch:{ Exception -> 0x0784 }
        r5 = r4.getInt(r5, r6);	 Catch:{ Exception -> 0x0784 }
        r6 = a;	 Catch:{ Exception -> 0x0784 }
        if (r5 == r6) goto L_0x068e;	 Catch:{ Exception -> 0x0784 }
    L_0x0678:
        a(r30, r31);	 Catch:{ Exception -> 0x0784 }
        r4 = r4.edit();	 Catch:{ Exception -> 0x0784 }
        r5 = z;	 Catch:{ Exception -> 0x0784 }
        r6 = 113; // 0x71 float:1.58E-43 double:5.6E-322;	 Catch:{ Exception -> 0x0784 }
        r5 = r5[r6];	 Catch:{ Exception -> 0x0784 }
        r6 = a;	 Catch:{ Exception -> 0x0784 }
        r4 = r4.putInt(r5, r6);	 Catch:{ Exception -> 0x0784 }
        r4.commit();	 Catch:{ Exception -> 0x0784 }
    L_0x068e:
        r0 = r30;	 Catch:{ all -> 0x0032 }
        r1 = r31;	 Catch:{ all -> 0x0032 }
        r2 = r22;	 Catch:{ all -> 0x0032 }
        a(r0, r1, r2);	 Catch:{ all -> 0x0032 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0032 }
        r4.<init>();	 Catch:{ all -> 0x0032 }
        r5 = z;	 Catch:{ all -> 0x0032 }
        r6 = 115; // 0x73 float:1.61E-43 double:5.7E-322;	 Catch:{ all -> 0x0032 }
        r5 = r5[r6];	 Catch:{ all -> 0x0032 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x0032 }
        r5 = r22.size();	 Catch:{ all -> 0x0032 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x0032 }
        r5 = z;	 Catch:{ all -> 0x0032 }
        r6 = 89;	 Catch:{ all -> 0x0032 }
        r5 = r5[r6];	 Catch:{ all -> 0x0032 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x0032 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0032 }
        r6 = r6 - r18;	 Catch:{ all -> 0x0032 }
        r4 = r4.append(r6);	 Catch:{ all -> 0x0032 }
        r5 = z;	 Catch:{ all -> 0x0032 }
        r6 = 127; // 0x7f float:1.78E-43 double:6.27E-322;	 Catch:{ all -> 0x0032 }
        r5 = r5[r6];	 Catch:{ all -> 0x0032 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x0032 }
        r4 = r4.toString();	 Catch:{ all -> 0x0032 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ all -> 0x0032 }
        r4 = com.whatsapp.App.aA;	 Catch:{ all -> 0x0032 }
        r5 = 0;	 Catch:{ all -> 0x0032 }
        r4.c(r5);	 Catch:{ all -> 0x0032 }
        r17.d();	 Catch:{ all -> 0x0032 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0032 }
        r4.<init>();	 Catch:{ all -> 0x0032 }
        r5 = z;	 Catch:{ all -> 0x0032 }
        r6 = 95;	 Catch:{ all -> 0x0032 }
        r5 = r5[r6];	 Catch:{ all -> 0x0032 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x0032 }
        r6 = r17.a();	 Catch:{ all -> 0x0032 }
        r4 = r4.append(r6);	 Catch:{ all -> 0x0032 }
        r4 = r4.toString();	 Catch:{ all -> 0x0032 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ all -> 0x0032 }
        goto L_0x002e;	 Catch:{ all -> 0x0032 }
    L_0x06fc:
        r4 = move-exception;	 Catch:{ all -> 0x0032 }
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x06fe:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0700 }
    L_0x0700:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0702 }
    L_0x0702:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0704 }
    L_0x0704:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0706 }
    L_0x0706:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0708 }
    L_0x0708:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x070a:
        r8 = 0;
        goto L_0x019a;
    L_0x070d:
        r6 = move-exception;
        r7 = z;	 Catch:{ all -> 0x071c }
        r8 = 119; // 0x77 float:1.67E-43 double:5.9E-322;	 Catch:{ all -> 0x071c }
        r7 = r7[r8];	 Catch:{ all -> 0x071c }
        com.whatsapp.util.Log.b(r7, r6);	 Catch:{ all -> 0x071c }
        r21.clear();	 Catch:{ all -> 0x0032 }
        goto L_0x0250;	 Catch:{ all -> 0x0032 }
    L_0x071c:
        r4 = move-exception;	 Catch:{ all -> 0x0032 }
        r21.clear();	 Catch:{ all -> 0x0032 }
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x0721:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0723 }
    L_0x0723:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0725 }
    L_0x0725:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0727 }
    L_0x0727:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0729 }
    L_0x0729:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x072b:
        r6 = 0;
        goto L_0x02a2;
    L_0x072e:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0730 }
    L_0x0730:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0732 }
    L_0x0732:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0734 }
    L_0x0734:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x0736:
        r4 = move-exception;	 Catch:{ all -> 0x0032 }
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x0738:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x073a }
    L_0x073a:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x073c }
    L_0x073c:
        r4 = move-exception;
        r6.close();	 Catch:{ all -> 0x0032 }
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x0741:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0743 }
    L_0x0743:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0745 }
    L_0x0745:
        r4 = move-exception;
        r6.close();	 Catch:{ all -> 0x0032 }
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x074a:
        r4 = move-exception;	 Catch:{ all -> 0x0032 }
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x074c:
        r6 = 0;
        r14 = r6;
        goto L_0x051d;
    L_0x0750:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0752 }
    L_0x0752:
        r4 = move-exception;
        r9.close();	 Catch:{ all -> 0x0032 }
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x0757:
        r6 = 0;
        goto L_0x0553;
    L_0x075a:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x075c }
    L_0x075c:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0752 }
    L_0x075e:
        r8 = 2131232306; // 0x7f080632 float:1.8080718E38 double:1.0529686657E-314;	 Catch:{ all -> 0x0752 }
        r0 = r30;	 Catch:{ all -> 0x0752 }
        r8 = r0.getString(r8);	 Catch:{ all -> 0x0752 }
        goto L_0x055f;
    L_0x0769:
        r8 = 0;
        goto L_0x055f;
    L_0x076c:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x076e }
    L_0x076e:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0770 }
    L_0x0770:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0772 }
    L_0x0772:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0774 }
    L_0x0774:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0776 }
    L_0x0776:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0752 }
    L_0x0778:
        r4 = move-exception;
        r5 = z;	 Catch:{ all -> 0x0032 }
        r6 = 141; // 0x8d float:1.98E-43 double:6.97E-322;	 Catch:{ all -> 0x0032 }
        r5 = r5[r6];	 Catch:{ all -> 0x0032 }
        com.whatsapp.util.Log.b(r5, r4);	 Catch:{ all -> 0x0032 }
        goto L_0x065a;	 Catch:{ all -> 0x0032 }
    L_0x0784:
        r4 = move-exception;	 Catch:{ all -> 0x0032 }
        throw r4;	 Catch:{ all -> 0x0032 }
    L_0x0786:
        r9 = r8;
        goto L_0x01ab;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.PerformSyncManager.b(android.content.Context, android.accounts.Account):void");
    }

    public void onReceive(Context context, Intent intent) {
        c(context);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r12, android.accounts.Account r13, java.util.ArrayList r14) {
        /*
        r8 = c;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r9 = new java.util.ArrayList;
        r9.<init>();
        r10 = r12.getContentResolver();
        r0 = z;
        r2 = 13;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r11 = r14.iterator();
    L_0x001d:
        r0 = r11.hasNext();
        if (r0 == 0) goto L_0x0070;
    L_0x0023:
        r0 = r11.next();
        r0 = (com.whatsapp.l5) r0;
        r2 = r1.size();	 Catch:{ Exception -> 0x00bc }
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 > r3) goto L_0x003c;
    L_0x0031:
        r2 = 3;
        r3 = com.whatsapp.App.am;	 Catch:{ Exception -> 0x00bc }
        if (r2 != r3) goto L_0x0048;
    L_0x0036:
        r2 = r1.isEmpty();	 Catch:{ Exception -> 0x00be }
        if (r2 != 0) goto L_0x0048;
    L_0x003c:
        r2 = z;	 Catch:{ Exception -> 0x00c0 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00c0 }
        r10.applyBatch(r2, r1);	 Catch:{ Exception -> 0x00c0 }
        r1.clear();
    L_0x0048:
        r2 = r0.p;	 Catch:{ Exception -> 0x00d4 }
        r3 = 64;
        r2 = r2.indexOf(r3);	 Catch:{ Exception -> 0x00d4 }
        if (r2 > 0) goto L_0x0057;
    L_0x0052:
        r9.add(r0);	 Catch:{ Exception -> 0x00d4 }
        if (r8 == 0) goto L_0x001d;
    L_0x0057:
        r2 = r0.l;	 Catch:{ Exception -> 0x00d6 }
        if (r2 == 0) goto L_0x00d8;
    L_0x005b:
        r2 = r0.l;	 Catch:{ Exception -> 0x00d6 }
        r5 = r2.a();	 Catch:{ Exception -> 0x00d6 }
    L_0x0061:
        r3 = r0.q;
        r4 = r0.p;
        r6 = r0.u;
        r7 = r0.j;
        r0 = r12;
        r2 = r13;
        a(r0, r1, r2, r3, r4, r5, r6, r7);
        if (r8 == 0) goto L_0x001d;
    L_0x0070:
        r0 = r1.isEmpty();
        if (r0 != 0) goto L_0x007f;
    L_0x0076:
        r0 = z;	 Catch:{ Exception -> 0x00da }
        r2 = 8;
        r0 = r0[r2];	 Catch:{ Exception -> 0x00da }
        r10.applyBatch(r0, r1);	 Catch:{ Exception -> 0x00da }
    L_0x007f:
        r0 = z;	 Catch:{ Exception -> 0x00e5 }
        r1 = 15;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00e5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00e5 }
        r0 = r9.isEmpty();	 Catch:{ Exception -> 0x00e5 }
        if (r0 != 0) goto L_0x00bb;
    L_0x008e:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00e5 }
        r0.<init>();	 Catch:{ Exception -> 0x00e5 }
        r1 = z;	 Catch:{ Exception -> 0x00e5 }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ Exception -> 0x00e5 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00e5 }
        r1 = r9.size();	 Catch:{ Exception -> 0x00e5 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00e5 }
        r1 = z;	 Catch:{ Exception -> 0x00e5 }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ Exception -> 0x00e5 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00e5 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00e5 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x00e5 }
        r0 = com.whatsapp.App.as;	 Catch:{ Exception -> 0x00e5 }
        r0.b(r9);	 Catch:{ Exception -> 0x00e5 }
    L_0x00bb:
        return;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r2 = move-exception;
        r3 = z;	 Catch:{ all -> 0x00cf }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ all -> 0x00cf }
        com.whatsapp.util.Log.b(r3, r2);	 Catch:{ all -> 0x00cf }
        r1.clear();
        goto L_0x0048;
    L_0x00cf:
        r0 = move-exception;
        r1.clear();
        throw r0;
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r5 = 0;
        goto L_0x0061;
    L_0x00da:
        r0 = move-exception;
        r1 = z;
        r2 = 14;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x007f;
    L_0x00e5:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.PerformSyncManager.a(android.content.Context, android.accounts.Account, java.util.ArrayList):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(android.content.Context r13, android.accounts.Account r14) {
        /*
        r6 = com.whatsapp.accountsync.PerformSyncManager.class;
        monitor-enter(r6);
        r7 = c;	 Catch:{ all -> 0x0171 }
        r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI;	 Catch:{ all -> 0x0171 }
        r0 = r0.buildUpon();	 Catch:{ all -> 0x0171 }
        r1 = z;	 Catch:{ all -> 0x0171 }
        r2 = 77;
        r1 = r1[r2];	 Catch:{ all -> 0x0171 }
        r2 = r14.name;	 Catch:{ all -> 0x0171 }
        r0 = r0.appendQueryParameter(r1, r2);	 Catch:{ all -> 0x0171 }
        r1 = z;	 Catch:{ all -> 0x0171 }
        r2 = 65;
        r1 = r1[r2];	 Catch:{ all -> 0x0171 }
        r2 = r14.type;	 Catch:{ all -> 0x0171 }
        r0 = r0.appendQueryParameter(r1, r2);	 Catch:{ all -> 0x0171 }
        r1 = z;	 Catch:{ all -> 0x0171 }
        r2 = 79;
        r1 = r1[r2];	 Catch:{ all -> 0x0171 }
        r2 = z;	 Catch:{ all -> 0x0171 }
        r3 = 72;
        r2 = r2[r3];	 Catch:{ all -> 0x0171 }
        r0 = r0.appendQueryParameter(r1, r2);	 Catch:{ all -> 0x0171 }
        r1 = r0.build();	 Catch:{ all -> 0x0171 }
        r0 = android.provider.ContactsContract.Data.CONTENT_URI;	 Catch:{ all -> 0x0171 }
        r0 = r0.buildUpon();	 Catch:{ all -> 0x0171 }
        r2 = z;	 Catch:{ all -> 0x0171 }
        r3 = 76;
        r2 = r2[r3];	 Catch:{ all -> 0x0171 }
        r3 = z;	 Catch:{ all -> 0x0171 }
        r4 = 75;
        r3 = r3[r4];	 Catch:{ all -> 0x0171 }
        r0 = r0.appendQueryParameter(r2, r3);	 Catch:{ all -> 0x0171 }
        r8 = r0.build();	 Catch:{ all -> 0x0171 }
        r9 = new java.util.ArrayList;	 Catch:{ all -> 0x0171 }
        r9.<init>();	 Catch:{ all -> 0x0171 }
        r0 = r13.getContentResolver();	 Catch:{ all -> 0x0171 }
        r2 = 2;
        r2 = new java.lang.String[r2];	 Catch:{ all -> 0x0171 }
        r3 = 0;
        r4 = z;	 Catch:{ all -> 0x0171 }
        r5 = 69;
        r4 = r4[r5];	 Catch:{ all -> 0x0171 }
        r2[r3] = r4;	 Catch:{ all -> 0x0171 }
        r3 = 1;
        r4 = z;	 Catch:{ all -> 0x0171 }
        r5 = 73;
        r4 = r4[r5];	 Catch:{ all -> 0x0171 }
        r2[r3] = r4;	 Catch:{ all -> 0x0171 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0171 }
        if (r1 == 0) goto L_0x00a0;
    L_0x0078:
        r0 = r1.moveToNext();	 Catch:{ all -> 0x016c }
        if (r0 == 0) goto L_0x009d;
    L_0x007e:
        r0 = 1;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x016c }
        if (r0 == 0) goto L_0x009b;
    L_0x0085:
        r2 = 64;
        r2 = r0.indexOf(r2);	 Catch:{ Exception -> 0x0168 }
        r3 = -1;
        if (r2 == r3) goto L_0x009b;
    L_0x008e:
        r2 = new com.whatsapp.accountsync.d;	 Catch:{ Exception -> 0x016a }
        r3 = 0;
        r4 = r1.getLong(r3);	 Catch:{ Exception -> 0x016a }
        r2.<init>(r4, r0);	 Catch:{ Exception -> 0x016a }
        r9.add(r2);	 Catch:{ Exception -> 0x016a }
    L_0x009b:
        if (r7 == 0) goto L_0x0078;
    L_0x009d:
        r1.close();	 Catch:{ all -> 0x0171 }
    L_0x00a0:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0171 }
        r1.<init>();	 Catch:{ all -> 0x0171 }
        r2 = r9.iterator();	 Catch:{ all -> 0x0171 }
    L_0x00a9:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0171 }
        if (r0 == 0) goto L_0x0153;
    L_0x00af:
        r0 = r2.next();	 Catch:{ all -> 0x0171 }
        r0 = (com.whatsapp.accountsync.d) r0;	 Catch:{ all -> 0x0171 }
        r3 = r0.b;	 Catch:{ all -> 0x0171 }
        r4 = 0;
        r5 = r0.b;	 Catch:{ all -> 0x0171 }
        r9 = 64;
        r5 = r5.indexOf(r9);	 Catch:{ all -> 0x0171 }
        r3 = r3.substring(r4, r5);	 Catch:{ all -> 0x0171 }
        r3 = com.whatsapp.l5.c(r3);	 Catch:{ all -> 0x0171 }
        r4 = r0.a;	 Catch:{ all -> 0x0171 }
        r0 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0171 }
        r4 = android.content.ContentProviderOperation.newUpdate(r8);	 Catch:{ all -> 0x0171 }
        r5 = z;	 Catch:{ all -> 0x0171 }
        r9 = 74;
        r5 = r5[r9];	 Catch:{ all -> 0x0171 }
        r9 = 2;
        r9 = new java.lang.String[r9];	 Catch:{ all -> 0x0171 }
        r10 = 0;
        r9[r10] = r0;	 Catch:{ all -> 0x0171 }
        r10 = 1;
        r11 = z;	 Catch:{ all -> 0x0171 }
        r12 = 71;
        r11 = r11[r12];	 Catch:{ all -> 0x0171 }
        r9[r10] = r11;	 Catch:{ all -> 0x0171 }
        r4 = r4.withSelection(r5, r9);	 Catch:{ all -> 0x0171 }
        r5 = z;	 Catch:{ all -> 0x0171 }
        r9 = 78;
        r5 = r5[r9];	 Catch:{ all -> 0x0171 }
        r9 = 2131230775; // 0x7f080037 float:1.8077612E38 double:1.0529679093E-314;
        r9 = r13.getString(r9);	 Catch:{ all -> 0x0171 }
        r10 = 1;
        r10 = new java.lang.Object[r10];	 Catch:{ all -> 0x0171 }
        r11 = 0;
        r10[r11] = r3;	 Catch:{ all -> 0x0171 }
        r9 = java.lang.String.format(r9, r10);	 Catch:{ all -> 0x0171 }
        r4 = r4.withValue(r5, r9);	 Catch:{ all -> 0x0171 }
        r5 = 1;
        r4 = r4.withYieldAllowed(r5);	 Catch:{ all -> 0x0171 }
        r4 = r4.build();	 Catch:{ all -> 0x0171 }
        r1.add(r4);	 Catch:{ all -> 0x0171 }
        r4 = android.content.ContentProviderOperation.newUpdate(r8);	 Catch:{ all -> 0x0171 }
        r5 = z;	 Catch:{ all -> 0x0171 }
        r9 = 70;
        r5 = r5[r9];	 Catch:{ all -> 0x0171 }
        r9 = 2;
        r9 = new java.lang.String[r9];	 Catch:{ all -> 0x0171 }
        r10 = 0;
        r9[r10] = r0;	 Catch:{ all -> 0x0171 }
        r0 = 1;
        r10 = z;	 Catch:{ all -> 0x0171 }
        r11 = 66;
        r10 = r10[r11];	 Catch:{ all -> 0x0171 }
        r9[r0] = r10;	 Catch:{ all -> 0x0171 }
        r0 = r4.withSelection(r5, r9);	 Catch:{ all -> 0x0171 }
        r4 = z;	 Catch:{ all -> 0x0171 }
        r5 = 67;
        r4 = r4[r5];	 Catch:{ all -> 0x0171 }
        r5 = 2131230777; // 0x7f080039 float:1.8077616E38 double:1.0529679103E-314;
        r5 = r13.getString(r5);	 Catch:{ all -> 0x0171 }
        r9 = 1;
        r9 = new java.lang.Object[r9];	 Catch:{ all -> 0x0171 }
        r10 = 0;
        r9[r10] = r3;	 Catch:{ all -> 0x0171 }
        r3 = java.lang.String.format(r5, r9);	 Catch:{ all -> 0x0171 }
        r0 = r0.withValue(r4, r3);	 Catch:{ all -> 0x0171 }
        r0 = r0.build();	 Catch:{ all -> 0x0171 }
        r1.add(r0);	 Catch:{ all -> 0x0171 }
        if (r7 == 0) goto L_0x00a9;
    L_0x0153:
        r0 = r1.isEmpty();	 Catch:{ all -> 0x0171 }
        if (r0 != 0) goto L_0x0166;
    L_0x0159:
        r0 = r13.getContentResolver();	 Catch:{ Exception -> 0x0174 }
        r2 = z;	 Catch:{ Exception -> 0x0174 }
        r3 = 80;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0174 }
        r0.applyBatch(r2, r1);	 Catch:{ Exception -> 0x0174 }
    L_0x0166:
        monitor-exit(r6);
        return;
    L_0x0168:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x016a }
    L_0x016a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x016c }
    L_0x016c:
        r0 = move-exception;
        r1.close();	 Catch:{ all -> 0x0171 }
        throw r0;	 Catch:{ all -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0174:
        r0 = move-exception;
        r1 = z;	 Catch:{ all -> 0x0171 }
        r2 = 68;
        r1 = r1[r2];	 Catch:{ all -> 0x0171 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x0171 }
        goto L_0x0166;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.PerformSyncManager.a(android.content.Context, android.accounts.Account):void");
    }

    private static Account a(Context context, AccountManager accountManager) {
        try {
            if (App.ad() == null) {
                Log.e(z[45]);
                return null;
            }
            Account account = new Account(context.getString(2131232306), z[44]);
            try {
                if (accountManager.addAccountExplicitly(account, null, null)) {
                    ContentResolver.setIsSyncable(account, z[46], 1);
                    if (c == 0) {
                        return account;
                    }
                }
                Log.e(z[43]);
                return null;
            } catch (SecurityException e) {
                throw e;
            } catch (SecurityException e2) {
                throw e2;
            }
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    private static synchronized void b(Context context) {
        synchronized (PerformSyncManager.class) {
            boolean c = i.c();
            if (!c) {
                try {
                    Log.w(z[63]);
                } catch (SecurityException e) {
                    throw e;
                } catch (SecurityException e2) {
                    throw e2;
                }
            }
            try {
                b(context, d(context));
            } catch (Throwable e3) {
                Log.a(e3);
            }
            if (c) {
                if (!i.b()) {
                    Log.w(z[64]);
                }
            }
        }
    }

    static AtomicBoolean c() {
        return e;
    }

    static void a(Context context) {
        b(context);
    }
}
