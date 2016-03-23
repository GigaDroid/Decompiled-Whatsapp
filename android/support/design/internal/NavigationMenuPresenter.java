package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.design.R;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.arj;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

public class NavigationMenuPresenter implements MenuPresenter {
    public static int a;
    private static final String[] z;
    private NavigationMenuAdapter mAdapter;
    private Callback mCallback;
    private LinearLayout mHeaderLayout;
    private ColorStateList mIconTintList;
    private int mId;
    private Drawable mItemBackground;
    private LayoutInflater mLayoutInflater;
    private MenuBuilder mMenu;
    private NavigationMenuView mMenuView;
    private final OnClickListener mOnClickListener;
    private int mPaddingSeparator;
    private int mPaddingTopDefault;
    private int mTextAppearance;
    private boolean mTextAppearanceSet;
    private ColorStateList mTextColor;

    class 1 implements OnClickListener {
        final NavigationMenuPresenter this$0;

        public void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            this.this$0.setUpdateSuspended(true);
            MenuItemImpl itemData = navigationMenuItemView.getItemData();
            boolean performItemAction = NavigationMenuPresenter.access$000(this.this$0).performItemAction(itemData, this.this$0, 0);
            if (itemData != null && itemData.isCheckable() && performItemAction) {
                NavigationMenuPresenter.access$100(this.this$0).setCheckedItem(itemData);
            }
            this.this$0.setUpdateSuspended(false);
            this.this$0.updateMenuView(false);
        }

