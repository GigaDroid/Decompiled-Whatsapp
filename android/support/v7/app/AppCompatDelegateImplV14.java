package android.support.v7.app;

import android.content.Context;
import android.support.v7.view.SupportActionModeWrapper.CallbackWrapper;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

class AppCompatDelegateImplV14 extends AppCompatDelegateImplV11 {
    private boolean mHandleNativeActionModes;

    class AppCompatWindowCallbackV14 extends AppCompatWindowCallbackBase {
        final AppCompatDelegateImplV14 this$0;

        AppCompatWindowCallbackV14(AppCompatDelegateImplV14 appCompatDelegateImplV14, Callback callback) {
            this.this$0 = appCompatDelegateImplV14;
            super(appCompatDelegateImplV14, callback);
        }

        final ActionMode startAsSupportActionMode(ActionMode.Callback callback) {
            Object callbackWrapper = new CallbackWrapper(this.this$0.mContext, callback);
            android.support.v7.view.ActionMode startSupportActionMode = this.this$0.startSupportActionMode(callbackWrapper);
            if (startSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(startSupportActionMode);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (this.this$0.isHandleNativeActionModesEnabled()) {
                return startAsSupportActionMode(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }
    }

    Callback wrapWindowCallback(Callback callback) {
        return new AppCompatWindowCallbackV14(this, callback);
    }

    public boolean isHandleNativeActionModesEnabled() {
        return this.mHandleNativeActionModes;
    }

    AppCompatDelegateImplV14(Context context, Window window, AppCompatCallback appCompatCallback) {
        super(context, window, appCompatCallback);
        this.mHandleNativeActionModes = true;
    }
}
