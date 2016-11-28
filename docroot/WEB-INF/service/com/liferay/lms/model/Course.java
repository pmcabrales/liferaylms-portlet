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

package com.liferay.lms.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Course service. Represents a row in the &quot;Lms_Course&quot; database table, with each column mapped to a property of this class.
 *
 * @author TLS
 * @see CourseModel
 * @see com.liferay.lms.model.impl.CourseImpl
 * @see com.liferay.lms.model.impl.CourseModelImpl
 * @generated
 */
public interface Course extends CourseModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.lms.model.impl.CourseImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public com.liferay.lms.model.Course getParentCourse()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void setTitle(java.lang.String title);

	public void setTitle(java.lang.String title, java.util.Locale locale);

	public void setTitle(java.lang.String title, java.util.Locale locale,
		java.util.Locale defaultLocale);

	public java.lang.String getImageURL(
		com.liferay.portal.theme.ThemeDisplay themeDisplay);

	public double getAverageScore();

	public java.util.List<com.liferay.portlet.asset.model.AssetCategory> getAssetCategoryIds();

	public java.util.List<com.liferay.portlet.asset.model.AssetTag> getAssetTagIds();

	public com.liferay.portal.model.Group getGroup();
}