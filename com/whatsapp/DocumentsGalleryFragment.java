package com.whatsapp;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.whatsapp.gallerypicker.a7;
import com.whatsapp.gallerypicker.aw;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class DocumentsGalleryFragment extends Fragment implements kv {
    private static final String[] z;
    private final aw b;
    private String c;
    private final akc d;
    private String e;
    private a4h f;
    private wf g;
    private final ArrayList h;
    private xw i;
    private GridView j;

    static {
        String[] strArr = new String[5];
        String str = "nW\u0011n\u000foV\u0006h\u0005kT\u001e~\u0010s^\u0000z\u0005g]\u001coMn]\u0001o\u0010eA";
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
                        i3 = 10;
                        break;
                    case at.g /*1*/:
                        i3 = 56;
                        break;
                    case at.i /*2*/:
                        i3 = 114;
                        break;
                    case at.o /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 98;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "`Q\u0016";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "nW\u0011n\u000foV\u0006h\u0005kT\u001e~\u0010s^\u0000z\u0005g]\u001coMeV>t\u0003n~\u001bu\u000byP\u0017\u007fB";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "nW\u0011n\u000foV\u0006h\u0005kT\u001e~\u0010s^\u0000z\u0005g]\u001coMkH\u0002i\rrk\u0011i\u0007oV;o\u0007g{\u001dn\f~\u0018";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "nW\u0011n\u000foV\u0006h\u0005kT\u001e~\u0010s^\u0000z\u0005g]\u001coMiJ\u0017z\u0016o";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a(Runnable runnable) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    static String f(DocumentsGalleryFragment documentsGalleryFragment) {
        return documentsGalleryFragment.e;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2130903174, viewGroup, false);
    }

    public void a() {
        this.g.notifyDataSetChanged();
    }

    private b2 c() {
        return (b2) getActivity();
    }

    private void b() {
        if (this.f != null) {
            this.f.a();
        }
        if (this.i != null) {
            this.i.a();
        }
        this.f = new a4h(this, c().b());
        bq.a(this.f, new Void[0]);
    }

    public void a(String str) {
        if (!TextUtils.equals(this.c, str)) {
            this.c = str;
            b();
        }
    }

    private void a(boolean z) {
        View view = getView();
        if (view != null) {
            int i;
            View findViewById = view.findViewById(2131755177);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
        App.aK.a(this.d);
        this.g.changeCursor(null);
        if (this.i != null) {
            this.i.a();
            this.i = null;
        }
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
    }

    static aw a(DocumentsGalleryFragment documentsGalleryFragment) {
        return documentsGalleryFragment.b;
    }

    public void a(Cursor cursor, String str, int i) {
        boolean z = DialogToastActivity.f;
        a(false);
        View view = getView();
        if (view != null) {
            int i2;
            Log.i(z[3] + i);
            View findViewById = view.findViewById(16908292);
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
            if (this.i != null) {
                this.i.a();
            }
            this.h.clear();
            Object obj = null;
            int height = (view.getHeight() / getContext().getResources().getDimensionPixelSize(2131427547)) + 1;
            Log.i(z[4] + height);
            int i3 = 0;
            while (cursor.moveToNext() && i3 < height) {
                a7 a = this.b.a(App.aK.a(cursor, this.e).b);
                if (obj == null || !obj.equals(a)) {
                    if (obj != null) {
                        this.h.add(obj);
                    }
                    a.b = 0;
                    obj = a;
                }
                r0.b++;
                int i4 = i3 + 1;
                if (z) {
                    break;
                }
                i3 = i4;
            }
            if (obj != null) {
                this.h.add(obj);
            }
            this.g.changeCursor(cursor);
            this.i = new xw(this, str);
            bq.a(this.i, new Void[0]);
        }
    }

    static void a(DocumentsGalleryFragment documentsGalleryFragment, Runnable runnable) {
        documentsGalleryFragment.a(runnable);
    }

    static wf c(DocumentsGalleryFragment documentsGalleryFragment) {
        return documentsGalleryFragment.g;
    }

    public void onActivityCreated(Bundle bundle) {
        Log.i(z[1]);
        super.onActivityCreated(bundle);
        this.e = getActivity().getIntent().getStringExtra(z[2]);
        this.j = (GridView) getView().findViewById(2131755625);
        this.g = new wf(this);
        this.j.setAdapter(this.g);
        ViewCompat.setNestedScrollingEnabled(this.j, true);
        ViewCompat.setNestedScrollingEnabled(getView().findViewById(16908292), true);
        this.j.setOnItemClickListener(new s9(this));
        this.j.setOnItemLongClickListener(new ij(this));
        if (getActivity() instanceof MediaGallery) {
            this.j.setOnScrollListener(((MediaGallery) getActivity()).b());
        }
        App.aK.b(this.d);
        a(true);
        b();
    }

    public DocumentsGalleryFragment() {
        this.c = "";
        this.b = new aw();
        this.h = new ArrayList();
        this.d = new ak6(this);
    }

    static ArrayList d(DocumentsGalleryFragment documentsGalleryFragment) {
        return documentsGalleryFragment.h;
    }

    static void e(DocumentsGalleryFragment documentsGalleryFragment) {
        documentsGalleryFragment.b();
    }

    static b2 b(DocumentsGalleryFragment documentsGalleryFragment) {
        return documentsGalleryFragment.c();
    }
}
