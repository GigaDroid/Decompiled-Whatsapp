package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import org.v;
import org.whispersystems.at;

public class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR;
    private static final String[] z;
    private boolean mOverlapAnchor;

    final class 1 implements OnScrollChangedListener {
        final Field val$fieldAnchor;
        final OnScrollChangedListener val$originalListener;
        final PopupWindow val$popup;

        public void onScrollChanged() {
            try {
                WeakReference weakReference = (WeakReference) this.val$fieldAnchor.get(this.val$popup);
                if (weakReference == null) {
                    return;
                }
                if (weakReference.get() != null) {
                    this.val$originalListener.onScrollChanged();
                }
            } catch (IllegalAccessException e) {
                throw e;
            } catch (IllegalAccessException e2) {
            }
        }

        1(Field field, PopupWindow popupWindow, OnScrollChangedListener onScrollChangedListener) {
            this.val$fieldAnchor = field;
            this.val$popup = popupWindow;
            this.val$originalListener = onScrollChangedListener;
        }
    }

    private static void wrapOnScrollChangedListener(PopupWindow popupWindow) {
        try {
            Field declaredField = PopupWindow.class.getDeclaredField(z[2]);
            declaredField.setAccessible(true);
            Field declaredField2 = PopupWindow.class.getDeclaredField(z[0]);
            declaredField2.setAccessible(true);
            declaredField2.set(popupWindow, new 1(declaredField, popupWindow, (OnScrollChangedListener) declaredField2.get(popupWindow)));
        } catch (Throwable e) {
            Log.d(z[1], z[3], e);
        }
    }

    @TargetApi(19)
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        int height;
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            height = i2 - view.getHeight();
        } else {
            height = i2;
        }
        super.update(view, i, height, i3, i4);
    }

    static {
        boolean z = true;
        String[] strArr = new String[4];
        String str = "x\u0010\u0001Zhg0\u0003eH}>\u0001nnq\u0013\u0006z\u007fp1\n{";
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
                        i3 = 21;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 111;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 11;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "x\u001e\u0001jcz-";
                    i = 2;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "P'\fl{a6\u0000g+b7\u0006en56\u0001z\u007ft3\u0003`er\u007f\u0018fy~>\u001df~{;OFeF<\u001dfgy\u001c\u0007her:\u000bEbf+\ngng";
                    z2 = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    if (VERSION.SDK_INT >= 21) {
                        z = false;
                    }
                    COMPAT_OVERLAP_ANCHOR = z;
                    return;
                default:
                    strArr2[i] = str;
                    str = "T/\u001fJdx/\u000e}[z/\u001ay\\|1\u000bf|";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.PopupWindow, i, 0);
        if (obtainStyledAttributes.hasValue(R.styleable.PopupWindow_overlapAnchor)) {
            setSupportOverlapAnchor(obtainStyledAttributes.getBoolean(R.styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(R.styleable.PopupWindow_android_popupBackground));
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT < 14) {
            wrapOnScrollChangedListener(this);
        }
    }

    public void setSupportOverlapAnchor(boolean z) {
        if (COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = z;
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        PopupWindowCompat.setOverlapAnchor(this, z);
    }
}
