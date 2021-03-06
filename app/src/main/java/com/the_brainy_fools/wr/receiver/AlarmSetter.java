package com.the_brainy_fools.wr.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.the_brainy_fools.wr.database.DatabaseHelper;
import com.the_brainy_fools.wr.model.MainModel;

import java.util.ArrayList;

public class AlarmSetter extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);

        AlarmHelper.getInstance().init(context);
        AlarmHelper alarmHelper = AlarmHelper.getInstance();

        ArrayList<MainModel> datas = new ArrayList<>();
        datas.addAll(databaseHelper.query().getFollowed(DatabaseHelper.FOLLOW_ID, null));

        for (MainModel data: datas) {
            if (data.getDateMill() != 0) {
                alarmHelper.setAlarm(data.getID(), data.getTitle(), data.getDateMill());
            }
        }
    }
}
