package io.onedev.server.manager.impl;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.onedev.server.manager.IssueWatchManager;
import io.onedev.server.model.IssueWatch;
import io.onedev.server.persistence.dao.AbstractEntityManager;
import io.onedev.server.persistence.dao.Dao;

@Singleton
public class DefaultIssueWatchManager extends AbstractEntityManager<IssueWatch> 
		implements IssueWatchManager {

	@Inject
	public DefaultIssueWatchManager(Dao dao) {
		super(dao);
	}
}
