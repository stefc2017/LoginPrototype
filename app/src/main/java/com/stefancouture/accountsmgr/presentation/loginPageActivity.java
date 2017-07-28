package com.stefancouture.accountsmgr.presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.stefancouture.accountsmgr.R;

public class loginPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    /**********
     *
     * When user presses register button on login page, will send user to register page
     */
    public void register(View view){
        Intent intent = new Intent(this, registerPageActivity.class);
        startActivity(intent);
    }
}
