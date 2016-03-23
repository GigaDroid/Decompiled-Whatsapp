package com.whatsapp.appwidget;

import android.annotation.TargetApi;
import android.content.Intent;
import android.widget.RemoteViewsService;
import android.widget.RemoteViewsService.RemoteViewsFactory;

@TargetApi(11)
public class WidgetService extends RemoteViewsService {
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new b(getApplicationContext());
    }
}
