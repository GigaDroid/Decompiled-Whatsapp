package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.app.TaskStackBuilder.SupportParentable;
import android.support.v7.app.ActionBarDrawerToggle.DelegateProvider;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class AppCompatActivity extends FragmentActivity implements AppCompatCallback, SupportParentable, DelegateProvider {
    public static int b;
    private AppCompatDelegate mDelegate;

    public void supportNavigateUpTo(Intent intent) {
        NavUtils.navigateUpTo(this, intent);
    }

    protected void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().onPostCreate(bundle);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @CallSuper
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    public AppCompatDelegate getDelegate() {
        try {
            if (this.mDelegate == null) {
                this.mDelegate = AppCompatDelegate.create((Activity) this, (AppCompatCallback) this);
            }
            return this.mDelegate;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected void onPostResume() {
        super.onPostResume();
        getDelegate().onPostResume();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().setTitle(charSequence);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    protected void onDestroy() {
        super.onDestroy();
        getDelegate().onDestroy();
    }

    @CallSuper
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.addParentStack((Activity) this);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().requestWindowFeature(i);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    @Nullable
    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent(this);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSupportNavigateUp() {
        /*
        r2 = this;
        r0 = r2.getSupportParentActivityIntent();
        if (r0 == 0) goto L_0x002e;
    L_0x0006:
        r1 = r2.supportShouldUpRecreateTask(r0);	 Catch:{ IllegalStateException -> 0x0025 }
        if (r1 == 0) goto L_0x0020;
    L_0x000c:
        r1 = android.support.v4.app.TaskStackBuilder.create(r2);
        r2.onCreateSupportNavigateUpTaskStack(r1);
        r2.onPrepareSupportNavigateUpTaskStack(r1);
        r1.startActivities();
        android.support.v4.app.ActivityCompat.finishAffinity(r2);	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x001c:
        r1 = android.support.v7.app.ActionBar.a;	 Catch:{ IllegalStateException -> 0x002c }
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r2.supportNavigateUpTo(r0);	 Catch:{ IllegalStateException -> 0x002c }
    L_0x0023:
        r0 = 1;
    L_0x0024:
        return r0;
    L_0x0025:
        r0 = move-exception;
        throw r0;
    L_0x0027:
        r1 = move-exception;
        r2.finish();
        goto L_0x001c;
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = 0;
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatActivity.onSupportNavigateUp():boolean");
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    public void setContentView(@LayoutRes int i) {
        getDelegate().setContentView(i);
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().getMenuInflater();
    }

    @Nullable
    public ActionBar getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    protected void onCreate(@Nullable Bundle bundle) {
        getDelegate().installViewFactory();
        getDelegate().onCreate(bundle);
        super.onCreate(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().onConfigurationChanged(configuration);
    }

    protected void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Nullable
    public ActionMode onWindowStartingSupportActionMode(Callback callback) {
        return null;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getDelegate().addContentView(view, layoutParams);
    }

    public void setContentView(View view) {
        getDelegate().setContentView(view);
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return NavUtils.shouldUpRecreateTask(this, intent);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getDelegate().setContentView(view, layoutParams);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        try {
            if (super.onMenuItemSelected(i, menuItem)) {
                return true;
            }
            ActionBar supportActionBar = getSupportActionBar();
            try {
                if (menuItem.getItemId() == 16908332 && supportActionBar != null) {
                    try {
                        if ((supportActionBar.getDisplayOptions() & 4) != 0) {
                            return onSupportNavigateUp();
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                return false;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        getDelegate().setSupportActionBar(toolbar);
    }

    public ActionMode startSupportActionMode(Callback callback) {
        return getDelegate().startSupportActionMode(callback);
    }
}
