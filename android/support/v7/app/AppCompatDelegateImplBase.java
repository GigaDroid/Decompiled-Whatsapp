package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.view.menu.MenuBuilder;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

abstract class AppCompatDelegateImplBase extends AppCompatDelegate {
    private static final String z;
    ActionBar mActionBar;
    final AppCompatCallback mAppCompatCallback;
    final Callback mAppCompatWindowCallback;
    final Context mContext;
    boolean mHasActionBar;
    private boolean mIsDestroyed;
    boolean mIsFloating;
    MenuInflater mMenuInflater;
    final Callback mOriginalWindowCallback;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private CharSequence mTitle;
    final Window mWindow;
    boolean mWindowNoTitle;

    class AppCompatWindowCallbackBase extends WindowCallbackWrapper {
        final AppCompatDelegateImplBase this$0;

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            this.this$0.onPanelClosed(i, menu);
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            this.this$0.onMenuOpened(i, menu);
            return true;
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || this.this$0.onKeyShortcut(keyEvent.getKeyCode(), keyEvent);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.this$0.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder;
            if (menu instanceof MenuBuilder) {
                menuBuilder = (MenuBuilder) menu;
            } else {
                menuBuilder = null;
            }
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder == null) {
                return onPreparePanel;
            }
            menuBuilder.setOverrideVisibleItems(false);
            return onPreparePanel;
        }

        public void onContentChanged() {
        }

        AppCompatWindowCallbackBase(AppCompatDelegateImplBase appCompatDelegateImplBase, Callback callback) {
            this.this$0 = appCompatDelegateImplBase;
            super(callback);
        }
    }

    static {
        char[] toCharArray = "}v\u0007V\nQv\u0016aETg\u00045\u0004Pt\u0012t\u0001E&\u001e{\u0016Hg\u001by\u0000X&\u001ea\u0016Yj\u00115\fRr\u00185\u0011TcWB\fRb\u0018b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 60;
                    break;
                case at.g /*1*/:
                    i2 = 6;
                    break;
                case at.i /*2*/:
                    i2 = 119;
                    break;
                case at.o /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    abstract boolean dispatchKeyEvent(KeyEvent keyEvent);

    abstract void initWindowDecorActionBar();

    public final void onDestroy() {
        this.mIsDestroyed = true;
    }

    abstract boolean onKeyShortcut(int i, KeyEvent keyEvent);

    abstract boolean onMenuOpened(int i, Menu menu);

    abstract void onPanelClosed(int i, Menu menu);

    abstract void onTitleChanged(CharSequence charSequence);

    final Callback getWindowCallback() {
        return this.mWindow.getCallback();
    }

    final boolean isDestroyed() {
        return this.mIsDestroyed;
    }

    public MenuInflater getMenuInflater() {
        try {
            if (this.mMenuInflater == null) {
                initWindowDecorActionBar();
                this.mMenuInflater = new SupportMenuInflater(this.mActionBar != null ? this.mActionBar.getThemedContext() : this.mContext);
            }
            return this.mMenuInflater;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    Callback wrapWindowCallback(Callback callback) {
        return new AppCompatWindowCallbackBase(this, callback);
    }

    public final void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        onTitleChanged(charSequence);
    }

    final CharSequence getTitle() {
        try {
            if (this.mOriginalWindowCallback instanceof Activity) {
                return ((Activity) this.mOriginalWindowCallback).getTitle();
            }
            return this.mTitle;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public ActionBar getSupportActionBar() {
        initWindowDecorActionBar();
        return this.mActionBar;
    }

    AppCompatDelegateImplBase(Context context, Window window, AppCompatCallback appCompatCallback) {
        this.mContext = context;
        this.mWindow = window;
        this.mAppCompatCallback = appCompatCallback;
        this.mOriginalWindowCallback = this.mWindow.getCallback();
        if (this.mOriginalWindowCallback instanceof AppCompatWindowCallbackBase) {
            throw new IllegalStateException(z);
        }
        this.mAppCompatWindowCallback = wrapWindowCallback(this.mOriginalWindowCallback);
        this.mWindow.setCallback(this.mAppCompatWindowCallback);
    }

    final Context getActionBarThemedContext() {
        Context context = null;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            context = supportActionBar.getThemedContext();
        }
        if (context == null) {
            return this.mContext;
        }
        return context;
    }

    final ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }
}
