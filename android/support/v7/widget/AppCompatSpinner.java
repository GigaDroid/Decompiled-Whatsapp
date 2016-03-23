package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ListPopupWindow.ForwardingListener;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import org.v;
import org.whispersystems.at;

public class AppCompatSpinner extends Spinner implements TintableBackgroundView {
    private static final int[] ATTRS_ANDROID_SPINNERMODE;
    private static final boolean IS_AT_LEAST_JB;
    private static final boolean IS_AT_LEAST_M;
    private static final String[] z;
    private AppCompatBackgroundHelper mBackgroundTintHelper;
    private int mDropDownWidth;
    private ForwardingListener mForwardingListener;
    private DropdownPopup mPopup;
    private Context mPopupContext;
    private boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    private final Rect mTempRect;
    private TintManager mTintManager;

    class 1 extends ForwardingListener {
        final AppCompatSpinner this$0;
        final DropdownPopup val$popup;

        public ListPopupWindow getPopup() {
            return this.val$popup;
        }

        public boolean onForwardingStarted() {
            if (!AppCompatSpinner.access$000(this.this$0).isShowing()) {
                AppCompatSpinner.access$000(this.this$0).show();
            }
            return true;
        }

        1(AppCompatSpinner appCompatSpinner, View view, DropdownPopup dropdownPopup) {
            this.this$0 = appCompatSpinner;
            this.val$popup = dropdownPopup;
            super(view);
        }
    }

