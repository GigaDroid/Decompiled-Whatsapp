package android.support.v4.app;

import android.app.Activity;

class ActivityCompatHoneycomb {
    static void invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
    }
}
