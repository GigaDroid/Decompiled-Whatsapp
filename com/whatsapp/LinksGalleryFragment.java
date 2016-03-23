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

public class LinksGalleryFragment extends Fragment implements kv {
    private static final String[] z;
    private GridView b;
    private String c;
    private String d;
    private final ArrayList e;
    private w0 f;
    private final aw g;
    private avi h;
    private a_c i;
    private final akc j;

    static {
        String[] strArr = new String[5];
        String str = "\u0013Q\u0014Hl\u0018Y\u0016Oz\rA\u001cQ~\u0018U\u001fMkP[\bF~\u000b]";
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
                        i3 = 56;
                        break;
                    case at.i /*2*/:
                        i3 = 122;
                        break;
                    case at.o /*3*/:
                        i3 = 35;
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
                    str = "\u0013Q\u0014Hl\u0018Y\u0016Oz\rA\u001cQ~\u0018U\u001fMkPY\nSm\u0010@)@m\u001a]\u0014jk\u001aU9Lj\u0011LZ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0013Q\u0014Hl\u0018Y\u0016Oz\rA\u001cQ~\u0018U\u001fMkPW\u0014op\u001e\\<Jq\u0016K\u0012F{_";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0013Q\u0014Hl\u0018Y\u0016Oz\rA\u001cQ~\u0018U\u001fMkP\\\u001fPk\rW\u0003";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0015Q\u001e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
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

    private b2 c() {
        return (b2) getActivity();
    }

    static void a(LinksGalleryFragment linksGalleryFragment, Runnable runnable) {
        linksGalleryFragment.a(runnable);
    }

    static ArrayList a(LinksGalleryFragment linksGalleryFragment) {
        return linksGalleryFragment.e;
    }

    public void a() {
        this.f.notifyDataSetChanged();
    }

    static String f(LinksGalleryFragment linksGalleryFragment) {
        return linksGalleryFragment.d;
    }

    public void onActivityCreated(Bundle bundle) {
        Log.i(z[0]);
        super.onActivityCreated(bundle);
        this.d = getActivity().getIntent().getStringExtra(z[1]);
        this.b = (GridView) getView().findViewById(2131755625);
        this.f = new w0(this);
        this.b.setAdapter(this.f);
        ViewCompat.setNestedScrollingEnabled(this.b, true);
        ViewCompat.setNestedScrollingEnabled(getView().findViewById(16908292), true);
        this.b.setOnItemClickListener(new eu(this));
        this.b.setOnItemLongClickListener(new rb(this));
        if (getActivity() instanceof MediaGallery) {
            this.b.setOnScrollListener(((MediaGallery) getActivity()).b());
        }
        App.aK.b(this.j);
        a(true);
        b();
    }

    public void onDestroy() {
        Log.i(z[4]);
        super.onDestroy();
        App.aK.a(this.j);
        this.f.changeCursor(null);
        if (this.h != null) {
            this.h.a();
            this.h = null;
        }
        if (this.i != null) {
            this.i.a();
            this.i = null;
        }
    }

    public LinksGalleryFragment() {
        this.c = "";
        this.g = new aw();
        this.e = new ArrayList();
        this.j = new aky(this);
    }

    static void c(LinksGalleryFragment linksGalleryFragment) {
        linksGalleryFragment.b();
    }

    static b2 e(LinksGalleryFragment linksGalleryFragment) {
        return linksGalleryFragment.c();
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
            if (this.h != null) {
                this.h.a();
            }
            this.e.clear();
            Object obj = null;
            int height = (view.getHeight() / getContext().getResources().getDimensionPixelSize(2131427507)) + 1;
            Log.i(z[2] + height);
            int i3 = 0;
            while (cursor.moveToNext() && i3 < height) {
                a7 a = this.g.a(App.aK.a(cursor, this.d).b);
                if (obj == null || !obj.equals(a)) {
                    if (obj != null) {
                        this.e.add(obj);
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
                this.e.add(obj);
            }
            this.f.changeCursor(cursor);
            this.h = new avi(this, str);
            bq.a(this.h, new Void[0]);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2130903209, viewGroup, false);
    }

    static w0 d(LinksGalleryFragment linksGalleryFragment) {
        return linksGalleryFragment.f;
    }

    public void a(String str) {
        if (!TextUtils.equals(this.c, str)) {
            this.c = str;
            b();
        }
    }

    private void a(Runnable runnable) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    private void b() {
        if (this.i != null) {
            this.i.a();
        }
        if (this.h != null) {
            this.h.a();
        }
        this.i = new a_c(this, c().b());
        bq.a(this.i, new Void[0]);
    }

    static aw b(LinksGalleryFragment linksGalleryFragment) {
        return linksGalleryFragment.g;
    }
}
