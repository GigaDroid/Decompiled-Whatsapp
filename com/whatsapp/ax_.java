package com.whatsapp;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;

class ax_ implements gv {
    private final ContentProvider a;

    public int a(Uri uri, String str, String[] strArr) {
        return this.a.delete(uri, str, strArr);
    }

    public ContentProviderResult[] a(ArrayList arrayList) {
        return this.a.applyBatch(arrayList);
    }

    public Uri a(Uri uri, ContentValues contentValues) {
        return this.a.insert(uri, contentValues);
    }

    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.a.update(uri, contentValues, str, strArr);
    }

    ax_(ContentProvider contentProvider) {
        this.a = contentProvider;
    }

    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.a.query(uri, strArr, str, strArr2, str2);
    }
}
