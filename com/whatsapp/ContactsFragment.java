package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.fieldstats.c;
import com.whatsapp.fieldstats.k;
import com.whatsapp.util.bq;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.v;
import org.whispersystems.at;

public class ContactsFragment extends ListFragment implements o3, tm {
    private static final String[] z;
    private ArrayList b;
    private HashMap c;
    private ce d;
    private Handler e;
    private ArrayList f;
    private a2_ g;
    private ar8 h;
    private boolean i;
    private CharSequence j;
    private Callback k;
    private final ArrayList l;
    private ActionMode m;
    private av7 n;
    private boolean o;

    static {
        String[] strArr = new String[5];
        String str = "\u00003H\u007fo (`yo$1Cez\n2O\u007f";
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 38;
                        break;
                    case at.o /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "52B%o-8Tdg'rE~|03T%j*.\tha-(Ghz";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "01U\u007fay";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "+(R{}ys\t|f\"(Uj~3rEdcl8J$";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\"2Bya*8\bb`79H\u007f \"?Rba-roE]\u0006\u000er";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void b(ContactsFragment contactsFragment) {
        contactsFragment.f();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131755041) {
            Intent intent = new Intent(z[1]);
            intent.setType(z[2]);
            try {
                startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                App.aa();
                return true;
            }
        }
        try {
            if (menuItem.getItemId() == 2131755054) {
                nf.a(k.TELL_A_FRIEND, c.CONTACTS_MENU);
                App.b(getActivity());
                return true;
            }
            try {
                if (menuItem.getItemId() == 2131755044) {
                    a(true);
                    return true;
                }
                try {
                    if (menuItem.getItemId() != 2131755021) {
                        return super.onOptionsItemSelected(menuItem);
                    }
                    g();
                    return true;
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
        r3 = this;
        r0 = r3.i;	 Catch:{ ActivityNotFoundException -> 0x000d }
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = r3.d;	 Catch:{ ActivityNotFoundException -> 0x000f }
        r0 = r0.c();	 Catch:{ ActivityNotFoundException -> 0x000f }
        if (r0 != 0) goto L_0x0011;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = r3.n;	 Catch:{ ActivityNotFoundException -> 0x004d }
        r0 = r0.isEmpty();	 Catch:{ ActivityNotFoundException -> 0x004d }
        if (r0 == 0) goto L_0x002a;
    L_0x0019:
        r0 = r3.d;	 Catch:{ ActivityNotFoundException -> 0x004f }
        r1 = com.whatsapp.a5a.COUNT;	 Catch:{ ActivityNotFoundException -> 0x004f }
        r2 = 0;
        r0.a(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x004f }
        r0 = r3.d;	 Catch:{ ActivityNotFoundException -> 0x004f }
        r0.d();	 Catch:{ ActivityNotFoundException -> 0x004f }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ ActivityNotFoundException -> 0x004f }
        if (r0 == 0) goto L_0x0049;
    L_0x002a:
        r0 = r3.d;	 Catch:{ ActivityNotFoundException -> 0x004f }
        r1 = com.whatsapp.a5a.COUNT;	 Catch:{ ActivityNotFoundException -> 0x004f }
        r2 = r3.n;	 Catch:{ ActivityNotFoundException -> 0x004f }
        r2 = r2.getCount();	 Catch:{ ActivityNotFoundException -> 0x004f }
        r0.a(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x004f }
        r0 = r3.getListView();	 Catch:{ ActivityNotFoundException -> 0x004f }
        r1 = r3.d;	 Catch:{ ActivityNotFoundException -> 0x004f }
        com.whatsapp.a2c.b(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x004f }
        r0 = r3.getListView();	 Catch:{ ActivityNotFoundException -> 0x004f }
        r1 = r3.d;	 Catch:{ ActivityNotFoundException -> 0x004f }
        com.whatsapp.a2c.a(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x004f }
    L_0x0049:
        r0 = 1;
        r3.i = r0;
        goto L_0x000c;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactsFragment.f():void");
    }

    static a2_ k(ContactsFragment contactsFragment) {
        return contactsFragment.g;
    }

    public void onResume() {
        try {
            super.onResume();
            if (!this.o) {
                if (App.v(getContext())) {
                    a(true);
                }
            }
            e();
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static void j(ContactsFragment contactsFragment) {
        contactsFragment.b();
    }

    public void onPause() {
        super.onPause();
        this.o = App.v(getContext());
        this.d.b();
    }

    static ArrayList b(ContactsFragment contactsFragment, CharSequence charSequence) {
        return contactsFragment.a(charSequence);
    }

    static CharSequence a(ContactsFragment contactsFragment, CharSequence charSequence) {
        contactsFragment.j = charSequence;
        return charSequence;
    }

    @Deprecated
    private void a(int i) {
    }

    public void a(String str) {
        try {
            if (l5.a(this.l, new aa_(App.as.b(str)))) {
                this.n.notifyDataSetChanged();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void b(String str) {
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        try {
            if (aup.a(((l5) ((ListView) view).getItemAtPosition(((AdapterContextMenuInfo) contextMenuInfo).position)).p)) {
                contextMenu.add(0, 2131755055, 0, String.format(getString(2131230843), new Object[]{r0.a(this.n.getContext())}));
                super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void c(String str) {
        try {
            if (l5.a(this.l, new aad(App.as.b(str)))) {
                this.n.notifyDataSetChanged();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void a(boolean z) {
        try {
            if (App.ay == null) {
                App.a(getActivity(), 2131231151, 1);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            ((AppCompatActivity) getActivity()).setSupportProgressBarIndeterminateVisibility(true);
            bq.a(new ar(this, z));
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static ActionMode a(ContactsFragment contactsFragment, ActionMode actionMode) {
        contactsFragment.m = actionMode;
        return actionMode;
    }

    static void h(ContactsFragment contactsFragment) {
        contactsFragment.c();
    }

    static HashMap a(ContactsFragment contactsFragment, HashMap hashMap) {
        contactsFragment.c = hashMap;
        return hashMap;
    }

    static av7 f(ContactsFragment contactsFragment) {
        return contactsFragment.n;
    }

    public boolean d() {
        try {
            if (this.m != null) {
                return false;
            }
            try {
                if (this.k == null) {
                    this.k = new uk(this);
                }
                this.n.notifyDataSetChanged();
                this.m = ((AppCompatActivity) getActivity()).startSupportActionMode(this.k);
                return true;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static CharSequence i(ContactsFragment contactsFragment) {
        return contactsFragment.j;
    }

    static ar8 a(ContactsFragment contactsFragment, ar8 com_whatsapp_ar8) {
        contactsFragment.h = com_whatsapp_ar8;
        return com_whatsapp_ar8;
    }

    static ArrayList d(ContactsFragment contactsFragment) {
        return contactsFragment.l;
    }

    static ArrayList a(ContactsFragment contactsFragment, ArrayList arrayList) {
        contactsFragment.f = arrayList;
        return arrayList;
    }

    public void d(String str) {
        try {
            if (l5.a(this.l, new aas(App.as.b(str)))) {
                this.n.notifyDataSetChanged();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    private void a(l5 l5Var) {
        nf.a(k.TELL_A_FRIEND, c.INVITE_NON_WA_CONTACT);
        App.a(getActivity(), Uri.parse(z[3] + l5Var.l.a()), getString(2131232144, new Object[]{z[4]}));
    }

    static ArrayList l(ContactsFragment contactsFragment) {
        return contactsFragment.f;
    }

    public void a(Collection collection) {
        this.n.notifyDataSetChanged();
    }

    private void g() {
        startActivity(new Intent(getActivity(), ContactPickerHelp.class));
    }

    public void onDestroy() {
        try {
            super.onDestroy();
            this.d.b();
            App.a((tm) this);
            if (this.h != null) {
                this.h.cancel(true);
            }
            this.g.a();
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131755055) {
            return super.onContextItemSelected(menuItem);
        }
        aup.a(getActivity(), false, ((l5) getListView().getItemAtPosition(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position)).p);
        return true;
    }

    public void a() {
        b();
    }

    private void b() {
        try {
            if (this.h != null) {
                this.h.cancel(true);
            }
            this.h = new ar8(this, null);
            bq.a(this.h, new Void[0]);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void onCreate(Bundle bundle) {
        this.d = tp.a(z[0]);
        this.d.e();
        this.d.b(t4.ON_CREATE);
        super.onCreate(bundle);
        this.d.a(t4.ON_CREATE);
    }

    static ArrayList g(ContactsFragment contactsFragment) {
        return contactsFragment.b;
    }

    private void e() {
        boolean z = DialogToastActivity.f;
        View view = getView();
        if (view != null) {
            try {
                if (this.l.isEmpty()) {
                    if (this.h != null) {
                        try {
                            view.findViewById(2131755468).setVisibility(8);
                            view.findViewById(2131755381).setVisibility(8);
                            view.findViewById(2131755469).setVisibility(0);
                            view.findViewById(2131755379).setVisibility(8);
                            if (!z) {
                                return;
                            }
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    }
                    try {
                        if (!App.v(getContext())) {
                            try {
                                view.findViewById(2131755468).setVisibility(8);
                                view.findViewById(2131755381).setVisibility(0);
                                view.findViewById(2131755469).setVisibility(8);
                                view.findViewById(2131755379).setVisibility(8);
                                if (!z) {
                                    return;
                                }
                            } catch (ActivityNotFoundException e2) {
                                throw e2;
                            }
                        }
                        try {
                            view.findViewById(2131755468).setVisibility(0);
                            view.findViewById(2131755381).setVisibility(8);
                            view.findViewById(2131755469).setVisibility(8);
                            view.findViewById(2131755379).setVisibility(8);
                            if (!z) {
                                return;
                            }
                        } catch (ActivityNotFoundException e22) {
                            throw e22;
                        }
                    } catch (ActivityNotFoundException e222) {
                        throw e222;
                    }
                }
                if (this.b.isEmpty()) {
                    view.findViewById(2131755468).setVisibility(8);
                    view.findViewById(2131755381).setVisibility(8);
                    view.findViewById(2131755469).setVisibility(8);
                    TextView textView = (TextView) view.findViewById(2131755379);
                    textView.setVisibility(0);
                    textView.setText(view.getContext().getString(2131231851, new Object[]{this.j}));
                }
            } catch (ActivityNotFoundException e2222) {
                throw e2222;
            } catch (ActivityNotFoundException e22222) {
                throw e22222;
            }
        }
    }

    static HashMap c(ContactsFragment contactsFragment) {
        return contactsFragment.c;
    }

    static Handler e(ContactsFragment contactsFragment) {
        return contactsFragment.e;
    }

    public void m463a(CharSequence charSequence) {
        this.n.getFilter().filter(charSequence);
    }

    static void a(ContactsFragment contactsFragment, int i) {
        contactsFragment.a(i);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.d.b(t4.ON_CREATE_VIEW);
        View a = HomeActivity.a(layoutInflater.inflate(2130903106, viewGroup, false), (Fragment) this);
        this.d.a(t4.ON_CREATE_VIEW);
        return a;
    }

    public ContactsFragment() {
        this.l = new ArrayList();
        this.b = new ArrayList();
        this.g = new a2_();
        this.e = new Handler(Looper.getMainLooper());
        this.i = false;
        this.o = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList a(java.lang.CharSequence r8) {
        /*
        r7 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = 0;
        if (r8 == 0) goto L_0x0053;
    L_0x0005:
        r0 = r8.toString();
        r0 = com.whatsapp.ael.h(r0);
        r1 = r0;
    L_0x000e:
        r3 = r7.l;
        monitor-enter(r3);
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x004a }
        r4.<init>();	 Catch:{ all -> 0x004a }
        if (r1 == 0) goto L_0x0041;
    L_0x0018:
        r0 = r1.isEmpty();	 Catch:{ ActivityNotFoundException -> 0x0048 }
        if (r0 != 0) goto L_0x0041;
    L_0x001e:
        r0 = r7.l;	 Catch:{ all -> 0x004a }
        r5 = r0.iterator();	 Catch:{ all -> 0x004a }
    L_0x0024:
        r0 = r5.hasNext();	 Catch:{ all -> 0x004a }
        if (r0 == 0) goto L_0x003f;
    L_0x002a:
        r0 = r5.next();	 Catch:{ all -> 0x004a }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ all -> 0x004a }
        r6 = r0.l;	 Catch:{ ActivityNotFoundException -> 0x004d }
        if (r6 == 0) goto L_0x003d;
    L_0x0034:
        r6 = r0.a(r1);	 Catch:{ ActivityNotFoundException -> 0x004d }
        if (r6 == 0) goto L_0x003d;
    L_0x003a:
        r4.add(r0);	 Catch:{ ActivityNotFoundException -> 0x004f }
    L_0x003d:
        if (r2 == 0) goto L_0x0024;
    L_0x003f:
        if (r2 == 0) goto L_0x0046;
    L_0x0041:
        r0 = r7.l;	 Catch:{ ActivityNotFoundException -> 0x0051 }
        r4.addAll(r0);	 Catch:{ ActivityNotFoundException -> 0x0051 }
    L_0x0046:
        monitor-exit(r3);	 Catch:{ all -> 0x004a }
        return r4;
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x004a }
        throw r0;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004a }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004a }
    L_0x0053:
        r1 = r0;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactsFragment.a(java.lang.CharSequence):java.util.ArrayList");
    }

    static void m(ContactsFragment contactsFragment) {
        contactsFragment.g();
    }

    private void c() {
        try {
            if (this.m != null) {
                if (this.c.size() == 0) {
                    try {
                        this.m.finish();
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                }
                this.m.setTitle(NumberFormat.getInstance().format((long) this.c.size()));
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    static void a(ContactsFragment contactsFragment, l5 l5Var) {
        contactsFragment.a(l5Var);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r10) {
        /*
        r9 = this;
        r8 = 11;
        r7 = 0;
        r6 = 1;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r9.d;
        r2 = com.whatsapp.t4.ON_ACTIVITY_CREATED;
        r1.b(r2);
        super.onActivityCreated(r10);
        r9.setHasOptionsMenu(r6);
        r9.b();
        r9.e();
        r1 = new com.whatsapp.avf;
        r2 = r9.getActivity();
        r3 = r9.b;
        r1.<init>(r9, r2, r3);
        r9.n = r1;
        r1 = r9.n;
        r9.setListAdapter(r1);
        r1 = r9.getListView();
        r2 = new com.whatsapp.util.bz;
        r3 = r9.getResources();
        r4 = 2130837747; // 0x7f0200f3 float:1.7280457E38 double:1.0527737277E-314;
        r3 = r3.getDrawable(r4);
        r2.<init>(r3);
        r1.setDivider(r2);
        r1.setFastScrollEnabled(r6);
        r1.setScrollbarFadingEnabled(r6);
        r2 = r9.getView();
        r3 = 2131755469; // 0x7f1001cd float:1.9141818E38 double:1.0532271426E-314;
        r2 = r2.findViewById(r3);
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ ActivityNotFoundException -> 0x0124 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x0124 }
        if (r2 < r8) goto L_0x00ab;
    L_0x005b:
        r2 = com.whatsapp.App.av;	 Catch:{ ActivityNotFoundException -> 0x0126 }
        if (r2 == 0) goto L_0x0086;
    L_0x005f:
        r2 = 1;
        r1.setVerticalScrollbarPosition(r2);	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r2 = r9.getResources();	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r3 = 2131427352; // 0x7f0b0018 float:1.8476318E38 double:1.053065031E-314;
        r2 = r2.getDimensionPixelSize(r3);	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r3 = r1.getPaddingTop();	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r4 = r9.getResources();	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r5 = 2131427351; // 0x7f0b0017 float:1.8476316E38 double:1.0530650307E-314;
        r4 = r4.getDimensionPixelSize(r5);	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r5 = r1.getPaddingBottom();	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r1.setPadding(r2, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x0128 }
        if (r0 == 0) goto L_0x00ab;
    L_0x0086:
        r2 = 2;
        r1.setVerticalScrollbarPosition(r2);	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r2 = r9.getResources();	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r3 = 2131427351; // 0x7f0b0017 float:1.8476316E38 double:1.0530650307E-314;
        r2 = r2.getDimensionPixelSize(r3);	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r3 = r1.getPaddingTop();	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r4 = r9.getResources();	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r5 = 2131427352; // 0x7f0b0018 float:1.8476318E38 double:1.053065031E-314;
        r4 = r4.getDimensionPixelSize(r5);	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r5 = r1.getPaddingBottom();	 Catch:{ ActivityNotFoundException -> 0x0128 }
        r1.setPadding(r2, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x0128 }
    L_0x00ab:
        r2 = r9.getView();	 Catch:{ ActivityNotFoundException -> 0x012a }
        r3 = 2131755660; // 0x7f10028c float:1.9142206E38 double:1.053227237E-314;
        r2 = r2.findViewById(r3);	 Catch:{ ActivityNotFoundException -> 0x012a }
        r3 = new com.whatsapp.yn;	 Catch:{ ActivityNotFoundException -> 0x012a }
        r3.<init>(r9);	 Catch:{ ActivityNotFoundException -> 0x012a }
        r2.setOnClickListener(r3);	 Catch:{ ActivityNotFoundException -> 0x012a }
        r2 = 1;
        r1.setTextFilterEnabled(r2);	 Catch:{ ActivityNotFoundException -> 0x012a }
        r2 = r9.getView();	 Catch:{ ActivityNotFoundException -> 0x012a }
        r3 = 2131755659; // 0x7f10028b float:1.9142204E38 double:1.0532272364E-314;
        r2 = r2.findViewById(r3);	 Catch:{ ActivityNotFoundException -> 0x012a }
        r3 = new com.whatsapp.yu;	 Catch:{ ActivityNotFoundException -> 0x012a }
        r3.<init>(r9);	 Catch:{ ActivityNotFoundException -> 0x012a }
        r2.setOnClickListener(r3);	 Catch:{ ActivityNotFoundException -> 0x012a }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x012a }
        if (r2 < r8) goto L_0x00e4;
    L_0x00d9:
        r2 = 1;
        r1.setFastScrollAlwaysVisible(r2);	 Catch:{ ActivityNotFoundException -> 0x012c }
        r2 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r1.setScrollBarStyle(r2);	 Catch:{ ActivityNotFoundException -> 0x012c }
        if (r0 == 0) goto L_0x00ea;
    L_0x00e4:
        r0 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r1.setSelector(r0);	 Catch:{ ActivityNotFoundException -> 0x012c }
    L_0x00ea:
        r9.registerForContextMenu(r1);
        r0 = new com.whatsapp.arn;
        r0.<init>(r9);
        r1.setOnItemClickListener(r0);
        r0 = new com.whatsapp.j4;
        r0.<init>(r9);
        r1.setOnItemLongClickListener(r0);
        r0 = r9.getLayoutInflater(r7);
        r2 = 2130903110; // 0x7f030046 float:1.7413029E38 double:1.0528060213E-314;
        r0 = com.whatsapp.aam.a(r0, r2, r7);
        r1.addFooterView(r0, r7, r6);
        r0 = r9.getLayoutInflater(r7);
        r2 = 2130903108; // 0x7f030044 float:1.7413025E38 double:1.0528060203E-314;
        r0 = com.whatsapp.aam.a(r0, r2, r7);
        r1.addFooterView(r0, r7, r6);
        com.whatsapp.App.b(r9);
        r0 = r9.d;
        r1 = com.whatsapp.t4.ON_ACTIVITY_CREATED;
        r0.a(r1);
        return;
    L_0x0124:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0126 }
    L_0x0126:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0128 }
    L_0x0128:
        r0 = move-exception;
        throw r0;
    L_0x012a:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x012c }
    L_0x012c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactsFragment.onActivityCreated(android.os.Bundle):void");
    }

    static void a(ContactsFragment contactsFragment) {
        contactsFragment.e();
    }
}
