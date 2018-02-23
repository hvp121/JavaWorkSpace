package com.manojbhadane.javaworkspace.mockitodemo;

import com.manojbhadane.javaworkspace.R;

/**
 * Created by manoj.bhadane on 26-12-2017.
 */
public class LoginPresenterImpl implements LoginPresenter, LoginInteractor
{
    private LoginView mView;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView view)
    {
        mView = view;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void login()
    {
        if (mView.getUsername().isEmpty())
        {
            mView.showMessage(R.string.error_empty_uname);
        }

        if (mView.getPassword().isEmpty())
            mView.showMessage(R.string.error_empty_password);

        if (!mView.getUsername().isEmpty() && !mView.getPassword().isEmpty())
        {
            if (mView.getUsername().equals("manoj") && mView.getPassword().equals("pass"))
                mView.showMessage(R.string.msg_login_success);
        }
    }
}
