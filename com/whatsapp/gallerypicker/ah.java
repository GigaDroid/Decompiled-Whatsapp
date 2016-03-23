package com.whatsapp.gallerypicker;

import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tonicartos.widget.stickygridheaders.r;

class ah extends BaseAdapter implements r {
    private SparseBooleanArray a;
    final MediaGalleryFragmentBase b;
    private long c;
    private boolean d;

    public int a() {
        return MediaGalleryFragmentBase.e(this.b).size();
    }

    static boolean a(ah ahVar, int i) {
        return ahVar.a(i);
    }

    private boolean a(int i) {
        return false;
    }

    static long a(ah ahVar, long j) {
        ahVar.c = j;
        return j;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
        r6 = this;
        r0 = r6.b;
        r0 = r0.f;
        r4 = r0.a(r7);
        if (r8 != 0) goto L_0x0091;
    L_0x000a:
        r0 = r6.b;
        r2 = r0.c();
    L_0x0010:
        r2 = (com.whatsapp.gallerypicker.MediaGalleryFragmentBase.MediaItemView) r2;
        r2.setMediaItem(r4);
        r0 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r2.setScaleType(r0);
        r0 = 2131755454; // 0x7f1001be float:1.9141788E38 double:1.053227135E-314;
        r2.setId(r0);
        r0 = r6.b;
        r1 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.b(r0);
        r0 = r2.getTag();
        r0 = (com.whatsapp.gallerypicker.b7) r0;
        r1.a(r0);
        if (r4 == 0) goto L_0x0067;
    L_0x0031:
        r3 = new com.whatsapp.gallerypicker.bm;
        r3.<init>(r6, r2, r4);
        r2.setTag(r3);
        r0 = r6.a(r7);
        if (r0 == 0) goto L_0x0043;
    L_0x003f:
        r0 = 4;
        r2.setVisibility(r0);
    L_0x0043:
        r0 = new com.whatsapp.gallerypicker.aq;
        r1 = r6;
        r5 = r7;
        r0.<init>(r1, r2, r3, r4, r5);
        r1 = r6.b;
        r1 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.b(r1);
        r1.a(r3, r0);
        r0 = r6.b;
        r0 = r0.a(r7);
        r2.setChecked(r0);
        r0 = r4.b();
        android.support.v4.view.ViewCompat.setTransitionName(r2, r0);
        r0 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r0 == 0) goto L_0x007d;
    L_0x0067:
        r0 = android.widget.ImageView.ScaleType.CENTER;
        r2.setScaleType(r0);
        r0 = r6.b;
        r0 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.a(r0);
        r2.setBackgroundColor(r0);
        r0 = 0;
        r2.setImageDrawable(r0);
        r0 = 0;
        r2.setChecked(r0);
    L_0x007d:
        r0 = r6.d;
        if (r0 != 0) goto L_0x0090;
    L_0x0081:
        r0 = 1;
        r6.d = r0;
        r0 = r2.getViewTreeObserver();
        r1 = new com.whatsapp.gallerypicker.c;
        r1.<init>(r6, r2);
        r0.addOnPreDrawListener(r1);
    L_0x0090:
        return r2;
    L_0x0091:
        r2 = r8;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ah.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int m734a(int i) {
        return ((a7) MediaGalleryFragmentBase.e(this.b).get(i)).b;
    }

    ah(MediaGalleryFragmentBase mediaGalleryFragmentBase, ao aoVar) {
        this(mediaGalleryFragmentBase);
    }

    public View a(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view != null) {
            view = (ViewGroup) view;
            TextView textView2 = (TextView) view.getChildAt(0);
            if (MediaGalleryFragmentBase.e == 0) {
                textView = textView2;
                textView.setText(((a7) MediaGalleryFragmentBase.e(this.b).get(i)).toString());
                return view;
            }
        }
        View view2 = (ViewGroup) this.b.getActivity().getLayoutInflater().inflate(2130903219, null, true);
        view2.setClickable(false);
        textView = (TextView) view2.findViewById(2131755765);
        view = view2;
        textView.setText(((a7) MediaGalleryFragmentBase.e(this.b).get(i)).toString());
        return view;
    }

    public int getCount() {
        return this.b.p;
    }

    static SparseBooleanArray b(ah ahVar) {
        return ahVar.a;
    }

    static long a(ah ahVar) {
        return ahVar.c;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    private ah(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        this.b = mediaGalleryFragmentBase;
        this.a = new SparseBooleanArray();
    }
}
