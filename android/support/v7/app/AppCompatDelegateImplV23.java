package android.support.v7.app;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window;
import org.v;

class AppCompatDelegateImplV23 extends AppCompatDelegateImplV14 {

    class AppCompatWindowCallbackV23 extends AppCompatWindowCallbackV14 {
        final AppCompatDelegateImplV23 this$0;

        public ActionMode onWindowStartingActionMode(Callback callback) {
            return null;
        }

        AppCompatWindowCallbackV23(AppCompatDelegateImplV23 appCompatDelegateImplV23, Window.Callback callback) {
            this.this$0 = appCompatDelegateImplV23;
            super(appCompatDelegateImplV23, callback);
        }

        public ActionMode onWindowStartingActionMode(Callback callback, int i) {
            if (this.this$0.isHandleNativeActionModesEnabled()) {
                switch (i) {
                    case v.m /*0*/:
                        return startAsSupportActionMode(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    Window.Callback wrapWindowCallback(Window.Callback callback) {
        return new AppCompatWindowCallbackV23(this, callback);
    }

    AppCompatDelegateImplV23(Context context, Window window, AppCompatCallback appCompatCallback) {
        super(context, window, appCompatCallback);
    }
}
