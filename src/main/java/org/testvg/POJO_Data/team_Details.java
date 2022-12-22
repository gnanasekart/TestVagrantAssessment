package org.testvg.POJO_Data;

import java.util.List;

public class team_Details {
	
	
	private String name;
	private String location;
	private List<Object> player;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Object> getPlayer() {
		return player;
	}
	public void setPlayer(List<Object> player) {
		this.player = player;
	}
	
}
