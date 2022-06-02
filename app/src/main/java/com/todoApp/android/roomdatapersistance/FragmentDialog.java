package com.todoApp.android.roomdatapersistance;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class FragmentDialog  extends DialogFragment {
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(requireContext())
                .setMessage("Confirm")
                .create();
    }

    public static String TAG = "PurchaseConfirmationDialog";
}

