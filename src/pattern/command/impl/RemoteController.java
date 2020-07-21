package pattern.command.impl;

import java.util.Stack;

import pattern.command.intfr.Command;

public class RemoteController {
	Command[] onCommands;
	Command[] offCommands;
	Stack<Command> undo;
	public RemoteController() {
		undo = new Stack<Command>();
		onCommands = new Command[5];
		offCommands = new Command[5];
		Command noCommand = new NoCommand();
		for(int i = 0; i < 5; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undo.push(noCommand);
	}
	public void setSlot(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonCliked(int slot){
		undo.push(onCommands[slot]);
		onCommands[slot].execute();
	}
	
	public void offButtonCliked(int slot){
		undo.push(offCommands[slot]);
		offCommands[slot].execute();
	}
	public void unDoButtonCliked(){
		Command command = null;
		if(!undo.isEmpty()){
			command = undo.pop();
		}
		if(null != command){
			command.undo();
		}else{
			System.out.println("Empty");
		}
	}
	
	
}
