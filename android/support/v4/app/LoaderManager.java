package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;

public abstract class LoaderManager {

    public interface LoaderCallbacks {
        Loader onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(Loader loader, Object obj);

        void onLoaderReset(Loader loader);
    }

    public abstract void destroyLoader(int i);

    public abstract Loader getLoader(int i);

    public abstract Loader initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks);

    public abstract Loader restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks);

    public static void enableDebugLogging(boolean z) {
        LoaderManagerImpl.DEBUG = z;
    }
}
