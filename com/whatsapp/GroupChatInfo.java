package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract.Contacts;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.fieldstats.cd;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class GroupChatInfo extends ChatInfoActivity implements tm, a_ {
    private static GroupChatInfo R;
    private static final String[] Z;
    private View A;
    private View B;
    private a2_ C;
    private final akc D;
    private OnCheckedChangeListener E;
    private ImageView F;
    private View G;
    private TextView H;
    private ArrayList I;
    private TextView J;
    private l5 K;
    private HashMap L;
    private String M;
    private AsyncTask N;
    private ImageButton O;
    private final Handler P;
    private TextView Q;
    private ChatInfoLayout S;
    private OnCheckedChangeListener T;
    private View U;
    private at7 V;
    private TextView W;
    private l5 X;
    private ce Y;
    private View v;
    private akk w;
    private uy x;
    private LinearLayout y;
    private ListView z;

    public class ExitGroupDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[4];
            String str = "C4mOqB\u0005}EjX.";
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
                            i3 = 54;
                            break;
                        case at.g /*1*/:
                            i3 = 90;
                            break;
                        case at.i /*2*/:
                            i3 = 30;
                            break;
                        case at.o /*3*/:
                            i3 = 42;
                            break;
                        default:
                            i3 = 31;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\\3z";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "C4mOqB\u0005}EjX.";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\\3z";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            String string;
            l5 b = App.as.b(getArguments().getString(z[2]));
            int i = getArguments().getInt(z[3]);
            if (i == 0) {
                string = getString(2131231138, new Object[]{b.a(getActivity())});
            } else {
                string = App.az.a(2131296274, i, new Object[]{b.a(getActivity()), Integer.valueOf(i)});
            }
            return new Builder(getActivity()).setMessage(a28.b(string, getActivity().getBaseContext())).setCancelable(true).setNegativeButton(2131230884, new awt(this)).setPositiveButton(2131231136, new ed(this)).create();
        }

        @NonNull
        public static ExitGroupDialogFragment a(@NonNull String str, int i) {
            ExitGroupDialogFragment exitGroupDialogFragment = new ExitGroupDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[1], str);
            bundle.putInt(z[0], i);
            exitGroupDialogFragment.setArguments(bundle);
            return exitGroupDialogFragment;
        }
    }

    static {
        String[] strArr = new String[29];
        String str = "rL8&gvV6'~{X8|vqZw6o|M#:yr\u001e4<ya_4'-5_4'~cW#*7{Q#sqzK97;5N%<ut\\;*7a_5?ra";
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
                        i3 = 21;
                        break;
                    case at.g /*1*/:
                        i3 = 62;
                        break;
                    case at.i /*2*/:
                        i3 = 87;
                        break;
                    case at.o /*3*/:
                        i3 = 83;
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
                    str = "f[;6ta[3\f}|Z";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "eV8=r";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "cP3}v{Z%<~q\u00104&efQ%}~a[:|tzP#2ta";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "eV8=rJJ.#r";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "tP3!x|Zy:ya[9'9t]#:x{\u0010\u001e\u001dDPl\u0003\fXGa\u0012\u0017^A";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "rW3";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "rL8&gJW95x:Z2 cgQ.";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u007fW3";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "vW%0by_%\fcg_9 ~aW8=";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "rW3";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "pP3\fpgQ\"#H\u007fW3";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "pF>'HrL8&gJT>7";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "tP3!x|Zy:ya[9'9t]#:x{\u0010\u001e\u001dDPl\u0003";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "rL8&g5W95x:]8=cpF#sdlM#6z5]8=ct]#s{|M#stzK;77{Q#sqzK97";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "eV8=r";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "rL8&gJW95x:]?2yr[w bwT20c/";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "UMy$\u007ftJ$2ge\u001096c";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "|M\b!rf[#";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "rL8&gJW95x:L2 byJx ||Nx0x{J60c5P8'7tZ36s5";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    str = "rL8&gJW95x:L2 byJx0x{J60c5P8'7tZ36s5";
                    obj = 20;
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    strArr2 = strArr3;
                    str = "vQ9'vvJ";
                    obj = 21;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    str = "rW3";
                    obj = 22;
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    strArr2 = strArr3;
                    str = "|P#6et]#:ap";
                    obj = 23;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "vW%0by_%\fcg_9 ~aW8=";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "rL8&gJW95x:]%6va[";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "RL8&gVV6'^{X8\u001ay|J";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "f[;6ta[3\f}|Z";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    Z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "rL8&gvV6'~{X8|tg[6'~zPz'~x[x6egQ%s";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public GroupChatInfo() {
        this.I = new ArrayList();
        this.L = new HashMap();
        this.C = new a2_();
        this.V = new cf(this);
        this.E = new a99(this);
        this.T = new e5(this);
        this.P = new Handler(new pn(this));
        this.D = new akg(this);
    }

    private void p() {
        String s = this.K.s();
        Intent intent = new Intent(Z[14], Contacts.CONTENT_URI);
        try {
            intent.putExtra(Z[16], s);
            intent.setComponent(intent.resolveActivity(getPackageManager()));
            if (intent.getComponent() != null) {
                startActivityForResult(intent, 10);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            Log.i(Z[15]);
            App.aa();
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o() {
        /*
        r8 = this;
        r2 = 8;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.as;
        r4 = r8.M;
        r0 = r0.b(r4);
        r8.X = r0;
        r8.v();
        r8.y();
        r8.r();
        r0 = r8.I;
        r0.clear();
        r0 = r8.I;
        r4 = r8.M;
        r8.a(r0, r4);
        r0 = r8.v;
        r0.setVisibility(r2);
        r0 = r8.O;
        r0.setVisibility(r1);
        r0 = r8.H;
        r4 = 2131231591; // 0x7f080367 float:1.8079267E38 double:1.0529683124E-314;
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = r8.I;
        r6 = r6.size();
        r7 = com.whatsapp.a59.c;
        r6 = java.lang.Math.min(r6, r7);
        r6 = java.lang.Integer.valueOf(r6);
        r5[r1] = r6;
        r6 = 1;
        r7 = com.whatsapp.a59.c;
        r7 = java.lang.Integer.valueOf(r7);
        r5[r6] = r7;
        r4 = r8.getString(r4, r5);
        r0.setText(r4);
        r0 = r8.M;
        r0 = com.whatsapp.qm.h(r0);
        r4 = r8.M;
        r4 = com.whatsapp.qm.d(r4);
        r5 = com.whatsapp.App.B();	 Catch:{ NumberFormatException -> 0x017c }
        if (r5 == 0) goto L_0x0087;
    L_0x006a:
        if (r0 == 0) goto L_0x0087;
    L_0x006c:
        r5 = 2131755193; // 0x7f1000b9 float:1.9141258E38 double:1.053227006E-314;
        r5 = r8.findViewById(r5);	 Catch:{ NumberFormatException -> 0x0180 }
        r6 = 0;
        r5.setVisibility(r6);	 Catch:{ NumberFormatException -> 0x0180 }
        r5 = 2131755192; // 0x7f1000b8 float:1.9141256E38 double:1.0532270057E-314;
        r5 = r8.findViewById(r5);	 Catch:{ NumberFormatException -> 0x0180 }
        r6 = 0;
        r5.setVisibility(r6);	 Catch:{ NumberFormatException -> 0x0180 }
        r8.j();	 Catch:{ NumberFormatException -> 0x0180 }
        if (r3 == 0) goto L_0x009f;
    L_0x0087:
        r5 = 2131755193; // 0x7f1000b9 float:1.9141258E38 double:1.053227006E-314;
        r5 = r8.findViewById(r5);	 Catch:{ NumberFormatException -> 0x0180 }
        r6 = 8;
        r5.setVisibility(r6);	 Catch:{ NumberFormatException -> 0x0180 }
        r5 = 2131755192; // 0x7f1000b8 float:1.9141256E38 double:1.0532270057E-314;
        r5 = r8.findViewById(r5);	 Catch:{ NumberFormatException -> 0x0180 }
        r6 = 8;
        r5.setVisibility(r6);	 Catch:{ NumberFormatException -> 0x0180 }
    L_0x009f:
        r5 = r8.M;	 Catch:{ NumberFormatException -> 0x0182 }
        r5 = com.whatsapp.qm.c(r5);	 Catch:{ NumberFormatException -> 0x0182 }
        r5 = r5.b();	 Catch:{ NumberFormatException -> 0x0182 }
        if (r5 <= 0) goto L_0x00c3;
    L_0x00ab:
        r5 = 2131755684; // 0x7f1002a4 float:1.9142254E38 double:1.053227249E-314;
        r5 = r8.findViewById(r5);	 Catch:{ NumberFormatException -> 0x0184 }
        r6 = 0;
        r5.setVisibility(r6);	 Catch:{ NumberFormatException -> 0x0184 }
        r5 = 2131755680; // 0x7f1002a0 float:1.9142246E38 double:1.053227247E-314;
        r5 = r8.findViewById(r5);	 Catch:{ NumberFormatException -> 0x0184 }
        r6 = 0;
        r5.setVisibility(r6);	 Catch:{ NumberFormatException -> 0x0184 }
        if (r3 == 0) goto L_0x00db;
    L_0x00c3:
        r5 = 2131755684; // 0x7f1002a4 float:1.9142254E38 double:1.053227249E-314;
        r5 = r8.findViewById(r5);	 Catch:{ NumberFormatException -> 0x0184 }
        r6 = 8;
        r5.setVisibility(r6);	 Catch:{ NumberFormatException -> 0x0184 }
        r5 = 2131755680; // 0x7f1002a0 float:1.9142246E38 double:1.053227247E-314;
        r5 = r8.findViewById(r5);	 Catch:{ NumberFormatException -> 0x0184 }
        r6 = 8;
        r5.setVisibility(r6);	 Catch:{ NumberFormatException -> 0x0184 }
    L_0x00db:
        if (r0 == 0) goto L_0x0114;
    L_0x00dd:
        r0 = 2131755683; // 0x7f1002a3 float:1.9142252E38 double:1.0532272483E-314;
        r0 = r8.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0186 }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x0186 }
        r5 = 2131231137; // 0x7f0801a1 float:1.8078347E38 double:1.052968088E-314;
        r0.setText(r5);	 Catch:{ NumberFormatException -> 0x0186 }
        r0 = 2131755682; // 0x7f1002a2 float:1.914225E38 double:1.053227248E-314;
        r0 = r8.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0186 }
        r0 = (android.widget.ImageView) r0;	 Catch:{ NumberFormatException -> 0x0186 }
        r5 = 2130839488; // 0x7f0207c0 float:1.7283988E38 double:1.052774588E-314;
        r0.setImageResource(r5);	 Catch:{ NumberFormatException -> 0x0186 }
        r0 = 2131755501; // 0x7f1001ed float:1.9141883E38 double:1.0532271584E-314;
        r0 = r8.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0186 }
        r5 = 8;
        r0.setVisibility(r5);	 Catch:{ NumberFormatException -> 0x0186 }
        r0 = 2131755181; // 0x7f1000ad float:1.9141234E38 double:1.0532270003E-314;
        r0 = r8.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0186 }
        r5 = 0;
        r0.setVisibility(r5);	 Catch:{ NumberFormatException -> 0x0186 }
        if (r3 == 0) goto L_0x0149;
    L_0x0114:
        r0 = 2131755683; // 0x7f1002a3 float:1.9142252E38 double:1.0532272483E-314;
        r0 = r8.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0186 }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x0186 }
        r3 = 2131231055; // 0x7f08014f float:1.807818E38 double:1.0529680476E-314;
        r0.setText(r3);	 Catch:{ NumberFormatException -> 0x0186 }
        r0 = 2131755682; // 0x7f1002a2 float:1.914225E38 double:1.053227248E-314;
        r0 = r8.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0186 }
        r0 = (android.widget.ImageView) r0;	 Catch:{ NumberFormatException -> 0x0186 }
        r3 = 2130839433; // 0x7f020789 float:1.7283876E38 double:1.0527745606E-314;
        r0.setImageResource(r3);	 Catch:{ NumberFormatException -> 0x0186 }
        r0 = 2131755501; // 0x7f1001ed float:1.9141883E38 double:1.0532271584E-314;
        r0 = r8.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0186 }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ NumberFormatException -> 0x0186 }
        r0 = 2131755181; // 0x7f1000ad float:1.9141234E38 double:1.0532270003E-314;
        r0 = r8.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0186 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ NumberFormatException -> 0x0186 }
    L_0x0149:
        r3 = r8.S;	 Catch:{ NumberFormatException -> 0x0188 }
        r0 = r8.getResources();	 Catch:{ NumberFormatException -> 0x0188 }
        r5 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r5 = r0.getDimensionPixelSize(r5);	 Catch:{ NumberFormatException -> 0x0188 }
        if (r4 == 0) goto L_0x018a;
    L_0x0158:
        r0 = r8.getResources();	 Catch:{ NumberFormatException -> 0x0188 }
        r6 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r0 = r0.getDimensionPixelSize(r6);	 Catch:{ NumberFormatException -> 0x0188 }
    L_0x0163:
        r3.setCollapsedPadding(r5, r0);	 Catch:{ NumberFormatException -> 0x018c }
        r0 = 2131755687; // 0x7f1002a7 float:1.914226E38 double:1.0532272503E-314;
        r3 = r8.findViewById(r0);	 Catch:{ NumberFormatException -> 0x018c }
        if (r4 == 0) goto L_0x018e;
    L_0x016f:
        r0 = r1;
    L_0x0170:
        r3.setVisibility(r0);
        r8.invalidateOptionsMenu();
        r0 = r8.x;
        r0.notifyDataSetChanged();
        return;
    L_0x017c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x017e }
    L_0x017e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0180 }
    L_0x0180:
        r0 = move-exception;
        throw r0;
    L_0x0182:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0184 }
    L_0x0184:
        r0 = move-exception;
        throw r0;
    L_0x0186:
        r0 = move-exception;
        throw r0;
    L_0x0188:
        r0 = move-exception;
        throw r0;
    L_0x018a:
        r0 = r1;
        goto L_0x0163;
    L_0x018c:
        r0 = move-exception;
        throw r0;
    L_0x018e:
        r0 = r2;
        goto L_0x0170;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.o():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l() {
        /*
        r4 = this;
        r0 = com.whatsapp.a3b.a(r4);
        r1 = r4.M;
        r2 = r0.b(r1);
        r0 = 2131755183; // 0x7f1000af float:1.9141238E38 double:1.0532270013E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755184; // 0x7f1000b0 float:1.914124E38 double:1.053227002E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.support.v7.widget.SwitchCompat) r1;
        r3 = 0;
        r1.setOnCheckedChangeListener(r3);	 Catch:{ NumberFormatException -> 0x004c }
        r3 = r2.f();	 Catch:{ NumberFormatException -> 0x004c }
        if (r3 == 0) goto L_0x003d;
    L_0x0026:
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ NumberFormatException -> 0x004e }
        r2 = r2.h();	 Catch:{ NumberFormatException -> 0x004e }
        r2 = com.whatsapp.util.cs.d(r4, r2);	 Catch:{ NumberFormatException -> 0x004e }
        r0.setText(r2);	 Catch:{ NumberFormatException -> 0x004e }
        r2 = 1;
        r1.setChecked(r2);	 Catch:{ NumberFormatException -> 0x004e }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x004e }
        if (r2 == 0) goto L_0x0046;
    L_0x003d:
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x004e }
        r0 = 0;
        r1.setChecked(r0);	 Catch:{ NumberFormatException -> 0x004e }
    L_0x0046:
        r0 = r4.T;
        r1.setOnCheckedChangeListener(r0);
        return;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.l():void");
    }

    static LinearLayout o(GroupChatInfo groupChatInfo) {
        return groupChatInfo.y;
    }

    static uy c(GroupChatInfo groupChatInfo) {
        return groupChatInfo.x;
    }

    static ImageButton n(GroupChatInfo groupChatInfo) {
        return groupChatInfo.O;
    }

    private void x() {
        try {
            if (App.Q()) {
                a(2131231590, 2131231813);
                App.e(new a3t(this, this.M, null, null, 16));
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            App.a(getBaseContext(), 2131231140, 0);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static TextView i(GroupChatInfo groupChatInfo) {
        return groupChatInfo.W;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        this.K = ((an_) ((AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag()).d;
        c(menuItem.getItemId());
        return true;
    }

    public void a(String str, boolean z) {
    }

    static View l(GroupChatInfo groupChatInfo) {
        return groupChatInfo.G;
    }

    private void n() {
        try {
            if (!isFinishing()) {
                this.z.postDelayed(new aj(this), 300);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static ArrayList e(GroupChatInfo groupChatInfo) {
        return groupChatInfo.I;
    }

    static ce j(GroupChatInfo groupChatInfo) {
        return groupChatInfo.Y;
    }

    static void A(GroupChatInfo groupChatInfo) {
        groupChatInfo.q();
    }

    public static void a(l5 l5Var, Activity activity) {
        a(l5Var, activity, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v() {
        /*
        r10 = this;
        r4 = 1;
        r9 = 0;
        r0 = r10.S;
        r1 = r10.X;
        r1 = r1.a(r10);
        r0.setTitleText(r1);
        r0 = 0;
        r1 = r10.X;	 Catch:{ NumberFormatException -> 0x0092 }
        r1 = r1.j;	 Catch:{ NumberFormatException -> 0x0092 }
        r2 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x0092 }
        r2 = com.whatsapp.App.b(r2);	 Catch:{ NumberFormatException -> 0x0092 }
        r0 = com.whatsapp.util.cs.i(r10, r2);	 Catch:{ NumberFormatException -> 0x0092 }
    L_0x001e:
        r1 = r10.X;
        r2 = r1.a();
        r1 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x00ad }
        r1 = r1.d(r2);	 Catch:{ NumberFormatException -> 0x00ad }
        if (r1 == 0) goto L_0x0052;
    L_0x002c:
        r3 = r10.Q;	 Catch:{ NumberFormatException -> 0x00af }
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00af }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x00af }
        r4 = 2131231286; // 0x7f080236 float:1.8078649E38 double:1.052968162E-314;
        r4 = r10.getString(r4);	 Catch:{ NumberFormatException -> 0x00af }
        r4 = r1.append(r4);	 Catch:{ NumberFormatException -> 0x00af }
        if (r0 != 0) goto L_0x00b1;
    L_0x0040:
        r1 = "";
    L_0x0043:
        r1 = r4.append(r1);	 Catch:{ NumberFormatException -> 0x00d7 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x00d7 }
        r3.setText(r1);	 Catch:{ NumberFormatException -> 0x00d7 }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x00d7 }
        if (r1 == 0) goto L_0x008c;
    L_0x0052:
        r1 = r10.Q;	 Catch:{ NumberFormatException -> 0x00d9 }
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00d9 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x00d9 }
        r4 = android.support.v4.text.BidiFormatter.getInstance();	 Catch:{ NumberFormatException -> 0x00d9 }
        r5 = 2131231285; // 0x7f080235 float:1.8078647E38 double:1.0529681613E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x00d9 }
        r7 = 0;
        r8 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x00d9 }
        r2 = r8.b(r2);	 Catch:{ NumberFormatException -> 0x00d9 }
        r2 = r2.a(r10);	 Catch:{ NumberFormatException -> 0x00d9 }
        r6[r7] = r2;	 Catch:{ NumberFormatException -> 0x00d9 }
        r2 = r10.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x00d9 }
        r2 = r4.unicodeWrap(r2);	 Catch:{ NumberFormatException -> 0x00d9 }
        r2 = r3.append(r2);	 Catch:{ NumberFormatException -> 0x00d9 }
        if (r0 != 0) goto L_0x00db;
    L_0x007e:
        r0 = "";
    L_0x0081:
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.setText(r0);
    L_0x008c:
        r0 = r10.Q;
        r0.setVisibility(r9);
        return;
    L_0x0092:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = Z;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x001e;
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r5 = com.whatsapp.aam.b();
        r1 = r1.append(r5);
        r5 = " ";
        r1 = r1.append(r5);
        r5 = android.support.v4.text.BidiFormatter.getInstance();
        r5 = r5.unicodeWrap(r0);
        r1 = r1.append(r5);
        r1 = r1.toString();
        goto L_0x0043;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00d9 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = com.whatsapp.aam.b();
        r3 = r3.append(r4);
        r4 = " ";
        r3 = r3.append(r4);
        r4 = android.support.v4.text.BidiFormatter.getInstance();
        r0 = r4.unicodeWrap(r0);
        r0 = r3.append(r0);
        r0 = r0.toString();
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.v():void");
    }

    private void q() {
        try {
            if (App.aO()) {
                r.a(this.X, this, 12);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            RequestPermissionActivity.a(this, 2131231658, 2131231657);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static void k(GroupChatInfo groupChatInfo) {
        groupChatInfo.n();
    }

    static View u(GroupChatInfo groupChatInfo) {
        return groupChatInfo.v;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r() {
        /*
        r6 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.aZ();
        if (r0 == 0) goto L_0x0079;
    L_0x0008:
        r0 = 2131755199; // 0x7f1000bf float:1.914127E38 double:1.053227009E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755200; // 0x7f1000c0 float:1.9141273E38 double:1.0532270097E-314;
        r1 = r6.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x0092 }
        r4 = r6.M;	 Catch:{ NumberFormatException -> 0x0092 }
        r5 = com.whatsapp.it.ALLOW;	 Catch:{ NumberFormatException -> 0x0092 }
        r3 = r3.a(r4, r5);	 Catch:{ NumberFormatException -> 0x0092 }
        if (r3 == 0) goto L_0x003d;
    L_0x0026:
        r3 = 2131231319; // 0x7f080257 float:1.8078716E38 double:1.052968178E-314;
        r0.setText(r3);	 Catch:{ NumberFormatException -> 0x0094 }
        r3 = new com.whatsapp.util.bz;	 Catch:{ NumberFormatException -> 0x0094 }
        r4 = 2130839485; // 0x7f0207bd float:1.7283982E38 double:1.0527745863E-314;
        r4 = android.support.v4.content.ContextCompat.getDrawable(r6, r4);	 Catch:{ NumberFormatException -> 0x0094 }
        r3.<init>(r4);	 Catch:{ NumberFormatException -> 0x0094 }
        r1.setImageDrawable(r3);	 Catch:{ NumberFormatException -> 0x0094 }
        if (r2 == 0) goto L_0x0052;
    L_0x003d:
        r3 = 2131231321; // 0x7f080259 float:1.807872E38 double:1.052968179E-314;
        r0.setText(r3);	 Catch:{ NumberFormatException -> 0x0094 }
        r0 = new com.whatsapp.util.bz;	 Catch:{ NumberFormatException -> 0x0094 }
        r3 = 2130839484; // 0x7f0207bc float:1.728398E38 double:1.052774586E-314;
        r3 = android.support.v4.content.ContextCompat.getDrawable(r6, r3);	 Catch:{ NumberFormatException -> 0x0094 }
        r0.<init>(r3);	 Catch:{ NumberFormatException -> 0x0094 }
        r1.setImageDrawable(r0);	 Catch:{ NumberFormatException -> 0x0094 }
    L_0x0052:
        r0 = 2131755198; // 0x7f1000be float:1.9141269E38 double:1.0532270087E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0096 }
        r1 = new com.whatsapp.yf;	 Catch:{ NumberFormatException -> 0x0096 }
        r1.<init>(r6);	 Catch:{ NumberFormatException -> 0x0096 }
        r0.setOnClickListener(r1);	 Catch:{ NumberFormatException -> 0x0096 }
        r0 = 2131755198; // 0x7f1000be float:1.9141269E38 double:1.0532270087E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0096 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0096 }
        r0 = 2131755197; // 0x7f1000bd float:1.9141266E38 double:1.053227008E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0096 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0096 }
        if (r2 == 0) goto L_0x0091;
    L_0x0079:
        r0 = 2131755198; // 0x7f1000be float:1.9141269E38 double:1.0532270087E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0096 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0096 }
        r0 = 2131755197; // 0x7f1000bd float:1.9141266E38 double:1.053227008E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0096 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0096 }
    L_0x0091:
        return;
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.r():void");
    }

    private void u() {
        try {
            Intent intent = new Intent(Z[6]);
            intent.setType(Z[4]);
            intent.putExtra(Z[3], this.K.a((Context) this));
            intent.putExtra(Z[5], 2);
            intent.setFlags(524288);
            startActivityForResult(intent, 11);
        } catch (ActivityNotFoundException e) {
            showDialog(4);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
        r5 = this;
        r4 = -1;
        r0 = com.whatsapp.DialogToastActivity.f;
        switch(r6) {
            case 1: goto L_0x007c;
            case 10: goto L_0x0007;
            case 11: goto L_0x004c;
            case 12: goto L_0x008d;
            case 13: goto L_0x00b4;
            case 14: goto L_0x00d6;
            case 15: goto L_0x00db;
            case 151: goto L_0x00e0;
            default: goto L_0x0006;
        };
    L_0x0006:
        return;
    L_0x0007:
        if (r7 != r4) goto L_0x002e;
    L_0x0009:
        r1 = r5.K;	 Catch:{ NumberFormatException -> 0x00f1 }
        if (r1 == 0) goto L_0x002e;
    L_0x000d:
        if (r8 == 0) goto L_0x0022;
    L_0x000f:
        r1 = r8.getData();	 Catch:{ NumberFormatException -> 0x00f5 }
        if (r1 == 0) goto L_0x0022;
    L_0x0015:
        r1 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x00f7 }
        r2 = r8.getData();	 Catch:{ NumberFormatException -> 0x00f7 }
        r3 = r5.K;	 Catch:{ NumberFormatException -> 0x00f7 }
        r1.a(r2, r3);	 Catch:{ NumberFormatException -> 0x00f7 }
        if (r0 == 0) goto L_0x0029;
    L_0x0022:
        r1 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x00f7 }
        r2 = r5.K;	 Catch:{ NumberFormatException -> 0x00f7 }
        r1.n(r2);	 Catch:{ NumberFormatException -> 0x00f7 }
    L_0x0029:
        r5.o();	 Catch:{ NumberFormatException -> 0x00f9 }
        if (r0 == 0) goto L_0x0006;
    L_0x002e:
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00fb }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x00fb }
        r2 = Z;	 Catch:{ NumberFormatException -> 0x00fb }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00fb }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00fb }
        r2 = r5.K;	 Catch:{ NumberFormatException -> 0x00fb }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00fb }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x00fb }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x00fb }
        if (r0 == 0) goto L_0x0006;
    L_0x004c:
        if (r7 != r4) goto L_0x005e;
    L_0x004e:
        r1 = r5.K;	 Catch:{ NumberFormatException -> 0x00ff }
        if (r1 == 0) goto L_0x005e;
    L_0x0052:
        r1 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x0101 }
        r2 = r5.K;	 Catch:{ NumberFormatException -> 0x0101 }
        r1.n(r2);	 Catch:{ NumberFormatException -> 0x0101 }
        r5.o();	 Catch:{ NumberFormatException -> 0x0101 }
        if (r0 == 0) goto L_0x0006;
    L_0x005e:
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0103 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x0103 }
        r2 = Z;	 Catch:{ NumberFormatException -> 0x0103 }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0103 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0103 }
        r2 = r5.K;	 Catch:{ NumberFormatException -> 0x0103 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0103 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x0103 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0103 }
        if (r0 == 0) goto L_0x0006;
    L_0x007c:
        if (r7 != r4) goto L_0x0006;
    L_0x007e:
        r1 = Z;
        r2 = 22;
        r1 = r1[r2];
        r1 = r8.getStringExtra(r1);
        r5.m(r1);	 Catch:{ NumberFormatException -> 0x0105 }
        if (r0 == 0) goto L_0x0006;
    L_0x008d:
        if (r7 != r4) goto L_0x0006;
    L_0x008f:
        if (r8 == 0) goto L_0x00ab;
    L_0x0091:
        r1 = Z;	 Catch:{ NumberFormatException -> 0x010b }
        r2 = 19;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x010b }
        r2 = 0;
        r1 = r8.getBooleanExtra(r1, r2);	 Catch:{ NumberFormatException -> 0x010b }
        if (r1 == 0) goto L_0x00ab;
    L_0x009e:
        r1 = r5.A;	 Catch:{ NumberFormatException -> 0x010d }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x010d }
        r1 = r5.X;	 Catch:{ NumberFormatException -> 0x010d }
        com.whatsapp.r.a(r1, r5);	 Catch:{ NumberFormatException -> 0x010d }
        if (r0 == 0) goto L_0x0006;
    L_0x00ab:
        r1 = r5.X;	 Catch:{ NumberFormatException -> 0x010f }
        r2 = 13;
        com.whatsapp.r.a(r8, r1, r5, r2, r5);	 Catch:{ NumberFormatException -> 0x010f }
        if (r0 == 0) goto L_0x0006;
    L_0x00b4:
        r1 = com.whatsapp.r.a();	 Catch:{ NumberFormatException -> 0x0111 }
        r1.delete();	 Catch:{ NumberFormatException -> 0x0111 }
        if (r7 != r4) goto L_0x00cd;
    L_0x00bd:
        r1 = r5.X;	 Catch:{ NumberFormatException -> 0x0113 }
        r1 = com.whatsapp.r.b(r1, r5);	 Catch:{ NumberFormatException -> 0x0113 }
        if (r1 == 0) goto L_0x0006;
    L_0x00c5:
        r1 = r5.A;	 Catch:{ NumberFormatException -> 0x0115 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x0115 }
        if (r0 == 0) goto L_0x0006;
    L_0x00cd:
        if (r7 != 0) goto L_0x0006;
    L_0x00cf:
        if (r8 == 0) goto L_0x0006;
    L_0x00d1:
        com.whatsapp.r.a(r8, r5);	 Catch:{ NumberFormatException -> 0x011b }
        if (r0 == 0) goto L_0x0006;
    L_0x00d6:
        r5.y();	 Catch:{ NumberFormatException -> 0x011d }
        if (r0 == 0) goto L_0x0006;
    L_0x00db:
        r5.s();	 Catch:{ NumberFormatException -> 0x011f }
        if (r0 == 0) goto L_0x0006;
    L_0x00e0:
        if (r7 != r4) goto L_0x0006;
    L_0x00e2:
        r0 = r5.X;	 Catch:{ NumberFormatException -> 0x00ef }
        r0.o();	 Catch:{ NumberFormatException -> 0x00ef }
        r5.y();	 Catch:{ NumberFormatException -> 0x00ef }
        r5.q();	 Catch:{ NumberFormatException -> 0x00ef }
        goto L_0x0006;
    L_0x00ef:
        r0 = move-exception;
        throw r0;
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f7 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0101 }
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0103 }
    L_0x0103:
        r0 = move-exception;
        throw r0;
    L_0x0105:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0107 }
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0109 }
    L_0x0109:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x010b }
    L_0x010b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x010d }
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0111 }
    L_0x0111:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0113 }
    L_0x0113:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0115 }
    L_0x0115:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0117 }
    L_0x0117:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0119 }
    L_0x0119:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x011b }
    L_0x011b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x011d }
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x011f }
    L_0x011f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ef }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.onActivityResult(int, int, android.content.Intent):void");
    }

    private void k() {
        try {
            if (this.w != null) {
                this.w.cancel(true);
            }
            f();
            setSupportProgressBarIndeterminateVisibility(true);
            this.w = new akk(this);
            bq.a(this.w, new Void[0]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            if (this.K != null) {
                bundle.putString(Z[2], this.K.p);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateContextMenu(android.view.ContextMenu r11, android.view.View r12, android.view.ContextMenu.ContextMenuInfo r13) {
        /*
        r10 = this;
        r9 = 1;
        r8 = 0;
        super.onCreateContextMenu(r11, r12, r13);
        r13 = (android.widget.AdapterView.AdapterContextMenuInfo) r13;
        r0 = r13.targetView;
        r0 = r0.getTag();
        r0 = (com.whatsapp.an_) r0;
        r0 = r0.d;
        if (r0 != 0) goto L_0x0014;
    L_0x0013:
        return;
    L_0x0014:
        r1 = r10.L;	 Catch:{ NumberFormatException -> 0x00c2 }
        r2 = r0.p;	 Catch:{ NumberFormatException -> 0x00c2 }
        r1 = r1.containsKey(r2);	 Catch:{ NumberFormatException -> 0x00c2 }
        if (r1 != 0) goto L_0x0013;
    L_0x001e:
        r1 = 0;
        r2 = 1;
        r3 = 0;
        r4 = 2131231445; // 0x7f0802d5 float:1.8078971E38 double:1.0529682403E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00c4 }
        r6 = 0;
        r7 = r0.i();	 Catch:{ NumberFormatException -> 0x00c4 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x00c4 }
        r4 = r10.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00c4 }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00c4 }
        r1 = 0;
        r2 = 4;
        r3 = 0;
        r4 = 2131230866; // 0x7f080092 float:1.8077797E38 double:1.0529679542E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00c4 }
        r6 = 0;
        r7 = r0.i();	 Catch:{ NumberFormatException -> 0x00c4 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x00c4 }
        r4 = r10.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00c4 }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00c4 }
        r1 = r0.l;	 Catch:{ NumberFormatException -> 0x00c4 }
        if (r1 != 0) goto L_0x006e;
    L_0x0050:
        r1 = 0;
        r2 = 2;
        r3 = 0;
        r4 = 2131230786; // 0x7f080042 float:1.8077635E38 double:1.0529679147E-314;
        r4 = r10.getString(r4);	 Catch:{ NumberFormatException -> 0x00c6 }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00c6 }
        r1 = 0;
        r2 = 3;
        r3 = 0;
        r4 = 2131230789; // 0x7f080045 float:1.807764E38 double:1.052967916E-314;
        r4 = r10.getString(r4);	 Catch:{ NumberFormatException -> 0x00c6 }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00c6 }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x00c6 }
        if (r1 == 0) goto L_0x0085;
    L_0x006e:
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 2131232228; // 0x7f0805e4 float:1.808056E38 double:1.052968627E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00c6 }
        r6 = 0;
        r7 = r0.i();	 Catch:{ NumberFormatException -> 0x00c6 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x00c6 }
        r4 = r10.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00c6 }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00c6 }
    L_0x0085:
        r1 = r10.M;	 Catch:{ NumberFormatException -> 0x00c8 }
        r1 = com.whatsapp.qm.d(r1);	 Catch:{ NumberFormatException -> 0x00c8 }
        if (r1 == 0) goto L_0x00aa;
    L_0x008d:
        r1 = r10.M;	 Catch:{ NumberFormatException -> 0x00ca }
        r2 = r0.p;	 Catch:{ NumberFormatException -> 0x00ca }
        r1 = com.whatsapp.qm.c(r1, r2);	 Catch:{ NumberFormatException -> 0x00ca }
        if (r1 == 0) goto L_0x00cc;
    L_0x0097:
        r1 = 5;
        r2 = 2131231818; // 0x7f08044a float:1.8079728E38 double:1.0529684246E-314;
        r3 = new java.lang.Object[r9];
        r0 = r0.i();
        r3[r8] = r0;
        r0 = r10.getString(r2, r3);
        r11.add(r8, r1, r8, r0);
    L_0x00aa:
        r0 = com.whatsapp.App.aZ();	 Catch:{ NumberFormatException -> 0x00c0 }
        if (r0 == 0) goto L_0x0013;
    L_0x00b0:
        r0 = 0;
        r1 = 8;
        r2 = 0;
        r3 = 2131232200; // 0x7f0805c8 float:1.8080503E38 double:1.0529686133E-314;
        r3 = r10.getString(r3);	 Catch:{ NumberFormatException -> 0x00c0 }
        r11.add(r0, r1, r2, r3);	 Catch:{ NumberFormatException -> 0x00c0 }
        goto L_0x0013;
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        r1 = 6;
        r2 = 2131231415; // 0x7f0802b7 float:1.807891E38 double:1.0529682255E-314;
        r2 = r10.getString(r2);
        r11.add(r8, r1, r8, r2);
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    private void a(ArrayList arrayList, String str) {
        boolean z = DialogToastActivity.f;
        for (adl com_whatsapp_adl : qm.c(str).c()) {
            l5 b = App.as.b(com_whatsapp_adl.e);
            try {
                if (!arrayList.contains(b)) {
                    arrayList.add(b);
                }
                try {
                    if (com_whatsapp_adl.b) {
                        this.L.put(b.p, b);
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        Collections.sort(arrayList, new awn(getApplicationContext()));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    static void b(GroupChatInfo groupChatInfo, String str) {
        groupChatInfo.l(str);
    }

    static Handler B(GroupChatInfo groupChatInfo) {
        return groupChatInfo.P;
    }

    public void onDestroy() {
        try {
            Log.i(Z[8]);
            super.onDestroy();
            this.Y.b();
            if (this.w != null) {
                this.w.cancel(true);
            }
            try {
                if (this.N != null) {
                    this.N.cancel(true);
                }
                j2.a.a(this.V);
                App.aK.a(this.D);
                App.a((tm) this);
                App.a((a_) this);
                this.C.a();
                R = null;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public void a(String str) {
        if (str != null) {
            try {
                if (str.equals(App.ad() + Z[18])) {
                    this.x.notifyDataSetChanged();
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                l5.a(this.I, new aa_(App.as.b(str)));
                this.x.notifyDataSetChanged();
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (qm.d(this.M)) {
                MenuItemCompat.setShowAsAction(menu.add(0, 1, 0, 2131230790).setIcon(2130839423), 2);
            }
            return super.onCreateOptionsMenu(menu);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void a(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(new hf(this, view));
    }

    public static void n(String str) {
        try {
            if (R == null) {
                return;
            }
            if (R.M.equals(str)) {
                R.o();
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static void x(GroupChatInfo groupChatInfo) {
        groupChatInfo.k();
    }

    static l5 a(GroupChatInfo groupChatInfo, l5 l5Var) {
        groupChatInfo.K = l5Var;
        return l5Var;
    }

    static l5 z(GroupChatInfo groupChatInfo) {
        return groupChatInfo.X;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j(java.lang.String r9) {
        /*
        r8 = this;
        r1 = 0;
        r7 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.X;	 Catch:{ NumberFormatException -> 0x0083 }
        r0 = r0.a(r8);	 Catch:{ NumberFormatException -> 0x0083 }
        r0 = r0.equals(r9);	 Catch:{ NumberFormatException -> 0x0083 }
        if (r0 != 0) goto L_0x0082;
    L_0x000f:
        r0 = com.whatsapp.App.Q();	 Catch:{ NumberFormatException -> 0x0083 }
        if (r0 == 0) goto L_0x0077;
    L_0x0015:
        r0 = r9.length();
        r0 = r9.codePointCount(r1, r0);
        r1 = com.whatsapp.a59.h;	 Catch:{ NumberFormatException -> 0x0085 }
        if (r0 > r1) goto L_0x005a;
    L_0x0021:
        r0 = r8.v;	 Catch:{ NumberFormatException -> 0x0087 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = r8.O;	 Catch:{ NumberFormatException -> 0x0087 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0087 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0087 }
        r1 = Z;	 Catch:{ NumberFormatException -> 0x0087 }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = r0.append(r9);	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0087 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = new com.whatsapp.a35;	 Catch:{ NumberFormatException -> 0x0087 }
        r2 = r8.M;	 Catch:{ NumberFormatException -> 0x0087 }
        r4 = 0;
        r5 = 17;
        r6 = 0;
        r1 = r8;
        r3 = r9;
        r0.<init>(r1, r2, r3, r4, r5, r6);	 Catch:{ NumberFormatException -> 0x0087 }
        com.whatsapp.App.a(r0);	 Catch:{ NumberFormatException -> 0x0087 }
        if (r7 == 0) goto L_0x0075;
    L_0x005a:
        r0 = 2131232086; // 0x7f080556 float:1.8080271E38 double:1.052968557E-314;
        r0 = r8.getString(r0);	 Catch:{ NumberFormatException -> 0x0087 }
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ NumberFormatException -> 0x0087 }
        r2 = 0;
        r3 = com.whatsapp.a59.h;	 Catch:{ NumberFormatException -> 0x0087 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NumberFormatException -> 0x0087 }
        r1[r2] = r3;	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = java.lang.String.format(r0, r1);	 Catch:{ NumberFormatException -> 0x0087 }
        r1 = 0;
        com.whatsapp.App.b(r8, r0, r1);	 Catch:{ NumberFormatException -> 0x0087 }
    L_0x0075:
        if (r7 == 0) goto L_0x0082;
    L_0x0077:
        r0 = r8.getBaseContext();	 Catch:{ NumberFormatException -> 0x0089 }
        r1 = 2131231561; // 0x7f080349 float:1.8079206E38 double:1.0529682976E-314;
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ NumberFormatException -> 0x0089 }
    L_0x0082:
        return;
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.j(java.lang.String):void");
    }

    static void a(GroupChatInfo groupChatInfo, ArrayList arrayList) {
        groupChatInfo.b(arrayList);
    }

    public void d(String str) {
        if (!qm.i(str)) {
            try {
                l5.a(this.I, new aas(App.as.b(str)));
                this.x.notifyDataSetChanged();
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        if (str.equals(this.M)) {
            this.A.setVisibility(8);
            this.X.o();
            y();
        }
    }

    static a2_ b(GroupChatInfo groupChatInfo) {
        return groupChatInfo.C;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.ArrayList r12) {
        /*
        r11 = this;
        r5 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.size();
        r1 = 2131755748; // 0x7f1002e4 float:1.9142384E38 double:1.0532272804E-314;
        r1 = r11.findViewById(r1);
        if (r0 != 0) goto L_0x001e;
    L_0x0010:
        r3 = r11.J;	 Catch:{ NumberFormatException -> 0x011c }
        r4 = 8;
        r3.setVisibility(r4);	 Catch:{ NumberFormatException -> 0x011c }
        r3 = 8;
        r1.setVisibility(r3);	 Catch:{ NumberFormatException -> 0x011c }
        if (r2 == 0) goto L_0x011b;
    L_0x001e:
        r3 = r11.J;
        r4 = java.text.NumberFormat.getInstance();
        r6 = (long) r0;
        r0 = r4.format(r6);
        r3.setText(r0);
        r0 = r11.J;
        r0.setVisibility(r5);
        r1.setVisibility(r5);
        r0 = 2131755753; // 0x7f1002e9 float:1.9142394E38 double:1.053227283E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r1 = new com.whatsapp.et;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r0.removeAllViews();
        r1 = r11.getResources();
        r3 = 2131427522; // 0x7f0b00c2 float:1.8476663E38 double:1.053065115E-314;
        r3 = r1.getDimensionPixelSize(r3);
        r1 = r11.getResources();
        r4 = 2131427521; // 0x7f0b00c1 float:1.847666E38 double:1.0530651147E-314;
        r4 = r1.getDimensionPixelSize(r4);
        r5 = new android.widget.ImageView;
        r5.<init>(r11);
        r1 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r5.setBackgroundResource(r1);
        r1 = new android.view.ViewGroup$LayoutParams;
        r6 = r3 + r4;
        r7 = r3 + r4;
        r1.<init>(r6, r7);
        r5.setLayoutParams(r1);
        r5.setPadding(r4, r4, r4, r4);
        r1 = new com.whatsapp.g_;
        r1.<init>(r11);
        r5.setOnClickListener(r1);
        r1 = new com.whatsapp.util.bz;
        r6 = 2130839418; // 0x7f02077a float:1.7283846E38 double:1.052774553E-314;
        r6 = android.support.v4.content.ContextCompat.getDrawable(r11, r6);
        r1.<init>(r6);
        r5.setImageDrawable(r1);
        r1 = android.widget.ImageView.ScaleType.CENTER;
        r5.setScaleType(r1);
        r6 = r12.iterator();
    L_0x0098:
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x00f2;
    L_0x009e:
        r1 = r6.next();
        r1 = (com.whatsapp.protocol.co) r1;
        r7 = new com.whatsapp.ThumbnailTextButton;
        r7.<init>(r11);
        r8 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r7.setScaleType(r8);
        r8 = new android.view.ViewGroup$LayoutParams;
        r9 = r3 + r4;
        r10 = r3 + r4;
        r8.<init>(r9, r10);
        r7.setLayoutParams(r8);
        r7.setPadding(r4, r4, r4, r4);
        r8 = r3 / 6;
        r8 = (float) r8;
        r7.setTextSize(r8);
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7.setBorderSize(r8);
        r8 = 855638016; // 0x33000000 float:2.9802322E-8 double:4.22741349E-315;
        r7.setBorderColor(r8);
        r8 = com.whatsapp.util.bd.a(r1);
        if (r8 == 0) goto L_0x00d8;
    L_0x00d3:
        r7.setImageBitmap(r8);	 Catch:{ NumberFormatException -> 0x011e }
        if (r2 == 0) goto L_0x00de;
    L_0x00d8:
        r8 = 2130837598; // 0x7f02005e float:1.7280155E38 double:1.052773654E-314;
        r7.setImageResource(r8);	 Catch:{ NumberFormatException -> 0x011e }
    L_0x00de:
        r8 = com.whatsapp.App.as;
        r1 = r1.t;
        r1 = r8.b(r1);
        r1 = r1.i();
        r7.setText(r1);
        r0.addView(r7);
        if (r2 == 0) goto L_0x0098;
    L_0x00f2:
        r1 = r12.size();	 Catch:{ NumberFormatException -> 0x0120 }
        r2 = 12;
        if (r1 < r2) goto L_0x00fd;
    L_0x00fa:
        r0.addView(r5);	 Catch:{ NumberFormatException -> 0x0120 }
    L_0x00fd:
        com.whatsapp.aam.a(r0);
        r0 = com.whatsapp.App.a1();
        if (r0 != 0) goto L_0x011b;
    L_0x0106:
        r0 = 2131755752; // 0x7f1002e8 float:1.9142392E38 double:1.0532272824E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.HorizontalScrollView) r0;
        r1 = r0.getViewTreeObserver();
        r2 = new com.whatsapp.b5;
        r2.<init>(r11, r0);
        r1.addOnGlobalLayoutListener(r2);
    L_0x011b:
        return;
    L_0x011c:
        r0 = move-exception;
        throw r0;
    L_0x011e:
        r0 = move-exception;
        throw r0;
    L_0x0120:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.b(java.util.ArrayList):void");
    }

    public void a(Collection collection) {
    }

    public static void a(l5 l5Var, Activity activity, ActivityOptionsCompat activityOptionsCompat) {
        Intent intent = new Intent(activity, GroupChatInfo.class);
        try {
            Bundle bundle;
            intent.putExtra(Z[11], l5Var.p);
            intent.putExtra(Z[10], true);
            if (activityOptionsCompat == null) {
                bundle = null;
            } else {
                bundle = activityOptionsCompat.toBundle();
            }
            ActivityCompat.startActivity(activity, intent, bundle);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void k(String str) {
        if (App.Q()) {
            a(2131231589, 2131231813);
            Vector vector = new Vector();
            vector.add(str);
            try {
                App.f(new a33(this, this.M, null, vector, 92));
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        App.a(getBaseContext(), 2131231518, 0);
    }

    public void m470a() {
        this.I.clear();
        this.X = App.as.c(this.M);
        a(this.I, this.M);
        r();
        this.x.notifyDataSetChanged();
    }

    static void a(GroupChatInfo groupChatInfo, String str) {
        groupChatInfo.j(str);
    }

    static ChatInfoLayout f(GroupChatInfo groupChatInfo) {
        return groupChatInfo.S;
    }

    static void h(GroupChatInfo groupChatInfo) {
        groupChatInfo.x();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        r6 = 1;
        r2 = 0;
        r3 = 8;
        r1 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = Z;
        r5 = 26;
        r0 = r0[r5];
        com.whatsapp.util.Log.i(r0);
        r0 = Z;
        r5 = 27;
        r0 = r0[r5];
        r0 = com.whatsapp.tp.a(r0);
        r9.Y = r0;
        r0 = r9.Y;
        r0.e();
        r0 = r9.Y;
        r5 = com.whatsapp.t4.ON_CREATE;
        r0.b(r5);
        r0 = com.whatsapp.fieldstats.k.GROUP_INFO;
        com.whatsapp.nf.a(r0);
        super.onCreate(r10);
        r9.supportPostponeEnterTransition();
        r0 = r9.getLayoutInflater();
        r5 = 2130903193; // 0x7f030099 float:1.7413197E38 double:1.0528060623E-314;
        r0 = com.whatsapp.aam.a(r0, r5, r2, r1);
        r0 = (com.whatsapp.ChatInfoLayout) r0;
        r9.S = r0;
        r0 = r9.S;
        r9.setContentView(r0);
        r0 = 2131755438; // 0x7f1001ae float:1.9141755E38 double:1.0532271273E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r5 = "";
        r0.setTitle(r5);
        r0.setContentInsetsAbsolute(r1, r1);
        r9.setSupportActionBar(r0);
        r5 = r9.getSupportActionBar();
        r5.setDisplayHomeAsUpEnabled(r6);
        r5 = new com.whatsapp.util.bz;
        r6 = r9.getResources();
        r7 = 2130839456; // 0x7f0207a0 float:1.7283923E38 double:1.052774572E-314;
        r6 = r6.getDrawable(r7);
        r5.<init>(r6);
        r0.setNavigationIcon(r5);
        r0 = r9.a();
        r9.z = r0;
        r0 = r9.getLayoutInflater();
        r5 = 2130903195; // 0x7f03009b float:1.7413201E38 double:1.0528060633E-314;
        r6 = r9.z;
        r0 = com.whatsapp.aam.a(r0, r5, r6, r1);
        r9.B = r0;
        r0 = r9.z;
        r5 = r9.B;
        r0.addHeaderView(r5, r2, r1);
        r0 = 2131755330; // 0x7f100142 float:1.9141536E38 double:1.053227074E-314;
        r0 = r9.findViewById(r0);
        r9.U = r0;
        r0 = r9.S;
        r0.c();
        r0 = r9.getLayoutInflater();
        r5 = 2130903194; // 0x7f03009a float:1.74132E38 double:1.052806063E-314;
        r6 = r9.z;
        r0 = com.whatsapp.aam.a(r0, r5, r6, r1);
        r9.G = r0;
        r0 = r9.z;
        r5 = r9.G;
        r0.addFooterView(r5, r2, r1);
        r0 = new android.widget.LinearLayout;
        r0.<init>(r9);
        r9.y = r0;
        r0 = r9.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getHeight();
        r5 = r9.y;	 Catch:{ NumberFormatException -> 0x0409 }
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r5.setPadding(r6, r7, r8, r0);	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = r9.z;	 Catch:{ NumberFormatException -> 0x0409 }
        r5 = r9.y;	 Catch:{ NumberFormatException -> 0x0409 }
        r6 = 0;
        r7 = 0;
        r0.addFooterView(r5, r6, r7);	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = r9.getIntent();	 Catch:{ NumberFormatException -> 0x0409 }
        r5 = Z;	 Catch:{ NumberFormatException -> 0x0409 }
        r6 = 23;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = r0.getStringExtra(r5);	 Catch:{ NumberFormatException -> 0x0409 }
        r9.M = r0;	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x0409 }
        r5 = r9.M;	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = r0.b(r5);	 Catch:{ NumberFormatException -> 0x0409 }
        r9.X = r0;	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = r9.L;	 Catch:{ NumberFormatException -> 0x0409 }
        r0.clear();	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = r9.I;	 Catch:{ NumberFormatException -> 0x0409 }
        r5 = r9.M;	 Catch:{ NumberFormatException -> 0x0409 }
        r9.a(r0, r5);	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = new com.whatsapp.uy;	 Catch:{ NumberFormatException -> 0x0409 }
        r5 = r9.I;	 Catch:{ NumberFormatException -> 0x0409 }
        r0.<init>(r9, r9, r5);	 Catch:{ NumberFormatException -> 0x0409 }
        r9.x = r0;	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = r9.z;	 Catch:{ NumberFormatException -> 0x0409 }
        r5 = new com.whatsapp.fu;	 Catch:{ NumberFormatException -> 0x0409 }
        r5.<init>(r9);	 Catch:{ NumberFormatException -> 0x0409 }
        r0.setOnItemClickListener(r5);	 Catch:{ NumberFormatException -> 0x0409 }
        r5 = r9.S;	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = r9.getResources();	 Catch:{ NumberFormatException -> 0x0409 }
        r6 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r6 = r0.getDimensionPixelSize(r6);	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = r9.M;	 Catch:{ NumberFormatException -> 0x0409 }
        r0 = com.whatsapp.qm.d(r0);	 Catch:{ NumberFormatException -> 0x0409 }
        if (r0 == 0) goto L_0x040b;
    L_0x0128:
        r0 = r9.getResources();	 Catch:{ NumberFormatException -> 0x0409 }
        r7 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r0 = r0.getDimensionPixelSize(r7);	 Catch:{ NumberFormatException -> 0x0409 }
    L_0x0133:
        r5.setCollapsedPadding(r6, r0);
        r0 = 2131755687; // 0x7f1002a7 float:1.914226E38 double:1.0532272503E-314;
        r0 = r9.findViewById(r0);
        r5 = r9.M;	 Catch:{ NumberFormatException -> 0x040e }
        r5 = com.whatsapp.qm.d(r5);	 Catch:{ NumberFormatException -> 0x040e }
        if (r5 == 0) goto L_0x0410;
    L_0x0145:
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0413 }
        r1 = new com.whatsapp.y0;	 Catch:{ NumberFormatException -> 0x0413 }
        r1.<init>(r9);	 Catch:{ NumberFormatException -> 0x0413 }
        r0.setOnClickListener(r1);	 Catch:{ NumberFormatException -> 0x0413 }
        r0 = 2131755750; // 0x7f1002e6 float:1.9142388E38 double:1.0532272814E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0413 }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x0413 }
        r9.J = r0;	 Catch:{ NumberFormatException -> 0x0413 }
        r0 = 2131755748; // 0x7f1002e4 float:1.9142384E38 double:1.0532272804E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0413 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0413 }
        r0 = 2131755429; // 0x7f1001a5 float:1.9141737E38 double:1.053227123E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0413 }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x0413 }
        r9.Q = r0;	 Catch:{ NumberFormatException -> 0x0413 }
        r1 = r9.M;	 Catch:{ NumberFormatException -> 0x0413 }
        r0 = r9.X;	 Catch:{ NumberFormatException -> 0x0413 }
        r0 = r0.n();	 Catch:{ NumberFormatException -> 0x0413 }
        if (r0 != 0) goto L_0x0186;
    L_0x017c:
        r0 = r9.X;	 Catch:{ NumberFormatException -> 0x0415 }
        r0 = r0.j;	 Catch:{ NumberFormatException -> 0x0415 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x0415 }
        if (r0 == 0) goto L_0x0417;
    L_0x0186:
        r0 = r2;
    L_0x0187:
        com.whatsapp.App.c(r1, r0);
        r9.y();
        r9.k();
        r9.r();
        r0 = 2131755189; // 0x7f1000b5 float:1.914125E38 double:1.053227004E-314;
        r0 = r9.findViewById(r0);
        r1 = new com.whatsapp.ka;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = 2131755681; // 0x7f1002a1 float:1.9142248E38 double:1.0532272473E-314;
        r0 = r9.findViewById(r0);
        r1 = new com.whatsapp.aqi;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = new com.whatsapp.eb;
        r0.<init>(r9);
        r1 = 2131755757; // 0x7f1002ed float:1.9142402E38 double:1.053227285E-314;
        r1 = r9.findViewById(r1);	 Catch:{ NumberFormatException -> 0x041f }
        r1.setOnClickListener(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r1 = 2131755758; // 0x7f1002ee float:1.9142404E38 double:1.0532272854E-314;
        r1 = r9.findViewById(r1);	 Catch:{ NumberFormatException -> 0x041f }
        r1.setOnClickListener(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = 2131755751; // 0x7f1002e7 float:1.914239E38 double:1.053227282E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r1 = new com.whatsapp.id;	 Catch:{ NumberFormatException -> 0x041f }
        r1.<init>(r9);	 Catch:{ NumberFormatException -> 0x041f }
        r0.setOnClickListener(r1);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = 2131755434; // 0x7f1001aa float:1.9141747E38 double:1.0532271253E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = (android.widget.ImageView) r0;	 Catch:{ NumberFormatException -> 0x041f }
        r9.F = r0;	 Catch:{ NumberFormatException -> 0x041f }
        r0 = r9.S;	 Catch:{ NumberFormatException -> 0x041f }
        r1 = new com.whatsapp.aia;	 Catch:{ NumberFormatException -> 0x041f }
        r1.<init>(r9);	 Catch:{ NumberFormatException -> 0x041f }
        r0.setOnPhotoClickListener(r1);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = 2131755425; // 0x7f1001a1 float:1.9141729E38 double:1.053227121E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r9.A = r0;	 Catch:{ NumberFormatException -> 0x041f }
        r0 = r9.z;	 Catch:{ NumberFormatException -> 0x041f }
        r1 = r9.x;	 Catch:{ NumberFormatException -> 0x041f }
        r0.setAdapter(r1);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = r9.z;	 Catch:{ NumberFormatException -> 0x041f }
        r9.registerForContextMenu(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r9.v();	 Catch:{ NumberFormatException -> 0x041f }
        r0 = 2131755679; // 0x7f10029f float:1.9142244E38 double:1.0532272463E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = (android.widget.ImageButton) r0;	 Catch:{ NumberFormatException -> 0x041f }
        r9.O = r0;	 Catch:{ NumberFormatException -> 0x041f }
        r0 = 2131755678; // 0x7f10029e float:1.9142242E38 double:1.053227246E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r9.v = r0;	 Catch:{ NumberFormatException -> 0x041f }
        r0 = r9.O;	 Catch:{ NumberFormatException -> 0x041f }
        r1 = new com.whatsapp.atr;	 Catch:{ NumberFormatException -> 0x041f }
        r1.<init>(r9);	 Catch:{ NumberFormatException -> 0x041f }
        r0.setOnClickListener(r1);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = 2131755686; // 0x7f1002a6 float:1.9142258E38 double:1.05322725E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x041f }
        r9.H = r0;	 Catch:{ NumberFormatException -> 0x041f }
        r0 = r9.H;	 Catch:{ NumberFormatException -> 0x041f }
        r1 = 2131231591; // 0x7f080367 float:1.8079267E38 double:1.0529683124E-314;
        r2 = 2;
        r2 = new java.lang.Object[r2];	 Catch:{ NumberFormatException -> 0x041f }
        r5 = 0;
        r6 = r9.I;	 Catch:{ NumberFormatException -> 0x041f }
        r6 = r6.size();	 Catch:{ NumberFormatException -> 0x041f }
        r7 = com.whatsapp.a59.c;	 Catch:{ NumberFormatException -> 0x041f }
        r6 = java.lang.Math.min(r6, r7);	 Catch:{ NumberFormatException -> 0x041f }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ NumberFormatException -> 0x041f }
        r2[r5] = r6;	 Catch:{ NumberFormatException -> 0x041f }
        r5 = 1;
        r6 = com.whatsapp.a59.c;	 Catch:{ NumberFormatException -> 0x041f }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ NumberFormatException -> 0x041f }
        r2[r5] = r6;	 Catch:{ NumberFormatException -> 0x041f }
        r1 = r9.getString(r1, r2);	 Catch:{ NumberFormatException -> 0x041f }
        r0.setText(r1);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = r9.M;	 Catch:{ NumberFormatException -> 0x041f }
        r0 = com.whatsapp.qm.c(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = r0.b();	 Catch:{ NumberFormatException -> 0x041f }
        if (r0 <= 0) goto L_0x0284;
    L_0x0266:
        r0 = 2131755684; // 0x7f1002a4 float:1.9142254E38 double:1.053227249E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x041f }
        r0 = 2131755680; // 0x7f1002a0 float:1.9142246E38 double:1.053227247E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x041f }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x041f }
        if (r4 == 0) goto L_0x0298;
    L_0x027e:
        r0 = com.whatsapp.WAAppCompatActivity.c;
        r0 = r0 + 1;
        com.whatsapp.WAAppCompatActivity.c = r0;
    L_0x0284:
        r0 = 2131755684; // 0x7f1002a4 float:1.9142254E38 double:1.053227249E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r3);
        r0 = 2131755680; // 0x7f1002a0 float:1.9142246E38 double:1.053227247E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r3);
    L_0x0298:
        r0 = r9.M;	 Catch:{ NumberFormatException -> 0x0421 }
        r0 = com.whatsapp.qm.h(r0);	 Catch:{ NumberFormatException -> 0x0421 }
        if (r0 == 0) goto L_0x02d7;
    L_0x02a0:
        r0 = 2131755683; // 0x7f1002a3 float:1.9142252E38 double:1.0532272483E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0423 }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x0423 }
        r1 = 2131231137; // 0x7f0801a1 float:1.8078347E38 double:1.052968088E-314;
        r0.setText(r1);	 Catch:{ NumberFormatException -> 0x0423 }
        r0 = 2131755682; // 0x7f1002a2 float:1.914225E38 double:1.053227248E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0423 }
        r0 = (android.widget.ImageView) r0;	 Catch:{ NumberFormatException -> 0x0423 }
        r1 = 2130839488; // 0x7f0207c0 float:1.7283988E38 double:1.052774588E-314;
        r0.setImageResource(r1);	 Catch:{ NumberFormatException -> 0x0423 }
        r0 = 2131755501; // 0x7f1001ed float:1.9141883E38 double:1.0532271584E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0423 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0423 }
        r0 = 2131755181; // 0x7f1000ad float:1.9141234E38 double:1.0532270003E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0423 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0423 }
        if (r4 == 0) goto L_0x030c;
    L_0x02d7:
        r0 = 2131755683; // 0x7f1002a3 float:1.9142252E38 double:1.0532272483E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0423 }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x0423 }
        r1 = 2131231055; // 0x7f08014f float:1.807818E38 double:1.0529680476E-314;
        r0.setText(r1);	 Catch:{ NumberFormatException -> 0x0423 }
        r0 = 2131755682; // 0x7f1002a2 float:1.914225E38 double:1.053227248E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0423 }
        r0 = (android.widget.ImageView) r0;	 Catch:{ NumberFormatException -> 0x0423 }
        r1 = 2130839433; // 0x7f020789 float:1.7283876E38 double:1.0527745606E-314;
        r0.setImageResource(r1);	 Catch:{ NumberFormatException -> 0x0423 }
        r0 = 2131755501; // 0x7f1001ed float:1.9141883E38 double:1.0532271584E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0423 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0423 }
        r0 = 2131755181; // 0x7f1000ad float:1.9141234E38 double:1.0532270003E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0423 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0423 }
    L_0x030c:
        r0 = com.whatsapp.App.B();	 Catch:{ NumberFormatException -> 0x0425 }
        if (r0 == 0) goto L_0x0332;
    L_0x0312:
        r0 = r9.M;	 Catch:{ NumberFormatException -> 0x0427 }
        r0 = com.whatsapp.qm.h(r0);	 Catch:{ NumberFormatException -> 0x0427 }
        if (r0 == 0) goto L_0x0332;
    L_0x031a:
        r0 = 2131755193; // 0x7f1000b9 float:1.9141258E38 double:1.053227006E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0429 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0429 }
        r0 = 2131755192; // 0x7f1000b8 float:1.9141256E38 double:1.0532270057E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0429 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0429 }
        if (r4 == 0) goto L_0x034a;
    L_0x0332:
        r0 = 2131755193; // 0x7f1000b9 float:1.9141258E38 double:1.053227006E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0429 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0429 }
        r0 = 2131755192; // 0x7f1000b8 float:1.9141256E38 double:1.0532270057E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0429 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0429 }
    L_0x034a:
        r0 = com.whatsapp.App.B();
        if (r0 == 0) goto L_0x036b;
    L_0x0350:
        r0 = 2131755194; // 0x7f1000ba float:1.914126E38 double:1.0532270067E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = new com.whatsapp.d6;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r9.i();
        r0 = com.whatsapp.j2.a;
        r1 = r9.V;
        r0.b(r1);
    L_0x036b:
        r9.s();
        r0 = 2131755186; // 0x7f1000b2 float:1.9141244E38 double:1.0532270027E-314;
        r0 = r9.findViewById(r0);
        r1 = new com.whatsapp.v2;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r9.l();
        r0 = 2131755182; // 0x7f1000ae float:1.9141236E38 double:1.053227001E-314;
        r0 = r9.findViewById(r0);
        r1 = new com.whatsapp.a4o;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = 2131755184; // 0x7f1000b0 float:1.914124E38 double:1.053227002E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.support.v7.widget.SwitchCompat) r0;
        r1 = r9.T;
        r0.setOnCheckedChangeListener(r1);
        r0 = com.whatsapp.App.aK;
        r1 = r9.D;
        r0.b(r1);
        com.whatsapp.App.b(r9);
        com.whatsapp.App.b(r9);
        if (r10 == 0) goto L_0x03c0;
    L_0x03ac:
        r0 = Z;
        r1 = 28;
        r0 = r0[r1];
        r0 = r10.getString(r0);
        if (r0 == 0) goto L_0x03c0;
    L_0x03b8:
        r1 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x042b }
        r0 = r1.b(r0);	 Catch:{ NumberFormatException -> 0x042b }
        r9.K = r0;	 Catch:{ NumberFormatException -> 0x042b }
    L_0x03c0:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x042d }
        r1 = 21;
        if (r0 < r1) goto L_0x03f6;
    L_0x03c6:
        r0 = r9.getIntent();	 Catch:{ NumberFormatException -> 0x042f }
        r1 = Z;	 Catch:{ NumberFormatException -> 0x042f }
        r2 = 25;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x042f }
        r2 = 0;
        r0 = r0.getBooleanExtra(r1, r2);	 Catch:{ NumberFormatException -> 0x042f }
        if (r0 == 0) goto L_0x03e5;
    L_0x03d7:
        r0 = r9.U;	 Catch:{ NumberFormatException -> 0x0431 }
        r1 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r1 = r9.getString(r1);	 Catch:{ NumberFormatException -> 0x0431 }
        r0.setTransitionName(r1);	 Catch:{ NumberFormatException -> 0x0431 }
        if (r4 == 0) goto L_0x03f6;
    L_0x03e5:
        r0 = 2131755434; // 0x7f1001aa float:1.9141747E38 double:1.0532271253E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0431 }
        r1 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r1 = r9.getString(r1);	 Catch:{ NumberFormatException -> 0x0431 }
        r0.setTransitionName(r1);	 Catch:{ NumberFormatException -> 0x0431 }
    L_0x03f6:
        R = r9;
        r0 = r9.a();
        r1 = r9.Y;
        com.whatsapp.a2c.b(r0, r1);
        r0 = r9.Y;
        r1 = com.whatsapp.t4.ON_CREATE;
        r0.a(r1);
        return;
    L_0x0409:
        r0 = move-exception;
        throw r0;
    L_0x040b:
        r0 = r1;
        goto L_0x0133;
    L_0x040e:
        r0 = move-exception;
        throw r0;
    L_0x0410:
        r1 = r3;
        goto L_0x0145;
    L_0x0413:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0415 }
    L_0x0415:
        r0 = move-exception;
        throw r0;
    L_0x0417:
        r0 = Z;
        r2 = 24;
        r0 = r0[r2];
        goto L_0x0187;
    L_0x041f:
        r0 = move-exception;
        throw r0;
    L_0x0421:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0423 }
    L_0x0423:
        r0 = move-exception;
        throw r0;
    L_0x0425:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0427 }
    L_0x0427:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0429 }
    L_0x0429:
        r0 = move-exception;
        throw r0;
    L_0x042b:
        r0 = move-exception;
        throw r0;
    L_0x042d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x042f }
    L_0x042f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0431 }
    L_0x0431:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.onCreate(android.os.Bundle):void");
    }

    private void m(String str) {
        if (App.Q()) {
            a(2131231589, 2131231813);
            Vector vector = new Vector();
            vector.add(str);
            try {
                App.c(new a3e(this, this.M, null, vector, 15));
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        App.a(getBaseContext(), 2131231518, 0);
        o();
    }

    public void onPause() {
        super.onPause();
        this.Y.b();
    }

    public String a() {
        try {
            return this.X == null ? null : this.X.p;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void a(GroupChatInfo groupChatInfo, int i) {
        groupChatInfo.b(i);
    }

    static ImageView t(GroupChatInfo groupChatInfo) {
        return groupChatInfo.F;
    }

    static String q(GroupChatInfo groupChatInfo) {
        return groupChatInfo.M;
    }

    private void l(String str) {
        boolean z = DialogToastActivity.f;
        try {
            if (this.L.containsKey(str)) {
                qm.b(this.M, str);
                o();
                if (!z) {
                    return;
                }
            }
            if (App.Q()) {
                a(2131231590, 2131231813);
                Vector vector = new Vector();
                vector.add(str);
                try {
                    App.g(new a39(this, this.M, null, vector, 30));
                    if (!z) {
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            App.a(getBaseContext(), 2131231518, 0);
            o();
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    static void v(GroupChatInfo groupChatInfo) {
        groupChatInfo.m();
    }

    private void o(String str) {
        if (App.Q()) {
            a(2131231590, 2131231813);
            Vector vector = new Vector();
            vector.add(str);
            try {
                App.d(new a3k(this, this.M, null, vector, 93));
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        App.a(getBaseContext(), 2131231518, 0);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case at.g /*1*/:
                return new Builder(this).setMessage(a28.b(getString(2131231056, new Object[]{this.X.a((Context) this)}), getBaseContext())).setCancelable(true).setNegativeButton(2131230884, new ara(this)).setPositiveButton(2131231020, new w2(this)).create();
            case at.o /*3*/:
                return new Builder(this).setMessage(a28.b(getString(2131231097, new Object[]{this.X.a((Context) this)}), getBaseContext())).setCancelable(true).setNegativeButton(2131230884, new ar_(this)).setPositiveButton(2131231580, new gn(this)).create();
            case at.p /*4*/:
                Log.w(Z[0]);
                return new Builder(this).setMessage(2131230782).setPositiveButton(2131231580, new azk(this)).create();
            case Y.f /*6*/:
                if (this.K == null) {
                    return super.onCreateDialog(i);
                }
                return new Builder(this).setMessage(a28.b(getString(2131231824, new Object[]{this.K.a((Context) this), this.X.a((Context) this)}), getBaseContext())).setCancelable(true).setNegativeButton(2131230884, new dy(this)).setPositiveButton(2131231580, new aq8(this)).create();
            case arj.Theme_buttonBarStyle /*50*/:
                return new aij(this, 2131231079, App.as.c(this.X.p).a((Context) this), new pp(this), a59.h, 2131232031, 2131231555);
            default:
                return super.onCreateDialog(i);
        }
    }

    static void w(GroupChatInfo groupChatInfo) {
        groupChatInfo.j();
    }

    static OnCheckedChangeListener p(GroupChatInfo groupChatInfo) {
        return groupChatInfo.E;
    }

    public void b() {
    }

    private void j() {
        try {
            if (App.B()) {
                runOnUiThread(new awo(this));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void t() {
        if (this.I.size() < a59.c) {
            Intent intent = new Intent(this, ContactPicker.class);
            try {
                intent.putExtra(Z[7], this.M);
                startActivityForResult(intent, 1);
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        new Builder(this).setTitle(getString(2131230798)).setMessage(getString(2131231349, new Object[]{Integer.valueOf(a59.c)})).setPositiveButton(getString(2131231580), new w1(this)).create().show();
    }

    private void w() {
        if (App.Q()) {
            try {
                startActivity(new Intent(App.z().getApplicationContext(), Main.e()).putExtra(Z[12], this.X.p).addFlags(603979776));
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        App.a(getBaseContext(), 2131231140, 0);
    }

    static void g(GroupChatInfo groupChatInfo) {
        groupChatInfo.w();
    }

    private void s() {
        TextView textView = (TextView) findViewById(2131755187);
        try {
            int i;
            if (a3b.a((Context) this).b(this.M).k()) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void a(GroupChatInfo groupChatInfo) {
        groupChatInfo.l();
    }

    public void e(String str) {
        try {
            if (TextUtils.equals(this.M, str)) {
                runOnUiThread(new pd(this));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static ListView d(GroupChatInfo groupChatInfo) {
        return groupChatInfo.z;
    }

    static void a(GroupChatInfo groupChatInfo, View view) {
        groupChatInfo.a(view);
    }

    public void onResume() {
        this.Y.b(t4.ON_RESUME);
        super.onResume();
        j();
        this.Y.a(t4.ON_RESUME);
    }

    static l5 y(GroupChatInfo groupChatInfo) {
        return groupChatInfo.K;
    }

    public void c(String str) {
    }

    public void finishAfterTransition() {
        if (VERSION.SDK_INT >= 21) {
            this.U.setTransitionName(null);
            Transition transitionSet = new TransitionSet();
            Transition slide = new Slide(48);
            slide.addTarget(this.U);
            transitionSet.addTransition(slide);
            slide = new Slide(80);
            slide.addTarget(this.z);
            transitionSet.addTransition(slide);
            getWindow().setReturnTransition(transitionSet);
        }
        super.finishAfterTransition();
    }

    static void c(GroupChatInfo groupChatInfo, String str) {
        groupChatInfo.m(str);
    }

    static View m(GroupChatInfo groupChatInfo) {
        return groupChatInfo.B;
    }

    private void i() {
        ViewGroup viewGroup = (ViewGroup) findViewById(2131755195);
        this.W = new SwitchCompat(this);
        ((CompoundButton) this.W).setOnCheckedChangeListener(this.E);
        viewGroup.addView(this.W);
    }

    private void b(int i) {
        switch (i) {
            case 400:
            case 401:
            case 404:
                break;
            case 406:
                try {
                    App.b(App.z().getApplicationContext(), App.z().getApplicationContext().getString(2131232086, new Object[]{Integer.valueOf(a59.h)}), 0);
                    App.aX();
                    if (!DialogToastActivity.f) {
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
                break;
            default:
                return;
        }
        App.a(App.z().getApplicationContext(), 2131232084, 0);
    }

    private void m() {
        startActivity(new Intent(App.z().getApplicationContext(), Main.e()).putExtra(Z[13], this.X.p).addFlags(603979776));
    }

    static HashMap r(GroupChatInfo groupChatInfo) {
        return groupChatInfo.L;
    }

    private void y() {
        this.N = new vk(this);
        bq.a(this.N, new Void[0]);
    }

    static void s(GroupChatInfo groupChatInfo) {
        groupChatInfo.t();
    }

    public void b(String str) {
    }

    private boolean c(int i) {
        try {
            if (this.K != null) {
                switch (i) {
                    case v.m /*0*/:
                        try {
                            if (this.K.l != null) {
                                ContactInfo.a(this.K, (Activity) this);
                                break;
                            }
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                        break;
                    case at.g /*1*/:
                        startActivity(Conversation.a(this.K));
                        break;
                    case at.i /*2*/:
                        p();
                        break;
                    case at.o /*3*/:
                        u();
                        break;
                    case at.p /*4*/:
                        App.a(this.K, (Activity) this, cd.GROUP_CHAT_INFO, false);
                        break;
                    case at.m /*5*/:
                        showDialog(6);
                        break;
                    case Y.f /*6*/:
                        k(this.K.p);
                        break;
                    case aF.v /*7*/:
                        o(this.K.p);
                        break;
                    case aF.u /*8*/:
                        Intent intent = new Intent(this, IdentityVerificationActivity.class);
                        intent.putExtra(Z[9], this.K.p);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
            return true;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case at.g /*1*/:
                    t();
                    return true;
                case 16908332:
                    ActivityCompat.finishAfterTransition(this);
                    return true;
                default:
                    return super.onOptionsItemSelected(menuItem);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
        throw e;
    }
}
