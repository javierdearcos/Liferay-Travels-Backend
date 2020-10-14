/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.travels.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Trip service. Represents a row in the &quot;LiferayTravels_Trip&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.travels.model.impl.TripModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.travels.model.impl.TripImpl</code>.
 * </p>
 *
 * @author Javier de Arcos
 * @see Trip
 * @generated
 */
@ProviderType
public interface TripModel
	extends BaseModel<Trip>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a trip model instance should use the {@link Trip} interface instead.
	 */

	/**
	 * Returns the primary key of this trip.
	 *
	 * @return the primary key of this trip
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this trip.
	 *
	 * @param primaryKey the primary key of this trip
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this trip.
	 *
	 * @return the uuid of this trip
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this trip.
	 *
	 * @param uuid the uuid of this trip
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the trip ID of this trip.
	 *
	 * @return the trip ID of this trip
	 */
	public long getTripId();

	/**
	 * Sets the trip ID of this trip.
	 *
	 * @param tripId the trip ID of this trip
	 */
	public void setTripId(long tripId);

	/**
	 * Returns the name of this trip.
	 *
	 * @return the name of this trip
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this trip.
	 *
	 * @param name the name of this trip
	 */
	public void setName(String name);

	/**
	 * Returns the description of this trip.
	 *
	 * @return the description of this trip
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this trip.
	 *
	 * @param description the description of this trip
	 */
	public void setDescription(String description);

	/**
	 * Returns the starting date of this trip.
	 *
	 * @return the starting date of this trip
	 */
	public Date getStartingDate();

	/**
	 * Sets the starting date of this trip.
	 *
	 * @param startingDate the starting date of this trip
	 */
	public void setStartingDate(Date startingDate);

	/**
	 * Returns the image of this trip.
	 *
	 * @return the image of this trip
	 */
	@AutoEscape
	public String getImage();

	/**
	 * Sets the image of this trip.
	 *
	 * @param image the image of this trip
	 */
	public void setImage(String image);

	/**
	 * Returns the group ID of this trip.
	 *
	 * @return the group ID of this trip
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this trip.
	 *
	 * @param groupId the group ID of this trip
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this trip.
	 *
	 * @return the user ID of this trip
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this trip.
	 *
	 * @param userId the user ID of this trip
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this trip.
	 *
	 * @return the user uuid of this trip
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this trip.
	 *
	 * @param userUuid the user uuid of this trip
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this trip.
	 *
	 * @return the user name of this trip
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this trip.
	 *
	 * @param userName the user name of this trip
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the company ID of this trip.
	 *
	 * @return the company ID of this trip
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this trip.
	 *
	 * @param companyId the company ID of this trip
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this trip.
	 *
	 * @return the create date of this trip
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this trip.
	 *
	 * @param createDate the create date of this trip
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this trip.
	 *
	 * @return the modified date of this trip
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this trip.
	 *
	 * @param modifiedDate the modified date of this trip
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

}