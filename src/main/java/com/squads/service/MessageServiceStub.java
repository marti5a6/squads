package com.squads.service;

import java.util.ArrayList;
import java.util.List;

import com.squads.dto.Messages;

public class MessageServiceStub {
	public List<Messages> allMessages  = LoadData();

	private List<Messages> LoadData() {
		List<Messages> stub = new ArrayList<Messages>();

		Messages test1 = new Messages("This is a test MEssage");
		Messages test2 = new Messages("This is a test MEssage 2");
		Messages test3 = new Messages("TExt MEssages through Service Works");
		Messages test4 = new Messages("Person 1: Hey do you have anxiety prime???");
		Messages test5 = new Messages("Person 2: huh yeah I do");
		Messages test6 = new Messages("Person 1: Amazon*");
		Messages test7 = new Messages("Person 2: ... Yeah I have that too");


		stub.add(test1);
		stub.add(test2);
		stub.add(test3);
		stub.add(test4);
		stub.add(test5);
		stub.add(test6);
		stub.add(test7);
		return stub;

	}
}
