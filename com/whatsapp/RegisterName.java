package com.whatsapp;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.ContactsContract.Profile;
import android.support.v7.app.AlertDialog.Builder;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.gdrive.GoogleDriveActivity;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.Collection;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class RegisterName extends VerifyMessageStoreActivity implements tm {
    private static zq B;
    private static final String[] E;
    private EditText A;
    private l5 C;
    private TextView D;
    private Handler o;
    private ai6 p;
    private a23 q;
    private ImageView r;
    private View s;
    private boolean t;
    private Bitmap u;
    private k3 v;
    private View w;
    private ai0 x;
    private OnTouchListener y;
    private Handler z;

    public void onBackPressed() {
        Intent intent = new Intent(E[1]);
        intent.addCategory(E[0]);
        intent.setFlags(268435456);
        startActivity(intent);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(E[58]);
        App.a(true, false);
        App.a((tm) this);
    }

    private void l() {
        Log.i(E[15]);
        String a = a28.a(((EditText) findViewById(2131755858)).getText().toString().trim());
        if (a.length() == 0) {
            Log.w(E[16]);
            App.a((Context) this, 2131231753, 0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        if (B == null || zq.a(B)) {
            App.p.m(a);
            App.a(a);
            if (!App.p((Context) this)) {
                App.b((Context) this, false);
            }
            B = new zq(this, this.z);
            showDialog(0);
            if (((CheckBox) findViewById(2131755865)).isChecked()) {
                a((Context) this, getString(2131232306));
            }
            if (this.s != null) {
                this.s.setVisibility(8);
            }
            f();
            this.o.sendEmptyMessageDelayed(0, 600000);
        }
    }

    public void onPause() {
        Log.i(E[45]);
        super.onPause();
        if (B != null) {
            B.a();
        }
    }

    protected void c(boolean z) {
        super.c(z);
        if (this.p != null && z) {
            this.p.a(1);
        }
    }

    public void d(String str) {
        if (this.C != null && str.equals(this.C.p)) {
            j();
        }
    }

    static {
        String[] strArr = new String[70];
        String str = "vqI:n~{\u0003!oczC</t~Y-fxmTfIXRh";
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
                        i3 = 23;
                        break;
                    case at.g /*1*/:
                        i3 = 31;
                        break;
                    case at.i /*2*/:
                        i3 = 45;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 1;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "ezJ!rcz_&`zz\u0002:ddj@-";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "ezJ!rcz_&`zz\u0002:ddj@-!ezJhwrmD.hr{\u0016hdooA!b~kA1!sv^8mvf\r+nykD&tr?^+srzC";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "ezJ!rcz_&`zz\u0002;dc@I!scf";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "ezJ!rcz_&`zz\u0002,d{~ThfxpJ$d7{_!wr?^-ubo\r,tr?Y'!{~N#!xy\r8derD;r~pC;";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "szO=f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "ezJ&`zz\u0002%rplY'sriH:hqvH,.pmB=qHlT&bHmH9t~mH,";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "ezJ!rcz_&`zz\u0002:ddkB:dsvL$np0N'opmL<r";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "vqI:n~{\u00038derD;r~pCfFRKr\tBTPx\u0006UD";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "ezJ!rcz_&`zz\u0002%ddlL/ddkB:daz_!g~zIgl~l^!op2])svr^hcxjC+d7kBhsrx] nyz";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "ezJ!rcz_&`zz\u0002:ddkB:dsvL$np0H%qcf\u0000%rp2_-rcp_-";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "ezJ!rcz_&`zz\u0002;uvmYefsmD>d:~N<havY1";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "v|Y!ny@^ n`@_-rcp_-^xqH\u0017u~rH\u0017rrkX8";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "ezJ!rcz_&`zz\u0002+ir|Fegxm\u0000$nt~Ae`y{\u0000:dzpY-,u~N#tgl";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "ezJ!rcz_&`zz\u0002;uvmY";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "ezJ!rcz_&`zz\u0002&n:oX;iy~@-";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "tp@fv\u007f~Y;`go\u0003:dpv^<deqL%d9vC!u~~A!{rmr;uvmY\u0017u~rH";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "tp@fv\u007f~Y;`gor8sryH:dy|H;";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "vqI:n~{\u0003!oczC</rgY:`9lE'sc|X</^Qy\rOC";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "vqI:n~{\u0003!oczC</rgY:`9lE'sc|X</Y^`\r";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "vqI:n~{\u0003!oczC</rgY:`9lE'sc|X</^\\b\u0006^EZ~\u0007TE\\h";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "sj]$ht~Y-";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    str = "tp@f`y{_'hs1A)ty|E-s9~N<hxq\u0003\u0001ODKl\u0004MHLe\u0007SC\\x\u001c";
                    obj = 22;
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    strArr2 = strArr3;
                    str = "7mH;t{k\u0017";
                    obj = 23;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "~lr:ddzY";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "ezJ!rcz_&`zz\u0002)bcv[!un2_-rbsYhtytC'vy?_-rbsYhbx{Hh";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "ezJ!rcz_&`zz\u0002)bcv[!un2_-rbsYhsrnX-rc%";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "ezJ!rcz_&`zz\u0002)bcv[!un2_-rbsYhfsmD>d:~N<havY1!t~C+d{zI";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "ezJ!rcz_&`zz\u0002)bcv[!un2_-rbsYhcv|F=q77j'npsHhEev[-!xm\r$nt~Aa!qpX&e7~C,!~l\r*d~qJhsrlY'sr{\u0003";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "7y_'l7XB'f{zi:hazl+u~iD<x9";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    str = "ezJ!rcz_&`zz\u0002,hvsB/.q~D$ds2C-u";
                    obj = 30;
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    strArr2 = strArr3;
                    str = "ezJ!rcz_&`zz\u0002,hvsB/.ez^<nez";
                    obj = 31;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "ezJ!rcz_&`zz\u0002,hvsB/.t~C<,tpC&dtk";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "ezJ!rcz_&`zz\u0002,hvsB/.~qD<qepJ:ddl\u0002!o~k\u0000&t{s\u0002:dzp[-";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "ezJ!rcz_&`zz\u0002,hvsB/.~qD<qepJ:ddl";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "sv^8mvfr&`zz";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "tp@ffxpJ$d";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "ezJ!rcz_&`zz\u0002/dcrH&`zz\r";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "tp@fv\u007f~Y;`go\u0003:dpv^<deqL%d9vC!u~~A!{rmr;uvmY\u0017u~rH";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "tp@fv\u007f~Y;`gor8sryH:dy|H;";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "ezJ!rcz_&`zz\u0002;dcvC!u~~A!{rmY!lr0H:sxm";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "tp@fv\u007f~Y;`go\u0003:dpv^<deqL%d9vC!u~~A!{rmr;uvmY\u0017u~rH";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "tp@fv\u007f~Y;`gor8sryH:dy|H;";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "ezJ!rcz_&`zz\u0002+mr~_<hyvY!`{vW-scv@-.rm_'s";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    str = "ezJ!rcz_&`zz\u00028`blH";
                    obj = 44;
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    strArr2 = strArr3;
                    str = "ezJ!rcz_eovrH";
                    obj = 45;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "tp@fv\u007f~Y;`go";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "ezJ!rcz_&`zz\u0002:dzp[-,dwB:utjYhbvqC'u7oL:rr?^ nekN=u7j_!!";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "tp@f`y{_'hs1A)ty|E-s9~N<hxq\u0003\u001dO^Q~\u001c@[Sr\u001bIXMy\u000bTC";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "vqI:n~{\u0003!oczC</rgY:`9lE'sc|X</^Qy\rOC";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "vqI:n~{\u0003!oczC</rgY:`9lE'sc|X</Y^`\r";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "tp@fv\u007f~Y;`go\u0003\u0005`~q";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "ezJ!rcz_&`zz\u0002%rplY'sr2I'vysB)e:yD&hdwH,";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "vqI:n~{\u0003!oczC</t~Y-fxmTfMVJc\u000bIRM";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "vqI:n~{\u0003!oczC</v|Y!ny1`\tHY";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "tp@fv\u007f~Y;`go";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "tp@fv\u007f~Y;`go\u0003\u0005`~q";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "ezJ!rcz_&`zz\u0002,ddk_'x";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "ezJ!rcz_&`zz\u0002+sr~Y-";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "ezJ!rcz_&`zz\u0002%rplY'sr0E-`{kE1";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "dkL:ur{r/eev[-^yzZ\u0017tdz_\u0017`tkD>hcf";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "ezJ!rcz_&`zz\u0002+sr~Y-.ezJ!rcmL<hxq\r)mezL,x7iH:hqvH,!upX&br?Y'!z~D&";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "ezJ!rcz_&`zz\u0002+sr~Y-.u~Ierc~Y-!upX&br?Y'!z~D&";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "ezJ!rcz_&`zz\u0002+sr~Y-.zv^;hyx\u00008`e~@;!upX&br?Y'!ezJ8ixqH";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "ezJ!rcz_&`zz\u0002+mx|FevepC/";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "DpC1";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "ezJ!rcz_&`zz\u0002;v:zU8hezI";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "ezJ!rcz_&`zz\u0002+m~|F-e8lI+`e{^<`cz\r";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "dkL:ur{r/eev[-^yzZ\u0017tdz_\u0017`tkD>hcf";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    E = strArr3;
                    B = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = "vqI:n~{\u0003!oczC</v|Y!ny1`\tHY";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public RegisterName() {
        this.z = new km(this, Looper.getMainLooper());
        this.o = new k8(this, Looper.getMainLooper());
        this.q = new ef(this);
        this.y = new qc(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m482b() {
        /*
        r7 = this;
        r6 = 2;
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r7.getIntent();
        r0 = r0.getExtras();
        if (r0 == 0) goto L_0x0022;
    L_0x000f:
        r0 = r7.getIntent();
        r2 = E;
        r3 = 6;
        r2 = r2[r3];
        r0 = r0.getBooleanExtra(r2, r4);
        if (r0 == 0) goto L_0x0022;
    L_0x001e:
        r0 = com.whatsapp.App.ay;
        if (r1 == 0) goto L_0x0026;
    L_0x0022:
        r0 = com.whatsapp.App.n(r7);
    L_0x0026:
        r2 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.A(r2);
        r0.jabber_id = r2;
        r2 = r0.jabber_id;
        if (r2 != 0) goto L_0x004e;
    L_0x0034:
        r0 = E;
        r1 = 10;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.App.d(r7, r5);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterPhone.class;
        r0.<init>(r7, r1);
        r7.startActivity(r0);
        r7.finish();
    L_0x004d:
        return;
    L_0x004e:
        r2 = com.whatsapp.App.b(r0);
        if (r2 != 0) goto L_0x0058;
    L_0x0054:
        r7.finish();
        goto L_0x004d;
    L_0x0058:
        com.whatsapp.App.ay = r0;
        com.whatsapp.ProfilePhotoReminder.c();
        r0 = E;
        r2 = 4;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.App.u = r4;
        r0 = r7.getApplication();
        com.whatsapp.App.e(r0);
        com.whatsapp.App.a3();
        r0 = com.whatsapp.App.z();
        com.whatsapp.messaging.MessageService.b(r0);
        r0 = E;
        r2 = 7;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.App.ao();
        r0 = com.whatsapp.App.as;
        r0 = r0.e();
        r7.C = r0;
        r0 = r7.C;
        r0 = r0.p;
        com.whatsapp.App.a(r0, r4, r6);
        r7.j();
        r0 = r7.w;
        r0.setVisibility(r4);
        r0 = r7.p;
        if (r0 == 0) goto L_0x00de;
    L_0x009e:
        r0 = com.whatsapp.App.aK;
        r0 = r0.p();
        if (r0 == 0) goto L_0x00b6;
    L_0x00a6:
        r0 = E;
        r2 = 8;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r7.p;
        r0.a(r6);
        if (r1 == 0) goto L_0x004d;
    L_0x00b6:
        r0 = E;
        r2 = 11;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r7.t;
        if (r0 != 0) goto L_0x00d7;
    L_0x00c3:
        r0 = com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.m();
        if (r0 == 0) goto L_0x00d7;
    L_0x00c9:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.class;
        r0.<init>(r7, r2);
        r2 = 15;
        r7.startActivityForResult(r0, r2);
        r7.t = r5;
    L_0x00d7:
        r0 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r7.removeDialog(r0);
        if (r1 == 0) goto L_0x004d;
    L_0x00de:
        r0 = E;
        r1 = 9;
        r0 = r0[r1];
        r0 = com.whatsapp.App.h(r7, r0);
        if (r0 == 0) goto L_0x004d;
    L_0x00ea:
        r0 = E;
        r1 = 5;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = java.lang.System.currentTimeMillis();
        r2 = 604800000; // 0x240c8400 float:3.046947E-17 double:2.988109026E-315;
        r0 = r0 + r2;
        com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.a(r0);
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterName.b():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.x != null) {
            this.x.a();
            this.x.b();
            i();
        }
        if (this.p != null) {
            this.p.a();
        }
        this.v.a(configuration);
    }

    static l5 b(RegisterName registerName) {
        return registerName.C;
    }

    static boolean h(RegisterName registerName) {
        return registerName.t;
    }

    protected void d() {
        Log.i(E[53]);
        App.aK.m();
        App.x();
        b();
        if (this.p != null) {
            this.p.hide();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case v.m /*0*/:
                e(E[46]);
                return true;
            case at.g /*1*/:
                App.l((Context) this);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    private void f() {
        Editor edit = getSharedPreferences(E[40], 0).edit();
        edit.putLong(E[39], System.currentTimeMillis());
        if (!edit.commit()) {
            Log.w(E[41]);
        }
    }

    private void a(Bitmap bitmap) {
        this.r.setImageBitmap(bitmap);
    }

    static Handler g(RegisterName registerName) {
        return registerName.o;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
        r6 = this;
        r5 = 0;
        r4 = -1;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = E;
        r3 = 27;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r7);
        r2 = E;
        r3 = 24;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        switch(r7) {
            case 12: goto L_0x0033;
            case 13: goto L_0x0056;
            case 14: goto L_0x0075;
            case 15: goto L_0x00c7;
            default: goto L_0x002f;
        };
    L_0x002f:
        super.onActivityResult(r7, r8, r9);
    L_0x0032:
        return;
    L_0x0033:
        if (r8 != r4) goto L_0x0032;
    L_0x0035:
        if (r9 == 0) goto L_0x004d;
    L_0x0037:
        r1 = E;
        r2 = 25;
        r1 = r1[r2];
        r1 = r9.getBooleanExtra(r1, r5);
        if (r1 == 0) goto L_0x004d;
    L_0x0043:
        r1 = r6.C;
        com.whatsapp.r.a(r1, r6);
        r6.j();
        if (r0 == 0) goto L_0x0032;
    L_0x004d:
        r1 = r6.C;
        r2 = 13;
        com.whatsapp.r.a(r9, r1, r6, r2, r6);
        if (r0 == 0) goto L_0x0032;
    L_0x0056:
        r1 = com.whatsapp.r.a();
        r1.delete();
        if (r8 != r4) goto L_0x006c;
    L_0x005f:
        r1 = r6.C;
        r1 = com.whatsapp.r.b(r1, r6);
        if (r1 == 0) goto L_0x0032;
    L_0x0067:
        r6.j();
        if (r0 == 0) goto L_0x0032;
    L_0x006c:
        if (r8 != 0) goto L_0x0032;
    L_0x006e:
        if (r9 == 0) goto L_0x0032;
    L_0x0070:
        com.whatsapp.r.a(r9, r6);
        if (r0 == 0) goto L_0x0032;
    L_0x0075:
        r1 = 3;
        if (r8 != r1) goto L_0x0086;
    L_0x0078:
        r1 = E;
        r2 = 29;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r6.d();
        if (r0 == 0) goto L_0x0032;
    L_0x0086:
        if (r8 != 0) goto L_0x0096;
    L_0x0088:
        r1 = E;
        r2 = 28;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r6.c();
        if (r0 == 0) goto L_0x0032;
    L_0x0096:
        r1 = 2;
        if (r8 == r1) goto L_0x009c;
    L_0x0099:
        r1 = 1;
        if (r8 != r1) goto L_0x00a1;
    L_0x009c:
        r6.c(r5);
        if (r0 == 0) goto L_0x0032;
    L_0x00a1:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = E;
        r3 = 26;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r2 = E;
        r3 = 30;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        if (r0 == 0) goto L_0x0032;
    L_0x00c7:
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6.removeDialog(r1);
        if (r0 == 0) goto L_0x0032;
    L_0x00ce:
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterName.onActivityResult(int, int, android.content.Intent):void");
    }

    private void p() {
        Log.i(E[14]);
        Log.i(E[12]);
        Intent intent = new Intent(this, GoogleDriveActivity.class);
        intent.setAction(E[13]);
        startActivityForResult(intent, 14);
    }

    private long k() {
        return getSharedPreferences(E[18], 0).getLong(E[17], -1);
    }

    public static Intent n() {
        Intent intent = new Intent();
        intent.setClassName(E[56], E[57]);
        intent.setAction(E[55]);
        intent.addCategory(E[54]);
        intent.addFlags(268435456);
        intent.addFlags(2097152);
        return intent;
    }

    public void c(String str) {
    }

    protected Dialog onCreateDialog(int i) {
        Dialog b;
        switch (i) {
            case v.m /*0*/:
                Log.i(E[35]);
                b = b();
                if (B != null) {
                    return b;
                }
                Log.w(E[34]);
                new Handler(Looper.getMainLooper()).postDelayed(new aet(this), 3);
                return b;
            case at.g /*1*/:
                Log.w(E[31]);
                return new Builder(this).setTitle(2131231372).setMessage(getString(2131231370, new Object[]{getString(2131230939)})).setPositiveButton(2131231371, new nl(this)).create();
            case arj.Theme_checkedTextViewStyle /*103*/:
                Log.i(E[32]);
                return e();
            case arj.Theme_switchStyle /*109*/:
                Log.w(E[33]);
                return new Builder(this).setMessage(2131231791).setPositiveButton(2131230911, new aw(this)).setNegativeButton(2131230884, new fk(this)).setOnCancelListener(new aag(this)).create();
            case 122:
                b = new ProgressDialog(this);
                b.setMessage(getString(2131231749));
                b.setIndeterminate(true);
                b.setCancelable(false);
                return b;
            default:
                return super.onCreateDialog(i);
        }
    }

    static ai0 a(RegisterName registerName) {
        return registerName.x;
    }

    static zq a(zq zqVar) {
        B = zqVar;
        return zqVar;
    }

    private Dialog b() {
        this.x = new ai0(this);
        this.x.setCancelable(false);
        return this.x;
    }

    static boolean a(RegisterName registerName, boolean z) {
        registerName.t = z;
        return z;
    }

    private Dialog e() {
        this.p = new aig(this, this);
        this.p.setCancelable(false);
        return this.p;
    }

    public void onResume() {
        Log.i(E[2]);
        super.onResume();
        d(true);
        if (B != null) {
            showDialog(0);
            B.a(this.z);
            i();
        }
        if (App.t((Context) this) == 3 && this.x == null) {
            showDialog(0);
            Log.i(E[3]);
        }
    }

    private void i() {
        long k = k();
        if (k > 0 && System.currentTimeMillis() - k > 600000 && this.s != null) {
            this.s.setVisibility(0);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, java.lang.String r6, int r7) {
        /*
        if (r7 != 0) goto L_0x0024;
    L_0x0002:
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = E;
        r2 = 47;
        r1 = r1[r2];
        r2 = E;
        r3 = 52;
        r2 = r2[r3];
        r0.setClassName(r1, r2);
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.addFlags(r1);
        r1 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r0.addFlags(r1);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0028;
    L_0x0024:
        r0 = n();
    L_0x0028:
        r1 = new android.content.Intent;
        r1.<init>();
        r2 = E;	 Catch:{ URISyntaxException -> 0x0056 }
        r3 = 50;
        r2 = r2[r3];	 Catch:{ URISyntaxException -> 0x0056 }
        r3 = 0;
        r0 = r0.toUri(r3);	 Catch:{ URISyntaxException -> 0x0056 }
        r3 = 0;
        r0 = android.content.Intent.parseUri(r0, r3);	 Catch:{ URISyntaxException -> 0x0056 }
        r1.putExtra(r2, r0);	 Catch:{ URISyntaxException -> 0x0056 }
    L_0x0040:
        r0 = E;
        r2 = 51;
        r0 = r0[r2];
        r1.putExtra(r0, r6);
        r0 = E;
        r2 = 49;
        r0 = r0[r2];
        r1.setAction(r0);
        r5.sendBroadcast(r1);
        return;
    L_0x0056:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = E;
        r4 = 48;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r0.getMessage();
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterName.a(android.content.Context, java.lang.String, int):void");
    }

    public void a(Collection collection) {
    }

    private void j() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131427540);
        float dimension = getResources().getDimension(2131427358);
        Bitmap bitmap = null;
        if (this.C == null || aw2.a(this.C.p)) {
            this.r.setEnabled(false);
            this.w.setVisibility(0);
            if (this.u == null) {
                this.u = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Config.ALPHA_8);
            }
            bitmap = this.u;
        } else {
            this.r.setEnabled(true);
            this.w.setVisibility(8);
            if (this.C.r().exists()) {
                bitmap = this.C.a(dimensionPixelSize, dimension, false);
            }
            if (bitmap == null) {
                bitmap = l5.a(2130837611, dimensionPixelSize, dimension);
            }
        }
        a(bitmap);
    }

    public static void a(Context context, String str) {
        Parcelable n = n();
        Intent intent = new Intent();
        intent.putExtra(E[19], n);
        intent.putExtra(E[22], false);
        intent.putExtra(E[20], str);
        intent.putExtra(E[21], ShortcutIconResource.fromContext(context, 2130839564));
        intent.setAction(E[23]);
        context.sendBroadcast(intent);
    }

    static k3 e(RegisterName registerName) {
        return registerName.v;
    }

    private String a() {
        String string;
        Exception exception;
        AccountManager accountManager;
        Account[] accounts;
        int length;
        int i;
        Account account;
        String str = null;
        boolean z = DialogToastActivity.f;
        if (VERSION.SDK_INT >= 14) {
            try {
                Cursor query = getContentResolver().query(Profile.CONTENT_URI, new String[]{E[36]}, null, null, null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        string = query.getString(0);
                    } else {
                        string = null;
                    }
                    try {
                        query.close();
                    } catch (Exception e) {
                        str = string;
                        exception = e;
                        Log.e(E[38] + exception.toString());
                        string = str;
                        if (string == null) {
                            accountManager = AccountManager.get(App.z().getApplicationContext());
                            if (accountManager != null) {
                                accounts = accountManager.getAccounts();
                                if (accounts != null) {
                                    length = accounts.length;
                                    i = 0;
                                    while (i < length) {
                                        account = accounts[i];
                                        try {
                                            if (account.type.equals(E[37])) {
                                                if (account.name.contains("@")) {
                                                    string = account.name.substring(0, account.name.indexOf("@")).replace('.', ' ');
                                                    if (!z) {
                                                        break;
                                                    }
                                                }
                                                string = account.name.replace('.', ' ');
                                                if (!z) {
                                                    break;
                                                }
                                            }
                                            i++;
                                            if (z) {
                                                break;
                                            }
                                        } catch (Exception exception2) {
                                            throw exception2;
                                        }
                                    }
                                }
                            }
                        }
                        return string;
                    }
                    if (string == null) {
                        accountManager = AccountManager.get(App.z().getApplicationContext());
                        if (accountManager != null) {
                            accounts = accountManager.getAccounts();
                            if (accounts != null) {
                                length = accounts.length;
                                i = 0;
                                while (i < length) {
                                    account = accounts[i];
                                    if (account.type.equals(E[37])) {
                                        if (account.name.contains("@")) {
                                            string = account.name.substring(0, account.name.indexOf("@")).replace('.', ' ');
                                            if (z) {
                                                break;
                                            }
                                        }
                                        string = account.name.replace('.', ' ');
                                        if (z) {
                                            break;
                                        }
                                    }
                                    i++;
                                    if (z) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    return string;
                }
            } catch (Exception exception22) {
                throw exception22;
            } catch (Exception e2) {
                exception22 = e2;
            }
        }
        string = null;
        if (string == null) {
            accountManager = AccountManager.get(App.z().getApplicationContext());
            if (accountManager != null) {
                accounts = accountManager.getAccounts();
                if (accounts != null) {
                    length = accounts.length;
                    i = 0;
                    while (i < length) {
                        account = accounts[i];
                        if (account.type.equals(E[37])) {
                            if (account.name.contains("@")) {
                                string = account.name.substring(0, account.name.indexOf("@")).replace('.', ' ');
                                if (z) {
                                    break;
                                }
                            }
                            string = account.name.replace('.', ' ');
                            if (z) {
                                break;
                            }
                        }
                        i++;
                        if (z) {
                            break;
                        }
                    }
                }
            }
        }
        return string;
    }

    static void f(RegisterName registerName) {
        registerName.m();
    }

    static View a(RegisterName registerName, View view) {
        registerName.s = view;
        return view;
    }

    public void m481a() {
    }

    public void a(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        r9 = 25;
        r8 = 2;
        r4 = 8;
        r7 = 1;
        r6 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = E;
        r2 = 59;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r11);
        if (r11 == 0) goto L_0x0025;
    L_0x0017:
        r0 = E;
        r2 = 61;
        r0 = r0[r2];
        r0 = r11.getBoolean(r0, r6);
        r10.t = r0;
        if (r1 == 0) goto L_0x0027;
    L_0x0025:
        r10.t = r6;
    L_0x0027:
        r0 = r10.getSupportActionBar();
        r0.setDisplayShowCustomEnabled(r7);
        r0 = 2130903258; // 0x7f0300da float:1.7413329E38 double:1.0528060944E-314;
        r10.setContentView(r0);
        r0 = com.whatsapp.App.t(r10);
        if (r0 == r8) goto L_0x005f;
    L_0x003a:
        r2 = 3;
        if (r0 != r2) goto L_0x0048;
    L_0x003d:
        r0 = E;
        r2 = 62;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        if (r1 == 0) goto L_0x0051;
    L_0x0048:
        r0 = E;
        r1 = 63;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x0051:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r10, r1);
        r10.startActivity(r0);
        r10.finish();
    L_0x005e:
        return;
    L_0x005f:
        r0 = com.whatsapp.App.z();
        r0 = com.whatsapp.App.A(r0);
        if (r0 != 0) goto L_0x0083;
    L_0x0069:
        r0 = E;
        r1 = 64;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.App.d(r10, r7);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterPhone.class;
        r0.<init>(r10, r1);
        r10.startActivity(r0);
        r10.finish();
        goto L_0x005e;
    L_0x0083:
        r0 = r10.getSupportActionBar();
        r2 = 2131231548; // 0x7f08033c float:1.807918E38 double:1.052968291E-314;
        r2 = r10.getString(r2);
        r3 = new com.whatsapp.bf;
        r3.<init>(r10);
        com.whatsapp.akz.a(r10, r0, r2, r3);
        r0 = com.whatsapp.App.j;
        if (r0 == 0) goto L_0x00a8;
    L_0x009a:
        r0 = android.os.Build.MANUFACTURER;
        r2 = E;
        r3 = 66;
        r2 = r2[r3];
        r0 = r0.startsWith(r2);
        if (r0 == 0) goto L_0x00d4;
    L_0x00a8:
        r0 = 2131755863; // 0x7f100357 float:1.9142617E38 double:1.053227337E-314;
        r0 = r10.findViewById(r0);
        r0.setVisibility(r4);
        r0 = 2131755865; // 0x7f100359 float:1.9142621E38 double:1.053227338E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r0.setChecked(r6);
        r0 = 2131755461; // 0x7f1001c5 float:1.9141802E38 double:1.0532271386E-314;
        r0 = r10.findViewById(r0);
        r0.setVisibility(r4);
        r0 = 2131755464; // 0x7f1001c8 float:1.9141808E38 double:1.05322714E-314;
        r0 = r10.findViewById(r0);
        r0.setVisibility(r4);
        if (r1 == 0) goto L_0x00ef;
    L_0x00d4:
        r0 = 2131755865; // 0x7f100359 float:1.9142621E38 double:1.053227338E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r0.setChecked(r7);
        r0 = 2131755863; // 0x7f100357 float:1.9142617E38 double:1.053227337E-314;
        r0 = r10.findViewById(r0);
        r2 = new com.whatsapp.aob;
        r2.<init>(r10);
        r0.setOnClickListener(r2);
    L_0x00ef:
        r0 = 2131755862; // 0x7f100356 float:1.9142615E38 double:1.0532273367E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.D = r0;
        r0 = 2131755630; // 0x7f10026e float:1.9142145E38 double:1.053227222E-314;
        r0 = r10.findViewById(r0);
        r2 = new com.whatsapp.ic;
        r2.<init>(r10);
        r0.setOnClickListener(r2);
        r0 = new com.whatsapp.k3;
        r0.<init>(r10);
        r10.v = r0;
        r0 = r10.v;
        r2 = r10.q;
        r0.a(r2);
        r0 = 2131755804; // 0x7f10031c float:1.9142498E38 double:1.053227308E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r10.r = r0;
        r0 = r10.r;
        r2 = new com.whatsapp.e7;
        r2.<init>(r10);
        r0.setOnClickListener(r2);
        r0 = 2131755497; // 0x7f1001e9 float:1.9141875E38 double:1.0532271564E-314;
        r0 = r10.findViewById(r0);
        r10.w = r0;
        r0 = B;
        if (r0 == 0) goto L_0x0149;
    L_0x0139:
        r0 = com.whatsapp.App.as;
        r0 = r0.e();
        r10.C = r0;
        r10.j();
        r10.showDialog(r6);
        if (r1 == 0) goto L_0x01a3;
    L_0x0149:
        r0 = com.whatsapp.App.aK;
        r0 = r0.c();
        if (r0 != 0) goto L_0x017a;
    L_0x0151:
        r0 = android.os.Environment.getExternalStorageState();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = E;
        r4 = 68;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r10.f(r6);
        if (r0 == 0) goto L_0x0178;
    L_0x0175:
        r10.p();
    L_0x0178:
        if (r1 == 0) goto L_0x01a3;
    L_0x017a:
        r0 = E;
        r2 = 60;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.aK;
        r0.m();
        com.whatsapp.App.x();
        r10.b();
        r0 = r10.t;
        if (r0 != 0) goto L_0x01a3;
    L_0x0192:
        r0 = com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.m();
        if (r0 == 0) goto L_0x01a3;
    L_0x0198:
        r2 = java.lang.System.currentTimeMillis();
        r4 = 604800000; // 0x240c8400 float:3.046947E-17 double:2.988109026E-315;
        r2 = r2 + r4;
        com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.a(r2);
    L_0x01a3:
        r0 = 2131755858; // 0x7f100352 float:1.9142607E38 double:1.053227335E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r10.A = r0;
        r0 = r10.A;
        com.whatsapp.aam.a(r0);
        r0 = r10.A;
        com.whatsapp.aam.a(r0);
        r0 = r10.A;
        r2 = new com.whatsapp.hu;
        r3 = r10.A;
        r4 = r10.D;
        r2.<init>(r3, r4, r9);
        r0.addTextChangedListener(r2);
        r0 = r10.A;
        r2 = new android.text.InputFilter[r7];
        r3 = new com.whatsapp.aes;
        r3.<init>(r9);
        r2[r6] = r3;
        r0.setFilters(r2);
        r0 = r10.a();
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x01ee;
    L_0x01de:
        r2 = r10.A;
        r2.setText(r0);
        r0 = r10.A;
        r2 = r10.A;
        r2 = r2.length();
        r0.setSelection(r2);
    L_0x01ee:
        r0 = com.whatsapp.App.p;
        r0 = r0.F();
        if (r0 == 0) goto L_0x0204;
    L_0x01f6:
        r0 = E;
        r2 = 65;
        r0 = r0[r2];
        com.whatsapp.util.Log.w(r0);
        r10.d();
        if (r1 == 0) goto L_0x0216;
    L_0x0204:
        r0 = com.whatsapp.App.a4();
        if (r0 == 0) goto L_0x0216;
    L_0x020a:
        r0 = E;
        r1 = 67;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r10.f();
    L_0x0216:
        com.whatsapp.App.d(r10, r8);
        com.whatsapp.App.b(r10);
        com.whatsapp.App.an = r6;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterName.onCreate(android.os.Bundle):void");
    }

    static EditText i(RegisterName registerName) {
        return registerName.A;
    }

    private void m() {
        Editor edit = getSharedPreferences(E[43], 0).edit();
        edit.remove(E[42]);
        if (!edit.commit()) {
            Log.w(E[44]);
        }
    }

    static OnTouchListener k(RegisterName registerName) {
        return registerName.y;
    }

    public void b(String str) {
    }

    static View c(RegisterName registerName) {
        return registerName.s;
    }

    static void d(RegisterName registerName) {
        registerName.i();
    }

    static zq o() {
        return B;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean(E[69], this.t);
        }
    }

    static void j(RegisterName registerName) {
        registerName.l();
    }
}
