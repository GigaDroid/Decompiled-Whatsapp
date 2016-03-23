package android.support.v4.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.whatsapp.arj;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.v;
import org.whispersystems.at;

abstract class ModernAsyncTask {
    public static final Executor THREAD_POOL_EXECUTOR;
    private static volatile Executor sDefaultExecutor;
    private static InternalHandler sHandler;
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private static final String[] z;
    private final FutureTask mFuture;
    private volatile Status mStatus;
    private final AtomicBoolean mTaskInvoked;
    private final WorkerRunnable mWorker;

    final class 1 implements ThreadFactory {
        private static final String z;
        private final AtomicInteger mCount;

        static {
            char[] toCharArray = "O7W[\u0018l\u0019@G\u0004a\fRM\u0001\"{".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 2;
                        break;
                    case at.g /*1*/:
                        i2 = 88;
                        break;
                    case at.i /*2*/:
                        i2 = 51;
                        break;
                    case at.o /*3*/:
                        i2 = 62;
                        break;
                    default:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        1() {
            this.mCount = new AtomicInteger(1);
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, z + this.mCount.getAndIncrement());
        }
    }

    abstract class WorkerRunnable implements Callable {
        Object[] mParams;

        WorkerRunnable(1 1) {
            this();
        }

        private WorkerRunnable() {
        }
    }

    class 2 extends WorkerRunnable {
        final ModernAsyncTask this$0;

        public Object call() {
            ModernAsyncTask.access$100(this.this$0).set(true);
            Process.setThreadPriority(10);
            return ModernAsyncTask.access$200(this.this$0, this.this$0.doInBackground(this.mParams));
        }

        2(ModernAsyncTask modernAsyncTask) {
            this.this$0 = modernAsyncTask;
            super(null);
        }
    }

    class 3 extends FutureTask {
        private static final String[] z;
        final ModernAsyncTask this$0;

        static {
            String[] strArr = new String[3];
            String str = ",9k=x9+a8";
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
                            i3 = arj.Theme_switchStyle;
                            break;
                        case at.g /*1*/:
                            i3 = 74;
                            break;
                        case at.i /*2*/:
                            i3 = 18;
                            break;
                        case at.o /*3*/:
                            i3 = 83;
                            break;
                        default:
                            i3 = 27;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        i = 2;
                        strArr2 = strArr3;
                        str = ",$26i\u001f%`st\u000e)g!i\b.2$s\u0004&ws~\u0015/q&o\u0004$us\u007f\u0002\u0003|\u0011z\u000e!u!t\u0018$v{2";
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = ",$26i\u001f%`st\u000e)g!i\b.2$s\u0004&ws~\u0015/q&o\u0004$us\u007f\u0002\u0003|\u0011z\u000e!u!t\u0018$v{2";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        3(ModernAsyncTask modernAsyncTask, Callable callable) {
            this.this$0 = modernAsyncTask;
            super(callable);
        }

        protected void done() {
            try {
                ModernAsyncTask.access$300(this.this$0, get());
            } catch (Throwable e) {
                Log.w(z[0], e);
            } catch (ExecutionException e2) {
                throw new RuntimeException(z[1], e2.getCause());
            } catch (CancellationException e3) {
                ModernAsyncTask.access$300(this.this$0, null);
            } catch (Throwable e4) {
                RuntimeException runtimeException = new RuntimeException(z[2], e4);
            }
        }
    }

