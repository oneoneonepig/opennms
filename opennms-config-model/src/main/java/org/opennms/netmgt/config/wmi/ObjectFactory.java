/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2013-2016 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2016 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.config.wmi;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.opennms.xmlns.xsd.config.wmi_datacollection package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.opennms.xmlns.xsd.config.wmi_datacollection
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rrd }
     * 
     */
    public Rrd createRrd() {
        return new Rrd();
    }

    /**
     * Create an instance of {@link WmiDatacollectionConfig }
     * 
     */
    public WmiDatacollectionConfig createWmiDatacollectionConfig() {
        return new WmiDatacollectionConfig();
    }

    /**
     * Create an instance of {@link WmiCollection }
     * 
     */
    public WmiCollection createWmiCollection() {
        return new WmiCollection();
    }

    /**
     * Create an instance of {@link Wpm }
     * 
     */
    public Wpm createWpm() {
        return new Wpm();
    }

    /**
     * Create an instance of {@link Attrib }
     * 
     */
    public Attrib createAttrib() {
        return new Attrib();
    }

}