        1(NavigationMenuPresenter navigationMenuPresenter) {
            this.this$0 = navigationMenuPresenter;
        }
    }

    abstract class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }

    class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    class NavigationMenuAdapter extends Adapter {
        private static final String[] z;
        private MenuItemImpl mCheckedItem;
        private final ArrayList mItems;
        private ColorDrawable mTransparentIcon;
        private boolean mUpdateSuspended;
        final NavigationMenuPresenter this$0;

        static {
            String[] strArr = new String[5];
            String str = "xyn\u00025Zy%\u0005.Hz%\u0018#]r+";
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
                            i3 = 45;
                            break;
                        case at.g /*1*/:
                            i3 = 23;
                            break;
                        case at.i /*2*/:
                            i3 = 5;
                            break;
                        case at.o /*3*/:
                            i3 = arj.Theme_spinnerStyle;
                            break;
                        default:
                            i3 = 90;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "Lya\u001e5Ds?\u0001?Cb?\u000f2Htn\t>";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "Lya\u001e5Ds?\u0001?Cb?\r9Y~j\u0002\u0005[~`\u001b)";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "Lya\u001e5Ds?\u0001?Cb?\u000f2Htn\t>";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "Lya\u001e5Ds?\u0001?Cb?\r9Y~j\u0002\u0005[~`\u001b)";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void setCheckedItem(MenuItemImpl menuItemImpl) {
            try {
                if (this.mCheckedItem == menuItemImpl) {
                    return;
                }
                if (menuItemImpl.isCheckable()) {
                    try {
                        if (this.mCheckedItem != null) {
                            this.mCheckedItem.setChecked(false);
                        }
                        this.mCheckedItem = menuItemImpl;
                        menuItemImpl.setChecked(true);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (RuntimeException e22) {
                throw e22;
            }
        }

        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            int i2 = NavigationMenuPresenter.a;
            switch (getItemViewType(i)) {
                case v.m /*0*/:
                    NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
                    try {
                        navigationMenuItemView.setIconTintList(NavigationMenuPresenter.access$500(this.this$0));
                        if (NavigationMenuPresenter.access$600(this.this$0)) {
                            navigationMenuItemView.setTextAppearance(navigationMenuItemView.getContext(), NavigationMenuPresenter.access$700(this.this$0));
                        }
                        try {
                            if (NavigationMenuPresenter.access$800(this.this$0) != null) {
                                navigationMenuItemView.setTextColor(NavigationMenuPresenter.access$800(this.this$0));
                            }
                            try {
                                Drawable newDrawable;
                                if (NavigationMenuPresenter.access$900(this.this$0) != null) {
                                    newDrawable = NavigationMenuPresenter.access$900(this.this$0).getConstantState().newDrawable();
                                } else {
                                    newDrawable = null;
                                }
                                navigationMenuItemView.setBackgroundDrawable(newDrawable);
                                navigationMenuItemView.initialize(((NavigationMenuTextItem) this.mItems.get(i)).getMenuItem(), 0);
                                if (i2 == 0) {
                                    return;
                                }
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        } catch (RuntimeException e2) {
                            throw e2;
                        }
                    } catch (RuntimeException e22) {
                        throw e22;
                    }
                    break;
                case at.g /*1*/:
                    break;
                case at.i /*2*/:
                    break;
                default:
                    return;
            }
            ((TextView) viewHolder.itemView).setText(((NavigationMenuTextItem) this.mItems.get(i)).getMenuItem().getTitle());
            if (i2 == 0) {
                return;
            }
            NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.mItems.get(i);
            viewHolder.itemView.setPadding(0, navigationMenuSeparatorItem.getPaddingTop(), 0, navigationMenuSeparatorItem.getPaddingBottom());
        }

        public void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
            onViewRecycled((ViewHolder) viewHolder);
        }

        public int getItemViewType(int i) {
            NavigationMenuItem navigationMenuItem = (NavigationMenuItem) this.mItems.get(i);
            try {
                if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                    return 2;
                }
                try {
                    if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                        return 3;
                    }
                    if (navigationMenuItem instanceof NavigationMenuTextItem) {
                        try {
                            if (((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu()) {
                                return 1;
                            }
                            return 0;
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    throw new RuntimeException(z[0]);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (RuntimeException e22) {
                throw e22;
            }
        }

        private void appendTransparentIconIfMissing(int i, int i2) {
            int i3 = NavigationMenuPresenter.a;
            while (i < i2) {
                MenuItem menuItem = ((NavigationMenuTextItem) this.mItems.get(i)).getMenuItem();
                try {
                    if (menuItem.getIcon() == null) {
                        if (this.mTransparentIcon == null) {
                            this.mTransparentIcon = new ColorDrawable(17170445);
                        }
                        menuItem.setIcon(this.mTransparentIcon);
                    }
                    i++;
                    if (i3 != 0) {
                        return;
                    }
                } catch (RuntimeException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public void restoreInstanceState(Bundle bundle) {
            NavigationMenuItem navigationMenuItem;
            int i = NavigationMenuPresenter.a;
            int i2 = bundle.getInt(z[4], 0);
            if (i2 != 0) {
                this.mUpdateSuspended = true;
                Iterator it = this.mItems.iterator();
                while (it.hasNext()) {
                    navigationMenuItem = (NavigationMenuItem) it.next();
                    if (navigationMenuItem instanceof NavigationMenuTextItem) {
                        MenuItemImpl menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                        if (menuItem != null) {
                            try {
                                if (menuItem.getItemId() == i2) {
                                    setCheckedItem(menuItem);
                                    if (i == 0) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } catch (RuntimeException e) {
                                throw e;
                            } catch (RuntimeException e2) {
                                throw e2;
                            }
                        }
                        continue;
                    }
                    if (i != 0) {
                        break;
                    }
                }
                this.mUpdateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(z[3]);
            Iterator it2 = this.mItems.iterator();
            while (it2.hasNext()) {
                navigationMenuItem = (NavigationMenuItem) it2.next();
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    View actionView;
                    MenuItemImpl menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    if (menuItem2 != null) {
                        try {
                            actionView = menuItem2.getActionView();
                        } catch (RuntimeException e22) {
                            throw e22;
                        }
                    }
                    actionView = null;
                    if (actionView != null) {
                        try {
                            actionView.restoreHierarchyState((SparseArray) sparseParcelableArray.get(menuItem2.getItemId()));
                        } catch (RuntimeException e222) {
                            throw e222;
                        }
                    }
                    continue;
                }
                if (i != 0) {
                    return;
                }
            }
        }

        public Bundle createInstanceState() {
            int i = NavigationMenuPresenter.a;
            Bundle bundle = new Bundle();
            try {
                if (this.mCheckedItem != null) {
                    bundle.putInt(z[2], this.mCheckedItem.getItemId());
                }
                SparseArray sparseArray = new SparseArray();
                Iterator it = this.mItems.iterator();
                while (it.hasNext()) {
                    NavigationMenuItem navigationMenuItem = (NavigationMenuItem) it.next();
                    if (navigationMenuItem instanceof NavigationMenuTextItem) {
                        View actionView;
                        MenuItemImpl menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                        if (menuItem != null) {
                            try {
                                actionView = menuItem.getActionView();
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        }
                        actionView = null;
                        if (actionView != null) {
                            SparseArray parcelableSparseArray = new ParcelableSparseArray();
                            actionView.saveHierarchyState(parcelableSparseArray);
                            sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                            continue;
                        } else {
                            continue;
                        }
                    }
                    if (i != 0) {
                        break;
                    }
                }
                bundle.putSparseParcelableArray(z[1], sparseArray);
                return bundle;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }

        public void onViewRecycled(ViewHolder viewHolder) {
            try {
                if (viewHolder instanceof NormalViewHolder) {
                    ((NavigationMenuItemView) viewHolder.itemView).recycle();
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }

        public int getItemCount() {
            return this.mItems.size();
        }

        public android.support.v7.widget.RecyclerView.ViewHolder m3onCreateViewHolder(ViewGroup viewGroup, int i) {
            return onCreateViewHolder(viewGroup, i);
        }

        public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
            onBindViewHolder((ViewHolder) viewHolder, i);
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case v.m /*0*/:
                    try {
                        return new NormalViewHolder(NavigationMenuPresenter.access$200(this.this$0), viewGroup, NavigationMenuPresenter.access$300(this.this$0));
                    } catch (RuntimeException e) {
                        throw e;
                    }
                case at.g /*1*/:
                    return new SubheaderViewHolder(NavigationMenuPresenter.access$200(this.this$0), viewGroup);
                case at.i /*2*/:
                    return new SeparatorViewHolder(NavigationMenuPresenter.access$200(this.this$0), viewGroup);
                case at.o /*3*/:
                    return new HeaderViewHolder(NavigationMenuPresenter.access$400(this.this$0));
                default:
                    return null;
            }
        }

        NavigationMenuAdapter(NavigationMenuPresenter navigationMenuPresenter) {
            this.this$0 = navigationMenuPresenter;
            this.mItems = new ArrayList();
            prepareMenuItems();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void prepareMenuItems() {
            /*
            r17 = this;
            r9 = android.support.design.internal.NavigationMenuPresenter.a;
            r0 = r17;
            r1 = r0.mUpdateSuspended;	 Catch:{ RuntimeException -> 0x0009 }
            if (r1 == 0) goto L_0x000b;
        L_0x0008:
            return;
        L_0x0009:
            r1 = move-exception;
            throw r1;
        L_0x000b:
            r1 = 1;
            r0 = r17;
            r0.mUpdateSuspended = r1;
            r0 = r17;
            r1 = r0.mItems;
            r1.clear();
            r0 = r17;
            r1 = r0.mItems;
            r2 = new android.support.design.internal.NavigationMenuPresenter$NavigationMenuHeaderItem;
            r3 = 0;
            r2.<init>(r3);
            r1.add(r2);
            r5 = -1;
            r4 = 0;
            r3 = 0;
            r1 = 0;
            r0 = r17;
            r2 = r0.this$0;
            r2 = android.support.design.internal.NavigationMenuPresenter.access$000(r2);
            r2 = r2.getVisibleItems();
            r10 = r2.size();
            r8 = r1;
        L_0x0039:
            if (r8 >= r10) goto L_0x0166;
        L_0x003b:
            r0 = r17;
            r1 = r0.this$0;
            r1 = android.support.design.internal.NavigationMenuPresenter.access$000(r1);
            r1 = r1.getVisibleItems();
            r1 = r1.get(r8);
            r1 = (android.support.v7.view.menu.MenuItemImpl) r1;
            r2 = r1.isChecked();	 Catch:{ RuntimeException -> 0x016d }
            if (r2 == 0) goto L_0x0058;
        L_0x0053:
            r0 = r17;
            r0.setCheckedItem(r1);	 Catch:{ RuntimeException -> 0x016d }
        L_0x0058:
            r2 = r1.isCheckable();	 Catch:{ RuntimeException -> 0x016f }
            if (r2 == 0) goto L_0x0062;
        L_0x005e:
            r2 = 0;
            r1.setExclusiveCheckable(r2);	 Catch:{ RuntimeException -> 0x016f }
        L_0x0062:
            r2 = r1.hasSubMenu();
            if (r2 == 0) goto L_0x00f7;
        L_0x0068:
            r11 = r1.getSubMenu();
            r2 = r11.hasVisibleItems();	 Catch:{ RuntimeException -> 0x0171 }
            if (r2 == 0) goto L_0x00f5;
        L_0x0072:
            if (r8 == 0) goto L_0x0089;
        L_0x0074:
            r0 = r17;
            r2 = r0.mItems;	 Catch:{ RuntimeException -> 0x0173 }
            r6 = new android.support.design.internal.NavigationMenuPresenter$NavigationMenuSeparatorItem;	 Catch:{ RuntimeException -> 0x0173 }
            r0 = r17;
            r7 = r0.this$0;	 Catch:{ RuntimeException -> 0x0173 }
            r7 = android.support.design.internal.NavigationMenuPresenter.access$1100(r7);	 Catch:{ RuntimeException -> 0x0173 }
            r12 = 0;
            r6.<init>(r7, r12);	 Catch:{ RuntimeException -> 0x0173 }
            r2.add(r6);	 Catch:{ RuntimeException -> 0x0173 }
        L_0x0089:
            r0 = r17;
            r2 = r0.mItems;
            r6 = new android.support.design.internal.NavigationMenuPresenter$NavigationMenuTextItem;
            r7 = 0;
            r6.<init>(r1, r7);
            r2.add(r6);
            r6 = 0;
            r0 = r17;
            r2 = r0.mItems;
            r12 = r2.size();
            r2 = 0;
            r13 = r11.size();
            r7 = r2;
        L_0x00a5:
            if (r7 >= r13) goto L_0x019a;
        L_0x00a7:
            r2 = r11.getItem(r7);
            r2 = (android.support.v7.view.menu.MenuItemImpl) r2;
            r14 = r2.isVisible();	 Catch:{ RuntimeException -> 0x0175 }
            if (r14 == 0) goto L_0x00e1;
        L_0x00b3:
            if (r6 != 0) goto L_0x00bc;
        L_0x00b5:
            r14 = r2.getIcon();	 Catch:{ RuntimeException -> 0x0177 }
            if (r14 == 0) goto L_0x00bc;
        L_0x00bb:
            r6 = 1;
        L_0x00bc:
            r14 = r2.isCheckable();	 Catch:{ RuntimeException -> 0x0179 }
            if (r14 == 0) goto L_0x00c6;
        L_0x00c2:
            r14 = 0;
            r2.setExclusiveCheckable(r14);	 Catch:{ RuntimeException -> 0x0179 }
        L_0x00c6:
            r14 = r1.isChecked();	 Catch:{ RuntimeException -> 0x017b }
            if (r14 == 0) goto L_0x00d1;
        L_0x00cc:
            r0 = r17;
            r0.setCheckedItem(r1);	 Catch:{ RuntimeException -> 0x017b }
        L_0x00d1:
            r0 = r17;
            r14 = r0.mItems;
            r15 = new android.support.design.internal.NavigationMenuPresenter$NavigationMenuTextItem;
            r16 = 0;
            r0 = r16;
            r15.<init>(r2, r0);
            r14.add(r15);
        L_0x00e1:
            r2 = r6;
            r6 = r7 + 1;
            if (r9 == 0) goto L_0x0196;
        L_0x00e6:
            if (r2 == 0) goto L_0x00f5;
        L_0x00e8:
            r0 = r17;
            r2 = r0.mItems;	 Catch:{ RuntimeException -> 0x017d }
            r2 = r2.size();	 Catch:{ RuntimeException -> 0x017d }
            r0 = r17;
            r0.appendTransparentIconIfMissing(r12, r2);	 Catch:{ RuntimeException -> 0x017d }
        L_0x00f5:
            if (r9 == 0) goto L_0x0192;
        L_0x00f7:
            r6 = r1.getGroupId();
            if (r6 == r5) goto L_0x018f;
        L_0x00fd:
            r0 = r17;
            r2 = r0.mItems;
            r3 = r2.size();
            r2 = r1.getIcon();	 Catch:{ RuntimeException -> 0x017f }
            if (r2 == 0) goto L_0x0181;
        L_0x010b:
            r2 = 1;
        L_0x010c:
            if (r8 == 0) goto L_0x0144;
        L_0x010e:
            r3 = r3 + 1;
            r0 = r17;
            r4 = r0.mItems;	 Catch:{ RuntimeException -> 0x0183 }
            r5 = new android.support.design.internal.NavigationMenuPresenter$NavigationMenuSeparatorItem;	 Catch:{ RuntimeException -> 0x0183 }
            r0 = r17;
            r7 = r0.this$0;	 Catch:{ RuntimeException -> 0x0183 }
            r7 = android.support.design.internal.NavigationMenuPresenter.access$1100(r7);	 Catch:{ RuntimeException -> 0x0183 }
            r0 = r17;
            r11 = r0.this$0;	 Catch:{ RuntimeException -> 0x0183 }
            r11 = android.support.design.internal.NavigationMenuPresenter.access$1100(r11);	 Catch:{ RuntimeException -> 0x0183 }
            r5.<init>(r7, r11);	 Catch:{ RuntimeException -> 0x0183 }
            r4.add(r5);	 Catch:{ RuntimeException -> 0x0183 }
            if (r9 == 0) goto L_0x0144;
        L_0x012e:
            if (r2 != 0) goto L_0x0144;
        L_0x0130:
            r4 = r1.getIcon();	 Catch:{ RuntimeException -> 0x0185 }
            if (r4 == 0) goto L_0x0144;
        L_0x0136:
            r2 = 1;
            r0 = r17;
            r4 = r0.mItems;
            r4 = r4.size();
            r0 = r17;
            r0.appendTransparentIconIfMissing(r3, r4);
        L_0x0144:
            if (r2 == 0) goto L_0x0152;
        L_0x0146:
            r4 = r1.getIcon();	 Catch:{ RuntimeException -> 0x0187 }
            if (r4 != 0) goto L_0x0152;
        L_0x014c:
            r4 = 17170445; // 0x106000d float:2.461195E-38 double:8.483327E-317;
            r1.setIcon(r4);	 Catch:{ RuntimeException -> 0x0187 }
        L_0x0152:
            r0 = r17;
            r4 = r0.mItems;
            r5 = new android.support.design.internal.NavigationMenuPresenter$NavigationMenuTextItem;
            r7 = 0;
            r5.<init>(r1, r7);
            r4.add(r5);
            r1 = r2;
            r2 = r3;
            r3 = r6;
        L_0x0162:
            r4 = r8 + 1;
            if (r9 == 0) goto L_0x0189;
        L_0x0166:
            r1 = 0;
            r0 = r17;
            r0.mUpdateSuspended = r1;
            goto L_0x0008;
        L_0x016d:
            r1 = move-exception;
            throw r1;
        L_0x016f:
            r1 = move-exception;
            throw r1;
        L_0x0171:
            r1 = move-exception;
            throw r1;	 Catch:{ RuntimeException -> 0x0173 }
        L_0x0173:
            r1 = move-exception;
            throw r1;
        L_0x0175:
            r1 = move-exception;
            throw r1;	 Catch:{ RuntimeException -> 0x0177 }
        L_0x0177:
            r1 = move-exception;
            throw r1;
        L_0x0179:
            r1 = move-exception;
            throw r1;
        L_0x017b:
            r1 = move-exception;
            throw r1;
        L_0x017d:
            r1 = move-exception;
            throw r1;
        L_0x017f:
            r1 = move-exception;
            throw r1;
        L_0x0181:
            r2 = 0;
            goto L_0x010c;
        L_0x0183:
            r1 = move-exception;
            throw r1;	 Catch:{ RuntimeException -> 0x0185 }
        L_0x0185:
            r1 = move-exception;
            throw r1;
        L_0x0187:
            r1 = move-exception;
            throw r1;
        L_0x0189:
            r8 = r4;
            r5 = r3;
            r4 = r2;
            r3 = r1;
            goto L_0x0039;
        L_0x018f:
            r2 = r3;
            r3 = r4;
            goto L_0x012e;
        L_0x0192:
            r1 = r3;
            r2 = r4;
            r3 = r5;
            goto L_0x0162;
        L_0x0196:
            r7 = r6;
            r6 = r2;
            goto L_0x00a5;
        L_0x019a:
            r2 = r6;
            goto L_0x00e6;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.internal.NavigationMenuPresenter.NavigationMenuAdapter.prepareMenuItems():void");
        }

        public void setUpdateSuspended(boolean z) {
            this.mUpdateSuspended = z;
        }
    }

    interface NavigationMenuItem {
    }

    class NavigationMenuHeaderItem implements NavigationMenuItem {
        private NavigationMenuHeaderItem() {
        }

        NavigationMenuHeaderItem(1 1) {
            this();
        }
    }

    class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int mPaddingBottom;
        private final int mPaddingTop;

        public NavigationMenuSeparatorItem(int i, int i2) {
            this.mPaddingTop = i;
            this.mPaddingBottom = i2;
        }

        public int getPaddingTop() {
            return this.mPaddingTop;
        }

        public int getPaddingBottom() {
            return this.mPaddingBottom;
        }
    }

    class NavigationMenuTextItem implements NavigationMenuItem {
        private final MenuItemImpl mMenuItem;

        NavigationMenuTextItem(MenuItemImpl menuItemImpl, 1 1) {
            this(menuItemImpl);
        }

        public MenuItemImpl getMenuItem() {
            return this.mMenuItem;
        }

        private NavigationMenuTextItem(MenuItemImpl menuItemImpl) {
            this.mMenuItem = menuItemImpl;
        }
    }

    class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "\bQ\u001bw8\u0000[Eh2\u0007JEd3\bO\u000b`%";
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
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 63;
                        break;
                    case at.i /*2*/:
                        i3 = 127;
                        break;
                    case at.o /*3*/:
                        i3 = 5;
                        break;
                    default:
                        i3 = 87;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\bQ\u001bw8\u0000[Eh2\u0007JEd3\bO\u000b`%";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\bQ\u001bw8\u0000[Eh2\u0007JEi>\u001aK";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\bQ\u001bw8\u0000[Eh2\u0007JEi>\u001aK";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static int access$1100(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mPaddingSeparator;
    }

    public View inflateHeaderView(@LayoutRes int i) {
        View inflate = this.mLayoutInflater.inflate(i, this.mHeaderLayout, false);
        addHeaderView(inflate);
        return inflate;
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public NavigationMenuPresenter() {
        this.mOnClickListener = new 1(this);
    }

    static LayoutInflater access$200(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mLayoutInflater;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    static ColorStateList access$800(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mTextColor;
    }

    public void addHeaderView(@NonNull View view) {
        this.mHeaderLayout.addView(view);
        this.mMenuView.setPadding(0, 0, 0, this.mMenuView.getPaddingBottom());
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.mTextColor = colorStateList;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z) {
        if (this.mAdapter != null) {
            this.mAdapter.setUpdateSuspended(z);
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.mIconTintList = colorStateList;
        updateMenuView(false);
    }

    public boolean flagActionItems() {
        return false;
    }

    static Drawable access$900(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mItemBackground;
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.mTextAppearance = i;
        this.mTextAppearanceSet = true;
        updateMenuView(false);
    }

    static LinearLayout access$400(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mHeaderLayout;
    }

    static ColorStateList access$500(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mIconTintList;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(z[3]);
        if (sparseParcelableArray != null) {
            this.mMenuView.restoreHierarchyState(sparseParcelableArray);
        }
        Bundle bundle2 = bundle.getBundle(z[2]);
        if (bundle2 != null) {
            this.mAdapter.restoreInstanceState(bundle2);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.mItemBackground = drawable;
    }

    static MenuBuilder access$000(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mMenu;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (this.mCallback != null) {
            this.mCallback.onCloseMenu(menuBuilder, z);
        }
    }

    public int getId() {
        return this.mId;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (NavigationMenuView) this.mLayoutInflater.inflate(R.layout.design_navigation_menu, viewGroup, false);
            if (this.mAdapter == null) {
                this.mAdapter = new NavigationMenuAdapter(this);
            }
            this.mHeaderLayout = (LinearLayout) this.mLayoutInflater.inflate(R.layout.design_navigation_item_header, this.mMenuView, false);
            this.mMenuView.setAdapter(this.mAdapter);
        }
        return this.mMenuView;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        if (this.mMenuView != null) {
            SparseArray sparseArray = new SparseArray();
            this.mMenuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(z[1], sparseArray);
        }
        if (this.mAdapter != null) {
            bundle.putBundle(z[0], this.mAdapter.createInstanceState());
        }
        return bundle;
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.mLayoutInflater = LayoutInflater.from(context);
        this.mMenu = menuBuilder;
        Resources resources = context.getResources();
        this.mPaddingTopDefault = resources.getDimensionPixelOffset(R.dimen.design_navigation_padding_top_default);
        this.mPaddingSeparator = resources.getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void setId(int i) {
        this.mId = i;
    }

    static OnClickListener access$300(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mOnClickListener;
    }

    static NavigationMenuAdapter access$100(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mAdapter;
    }

    static int access$700(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mTextAppearance;
    }

    static boolean access$600(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.mTextAppearanceSet;
    }

    public void updateMenuView(boolean z) {
        if (this.mAdapter != null) {
            this.mAdapter.update();
        }
    }
}
