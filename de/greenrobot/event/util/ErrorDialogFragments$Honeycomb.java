package de.greenrobot.event.util;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

@TargetApi(11)
public class ErrorDialogFragments$Honeycomb extends DialogFragment implements OnClickListener {
    public Dialog onCreateDialog(Bundle bundle) {
        return k.a(getActivity(), getArguments(), this);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        k.a(dialogInterface, i, getActivity(), getArguments());
    }
}
