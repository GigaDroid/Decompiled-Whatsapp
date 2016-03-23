package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.CallsFragment.ClearCallLogDialogFragment;
import com.whatsapp.DialogToastActivity.ProgressDialogFragment;
import com.whatsapp.util.bq;

class amt implements OnClickListener {
    final ClearCallLogDialogFragment a;

    amt(ClearCallLogDialogFragment clearCallLogDialogFragment) {
        this.a = clearCallLogDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        progressDialogFragment.show(this.a.getFragmentManager(), null);
        bq.a(new d2(this, progressDialogFragment));
    }
}
