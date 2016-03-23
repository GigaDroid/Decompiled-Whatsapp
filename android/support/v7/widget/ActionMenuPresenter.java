package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ActionProvider.SubUiVisibilityListener;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.PopupCallback;
import android.support.v7.view.menu.BaseMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.MenuView.ItemView;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.widget.ActionMenuView.ActionMenuChildView;
import android.support.v7.widget.ListPopupWindow.ForwardingListener;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

class ActionMenuPresenter extends BaseMenuPresenter implements SubUiVisibilityListener {
    private final SparseBooleanArray mActionButtonGroups;
    private ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    private OverflowMenuButton mOverflowButton;
    private OverflowPopup mOverflowPopup;
    private Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private ActionMenuPopupCallback mPopupCallback;
    final PopupPresenterCallback mPopupPresenterCallback;
    private OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private View mScrapActionButtonView;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    class ActionButtonSubmenu extends MenuPopupHelper {
        private SubMenuBuilder mSubMenu;
        final ActionMenuPresenter this$0;

        public void onDismiss() {
            super.onDismiss();
            ActionMenuPresenter.access$802(this.this$0, null);
            this.this$0.mOpenSubMenuId = 0;
        }

        public ActionButtonSubmenu(ActionMenuPresenter actionMenuPresenter, Context context, SubMenuBuilder subMenuBuilder) {
            int i = 0;
            boolean z = LinearLayoutCompat.a;
            this.this$0 = actionMenuPresenter;
            super(context, subMenuBuilder, null, false, R.attr.actionOverflowMenuStyle);
            this.mSubMenu = subMenuBuilder;
            if (!((MenuItemImpl) subMenuBuilder.getItem()).isActionButton()) {
                setAnchorView(ActionMenuPresenter.access$600(actionMenuPresenter) == null ? (View) ActionMenuPresenter.access$700(actionMenuPresenter) : ActionMenuPresenter.access$600(actionMenuPresenter));
            }
            setCallback(actionMenuPresenter.mPopupPresenterCallback);
            int size = subMenuBuilder.size();
            boolean z2 = false;
            while (i < size) {
                MenuItem item = subMenuBuilder.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    if (!z) {
                        break;
                    }
                }
                i++;
                if (z) {
                    break;
                }
            }
            setForceShowIcon(z2);
        }
    }

    class ActionMenuPopupCallback extends PopupCallback {
        final ActionMenuPresenter this$0;

        private ActionMenuPopupCallback(ActionMenuPresenter actionMenuPresenter) {
            this.this$0 = actionMenuPresenter;
        }

        ActionMenuPopupCallback(ActionMenuPresenter actionMenuPresenter, 1 1) {
            this(actionMenuPresenter);
        }

        public ListPopupWindow getPopup() {
            return ActionMenuPresenter.access$800(this.this$0) != null ? ActionMenuPresenter.access$800(this.this$0).getPopup() : null;
        }
    }

    class OpenOverflowRunnable implements Runnable {
        private OverflowPopup mPopup;
        final ActionMenuPresenter this$0;

        public void run() {
            ActionMenuPresenter.access$900(this.this$0).changeMenuMode();
            View view = (View) ActionMenuPresenter.access$1000(this.this$0);
            if (!(view == null || view.getWindowToken() == null || !this.mPopup.tryShow())) {
                ActionMenuPresenter.access$202(this.this$0, this.mPopup);
            }
            ActionMenuPresenter.access$302(this.this$0, null);
        }

        public OpenOverflowRunnable(ActionMenuPresenter actionMenuPresenter, OverflowPopup overflowPopup) {
            this.this$0 = actionMenuPresenter;
            this.mPopup = overflowPopup;
        }
    }

    class OverflowMenuButton extends AppCompatImageView implements ActionMenuChildView {
        private final float[] mTempPts;
        final ActionMenuPresenter this$0;

        class 1 extends ForwardingListener {
            final OverflowMenuButton this$1;
            final ActionMenuPresenter val$this$0;

            1(OverflowMenuButton overflowMenuButton, View view, ActionMenuPresenter actionMenuPresenter) {
                this.this$1 = overflowMenuButton;
                this.val$this$0 = actionMenuPresenter;
                super(view);
            }

            public boolean onForwardingStarted() {
                this.this$1.this$0.showOverflowMenu();
                return true;
            }

            public ListPopupWindow getPopup() {
                if (ActionMenuPresenter.access$200(this.this$1.this$0) == null) {
                    return null;
                }
                return ActionMenuPresenter.access$200(this.this$1.this$0).getPopup();
            }

            public boolean onForwardingStopped() {
                if (ActionMenuPresenter.access$300(this.this$1.this$0) != null) {
                    return false;
                }
                this.this$1.this$0.hideOverflowMenu();
                return true;
            }
        }

        public boolean needsDividerBefore() {
            return false;
        }

        public OverflowMenuButton(ActionMenuPresenter actionMenuPresenter, Context context) {
            this.this$0 = actionMenuPresenter;
            super(context, null, R.attr.actionOverflowButtonStyle);
            this.mTempPts = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new 1(this, this, actionMenuPresenter));
        }

        public boolean needsDividerAfter() {
            return false;
        }

        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                width = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                height = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.setHotspotBounds(background, width - max, height - max, width + max, height + max);
            }
            return frame;
        }

        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                this.this$0.showOverflowMenu();
            }
            return true;
        }
    }

    class OverflowPopup extends MenuPopupHelper {
        final ActionMenuPresenter this$0;

        public void onDismiss() {
            super.onDismiss();
            if (ActionMenuPresenter.access$400(this.this$0) != null) {
                ActionMenuPresenter.access$500(this.this$0).close();
            }
            ActionMenuPresenter.access$202(this.this$0, null);
        }

        public OverflowPopup(ActionMenuPresenter actionMenuPresenter, Context context, MenuBuilder menuBuilder, View view, boolean z) {
            this.this$0 = actionMenuPresenter;
            super(context, menuBuilder, view, z, R.attr.actionOverflowMenuStyle);
            setGravity(8388613);
            setCallback(actionMenuPresenter.mPopupPresenterCallback);
        }
    }

    class PopupPresenterCallback implements Callback {
        final ActionMenuPresenter this$0;

        PopupPresenterCallback(ActionMenuPresenter actionMenuPresenter, 1 1) {
            this(actionMenuPresenter);
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuBuilder) {
                ((SubMenuBuilder) menuBuilder).getRootMenu().close(false);
            }
            Callback callback = this.this$0.getCallback();
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, z);
            }
        }

        private PopupPresenterCallback(ActionMenuPresenter actionMenuPresenter) {
            this.this$0 = actionMenuPresenter;
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            if (menuBuilder == null) {
                return false;
            }
            this.this$0.mOpenSubMenuId = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            Callback callback = this.this$0.getCallback();
            return callback != null ? callback.onOpenSubMenu(menuBuilder) : false;
        }
    }

    class SavedState implements Parcelable {
        public static final Creator CREATOR;
        public int openSubMenuId;

        final class 1 implements Creator {
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            1() {
            }

            public Object[] m75newArray(int i) {
                return newArray(i);
            }

            public Object m74createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.openSubMenuId);
        }

        static {
            CREATOR = new 1();
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }
    }

    static OverflowPopup access$200(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mOverflowPopup;
    }

    public View getItemView(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        int i;
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            actionView = super.getItemView(menuItemImpl, view, viewGroup);
        }
        if (menuItemImpl.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        MenuView menuView = super.getMenuView(viewGroup);
        ((ActionMenuView) menuView).setPresenter(this);
        return menuView;
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        boolean z = LinearLayoutCompat.a;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.getParentMenu() != this.mMenu) {
            subMenuBuilder2 = (SubMenuBuilder) subMenuBuilder2.getParentMenu();
            if (z) {
                break;
            }
        }
        View findViewForItem = findViewForItem(subMenuBuilder2.getItem());
        if (findViewForItem == null) {
            if (this.mOverflowButton == null) {
                return false;
            }
            findViewForItem = this.mOverflowButton;
        }
        this.mOpenSubMenuId = subMenuBuilder.getItem().getItemId();
        this.mActionButtonPopup = new ActionButtonSubmenu(this, this.mContext, subMenuBuilder);
        this.mActionButtonPopup.setAnchorView(findViewForItem);
        this.mActionButtonPopup.show();
        super.onSubMenuSelected(subMenuBuilder);
        return true;
    }

    static MenuView access$1000(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mMenuView;
    }

    public void setMenuView(ActionMenuView actionMenuView) {
        this.mMenuView = actionMenuView;
        actionMenuView.initialize(this.mMenu);
    }

    public void setReserveOverflow(boolean z) {
        this.mReserveOverflow = z;
        this.mReserveOverflowSet = true;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        dismissPopupMenus();
        super.onCloseMenu(menuBuilder, z);
    }

    public boolean shouldIncludeItem(int i, MenuItemImpl menuItemImpl) {
        return menuItemImpl.isActionButton();
    }

    public boolean isOverflowMenuShowPending() {
        return this.mPostedOpenRunnable != null || isOverflowMenuShowing();
    }

    static OpenOverflowRunnable access$300(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mPostedOpenRunnable;
    }

    public boolean dismissPopupMenus() {
        return hideOverflowMenu() | hideSubMenus();
    }

    public boolean isOverflowMenuShowing() {
        return this.mOverflowPopup != null && this.mOverflowPopup.isShowing();
    }

    public boolean hideSubMenus() {
        if (this.mActionButtonPopup == null) {
            return false;
        }
        this.mActionButtonPopup.dismiss();
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initForMenu(android.content.Context r7, android.support.v7.view.menu.MenuBuilder r8) {
        /*
        r6 = this;
        r5 = 0;
        r4 = 0;
        super.initForMenu(r7, r8);
        r1 = r7.getResources();
        r0 = android.support.v7.view.ActionBarPolicy.get(r7);
        r2 = r6.mReserveOverflowSet;
        if (r2 != 0) goto L_0x0017;
    L_0x0011:
        r2 = r0.showsOverflowMenuButton();
        r6.mReserveOverflow = r2;
    L_0x0017:
        r2 = r6.mWidthLimitSet;
        if (r2 != 0) goto L_0x0021;
    L_0x001b:
        r2 = r0.getEmbeddedMenuWidthLimit();
        r6.mWidthLimit = r2;
    L_0x0021:
        r2 = r6.mMaxItemsSet;
        if (r2 != 0) goto L_0x002b;
    L_0x0025:
        r0 = r0.getMaxActionButtons();
        r6.mMaxItems = r0;
    L_0x002b:
        r0 = r6.mWidthLimit;
        r2 = r6.mReserveOverflow;
        if (r2 == 0) goto L_0x0061;
    L_0x0031:
        r2 = r6.mOverflowButton;
        if (r2 != 0) goto L_0x0056;
    L_0x0035:
        r2 = new android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton;
        r3 = r6.mSystemContext;
        r2.<init>(r6, r3);
        r6.mOverflowButton = r2;
        r2 = r6.mPendingOverflowIconSet;
        if (r2 == 0) goto L_0x004d;
    L_0x0042:
        r2 = r6.mOverflowButton;
        r3 = r6.mPendingOverflowIcon;
        r2.setImageDrawable(r3);
        r6.mPendingOverflowIcon = r5;
        r6.mPendingOverflowIconSet = r4;
    L_0x004d:
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4);
        r3 = r6.mOverflowButton;
        r3.measure(r2, r2);
    L_0x0056:
        r2 = r6.mOverflowButton;
        r2 = r2.getMeasuredWidth();
        r0 = r0 - r2;
        r2 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r2 == 0) goto L_0x0063;
    L_0x0061:
        r6.mOverflowButton = r5;
    L_0x0063:
        r6.mActionItemWidthLimit = r0;
        r0 = 1113587712; // 0x42600000 float:56.0 double:5.50185432E-315;
        r1 = r1.getDisplayMetrics();
        r1 = r1.density;
        r0 = r0 * r1;
        r0 = (int) r0;
        r6.mMinCellSize = r0;
        r6.mScrapActionButtonView = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuPresenter.initForMenu(android.content.Context, android.support.v7.view.menu.MenuBuilder):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.mMaxItemsSet) {
            this.mMaxItems = this.mContext.getResources().getInteger(R.integer.abc_max_action_buttons);
        }
        if (this.mMenu != null) {
            this.mMenu.onItemsChanged(true);
        }
    }

    public void bindItemView(MenuItemImpl menuItemImpl, ItemView itemView) {
        itemView.initialize(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.mMenuView);
        if (this.mPopupCallback == null) {
            this.mPopupCallback = new ActionMenuPopupCallback(this, null);
        }
        actionMenuItemView.setPopupCallback(this.mPopupCallback);
    }

    static ActionButtonSubmenu access$800(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mActionButtonPopup;
    }

    static OverflowMenuButton access$600(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mOverflowButton;
    }

    public boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i) == this.mOverflowButton ? false : super.filterLeftoverView(viewGroup, i);
    }

    static OverflowPopup access$202(ActionMenuPresenter actionMenuPresenter, OverflowPopup overflowPopup) {
        actionMenuPresenter.mOverflowPopup = overflowPopup;
        return overflowPopup;
    }

    static ActionButtonSubmenu access$802(ActionMenuPresenter actionMenuPresenter, ActionButtonSubmenu actionButtonSubmenu) {
        actionMenuPresenter.mActionButtonPopup = actionButtonSubmenu;
        return actionButtonSubmenu;
    }

    static MenuBuilder access$400(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mMenu;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState();
        savedState.openSubMenuId = this.mOpenSubMenuId;
        return savedState;
    }

    static OpenOverflowRunnable access$302(ActionMenuPresenter actionMenuPresenter, OpenOverflowRunnable openOverflowRunnable) {
        actionMenuPresenter.mPostedOpenRunnable = openOverflowRunnable;
        return openOverflowRunnable;
    }

    static MenuView access$700(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mMenuView;
    }

    public boolean hideOverflowMenu() {
        if (this.mPostedOpenRunnable == null || this.mMenuView == null) {
            MenuPopupHelper menuPopupHelper = this.mOverflowPopup;
            if (menuPopupHelper == null) {
                return false;
            }
            menuPopupHelper.dismiss();
            return true;
        }
        ((View) this.mMenuView).removeCallbacks(this.mPostedOpenRunnable);
        this.mPostedOpenRunnable = null;
        return true;
    }

    private View findViewForItem(MenuItem menuItem) {
        boolean z = LinearLayoutCompat.a;
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ItemView) && ((ItemView) childAt).getItemData() == menuItem) {
                return childAt;
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return null;
    }

    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        this.mMenu.close(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean flagActionItems() {
        /*
        r22 = this;
        r14 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r22;
        r2 = r0.mMenu;
        r15 = r2.getVisibleItems();
        r16 = r15.size();
        r0 = r22;
        r7 = r0.mMaxItems;
        r0 = r22;
        r9 = r0.mActionItemWidthLimit;
        r2 = 0;
        r3 = 0;
        r17 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);
        r0 = r22;
        r2 = r0.mMenuView;
        r2 = (android.view.ViewGroup) r2;
        r4 = 0;
        r5 = 0;
        r8 = 0;
        r6 = 0;
        r3 = 0;
        r10 = r3;
    L_0x0028:
        r0 = r16;
        if (r10 >= r0) goto L_0x0202;
    L_0x002c:
        r3 = r15.get(r10);
        r3 = (android.support.v7.view.menu.MenuItemImpl) r3;
        r11 = r3.requiresActionButton();
        if (r11 == 0) goto L_0x003c;
    L_0x0038:
        r4 = r4 + 1;
        if (r14 == 0) goto L_0x01fb;
    L_0x003c:
        r11 = r3.requestsActionButton();
        if (r11 == 0) goto L_0x0046;
    L_0x0042:
        r5 = r5 + 1;
        if (r14 == 0) goto L_0x01fb;
    L_0x0046:
        r6 = 1;
        r21 = r6;
        r6 = r4;
        r4 = r21;
    L_0x004c:
        r0 = r22;
        r11 = r0.mExpandedActionViewsExclusive;
        if (r11 == 0) goto L_0x01f8;
    L_0x0052:
        r3 = r3.isActionViewExpanded();
        if (r3 == 0) goto L_0x01f8;
    L_0x0058:
        r7 = 0;
        r3 = r7;
    L_0x005a:
        r7 = r10 + 1;
        if (r14 == 0) goto L_0x01ef;
    L_0x005e:
        r0 = r22;
        r7 = r0.mReserveOverflow;
        if (r7 == 0) goto L_0x006c;
    L_0x0064:
        if (r4 != 0) goto L_0x006a;
    L_0x0066:
        r4 = r6 + r5;
        if (r4 <= r3) goto L_0x006c;
    L_0x006a:
        r3 = r3 + -1;
    L_0x006c:
        r10 = r3 - r6;
        r0 = r22;
        r0 = r0.mActionButtonGroups;
        r18 = r0;
        r18.clear();
        r4 = 0;
        r3 = 0;
        r0 = r22;
        r5 = r0.mStrictWidthLimit;
        if (r5 == 0) goto L_0x01ec;
    L_0x007f:
        r0 = r22;
        r3 = r0.mMinCellSize;
        r3 = r9 / r3;
        r0 = r22;
        r4 = r0.mMinCellSize;
        r4 = r9 % r4;
        r0 = r22;
        r5 = r0.mMinCellSize;
        r4 = r4 / r3;
        r4 = r4 + r5;
        r5 = r4;
    L_0x0092:
        r4 = 0;
        r13 = r4;
        r7 = r8;
        r4 = r3;
        r8 = r9;
    L_0x0097:
        r0 = r16;
        if (r13 >= r0) goto L_0x01b1;
    L_0x009b:
        r3 = r15.get(r13);
        r3 = (android.support.v7.view.menu.MenuItemImpl) r3;
        r6 = r3.requiresActionButton();
        if (r6 == 0) goto L_0x01e8;
    L_0x00a7:
        r0 = r22;
        r6 = r0.mScrapActionButtonView;
        r0 = r22;
        r6 = r0.getItemView(r3, r6, r2);
        r0 = r22;
        r9 = r0.mScrapActionButtonView;
        if (r9 != 0) goto L_0x00bb;
    L_0x00b7:
        r0 = r22;
        r0.mScrapActionButtonView = r6;
    L_0x00bb:
        r0 = r22;
        r9 = r0.mStrictWidthLimit;
        if (r9 == 0) goto L_0x00cb;
    L_0x00c1:
        r9 = 0;
        r0 = r17;
        r9 = android.support.v7.widget.ActionMenuView.measureChildForCells(r6, r5, r4, r0, r9);
        r4 = r4 - r9;
        if (r14 == 0) goto L_0x00d2;
    L_0x00cb:
        r0 = r17;
        r1 = r17;
        r6.measure(r0, r1);
    L_0x00d2:
        r6 = r6.getMeasuredWidth();
        r8 = r8 - r6;
        if (r7 != 0) goto L_0x01e5;
    L_0x00d9:
        r7 = r3.getGroupId();
        if (r7 == 0) goto L_0x00e5;
    L_0x00df:
        r9 = 1;
        r0 = r18;
        r0.put(r7, r9);
    L_0x00e5:
        r7 = 1;
        r3.setIsActionButton(r7);
        if (r14 == 0) goto L_0x01ad;
    L_0x00eb:
        r7 = r8;
    L_0x00ec:
        r8 = r3.requestsActionButton();
        if (r8 == 0) goto L_0x01e3;
    L_0x00f2:
        r19 = r3.getGroupId();
        r11 = r18.get(r19);
        if (r10 > 0) goto L_0x00fe;
    L_0x00fc:
        if (r11 == 0) goto L_0x01b3;
    L_0x00fe:
        if (r7 <= 0) goto L_0x01b3;
    L_0x0100:
        r0 = r22;
        r8 = r0.mStrictWidthLimit;
        if (r8 == 0) goto L_0x0108;
    L_0x0106:
        if (r4 <= 0) goto L_0x01b3;
    L_0x0108:
        r8 = 1;
    L_0x0109:
        if (r8 == 0) goto L_0x01dd;
    L_0x010b:
        r0 = r22;
        r9 = r0.mScrapActionButtonView;
        r0 = r22;
        r12 = r0.getItemView(r3, r9, r2);
        r0 = r22;
        r9 = r0.mScrapActionButtonView;
        if (r9 != 0) goto L_0x011f;
    L_0x011b:
        r0 = r22;
        r0.mScrapActionButtonView = r12;
    L_0x011f:
        r0 = r22;
        r9 = r0.mStrictWidthLimit;
        if (r9 == 0) goto L_0x01d6;
    L_0x0125:
        r9 = 0;
        r0 = r17;
        r20 = android.support.v7.widget.ActionMenuView.measureChildForCells(r12, r5, r4, r0, r9);
        r9 = r4 - r20;
        if (r20 != 0) goto L_0x01d3;
    L_0x0130:
        r4 = 0;
    L_0x0131:
        if (r14 == 0) goto L_0x013c;
    L_0x0133:
        r8 = r9;
    L_0x0134:
        r0 = r17;
        r1 = r17;
        r12.measure(r0, r1);
        r9 = r8;
    L_0x013c:
        r8 = r12.getMeasuredWidth();
        r7 = r7 - r8;
        if (r6 != 0) goto L_0x0144;
    L_0x0143:
        r6 = r8;
    L_0x0144:
        r0 = r22;
        r8 = r0.mStrictWidthLimit;
        if (r8 == 0) goto L_0x01d0;
    L_0x014a:
        if (r7 < 0) goto L_0x01b6;
    L_0x014c:
        r8 = 1;
    L_0x014d:
        r8 = r8 & r4;
        if (r14 == 0) goto L_0x01c8;
    L_0x0150:
        r4 = r7 + r6;
        if (r4 <= 0) goto L_0x01b8;
    L_0x0154:
        r4 = 1;
    L_0x0155:
        r8 = r8 & r4;
        r12 = r8;
        r8 = r6;
        r21 = r9;
        r9 = r7;
        r7 = r21;
    L_0x015d:
        if (r12 == 0) goto L_0x016b;
    L_0x015f:
        if (r19 == 0) goto L_0x016b;
    L_0x0161:
        r4 = 1;
        r0 = r18;
        r1 = r19;
        r0.put(r1, r4);
        if (r14 == 0) goto L_0x0199;
    L_0x016b:
        if (r11 == 0) goto L_0x0199;
    L_0x016d:
        r4 = 0;
        r0 = r18;
        r1 = r19;
        r0.put(r1, r4);
        r4 = 0;
        r11 = r4;
        r6 = r10;
    L_0x0178:
        if (r11 >= r13) goto L_0x01c6;
    L_0x017a:
        r4 = r15.get(r11);
        r4 = (android.support.v7.view.menu.MenuItemImpl) r4;
        r10 = r4.getGroupId();
        r0 = r19;
        if (r10 != r0) goto L_0x0194;
    L_0x0188:
        r10 = r4.isActionButton();
        if (r10 == 0) goto L_0x0190;
    L_0x018e:
        r6 = r6 + 1;
    L_0x0190:
        r10 = 0;
        r4.setIsActionButton(r10);
    L_0x0194:
        r10 = r6;
        r4 = r11 + 1;
        if (r14 == 0) goto L_0x01c3;
    L_0x0199:
        r4 = r10;
    L_0x019a:
        if (r12 == 0) goto L_0x019e;
    L_0x019c:
        r4 = r4 + -1;
    L_0x019e:
        r3.setIsActionButton(r12);
        if (r14 == 0) goto L_0x01be;
    L_0x01a3:
        r6 = r8;
        r8 = r4;
        r4 = r7;
        r7 = r9;
    L_0x01a7:
        r9 = 0;
        r3.setIsActionButton(r9);
        r10 = r8;
        r8 = r7;
    L_0x01ad:
        r3 = r13 + 1;
        if (r14 == 0) goto L_0x01ba;
    L_0x01b1:
        r2 = 1;
        return r2;
    L_0x01b3:
        r8 = 0;
        goto L_0x0109;
    L_0x01b6:
        r8 = 0;
        goto L_0x014d;
    L_0x01b8:
        r4 = 0;
        goto L_0x0155;
    L_0x01ba:
        r13 = r3;
        r7 = r6;
        goto L_0x0097;
    L_0x01be:
        r6 = r8;
        r10 = r4;
        r8 = r9;
        r4 = r7;
        goto L_0x01ad;
    L_0x01c3:
        r11 = r4;
        r6 = r10;
        goto L_0x0178;
    L_0x01c6:
        r4 = r6;
        goto L_0x019a;
    L_0x01c8:
        r12 = r8;
        r8 = r6;
        r21 = r9;
        r9 = r7;
        r7 = r21;
        goto L_0x015d;
    L_0x01d0:
        r8 = r4;
        goto L_0x0150;
    L_0x01d3:
        r4 = r8;
        goto L_0x0131;
    L_0x01d6:
        r21 = r8;
        r8 = r4;
        r4 = r21;
        goto L_0x0134;
    L_0x01dd:
        r12 = r8;
        r9 = r7;
        r8 = r6;
        r7 = r4;
        goto L_0x015d;
    L_0x01e3:
        r8 = r10;
        goto L_0x01a7;
    L_0x01e5:
        r6 = r7;
        goto L_0x00d9;
    L_0x01e8:
        r6 = r7;
        r7 = r8;
        goto L_0x00ec;
    L_0x01ec:
        r5 = r4;
        goto L_0x0092;
    L_0x01ef:
        r10 = r7;
        r7 = r3;
        r21 = r6;
        r6 = r4;
        r4 = r21;
        goto L_0x0028;
    L_0x01f8:
        r3 = r7;
        goto L_0x005a;
    L_0x01fb:
        r21 = r6;
        r6 = r4;
        r4 = r21;
        goto L_0x004c;
    L_0x0202:
        r3 = r7;
        r21 = r4;
        r4 = r6;
        r6 = r21;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuPresenter.flagActionItems():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateMenuView(boolean r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r4 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r7.mMenuView;
        r0 = (android.view.View) r0;
        r0 = r0.getParent();
        r0 = (android.view.ViewGroup) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x0010:
        android.support.v7.transition.ActionBarTransition.beginDelayedTransition(r0);
    L_0x0013:
        super.updateMenuView(r8);
        r0 = r7.mMenuView;
        r0 = (android.view.View) r0;
        r0.requestLayout();
        r0 = r7.mMenu;
        if (r0 == 0) goto L_0x0041;
    L_0x0021:
        r0 = r7.mMenu;
        r5 = r0.getActionItems();
        r6 = r5.size();
        r3 = r2;
    L_0x002c:
        if (r3 >= r6) goto L_0x0041;
    L_0x002e:
        r0 = r5.get(r3);
        r0 = (android.support.v7.view.menu.MenuItemImpl) r0;
        r0 = r0.getSupportActionProvider();
        if (r0 == 0) goto L_0x003d;
    L_0x003a:
        r0.setSubUiVisibilityListener(r7);
    L_0x003d:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x00c4;
    L_0x0041:
        r0 = r7.mMenu;
        if (r0 == 0) goto L_0x00bc;
    L_0x0045:
        r0 = r7.mMenu;
        r0 = r0.getNonActionItems();
    L_0x004b:
        r3 = r7.mReserveOverflow;
        if (r3 == 0) goto L_0x006a;
    L_0x004f:
        if (r0 == 0) goto L_0x006a;
    L_0x0051:
        r3 = r0.size();
        if (r3 != r1) goto L_0x0066;
    L_0x0057:
        r0 = r0.get(r2);
        r0 = (android.support.v7.view.menu.MenuItemImpl) r0;
        r0 = r0.isActionViewExpanded();
        if (r0 != 0) goto L_0x00be;
    L_0x0063:
        r0 = r1;
    L_0x0064:
        if (r4 == 0) goto L_0x00c2;
    L_0x0066:
        if (r3 <= 0) goto L_0x00c0;
    L_0x0068:
        r0 = r1;
    L_0x0069:
        r2 = r0;
    L_0x006a:
        if (r2 == 0) goto L_0x009b;
    L_0x006c:
        r0 = r7.mOverflowButton;
        if (r0 != 0) goto L_0x0079;
    L_0x0070:
        r0 = new android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton;
        r1 = r7.mSystemContext;
        r0.<init>(r7, r1);
        r7.mOverflowButton = r0;
    L_0x0079:
        r0 = r7.mOverflowButton;
        r0 = r0.getParent();
        r0 = (android.view.ViewGroup) r0;
        r1 = r7.mMenuView;
        if (r0 == r1) goto L_0x0099;
    L_0x0085:
        if (r0 == 0) goto L_0x008c;
    L_0x0087:
        r1 = r7.mOverflowButton;
        r0.removeView(r1);
    L_0x008c:
        r0 = r7.mMenuView;
        r0 = (android.support.v7.widget.ActionMenuView) r0;
        r1 = r7.mOverflowButton;
        r2 = r0.generateOverflowButtonLayoutParams();
        r0.addView(r1, r2);
    L_0x0099:
        if (r4 == 0) goto L_0x00b2;
    L_0x009b:
        r0 = r7.mOverflowButton;
        if (r0 == 0) goto L_0x00b2;
    L_0x009f:
        r0 = r7.mOverflowButton;
        r0 = r0.getParent();
        r1 = r7.mMenuView;
        if (r0 != r1) goto L_0x00b2;
    L_0x00a9:
        r0 = r7.mMenuView;
        r0 = (android.view.ViewGroup) r0;
        r1 = r7.mOverflowButton;
        r0.removeView(r1);
    L_0x00b2:
        r0 = r7.mMenuView;
        r0 = (android.support.v7.widget.ActionMenuView) r0;
        r1 = r7.mReserveOverflow;
        r0.setOverflowReserved(r1);
        return;
    L_0x00bc:
        r0 = 0;
        goto L_0x004b;
    L_0x00be:
        r0 = r2;
        goto L_0x0064;
    L_0x00c0:
        r0 = r2;
        goto L_0x0069;
    L_0x00c2:
        r2 = r0;
        goto L_0x006a;
    L_0x00c4:
        r3 = r0;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuPresenter.updateMenuView(boolean):void");
    }

    static MenuBuilder access$900(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mMenu;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.openSubMenuId > 0) {
            MenuItem findItem = this.mMenu.findItem(savedState.openSubMenuId);
            if (findItem != null) {
                onSubMenuSelected((SubMenuBuilder) findItem.getSubMenu());
            }
        }
    }

    public boolean showOverflowMenu() {
        if (!this.mReserveOverflow || isOverflowMenuShowing() || this.mMenu == null || this.mMenuView == null || this.mPostedOpenRunnable != null || this.mMenu.getNonActionItems().isEmpty()) {
            return false;
        }
        this.mPostedOpenRunnable = new OpenOverflowRunnable(this, new OverflowPopup(this, this.mContext, this.mMenu, this.mOverflowButton, true));
        ((View) this.mMenuView).post(this.mPostedOpenRunnable);
        super.onSubMenuSelected(null);
        return true;
    }

    static MenuBuilder access$500(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mMenu;
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.mActionButtonGroups = new SparseBooleanArray();
        this.mPopupPresenterCallback = new PopupPresenterCallback(this, null);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mExpandedActionViewsExclusive = z;
    }
}
