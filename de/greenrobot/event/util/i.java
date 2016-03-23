package de.greenrobot.event.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class i extends g {
    public i(d dVar) {
        super(dVar);
    }

    protected Object m1037a(f fVar, Bundle bundle) {
        return a(fVar, bundle);
    }

    protected Fragment a(f fVar, Bundle bundle) {
        Fragment errorDialogFragments$Support = new ErrorDialogFragments$Support();
        errorDialogFragments$Support.setArguments(bundle);
        return errorDialogFragments$Support;
    }
}
