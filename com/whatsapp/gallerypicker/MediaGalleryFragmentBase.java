package com.whatsapp.gallerypicker;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.whatsapp.App;
import com.whatsapp.aam;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public abstract class MediaGalleryFragmentBase extends Fragment {
    public static int e;
    public static final Bitmap l;
    private static boolean r;
    private static final String[] z;
    private AsyncTask b;
    private View c;
    private ba d;
    protected e f;
    private final aw g;
    private Handler h;
    private int i;
    private Drawable j;
    protected BaseAdapter k;
    private ArrayList m;
    private int n;
    protected GridView o;
    protected int p;
    private int q;
    private ContentObserver s;

    public class MediaItemView extends ImageView {
        private boolean a;
        protected Drawable b;
        protected f c;

        public MediaItemView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public void setChecked(boolean z) {
            if (this.a != z) {
                this.a = z;
                invalidate();
            }
        }

        protected void onMeasure(int i, int i2) {
            int i3;
            int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
            if (!MediaGalleryFragmentBase.b() || App.a1()) {
                i3 = 0;
            } else {
                i3 = getResources().getDimensionPixelSize(2131427488);
            }
            setMeasuredDimension(defaultSize - i3, defaultSize);
        }

        public void setMediaItem(f fVar) {
            this.c = fVar;
        }

        public void a(Canvas canvas) {
        }

        public MediaItemView(Context context) {
            super(context);
        }

        public MediaItemView(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }

        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            a(canvas);
            if (this.a) {
                if (this.b == null) {
                    this.b = ContextCompat.getDrawable(getContext(), 2130839706);
                }
                canvas.drawColor(1073741824);
                int width = (getWidth() - this.b.getIntrinsicWidth()) / 2;
                int height = (getHeight() - this.b.getIntrinsicHeight()) / 2;
                this.b.setBounds(width, height, this.b.getIntrinsicWidth() + width, this.b.getIntrinsicHeight() + height);
                this.b.draw(canvas);
            }
        }

        public MediaItemView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected abstract boolean a(int i);

    protected abstract e b(boolean z);

    protected abstract MediaItemView c();

    private void a(Runnable runnable) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2130903202, viewGroup, false);
    }

    static int g(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        return mediaGalleryFragmentBase.n;
    }

    static ba b(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        return mediaGalleryFragmentBase.d;
    }

    protected void a(boolean z, boolean z2) {
        boolean z3 = true;
        Log.i(z[2] + z + z[3] + z2);
        if (this.b != null) {
            this.b.cancel(true);
        }
        if (this.f != null) {
            this.f.a(this.s);
            this.f.a();
            this.f = null;
        }
        a(true);
        if (z) {
            z3 = false;
        }
        this.f = b(z3);
        this.m.clear();
        this.f.b(this.s);
        this.c.setVisibility(this.f.e() > 0 ? 8 : 0);
        this.p = 0;
        this.k.notifyDataSetChanged();
        this.b = new bs(this, z, z2);
        this.b.execute(new Void[0]);
    }

    protected void a(boolean z) {
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

    static ArrayList e(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        return mediaGalleryFragmentBase.m;
    }

    static void a(MediaGalleryFragmentBase mediaGalleryFragmentBase, Runnable runnable) {
        mediaGalleryFragmentBase.a(runnable);
    }

    static {
        boolean z = false;
        String[] strArr = new String[4];
        String str = "\u001cd\u0002.k\u0016`\n+o\u0003x\u00005k\u0016l\u0003)~\u0013`\u0015\"%\u0015d\u00153x\u001ex";
        boolean z2 = true;
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
                        i3 = 113;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 10;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001cd\u0002.k\u0016`\n+o\u0003x\u00005k\u0016l\u0003)~\u0013`\u0015\"%\u0003d\u0004&a\u0014!\u0013)g\u001et\b3o\u0015;";
                    i = 2;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "Qr\u0005&d\u001fh\b 0";
                    z2 = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    if (aam.a && VERSION.SDK_INT < 21) {
                        z = true;
                    }
                    r = z;
                    l = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001cd\u0002.k\u0016`\n+o\u0003x\u00005k\u0016l\u0003)~\u0013`\u0015\"%\u0012s\u0003&~\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    public MediaGalleryFragmentBase() {
        this.g = new aw();
        this.m = new ArrayList();
        this.h = new Handler(Looper.getMainLooper());
        this.s = new ao(this, this.h);
    }

    static aw d(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        return mediaGalleryFragmentBase.g;
    }

    protected ContentResolver a() {
        Activity activity = getActivity();
        return activity == null ? null : activity.getContentResolver();
    }

    static boolean b() {
        return r;
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
        if (this.b != null) {
            this.b.cancel(true);
            this.b = null;
        }
        if (this.d != null) {
            this.d.b();
            this.d = null;
        }
        if (this.f != null) {
            this.f.a(this.s);
            this.f.a();
            this.f = null;
        }
        this.p = 0;
    }

    public void onActivityCreated(Bundle bundle) {
        Log.i(z[1]);
        super.onActivityCreated(bundle);
        this.q = ContextCompat.getColor(getContext(), 2131624017);
        this.j = new ColorDrawable(this.q);
        this.n = getResources().getDimensionPixelSize(2131427489);
        this.c = getView().findViewById(2131755671);
        this.o = (GridView) getView().findViewById(2131755625);
        if (r && !App.a1()) {
            this.o.setHorizontalSpacing(0);
        }
        this.k = new ah(this, null);
        this.o.setAdapter(this.k);
        int height = getActivity().getWindowManager().getDefaultDisplay().getHeight();
        int width = getActivity().getWindowManager().getDefaultDisplay().getWidth();
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131427489);
        this.i = ((height * width) / (dimensionPixelSize * dimensionPixelSize)) + 1;
        this.d = new ba(getActivity().getContentResolver(), new Handler(Looper.getMainLooper()));
    }

    static int f(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        return mediaGalleryFragmentBase.i;
    }

    static Drawable c(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        return mediaGalleryFragmentBase.j;
    }

    static int a(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        return mediaGalleryFragmentBase.q;
    }
}
