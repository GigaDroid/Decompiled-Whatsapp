package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView.ItemView;
import android.support.v7.widget.ListPopupWindow;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class MenuPopupHelper implements OnItemClickListener, OnKeyListener, OnGlobalLayoutListener, OnDismissListener, MenuPresenter {
    static final int ITEM_LAYOUT;
    private static final String z;
    private final MenuAdapter mAdapter;
    private View mAnchorView;
    private int mContentWidth;
    private final Context mContext;
    private int mDropDownGravity;
    boolean mForceShowIcon;
    private boolean mHasContentWidth;
    private final LayoutInflater mInflater;
    private ViewGroup mMeasureParent;
    private final MenuBuilder mMenu;
    private final boolean mOverflowOnly;
    private ListPopupWindow mPopup;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private Callback mPresenterCallback;
    private ViewTreeObserver mTreeObserver;

    class MenuAdapter extends BaseAdapter {
        private MenuBuilder mAdapterMenu;
        private int mExpandedIndex;
        final MenuPopupHelper this$0;

        static MenuBuilder access$000(MenuAdapter menuAdapter) {
            return menuAdapter.mAdapterMenu;
        }

        void findExpandedIndex() {
            int i = MenuBuilder.a;
            MenuItemImpl expandedItem = MenuPopupHelper.access$300(this.this$0).getExpandedItem();
            if (expandedItem != null) {
                ArrayList nonActionItems = MenuPopupHelper.access$300(this.this$0).getNonActionItems();
                int size = nonActionItems.size();
                int i2 = 0;
                while (i2 < size) {
                    if (((MenuItemImpl) nonActionItems.get(i2)) == expandedItem) {
                        this.mExpandedIndex = i2;
                        return;
                    }
                    int i3 = i2 + 1;
                    if (i != 0) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.mExpandedIndex = -1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate;
            if (view == null) {
                inflate = MenuPopupHelper.access$200(this.this$0).inflate(MenuPopupHelper.ITEM_LAYOUT, viewGroup, false);
            } else {
                inflate = view;
            }
            ItemView itemView = (ItemView) inflate;
            if (this.this$0.mForceShowIcon) {
                ((ListMenuItemView) inflate).setForceShowIcon(true);
            }
            itemView.initialize(getItem(i), 0);
            return inflate;
        }

        public MenuAdapter(MenuPopupHelper menuPopupHelper, MenuBuilder menuBuilder) {
            this.this$0 = menuPopupHelper;
            this.mExpandedIndex = -1;
            this.mAdapterMenu = menuBuilder;
            findExpandedIndex();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public void notifyDataSetChanged() {
            findExpandedIndex();
            super.notifyDataSetChanged();
        }

        public MenuItemImpl getItem(int i) {
            ArrayList nonActionItems;
            if (MenuPopupHelper.access$100(this.this$0)) {
                nonActionItems = this.mAdapterMenu.getNonActionItems();
            } else {
                nonActionItems = this.mAdapterMenu.getVisibleItems();
            }
            if (this.mExpandedIndex >= 0 && i >= this.mExpandedIndex) {
                i++;
            }
            return (MenuItemImpl) nonActionItems.get(i);
        }

        public Object m71getItem(int i) {
            return getItem(i);
        }

        public int getCount() {
            ArrayList nonActionItems;
            if (MenuPopupHelper.access$100(this.this$0)) {
                nonActionItems = this.mAdapterMenu.getNonActionItems();
            } else {
                nonActionItems = this.mAdapterMenu.getVisibleItems();
            }
            if (this.mExpandedIndex < 0) {
                return nonActionItems.size();
            }
            return nonActionItems.size() - 1;
        }
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        try {
            if (menuBuilder == this.mMenu) {
                try {
                    dismiss();
                    if (this.mPresenterCallback != null) {
                        this.mPresenterCallback.onCloseMenu(menuBuilder, z);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public ListPopupWindow getPopup() {
        return this.mPopup;
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z, int i) {
        this(context, menuBuilder, view, z, i, 0);
    }

    private int measureContentWidth() {
        int i = 0;
        int i2 = MenuBuilder.a;
        ListAdapter listAdapter = this.mAdapter;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        View view = null;
        while (i3 < count) {
            View view2;
            int itemViewType = listAdapter.getItemViewType(i3);
            if (itemViewType != i4) {
                view2 = null;
            } else {
                itemViewType = i4;
                view2 = view;
            }
            try {
                if (this.mMeasureParent == null) {
                    this.mMeasureParent = new FrameLayout(this.mContext);
                }
                view = listAdapter.getView(i3, view2, this.mMeasureParent);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i4 = view.getMeasuredWidth();
                try {
                    if (i4 >= this.mPopupMaxWidth) {
                        return this.mPopupMaxWidth;
                    }
                    if (i4 > i) {
                        i = i4;
                    }
                    i4 = i3 + 1;
                    if (i2 != 0) {
                        return i;
                    }
                    i3 = i4;
                    i4 = itemViewType;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        return i;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        try {
            if (keyEvent.getAction() != 1 || i != 82) {
                return false;
            }
            dismiss();
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public int getId() {
        return 0;
    }

    public boolean tryShow() {
        this.mPopup = new ListPopupWindow(this.mContext, null, this.mPopupStyleAttr, this.mPopupStyleRes);
        this.mPopup.setOnDismissListener(this);
        this.mPopup.setOnItemClickListener(this);
        this.mPopup.setAdapter(this.mAdapter);
        this.mPopup.setModal(true);
        View view = this.mAnchorView;
        if (view != null) {
            try {
                boolean z;
                if (this.mTreeObserver == null) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    this.mTreeObserver = view.getViewTreeObserver();
                    if (z) {
                        this.mTreeObserver.addOnGlobalLayoutListener(this);
                    }
                    try {
                        this.mPopup.setAnchorView(view);
                        this.mPopup.setDropDownGravity(this.mDropDownGravity);
                        if (MenuBuilder.a == 0) {
                            try {
                                if (!this.mHasContentWidth) {
                                    this.mContentWidth = measureContentWidth();
                                    this.mHasContentWidth = true;
                                }
                                this.mPopup.setContentWidth(this.mContentWidth);
                                this.mPopup.setInputMethodMode(2);
                                this.mPopup.show();
                                this.mPopup.getListView().setOnKeyListener(this);
                                return true;
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view) {
        this(context, menuBuilder, view, false, R.attr.popupMenuStyle);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MenuAdapter menuAdapter = this.mAdapter;
        MenuAdapter.access$000(menuAdapter).performItemAction(menuAdapter.getItem(i), 0);
    }

    public boolean isShowing() {
        try {
            if (this.mPopup != null) {
                if (this.mPopup.isShowing()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void setCallback(Callback callback) {
        this.mPresenterCallback = callback;
    }

    public void setAnchorView(View view) {
        this.mAnchorView = view;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSubMenuSelected(android.support.v7.view.menu.SubMenuBuilder r10) {
        /*
        r9 = this;
        r0 = 1;
        r1 = 0;
        r4 = android.support.v7.view.menu.MenuBuilder.a;
        r2 = r10.hasVisibleItems();
        if (r2 == 0) goto L_0x0050;
    L_0x000a:
        r5 = new android.support.v7.view.menu.MenuPopupHelper;
        r2 = r9.mContext;
        r3 = r9.mAnchorView;
        r5.<init>(r2, r10, r3);
        r2 = r9.mPresenterCallback;
        r5.setCallback(r2);
        r6 = r10.size();
        r3 = r1;
        r2 = r1;
    L_0x001e:
        if (r3 >= r6) goto L_0x0037;
    L_0x0020:
        r7 = r10.getItem(r3);
        r8 = r7.isVisible();	 Catch:{ IllegalStateException -> 0x004a }
        if (r8 == 0) goto L_0x0033;
    L_0x002a:
        r7 = r7.getIcon();	 Catch:{ IllegalStateException -> 0x004a }
        if (r7 == 0) goto L_0x0033;
    L_0x0030:
        if (r4 == 0) goto L_0x0052;
    L_0x0032:
        r2 = r0;
    L_0x0033:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x001e;
    L_0x0037:
        r5.setForceShowIcon(r2);	 Catch:{ IllegalStateException -> 0x004c }
        r2 = r5.tryShow();	 Catch:{ IllegalStateException -> 0x004c }
        if (r2 == 0) goto L_0x0050;
    L_0x0040:
        r1 = r9.mPresenterCallback;	 Catch:{ IllegalStateException -> 0x004e }
        if (r1 == 0) goto L_0x0049;
    L_0x0044:
        r1 = r9.mPresenterCallback;	 Catch:{ IllegalStateException -> 0x004e }
        r1.onOpenSubMenu(r10);	 Catch:{ IllegalStateException -> 0x004e }
    L_0x0049:
        return r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = r1;
        goto L_0x0049;
    L_0x0052:
        r2 = r0;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuPopupHelper.onSubMenuSelected(android.support.v7.view.menu.SubMenuBuilder):boolean");
    }

    public void updateMenuView(boolean z) {
        try {
            this.mHasContentWidth = false;
            if (this.mAdapter != null) {
                this.mAdapter.notifyDataSetChanged();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z, int i, int i2) {
        this.mDropDownGravity = 0;
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mMenu = menuBuilder;
        this.mAdapter = new MenuAdapter(this, this.mMenu);
        this.mOverflowOnly = z;
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
        Resources resources = context.getResources();
        this.mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.mAnchorView = view;
        menuBuilder.addMenuPresenter(this, context);
    }

    static LayoutInflater access$200(MenuPopupHelper menuPopupHelper) {
        return menuPopupHelper.mInflater;
    }

    static boolean access$100(MenuPopupHelper menuPopupHelper) {
        return menuPopupHelper.mOverflowOnly;
    }

    public void show() {
        try {
            if (!tryShow()) {
                throw new IllegalStateException(z);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void dismiss() {
        try {
            if (isShowing()) {
                this.mPopup.dismiss();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onDismiss() {
        try {
            this.mPopup = null;
            this.mMenu.close();
            if (this.mTreeObserver != null) {
                if (!this.mTreeObserver.isAlive()) {
                    this.mTreeObserver = this.mAnchorView.getViewTreeObserver();
                }
                this.mTreeObserver.removeGlobalOnLayoutListener(this);
                this.mTreeObserver = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static MenuBuilder access$300(MenuPopupHelper menuPopupHelper) {
        return menuPopupHelper.mMenu;
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
        r1 = this;
        r0 = r1.isShowing();
        if (r0 == 0) goto L_0x0022;
    L_0x0006:
        r0 = r1.mAnchorView;
        if (r0 == 0) goto L_0x0010;
    L_0x000a:
        r0 = r0.isShown();	 Catch:{ IllegalStateException -> 0x0023 }
        if (r0 != 0) goto L_0x0017;
    L_0x0010:
        r1.dismiss();	 Catch:{ IllegalStateException -> 0x0025 }
        r0 = android.support.v7.view.menu.MenuBuilder.a;	 Catch:{ IllegalStateException -> 0x0025 }
        if (r0 == 0) goto L_0x0022;
    L_0x0017:
        r0 = r1.isShowing();	 Catch:{ IllegalStateException -> 0x0027 }
        if (r0 == 0) goto L_0x0022;
    L_0x001d:
        r0 = r1.mPopup;	 Catch:{ IllegalStateException -> 0x0027 }
        r0.show();	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0022:
        return;
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuPopupHelper.onGlobalLayout():void");
    }

    public void setGravity(int i) {
        this.mDropDownGravity = i;
    }

    static {
        char[] toCharArray = "\u0017\u0011\u0001\u0003b5\u0004\u001a\u0006z?\u0018\u001f\u0013@z\u0017\u000e\u0018\\5\u0000O\u0014Wz\u0001\u001c\u0013Vz\u0003\u0006\u0002Z5\u0001\u001bVS4T\u000e\u0018Q2\u001b\u001d".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 116;
                    break;
                case at.i /*2*/:
                    i2 = 111;
                    break;
                case at.o /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        ITEM_LAYOUT = R.layout.abc_popup_menu_item_layout;
    }
}
