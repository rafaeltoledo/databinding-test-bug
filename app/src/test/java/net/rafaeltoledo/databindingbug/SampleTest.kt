package net.rafaeltoledo.databindingbug

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import net.rafaeltoledo.databindingbug.lib.SampleActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SampleTest {

    @Test
    fun run() {
        ActivityScenario.launch(SampleActivity::class.java)
        Thread.sleep(2_000)
    }
}
