package de.greenrobot.event.util;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;

@TargetApi(11)
public class h extends g {
    public h(d dVar) {
        super(dVar);
    }

    protected Object m1036a(f fVar, Bundle bundle) {
        return a(fVar, bundle);
    }

    protected Fragment a(f fVar, Bundle bundle) {
        Fragment errorDialogFragments$Honeycomb = new ErrorDialogFragments$Honeycomb();
        errorDialogFragments$Honeycomb.setArguments(bundle);
        return errorDialogFragments$Honeycomb;
    }
}
