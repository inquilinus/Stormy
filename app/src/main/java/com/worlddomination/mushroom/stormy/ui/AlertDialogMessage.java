package com.worlddomination.mushroom.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.worlddomination.mushroom.stormy.R;

/**
 * Created by mushroom on 19/03/16.
 */
public class AlertDialogMessage extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder= new AlertDialog.Builder(context);
        builder.setTitle(context.getString(R.string.error_title))
                .setMessage(context.getString(R.string.error_message))
                .setPositiveButton(context.getString(R.string.error_button_ok), null);
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
