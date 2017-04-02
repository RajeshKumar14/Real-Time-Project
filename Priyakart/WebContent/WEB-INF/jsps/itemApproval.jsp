<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
 <meta charset="utf-8">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
   <title>Item Approval</title>
  <%@include file="sellerHeader.jsp" %>
<table class="table">
    <thead>
        <tr>
            <th>#</th>
			<th>Name</th>
			<th>Type</th>
			<th>Sub-Type</th>
			<th>B-Name</th>
			<th>MRP</th>
			<th>T-Date</th>
			<th>Discount</th>
			<th>V-Margin</th>
			<th>R-Value</th>
			<th>Quantity</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
       <c:forEach items="" var="ven">
       <tr>
            <th scope="row">1</th>
            <td><c:out value=""/></td>
			<td><c:out value=""/></td>
			<td><c:out value=""/></td>
			<td><c:out value=""/></td>
			<td><c:out value=""/></td>
			<td><c:out value=""/></td>
			<td><c:out value=""/></td>
			<td>
               <a  class="blue-text"><i class="fa fa-user"></i></a>
               <a href="updateVen?venId=<c:out value=""/>" class="teal-text"><i class="fa fa-pencil"></i></a>
               <a href="deleteVen?venId=<c:out value=""/>" class="red-text"><i class="fa fa-times"></i></a>
            </td>				
	   </c:forEach>
    </tbody>
</table>
	<br><br>
	<%@include file="sellsFooter.jsp" %>