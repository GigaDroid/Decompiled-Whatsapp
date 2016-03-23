package android.support.v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import org.whispersystems.at;

public class AppCompatDialogFragment extends DialogFragment {
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof AppCompatDialog) {
            AppCompatDialog appCompatDialog = (AppCompatDialog) dialog;
            switch (i) {
                case at.g /*1*/:
                case at.i /*2*/:
                    break;
                case at.o /*3*/:
                    dialog.getWindow().addFlags(24);
                    break;
            }
            appCompatDialog.supportRequestWindowFeature(1);
            if (!ActionBar.a) {
                return;
            }
        }
        super.setupDialog(dialog, i);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new AppCompatDialog(getActivity(), getTheme());
    }
}
