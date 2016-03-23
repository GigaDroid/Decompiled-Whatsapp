package android.support.v4.os;

import android.os.AsyncTask;

class AsyncTaskCompatHoneycomb {
    static void executeParallel(AsyncTask asyncTask, Object[] objArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
    }
}
