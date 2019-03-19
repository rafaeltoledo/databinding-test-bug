package net.rafaeltoledo.databindingbug.lib;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SampleTest {

    @Test
    public void run() throws InterruptedException {
        ActivityScenario.launch(SampleActivity.class);
        Thread.sleep(2_000);
    }
}
