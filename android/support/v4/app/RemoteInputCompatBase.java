package android.support.v4.app;

import android.os.Bundle;

class RemoteInputCompatBase {

    public abstract class RemoteInput {
        public static int a;

        public interface Factory {
        }

        protected abstract boolean getAllowFreeFormInput();

        protected abstract CharSequence[] getChoices();

        protected abstract Bundle getExtras();

        protected abstract CharSequence getLabel();

        protected abstract String getResultKey();
    }
}
