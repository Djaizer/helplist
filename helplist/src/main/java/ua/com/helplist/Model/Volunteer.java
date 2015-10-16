package ua.com.helplist.Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ua.com.helplist.Utils.Constants;

@Entity
@DiscriminatorValue("volunteer")
public class Volunteer extends Person {
	@Column(name = "role")
	private Constants.Role role;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "team_id")
	private Team team;

	public Constants.Role getRole() {
		return role;
	}

	public void setRole(Constants.Role role) {
		this.role = role;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
