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

package com.liferay.lms.model.impl;

import com.liferay.lms.model.ActivityTriesDeleted;
import com.liferay.lms.model.ActivityTriesDeletedModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ActivityTriesDeleted service. Represents a row in the &quot;Lms_ActivityTriesDeleted&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.lms.model.ActivityTriesDeletedModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ActivityTriesDeletedImpl}.
 * </p>
 *
 * @author TLS
 * @see ActivityTriesDeletedImpl
 * @see com.liferay.lms.model.ActivityTriesDeleted
 * @see com.liferay.lms.model.ActivityTriesDeletedModel
 * @generated
 */
public class ActivityTriesDeletedModelImpl extends BaseModelImpl<ActivityTriesDeleted>
	implements ActivityTriesDeletedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a activity tries deleted model instance should use the {@link com.liferay.lms.model.ActivityTriesDeleted} interface instead.
	 */
	public static final String TABLE_NAME = "Lms_ActivityTriesDeleted";
	public static final Object[][] TABLE_COLUMNS = {
			{ "activityTriesDeletedId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "actId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "startDate", Types.TIMESTAMP },
			{ "endDate", Types.TIMESTAMP },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table Lms_ActivityTriesDeleted (activityTriesDeletedId LONG not null primary key,groupId LONG,actId LONG,userId LONG,startDate DATE null,endDate DATE null,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table Lms_ActivityTriesDeleted";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.lms.model.ActivityTriesDeleted"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.lms.model.ActivityTriesDeleted"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.lms.model.ActivityTriesDeleted"),
			true);
	public static long ACTID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long STATUS_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.lms.model.ActivityTriesDeleted"));

	public ActivityTriesDeletedModelImpl() {
	}

	public long getPrimaryKey() {
		return _activityTriesDeletedId;
	}

	public void setPrimaryKey(long primaryKey) {
		setActivityTriesDeletedId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_activityTriesDeletedId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return ActivityTriesDeleted.class;
	}

	public String getModelClassName() {
		return ActivityTriesDeleted.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("activityTriesDeletedId", getActivityTriesDeletedId());
		attributes.put("groupId", getGroupId());
		attributes.put("actId", getActId());
		attributes.put("userId", getUserId());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long activityTriesDeletedId = (Long)attributes.get(
				"activityTriesDeletedId");

		if (activityTriesDeletedId != null) {
			setActivityTriesDeletedId(activityTriesDeletedId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long actId = (Long)attributes.get("actId");

		if (actId != null) {
			setActId(actId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	public long getActivityTriesDeletedId() {
		return _activityTriesDeletedId;
	}

	public void setActivityTriesDeletedId(long activityTriesDeletedId) {
		_activityTriesDeletedId = activityTriesDeletedId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getActId() {
		return _actId;
	}

	public void setActId(long actId) {
		_columnBitmask |= ACTID_COLUMN_BITMASK;

		if (!_setOriginalActId) {
			_setOriginalActId = true;

			_originalActId = _actId;
		}

		_actId = actId;
	}

	public long getOriginalActId() {
		return _originalActId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ActivityTriesDeleted.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ActivityTriesDeleted toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ActivityTriesDeleted)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		ActivityTriesDeletedImpl activityTriesDeletedImpl = new ActivityTriesDeletedImpl();

		activityTriesDeletedImpl.setActivityTriesDeletedId(getActivityTriesDeletedId());
		activityTriesDeletedImpl.setGroupId(getGroupId());
		activityTriesDeletedImpl.setActId(getActId());
		activityTriesDeletedImpl.setUserId(getUserId());
		activityTriesDeletedImpl.setStartDate(getStartDate());
		activityTriesDeletedImpl.setEndDate(getEndDate());
		activityTriesDeletedImpl.setStatus(getStatus());

		activityTriesDeletedImpl.resetOriginalValues();

		return activityTriesDeletedImpl;
	}

	public int compareTo(ActivityTriesDeleted activityTriesDeleted) {
		long primaryKey = activityTriesDeleted.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		ActivityTriesDeleted activityTriesDeleted = null;

		try {
			activityTriesDeleted = (ActivityTriesDeleted)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = activityTriesDeleted.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		ActivityTriesDeletedModelImpl activityTriesDeletedModelImpl = this;

		activityTriesDeletedModelImpl._originalGroupId = activityTriesDeletedModelImpl._groupId;

		activityTriesDeletedModelImpl._setOriginalGroupId = false;

		activityTriesDeletedModelImpl._originalActId = activityTriesDeletedModelImpl._actId;

		activityTriesDeletedModelImpl._setOriginalActId = false;

		activityTriesDeletedModelImpl._originalStatus = activityTriesDeletedModelImpl._status;

		activityTriesDeletedModelImpl._setOriginalStatus = false;

		activityTriesDeletedModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ActivityTriesDeleted> toCacheModel() {
		ActivityTriesDeletedCacheModel activityTriesDeletedCacheModel = new ActivityTriesDeletedCacheModel();

		activityTriesDeletedCacheModel.activityTriesDeletedId = getActivityTriesDeletedId();

		activityTriesDeletedCacheModel.groupId = getGroupId();

		activityTriesDeletedCacheModel.actId = getActId();

		activityTriesDeletedCacheModel.userId = getUserId();

		Date startDate = getStartDate();

		if (startDate != null) {
			activityTriesDeletedCacheModel.startDate = startDate.getTime();
		}
		else {
			activityTriesDeletedCacheModel.startDate = Long.MIN_VALUE;
		}

		Date endDate = getEndDate();

		if (endDate != null) {
			activityTriesDeletedCacheModel.endDate = endDate.getTime();
		}
		else {
			activityTriesDeletedCacheModel.endDate = Long.MIN_VALUE;
		}

		activityTriesDeletedCacheModel.status = getStatus();

		return activityTriesDeletedCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{activityTriesDeletedId=");
		sb.append(getActivityTriesDeletedId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", actId=");
		sb.append(getActId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.liferay.lms.model.ActivityTriesDeleted");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>activityTriesDeletedId</column-name><column-value><![CDATA[");
		sb.append(getActivityTriesDeletedId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actId</column-name><column-value><![CDATA[");
		sb.append(getActId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ActivityTriesDeleted.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ActivityTriesDeleted.class
		};
	private long _activityTriesDeletedId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _actId;
	private long _originalActId;
	private boolean _setOriginalActId;
	private long _userId;
	private String _userUuid;
	private Date _startDate;
	private Date _endDate;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _columnBitmask;
	private ActivityTriesDeleted _escapedModelProxy;
}