package com.whatsapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import org.v;
import org.whispersystems.at;

public class DialogToastListActivity extends DialogToastActivity {
    private static final String z;
    protected ListAdapter n;
    private Handler o;
    private boolean p;
    private OnItemClickListener q;
    private Runnable r;
    protected ListView s;

    static {
        char[] toCharArray = "g\u000e\u0012KX]\u000e\tM\u001dP\u0015GT\rM\u0015GQ\u0019H\u0004GXXr\b\u0014M.W\u0004\u0010\u0019\u000fV\u000e\u0014\\XW\u0005GX\fJ\u0013\u000e[\rJ\u0004GP\u000b\u001eF\u0006W\u001cL\u000e\u000e]VlO\u000e]VR\b\u0014M_".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 62;
                    break;
                case at.g /*1*/:
                    i2 = 97;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 57;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public ListView a() {
        c();
        return this.s;
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        c();
        super.onRestoreInstanceState(bundle);
    }

    protected void onDestroy() {
        this.o.removeCallbacks(this.r);
        super.onDestroy();
    }

    public ListAdapter b() {
        return this.n;
    }

    public DialogToastListActivity() {
        this.o = new Handler(Looper.getMainLooper());
        this.p = false;
        this.r = new tu(this);
        this.q = new j6(this);
    }

    private void c() {
        try {
            if (this.s == null) {
                setContentView(17367060);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void a(ListAdapter listAdapter) {
        synchronized (this) {
            c();
            this.n = listAdapter;
            this.s.setAdapter(listAdapter);
        }
    }

    public void onSupportContentChanged() {
        super.onSupportContentChanged();
        View findViewById = findViewById(16908292);
        try {
            this.s = (ListView) findViewById(16908298);
            if (this.s == null) {
                throw new RuntimeException(z);
            }
            if (findViewById != null) {
                try {
                    this.s.setEmptyView(findViewById);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            try {
                this.s.setOnItemClickListener(this.q);
                if (this.p) {
                    a(this.n);
                }
                this.o.post(this.r);
                this.p = true;
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    protected void a(ListView listView, View view, int i, long j) {
    }
}
