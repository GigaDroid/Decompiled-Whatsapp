package android.support.v4.os;

import android.os.Build.VERSION;

public final class CancellationSignal {
    public static boolean a;
    private boolean mCancelInProgress;
    private Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private OnCancelListener mOnCancelListener;

    public interface OnCancelListener {
        void onCancel();
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this) {
            z = this.mIsCanceled;
        }
        return z;
    }

    public Object getCancellationSignalObject() {
        try {
            if (VERSION.SDK_INT < 16) {
                return null;
            }
            Object obj;
            synchronized (this) {
                if (this.mCancellationSignalObj == null) {
                    try {
                        this.mCancellationSignalObj = CancellationSignalCompatJellybean.create();
                        if (this.mIsCanceled) {
                            CancellationSignalCompatJellybean.cancel(this.mCancellationSignalObj);
                        }
                    } catch (OperationCanceledException e) {
                        throw e;
                    }
                }
                obj = this.mCancellationSignalObj;
            }
            return obj;
        } catch (OperationCanceledException e2) {
            throw e2;
        }
    }

    public void cancel() {
        synchronized (this) {
            if (this.mIsCanceled) {
                return;
            }
            this.mIsCanceled = true;
            this.mCancelInProgress = true;
            OnCancelListener onCancelListener = this.mOnCancelListener;
            Object obj = this.mCancellationSignalObj;
            if (onCancelListener != null) {
                try {
                    onCancelListener.onCancel();
                } catch (OperationCanceledException e) {
                    throw e;
                } catch (OperationCanceledException e2) {
                    throw e2;
                } catch (Throwable th) {
                    synchronized (this) {
                    }
                    this.mCancelInProgress = false;
                    notifyAll();
                }
            }
            if (obj != null) {
                CancellationSignalCompatJellybean.cancel(obj);
            }
            synchronized (this) {
                this.mCancelInProgress = false;
                notifyAll();
            }
        }
    }

    public void throwIfCanceled() {
        try {
            if (isCanceled()) {
                throw new OperationCanceledException();
            }
        } catch (OperationCanceledException e) {
            throw e;
        }
    }
}
