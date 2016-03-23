package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.v;
import org.whispersystems.at;

public class MenuBuilder implements SupportMenu {
    public static int a;
    private static final int[] sCategoryToOrder;
    private static final String[] z;
    private ArrayList mActionItems;
    private Callback mCallback;
    private final Context mContext;
    private ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private MenuItemImpl mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private ArrayList mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private ArrayList mNonActionItems;
    private boolean mOptionalIconsVisible;
    private boolean mOverrideVisibleItems;
    private CopyOnWriteArrayList mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private ArrayList mTempShortcutItemList;
    private ArrayList mVisibleItems;

    public interface Callback {
        boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem);

        void onMenuModeChange(MenuBuilder menuBuilder);
    }

    public interface ItemInvoker {
        boolean invokeItem(MenuItemImpl menuItemImpl);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem findItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        boolean z = false;
        if (findItemWithShortcutForKey != null) {
            z = performItemAction(findItemWithShortcutForKey, i2);
        }
        if ((i2 & 2) != 0) {
            try {
                close(true);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return z;
    }

    public void addMenuPresenter(MenuPresenter menuPresenter, Context context) {
        this.mPresenters.add(new WeakReference(menuPresenter));
        menuPresenter.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    public void clear() {
        try {
            if (this.mExpandedItem != null) {
                collapseItemActionView(this.mExpandedItem);
            }
            this.mItems.clear();
            onItemsChanged(true);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    private static int findInsertIndex(ArrayList arrayList, int i) {
        int i2 = a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            try {
                if (((MenuItemImpl) arrayList.get(size)).getOrdering() <= i) {
                    return size + 1;
                }
                int i3 = size - 1;
                if (i2 != 0) {
                    break;
                }
                size = i3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return 0;
    }

    protected MenuBuilder setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    private void dispatchPresenterUpdate(boolean z) {
        int i = a;
        try {
            if (!this.mPresenters.isEmpty()) {
                stopDispatchingItemsChanged();
                Iterator it = this.mPresenters.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                    if (menuPresenter == null) {
                        try {
                            this.mPresenters.remove(weakReference);
                            if (i == 0) {
                                continue;
                                if (i != 0) {
                                    break;
                                }
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    menuPresenter.updateMenuView(z);
                    continue;
                    if (i != 0) {
                        break;
                    }
                }
                startDispatchingItemsChanged();
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void startDispatchingItemsChanged() {
        try {
            this.mPreventDispatchingItemsChanged = false;
            if (this.mItemsChangedWhileDispatchPrevented) {
                this.mItemsChangedWhileDispatchPrevented = false;
                onItemsChanged(true);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void removeGroup(int i) {
        int i2 = 0;
        int i3 = a;
        int findGroupIndex = findGroupIndex(i);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size() - findGroupIndex;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size) {
                    break;
                }
                try {
                    if (((MenuItemImpl) this.mItems.get(findGroupIndex)).getGroupId() != i) {
                        break;
                    }
                    removeItemAtInt(findGroupIndex, false);
                    if (i3 != 0) {
                        break;
                    }
                    i2 = i4;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            onItemsChanged(true);
        }
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void stopDispatchingItemsChanged() {
        try {
            if (!this.mPreventDispatchingItemsChanged) {
                this.mPreventDispatchingItemsChanged = true;
                this.mItemsChangedWhileDispatchPrevented = false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public void close() {
        close(true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int i2 = a;
        int size = this.mItems.size();
        int i3 = 0;
        while (i3 < size) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.mItems.get(i3);
            try {
                if (menuItemImpl.getGroupId() == i) {
                    menuItemImpl.setExclusiveCheckable(z2);
                    menuItemImpl.setCheckable(z);
                }
                int i4 = i3 + 1;
                if (i2 == 0) {
                    i3 = i4;
                } else {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void findItemsWithShortcutForKey(java.util.List r12, int r13, android.view.KeyEvent r14) {
        /*
        r11 = this;
        r10 = 67;
        r0 = 0;
        r3 = a;
        r4 = r11.isQwertyMode();
        r5 = r14.getMetaState();
        r6 = new android.view.KeyCharacterMap$KeyData;
        r6.<init>();
        r1 = r14.getKeyData(r6);
        if (r1 != 0) goto L_0x001b;
    L_0x0018:
        if (r13 == r10) goto L_0x001b;
    L_0x001a:
        return;
    L_0x001b:
        r1 = r11.mItems;
        r7 = r1.size();
        r2 = r0;
    L_0x0022:
        if (r2 >= r7) goto L_0x001a;
    L_0x0024:
        r0 = r11.mItems;
        r0 = r0.get(r2);
        r0 = (android.support.v7.view.menu.MenuItemImpl) r0;
        r1 = r0.hasSubMenu();	 Catch:{ IllegalArgumentException -> 0x006c }
        if (r1 == 0) goto L_0x003b;
    L_0x0032:
        r1 = r0.getSubMenu();	 Catch:{ IllegalArgumentException -> 0x006c }
        r1 = (android.support.v7.view.menu.MenuBuilder) r1;	 Catch:{ IllegalArgumentException -> 0x006c }
        r1.findItemsWithShortcutForKey(r12, r13, r14);	 Catch:{ IllegalArgumentException -> 0x006c }
    L_0x003b:
        if (r4 == 0) goto L_0x0070;
    L_0x003d:
        r1 = r0.getAlphabeticShortcut();	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x0041:
        r8 = r5 & 5;
        if (r8 != 0) goto L_0x0066;
    L_0x0045:
        if (r1 == 0) goto L_0x0066;
    L_0x0047:
        r8 = r6.meta;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r9 = 0;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r1 == r8) goto L_0x005d;
    L_0x004e:
        r8 = r6.meta;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r9 = 2;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r1 == r8) goto L_0x005d;
    L_0x0055:
        if (r4 == 0) goto L_0x0066;
    L_0x0057:
        r8 = 8;
        if (r1 != r8) goto L_0x0066;
    L_0x005b:
        if (r13 != r10) goto L_0x0066;
    L_0x005d:
        r1 = r0.isEnabled();	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r1 == 0) goto L_0x0066;
    L_0x0063:
        r12.add(r0);	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x0066:
        r0 = r2 + 1;
        if (r3 != 0) goto L_0x001a;
    L_0x006a:
        r2 = r0;
        goto L_0x0022;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r0 = move-exception;
        throw r0;
    L_0x0070:
        r1 = r0.getNumericShortcut();
        goto L_0x0041;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuBuilder.findItemsWithShortcutForKey(java.util.List, int, android.view.KeyEvent):void");
    }

    public ArrayList getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    private MenuItemImpl createNewMenuItem(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new MenuItemImpl(this, i, i2, i3, i4, charSequence, i5);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i, i2, i3, charSequence);
        SubMenu subMenuBuilder = new SubMenuBuilder(this.mContext, this, menuItemImpl);
        menuItemImpl.setSubMenu(subMenuBuilder);
        return subMenuBuilder;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    static {
        String[] strArr = new String[6];
        String str = "xr{\u0011\u001bpx%\u000e\u0011wi%\u0002\u0017mup\r\u0002pyh\u0010\u0000xhz\u0010";
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
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = 31;
                        break;
                    case at.o /*3*/:
                        i3 = 99;
                        break;
                    default:
                        i3 = 116;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "xr{\u0011\u001bpx%\u000e\u0011wi%\u0013\u0006|oz\r\u0000|nl";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "xr{\u0011\u001bpx%\u000e\u0011wi%\u0006\fi}q\u0007\u0011}}|\u0017\u001dvri\n\u0011n";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "xr{\u0011\u001bpx%\u000e\u0011wi%\u0013\u0006|oz\r\u0000|nl";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "xr{\u0011\u001bpx%\u000e\u0011wi%\u0006\fi}q\u0007\u0011}}|\u0017\u001dvri\n\u0011n";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sCategoryToOrder = new int[]{1, 4, 5, 3, 2, 0};
                    return;
                default:
                    strArr2[i] = str;
                    str = "vn{\u0006\u00069xp\u0006\u00079rp\u0017Tzsq\u0017\u0015pr?\u0002To}s\n\u00109\u007f~\u0017\u0011~sm\u001aZ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    Resources getResources() {
        return this.mResources;
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        int i = a;
        try {
            if (!this.mPresenters.isEmpty()) {
                SparseArray sparseArray = new SparseArray();
                Iterator it = this.mPresenters.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                    if (menuPresenter == null) {
                        try {
                            this.mPresenters.remove(weakReference);
                            if (i == 0) {
                                continue;
                                if (i != 0) {
                                    break;
                                }
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    int id = menuPresenter.getId();
                    if (id > 0) {
                        Parcelable onSaveInstanceState = menuPresenter.onSaveInstanceState();
                        if (onSaveInstanceState != null) {
                            try {
                                sparseArray.put(id, onSaveInstanceState);
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                    if (i != 0) {
                        break;
                    }
                }
                bundle.putSparseParcelableArray(z[2], sparseArray);
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    public void addMenuPresenter(MenuPresenter menuPresenter) {
        addMenuPresenter(menuPresenter, this.mContext);
    }

    private static int getOrdering(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            try {
                if (i2 < sCategoryToOrder.length) {
                    return (sCategoryToOrder[i2] << 16) | (65535 & i);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException(z[1]);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int size;
        int i5 = a;
        PackageManager packageManager = this.mContext.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            try {
                size = queryIntentActivityOptions.size();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        size = 0;
        if ((i4 & 1) == 0) {
            try {
                removeGroup(i);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        int i6 = 0;
        while (i6 < size) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i6);
            try {
                Intent intent2;
                if (resolveInfo.specificIndex < 0) {
                    intent2 = intent;
                } else {
                    intent2 = intentArr[resolveInfo.specificIndex];
                }
                Intent intent3 = new Intent(intent2);
                intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
                MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
                if (menuItemArr != null) {
                    try {
                        if (resolveInfo.specificIndex >= 0) {
                            menuItemArr[resolveInfo.specificIndex] = intent4;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                int i7 = i6 + 1;
                if (i5 != 0) {
                    break;
                }
                i6 = i7;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
        return size;
    }

    protected MenuBuilder setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    public MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    public void restoreActionViewStates(Bundle bundle) {
        int i = a;
        if (bundle != null) {
            MenuItem item;
            int i2;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
            int size = size();
            int i3 = 0;
            while (i3 < size) {
                item = getItem(i3);
                View actionView = MenuItemCompat.getActionView(item);
                if (actionView != null) {
                    try {
                        if (actionView.getId() != -1) {
                            actionView.restoreHierarchyState(sparseParcelableArray);
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                if (item.hasSubMenu()) {
                    ((SubMenuBuilder) item.getSubMenu()).restoreActionViewStates(bundle);
                }
                i2 = i3 + 1;
                if (i != 0) {
                    break;
                }
                i3 = i2;
            }
            i2 = bundle.getInt(z[5]);
            if (i2 > 0) {
                item = findItem(i2);
                if (item != null) {
                    try {
                        MenuItemCompat.expandActionView(item);
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
        }
    }

    public MenuBuilder getRootMenu() {
        return this;
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    private void removeItemAtInt(int i, boolean z) {
        if (i >= 0) {
            try {
                if (i < this.mItems.size()) {
                    try {
                        this.mItems.remove(i);
                        if (z) {
                            onItemsChanged(true);
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public MenuItemImpl getExpandedItem() {
        return this.mExpandedItem;
    }

    public int size() {
        return this.mItems.size();
    }

    public ArrayList getVisibleItems() {
        int i = a;
        try {
            if (!this.mIsVisibleItemsStale) {
                return this.mVisibleItems;
            }
            this.mVisibleItems.clear();
            int size = this.mItems.size();
            int i2 = 0;
            while (i2 < size) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) this.mItems.get(i2);
                try {
                    if (menuItemImpl.isVisible()) {
                        this.mVisibleItems.add(menuItemImpl);
                    }
                    int i3 = i2 + 1;
                    if (i != 0) {
                        break;
                    }
                    i2 = i3;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            this.mIsVisibleItemsStale = false;
            this.mIsActionItemsStale = true;
            return this.mVisibleItems;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void onItemsChanged(boolean z) {
        try {
            if (!this.mPreventDispatchingItemsChanged) {
                if (z) {
                    this.mIsVisibleItemsStale = true;
                    this.mIsActionItemsStale = true;
                }
                try {
                    dispatchPresenterUpdate(z);
                    if (a == 0) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            this.mItemsChangedWhileDispatchPrevented = true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public int findGroupIndex(int i, int i2) {
        int i3 = a;
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = i2;
        while (i4 < size) {
            try {
                if (((MenuItemImpl) this.mItems.get(i4)).getGroupId() != i) {
                    i4++;
                    if (i3 != 0) {
                        break;
                    }
                }
                return i4;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return -1;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    public void setGroupVisible(int i, boolean z) {
        Object obj;
        int i2 = a;
        int size = this.mItems.size();
        int i3 = 0;
        Object obj2 = null;
        while (i3 < size) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.mItems.get(i3);
            try {
                if (menuItemImpl.getGroupId() == i && menuItemImpl.setVisibleInt(z)) {
                    obj = 1;
                } else {
                    obj = obj2;
                }
                int i4 = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = i4;
                obj2 = obj;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        obj = obj2;
        if (obj != null) {
            try {
                onItemsChanged(true);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public void setGroupEnabled(int i, boolean z) {
        int i2 = a;
        int size = this.mItems.size();
        int i3 = 0;
        while (i3 < size) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.mItems.get(i3);
            try {
                if (menuItemImpl.getGroupId() == i) {
                    menuItemImpl.setEnabled(z);
                }
                int i4 = i3 + 1;
                if (i2 == 0) {
                    i3 = i4;
                } else {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    void setExclusiveItemChecked(MenuItem menuItem) {
        int i = a;
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        int i2 = 0;
        while (i2 < size) {
            MenuItem menuItem2 = (MenuItemImpl) this.mItems.get(i2);
            try {
                if (menuItem2.getGroupId() == groupId) {
                    if (menuItem2.isExclusiveCheckable()) {
                        try {
                            if (menuItem2.isCheckable()) {
                                boolean z;
                                if (menuItem2 == menuItem) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                menuItem2.setCheckedInt(z);
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                }
                int i3 = i2 + 1;
                if (i == 0) {
                    i2 = i3;
                } else {
                    return;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setHeaderInternal(int r5, java.lang.CharSequence r6, int r7, android.graphics.drawable.Drawable r8, android.view.View r9) {
        /*
        r4 = this;
        r3 = 0;
        r0 = a;
        r1 = r4.getResources();
        if (r9 == 0) goto L_0x0013;
    L_0x0009:
        r4.mHeaderView = r9;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = 0;
        r4.mHeaderTitle = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = 0;
        r4.mHeaderIcon = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        if (r0 == 0) goto L_0x0035;
    L_0x0013:
        if (r5 <= 0) goto L_0x001d;
    L_0x0015:
        r1 = r1.getText(r5);	 Catch:{ IllegalArgumentException -> 0x003e }
        r4.mHeaderTitle = r1;	 Catch:{ IllegalArgumentException -> 0x003e }
        if (r0 == 0) goto L_0x0021;
    L_0x001d:
        if (r6 == 0) goto L_0x0021;
    L_0x001f:
        r4.mHeaderTitle = r6;	 Catch:{ IllegalArgumentException -> 0x0040 }
    L_0x0021:
        if (r7 <= 0) goto L_0x002f;
    L_0x0023:
        r1 = r4.getContext();	 Catch:{ IllegalArgumentException -> 0x0042 }
        r1 = android.support.v4.content.ContextCompat.getDrawable(r1, r7);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4.mHeaderIcon = r1;	 Catch:{ IllegalArgumentException -> 0x0042 }
        if (r0 == 0) goto L_0x0033;
    L_0x002f:
        if (r8 == 0) goto L_0x0033;
    L_0x0031:
        r4.mHeaderIcon = r8;	 Catch:{ IllegalArgumentException -> 0x0044 }
    L_0x0033:
        r4.mHeaderView = r3;
    L_0x0035:
        r0 = 0;
        r4.onItemsChanged(r0);
        return;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuBuilder.setHeaderInternal(int, java.lang.CharSequence, int, android.graphics.drawable.Drawable, android.view.View):void");
    }

    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setShortcutsVisibleInner(boolean r4) {
        /*
        r3 = this;
        r0 = 1;
        if (r4 == 0) goto L_0x001e;
    L_0x0003:
        r1 = r3.mResources;	 Catch:{ IllegalArgumentException -> 0x001a }
        r1 = r1.getConfiguration();	 Catch:{ IllegalArgumentException -> 0x001a }
        r1 = r1.keyboard;	 Catch:{ IllegalArgumentException -> 0x001a }
        if (r1 == r0) goto L_0x001e;
    L_0x000d:
        r1 = r3.mResources;	 Catch:{ IllegalArgumentException -> 0x001c }
        r2 = android.support.v7.appcompat.R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent;	 Catch:{ IllegalArgumentException -> 0x001c }
        r1 = r1.getBoolean(r2);	 Catch:{ IllegalArgumentException -> 0x001c }
        if (r1 == 0) goto L_0x001e;
    L_0x0017:
        r3.mShortcutsVisible = r0;
        return;
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r0 = 0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuBuilder.setShortcutsVisibleInner(boolean):void");
    }

    public boolean hasVisibleItems() {
        int i = a;
        try {
            if (this.mOverrideVisibleItems) {
                return true;
            }
            int size = size();
            int i2 = 0;
            while (i2 < size) {
                try {
                    if (((MenuItemImpl) this.mItems.get(i2)).isVisible()) {
                        return true;
                    }
                    int i3 = i2 + 1;
                    if (i != 0) {
                        break;
                    }
                    i2 = i3;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return false;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public ArrayList getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean dispatchSubMenuSelected(android.support.v7.view.menu.SubMenuBuilder r7, android.support.v7.view.menu.MenuPresenter r8) {
        /*
        r6 = this;
        r0 = 0;
        r3 = a;
        r1 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x000c }
        r1 = r1.isEmpty();	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r1 == 0) goto L_0x000e;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        if (r8 == 0) goto L_0x0014;
    L_0x0010:
        r0 = r8.onSubMenuSelected(r7);
    L_0x0014:
        r1 = r6.mPresenters;
        r4 = r1.iterator();
        r2 = r0;
    L_0x001b:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0045;
    L_0x0021:
        r0 = r4.next();
        r0 = (java.lang.ref.WeakReference) r0;
        r1 = r0.get();
        r1 = (android.support.v7.view.menu.MenuPresenter) r1;
        if (r1 != 0) goto L_0x0036;
    L_0x002f:
        r5 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x0041 }
        r5.remove(r0);	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r3 == 0) goto L_0x0043;
    L_0x0036:
        if (r2 != 0) goto L_0x0043;
    L_0x0038:
        r2 = r1.onSubMenuSelected(r7);
        r0 = r2;
    L_0x003d:
        if (r3 != 0) goto L_0x000b;
    L_0x003f:
        r2 = r0;
        goto L_0x001b;
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = r2;
        goto L_0x003d;
    L_0x0045:
        r0 = r2;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuBuilder.dispatchSubMenuSelected(android.support.v7.view.menu.SubMenuBuilder, android.support.v7.view.menu.MenuPresenter):boolean");
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    boolean dispatchMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        try {
            if (this.mCallback != null) {
                if (this.mCallback.onMenuItemSelected(menuBuilder, menuItem)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int findItemIndex(int i) {
        int i2 = a;
        int size = size();
        int i3 = 0;
        while (i3 < size) {
            try {
                if (((MenuItemImpl) this.mItems.get(i3)).getItemId() != i) {
                    i3++;
                    if (i2 != 0) {
                        break;
                    }
                }
                return i3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return -1;
    }

    boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    public final void close(boolean z) {
        int i = a;
        try {
            if (!this.mIsClosing) {
                this.mIsClosing = true;
                Iterator it = this.mPresenters.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                    if (menuPresenter == null) {
                        try {
                            this.mPresenters.remove(weakReference);
                            if (i == 0) {
                                continue;
                                if (i != 0) {
                                    break;
                                }
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    menuPresenter.onCloseMenu(this, z);
                    continue;
                    if (i != 0) {
                        break;
                    }
                }
                this.mIsClosing = false;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i));
    }

    public void removeItem(int i) {
        removeItemAtInt(findItemIndex(i), true);
    }

    public MenuBuilder setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void removeMenuPresenter(MenuPresenter menuPresenter) {
        int i = a;
        Iterator it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                try {
                    this.mPresenters.remove(weakReference);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            if (i != 0) {
                return;
            }
        }
    }

    MenuItemImpl findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        int i2 = a;
        ArrayList arrayList = this.mTempShortcutItemList;
        try {
            arrayList.clear();
            findItemsWithShortcutForKey(arrayList, i, keyEvent);
            if (arrayList.isEmpty()) {
                return null;
            }
            int metaState = keyEvent.getMetaState();
            KeyData keyData = new KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                try {
                    return (MenuItemImpl) arrayList.get(0);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            boolean isQwertyMode = isQwertyMode();
            int i3 = 0;
            while (i3 < size) {
                char alphabeticShortcut;
                MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i3);
                if (isQwertyMode) {
                    try {
                        alphabeticShortcut = menuItemImpl.getAlphabeticShortcut();
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                alphabeticShortcut = menuItemImpl.getNumericShortcut();
                try {
                    if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                        return menuItemImpl;
                    }
                    try {
                        if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                            return menuItemImpl;
                        }
                        if (isQwertyMode && alphabeticShortcut == '\b' && i == 67) {
                            return menuItemImpl;
                        }
                        int i4 = i3 + 1;
                        if (i2 != 0) {
                            break;
                        }
                        i3 = i4;
                    } catch (IllegalArgumentException e22) {
                        try {
                            throw e22;
                        } catch (IllegalArgumentException e222) {
                            try {
                                throw e222;
                            } catch (IllegalArgumentException e2222) {
                                try {
                                    throw e2222;
                                } catch (IllegalArgumentException e22222) {
                                    try {
                                        throw e22222;
                                    } catch (IllegalArgumentException e222222) {
                                        throw e222222;
                                    }
                                }
                            }
                        }
                    }
                } catch (IllegalArgumentException e2222222) {
                    throw e2222222;
                } catch (IllegalArgumentException e22222222) {
                    throw e22222222;
                }
            }
            return null;
        } catch (IllegalArgumentException e222222222) {
            throw e222222222;
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        try {
            return findItemWithShortcutForKey(i, keyEvent) != null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    void onItemActionRequestChanged(MenuItemImpl menuItemImpl) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void changeMenuMode() {
        try {
            if (this.mCallback != null) {
                this.mCallback.onMenuModeChange(this);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public MenuItem findItem(int i) {
        int i2 = a;
        int size = size();
        int i3 = 0;
        while (i3 < size) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.mItems.get(i3);
            try {
                if (menuItemImpl.getItemId() == i) {
                    return menuItemImpl;
                }
                if (menuItemImpl.hasSubMenu()) {
                    MenuItem findItem = menuItemImpl.getSubMenu().findItem(i);
                    if (findItem != null) {
                        return findItem;
                    }
                }
                int i4 = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = i4;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return null;
    }

    protected MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int ordering = getOrdering(i3);
        MenuItem createNewMenuItem = createNewMenuItem(i, i2, i3, ordering, charSequence, this.mDefaultShowAsAction);
        try {
            if (this.mCurrentMenuInfo != null) {
                createNewMenuItem.setMenuInfo(this.mCurrentMenuInfo);
            }
            this.mItems.add(findInsertIndex(this.mItems, ordering), createNewMenuItem);
            onItemsChanged(true);
            return createNewMenuItem;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean performItemAction(MenuItem menuItem, MenuPresenter menuPresenter, int i) {
        Object obj = null;
        int i2 = a;
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl != null) {
            try {
                if (menuItemImpl.isEnabled()) {
                    boolean expandActionView;
                    boolean invoke = menuItemImpl.invoke();
                    ActionProvider supportActionProvider = menuItemImpl.getSupportActionProvider();
                    if (supportActionProvider != null) {
                        try {
                            if (supportActionProvider.hasSubMenu()) {
                                obj = 1;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    if (menuItemImpl.hasCollapsibleActionView()) {
                        expandActionView = menuItemImpl.expandActionView() | invoke;
                        if (!expandActionView) {
                            return expandActionView;
                        }
                        try {
                            close(true);
                            if (i2 == 0) {
                                return expandActionView;
                            }
                            invoke = expandActionView;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        } catch (IllegalArgumentException e22) {
                            try {
                                throw e22;
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            }
                        }
                    }
                    if (menuItemImpl.hasSubMenu() || obj != null) {
                        try {
                            close(false);
                            if (!menuItemImpl.hasSubMenu()) {
                                menuItemImpl.setSubMenu(new SubMenuBuilder(getContext(), this, menuItemImpl));
                            }
                            SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItemImpl.getSubMenu();
                            if (obj != null) {
                                try {
                                    supportActionProvider.onPrepareSubMenu(subMenuBuilder);
                                } catch (IllegalArgumentException e2222) {
                                    throw e2222;
                                }
                            }
                            expandActionView = dispatchSubMenuSelected(subMenuBuilder, menuPresenter) | invoke;
                            if (!expandActionView) {
                                try {
                                    close(true);
                                } catch (IllegalArgumentException e22222) {
                                    throw e22222;
                                }
                            }
                            if (i2 == 0) {
                                return expandActionView;
                            }
                        } catch (IllegalArgumentException e222222) {
                            throw e222222;
                        }
                    }
                    expandActionView = invoke;
                    if ((i & 1) != 0) {
                        return expandActionView;
                    }
                    try {
                        close(true);
                        return expandActionView;
                    } catch (IllegalArgumentException e2222222) {
                        throw e2222222;
                    }
                }
            } catch (IllegalArgumentException e22222222) {
                throw e22222222;
            }
        }
        return false;
    }

    public void saveActionViewStates(Bundle bundle) {
        SparseArray sparseArray;
        int i = a;
        int size = size();
        int i2 = 0;
        SparseArray sparseArray2 = null;
        while (i2 < size) {
            int i3;
            MenuItem item = getItem(i2);
            View actionView = MenuItemCompat.getActionView(item);
            if (actionView != null) {
                try {
                    if (actionView.getId() != -1) {
                        if (sparseArray2 == null) {
                            sparseArray2 = new SparseArray();
                        }
                        try {
                            actionView.saveHierarchyState(sparseArray2);
                            if (MenuItemCompat.isActionViewExpanded(item)) {
                                bundle.putInt(z[3], item.getItemId());
                                sparseArray = sparseArray2;
                                if (item.hasSubMenu()) {
                                    ((SubMenuBuilder) item.getSubMenu()).saveActionViewStates(bundle);
                                }
                                i3 = i2 + 1;
                                if (i != 0) {
                                    break;
                                }
                                i2 = i3;
                                sparseArray2 = sparseArray;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            sparseArray = sparseArray2;
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).saveActionViewStates(bundle);
            }
            i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
            sparseArray2 = sparseArray;
        }
        sparseArray = sparseArray2;
        if (sparseArray != null) {
            try {
                bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    void onItemVisibleChanged(MenuItemImpl menuItemImpl) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public MenuBuilder(Context context) {
        int i = a;
        this.mDefaultShowAsAction = 0;
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mOptionalIconsVisible = false;
        this.mIsClosing = false;
        this.mTempShortcutItemList = new ArrayList();
        this.mPresenters = new CopyOnWriteArrayList();
        this.mContext = context;
        this.mResources = context.getResources();
        this.mItems = new ArrayList();
        this.mVisibleItems = new ArrayList();
        this.mIsVisibleItemsStale = true;
        this.mActionItems = new ArrayList();
        this.mNonActionItems = new ArrayList();
        this.mIsActionItemsStale = true;
        setShortcutsVisibleInner(true);
        if (AppCompatActivity.b != 0) {
            a = i + 1;
        }
    }

    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        int i = a;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(z[4]);
        if (sparseParcelableArray != null) {
            try {
                if (!this.mPresenters.isEmpty()) {
                    Iterator it = this.mPresenters.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                        if (menuPresenter == null) {
                            try {
                                this.mPresenters.remove(weakReference);
                                if (i == 0) {
                                    continue;
                                    if (i != 0) {
                                        return;
                                    }
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        int id = menuPresenter.getId();
                        if (id > 0) {
                            Parcelable parcelable = (Parcelable) sparseParcelableArray.get(id);
                            if (parcelable != null) {
                                try {
                                    menuPresenter.onRestoreInstanceState(parcelable);
                                } catch (IllegalArgumentException e2) {
                                    throw e2;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        if (i != 0) {
                            return;
                        }
                    }
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    protected String getActionViewStatesKey() {
        return z[0];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean collapseItemActionView(android.support.v7.view.menu.MenuItemImpl r7) {
        /*
        r6 = this;
        r0 = 0;
        r3 = a;
        r1 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x0010 }
        r1 = r1.isEmpty();	 Catch:{ IllegalArgumentException -> 0x0010 }
        if (r1 != 0) goto L_0x000f;
    L_0x000b:
        r1 = r6.mExpandedItem;	 Catch:{ IllegalArgumentException -> 0x0012 }
        if (r1 == r7) goto L_0x0014;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0012 }
    L_0x0012:
        r0 = move-exception;
        throw r0;
    L_0x0014:
        r6.stopDispatchingItemsChanged();
        r1 = r6.mPresenters;
        r4 = r1.iterator();
        r2 = r0;
    L_0x001e:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0054;
    L_0x0024:
        r0 = r4.next();
        r0 = (java.lang.ref.WeakReference) r0;
        r1 = r0.get();
        r1 = (android.support.v7.view.menu.MenuPresenter) r1;
        if (r1 != 0) goto L_0x0039;
    L_0x0032:
        r5 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x004e }
        r5.remove(r0);	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r3 == 0) goto L_0x0052;
    L_0x0039:
        r0 = r1.collapseItemActionView(r6, r7);
        if (r0 == 0) goto L_0x0041;
    L_0x003f:
        if (r3 == 0) goto L_0x0043;
    L_0x0041:
        if (r3 == 0) goto L_0x0050;
    L_0x0043:
        r6.startDispatchingItemsChanged();	 Catch:{ IllegalArgumentException -> 0x004c }
        if (r0 == 0) goto L_0x000f;
    L_0x0048:
        r1 = 0;
        r6.mExpandedItem = r1;	 Catch:{ IllegalArgumentException -> 0x004c }
        goto L_0x000f;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r2 = r0;
        goto L_0x001e;
    L_0x0052:
        r0 = r2;
        goto L_0x0041;
    L_0x0054:
        r0 = r2;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuBuilder.collapseItemActionView(android.support.v7.view.menu.MenuItemImpl):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void flagActionItems() {
        /*
        r8 = this;
        r3 = 0;
        r4 = a;
        r5 = r8.getVisibleItems();
        r0 = r8.mIsActionItemsStale;	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r0 != 0) goto L_0x000e;
    L_0x000b:
        return;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = r8.mPresenters;
        r6 = r0.iterator();
        r2 = r3;
    L_0x0015:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0089;
    L_0x001b:
        r0 = r6.next();
        r0 = (java.lang.ref.WeakReference) r0;
        r1 = r0.get();
        r1 = (android.support.v7.view.menu.MenuPresenter) r1;
        if (r1 != 0) goto L_0x0030;
    L_0x0029:
        r7 = r8.mPresenters;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r7.remove(r0);	 Catch:{ IllegalArgumentException -> 0x0069 }
        if (r4 == 0) goto L_0x0087;
    L_0x0030:
        r0 = r1.flagActionItems();
        r0 = r0 | r2;
    L_0x0035:
        if (r4 == 0) goto L_0x0085;
    L_0x0037:
        if (r0 == 0) goto L_0x006f;
    L_0x0039:
        r0 = r8.mActionItems;
        r0.clear();
        r0 = r8.mNonActionItems;
        r0.clear();
        r2 = r5.size();
        r1 = r3;
    L_0x0048:
        if (r1 >= r2) goto L_0x0066;
    L_0x004a:
        r0 = r5.get(r1);
        r0 = (android.support.v7.view.menu.MenuItemImpl) r0;
        r6 = r0.isActionButton();	 Catch:{ IllegalArgumentException -> 0x006b }
        if (r6 == 0) goto L_0x005d;
    L_0x0056:
        r6 = r8.mActionItems;	 Catch:{ IllegalArgumentException -> 0x006d }
        r6.add(r0);	 Catch:{ IllegalArgumentException -> 0x006d }
        if (r4 == 0) goto L_0x0062;
    L_0x005d:
        r6 = r8.mNonActionItems;	 Catch:{ IllegalArgumentException -> 0x006d }
        r6.add(r0);	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x0062:
        r0 = r1 + 1;
        if (r4 == 0) goto L_0x0083;
    L_0x0066:
        r8.mIsActionItemsStale = r3;
        goto L_0x000b;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r0 = r8.mActionItems;
        r0.clear();
        r0 = r8.mNonActionItems;
        r0.clear();
        r0 = r8.mNonActionItems;
        r1 = r8.getVisibleItems();
        r0.addAll(r1);
        goto L_0x0066;
    L_0x0083:
        r1 = r0;
        goto L_0x0048;
    L_0x0085:
        r2 = r0;
        goto L_0x0015;
    L_0x0087:
        r0 = r2;
        goto L_0x0035;
    L_0x0089:
        r0 = r2;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuBuilder.flagActionItems():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean expandItemActionView(android.support.v7.view.menu.MenuItemImpl r7) {
        /*
        r6 = this;
        r0 = 0;
        r3 = a;
        r1 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x000c }
        r1 = r1.isEmpty();	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r1 == 0) goto L_0x000e;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r6.stopDispatchingItemsChanged();
        r1 = r6.mPresenters;
        r4 = r1.iterator();
        r2 = r0;
    L_0x0018:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x004d;
    L_0x001e:
        r0 = r4.next();
        r0 = (java.lang.ref.WeakReference) r0;
        r1 = r0.get();
        r1 = (android.support.v7.view.menu.MenuPresenter) r1;
        if (r1 != 0) goto L_0x0033;
    L_0x002c:
        r5 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.remove(r0);	 Catch:{ IllegalArgumentException -> 0x0047 }
        if (r3 == 0) goto L_0x004b;
    L_0x0033:
        r0 = r1.expandItemActionView(r6, r7);
        if (r0 == 0) goto L_0x003b;
    L_0x0039:
        if (r3 == 0) goto L_0x003d;
    L_0x003b:
        if (r3 == 0) goto L_0x0049;
    L_0x003d:
        r6.startDispatchingItemsChanged();	 Catch:{ IllegalArgumentException -> 0x0045 }
        if (r0 == 0) goto L_0x000b;
    L_0x0042:
        r6.mExpandedItem = r7;	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x000b;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r2 = r0;
        goto L_0x0018;
    L_0x004b:
        r0 = r2;
        goto L_0x003b;
    L_0x004d:
        r0 = r2;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuBuilder.expandItemActionView(android.support.v7.view.menu.MenuItemImpl):boolean");
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.mItems.get(i);
    }

    protected MenuBuilder setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }
}
