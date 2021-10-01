
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="mx-5 my-5" >
		<div class="row">
			<div class="col-md-4">
				<div class="row" id="menulist">
			
				<li><a href="/train/show" class="btn btn-primary">Train</a></li>
				<li><a href="/station/show" class="btn btn-primary">Station</a></li>
				<li><a href="/station/show" class="btn btn-primary">Train Schedule</a></li>
				<li><a href="/road/show" class="btn btn-primary">Train Route</a></li>
				<li><a href="/seat/show" class="btn btn-primary"> Seat </a></li>
					
			</div>
			</div>
			<div class="col-md-4">
				<form  method="POST" action="/station/update">
					<div class="mb-3">
						<label for="name" class="form-label">Station Name</label>
						<input type="text" class="form-control"  name="name" value="${s.name}" />
					</div>
				
					<div class="mb-3">
						<label for="code" class="form-label">Station Code </label>
						<input type="text" class="form-control"  name="code" value="${s.code}" />
					</div>
				
					<div class="mb-3">
						<label for="type" class="form-label">Station Location</label>
						<input type="text" class="form-control"  name="location" value="${s.location}" />
					</div>
					
					<div class="mb-3">
						<label for="start" class="form-label">Date</label>
						<input type="text" class="form-control"  name="date" value="${s.date}" />
					</div>
				<div class="mb-3">
						
						<input type="hide" class="form-control"  name="id" value="${s.id}" />
					</div>
					<button type="submit" class="btn btn-primary">update</button>
					
				</form>
			</div>
			
		</div>
		
	
		
	</div>
	<jsp:include page="/WEB-INF/view/common/footer.jsp" />
	