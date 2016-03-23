package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.appcompat.R;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class StarredMessagesActivity extends ConversationRowsActivity implements LoaderCallbacks, b2 {
    private static final String[] F;
    private MenuItem A;
    private final tm B;
    private final akc C;
    private String D;
    private ArrayList E;
    private String w;
    private a2_ x;
    private MenuItem y;
    private w6 z;

    public class UnstarAllDialogFragment extends DialogFragment {
        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(2131232184).setPositiveButton(2131231829, new aza(this)).setNegativeButton(2131230884, null).create();
        }
    }

    static {
        String[] strArr = new String[15];
        String str = "4Wb";
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
                        i3 = 94;
                        break;
                    case at.g /*1*/:
                        i3 = 62;
                        break;
                    case at.i /*2*/:
                        i3 = 6;
                        break;
                    case at.o /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 91;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "-JgX);Z)I);_rOt0Q+G>sQt\u00076-Yu^4,[+N9";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "-JgX);Z)I);_rO";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "-[jO8*[bu6;MuK<;M";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "-JgX);Z)N>-JtE\"";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "/KcX\"";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "-JgX);Z)N2?RiMt:[jO/;\u001ehE{3[uY:9[u";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "-JgX);Z)N2?RiMt:[jO/;\u0011";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "-JgX);Z)Y>2[e^21PtO*+[u^>:";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "-[jO8*[bu6;MuK<;M";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u000bPu^:,\u007fjF\u001f7_jE<\u0018LgM6;Pr";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "=Qh^:=J";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "-JgX);Z)L4,IgX?qXgC7;Z";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "/KcX\"";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    F = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "-JgX);Z&H4+PeO{*Q&G:7P";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ArrayList m485d() {
        return this.E;
    }

    public void a(Loader loader, Cursor cursor) {
        this.z.swapCursor(cursor);
        f();
        if (TextUtils.isEmpty(this.w)) {
            if (this.z.isEmpty()) {
                if (this.A != null) {
                    this.A.setVisible(false);
                }
                if (this.y != null) {
                    this.y.setVisible(false);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                return;
            }
            if (this.A != null) {
                this.A.setVisible(true);
            }
            if (this.y != null) {
                this.y.setVisible(true);
            }
        }
    }

    static void c(StarredMessagesActivity starredMessagesActivity) {
        starredMessagesActivity.a();
    }

    private void d() {
        Bundle bundle = null;
        if (!TextUtils.isEmpty(this.w)) {
            bundle = new Bundle();
            bundle.putString(F[6], this.w);
        }
        getSupportLoaderManager().restartLoader(0, bundle, this);
    }

    public boolean c() {
        return true;
    }

    public Loader onCreateLoader(int i, Bundle bundle) {
        return new ang(this, bundle == null ? null : bundle.getString(F[14]), this.D);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
        r4 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        switch(r5) {
            case 2: goto L_0x0006;
            default: goto L_0x0005;
        };
    L_0x0005:
        return;
    L_0x0006:
        r0 = -1;
        if (r6 != r0) goto L_0x0005;
    L_0x0009:
        r0 = r4.u;
        if (r0 == 0) goto L_0x0045;
    L_0x000d:
        r0 = F;
        r2 = 12;
        r0 = r0[r2];
        r0 = r7.getStringExtra(r0);
        r2 = com.whatsapp.App.as;
        r2 = r2.b(r0);
        r0 = r4.u;
        r0 = r0.values();
        r0 = com.whatsapp.qa.a(r0);
        r3 = r0.iterator();
    L_0x002b:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x003c;
    L_0x0031:
        r0 = r3.next();
        r0 = (com.whatsapp.protocol.co) r0;
        com.whatsapp.App.a(r0, r2);
        if (r1 == 0) goto L_0x002b;
    L_0x003c:
        r0 = com.whatsapp.Conversation.a(r2);
        r4.startActivity(r0);
        if (r1 == 0) goto L_0x0055;
    L_0x0045:
        r0 = F;
        r1 = 13;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = 2131231451; // 0x7f0802db float:1.8078983E38 double:1.0529682433E-314;
        r1 = 0;
        com.whatsapp.App.a(r4, r0, r1);
    L_0x0055:
        r4.b();
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.StarredMessagesActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    private void a() {
        f(2131231813);
        bq.a(new va(this, SystemClock.elapsedRealtime()), new Void[0]);
    }

    static a2_ b(StarredMessagesActivity starredMessagesActivity) {
        return starredMessagesActivity.x;
    }

    static String a(StarredMessagesActivity starredMessagesActivity, String str) {
        starredMessagesActivity.w = str;
        return str;
    }

    static void a(StarredMessagesActivity starredMessagesActivity) {
        starredMessagesActivity.f();
    }

    public StarredMessagesActivity() {
        this.x = new a2_();
        this.C = new ate(this);
        this.B = new j_(this);
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case Y.q /*13*/:
                if (this.u == null || this.u.isEmpty()) {
                    Log.e(F[7]);
                    return super.onCreateDialog(i);
                }
                Log.i(F[8] + this.u.size());
                return aea.a(this, this.u.values(), null, 13, new avs(this));
            default:
                return null;
        }
    }

    public void onLoaderReset(Loader loader) {
        this.z.swapCursor(null);
    }

    static void e(StarredMessagesActivity starredMessagesActivity) {
        starredMessagesActivity.d();
    }

    private void f() {
        boolean z = DialogToastActivity.f;
        if (this.z.getCursor() == null) {
            findViewById(2131755906).setVisibility(8);
            findViewById(2131755379).setVisibility(8);
            findViewById(2131755623).setVisibility(0);
            if (!z) {
                return;
            }
        }
        if (!(this.E == null || this.E.isEmpty())) {
            findViewById(2131755906).setVisibility(8);
            TextView textView = (TextView) findViewById(2131755379);
            textView.setVisibility(0);
            textView.setText(getString(2131231851, new Object[]{this.w}));
            findViewById(2131755623).setVisibility(8);
            if (!z) {
                return;
            }
        }
        findViewById(2131755906).setVisibility(0);
        findViewById(2131755379).setVisibility(8);
        findViewById(2131755623).setVisibility(8);
    }

    static w6 f(StarredMessagesActivity starredMessagesActivity) {
        return starredMessagesActivity.z;
    }

    public boolean onSearchRequested() {
        if (this.A != null) {
            MenuItemCompat.expandActionView(this.A);
        }
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        boolean z2 = true;
        this.y = menu.add(0, 2131755057, 0, 2131232183);
        MenuItemCompat.setShowAsAction(this.y, 0);
        MenuItem menuItem = this.y;
        if (b().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        menuItem.setVisible(z);
        if (App.aK.I()) {
            View searchView = new SearchView(getSupportActionBar().getThemedContext());
            ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(getResources().getColor(R.color.primary_text_default_material_dark));
            searchView.setQueryHint(getString(2131231848));
            searchView.setOnQueryTextListener(new alx(this));
            this.A = menu.add(0, 2131755047, 0, 2131231845).setIcon(2130839445);
            MenuItem menuItem2 = this.A;
            if (b().isEmpty()) {
                z2 = false;
            }
            menuItem2.setVisible(z2);
            MenuItemCompat.setActionView(this.A, searchView);
            MenuItemCompat.setShowAsAction(this.A, 10);
            MenuItemCompat.setOnActionExpandListener(this.A, new s3(this));
        }
        return super.onCreateOptionsMenu(menu);
    }

    private void a(co coVar) {
        a().post(new a3o(this, coVar));
    }

    protected void onSaveInstanceState(Bundle bundle) {
        boolean z = DialogToastActivity.f;
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = new ArrayList();
        if (this.u != null) {
            for (co coVar : this.u.values()) {
                arrayList.add(new a4p(coVar.k));
                if (z) {
                    break;
                }
            }
            bundle.putParcelableArrayList(F[10], arrayList);
        }
    }

    static void a(StarredMessagesActivity starredMessagesActivity, co coVar) {
        starredMessagesActivity.a(coVar);
    }

    public void onDestroy() {
        Log.i(F[5]);
        super.onDestroy();
        this.x.a();
        App.aK.a(this.C);
        App.a(this.B);
    }

    static ArrayList a(StarredMessagesActivity starredMessagesActivity, ArrayList arrayList) {
        starredMessagesActivity.E = arrayList;
        return arrayList;
    }

    public void onCreate(Bundle bundle) {
        boolean z = DialogToastActivity.f;
        Log.i(F[3]);
        super.onCreate(bundle);
        h();
        getSupportActionBar().setElevation(getResources().getDimension(2131427411));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        App.aK.b(this.C);
        App.b(this.B);
        if (App.ay != null && App.aK.E() && App.t((Context) this) == 3) {
            boolean z2;
            this.D = getIntent().getStringExtra(F[0]);
            setContentView(2130903277);
            this.z = new w6(this);
            ListView a = a();
            if (VERSION.SDK_INT < 11) {
                z2 = true;
            } else {
                z2 = false;
            }
            a.setFastScrollEnabled(z2);
            if (VERSION.SDK_INT < 11) {
                a.setSelector(2130839767);
            }
            a.setScrollbarFadingEnabled(true);
            a(this.z);
            getSupportLoaderManager().initLoader(0, null, this);
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(F[4]);
                if (parcelableArrayList != null) {
                    this.u = new HashMap();
                    Iterator it = parcelableArrayList.iterator();
                    while (it.hasNext()) {
                        a4p com_whatsapp_a4p = (a4p) ((Parcelable) it.next());
                        this.u.put(com_whatsapp_a4p.a, App.aK.a(com_whatsapp_a4p.a));
                        if (z) {
                            break;
                        }
                    }
                    g();
                    i();
                }
            }
            f();
            return;
        }
        Log.i(F[2]);
        App.v(F[1]);
        startActivity(new Intent(this, Main.class));
        finish();
    }

    boolean g() {
        if (this.v != null) {
            return false;
        }
        Log.i(F[9]);
        this.z.notifyDataSetChanged();
        this.v = startSupportActionMode(new adj(this, this));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131755057) {
            return super.onOptionsItemSelected(menuItem);
        }
        new UnstarAllDialogFragment().show(getSupportFragmentManager(), F[11]);
        return true;
    }

    public void onLoadFinished(Loader loader, Object obj) {
        a(loader, (Cursor) obj);
    }

    static String d(StarredMessagesActivity starredMessagesActivity) {
        return starredMessagesActivity.D;
    }

    public String b() {
        return this.w;
    }
}
