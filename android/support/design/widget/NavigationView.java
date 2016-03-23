package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.design.R;
import android.support.design.internal.NavigationMenu;
import android.support.design.internal.NavigationMenuPresenter;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.BaseSavedState;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET;
    private static final int[] DISABLED_STATE_SET;
    private OnNavigationItemSelectedListener mListener;
    private int mMaxWidth;
    private final NavigationMenu mMenu;
    private MenuInflater mMenuInflater;
    private final NavigationMenuPresenter mPresenter;

    class 1 implements Callback {
        final NavigationView this$0;

        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return NavigationView.access$000(this.this$0) != null && NavigationView.access$000(this.this$0).onNavigationItemSelected(menuItem);
        }

        1(NavigationView navigationView) {
            this.this$0 = navigationView;
        }

        public void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        public Bundle menuState;

        final class 1 implements ParcelableCompatCreatorCallbacks {
            1() {
            }

            public Object[] m27newArray(int i) {
                return newArray(i);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object m26createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return createFromParcel(parcel, classLoader);
            }
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        static {
            CREATOR = ParcelableCompat.newCreator(new 1());
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View inflateHeaderView(@LayoutRes int i) {
        return this.mPresenter.inflateHeaderView(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r5, int r6) {
        /*
        r4 = this;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = android.support.design.widget.CoordinatorLayout.a;
        r1 = android.view.View.MeasureSpec.getMode(r5);
        switch(r1) {
            case -2147483648: goto L_0x0011;
            case 0: goto L_0x0021;
            case 1073741824: goto L_0x000f;
            default: goto L_0x000b;
        };
    L_0x000b:
        super.onMeasure(r5, r6);
        return;
    L_0x000f:
        if (r0 == 0) goto L_0x000b;
    L_0x0011:
        r1 = android.view.View.MeasureSpec.getSize(r5);
        r2 = r4.mMaxWidth;
        r1 = java.lang.Math.min(r1, r2);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r3);
        if (r0 == 0) goto L_0x000b;
    L_0x0021:
        r0 = r4.mMaxWidth;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3);
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.NavigationView.onMeasure(int, int):void");
    }

    public void inflateMenu(int i) {
        this.mPresenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.mMenu);
        this.mPresenter.setUpdateSuspended(false);
        this.mPresenter.updateMenuView(false);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.menuState = new Bundle();
        this.mMenu.savePresenterStates(savedState.menuState);
        return savedState;
    }

    static {
        CHECKED_STATE_SET = new int[]{16842912};
        DISABLED_STATE_SET = new int[]{-16842910};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
        r10 = this;
        r4 = 1;
        r2 = 0;
        r10.<init>(r11, r12, r13);
        r0 = new android.support.design.internal.NavigationMenuPresenter;
        r0.<init>();
        r10.mPresenter = r0;
        android.support.design.widget.ThemeUtils.checkAppCompatTheme(r11);
        r0 = new android.support.design.internal.NavigationMenu;
        r0.<init>(r11);
        r10.mMenu = r0;
        r0 = android.support.design.R.styleable.NavigationView;
        r1 = android.support.design.R.style.Widget_Design_NavigationView;
        r6 = r11.obtainStyledAttributes(r12, r0, r13, r1);
        r0 = android.support.design.R.styleable.NavigationView_android_background;
        r0 = r6.getDrawable(r0);
        r10.setBackgroundDrawable(r0);
        r0 = android.support.design.R.styleable.NavigationView_elevation;
        r0 = r6.hasValue(r0);
        if (r0 == 0) goto L_0x0039;
    L_0x002f:
        r0 = android.support.design.R.styleable.NavigationView_elevation;
        r0 = r6.getDimensionPixelSize(r0, r2);
        r0 = (float) r0;
        android.support.v4.view.ViewCompat.setElevation(r10, r0);
    L_0x0039:
        r0 = android.support.design.R.styleable.NavigationView_android_fitsSystemWindows;
        r0 = r6.getBoolean(r0, r2);
        android.support.v4.view.ViewCompat.setFitsSystemWindows(r10, r0);
        r0 = android.support.design.R.styleable.NavigationView_android_maxWidth;
        r0 = r6.getDimensionPixelSize(r0, r2);
        r10.mMaxWidth = r0;
        r0 = android.support.design.R.styleable.NavigationView_itemIconTint;
        r0 = r6.hasValue(r0);
        if (r0 == 0) goto L_0x005c;
    L_0x0052:
        r0 = android.support.design.R.styleable.NavigationView_itemIconTint;
        r0 = r6.getColorStateList(r0);
        r1 = android.support.design.widget.CoordinatorLayout.a;
        if (r1 == 0) goto L_0x0063;
    L_0x005c:
        r0 = 16842808; // 0x1010038 float:2.3693715E-38 double:8.321453E-317;
        r0 = r10.createDefaultColorStateList(r0);
    L_0x0063:
        r1 = android.support.design.R.styleable.NavigationView_itemTextAppearance;
        r1 = r6.hasValue(r1);
        if (r1 == 0) goto L_0x00f6;
    L_0x006b:
        r1 = android.support.design.R.styleable.NavigationView_itemTextAppearance;
        r1 = r6.getResourceId(r1, r2);
        r3 = r4;
    L_0x0072:
        r5 = 0;
        r7 = android.support.design.R.styleable.NavigationView_itemTextColor;
        r7 = r6.hasValue(r7);
        if (r7 == 0) goto L_0x0081;
    L_0x007b:
        r5 = android.support.design.R.styleable.NavigationView_itemTextColor;
        r5 = r6.getColorStateList(r5);
    L_0x0081:
        if (r3 != 0) goto L_0x008c;
    L_0x0083:
        if (r5 != 0) goto L_0x008c;
    L_0x0085:
        r5 = 16842806; // 0x1010036 float:2.369371E-38 double:8.321452E-317;
        r5 = r10.createDefaultColorStateList(r5);
    L_0x008c:
        r7 = android.support.design.R.styleable.NavigationView_itemBackground;
        r7 = r6.getDrawable(r7);
        r8 = r10.mMenu;
        r9 = new android.support.design.widget.NavigationView$1;
        r9.<init>(r10);
        r8.setCallback(r9);
        r8 = r10.mPresenter;
        r8.setId(r4);
        r4 = r10.mPresenter;
        r8 = r10.mMenu;
        r4.initForMenu(r11, r8);
        r4 = r10.mPresenter;
        r4.setItemIconTintList(r0);
        if (r3 == 0) goto L_0x00b4;
    L_0x00af:
        r0 = r10.mPresenter;
        r0.setItemTextAppearance(r1);
    L_0x00b4:
        r0 = r10.mPresenter;
        r0.setItemTextColor(r5);
        r0 = r10.mPresenter;
        r0.setItemBackground(r7);
        r0 = r10.mMenu;
        r1 = r10.mPresenter;
        r0.addMenuPresenter(r1);
        r0 = r10.mPresenter;
        r0 = r0.getMenuView(r10);
        r0 = (android.view.View) r0;
        r10.addView(r0);
        r0 = android.support.design.R.styleable.NavigationView_menu;
        r0 = r6.hasValue(r0);
        if (r0 == 0) goto L_0x00e1;
    L_0x00d8:
        r0 = android.support.design.R.styleable.NavigationView_menu;
        r0 = r6.getResourceId(r0, r2);
        r10.inflateMenu(r0);
    L_0x00e1:
        r0 = android.support.design.R.styleable.NavigationView_headerLayout;
        r0 = r6.hasValue(r0);
        if (r0 == 0) goto L_0x00f2;
    L_0x00e9:
        r0 = android.support.design.R.styleable.NavigationView_headerLayout;
        r0 = r6.getResourceId(r0, r2);
        r10.inflateHeaderView(r0);
    L_0x00f2:
        r6.recycle();
        return;
    L_0x00f6:
        r1 = r2;
        r3 = r2;
        goto L_0x0072;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            this.mMenuInflater = new SupportMenuInflater(getContext());
        }
        return this.mMenuInflater;
    }

    static OnNavigationItemSelectedListener access$000(NavigationView navigationView) {
        return navigationView.mListener;
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = getResources().getColorStateList(typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        return new ColorStateList(new int[][]{DISABLED_STATE_SET, CHECKED_STATE_SET, EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(DISABLED_STATE_SET, defaultColor), i2, defaultColor});
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mMenu.restorePresenterStates(savedState.menuState);
    }
}
