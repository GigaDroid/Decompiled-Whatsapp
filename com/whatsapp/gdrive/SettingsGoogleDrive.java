package com.whatsapp.gdrive;

import android.accounts.AccountManager;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.Main;
import com.whatsapp.SettingsChat;
import com.whatsapp.amh;
import com.whatsapp.arj;
import com.whatsapp.as8;
import com.whatsapp.auv;
import com.whatsapp.by;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.ue;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import com.whatsapp.util.cs;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SettingsGoogleDrive extends DialogToastActivity implements cg, fv {
    private static boolean H;
    private static final String[] P;
    private final as8 A;
    private ImageView B;
    private String C;
    private final bi D;
    private TextView E;
    private boolean F;
    private View G;
    private OnClickListener I;
    private final ConditionVariable J;
    private TextView K;
    private OnClickListener L;
    private TextView M;
    private GoogleDriveService N;
    private ProgressBar O;
    private String[] n;
    private TextView o;
    private final ServiceConnection p;
    private final ConditionVariable q;
    private View r;
    private OnClickListener s;
    private View t;
    private CheckBox u;
    private ImageView v;
    private Button w;
    private Object x;
    private OnClickListener y;
    private boolean z;

    public class AuthRequestDialogFragment extends DialogFragment {
        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            Dialog ueVar = new ue(getContext());
            ueVar.setTitle(2131231926);
            ueVar.setIndeterminate(true);
            ueVar.setMessage(getString(2131231925));
            ueVar.setCancelable(true);
            ueVar.setOnCancelListener(new cp(this));
            return ueVar;
        }
    }

    static {
        String[] strArr = new String[111];
        String str = "=+hh\u0016 )o1\u0018*<uj\u001aa<yo\n#+";
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
                        i3 = 78;
                        break;
                    case at.g /*1*/:
                        i3 = 78;
                        break;
                    case at.i /*2*/:
                        i3 = 28;
                        break;
                    case at.o /*3*/:
                        i3 = 28;
                        break;
                    default:
                        i3 = 127;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "=+hh\u0016 )1{\u001b<'jyP/-hu\t':e1\r+=ip\u000ba/\u007f\u007f\u0010; h1\u000f'-wy\rn/\u007f\u007f\u0010; hR\u001e#+<u\fn ip\u0013";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa/\u007fh\u00168'heR<+oi\u0013:n}\u007f\u001c!;rh_; \u007ft\u001e )yxSn:sw\u001a nny\u001c+'jy\u001bn(sn_";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "/;ht>--si\u0011:";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa/\u007fh\u00168'heR<+oi\u0013:nry\bn/\u007f\u007f\u0010; hR\u001e#+<u\fn";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "/;ht <+mi\u001a=:Cx\u0016/\"s{";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "=+hh\u0016 )1{\u001b<'jyP/-hu\t':e1\r+=ip\u000ba/\u007f\u007f\u0010; h1\u000f'-wy\rn/\u007f\u007f\u0010; hR\u001e#+<u\fn";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "/;ht\u000b!%yr";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa/\u007fh\u00168'heR<+oi\u0013:nny\u000e;+ohEn";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "n<yo\n\":&<";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "/;ht <+mi\u001a=:Cx\u0016/\"s{";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "/;ht>--si\u0011:";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa/\u007f\u007f\u0010; h1\f+\"y\u007f\u000b!<3~\u001e-%ilP<;rr\u0016 )";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "/ xn\u0010'*2l\u001a<#uo\f'!r28\u000b\u001aC]<\r\u0001IR+\u001d";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "#+oo\u001e)+Cu\u001b";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa/\u007f\u007f\u0010; h1\f+\"y\u007f\u000b!<3r\u0010c/\u007f\u007f\u0010; h1\u0019!;rxP=:}n\u000bc/xxR/-\u007fs\n :1}\u001c:'ju\u000b7";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "/ xn\u0010'*2l\u001a<#uo\f'!r28\u000b\u001aC]<\r\u0001IR+\u001d";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "*'}p\u0010)\u0011ux";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "#;ph\u0016\u0011\"ur\u001a\u0011\"uo\u000b\u0011'hy\u0012=\u0011wy\u0006";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa/\u007f\u007f\u0010; h1\f+\"y\u007f\u000b!<3o\u000b/<hu\u0011)c}\u007f\u001c!;rhR>'\u007fw\u001a<ari\u0012c/\u007f\u007f\u0010; hoP";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "*<}k\u001e,\"yC\u0016*";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ">+nq *+ru\u001e\"\u0011qy\f=/{y '*";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "=+py\u001c:+xC\u0016:+qC\u0016 *yd";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "/-\u007fs\n :1l\u0016-%yn";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = ":'hp\u001a";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = ">+nq\u0016==us\u0011=";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "-!q2\u0018!!{p\u001a";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    str = "/-\u007fs\n :1l\u0016-%yn";
                    obj = 27;
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    strArr2 = strArr3;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa/\u007f\u007f\u0010; h1\f+\"y\u007f\u000b!<3n\u001a=:sn\u001aa<ir\u0011' {";
                    obj = 28;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "/;ht <+mi\u001a=:Cx\u0016/\"s{";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa/ih\u0017c<ym\n+=h<\u001e--si\u0011:n~y\u0016 )<i\f+*<u\fn";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa/ih\u0017c<ym\n+=h<\u001d\"!\u007fw\u0016 )<s\u0011n:sw\u001a \u001cy\u007f\u001a'8yx";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa(yh\u001c&c}i\u000b&chs\u0014+ ";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "/;ht <+mi\u001a=:Cx\u0016/\"s{";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa/ih\u0017c<ym\n+=h";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa,}\u007f\u0014;>1r\u001a:9sn\u0014a";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "*'}p\u0010)\u0011ux";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "#+oo\u001e)+";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "-/r\u007f\u001a\"/~p\u001a";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = " +{}\u000b'8yC\u001d;:hs\u0011";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "/-hu\u0010 \u0011ly\r(!nq ,/\u007fw\n>\u0011sj\u001a<\u0011\u007fy\u0013\";p}\r";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa ykR' hy\u0011:a}\u007f\u000b'!r3";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = ">!ou\u000b'8yC\u001d;:hs\u0011";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "*'}p\u0010)\u0011ux";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = ">!ou\u000b'8yC\u001d;:hs\u0011";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "/-hu\u0010 \u0011ly\r(!nq #+xu\u001e\u0011<yo\u000b!<yC\u00108+nC\u001c+\"pi\u0013/<";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "/-hu\u0010 \u0011ly\r(!nq ,/\u007fw\n>\u0011sj\u001a<\u0011\u007fy\u0013\";p}\r";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "/-hu\u0010 \u0011ly\r(!nq #+xu\u001e\u0011<yo\u000b!<yC\u00108+nC\u001c+\"pi\u0013/<";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "#+oo\u001e)+";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "/-hu\u0010 \u0011ly\r(!nq #+xu\u001e\u0011<yo\u000b!<yC\u00108+nC\u001c+\"pi\u0013/<";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "/-hu\u0010 \u0011ly\r(!nq ,/\u007fw\n>\u0011sj\u001a<\u0011\u007fy\u0013\";p}\r";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = " +{}\u000b'8yC\u001d;:hs\u0011";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "-/r\u007f\u001a\"/~p\u001a";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa ykR' hy\u0011:air\u001a6>y\u007f\u000b+*1}\u001c:'srP";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa-t}\u0011)+1z\r+?3u\u0011*+d&";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "a8}p\n+t";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa-t}\u0011)+1z\r+?3i\u0011+6ly\u001c:+x1\u001c&!u\u007f\u001aa";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa-t}\u0011)+1z\r+?<z\u001e'\"yx_:!<o\u001a:nht\u001an yk_(<ym\n+ \u007feQ";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "; yd\u000f+-hy\u001bn*u}\u0013!)<~\u00106t<";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*yo\u000b<!e";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa)yhR,/\u007fw\n>czn\u001a?cur\u001b+63";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*uo\u000f\"/e1\u001d/-wi\u000fc+nn\u0010<a";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*uo\u000f\"/e1\u001d/-wi\u000fc+nn\u0010<nz}\u0016\"+x<\u000b!nxu\f>\"}e_+<ns\rn";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*uo\u000f\"/e1\u001d/-wi\u000fc+nn\u0010<air\u001a6>y\u007f\u000b+*1y\r<!n3\u0019'\"y1\u0011!:1z\u0010; x";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*uo\u000f\"/e1\u001d/-wi\u000fc+nn\u0010<air\u0017/ xp\u001a*cyn\r!<3";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "n=ur\u001c+n]\u007f\u000b'8uh\u0006n'o<\u001e,!ih_:!<z\u0016 'otQ";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa-ny\u001e:+";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "' hy\u0011:\u0011}p\r+/xe >/no\u001a*";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa-ny\u001e:+<{\u0010!)py_*<uj\u001an/\u007f\u007f\u001a==<r\u0010:n}p\u0013!9yxQ";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "' hy\u0011:\u0011}p\r+/xe >/no\u001a*";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*u}\u0013!)UxR";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "c*uo\u0012'=oy\u001b";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa)ss\u0018\"+1l\u0013/71o\u001a<8u\u007f\u001a=cuoR,<sw\u001a ";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa;oy\rc-sr\u0019'<qy\u001bc#yx\u0016/cny\f:!nyR!8ynR-+pp\n\"/n";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa>yn\u0019!<q1\u001d/-wi\u000fn;oy\rn*y\u007f\u0016*+x<\u000b!nly\r(!nq_\t!s{\u0013+nXn\u00168+<~\u001e-%il_!8yn_-+pp\n\"/n<W9&yr_:&y<\f+:hu\u0011)=<o\u001e7nKuR\b'<s\u0011\"75";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa;oy\rc-sr\u0019'<qy\u001bc,}\u007f\u0014;>1s\t+<1\u007f\u001a\"\"ip\u001e<";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "; yd\u000f+-hy\u001bn*u}\u0013!)<~\u00106t<";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    str = ">!ou\u000b'8yC\u001d;:hs\u0011";
                    obj = 77;
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    strArr2 = strArr3;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa>yn\u0019!<q1\u001d/-wi\u000fa,}\u007f\u0014;>3l\u001a *ur\u0018";
                    obj = 78;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa>yn\u0019!<q1\u001d/-wi\u000f";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = " +{}\u000b'8yC\u001d;:hs\u0011";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa>yn\u0019!<q1\u001d/-wi\u000fa/\u007f\u007f\u0010; h3\u0011;\"p";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa>yn\u0019!<q1\u001d/-wi\u000fa s1\u001b/:}1\u001c! ry\u001c:'sr";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa>yn\u0019!<q1\u001d/-wi\u000fa;rw\u0011!9r1\u0011+:ks\r%che\u000f+a";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = ":'hp\u001a";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "*'}p\u0010)\u0011ux";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "#+oo\u001e)+";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa>yn\u0019!<q1\u001d/-wi\u000fa=h}\r:c{x\r'8y1\u001d/-wi\u000f";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa>yn\u0019!<q1\u001d/-wi\u000fa<yo\u000b!<y1\u0012+*u}P<;rr\u0016 )";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "/-hu\u0010 \u0011~}\u001c%;l";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = ":7ly";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = ";=yn ' uh\u0016/:yx";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*uo\u000f\"/e1\u0012+*u}R<+oh\u0010<+1y\r<!n3";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "n=ur\u001c+n]\u007f\u000b'8uh\u0006n'o<\u001e,!ih_:!<z\u0016 'otQ";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*uo\u000f\"/e1\u0012+*u}R<+oh\u0010<+1y\r<!n3\n +dl\u001a-:yxR+<ns\ra(}u\u0013+*1h\u0010c/ih\u0017+ hu\u001c/:y1\b':t1\b&/ho\u001e>>1o\u001a<8yn\f";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "n*sk\u0011\"!}x\u001a*n\u007f}\u0011 !h<\u001d+nqs\r+nht\u001e nhs\u000b/\"2";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "n*sk\u0011\"!}xEn";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*uo\u000f\"/e1\u0012+*u}R<+oh\u0010<+1y\r<!n<\u0019/'py\u001bn:s<\u001b'=lp\u001e7nyn\r!<<";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*uo\u000f\"/e1\u0012+*u}R<+oh\u0010<+1y\r<!n3\n +dl\u001a-:yxP";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "n:sh\u001e\"t<";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*uo\u000f\"/e1\u0012+*u}R<+oh\u0010<+1y\r<!n3\n &}r\u001b\"+x1\u001a<<snP";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa*uo\u000f\"/e1\u0012+*u}R<+oh\u0010<+1y\r<!n3";
                    obj = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa>yn\u0019!<q1\u001d/-wi\u000fn;oy\rn*y\u007f\u0013' yx_:!<l\u001a<(sn\u0012n\tss\u0018\"+<X\r'8y<\u001d/-wi\u000fn!jy\rn-yp\u0013;\"}n_f9ty\u0011n:ty_=+hh\u0016 )o<\f/7<K\u0016c\bu<\u0010 \"e5";
                    obj = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "; yd\u000f+-hy\u001bn*u}\u0013!)<~\u00106t<";
                    obj = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa;oy\rc*y\u007f\u0013' yxR:!1n\u001a=:sn\u001ac#yx\u0016/csj\u001a<c\u007fy\u0013\";p}\r";
                    obj = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa-}r\u001c+\"1q\u001a*'}1\r+=hs\r+cxu\u001e\"!{3\n=+n1\u001b+-ux\u001a*crs\u000bc:s1\u001c/ \u007fy\u0013";
                    obj = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa;oy\rc*y\u007f\u0013' yxR:!1~\u001e-%ilR!8ynR-+pp\n\"/n";
                    obj = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "; yd\u000f+-hy\u001bn*u}\u0013!)<~\u00106t<";
                    obj = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "/;ht>--si\u0011:";
                    obj = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "-!q2\u0018!!{p\u001a";
                    obj = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    P = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "=+hh\u0016 )o1\u0018*<uj\u001aa-}r\u001c+\"1q\u001a*'}1\r+=hs\r+n{s\u0010)\"y<\u001b<'jy_=+nj\u0016-+<s\u001d$+\u007fh_'=<r\n\"\"0<\n +dl\u001a-:yxQ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void b(SettingsGoogleDrive settingsGoogleDrive, int i) {
        settingsGoogleDrive.i(i);
    }

    static boolean a(SettingsGoogleDrive settingsGoogleDrive, String str) {
        return settingsGoogleDrive.a(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(@android.support.annotation.NonNull java.lang.String r7) {
        /*
        r6 = this;
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        com.whatsapp.auv.b();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = P;
        r2 = 31;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = com.whatsapp.gdrive.fn.a(r7);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new com.whatsapp.gdrive.SettingsGoogleDrive$AuthRequestDialogFragment;
        r0.<init>();
        r1 = new com.whatsapp.gdrive.bz;
        r1.<init>(r6, r0);
        r6.runOnUiThread(r1);
        r1 = r6.J;
        r1.close();
        r1 = new com.whatsapp.gdrive.bx;
        r1.<init>(r6, r7, r0);
        com.whatsapp.util.bq.a(r1);
        r0 = P;
        r1 = 32;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r1 = new com.whatsapp.util.ab;
        r0 = P;
        r2 = 33;
        r0 = r0[r2];
        r1.<init>(r0);
        r0 = r6.J;
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.block(r2);
        r0 = r6.C;
        if (r0 != 0) goto L_0x0075;
    L_0x005c:
        r0 = r6.getSupportFragmentManager();
        r2 = P;
        r3 = 34;
        r2 = r2[r3];
        r0 = r0.findFragmentByTag(r2);
        r0 = (android.support.v4.app.DialogFragment) r0;
        if (r0 == 0) goto L_0x0071;
    L_0x006e:
        r0.dismissAllowingStateLoss();	 Catch:{ InterruptedException -> 0x009d }
    L_0x0071:
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        if (r0 == 0) goto L_0x0097;
    L_0x0075:
        r0 = r1.b();
        r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x0082;
    L_0x007d:
        r0 = r4 - r0;
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x00a1, IllegalStateException -> 0x009f }
    L_0x0082:
        r0 = r6.getSupportFragmentManager();
        r1 = P;
        r2 = 30;
        r1 = r1[r2];
        r0 = r0.findFragmentByTag(r1);
        r0 = (android.support.v4.app.DialogFragment) r0;
        if (r0 == 0) goto L_0x0097;
    L_0x0094:
        r0.dismissAllowingStateLoss();	 Catch:{ InterruptedException -> 0x00ac }
    L_0x0097:
        r0 = r6.C;	 Catch:{ InterruptedException -> 0x00ae }
        if (r0 == 0) goto L_0x00b0;
    L_0x009b:
        r0 = 1;
    L_0x009c:
        return r0;
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r0 = move-exception;
        r1 = P;
        r2 = 35;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0082;
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = 0;
        goto L_0x009c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.a(java.lang.String):boolean");
    }

    static OnClickListener m(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.s;
    }

    private void i() {
        bq.a(new du(this, AccountManager.get(this).addAccount(P[110], null, null, null, this, null, null)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
        r3 = this;
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = com.whatsapp.App.j;	 Catch:{ IllegalStateException -> 0x000f }
        r2 = 3;
        if (r1 != r2) goto L_0x000a;
    L_0x0007:
        switch(r4) {
            case 29: goto L_0x0027;
            case 30: goto L_0x0033;
            case 31: goto L_0x003f;
            case 32: goto L_0x004b;
            case 33: goto L_0x0057;
            case 34: goto L_0x0063;
            case 35: goto L_0x006f;
            case 36: goto L_0x007b;
            case 37: goto L_0x0087;
            case 38: goto L_0x0093;
            case 39: goto L_0x009f;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = super.onKeyDown(r4, r5);
        return r0;
    L_0x000f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0013 }
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;
    L_0x0027:
        com.whatsapp.gdrive.GoogleDriveService.az();	 Catch:{ IllegalStateException -> 0x0013 }
        r1 = r3.N;	 Catch:{ IllegalStateException -> 0x0013 }
        r2 = 11;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x0013 }
        if (r0 == 0) goto L_0x000a;
    L_0x0033:
        com.whatsapp.gdrive.GoogleDriveService.az();	 Catch:{ IllegalStateException -> 0x0015 }
        r1 = r3.N;	 Catch:{ IllegalStateException -> 0x0015 }
        r2 = 12;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x0015 }
        if (r0 == 0) goto L_0x000a;
    L_0x003f:
        com.whatsapp.gdrive.GoogleDriveService.az();	 Catch:{ IllegalStateException -> 0x0017 }
        r1 = r3.N;	 Catch:{ IllegalStateException -> 0x0017 }
        r2 = 14;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x0017 }
        if (r0 == 0) goto L_0x000a;
    L_0x004b:
        com.whatsapp.gdrive.GoogleDriveService.az();	 Catch:{ IllegalStateException -> 0x0019 }
        r1 = r3.N;	 Catch:{ IllegalStateException -> 0x0019 }
        r2 = 13;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x0019 }
        if (r0 == 0) goto L_0x000a;
    L_0x0057:
        com.whatsapp.gdrive.GoogleDriveService.az();	 Catch:{ IllegalStateException -> 0x001b }
        r1 = r3.N;	 Catch:{ IllegalStateException -> 0x001b }
        r2 = 16;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x001b }
        if (r0 == 0) goto L_0x000a;
    L_0x0063:
        com.whatsapp.gdrive.GoogleDriveService.az();	 Catch:{ IllegalStateException -> 0x001d }
        r1 = r3.N;	 Catch:{ IllegalStateException -> 0x001d }
        r2 = 18;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x001d }
        if (r0 == 0) goto L_0x000a;
    L_0x006f:
        com.whatsapp.gdrive.GoogleDriveService.ax();	 Catch:{ IllegalStateException -> 0x001f }
        r1 = r3.N;	 Catch:{ IllegalStateException -> 0x001f }
        r2 = 11;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x001f }
        if (r0 == 0) goto L_0x000a;
    L_0x007b:
        com.whatsapp.gdrive.GoogleDriveService.ax();	 Catch:{ IllegalStateException -> 0x0021 }
        r1 = r3.N;	 Catch:{ IllegalStateException -> 0x0021 }
        r2 = 12;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x0021 }
        if (r0 == 0) goto L_0x000a;
    L_0x0087:
        com.whatsapp.gdrive.GoogleDriveService.ax();	 Catch:{ IllegalStateException -> 0x0023 }
        r1 = r3.N;	 Catch:{ IllegalStateException -> 0x0023 }
        r2 = 14;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x0023 }
        if (r0 == 0) goto L_0x000a;
    L_0x0093:
        com.whatsapp.gdrive.GoogleDriveService.ax();	 Catch:{ IllegalStateException -> 0x0025 }
        r1 = r3.N;	 Catch:{ IllegalStateException -> 0x0025 }
        r2 = 15;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x0025 }
        if (r0 == 0) goto L_0x000a;
    L_0x009f:
        com.whatsapp.gdrive.GoogleDriveService.ax();	 Catch:{ IllegalStateException -> 0x0025 }
        r0 = r3.N;	 Catch:{ IllegalStateException -> 0x0025 }
        r1 = 18;
        r0.d(r1);	 Catch:{ IllegalStateException -> 0x0025 }
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    private void o() {
        if (App.a(this.A)) {
            bq.a(new amh(this, new d6(this)), new Void[0]);
        }
    }

    private void d() {
        this.L = new f_(this);
        this.s = new cf(this);
        this.y = new dq(this);
        this.w.setOnClickListener(this.L);
        this.G.setOnClickListener(new c3(this));
        m();
        this.t.setOnClickListener(new ec(this));
        this.r.setOnClickListener(new cl(this));
        findViewById(2131755260).setOnClickListener(new dm(this));
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(P[70], true);
    }

    static Button q(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.w;
    }

    static String l(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.C;
    }

    static ProgressBar p(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.O;
    }

    static void a(SettingsGoogleDrive settingsGoogleDrive, int i) {
        settingsGoogleDrive.h(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        r3 = 1;
        r2 = 0;
        r4 = com.whatsapp.gdrive.GoogleDriveService.c;
        super.onCreate(r10);
        r0 = P;
        r1 = 67;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = 2130903074; // 0x7f030022 float:1.7412956E38 double:1.0528060035E-314;
        r9.setContentView(r0);
        r0 = r9.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r3);
        r0 = 2131755254; // 0x7f1000f6 float:1.9141382E38 double:1.0532270363E-314;
        r0 = r9.findViewById(r0);
        r9.G = r0;
        r0 = com.whatsapp.gdrive.GoogleDriveService.g();
        if (r0 != 0) goto L_0x01b1;
    L_0x002c:
        r0 = 2131231923; // 0x7f0804b3 float:1.807994E38 double:1.0529684765E-314;
        r0 = r9.getString(r0);
        r1 = r0;
    L_0x0034:
        r0 = 2131755256; // 0x7f1000f8 float:1.9141386E38 double:1.0532270373E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalStateException -> 0x019e }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x019e }
        r9.E = r0;	 Catch:{ IllegalStateException -> 0x019e }
        r0 = r9.E;	 Catch:{ IllegalStateException -> 0x019e }
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x019e }
        r0 = 2131755244; // 0x7f1000ec float:1.9141362E38 double:1.0532270314E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalStateException -> 0x019e }
        r0 = (android.widget.Button) r0;	 Catch:{ IllegalStateException -> 0x019e }
        r9.w = r0;	 Catch:{ IllegalStateException -> 0x019e }
        r0 = com.whatsapp.gdrive.GoogleDriveService.r();	 Catch:{ IllegalStateException -> 0x019e }
        if (r0 != 0) goto L_0x005b;
    L_0x0055:
        r0 = com.whatsapp.gdrive.GoogleDriveService.v();	 Catch:{ IllegalStateException -> 0x01a0 }
        if (r0 == 0) goto L_0x0062;
    L_0x005b:
        r0 = r9.w;	 Catch:{ IllegalStateException -> 0x01a0 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x01a0 }
    L_0x0062:
        r0 = 2131755248; // 0x7f1000f0 float:1.914137E38 double:1.0532270334E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalStateException -> 0x01a2 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x01a2 }
        r9.o = r0;	 Catch:{ IllegalStateException -> 0x01a2 }
        r0 = 2131755243; // 0x7f1000eb float:1.914136E38 double:1.053227031E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalStateException -> 0x01a2 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x01a2 }
        r1 = com.whatsapp.App.V();	 Catch:{ IllegalStateException -> 0x01a2 }
        if (r1 == 0) goto L_0x01a4;
    L_0x007c:
        r1 = 2131231933; // 0x7f0804bd float:1.807996E38 double:1.0529684814E-314;
    L_0x007f:
        r0.setText(r1);
        r0 = 2131755225; // 0x7f1000d9 float:1.9141323E38 double:1.053227022E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r9.O = r0;
        r0 = r9.O;
        r1 = r9.getResources();
        r5 = 2131624046; // 0x7f0e006e float:1.887526E38 double:1.053162211E-314;
        r1 = r1.getColor(r5);
        com.whatsapp.util.h.a(r0, r1);
        r0 = 2131755246; // 0x7f1000ee float:1.9141366E38 double:1.0532270324E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r9.v = r0;
        r0 = 2131755247; // 0x7f1000ef float:1.9141368E38 double:1.053227033E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r9.B = r0;
        r0 = 2131755251; // 0x7f1000f3 float:1.9141376E38 double:1.053227035E-314;
        r0 = r9.findViewById(r0);
        r9.r = r0;
        r0 = 2131755253; // 0x7f1000f5 float:1.914138E38 double:1.053227036E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.K = r0;
        r0 = r9.getResources();
        r1 = 2131689483; // 0x7f0f000b float:1.9007983E38 double:1.053194541E-314;
        r0 = r0.getStringArray(r1);
        r9.n = r0;
        r0 = r2;
    L_0x00d5:
        r1 = r9.n;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x010f;
    L_0x00da:
        r1 = 2131231930; // 0x7f0804ba float:1.8079955E38 double:1.05296848E-314;
        r1 = r9.getString(r1);	 Catch:{ IllegalStateException -> 0x01a9 }
        r5 = r9.n;	 Catch:{ IllegalStateException -> 0x01a9 }
        r5 = r5[r0];	 Catch:{ IllegalStateException -> 0x01a9 }
        r1 = r1.equals(r5);	 Catch:{ IllegalStateException -> 0x01a9 }
        if (r1 == 0) goto L_0x010b;
    L_0x00eb:
        r1 = r9.n;	 Catch:{ IllegalStateException -> 0x01a9 }
        r5 = 2131231930; // 0x7f0804ba float:1.8079955E38 double:1.05296848E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ IllegalStateException -> 0x01a9 }
        r7 = 0;
        r8 = 2131232334; // 0x7f08064e float:1.8080774E38 double:1.0529686795E-314;
        r8 = r9.getString(r8);	 Catch:{ IllegalStateException -> 0x01a9 }
        r6[r7] = r8;	 Catch:{ IllegalStateException -> 0x01a9 }
        r5 = r9.getString(r5, r6);	 Catch:{ IllegalStateException -> 0x01a9 }
        r1[r0] = r5;	 Catch:{ IllegalStateException -> 0x01a9 }
        if (r4 == 0) goto L_0x010f;
    L_0x0105:
        r1 = com.whatsapp.WAAppCompatActivity.c;
        r1 = r1 + 1;
        com.whatsapp.WAAppCompatActivity.c = r1;
    L_0x010b:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x00d5;
    L_0x010f:
        r0 = r9.K;
        r1 = r9.n;
        r4 = r9.p();
        r1 = r1[r4];
        r0.setText(r1);
        r0 = 2131755258; // 0x7f1000fa float:1.914139E38 double:1.0532270383E-314;
        r0 = r9.findViewById(r0);
        r9.t = r0;
        r0 = 2131755259; // 0x7f1000fb float:1.9141392E38 double:1.053227039E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.M = r0;
        r0 = r9.getResources();
        r1 = 2131689486; // 0x7f0f000e float:1.9007989E38 double:1.0531945426E-314;
        r0 = r0.getStringArray(r1);
        r1 = com.whatsapp.gdrive.GoogleDriveService.j();
        r0 = r0[r1];
        r1 = r9.M;	 Catch:{ IllegalStateException -> 0x01ab }
        r1.setText(r0);	 Catch:{ IllegalStateException -> 0x01ab }
        r0 = 2131755263; // 0x7f1000ff float:1.91414E38 double:1.053227041E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalStateException -> 0x01ab }
        r0 = (android.widget.CheckBox) r0;	 Catch:{ IllegalStateException -> 0x01ab }
        r9.u = r0;	 Catch:{ IllegalStateException -> 0x01ab }
        r0 = r9.u;	 Catch:{ IllegalStateException -> 0x01ab }
        r1 = com.whatsapp.gdrive.GoogleDriveService.s();	 Catch:{ IllegalStateException -> 0x01ab }
        r0.setChecked(r1);	 Catch:{ IllegalStateException -> 0x01ab }
        r9.d();	 Catch:{ IllegalStateException -> 0x01ab }
        r0 = new android.content.Intent;	 Catch:{ IllegalStateException -> 0x01ab }
        r1 = com.whatsapp.gdrive.GoogleDriveService.class;
        r0.<init>(r9, r1);	 Catch:{ IllegalStateException -> 0x01ab }
        r1 = r9.p;	 Catch:{ IllegalStateException -> 0x01ab }
        r4 = 1;
        r9.bindService(r0, r1, r4);	 Catch:{ IllegalStateException -> 0x01ab }
        r0 = com.whatsapp.gdrive.GoogleDriveService.X();	 Catch:{ IllegalStateException -> 0x01ab }
        if (r0 != 0) goto L_0x017c;
    L_0x0170:
        r0 = P;	 Catch:{ IllegalStateException -> 0x01ab }
        r1 = 69;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x01ab }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x01ab }
        r9.finish();	 Catch:{ IllegalStateException -> 0x01ab }
    L_0x017c:
        if (r10 == 0) goto L_0x018c;
    L_0x017e:
        r0 = P;	 Catch:{ IllegalStateException -> 0x01ad }
        r1 = 68;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x01ad }
        r1 = 0;
        r0 = r10.getBoolean(r0, r1);	 Catch:{ IllegalStateException -> 0x01ad }
        if (r0 == 0) goto L_0x018c;
    L_0x018b:
        r2 = r3;
    L_0x018c:
        if (r2 != 0) goto L_0x019d;
    L_0x018e:
        r0 = r9.getIntent();
        if (r0 == 0) goto L_0x019d;
    L_0x0194:
        r1 = r0.getAction();	 Catch:{ IllegalStateException -> 0x01af }
        if (r1 == 0) goto L_0x019d;
    L_0x019a:
        r9.onNewIntent(r0);	 Catch:{ IllegalStateException -> 0x01af }
    L_0x019d:
        return;
    L_0x019e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01a0 }
    L_0x01a0:
        r0 = move-exception;
        throw r0;
    L_0x01a2:
        r0 = move-exception;
        throw r0;
    L_0x01a4:
        r1 = 2131231934; // 0x7f0804be float:1.8079963E38 double:1.052968482E-314;
        goto L_0x007f;
    L_0x01a9:
        r0 = move-exception;
        throw r0;
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
        r1 = r0;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(int r5) {
        /*
        r4 = this;
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        switch(r5) {
            case 12: goto L_0x0024;
            case 13: goto L_0x0029;
            case 14: goto L_0x003b;
            case 15: goto L_0x0057;
            case 16: goto L_0x0065;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0022 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0022 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0022 }
        r2 = P;	 Catch:{ IllegalStateException -> 0x0022 }
        r3 = 77;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0022 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0022 }
        r1 = r1.append(r5);	 Catch:{ IllegalStateException -> 0x0022 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0022 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0022 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r4.b();	 Catch:{ IllegalStateException -> 0x0074 }
        if (r0 == 0) goto L_0x0073;
    L_0x0029:
        r1 = P;	 Catch:{ IllegalStateException -> 0x0076 }
        r2 = 75;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0076 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0076 }
        com.whatsapp.gdrive.GoogleDriveService.f();	 Catch:{ IllegalStateException -> 0x0076 }
        r1 = 1;
        r4.c(r1);	 Catch:{ IllegalStateException -> 0x0076 }
        if (r0 == 0) goto L_0x0073;
    L_0x003b:
        r1 = P;	 Catch:{ IllegalStateException -> 0x0078 }
        r2 = 73;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0078 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0078 }
        r1 = 0;
        com.whatsapp.gdrive.GoogleDriveService.c(r1);	 Catch:{ IllegalStateException -> 0x0078 }
        r1 = r4.K;	 Catch:{ IllegalStateException -> 0x0078 }
        r2 = r4.n;	 Catch:{ IllegalStateException -> 0x0078 }
        r3 = r4.p();	 Catch:{ IllegalStateException -> 0x0078 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0078 }
        r1.setText(r2);	 Catch:{ IllegalStateException -> 0x0078 }
        if (r0 == 0) goto L_0x0073;
    L_0x0057:
        r1 = P;	 Catch:{ IllegalStateException -> 0x007a }
        r2 = 74;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x007a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x007a }
        com.whatsapp.gdrive.GoogleDriveService.W();	 Catch:{ IllegalStateException -> 0x007a }
        if (r0 == 0) goto L_0x0073;
    L_0x0065:
        r1 = P;	 Catch:{ IllegalStateException -> 0x0022 }
        r2 = 76;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0022 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0022 }
        com.whatsapp.gdrive.GoogleDriveService.f();	 Catch:{ IllegalStateException -> 0x0022 }
        if (r0 != 0) goto L_0x0005;
    L_0x0073:
        return;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0022 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.d(int):void");
    }

    static ImageView d(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.B;
    }

    static void b(SettingsGoogleDrive settingsGoogleDrive, boolean z) {
        settingsGoogleDrive.c(z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean a() {
        /*
        r10 = this;
        r9 = 17;
        r2 = 1;
        r0 = 0;
        r3 = com.whatsapp.gdrive.GoogleDriveService.c;
        com.whatsapp.auv.a();	 Catch:{ IllegalStateException -> 0x0010 }
        r1 = com.whatsapp.gdrive.fn.a(r10);	 Catch:{ IllegalStateException -> 0x0010 }
        if (r1 == 0) goto L_0x0012;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r1 = com.whatsapp.gdrive.GoogleDriveService.ak();	 Catch:{ IllegalStateException -> 0x015e }
        if (r1 == 0) goto L_0x0029;
    L_0x0018:
        r1 = P;	 Catch:{ IllegalStateException -> 0x0160 }
        r4 = 13;
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x0160 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0160 }
        r1 = 2131231953; // 0x7f0804d1 float:1.8080002E38 double:1.0529684913E-314;
        r10.a(r1);	 Catch:{ IllegalStateException -> 0x0160 }
        if (r3 == 0) goto L_0x015b;
    L_0x0029:
        r1 = com.whatsapp.gdrive.GoogleDriveService.v();	 Catch:{ IllegalStateException -> 0x0162 }
        if (r1 == 0) goto L_0x0040;
    L_0x002f:
        r1 = P;	 Catch:{ IllegalStateException -> 0x0164 }
        r4 = 29;
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x0164 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0164 }
        r1 = 2131231956; // 0x7f0804d4 float:1.8080008E38 double:1.052968493E-314;
        r10.a(r1);	 Catch:{ IllegalStateException -> 0x0164 }
        if (r3 == 0) goto L_0x015b;
    L_0x0040:
        r1 = P;	 Catch:{ IllegalStateException -> 0x0166 }
        r4 = 17;
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x0166 }
        r1 = com.whatsapp.App.h(r10, r1);	 Catch:{ IllegalStateException -> 0x0166 }
        if (r1 == 0) goto L_0x0097;
    L_0x004c:
        r1 = new android.content.Intent;	 Catch:{ IllegalStateException -> 0x0166 }
        r4 = com.whatsapp.RequestPermissionActivity.class;
        r1.<init>(r10, r4);	 Catch:{ IllegalStateException -> 0x0166 }
        r4 = P;	 Catch:{ IllegalStateException -> 0x0166 }
        r5 = 21;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0166 }
        r5 = 2130839699; // 0x7f020893 float:1.7284416E38 double:1.052774692E-314;
        r1 = r1.putExtra(r4, r5);	 Catch:{ IllegalStateException -> 0x0166 }
        r4 = P;	 Catch:{ IllegalStateException -> 0x0166 }
        r5 = 26;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0166 }
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ IllegalStateException -> 0x0166 }
        r6 = 0;
        r7 = P;	 Catch:{ IllegalStateException -> 0x0166 }
        r8 = 14;
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0166 }
        r5[r6] = r7;	 Catch:{ IllegalStateException -> 0x0166 }
        r1 = r1.putExtra(r4, r5);	 Catch:{ IllegalStateException -> 0x0166 }
        r4 = P;	 Catch:{ IllegalStateException -> 0x0166 }
        r5 = 15;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0166 }
        r5 = 2131231609; // 0x7f080379 float:1.8079304E38 double:1.0529683213E-314;
        r1 = r1.putExtra(r4, r5);	 Catch:{ IllegalStateException -> 0x0166 }
        r4 = P;	 Catch:{ IllegalStateException -> 0x0166 }
        r5 = 22;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0166 }
        r5 = 2131231608; // 0x7f080378 float:1.8079302E38 double:1.052968321E-314;
        r1 = r1.putExtra(r4, r5);	 Catch:{ IllegalStateException -> 0x0166 }
        r4 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r10.startActivityForResult(r1, r4);	 Catch:{ IllegalStateException -> 0x0166 }
        if (r3 == 0) goto L_0x015b;
    L_0x0097:
        r4 = com.whatsapp.gdrive.GoogleDriveService.g();
        r1 = android.accounts.AccountManager.get(r10);
        r5 = P;
        r6 = 27;
        r5 = r5[r6];
        r5 = r1.getAccountsByType(r5);
        r1 = r5.length;
        if (r1 <= 0) goto L_0x014f;
    L_0x00ac:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r6 = P;
        r7 = 20;
        r6 = r6[r7];
        r1 = r1.append(r6);
        r6 = r5.length;
        r1 = r1.append(r6);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = -1;
        r6 = r5.length;
        r6 = r6 + 1;
        r6 = new java.lang.String[r6];
    L_0x00cd:
        r7 = r5.length;
        if (r0 >= r7) goto L_0x00e5;
    L_0x00d0:
        r7 = r5[r0];	 Catch:{ IllegalStateException -> 0x0168 }
        r7 = r7.name;	 Catch:{ IllegalStateException -> 0x0168 }
        r6[r0] = r7;	 Catch:{ IllegalStateException -> 0x0168 }
        if (r4 == 0) goto L_0x00e1;
    L_0x00d8:
        r7 = r6[r0];	 Catch:{ IllegalStateException -> 0x0168 }
        r7 = r4.equals(r7);	 Catch:{ IllegalStateException -> 0x0168 }
        if (r7 == 0) goto L_0x00e1;
    L_0x00e0:
        r1 = r0;
    L_0x00e1:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x00cd;
    L_0x00e5:
        r0 = r6.length;
        r0 = r0 + -1;
        r4 = 2131231248; // 0x7f080210 float:1.8078572E38 double:1.052968143E-314;
        r4 = r10.getString(r4);
        r6[r0] = r4;
        r0 = new com.whatsapp.gdrive.SingleChoiceListDialogFragment;
        r0.<init>();
        r4 = new android.os.Bundle;
        r4.<init>();
        r5 = P;
        r7 = 18;
        r5 = r5[r7];
        r4.putInt(r5, r9);
        r5 = P;
        r7 = 25;
        r5 = r5[r7];
        r7 = 2131231249; // 0x7f080211 float:1.8078574E38 double:1.0529681435E-314;
        r7 = r10.getString(r7);
        r4.putString(r5, r7);
        r5 = P;
        r7 = 23;
        r5 = r5[r7];
        r4.putInt(r5, r1);
        r1 = P;
        r5 = 19;
        r1 = r1[r5];
        r4.putStringArray(r1, r6);
        r0.setArguments(r4);
        r1 = r10.getSupportFragmentManager();
        r4 = P;
        r5 = 28;
        r4 = r4[r5];
        r1 = r1.findFragmentByTag(r4);
        if (r1 != 0) goto L_0x014d;
    L_0x0139:
        r1 = r10.getSupportFragmentManager();
        r1 = r1.beginTransaction();
        r4 = P;
        r5 = 24;
        r4 = r4[r5];
        r1.add(r0, r4);
        r1.commitAllowingStateLoss();
    L_0x014d:
        if (r3 == 0) goto L_0x015b;
    L_0x014f:
        r0 = P;	 Catch:{ IllegalStateException -> 0x016a }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x016a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x016a }
        r10.i();	 Catch:{ IllegalStateException -> 0x016a }
    L_0x015b:
        r0 = r2;
        goto L_0x000f;
    L_0x015e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0160 }
    L_0x0160:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0162 }
    L_0x0162:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0164 }
    L_0x0164:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0166 }
    L_0x0166:
        r0 = move-exception;
        throw r0;
    L_0x0168:
        r0 = move-exception;
        throw r0;
    L_0x016a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.a():boolean");
    }

    static boolean k() {
        return H;
    }

    private void c() {
        boolean z = GoogleDriveService.c;
        try {
            auv.a();
            if (GoogleDriveService.X()) {
                try {
                    if (GoogleDriveService.g() == null) {
                        Log.i(P[82]);
                        a(2131230838);
                        return;
                    }
                    try {
                        if (GoogleDriveService.ak()) {
                            Log.e(P[79]);
                            if (this.N.o() != 10) {
                                if (this.I != null) {
                                    try {
                                        this.I.onClick(null);
                                        if (!z) {
                                            return;
                                        }
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                }
                            }
                            try {
                                a(2131231924);
                                if (!z) {
                                    return;
                                }
                            } catch (IllegalStateException e2) {
                                throw e2;
                            }
                        }
                        try {
                            int i;
                            if (GoogleDriveService.v()) {
                                try {
                                    Log.e(P[89]);
                                    a(2131231963);
                                    if (!z) {
                                        return;
                                    }
                                } catch (IllegalStateException e22) {
                                    throw e22;
                                }
                            }
                            int j = GoogleDriveService.j();
                            int az = App.az();
                            if (az == 0) {
                                if (j == 0) {
                                    i = 2131231950;
                                } else {
                                    i = 2131231949;
                                }
                                try {
                                    a(i);
                                    Log.i(P[83]);
                                    if (!z) {
                                        return;
                                    }
                                } catch (IllegalStateException e222) {
                                    throw e222;
                                } catch (IllegalStateException e2222) {
                                    try {
                                        throw e2222;
                                    } catch (IllegalStateException e22222) {
                                        throw e22222;
                                    }
                                }
                            }
                            if (az == 3) {
                                if (j == 0) {
                                    i = 2131231189;
                                } else {
                                    i = 2131231187;
                                }
                                try {
                                    a(i);
                                    c(true);
                                    if (!z) {
                                        return;
                                    }
                                } catch (IllegalStateException e222222) {
                                    throw e222222;
                                } catch (IllegalStateException e2222222) {
                                    throw e2222222;
                                }
                            }
                            if (az == 2 && j == 0) {
                                Fragment promptDialogFragment = new PromptDialogFragment();
                                Bundle bundle = new Bundle();
                                bundle.putInt(P[86], 13);
                                bundle.putString(P[85], getString(2131232296));
                                bundle.putString(P[87], getString(2131231188));
                                bundle.putString(P[81], getString(2131230884));
                                bundle.putString(P[78], getString(2131232317));
                                promptDialogFragment.setArguments(bundle);
                                if (!fn.a((Activity) this)) {
                                    try {
                                        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                                        beginTransaction.add(promptDialogFragment, String.valueOf(13));
                                        beginTransaction.commitAllowingStateLoss();
                                    } catch (Throwable e3) {
                                        Log.b(P[80], e3);
                                        c(true);
                                    }
                                }
                                if (!z) {
                                    return;
                                }
                            }
                            if (az == 1 || (az == 2 && j == 1)) {
                                try {
                                    Log.i(P[88]);
                                    c(true);
                                    if (!z) {
                                        return;
                                    }
                                } catch (IllegalStateException e22222222) {
                                    throw e22222222;
                                }
                            }
                            Log.e(P[84] + az);
                        } catch (IllegalStateException e222222222) {
                            throw e222222222;
                        }
                    } catch (IllegalStateException e2222222222) {
                        throw e2222222222;
                    } catch (IllegalStateException e22222222222) {
                        throw e22222222222;
                    }
                } catch (IllegalStateException e222222222222) {
                    throw e222222222222;
                }
            }
        } catch (IllegalStateException e2222222222222) {
            throw e2222222222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onResume() {
        /*
        r7 = this;
        r1 = 0;
        super.onResume();
        r7.m();
        r0 = P;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = 2131755234; // 0x7f1000e2 float:1.9141342E38 double:1.0532270265E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755249; // 0x7f1000f1 float:1.9141372E38 double:1.053227034E-314;
        r1 = r7.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2130839458; // 0x7f0207a2 float:1.7283927E38 double:1.052774573E-314;
        r3 = 2130839482; // 0x7f0207ba float:1.7283976E38 double:1.052774585E-314;
        r4 = com.whatsapp.App.a1();	 Catch:{ IllegalStateException -> 0x0067 }
        if (r4 == 0) goto L_0x003c;
    L_0x002c:
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r0.setCompoundDrawablesWithIntrinsicBounds(r2, r4, r5, r6);	 Catch:{ IllegalStateException -> 0x0069 }
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r6);	 Catch:{ IllegalStateException -> 0x0069 }
        r4 = com.whatsapp.gdrive.GoogleDriveService.c;	 Catch:{ IllegalStateException -> 0x0069 }
        if (r4 == 0) goto L_0x0048;
    L_0x003c:
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r0.setCompoundDrawablesWithIntrinsicBounds(r4, r5, r2, r6);	 Catch:{ IllegalStateException -> 0x0069 }
        r0 = 0;
        r2 = 0;
        r4 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r0, r2, r3, r4);	 Catch:{ IllegalStateException -> 0x0069 }
    L_0x0048:
        r0 = com.whatsapp.App.j;	 Catch:{ IllegalStateException -> 0x006b }
        r2 = com.whatsapp.App.am;	 Catch:{ IllegalStateException -> 0x006b }
        r0 = com.whatsapp.gdrive.fn.b(r0, r2);	 Catch:{ IllegalStateException -> 0x006b }
        if (r0 != 0) goto L_0x0063;
    L_0x0052:
        r0 = 8;
        r1.setVisibility(r0);	 Catch:{ IllegalStateException -> 0x006b }
        r0 = 2131755250; // 0x7f1000f2 float:1.9141374E38 double:1.0532270344E-314;
        r0 = r7.findViewById(r0);	 Catch:{ IllegalStateException -> 0x006b }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x006b }
    L_0x0063:
        r0 = 1;
        H = r0;
        return;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.onResume():void");
    }

    static String[] i(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.n;
    }

    private void c(boolean z) {
        try {
            if (this.N != null) {
                this.N.d(10);
            }
            Intent intent = new Intent(this, GoogleDriveService.class);
            try {
                intent.setAction(P[90]);
                if (z) {
                    intent.putExtra(P[91], P[92]);
                }
                startService(intent);
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static ImageView e(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.v;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
        r8 = this;
        r4 = com.whatsapp.SettingsChat.a(r8);
        r2 = com.whatsapp.gdrive.GoogleDriveService.g();
        r5 = r8.b(r2);
        r0 = -1;
        if (r2 == 0) goto L_0x00c5;
    L_0x0010:
        r0 = com.whatsapp.gdrive.GoogleDriveService.k(r2);
        r2 = r0;
    L_0x0015:
        r0 = r8.w;	 Catch:{ IllegalStateException -> 0x00bf }
        if (r0 == 0) goto L_0x00bb;
    L_0x0019:
        r0 = 0;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x007d;
    L_0x001f:
        r0 = 2131755240; // 0x7f1000e8 float:1.9141354E38 double:1.0532270294E-314;
        r0 = r8.findViewById(r0);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = 2131231400; // 0x7f0802a8 float:1.807888E38 double:1.052968218E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ IllegalStateException -> 0x00c3 }
        r7 = 0;
        r6[r7] = r4;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = r8.getString(r1, r6);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = 2131755241; // 0x7f1000e9 float:1.9141356E38 double:1.05322703E-314;
        r0 = r8.findViewById(r0);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = 2131231251; // 0x7f080213 float:1.8078578E38 double:1.0529681445E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ IllegalStateException -> 0x00c3 }
        r7 = 0;
        r6[r7] = r5;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = r8.getString(r1, r6);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = 2131755242; // 0x7f1000ea float:1.9141358E38 double:1.0532270304E-314;
        r0 = r8.findViewById(r0);	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = 2131755242; // 0x7f1000ea float:1.9141358E38 double:1.0532270304E-314;
        r0 = r8.findViewById(r0);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = 2131231250; // 0x7f080212 float:1.8078576E38 double:1.052968144E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ IllegalStateException -> 0x00c3 }
        r7 = 0;
        r2 = com.whatsapp.util.l.a(r8, r2);	 Catch:{ IllegalStateException -> 0x00c3 }
        r6[r7] = r2;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = r8.getString(r1, r6);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;	 Catch:{ IllegalStateException -> 0x00c3 }
        if (r0 == 0) goto L_0x00bb;
    L_0x007d:
        r0 = 2131755240; // 0x7f1000e8 float:1.9141354E38 double:1.0532270294E-314;
        r0 = r8.findViewById(r0);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = 2131231400; // 0x7f0802a8 float:1.807888E38 double:1.052968218E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalStateException -> 0x00c3 }
        r3 = 0;
        r2[r3] = r4;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = r8.getString(r1, r2);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = 2131755241; // 0x7f1000e9 float:1.9141356E38 double:1.05322703E-314;
        r0 = r8.findViewById(r0);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = 2131231251; // 0x7f080213 float:1.8078578E38 double:1.0529681445E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalStateException -> 0x00c3 }
        r3 = 0;
        r2[r3] = r5;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = r8.getString(r1, r2);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = 2131755242; // 0x7f1000ea float:1.9141358E38 double:1.0532270304E-314;
        r0 = r8.findViewById(r0);	 Catch:{ IllegalStateException -> 0x00c3 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x00c3 }
    L_0x00bb:
        r8.n();
        return;
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;
    L_0x00c5:
        r2 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.m():void");
    }

    static void g(SettingsGoogleDrive settingsGoogleDrive) {
        settingsGoogleDrive.c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h(@com.whatsapp.gdrive.fk int r11) {
        /*
        r10 = this;
        r0 = 0;
        r2 = 0;
        r9 = 1;
        r8 = 0;
        r4 = com.whatsapp.gdrive.GoogleDriveService.c;
        com.whatsapp.auv.a();
        r3 = com.whatsapp.gdrive.GoogleDriveService.g();
        switch(r11) {
            case 10: goto L_0x00cb;
            case 11: goto L_0x00df;
            case 12: goto L_0x00cd;
            case 13: goto L_0x00ed;
            case 14: goto L_0x010d;
            case 15: goto L_0x0132;
            case 16: goto L_0x0011;
            case 17: goto L_0x0011;
            case 18: goto L_0x0124;
            case 19: goto L_0x0124;
            case 20: goto L_0x011b;
            case 21: goto L_0x00df;
            case 22: goto L_0x0011;
            case 23: goto L_0x01a5;
            default: goto L_0x0011;
        };
    L_0x0011:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = P;
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = com.whatsapp.gdrive.fn.a(r11);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x002f:
        r0 = r2;
    L_0x0030:
        r1 = com.whatsapp.gdrive.fn.a(r10);
        if (r1 != 0) goto L_0x00a2;
    L_0x0036:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = P;
        r5 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r3 = r3[r5];
        r1 = r1.append(r3);
        r3 = com.whatsapp.gdrive.fn.a(r11);
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = 2131755214; // 0x7f1000ce float:1.91413E38 double:1.0532270166E-314;
        r1 = r10.findViewById(r1);
        r3 = 2131755672; // 0x7f100298 float:1.914223E38 double:1.053227243E-314;
        r3 = r10.findViewById(r3);
        r3.setOnClickListener(r0);	 Catch:{ IllegalStateException -> 0x01b3 }
        if (r0 == 0) goto L_0x006d;
    L_0x0067:
        r0 = 1;
        r3.setClickable(r0);	 Catch:{ IllegalStateException -> 0x01b5 }
        if (r4 == 0) goto L_0x0071;
    L_0x006d:
        r0 = 0;
        r3.setClickable(r0);	 Catch:{ IllegalStateException -> 0x01b5 }
    L_0x0071:
        if (r2 == 0) goto L_0x009b;
    L_0x0073:
        r1.setVisibility(r8);
        r0 = 2131755216; // 0x7f1000d0 float:1.9141305E38 double:1.0532270176E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0.setText(r2);	 Catch:{ IllegalStateException -> 0x01b7 }
        r0 = 2131755674; // 0x7f10029a float:1.9142234E38 double:1.053227244E-314;
        r0 = r10.findViewById(r0);	 Catch:{ IllegalStateException -> 0x01b7 }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ IllegalStateException -> 0x01b7 }
        r0 = 2131755674; // 0x7f10029a float:1.9142234E38 double:1.053227244E-314;
        r0 = r10.findViewById(r0);	 Catch:{ IllegalStateException -> 0x01b7 }
        r2 = r10.y;	 Catch:{ IllegalStateException -> 0x01b7 }
        r0.setOnClickListener(r2);	 Catch:{ IllegalStateException -> 0x01b7 }
        if (r4 == 0) goto L_0x00a0;
    L_0x009b:
        r0 = 8;
        r1.setVisibility(r0);	 Catch:{ IllegalStateException -> 0x01b7 }
    L_0x00a0:
        if (r4 == 0) goto L_0x00ca;
    L_0x00a2:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01b9 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x01b9 }
        r1 = P;	 Catch:{ IllegalStateException -> 0x01b9 }
        r2 = 98;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x01b9 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x01b9 }
        r1 = com.whatsapp.gdrive.fn.a(r11);	 Catch:{ IllegalStateException -> 0x01b9 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x01b9 }
        r1 = P;	 Catch:{ IllegalStateException -> 0x01b9 }
        r2 = 94;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x01b9 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x01b9 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x01b9 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x01b9 }
    L_0x00ca:
        return;
    L_0x00cb:
        if (r4 == 0) goto L_0x002f;
    L_0x00cd:
        r0 = 2131231203; // 0x7f0801e3 float:1.807848E38 double:1.0529681207E-314;
        r1 = new java.lang.Object[r9];
        r1[r8] = r3;
        r2 = r10.getString(r0, r1);
        r0 = new com.whatsapp.gdrive.b8;
        r0.<init>(r10, r3);
        goto L_0x0030;
    L_0x00df:
        r0 = 2131231204; // 0x7f0801e4 float:1.8078482E38 double:1.052968121E-314;
        r2 = r10.getString(r0);
        r0 = new com.whatsapp.gdrive.a0;
        r0.<init>(r10);
        goto L_0x0030;
    L_0x00ed:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = P;
        r3 = 99;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = com.whatsapp.gdrive.fn.a(r11);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        if (r4 == 0) goto L_0x002f;
    L_0x010d:
        r0 = 2131231208; // 0x7f0801e8 float:1.807849E38 double:1.052968123E-314;
        r2 = r10.getString(r0);
        r0 = new com.whatsapp.gdrive.es;
        r0.<init>(r10);
        goto L_0x0030;
    L_0x011b:
        r0 = P;
        r1 = 95;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x0124:
        r0 = 2131231205; // 0x7f0801e5 float:1.8078484E38 double:1.0529681217E-314;
        r2 = r10.getString(r0);
        r0 = new com.whatsapp.gdrive.aq;
        r0.<init>(r10);
        goto L_0x0030;
    L_0x0132:
        r2 = r10.N;
        r2 = r2.N();
        r5 = r10.N;
        r6 = r5.T();
        r2 = r2 - r6;
        r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r5 >= 0) goto L_0x01bb;
    L_0x0143:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = P;
        r5 = 93;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.append(r11);
        r3 = P;
        r5 = 100;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r3 = r10.N;
        r6 = r3.N();
        r2 = r2.append(r6);
        r3 = P;
        r5 = 97;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r3 = r10.N;
        r6 = r3.T();
        r2 = r2.append(r6);
        r3 = P;
        r5 = 96;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
    L_0x018f:
        r2 = 2131231206; // 0x7f0801e6 float:1.8078486E38 double:1.052968122E-314;
        r3 = new java.lang.Object[r9];
        r0 = com.whatsapp.util.l.a(r10, r0);
        r3[r8] = r0;
        r2 = r10.getString(r2, r3);
        r0 = new com.whatsapp.gdrive.a7;
        r0.<init>(r10, r11);
        goto L_0x0030;
    L_0x01a5:
        r0 = 2131231209; // 0x7f0801e9 float:1.8078493E38 double:1.0529681237E-314;
        r2 = r10.getString(r0);
        r0 = new com.whatsapp.gdrive.a6;
        r0.<init>(r10);
        goto L_0x0030;
    L_0x01b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01b5 }
    L_0x01b5:
        r0 = move-exception;
        throw r0;
    L_0x01b7:
        r0 = move-exception;
        throw r0;
    L_0x01b9:
        r0 = move-exception;
        throw r0;
    L_0x01bb:
        r0 = r2;
        goto L_0x018f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.h(int):void");
    }

    public boolean j() {
        return this.F;
    }

    static GoogleDriveService k(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.N;
    }

    static String b(SettingsGoogleDrive settingsGoogleDrive, String str) {
        settingsGoogleDrive.C = str;
        return str;
    }

    public void b(int i, int i2, String[] strArr) {
        boolean z = GoogleDriveService.c;
        if (i == 10) {
            try {
                k(i2);
                if (!z) {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        if (i == 11) {
            try {
                j(i2);
                if (!z) {
                    return;
                }
            } catch (IllegalStateException e22) {
                try {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        }
        if (i == 17) {
            try {
                if (strArr[i2].equals(getString(2131231248))) {
                    i();
                    if (!z) {
                        return;
                    }
                }
                Intent intent = new Intent();
                try {
                    intent.putExtra(P[arj.Theme_switchStyle], strArr[i2]);
                    onActivityResult(2, -1, intent);
                    if (!z) {
                        return;
                    }
                } catch (IllegalStateException e2222) {
                    throw e2222;
                }
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        }
        throw new IllegalStateException(P[arj.Theme_spinnerStyle] + i);
    }

    static void r(SettingsGoogleDrive settingsGoogleDrive) {
        settingsGoogleDrive.m();
    }

    static ConditionVariable o(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.q;
    }

    public void b(int i) {
        throw new IllegalStateException(P[59] + i);
    }

    protected void l() {
        GoogleDriveService.c(0);
        this.K.setText(this.n[p()]);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    onBackPressed();
                    return true;
                default:
                    return false;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected void onPause() {
        super.onPause();
        H = false;
    }

    private void k(int i) {
        String[] stringArray = getResources().getStringArray(2131689484);
        try {
            if (i > stringArray.length) {
                Log.e(P[57] + i);
                return;
            }
            Log.i(P[55] + i + P[56] + stringArray[i]);
            int Y = GoogleDriveService.Y();
            int parseInt = Integer.parseInt(stringArray[i]);
            try {
                if (GoogleDriveService.c(parseInt)) {
                    try {
                        this.K.setText(this.n[i]);
                        if (parseInt != 0 && Y == 0) {
                            try {
                                if (!GoogleDriveService.ak()) {
                                    try {
                                        if (!GoogleDriveService.v()) {
                                            this.G.performClick();
                                        }
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                }
                            } catch (IllegalStateException e2) {
                                throw e2;
                            }
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                } else {
                    Log.e(P[58]);
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    private int p() {
        boolean z = GoogleDriveService.c;
        int Y = GoogleDriveService.Y();
        String[] stringArray = getResources().getStringArray(2131689484);
        int i = 0;
        while (i < stringArray.length) {
            try {
                if (Integer.parseInt(stringArray[i]) != Y) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                return i;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        Log.e(P[61] + Y);
        return 0;
    }

    static CheckBox a(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.u;
    }

    public void e(int i) {
        Log.i(P[71] + i + P[72]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(@com.whatsapp.gdrive.fk int r8) {
        /*
        r7 = this;
        r0 = 0;
        r4 = 2131232334; // 0x7f08064e float:1.8080774E38 double:1.0529686795E-314;
        r3 = 1;
        r6 = 0;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        com.whatsapp.auv.a();
        switch(r8) {
            case 10: goto L_0x00d0;
            case 11: goto L_0x00e3;
            case 12: goto L_0x00d2;
            case 13: goto L_0x00f4;
            case 14: goto L_0x0116;
            case 15: goto L_0x012c;
            case 16: goto L_0x0141;
            case 17: goto L_0x010d;
            case 18: goto L_0x0116;
            case 19: goto L_0x0157;
            case 20: goto L_0x0116;
            case 21: goto L_0x00e3;
            case 22: goto L_0x010d;
            case 23: goto L_0x0165;
            default: goto L_0x000e;
        };
    L_0x000e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = P;
        r4 = 65;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r3 = com.whatsapp.gdrive.fn.a(r8);
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        r1 = r0;
    L_0x002d:
        r0 = com.whatsapp.gdrive.fn.a(r7);
        if (r0 != 0) goto L_0x00a3;
    L_0x0033:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = P;
        r4 = 62;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r3 = com.whatsapp.gdrive.fn.a(r8);
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = 2131755214; // 0x7f1000ce float:1.91413E38 double:1.0532270166E-314;
        r3 = r7.findViewById(r0);
        r0 = 2131755672; // 0x7f100298 float:1.914223E38 double:1.053227243E-314;
        r0 = r7.findViewById(r0);
        r4 = r7.I;	 Catch:{ IllegalStateException -> 0x0172 }
        r0.setOnClickListener(r4);	 Catch:{ IllegalStateException -> 0x0172 }
        r4 = 2131755674; // 0x7f10029a float:1.9142234E38 double:1.053227244E-314;
        r4 = r7.findViewById(r4);	 Catch:{ IllegalStateException -> 0x0172 }
        r5 = 0;
        r4.setVisibility(r5);	 Catch:{ IllegalStateException -> 0x0172 }
        r4 = 2131755674; // 0x7f10029a float:1.9142234E38 double:1.053227244E-314;
        r4 = r7.findViewById(r4);	 Catch:{ IllegalStateException -> 0x0172 }
        r5 = r7.s;	 Catch:{ IllegalStateException -> 0x0172 }
        r4.setOnClickListener(r5);	 Catch:{ IllegalStateException -> 0x0172 }
        r4 = r7.I;	 Catch:{ IllegalStateException -> 0x0172 }
        if (r4 == 0) goto L_0x0085;
    L_0x007f:
        r4 = 1;
        r0.setClickable(r4);	 Catch:{ IllegalStateException -> 0x0174 }
        if (r2 == 0) goto L_0x0089;
    L_0x0085:
        r4 = 0;
        r0.setClickable(r4);	 Catch:{ IllegalStateException -> 0x0174 }
    L_0x0089:
        if (r1 == 0) goto L_0x009c;
    L_0x008b:
        r3.setVisibility(r6);
        r0 = 2131755216; // 0x7f1000d0 float:1.9141305E38 double:1.0532270176E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x0176 }
        if (r2 == 0) goto L_0x00a1;
    L_0x009c:
        r0 = 8;
        r3.setVisibility(r0);	 Catch:{ IllegalStateException -> 0x0176 }
    L_0x00a1:
        if (r2 == 0) goto L_0x00cf;
    L_0x00a3:
        r0 = 10;
        if (r8 == r0) goto L_0x00cf;
    L_0x00a7:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0178 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0178 }
        r1 = P;	 Catch:{ IllegalStateException -> 0x0178 }
        r2 = 63;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0178 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0178 }
        r1 = com.whatsapp.gdrive.fn.a(r8);	 Catch:{ IllegalStateException -> 0x0178 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0178 }
        r1 = P;	 Catch:{ IllegalStateException -> 0x0178 }
        r2 = 66;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0178 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0178 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0178 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0178 }
    L_0x00cf:
        return;
    L_0x00d0:
        if (r2 == 0) goto L_0x017a;
    L_0x00d2:
        r0 = 2131231174; // 0x7f0801c6 float:1.8078422E38 double:1.0529681064E-314;
        r0 = r7.getString(r0);
        r1 = new com.whatsapp.gdrive.a_;
        r1.<init>(r7);
        r7.I = r1;
        r1 = r0;
        goto L_0x002d;
    L_0x00e3:
        r0 = 2131231175; // 0x7f0801c7 float:1.8078424E38 double:1.052968107E-314;
        r0 = r7.getString(r0);
        r1 = new com.whatsapp.gdrive.f5;
        r1.<init>(r7);
        r7.I = r1;
        r1 = r0;
        goto L_0x002d;
    L_0x00f4:
        r1 = 2131231196; // 0x7f0801dc float:1.8078466E38 double:1.0529681173E-314;
        r3 = new java.lang.Object[r3];
        r4 = r7.N;
        r4 = r4.n();
        r4 = com.whatsapp.util.l.a(r7, r4);
        r3[r6] = r4;
        r1 = r7.getString(r1, r3);
        r7.I = r0;
        goto L_0x002d;
    L_0x010d:
        r0 = P;
        r1 = 64;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
    L_0x0116:
        r0 = 2131231178; // 0x7f0801ca float:1.807843E38 double:1.0529681084E-314;
        r1 = new java.lang.Object[r3];
        r3 = r7.getString(r4);
        r1[r6] = r3;
        r0 = r7.getString(r0, r1);
        r1 = r7.L;
        r7.I = r1;
        r1 = r0;
        goto L_0x002d;
    L_0x012c:
        r0 = 2131231177; // 0x7f0801c9 float:1.8078428E38 double:1.052968108E-314;
        r1 = new java.lang.Object[r3];
        r4 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r3 = com.whatsapp.util.l.a(r7, r4);
        r1[r6] = r3;
        r0 = r7.getString(r0, r1);
        r1 = r0;
        goto L_0x002d;
    L_0x0141:
        r0 = 2131231198; // 0x7f0801de float:1.807847E38 double:1.0529681183E-314;
        r1 = new java.lang.Object[r3];
        r3 = r7.getString(r4);
        r1[r6] = r3;
        r0 = r7.getString(r0, r1);
        r1 = r7.L;
        r7.I = r1;
        r1 = r0;
        goto L_0x002d;
    L_0x0157:
        r0 = 2131231176; // 0x7f0801c8 float:1.8078426E38 double:1.0529681074E-314;
        r0 = r7.getString(r0);
        r1 = r7.L;
        r7.I = r1;
        r1 = r0;
        goto L_0x002d;
    L_0x0165:
        r0 = 2131231180; // 0x7f0801cc float:1.8078434E38 double:1.0529681094E-314;
        r0 = r7.getString(r0);
        r1 = r7.L;
        r7.I = r1;
        goto L_0x000e;
    L_0x0172:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0174 }
    L_0x0174:
        r0 = move-exception;
        throw r0;
    L_0x0176:
        r0 = move-exception;
        throw r0;
    L_0x0178:
        r0 = move-exception;
        throw r0;
    L_0x017a:
        r1 = r0;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.i(int):void");
    }

    static TextView n(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.K;
    }

    static int f(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.p();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNewIntent(android.content.Intent r9) {
        /*
        r8 = this;
        r7 = 2131231576; // 0x7f080358 float:1.8079237E38 double:1.052968305E-314;
        r6 = 2131231267; // 0x7f080223 float:1.807861E38 double:1.0529681524E-314;
        r1 = 0;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        r3 = r9.getAction();
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x002a }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x002a }
        r4 = P;	 Catch:{ IllegalStateException -> 0x002a }
        r5 = 42;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x002a }
        r0 = r0.append(r4);	 Catch:{ IllegalStateException -> 0x002a }
        r0 = r0.append(r3);	 Catch:{ IllegalStateException -> 0x002a }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x002a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x002a }
        if (r3 != 0) goto L_0x002c;
    L_0x0029:
        return;
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = -1;
        r4 = r3.hashCode();	 Catch:{ IllegalStateException -> 0x0075 }
        switch(r4) {
            case -1074883521: goto L_0x0067;
            case 996064514: goto L_0x0058;
            default: goto L_0x0034;
        };
    L_0x0034:
        switch(r0) {
            case 0: goto L_0x0079;
            case 1: goto L_0x00e0;
            default: goto L_0x0037;
        };
    L_0x0037:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0056 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0056 }
        r1 = P;	 Catch:{ IllegalStateException -> 0x0056 }
        r2 = 54;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0056 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0056 }
        r1 = r9.getAction();	 Catch:{ IllegalStateException -> 0x0056 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0056 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0056 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0056 }
        goto L_0x0029;
    L_0x0056:
        r0 = move-exception;
        throw r0;
    L_0x0058:
        r4 = P;	 Catch:{ IllegalStateException -> 0x0075 }
        r5 = 48;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0075 }
        r4 = r3.equals(r4);	 Catch:{ IllegalStateException -> 0x0075 }
        if (r4 == 0) goto L_0x0034;
    L_0x0064:
        if (r2 == 0) goto L_0x0149;
    L_0x0066:
        r0 = r1;
    L_0x0067:
        r4 = P;	 Catch:{ IllegalStateException -> 0x0077 }
        r5 = 51;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0077 }
        r3 = r3.equals(r4);	 Catch:{ IllegalStateException -> 0x0077 }
        if (r3 == 0) goto L_0x0034;
    L_0x0073:
        r0 = 1;
        goto L_0x0034;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = P;
        r3 = 50;
        r0 = r0[r3];
        r0 = new com.whatsapp.gdrive.PromptDialogFragment;
        r0.<init>();
        r3 = new android.os.Bundle;
        r3.<init>();
        r4 = P;
        r5 = 37;
        r4 = r4[r5];
        r5 = 15;
        r3.putInt(r4, r5);
        r4 = P;
        r5 = 49;
        r4 = r4[r5];
        r5 = 2131231253; // 0x7f080215 float:1.8078582E38 double:1.0529681455E-314;
        r5 = r8.getString(r5);
        r3.putString(r4, r5);
        r4 = P;
        r5 = 43;
        r4 = r4[r5];
        r5 = r8.getString(r6);
        r3.putString(r4, r5);
        r4 = P;
        r5 = 52;
        r4 = r4[r5];
        r5 = r8.getString(r7);
        r3.putString(r4, r5);
        r4 = P;
        r5 = 39;
        r4 = r4[r5];
        r3.putBoolean(r4, r1);
        r0.setArguments(r3);
        r3 = r8.getSupportFragmentManager();
        r3 = r3.beginTransaction();
        r4 = P;
        r5 = 46;
        r4 = r4[r5];
        r3.add(r0, r4);
        r3.commitAllowingStateLoss();
        if (r2 == 0) goto L_0x0029;
    L_0x00e0:
        r0 = P;
        r3 = 41;
        r0 = r0[r3];
        r0 = new com.whatsapp.gdrive.PromptDialogFragment;
        r0.<init>();
        r3 = new android.os.Bundle;
        r3.<init>();
        r4 = P;
        r5 = 44;
        r4 = r4[r5];
        r5 = 16;
        r3.putInt(r4, r5);
        r4 = P;
        r5 = 38;
        r4 = r4[r5];
        r5 = 2131231252; // 0x7f080214 float:1.807858E38 double:1.052968145E-314;
        r5 = r8.getString(r5);
        r3.putString(r4, r5);
        r4 = P;
        r5 = 45;
        r4 = r4[r5];
        r5 = r8.getString(r6);
        r3.putString(r4, r5);
        r4 = P;
        r5 = 40;
        r4 = r4[r5];
        r5 = r8.getString(r7);
        r3.putString(r4, r5);
        r4 = P;
        r5 = 53;
        r4 = r4[r5];
        r3.putBoolean(r4, r1);
        r0.setArguments(r3);
        r1 = r8.getSupportFragmentManager();
        r1 = r1.beginTransaction();
        r3 = P;	 Catch:{ IllegalStateException -> 0x0056 }
        r4 = 47;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0056 }
        r1.add(r0, r3);	 Catch:{ IllegalStateException -> 0x0056 }
        r1.commitAllowingStateLoss();	 Catch:{ IllegalStateException -> 0x0056 }
        if (r2 == 0) goto L_0x0029;
    L_0x0147:
        goto L_0x0037;
    L_0x0149:
        r0 = r1;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.onNewIntent(android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void n() {
        /*
        r10 = this;
        r9 = 1;
        r8 = 0;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = 2131755262; // 0x7f1000fe float:1.9141398E38 double:1.0532270403E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.gdrive.GoogleDriveService.g();
        r4 = com.whatsapp.gdrive.GoogleDriveService.a(r1);
        r6 = 0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x002f;
    L_0x001b:
        r0.setVisibility(r8);
        r1 = 2131231966; // 0x7f0804de float:1.8080028E38 double:1.0529684977E-314;
        r3 = new java.lang.Object[r9];
        r4 = com.whatsapp.util.l.a(r10, r4);
        r3[r8] = r4;
        r1 = r10.getString(r1, r3);
        if (r2 == 0) goto L_0x0055;
    L_0x002f:
        r1 = r10.u;	 Catch:{ IllegalStateException -> 0x0059 }
        r1 = r1.isChecked();	 Catch:{ IllegalStateException -> 0x0059 }
        if (r1 == 0) goto L_0x004f;
    L_0x0037:
        r0.setVisibility(r8);
        r1 = 2131231967; // 0x7f0804df float:1.808003E38 double:1.052968498E-314;
        r3 = new java.lang.Object[r9];
        r4 = com.whatsapp.gdrive.GoogleDriveService.aw();
        r4 = com.whatsapp.util.l.a(r10, r4);
        r3[r8] = r4;
        r1 = r10.getString(r1, r3);
        if (r2 == 0) goto L_0x0055;
    L_0x004f:
        r1 = 8;
        r0.setVisibility(r1);
        r1 = 0;
    L_0x0055:
        r0.setText(r1);
        return;
    L_0x0059:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.n():void");
    }

    static TextView u(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.o;
    }

    static TextView b(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.E;
    }

    static boolean h(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.z;
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, Main.class));
        }
        finish();
    }

    static bi s(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.D;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
        r6 = this;
        r5 = -1;
        r1 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x016d }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x016d }
        r2 = P;	 Catch:{ IllegalStateException -> 0x016d }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x016d }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x016d }
        r0 = r0.append(r7);	 Catch:{ IllegalStateException -> 0x016d }
        r2 = P;	 Catch:{ IllegalStateException -> 0x016d }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x016d }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x016d }
        r0 = r0.append(r8);	 Catch:{ IllegalStateException -> 0x016d }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x016d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x016d }
        switch(r7) {
            case 1: goto L_0x007c;
            case 2: goto L_0x0032;
            case 150: goto L_0x0136;
            case 151: goto L_0x013d;
            default: goto L_0x002e;
        };
    L_0x002e:
        super.onActivityResult(r7, r8, r9);	 Catch:{ IllegalStateException -> 0x0198 }
    L_0x0031:
        return;
    L_0x0032:
        if (r9 == 0) goto L_0x0171;
    L_0x0034:
        r0 = P;	 Catch:{ IllegalStateException -> 0x016f }
        r2 = 12;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x016f }
        r0 = r9.getStringExtra(r0);	 Catch:{ IllegalStateException -> 0x016f }
    L_0x003e:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0174 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0174 }
        r3 = P;	 Catch:{ IllegalStateException -> 0x0174 }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0174 }
        r3 = com.whatsapp.gdrive.fn.a(r0);	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0174 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0174 }
        if (r8 != r5) goto L_0x0069;
    L_0x005d:
        if (r0 == 0) goto L_0x0069;
    L_0x005f:
        r2 = new com.whatsapp.gdrive.eh;	 Catch:{ IllegalStateException -> 0x0178 }
        r2.<init>(r6, r0);	 Catch:{ IllegalStateException -> 0x0178 }
        com.whatsapp.util.bq.a(r2);	 Catch:{ IllegalStateException -> 0x0178 }
        if (r1 == 0) goto L_0x0031;
    L_0x0069:
        r0 = com.whatsapp.gdrive.GoogleDriveService.g();	 Catch:{ IllegalStateException -> 0x017a }
        if (r0 != 0) goto L_0x0031;
    L_0x006f:
        r0 = P;	 Catch:{ IllegalStateException -> 0x017c }
        r2 = 2;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x017c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x017c }
        r6.l();	 Catch:{ IllegalStateException -> 0x017c }
        if (r1 == 0) goto L_0x0031;
    L_0x007c:
        if (r8 != r5) goto L_0x011f;
    L_0x007e:
        r0 = P;
        r2 = 8;
        r0 = r0[r2];
        r0 = r9.getStringExtra(r0);
        r6.C = r0;
        r0 = r6.J;
        r0.open();
        r0 = r6.getSupportFragmentManager();
        r2 = P;
        r3 = 6;
        r2 = r2[r3];
        r0 = r0.findFragmentByTag(r2);
        r0 = (android.support.v4.app.DialogFragment) r0;
        if (r0 == 0) goto L_0x00a3;
    L_0x00a0:
        r0.dismissAllowingStateLoss();	 Catch:{ IllegalStateException -> 0x017e }
    L_0x00a3:
        r0 = r6.C;
        if (r0 == 0) goto L_0x0115;
    L_0x00a7:
        r0 = P;
        r2 = 4;
        r0 = r0[r2];
        r0 = r9.getStringExtra(r0);
        r2 = com.whatsapp.gdrive.GoogleDriveService.g();	 Catch:{ IllegalStateException -> 0x0180 }
        r2 = android.text.TextUtils.equals(r2, r0);	 Catch:{ IllegalStateException -> 0x0180 }
        if (r2 != 0) goto L_0x00f8;
    L_0x00ba:
        r2 = com.whatsapp.gdrive.GoogleDriveService.c(r0);	 Catch:{ IllegalStateException -> 0x0182 }
        if (r2 == 0) goto L_0x00f0;
    L_0x00c0:
        r2 = r6.N;	 Catch:{ IllegalStateException -> 0x0184 }
        if (r2 == 0) goto L_0x00c9;
    L_0x00c4:
        r2 = r6.N;	 Catch:{ IllegalStateException -> 0x0184 }
        r2.ac();	 Catch:{ IllegalStateException -> 0x0184 }
    L_0x00c9:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0186 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0186 }
        r3 = P;	 Catch:{ IllegalStateException -> 0x0186 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0186 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0186 }
        r3 = com.whatsapp.gdrive.fn.a(r0);	 Catch:{ IllegalStateException -> 0x0186 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0186 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0186 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0186 }
        r2 = new com.whatsapp.gdrive.dy;	 Catch:{ IllegalStateException -> 0x0186 }
        r2.<init>(r6, r0);	 Catch:{ IllegalStateException -> 0x0186 }
        r6.runOnUiThread(r2);	 Catch:{ IllegalStateException -> 0x0186 }
        if (r1 == 0) goto L_0x0115;
    L_0x00f0:
        r2 = 2131231965; // 0x7f0804dd float:1.8080026E38 double:1.052968497E-314;
        r6.a(r2);	 Catch:{ IllegalStateException -> 0x0188 }
        if (r1 == 0) goto L_0x0115;
    L_0x00f8:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0188 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0188 }
        r3 = P;	 Catch:{ IllegalStateException -> 0x0188 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0188 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0188 }
        r0 = com.whatsapp.gdrive.fn.a(r0);	 Catch:{ IllegalStateException -> 0x0188 }
        r0 = r2.append(r0);	 Catch:{ IllegalStateException -> 0x0188 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0188 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0188 }
    L_0x0115:
        r0 = new com.whatsapp.gdrive.dh;
        r0.<init>(r6);
        com.whatsapp.util.bq.a(r0);
        if (r1 == 0) goto L_0x0031;
    L_0x011f:
        r0 = r6.getSupportFragmentManager();
        r2 = P;
        r3 = 11;
        r2 = r2[r3];
        r0 = r0.findFragmentByTag(r2);
        r0 = (android.support.v4.app.DialogFragment) r0;
        if (r0 == 0) goto L_0x0134;
    L_0x0131:
        r0.dismissAllowingStateLoss();	 Catch:{ IllegalStateException -> 0x018a }
    L_0x0134:
        if (r1 == 0) goto L_0x0031;
    L_0x0136:
        if (r8 != r5) goto L_0x0031;
    L_0x0138:
        r6.a();	 Catch:{ IllegalStateException -> 0x018c }
        if (r1 == 0) goto L_0x0031;
    L_0x013d:
        if (r8 != r5) goto L_0x0031;
    L_0x013f:
        r0 = r6.N;	 Catch:{ IllegalStateException -> 0x0190 }
        r0 = r0.o();	 Catch:{ IllegalStateException -> 0x0190 }
        r2 = 23;
        if (r0 != r2) goto L_0x0150;
    L_0x0149:
        r0 = r6.N;	 Catch:{ IllegalStateException -> 0x0190 }
        r2 = 10;
        r0.d(r2);	 Catch:{ IllegalStateException -> 0x0190 }
    L_0x0150:
        r0 = com.whatsapp.gdrive.GoogleDriveService.v();	 Catch:{ IllegalStateException -> 0x0192 }
        if (r0 != 0) goto L_0x015c;
    L_0x0156:
        r0 = com.whatsapp.gdrive.GoogleDriveService.ak();	 Catch:{ IllegalStateException -> 0x0194 }
        if (r0 == 0) goto L_0x0166;
    L_0x015c:
        r0 = new com.whatsapp.gdrive.ac;	 Catch:{ IllegalStateException -> 0x0196 }
        r0.<init>(r6);	 Catch:{ IllegalStateException -> 0x0196 }
        com.whatsapp.util.bq.a(r0);	 Catch:{ IllegalStateException -> 0x0196 }
        if (r1 == 0) goto L_0x0031;
    L_0x0166:
        r6.o();	 Catch:{ IllegalStateException -> 0x0198 }
        if (r1 == 0) goto L_0x0031;
    L_0x016b:
        goto L_0x002e;
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;
    L_0x0171:
        r0 = 0;
        goto L_0x003e;
    L_0x0174:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0176 }
    L_0x0176:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0178 }
    L_0x0178:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x017a }
    L_0x017a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x017c }
    L_0x017c:
        r0 = move-exception;
        throw r0;
    L_0x017e:
        r0 = move-exception;
        throw r0;
    L_0x0180:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0182 }
    L_0x0182:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0184 }
    L_0x0184:
        r0 = move-exception;
        throw r0;
    L_0x0186:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0188 }
    L_0x0188:
        r0 = move-exception;
        throw r0;
    L_0x018a:
        r0 = move-exception;
        throw r0;
    L_0x018c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x018e }
    L_0x018e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0190 }
    L_0x0190:
        r0 = move-exception;
        throw r0;
    L_0x0192:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0194 }
    L_0x0194:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0196 }
    L_0x0196:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0198 }
    L_0x0198:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.onActivityResult(int, int, android.content.Intent):void");
    }

    static OnClickListener c(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.L;
    }

    static boolean a(SettingsGoogleDrive settingsGoogleDrive, boolean z) {
        settingsGoogleDrive.z = z;
        return z;
    }

    public static void f() {
        by an = App.an();
        if (an instanceof SettingsGoogleDrive) {
            ((SettingsGoogleDrive) an).m();
        }
    }

    private String b(@Nullable String str) {
        long d;
        String string;
        boolean z = GoogleDriveService.c;
        if (str != null) {
            d = GoogleDriveService.d(str);
        } else {
            d = 0;
        }
        if (d == 0) {
            string = getString(2131231542);
            if (!z) {
                return string;
            }
        }
        if (d == -1) {
            string = getString(2131232182);
            if (!z) {
                return string;
            }
        }
        return cs.o(this, d);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 600:
                try {
                    return SettingsChat.b((Context) this);
                } catch (IllegalStateException e) {
                    throw e;
                }
            case 602:
                return SettingsChat.c(this);
            default:
                return super.onCreateDialog(i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r5) {
        /*
        r4 = this;
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        switch(r5) {
            case 12: goto L_0x0024;
            case 13: goto L_0x002f;
            case 14: goto L_0x0005;
            case 15: goto L_0x003a;
            case 16: goto L_0x0045;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0022 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0022 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0022 }
        r2 = P;	 Catch:{ IllegalStateException -> 0x0022 }
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0022 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0022 }
        r1 = r1.append(r5);	 Catch:{ IllegalStateException -> 0x0022 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0022 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0022 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r1 = P;	 Catch:{ IllegalStateException -> 0x0051 }
        r2 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0051 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0051 }
        if (r0 == 0) goto L_0x0050;
    L_0x002f:
        r1 = P;	 Catch:{ IllegalStateException -> 0x0053 }
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0053 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0053 }
        if (r0 == 0) goto L_0x0050;
    L_0x003a:
        r1 = P;	 Catch:{ IllegalStateException -> 0x0055 }
        r2 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0055 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0055 }
        if (r0 == 0) goto L_0x0050;
    L_0x0045:
        r1 = P;	 Catch:{ IllegalStateException -> 0x0022 }
        r2 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0022 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0022 }
        if (r0 != 0) goto L_0x0005;
    L_0x0050:
        return;
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0022 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.SettingsGoogleDrive.c(int):void");
    }

    static GoogleDriveService a(SettingsGoogleDrive settingsGoogleDrive, GoogleDriveService googleDriveService) {
        settingsGoogleDrive.N = googleDriveService;
        return googleDriveService;
    }

    private void b() {
        try {
            if (this.N != null) {
                this.N.u();
                if (!GoogleDriveService.c) {
                    return;
                }
            }
            Log.e(P[1]);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static void j(SettingsGoogleDrive settingsGoogleDrive) {
        settingsGoogleDrive.o();
    }

    public SettingsGoogleDrive() {
        this.A = new fe(this);
        this.J = new ConditionVariable(false);
        this.N = null;
        this.q = new ConditionVariable(false);
        this.D = new bf(this);
        this.p = new ds(this);
    }

    static Object a(SettingsGoogleDrive settingsGoogleDrive, Object obj) {
        settingsGoogleDrive.x = obj;
        return obj;
    }

    protected void onDestroy() {
        try {
            Log.i(P[60]);
            this.F = true;
            if (this.N != null) {
                this.N.a(this.D);
            }
            unbindService(this.p);
            h.b().c(this.x);
            super.onDestroy();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void j(int i) {
        CharSequence charSequence = getResources().getStringArray(2131689486)[i];
        Log.i(P[36] + charSequence);
        this.M.setText(charSequence);
        bq.a(new cq(this, i));
    }

    static ConditionVariable t(SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.J;
    }
}
