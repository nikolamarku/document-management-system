/**
 * OpenKM, Open Document Management System (http://www.openkm.com)
 * Copyright (c) Paco Avila & Josep Llort
 * <p>
 * No bytes were intentionally harmed during the development of this application.
 * <p>
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.openkm.extension.frontend.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.openkm.frontend.client.OKMException;
import com.openkm.frontend.client.bean.extension.GWTProposedQueryReceived;

import java.util.List;
import java.util.Map;

/**
 * @author jllort
 *
 */
@RemoteServiceRelativePath("../extension/ProposedQuery")
public interface OKMProposedQueryService extends RemoteService {
	void create(long qpId, String users, String roles, String comment) throws OKMException;

	Map<String, Long> findProposedQueriesUsersFrom() throws OKMException;

	void markSeen(long msgId) throws OKMException;

	void markAccepted(long msgId) throws OKMException;

	void deleteReceived(long msgId) throws OKMException;

	void deleteSent(long msgId) throws OKMException;

	List<GWTProposedQueryReceived> findProposedQueryByMeFromUser(String sender) throws OKMException;

	void deleteProposedQueryByMeFromUser(String user) throws OKMException;
}
