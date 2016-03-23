package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import org.v;

class SnackbarManager {
    private static SnackbarManager sSnackbarManager;
    private SnackbarRecord mCurrentSnackbar;
    private final Handler mHandler;
    private final Object mLock;
    private SnackbarRecord mNextSnackbar;

    class 1 implements android.os.Handler.Callback {
        final SnackbarManager this$0;

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case v.m /*0*/:
                    SnackbarManager.access$000(this.this$0, (SnackbarRecord) message.obj);
                    return true;
                default:
                    return false;
            }
        }

        1(SnackbarManager snackbarManager) {
            this.this$0 = snackbarManager;
        }
    }

    interface Callback {
        void dismiss(int i);

        void show();
    }

    class SnackbarRecord {
        private final WeakReference callback;
        private int duration;

        static int access$100(SnackbarRecord snackbarRecord) {
            return snackbarRecord.duration;
        }

        boolean isSnackbar(Callback callback) {
            return callback != null && this.callback.get() == callback;
        }

        static WeakReference access$200(SnackbarRecord snackbarRecord) {
            return snackbarRecord.callback;
        }
    }

    private void showNextSnackbarLocked() {
        if (this.mNextSnackbar != null) {
            this.mCurrentSnackbar = this.mNextSnackbar;
            this.mNextSnackbar = null;
            Callback callback = (Callback) SnackbarRecord.access$200(this.mCurrentSnackbar).get();
            if (callback != null) {
                callback.show();
                if (!CoordinatorLayout.a) {
                    return;
                }
            }
            this.mCurrentSnackbar = null;
        }
    }

    static SnackbarManager getInstance() {
        if (sSnackbarManager == null) {
            sSnackbarManager = new SnackbarManager();
        }
        return sSnackbarManager;
    }

    public void restoreTimeout(Callback callback) {
        synchronized (this.mLock) {
            if (isCurrentSnackbarLocked(callback)) {
                scheduleTimeoutLocked(this.mCurrentSnackbar);
            }
        }
    }

    private void handleTimeout(SnackbarRecord snackbarRecord) {
        synchronized (this.mLock) {
            if (this.mCurrentSnackbar == snackbarRecord || this.mNextSnackbar == snackbarRecord) {
                cancelSnackbarLocked(snackbarRecord, 2);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void scheduleTimeoutLocked(android.support.design.widget.SnackbarManager.SnackbarRecord r7) {
        /*
        r6 = this;
        r0 = android.support.design.widget.SnackbarManager.SnackbarRecord.access$100(r7);
        r1 = -2;
        if (r0 != r1) goto L_0x0008;
    L_0x0007:
        return;
    L_0x0008:
        r0 = 2750; // 0xabe float:3.854E-42 double:1.3587E-320;
        r1 = android.support.design.widget.SnackbarManager.SnackbarRecord.access$100(r7);
        if (r1 <= 0) goto L_0x0018;
    L_0x0010:
        r0 = android.support.design.widget.SnackbarManager.SnackbarRecord.access$100(r7);
        r1 = android.support.design.widget.CoordinatorLayout.a;
        if (r1 == 0) goto L_0x0021;
    L_0x0018:
        r1 = android.support.design.widget.SnackbarManager.SnackbarRecord.access$100(r7);
        r2 = -1;
        if (r1 != r2) goto L_0x0021;
    L_0x001f:
        r0 = 1500; // 0x5dc float:2.102E-42 double:7.41E-321;
    L_0x0021:
        r1 = r6.mHandler;
        r1.removeCallbacksAndMessages(r7);
        r1 = r6.mHandler;
        r2 = r6.mHandler;
        r3 = 0;
        r2 = android.os.Message.obtain(r2, r3, r7);
        r4 = (long) r0;
        r1.sendMessageDelayed(r2, r4);
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SnackbarManager.scheduleTimeoutLocked(android.support.design.widget.SnackbarManager$SnackbarRecord):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dismiss(android.support.design.widget.SnackbarManager.Callback r3, int r4) {
        /*
        r2 = this;
        r1 = r2.mLock;
        monitor-enter(r1);
        r0 = r2.isCurrentSnackbarLocked(r3);	 Catch:{ all -> 0x001f }
        if (r0 == 0) goto L_0x0012;
    L_0x0009:
        r0 = r2.mCurrentSnackbar;	 Catch:{ all -> 0x001f }
        r2.cancelSnackbarLocked(r0, r4);	 Catch:{ all -> 0x001f }
        r0 = android.support.design.widget.CoordinatorLayout.a;	 Catch:{ all -> 0x001f }
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.isNextSnackbarLocked(r3);	 Catch:{ all -> 0x001f }
        if (r0 == 0) goto L_0x001d;
    L_0x0018:
        r0 = r2.mNextSnackbar;	 Catch:{ all -> 0x001f }
        r2.cancelSnackbarLocked(r0, r4);	 Catch:{ all -> 0x001f }
    L_0x001d:
        monitor-exit(r1);	 Catch:{ all -> 0x001f }
        return;
    L_0x001f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SnackbarManager.dismiss(android.support.design.widget.SnackbarManager$Callback, int):void");
    }

    public boolean isCurrentOrNext(Callback callback) {
        boolean z;
        synchronized (this.mLock) {
            z = isCurrentSnackbarLocked(callback) || isNextSnackbarLocked(callback);
        }
        return z;
    }

    public void cancelTimeout(Callback callback) {
        synchronized (this.mLock) {
            if (isCurrentSnackbarLocked(callback)) {
                this.mHandler.removeCallbacksAndMessages(this.mCurrentSnackbar);
            }
        }
    }

    private boolean cancelSnackbarLocked(SnackbarRecord snackbarRecord, int i) {
        Callback callback = (Callback) SnackbarRecord.access$200(snackbarRecord).get();
        if (callback == null) {
            return false;
        }
        callback.dismiss(i);
        return true;
    }

    public void onShown(Callback callback) {
        synchronized (this.mLock) {
            if (isCurrentSnackbarLocked(callback)) {
                scheduleTimeoutLocked(this.mCurrentSnackbar);
            }
        }
    }

    private boolean isNextSnackbarLocked(Callback callback) {
        return this.mNextSnackbar != null && this.mNextSnackbar.isSnackbar(callback);
    }

    static void access$000(SnackbarManager snackbarManager, SnackbarRecord snackbarRecord) {
        snackbarManager.handleTimeout(snackbarRecord);
    }

    public void onDismissed(Callback callback) {
        synchronized (this.mLock) {
            if (isCurrentSnackbarLocked(callback)) {
                this.mCurrentSnackbar = null;
                if (this.mNextSnackbar != null) {
                    showNextSnackbarLocked();
                }
            }
        }
    }

    private SnackbarManager() {
        this.mLock = new Object();
        this.mHandler = new Handler(Looper.getMainLooper(), new 1(this));
    }

    private boolean isCurrentSnackbarLocked(Callback callback) {
        return this.mCurrentSnackbar != null && this.mCurrentSnackbar.isSnackbar(callback);
    }
}
