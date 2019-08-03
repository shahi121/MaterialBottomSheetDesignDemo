package com.shahi.materialbottomsheetdesigndemo;

import android.app.Dialog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

   /* private LinearLayout bottomSheetLayout, keepLayout;
    private BottomSheetBehavior bottomSheetBehavior;*/
    private ImageView imageView;
    /*private boolean bottomSheetOpen = false;*/
    // private BottomSheetDialog bottomSheetDialog;

    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* bottomSheetLayout = (LinearLayout) findViewById(R.id.bottomsheet);*/
        imageView = (ImageView) findViewById(R.id.shareImage);

        /*bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetLayout);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);*/
        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // bottomSheetDialog.show();
                /*if (bottomSheetOpen) {
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                    bottomSheetOpen = false;
                } else {
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                    bottomSheetOpen = true;
                }*/
                BottomSheetFragment fragment = BottomSheetFragment.newInstance();
                fragment.show(getSupportFragmentManager(),BottomSheetFragment.class.getSimpleName());

                //showBottomSheet();
            }
        });

        /*keepLayout = (LinearLayout) bottomSheetLayout.findViewById(R.id.keepLayout);
        keepLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "keepLayout", Toast.LENGTH_SHORT).show();
            }
        });*/

        //createBottomSheetDialog();

    }

   /* private void showBottomSheet() {
        dialog = new Dialog(this, R.style.AppTheme_CustomTheme);
        //dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        View view = LayoutInflater.from(this).inflate(R.layout.bottomsheet, null);

        keepLayout = (LinearLayout) view.findViewById(R.id.keepLayout);

        dialog.setContentView(view);
        dialog.show();

        keepLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "keepLayout", Toast.LENGTH_SHORT).show();
            }
        });

    }*/

    /*private void createBottomSheetDialog() {
        if (bottomSheetDialog == null) {
            View view = LayoutInflater.from(this).inflate(R.layout.bottomsheet, null);
            keepLayout = view.findViewById(R.id.keepLayout);
            //uploadLinearLayout = view.findViewById(R.id.uploadLinearLayout);
            // copyLinearLayout = view.findViewById(R.id.copyLinearLayout);

            keepLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "keepLayout", Toast.LENGTH_SHORT).show();
                }
            });

            bottomSheetDialog = new BottomSheetDialog(this);
            bottomSheetDialog.setContentView(view);
        }
    }*/


}
