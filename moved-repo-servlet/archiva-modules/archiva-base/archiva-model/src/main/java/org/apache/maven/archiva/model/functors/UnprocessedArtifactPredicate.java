package org.apache.maven.archiva.model.functors;

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

import org.apache.commons.collections.Predicate;
import org.apache.maven.archiva.model.ArchivaArtifact;
import org.apache.maven.archiva.model.ArchivaArtifactModel;

/**
 * Allows for selection of unprocessed artifacts.
 *
 * @author <a href="mailto:joakime@apache.org">Joakim Erdfelt</a>
 * @version $Id$
 */
public class UnprocessedArtifactPredicate
    implements Predicate
{
    private static UnprocessedArtifactPredicate INSTANCE = new UnprocessedArtifactPredicate();

    public static UnprocessedArtifactPredicate getInstance()
    {
        return INSTANCE;
    }

    public boolean evaluate( Object object )
    {
        boolean satisfies = false;

        if ( object instanceof ArchivaArtifact )
        {
            ArchivaArtifact artifact = (ArchivaArtifact) object;
            satisfies = !artifact.getModel().isProcessed();
        }
        else if ( object instanceof ArchivaArtifactModel )
        {
            ArchivaArtifactModel model = (ArchivaArtifactModel) object;
            satisfies = !model.isProcessed();
        }

        return satisfies;
    }
}
