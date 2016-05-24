package com.hfad.messenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    //在按鈕被點擊的時候，觸發onSendMessage()方法
    public void  onSendMessage(View view){
        EditText messageView = (EditText)findViewById(R.id.message);
        String messageText = messageView.getText().toString();//取得Text裡的文字
        //Intent intent = new Intent(this,ReceiveMessageActivity.class);
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);

        //代替建立明確指定ReceiveMessageActivity 的intent,改為建立使用send action 的intent
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messageText);
        //啟動ReceiveMessageActivity
        startActivity(intent);

        //intent.putExtra("message",value);
    }
}
