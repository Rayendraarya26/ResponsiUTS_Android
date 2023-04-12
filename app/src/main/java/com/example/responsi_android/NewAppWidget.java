package com.example.responsi_android;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViews;

/**
 * Implementation of App Widget functionality.
 */
public class NewAppWidget extends AppWidgetProvider {

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

//        SharedPreferences preferences = context.getSharedPreferences("for_widget", Context.MODE_PRIVATE);
//        String value = preferences.getString("value", "");

//        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage("com.example.responsi_android");
//        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, launchIntent, 0);

//        CharSequence widgetText = context.getString(R.string.appwidget_text);
        // Construct the RemoteViews object

//        views.setOnClickPendingIntent(R.id.button_widget, pendingIntent);

//        ComponentName thisWidget = new ComponentName(context, AppWidgetProvider.class);
//        views.setTextViewText(R.id.compass_value_widget, value);
//        views.setTextViewText(R.id.appwidget_text, widgetText);

        // Instruct the widget manager to update the widget




//        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.new_app_widget);


//        appWidgetManager.updateAppWidget(appWidgetId, views);



    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
//        for (int appWidgetId : appWidgetIds) {
//            updateAppWidget(context, appWidgetManager, appWidgetId);
//        }

        final int N = appWidgetIds.length;

        for (int i=0; i<N; i++) {
            int appWidgetId = appWidgetIds[i];

            Intent intent= new Intent(context, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.new_app_widget);

            views.setOnClickPendingIntent(R.id.button_widget, pendingIntent);

            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}