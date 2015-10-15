package ua.com.helplist.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import ua.com.helplist.Utils.Constants;

@DiscriminatorValue("admin")
public class Admin extends Person{
	@Enumerated(EnumType.STRING)
	private Constants.Role role;
}
