package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.arj;
import java.lang.ref.WeakReference;
import org.v;
import org.whispersystems.at;

public final class ViewStubCompat extends View {
    private static final String[] z;
    private OnInflateListener mInflateListener;
    private int mInflatedId;
    private WeakReference mInflatedViewRef;
    private LayoutInflater mInflater;
    private int mLayoutResource;

    public interface OnInflateListener {
        void onInflate(ViewStubCompat viewStubCompat, View view);
    }

    static {
        String[] strArr = new String[3];
        String str = "o,V?,o @\u0000)u=[I&}%N\f!<&LI0rdP\f#y;G\u0007&y-\u0002\u001f,y>";
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
                        i3 = 28;
                        break;
                    case at.g /*1*/:
                        i3 = 73;
                        break;
                    case at.i /*2*/:
                        i3 = 34;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    default:
                        i3 = 69;
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
                    str = "J G\u001e\u0016h<@I(i:VI-}?GI$<?C\u0005,xiN\b<s<V; o&W\u001b&y";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "J G\u001e\u0016h<@I(i:VI-}?GI$<'M\u0007hr<N\u0005eJ G\u001e\u0002n&W\u0019ej G\u001e\u0015};G\u00071";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void draw(Canvas canvas) {
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.mInflater = layoutInflater;
    }

    protected void dispatchDraw(Canvas canvas) {
    }

    public void setVisibility(int i) {
        boolean z = LinearLayoutCompat.a;
        if (this.mInflatedViewRef != null) {
            View view = (View) this.mInflatedViewRef.get();
            if (view != null) {
                try {
                    view.setVisibility(i);
                    if (!z) {
                        if (!z) {
                            return;
                        }
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            throw new IllegalStateException(z[0]);
        }
        try {
            super.setVisibility(i);
            if (i == 0 || i == 4) {
                inflate();
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLayoutResource = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewStubCompat, i, 0);
        this.mInflatedId = obtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_inflatedId, -1);
        this.mLayoutResource = obtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View inflate() {
        /*
        r5 = this;
        r2 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r5.getParent();
        if (r0 == 0) goto L_0x006c;
    L_0x0008:
        r1 = r0 instanceof android.view.ViewGroup;	 Catch:{ IllegalStateException -> 0x0059 }
        if (r1 == 0) goto L_0x006c;
    L_0x000c:
        r1 = r5.mLayoutResource;	 Catch:{ IllegalStateException -> 0x0059 }
        if (r1 == 0) goto L_0x0061;
    L_0x0010:
        r0 = (android.view.ViewGroup) r0;
        r1 = r5.mInflater;
        if (r1 == 0) goto L_0x001a;
    L_0x0016:
        r1 = r5.mInflater;
        if (r2 == 0) goto L_0x0022;
    L_0x001a:
        r1 = r5.getContext();
        r1 = android.view.LayoutInflater.from(r1);
    L_0x0022:
        r3 = r5.mLayoutResource;
        r4 = 0;
        r1 = r1.inflate(r3, r0, r4);
        r3 = r5.mInflatedId;	 Catch:{ IllegalStateException -> 0x005b }
        r4 = -1;
        if (r3 == r4) goto L_0x0033;
    L_0x002e:
        r3 = r5.mInflatedId;	 Catch:{ IllegalStateException -> 0x005b }
        r1.setId(r3);	 Catch:{ IllegalStateException -> 0x005b }
    L_0x0033:
        r3 = r0.indexOfChild(r5);
        r0.removeViewInLayout(r5);
        r4 = r5.getLayoutParams();
        if (r4 == 0) goto L_0x0045;
    L_0x0040:
        r0.addView(r1, r3, r4);	 Catch:{ IllegalStateException -> 0x005d }
        if (r2 == 0) goto L_0x0048;
    L_0x0045:
        r0.addView(r1, r3);	 Catch:{ IllegalStateException -> 0x005d }
    L_0x0048:
        r0 = new java.lang.ref.WeakReference;	 Catch:{ IllegalStateException -> 0x005f }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x005f }
        r5.mInflatedViewRef = r0;	 Catch:{ IllegalStateException -> 0x005f }
        r0 = r5.mInflateListener;	 Catch:{ IllegalStateException -> 0x005f }
        if (r0 == 0) goto L_0x0058;
    L_0x0053:
        r0 = r5.mInflateListener;	 Catch:{ IllegalStateException -> 0x005f }
        r0.onInflate(r5, r1);	 Catch:{ IllegalStateException -> 0x005f }
    L_0x0058:
        return r1;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r0 = new java.lang.IllegalArgumentException;
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x006c:
        r0 = new java.lang.IllegalStateException;
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ViewStubCompat.inflate():android.view.View");
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
