package com.squads.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.squads.dto.Messages;

@Service
public class MessageService implements IMessageService {
	
	private MessageServiceStub stub = new MessageServiceStub();
	@Override
	public List<Messages> fetchAll() {
		// TODO Auto-generated method stub
		return stub.allMessages;
	}
	@Override
	public Messages save(Messages message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Messages fetch() {
		// TODO Auto-generated method stub
		return null;
	}
}
