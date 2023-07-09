package com.example.fitpeo.presentation.splash

import android.content.Intent
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.fitpeo.BR
import com.example.fitpeo.R
import com.example.fitpeo.common.observeOnce
import com.example.fitpeo.databinding.ActivitySplashBinding
import com.example.fitpeo.presentation.FragmentContainerActivity
import com.example.fitpeo.presentation.core.base.BaseActivity

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
    private lateinit var splashScreen: SplashScreen
    private val mViewModel: SplashViewModel by viewModels()

    private fun navigateToGridScreen() {
        val intent = Intent(this@SplashActivity, FragmentContainerActivity::class.java)
        startActivity(intent)
        overridePendingTransition(
            R.anim.modal_activity_open_enter,
            R.anim.modal_activity_close_exit
        )
        finish()
    }

    override fun preSetContentViewInit() {
        splashScreen = installSplashScreen()
    }
    override fun init() {
        binding.setVariable(BR.viewModel,mViewModel)
    }
    override fun observeViewModel() {
        mViewModel.onStartEvent.observeOnce(this) {
            navigateToGridScreen()
        }
    }
}