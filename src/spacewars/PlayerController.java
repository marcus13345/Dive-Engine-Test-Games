package spacewars;

import java.awt.event.KeyEvent;

import diveengine2d.DiveScript;
import diveengine2d.Input;
import diveengine2d.RigidBody;

public class PlayerController extends DiveScript {
	public String message = null;
	public float speed;
	
	private RigidBody rigidBody;
	
	public void create() {
		rigidBody = (RigidBody) entity.components.get(2);
	}
	
	public void update() {
		if(Input.getKeyDown(KeyEvent.VK_W))
			rigidBody.dy += -1 * speed;
		if(Input.getKeyDown(KeyEvent.VK_S))
			rigidBody.dy += 1 * speed;
		if(Input.getKeyDown(KeyEvent.VK_A))
			rigidBody.dx += -1 * speed;
		if(Input.getKeyDown(KeyEvent.VK_D))
			rigidBody.dx += 1 * speed;
	}
}
