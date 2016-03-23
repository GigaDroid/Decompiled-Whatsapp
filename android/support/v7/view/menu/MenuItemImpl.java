package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.ActionProvider.VisibilityListener;
import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.support.v7.view.menu.MenuView.ItemView;
import android.support.v7.widget.TintManager;
import android.util.Log;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import org.v;
import org.whispersystems.at;

public final class MenuItemImpl implements SupportMenuItem {
    private static String sDeleteShortcutLabel;
    private static String sEnterShortcutLabel;
    private static String sPrependShortcutLabel;
    private static String sSpaceShortcutLabel;
    private static final String[] z;
    private ActionProvider mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private OnMenuItemClickListener mClickListener;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private int mIconResId;
    private final int mId;
    private Intent mIntent;
    private boolean mIsActionViewExpanded;
    private Runnable mItemCallback;
    private MenuBuilder mMenu;
    private ContextMenuInfo mMenuInfo;
    private OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private int mShowAsAction;
    private SubMenuBuilder mSubMenu;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;

    class 1 implements VisibilityListener {
        final MenuItemImpl this$0;

        1(MenuItemImpl menuItemImpl) {
            this.this$0 = menuItemImpl;
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            MenuItemImpl.access$000(this.this$0).onItemVisibleChanged(this.this$0);
        }
    }

