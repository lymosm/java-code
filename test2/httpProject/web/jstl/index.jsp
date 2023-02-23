<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    request.setAttribute("number", 2);

    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");

    request.setAttribute("list", list);
%>

<c:choose>
    <c:when test="${number == 1}">1</c:when>
    <c:when test="${number == 2}">2</c:when>
    <c:otherwise>number error</c:otherwise>
</c:choose>

<c:forEach items="${list}" var="str" varStatus="s">
    ${s.index} ${s.count} ${str}
</c:forEach>