<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="content-wrapper">
  <!-- Content Header (Page header) -->
  <section class="content-header">
    <div class="container-fluid">
      <div class="row mb-2">
        <div class="col-sm-4">
          <h1>Assign a Train</h1>
        </div>
        <div class="col-sm-4">
        </div>
      </div>
    </div><!-- /.container-fluid -->
  </section>

  <!-- Main content -->
  <section class="content">
            <!-- form start -->
            <form action="/assign/update" method="post">
              <div class="row">
                <div class="col-sm-4">
                	<div class="form-group">
                  		<label for="name">Travel Code</label>
                  		<input type="text" class="form-control" name="travel_code" value="${at.travel_code}">
                	</div>
                 </div>
                 <div class="col-sm-2">
					  <div class="form-group">
					  </div>
				  </div>
               	 <div class="col-sm-4">
                	<div class="form-group">
                  		<label for="exampleInputPassword1">Travel Name</label>
                  		<input type="text" class="form-control" name="travel_name"  value="${at.travel_name}">
                	 </div>
                 </div>
               </div>
               <div class="row">
	               <div class="col-sm-4">
	                  <div class="form-group">
	                     <label for="code">Train Code</label>
	                     <%-- <select class="form-control" name="train_code" id="train_code"  value="${at.travel_code}">
                           <c:forEach items="${trains }" var="t">
						<option value="${t.train_code }"> ${ t.train_name}</option>
						</c:forEach>
						</select> --%>
						<input type="text" name="train_code" id="a"  value="${at.train_code}"/> 
	                </div>
                 </div>
                 <div class="col-sm-2">
					  <div class="form-group">
					  </div>
				  </div>
               	 <div class="col-sm-4">
		               <div class="form-group">
		                  <label for="code">Train Name</label>
		                  <%-- <select class="form-control" name="road_code" id="road_code">
                          <c:forEach items="${roads }" var="r">
						    <option value="${r.road_code }"> ${ r.road_name}</option>
						   </c:forEach>
						    </select> --%>
						   <input type="text" name="train_name"  value="${at.train_name}"/> 
		                </div>
                 </div>
               </div>
               <div class="row">
	               <div class="col-sm-4">
	                  <div class="form-group">
	                     <label for="code">Road Code</label>
	                    <%--  <select class="form-control" name="train_code" id="train_code"  value="${at.travel_code}">
                           <c:forEach items="${trains }" var="t">
						<option value="${t.train_code }"> ${ t.train_name}</option>
						</c:forEach>
						</select> --%>
						<input type="text" name="road_code" id="a"  value="${at.road_code}"/> 
	                </div>
                 </div>
                 <div class="col-sm-2">
					  <div class="form-group">
					  </div>
				  </div>
               	 <div class="col-sm-4">
		               <div class="form-group">
		                  <label for="code">Road Name</label>
		                  <%-- <select class="form-control" name="road_code" id="road_code">
                          <c:forEach items="${roads }" var="r">
						    <option value="${r.road_code }"> ${ r.road_name}</option>
						   </c:forEach>
						    </select> --%>
						   <input type="text" name="road_name" id="b" value="${at.road_name}"/> 
		                </div>
                 </div>
               </div>
                <div class="row">
	               <div class="col-sm-4">
			            <div class="form-group">
		                  <label for="code">Date</label>
						<input type="date" class="form-control" name="date"  value="${at.date}"> 
		                </div>
                 </div>
                    <div class="col-sm-2">
					  <div class="form-group">
					  </div>
					  </div>
                 <div class="col-sm-4">
			            <div class="form-group">
		                  <label for="code">Time</label>
						<input type="text" class="form-control" name="time"  value="${at.time}"> 
		                </div>
                 </div>
               </div>
               <input type="hidden" class="form-control" name="id"  value="${at.id}">
                
                <div class="card-footer">
                  <button type="submit" class="btn btn-info"> update </button>
                </div>
            </form>
  </section>
  </div>
	<jsp:include page="/WEB-INF/view/common/footer.jsp" />