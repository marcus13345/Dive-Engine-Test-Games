package spacewars;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import diveengine2d.DiveScript;
import diveengine2d.Input;
import diveengine2d.RectRenderer;
import diveengine2d.RigidBody;
import diveengine2d.Time;

public class PlayerController extends DiveScript implements KeyListener {
	public String message = null;
	public float speed;

	private RigidBody rigidBody;
	private RectRenderer renderer;
	
	public void create() {
		rigidBody = entity.getComponent(RigidBody.class);
		renderer = entity.getComponent(RectRenderer.class);
		Input.addKeyListener(this);
	}
	
	public void update() {
		if(Input.getKeyDown(KeyEvent.VK_W))
			rigidBody.dy += -1 * speed * Time.deltaTime;
		if(Input.getKeyDown(KeyEvent.VK_S))
			rigidBody.dy += 1 * speed * Time.deltaTime;
		if(Input.getKeyDown(KeyEvent.VK_A))
			rigidBody.dx += -1 * speed * Time.deltaTime;
		if(Input.getKeyDown(KeyEvent.VK_D))
			rigidBody.dx += 1 * speed * Time.deltaTime;
		
		//if()
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
}