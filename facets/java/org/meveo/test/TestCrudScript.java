package org.meveo.test;

import org.meveo.service.script.Script;
import org.meveo.service.storage.RepositoryService;

import org.meveo.api.persistence.CrossStorageApi;
import org.meveo.model.customEntities.EntityWithScript;
import org.meveo.model.customEntities.CrudEventListenerScript;

public class TestCrudScript extends Script implements CrudEventListenerScript<EntityWithScript> {

	private CrossStorageApi crossStorageApi;
	private RepositoryService rService;

	public TestCrudScript() {
		crossStorageApi = getCDIBean(CrossStorageApi.class);
		rService = getCDIBean(RepositoryService.class);
	}

	public Class<EntityWithScript> getEntityClass() {
		return EntityWithScript.class;
	}

	/**
	 * Called just before entity persistence
	 * 
	 * @param entity entity being persisted
	 */
	public void prePersist(EntityWithScript entity) {
      entity.setName("overriden-by-script");
	}

	/**
	 * Called just before entity update
	 * 
	 * @param entity entity being updated
	 */
	public void preUpdate(EntityWithScript entity) {
	}

	/**
	 * Called just before entity removal
	 * 
	 * @param entity entity being removed
	 */
	public void preRemove(EntityWithScript entity) {
		
	}

	/**
	 * Called just after entity persistence
	 * 
	 * @param entity persisted entity
	 */
	public void postPersist(EntityWithScript entity) {
		
	}

	/**
	 * Called just after entity update
	 * 
	 * @param entity updated entity
	 */
	public void postUpdate(EntityWithScript entity) {
		
	}

	/**
	 * Called just after entity removal
	 * 
	 * @param entity removed entity
	 */
	public void postRemove(EntityWithScript entity) {
		
	}
}