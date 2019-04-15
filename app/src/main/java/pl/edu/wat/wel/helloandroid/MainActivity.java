package pl.edu.wat.wel.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText messageEditText;
    TextView rewriteTextView;
    EditText passwordEditText;
    EditText loginEditText;//inne widgety


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("MainActivity", "onCreate");

        setContentView(R.layout.activity_main_active);

        messageEditText = findViewById(R.id.messageEditText);
        rewriteTextView = findViewById(R.id.rewriteText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginEditText = findViewById(R.id.loginEditText);


        //inne widgety...
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
    }

    public void toastClick(View view) {
        Toast.makeText(MainActivity.this, messageEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void onLogClick(View view) {
        Log.d("MainActivity", messageEditText.getText().toString());
    }

    public void rewriteClick(View view) {
        rewriteTextView.setText(messageEditText.getText().toString());
    }


    public void newActivity(View view) {

        if (loginEditText.getText().toString().equals("Paweł") && passwordEditText.getText().toString().equals("android")) {

            Intent intent = new Intent(this, LoginSuccessActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(MainActivity.this, "Logowanie nieudane", Toast.LENGTH_SHORT).show();

        }



    }

    }