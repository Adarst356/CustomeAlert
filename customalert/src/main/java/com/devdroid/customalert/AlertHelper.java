package com.devdroid.customealert;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;

import com.devdroid.customalert.R;

public class AlertHelper {

    public static void showCustomDialog(Activity activity, String type, Runnable onConfirm) {
        View view = LayoutInflater.from(activity).inflate(R.layout.custom_alert_dialog, null);

        TextView title = view.findViewById(R.id.dialog_title);
        Button confirmBtn = view.findViewById(R.id.dialog_confirm);
        Button cancelBtn = view.findViewById(R.id.dialog_cancel);
        ImageView icon = view.findViewById(R.id.dialog_icon);

        title.setText("Are you sure you want to " + type.toLowerCase() + "?");

        switch (type) {
            case "Add":
                icon.setImageResource(R.drawable.ic_add);
                break;
            case "Update":
                icon.setImageResource(R.drawable.ic_update);
                break;
            case "Delete":
                icon.setImageResource(R.drawable.ic_delete);
                break;
            case "Exit":
                icon.setImageResource(R.drawable.ic_exit);
                break;
            default:
                icon.setImageResource(R.drawable.ic_warning);
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.CustomDialog);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();

        Animation animation = AnimationUtils.loadAnimation(activity, R.anim.dialog_enter);
        view.startAnimation(animation);

        confirmBtn.setOnClickListener(v -> {
            if (onConfirm != null) onConfirm.run();
            Toast.makeText(activity, type + " confirmed!", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });

        cancelBtn.setOnClickListener(v -> dialog.dismiss());
    }
}