    class DropDownAdapter implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter mAdapter;
        private ListAdapter mListAdapter;

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return this.mAdapter == null ? null : this.mAdapter.getDropDownView(i, view, viewGroup);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.mAdapter != null) {
                this.mAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean hasStableIds() {
            return this.mAdapter != null && this.mAdapter.hasStableIds();
        }

        public Object getItem(int i) {
            return this.mAdapter == null ? null : this.mAdapter.getItem(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.mAdapter != null) {
                this.mAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public long getItemId(int i) {
            return this.mAdapter == null ? -1 : this.mAdapter.getItemId(i);
        }

        public DropDownAdapter(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Theme theme) {
            this.mAdapter = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.mListAdapter = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (AppCompatSpinner.access$100() && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                    if (!LinearLayoutCompat.a) {
                        return;
                    }
                }
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter2 = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter2.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter2.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        public int getCount() {
            return this.mAdapter == null ? 0 : this.mAdapter.getCount();
        }

        public int getViewTypeCount() {
            return 1;
        }
    }

    class DropdownPopup extends ListPopupWindow {
        private ListAdapter mAdapter;
        private CharSequence mHintText;
        private final Rect mVisibleRect;
        final AppCompatSpinner this$0;

        class 1 implements OnItemClickListener {
            final DropdownPopup this$1;
            final AppCompatSpinner val$this$0;

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.this$1.this$0.setSelection(i);
                if (this.this$1.this$0.getOnItemClickListener() != null) {
                    this.this$1.this$0.performItemClick(view, i, DropdownPopup.access$200(this.this$1).getItemId(i));
                }
                this.this$1.dismiss();
            }

            1(DropdownPopup dropdownPopup, AppCompatSpinner appCompatSpinner) {
                this.this$1 = dropdownPopup;
                this.val$this$0 = appCompatSpinner;
            }
        }

        class 2 implements OnGlobalLayoutListener {
            final DropdownPopup this$1;

            public void onGlobalLayout() {
                if (!DropdownPopup.access$600(this.this$1, this.this$1.this$0)) {
                    this.this$1.dismiss();
                    if (!LinearLayoutCompat.a) {
                        return;
                    }
                }
                this.this$1.computeContentWidth();
                DropdownPopup.access$701(this.this$1);
            }

            2(DropdownPopup dropdownPopup) {
                this.this$1 = dropdownPopup;
            }
        }

        class 3 implements OnDismissListener {
            final DropdownPopup this$1;
            final OnGlobalLayoutListener val$layoutListener;

            3(DropdownPopup dropdownPopup, OnGlobalLayoutListener onGlobalLayoutListener) {
                this.this$1 = dropdownPopup;
                this.val$layoutListener = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = this.this$1.this$0.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.val$layoutListener);
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void computeContentWidth() {
            /*
            r8 = this;
            r1 = 0;
            r3 = android.support.v7.widget.LinearLayoutCompat.a;
            r0 = r8.getBackground();
            if (r0 == 0) goto L_0x00cc;
        L_0x0009:
            r2 = r8.this$0;
            r2 = android.support.v7.widget.AppCompatSpinner.access$300(r2);
            r0.getPadding(r2);
            r0 = r8.this$0;
            r0 = android.support.v7.widget.ViewUtils.isLayoutRtl(r0);
            if (r0 == 0) goto L_0x00bf;
        L_0x001a:
            r0 = r8.this$0;
            r0 = android.support.v7.widget.AppCompatSpinner.access$300(r0);
            r0 = r0.right;
        L_0x0022:
            if (r3 == 0) goto L_0x0034;
        L_0x0024:
            r2 = r8.this$0;
            r2 = android.support.v7.widget.AppCompatSpinner.access$300(r2);
            r4 = r8.this$0;
            r4 = android.support.v7.widget.AppCompatSpinner.access$300(r4);
            r4.right = r1;
            r2.left = r1;
        L_0x0034:
            r1 = r0;
            r0 = r8.this$0;
            r4 = r0.getPaddingLeft();
            r0 = r8.this$0;
            r5 = r0.getPaddingRight();
            r0 = r8.this$0;
            r6 = r0.getWidth();
            r0 = r8.this$0;
            r0 = android.support.v7.widget.AppCompatSpinner.access$400(r0);
            r2 = -2;
            if (r0 != r2) goto L_0x008e;
        L_0x0050:
            r2 = r8.this$0;
            r0 = r8.mAdapter;
            r0 = (android.widget.SpinnerAdapter) r0;
            r7 = r8.getBackground();
            r2 = android.support.v7.widget.AppCompatSpinner.access$500(r2, r0, r7);
            r0 = r8.this$0;
            r0 = r0.getContext();
            r0 = r0.getResources();
            r0 = r0.getDisplayMetrics();
            r0 = r0.widthPixels;
            r7 = r8.this$0;
            r7 = android.support.v7.widget.AppCompatSpinner.access$300(r7);
            r7 = r7.left;
            r0 = r0 - r7;
            r7 = r8.this$0;
            r7 = android.support.v7.widget.AppCompatSpinner.access$300(r7);
            r7 = r7.right;
            r0 = r0 - r7;
            if (r2 <= r0) goto L_0x00ca;
        L_0x0082:
            r2 = r6 - r4;
            r2 = r2 - r5;
            r0 = java.lang.Math.max(r0, r2);
            r8.setContentWidth(r0);
            if (r3 == 0) goto L_0x00a8;
        L_0x008e:
            r0 = r8.this$0;
            r0 = android.support.v7.widget.AppCompatSpinner.access$400(r0);
            r2 = -1;
            if (r0 != r2) goto L_0x009f;
        L_0x0097:
            r0 = r6 - r4;
            r0 = r0 - r5;
            r8.setContentWidth(r0);
            if (r3 == 0) goto L_0x00a8;
        L_0x009f:
            r0 = r8.this$0;
            r0 = android.support.v7.widget.AppCompatSpinner.access$400(r0);
            r8.setContentWidth(r0);
        L_0x00a8:
            r0 = r8.this$0;
            r0 = android.support.v7.widget.ViewUtils.isLayoutRtl(r0);
            if (r0 == 0) goto L_0x00ba;
        L_0x00b0:
            r0 = r6 - r5;
            r2 = r8.getWidth();
            r0 = r0 - r2;
            r1 = r1 + r0;
            if (r3 == 0) goto L_0x00bb;
        L_0x00ba:
            r1 = r1 + r4;
        L_0x00bb:
            r8.setHorizontalOffset(r1);
            return;
        L_0x00bf:
            r0 = r8.this$0;
            r0 = android.support.v7.widget.AppCompatSpinner.access$300(r0);
            r0 = r0.left;
            r0 = -r0;
            goto L_0x0022;
        L_0x00ca:
            r0 = r2;
            goto L_0x0082;
        L_0x00cc:
            r0 = r1;
            goto L_0x0024;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatSpinner.DropdownPopup.computeContentWidth():void");
        }

        public void show() {
            boolean isShowing = isShowing();
            computeContentWidth();
            setInputMethodMode(2);
            super.show();
            getListView().setChoiceMode(1);
            setSelection(this.this$0.getSelectedItemPosition());
            if (!isShowing) {
                ViewTreeObserver viewTreeObserver = this.this$0.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    OnGlobalLayoutListener 2 = new 2(this);
                    viewTreeObserver.addOnGlobalLayoutListener(2);
                    setOnDismissListener(new 3(this, 2));
                }
            }
        }

        private boolean isVisibleToUser(View view) {
            return ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(this.mVisibleRect);
        }

        public DropdownPopup(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
            this.this$0 = appCompatSpinner;
            super(context, attributeSet, i);
            this.mVisibleRect = new Rect();
            setAnchorView(appCompatSpinner);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new 1(this, appCompatSpinner));
        }

        static void access$701(DropdownPopup dropdownPopup) {
            super.show();
        }

        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.mAdapter = listAdapter;
        }

        static ListAdapter access$200(DropdownPopup dropdownPopup) {
            return dropdownPopup.mAdapter;
        }

        public void setPromptText(CharSequence charSequence) {
            this.mHintText = charSequence;
        }

        static boolean access$600(DropdownPopup dropdownPopup, View view) {
            return dropdownPopup.isVisibleToUser(view);
        }

        public CharSequence getHintText() {
            return this.mHintText;
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    private int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        boolean z = LinearLayoutCompat.a;
        if (spinnerAdapter == null) {
            return 0;
        }
        int itemViewType;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i = 0;
        max = 0;
        while (max2 < min) {
            View view2;
            itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != max) {
                view2 = null;
            } else {
                itemViewType = max;
                view2 = view;
            }
            View view3 = spinnerAdapter.getView(max2, view2, this);
            if (view3.getLayoutParams() == null) {
                view3.setLayoutParams(new LayoutParams(-2, -2));
            }
            view3.measure(makeMeasureSpec, makeMeasureSpec2);
            max = Math.max(i, view3.getMeasuredWidth());
            int i2 = max2 + 1;
            if (z) {
                itemViewType = max;
                break;
            }
            max2 = i2;
            i = max;
            view = view3;
            max = itemViewType;
        }
        itemViewType = i;
        if (drawable == null) {
            return itemViewType;
        }
        drawable.getPadding(this.mTempRect);
        return itemViewType + (this.mTempRect.left + this.mTempRect.right);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mForwardingListener == null || !this.mForwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, R.attr.spinnerStyle, i);
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.mPopup != null) {
            this.mPopup.setVerticalOffset(i);
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        if (IS_AT_LEAST_JB) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(getPopupContext().getDrawable(i));
    }

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public Context getPopupContext() {
        if (this.mPopup != null) {
            return this.mPopupContext;
        }
        if (IS_AT_LEAST_M) {
            return super.getPopupContext();
        }
        return null;
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundResource(i);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mPopup != null && this.mPopup.isShowing()) {
            this.mPopup.dismiss();
        }
    }

    static int access$400(AppCompatSpinner appCompatSpinner) {
        return appCompatSpinner.mDropDownWidth;
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.mPopup != null) {
            this.mPopup.setBackgroundDrawable(drawable);
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        if (IS_AT_LEAST_JB) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    static boolean access$100() {
        return IS_AT_LEAST_M;
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.mPopup != null) {
            this.mPopup.setPromptText(charSequence);
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        super.setPrompt(charSequence);
    }

    static int access$500(AppCompatSpinner appCompatSpinner, SpinnerAdapter spinnerAdapter, Drawable drawable) {
        return appCompatSpinner.compatMeasureContentWidth(spinnerAdapter, drawable);
    }

    public void setDropDownWidth(int i) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i;
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        if (IS_AT_LEAST_JB) {
            super.setDropDownWidth(i);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.applySupportBackgroundTint();
        }
    }

    public Drawable getPopupBackground() {
        if (this.mPopup != null) {
            return this.mPopup.getBackground();
        }
        if (IS_AT_LEAST_JB) {
            return super.getPopupBackground();
        }
        return null;
    }

    static {
        String[] strArr = new String[2];
        String str = "xK#YGTK2n{IR=tMK";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 57;
                        break;
                    case at.g /*1*/:
                        i4 = 59;
                        break;
                    case at.i /*2*/:
                        i4 = 83;
                        break;
                    case at.o /*3*/:
                        i4 = 26;
                        break;
                    default:
                        i4 = 40;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    boolean z;
                    strArr2[i2] = str;
                    z = strArr3;
                    if (VERSION.SDK_INT >= 23) {
                        z = true;
                    } else {
                        z = false;
                    }
                    IS_AT_LEAST_M = z;
                    if (VERSION.SDK_INT >= 16) {
                        z = true;
                    } else {
                        z = false;
                    }
                    IS_AT_LEAST_JB = z;
                    ATTRS_ANDROID_SPINNERMODE = new int[]{16843505};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "zT&vL\u0019U<n\bK^2~\bXU7hGP_iiXPU=\u007fZtT7\u007f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.mPopupSet) {
            super.setAdapter(spinnerAdapter);
            if (this.mPopup != null) {
                this.mPopup.setAdapter(new DropDownAdapter(spinnerAdapter, (this.mPopupContext == null ? getContext() : this.mPopupContext).getTheme()));
                return;
            }
            return;
        }
        this.mTempAdapter = spinnerAdapter;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13, android.content.res.Resources.Theme r14) {
        /*
        r9 = this;
        r1 = 0;
        r2 = 1;
        r8 = 0;
        r3 = android.support.v7.widget.LinearLayoutCompat.a;
        r9.<init>(r10, r11, r12);
        r0 = new android.graphics.Rect;
        r0.<init>();
        r9.mTempRect = r0;
        r0 = android.support.v7.appcompat.R.styleable.Spinner;
        r4 = android.support.v7.widget.TintTypedArray.obtainStyledAttributes(r10, r11, r0, r12, r8);
        r0 = r4.getTintManager();	 Catch:{ Exception -> 0x00c0 }
        r9.mTintManager = r0;	 Catch:{ Exception -> 0x00c0 }
        r0 = new android.support.v7.widget.AppCompatBackgroundHelper;	 Catch:{ Exception -> 0x00c0 }
        r5 = r9.mTintManager;	 Catch:{ Exception -> 0x00c0 }
        r0.<init>(r9, r5);	 Catch:{ Exception -> 0x00c0 }
        r9.mBackgroundTintHelper = r0;	 Catch:{ Exception -> 0x00c0 }
        if (r14 == 0) goto L_0x002f;
    L_0x0026:
        r0 = new android.support.v7.view.ContextThemeWrapper;	 Catch:{ Exception -> 0x00c0 }
        r0.<init>(r10, r14);	 Catch:{ Exception -> 0x00c0 }
        r9.mPopupContext = r0;	 Catch:{ Exception -> 0x00c0 }
        if (r3 == 0) goto L_0x0047;
    L_0x002f:
        r0 = android.support.v7.appcompat.R.styleable.Spinner_popupTheme;
        r0 = r4.getResourceId(r0, r8);
        if (r0 == 0) goto L_0x0040;
    L_0x0037:
        r5 = new android.support.v7.view.ContextThemeWrapper;	 Catch:{ Exception -> 0x00c2 }
        r5.<init>(r10, r0);	 Catch:{ Exception -> 0x00c2 }
        r9.mPopupContext = r5;	 Catch:{ Exception -> 0x00c2 }
        if (r3 == 0) goto L_0x0047;
    L_0x0040:
        r0 = IS_AT_LEAST_M;	 Catch:{ Exception -> 0x00c4 }
        if (r0 != 0) goto L_0x00c8;
    L_0x0044:
        r0 = r10;
    L_0x0045:
        r9.mPopupContext = r0;
    L_0x0047:
        r0 = r9.mPopupContext;	 Catch:{ Exception -> 0x00cb }
        if (r0 == 0) goto L_0x00a8;
    L_0x004b:
        r0 = -1;
        if (r13 != r0) goto L_0x0070;
    L_0x004e:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x00cd }
        r5 = 11;
        if (r0 < r5) goto L_0x006f;
    L_0x0054:
        r0 = ATTRS_ANDROID_SPINNERMODE;	 Catch:{ Exception -> 0x00d1 }
        r5 = 0;
        r1 = r10.obtainStyledAttributes(r11, r0, r12, r5);	 Catch:{ Exception -> 0x00d1 }
        r0 = 0;
        r0 = r1.hasValue(r0);	 Catch:{ Exception -> 0x00d1 }
        if (r0 == 0) goto L_0x0068;
    L_0x0062:
        r0 = 0;
        r5 = 0;
        r13 = r1.getInt(r0, r5);	 Catch:{ Exception -> 0x00d1 }
    L_0x0068:
        if (r1 == 0) goto L_0x006d;
    L_0x006a:
        r1.recycle();	 Catch:{ Exception -> 0x00cf }
    L_0x006d:
        if (r3 == 0) goto L_0x0070;
    L_0x006f:
        r13 = r2;
    L_0x0070:
        if (r13 != r2) goto L_0x00a8;
    L_0x0072:
        r0 = new android.support.v7.widget.AppCompatSpinner$DropdownPopup;
        r1 = r9.mPopupContext;
        r0.<init>(r9, r1, r11, r12);
        r1 = r9.mPopupContext;
        r2 = android.support.v7.appcompat.R.styleable.Spinner;
        r1 = android.support.v7.widget.TintTypedArray.obtainStyledAttributes(r1, r11, r2, r12, r8);
        r2 = android.support.v7.appcompat.R.styleable.Spinner_android_dropDownWidth;
        r3 = -2;
        r2 = r1.getLayoutDimension(r2, r3);
        r9.mDropDownWidth = r2;
        r2 = android.support.v7.appcompat.R.styleable.Spinner_android_popupBackground;
        r2 = r1.getDrawable(r2);
        r0.setBackgroundDrawable(r2);
        r2 = android.support.v7.appcompat.R.styleable.Spinner_android_prompt;
        r2 = r4.getString(r2);
        r0.setPromptText(r2);
        r1.recycle();
        r9.mPopup = r0;
        r1 = new android.support.v7.widget.AppCompatSpinner$1;
        r1.<init>(r9, r9, r0);
        r9.mForwardingListener = r1;
    L_0x00a8:
        r4.recycle();	 Catch:{ Exception -> 0x00ee }
        r0 = 1;
        r9.mPopupSet = r0;	 Catch:{ Exception -> 0x00ee }
        r0 = r9.mTempAdapter;	 Catch:{ Exception -> 0x00ee }
        if (r0 == 0) goto L_0x00ba;
    L_0x00b2:
        r0 = r9.mTempAdapter;	 Catch:{ Exception -> 0x00ee }
        r9.setAdapter(r0);	 Catch:{ Exception -> 0x00ee }
        r0 = 0;
        r9.mTempAdapter = r0;	 Catch:{ Exception -> 0x00ee }
    L_0x00ba:
        r0 = r9.mBackgroundTintHelper;
        r0.loadFromAttributes(r11, r12);
        return;
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = r1;
        goto L_0x0045;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        r5 = z;	 Catch:{ all -> 0x00e5 }
        r6 = 0;
        r5 = r5[r6];	 Catch:{ all -> 0x00e5 }
        r6 = z;	 Catch:{ all -> 0x00e5 }
        r7 = 1;
        r6 = r6[r7];	 Catch:{ all -> 0x00e5 }
        android.util.Log.i(r5, r6, r0);	 Catch:{ all -> 0x00e5 }
        if (r1 == 0) goto L_0x006d;
    L_0x00e1:
        r1.recycle();
        goto L_0x006d;
    L_0x00e5:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00eb;
    L_0x00e8:
        r1.recycle();	 Catch:{ Exception -> 0x00ec }
    L_0x00eb:
        throw r0;
    L_0x00ec:
        r0 = move-exception;
        throw r0;
    L_0x00ee:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public void setAdapter(Adapter adapter) {
        setAdapter((SpinnerAdapter) adapter);
    }

    public CharSequence getPrompt() {
        return this.mPopup != null ? this.mPopup.getHintText() : super.getPrompt();
    }

    public boolean performClick() {
        if (this.mPopup == null || this.mPopup.isShowing()) {
            return super.performClick();
        }
        this.mPopup.show();
        return true;
    }

    public int getDropDownVerticalOffset() {
        if (this.mPopup != null) {
            return this.mPopup.getVerticalOffset();
        }
        if (IS_AT_LEAST_JB) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.mPopup != null) {
            this.mPopup.setHorizontalOffset(i);
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        if (IS_AT_LEAST_JB) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    static DropdownPopup access$000(AppCompatSpinner appCompatSpinner) {
        return appCompatSpinner.mPopup;
    }

    public int getDropDownWidth() {
        if (this.mPopup != null) {
            return this.mDropDownWidth;
        }
        if (IS_AT_LEAST_JB) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
        }
    }

    public int getDropDownHorizontalOffset() {
        if (this.mPopup != null) {
            return this.mPopup.getHorizontalOffset();
        }
        if (IS_AT_LEAST_JB) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    static Rect access$300(AppCompatSpinner appCompatSpinner) {
        return appCompatSpinner.mTempRect;
    }

    public void setSupportBackgroundTintMode(@Nullable Mode mode) {
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.setSupportBackgroundTintMode(mode);
        }
    }
}
