package org.apache.maven.archiva.xml;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import junit.framework.TestCase;

/**
 * LatinEntitiesTest 
 *
 * @version $Id$
 */
public class LatinEntitiesTest
    extends TestCase
{
    public void testResolveEntity()
    {
        // Good Entities.
        assertEquals( "\u00a9", LatinEntities.resolveEntity( "&copy;" ) );
        assertEquals( "\u221e", LatinEntities.resolveEntity( "&infin;" ) );
        assertEquals( "\u00f8", LatinEntities.resolveEntity( "&oslash;" ) );

        // Bad Entities.
        assertEquals( "", LatinEntities.resolveEntity( "" ) );
        assertEquals( "&amp;", LatinEntities.resolveEntity( "&amp;" ) );
        assertEquals( null, LatinEntities.resolveEntity( null ) );
    }
}