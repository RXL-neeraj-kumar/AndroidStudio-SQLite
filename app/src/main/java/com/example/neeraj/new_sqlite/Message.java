package com.example.neeraj.new_sqlite;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Neeraj on 24-03-2018.
 */

    public class Message {
        public static void message(Context context, String message) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }
}
