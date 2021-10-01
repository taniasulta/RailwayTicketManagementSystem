<jsp:include page="/WEB-INF/view/common/header.jsp" />
<div class="mx-5 my-5" >
	<div class="row">
		
	<div class="col-md-4"></div>
	
	<div class="col-md-4">
	<center><h2>Admin Register </h2></center>
	<form action="/user/register" method="POST">
	<div class="md-4">
	<label class="form-label">Name</label>
	<input type="text" name="name" class="form-control"/> <br/></div>	
	
	<div class="md-4">
	<label class="form-label">Username</label>
	<input type="text" name="username" class="form-control"/> </div>
	
	<div class="md-4">
	<label class="form-label">Password</label>
	<input type="text" name="password" class="form-control"/></div>
	
	<div class="md-4">
	<input type="submit" value="Register" class="btn btn-primary">
	</div>
	</form>
	<div class="col-md-6">
	</div>
	</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />