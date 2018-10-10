package mvvm.livedata.example.model;

import android.text.TextUtils;
import android.util.Patterns;

import java.io.Serializable;


public class User implements Serializable
{

    private String email;
    private String password;


    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


    public boolean isValidEmail()
    {
        if(this.email != null && !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            return true;
        }

        return false;
    }

    public boolean isValidPassword()
    {
        if(this.password != null && this.password.length() >= 6)
        {
            return true;
        }

        return false;
    }

    public boolean isValidCredential()
    {
        if(this.email.equalsIgnoreCase("bardhan.jit@gmail.com") && this.password.equals("123456"))
        {
            return true;
        }

        return false;
    }


    public String getWelcomeMessage()
    {
        return "Welcome\n" + this.getEmail();
    }
}