    static {
        String[] strArr = new String[6];
        String str = "D ZIy'']\u0000i' W\u001adq(@\u0017-s.\u0014\u0006li%X\u000b-n/@\u000bcsz\u0014\u0007ji.F\u0007c`";
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
                        i3 = 7;
                        break;
                    case at.g /*1*/:
                        i3 = 65;
                        break;
                    case at.i /*2*/:
                        i3 = 52;
                        break;
                    case at.o /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "T\t{9RF\u0012k/NS\b{ RF\rc/TTm\u0014=EH\u0016k/^X\u0000w:DH\u000fk'KX\u0013{!@+aU\u0000i'\u0012|!ZX\u0000g1LD\u0015}!CX\u000fq8HUaU\u001ch',A\u001axf-X\u0017-b9W\u0002xt(B\u000b#";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "S)]\u001d-n2\u0014\u0000bsaG\u001b}w.F\u001ahcm\u0014\u001b~bay\u000bcr\b@\u000b`D.Y\u001elsoG\u000byH/u\ryn.Z+uw Z\nAn2@\u000bcb3\u001cG";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "S)]\u001d-n2\u0014\u0000bsaG\u001b}w.F\u001ahcm\u0014\u001b~bay\u000bcr\b@\u000b`D.Y\u001elsoG\u000byF\"@\u0007bi\u0011F\u0001{n%Q\u001c%.";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "S)]\u001d-n2\u0014\u0000bsaG\u001b}w.F\u001ahcm\u0014\u001b~bay\u000bcr\b@\u000b`D.Y\u001elsoS\u000byF\"@\u0007bi\u0011F\u0001{n%Q\u001c%.";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "J$Z\u001bDs$Y'`w-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean expandActionView() {
        try {
            if (!hasCollapsibleActionView()) {
                return false;
            }
            try {
                if (this.mOnActionExpandListener != null) {
                    if (!this.mOnActionExpandListener.onMenuItemActionExpand(this)) {
                        return false;
                    }
                }
                return this.mMenu.expandItemActionView(this);
            } catch (ActivityNotFoundException e) {
                throw e;
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    MenuItemImpl(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.mIconResId = 0;
        this.mFlags = 16;
        this.mShowAsAction = 0;
        this.mIsActionViewExpanded = false;
        this.mMenu = menuBuilder;
        this.mId = i2;
        this.mGroup = i;
        this.mCategoryOrder = i3;
        this.mOrdering = i4;
        this.mTitle = charSequence;
        this.mShowAsAction = i5;
    }

    public boolean shouldShowIcon() {
        return this.mMenu.getOptionalIconsVisible();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setShowAsAction(int r4) {
        /*
        r3 = this;
        r0 = r4 & 3;
        switch(r0) {
            case 0: goto L_0x0012;
            case 1: goto L_0x0012;
            case 2: goto L_0x0012;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ ActivityNotFoundException -> 0x0010 }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x0010 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0010 }
        r0.<init>(r1);	 Catch:{ ActivityNotFoundException -> 0x0010 }
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r0 = android.support.v7.view.menu.MenuBuilder.a;	 Catch:{ ActivityNotFoundException -> 0x0010 }
        if (r0 != 0) goto L_0x0005;
    L_0x0016:
        r3.mShowAsAction = r4;
        r0 = r3.mMenu;
        r0.onItemActionRequestChanged(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuItemImpl.setShowAsAction(int):void");
    }

    public View getActionView() {
        try {
            if (this.mActionView != null) {
                return this.mActionView;
            }
            try {
                if (this.mActionProvider == null) {
                    return null;
                }
                this.mActionView = this.mActionProvider.onCreateActionView(this);
                return this.mActionView;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public int getOrdering() {
        return this.mOrdering;
    }

    public MenuItem setVisible(boolean z) {
        try {
            if (setVisibleInt(z)) {
                this.mMenu.onItemVisibleChanged(this);
            }
            return this;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException(z[4]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.lang.String getShortcutLabel() {
        /*
        r4 = this;
        r0 = android.support.v7.view.menu.MenuBuilder.a;
        r1 = r4.getShortcut();
        if (r1 != 0) goto L_0x000e;
    L_0x0008:
        r0 = "";
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r2 = new java.lang.StringBuilder;
        r3 = sPrependShortcutLabel;
        r2.<init>(r3);
        switch(r1) {
            case 8: goto L_0x0027;
            case 10: goto L_0x0020;
            case 32: goto L_0x002e;
            default: goto L_0x0018;
        };
    L_0x0018:
        r2.append(r1);	 Catch:{ ActivityNotFoundException -> 0x003a }
    L_0x001b:
        r0 = r2.toString();
        goto L_0x000b;
    L_0x0020:
        r3 = sEnterShortcutLabel;	 Catch:{ ActivityNotFoundException -> 0x0036 }
        r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x0036 }
        if (r0 == 0) goto L_0x001b;
    L_0x0027:
        r3 = sDeleteShortcutLabel;	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        if (r0 == 0) goto L_0x001b;
    L_0x002e:
        r3 = sSpaceShortcutLabel;	 Catch:{ ActivityNotFoundException -> 0x003a }
        r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x003a }
        if (r0 == 0) goto L_0x001b;
    L_0x0035:
        goto L_0x0018;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuItemImpl.getShortcutLabel():java.lang.String");
    }

    public boolean showsTextAsAction() {
        try {
            return (this.mShowAsAction & 4) == 4;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public Drawable getIcon() {
        try {
            if (this.mIconDrawable != null) {
                return this.mIconDrawable;
            }
            if (this.mIconResId == 0) {
                return null;
            }
            Drawable drawable = TintManager.getDrawable(this.mMenu.getContext(), this.mIconResId);
            this.mIconResId = 0;
            this.mIconDrawable = drawable;
            return drawable;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean invoke() {
        try {
            if (this.mClickListener != null && this.mClickListener.onMenuItemClick(this)) {
                return true;
            }
            try {
                if (this.mMenu.dispatchMenuItemSelected(this.mMenu.getRootMenu(), this)) {
                    return true;
                }
                try {
                    if (this.mItemCallback != null) {
                        this.mItemCallback.run();
                        return true;
                    }
                    try {
                        if (this.mIntent != null) {
                            try {
                                this.mMenu.getContext().startActivity(this.mIntent);
                                return true;
                            } catch (Throwable e) {
                                Log.e(z[1], z[0], e);
                            }
                        }
                        try {
                            if (this.mActionProvider != null) {
                                if (this.mActionProvider.onPerformDefaultAction()) {
                                    return true;
                                }
                            }
                            return false;
                        } catch (ActivityNotFoundException e2) {
                            throw e2;
                        } catch (ActivityNotFoundException e22) {
                            throw e22;
                        }
                    } catch (IllegalArgumentException e3) {
                        throw e3;
                    }
                } catch (ActivityNotFoundException e222) {
                    throw e222;
                }
            } catch (ActivityNotFoundException e2222) {
                throw e2222;
            }
        } catch (ActivityNotFoundException e22222) {
            throw e22222;
        } catch (ActivityNotFoundException e222222) {
            throw e222222;
        }
    }

    public boolean isVisible() {
        try {
            if (this.mActionProvider != null) {
                if (this.mActionProvider.overridesItemVisibility()) {
                    try {
                        if ((this.mFlags & 8) == 0) {
                            try {
                                if (this.mActionProvider.isVisible()) {
                                    return true;
                                }
                            } catch (ActivityNotFoundException e) {
                                throw e;
                            }
                        }
                        return false;
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                }
            }
            try {
                if ((this.mFlags & 8) != 0) {
                    return false;
                }
                return true;
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        } catch (ActivityNotFoundException e2222) {
            throw e2222;
        }
    }

    public void setSubMenu(SubMenuBuilder subMenuBuilder) {
        this.mSubMenu = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException(z[3]);
    }

    CharSequence getTitleForItemView(ItemView itemView) {
        if (itemView != null) {
            try {
                if (itemView.prefersCondensedTitle()) {
                    return getTitleCondensed();
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        return getTitle();
    }

    public boolean requiresActionButton() {
        try {
            return (this.mShowAsAction & 2) == 2;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem setShortcut(char c, char c2) {
        this.mShortcutNumericChar = c;
        this.mShortcutAlphabeticChar = Character.toLowerCase(c2);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    void setCheckedInt(boolean z) {
        int i = 0;
        int i2 = this.mFlags;
        try {
            int i3 = this.mFlags & -3;
            if (z) {
                i = 2;
            }
            try {
                this.mFlags = i | i3;
                if (i2 != this.mFlags) {
                    this.mMenu.onItemsChanged(false);
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public CharSequence getTitleCondensed() {
        try {
            CharSequence charSequence = this.mTitleCondensed != null ? this.mTitleCondensed : this.mTitle;
            try {
                if (VERSION.SDK_INT < 18 && charSequence != null) {
                    try {
                        if (!(charSequence instanceof String)) {
                            charSequence = charSequence.toString();
                        }
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                }
                return charSequence;
            } catch (ActivityNotFoundException e2) {
                throw e2;
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    public SupportMenuItem setActionView(int i) {
        Context context = this.mMenu.getContext();
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public SubMenu getSubMenu() {
        return this.mSubMenu;
    }

    public MenuItem setIcon(int i) {
        this.mIconDrawable = null;
        this.mIconResId = i;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.mTitle;
    }

    public void setIsActionButton(boolean z) {
        if (z) {
            try {
                this.mFlags |= 32;
                if (MenuBuilder.a == 0) {
                    return;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        this.mFlags &= -33;
    }

    public boolean hasCollapsibleActionView() {
        try {
            if ((this.mShowAsAction & 8) == 0) {
                return false;
            }
            if (this.mActionView == null) {
                try {
                    if (this.mActionProvider != null) {
                        this.mActionView = this.mActionProvider.onCreateActionView(this);
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
            try {
                if (this.mActionView != null) {
                    return true;
                }
                return false;
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    public void setActionViewExpanded(boolean z) {
        this.mIsActionViewExpanded = z;
        this.mMenu.onItemsChanged(false);
    }

    public boolean isChecked() {
        try {
            return (this.mFlags & 2) == 2;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public ContextMenuInfo getMenuInfo() {
        return this.mMenuInfo;
    }

    public boolean hasSubMenu() {
        try {
            return this.mSubMenu != null;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean requestsActionButton() {
        try {
            return (this.mShowAsAction & 1) == 1;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem setCheckable(boolean z) {
        int i = 0;
        int i2 = this.mFlags;
        try {
            int i3 = this.mFlags & -2;
            if (z) {
                i = 1;
            }
            try {
                this.mFlags = i | i3;
                if (i2 != this.mFlags) {
                    this.mMenu.onItemsChanged(false);
                }
                return this;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException(z[5]);
    }

    boolean setVisibleInt(boolean z) {
        int i = this.mFlags;
        try {
            try {
                this.mFlags = (z ? 0 : 8) | (this.mFlags & -9);
                if (i != this.mFlags) {
                    return true;
                }
                return false;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public void setExclusiveCheckable(boolean z) {
        try {
            int i;
            int i2 = this.mFlags & -5;
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            this.mFlags = i | i2;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.MenuItem setEnabled(boolean r3) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x000c;
    L_0x0002:
        r0 = r2.mFlags;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r0 = r0 | 16;
        r2.mFlags = r0;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r0 = android.support.v7.view.menu.MenuBuilder.a;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        if (r0 == 0) goto L_0x0012;
    L_0x000c:
        r0 = r2.mFlags;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r0 = r0 & -17;
        r2.mFlags = r0;	 Catch:{ ActivityNotFoundException -> 0x0019 }
    L_0x0012:
        r0 = r2.mMenu;
        r1 = 0;
        r0.onItemsChanged(r1);
        return r2;
    L_0x0019:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuItemImpl.setEnabled(boolean):android.view.MenuItem");
    }

    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }

    public MenuItem m0setActionView(int i) {
        return setActionView(i);
    }

    public char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }

    public SupportMenuItem setSupportOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.mOnActionExpandListener = onActionExpandListener;
        return this;
    }

    public SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        try {
            if (this.mActionProvider != null) {
                this.mActionProvider.reset();
            }
            try {
                this.mActionView = null;
                this.mActionProvider = actionProvider;
                this.mMenu.onItemsChanged(true);
                if (this.mActionProvider != null) {
                    this.mActionProvider.setVisibilityListener(new 1(this));
                }
                return this;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public int getOrder() {
        return this.mCategoryOrder;
    }

    public int getGroupId() {
        return this.mGroup;
    }

    public boolean isExclusiveCheckable() {
        try {
            return (this.mFlags & 4) != 0;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mTitleCondensed = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.mTitle;
        }
        this.mMenu.onItemsChanged(false);
        return this;
    }

    static MenuBuilder access$000(MenuItemImpl menuItemImpl) {
        return menuItemImpl.mMenu;
    }

    public ActionProvider getSupportActionProvider() {
        return this.mActionProvider;
    }

    public MenuItem setIntent(Intent intent) {
        this.mIntent = intent;
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle(this.mMenu.getContext().getString(i));
    }

    public SupportMenuItem setActionView(View view) {
        try {
            this.mActionView = view;
            this.mActionProvider = null;
            if (view != null) {
                if (view.getId() == -1) {
                    try {
                        if (this.mId > 0) {
                            view.setId(this.mId);
                        }
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                }
            }
            this.mMenu.onItemActionRequestChanged(this);
            return this;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    public String toString() {
        try {
            return this.mTitle != null ? this.mTitle.toString() : null;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    char getShortcut() {
        try {
            return this.mMenu.isQwertyMode() ? this.mShortcutAlphabeticChar : this.mShortcutNumericChar;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem setTitle(CharSequence charSequence) {
        try {
            this.mTitle = charSequence;
            this.mMenu.onItemsChanged(false);
            if (this.mSubMenu != null) {
                this.mSubMenu.setHeaderTitle(charSequence);
            }
            return this;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        try {
            if (this.mShortcutAlphabeticChar != c) {
                this.mShortcutAlphabeticChar = Character.toLowerCase(c);
                this.mMenu.onItemsChanged(false);
            }
            return this;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem m2setShowAsActionFlags(int i) {
        return setShowAsActionFlags(i);
    }

    boolean shouldShowShortcut() {
        try {
            if (this.mMenu.isShortcutsVisible()) {
                if (getShortcut() != '\u0000') {
                    return true;
                }
            }
            return false;
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    public boolean isActionButton() {
        try {
            return (this.mFlags & 32) == 32;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.MenuItem setChecked(boolean r2) {
        /*
        r1 = this;
        r0 = r1.mFlags;	 Catch:{ ActivityNotFoundException -> 0x0013 }
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x000f;
    L_0x0006:
        r0 = r1.mMenu;	 Catch:{ ActivityNotFoundException -> 0x0015 }
        r0.setExclusiveItemChecked(r1);	 Catch:{ ActivityNotFoundException -> 0x0015 }
        r0 = android.support.v7.view.menu.MenuBuilder.a;	 Catch:{ ActivityNotFoundException -> 0x0015 }
        if (r0 == 0) goto L_0x0012;
    L_0x000f:
        r1.setCheckedInt(r2);	 Catch:{ ActivityNotFoundException -> 0x0015 }
    L_0x0012:
        return r1;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuItemImpl.setChecked(boolean):android.view.MenuItem");
    }

    public boolean collapseActionView() {
        try {
            if ((this.mShowAsAction & 8) == 0) {
                return false;
            }
            try {
                if (this.mActionView == null) {
                    return true;
                }
                try {
                    if (this.mOnActionExpandListener != null) {
                        if (!this.mOnActionExpandListener.onMenuItemActionCollapse(this)) {
                            return false;
                        }
                    }
                    return this.mMenu.collapseItemActionView(this);
                } catch (ActivityNotFoundException e) {
                    throw e;
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    public boolean isActionViewExpanded() {
        return this.mIsActionViewExpanded;
    }

    public boolean isEnabled() {
        try {
            return (this.mFlags & 16) != 0;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem setNumericShortcut(char c) {
        try {
            if (this.mShortcutNumericChar != c) {
                this.mShortcutNumericChar = c;
                this.mMenu.onItemsChanged(false);
            }
            return this;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.mId;
    }

    public boolean isCheckable() {
        try {
            return (this.mFlags & 1) == 1;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem m1setActionView(View view) {
        return setActionView(view);
    }

    public MenuItem setIcon(Drawable drawable) {
        this.mIconResId = 0;
        this.mIconDrawable = drawable;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    void setMenuInfo(ContextMenuInfo contextMenuInfo) {
        this.mMenuInfo = contextMenuInfo;
    }
}
