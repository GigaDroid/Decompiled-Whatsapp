package com.facebook.rebound.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import com.facebook.rebound.b;
import com.facebook.rebound.d;
import com.facebook.rebound.g;
import com.facebook.rebound.m;
import com.facebook.rebound.o;
import com.facebook.rebound.q;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

public class SpringConfiguratorView extends FrameLayout {
    private static final DecimalFormat b;
    public static boolean d;
    private static final String z;
    private final f a;
    private TextView c;
    private final float e;
    private TextView f;
    private o g;
    private SeekBar h;
    private final List i;
    private final q j;
    private final int k;
    private final m l;
    private SeekBar m;
    private Spinner n;
    private final float o;

    static o g(SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.g;
    }

    static void b(SpringConfiguratorView springConfiguratorView, o oVar) {
        springConfiguratorView.a(oVar);
    }

    static float i(SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.o;
    }

    static TextView h(SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.c;
    }

    static DecimalFormat b() {
        return b;
    }

    static o a(SpringConfiguratorView springConfiguratorView, o oVar) {
        springConfiguratorView.g = oVar;
        return oVar;
    }

    public void a() {
        boolean z = d;
        Map a = this.j.a();
        this.a.a();
        this.i.clear();
        for (Entry entry : a.entrySet()) {
            if (entry.getKey() != o.b || z) {
                this.i.add(entry.getKey());
                this.a.a((String) entry.getValue());
                if (z) {
                    break;
                }
            }
        }
        this.i.add(o.b);
        this.a.a((String) a.get(o.b));
        this.a.notifyDataSetChanged();
        if (this.i.size() > 0) {
            this.n.setSelection(0);
        }
        if (g.b != 0) {
            d = !z;
        }
    }

    static float f(SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.e;
    }

    private void c() {
        double d = 1.0d;
        double i = this.l.i();
        m mVar = this.l;
        if (i == 1.0d) {
            d = 0.0d;
        }
        mVar.a(d);
    }

    @TargetApi(11)
    public SpringConfiguratorView(Context context, AttributeSet attributeSet, int i) {
        boolean z = d;
        super(context, attributeSet, i);
        this.i = new ArrayList();
        this.k = Color.argb(255, 225, 225, 225);
        d a = d.a();
        this.j = q.b();
        this.a = new f(this, context);
        Resources resources = getResources();
        this.o = (float) a.a(40.0f, resources);
        this.e = (float) a.a(280.0f, resources);
        this.l = a.a();
        this.l.e(1.0d).a(1.0d).a(new c(this, null));
        addView(a(context));
        OnSeekBarChangeListener bVar = new b(this, null);
        this.h.setMax(100000);
        this.h.setOnSeekBarChangeListener(bVar);
        this.m.setMax(100000);
        this.m.setOnSeekBarChangeListener(bVar);
        this.n.setAdapter(this.a);
        this.n.setOnItemSelectedListener(new e(this, null));
        a();
        setTranslationY(this.e);
        if (z) {
            g.b++;
        }
    }

    static {
        char[] toCharArray = "P8t".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 22;
                    break;
                case at.i /*2*/:
                    i2 = 87;
                    break;
                case at.o /*3*/:
                    i2 = 1;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        b = new DecimalFormat(z);
    }

    public SpringConfiguratorView(Context context) {
        this(context, null);
    }

    private View a(Context context) {
        Resources resources = getResources();
        int a = a.a(5.0f, resources);
        int a2 = a.a(10.0f, resources);
        int a3 = a.a(20.0f, resources);
        LayoutParams layoutParams = new TableLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, a, 0);
        View frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(a.a(-1, a.a(300.0f, resources)));
        View frameLayout2 = new FrameLayout(context);
        LayoutParams a4 = a.a();
        a4.setMargins(0, a3, 0, 0);
        frameLayout2.setLayoutParams(a4);
        frameLayout2.setBackgroundColor(Color.argb(100, 0, 0, 0));
        frameLayout.addView(frameLayout2);
        this.n = new Spinner(context, 0);
        a4 = a.b();
        a4.gravity = 48;
        a4.setMargins(a2, a2, a2, 0);
        this.n.setLayoutParams(a4);
        frameLayout2.addView(this.n);
        View linearLayout = new LinearLayout(context);
        LayoutParams b = a.b();
        b.setMargins(0, 0, 0, a.a(80.0f, resources));
        b.gravity = 80;
        linearLayout.setLayoutParams(b);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout);
        frameLayout2 = new LinearLayout(context);
        b = a.b();
        b.setMargins(a2, a2, a2, a3);
        frameLayout2.setPadding(a2, a2, a2, a2);
        frameLayout2.setLayoutParams(b);
        frameLayout2.setOrientation(0);
        linearLayout.addView(frameLayout2);
        this.h = new SeekBar(context);
        this.h.setLayoutParams(layoutParams);
        frameLayout2.addView(this.h);
        this.f = new TextView(getContext());
        this.f.setTextColor(this.k);
        b = a.a(a.a(50.0f, resources), -1);
        this.f.setGravity(19);
        this.f.setLayoutParams(b);
        this.f.setMaxLines(1);
        frameLayout2.addView(this.f);
        frameLayout2 = new LinearLayout(context);
        b = a.b();
        b.setMargins(a2, a2, a2, a3);
        frameLayout2.setPadding(a2, a2, a2, a2);
        frameLayout2.setLayoutParams(b);
        frameLayout2.setOrientation(0);
        linearLayout.addView(frameLayout2);
        this.m = new SeekBar(context);
        this.m.setLayoutParams(layoutParams);
        frameLayout2.addView(this.m);
        this.c = new TextView(getContext());
        this.c.setTextColor(this.k);
        LayoutParams a5 = a.a(a.a(50.0f, resources), -1);
        this.c.setGravity(19);
        this.c.setLayoutParams(a5);
        this.c.setMaxLines(1);
        frameLayout2.addView(this.c);
        View view = new View(context);
        LayoutParams a6 = a.a(a.a(60.0f, resources), a.a(40.0f, resources));
        a6.gravity = 49;
        view.setLayoutParams(a6);
        view.setOnTouchListener(new g(this, null));
        view.setBackgroundColor(Color.argb(255, 0, 164, 209));
        frameLayout.addView(view);
        return frameLayout;
    }

    public SpringConfiguratorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static int a(SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.k;
    }

    static SeekBar c(SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.h;
    }

    static SeekBar j(SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.m;
    }

    static List d(SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.i;
    }

    private void a(o oVar) {
        int round = Math.round(((((float) b.d(oVar.a)) - 0.0f) * 100000.0f) / 200.0f);
        int round2 = Math.round(((((float) b.b(oVar.c)) - 0.0f) * 100000.0f) / 50.0f);
        this.h.setProgress(round);
        this.m.setProgress(round2);
    }

    static TextView b(SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.f;
    }

    static void e(SpringConfiguratorView springConfiguratorView) {
        springConfiguratorView.c();
    }
}
