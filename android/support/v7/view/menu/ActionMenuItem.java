package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public class ActionMenuItem implements SupportMenuItem {
    private final int mCategoryOrder;
    private OnMenuItemClickListener mClickListener;
    private Context mContext;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private int mIconResId;
    private final int mId;
    private Intent mIntent;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;

    public MenuItem setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        return this;
    }

    public boolean expandActionView() {
        return false;
    }

    public MenuItem m70setShowAsActionFlags(int i) {
        return setShowAsActionFlags(i);
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        try {
            this.mFlags = (z ? 1 : 0) | (this.mFlags & -2);
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public MenuItem setIntent(Intent intent) {
        this.mIntent = intent;
        return this;
    }

    public View getActionView() {
        return null;
    }

    public ActionMenuItem(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.mIconResId = 0;
        this.mFlags = 16;
        this.mContext = context;
        this.mId = i2;
        this.mGroup = i;
        this.mCategoryOrder = i3;
        this.mOrdering = i4;
        this.mTitle = charSequence;
    }

    public boolean isVisible() {
        try {
            return (this.mFlags & 8) == 0;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public MenuItem m69setActionView(View view) {
        return setActionView(view);
    }

    public boolean collapseActionView() {
        return false;
    }

    public MenuItem setNumericShortcut(char c) {
        this.mShortcutNumericChar = c;
        return this;
    }

    public MenuItem setTitle(int i) {
        this.mTitle = this.mContext.getResources().getString(i);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        try {
            this.mFlags = (z ? 0 : 8) | (this.mFlags & 8);
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public SupportMenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setShortcut(char c, char c2) {
        this.mShortcutNumericChar = c;
        this.mShortcutAlphabeticChar = c2;
        return this;
    }

    public int getOrder() {
        return this.mOrdering;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public ActionProvider getSupportActionProvider() {
        return null;
    }

    public MenuItem setEnabled(boolean z) {
        try {
            this.mFlags = (z ? 16 : 0) | (this.mFlags & -17);
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.mShortcutAlphabeticChar = c;
        return this;
    }

    public int getItemId() {
        return this.mId;
    }

    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public MenuItem m68setActionView(int i) {
        return setActionView(i);
    }

    public int getGroupId() {
        return this.mGroup;
    }

    public void setShowAsAction(int i) {
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public MenuItem setChecked(boolean z) {
        try {
            int i;
            int i2 = this.mFlags & -3;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            this.mFlags = i | i2;
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mTitleCondensed = charSequence;
        return this;
    }

    public boolean isChecked() {
        try {
            return (this.mFlags & 2) != 0;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean isEnabled() {
        try {
            return (this.mFlags & 16) != 0;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isCheckable() {
        try {
            return (this.mFlags & 1) != 0;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public SupportMenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.mIconDrawable = drawable;
        this.mIconResId = 0;
        return this;
    }

    public SupportMenuItem setSupportOnActionExpandListener(MenuItemCompat.OnActionExpandListener onActionExpandListener) {
        return this;
    }

    public Drawable getIcon() {
        return this.mIconDrawable;
    }

    public CharSequence getTitleCondensed() {
        try {
            return this.mTitleCondensed != null ? this.mTitleCondensed : this.mTitle;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public MenuItem setIcon(int i) {
        this.mIconResId = i;
        this.mIconDrawable = ContextCompat.getDrawable(this.mContext, i);
        return this;
    }
}
