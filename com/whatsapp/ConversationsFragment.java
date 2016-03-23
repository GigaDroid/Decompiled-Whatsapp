package com.whatsapp;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.notification.d;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import com.whatsapp.util.h;
import com.whatsapp.util.undobar.UndoBarController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ConversationsFragment extends ListFragment implements tm, a_, o3 {
    private static final String[] z;
    TextView b;
    private ImageView c;
    private String d;
    private h2 e;
    View f;
    private ArrayList g;
    private int h;
    private GoogleDriveService i;
    private ProgressBar j;
    private TextView k;
    private TextView l;
    private String m;
    private ga n;
    private View o;
    private a2_ p;
    private final ServiceConnection q;
    private g7 r;
    private ce s;
    TextView t;
    private ListView u;

    public class DeleteBroadcastListDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "\u0007#\u001e".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = arj.Theme_switchStyle;
                        break;
                    case at.g /*1*/:
                        i2 = 74;
                        break;
                    case at.i /*2*/:
                        i2 = 122;
                        break;
                    case at.o /*3*/:
                        i2 = 67;
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.support.annotation.NonNull
        public android.app.Dialog onCreateDialog(android.os.Bundle r7) {
            /*
            r6 = this;
            r5 = 1;
            r0 = com.whatsapp.App.as;
            r1 = r6.getArguments();
            r2 = z;
            r1 = r1.getString(r2);
            r1 = r0.b(r1);
            r0 = r1.q;
            r0 = android.text.TextUtils.isEmpty(r0);
            if (r0 == 0) goto L_0x0024;
        L_0x0019:
            r0 = 2131231059; // 0x7f080153 float:1.8078188E38 double:1.0529680496E-314;
            r0 = r6.getString(r0);
            r2 = com.whatsapp.DialogToastActivity.f;
            if (r2 == 0) goto L_0x0038;
        L_0x0024:
            r0 = 2131231058; // 0x7f080152 float:1.8078186E38 double:1.052968049E-314;
            r2 = new java.lang.Object[r5];
            r3 = 0;
            r4 = r6.getActivity();
            r4 = r1.a(r4);
            r2[r3] = r4;
            r0 = r6.getString(r0, r2);
        L_0x0038:
            r2 = new android.support.v7.app.AlertDialog$Builder;
            r3 = r6.getActivity();
            r2.<init>(r3);
            r3 = r6.getActivity();
            r3 = r3.getBaseContext();
            r0 = com.whatsapp.a28.b(r0, r3);
            r0 = r2.setMessage(r0);
            r0 = r0.setCancelable(r5);
            r2 = 2131230884; // 0x7f0800a4 float:1.8077833E38 double:1.052967963E-314;
            r3 = new com.whatsapp.au6;
            r3.<init>(r6);
            r0 = r0.setNegativeButton(r2, r3);
            r2 = 2131231020; // 0x7f08012c float:1.807811E38 double:1.0529680303E-314;
            r3 = new com.whatsapp.adt;
            r3.<init>(r6, r1);
            r0 = r0.setPositiveButton(r2, r3);
            r0 = r0.create();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.DeleteBroadcastListDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }
    }

    public class DeleteContactDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[2];
            String str = "M>n";
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
                            i3 = 39;
                            break;
                        case at.g /*1*/:
                            i3 = 87;
                            break;
                        case at.i /*2*/:
                            i3 = 10;
                            break;
                        case at.o /*3*/:
                            i3 = 94;
                            break;
                        default:
                            i3 = 70;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "R9y;(S\u0014e+(S";
                        obj = null;
                }
            }
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            String string;
            l5 b = App.as.b(getArguments().getString(z[0]));
            int i = getArguments().getInt(z[1]);
            if (i == 0) {
                string = getString(2131231054, new Object[]{b.a(getActivity())});
            } else {
                string = App.az.a(2131296272, i, new Object[]{b.a(getActivity()), Integer.valueOf(i)});
            }
            return new Builder(getActivity()).setMessage(a28.b(string, getActivity().getBaseContext())).setCancelable(true).setNegativeButton(2131230884, new a9w(this)).setPositiveButton(2131231020, new a9k(this, b)).create();
        }
    }

    public class DeleteGroupDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "\u001ch7".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 118;
                        break;
                    case at.g /*1*/:
                        i2 = 1;
                        break;
                    case at.i /*2*/:
                        i2 = 83;
                        break;
                    case at.o /*3*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            l5 b = App.as.b(getArguments().getString(z));
            String str = null;
            if (b.q == null) {
                co m = App.aK.m(b.p);
                if (m != null && m.c == null && (m.z == 2 || m.z == 3)) {
                    str = m.c();
                }
            }
            if (str == null) {
                str = b.a(getActivity());
            }
            return new Builder(getActivity()).setMessage(a28.b(getString(2131231056, new Object[]{str}), getActivity().getBaseContext())).setCancelable(true).setNegativeButton(2131230884, new asj(this)).setPositiveButton(2131231020, new _b(this, b)).create();
        }
    }

    public class EmailConversationMediaChoiceDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "\u0001\u000b7".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i2 = 98;
                        break;
                    case at.i /*2*/:
                        i2 = 83;
                        break;
                    case at.o /*3*/:
                        i2 = 24;
                        break;
                    default:
                        i2 = 115;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            l5 b = App.as.b(getArguments().getString(z));
            return new Builder(getActivity()).setMessage(2131231086).setPositiveButton(2131230828, new e_(this, b)).setNeutralButton(2131232297, new my(this, b)).create();
        }
    }

    public class ExitGroupDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[2];
            String str = ")E\u00147i(h\b'i(";
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
                            i3 = 92;
                            break;
                        case at.g /*1*/:
                            i3 = 43;
                            break;
                        case at.i /*2*/:
                            i3 = arj.Theme_checkedTextViewStyle;
                            break;
                        case at.o /*3*/:
                            i3 = 82;
                            break;
                        default:
                            i3 = 7;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "6B\u0003";
                        obj = null;
                }
            }
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            String string;
            l5 b = App.as.b(getArguments().getString(z[1]));
            int i = getArguments().getInt(z[0]);
            if (i == 0) {
                string = getString(2131231138, new Object[]{b.a(getActivity())});
            } else {
                string = App.az.a(2131296274, i, new Object[]{b.a(getActivity()), Integer.valueOf(i)});
            }
            return new Builder(getActivity()).setMessage(a28.b(string, getActivity().getBaseContext())).setCancelable(true).setNegativeButton(2131230884, new azc(this)).setPositiveButton(2131231136, new ng(this, b)).create();
        }
    }

    static {
        String[] strArr = new String[35];
        String str = "\ndiW*;xfU&&eAS..fbO;\u0000enU";
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
                        i3 = 73;
                        break;
                    case at.g /*1*/:
                        i3 = 11;
                        break;
                    case at.i /*2*/:
                        i3 = 7;
                        break;
                    case at.o /*3*/:
                        i3 = 33;
                        break;
                    default:
                        i3 = 79;
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
                    str = "*diU.*\u007f";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "*diW*;xfU&&et\u000e=,xrM;ihhO;(hs\u0001!&\u007f'@+-nc";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "*diW*;xfU&&et\u000e=,xrM;fxlH?fhhO;(hs\u0001!&\u007f'@+-nc";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "*diW*;xfU&&et\u000e=,xrL*flcS&?n*I*(obS`.ouH9,&jD+ j*S*:\u007fhS*dohO*fcnE*d}nD8";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "*diW*;xfU&&et\u000e(-ynW*dcb@+,y(F+;bqDb$ncH.dybR;&yb\f?,ecH!.$tI >&qH*>";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    str = "(ecS  o)H!=niUa(hsH '%No\u001c\fYS";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "(ecS  o)H!=niUa(hsH '%No\u001c\fYS~\u0000\u001bTBe\u0006\u001d";
                    obj = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "?ec\u000f.'ouN&-%dT=:du\u000f&=nj\u000e,&es@,=";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "*diW*;xfU&&et\u000e,&esD7=+tX<=nj\u0001,&es@,=+kH<=+dN:%o'O =+aN:'o";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    str = "9chO*\u0016\u007f~Q*";
                    obj = 10;
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    strArr2 = strArr3;
                    str = "9chO*";
                    obj = 11;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "9chO*";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "*diW*;xfU&&et\u000e+,gbU*fluN:91";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "*dj\u000f8!jsR.9{XQ=,mbS*'hbR";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "*diW*;xfU&&et\u000e<,\u007fcD#,\u007fbB'(\u007f(G. gbE";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "-nkD;,TdI.=TdN:'\u007f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "*yb@;,T`S <{XU&9TdN:'\u007f";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "*dj\u000f8!jsR.9{XQ=,mbS*'hbR";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "*dj\u000f8!jsR.9{XQ=,mbS*'hbR";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "*dj\u000f8!jsR.9{XQ=,mbS*'hbR";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "*yb@;,T`S <{XU&9TsH\",";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "*yb@;,T`S <{XU&9TdN:'\u007f";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "*diW*;xfU&&et\u000e=,xrL*";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "-nkD;,TdI.=TdN:'\u007f";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "*dj\u000f8!jsR.9{XQ=,mbS*'hbR";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "*diW*;xfU&&et\u000e?(~tD";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "*diW*;xfU&&et\u000e+,xsS 0";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "*diW*;xfU&&et\u000e,&esD7=$iT#%";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "+yh@+*jtU";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "*diW*;xfU&&et\u000e,;nfU*";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "*diW*;xfU&&et\u000e,;nfU*";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    str = "\u0005diF\u001f;ntR*-YhV\u0005 o";
                    obj = 32;
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    strArr2 = strArr3;
                    str = "\u0005diF\u001f;ntR*-YhV\u0005 o";
                    obj = 33;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "#bc";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void b(l5 l5Var, DialogFragment dialogFragment) {
        ((by) getActivity()).a(2131231710, 2131231813);
        bq.a(new a3h(this, l5Var, dialogFragment), new Object[0]);
    }

    void a(int i) {
        ((by) getActivity()).a(i);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    void f(String str) {
        ((by) getActivity()).f(str);
    }

    private static int j() {
        return App.z().getSharedPreferences(z[26], 0).getInt(z[25], 0);
    }

    @TargetApi(8)
    private void f() {
        if (GoogleDriveService.X()) {
            View findViewById = this.u.findViewById(2131755575);
            if (findViewById != null) {
                try {
                    if (findViewById.getVisibility() == 8) {
                        if (GoogleDriveService.v()) {
                            findViewById.setVisibility(0);
                            Log.i(z[6]);
                            getActivity().bindService(new Intent(getActivity(), GoogleDriveService.class), this.q, 1);
                            this.o.setVisibility(0);
                            this.u.setHeaderDividersEnabled(true);
                            this.c = (ImageView) this.u.findViewById(2131755576);
                            this.j = (ProgressBar) this.u.findViewById(2131755225);
                            h.a(this.j, this.u.getResources().getColor(2131624046));
                            this.l = (TextView) this.u.findViewById(2131755577);
                            a4d.a(this.l);
                            this.k = (TextView) this.u.findViewById(2131755578);
                            Animation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                            try {
                                rotateAnimation.setDuration(2000);
                                rotateAnimation.setRepeatCount(-1);
                                rotateAnimation.setInterpolator(new LinearInterpolator());
                                this.c.setAnimation(rotateAnimation);
                                this.c.getAnimation().cancel();
                                this.o.setOnClickListener(new ar7(this));
                                if (!DialogToastActivity.f) {
                                    return;
                                }
                            } catch (ActivityNotFoundException e) {
                                throw e;
                            } catch (ActivityNotFoundException e2) {
                                throw e2;
                            }
                        }
                        return;
                    }
                    if (!GoogleDriveService.v()) {
                        Log.i(z[5]);
                        this.u.findViewById(2131755575).setVisibility(8);
                        getActivity().unbindService(this.q);
                    }
                } catch (ActivityNotFoundException e22) {
                    throw e22;
                }
            }
        }
    }

    private void d() {
        try {
            if (this.r != null) {
                this.r.notifyDataSetChanged();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static View b(ConversationsFragment conversationsFragment, String str) {
        return conversationsFragment.a(str);
    }

    static void d(int i) {
        b(i);
    }

    private View a(String str) {
        boolean z = DialogToastActivity.f;
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < this.u.getChildCount()) {
            View childAt = this.u.getChildAt(i);
            Object tag = childAt.getTag();
            if (tag instanceof a9l) {
                a9l com_whatsapp_a9l = (a9l) tag;
                try {
                    if (com_whatsapp_a9l.h instanceof wu) {
                        if (str.equals(((wu) com_whatsapp_a9l.h).a)) {
                            return childAt;
                        }
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return null;
    }

    static TextView h(ConversationsFragment conversationsFragment) {
        return conversationsFragment.l;
    }

    public void d(String str) {
        a(App.z(), str);
    }

    private void a(Context context, String str) {
        if (this.r != null) {
            View a = a(str);
            if (a != null) {
                a9l com_whatsapp_a9l = (a9l) a.getTag();
                qa.d(str);
                g7.a(this.r, context, a, (wu) com_whatsapp_a9l.h, com_whatsapp_a9l);
            }
        }
    }

    static ArrayList m(ConversationsFragment conversationsFragment) {
        return conversationsFragment.g;
    }

    static View k(ConversationsFragment conversationsFragment) {
        return conversationsFragment.o;
    }

    protected void a(View view) {
        App.aK.c(this.d, false);
    }

    public void m447a(String str) {
        a(App.z(), str);
    }

    public void onStart() {
        super.onStart();
    }

    static int g(ConversationsFragment conversationsFragment) {
        return conversationsFragment.h;
    }

    static ArrayList a(ConversationsFragment conversationsFragment, ArrayList arrayList) {
        conversationsFragment.g = arrayList;
        return arrayList;
    }

    public void onPause() {
        Log.i(z[27]);
        super.onPause();
        UndoBarController.c(getActivity());
    }

    private void b(View view) {
        Animation animationSet = new AnimationSet(true);
        Animation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        int top = view.getTop();
        animationSet.setDuration(300);
        view.startAnimation(animationSet);
        animationSet.setAnimationListener(new amj(this, top));
    }

    static String e(ConversationsFragment conversationsFragment) {
        return conversationsFragment.m;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateContextMenu(android.view.ContextMenu r9, android.view.View r10, android.view.ContextMenu.ContextMenuInfo r11) {
        /*
        r8 = this;
        r2 = 2131231055; // 0x7f08014f float:1.807818E38 double:1.0529680476E-314;
        r3 = com.whatsapp.DialogToastActivity.f;
        super.onCreateContextMenu(r9, r10, r11);
        r11 = (android.widget.AdapterView.AdapterContextMenuInfo) r11;
        r0 = r11.targetView;
        r0 = r0.getTag();
        r0 = (com.whatsapp.a9l) r0;
        if (r0 != 0) goto L_0x0020;
    L_0x0014:
        r0 = z;	 Catch:{ ActivityNotFoundException -> 0x001e }
        r1 = 29;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x001e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x001e }
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r1 = r0.h;	 Catch:{ ActivityNotFoundException -> 0x0054 }
        r1 = r1 instanceof com.whatsapp.wu;	 Catch:{ ActivityNotFoundException -> 0x0054 }
        if (r1 == 0) goto L_0x001d;
    L_0x0026:
        r1 = r0.h;
        r1 = (com.whatsapp.wu) r1;
        r1 = r1.a;
        r8.d = r1;
        r4 = com.whatsapp.App.as;
        r5 = r8.d;
        r4 = r4.b(r5);
        r5 = z;	 Catch:{ ActivityNotFoundException -> 0x0052 }
        r6 = 30;
        r5 = r5[r6];	 Catch:{ ActivityNotFoundException -> 0x0052 }
        r1 = r5.equals(r1);	 Catch:{ ActivityNotFoundException -> 0x0052 }
        if (r1 == 0) goto L_0x0056;
    L_0x0042:
        r0 = 0;
        r1 = 2131755027; // 0x7f100013 float:1.9140922E38 double:1.053226924E-314;
        r2 = 0;
        r3 = 2131231049; // 0x7f080149 float:1.8078168E38 double:1.0529680447E-314;
        r3 = r8.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x0052 }
        r9.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0052 }
        goto L_0x001d;
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r1 = r4.A();	 Catch:{ ActivityNotFoundException -> 0x006c }
        if (r1 == 0) goto L_0x006e;
    L_0x005c:
        r0 = 0;
        r1 = 2131755027; // 0x7f100013 float:1.9140922E38 double:1.053226924E-314;
        r2 = 0;
        r3 = 2131231055; // 0x7f08014f float:1.807818E38 double:1.0529680476E-314;
        r3 = r8.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x006c }
        r9.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x006c }
        goto L_0x001d;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r1 = r4.m();	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        if (r1 != 0) goto L_0x0089;
    L_0x0074:
        r1 = com.whatsapp.App.a2();	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        if (r1 != 0) goto L_0x0089;
    L_0x007a:
        r1 = 0;
        r5 = 2131755026; // 0x7f100012 float:1.914092E38 double:1.0532269237E-314;
        r6 = 0;
        r7 = 2131230793; // 0x7f080049 float:1.8077649E38 double:1.052967918E-314;
        r7 = r8.getString(r7);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r9.add(r1, r5, r6, r7);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
    L_0x0089:
        r1 = r4.l;	 Catch:{ ActivityNotFoundException -> 0x01d8 }
        if (r1 != 0) goto L_0x00e3;
    L_0x008d:
        r1 = r4.c();	 Catch:{ ActivityNotFoundException -> 0x01da }
        if (r1 == 0) goto L_0x00ac;
    L_0x0093:
        r0 = r0.i;	 Catch:{ ActivityNotFoundException -> 0x01dc }
        r0 = r0.getVisibility();	 Catch:{ ActivityNotFoundException -> 0x01dc }
        if (r0 == 0) goto L_0x001d;
    L_0x009b:
        r0 = 0;
        r1 = 2131755029; // 0x7f100015 float:1.9140926E38 double:1.053226925E-314;
        r5 = 0;
        r6 = 2131231318; // 0x7f080256 float:1.8078714E38 double:1.0529681776E-314;
        r6 = r8.getString(r6);	 Catch:{ ActivityNotFoundException -> 0x01de }
        r9.add(r0, r1, r5, r6);	 Catch:{ ActivityNotFoundException -> 0x01de }
        if (r3 == 0) goto L_0x00f2;
    L_0x00ac:
        r0 = r4.m();	 Catch:{ ActivityNotFoundException -> 0x01e0 }
        if (r0 == 0) goto L_0x00c3;
    L_0x00b2:
        r0 = 0;
        r1 = 2131755029; // 0x7f100015 float:1.9140926E38 double:1.053226925E-314;
        r5 = 0;
        r6 = 2131231394; // 0x7f0802a2 float:1.8078868E38 double:1.052968215E-314;
        r6 = r8.getString(r6);	 Catch:{ ActivityNotFoundException -> 0x01e2 }
        r9.add(r0, r1, r5, r6);	 Catch:{ ActivityNotFoundException -> 0x01e2 }
        if (r3 == 0) goto L_0x00f2;
    L_0x00c3:
        r0 = 0;
        r1 = 2131755022; // 0x7f10000e float:1.9140912E38 double:1.0532269217E-314;
        r5 = 0;
        r6 = 2131230786; // 0x7f080042 float:1.8077635E38 double:1.0529679147E-314;
        r6 = r8.getString(r6);	 Catch:{ ActivityNotFoundException -> 0x01e4 }
        r9.add(r0, r1, r5, r6);	 Catch:{ ActivityNotFoundException -> 0x01e4 }
        r0 = 0;
        r1 = 2131755023; // 0x7f10000f float:1.9140914E38 double:1.053226922E-314;
        r5 = 0;
        r6 = 2131230789; // 0x7f080045 float:1.807764E38 double:1.052967916E-314;
        r6 = r8.getString(r6);	 Catch:{ ActivityNotFoundException -> 0x01e4 }
        r9.add(r0, r1, r5, r6);	 Catch:{ ActivityNotFoundException -> 0x01e4 }
        if (r3 == 0) goto L_0x00f2;
    L_0x00e3:
        r0 = 0;
        r1 = 2131755025; // 0x7f100011 float:1.9140918E38 double:1.053226923E-314;
        r5 = 0;
        r6 = 2131232226; // 0x7f0805e2 float:1.8080555E38 double:1.052968626E-314;
        r6 = r8.getString(r6);	 Catch:{ ActivityNotFoundException -> 0x01e4 }
        r9.add(r0, r1, r5, r6);	 Catch:{ ActivityNotFoundException -> 0x01e4 }
    L_0x00f2:
        r0 = r4.c();	 Catch:{ ActivityNotFoundException -> 0x01e6 }
        if (r0 == 0) goto L_0x0111;
    L_0x00f8:
        r1 = 0;
        r5 = 2131755027; // 0x7f100013 float:1.9140922E38 double:1.053226924E-314;
        r6 = 0;
        r0 = r4.p;	 Catch:{ ActivityNotFoundException -> 0x01e8 }
        r0 = com.whatsapp.qm.h(r0);	 Catch:{ ActivityNotFoundException -> 0x01e8 }
        if (r0 == 0) goto L_0x01ea;
    L_0x0105:
        r0 = 2131231137; // 0x7f0801a1 float:1.8078347E38 double:1.052968088E-314;
    L_0x0108:
        r0 = r8.getString(r0);	 Catch:{ ActivityNotFoundException -> 0x01ed }
        r9.add(r1, r5, r6, r0);	 Catch:{ ActivityNotFoundException -> 0x01ed }
        if (r3 == 0) goto L_0x0137;
    L_0x0111:
        r0 = r4.m();	 Catch:{ ActivityNotFoundException -> 0x01ef }
        if (r0 == 0) goto L_0x0128;
    L_0x0117:
        r0 = 0;
        r1 = 2131755027; // 0x7f100013 float:1.9140922E38 double:1.053226924E-314;
        r2 = 0;
        r5 = 2131231057; // 0x7f080151 float:1.8078184E38 double:1.0529680486E-314;
        r5 = r8.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01f1 }
        r9.add(r0, r1, r2, r5);	 Catch:{ ActivityNotFoundException -> 0x01f1 }
        if (r3 == 0) goto L_0x0137;
    L_0x0128:
        r0 = 0;
        r1 = 2131755027; // 0x7f100013 float:1.9140922E38 double:1.053226924E-314;
        r2 = 0;
        r5 = 2131231050; // 0x7f08014a float:1.807817E38 double:1.052968045E-314;
        r5 = r8.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01f1 }
        r9.add(r0, r1, r2, r5);	 Catch:{ ActivityNotFoundException -> 0x01f1 }
    L_0x0137:
        r0 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x01f3 }
        r1 = r4.p;	 Catch:{ ActivityNotFoundException -> 0x01f3 }
        r0 = r0.b(r1);	 Catch:{ ActivityNotFoundException -> 0x01f3 }
        if (r0 == 0) goto L_0x016b;
    L_0x0141:
        r0 = r4.p;	 Catch:{ ActivityNotFoundException -> 0x01f5 }
        r0 = com.whatsapp.l5.g(r0);	 Catch:{ ActivityNotFoundException -> 0x01f5 }
        if (r0 == 0) goto L_0x015a;
    L_0x0149:
        r0 = 0;
        r1 = 2131755032; // 0x7f100018 float:1.9140932E38 double:1.0532269267E-314;
        r2 = 0;
        r5 = 2131232175; // 0x7f0805af float:1.8080452E38 double:1.052968601E-314;
        r5 = r8.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01f7 }
        r9.add(r0, r1, r2, r5);	 Catch:{ ActivityNotFoundException -> 0x01f7 }
        if (r3 == 0) goto L_0x0193;
    L_0x015a:
        r0 = 0;
        r1 = 2131755032; // 0x7f100018 float:1.9140932E38 double:1.0532269267E-314;
        r2 = 0;
        r5 = 2131232176; // 0x7f0805b0 float:1.8080454E38 double:1.0529686015E-314;
        r5 = r8.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01f9 }
        r9.add(r0, r1, r2, r5);	 Catch:{ ActivityNotFoundException -> 0x01f9 }
        if (r3 == 0) goto L_0x0193;
    L_0x016b:
        r0 = r4.p;	 Catch:{ ActivityNotFoundException -> 0x01fb }
        r0 = com.whatsapp.l5.g(r0);	 Catch:{ ActivityNotFoundException -> 0x01fb }
        if (r0 == 0) goto L_0x0184;
    L_0x0173:
        r0 = 0;
        r1 = 2131755024; // 0x7f100010 float:1.9140916E38 double:1.0532269227E-314;
        r2 = 0;
        r5 = 2131230818; // 0x7f080062 float:1.80777E38 double:1.0529679305E-314;
        r5 = r8.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01fd }
        r9.add(r0, r1, r2, r5);	 Catch:{ ActivityNotFoundException -> 0x01fd }
        if (r3 == 0) goto L_0x0193;
    L_0x0184:
        r0 = 0;
        r1 = 2131755024; // 0x7f100010 float:1.9140916E38 double:1.0532269227E-314;
        r2 = 0;
        r5 = 2131230819; // 0x7f080063 float:1.8077702E38 double:1.052967931E-314;
        r5 = r8.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01fd }
        r9.add(r0, r1, r2, r5);	 Catch:{ ActivityNotFoundException -> 0x01fd }
    L_0x0193:
        r0 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x01ff }
        r1 = r8.d;	 Catch:{ ActivityNotFoundException -> 0x01ff }
        r0 = r0.m(r1);	 Catch:{ ActivityNotFoundException -> 0x01ff }
        if (r0 == 0) goto L_0x01ac;
    L_0x019d:
        r0 = 0;
        r1 = 2131755028; // 0x7f100014 float:1.9140924E38 double:1.0532269247E-314;
        r2 = 0;
        r5 = 2131231085; // 0x7f08016d float:1.8078241E38 double:1.0529680624E-314;
        r5 = r8.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01ff }
        r9.add(r0, r1, r2, r5);	 Catch:{ ActivityNotFoundException -> 0x01ff }
    L_0x01ac:
        r0 = r4.d;	 Catch:{ ActivityNotFoundException -> 0x0201 }
        if (r0 == 0) goto L_0x01c1;
    L_0x01b0:
        r0 = 0;
        r1 = 2131755030; // 0x7f100016 float:1.9140928E38 double:1.0532269257E-314;
        r2 = 0;
        r4 = 2131231422; // 0x7f0802be float:1.8078925E38 double:1.052968229E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r9.add(r0, r1, r2, r4);	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        if (r3 == 0) goto L_0x001d;
    L_0x01c1:
        r0 = 0;
        r1 = 2131755031; // 0x7f100017 float:1.914093E38 double:1.053226926E-314;
        r2 = 0;
        r3 = 2131231423; // 0x7f0802bf float:1.8078927E38 double:1.0529682294E-314;
        r3 = r8.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r9.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        goto L_0x001d;
    L_0x01d2:
        r0 = move-exception;
        throw r0;
    L_0x01d4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01d6 }
    L_0x01d6:
        r0 = move-exception;
        throw r0;
    L_0x01d8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01da }
    L_0x01da:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01dc }
    L_0x01dc:
        r0 = move-exception;
        throw r0;
    L_0x01de:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01e0 }
    L_0x01e0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01e2 }
    L_0x01e2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01e4 }
    L_0x01e4:
        r0 = move-exception;
        throw r0;
    L_0x01e6:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01e8 }
    L_0x01e8:
        r0 = move-exception;
        throw r0;
    L_0x01ea:
        r0 = r2;
        goto L_0x0108;
    L_0x01ed:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01ef }
    L_0x01ef:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01f1 }
    L_0x01f1:
        r0 = move-exception;
        throw r0;
    L_0x01f3:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01f5 }
    L_0x01f5:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01f7 }
    L_0x01f7:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01f9 }
    L_0x01f9:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01fb }
    L_0x01fb:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01fd }
    L_0x01fd:
        r0 = move-exception;
        throw r0;
    L_0x01ff:
        r0 = move-exception;
        throw r0;
    L_0x0201:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    static ProgressBar i(ConversationsFragment conversationsFragment) {
        return conversationsFragment.j;
    }

    static TextView b(ConversationsFragment conversationsFragment) {
        return conversationsFragment.k;
    }

    public void e(String str) {
        getActivity().runOnUiThread(new j1(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r9) {
        /*
        r8 = this;
        r7 = 11;
        r1 = 0;
        r0 = 1;
        r2 = new com.whatsapp.util.ab;
        r3 = z;
        r4 = 31;
        r3 = r3[r4];
        r2.<init>(r3);
        r3 = r8.s;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = com.whatsapp.t4.ON_ACTIVITY_CREATED;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.b(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        super.onActivityCreated(r9);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = 1;
        r8.setHasOptionsMenu(r3);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        if (r3 != 0) goto L_0x00a1;
    L_0x0021:
        r3 = new com.whatsapp.h2;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.<init>();	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r8.e = r3;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131231347; // 0x7f080273 float:1.8078772E38 double:1.052968192E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.g = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131231281; // 0x7f080231 float:1.8078639E38 double:1.0529681593E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.h = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131231282; // 0x7f080232 float:1.807864E38 double:1.05296816E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.j = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131231000; // 0x7f080118 float:1.8078069E38 double:1.0529680205E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.k = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131230993; // 0x7f080111 float:1.8078054E38 double:1.052968017E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.d = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131231004; // 0x7f08011c float:1.8078077E38 double:1.0529680224E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.f = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131231003; // 0x7f08011b float:1.8078075E38 double:1.052968022E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.e = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131231001; // 0x7f080119 float:1.807807E38 double:1.052968021E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.b = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131230998; // 0x7f080116 float:1.8078065E38 double:1.0529680195E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.a = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131230999; // 0x7f080117 float:1.8078067E38 double:1.05296802E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.i = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3 = r8.e;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r4 = 2131231345; // 0x7f080271 float:1.8078768E38 double:1.052968191E-314;
        r4 = r8.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01c5 }
        r3.c = r4;	 Catch:{ ActivityNotFoundException -> 0x01c5 }
    L_0x00a1:
        r3 = z;	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r4 = 32;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r3 = r8.getActivity();	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r3 = r3.getApplicationContext();	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        com.whatsapp.App.w(r3);	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        com.whatsapp.App.b(r8);	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        com.whatsapp.App.b(r8);	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r3 = r8.a();	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r8.g = r3;	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r3 = r8.getListView();	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r8.u = r3;	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r3 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r4 = new com.whatsapp.util.bz;	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r5 = r8.getResources();	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r6 = 2130837747; // 0x7f0200f3 float:1.7280457E38 double:1.0527737277E-314;
        r5 = r5.getDrawable(r6);	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r4.<init>(r5);	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r3.setDivider(r4);	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r3 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        if (r4 >= r7) goto L_0x01c9;
    L_0x00e2:
        r3.setFastScrollEnabled(r0);	 Catch:{ ActivityNotFoundException -> 0x01cc }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x01cc }
        if (r0 >= r7) goto L_0x00f1;
    L_0x00e9:
        r0 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01cc }
        r1 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r0.setSelector(r1);	 Catch:{ ActivityNotFoundException -> 0x01cc }
    L_0x00f1:
        r0 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01ce }
        r1 = 1;
        r0.setScrollbarFadingEnabled(r1);	 Catch:{ ActivityNotFoundException -> 0x01ce }
        r8.k();	 Catch:{ ActivityNotFoundException -> 0x01ce }
        r8.e();	 Catch:{ ActivityNotFoundException -> 0x01ce }
        r0 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01ce }
        r1 = new com.whatsapp.a21;	 Catch:{ ActivityNotFoundException -> 0x01ce }
        r1.<init>(r8);	 Catch:{ ActivityNotFoundException -> 0x01ce }
        r0.setOnScrollListener(r1);	 Catch:{ ActivityNotFoundException -> 0x01ce }
        r0 = com.whatsapp.gdrive.GoogleDriveService.X();	 Catch:{ ActivityNotFoundException -> 0x01ce }
        if (r0 == 0) goto L_0x0141;
    L_0x010d:
        r0 = com.whatsapp.gdrive.GoogleDriveService.v();	 Catch:{ ActivityNotFoundException -> 0x01d0 }
        if (r0 != 0) goto L_0x0118;
    L_0x0113:
        r0 = com.whatsapp.App.am;	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r1 = 3;
        if (r0 != r1) goto L_0x0141;
    L_0x0118:
        r0 = r8.getActivity();	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r0 = r0.getLayoutInflater();	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r1 = 2130903146; // 0x7f03006a float:1.7413102E38 double:1.052806039E-314;
        r3 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r4 = 0;
        r0 = com.whatsapp.aam.a(r0, r1, r3, r4);	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r8.o = r0;	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r0 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r1 = r8.o;	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r0.addHeaderView(r1);	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r0 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r1 = 2131755575; // 0x7f100237 float:1.9142033E38 double:1.053227195E-314;
        r0 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x01d2 }
    L_0x0141:
        r0 = new com.whatsapp.g7;	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r0.<init>(r8);	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r8.r = r0;	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r0 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r1 = r8.r;	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r0.setAdapter(r1);	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r0 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r1 = new com.whatsapp.ar6;	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r1.<init>(r8);	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r0.setOnItemClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r0 = r8.r;	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r0 = r0.getCount();	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        if (r0 != 0) goto L_0x0164;
    L_0x0161:
        r8.i();	 Catch:{ ActivityNotFoundException -> 0x01d4 }
    L_0x0164:
        r0 = r8.u;	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r8.registerForContextMenu(r0);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r0 = r8.getView();	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r1 = 2131755660; // 0x7f10028c float:1.9142206E38 double:1.053227237E-314;
        r0 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r1 = new com.whatsapp.yj;	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r1.<init>(r8);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r0 = r8.getView();	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r1 = 2131755659; // 0x7f10028b float:1.9142204E38 double:1.0532272364E-314;
        r0 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r1 = new com.whatsapp.y7;	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r1.<init>(r8);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        if (r9 == 0) goto L_0x019d;
    L_0x0191:
        r0 = z;	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r1 = 33;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r0 = r9.getString(r0);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r8.d = r0;	 Catch:{ ActivityNotFoundException -> 0x01d6 }
    L_0x019d:
        r2.b();	 Catch:{ ActivityNotFoundException -> 0x01d8 }
        r0 = com.whatsapp.gdrive.GoogleDriveService.X();	 Catch:{ ActivityNotFoundException -> 0x01d8 }
        if (r0 == 0) goto L_0x01ba;
    L_0x01a6:
        r0 = com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.m();	 Catch:{ ActivityNotFoundException -> 0x01d8 }
        if (r0 == 0) goto L_0x01ba;
    L_0x01ac:
        r0 = new android.content.Intent;
        r1 = r8.getActivity();
        r2 = com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.class;
        r0.<init>(r1, r2);
        r8.startActivity(r0);
    L_0x01ba:
        r0 = r8.s;
        r1 = com.whatsapp.t4.ON_ACTIVITY_CREATED;
        r0.a(r1);
        r8.g();
        return;
    L_0x01c5:
        r0 = move-exception;
        throw r0;
    L_0x01c7:
        r0 = move-exception;
        throw r0;
    L_0x01c9:
        r0 = r1;
        goto L_0x00e2;
    L_0x01cc:
        r0 = move-exception;
        throw r0;
    L_0x01ce:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01d0 }
    L_0x01d0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01d2 }
    L_0x01d2:
        r0 = move-exception;
        throw r0;
    L_0x01d4:
        r0 = move-exception;
        throw r0;
    L_0x01d6:
        r0 = move-exception;
        throw r0;
    L_0x01d8:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.onActivityCreated(android.os.Bundle):void");
    }

    protected void k() {
        View inflate = getActivity().getLayoutInflater().inflate(2130903150, this.u, false);
        this.u.addFooterView(inflate, null, true);
        this.b = (TextView) inflate.findViewById(2131755590);
        inflate = getActivity().getLayoutInflater().inflate(2130903150, this.u, false);
        inflate.setBackgroundResource(2130839767);
        inflate.setOnClickListener(new au3(this));
        this.u.addFooterView(inflate, null, true);
        this.t = (TextView) inflate.findViewById(2131755590);
        this.f = aam.a(getActivity().getLayoutInflater(), 2130903145, this.u, false);
        this.f.setBackgroundResource(2130839767);
        a4d.a((TextView) this.f.findViewById(2131755573));
        ((ImageView) this.f.findViewById(2131755351)).setImageBitmap(l5.b(2130839680));
        inflate = new FrameLayout(getActivity());
        inflate.setBackgroundColor(-11684180);
        inflate.addView(this.f);
        inflate.setOnClickListener(new x2(this));
        this.f.findViewById(2131755369).setOnClickListener(new a9h(this));
        this.u.addHeaderView(inflate, null, true);
    }

    public void b(String str) {
        a(App.z(), str);
    }

    static GoogleDriveService a(ConversationsFragment conversationsFragment, GoogleDriveService googleDriveService) {
        conversationsFragment.i = googleDriveService;
        return googleDriveService;
    }

    static ImageView c(ConversationsFragment conversationsFragment) {
        return conversationsFragment.c;
    }

    static GoogleDriveService p(ConversationsFragment conversationsFragment) {
        return conversationsFragment.i;
    }

    protected void c(int i) {
        boolean z = DialogToastActivity.f;
        if (this.u.getLastVisiblePosition() < this.u.getAdapter().getCount() - 1) {
            int childCount = this.u.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (i3 < childCount) {
                int i4;
                View childAt = this.u.getChildAt(i3);
                if (childAt.getTop() >= i) {
                    Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    translateAnimation.setDuration(150);
                    translateAnimation.setStartOffset((long) (((int) Math.sqrt((double) (i2 * 300))) * 8));
                    translateAnimation.setFillAfter(false);
                    childAt.startAnimation(translateAnimation);
                    i4 = i2 + 1;
                } else {
                    i4 = i2;
                }
                int i5 = i3 + 1;
                if (!z) {
                    i3 = i5;
                    i2 = i4;
                } else {
                    return;
                }
            }
        }
    }

    protected ArrayList a() {
        boolean z = DialogToastActivity.f;
        ArrayList h = qa.h();
        ArrayList arrayList = new ArrayList(h.size());
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(new wu((String) it.next()));
            if (z) {
                break;
            }
        }
        return arrayList;
    }

    static String a(ConversationsFragment conversationsFragment, String str) {
        conversationsFragment.m = str;
        return str;
    }

    static int h() {
        return j();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
        r6 = this;
        r0 = 0;
        r2 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r1 = r7.getItemId();	 Catch:{ ActivityNotFoundException -> 0x002b }
        r4 = 2131755042; // 0x7f100022 float:1.9140952E38 double:1.0532269316E-314;
        if (r1 != r4) goto L_0x0031;
    L_0x000d:
        r0 = r6.getContext();	 Catch:{ ActivityNotFoundException -> 0x002d }
        r0 = com.whatsapp.App.v(r0);	 Catch:{ ActivityNotFoundException -> 0x002d }
        if (r0 == 0) goto L_0x001c;
    L_0x0017:
        r6.c();	 Catch:{ ActivityNotFoundException -> 0x002f }
        if (r3 == 0) goto L_0x0029;
    L_0x001c:
        r0 = r6.getActivity();	 Catch:{ ActivityNotFoundException -> 0x002f }
        r1 = 2131231618; // 0x7f080382 float:1.8079322E38 double:1.052968326E-314;
        r3 = 2131231619; // 0x7f080383 float:1.8079324E38 double:1.0529683263E-314;
        com.whatsapp.RequestPermissionActivity.b(r0, r1, r3);	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x0029:
        r0 = r2;
    L_0x002a:
        return r0;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        r1 = r7.getItemId();
        r4 = 2131755039; // 0x7f10001f float:1.9140946E38 double:1.05322693E-314;
        if (r1 != r4) goto L_0x004a;
    L_0x003a:
        r0 = new android.content.Intent;
        r1 = r6.getActivity();
        r3 = com.whatsapp.ListMembersSelector.class;
        r0.<init>(r1, r3);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x002a;
    L_0x004a:
        r1 = r7.getItemId();
        r4 = 2131755043; // 0x7f100023 float:1.9140954E38 double:1.053226932E-314;
        if (r1 != r4) goto L_0x00b4;
    L_0x0053:
        r1 = com.whatsapp.qa.g();
        r4 = r1.iterator();
        r1 = r0;
    L_0x005c:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0123;
    L_0x0062:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = com.whatsapp.qm.i(r0);	 Catch:{ ActivityNotFoundException -> 0x009f }
        if (r5 == 0) goto L_0x0120;
    L_0x006e:
        r5 = com.whatsapp.App.ad();	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r5 = r0.contains(r5);	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        if (r5 == 0) goto L_0x0120;
    L_0x0078:
        r0 = com.whatsapp.l5.b(r0);	 Catch:{ ActivityNotFoundException -> 0x00a3 }
        if (r0 != 0) goto L_0x0120;
    L_0x007e:
        r1 = r1 + 1;
        r0 = r1;
    L_0x0081:
        if (r3 == 0) goto L_0x011d;
    L_0x0083:
        r1 = com.whatsapp.a59.n;	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        if (r0 < r1) goto L_0x00a7;
    L_0x0087:
        r0 = 2131231283; // 0x7f080233 float:1.8078643E38 double:1.0529681603E-314;
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r3 = 0;
        r4 = com.whatsapp.a59.n;	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r1[r3] = r4;	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r0 = r6.getString(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r6.f(r0);	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r0 = r2;
        goto L_0x002a;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = r6.getActivity();
        r1 = com.whatsapp.fieldstats.co.MENU;
        r3 = 0;
        com.whatsapp.NewGroup.a(r0, r1, r3);
        r0 = r2;
        goto L_0x002a;
    L_0x00b4:
        r1 = r7.getItemId();	 Catch:{ ActivityNotFoundException -> 0x00f7 }
        r4 = 2131755046; // 0x7f100026 float:1.914096E38 double:1.0532269336E-314;
        if (r1 != r4) goto L_0x0101;
    L_0x00bd:
        r0 = com.whatsapp.wn.z();	 Catch:{ ActivityNotFoundException -> 0x00f9 }
        if (r0 == 0) goto L_0x00d3;
    L_0x00c3:
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x00fb }
        r1 = r6.getActivity();	 Catch:{ ActivityNotFoundException -> 0x00fb }
        r4 = com.whatsapp.WebSessionsActivity.class;
        r0.<init>(r1, r4);	 Catch:{ ActivityNotFoundException -> 0x00fb }
        r6.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x00fb }
        if (r3 == 0) goto L_0x00f4;
    L_0x00d3:
        r0 = com.whatsapp.App.Q();	 Catch:{ ActivityNotFoundException -> 0x00fd }
        if (r0 == 0) goto L_0x00e9;
    L_0x00d9:
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x00ff }
        r1 = r6.getActivity();	 Catch:{ ActivityNotFoundException -> 0x00ff }
        r4 = com.whatsapp.qrcode.QrCodeActivity.class;
        r0.<init>(r1, r4);	 Catch:{ ActivityNotFoundException -> 0x00ff }
        r6.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x00ff }
        if (r3 == 0) goto L_0x00f4;
    L_0x00e9:
        r0 = r6.getActivity();	 Catch:{ ActivityNotFoundException -> 0x00ff }
        r1 = 2131231518; // 0x7f08031e float:1.807912E38 double:1.0529682764E-314;
        r3 = 0;
        com.whatsapp.App.a(r0, r1, r3);	 Catch:{ ActivityNotFoundException -> 0x00ff }
    L_0x00f4:
        r0 = r2;
        goto L_0x002a;
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f9 }
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;
    L_0x0101:
        r1 = r7.getItemId();	 Catch:{ ActivityNotFoundException -> 0x011b }
        r3 = 2131755052; // 0x7f10002c float:1.9140972E38 double:1.0532269365E-314;
        if (r1 != r3) goto L_0x002a;
    L_0x010a:
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x011b }
        r1 = r6.getActivity();	 Catch:{ ActivityNotFoundException -> 0x011b }
        r3 = com.whatsapp.StarredMessagesActivity.class;
        r0.<init>(r1, r3);	 Catch:{ ActivityNotFoundException -> 0x011b }
        r6.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x011b }
        r0 = r2;
        goto L_0x002a;
    L_0x011b:
        r0 = move-exception;
        throw r0;
    L_0x011d:
        r1 = r0;
        goto L_0x005c;
    L_0x0120:
        r0 = r1;
        goto L_0x0081;
    L_0x0123:
        r0 = r1;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public void c(String str) {
        a(App.z(), str);
    }

    static ga n(ConversationsFragment conversationsFragment) {
        return conversationsFragment.n;
    }

    static ListView l(ConversationsFragment conversationsFragment) {
        return conversationsFragment.u;
    }

    private void g() {
        try {
            if (this.r.isEmpty()) {
                this.s.a(a5a.COUNT, 0);
                this.s.d();
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            this.s.a(a5a.COUNT, this.r.getCount());
            a2c.b(getListView(), this.s);
            a2c.a(getListView(), this.s);
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.s.b(t4.ON_CREATE_VIEW);
        View a = HomeActivity.a(layoutInflater.inflate(2130903144, viewGroup, false), (Fragment) this);
        this.s.a(t4.ON_CREATE_VIEW);
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
        r5 = this;
        r4 = -1;
        r0 = com.whatsapp.DialogToastActivity.f;
        switch(r6) {
            case 1: goto L_0x0007;
            case 10: goto L_0x0021;
            case 11: goto L_0x004f;
            case 150: goto L_0x006a;
            default: goto L_0x0006;
        };
    L_0x0006:
        return;
    L_0x0007:
        if (r7 != r4) goto L_0x0006;
    L_0x0009:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r1 = r8.getStringExtra(r1);
        r2 = com.whatsapp.App.as;
        r1 = r2.b(r1);
        r1 = com.whatsapp.Conversation.a(r1);	 Catch:{ ActivityNotFoundException -> 0x0072 }
        r5.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0072 }
        if (r0 == 0) goto L_0x0006;
    L_0x0021:
        if (r7 != r4) goto L_0x0045;
    L_0x0023:
        r1 = com.whatsapp.App.as;
        r2 = r5.d;
        r1 = r1.b(r2);
        if (r8 == 0) goto L_0x003e;
    L_0x002d:
        r2 = r8.getData();	 Catch:{ ActivityNotFoundException -> 0x0074 }
        if (r2 == 0) goto L_0x003e;
    L_0x0033:
        r2 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x0076 }
        r3 = r8.getData();	 Catch:{ ActivityNotFoundException -> 0x0076 }
        r2.a(r3, r1);	 Catch:{ ActivityNotFoundException -> 0x0076 }
        if (r0 == 0) goto L_0x0043;
    L_0x003e:
        r2 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x0076 }
        r2.n(r1);	 Catch:{ ActivityNotFoundException -> 0x0076 }
    L_0x0043:
        if (r0 == 0) goto L_0x0006;
    L_0x0045:
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x0078 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0078 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x0078 }
        if (r0 == 0) goto L_0x0006;
    L_0x004f:
        if (r7 != r4) goto L_0x0060;
    L_0x0051:
        r1 = com.whatsapp.App.as;
        r2 = r5.d;
        r1 = r1.b(r2);
        r2 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x007a }
        r2.n(r1);	 Catch:{ ActivityNotFoundException -> 0x007a }
        if (r0 == 0) goto L_0x0006;
    L_0x0060:
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x007c }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x007c }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x007c }
        if (r0 == 0) goto L_0x0006;
    L_0x006a:
        if (r7 != r4) goto L_0x0006;
    L_0x006c:
        r5.c();	 Catch:{ ActivityNotFoundException -> 0x0070 }
        goto L_0x0006;
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0070 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        this.s = tp.a(z[0]);
        this.s.e();
        this.s.b(t4.ON_CREATE);
        super.onCreate(bundle);
        this.s.a(t4.ON_CREATE);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onContextItemSelected(android.view.MenuItem r8) {
        /*
        r7 = this;
        r6 = 11;
        r5 = 0;
        r1 = 1;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.getItemId();
        r3 = 2131755025; // 0x7f100011 float:1.9140918E38 double:1.053226923E-314;
        if (r0 != r3) goto L_0x0026;
    L_0x000f:
        r0 = com.whatsapp.App.as;
        r2 = r7.d;
        r0 = r0.b(r2);
        r2 = r0.l;	 Catch:{ ActivityNotFoundException -> 0x0024 }
        if (r2 == 0) goto L_0x0022;
    L_0x001b:
        r2 = r7.getActivity();	 Catch:{ ActivityNotFoundException -> 0x0024 }
        com.whatsapp.ContactInfo.a(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x0024 }
    L_0x0022:
        r0 = r1;
    L_0x0023:
        return r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = r8.getItemId();
        r3 = 2131755027; // 0x7f100013 float:1.9140922E38 double:1.053226924E-314;
        if (r0 != r3) goto L_0x00c9;
    L_0x002f:
        r0 = com.whatsapp.App.as;
        r3 = r7.d;
        r0 = r0.b(r3);
        r3 = r0.c();	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        if (r3 == 0) goto L_0x0093;
    L_0x003d:
        r3 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r3.<init>();	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r4 = z;	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r3 = r3.append(r4);	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r3 = r3.append(r0);	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r3 = r3.toString();	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r3 = com.whatsapp.qm.d;	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        if (r3 == 0) goto L_0x0068;
    L_0x005b:
        r3 = r7.getActivity();	 Catch:{ ActivityNotFoundException -> 0x00b9 }
        r4 = 2131231348; // 0x7f080274 float:1.8078774E38 double:1.0529681924E-314;
        r5 = 0;
        com.whatsapp.App.a(r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x00b9 }
        if (r2 == 0) goto L_0x00b4;
    L_0x0068:
        r3 = r0.p;	 Catch:{ ActivityNotFoundException -> 0x00bb }
        r3 = com.whatsapp.qm.h(r3);	 Catch:{ ActivityNotFoundException -> 0x00bb }
        if (r3 == 0) goto L_0x0080;
    L_0x0070:
        r3 = r0.A();	 Catch:{ ActivityNotFoundException -> 0x00bd }
        if (r3 != 0) goto L_0x0080;
    L_0x0076:
        r3 = new com.whatsapp.ConversationsFragment$ExitGroupDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x00bf }
        r3.<init>();	 Catch:{ ActivityNotFoundException -> 0x00bf }
        r7.b(r0, r3);	 Catch:{ ActivityNotFoundException -> 0x00bf }
        if (r2 == 0) goto L_0x00b4;
    L_0x0080:
        r3 = new com.whatsapp.ConversationsFragment$DeleteGroupDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r3.<init>();	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r3 = r7.a(r0, r3);	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r4 = r7.getFragmentManager();	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r5 = 0;
        r3.show(r4, r5);	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        if (r2 == 0) goto L_0x00b4;
    L_0x0093:
        r3 = r0.m();	 Catch:{ ActivityNotFoundException -> 0x00c3 }
        if (r3 == 0) goto L_0x00ac;
    L_0x0099:
        r3 = new com.whatsapp.ConversationsFragment$DeleteBroadcastListDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        r3.<init>();	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        r3 = r7.a(r0, r3);	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        r4 = r7.getFragmentManager();	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        r5 = 0;
        r3.show(r4, r5);	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        if (r2 == 0) goto L_0x00b4;
    L_0x00ac:
        r2 = new com.whatsapp.ConversationsFragment$DeleteContactDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x00c7 }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x00c7 }
        r7.b(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x00c7 }
    L_0x00b4:
        r0 = r1;
        goto L_0x0023;
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c7 }
    L_0x00c7:
        r0 = move-exception;
        throw r0;
    L_0x00c9:
        r0 = r8.getItemId();
        r3 = 2131755022; // 0x7f10000e float:1.9140912E38 double:1.0532269217E-314;
        if (r0 != r3) goto L_0x0122;
    L_0x00d2:
        r0 = com.whatsapp.App.as;
        r3 = r7.d;
        r0 = r0.b(r3);
        r0 = r0.s();
        r3 = new android.content.Intent;
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        r5 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r3.<init>(r4, r5);
        r4 = z;	 Catch:{ ActivityNotFoundException -> 0x011e }
        r5 = 13;
        r4 = r4[r5];	 Catch:{ ActivityNotFoundException -> 0x011e }
        r3.putExtra(r4, r0);	 Catch:{ ActivityNotFoundException -> 0x011e }
        r0 = r7.getActivity();	 Catch:{ ActivityNotFoundException -> 0x011e }
        r0 = r0.getPackageManager();	 Catch:{ ActivityNotFoundException -> 0x011e }
        r0 = r3.resolveActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x011e }
        r3.setComponent(r0);	 Catch:{ ActivityNotFoundException -> 0x011e }
        r0 = r3.getComponent();	 Catch:{ ActivityNotFoundException -> 0x011e }
        if (r0 == 0) goto L_0x010f;
    L_0x0108:
        r0 = 10;
        r7.startActivityForResult(r3, r0);	 Catch:{ ActivityNotFoundException -> 0x011e }
        if (r2 == 0) goto L_0x011b;
    L_0x010f:
        r0 = z;	 Catch:{ ActivityNotFoundException -> 0x0120 }
        r2 = 10;
        r0 = r0[r2];	 Catch:{ ActivityNotFoundException -> 0x0120 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x0120 }
        com.whatsapp.App.aa();	 Catch:{ ActivityNotFoundException -> 0x0120 }
    L_0x011b:
        r0 = r1;
        goto L_0x0023;
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0120 }
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r0 = r8.getItemId();
        r3 = 2131755023; // 0x7f10000f float:1.9140914E38 double:1.053226922E-314;
        if (r0 != r3) goto L_0x0179;
    L_0x012b:
        r0 = new android.content.Intent;
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r0.<init>(r2);
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r0.setType(r2);
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r3 = com.whatsapp.App.as;
        r4 = r7.d;
        r3 = r3.b(r4);
        r4 = r7.getActivity();
        r3 = r3.a(r4);
        r0.putExtra(r2, r3);
        r2 = z;
        r2 = r2[r6];
        r3 = 2;
        r0.putExtra(r2, r3);
        r2 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0.setFlags(r2);
        r2 = 11;
        r7.startActivityForResult(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x016d }
    L_0x016a:
        r0 = r1;
        goto L_0x0023;
    L_0x016d:
        r0 = move-exception;
        r0 = r7.getActivity();
        r2 = 2131230782; // 0x7f08003e float:1.8077626E38 double:1.0529679127E-314;
        com.whatsapp.App.a(r0, r2, r5);
        goto L_0x016a;
    L_0x0179:
        r0 = r8.getItemId();	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r3 = 2131755028; // 0x7f100014 float:1.9140924E38 double:1.0532269247E-314;
        if (r0 != r3) goto L_0x01c2;
    L_0x0182:
        r0 = com.whatsapp.App.aX;	 Catch:{ ActivityNotFoundException -> 0x01b6 }
        if (r0 != 0) goto L_0x018a;
    L_0x0186:
        r0 = com.whatsapp.App.E;	 Catch:{ ActivityNotFoundException -> 0x01b8 }
        if (r0 == 0) goto L_0x0198;
    L_0x018a:
        r0 = com.whatsapp.App.V();	 Catch:{ ActivityNotFoundException -> 0x01ba }
        if (r0 == 0) goto L_0x01bc;
    L_0x0190:
        r0 = 2131231516; // 0x7f08031c float:1.8079115E38 double:1.0529682754E-314;
    L_0x0193:
        r7.a(r0);	 Catch:{ ActivityNotFoundException -> 0x01c0 }
        if (r2 == 0) goto L_0x01b1;
    L_0x0198:
        r0 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x01c0 }
        r2 = r7.d;	 Catch:{ ActivityNotFoundException -> 0x01c0 }
        r0 = r0.b(r2);	 Catch:{ ActivityNotFoundException -> 0x01c0 }
        r2 = new com.whatsapp.ConversationsFragment$EmailConversationMediaChoiceDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x01c0 }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x01c0 }
        r0 = r7.a(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x01c0 }
        r2 = r7.getFragmentManager();	 Catch:{ ActivityNotFoundException -> 0x01c0 }
        r3 = 0;
        r0.show(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01c0 }
    L_0x01b1:
        r0 = r1;
        goto L_0x0023;
    L_0x01b4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01b6 }
    L_0x01b6:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01b8 }
    L_0x01b8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01ba }
    L_0x01ba:
        r0 = move-exception;
        throw r0;
    L_0x01bc:
        r0 = 2131231517; // 0x7f08031d float:1.8079117E38 double:1.052968276E-314;
        goto L_0x0193;
    L_0x01c0:
        r0 = move-exception;
        throw r0;
    L_0x01c2:
        r0 = r8.getItemId();	 Catch:{ ActivityNotFoundException -> 0x01de }
        r3 = 2131755024; // 0x7f100010 float:1.9140916E38 double:1.0532269227E-314;
        if (r0 != r3) goto L_0x01e0;
    L_0x01cb:
        r0 = com.whatsapp.fieldstats.k.CHAT_ARCHIVE;	 Catch:{ ActivityNotFoundException -> 0x01de }
        com.whatsapp.nf.a(r0);	 Catch:{ ActivityNotFoundException -> 0x01de }
        r0 = r8.getMenuInfo();	 Catch:{ ActivityNotFoundException -> 0x01de }
        r0 = (android.widget.AdapterView.AdapterContextMenuInfo) r0;	 Catch:{ ActivityNotFoundException -> 0x01de }
        r0 = r0.targetView;	 Catch:{ ActivityNotFoundException -> 0x01de }
        r7.b(r0);	 Catch:{ ActivityNotFoundException -> 0x01de }
        r0 = r1;
        goto L_0x0023;
    L_0x01de:
        r0 = move-exception;
        throw r0;
    L_0x01e0:
        r0 = r8.getItemId();	 Catch:{ ActivityNotFoundException -> 0x01f7 }
        r3 = 2131755032; // 0x7f100018 float:1.9140932E38 double:1.0532269267E-314;
        if (r0 != r3) goto L_0x01f9;
    L_0x01e9:
        r0 = r8.getMenuInfo();	 Catch:{ ActivityNotFoundException -> 0x01f7 }
        r0 = (android.widget.AdapterView.AdapterContextMenuInfo) r0;	 Catch:{ ActivityNotFoundException -> 0x01f7 }
        r0 = r0.targetView;	 Catch:{ ActivityNotFoundException -> 0x01f7 }
        r7.a(r0);	 Catch:{ ActivityNotFoundException -> 0x01f7 }
        r0 = r1;
        goto L_0x0023;
    L_0x01f7:
        r0 = move-exception;
        throw r0;
    L_0x01f9:
        r0 = r8.getItemId();	 Catch:{ ActivityNotFoundException -> 0x0212 }
        r3 = 2131755030; // 0x7f100016 float:1.9140928E38 double:1.0532269257E-314;
        if (r0 != r3) goto L_0x0214;
    L_0x0202:
        r0 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x0212 }
        r2 = r7.d;	 Catch:{ ActivityNotFoundException -> 0x0212 }
        r0 = r0.b(r2);	 Catch:{ ActivityNotFoundException -> 0x0212 }
        r2 = 0;
        r3 = 1;
        com.whatsapp.App.a(r0, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0212 }
        r0 = r1;
        goto L_0x0023;
    L_0x0212:
        r0 = move-exception;
        throw r0;
    L_0x0214:
        r0 = r8.getItemId();	 Catch:{ ActivityNotFoundException -> 0x022c }
        r3 = 2131755031; // 0x7f100017 float:1.914093E38 double:1.053226926E-314;
        if (r0 != r3) goto L_0x022e;
    L_0x021d:
        r0 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x022c }
        r2 = r7.d;	 Catch:{ ActivityNotFoundException -> 0x022c }
        r0 = r0.b(r2);	 Catch:{ ActivityNotFoundException -> 0x022c }
        r2 = 1;
        com.whatsapp.App.b(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x022c }
        r0 = r1;
        goto L_0x0023;
    L_0x022c:
        r0 = move-exception;
        throw r0;
    L_0x022e:
        r0 = r8.getItemId();	 Catch:{ ActivityNotFoundException -> 0x0247 }
        r3 = 2131755026; // 0x7f100012 float:1.914092E38 double:1.0532269237E-314;
        if (r0 != r3) goto L_0x0249;
    L_0x0237:
        r0 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x0247 }
        r2 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x0247 }
        r3 = r7.d;	 Catch:{ ActivityNotFoundException -> 0x0247 }
        r2 = r2.b(r3);	 Catch:{ ActivityNotFoundException -> 0x0247 }
        r0.f(r2);	 Catch:{ ActivityNotFoundException -> 0x0247 }
        r0 = r1;
        goto L_0x0023;
    L_0x0247:
        r0 = move-exception;
        throw r0;
    L_0x0249:
        r0 = r8.getItemId();
        r3 = 2131755029; // 0x7f100015 float:1.9140926E38 double:1.053226925E-314;
        if (r0 != r3) goto L_0x0277;
    L_0x0252:
        r0 = com.whatsapp.App.as;
        r3 = r7.d;
        r0 = r0.b(r3);
        r3 = r0.m();	 Catch:{ ActivityNotFoundException -> 0x0273 }
        if (r3 == 0) goto L_0x0269;
    L_0x0260:
        r3 = r7.getActivity();	 Catch:{ ActivityNotFoundException -> 0x0275 }
        com.whatsapp.ListChatInfo.a(r0, r3);	 Catch:{ ActivityNotFoundException -> 0x0275 }
        if (r2 == 0) goto L_0x0270;
    L_0x0269:
        r2 = r7.getActivity();	 Catch:{ ActivityNotFoundException -> 0x0275 }
        com.whatsapp.GroupChatInfo.a(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x0275 }
    L_0x0270:
        r0 = r1;
        goto L_0x0023;
    L_0x0273:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0275 }
    L_0x0275:
        r0 = move-exception;
        throw r0;
    L_0x0277:
        r0 = super.onContextItemSelected(r8);
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.onContextItemSelected(android.view.MenuItem):boolean");
    }

    static h2 d(ConversationsFragment conversationsFragment) {
        return conversationsFragment.e;
    }

    static ga a(ConversationsFragment conversationsFragment, ga gaVar) {
        conversationsFragment.n = gaVar;
        return gaVar;
    }

    static DialogFragment a(ConversationsFragment conversationsFragment, l5 l5Var, DialogFragment dialogFragment) {
        return conversationsFragment.a(l5Var, dialogFragment);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(z[34], this.d);
    }

    public void a(CharSequence charSequence) {
        this.r.getFilter().filter(charSequence);
    }

    public void onDestroy() {
        try {
            Log.i(z[28]);
            super.onDestroy();
            App.a((tm) this);
            App.a((a_) this);
            this.p.a();
            if (this.i == null) {
                return;
            }
            if (this.n != null) {
                this.i.a(this.n);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public void a(String str, boolean z) {
        getActivity().runOnUiThread(new xa(this, str, z));
    }

    static String q(ConversationsFragment conversationsFragment) {
        return conversationsFragment.d;
    }

    public void onStop() {
        super.onStop();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r9 = this;
        r6 = 0;
        r8 = 8;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.getView();
        if (r0 == 0) goto L_0x008d;
    L_0x000b:
        r2 = com.whatsapp.App.as;
        r2 = r2.d();
        r3 = 2131755571; // 0x7f100233 float:1.9142025E38 double:1.053227193E-314;
        r3 = r0.findViewById(r3);
        r4 = 2131755569; // 0x7f100231 float:1.914202E38 double:1.053227192E-314;
        r4 = r0.findViewById(r4);
        r5 = 2131755572; // 0x7f100234 float:1.9142027E38 double:1.0532271935E-314;
        r5 = r0.findViewById(r5);
        if (r2 <= 0) goto L_0x0062;
    L_0x0028:
        r4.setVisibility(r6);
        r2 = r9.u;
        r2.setEmptyView(r4);
        r3.setVisibility(r8);
        r5.setVisibility(r8);
        r2 = 2131755570; // 0x7f100232 float:1.9142023E38 double:1.0532271925E-314;
        r0 = r0.findViewById(r2);
        r0 = (android.widget.TextView) r0;
        r2 = r9.getResources();	 Catch:{ ActivityNotFoundException -> 0x008e }
        r6 = 2131232289; // 0x7f080621 float:1.8080683E38 double:1.0529686573E-314;
        r2 = r2.getString(r6);	 Catch:{ ActivityNotFoundException -> 0x008e }
        r6 = r9.getResources();	 Catch:{ ActivityNotFoundException -> 0x008e }
        r7 = 2130839537; // 0x7f0207f1 float:1.7284087E38 double:1.052774612E-314;
        r6 = r6.getDrawable(r7);	 Catch:{ ActivityNotFoundException -> 0x008e }
        r7 = r0.getPaint();	 Catch:{ ActivityNotFoundException -> 0x008e }
        r2 = com.whatsapp.util.ah.a(r2, r6, r7);	 Catch:{ ActivityNotFoundException -> 0x008e }
        r0.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x008e }
        if (r1 == 0) goto L_0x008d;
    L_0x0062:
        r0 = r9.getContext();	 Catch:{ ActivityNotFoundException -> 0x0090 }
        r0 = com.whatsapp.App.v(r0);	 Catch:{ ActivityNotFoundException -> 0x0090 }
        if (r0 == 0) goto L_0x007c;
    L_0x006c:
        r0 = 8;
        r5.setVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x0092 }
        r0 = 0;
        r3.setVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x0092 }
        r0 = r9.u;	 Catch:{ ActivityNotFoundException -> 0x0092 }
        r0.setEmptyView(r3);	 Catch:{ ActivityNotFoundException -> 0x0092 }
        if (r1 == 0) goto L_0x008a;
    L_0x007c:
        r0 = 0;
        r5.setVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x0092 }
        r0 = 8;
        r3.setVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x0092 }
        r0 = r9.u;	 Catch:{ ActivityNotFoundException -> 0x0092 }
        r0.setEmptyView(r5);	 Catch:{ ActivityNotFoundException -> 0x0092 }
    L_0x008a:
        r4.setVisibility(r8);
    L_0x008d:
        return;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.i():void");
    }

    static a2_ a(ConversationsFragment conversationsFragment) {
        return conversationsFragment.p;
    }

    public void m446a() {
        try {
            d();
            if (this.r != null) {
                if (this.r.getCount() == 0) {
                    i();
                }
            }
            ((_5) this.r.getFilter()).b();
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static void f(ConversationsFragment conversationsFragment) {
        conversationsFragment.d();
    }

    static g7 j(ConversationsFragment conversationsFragment) {
        return conversationsFragment.r;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void e() {
        /*
        r9 = this;
        r8 = 3;
        r1 = 8;
        r0 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = com.whatsapp.qa.f();	 Catch:{ ActivityNotFoundException -> 0x00e3 }
        r9.h = r3;	 Catch:{ ActivityNotFoundException -> 0x00e3 }
        r3 = r9.h;	 Catch:{ ActivityNotFoundException -> 0x00e3 }
        if (r3 <= 0) goto L_0x0037;
    L_0x0010:
        r3 = r9.t;	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        r4 = 2131230821; // 0x7f080065 float:1.8077706E38 double:1.052967932E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        r6 = 0;
        r7 = r9.h;	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        r5[r6] = r7;	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        r4 = r9.getString(r4, r5);	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        r3.setText(r4);	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        r3 = r9.t;	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        r4 = 0;
        r3.setVisibility(r4);	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        r3 = r9.b;	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        r4 = 8;
        r3.setVisibility(r4);	 Catch:{ ActivityNotFoundException -> 0x00e5 }
        if (r2 == 0) goto L_0x0049;
    L_0x0037:
        r3 = r9.t;	 Catch:{ ActivityNotFoundException -> 0x00e7 }
        r4 = 8;
        r3.setVisibility(r4);	 Catch:{ ActivityNotFoundException -> 0x00e7 }
        r3 = r9.b;	 Catch:{ ActivityNotFoundException -> 0x00e7 }
        r4 = j();	 Catch:{ ActivityNotFoundException -> 0x00e7 }
        if (r4 >= r8) goto L_0x00e9;
    L_0x0046:
        r3.setVisibility(r0);
    L_0x0049:
        r0 = com.whatsapp.qa.c();	 Catch:{ ActivityNotFoundException -> 0x00ec }
        if (r0 != 0) goto L_0x00b1;
    L_0x004f:
        r0 = com.whatsapp.qa.e();	 Catch:{ ActivityNotFoundException -> 0x00ee }
        r1 = 2;
        if (r0 <= r1) goto L_0x00b1;
    L_0x0056:
        r0 = com.whatsapp.App.z();	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        r3 = 21;
        r1 = r1[r3];	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        r3 = 0;
        r0 = r0.getSharedPreferences(r1, r3);	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        r3 = 18;
        r1 = r1[r3];	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        r3 = 0;
        r0 = r0.getInt(r1, r3);	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        if (r0 >= r8) goto L_0x00b1;
    L_0x0072:
        r0 = com.whatsapp.App.z();	 Catch:{ ActivityNotFoundException -> 0x00f2 }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x00f2 }
        r3 = 19;
        r1 = r1[r3];	 Catch:{ ActivityNotFoundException -> 0x00f2 }
        r3 = 0;
        r0 = r0.getSharedPreferences(r1, r3);	 Catch:{ ActivityNotFoundException -> 0x00f2 }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x00f2 }
        r3 = 22;
        r1 = r1[r3];	 Catch:{ ActivityNotFoundException -> 0x00f2 }
        r4 = 0;
        r0 = r0.getLong(r1, r4);	 Catch:{ ActivityNotFoundException -> 0x00f2 }
        r4 = 2592000000; // 0x9a7ec800 float:-5.2687528E-23 double:1.280618154E-314;
        r0 = r0 + r4;
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ ActivityNotFoundException -> 0x00f2 }
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x00b1;
    L_0x009b:
        r0 = r9.f;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        r0 = com.whatsapp.App.z();	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        r1 = com.whatsapp.fieldstats.bn.IS_GROUP_CREATE_BANNER_SHOWN;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        r3 = 1;
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        com.whatsapp.fieldstats.i.a(r0, r1, r3);	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        if (r2 == 0) goto L_0x00e2;
    L_0x00b1:
        r0 = r9.f;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r0 = com.whatsapp.App.z();	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r2 = 20;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r2 = 0;
        r0 = r0.getSharedPreferences(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r2 = 0;
        r0 = r0.getInt(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        if (r0 <= 0) goto L_0x00e2;
    L_0x00d4:
        r0 = com.whatsapp.App.z();	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r1 = com.whatsapp.fieldstats.bn.IS_GROUP_CREATE_BANNER_SHOWN;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r2 = 1;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        com.whatsapp.fieldstats.i.a(r0, r1, r2);	 Catch:{ ActivityNotFoundException -> 0x00f6 }
    L_0x00e2:
        return;
    L_0x00e3:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = r1;
        goto L_0x0046;
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f2 }
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.e():void");
    }

    private void c() {
        startActivityForResult(new Intent(getActivity(), ContactPicker.class), 1);
    }

    public void a(Collection collection) {
    }

    public ConversationsFragment() {
        this.p = new a2_();
        this.e = null;
        this.q = new bm(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
        r2 = this;
        r0 = r2.r;	 Catch:{ ActivityNotFoundException -> 0x003d }
        if (r0 == 0) goto L_0x003c;
    L_0x0004:
        r0 = r2.r;	 Catch:{ ActivityNotFoundException -> 0x003f }
        r0 = com.whatsapp.g7.a(r0);	 Catch:{ ActivityNotFoundException -> 0x003f }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ ActivityNotFoundException -> 0x003f }
        if (r0 == 0) goto L_0x001a;
    L_0x0010:
        r0 = r2.a();	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r2.g = r0;	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ ActivityNotFoundException -> 0x0041 }
        if (r0 == 0) goto L_0x0029;
    L_0x001a:
        r0 = r2.r;	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r0 = r0.getFilter();	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r1 = r2.r;	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r1 = com.whatsapp.g7.a(r1);	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r0.filter(r1);	 Catch:{ ActivityNotFoundException -> 0x0041 }
    L_0x0029:
        r2.e();	 Catch:{ ActivityNotFoundException -> 0x0043 }
        r0 = r2.r;	 Catch:{ ActivityNotFoundException -> 0x0043 }
        r0.notifyDataSetChanged();	 Catch:{ ActivityNotFoundException -> 0x0043 }
        r0 = r2.r;	 Catch:{ ActivityNotFoundException -> 0x0043 }
        r0 = r0.getCount();	 Catch:{ ActivityNotFoundException -> 0x0043 }
        if (r0 != 0) goto L_0x003c;
    L_0x0039:
        r2.i();	 Catch:{ ActivityNotFoundException -> 0x0043 }
    L_0x003c:
        return;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.b():void");
    }

    private DialogFragment a(l5 l5Var, DialogFragment dialogFragment) {
        Bundle bundle = new Bundle();
        bundle.putString(z[1], l5Var.p);
        dialogFragment.setArguments(bundle);
        return dialogFragment;
    }

    public void onResume() {
        Log.i(z[24]);
        super.onResume();
        d.a();
        App.g.stop();
        f();
        i();
    }

    static View a(ConversationsFragment conversationsFragment, View view) {
        conversationsFragment.o = view;
        return view;
    }

    private static void b(int i) {
        Editor edit = App.z().getSharedPreferences(z[15], 0).edit();
        try {
            edit.putInt(z[17], i);
            if (!edit.commit()) {
                Log.e(z[16]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void o(ConversationsFragment conversationsFragment) {
        conversationsFragment.i();
    }
}
