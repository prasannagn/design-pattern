package pattern.mvc.test;

import pattern.mvc.BeatModelInterface;
import pattern.mvc.impl.BeatModel;
import pattern.mvc.impl.Controller;


public class Main {
	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		new Controller(model);
	}
}
