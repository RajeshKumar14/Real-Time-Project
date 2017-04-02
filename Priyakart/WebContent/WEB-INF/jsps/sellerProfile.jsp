<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
<%@include file="sellerHeader.jsp" %>

<div class="container" style="marging-top:-10px;">
  <div class="row">
    <!-- left column -->
    <div class="col-md-4 col-sm-6 col-xs-12">
      <div class="text-center">
        <img src="http://lorempixel.com/200/200/people/9/" class="avatar img-circle img-thumbnail" alt="avatar">
        <h6>Upload a different photo...</h6>
      </div>
    </div>
    <!-- edit form column -->
    <div class="col-md-8 col-sm-6 col-xs-12 personal-info">
      <div class="alert alert-info alert-dismissable">
        <a class="panel-close close" data-dismiss="alert">×</a> 
        <i class="fa fa-coffee"></i>
        This is an <strong>.alert</strong>. Use this to show important messages to the user.
      </div>
      <h3 style="color:#337ab7">Personal Information:</h3>
      <form class="form-horizontal" role="form">
        <div class="form-group">
          <label class="col-lg-3 control-label">Name</label>
          <div class="col-lg-8">
            <input class="form-control" value="${sellerObj.sellerFirstName}  ${sellerObj.sellerLastName}" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Username</label>
          <div class="col-md-8">
            <input class="form-control" value="${sellerObj.sellerEmail}" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Password</label>
          <div class="col-md-8">
            <input class="form-control" value="${sellerObj.pwd}" type="password" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">Primary Email</label>
          <div class="col-lg-4">
            <input class="form-control" value="${sellerObj.sellerEmail}" type="text" readonly>
          </div>
          <div class="col-lg-4">
            <input class="form-control" value="" type="text" placeholder="Enter secondry Email" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">Mobile No</label>
          <div class="col-lg-8">
            <input class="form-control" value="${sellerObj.mobileNo}" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
             <label class="col-lg-3 control-label">Birthday</label>
          <div class="col-lg-3">
            <input class="form-control" value="${sellerObj.dob}" type="date" readonly>
          </div>
             <label class="col-lg-2 control-label">Gender</label>
           <div class="col-lg-3">
            <input class="form-control" value="${sellerObj.gender}" type="text" readonly>
           </div>
         </div>
      </form>
       <h3 style="color:#337ab7">Current Address  :</h3>
      <form class="form-horizontal" role="form">
        <div class="form-group">
          <label class="col-lg-3 control-label">Address Line1</label>
          <div class="col-lg-8">
            <input class="form-control" value="" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">Address Line1</label>
          <div class="col-lg-8">
            <input class="form-control" value="" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">City Name</label>
          <div class="col-lg-3">
            <input class="form-control" value="Madhepura" type="text" readonly>
          </div>
          <label class="col-lg-2 control-label">State</label>
          <div class="col-lg-3">
            <input class="form-control" value="Bihar" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Country</label>
          <div class="col-md-3">
            <input class="form-control" value="India" type="text" readonly>
          </div>
          <label class="col-md-2 control-label">Pin Code</label>
          <div class="col-md-3">
            <input class="form-control" value="852128" type="text" readonly>
          </div>
        </div>
      </form>
       <h3 style="color:#337ab7">Working Location  :</h3>
      <form class="form-horizontal" role="form">
        <div class="form-group">
          <label class="col-lg-3 control-label">Location Name</label>
          <div class="col-lg-8">
            <input class="form-control" value="" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">Type</label>
          <div class="col-lg-3">
            <input class="form-control" value="" type="text" readonly>
          </div>
          <label class="col-lg-2 control-label">District</label>
          <div class="col-lg-3">
            <input class="form-control" value="" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">State</label>
          <div class="col-lg-3">
            <input class="form-control" value="Bihar" type="text" readonly>
          </div>
          <label class="col-md-2 control-label">Country</label>
          <div class="col-md-3">
            <input class="form-control" value="India" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Pin Code</label>
          <div class="col-md-5">
            <input class="form-control" value="852128" type="text" readonly>
          </div>
        </div>
      </form>
        <h3 style="color:#337ab7">Others :</h3>
      <form class="form-horizontal" role="form">
        <div class="form-group">
          <label class="col-lg-3 control-label">Language</label>
          <div class="col-lg-3">
            <input class="form-control" value="" type="text" readonly>
          </div>
          <label class="col-lg-2 control-label">Interest</label>
          <div class="col-lg-3">
            <input class="form-control" value="" type="text" readonly>
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
<%@include file="sellsFooter.jsp" %>