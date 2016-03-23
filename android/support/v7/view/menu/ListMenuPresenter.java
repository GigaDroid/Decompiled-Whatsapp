package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView.ItemView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class ListMenuPresenter implements MenuPresenter, OnItemClickListener {
    private static final String[] z;
    MenuAdapter mAdapter;
    private Callback mCallback;
    Context mContext;
    private int mId;
    LayoutInflater mInflater;
    private int mItemIndexOffset;
    int mItemLayoutRes;
    MenuBuilder mMenu;
    ExpandedMenuView mMenuView;
    int mThemeRes;

    class MenuAdapter extends BaseAdapter {
        private int mExpandedIndex;
        final ListMenuPresenter this$0;

        void findExpandedIndex() {
            int i = MenuBuilder.a;
            MenuItemImpl expandedItem = this.this$0.mMenu.getExpandedItem();
            if (expandedItem != null) {
                ArrayList nonActionItems = this.this$0.mMenu.getNonActionItems();
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

        public void notifyDataSetChanged() {
            findExpandedIndex();
            super.notifyDataSetChanged();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate;
            if (view == null) {
                inflate = this.this$0.mInflater.inflate(this.this$0.mItemLayoutRes, viewGroup, false);
            } else {
                inflate = view;
            }
            ((ItemView) inflate).initialize(getItem(i), 0);
            return inflate;
        }

        public MenuItemImpl getItem(int i) {
            ArrayList nonActionItems = this.this$0.mMenu.getNonActionItems();
            int access$000 = ListMenuPresenter.access$000(this.this$0) + i;
            if (this.mExpandedIndex >= 0 && access$000 >= this.mExpandedIndex) {
                access$000++;
            }
            return (MenuItemImpl) nonActionItems.get(access$000);
        }

        public Object m67getItem(int i) {
            return getItem(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public MenuAdapter(ListMenuPresenter listMenuPresenter) {
            this.this$0 = listMenuPresenter;
            this.mExpandedIndex = -1;
            findExpandedIndex();
        }

        public int getCount() {
            int size = this.this$0.mMenu.getNonActionItems().size() - ListMenuPresenter.access$000(this.this$0);
            if (this.mExpandedIndex < 0) {
                return size;
            }
            return size - 1;
        }
    }

    static {
        String[] strArr = new String[2];
        String str = "`=;!&h7e>,o&e? r'";
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
                        i3 = 1;
                        break;
                    case at.g /*1*/:
                        i3 = 83;
                        break;
                    case at.i /*2*/:
                        i3 = 95;
                        break;
                    case at.o /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 73;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "`=;!&h7e>,o&e? r'";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
            }
        }
    }

    public void updateMenuView(boolean z) {
        if (this.mAdapter != null) {
            this.mAdapter.notifyDataSetChanged();
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.mMenu.performItemAction(this.mAdapter.getItem(i), this, 0);
    }

    public ListAdapter getAdapter() {
        if (this.mAdapter == null) {
            this.mAdapter = new MenuAdapter(this);
        }
        return this.mAdapter;
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (this.mCallback != null) {
            this.mCallback.onCloseMenu(menuBuilder, z);
        }
    }

    public void saveHierarchyState(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        if (this.mMenuView != null) {
            this.mMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(z[0], sparseArray);
    }

    public ListMenuPresenter(int i, int i2) {
        this.mItemLayoutRes = i;
        this.mThemeRes = i2;
    }

    public void restoreHierarchyState(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(z[1]);
        if (sparseParcelableArray != null) {
            this.mMenuView.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        new MenuDialogHelper(subMenuBuilder).show(null);
        if (this.mCallback != null) {
            this.mCallback.onOpenSubMenu(subMenuBuilder);
        }
        return true;
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    static int access$000(ListMenuPresenter listMenuPresenter) {
        return listMenuPresenter.mItemIndexOffset;
    }

    public Parcelable onSaveInstanceState() {
        if (this.mMenuView == null) {
            return null;
        }
        Parcelable bundle = new Bundle();
        saveHierarchyState(bundle);
        return bundle;
    }

    public ListMenuPresenter(Context context, int i) {
        this(i, 0);
        this.mContext = context;
        this.mInflater = LayoutInflater.from(this.mContext);
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (ExpandedMenuView) this.mInflater.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.mAdapter == null) {
                this.mAdapter = new MenuAdapter(this);
            }
            this.mMenuView.setAdapter(this.mAdapter);
            this.mMenuView.setOnItemClickListener(this);
        }
        return this.mMenuView;
    }

    public int getId() {
        return this.mId;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initForMenu(android.content.Context r3, android.support.v7.view.menu.MenuBuilder r4) {
        /*
        r2 = this;
        r0 = r2.mThemeRes;
        if (r0 == 0) goto L_0x0019;
    L_0x0004:
        r0 = new android.view.ContextThemeWrapper;
        r1 = r2.mThemeRes;
        r0.<init>(r3, r1);
        r2.mContext = r0;
        r0 = r2.mContext;
        r0 = android.view.LayoutInflater.from(r0);
        r2.mInflater = r0;
        r0 = android.support.v7.view.menu.MenuBuilder.a;
        if (r0 == 0) goto L_0x002b;
    L_0x0019:
        r0 = r2.mContext;
        if (r0 == 0) goto L_0x002b;
    L_0x001d:
        r2.mContext = r3;
        r0 = r2.mInflater;
        if (r0 != 0) goto L_0x002b;
    L_0x0023:
        r0 = r2.mContext;
        r0 = android.view.LayoutInflater.from(r0);
        r2.mInflater = r0;
    L_0x002b:
        r2.mMenu = r4;
        r0 = r2.mAdapter;
        if (r0 == 0) goto L_0x0036;
    L_0x0031:
        r0 = r2.mAdapter;
        r0.notifyDataSetChanged();
    L_0x0036:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.ListMenuPresenter.initForMenu(android.content.Context, android.support.v7.view.menu.MenuBuilder):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        restoreHierarchyState((Bundle) parcelable);
    }
}
