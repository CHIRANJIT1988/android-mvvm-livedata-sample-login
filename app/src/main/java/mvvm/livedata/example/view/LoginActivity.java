package mvvm.livedata.example.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import mvvm.livedata.example.R;
import mvvm.livedata.example.databinding.ActivityLoginBinding;
import mvvm.livedata.example.model.User;
import mvvm.livedata.example.viewmodel.UserViewModel;
import mvvm.livedata.example.viewmodel.factory.UserViewModelFactory;

public class LoginActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /**
         * Create instance for data binding auto generated class file
         */
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        /**
         * Create instance for ViewModel class
         */

        UserViewModel userViewModel = ViewModelProviders.of(this, new UserViewModelFactory(this, new User())).get(UserViewModel.class);

        /**
         * Set ViewModel instance to binding class
         */
        binding.setUserViewModel(userViewModel);
    }
}