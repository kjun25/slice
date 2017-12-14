/**
 *
 * Copyright (c) 2017-2017 SLICE project team (yhsuh@etri.re.kr)
 * http://slice.etri.re.kr
 *
 * This file is part of The SLICE components
 *
 * This Program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2, or (at your option)
 * any later version.
 *
 * This Program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with The SLICE components; see the file COPYING.  If not, see
 * <http://www.gnu.org/licenses/>.
 */
package org.etri.slice.devices.carseat;

import org.apache.edgent.topology.TStream;
import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Invalidate;
import org.apache.felix.ipojo.annotations.Property;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.Validate;
import org.etri.slice.api.device.Device;
import org.etri.slice.commons.car.event.SeatPosture;
import org.etri.slice.core.device.AbstractDevice;

@Component(publicFactory=false, immediate=true)
@Provides
@Instantiate
public class CarSeatDevice extends AbstractDevice implements Device {

	@Property(name="groupId", value="org.etri.slice")
	public String groupId;
	
	@Property(name="artifactId", value="org.etri.slice.rules.carseat")
	public String artifactId;	
	
	@Property(name="version", value="0.0.1")
	public String version;

	@Override
	public String getGroupId() {
		return groupId;
	}

	@Override
	public String getArtifactId() {
		return artifactId;
	}

	@Override
	public String getVersion() {
		return version;
	}
	
	@Validate
	public void setUp() {
//		TStream<SeatPosture> seatPostures = (TStream<SeatPosture>) getTStream("seat_posture");
//		seatPostures.filter(posture -> posture.getHeight() > 10.0 );
//		seatPostures.filter(posture -> posture.getPosition() > 20.0 );
//		seatPostures.filter(posture -> posture.getTilt() > 30.0 );
	}
	
	@Invalidate
	public void tearDown() {
		
	}
}
