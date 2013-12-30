/*
 * � Copyright WebGate Consulting AG, 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package biz.webgate.simplecontacts;

public abstract class AbstractBusinessObject {

	private String m_ID;
	private String m_ParentID;

	public void setID(String iD) {
		m_ID = iD;
	}
	public String getID() {
		return m_ID;
	}
	public void setParentID(String parentID) {
		m_ParentID = parentID;
	}
	public String getParentID() {
		return m_ParentID;
	}
}