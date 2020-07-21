package pattern.mvc.impl;

import pattern.mvc.BeatModelInterface;
import pattern.mvc.ControllerInterface;

public class Controller implements ControllerInterface {

	BeatModelInterface model;
	DJView view;

	public Controller(BeatModelInterface model) {
		this.model = model;
		this.view = new DJView(model, this);
		view.createView();
		view.dissableStop();
		view.enableStart();
		model.initialize();
	}

	@Override
	public void start() {
		model.on();
		view.dissableStart();
		view.enableStop();
	}

	@Override
	public void stop() {
		model.off();
		view.dissableStop();
		view.enableStart();
	}

	@Override
	public void increase() {
		model.setBPM(model.getBPM() + 1);

	}

	@Override
	public void decrease() {
		model.setBPM(model.getBPM() - 1);

	}

	@Override
	public void setBPM(int bpm) {
		model.setBPM(bpm);

	}

}
