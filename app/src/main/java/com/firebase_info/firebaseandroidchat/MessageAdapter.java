package com.firebase_info.firebaseandroidchat;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lenovo on 19.02.2018.
 */

public class MessageAdapter extends ArrayAdapter {



    public MessageAdapter(@NonNull Context context, int resource, @NonNull List<Message> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message,parent,false);
        }

        TextView messageTextView = (TextView) convertView.findViewById(R.id.messageTextView);

        Message message = (Message) getItem(position);

        messageTextView.setText(message.getText());

        return convertView;

    }


}
