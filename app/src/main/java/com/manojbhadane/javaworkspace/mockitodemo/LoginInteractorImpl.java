package com.manojbhadane.javaworkspace.mockitodemo;

/**
 * Created by manoj.bhadane on 26-12-2017.
 */
public class LoginInteractorImpl implements LoginInteractor
{
    private LoginInteractor mInteractor;

    public LoginInteractorImpl(LoginInteractor interactor)
    {
        mInteractor = interactor;
    }
}
