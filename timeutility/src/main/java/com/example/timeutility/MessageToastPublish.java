package com.example.timeutility;

import android.content.Context;
import android.widget.Toast;

public class MessageToastPublish {

    public static void showMessage(Context context,String mensaje){
        Toast.makeText(context,mensaje,Toast.LENGTH_LONG).show();
    }
}
