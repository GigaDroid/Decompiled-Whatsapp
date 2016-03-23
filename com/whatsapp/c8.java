package com.whatsapp;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class c8 extends PagerAdapter {
    private static final String z;
    final MediaView a;
    private co b;

    static {
        char[] toCharArray = "\u0005v)\u0015)\u001ez(\u000bg\u0001}>\b)\u0006g$\u001d<\rZ9\u0019%G".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_editTextStyle;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 77;
                    break;
                case at.o /*3*/:
                    i2 = 124;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public Parcelable saveState() {
        return null;
    }

    public int getCount() {
        return MediaView.g(this.a).size();
    }

    public void finishUpdate(View view) {
        if (this.b != null) {
            MediaView.a(this.a, this.b, 0);
            this.b = null;
        }
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public c8(MediaView mediaView, co coVar) {
        this.a = mediaView;
        this.b = coVar;
    }

    public void startUpdate(View view) {
    }

    public int getItemPosition(Object obj) {
        boolean z = DialogToastActivity.f;
        c3 c3Var = (c3) ((View) obj).getTag();
        if (c3Var == null) {
            return -2;
        }
        int i = -1;
        int i2 = 0;
        while (i2 < MediaView.g(this.a).size()) {
            if (c3Var.equals(((co) MediaView.g(this.a).get(i2)).k)) {
                if (!z) {
                    i = i2;
                    break;
                }
                i = i2;
            }
            int i3 = i2 + 1;
            if (z) {
                break;
            }
            i2 = i3;
        }
        if (i < 0) {
            return -2;
        }
        return (MediaView.g(this.a).size() - 1) - i;
    }

    public CharSequence getPageTitle(int i) {
        return "";
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        co i2 = MediaView.i(this.a, i);
        Log.i(z + i2.k.b);
        View d = MediaView.d(this.a, i2);
        d.setTag(i2.k);
        viewGroup.addView(d, 0);
        return d;
    }
}
