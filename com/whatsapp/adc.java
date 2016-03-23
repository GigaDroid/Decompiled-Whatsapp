package com.whatsapp;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import java.util.Map;

class adc extends adp {
    final MediaGallery o;

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        super.onPrepareActionMode(actionMode, menu);
        this.a.setVisible(false);
        this.b.setVisible(false);
        this.f.setVisible(false);
        this.g.setVisible(false);
        this.j.setVisible(false);
        this.d.setVisible(false);
        this.l.setVisible(false);
        this.k.setVisible(false);
        return true;
    }

    adc(MediaGallery mediaGallery, Activity activity) {
        this.o = mediaGallery;
        super(activity);
    }

    public void f() {
        if (MediaGallery.a(this.o) != null) {
            MediaGallery.a(this.o).finish();
        }
    }

    public Map a() {
        return MediaGallery.b(this.o);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        boolean z = DialogToastActivity.f;
        MediaGallery.a(this.o, null);
        MediaGallery.a(this.o, null);
        for (Fragment fragment : this.o.getSupportFragmentManager().getFragments()) {
            if (fragment instanceof kv) {
                ((kv) fragment).a();
                continue;
            }
            if (z) {
                return;
            }
        }
    }
}
