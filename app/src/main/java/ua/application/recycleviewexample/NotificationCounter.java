package ua.application.recycleviewexample;

import android.view.View;
import android.widget.TextView;

public class NotificationCounter {

    private TextView notificationNumber;
 private int counter;
    public NotificationCounter(View view) {
        notificationNumber = view.findViewById(R.id.badge_textView);
        notificationNumber.setVisibility(View.GONE);
    }
    public void increaseNumber(){
        notificationNumber.setVisibility(View.VISIBLE);
        counter++;
        notificationNumber.setText(String.valueOf(counter));
    }
}
