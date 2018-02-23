package com.manojbhadane.javaworkspace;

import com.manojbhadane.javaworkspace.mockitodemo.LoginPresenterImpl;
import com.manojbhadane.javaworkspace.mockitodemo.LoginView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by manoj.bhadane on 28-12-2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginUnitTest
{
    @Mock
    private LoginView mView;
    private LoginPresenterImpl mPresenter;

    @Before
    public void setUp() throws Exception
    {
        MockitoAnnotations.initMocks(this);
//        mView = Mockito.mock(LoginView.class);
//        mPresenter = Mockito.mock(LoginPresenterImpl.class);

        mPresenter = new LoginPresenterImpl(mView);
    }

    @Test
    public void unameEmptyTest() throws Exception
    {
        when(mView.getUsername()).thenReturn("");
        when(mView.getPassword()).thenReturn("pass");
        mPresenter.login();

        verify(mView).showMessage(R.string.error_empty_uname);
    }

    @Test
    public void passEmptyTest() throws Exception
    {
        when(mView.getUsername()).thenReturn("manoj");
        when(mView.getPassword()).thenReturn("");
        mPresenter.login();

        verify(mView).showMessage(R.string.error_empty_password);
    }

    @Test
    public void nonEmptyTest() throws Exception
    {
        when(mView.getUsername()).thenReturn("manoj");
        when(mView.getPassword()).thenReturn("pass");
        mPresenter.login();
        verify(mView).showMessage(R.string.msg_login_success);
    }

}
