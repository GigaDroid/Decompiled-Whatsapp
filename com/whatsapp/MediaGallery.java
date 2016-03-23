package com.whatsapp;

import android.app.Dialog;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.appcompat.R;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView.OnScrollListener;
import android.widget.TextView;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class MediaGallery extends DialogToastActivity implements b2 {
    private static final String[] A;
    private int n;
    private final InputMethodManager o;
    private int p;
    private int q;
    private final OnScrollListener r;
    private ActionMode s;
    private String t;
    private final Callback u;
    private String v;
    private MenuItem w;
    private ArrayList x;
    private HashMap y;
    private int z;

    static {
        String[] strArr = new String[11];
        String str = "\u0012-iK|\u0018)aNx\r1\"Ft\u001e$bE2\u001b-aGi\u001ag";
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
                        i3 = 127;
                        break;
                    case at.g /*1*/:
                        i3 = 72;
                        break;
                    case at.i /*2*/:
                        i3 = 13;
                        break;
                    case at.o /*3*/:
                        i3 = 34;
                        break;
                    default:
                        i3 = 29;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0012-iK|\u0018)aNx\r1\"Dr\r?lPyP.lKq\u001a,";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001c'cV|\u001c<";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\f-aG~\u000b-i}p\u001a;~Cz\u001a;";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0016&}Wi %hVu\u0010,";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0012-iK|\u0018)aNx\r1\"Fx\f<\u007fMd";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0015!i";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0012-iK|\u0018)aNx\r1\"Ao\u001a)yG";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001e$hPi";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\f-aG~\u000b-i}p\u001a;~Cz\u001a;";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    A = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0012-iK|\u0018)aNx\r1\"Ft\u001e$bE2\u001b-aGi\u001ahcM=\u0012-~Q|\u0018-~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static String a(MediaGallery mediaGallery, String str) {
        mediaGallery.t = str;
        return str;
    }

    public void onSupportActionModeStarted(ActionMode actionMode) {
        super.onSupportActionModeStarted(actionMode);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this, 2131623947));
        }
    }

    public MediaGallery() {
        this.t = "";
        this.o = (InputMethodManager) App.z().getSystemService(A[5]);
        this.q = 0;
        this.p = 1;
        this.n = 2;
        this.u = new adc(this, this);
        this.r = new ae8(this);
    }

    static int a(MediaGallery mediaGallery, int i) {
        mediaGallery.z = i;
        return i;
    }

    static HashMap a(MediaGallery mediaGallery, HashMap hashMap) {
        mediaGallery.y = hashMap;
        return hashMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(com.whatsapp.protocol.co r6) {
        /*
        r5 = this;
        r0 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = r5.y;
        if (r2 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r2 = r5.y;
        r3 = r6.k;
        r2 = r2.containsKey(r3);
        if (r2 == 0) goto L_0x002f;
    L_0x0012:
        r3 = r5.y;
        r4 = r6.k;
        r3.remove(r4);
        r3 = r5.y;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x0028;
    L_0x0021:
        r3 = r5.s;
        r3.finish();
        if (r1 == 0) goto L_0x003b;
    L_0x0028:
        r3 = r5.s;
        r3.invalidate();
        if (r1 == 0) goto L_0x003b;
    L_0x002f:
        r1 = r5.y;
        r3 = r6.k;
        r1.put(r3, r6);
        r1 = r5.s;
        r1.invalidate();
    L_0x003b:
        if (r2 != 0) goto L_0x0007;
    L_0x003d:
        r0 = 1;
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaGallery.c(com.whatsapp.protocol.co):boolean");
    }

    static ActionMode a(MediaGallery mediaGallery) {
        return mediaGallery.s;
    }

    public void onSaveInstanceState(Bundle bundle) {
        boolean z = DialogToastActivity.f;
        super.onSaveInstanceState(bundle);
        if (this.y != null) {
            ArrayList arrayList = new ArrayList();
            for (co coVar : this.y.values()) {
                arrayList.add(new a4p(coVar.k));
                if (z) {
                    break;
                }
            }
            bundle.putParcelableArrayList(A[4], arrayList);
        }
    }

    public void onDestroy() {
        Log.i(A[6]);
        super.onDestroy();
        App.w(getApplicationContext());
    }

    public boolean m472a() {
        return this.y != null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (App.aK.I()) {
            boolean z;
            View searchView = new SearchView(this);
            ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(ContextCompat.getColor(this, R.color.primary_text_default_material_light));
            searchView.setQueryHint(getString(2131231848));
            searchView.setOnQueryTextListener(new aq2(this));
            this.w = menu.add(0, 2131755047, 0, 2131231845).setIcon(2130839446);
            MenuItemCompat.setActionView(this.w, searchView);
            MenuItemCompat.setShowAsAction(this.w, 10);
            MenuItemCompat.setOnActionExpandListener(this.w, new alb(this));
            MenuItem menuItem = this.w;
            if (this.z != this.q) {
                z = true;
            } else {
                z = false;
            }
            menuItem.setVisible(z);
        }
        return super.onCreateOptionsMenu(menu);
    }

    private kv a(int i) {
        boolean z = DialogToastActivity.f;
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                if (i == this.q && (fragment instanceof MediaGalleryFragment)) {
                    return (kv) fragment;
                }
                if (i == this.p && (fragment instanceof DocumentsGalleryFragment)) {
                    return (kv) fragment;
                }
                if (i != this.n || !(fragment instanceof LinksGalleryFragment)) {
                    if (z) {
                        break;
                    }
                }
                return (kv) fragment;
            }
        }
        return null;
    }

    static String f(MediaGallery mediaGallery) {
        return mediaGallery.t;
    }

    public ArrayList d() {
        return this.x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        r9 = 0;
        r8 = 8;
        r7 = -1;
        r3 = 1;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = A;
        r0 = r0[r8];
        com.whatsapp.util.Log.i(r0);
        r0 = r10.getTheme();
        r1 = 2131493081; // 0x7f0c00d9 float:1.8609632E38 double:1.0530975057E-314;
        r0.applyStyle(r1, r3);
        super.onCreate(r11);
        r0 = r10.getApplicationContext();
        com.whatsapp.App.w(r0);
        r0 = 2130903218; // 0x7f0300b2 float:1.7413248E38 double:1.0528060746E-314;
        r10.setContentView(r0);
        r0 = 2131755438; // 0x7f1001ae float:1.9141755E38 double:1.0532271273E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r10.setSupportActionBar(r0);
        r1 = r10.getSupportActionBar();
        r2 = new com.whatsapp.util.bz;
        r5 = 2130839457; // 0x7f0207a1 float:1.7283925E38 double:1.0527745725E-314;
        r5 = android.support.v4.content.ContextCompat.getDrawable(r10, r5);
        r2.<init>(r5);
        r1.setHomeAsUpIndicator(r2);
        r1.setDisplayHomeAsUpEnabled(r3);
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 < r2) goto L_0x005a;
    L_0x0050:
        r1 = 2131755763; // 0x7f1002f3 float:1.9142414E38 double:1.053227288E-314;
        r1 = r10.findViewById(r1);
        r1.setVisibility(r8);
    L_0x005a:
        r1 = r10.getIntent();
        r2 = A;
        r5 = 7;
        r2 = r2[r5];
        r1 = r1.getStringExtra(r2);
        r10.v = r1;
        r1 = com.whatsapp.App.as;
        r2 = r10.v;
        r1 = r1.b(r2);
        r1 = r1.a(r10);
        r10.i(r1);
        r1 = r10.getIntent();
        r2 = A;
        r5 = 9;
        r2 = r2[r5];
        r1 = r1.getBooleanExtra(r2, r9);
        if (r1 == 0) goto L_0x008b;
    L_0x0088:
        com.whatsapp.App.a(r10);
    L_0x008b:
        r1 = 2131755764; // 0x7f1002f4 float:1.9142416E38 double:1.0532272883E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.support.v4.view.ViewPager) r1;
        r5 = new com.whatsapp.c0;
        r2 = r10.getSupportFragmentManager();
        r5.<init>(r2);
        r2 = new com.whatsapp.MediaGalleryFragment;
        r2.<init>();
        r6 = 2131231170; // 0x7f0801c2 float:1.8078413E38 double:1.0529681044E-314;
        r6 = r10.getString(r6);
        r5.a(r2, r6);
        r2 = com.whatsapp.a59.d();
        if (r2 == 0) goto L_0x00c5;
    L_0x00b2:
        r2 = new com.whatsapp.DocumentsGalleryFragment;
        r2.<init>();
        r6 = 2131231168; // 0x7f0801c0 float:1.807841E38 double:1.0529681035E-314;
        r6 = r10.getString(r6);
        r5.a(r2, r6);
        r10.p = r3;
        if (r4 == 0) goto L_0x00c7;
    L_0x00c5:
        r10.p = r7;
    L_0x00c7:
        r2 = com.whatsapp.App.aK;
        r2 = r2.d();
        if (r2 == 0) goto L_0x00e7;
    L_0x00cf:
        r2 = new com.whatsapp.LinksGalleryFragment;
        r2.<init>();
        r6 = 2131231169; // 0x7f0801c1 float:1.8078411E38 double:1.052968104E-314;
        r6 = r10.getString(r6);
        r5.a(r2, r6);
        r2 = r10.p;
        if (r2 != r7) goto L_0x016d;
    L_0x00e2:
        r2 = r3;
    L_0x00e3:
        r10.n = r2;
        if (r4 == 0) goto L_0x00e9;
    L_0x00e7:
        r10.n = r7;
    L_0x00e9:
        r1.setAdapter(r5);
        r2 = r5.getCount();
        r1.setOffscreenPageLimit(r2);
        r2 = 2131755457; // 0x7f1001c1 float:1.9141794E38 double:1.0532271366E-314;
        r2 = r10.findViewById(r2);
        r2 = (android.support.design.widget.TabLayout) r2;
        r5 = r5.getCount();
        if (r5 <= r3) goto L_0x0120;
    L_0x0102:
        r3 = 2131623992; // 0x7f0e0038 float:1.8875151E38 double:1.0531621843E-314;
        r3 = android.support.v4.content.ContextCompat.getColor(r10, r3);
        r5 = 2131623943; // 0x7f0e0007 float:1.8875052E38 double:1.05316216E-314;
        r5 = android.support.v4.content.ContextCompat.getColor(r10, r5);
        r2.setTabTextColors(r3, r5);
        r2.setupWithViewPager(r1);
        r3 = new com.whatsapp.aio;
        r3.<init>(r10, r1);
        r2.setOnTabSelectedListener(r3);
        if (r4 == 0) goto L_0x012c;
    L_0x0120:
        r0 = r0.getLayoutParams();
        r0 = (android.support.design.widget.AppBarLayout.LayoutParams) r0;
        r0.setScrollFlags(r9);
        r2.setVisibility(r8);
    L_0x012c:
        if (r11 == 0) goto L_0x016c;
    L_0x012e:
        r0 = A;
        r1 = 10;
        r0 = r0[r1];
        r0 = r11.getParcelableArrayList(r0);
        if (r0 == 0) goto L_0x016c;
    L_0x013a:
        r1 = new java.util.HashMap;
        r1.<init>();
        r10.y = r1;
        r1 = r0.iterator();
    L_0x0145:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0164;
    L_0x014b:
        r0 = r1.next();
        r0 = (android.os.Parcelable) r0;
        r0 = (com.whatsapp.a4p) r0;
        r2 = r10.y;
        r3 = r0.a;
        r5 = com.whatsapp.App.aK;
        r0 = r0.a;
        r0 = r5.a(r0);
        r2.put(r3, r0);
        if (r4 == 0) goto L_0x0145;
    L_0x0164:
        r0 = r10.u;
        r0 = r10.startSupportActionMode(r0);
        r10.s = r0;
    L_0x016c:
        return;
    L_0x016d:
        r2 = 2;
        goto L_0x00e3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaGallery.onCreate(android.os.Bundle):void");
    }

    static HashMap b(MediaGallery mediaGallery) {
        return mediaGallery.y;
    }

    public boolean c() {
        return false;
    }

    public void a(View view) {
    }

    static int d(MediaGallery mediaGallery) {
        return mediaGallery.q;
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case Y.q /*13*/:
                if (this.y == null || this.y.isEmpty()) {
                    Log.e(A[1]);
                    return super.onCreateDialog(i);
                }
                Log.i(A[0] + this.y.size());
                return aea.a(this, new ArrayList(this.y.values()), this.v, 13, new n0(this));
            default:
                return super.onCreateDialog(i);
        }
    }

    public boolean b(co coVar) {
        return this.y != null && this.y.containsKey(coVar.k);
    }

    static kv c(MediaGallery mediaGallery) {
        return mediaGallery.a();
    }

    public int a(co coVar) {
        return 0;
    }

    static ActionMode a(MediaGallery mediaGallery, ActionMode actionMode) {
        mediaGallery.s = actionMode;
        return actionMode;
    }

    public void a(co coVar, int i) {
    }

    static InputMethodManager e(MediaGallery mediaGallery) {
        return mediaGallery.o;
    }

    public void d(co coVar) {
        this.y = new HashMap();
        this.y.put(coVar.k, coVar);
        this.s = startSupportActionMode(this.u);
    }

    OnScrollListener b() {
        return this.r;
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
        r0 = r4.y;
        if (r0 == 0) goto L_0x0044;
    L_0x000d:
        r0 = A;
        r2 = 3;
        r0 = r0[r2];
        r0 = r7.getStringExtra(r0);
        r2 = com.whatsapp.App.as;
        r2 = r2.b(r0);
        r0 = r4.y;
        r0 = r0.values();
        r0 = com.whatsapp.qa.a(r0);
        r3 = r0.iterator();
    L_0x002a:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r3.next();
        r0 = (com.whatsapp.protocol.co) r0;
        com.whatsapp.App.a(r0, r2);
        if (r1 == 0) goto L_0x002a;
    L_0x003b:
        r0 = com.whatsapp.Conversation.a(r2);
        r4.startActivity(r0);
        if (r1 == 0) goto L_0x0053;
    L_0x0044:
        r0 = A;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = 2131231451; // 0x7f0802db float:1.8078983E38 double:1.0529682433E-314;
        r1 = 0;
        com.whatsapp.App.a(r4, r0, r1);
    L_0x0053:
        r0 = r4.s;
        if (r0 == 0) goto L_0x0005;
    L_0x0057:
        r0 = r4.s;
        r0.finish();
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaGallery.onActivityResult(int, int, android.content.Intent):void");
    }

    public String m473b() {
        return this.t;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    static MenuItem g(MediaGallery mediaGallery) {
        return mediaGallery.w;
    }

    static ArrayList a(MediaGallery mediaGallery, ArrayList arrayList) {
        mediaGallery.x = arrayList;
        return arrayList;
    }

    private kv a() {
        return a(this.z);
    }

    public void onSupportActionModeFinished(ActionMode actionMode) {
        super.onSupportActionModeFinished(actionMode);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this, 17170444));
        }
    }
}
