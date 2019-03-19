package net.rafaeltoledo.databindingbug.lib;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import net.rafaeltoledo.databindingbug.lib.databinding.SampleBinding;

public class SampleActivity extends AppCompatActivity {

    private SampleBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.sample);
    }
}
