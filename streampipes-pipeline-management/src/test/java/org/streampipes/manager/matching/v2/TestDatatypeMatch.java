/*
 * Copyright 2018 FZI Forschungszentrum Informatik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.streampipes.manager.matching.v2;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import org.streampipes.model.client.matching.MatchingResultMessage;
import org.streampipes.vocabulary.SO;
import org.streampipes.vocabulary.XSD;

public class TestDatatypeMatch extends TestCase {

	@Test
	public void testPositiveDatatypeMatch() {

		String offer = XSD._integer.toString();
		String requirement = XSD._integer.toString();
		
		List<MatchingResultMessage> errorLog = new ArrayList<>();
		
		boolean matches = new DatatypeMatch().match(offer, requirement, errorLog);
		assertTrue(matches);
	}
	
	@Test
	public void testNegativeDatatypeMatch() {

		String offer = XSD._integer.toString();
		String requirement = XSD._string.toString();
		
		List<MatchingResultMessage> errorLog = new ArrayList<>();
		
		boolean matches = new DatatypeMatch().match(offer, requirement, errorLog);
		assertFalse(matches);
	}
	
	@Test
	public void testSubPropertyMatch() {

		String offer = XSD._integer.toString();
		String requirement = SO.Number;
		
		List<MatchingResultMessage> errorLog = new ArrayList<>();
		
		boolean matches = new DatatypeMatch().match(offer, requirement, errorLog);
		assertTrue(matches);
	}
	
	
}
