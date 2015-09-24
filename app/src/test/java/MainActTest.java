import android.os.Build;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import br.ufrj.caronae.BuildConfig;
import br.ufrj.caronae.acts.MainAct;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActTest {
    private MainAct activity;

    @Before
    public void setup() {
        // Convenience method to run MainActivity through the Activity Lifecycle methods:
        // onCreate(...) => onStart() => onPostCreate(...) => onResume()
        activity = Robolectric.setupActivity(MainAct.class);
    }

    @Test
    public void validateTextViewContent() {
        //TextView tvHelloWorld = (TextView) activity.findViewById(R.id.hello);
        //assertNotNull("TextView could not be found", tvHelloWorld);
        //assertTrue("TextView contains incorrect text",
                //"Hello world!".equals(tvHelloWorld.getText().toString()));
    }

}