package com.squad.service;

import java.util.List;

import com.squads.dto.Messages;

public class MessageServiceStub {
	public List<Messages> allMessages;
	
	private void LoadData() {
		Messages test1 = new Messages("This is a test MEssage");
		Messages test2 = new Messages("This is a test MEssage 2");
		Messages test3 = new Messages("This is a test MEssage 3");
		Messages test4 = new Messages("Hey do you have anxiety prime???");
		Messages test5 = new Messages("huh yeah I do");
		Messages test6 = new Messages("Amazon*");
		Messages test7 = new Messages("... Yeah I have that too");


		allMessages.add(test1);
		allMessages.add(test2);
		allMessages.add(test3);
		allMessages.add(test4);
		allMessages.add(test5);
		allMessages.add(test6);
		allMessages.add(test7);

	}
}
