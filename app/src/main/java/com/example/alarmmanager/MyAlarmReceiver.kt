package com.example.alarmmanager

import android.widget.Toast
import android.content.Intent
import android.content.BroadcastReceiver
import android.content.Context


class MyAlarmReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Alarm Triggered", Toast.LENGTH_LONG).show()
    }
}