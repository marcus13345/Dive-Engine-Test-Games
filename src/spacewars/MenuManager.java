package spacewars;

import diveengine2d.DiveScript;
import diveengine2d.SceneManager;

/**
 * Created by Marcus on 3/10/2016.
 */
public class MenuManager extends DiveScript {
    public void playClicked() {

        SceneManager.loadScene("game");

    }
}
