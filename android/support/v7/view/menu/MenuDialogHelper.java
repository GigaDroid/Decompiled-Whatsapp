package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.view.View;
import android.view.WindowManager.LayoutParams;

class MenuDialogHelper implements OnKeyListener, OnClickListener, OnDismissListener, Callback {
    private AlertDialog mDialog;
    private MenuBuilder mMenu;
    ListMenuPresenter mPresenter;
    private Callback mPresenterCallback;

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (z || menuBuilder == this.mMenu) {
            dismiss();
        }
        if (this.mPresenterCallback != null) {
            this.mPresenterCallback.onCloseMenu(menuBuilder, z);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKey(android.content.DialogInterface r3, int r4, android.view.KeyEvent r5) {
        /*
        r2 = this;
        r0 = 1;
        r1 = 82;
        if (r4 == r1) goto L_0x0008;
    L_0x0005:
        r1 = 4;
        if (r4 != r1) goto L_0x005f;
    L_0x0008:
        r1 = r5.getAction();
        if (r1 != 0) goto L_0x0030;
    L_0x000e:
        r1 = r5.getRepeatCount();
        if (r1 != 0) goto L_0x0030;
    L_0x0014:
        r1 = r2.mDialog;
        r1 = r1.getWindow();
        if (r1 == 0) goto L_0x002c;
    L_0x001c:
        r1 = r1.getDecorView();
        if (r1 == 0) goto L_0x002c;
    L_0x0022:
        r1 = r1.getKeyDispatcherState();
        if (r1 == 0) goto L_0x002c;
    L_0x0028:
        r1.startTracking(r5, r2);
    L_0x002b:
        return r0;
    L_0x002c:
        r1 = android.support.v7.view.menu.MenuBuilder.a;
        if (r1 == 0) goto L_0x005f;
    L_0x0030:
        r1 = r5.getAction();
        if (r1 != r0) goto L_0x005f;
    L_0x0036:
        r1 = r5.isCanceled();
        if (r1 != 0) goto L_0x005f;
    L_0x003c:
        r1 = r2.mDialog;
        r1 = r1.getWindow();
        if (r1 == 0) goto L_0x005f;
    L_0x0044:
        r1 = r1.getDecorView();
        if (r1 == 0) goto L_0x005f;
    L_0x004a:
        r1 = r1.getKeyDispatcherState();
        if (r1 == 0) goto L_0x005f;
    L_0x0050:
        r1 = r1.isTracking(r5);
        if (r1 == 0) goto L_0x005f;
    L_0x0056:
        r1 = r2.mMenu;
        r1.close(r0);
        r3.dismiss();
        goto L_0x002b;
    L_0x005f:
        r0 = r2.mMenu;
        r1 = 0;
        r0 = r0.performShortcut(r4, r5, r1);
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuDialogHelper.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
    }

    public void show(IBinder iBinder) {
        LayoutParams attributes;
        int i = MenuBuilder.a;
        MenuBuilder menuBuilder = this.mMenu;
        Builder builder = new Builder(menuBuilder.getContext());
        this.mPresenter = new ListMenuPresenter(builder.getContext(), R.layout.abc_list_menu_item_layout);
        this.mPresenter.setCallback(this);
        this.mMenu.addMenuPresenter(this.mPresenter);
        builder.setAdapter(this.mPresenter.getAdapter(), this);
        View headerView = menuBuilder.getHeaderView();
        if (headerView != null) {
            builder.setCustomTitle(headerView);
            if (i != 0) {
                AppCompatActivity.b++;
            }
            builder.setOnKeyListener(this);
            this.mDialog = builder.create();
            this.mDialog.setOnDismissListener(this);
            attributes = this.mDialog.getWindow().getAttributes();
            attributes.type = 1003;
            if (iBinder != null) {
                attributes.token = iBinder;
            }
            attributes.flags |= 131072;
            this.mDialog.show();
        }
        builder.setIcon(menuBuilder.getHeaderIcon()).setTitle(menuBuilder.getHeaderTitle());
        builder.setOnKeyListener(this);
        this.mDialog = builder.create();
        this.mDialog.setOnDismissListener(this);
        attributes = this.mDialog.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.mDialog.show();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.mPresenter.onCloseMenu(this.mMenu, true);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.mMenu.performItemAction((MenuItemImpl) this.mPresenter.getAdapter().getItem(i), 0);
    }

    public MenuDialogHelper(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    public void dismiss() {
        if (this.mDialog != null) {
            this.mDialog.dismiss();
        }
    }

    public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        return this.mPresenterCallback != null ? this.mPresenterCallback.onOpenSubMenu(menuBuilder) : false;
    }
}
