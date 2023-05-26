package com.course.example.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class LogWriteReceiver extends BroadcastReceiver {
	
	@Override
	public void onReceive(Context context, Intent intent) {	
		  
           Log.e("Permission",  "Receiver wrote to log");          
		   
        }

}
