package org.testvg.POJO_Data;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class TeamDetails {

	private String name;
	private String location;
	private List<PlayerDetails> player;


	@Data
	@Builder(toBuilder = true)
	public static class PlayerDetails {

		private String name;
		private String country;
		private String role;
		private String price_in_crores;

	}

	
}
