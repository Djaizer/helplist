package ua.com.helplist.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class BaseObject {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
}