    /* synthetic */ class 4 {
        static final int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status;

        static {
            $SwitchMap$android$support$v4$content$ModernAsyncTask$Status = new int[Status.values().length];
            try {
                $SwitchMap$android$support$v4$content$ModernAsyncTask$Status[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$android$support$v4$content$ModernAsyncTask$Status[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    class AsyncTaskResult {
        final Object[] mData;
        final ModernAsyncTask mTask;

        AsyncTaskResult(ModernAsyncTask modernAsyncTask, Object[] objArr) {
            this.mTask = modernAsyncTask;
            this.mData = objArr;
        }
    }

    class InternalHandler extends Handler {
        public InternalHandler() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            switch (message.what) {
                case at.g /*1*/:
                    ModernAsyncTask.access$400(asyncTaskResult.mTask, asyncTaskResult.mData[0]);
                    if (!ContextCompat.a) {
                        return;
                    }
                    break;
                case at.i /*2*/:
                    break;
                default:
                    return;
            }
            asyncTaskResult.mTask.onProgressUpdate(asyncTaskResult.mData);
        }
    }

    public enum Status {
        ;
        
        private static final Status[] $VALUES;
        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;
        private static final String[] z;

        static {
            String[] strArr = new String[3];
            String str = ",`)\u0004\u00042b";
            int i = -1;
            String[] strArr2 = strArr;
            String[] strArr3 = strArr;
            int i2 = 0;
            while (true) {
                char[] toCharArray = str.toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i3 = 0; length > i3; i3++) {
                    int i4;
                    char c = cArr[i3];
                    switch (i3 % 5) {
                        case v.m /*0*/:
                            i4 = 124;
                            break;
                        case at.g /*1*/:
                            i4 = 37;
                            break;
                        case at.i /*2*/:
                            i4 = arj.Theme_checkedTextViewStyle;
                            break;
                        case at.o /*3*/:
                            i4 = 64;
                            break;
                        default:
                            i4 = 77;
                            break;
                    }
                    cArr[i3] = (char) (i4 ^ c);
                }
                str = new String(cArr).intern();
                switch (i) {
                    case v.m /*0*/:
                        strArr2[i2] = str;
                        str = ".p)\u000e\u00042b";
                        i2 = 2;
                        strArr2 = strArr3;
                        i = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i2] = str;
                        z = strArr3;
                        PENDING = new Status(z[0], 0);
                        RUNNING = new Status(z[2], 1);
                        FINISHED = new Status(z[1], 2);
                        $VALUES = new Status[]{PENDING, RUNNING, FINISHED};
                        return;
                    default:
                        strArr2[i2] = str;
                        str = ":l)\t\u001e4`#";
                        i2 = 1;
                        strArr2 = strArr3;
                        i = 0;
                        break;
                }
            }
        }
    }

    private Object postResult(Object obj) {
        getHandler().obtainMessage(1, new AsyncTaskResult(this, new Object[]{obj})).sendToTarget();
        return obj;
    }

    protected abstract Object doInBackground(Object[] objArr);

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void finish(java.lang.Object r2) {
        /*
        r1 = this;
        r0 = r1.isCancelled();	 Catch:{ IllegalStateException -> 0x0015 }
        if (r0 == 0) goto L_0x000d;
    L_0x0006:
        r1.onCancelled(r2);	 Catch:{ IllegalStateException -> 0x0017 }
        r0 = android.support.v4.content.ContextCompat.a;	 Catch:{ IllegalStateException -> 0x0017 }
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r1.onPostExecute(r2);	 Catch:{ IllegalStateException -> 0x0017 }
    L_0x0010:
        r0 = android.support.v4.content.ModernAsyncTask.Status.FINISHED;
        r1.mStatus = r0;
        return;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.ModernAsyncTask.finish(java.lang.Object):void");
    }

    static AtomicBoolean access$100(ModernAsyncTask modernAsyncTask) {
        return modernAsyncTask.mTaskInvoked;
    }

    static void access$400(ModernAsyncTask modernAsyncTask, Object obj) {
        modernAsyncTask.finish(obj);
    }

    private void postResultIfNotInvoked(Object obj) {
        if (!this.mTaskInvoked.get()) {
            try {
                postResult(obj);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    static void access$300(ModernAsyncTask modernAsyncTask, Object obj) {
        modernAsyncTask.postResultIfNotInvoked(obj);
    }

    protected void onCancelled() {
    }

    protected void onPreExecute() {
    }

    public final boolean isCancelled() {
        return this.mFuture.isCancelled();
    }

    protected void onProgressUpdate(Object[] objArr) {
    }

    protected void onPostExecute(Object obj) {
    }

    static {
        String[] strArr = new String[2];
        String str = "eX-\bsR\u0019&\u001eyEL7\u0003<RX0\r&\u0006M+\u0003<RX0\r<NX0F}JK&\u0007x_\u0019!\u0003yH\u0019&\u001eyEL7\u0003x\u0006\u0011\"FhGJ(F\u007fGWc\u0004y\u0006\\;\u0003\u007fSM&\u0002<IW/\u001f<IW \u00035";
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
                        i3 = 38;
                        break;
                    case at.g /*1*/:
                        i3 = 57;
                        break;
                    case at.i /*2*/:
                        i3 = 67;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    default:
                        i3 = 28;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sThreadFactory = new 1();
                    sPoolWorkQueue = new LinkedBlockingQueue(10);
                    THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
                    sDefaultExecutor = THREAD_POOL_EXECUTOR;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "eX-\bsR\u0019&\u001eyEL7\u0003<RX0\r&\u0006M+\u0003<RX0\r<OJc\u0007pT\\\"\u0002e\u0006K6\brOW$H";
                    obj = null;
            }
        }
    }

    private static Handler getHandler() {
        Handler handler;
        synchronized (ModernAsyncTask.class) {
            if (sHandler == null) {
                sHandler = new InternalHandler();
            }
            handler = sHandler;
        }
        return handler;
    }

    public ModernAsyncTask() {
        this.mStatus = Status.PENDING;
        this.mTaskInvoked = new AtomicBoolean();
        this.mWorker = new 2(this);
        this.mFuture = new 3(this, this.mWorker);
    }

    public final boolean cancel(boolean z) {
        return this.mFuture.cancel(z);
    }

    protected void onCancelled(Object obj) {
        onCancelled();
    }

    static Object access$200(ModernAsyncTask modernAsyncTask, Object obj) {
        return modernAsyncTask.postResult(obj);
    }

    public final ModernAsyncTask executeOnExecutor(Executor executor, Object[] objArr) {
        try {
            if (this.mStatus != Status.PENDING) {
                switch (4.$SwitchMap$android$support$v4$content$ModernAsyncTask$Status[this.mStatus.ordinal()]) {
                    case at.g /*1*/:
                        throw new IllegalStateException(z[1]);
                    case at.i /*2*/:
                        throw new IllegalStateException(z[0]);
                }
            }
            this.mStatus = Status.RUNNING;
            onPreExecute();
            this.mWorker.mParams = objArr;
            executor.execute(this.mFuture);
            return this;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
