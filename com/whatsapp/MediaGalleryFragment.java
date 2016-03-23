package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.widget.BaseAdapter;
import com.whatsapp.gallerypicker.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaGalleryFragmentBase.MediaItemView;
import com.whatsapp.gallerypicker.ag;
import com.whatsapp.gallerypicker.e;
import com.whatsapp.gallerypicker.r;
import com.whatsapp.util.Log;
import com.whatsapp.util.cb;
import org.v;
import org.whispersystems.at;

public class MediaGalleryFragment extends MediaGalleryFragmentBase implements kv {
    private static final String[] z;
    private final akc t;
    private String u;

    class GalleryMediaItemView extends MediaItemView {
        private Drawable d;
        private Paint e;
        private Drawable f;
        private Drawable g;

        public void a(Canvas canvas) {
            super.a(canvas);
            if (this.c != null) {
                int intrinsicHeight;
                if (ag.c(this.c)) {
                    if (this.f == null) {
                        this.f = ContextCompat.getDrawable(getContext(), 2130839409);
                    }
                    if (this.d == null) {
                        this.d = ContextCompat.getDrawable(getContext(), 2130839627);
                    }
                    this.f.setBounds(0, getHeight() - (this.d.getIntrinsicHeight() * 2), getWidth(), getHeight());
                    this.f.draw(canvas);
                    intrinsicHeight = this.d.getIntrinsicHeight() / 4;
                    this.d.setBounds(intrinsicHeight, (getHeight() - this.d.getIntrinsicHeight()) - intrinsicHeight, this.d.getIntrinsicWidth() + intrinsicHeight, getHeight() - intrinsicHeight);
                    this.d.draw(canvas);
                    intrinsicHeight += this.d.getIntrinsicWidth();
                } else {
                    intrinsicHeight = 0;
                }
                long a = this.c.a();
                if (a != 0) {
                    String str;
                    if (this.e == null) {
                        this.e = new Paint(1);
                        this.e.setColor(-1);
                        this.e.setTextSize((float) getContext().getResources().getDimensionPixelSize(2131427518));
                    }
                    if (ag.d(this.c)) {
                        String a2 = cb.a(this.c.d(), (int) a);
                        if (this.f == null) {
                            this.f = ContextCompat.getDrawable(getContext(), 2130839409);
                        }
                        if (this.d == null) {
                            this.d = ContextCompat.getDrawable(getContext(), 2130839627);
                        }
                        this.f.setBounds(0, getHeight() - (this.d.getIntrinsicHeight() * 2), getWidth(), getHeight());
                        this.f.draw(canvas);
                        if (!DialogToastActivity.f) {
                            str = a2;
                            canvas.drawText(str, ((float) intrinsicHeight) + (this.e.getTextSize() / 3.0f), ((float) getHeight()) - (this.e.getTextSize() / 3.0f), this.e);
                        }
                    }
                    str = DateUtils.formatElapsedTime(a);
                    canvas.drawText(str, ((float) intrinsicHeight) + (this.e.getTextSize() / 3.0f), ((float) getHeight()) - (this.e.getTextSize() / 3.0f), this.e);
                }
                if (this.c instanceof r) {
                    r rVar = (r) this.c;
                    if (rVar.a != null && rVar.a.P) {
                        if (this.g == null) {
                            this.g = ContextCompat.getDrawable(getContext(), 2130839650);
                        }
                        this.g.setBounds(getWidth() - this.g.getIntrinsicWidth(), getHeight() - this.g.getIntrinsicHeight(), getWidth(), getHeight());
                        this.g.draw(canvas);
                    }
                }
            }
        }

        public GalleryMediaItemView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public GalleryMediaItemView(Context context) {
            super(context);
        }

        public GalleryMediaItemView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public GalleryMediaItemView(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "3UDg\u001c9QLb\u0018,IF|\u001c9]E`\tqSRk\u001c*U";
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
                        i3 = 94;
                        break;
                    case at.g /*1*/:
                        i3 = 48;
                        break;
                    case at.i /*2*/:
                        i3 = 32;
                        break;
                    case at.o /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = 125;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "3UDg\u001c9QLb\u0018,IF|\u001c9]E`\tqTE}\t,_Y";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "4YD";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Log.i(z[0]);
        super.onActivityCreated(bundle);
        this.u = getActivity().getIntent().getStringExtra(z[1]);
        this.o.setOnItemClickListener(new xf(this));
        this.o.setOnItemLongClickListener(new th(this));
        ViewCompat.setNestedScrollingEnabled(this.o, true);
        ViewCompat.setNestedScrollingEnabled(getView().findViewById(2131755671), true);
        a(false, false);
        if (getActivity() instanceof MediaGallery) {
            this.o.setOnScrollListener(((MediaGallery) getActivity()).b());
        }
        App.aK.b(this.t);
    }

    static b2 a(MediaGalleryFragment mediaGalleryFragment) {
        return mediaGalleryFragment.b();
    }

    static BaseAdapter d(MediaGalleryFragment mediaGalleryFragment) {
        return mediaGalleryFragment.k;
    }

    static BaseAdapter c(MediaGalleryFragment mediaGalleryFragment) {
        return mediaGalleryFragment.k;
    }

    public void a(String str) {
    }

    public void m478a() {
        this.k.notifyDataSetChanged();
    }

    static String b(MediaGalleryFragment mediaGalleryFragment) {
        return mediaGalleryFragment.u;
    }

    protected e b(boolean z) {
        return new d3(a(), this.u);
    }

    private d3 a() {
        return (d3) this.f;
    }

    private b2 b() {
        return (b2) getActivity();
    }

    public MediaGalleryFragment() {
        this.t = new atz(this);
    }

    protected boolean a(int i) {
        return b().b(a().b(i));
    }

    static d3 e(MediaGalleryFragment mediaGalleryFragment) {
        return mediaGalleryFragment.a();
    }

    static void a(MediaGalleryFragment mediaGalleryFragment, boolean z, boolean z2) {
        mediaGalleryFragment.a(z, z2);
    }

    public void onDestroy() {
        Log.i(z[2]);
        super.onDestroy();
        App.aK.a(this.t);
    }

    public MediaItemView c() {
        return new GalleryMediaItemView(getActivity());
    }
}
