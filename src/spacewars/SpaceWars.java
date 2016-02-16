package spacewars;

import java.io.File;

import diveengine2d.Engine;

public class SpaceWars {
	public static void main(String[] args) {
		test("Space Wars");
	}
	
	private static void test(String game) {
		final String gamePath = "" + new File(SpaceWars.class.getProtectionDomain().getCodeSource()
			.getLocation().getPath().replace("%20", " ") + game).getPath();
		
		Engine engine = new Engine(gamePath);
	}
}
