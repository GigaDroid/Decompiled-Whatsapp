package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.R;
import android.support.v7.view.CollapsibleActionView;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.SubMenuBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.ArrayList;
import java.util.List;
import org.whispersystems.at;

public class Toolbar extends ViewGroup {
    private Callback mActionMenuPresenterCallback;
    private int mButtonGravity;
    private ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private final RtlSpacingHelper mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private MenuBuilder.Callback mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final android.support.v7.widget.ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    private OnMenuItemClickListener mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList mTempViews;
    private final TintManager mTintManager;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;
    private ToolbarWidgetWrapper mWrapper;

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    class 1 implements android.support.v7.widget.ActionMenuView.OnMenuItemClickListener {
        final Toolbar this$0;

        1(Toolbar toolbar) {
            this.this$0 = toolbar;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.access$000(this.this$0) != null) {
                return Toolbar.access$000(this.this$0).onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class 2 implements Runnable {
        final Toolbar this$0;

        public void run() {
            this.this$0.showOverflowMenu();
        }

        2(Toolbar toolbar) {
            this.this$0 = toolbar;
        }
    }

    class 3 implements OnClickListener {
        final Toolbar this$0;

        3(Toolbar toolbar) {
            this.this$0 = toolbar;
        }

        public void onClick(View view) {
            this.this$0.collapseActionView();
        }
    }

    class ExpandedActionViewMenuPresenter implements MenuPresenter {
        MenuItemImpl mCurrentExpandedItem;
        MenuBuilder mMenu;
        final Toolbar this$0;

        public void updateMenuView(boolean z) {
            Object obj = null;
            boolean z2 = LinearLayoutCompat.a;
            if (this.mCurrentExpandedItem != null) {
                if (this.mMenu != null) {
                    int size = this.mMenu.size();
                    int i = 0;
                    while (i < size) {
                        if (this.mMenu.getItem(i) == this.mCurrentExpandedItem) {
                            obj = 1;
                            if (!z2) {
                                break;
                            }
                        }
                        i++;
                        if (z2) {
                            break;
                        }
                    }
                }
                if (obj == null) {
                    collapseItemActionView(this.mMenu, this.mCurrentExpandedItem);
                }
            }
        }

        public int getId() {
            return 0;
        }

        public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            if (this.this$0.mExpandedActionView instanceof CollapsibleActionView) {
                ((CollapsibleActionView) this.this$0.mExpandedActionView).onActionViewCollapsed();
            }
            this.this$0.removeView(this.this$0.mExpandedActionView);
            this.this$0.removeView(Toolbar.access$300(this.this$0));
            this.this$0.mExpandedActionView = null;
            this.this$0.addChildrenForExpandedActionView();
            this.mCurrentExpandedItem = null;
            this.this$0.requestLayout();
            menuItemImpl.setActionViewExpanded(false);
            return true;
        }

        public void initForMenu(Context context, MenuBuilder menuBuilder) {
            if (!(this.mMenu == null || this.mCurrentExpandedItem == null)) {
                this.mMenu.collapseItemActionView(this.mCurrentExpandedItem);
            }
            this.mMenu = menuBuilder;
        }

        public boolean flagActionItems() {
            return false;
        }

        private ExpandedActionViewMenuPresenter(Toolbar toolbar) {
            this.this$0 = toolbar;
        }

        public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar.access$200(this.this$0);
            if (Toolbar.access$300(this.this$0).getParent() != this.this$0) {
                this.this$0.addView(Toolbar.access$300(this.this$0));
            }
            this.this$0.mExpandedActionView = menuItemImpl.getActionView();
            this.mCurrentExpandedItem = menuItemImpl;
            if (this.this$0.mExpandedActionView.getParent() != this.this$0) {
                android.view.ViewGroup.LayoutParams generateDefaultLayoutParams = this.this$0.generateDefaultLayoutParams();
                generateDefaultLayoutParams.gravity = 8388611 | (Toolbar.access$400(this.this$0) & 112);
                generateDefaultLayoutParams.mViewType = 2;
                this.this$0.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                this.this$0.addView(this.this$0.mExpandedActionView);
            }
            this.this$0.removeChildrenForExpandedActionView();
            this.this$0.requestLayout();
            menuItemImpl.setActionViewExpanded(true);
            if (this.this$0.mExpandedActionView instanceof CollapsibleActionView) {
                ((CollapsibleActionView) this.this$0.mExpandedActionView).onActionViewExpanded();
            }
            return true;
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        ExpandedActionViewMenuPresenter(Toolbar toolbar, 1 1) {
            this(toolbar);
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
            return false;
        }
    }

    public class LayoutParams extends android.support.v7.app.ActionBar.LayoutParams {
        int mViewType;

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super((android.view.ViewGroup.LayoutParams) marginLayoutParams);
            this.mViewType = 0;
            copyMarginsFromCompat(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mViewType = 0;
            this.gravity = 8388627;
        }

        void copyMarginsFromCompat(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((android.support.v7.app.ActionBar.LayoutParams) layoutParams);
            this.mViewType = 0;
            this.mViewType = layoutParams.mViewType;
        }

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mViewType = 0;
        }

        public LayoutParams(android.support.v7.app.ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        int expandedMenuItemId;
        boolean isOverflowOpen;

        final class 1 implements Creator {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object m31createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public Object[] m32newArray(int i) {
                return newArray(i);
            }

            1() {
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt(this.isOverflowOpen ? 1 : 0);
        }

        static {
            CREATOR = new 1();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = parcel.readInt() != 0;
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        this.mContentInsets.setAbsolute(i, i2);
    }

    private void addCustomViewsWithGravity(List list, int i) {
        LayoutParams layoutParams;
        int i2 = 1;
        int i3 = 0;
        boolean z = LinearLayoutCompat.a;
        if (ViewCompat.getLayoutDirection(this) != 1) {
            i2 = 0;
        }
        int childCount = getChildCount();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        list.clear();
        if (i2 != 0) {
            int i4 = childCount - 1;
            while (i4 >= 0) {
                View childAt = getChildAt(i4);
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mViewType == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams.gravity) == absoluteGravity) {
                    list.add(childAt);
                }
                i2 = i4 - 1;
                if (z) {
                    break;
                }
                i4 = i2;
            }
            if (!z) {
                return;
            }
        }
        while (i3 < childCount) {
            View childAt2 = getChildAt(i3);
            layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams.mViewType == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(layoutParams.gravity) == absoluteGravity) {
                list.add(childAt2);
            }
            i3++;
            if (z) {
                return;
            }
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new ImageView(getContext());
        }
    }

