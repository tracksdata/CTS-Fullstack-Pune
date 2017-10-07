<jsp:useBean id="prod" class="com.Product" scope="request"/>
<jsp:setProperty property="*" name="prod"/>
<jsp:forward page="/display_v1.jsp"/>
<%-- <<jsp:include page="/display_v1.jsp"> --%>
