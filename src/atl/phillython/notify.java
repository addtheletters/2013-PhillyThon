//package atl.phillython;
//
//import android.support.v4.app.NotificationCompat;
//
//Notification stubborn = new Notification.Builder(CONTEXT THING ASDF)
//{
//stubborn.setSmallIcon(R.drawable.notification_icon)
//stubborn.setContentTitle("EducaTour")
//stubborn.setContentText("Test of Persistent Notifications");
//
//
//public class notify extends NotificationCompat {
//
//	//TEMPLATE/SAMPLE CODE
//	NotificationCompat.Builder mBuilder =
//	        new NotificationCompat.Builder(this)
//	        .setSmallIcon(R.drawable.notification_icon)
//	        .setContentTitle("My notification")
//	        .setContentText("Hello World!");
//	// Creates an explicit intent for an Activity in your app
//	Intent resultIntent = new Intent(this, ResultActivity.class);
//
//	// The stack builder object will contain an artificial back stack for the
//	// started Activity.
//	// This ensures that navigating backward from the Activity leads out of
//	// your application to the Home screen.
//	TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
//	// Adds the back stack for the Intent (but not the Intent itself)
//	stackBuilder.addParentStack(ResultActivity.class);
//	// Adds the Intent that starts the Activity to the top of the stack
//	stackBuilder.addNextIntent(resultIntent);
//	PendingIntent resultPendingIntent =
//	        stackBuilder.getPendingIntent(
//	            0,
//	            PendingIntent.FLAG_UPDATE_CURRENT
//	        );
//	mBuilder.setContentIntent(resultPendingIntent);
//	NotificationManager mNotificationManager =
//	    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//	// mId allows you to update the notification later on.
//	mNotificationManager.notify(mId, mBuilder.build());
//	//END SAMPLE CODE
//	
//	//create persistent notification first
//	stubborn.build();
//	//NotificationManager.notify();
//	
//	if(proximity = true){
//	//stuff goes here
//	}
//}
//}
//
//	
//
