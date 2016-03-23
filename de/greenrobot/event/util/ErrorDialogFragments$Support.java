package de.greenrobot.event.util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ErrorDialogFragments$Support extends DialogFragment implements OnClickListener {
    public Dialog onCreateDialog(Bundle bundle) {
        return k.a(getActivity(), getArguments(), this);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        k.a(dialogInterface, i, getActivity(), getArguments());
    }
}
