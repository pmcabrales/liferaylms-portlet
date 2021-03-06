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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the course local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author TLS
 * @see CourseLocalServiceUtil
 * @see com.liferay.lms.service.base.CourseLocalServiceBaseImpl
 * @see com.liferay.lms.service.impl.CourseLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CourseLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CourseLocalServiceUtil} to access the course local service. Add custom service methods to {@link com.liferay.lms.service.impl.CourseLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the course to the database. Also notifies the appropriate model listeners.
	*
	* @param course the course
	* @return the course that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.Course addCourse(
		com.liferay.lms.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new course with the primary key. Does not add the course to the database.
	*
	* @param courseId the primary key for the new course
	* @return the new course
	*/
	public com.liferay.lms.model.Course createCourse(long courseId);

	/**
	* Deletes the course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param courseId the primary key of the course
	* @return the course that was removed
	* @throws PortalException if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.Course deleteCourse(long courseId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the course from the database. Also notifies the appropriate model listeners.
	*
	* @param course the course
	* @return the course that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.Course deleteCourse(
		com.liferay.lms.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.lms.model.Course fetchCourse(long courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course with the primary key.
	*
	* @param courseId the primary key of the course
	* @return the course
	* @throws PortalException if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.lms.model.Course getCourse(long courseId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course with the UUID in the group.
	*
	* @param uuid the UUID of course
	* @param groupId the group id of the course
	* @return the course
	* @throws PortalException if a course with the UUID in the group could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.lms.model.Course getCourseByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the courses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of courses
	* @param end the upper bound of the range of courses (not inclusive)
	* @return the range of courses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getCourses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of courses.
	*
	* @return the number of courses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCoursesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param course the course
	* @return the course that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.Course updateCourse(
		com.liferay.lms.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param course the course
	* @param merge whether to merge the course with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the course that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.Course updateCourse(
		com.liferay.lms.model.Course course, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getCoursesOfGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getOpenCoursesOfGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getCourses(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public long countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.lms.model.Course fetchByGroupCreatedId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course addCourse(java.lang.String title,
		java.lang.String description, java.lang.String summary,
		java.lang.String friendlyURL, java.util.Locale locale,
		java.util.Date createDate, java.util.Date startDate,
		java.util.Date endDate, long layoutSetPrototypeId, int typesite,
		com.liferay.portal.service.ServiceContext serviceContext,
		long calificationType, int maxUsers, boolean isFromClone)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getUserCourses(
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getOpenedUserCourses(
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getOpenedUserCourses(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getPublicCoursesByCompanyId(
		java.lang.Long companyId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getPublicCoursesByCompanyId(
		java.lang.Long companyId, int start, int end);

	public com.liferay.lms.model.Course addCourse(java.lang.String title,
		java.lang.String description, java.lang.String summary,
		java.lang.String friendlyURL, java.util.Locale locale,
		java.util.Date createDate, java.util.Date startDate,
		java.util.Date endDate, long layoutSetPrototypeId, int typesite,
		long CourseEvalId, long calificationType, int maxUsers,
		com.liferay.portal.service.ServiceContext serviceContext,
		boolean isfromClone)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course addCourse(java.lang.String title,
		java.lang.String description, java.lang.String summary,
		java.lang.String friendlyURL, java.util.Locale locale,
		java.util.Date createDate, java.util.Date startDate,
		java.util.Date endDate, java.util.Date executionStartDate,
		java.util.Date executionEndDate, long layoutSetPrototypeId,
		int typesite, long CourseEvalId, long calificationType, int maxUsers,
		com.liferay.portal.service.ServiceContext serviceContext,
		boolean isfromClone)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course addCourse(
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.lang.String description, java.lang.String summary,
		java.lang.String friendlyURL, java.util.Locale locale,
		java.util.Date createDate, java.util.Date startDate,
		java.util.Date endDate, java.util.Date executionStartDate,
		java.util.Date executionEndDate, long layoutSetPrototypeId,
		int typesite, long CourseEvalId, long calificationType, int maxUsers,
		com.liferay.portal.service.ServiceContext serviceContext,
		boolean isfromClone)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course addCourse(java.lang.String title,
		java.lang.String description, java.lang.String summary,
		java.lang.String friendlyURL, java.util.Locale locale,
		java.util.Date createDate, java.util.Date startDate,
		java.util.Date endDate,
		com.liferay.portal.service.ServiceContext serviceContext,
		long calificationType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course addCourse(java.lang.String title,
		java.lang.String description, java.lang.String friendlyURL,
		java.util.Locale locale, java.util.Date createDate,
		java.util.Date startDate, java.util.Date endDate,
		com.liferay.portal.service.ServiceContext serviceContext,
		long calificationType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void setVisible(long courseId, boolean visible)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course modCourse(
		com.liferay.lms.model.Course course, java.lang.String summary,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course modCourse(
		com.liferay.lms.model.Course course,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course modCourse(
		com.liferay.lms.model.Course course, java.lang.String summary,
		com.liferay.portal.service.ServiceContext serviceContext,
		boolean visible)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course modCourse(
		com.liferay.lms.model.Course course, java.lang.String summary,
		com.liferay.portal.service.ServiceContext serviceContext,
		boolean visible, boolean allowDuplicateName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course closeCourse(long courseId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.Course openCourse(long courseId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public boolean existsCourseName(long companyId, long classNameId,
		long liveGroupId, java.lang.String name);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.lms.model.Course getCourseByGroupCreatedId(
		long groupCreatedId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean existsCourseName(java.lang.Long companyId,
		java.lang.Long courseId, java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.lms.model.Course> findByCompanyId(
		java.lang.Long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStudentsFromCourseCount(long courseId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStudentsFromCourseCount(long courseId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStudentsFromCourseCount(long courseId, long teamId,
		java.lang.String firstName, java.lang.String lastName,
		java.lang.String screeName, java.lang.String emailAddress,
		boolean andComparator)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.User> getStudentsFromCourse(
		com.liferay.lms.model.Course course);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.User> getStudentsFromCourse(
		long companyId, long courseGroupCreatedId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.User> getStudentsFromCourse(
		long companyId, long courseGroupCreatedId, long teamId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.User> getStudentsFromCourse(
		long companyId, long courseGroupCreatedId, int start, int end,
		long teamId, java.lang.String firstName, java.lang.String lastName,
		java.lang.String screenName, java.lang.String emailAddress,
		boolean andOperator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.User> getTeachersFromCourse(
		long courseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.User> getTeachersFromCourse(
		com.liferay.lms.model.Course course, long teacherRoleId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getTeachersAndEditorsIdsFromCourse(
		com.liferay.lms.model.Course course);

	/**
	* Devuelve los profesores de un curso teniendo en cuenta si el usuario pertenece a algÃºn equipo, si pertenece
	* a algÃºn equipo, devuelve los profesores de ese equipo. Si no los equipos a los que pertenece no tienen ningÃºn
	* profesor o no pertenece a ningÃºn equipo devuelve todos los profesores del curso
	*
	* @param course
	* @param teacherRoleId
	* @param userId
	* @return List<User> Lista de usuarios profesores
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.User> getTeachersFromCourseTeams(
		com.liferay.lms.model.Course course, long teacherRoleId, long userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getByTitleStatusCategoriesTags(
		java.lang.String freeText, int status, long[] categories, long[] tags,
		long companyId, long groupId, long userId, java.lang.String language,
		boolean isAdmin, boolean andOperator, int start, int end);

	public int countByTitleStatusCategoriesTags(java.lang.String freeText,
		int status, long[] categories, long[] tags, long companyId,
		long groupId, long userId, java.lang.String language, boolean isAdmin,
		boolean andOperator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getParentCoursesByTitleStatusCategoriesTags(
		java.lang.String freeText, int status, long[] categories, long[] tags,
		long companyId, long groupId, long userId, java.lang.String language,
		boolean isAdmin, boolean andOperator, int start, int end);

	public int countParentCoursesByTitleStatusCategoriesTags(
		java.lang.String freeText, int status, long[] categories, long[] tags,
		long companyId, long groupId, long userId, java.lang.String language,
		boolean isAdmin, boolean andOperator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getParentCoursesByTitleStatusCategoriesTagsTemplates(
		java.lang.String freeText, int status, long[] categories, long[] tags,
		java.lang.String templates, long companyId, long groupId, long userId,
		java.lang.String language, boolean isAdmin, boolean andOperator,
		int start, int end);

	public int countParentCoursesByTitleStatusCategoriesTagsTemplates(
		java.lang.String freeText, int status, long[] categories, long[] tags,
		java.lang.String templates, long companyId, long groupId, long userId,
		java.lang.String language, boolean isAdmin, boolean andOperator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getChildCoursesByTitle(
		java.lang.String freeText, long parentCourseId, int status,
		long companyId, long groupId, long userId, java.lang.String language,
		boolean isAdmin, boolean andOperator, int start, int end);

	public int countChildCoursesByTitle(java.lang.String freeText,
		long parentCourseId, int status, long companyId, long groupId,
		long userId, java.lang.String language, boolean isAdmin,
		boolean andOperator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.User> getStudents(
		long courseId, long companyId, java.lang.String screenName,
		java.lang.String firstName, java.lang.String lastName,
		java.lang.String emailAddress, boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator comparator);

	public int countStudents(long courseId, long companyId,
		java.lang.String screenName, java.lang.String firstName,
		java.lang.String lastName, java.lang.String emailAddress,
		boolean andOperator);

	public int countStudentsStatus(long courseId, long companyId,
		java.lang.String screenName, java.lang.String firstName,
		java.lang.String lastName, java.lang.String emailAddress, int status,
		boolean andOperator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getCoursesCatalogByTitleCategoriesTags(
		java.lang.String freeText, long[] categories, long[] tags,
		long companyId, long groupId, long userId, java.lang.String language,
		int start, int end);

	public int countCoursesCatalogByTitleCategoriesTags(
		java.lang.String freeText, long[] categories, long[] tags,
		long companyId, long groupId, long userId, java.lang.String language);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<java.lang.Long> getCatalogCoursesAssetTags(
		java.lang.String freeText, long[] categories, long companyId,
		long groupId, long userId, java.lang.String language);

	public java.util.HashMap<java.lang.Long, java.lang.Long> countCategoryCourses(
		java.lang.String freeText, long[] categories, long[] tags,
		long companyId, long groupId, long userId, java.lang.String language);

	public java.util.HashMap<java.lang.Long, java.lang.Long> countTagCourses(
		java.lang.String freeText, long[] categories, long[] tags,
		long companyId, long groupId, long userId, java.lang.String language);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.views.CourseResultView> getMyCourses(
		long groupId, long userId,
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		java.lang.String orderByColumn, java.lang.String orderByType,
		int start, int end);

	public int countMyCourses(long groupId, long userId,
		com.liferay.portal.theme.ThemeDisplay themeDisplay);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasUserTries(long courseId, long userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getPublicCoursesByCompanyId(
		java.lang.Long companyId, int limit);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getChildCourses(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getChildCourses(
		long courseId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getOpenOrRestrictedChildCourses(
		long courseId);

	public int countChildCourses(long courseId);

	public int countOpenOrRestrictedChildCourses(long courseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.lms.model.Course> getCoursesParents(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addStudentToCourseWithDates(long courseId, long userId,
		java.util.Date allowStartDate, java.util.Date allowFinishDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void editUserInscriptionDates(long courseId, long userId,
		java.util.Date allowStartDate, java.util.Date allowFinishDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Se van a realizar las siguientes comprobaciones:
	* - Curso cerrado
	* - Que pertenezcas a la comunidad
	* - Que tengas permiso para acceder al curso
	* - Comprobar que tenga una convocatoria en fecha
	* - Que el usuario tenga fechas propias para realizarlo y estÃ©n en fecha
	*
	* @param courseId Id el curso
	* @param user Usuario
	* @return true si el curso estÃ¡ bloqueado, false en caso contrario
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean isLocked(com.liferay.lms.model.Course course,
		com.liferay.portal.model.User user);

	/**
	* Comprueba si un usuario puede acceder a los cursos/modulos/actividades bloqueadas
	*
	* @param groupCreatedId id del grupo creado para el curso
	* @param user usuario
	* @return true en caso de que pueda acceder a bloqueados
	*/
	public boolean canAccessLock(long groupCreatedId,
		com.liferay.portal.model.User user);

	/**
	* Returns the last module date in course, because the course end date is for enrollments.
	*
	* @param courseId Course Identifier
	* @return Course last module date.
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Date getLastModuleDateInCourse(long courseId);

	/**
	* Returns the first module date in course, because the course end date is for enrollments.
	*
	* @param courseId Course Identifier
	* @return Course last module date.
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Date getFirstModuleDateInCourse(long courseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getImageURL(com.liferay.lms.model.Course course,
		com.liferay.portal.theme.ThemeDisplay themeDisplay);

	/**
	* Service that validates the course inscription as it is validated in web.
	*
	* @param courseId
	* @param userId
	* @return ok or error and the error description.
	* @throws PortalException
	* @throws SystemException
	*/
	public java.lang.String addStudentToCourseByUserId(long courseId,
		long userId, long teamId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @param userId
	* @param teamId
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public boolean validateAddUserToCourse(long groupId, long userId,
		long teamId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Group> getDistinctCourseGroups(
		long companyId);
}