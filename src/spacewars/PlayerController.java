package spacewars;

import java.awt.Color;
import java.awt.event.KeyEvent;

import diveengine2d.DiveScript;
import diveengine2d.Input;
import diveengine2d.RectRenderer;
import diveengine2d.RigidBody;

public class PlayerController extends DiveScript {
	public String message = null;
	public float speed;

	private RigidBody rigidBody;
	private RectRenderer renderer;
	
	public void create() {
		rigidBody = entity.getComponent(RigidBody.class);
		renderer = entity.getComponent(RectRenderer.class);
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
		renderer.color = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	}
}
