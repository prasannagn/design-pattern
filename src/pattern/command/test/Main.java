package pattern.command.test;

import pattern.command.impl.Light;
import pattern.command.impl.LightOffCommand;
import pattern.command.impl.LightOnCommand;
import pattern.command.impl.RemoteController;
import pattern.command.intfr.Command;

public class Main {

	public static void main(String[] args) {
		RemoteController remoteController = new RemoteController();
		Light light = new Light();
		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);
		remoteController.setSlot(1, lightOnCommand, lightOffCommand);

		remoteController.onButtonCliked(1);
		remoteController.offButtonCliked(1);
		remoteController.unDoButtonCliked();
		remoteController.onButtonCliked(2);
		remoteController.unDoButtonCliked();
		remoteController.unDoButtonCliked();
		remoteController.unDoButtonCliked();
		remoteController.unDoButtonCliked();

	}
}
