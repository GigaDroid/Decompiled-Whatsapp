package com.whatsapp.gallerypicker;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class at extends BaseAdapter {
    private View a;
    LayoutInflater b;
    ArrayList c;
    final GalleryPickerFragment d;

    public int getCount() {
        return this.c.size();
    }

    public void b() {
        this.c.clear();
        this.a = null;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void a(bt btVar) {
        this.c.add(btVar);
    }

    public void a() {
        notifyDataSetChanged();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    at(GalleryPickerFragment galleryPickerFragment, LayoutInflater layoutInflater) {
        this.d = galleryPickerFragment;
        this.c = new ArrayList();
        this.b = layoutInflater;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
        r8 = this;
        r4 = 0;
        r0 = r8.c;
        r0 = r0.get(r9);
        r0 = (com.whatsapp.gallerypicker.bt) r0;
        if (r9 != 0) goto L_0x0012;
    L_0x000b:
        r1 = r8.a;
        if (r1 == 0) goto L_0x0012;
    L_0x000f:
        r10 = r8.a;
    L_0x0011:
        return r10;
    L_0x0012:
        if (r10 != 0) goto L_0x0026;
    L_0x0014:
        r1 = r8.b;
        r2 = 2130903186; // 0x7f030092 float:1.7413183E38 double:1.052806059E-314;
        r3 = 0;
        r1 = com.whatsapp.aam.a(r1, r2, r3);
        if (r9 != 0) goto L_0x00b9;
    L_0x0020:
        r8.a = r1;
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r2 == 0) goto L_0x00b9;
    L_0x0026:
        r1 = com.whatsapp.gallerypicker.GalleryPickerFragment.j();
        if (r1 == 0) goto L_0x0042;
    L_0x002c:
        r1 = com.whatsapp.App.a1();
        if (r1 != 0) goto L_0x0042;
    L_0x0032:
        r1 = r8.d;
        r1 = r1.getResources();
        r2 = 2131427486; // 0x7f0b009e float:1.847659E38 double:1.0530650974E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r10.setPadding(r1, r4, r4, r4);
    L_0x0042:
        r1 = 2131755127; // 0x7f100077 float:1.9141124E38 double:1.0532269736E-314;
        r1 = r10.findViewById(r1);
        r1 = (com.whatsapp.TextEmojiLabel) r1;
        r2 = 2131755126; // 0x7f100076 float:1.9141122E38 double:1.053226973E-314;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r3 = 2131755385; // 0x7f100179 float:1.9141648E38 double:1.053227101E-314;
        r3 = r10.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131755531; // 0x7f10020b float:1.9141944E38 double:1.053227173E-314;
        r4 = r10.findViewById(r4);
        r4 = (android.widget.ImageView) r4;
        r5 = java.text.NumberFormat.getInstance();
        r6 = r0.a;
        r6 = (long) r6;
        r5 = r5.format(r6);
        r3.setText(r5);
        r3 = r0.d;
        r1.a(r3);
        r1 = r0.d();
        r2.setImageResource(r1);
        r1 = r4.getTag();
        r1 = (com.whatsapp.gallerypicker.b7) r1;
        if (r1 == 0) goto L_0x0096;
    L_0x0088:
        r2 = r1.a();
        r3 = r0.b();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0011;
    L_0x0096:
        r2 = r8.d;
        r2 = com.whatsapp.gallerypicker.GalleryPickerFragment.d(r2);
        r2.a(r1);
        r1 = r0.c;
        r2 = new com.whatsapp.gallerypicker.ae;
        r2.<init>(r8, r4, r1, r0);
        r0 = new com.whatsapp.gallerypicker.av;
        r0.<init>(r8, r4, r2, r1);
        r4.setTag(r2);
        r1 = r8.d;
        r1 = com.whatsapp.gallerypicker.GalleryPickerFragment.d(r1);
        r1.a(r2, r0);
        goto L_0x0011;
    L_0x00b9:
        r10 = r1;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.at.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public int getViewTypeCount() {
        return 2;
    }
}
