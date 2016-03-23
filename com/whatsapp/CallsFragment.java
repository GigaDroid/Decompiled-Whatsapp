package com.whatsapp;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.whatsapp.fieldstats.cd;
import com.whatsapp.util.Log;
import com.whatsapp.util.ap;
import com.whatsapp.util.bq;
import com.whatsapp.util.bz;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class CallsFragment extends ListFragment implements o3 {
    private static final String[] z;
    private final a34 b;
    private ce c;
    private CharSequence d;
    ap e;
    private final Runnable f;
    private final tm g;
    private boolean h;
    private ArrayList i;
    private final aau j;
    private ArrayList k;
    private a2_ l;
    private zj m;
    private ax7 n;
    private ArrayList o;

    public class ClearCallLogDialogFragment extends DialogFragment {
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(2131230917).setPositiveButton(2131231580, new amt(this)).setNegativeButton(2131230884, null).create();
        }
    }

    static {
        String[] strArr = new String[5];
        String str = "l\u001ew+\fwL}\u007f\u0019j\u0018.d\rl\u000bab\u0016\u007fLmj\u0014tLhy\u0017uLoh\fq\u001ak+\u000ew\u0005~+\u001by\u0000b";
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
                        i3 = 24;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 14;
                        break;
                    case at.o /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = 120;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "{\rbg(q\u000fen\n";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "[\rbg>j\rif\u001dv\u0018Ge\u0011l";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "{\rbg\u000b7\bkx\fj\u0003w";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "{\u0003`\u007f\u0019{\u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void g(CallsFragment callsFragment) {
        callsFragment.e();
    }

    static ArrayList b(CallsFragment callsFragment, ArrayList arrayList) {
        callsFragment.k = arrayList;
        return arrayList;
    }

    static ArrayList j(CallsFragment callsFragment) {
        return callsFragment.i;
    }

    private void c() {
        if (this.n != null) {
            this.n.cancel(true);
        }
        this.n = new ax7(this, null);
        bq.a(this.n, new Void[0]);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.b(t4.ON_CREATE_VIEW);
        View a = HomeActivity.a(layoutInflater.inflate(2130903089, viewGroup, false), (Fragment) this);
        this.c.a(t4.ON_CREATE_VIEW);
        return a;
    }

    static ArrayList a(CallsFragment callsFragment, ArrayList arrayList) {
        callsFragment.i = arrayList;
        return arrayList;
    }

    public void onDestroy() {
        Log.i(z[4]);
        super.onDestroy();
        this.c.b();
        App.a(this.g);
        App.a(this.b);
        App.a(this.j);
        this.l.a();
        App.p.M().removeCallbacks(this.f);
    }

    static void i(CallsFragment callsFragment) {
        callsFragment.c();
    }

    static CharSequence a(CallsFragment callsFragment, CharSequence charSequence) {
        callsFragment.d = charSequence;
        return charSequence;
    }

    static void b(CallsFragment callsFragment) {
        callsFragment.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
        r11 = this;
        r10 = 2131755381; // 0x7f100175 float:1.914164E38 double:1.053227099E-314;
        r9 = 2131755380; // 0x7f100174 float:1.9141638E38 double:1.0532270986E-314;
        r8 = 2131755379; // 0x7f100173 float:1.9141636E38 double:1.053227098E-314;
        r7 = 0;
        r6 = 8;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = r11.getView();
        if (r2 == 0) goto L_0x0139;
    L_0x0014:
        r0 = r11.i;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00ed;
    L_0x001c:
        r0 = r11.n;
        if (r0 == 0) goto L_0x004b;
    L_0x0020:
        r0 = 2131755382; // 0x7f100176 float:1.9141642E38 double:1.0532270996E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r7);
        r0 = r2.findViewById(r8);
        r0.setVisibility(r6);
        r0 = 2131755377; // 0x7f100171 float:1.9141632E38 double:1.053227097E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r6);
        r0 = r2.findViewById(r9);
        r0.setVisibility(r6);
        r0 = r2.findViewById(r10);
        r0.setVisibility(r6);
        if (r1 == 0) goto L_0x0139;
    L_0x004b:
        r0 = com.whatsapp.App.as;
        r0 = r0.d();
        if (r0 <= 0) goto L_0x00a8;
    L_0x0053:
        r0 = 2131755382; // 0x7f100176 float:1.9141642E38 double:1.0532270996E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r6);
        r0 = r2.findViewById(r8);
        r0.setVisibility(r6);
        r0 = 2131755377; // 0x7f100171 float:1.9141632E38 double:1.053227097E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r7);
        r0 = r2.findViewById(r9);
        r0.setVisibility(r6);
        r0 = r2.findViewById(r10);
        r0.setVisibility(r6);
        r0 = 2131755378; // 0x7f100172 float:1.9141634E38 double:1.0532270976E-314;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3 = r11.getResources();
        r4 = 2131232288; // 0x7f080620 float:1.8080681E38 double:1.052968657E-314;
        r3 = r3.getString(r4);
        r4 = r11.getResources();
        r5 = 2130839536; // 0x7f0207f0 float:1.7284085E38 double:1.0527746115E-314;
        r4 = r4.getDrawable(r5);
        r5 = r0.getPaint();
        r3 = com.whatsapp.util.ah.a(r3, r4, r5);
        r0.setText(r3);
        if (r1 == 0) goto L_0x0139;
    L_0x00a8:
        r0 = r11.getContext();
        r0 = com.whatsapp.App.v(r0);
        if (r0 == 0) goto L_0x00c2;
    L_0x00b2:
        r0 = r2.findViewById(r9);
        r0.setVisibility(r7);
        r0 = r2.findViewById(r10);
        r0.setVisibility(r6);
        if (r1 == 0) goto L_0x00d0;
    L_0x00c2:
        r0 = r2.findViewById(r9);
        r0.setVisibility(r6);
        r0 = r2.findViewById(r10);
        r0.setVisibility(r7);
    L_0x00d0:
        r0 = 2131755382; // 0x7f100176 float:1.9141642E38 double:1.0532270996E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r6);
        r0 = r2.findViewById(r8);
        r0.setVisibility(r6);
        r0 = 2131755377; // 0x7f100171 float:1.9141632E38 double:1.053227097E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r6);
        if (r1 == 0) goto L_0x0139;
    L_0x00ed:
        r0 = r11.d;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0139;
    L_0x00f5:
        r0 = 2131755382; // 0x7f100176 float:1.9141642E38 double:1.0532270996E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r6);
        r0 = r2.findViewById(r8);
        r0.setVisibility(r7);
        r0 = r2.findViewById(r8);
        r0 = (android.widget.TextView) r0;
        r1 = r2.getContext();
        r3 = 2131231851; // 0x7f08046b float:1.8079795E38 double:1.052968441E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = r11.d;
        r4[r7] = r5;
        r1 = r1.getString(r3, r4);
        r0.setText(r1);
        r0 = 2131755377; // 0x7f100171 float:1.9141632E38 double:1.053227097E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r6);
        r0 = r2.findViewById(r9);
        r0.setVisibility(r6);
        r0 = r2.findViewById(r10);
        r0.setVisibility(r6);
    L_0x0139:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CallsFragment.e():void");
    }

    static CharSequence c(CallsFragment callsFragment) {
        return callsFragment.d;
    }

    static ArrayList a(CallsFragment callsFragment) {
        return callsFragment.k;
    }

    static ArrayList e(CallsFragment callsFragment) {
        return callsFragment.o;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r3 = this;
        r0 = r3.h;
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = r3.c;
        r0 = r0.c();
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r3.m;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0026;
    L_0x0015:
        r0 = r3.c;
        r1 = com.whatsapp.a5a.COUNT;
        r2 = 0;
        r0.a(r1, r2);
        r0 = r3.c;
        r0.d();
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0045;
    L_0x0026:
        r0 = r3.c;
        r1 = com.whatsapp.a5a.COUNT;
        r2 = r3.m;
        r2 = r2.getCount();
        r0.a(r1, r2);
        r0 = r3.getListView();
        r1 = r3.c;
        com.whatsapp.a2c.b(r0, r1);
        r0 = r3.getListView();
        r1 = r3.c;
        com.whatsapp.a2c.a(r0, r1);
    L_0x0045:
        r0 = 1;
        r3.h = r0;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CallsFragment.b():void");
    }

    private void d() {
        App.p.M().removeCallbacks(this.f);
        if (!this.i.isEmpty() && getActivity() != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long c = currentTimeMillis - ((rd) this.i.get(0)).c();
            if (c < 3600000) {
                App.p.M().postDelayed(this.f, (((((rd) this.i.get(0)).c() + ((c / 60000) * 60000)) + 60000) - currentTimeMillis) + 1000);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            if (c < 86400000) {
                App.p.M().postDelayed(this.f, (((((rd) this.i.get(0)).c() + ((c / 3600000) * 3600000)) + 3600000) - currentTimeMillis) + 1000);
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.c.b();
    }

    static a2_ d(CallsFragment callsFragment) {
        return callsFragment.l;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case arj.Theme_radioButtonStyle /*105*/:
                if (i2 == -1) {
                    App.a(App.as.b(intent.getStringExtra(z[1])), getActivity(), cd.SELECT_CONTACT, false);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                return;
                break;
            case 150:
                break;
            default:
                return;
        }
        if (i2 == -1) {
            a();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z = DialogToastActivity.f;
        if (menuItem.getItemId() == 2131755040) {
            if (Voip.d()) {
                Log.w(z[0]);
                App.a(getActivity(), 2131231103, 0);
                if (!z) {
                    return true;
                }
            }
            if (App.v(getActivity())) {
                a();
                if (!z) {
                    return true;
                }
            }
            RequestPermissionActivity.b(getActivity(), 2131231613, 2131231612);
            return true;
        } else if (menuItem.getItemId() != 2131755020) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (!isResumed()) {
                return true;
            }
            new ClearCallLogDialogFragment().show(getFragmentManager(), null);
            return true;
        }
    }

    public CallsFragment() {
        this.l = new a2_();
        this.i = new ArrayList();
        this.k = new ArrayList();
        this.h = false;
        this.g = new xq(this);
        this.b = new a3_(this);
        this.j = new aug(this);
        this.f = new axg(this);
        this.e = new yk(this);
    }

    private void a() {
        Intent intent = new Intent(getActivity(), ContactPicker.class);
        intent.putExtra(z[2], true);
        startActivityForResult(intent, arj.Theme_radioButtonStyle);
    }

    static ax7 a(CallsFragment callsFragment, ax7 com_whatsapp_ax7) {
        callsFragment.n = com_whatsapp_ax7;
        return com_whatsapp_ax7;
    }

    static zj h(CallsFragment callsFragment) {
        return callsFragment.m;
    }

    public void onActivityCreated(Bundle bundle) {
        boolean z;
        this.c.b(t4.ON_ACTIVITY_CREATED);
        super.onActivityCreated(bundle);
        setHasOptionsMenu(true);
        ListView listView = getListView();
        listView.setDivider(new bz(getResources().getDrawable(2130837747)));
        if (VERSION.SDK_INT < 11) {
            z = true;
        } else {
            z = false;
        }
        listView.setFastScrollEnabled(z);
        if (VERSION.SDK_INT < 11) {
            listView.setSelector(2130839767);
        }
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new eg(this));
        getView().findViewById(2131755382).setVisibility(0);
        this.m = new zj(this);
        setListAdapter(this.m);
        App.b(this.g);
        App.b(this.b);
        App.b(this.j);
        getView().findViewById(2131755660).setOnClickListener(new y9(this));
        getView().findViewById(2131755659).setOnClickListener(new y3(this));
        c();
        this.c.a(t4.ON_ACTIVITY_CREATED);
    }

    static void f(CallsFragment callsFragment) {
        callsFragment.d();
    }

    public void a(CharSequence charSequence) {
        this.d = charSequence;
        this.m.getFilter().filter(charSequence);
    }

    static ArrayList c(CallsFragment callsFragment, ArrayList arrayList) {
        callsFragment.o = arrayList;
        return arrayList;
    }

    public void onCreate(Bundle bundle) {
        this.c = tp.a(z[3]);
        this.c.e();
        this.c.b(t4.ON_CREATE);
        super.onCreate(bundle);
        this.c.a(t4.ON_CREATE);
    }
}