    void removeChildrenForExpandedActionView() {
        boolean z = LinearLayoutCompat.a;
        int childCount = getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).mViewType == 2 || childAt == this.mMenuView)) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
            int i = childCount - 1;
            if (!z) {
                childCount = i;
            } else {
                return;
            }
        }
    }

    public int getContentInsetRight() {
        return this.mContentInsets.getRight();
    }

    @Nullable
    public Drawable getNavigationIcon() {
        return this.mNavButtonView != null ? this.mNavButtonView.getDrawable() : null;
    }

    private int getViewListMeasuredWidth(List list, int[] iArr) {
        boolean z = LinearLayoutCompat.a;
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (i3 < size) {
            View view = (View) list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            i6 = layoutParams.leftMargin - i6;
            i = layoutParams.rightMargin - i5;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i);
            i6 = Math.max(0, -i6);
            i5 = Math.max(0, -i);
            i2 = ((view.getMeasuredWidth() + max) + max2) + i4;
            i = i3 + 1;
            if (z) {
                return i2;
            }
            i3 = i;
            i4 = i2;
        }
        return i4;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int max;
        int combineMeasuredStates;
        boolean z = LinearLayoutCompat.a;
        int i5 = 0;
        int i6 = 0;
        int[] iArr = this.mTempMargins;
        if (!ViewUtils.isLayoutRtl(this) || z) {
            i3 = 1;
            i4 = 0;
        } else {
            i3 = 0;
            i4 = 1;
        }
        int i7 = 0;
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i7 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            max = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i6 = ViewUtils.combineMeasuredStates(0, ViewCompat.getMeasuredState(this.mNavButtonView));
            i5 = max;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i7 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i5 = Math.max(i5, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i6 = ViewUtils.combineMeasuredStates(i6, ViewCompat.getMeasuredState(this.mCollapseButtonView));
        }
        int contentInsetStart = getContentInsetStart();
        int max2 = 0 + Math.max(contentInsetStart, i7);
        iArr[i4] = Math.max(0, contentInsetStart - i7);
        i7 = 0;
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, max2, i2, 0, this.mMaxButtonHeight);
            i7 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i5 = Math.max(i5, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i6 = ViewUtils.combineMeasuredStates(i6, ViewCompat.getMeasuredState(this.mMenuView));
        }
        contentInsetStart = getContentInsetEnd();
        max2 += Math.max(contentInsetStart, i7);
        iArr[i3] = Math.max(0, contentInsetStart - i7);
        if (shouldLayout(this.mExpandedActionView)) {
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i6 = ViewUtils.combineMeasuredStates(i6, ViewCompat.getMeasuredState(this.mExpandedActionView));
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i6 = ViewUtils.combineMeasuredStates(i6, ViewCompat.getMeasuredState(this.mLogoView));
        }
        int childCount = getChildCount();
        i3 = i6;
        i4 = i5;
        i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (((LayoutParams) childAt.getLayoutParams()).mViewType == 0 && (shouldLayout(childAt) || z)) {
                max2 += measureChildCollapseMargins(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i7 = ViewUtils.combineMeasuredStates(i3, ViewCompat.getMeasuredState(childAt));
                contentInsetStart = i4;
            } else {
                i7 = i3;
                contentInsetStart = i4;
            }
            max = i6 + 1;
            if (z) {
                i3 = i7;
                i4 = contentInsetStart;
                i6 = max2;
                break;
            }
            i6 = max;
            i3 = i7;
            i4 = contentInsetStart;
        }
        i6 = max2;
        int i8 = this.mTitleMarginTop + this.mTitleMarginBottom;
        childCount = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, i6 + childCount, i2, i8, iArr);
            contentInsetStart = getHorizontalMargins(this.mTitleTextView) + this.mTitleTextView.getMeasuredWidth();
            i7 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i5 = contentInsetStart;
            combineMeasuredStates = ViewUtils.combineMeasuredStates(i3, ViewCompat.getMeasuredState(this.mTitleTextView));
            i3 = i7;
        } else {
            i5 = 0;
            combineMeasuredStates = i3;
            i3 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i5 = Math.max(i5, measureChildCollapseMargins(this.mSubtitleTextView, i, i6 + childCount, i2, i8 + i3, iArr));
            i3 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            combineMeasuredStates = ViewUtils.combineMeasuredStates(combineMeasuredStates, ViewCompat.getMeasuredState(this.mSubtitleTextView));
        }
        i7 = i6 + i5;
        contentInsetStart = Math.max(i4, i3) + (getPaddingTop() + getPaddingBottom());
        int i9 = i;
        max = ViewCompat.resolveSizeAndState(Math.max(i7 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i9, -16777216 & combineMeasuredStates);
        i7 = ViewCompat.resolveSizeAndState(Math.max(contentInsetStart, getSuggestedMinimumHeight()), i2, combineMeasuredStates << 16);
        if (shouldCollapse()) {
            i7 = 0;
        }
        setMeasuredDimension(max, i7);
    }

    public void setMenuCallbacks(Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public boolean showOverflowMenu() {
        return this.mMenuView != null && this.mMenuView.showOverflowMenu();
    }

    private boolean shouldCollapse() {
        boolean z = LinearLayoutCompat.a;
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (!shouldLayout(childAt) || childAt.getMeasuredWidth() <= 0 || childAt.getMeasuredHeight() <= 0) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(this.mTintManager.getDrawable(i));
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new ImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            android.view.ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = 8388611 | (this.mButtonGravity & 112);
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void setTitleTextAppearance(Context context, @StyleRes int i) {
        this.mTitleTextAppearance = i;
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setTextAppearance(context, i);
        }
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void collapseActionView() {
        MenuItemImpl menuItemImpl;
        if (this.mExpandedMenuPresenter == null) {
            menuItemImpl = null;
        } else {
            menuItemImpl = this.mExpandedMenuPresenter.mCurrentExpandedItem;
        }
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            this.mMenuView = new ActionMenuView(getContext());
            this.mMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            android.view.ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = 8388613 | (this.mButtonGravity & 112);
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void addSystemView(android.view.View r4, boolean r5) {
        /*
        r3 = this;
        r2 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r4.getLayoutParams();
        if (r0 != 0) goto L_0x000e;
    L_0x0008:
        r1 = r3.generateDefaultLayoutParams();
        if (r2 == 0) goto L_0x0033;
    L_0x000e:
        r1 = r3.checkLayoutParams(r0);
        if (r1 != 0) goto L_0x001a;
    L_0x0014:
        r1 = r3.generateLayoutParams(r0);
        if (r2 == 0) goto L_0x0033;
    L_0x001a:
        r0 = (android.support.v7.widget.Toolbar.LayoutParams) r0;
    L_0x001c:
        r1 = 1;
        r0.mViewType = r1;
        if (r5 == 0) goto L_0x002f;
    L_0x0021:
        r1 = r3.mExpandedActionView;
        if (r1 == 0) goto L_0x002f;
    L_0x0025:
        r4.setLayoutParams(r0);
        r1 = r3.mHiddenViews;
        r1.add(r4);
        if (r2 == 0) goto L_0x0032;
    L_0x002f:
        r3.addView(r4, r0);
    L_0x0032:
        return;
    L_0x0033:
        r0 = r1;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.addSystemView(android.view.View, boolean):void");
    }

    public boolean isOverflowMenuShowing() {
        return this.mMenuView != null && this.mMenuView.isOverflowMenuShowing();
    }

    protected android.view.ViewGroup.LayoutParams m28generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public boolean canShowOverflowMenu() {
        return getVisibility() == 0 && this.mMenuView != null && this.mMenuView.isOverflowReserved();
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.support.v7.app.ActionBar.LayoutParams) {
            return new LayoutParams((android.support.v7.app.ActionBar.LayoutParams) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r27, int r28, int r29, int r30, int r31) {
        /*
        r26 = this;
        r12 = android.support.v7.widget.LinearLayoutCompat.a;
        r3 = android.support.v4.view.ViewCompat.getLayoutDirection(r26);
        r4 = 1;
        if (r3 != r4) goto L_0x03ee;
    L_0x0009:
        r3 = 1;
        r5 = r3;
    L_0x000b:
        r13 = r26.getWidth();
        r14 = r26.getHeight();
        r6 = r26.getPaddingLeft();
        r15 = r26.getPaddingRight();
        r16 = r26.getPaddingTop();
        r17 = r26.getPaddingBottom();
        r3 = r13 - r15;
        r0 = r26;
        r0 = r0.mTempMargins;
        r18 = r0;
        r4 = 0;
        r7 = 1;
        r8 = 0;
        r18[r7] = r8;
        r18[r4] = r8;
        r19 = android.support.v4.view.ViewCompat.getMinimumHeight(r26);
        r0 = r26;
        r4 = r0.mNavButtonView;
        r0 = r26;
        r4 = r0.shouldLayout(r4);
        if (r4 == 0) goto L_0x0445;
    L_0x0042:
        if (r5 == 0) goto L_0x0054;
    L_0x0044:
        r0 = r26;
        r4 = r0.mNavButtonView;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r3 = r0.layoutChildRight(r4, r3, r1, r2);
        if (r12 == 0) goto L_0x0445;
    L_0x0054:
        r0 = r26;
        r4 = r0.mNavButtonView;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r4 = r0.layoutChildLeft(r4, r6, r1, r2);
    L_0x0062:
        r0 = r26;
        r7 = r0.mCollapseButtonView;
        r0 = r26;
        r7 = r0.shouldLayout(r7);
        if (r7 == 0) goto L_0x008e;
    L_0x006e:
        if (r5 == 0) goto L_0x0080;
    L_0x0070:
        r0 = r26;
        r7 = r0.mCollapseButtonView;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r3 = r0.layoutChildRight(r7, r3, r1, r2);
        if (r12 == 0) goto L_0x008e;
    L_0x0080:
        r0 = r26;
        r7 = r0.mCollapseButtonView;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r4 = r0.layoutChildLeft(r7, r4, r1, r2);
    L_0x008e:
        r0 = r26;
        r7 = r0.mMenuView;
        r0 = r26;
        r7 = r0.shouldLayout(r7);
        if (r7 == 0) goto L_0x00ba;
    L_0x009a:
        if (r5 == 0) goto L_0x00ac;
    L_0x009c:
        r0 = r26;
        r7 = r0.mMenuView;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r4 = r0.layoutChildLeft(r7, r4, r1, r2);
        if (r12 == 0) goto L_0x00ba;
    L_0x00ac:
        r0 = r26;
        r7 = r0.mMenuView;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r3 = r0.layoutChildRight(r7, r3, r1, r2);
    L_0x00ba:
        r7 = 0;
        r8 = 0;
        r9 = r26.getContentInsetLeft();
        r9 = r9 - r4;
        r8 = java.lang.Math.max(r8, r9);
        r18[r7] = r8;
        r7 = 1;
        r8 = 0;
        r9 = r26.getContentInsetRight();
        r10 = r13 - r15;
        r10 = r10 - r3;
        r9 = r9 - r10;
        r8 = java.lang.Math.max(r8, r9);
        r18[r7] = r8;
        r7 = r26.getContentInsetLeft();
        r4 = java.lang.Math.max(r4, r7);
        r7 = r13 - r15;
        r8 = r26.getContentInsetRight();
        r7 = r7 - r8;
        r3 = java.lang.Math.min(r3, r7);
        r0 = r26;
        r7 = r0.mExpandedActionView;
        r0 = r26;
        r7 = r0.shouldLayout(r7);
        if (r7 == 0) goto L_0x0116;
    L_0x00f6:
        if (r5 == 0) goto L_0x0108;
    L_0x00f8:
        r0 = r26;
        r7 = r0.mExpandedActionView;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r3 = r0.layoutChildRight(r7, r3, r1, r2);
        if (r12 == 0) goto L_0x0116;
    L_0x0108:
        r0 = r26;
        r7 = r0.mExpandedActionView;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r4 = r0.layoutChildLeft(r7, r4, r1, r2);
    L_0x0116:
        r0 = r26;
        r7 = r0.mLogoView;
        r0 = r26;
        r7 = r0.shouldLayout(r7);
        if (r7 == 0) goto L_0x0441;
    L_0x0122:
        if (r5 == 0) goto L_0x0134;
    L_0x0124:
        r0 = r26;
        r7 = r0.mLogoView;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r3 = r0.layoutChildRight(r7, r3, r1, r2);
        if (r12 == 0) goto L_0x0441;
    L_0x0134:
        r0 = r26;
        r7 = r0.mLogoView;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r4 = r0.layoutChildLeft(r7, r4, r1, r2);
        r7 = r3;
        r8 = r4;
    L_0x0144:
        r0 = r26;
        r3 = r0.mTitleTextView;
        r0 = r26;
        r20 = r0.shouldLayout(r3);
        r0 = r26;
        r3 = r0.mSubtitleTextView;
        r0 = r26;
        r21 = r0.shouldLayout(r3);
        r4 = 0;
        if (r20 == 0) goto L_0x0174;
    L_0x015b:
        r0 = r26;
        r3 = r0.mTitleTextView;
        r3 = r3.getLayoutParams();
        r3 = (android.support.v7.widget.Toolbar.LayoutParams) r3;
        r9 = r3.topMargin;
        r0 = r26;
        r10 = r0.mTitleTextView;
        r10 = r10.getMeasuredHeight();
        r9 = r9 + r10;
        r3 = r3.bottomMargin;
        r3 = r3 + r9;
        r4 = r4 + r3;
    L_0x0174:
        if (r21 == 0) goto L_0x043e;
    L_0x0176:
        r0 = r26;
        r3 = r0.mSubtitleTextView;
        r3 = r3.getLayoutParams();
        r3 = (android.support.v7.widget.Toolbar.LayoutParams) r3;
        r9 = r3.topMargin;
        r0 = r26;
        r10 = r0.mSubtitleTextView;
        r10 = r10.getMeasuredHeight();
        r9 = r9 + r10;
        r3 = r3.bottomMargin;
        r3 = r3 + r9;
        r3 = r3 + r4;
        r11 = r3;
    L_0x0190:
        if (r20 != 0) goto L_0x0194;
    L_0x0192:
        if (r21 == 0) goto L_0x0338;
    L_0x0194:
        if (r20 == 0) goto L_0x03f2;
    L_0x0196:
        r0 = r26;
        r3 = r0.mTitleTextView;
        r9 = r3;
    L_0x019b:
        if (r21 == 0) goto L_0x03f9;
    L_0x019d:
        r0 = r26;
        r3 = r0.mSubtitleTextView;
        r4 = r3;
    L_0x01a2:
        r3 = r9.getLayoutParams();
        r3 = (android.support.v7.widget.Toolbar.LayoutParams) r3;
        r4 = r4.getLayoutParams();
        r4 = (android.support.v7.widget.Toolbar.LayoutParams) r4;
        if (r20 == 0) goto L_0x01ba;
    L_0x01b0:
        r0 = r26;
        r9 = r0.mTitleTextView;
        r9 = r9.getMeasuredWidth();
        if (r9 > 0) goto L_0x01c6;
    L_0x01ba:
        if (r21 == 0) goto L_0x0400;
    L_0x01bc:
        r0 = r26;
        r9 = r0.mSubtitleTextView;
        r9 = r9.getMeasuredWidth();
        if (r9 <= 0) goto L_0x0400;
    L_0x01c6:
        r9 = 1;
    L_0x01c7:
        r0 = r26;
        r10 = r0.mGravity;
        r10 = r10 & 112;
        switch(r10) {
            case 48: goto L_0x0403;
            case 80: goto L_0x0222;
            default: goto L_0x01d0;
        };
    L_0x01d0:
        r10 = r14 - r16;
        r10 = r10 - r17;
        r10 = r10 - r11;
        r10 = r10 / 2;
        r0 = r3.topMargin;
        r22 = r0;
        r0 = r26;
        r0 = r0.mTitleMarginTop;
        r23 = r0;
        r22 = r22 + r23;
        r0 = r22;
        if (r10 >= r0) goto L_0x01f3;
    L_0x01e7:
        r10 = r3.topMargin;
        r0 = r26;
        r0 = r0.mTitleMarginTop;
        r22 = r0;
        r10 = r10 + r22;
        if (r12 == 0) goto L_0x021e;
    L_0x01f3:
        r22 = r14 - r17;
        r22 = r22 - r11;
        r22 = r22 - r10;
        r22 = r22 - r16;
        r3 = r3.bottomMargin;
        r0 = r26;
        r0 = r0.mTitleMarginBottom;
        r23 = r0;
        r3 = r3 + r23;
        r0 = r22;
        if (r0 >= r3) goto L_0x021e;
    L_0x0209:
        r3 = 0;
        r0 = r4.bottomMargin;
        r23 = r0;
        r0 = r26;
        r0 = r0.mTitleMarginBottom;
        r24 = r0;
        r23 = r23 + r24;
        r22 = r23 - r22;
        r10 = r10 - r22;
        r10 = java.lang.Math.max(r3, r10);
    L_0x021e:
        r3 = r16 + r10;
        if (r12 == 0) goto L_0x043b;
    L_0x0222:
        r3 = r14 - r17;
        r4 = r4.bottomMargin;
        r3 = r3 - r4;
        r0 = r26;
        r4 = r0.mTitleMarginBottom;
        r3 = r3 - r4;
        r4 = r3 - r11;
    L_0x022e:
        if (r5 == 0) goto L_0x02b9;
    L_0x0230:
        if (r9 == 0) goto L_0x041a;
    L_0x0232:
        r0 = r26;
        r3 = r0.mTitleMarginStart;
    L_0x0236:
        r5 = 1;
        r5 = r18[r5];
        r3 = r3 - r5;
        r5 = 0;
        r5 = java.lang.Math.max(r5, r3);
        r7 = r7 - r5;
        r5 = 1;
        r10 = 0;
        r3 = -r3;
        r3 = java.lang.Math.max(r10, r3);
        r18[r5] = r3;
        if (r20 == 0) goto L_0x0438;
    L_0x024b:
        r0 = r26;
        r3 = r0.mTitleTextView;
        r3 = r3.getLayoutParams();
        r3 = (android.support.v7.widget.Toolbar.LayoutParams) r3;
        r0 = r26;
        r5 = r0.mTitleTextView;
        r5 = r5.getMeasuredWidth();
        r5 = r7 - r5;
        r0 = r26;
        r10 = r0.mTitleTextView;
        r10 = r10.getMeasuredHeight();
        r10 = r10 + r4;
        r0 = r26;
        r11 = r0.mTitleTextView;
        r11.layout(r5, r4, r7, r10);
        r0 = r26;
        r4 = r0.mTitleMarginEnd;
        r4 = r5 - r4;
        r3 = r3.bottomMargin;
        r3 = r3 + r10;
        r5 = r4;
        r4 = r3;
    L_0x027a:
        if (r21 == 0) goto L_0x0435;
    L_0x027c:
        r0 = r26;
        r3 = r0.mSubtitleTextView;
        r3 = r3.getLayoutParams();
        r3 = (android.support.v7.widget.Toolbar.LayoutParams) r3;
        r10 = r3.topMargin;
        r4 = r4 + r10;
        r0 = r26;
        r10 = r0.mSubtitleTextView;
        r10 = r10.getMeasuredWidth();
        r10 = r7 - r10;
        r0 = r26;
        r11 = r0.mSubtitleTextView;
        r11 = r11.getMeasuredHeight();
        r11 = r11 + r4;
        r0 = r26;
        r14 = r0.mSubtitleTextView;
        r14.layout(r10, r4, r7, r11);
        r0 = r26;
        r4 = r0.mTitleMarginEnd;
        r4 = r7 - r4;
        r3 = r3.bottomMargin;
        r3 = r3 + r11;
        r25 = r4;
        r4 = r3;
        r3 = r25;
    L_0x02b1:
        if (r9 == 0) goto L_0x02b7;
    L_0x02b3:
        r7 = java.lang.Math.min(r5, r3);
    L_0x02b7:
        if (r12 == 0) goto L_0x0338;
    L_0x02b9:
        if (r9 == 0) goto L_0x041d;
    L_0x02bb:
        r0 = r26;
        r3 = r0.mTitleMarginStart;
    L_0x02bf:
        r5 = 0;
        r5 = r18[r5];
        r3 = r3 - r5;
        r5 = 0;
        r5 = java.lang.Math.max(r5, r3);
        r8 = r8 + r5;
        r5 = 0;
        r10 = 0;
        r3 = -r3;
        r3 = java.lang.Math.max(r10, r3);
        r18[r5] = r3;
        if (r20 == 0) goto L_0x0432;
    L_0x02d4:
        r0 = r26;
        r3 = r0.mTitleTextView;
        r3 = r3.getLayoutParams();
        r3 = (android.support.v7.widget.Toolbar.LayoutParams) r3;
        r0 = r26;
        r5 = r0.mTitleTextView;
        r5 = r5.getMeasuredWidth();
        r5 = r5 + r8;
        r0 = r26;
        r10 = r0.mTitleTextView;
        r10 = r10.getMeasuredHeight();
        r10 = r10 + r4;
        r0 = r26;
        r11 = r0.mTitleTextView;
        r11.layout(r8, r4, r5, r10);
        r0 = r26;
        r4 = r0.mTitleMarginEnd;
        r4 = r4 + r5;
        r3 = r3.bottomMargin;
        r3 = r3 + r10;
        r5 = r4;
        r4 = r3;
    L_0x0301:
        if (r21 == 0) goto L_0x042f;
    L_0x0303:
        r0 = r26;
        r3 = r0.mSubtitleTextView;
        r3 = r3.getLayoutParams();
        r3 = (android.support.v7.widget.Toolbar.LayoutParams) r3;
        r10 = r3.topMargin;
        r4 = r4 + r10;
        r0 = r26;
        r10 = r0.mSubtitleTextView;
        r10 = r10.getMeasuredWidth();
        r10 = r10 + r8;
        r0 = r26;
        r11 = r0.mSubtitleTextView;
        r11 = r11.getMeasuredHeight();
        r11 = r11 + r4;
        r0 = r26;
        r14 = r0.mSubtitleTextView;
        r14.layout(r8, r4, r10, r11);
        r0 = r26;
        r4 = r0.mTitleMarginEnd;
        r4 = r4 + r10;
        r3 = r3.bottomMargin;
        r3 = r3 + r11;
        r3 = r4;
    L_0x0332:
        if (r9 == 0) goto L_0x0338;
    L_0x0334:
        r8 = java.lang.Math.max(r5, r3);
    L_0x0338:
        r0 = r26;
        r3 = r0.mTempViews;
        r4 = 3;
        r0 = r26;
        r0.addCustomViewsWithGravity(r3, r4);
        r0 = r26;
        r3 = r0.mTempViews;
        r9 = r3.size();
        r3 = 0;
        r5 = r3;
        r4 = r8;
    L_0x034d:
        if (r5 >= r9) goto L_0x0368;
    L_0x034f:
        r0 = r26;
        r3 = r0.mTempViews;
        r3 = r3.get(r5);
        r3 = (android.view.View) r3;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r3 = r0.layoutChildLeft(r3, r4, r1, r2);
        r4 = r5 + 1;
        if (r12 == 0) goto L_0x042b;
    L_0x0367:
        r4 = r3;
    L_0x0368:
        r0 = r26;
        r3 = r0.mTempViews;
        r5 = 5;
        r0 = r26;
        r0.addCustomViewsWithGravity(r3, r5);
        r0 = r26;
        r3 = r0.mTempViews;
        r8 = r3.size();
        r3 = 0;
        r5 = r7;
        r7 = r3;
    L_0x037d:
        if (r7 >= r8) goto L_0x0428;
    L_0x037f:
        r0 = r26;
        r3 = r0.mTempViews;
        r3 = r3.get(r7);
        r3 = (android.view.View) r3;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r3 = r0.layoutChildRight(r3, r5, r1, r2);
        r5 = r7 + 1;
        if (r12 == 0) goto L_0x0424;
    L_0x0397:
        r0 = r26;
        r5 = r0.mTempViews;
        r7 = 1;
        r0 = r26;
        r0.addCustomViewsWithGravity(r5, r7);
        r0 = r26;
        r5 = r0.mTempViews;
        r0 = r26;
        r1 = r18;
        r7 = r0.getViewListMeasuredWidth(r5, r1);
        r5 = r13 - r6;
        r5 = r5 - r15;
        r5 = r5 / 2;
        r5 = r5 + r6;
        r6 = r7 / 2;
        r5 = r5 - r6;
        r6 = r5 + r7;
        if (r5 >= r4) goto L_0x0422;
    L_0x03ba:
        if (r12 == 0) goto L_0x03c1;
    L_0x03bc:
        if (r6 <= r3) goto L_0x03c1;
    L_0x03be:
        r3 = r6 - r3;
        r4 = r4 - r3;
    L_0x03c1:
        r0 = r26;
        r3 = r0.mTempViews;
        r6 = r3.size();
        r3 = 0;
        r5 = r4;
        r4 = r3;
    L_0x03cc:
        if (r4 >= r6) goto L_0x03e6;
    L_0x03ce:
        r0 = r26;
        r3 = r0.mTempViews;
        r3 = r3.get(r4);
        r3 = (android.view.View) r3;
        r0 = r26;
        r1 = r18;
        r2 = r19;
        r5 = r0.layoutChildLeft(r3, r5, r1, r2);
        r3 = r4 + 1;
        if (r12 == 0) goto L_0x0420;
    L_0x03e6:
        r0 = r26;
        r3 = r0.mTempViews;
        r3.clear();
        return;
    L_0x03ee:
        r3 = 0;
        r5 = r3;
        goto L_0x000b;
    L_0x03f2:
        r0 = r26;
        r3 = r0.mSubtitleTextView;
        r9 = r3;
        goto L_0x019b;
    L_0x03f9:
        r0 = r26;
        r3 = r0.mTitleTextView;
        r4 = r3;
        goto L_0x01a2;
    L_0x0400:
        r9 = 0;
        goto L_0x01c7;
    L_0x0403:
        r10 = r26.getPaddingTop();
        r0 = r3.topMargin;
        r22 = r0;
        r10 = r10 + r22;
        r0 = r26;
        r0 = r0.mTitleMarginTop;
        r22 = r0;
        r10 = r10 + r22;
        if (r12 != 0) goto L_0x01d0;
    L_0x0417:
        r4 = r10;
        goto L_0x022e;
    L_0x041a:
        r3 = 0;
        goto L_0x0236;
    L_0x041d:
        r3 = 0;
        goto L_0x02bf;
    L_0x0420:
        r4 = r3;
        goto L_0x03cc;
    L_0x0422:
        r4 = r5;
        goto L_0x03bc;
    L_0x0424:
        r7 = r5;
        r5 = r3;
        goto L_0x037d;
    L_0x0428:
        r3 = r5;
        goto L_0x0397;
    L_0x042b:
        r5 = r4;
        r4 = r3;
        goto L_0x034d;
    L_0x042f:
        r3 = r8;
        goto L_0x0332;
    L_0x0432:
        r5 = r8;
        goto L_0x0301;
    L_0x0435:
        r3 = r7;
        goto L_0x02b1;
    L_0x0438:
        r5 = r7;
        goto L_0x027a;
    L_0x043b:
        r4 = r3;
        goto L_0x022e;
    L_0x043e:
        r11 = r4;
        goto L_0x0190;
    L_0x0441:
        r7 = r3;
        r8 = r4;
        goto L_0x0144;
    L_0x0445:
        r4 = r6;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.peekMenu() == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter(this, null);
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (!(this.mExpandedMenuPresenter == null || this.mExpandedMenuPresenter.mCurrentExpandedItem == null)) {
            savedState.expandedMenuItemId = this.mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
        }
        savedState.isOverflowOpen = isOverflowMenuShowing();
        return savedState;
    }

    public int getContentInsetEnd() {
        return this.mContentInsets.getEnd();
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    static void access$200(Toolbar toolbar) {
        toolbar.ensureCollapseButtonView();
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMenu(android.support.v7.view.menu.MenuBuilder r5, android.support.v7.widget.ActionMenuPresenter r6) {
        /*
        r4 = this;
        r3 = 0;
        r2 = 1;
        if (r5 != 0) goto L_0x0009;
    L_0x0004:
        r0 = r4.mMenuView;
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r4.ensureMenuView();
        r0 = r4.mMenuView;
        r0 = r0.peekMenu();
        if (r0 == r5) goto L_0x0008;
    L_0x0014:
        if (r0 == 0) goto L_0x0020;
    L_0x0016:
        r1 = r4.mOuterActionMenuPresenter;
        r0.removeMenuPresenter(r1);
        r1 = r4.mExpandedMenuPresenter;
        r0.removeMenuPresenter(r1);
    L_0x0020:
        r0 = r4.mExpandedMenuPresenter;
        if (r0 != 0) goto L_0x002b;
    L_0x0024:
        r0 = new android.support.v7.widget.Toolbar$ExpandedActionViewMenuPresenter;
        r0.<init>(r4, r3);
        r4.mExpandedMenuPresenter = r0;
    L_0x002b:
        r6.setExpandedActionViewsExclusive(r2);
        if (r5 == 0) goto L_0x0040;
    L_0x0030:
        r0 = r4.mPopupContext;
        r5.addMenuPresenter(r6, r0);
        r0 = r4.mExpandedMenuPresenter;
        r1 = r4.mPopupContext;
        r5.addMenuPresenter(r0, r1);
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r0 == 0) goto L_0x0054;
    L_0x0040:
        r0 = r4.mPopupContext;
        r6.initForMenu(r0, r3);
        r0 = r4.mExpandedMenuPresenter;
        r1 = r4.mPopupContext;
        r0.initForMenu(r1, r3);
        r6.updateMenuView(r2);
        r0 = r4.mExpandedMenuPresenter;
        r0.updateMenuView(r2);
    L_0x0054:
        r0 = r4.mMenuView;
        r1 = r4.mPopupTheme;
        r0.setPopupTheme(r1);
        r0 = r4.mMenuView;
        r0.setPresenter(r6);
        r4.mOuterActionMenuPresenter = r6;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.setMenu(android.support.v7.view.menu.MenuBuilder, android.support.v7.widget.ActionMenuPresenter):void");
    }

    static OnMenuItemClickListener access$000(Toolbar toolbar) {
        return toolbar.mOnMenuItemClickListener;
    }

    private int getChildHorizontalGravity(int i) {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, layoutDirection) & 7;
        switch (absoluteGravity) {
            case at.g /*1*/:
            case at.o /*3*/:
            case at.m /*5*/:
                return absoluteGravity;
            default:
                return layoutDirection == 1 ? 5 : 3;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setNavigationIcon(@android.support.annotation.Nullable android.graphics.drawable.Drawable r3) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x0017;
    L_0x0002:
        r2.ensureNavButtonView();
        r0 = r2.mNavButtonView;
        r0 = r2.isChildOrHidden(r0);
        if (r0 != 0) goto L_0x002f;
    L_0x000d:
        r0 = r2.mNavButtonView;
        r1 = 1;
        r2.addSystemView(r0, r1);
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r0 == 0) goto L_0x002f;
    L_0x0017:
        r0 = r2.mNavButtonView;
        if (r0 == 0) goto L_0x002f;
    L_0x001b:
        r0 = r2.mNavButtonView;
        r0 = r2.isChildOrHidden(r0);
        if (r0 == 0) goto L_0x002f;
    L_0x0023:
        r0 = r2.mNavButtonView;
        r2.removeView(r0);
        r0 = r2.mHiddenViews;
        r1 = r2.mNavButtonView;
        r0.remove(r1);
    L_0x002f:
        r0 = r2.mNavButtonView;
        if (r0 == 0) goto L_0x0038;
    L_0x0033:
        r0 = r2.mNavButtonView;
        r0.setImageDrawable(r3);
    L_0x0038:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.setNavigationIcon(android.graphics.drawable.Drawable):void");
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setContentDescription(charSequence);
        }
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        i3 = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i3, max + measuredWidth, view.getMeasuredHeight() + i3);
        return (layoutParams.rightMargin + measuredWidth) + max;
    }

    public void setContentInsetsRelative(int i, int i2) {
        this.mContentInsets.setRelative(i, i2);
    }

    public void setNavigationContentDescription(@StringRes int i) {
        CharSequence text;
        if (i != 0) {
            text = getContext().getText(i);
        } else {
            text = null;
        }
        setNavigationContentDescription(text);
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        if (this.mLogoView != null) {
            this.mLogoView.setContentDescription(charSequence);
        }
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        return this.mNavButtonView != null ? this.mNavButtonView.getContentDescription() : null;
    }

    private boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    static int access$400(Toolbar toolbar) {
        return toolbar.mButtonGravity;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    protected android.view.ViewGroup.LayoutParams m30generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public boolean hideOverflowMenu() {
        return this.mMenuView != null && this.mMenuView.hideOverflowMenu();
    }

    public DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return this.mWrapper;
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.mTitleTextColor = i;
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setTextColor(i);
        }
    }

    private int getHorizontalMargins(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams) + MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
    }

    public android.view.ViewGroup.LayoutParams m29generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    private void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            this.mCollapseButtonView = new ImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            android.view.ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = 8388611 | (this.mButtonGravity & 112);
            generateDefaultLayoutParams.mViewType = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new 3(this));
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        switch (i2) {
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
            case arj.Theme_homeAsUpIndicator /*48*/:
            case arj.Theme_panelMenuListTheme /*80*/:
                return i2;
            default:
                return this.mGravity & 112;
        }
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

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTitle(java.lang.CharSequence r4) {
        /*
        r3 = this;
        r0 = android.text.TextUtils.isEmpty(r4);
        if (r0 != 0) goto L_0x0049;
    L_0x0006:
        r0 = r3.mTitleTextView;
        if (r0 != 0) goto L_0x0037;
    L_0x000a:
        r0 = r3.getContext();
        r1 = new android.widget.TextView;
        r1.<init>(r0);
        r3.mTitleTextView = r1;
        r1 = r3.mTitleTextView;
        r1.setSingleLine();
        r1 = r3.mTitleTextView;
        r2 = android.text.TextUtils.TruncateAt.END;
        r1.setEllipsize(r2);
        r1 = r3.mTitleTextAppearance;
        if (r1 == 0) goto L_0x002c;
    L_0x0025:
        r1 = r3.mTitleTextView;
        r2 = r3.mTitleTextAppearance;
        r1.setTextAppearance(r0, r2);
    L_0x002c:
        r0 = r3.mTitleTextColor;
        if (r0 == 0) goto L_0x0037;
    L_0x0030:
        r0 = r3.mTitleTextView;
        r1 = r3.mTitleTextColor;
        r0.setTextColor(r1);
    L_0x0037:
        r0 = r3.mTitleTextView;
        r0 = r3.isChildOrHidden(r0);
        if (r0 != 0) goto L_0x0061;
    L_0x003f:
        r0 = r3.mTitleTextView;
        r1 = 1;
        r3.addSystemView(r0, r1);
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r0 == 0) goto L_0x0061;
    L_0x0049:
        r0 = r3.mTitleTextView;
        if (r0 == 0) goto L_0x0061;
    L_0x004d:
        r0 = r3.mTitleTextView;
        r0 = r3.isChildOrHidden(r0);
        if (r0 == 0) goto L_0x0061;
    L_0x0055:
        r0 = r3.mTitleTextView;
        r3.removeView(r0);
        r0 = r3.mHiddenViews;
        r1 = r3.mTitleTextView;
        r0.remove(r1);
    L_0x0061:
        r0 = r3.mTitleTextView;
        if (r0 == 0) goto L_0x006a;
    L_0x0065:
        r0 = r3.mTitleTextView;
        r0.setText(r4);
    L_0x006a:
        r3.mTitleText = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.setTitle(java.lang.CharSequence):void");
    }

    public int getContentInsetStart() {
        return this.mContentInsets.getStart();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getChildTop(android.view.View r9, int r10) {
        /*
        r8 = this;
        r2 = 0;
        r0 = r9.getLayoutParams();
        r0 = (android.support.v7.widget.Toolbar.LayoutParams) r0;
        r3 = r9.getMeasuredHeight();
        if (r10 <= 0) goto L_0x004c;
    L_0x000d:
        r1 = r3 - r10;
        r1 = r1 / 2;
    L_0x0011:
        r4 = r0.gravity;
        r4 = r8.getChildVerticalGravity(r4);
        switch(r4) {
            case 48: goto L_0x004e;
            case 80: goto L_0x0054;
            default: goto L_0x001a;
        };
    L_0x001a:
        r4 = r8.getPaddingTop();
        r5 = r8.getPaddingBottom();
        r6 = r8.getHeight();
        r1 = r6 - r4;
        r1 = r1 - r5;
        r1 = r1 - r3;
        r1 = r1 / 2;
        r7 = r0.topMargin;
        if (r1 >= r7) goto L_0x0036;
    L_0x0030:
        r1 = r0.topMargin;
        r7 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r7 == 0) goto L_0x0049;
    L_0x0036:
        r5 = r6 - r5;
        r3 = r5 - r3;
        r3 = r3 - r1;
        r3 = r3 - r4;
        r5 = r0.bottomMargin;
        if (r3 >= r5) goto L_0x0049;
    L_0x0040:
        r0 = r0.bottomMargin;
        r0 = r0 - r3;
        r0 = r1 - r0;
        r1 = java.lang.Math.max(r2, r0);
    L_0x0049:
        r0 = r4 + r1;
    L_0x004b:
        return r0;
    L_0x004c:
        r1 = r2;
        goto L_0x0011;
    L_0x004e:
        r0 = r8.getPaddingTop();
        r0 = r0 - r1;
        goto L_0x004b;
    L_0x0054:
        r2 = r8.getHeight();
        r4 = r8.getPaddingBottom();
        r2 = r2 - r4;
        r2 = r2 - r3;
        r0 = r0.bottomMargin;
        r0 = r2 - r0;
        r0 = r0 - r1;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.getChildTop(android.view.View, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLogo(android.graphics.drawable.Drawable r3) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x0017;
    L_0x0002:
        r2.ensureLogoView();
        r0 = r2.mLogoView;
        r0 = r2.isChildOrHidden(r0);
        if (r0 != 0) goto L_0x002f;
    L_0x000d:
        r0 = r2.mLogoView;
        r1 = 1;
        r2.addSystemView(r0, r1);
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r0 == 0) goto L_0x002f;
    L_0x0017:
        r0 = r2.mLogoView;
        if (r0 == 0) goto L_0x002f;
    L_0x001b:
        r0 = r2.mLogoView;
        r0 = r2.isChildOrHidden(r0);
        if (r0 == 0) goto L_0x002f;
    L_0x0023:
        r0 = r2.mLogoView;
        r2.removeView(r0);
        r0 = r2.mHiddenViews;
        r1 = r2.mLogoView;
        r0.remove(r1);
    L_0x002f:
        r0 = r2.mLogoView;
        if (r0 == 0) goto L_0x0038;
    L_0x0033:
        r0 = r2.mLogoView;
        r0.setImageDrawable(r3);
    L_0x0038:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.setLogo(android.graphics.drawable.Drawable):void");
    }

    public boolean isOverflowMenuShowPending() {
        return this.mMenuView != null && this.mMenuView.isOverflowMenuShowPending();
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    private int getVerticalMargins(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.mSubtitleTextColor = i;
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setTextColor(i);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (i != 1) {
            z = false;
        }
        rtlSpacingHelper.setDirection(z);
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        i3 = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i3, max, view.getMeasuredHeight() + i3);
        return max - (layoutParams.leftMargin + measuredWidth);
    }

    static ImageButton access$300(Toolbar toolbar) {
        return toolbar.mCollapseButtonView;
    }

    public Toolbar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSubtitle(java.lang.CharSequence r4) {
        /*
        r3 = this;
        r0 = android.text.TextUtils.isEmpty(r4);
        if (r0 != 0) goto L_0x0049;
    L_0x0006:
        r0 = r3.mSubtitleTextView;
        if (r0 != 0) goto L_0x0037;
    L_0x000a:
        r0 = r3.getContext();
        r1 = new android.widget.TextView;
        r1.<init>(r0);
        r3.mSubtitleTextView = r1;
        r1 = r3.mSubtitleTextView;
        r1.setSingleLine();
        r1 = r3.mSubtitleTextView;
        r2 = android.text.TextUtils.TruncateAt.END;
        r1.setEllipsize(r2);
        r1 = r3.mSubtitleTextAppearance;
        if (r1 == 0) goto L_0x002c;
    L_0x0025:
        r1 = r3.mSubtitleTextView;
        r2 = r3.mSubtitleTextAppearance;
        r1.setTextAppearance(r0, r2);
    L_0x002c:
        r0 = r3.mSubtitleTextColor;
        if (r0 == 0) goto L_0x0037;
    L_0x0030:
        r0 = r3.mSubtitleTextView;
        r1 = r3.mSubtitleTextColor;
        r0.setTextColor(r1);
    L_0x0037:
        r0 = r3.mSubtitleTextView;
        r0 = r3.isChildOrHidden(r0);
        if (r0 != 0) goto L_0x0061;
    L_0x003f:
        r0 = r3.mSubtitleTextView;
        r1 = 1;
        r3.addSystemView(r0, r1);
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r0 == 0) goto L_0x0061;
    L_0x0049:
        r0 = r3.mSubtitleTextView;
        if (r0 == 0) goto L_0x0061;
    L_0x004d:
        r0 = r3.mSubtitleTextView;
        r0 = r3.isChildOrHidden(r0);
        if (r0 == 0) goto L_0x0061;
    L_0x0055:
        r0 = r3.mSubtitleTextView;
        r3.removeView(r0);
        r0 = r3.mHiddenViews;
        r1 = r3.mSubtitleTextView;
        r0.remove(r1);
    L_0x0061:
        r0 = r3.mSubtitleTextView;
        if (r0 == 0) goto L_0x006a;
    L_0x0065:
        r0 = r3.mSubtitleTextView;
        r0.setText(r4);
    L_0x006a:
        r3.mSubtitleText = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.setSubtitle(java.lang.CharSequence):void");
    }

    public boolean hasExpandedActionView() {
        return (this.mExpandedMenuPresenter == null || this.mExpandedMenuPresenter.mCurrentExpandedItem == null) ? false : true;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        Menu peekMenu;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.mMenuView != null) {
            peekMenu = this.mMenuView.peekMenu();
        } else {
            peekMenu = null;
        }
        if (!(savedState.expandedMenuItemId == 0 || this.mExpandedMenuPresenter == null || peekMenu == null)) {
            MenuItem findItem = peekMenu.findItem(savedState.expandedMenuItemId);
            if (findItem != null) {
                MenuItemCompat.expandActionView(findItem);
            }
        }
        if (savedState.isOverflowOpen) {
            postShowOverflowMenu();
        }
    }

    public void dismissPopupMenus() {
        if (this.mMenuView != null) {
            this.mMenuView.dismissPopupMenus();
        }
    }

    public Toolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        boolean z = false;
        boolean z2 = LinearLayoutCompat.a;
        super(context, attributeSet, i);
        this.mContentInsets = new RtlSpacingHelper();
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList();
        this.mHiddenViews = new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new 1(this);
        this.mShowOverflowMenuRunnable = new 2(this);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, R.styleable.Toolbar, i, 0);
        this.mTitleTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_titleTextAppearance, 0);
        this.mSubtitleTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = obtainStyledAttributes.getInteger(R.styleable.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = 48;
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMargins, 0);
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset;
        }
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset;
        }
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset;
        }
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset;
        }
        this.mMaxButtonHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_maxButtonHeight, -1);
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        this.mContentInsets.setAbsolute(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_contentInsetLeft, 0), obtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_contentInsetRight, 0));
        if (!(dimensionPixelOffset == Integer.MIN_VALUE && dimensionPixelOffset2 == Integer.MIN_VALUE)) {
            this.mContentInsets.setRelative(dimensionPixelOffset, dimensionPixelOffset2);
        }
        this.mCollapseIcon = obtainStyledAttributes.getDrawable(R.styleable.Toolbar_collapseIcon);
        this.mCollapseDescription = obtainStyledAttributes.getText(R.styleable.Toolbar_collapseContentDescription);
        CharSequence text = obtainStyledAttributes.getText(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        text = obtainStyledAttributes.getText(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text)) {
            setSubtitle(text);
        }
        this.mPopupContext = getContext();
        setPopupTheme(obtainStyledAttributes.getResourceId(R.styleable.Toolbar_popupTheme, 0));
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.Toolbar_navigationIcon);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        text = obtainStyledAttributes.getText(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text)) {
            setNavigationContentDescription(text);
        }
        drawable = obtainStyledAttributes.getDrawable(R.styleable.Toolbar_logo);
        if (drawable != null) {
            setLogo(drawable);
        }
        text = obtainStyledAttributes.getText(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text)) {
            setLogoDescription(text);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(obtainStyledAttributes.getColor(R.styleable.Toolbar_titleTextColor, -1));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(obtainStyledAttributes.getColor(R.styleable.Toolbar_subtitleTextColor, -1));
        }
        obtainStyledAttributes.recycle();
        this.mTintManager = obtainStyledAttributes.getTintManager();
        if (AppCompatActivity.b != 0) {
            if (!z2) {
                z = true;
            }
            LinearLayoutCompat.a = z;
        }
    }

    public void setSubtitleTextAppearance(Context context, @StyleRes int i) {
        this.mSubtitleTextAppearance = i;
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setTextAppearance(context, i);
        }
    }

    public int getContentInsetLeft() {
        return this.mContentInsets.getLeft();
    }

    void addChildrenForExpandedActionView() {
        boolean z = LinearLayoutCompat.a;
        int size = this.mHiddenViews.size() - 1;
        while (size >= 0) {
            addView((View) this.mHiddenViews.get(size));
            int i = size - 1;
            if (z) {
                break;
            }
            size = i;
        }
        this.mHiddenViews.clear();
    }
}
