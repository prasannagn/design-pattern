package pattern.mvc.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pattern.mvc.BPMObserver;
import pattern.mvc.BeatModelInterface;
import pattern.mvc.BeatObserver;
import pattern.mvc.ControllerInterface;


public class DJView implements  BeatObserver, BPMObserver {

	BeatModelInterface model;
	ControllerInterface controller;
	JFrame viewFrame;
	JPanel viewPanel;
	JLabel bpmOutputLabel;

	JPanel BPMPanel;
	JLabel BPMLabel;
	JTextField BPMTestField;
	JButton setBPM;
	JButton increaseBPM;
	JButton decreaseBPM;
	JButton start;
	JButton stop;

	public DJView(BeatModelInterface model, ControllerInterface controller) {

		this.model = model;
		this.controller = controller;
		model.registerObserver((BeatObserver) this);
		model.registerObserver((BPMObserver) this);
	}

	public void createView() {
		viewFrame = new JFrame();
		viewFrame.setSize(1000, 500);
		viewPanel = new JPanel();
		viewPanel.setSize(500, 250);
		bpmOutputLabel = new JLabel("BPM:..");
		viewPanel.add(bpmOutputLabel);
		viewFrame.add(viewPanel);

		BPMPanel = new JPanel();
		BPMPanel.setSize(500, 250);
		BPMLabel = new JLabel("BPM");
		BPMTestField = new JTextField();
		BPMTestField.setText("0000");
		setBPM = new JButton("set");
		increaseBPM = new JButton("+");
		decreaseBPM = new JButton("-");
		start = new JButton("start");
		stop = new JButton("stop");

		BPMPanel.add(BPMLabel);
		BPMPanel.add(BPMTestField);
		BPMPanel.add(setBPM);
		BPMPanel.add(increaseBPM);
		BPMPanel.add(decreaseBPM);
		BPMPanel.add(start);
		BPMPanel.add(stop);
		viewFrame.add(BPMPanel);
		bind();
		viewFrame.setVisible(true);

	}

	private void bind() {
		setBPM.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				controller.setBPM(Integer.parseInt(BPMTestField.getText()));				
			}
		});
		
		increaseBPM.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				controller.increase();				
			}
		});
		
		decreaseBPM.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				controller.decrease();				
			}
		});
		start.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				controller.start();				
			}
		});
		stop.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				controller.stop();				
			}
		});
	}

	

	@Override
	public void notifyBPM() {
		int bpm = model.getBPM();
		BPMTestField.setText(""+bpm);
		bpmOutputLabel.setText("BPM:.." + bpm);
	}

	@Override
	public void notifyBeat() {
		int bpm = model.getBPM();
		bpmOutputLabel.setText("BPM:.." + bpm);

	}

	public void enableStop() {
		stop.setEnabled(true);
	}

	public void dissableStop() {
		stop.setEnabled(false);
	}

	public void enableStart() {
		start.setEnabled(true);
	}

	public void dissableStart() {
		start.setEnabled(false);
	}

}
