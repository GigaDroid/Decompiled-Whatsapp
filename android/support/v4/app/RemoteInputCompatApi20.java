package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompatBase.Action;

class RemoteInputCompatApi20 {
    static Bundle getResultsFromIntent(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    static RemoteInput[] fromCompat(RemoteInputCompatBase.RemoteInput[] remoteInputArr) {
        int i = Action.a;
        if (remoteInputArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr2 = new RemoteInput[remoteInputArr.length];
        int i2 = 0;
        while (i2 < remoteInputArr.length) {
            RemoteInputCompatBase.RemoteInput remoteInput = remoteInputArr[i2];
            remoteInputArr2[i2] = new Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras()).build();
            i2++;
            if (i != 0) {
                break;
            }
        }
        return remoteInputArr2;
    }
}
