package net.rafaeltoledo.databindingbug.lib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import net.rafaeltoledo.databindingbug.lib.databinding.SampleBinding

class SampleActivity : AppCompatActivity() {

    private lateinit var binding: SampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.sample)
    }
}