/*
 * APIClient.java: Encapsulates access to a ThingPool Server's API.
 **
 * © 2012 Steven Casagrande (scasagrande@galvant.ca) and
 *     Christopher E. Granade (cgranade@cgranade.com).
 * This file is a part of the ThingPool Server project.
 * Licensed under the AGPL version 3.
 **
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */


/**
 * 
 */
package ca.galvant.thingpool.client.api;

import java.net.URI;

/**
 * @author cgranade
 *
 */
public class APIClient {

	private final URI server;
	
	public APIClient(URI server) {
		this.server = server;
	}
	
	public URI getServer() {
		return server;
	}
	
	// INNER CLASSES FOR SPECIFIC API TRANSACTIONS //
	public static class Error {
		public final String message;
		public Error(String message) {
			this.message = message;
		}
	}
	
}
