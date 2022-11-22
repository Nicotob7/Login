package cl.tobar.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user=(EditText)findViewById(R.id.User);
        pass=(EditText)findViewById(R.id.Pass);
        btnEntrar=(Button)findViewById(R.id.btnEntrar);
        btnRegistrar=(Button)findViewById(R.id.btnRegistrar);

        btnEntrar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
    }
}
