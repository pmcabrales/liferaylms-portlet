/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.lms.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * The utility for the learning activity try remote service. This utility wraps {@link com.liferay.lms.service.impl.LearningActivityTryServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author TLS
 * @see LearningActivityTryService
 * @see com.liferay.lms.service.base.LearningActivityTryServiceBaseImpl
 * @see com.liferay.lms.service.impl.LearningActivityTryServiceImpl
 * @generated
 */
public class LearningActivityTryServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.lms.service.impl.LearningActivityTryServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.liferay.lms.model.LearningActivityTry createLearningActivityTry(
		long actId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().createLearningActivityTry(actId, userId);
	}

	public static com.liferay.lms.model.LearningActivityTry createLearningActivityTry(
		long actId, long userId, int score, double position, int plays)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .createLearningActivityTry(actId, userId, score, position,
			plays);
	}

	public static java.util.List<com.liferay.lms.model.LearningActivityTry> getLearningActivityTries(
		long actId, java.lang.String login)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLearningActivityTries(actId, login);
	}

	public static void clearService() {
		_service = null;
	}

	public static LearningActivityTryService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LearningActivityTryService.class.getName());

			if (invokableService instanceof LearningActivityTryService) {
				_service = (LearningActivityTryService)invokableService;
			}
			else {
				_service = new LearningActivityTryServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(LearningActivityTryServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(LearningActivityTryService service) {
	}

	private static LearningActivityTryService _service;
}