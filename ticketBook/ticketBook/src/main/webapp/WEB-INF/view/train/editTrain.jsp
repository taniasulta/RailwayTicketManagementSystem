<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="mx-5 my-5" >
		<div class="row">
		
			<div class="col-md-4">
			
			<div class="row" id="menulist">
			
				<li><a href="/train/show" class="btn btn-primary">Train</a></li>
				<li><a href="/station/show" class="btn btn-primary">Station</a></li>
				<li><a href="/station/show" class="btn btn-primary">Train Schedule</a></li>
				<li><a href="/route/show" class="btn btn-primary">Train Route</a></li>
				<li><a href="/seat/show" class="btn btn-primary"> Seat </a></li>
					
			</div>
			</div>
			<div class="col-md-6">
				<form  method="POST" action="/train/update">
					<div class="mb-3">
						<label for="name" class="form-label">Train Name</label>
						<input type="text" class="form-control"  name="name" value="${t.train_name}"/>
					</div>
				
					<div class="mb-3">
						<label for="code" class="form-label">Train Code </label>
						<input type="text" class="form-control"  name="code" value="${t.train_code}"/>
					</div>
				
					<div class="mb-3">
						<label for="type" class="form-label">Train Type</label>
						<input type="text" class="form-control"  name="type" value="${t.train-type }"/>
					</div>
					<div class="mb-3">
						<label for="seat" class="form-label"> Seat Number</label>
						<input type="text" class="form-control"  name="seat" value="${t.seat-number}"/>
					</div>
					<div class="mb-3">
						<label for="seat" class="form-label">From Station</label>
						<input type="text" class="form-control"  name="sfrom" value="${t.from_station}"/>
					</div>
					<div class="mb-3">
						<label for="description" class="form-label">Departure Time</label>
						<input type="text" class="form-control"  name="depart" value="${t.departure_time}"/>
					</div>
					<div class="mb-3">
						<label for="start" class="form-label">To Station</label>
						<input type="text" class="form-control"  name="sto" value="${t.to_station}"/>
					</div>
					<div class="mb-3">
						<label for="end" class="form-label">Arrival Time</label>
						<input type="text" class="form-control"  name="arri" value="${t.arrival_time}"/>
					</div>
					<div class="mb-3">
						<label for="start" class="form-label">Date</label>
						<input type="text" class="form-control"  name="date" value="${t.date}"/>
					</div>
					<div class="mb-3">
						<label for="start" class="form-label">Distance</label>
						<input type="text" class="form-control"  name="dist" value="${t.distance}"/>
					</div>
				<input type="hidden" name="id" value="${t.id}"/>
				
					<button type="submit" class="btn btn-primary">Save</button>
				</form>
			</div>
			
		</div>
		
	
		
	</div>
	<jsp:include page="/WEB-INF/view/common/footer.jsp" />
	