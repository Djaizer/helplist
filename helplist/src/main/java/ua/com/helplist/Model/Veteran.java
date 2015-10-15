package ua.com.helplist.Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;

import com.sun.istack.internal.Nullable;

@DiscriminatorValue("veteran")
public class Veteran extends Person {
	@Column(name = "story")
	@Nullable
	private String story;
}
