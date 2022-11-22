package com.squad.service;

import java.util.List;

import com.squads.dto.Messages;

public interface IMessageService {

	public List<Messages>fetchAll();
	
	public Messages save(Messages message);
	
	public Messages fetch();
}
