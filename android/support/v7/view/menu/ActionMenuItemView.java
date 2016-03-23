package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.MenuBuilder.ItemInvoker;
import android.support.v7.view.menu.MenuView.ItemView;
import android.support.v7.widget.ActionMenuView.ActionMenuChildView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.ListPopupWindow.ForwardingListener;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class ActionMenuItemView extends AppCompatTextView implements ItemView, OnClickListener, OnLongClickListener, ActionMenuChildView {
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private ForwardingListener mForwardingListener;
    private Drawable mIcon;
    private MenuItemImpl mItemData;
    private ItemInvoker mItemInvoker;
    private int mMaxIconSize;
    private int mMinWidth;
    private PopupCallback mPopupCallback;
    private int mSavedPaddingLeft;
    private CharSequence mTitle;

    class ActionMenuItemForwardingListener extends ForwardingListener {
        final ActionMenuItemView this$0;

        public ActionMenuItemForwardingListener(ActionMenuItemView actionMenuItemView) {
            this.this$0 = actionMenuItemView;
            super(actionMenuItemView);
        }

        protected boolean onForwardingStarted() {
            if (ActionMenuItemView.access$100(this.this$0) == null || !ActionMenuItemView.access$100(this.this$0).invokeItem(ActionMenuItemView.access$200(this.this$0))) {
                return false;
            }
            ListPopupWindow popup = getPopup();
            if (popup == null || !popup.isShowing()) {
                return false;
            }
            return true;
        }

        public ListPopupWindow getPopup() {
            if (ActionMenuItemView.access$000(this.this$0) != null) {
                return ActionMenuItemView.access$000(this.this$0).getPopup();
            }
            return null;
        }
    }

    public abstract class PopupCallback {
        public abstract ListPopupWindow getPopup();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mItemData.hasSubMenu() && this.mForwardingListener != null && this.mForwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.mAllowTextWithIcon = resources.getBoolean(R.bool.abc_config_allowActionMenuItemTextWithIcon);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionMenuItemView, i, 0);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.mMaxIconSize = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.mSavedPaddingLeft = -1;
    }

    public void initialize(MenuItemImpl menuItemImpl, int i) {
        int i2;
        this.mItemData = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitleForItemView(this));
        setId(menuItemImpl.getItemId());
        if (menuItemImpl.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.mForwardingListener == null) {
            this.mForwardingListener = new ActionMenuItemForwardingListener(this);
        }
    }

    private void updateTextButtonVisibility() {
        int i;
        CharSequence charSequence;
        int i2 = 0;
        if (TextUtils.isEmpty(this.mTitle)) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.mIcon == null || (this.mItemData.showsTextAsAction() && (this.mAllowTextWithIcon || this.mExpandedFormat))) {
            i2 = 1;
        }
        if ((i & i2) != 0) {
            charSequence = this.mTitle;
        } else {
            charSequence = null;
        }
        setText(charSequence);
    }

    public boolean hasText() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLongClick(android.view.View r10) {
        /*
        r9 = this;
        r2 = 1;
        r1 = 0;
        r0 = r9.hasText();
        if (r0 == 0) goto L_0x000a;
    L_0x0008:
        r0 = r1;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = 2;
        r3 = new int[r0];
        r4 = new android.graphics.Rect;
        r4.<init>();
        r9.getLocationOnScreen(r3);
        r9.getWindowVisibleDisplayFrame(r4);
        r5 = r9.getContext();
        r0 = r9.getWidth();
        r6 = r9.getHeight();
        r7 = r3[r2];
        r8 = r6 / 2;
        r7 = r7 + r8;
        r8 = r3[r1];
        r0 = r0 / 2;
        r0 = r0 + r8;
        r8 = android.support.v4.view.ViewCompat.getLayoutDirection(r10);
        if (r8 != 0) goto L_0x0040;
    L_0x0034:
        r8 = r5.getResources();
        r8 = r8.getDisplayMetrics();
        r8 = r8.widthPixels;
        r0 = r8 - r0;
    L_0x0040:
        r8 = r9.mItemData;
        r8 = r8.getTitle();
        r5 = android.widget.Toast.makeText(r5, r8, r1);
        r8 = r4.height();
        if (r7 >= r8) goto L_0x0060;
    L_0x0050:
        r7 = 8388661; // 0x800035 float:1.1755018E-38 double:4.144549E-317;
        r3 = r3[r2];
        r3 = r3 + r6;
        r4 = r4.top;
        r3 = r3 - r4;
        r5.setGravity(r7, r0, r3);
        r0 = android.support.v7.view.menu.MenuBuilder.a;
        if (r0 == 0) goto L_0x0065;
    L_0x0060:
        r0 = 81;
        r5.setGravity(r0, r1, r6);
    L_0x0065:
        r5.show();
        r0 = r2;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.ActionMenuItemView.onLongClick(android.view.View):boolean");
    }

    static ItemInvoker access$100(ActionMenuItemView actionMenuItemView) {
        return actionMenuItemView.mItemInvoker;
    }

    public void setPopupCallback(PopupCallback popupCallback) {
        this.mPopupCallback = popupCallback;
    }

    static MenuItemImpl access$200(ActionMenuItemView actionMenuItemView) {
        return actionMenuItemView.mItemData;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.mAllowTextWithIcon = getContext().getResources().getBoolean(R.bool.abc_config_allowActionMenuItemTextWithIcon);
        updateTextButtonVisibility();
    }

    public MenuItemImpl getItemData() {
        return this.mItemData;
    }

    public boolean needsDividerAfter() {
        return hasText();
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        setContentDescription(this.mTitle);
        updateTextButtonVisibility();
    }

    static PopupCallback access$000(ActionMenuItemView actionMenuItemView) {
        return actionMenuItemView.mPopupCallback;
    }

    public void setItemInvoker(ItemInvoker itemInvoker) {
        this.mItemInvoker = itemInvoker;
    }

    public boolean needsDividerBefore() {
        return hasText() && this.mItemData.getIcon() == null;
    }

    public boolean prefersCondensedTitle() {
        return true;
    }

    protected void onMeasure(int i, int i2) {
        boolean hasText = hasText();
        if (hasText && this.mSavedPaddingLeft >= 0) {
            super.setPadding(this.mSavedPaddingLeft, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, this.mMinWidth);
        } else {
            size = this.mMinWidth;
        }
        if (mode != 1073741824 && this.mMinWidth > 0 && measuredWidth < size) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        if (!hasText && this.mIcon != null) {
            super.setPadding((getMeasuredWidth() - this.mIcon.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        if (drawable != null) {
            float f;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.mMaxIconSize) {
                f = ((float) this.mMaxIconSize) / ((float) intrinsicWidth);
                intrinsicWidth = this.mMaxIconSize;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.mMaxIconSize) {
                f = ((float) this.mMaxIconSize) / ((float) intrinsicHeight);
                intrinsicHeight = this.mMaxIconSize;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        updateTextButtonVisibility();
    }

    public void onClick(View view) {
        if (this.mItemInvoker != null) {
            this.mItemInvoker.invokeItem(this.mItemData);
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.mSavedPaddingLeft = i;
        super.setPadding(i, i2, i3, i4);
    }
}
