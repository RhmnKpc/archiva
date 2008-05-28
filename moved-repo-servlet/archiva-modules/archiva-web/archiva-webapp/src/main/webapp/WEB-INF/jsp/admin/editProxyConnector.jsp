<%--
  ~ Licensed to the Apache Software Foundation (ASF) under one
  ~ or more contributor license agreements.  See the NOTICE file
  ~ distributed with this work for additional information
  ~ regarding copyright ownership.  The ASF licenses this file
  ~ to you under the Apache License, Version 2.0 (the
  ~ "License"); you may not use this file except in compliance
  ~ with the License.  You may obtain a copy of the License at
  ~
  ~   http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing,
  ~ software distributed under the License is distributed on an
  ~ "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  ~ KIND, either express or implied.  See the License for the
  ~ specific language governing permissions and limitations
  ~ under the License.
  --%>

<%@ taglib prefix="ww" uri="/webwork" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Admin : Edit Proxy Connector</title>
  <ww:head/>
</head>

<body>

<h1>Admin : Edit Proxy Connector</h1>

<div id="contentArea">

  <ww:actionerror/>
  <ww:actionmessage/>

  <ww:form name="saveProxyConnector" method="post" action="editProxyConnector!commit" namespace="/admin" validate="true">
    <%@ include file="/WEB-INF/jsp/admin/include/proxyConnectorForm.jspf" %>
    <ww:submit value="Save Proxy Connector"/>
  </ww:form>
  
</div>

</body>
</html>