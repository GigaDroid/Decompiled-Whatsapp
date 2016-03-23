package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.os.OperationCanceledException;
import android.support.v4.util.TimeUtils;
import com.whatsapp.arj;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.v;
import org.whispersystems.at;

public abstract class AsyncTaskLoader extends Loader {
    private static final String[] z;
    volatile LoadTask mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile LoadTask mTask;
    long mUpdateThrottle;

    final class LoadTask extends ModernAsyncTask implements Runnable {
        private final CountDownLatch mDone;
        final AsyncTaskLoader this$0;
        boolean waiting;

        protected Object doInBackground(Void[] voidArr) {
            try {
                return this.this$0.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (isCancelled()) {
                    return null;
                }
                throw e;
            } catch (OperationCanceledException e2) {
                throw e2;
            }
        }

        LoadTask(AsyncTaskLoader asyncTaskLoader) {
            this.this$0 = asyncTaskLoader;
            this.mDone = new CountDownLatch(1);
        }

        protected void onPostExecute(Object obj) {
            try {
                this.this$0.dispatchOnLoadComplete(this, obj);
            } finally {
                this.mDone.countDown();
            }
        }

        protected void onCancelled(Object obj) {
            try {
                this.this$0.dispatchOnCancelled(this, obj);
            } finally {
                this.mDone.countDown();
            }
        }

        public void run() {
            this.waiting = false;
            this.this$0.executePendingTask();
        }

        protected Object doInBackground(Object[] objArr) {
            return doInBackground((Void[]) objArr);
        }
    }

    static {
        String[] strArr = new String[6];
        String str = "<yvs\u000e4V{t\u00036nvn\u0006l";
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
                        i3 = 81;
                        break;
                    case at.g /*1*/:
                        i3 = 58;
                        break;
                    case at.i /*2*/:
                        i3 = 23;
                        break;
                    case at.o /*3*/:
                        i3 = 29;
                        break;
                    default:
                        i3 = arj.Theme_switchStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "<nvn\u0006l";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "qMvt\u00198Tp ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "qW[|\u001e%vx|\t\u0012Uzm\u00014NrI\u0004<_*";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "qMvt\u00198Tp ";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "<ogy\f%_Cu\u001f>Ncq\bl";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract Object loadInBackground();

    protected boolean onCancelLoad() {
        boolean z = false;
        if (this.mTask != null) {
            if (this.mCancellingTask != null) {
                if (this.mTask.waiting) {
                    this.mTask.waiting = false;
                    this.mHandler.removeCallbacks(this.mTask);
                }
                this.mTask = null;
            } else if (this.mTask.waiting) {
                this.mTask.waiting = false;
                this.mHandler.removeCallbacks(this.mTask);
                this.mTask = null;
            } else {
                z = this.mTask.cancel(false);
                if (z) {
                    this.mCancellingTask = this.mTask;
                    cancelLoadInBackground();
                }
                this.mTask = null;
            }
        }
        return z;
    }

    protected void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new LoadTask(this);
        executePendingTask();
    }

    public void onCanceled(Object obj) {
    }

    void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.waiting) {
                this.mTask.waiting = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                this.mTask.executeOnExecutor(this.mExecutor, (Void[]) null);
                return;
            }
            this.mTask.waiting = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public void cancelLoadInBackground() {
    }

    void dispatchOnCancelled(LoadTask loadTask, Object obj) {
        onCanceled(obj);
        if (this.mCancellingTask == loadTask) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    protected Object onLoadInBackground() {
        return loadInBackground();
    }

    public AsyncTaskLoader(Context context) {
        this(context, ModernAsyncTask.THREAD_POOL_EXECUTOR);
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    private AsyncTaskLoader(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = executor;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print(z[2]);
            printWriter.print(this.mTask);
            printWriter.print(z[3]);
            printWriter.println(this.mTask.waiting);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print(z[0]);
            printWriter.print(this.mCancellingTask);
            printWriter.print(z[5]);
            printWriter.println(this.mCancellingTask.waiting);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print(z[1]);
            TimeUtils.formatDuration(this.mUpdateThrottle, printWriter);
            printWriter.print(z[4]);
            TimeUtils.formatDuration(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    void dispatchOnLoadComplete(LoadTask loadTask, Object obj) {
        boolean z = ContextCompat.a;
        if (this.mTask != loadTask) {
            dispatchOnCancelled(loadTask, obj);
            if (!z) {
                return;
            }
        }
        if (isAbandoned()) {
            onCanceled(obj);
            if (!z) {
                return;
            }
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(obj);
    }
}
