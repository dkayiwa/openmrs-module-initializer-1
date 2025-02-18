/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.initializer;

/**
 * This allows to perform Spring context sensitive tests when Data Filter API is a dependency. In
 * that case it is necessary for each context sensitive test to update the search index.
 */
public abstract class DomainBaseModuleContextSensitive_2_3_Test extends DomainBaseModuleContextSensitiveTest {
	
	@Override
	public void updateSearchIndex() {
		// to prevent Data Filter's 'Illegal Record Access'
	}
}
