package spm.mvc_mvp_mvvm.mvvm.screenorientation

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen_orientation.*
import spm.mvc_mvp_mvvm.R
import spm.mvc_mvp_mvvm.mvvm.mvvm.dto.CountryResult
import spm.mvc_mvp_mvvm.mvvm.mvvm.viewModel.CountryViewModel

class ScreenOrientationActivity : AppCompatActivity(), LifecycleOwner {

    lateinit var  registrationModel:RegistrationViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_orientation)


        registrationModel = ViewModelProviders.of(this).get(RegistrationViewModel::class.java)

        if(registrationModel!=null){

            val registerModelFromViewModel = registrationModel.getObservableRegistrationModel()

            if(registerModelFromViewModel!=null && registerModelFromViewModel.value !=null) {

                val reg = registerModelFromViewModel.value


                editTextName.setText(reg?.name)
                editTextEmailId.setText(reg?.emailId)
                editTextMobileNumber.setText(reg?.mobileNumber)
                editTextPassword.setText(reg?.password)
            }
        }


        lifecycle.addObserver(registrationModel)

    }

    override fun onPause() {
        super.onPause()
        var registerModel:RegistrationModel = RegistrationModel()
        registerModel.name = editTextEmailId.text.toString()
        registerModel.emailId = editTextEmailId.text.toString()
        registerModel.mobileNumber = editTextEmailId.text.toString()
        registerModel.password = editTextEmailId.text.toString()

        val data = MutableLiveData<RegistrationModel>()

        data.value = registerModel
        registrationModel.setObservableRegistrationModel(data)
    }
}
