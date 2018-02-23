package com.manojbhadane.javaworkspace.mockitodemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.manojbhadane.javaworkspace.R;

/**
 * Created by manoj.bhadane on 26-12-2017.
 */
public class LoginActivity extends AppCompatActivity implements LoginView
{
    private EditText mEdtpass;
    private EditText mEdtuname;

    private LoginPresenterImpl mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    public void init()
    {
        mPresenter = new LoginPresenterImpl(this);
        mEdtuname = (EditText) findViewById(R.id.editText);
        mEdtpass = (EditText) findViewById(R.id.editText2);

        mPresenter = new LoginPresenterImpl(this);

        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onLogin();
            }
        });
    }

    public void onLogin()
    {
        mEdtuname.setText("manoj");
        mPresenter.login();
    }

    @Override
    public String getUsername()
    {
        return mEdtuname.getText().toString();
    }

    @Override
    public void showMessage(int resid)
    {
        Toast.makeText(this, getString(resid), Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getPassword()
    {
        return mEdtpass.getText().toString();
    }

}
