package pattern.mvc.impl;

import java.util.ArrayList;
import java.util.List;

import pattern.mvc.BPMObserver;
import pattern.mvc.BeatModelInterface;
import pattern.mvc.BeatObserver;


public class BeatModel implements BeatModelInterface {

	private List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	private List<BPMObserver> BPMObservers = new ArrayList<BPMObserver>();
	private int bpm = 0;

	public void initialize() {

	}

	public void on() {
		setBPM(90);
	}

	public void off() {
		setBPM(0);
	}

	public void setBPM(int bpm) {
		this.bpm = bpm;
		notifyBPMObservers();
	}

	public int getBPM() {
		return bpm;
	}

	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	public void removeObserver(BeatObserver o) {
		beatObservers.remove(o);
	}

	public void registerObserver(BPMObserver o) {
		BPMObservers.add(o);
	}

	public void removeObserver(BPMObserver o) {
		BPMObservers.remove(o);
	}

	/*private void notifyBeatObservers() {
		for (BeatObserver beatObserver : beatObservers) {
			beatObserver.notifyBeat();
		}
	}*/

	private void notifyBPMObservers() {
		for (BPMObserver BPMObserver : BPMObservers) {
			BPMObserver.notifyBPM();
		}
	}
}
