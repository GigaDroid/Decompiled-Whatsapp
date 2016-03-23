package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

public abstract class MultipleContactsSelector extends DialogToastActivity implements tm {
    private static final String[] z;
    final TextWatcher n;
    OnItemClickListener o;
    protected AutoCompleteTextView p;
    private pr q;
    private ImageButton r;
    private ArrayList s;
    private a2_ t;
    protected TextView u;
    private ArrayList v;
    protected ArrayList w;
    private avx x;

    static {
        String[] strArr = new String[4];
        String str = "7'_n\u0000*>Vy\u00064&Ry\u001d)!Vv\f9&\\hF>7@n\u001b5+";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = 82;
                        break;
                    case at.i /*2*/:
                        i3 = 51;
                        break;
                    case at.o /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "7'_n\u0000*>Vy\u00064&Ry\u001d)!Vv\f9&\\hF9 V{\u001d?";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "0;Wi";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "0;Wi";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected abstract String c();

    protected abstract void d();

    protected abstract int e();

    protected abstract int f();

    protected abstract int g();

    protected abstract String j();

    protected abstract int k();

    static pr d(MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.q;
    }

    static ArrayList b(MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.v;
    }

    private ArrayList a() {
        ArrayList arrayList = new ArrayList();
        App.as.d(arrayList);
        Collections.sort(arrayList, new a3d(getApplicationContext()));
        return arrayList;
    }

    public void b(String str) {
    }

    public MultipleContactsSelector() {
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.q = new pr(this, null);
        this.t = new a2_();
        this.o = new ix(this);
        this.n = new rh(this);
    }

    protected void a(ListView listView) {
    }

    public void a(Collection collection) {
    }

    public void m477a(String str) {
        l5 b = App.as.b(str);
        if (b != null) {
            dk com_whatsapp_aa_ = new aa_(b);
            if (l5.a(this.v, com_whatsapp_aa_)) {
                this.x.notifyDataSetChanged();
            }
            if (l5.a(this.w, com_whatsapp_aa_)) {
                this.q.notifyDataSetChanged();
            }
        }
    }

    protected String b() {
        boolean z = DialogToastActivity.f;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            l5 l5Var = (l5) it.next();
            if (stringBuilder.length() != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(l5Var.p);
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[2]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setTitle(j());
        setContentView(2130903233);
        ((TextView) findViewById(2131755797)).setText(c());
        this.u = (TextView) findViewById(2131755798);
        this.r = (ImageButton) findViewById(2131755544);
        this.r.setOnClickListener(new a4s(this));
        this.v = a();
        this.x = new avx(this);
        this.p = (AutoCompleteTextView) findViewById(2131755799);
        this.p.setAdapter(this.x);
        this.p.setOnItemClickListener(this.o);
        this.p.setThreshold(1);
        aam.a(this.p);
        aam.a(this.p, 0, getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material));
        ListView listView = (ListView) findViewById(16908298);
        a(listView);
        listView.setAdapter(this.q);
        akz.a(this, getSupportActionBar(), getString(f()).toUpperCase(), new aa5(this));
        i();
        this.p.addTextChangedListener(this.n);
        Object stringExtra = getIntent().getStringExtra(z[1]);
        if (!TextUtils.isEmpty(stringExtra)) {
            e(stringExtra);
        }
        App.b((tm) this);
    }

    static boolean a(MultipleContactsSelector multipleContactsSelector, String str) {
        return multipleContactsSelector.a(str);
    }

    public void c(String str) {
    }

    static a2_ c(MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.t;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                break;
        }
        return true;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case at.g /*1*/:
                if (i2 == -1) {
                    Object stringExtra = intent.getStringExtra(z[3]);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        e(stringExtra);
                    }
                    if (DialogToastActivity.f) {
                        break;
                    }
                    return;
                }
                return;
        }
        super.onActivityResult(i, i2, intent);
    }

    static ArrayList a(MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.s;
    }

    protected void i() {
        boolean z = DialogToastActivity.f;
        if (this.w.size() == 0) {
            this.u.setText("");
            if (!z) {
                return;
            }
        }
        if (e() > 0) {
            this.u.setText(Integer.toString(this.w.size()) + "/" + e());
            if (!z) {
                return;
            }
        }
        this.u.setText(Integer.toString(this.w.size()));
    }

    public void d(String str) {
        if (!qm.i(str)) {
            l5 b = App.as.b(str);
            if (b != null) {
                dk com_whatsapp_aas = new aas(b);
                if (l5.a(this.v, com_whatsapp_aas)) {
                    this.x.notifyDataSetChanged();
                }
                if (l5.a(this.w, com_whatsapp_aas)) {
                    this.q.notifyDataSetChanged();
                }
            }
        }
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
        this.t.a();
        App.a((tm) this);
    }

    private boolean a(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            if (!str.equals(((l5) it.next()).p)) {
                if (z) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    protected void e(String str) {
        boolean z = DialogToastActivity.f;
        this.w.clear();
        String[] split = str.split(",");
        int length = split.length;
        int i = 0;
        while (i < length) {
            this.w.add(App.as.b(split[i]));
            i++;
            if (z) {
                break;
            }
        }
        this.p.setText("");
        this.q.notifyDataSetChanged();
        i();
    }

    public void m476a() {
        boolean z = DialogToastActivity.f;
        this.v = a();
        Collection arrayList = new ArrayList();
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            l5 l5Var = (l5) it.next();
            Iterator it2 = this.v.iterator();
            while (it2.hasNext()) {
                l5 l5Var2 = (l5) it2.next();
                if (TextUtils.equals(l5Var2.p, l5Var.p)) {
                    arrayList.add(l5Var2);
                    if (!z) {
                        break;
                        continue;
                    }
                }
                if (z) {
                    break;
                    continue;
                }
            }
            if (z) {
                break;
            }
        }
        this.w.clear();
        this.w.addAll(arrayList);
        this.x.notifyDataSetChanged();
        this.q.notifyDataSetChanged();
    }

    static ArrayList a(MultipleContactsSelector multipleContactsSelector, ArrayList arrayList) {
        multipleContactsSelector.s = arrayList;
        return arrayList;
    }
}
