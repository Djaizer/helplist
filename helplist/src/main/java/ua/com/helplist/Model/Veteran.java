package ua.com.helplist.Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("veteran")
public class Veteran extends Person {
	@Column(name = "story")
	private String story;
}
