package com.whatsapp.gallerypicker;

import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import org.v;

class a6 implements Callback {
    final MediaPickerFragment a;
    private MenuItem b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareActionMode(android.support.v7.view.ActionMode r6, android.view.Menu r7) {
        /*
        r5 = this;
        r0 = 0;
        r1 = 1;
        r2 = r5.a;
        r2 = com.whatsapp.gallerypicker.MediaPickerFragment.b(r2);
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0018;
    L_0x000e:
        r2 = 2131231859; // 0x7f080473 float:1.807981E38 double:1.052968445E-314;
        r6.setTitle(r2);
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r2 == 0) goto L_0x0048;
    L_0x0018:
        r2 = r5.a;
        r2 = r2.getResources();
        r3 = 2131296295; // 0x7f090027 float:1.8210503E38 double:1.0530002805E-314;
        r4 = r5.a;
        r4 = com.whatsapp.gallerypicker.MediaPickerFragment.b(r4);
        r4 = r4.size();
        r2 = r2.getQuantityString(r3, r4);
        r3 = new java.lang.Object[r1];
        r4 = r5.a;
        r4 = com.whatsapp.gallerypicker.MediaPickerFragment.b(r4);
        r4 = r4.size();
        r4 = java.lang.Integer.valueOf(r4);
        r3[r0] = r4;
        r2 = java.lang.String.format(r2, r3);
        r6.setTitle(r2);
    L_0x0048:
        r2 = r5.b;
        r3 = r5.a;
        r3 = com.whatsapp.gallerypicker.MediaPickerFragment.b(r3);
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x0057;
    L_0x0056:
        r0 = r1;
    L_0x0057:
        r2.setVisible(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.a6.onPrepareActionMode(android.support.v7.view.ActionMode, android.view.Menu):boolean");
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        MediaPickerFragment.b(this.a).clear();
        MediaPickerFragment.a(this.a, null);
        this.a.k.notifyDataSetChanged();
        if (VERSION.SDK_INT >= 21) {
            this.a.getActivity().getWindow().setStatusBarColor(ContextCompat.getColor(this.a.getActivity(), 17170444));
        }
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case v.m /*0*/:
                MediaPickerFragment.a(this.a, MediaPickerFragment.b(this.a));
                break;
        }
        return false;
    }

    a6(MediaPickerFragment mediaPickerFragment) {
        this.a = mediaPickerFragment;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.b = menu.add(0, 0, 0, 2131231580);
        MenuItemCompat.setShowAsAction(this.b, 2);
        if (VERSION.SDK_INT >= 21) {
            this.a.getActivity().getWindow().setStatusBarColor(ContextCompat.getColor(this.a.getActivity(), 2131624054));
        }
        return true;
    }
}
