/**
 * Copyright (c) 2017-2017 SLICE project team (yhsuh@etri.re.kr)
 * http://slice.etri.re.kr
 *
 * This file is part of The ROOT project of SLICE components and applications
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
 * along with The ROOT project of SLICE components and applications; see the file COPYING.  If not, see
 * <http://www.gnu.org/licenses/>.
 */
package org.etri.slice.agents.car.pressuresensor.adaptor;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Invalidate;
import org.apache.felix.ipojo.annotations.Property;
import org.apache.felix.ipojo.annotations.Requires;
import org.apache.felix.ipojo.annotations.Validate;
import org.etri.slice.api.agent.Agent;
import org.etri.slice.api.inference.WorkingMemory;
import org.etri.slice.api.perception.EventStream;
import org.etri.slice.core.perception.MqttEventSubscriber;
import org.etri.slice.agents.car.pressuresensor.stream.FullBodyDetectedStream;
import org.etri.slice.commons.car.event.FullBodyDetected;

@Component
@Instantiate
public class FullBodyDetectedAdaptor extends MqttEventSubscriber<FullBodyDetected> {
	
	private static final long serialVersionUID = 301667050938648092L;

	@Property(name="topic", value=FullBodyDetected.TOPIC)
	private String m_topic;
	
	@Property(name="url", value="tcp://129.254.88.119:1883")
	private String m_url;
	
	@Requires
	private WorkingMemory m_wm;

	@Requires
	private Agent m_agent;
	
	@Requires(from=FullBodyDetectedStream.SERVICE_NAME)
	private EventStream<FullBodyDetected> m_streaming;	
	
	protected  String getTopicName() {
		return m_topic;
	}
	
	protected String getMqttURL() {
		return m_url;
	}
	
	protected WorkingMemory getWorkingMemory() {
		return m_wm;
	}
	
	protected Agent getAgent() {
		return m_agent;
	}
	
	protected Class<?> getEventType() {
		return FullBodyDetected.class;
	}
	
	protected EventStream<FullBodyDetected> getEventStream() {
		return m_streaming;
	}	
		
	@Validate
	public void start() {
		super.start();
	}
	
	@Invalidate
	public void stop() {
		super.stop();
	}
}
