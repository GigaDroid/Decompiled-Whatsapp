package com.whatsapp.util.undobar;

import android.app.Activity;
import android.os.Parcelable;
import com.whatsapp.WAAppCompatActivity;

public class d {
    private c a;
    private int b;
    private final Activity c;
    private Parcelable d;
    private CharSequence e;
    private long f;
    private f g;

    public UndoBarController a() {
        return a(true);
    }

    public UndoBarController a(boolean z) {
        boolean z2 = UndoBarController.h;
        if (this.a == null && this.g == null) {
            this.g = UndoBarController.n;
        }
        if (this.g == null) {
            this.g = UndoBarController.k;
        }
        if (this.e == null) {
            this.e = "";
        }
        if (this.f > 0) {
            this.g.b = this.f;
        }
        UndoBarController a = UndoBarController.a(this.c, this.e, this.a, this.d, !z, this.g, this.b);
        if (z2) {
            WAAppCompatActivity.c++;
        }
        return a;
    }

    public d a(Parcelable parcelable) {
        this.d = parcelable;
        return this;
    }

    public d a(int i) {
        this.e = this.c.getText(i);
        return this;
    }

    public d(Activity activity) {
        this.b = -1;
        this.c = activity;
    }

    public d a(c cVar) {
        this.a = cVar;
        return this;
    }
}
