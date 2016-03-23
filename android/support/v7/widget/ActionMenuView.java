package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.annotation.StyleRes;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.ItemInvoker;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends LinearLayoutCompat implements ItemInvoker, MenuView {
    private Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    private MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    private OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    class ActionMenuPresenterCallback implements Callback {
        final ActionMenuView this$0;

        ActionMenuPresenterCallback(ActionMenuView actionMenuView, 1 1) {
            this(actionMenuView);
        }

        private ActionMenuPresenterCallback(ActionMenuView actionMenuView) {
            this.this$0 = actionMenuView;
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            return false;
        }
    }

    public class LayoutParams extends android.support.v7.widget.LinearLayoutCompat.LayoutParams {
        @ExportedProperty
        public int cellsUsed;
        @ExportedProperty
        public boolean expandable;
        boolean expanded;
        @ExportedProperty
        public int extraPixels;
        @ExportedProperty
        public boolean isOverflowButton;
        @ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.isOverflowButton = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class MenuBuilderCallback implements MenuBuilder.Callback {
        final ActionMenuView this$0;

        MenuBuilderCallback(ActionMenuView actionMenuView, 1 1) {
            this(actionMenuView);
        }

        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (ActionMenuView.access$300(this.this$0) != null) {
                ActionMenuView.access$300(this.this$0).onMenuModeChange(menuBuilder);
            }
        }

        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return ActionMenuView.access$200(this.this$0) != null && ActionMenuView.access$200(this.this$0).onMenuItemClick(menuItem);
        }

        private MenuBuilderCallback(ActionMenuView actionMenuView) {
            this.this$0 = actionMenuView;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
        r17 = this;
        r9 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r17;
        r1 = r0.mFormatItems;
        if (r1 != 0) goto L_0x000c;
    L_0x0008:
        super.onLayout(r18, r19, r20, r21, r22);
    L_0x000b:
        return;
    L_0x000c:
        r10 = r17.getChildCount();
        r1 = r22 - r20;
        r11 = r1 / 2;
        r12 = r17.getDividerWidth();
        r7 = 0;
        r6 = 0;
        r1 = r21 - r19;
        r2 = r17.getPaddingRight();
        r1 = r1 - r2;
        r2 = r17.getPaddingLeft();
        r5 = r1 - r2;
        r2 = 0;
        r13 = android.support.v7.widget.ViewUtils.isLayoutRtl(r17);
        r1 = 0;
        r8 = r1;
    L_0x002e:
        if (r8 >= r10) goto L_0x0188;
    L_0x0030:
        r0 = r17;
        r14 = r0.getChildAt(r8);
        r1 = r14.getVisibility();
        r3 = 8;
        if (r1 != r3) goto L_0x0040;
    L_0x003e:
        if (r9 == 0) goto L_0x0184;
    L_0x0040:
        r1 = r14.getLayoutParams();
        r1 = (android.support.v7.widget.ActionMenuView.LayoutParams) r1;
        r3 = r1.isOverflowButton;
        if (r3 == 0) goto L_0x0181;
    L_0x004a:
        r2 = r14.getMeasuredWidth();
        r0 = r17;
        r3 = r0.hasSupportDividerBeforeChildAt(r8);
        if (r3 == 0) goto L_0x0057;
    L_0x0056:
        r2 = r2 + r12;
    L_0x0057:
        r15 = r14.getMeasuredHeight();
        if (r13 == 0) goto L_0x0068;
    L_0x005d:
        r3 = r17.getPaddingLeft();
        r4 = r1.leftMargin;
        r3 = r3 + r4;
        r4 = r3 + r2;
        if (r9 == 0) goto L_0x0077;
    L_0x0068:
        r3 = r17.getWidth();
        r4 = r17.getPaddingRight();
        r3 = r3 - r4;
        r4 = r1.rightMargin;
        r4 = r3 - r4;
        r3 = r4 - r2;
    L_0x0077:
        r16 = r15 / 2;
        r16 = r11 - r16;
        r15 = r15 + r16;
        r0 = r16;
        r14.layout(r3, r0, r4, r15);
        r3 = r5 - r2;
        r2 = 1;
        if (r9 == 0) goto L_0x017c;
    L_0x0087:
        r4 = r14.getMeasuredWidth();
        r5 = r1.leftMargin;
        r4 = r4 + r5;
        r1 = r1.rightMargin;
        r4 = r4 + r1;
        r1 = r7 + r4;
        r5 = r3 - r4;
        r0 = r17;
        r3 = r0.hasSupportDividerBeforeChildAt(r8);
        if (r3 == 0) goto L_0x009e;
    L_0x009d:
        r1 = r1 + r12;
    L_0x009e:
        r6 = r6 + 1;
        r3 = r1;
        r1 = r6;
    L_0x00a2:
        r4 = r8 + 1;
        if (r9 == 0) goto L_0x0177;
    L_0x00a6:
        r3 = r1;
    L_0x00a7:
        r1 = 1;
        if (r10 != r1) goto L_0x00cd;
    L_0x00aa:
        if (r2 != 0) goto L_0x00cd;
    L_0x00ac:
        r1 = 0;
        r0 = r17;
        r1 = r0.getChildAt(r1);
        r2 = r1.getMeasuredWidth();
        r3 = r1.getMeasuredHeight();
        r4 = r21 - r19;
        r4 = r4 / 2;
        r5 = r2 / 2;
        r4 = r4 - r5;
        r5 = r3 / 2;
        r5 = r11 - r5;
        r2 = r2 + r4;
        r3 = r3 + r5;
        r1.layout(r4, r5, r2, r3);
        goto L_0x000b;
    L_0x00cd:
        if (r2 == 0) goto L_0x0169;
    L_0x00cf:
        r1 = 0;
    L_0x00d0:
        r1 = r3 - r1;
        r2 = 0;
        if (r1 <= 0) goto L_0x016c;
    L_0x00d5:
        r1 = r5 / r1;
    L_0x00d7:
        r4 = java.lang.Math.max(r2, r1);
        if (r13 == 0) goto L_0x0126;
    L_0x00dd:
        r1 = r17.getWidth();
        r2 = r17.getPaddingRight();
        r2 = r1 - r2;
        r1 = 0;
        r3 = r1;
    L_0x00e9:
        if (r3 >= r10) goto L_0x0124;
    L_0x00eb:
        r0 = r17;
        r5 = r0.getChildAt(r3);
        r1 = r5.getLayoutParams();
        r1 = (android.support.v7.widget.ActionMenuView.LayoutParams) r1;
        r6 = r5.getVisibility();
        r7 = 8;
        if (r6 == r7) goto L_0x0175;
    L_0x00ff:
        r6 = r1.isOverflowButton;
        if (r6 == 0) goto L_0x0105;
    L_0x0103:
        if (r9 == 0) goto L_0x0175;
    L_0x0105:
        r6 = r1.rightMargin;
        r2 = r2 - r6;
        r6 = r5.getMeasuredWidth();
        r7 = r5.getMeasuredHeight();
        r8 = r7 / 2;
        r8 = r11 - r8;
        r12 = r2 - r6;
        r7 = r7 + r8;
        r5.layout(r12, r8, r2, r7);
        r1 = r1.leftMargin;
        r1 = r1 + r6;
        r1 = r1 + r4;
        r1 = r2 - r1;
    L_0x0120:
        r2 = r3 + 1;
        if (r9 == 0) goto L_0x0171;
    L_0x0124:
        if (r9 == 0) goto L_0x000b;
    L_0x0126:
        r2 = r17.getPaddingLeft();
        r1 = 0;
        r3 = r1;
    L_0x012c:
        if (r3 >= r10) goto L_0x000b;
    L_0x012e:
        r0 = r17;
        r5 = r0.getChildAt(r3);
        r1 = r5.getLayoutParams();
        r1 = (android.support.v7.widget.ActionMenuView.LayoutParams) r1;
        r6 = r5.getVisibility();
        r7 = 8;
        if (r6 == r7) goto L_0x016f;
    L_0x0142:
        r6 = r1.isOverflowButton;
        if (r6 == 0) goto L_0x0148;
    L_0x0146:
        if (r9 == 0) goto L_0x016f;
    L_0x0148:
        r6 = r1.leftMargin;
        r2 = r2 + r6;
        r6 = r5.getMeasuredWidth();
        r7 = r5.getMeasuredHeight();
        r8 = r7 / 2;
        r8 = r11 - r8;
        r12 = r2 + r6;
        r7 = r7 + r8;
        r5.layout(r2, r8, r12, r7);
        r1 = r1.rightMargin;
        r1 = r1 + r6;
        r1 = r1 + r4;
        r1 = r1 + r2;
    L_0x0162:
        r2 = r3 + 1;
        if (r9 != 0) goto L_0x000b;
    L_0x0166:
        r3 = r2;
        r2 = r1;
        goto L_0x012c;
    L_0x0169:
        r1 = 1;
        goto L_0x00d0;
    L_0x016c:
        r1 = 0;
        goto L_0x00d7;
    L_0x016f:
        r1 = r2;
        goto L_0x0162;
    L_0x0171:
        r3 = r2;
        r2 = r1;
        goto L_0x00e9;
    L_0x0175:
        r1 = r2;
        goto L_0x0120;
    L_0x0177:
        r8 = r4;
        r6 = r1;
        r7 = r3;
        goto L_0x002e;
    L_0x017c:
        r5 = r3;
        r1 = r6;
        r3 = r7;
        goto L_0x00a2;
    L_0x0181:
        r3 = r5;
        goto L_0x0087;
    L_0x0184:
        r1 = r6;
        r3 = r7;
        goto L_0x00a2;
    L_0x0188:
        r3 = r6;
        goto L_0x00a7;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onLayout(boolean, int, int, int, int):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        if (this.mPresenter != null) {
            this.mPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    protected android.view.ViewGroup.LayoutParams m78generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f);
        this.mGeneratedItemPadding = (int) (f * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    static OnMenuItemClickListener access$200(ActionMenuView actionMenuView) {
        return actionMenuView.mOnMenuItemClickListener;
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        this.mPresenter.setMenuView(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onMeasureExactFormat(int r31, int r32) {
        /*
        r30 = this;
        r22 = android.support.v7.widget.LinearLayoutCompat.a;
        r23 = android.view.View.MeasureSpec.getMode(r32);
        r4 = android.view.View.MeasureSpec.getSize(r31);
        r11 = android.view.View.MeasureSpec.getSize(r32);
        r5 = r30.getPaddingLeft();
        r6 = r30.getPaddingRight();
        r5 = r5 + r6;
        r6 = r30.getPaddingTop();
        r7 = r30.getPaddingBottom();
        r17 = r6 + r7;
        r6 = -2;
        r0 = r32;
        r1 = r17;
        r24 = getChildMeasureSpec(r0, r1, r6);
        r25 = r4 - r5;
        r0 = r30;
        r4 = r0.mMinCellSize;
        r7 = r25 / r4;
        r0 = r30;
        r4 = r0.mMinCellSize;
        r4 = r25 % r4;
        if (r7 != 0) goto L_0x0043;
    L_0x003a:
        r4 = 0;
        r0 = r30;
        r1 = r25;
        r0.setMeasuredDimension(r1, r4);
    L_0x0042:
        return;
    L_0x0043:
        r0 = r30;
        r5 = r0.mMinCellSize;
        r4 = r4 / r7;
        r26 = r5 + r4;
        r12 = 0;
        r10 = 0;
        r8 = 0;
        r5 = 0;
        r9 = 0;
        r14 = 0;
        r27 = r30.getChildCount();
        r4 = 0;
        r16 = r4;
        r4 = r5;
    L_0x0059:
        r0 = r16;
        r1 = r27;
        if (r0 >= r1) goto L_0x031b;
    L_0x005f:
        r0 = r30;
        r1 = r16;
        r6 = r0.getChildAt(r1);
        r5 = r6.getVisibility();
        r13 = 8;
        if (r5 != r13) goto L_0x016b;
    L_0x006f:
        r5 = r10;
        r13 = r7;
        r10 = r12;
    L_0x0072:
        r6 = r16 + 1;
        if (r22 == 0) goto L_0x0306;
    L_0x0076:
        r18 = r9;
        r19 = r4;
        r20 = r8;
        r21 = r5;
    L_0x007e:
        if (r18 == 0) goto L_0x0200;
    L_0x0080:
        r4 = 2;
        r0 = r19;
        if (r0 != r4) goto L_0x0200;
    L_0x0085:
        r4 = 1;
        r5 = r4;
    L_0x0087:
        r12 = 0;
    L_0x0088:
        if (r20 <= 0) goto L_0x0301;
    L_0x008a:
        if (r13 <= 0) goto L_0x0301;
    L_0x008c:
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 0;
        r6 = 0;
        r4 = 0;
        r16 = r4;
    L_0x0095:
        r0 = r16;
        r1 = r27;
        if (r0 >= r1) goto L_0x00b3;
    L_0x009b:
        r0 = r30;
        r1 = r16;
        r4 = r0.getChildAt(r1);
        r4 = r4.getLayoutParams();
        r4 = (android.support.v7.widget.ActionMenuView.LayoutParams) r4;
        r0 = r4.expandable;
        r17 = r0;
        if (r17 != 0) goto L_0x0204;
    L_0x00af:
        r4 = r16 + 1;
        if (r22 == 0) goto L_0x02fd;
    L_0x00b3:
        r4 = r6;
        r16 = r8;
        r8 = r7;
        r6 = r14 | r16;
        if (r4 <= r13) goto L_0x0225;
    L_0x00bb:
        r8 = r6;
        r6 = r12;
        r7 = r13;
    L_0x00be:
        if (r18 != 0) goto L_0x0285;
    L_0x00c0:
        r4 = 1;
        r0 = r19;
        if (r0 != r4) goto L_0x0285;
    L_0x00c5:
        r4 = 1;
    L_0x00c6:
        if (r7 <= 0) goto L_0x013f;
    L_0x00c8:
        r12 = 0;
        r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r5 == 0) goto L_0x013f;
    L_0x00ce:
        r5 = r19 + -1;
        if (r7 < r5) goto L_0x00d9;
    L_0x00d2:
        if (r4 != 0) goto L_0x00d9;
    L_0x00d4:
        r5 = 1;
        r0 = r21;
        if (r0 <= r5) goto L_0x013f;
    L_0x00d9:
        r5 = java.lang.Long.bitCount(r8);
        r5 = (float) r5;
        if (r4 != 0) goto L_0x02ed;
    L_0x00e0:
        r12 = 1;
        r12 = r12 & r8;
        r14 = 0;
        r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r4 == 0) goto L_0x00fd;
    L_0x00e9:
        r4 = 0;
        r0 = r30;
        r4 = r0.getChildAt(r4);
        r4 = r4.getLayoutParams();
        r4 = (android.support.v7.widget.ActionMenuView.LayoutParams) r4;
        r4 = r4.preventEdgeOffset;
        if (r4 != 0) goto L_0x00fd;
    L_0x00fa:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r5 = r5 - r4;
    L_0x00fd:
        r4 = 1;
        r12 = r27 + -1;
        r4 = r4 << r12;
        r12 = (long) r4;
        r12 = r12 & r8;
        r14 = 0;
        r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r4 == 0) goto L_0x02ed;
    L_0x0109:
        r4 = r27 + -1;
        r0 = r30;
        r4 = r0.getChildAt(r4);
        r4 = r4.getLayoutParams();
        r4 = (android.support.v7.widget.ActionMenuView.LayoutParams) r4;
        r4 = r4.preventEdgeOffset;
        if (r4 != 0) goto L_0x02ed;
    L_0x011b:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = r5 - r4;
    L_0x011f:
        r5 = 0;
        r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x0288;
    L_0x0124:
        r5 = r7 * r26;
        r5 = (float) r5;
        r4 = r5 / r4;
        r4 = (int) r4;
        r5 = r4;
    L_0x012b:
        r4 = 0;
        r7 = r4;
    L_0x012d:
        r0 = r27;
        if (r7 >= r0) goto L_0x013f;
    L_0x0131:
        r4 = 1;
        r4 = r4 << r7;
        r12 = (long) r4;
        r12 = r12 & r8;
        r14 = 0;
        r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r4 != 0) goto L_0x028c;
    L_0x013b:
        r4 = r7 + 1;
        if (r22 == 0) goto L_0x02ea;
    L_0x013f:
        if (r6 == 0) goto L_0x015b;
    L_0x0141:
        r4 = 0;
        r5 = r4;
    L_0x0143:
        r0 = r27;
        if (r5 >= r0) goto L_0x015b;
    L_0x0147:
        r0 = r30;
        r6 = r0.getChildAt(r5);
        r4 = r6.getLayoutParams();
        r4 = (android.support.v7.widget.ActionMenuView.LayoutParams) r4;
        r7 = r4.expanded;
        if (r7 != 0) goto L_0x02d0;
    L_0x0157:
        r4 = r5 + 1;
        if (r22 == 0) goto L_0x02e7;
    L_0x015b:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r23;
        if (r0 == r4) goto L_0x02e4;
    L_0x0161:
        r4 = r10;
    L_0x0162:
        r0 = r30;
        r1 = r25;
        r0.setMeasuredDimension(r1, r4);
        goto L_0x0042;
    L_0x016b:
        r5 = r6 instanceof android.support.v7.view.menu.ActionMenuItemView;
        r13 = r4 + 1;
        if (r5 == 0) goto L_0x0188;
    L_0x0171:
        r0 = r30;
        r4 = r0.mGeneratedItemPadding;
        r18 = 0;
        r0 = r30;
        r0 = r0.mGeneratedItemPadding;
        r19 = r0;
        r20 = 0;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r6.setPadding(r4, r0, r1, r2);
    L_0x0188:
        r4 = r6.getLayoutParams();
        r4 = (android.support.v7.widget.ActionMenuView.LayoutParams) r4;
        r18 = 0;
        r0 = r18;
        r4.expanded = r0;
        r18 = 0;
        r0 = r18;
        r4.extraPixels = r0;
        r18 = 0;
        r0 = r18;
        r4.cellsUsed = r0;
        r18 = 0;
        r0 = r18;
        r4.expandable = r0;
        r18 = 0;
        r0 = r18;
        r4.leftMargin = r0;
        r18 = 0;
        r0 = r18;
        r4.rightMargin = r0;
        if (r5 == 0) goto L_0x01fc;
    L_0x01b4:
        r5 = r6;
        r5 = (android.support.v7.view.menu.ActionMenuItemView) r5;
        r5 = r5.hasText();
        if (r5 == 0) goto L_0x01fc;
    L_0x01bd:
        r5 = 1;
    L_0x01be:
        r4.preventEdgeOffset = r5;
        r5 = r4.isOverflowButton;
        if (r5 == 0) goto L_0x01fe;
    L_0x01c4:
        r5 = 1;
    L_0x01c5:
        r0 = r26;
        r1 = r24;
        r2 = r17;
        r18 = measureChildForCells(r6, r0, r5, r1, r2);
        r0 = r18;
        r10 = java.lang.Math.max(r10, r0);
        r5 = r4.expandable;
        if (r5 == 0) goto L_0x0318;
    L_0x01d9:
        r5 = r8 + 1;
    L_0x01db:
        r4 = r4.isOverflowButton;
        if (r4 == 0) goto L_0x0315;
    L_0x01df:
        r4 = 1;
    L_0x01e0:
        r7 = r7 - r18;
        r6 = r6.getMeasuredHeight();
        r12 = java.lang.Math.max(r12, r6);
        r6 = 1;
        r0 = r18;
        if (r0 != r6) goto L_0x030d;
    L_0x01ef:
        r6 = 1;
        r6 = r6 << r16;
        r8 = (long) r6;
        r14 = r14 | r8;
        r9 = r4;
        r8 = r5;
        r4 = r13;
        r5 = r10;
        r10 = r12;
        r13 = r7;
        goto L_0x0072;
    L_0x01fc:
        r5 = 0;
        goto L_0x01be;
    L_0x01fe:
        r5 = r7;
        goto L_0x01c5;
    L_0x0200:
        r4 = 0;
        r5 = r4;
        goto L_0x0087;
    L_0x0204:
        r0 = r4.cellsUsed;
        r17 = r0;
        r0 = r17;
        if (r0 >= r7) goto L_0x0215;
    L_0x020c:
        r7 = r4.cellsUsed;
        r6 = 1;
        r6 = r6 << r16;
        r8 = (long) r6;
        r6 = 1;
        if (r22 == 0) goto L_0x00af;
    L_0x0215:
        r4 = r4.cellsUsed;
        if (r4 != r7) goto L_0x00af;
    L_0x0219:
        r4 = 1;
        r4 = r4 << r16;
        r0 = (long) r4;
        r28 = r0;
        r8 = r8 | r28;
        r6 = r6 + 1;
        goto L_0x00af;
    L_0x0225:
        r12 = r8 + 1;
        r4 = 0;
        r8 = r6;
        r7 = r4;
        r6 = r13;
    L_0x022b:
        r0 = r27;
        if (r7 >= r0) goto L_0x02fb;
    L_0x022f:
        r0 = r30;
        r13 = r0.getChildAt(r7);
        r4 = r13.getLayoutParams();
        r4 = (android.support.v7.widget.ActionMenuView.LayoutParams) r4;
        r14 = 1;
        r14 = r14 << r7;
        r14 = (long) r14;
        r14 = r14 & r16;
        r28 = 0;
        r14 = (r14 > r28 ? 1 : (r14 == r28 ? 0 : -1));
        if (r14 != 0) goto L_0x0250;
    L_0x0246:
        r14 = r4.cellsUsed;
        if (r14 != r12) goto L_0x02f9;
    L_0x024a:
        r14 = 1;
        r14 = r14 << r7;
        r14 = (long) r14;
        r8 = r8 | r14;
        if (r22 == 0) goto L_0x02f9;
    L_0x0250:
        if (r5 == 0) goto L_0x026f;
    L_0x0252:
        r14 = r4.preventEdgeOffset;
        if (r14 == 0) goto L_0x026f;
    L_0x0256:
        r14 = 1;
        if (r6 != r14) goto L_0x026f;
    L_0x0259:
        r0 = r30;
        r14 = r0.mGeneratedItemPadding;
        r14 = r14 + r26;
        r15 = 0;
        r0 = r30;
        r0 = r0.mGeneratedItemPadding;
        r28 = r0;
        r29 = 0;
        r0 = r28;
        r1 = r29;
        r13.setPadding(r14, r15, r0, r1);
    L_0x026f:
        r13 = r4.cellsUsed;
        r13 = r13 + 1;
        r4.cellsUsed = r13;
        r13 = 1;
        r4.expanded = r13;
        r6 = r6 + -1;
        r4 = r6;
    L_0x027b:
        r6 = r7 + 1;
        if (r22 == 0) goto L_0x02f5;
    L_0x027f:
        r6 = 1;
        if (r22 == 0) goto L_0x02f0;
    L_0x0282:
        r7 = r4;
        goto L_0x00be;
    L_0x0285:
        r4 = 0;
        goto L_0x00c6;
    L_0x0288:
        r4 = 0;
        r5 = r4;
        goto L_0x012b;
    L_0x028c:
        r0 = r30;
        r12 = r0.getChildAt(r7);
        r4 = r12.getLayoutParams();
        r4 = (android.support.v7.widget.ActionMenuView.LayoutParams) r4;
        r12 = r12 instanceof android.support.v7.view.menu.ActionMenuItemView;
        if (r12 == 0) goto L_0x02af;
    L_0x029c:
        r4.extraPixels = r5;
        r6 = 1;
        r4.expanded = r6;
        if (r7 != 0) goto L_0x02ac;
    L_0x02a3:
        r6 = r4.preventEdgeOffset;
        if (r6 != 0) goto L_0x02ac;
    L_0x02a7:
        r6 = -r5;
        r6 = r6 / 2;
        r4.leftMargin = r6;
    L_0x02ac:
        r6 = 1;
        if (r22 == 0) goto L_0x013b;
    L_0x02af:
        r12 = r4.isOverflowButton;
        if (r12 == 0) goto L_0x02c0;
    L_0x02b3:
        r4.extraPixels = r5;
        r6 = 1;
        r4.expanded = r6;
        r6 = -r5;
        r6 = r6 / 2;
        r4.rightMargin = r6;
        r6 = 1;
        if (r22 == 0) goto L_0x013b;
    L_0x02c0:
        if (r7 == 0) goto L_0x02c6;
    L_0x02c2:
        r12 = r5 / 2;
        r4.leftMargin = r12;
    L_0x02c6:
        r12 = r27 + -1;
        if (r7 == r12) goto L_0x013b;
    L_0x02ca:
        r12 = r5 / 2;
        r4.rightMargin = r12;
        goto L_0x013b;
    L_0x02d0:
        r7 = r4.cellsUsed;
        r7 = r7 * r26;
        r4 = r4.extraPixels;
        r4 = r4 + r7;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7);
        r0 = r24;
        r6.measure(r4, r0);
        goto L_0x0157;
    L_0x02e4:
        r4 = r11;
        goto L_0x0162;
    L_0x02e7:
        r5 = r4;
        goto L_0x0143;
    L_0x02ea:
        r7 = r4;
        goto L_0x012d;
    L_0x02ed:
        r4 = r5;
        goto L_0x011f;
    L_0x02f0:
        r12 = r6;
        r14 = r8;
        r13 = r4;
        goto L_0x0088;
    L_0x02f5:
        r7 = r6;
        r6 = r4;
        goto L_0x022b;
    L_0x02f9:
        r4 = r6;
        goto L_0x027b;
    L_0x02fb:
        r4 = r6;
        goto L_0x027f;
    L_0x02fd:
        r16 = r4;
        goto L_0x0095;
    L_0x0301:
        r6 = r12;
        r8 = r14;
        r7 = r13;
        goto L_0x00be;
    L_0x0306:
        r16 = r6;
        r12 = r10;
        r7 = r13;
        r10 = r5;
        goto L_0x0059;
    L_0x030d:
        r9 = r4;
        r8 = r5;
        r4 = r13;
        r5 = r10;
        r10 = r12;
        r13 = r7;
        goto L_0x0072;
    L_0x0315:
        r4 = r9;
        goto L_0x01e0;
    L_0x0318:
        r5 = r8;
        goto L_0x01db;
    L_0x031b:
        r18 = r9;
        r19 = r4;
        r20 = r8;
        r21 = r10;
        r13 = r7;
        r10 = r12;
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasureExactFormat(int, int):void");
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
                if (!LinearLayoutCompat.a) {
                    return;
                }
            }
            this.mPopupContext = new ContextThemeWrapper(getContext(), i);
        }
    }

    public void dismissPopupMenus() {
        if (this.mPresenter != null) {
            this.mPresenter.dismissPopupMenus();
        }
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Callback callback;
            Context context = getContext();
            this.mMenu = new MenuBuilder(context);
            this.mMenu.setCallback(new MenuBuilderCallback(this, null));
            this.mPresenter = new ActionMenuPresenter(context);
            this.mPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter = this.mPresenter;
            if (this.mActionMenuPresenterCallback != null) {
                callback = this.mActionMenuPresenterCallback;
            } else {
                callback = new ActionMenuPresenterCallback(this, null);
            }
            actionMenuPresenter.setCallback(callback);
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        boolean z2 = LinearLayoutCompat.a;
        boolean z3 = this.mFormatItems;
        if (MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.mFormatItems = z;
        if (z3 != this.mFormatItems) {
            this.mFormatItemsWidth = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.mFormatItems || this.mMenu == null || size == this.mFormatItemsWidth)) {
            this.mFormatItemsWidth = size;
            this.mMenu.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i, i2);
            if (!z2) {
                return;
            }
        }
        int i3 = 0;
        while (i3 < childCount) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
            size = i3 + 1;
            if (z2) {
                break;
            }
            i3 = size;
        }
        super.onMeasure(i, i2);
    }

    protected android.support.v7.widget.LinearLayoutCompat.LayoutParams m77generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public boolean hideOverflowMenu() {
        return this.mPresenter != null && this.mPresenter.hideOverflowMenu();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mPresenter.setExpandedActionViewsExclusive(z);
    }

    public android.view.ViewGroup.LayoutParams m81generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    protected android.support.v7.widget.LinearLayoutCompat.LayoutParams m80generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    public android.support.v7.widget.LinearLayoutCompat.LayoutParams m79generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    public boolean isOverflowMenuShowing() {
        return this.mPresenter != null && this.mPresenter.isOverflowMenuShowing();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    public boolean showOverflowMenu() {
        return this.mPresenter != null && this.mPresenter.showOverflowMenu();
    }

    protected boolean hasSupportDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z = 0 | ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? z : ((ActionMenuChildView) childAt2).needsDividerBefore() | z;
    }

    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public void setOverflowReserved(boolean z) {
        this.mReserveOverflow = z;
    }

    static int measureChildForCells(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        int i5;
        boolean z2 = false;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        if (actionMenuItemView == null || !actionMenuItemView.hasText()) {
            z = false;
        } else {
            z = true;
        }
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z && r1 < 2) {
                i5 = 2;
            }
        }
        if (!layoutParams.isOverflowButton && z) {
            z2 = true;
        }
        layoutParams.expandable = z2;
        layoutParams.cellsUsed = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i5 * i, 1073741824), makeMeasureSpec);
        return i5;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    protected android.view.ViewGroup.LayoutParams m82generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2;
        if (layoutParams instanceof LayoutParams) {
            layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (layoutParams2.gravity > 0) {
            return layoutParams2;
        }
        layoutParams2.gravity = 16;
        return layoutParams2;
    }

    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public void setMenuCallbacks(Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    static MenuBuilder.Callback access$300(ActionMenuView actionMenuView) {
        return actionMenuView.mMenuBuilderCallback;
    }

    public boolean isOverflowMenuShowPending() {
        return this.mPresenter != null && this.mPresenter.isOverflowMenuShowPending();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public MenuBuilder peekMenu() {
        return this.mMenu;
    }
}
