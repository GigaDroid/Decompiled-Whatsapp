package com.whatsapp;

import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;

interface gv {
    int a(Uri uri, ContentValues contentValues, String str, String[] strArr);

    int a(Uri uri, String str, String[] strArr);

    Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri a(Uri uri, ContentValues contentValues);

    ContentProviderResult[] a(ArrayList arrayList);
}
