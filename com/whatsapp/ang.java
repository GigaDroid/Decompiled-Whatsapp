package com.whatsapp;

import android.content.Context;
import android.database.Cursor;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.os.CancellationSignal;
import android.support.v4.os.OperationCanceledException;

class ang extends AsyncTaskLoader {
    private String a;
    private Cursor b;
    private CancellationSignal c;
    private String d;

    public void deliverResult(Object obj) {
        b((Cursor) obj);
    }

    protected void onStartLoading() {
        try {
            if (this.b != null) {
                b(this.b);
            }
            try {
                if (!takeContentChanged()) {
                    if (this.b != null) {
                        return;
                    }
                }
                forceLoad();
            } catch (OperationCanceledException e) {
                throw e;
            } catch (OperationCanceledException e2) {
                throw e2;
            }
        } catch (OperationCanceledException e22) {
            throw e22;
        }
    }

    public ang(Context context, String str, @Nullable String str2) {
        super(context);
        this.d = str;
        this.a = str2;
    }

    public void b(Cursor cursor) {
        try {
            if (!isReset()) {
                Cursor cursor2 = this.b;
                try {
                    this.b = cursor;
                    if (isStarted()) {
                        super.deliverResult(cursor);
                    }
                    if (cursor2 != null && cursor2 != cursor) {
                        try {
                            if (!cursor2.isClosed()) {
                                cursor2.close();
                            }
                        } catch (OperationCanceledException e) {
                            throw e;
                        }
                    }
                } catch (OperationCanceledException e2) {
                    throw e2;
                }
            } else if (cursor != null) {
                cursor.close();
            }
        } catch (OperationCanceledException e22) {
            throw e22;
        } catch (OperationCanceledException e222) {
            throw e222;
        }
    }

    protected void onReset() {
        try {
            super.onReset();
            onStopLoading();
            if (this.b != null) {
                if (!this.b.isClosed()) {
                    this.b.close();
                }
            }
            this.b = null;
        } catch (OperationCanceledException e) {
            throw e;
        } catch (OperationCanceledException e2) {
            throw e2;
        }
    }

    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            if (this.c != null) {
                this.c.cancel();
            }
        }
    }

    public Cursor a() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new OperationCanceledException();
            }
            this.c = new CancellationSignal();
        }
        Cursor b;
        try {
            if (this.a != null) {
                b = App.aK.b(this.a, this.d, this.c);
            } else {
                b = App.aK.a(this.d, this.c);
            }
            if (b != null) {
                b.getCount();
            }
            synchronized (this) {
                this.c = null;
            }
            return b;
        } catch (RuntimeException e) {
            b.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
            }
            this.c = null;
        }
    }

    protected void onStopLoading() {
        cancelLoad();
    }

    public Object loadInBackground() {
        return a();
    }

    public void a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (OperationCanceledException e) {
                throw e;
            }
        }
    }

    public void onCanceled(Object obj) {
        a((Cursor) obj);
    }
}
