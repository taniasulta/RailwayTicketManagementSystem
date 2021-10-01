<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="content-wrapper">
  <!-- Content Header (Page header) -->
  <section class="content-header">
    <div class="container-fluid">
      <div class="row mb-1">
        <div class="col-sm-4">
          
        </div>
        <div class="col-sm-4">
        <h1>Assign a Train</h1>
        </div>
      </div>
    </div><!-- /.container-fluid -->
  </section>

  <!-- Main content -->
  <section class="content">
            <!-- form start -->
            <form action="/assign/save" method="post">
              <div class="row">
              <div class="col-sm-2">
					  <div class="form-group">
					  </div>
				  </div>
                <div class="col-sm-4">
                	<div class="form-group">
                  		<label for="name">Couch Code</label>
                  		<input type="text" class="form-control" name="travel_code">
                	</div>
                 </div>
                 <div class="col-sm-1">
					  <div class="form-group">
					  </div>
				  </div>
               	 <div class="col-sm-4">
                	<div class="form-group">
                  		<label for="exampleInputPassword1"> Couch Name</label>
                  		<input type="text" class="form-control" name="travel_name">
                	 </div>
                 </div>
               </div>
               <div class="row">
               <div class="col-sm-2">
					  <div class="form-group">
					  </div>
				  </div>
	               <div class="col-sm-4">
	                  <div class="form-group">
	                     <label for="code">Train Name</label>
	                     <select class="form-control" name="train_code" id="train_code">
                           <c:forEach items="${trains }" var="t">
						<option value="${t.train_code }"> ${ t.train_name}</option>
						</c:forEach>
						</select>
						<input type="text" name="train_name" id="a"/> 
	                </div>
                 </div>
                 <div class="col-sm-1">
					  <div class="form-group">
					  </div>
				  </div>
               	 <div class="col-sm-4">
		               <div class="form-group">
		                  <label for="code">Road Name</label>
		                  <select class="form-control" name="road_code" id="road_code">
                          <c:forEach items="${roads }" var="r">
						    <option value="${r.road_code }"> ${ r.road_name}</option>
						   </c:forEach>
						    </select>
						   <input type="text" name="road_name" id="b"/> 
		                </div>
                 </div>
               </div>
                <div class="row">
                <div class="col-sm-2">
					  <div class="form-group">
					  </div>
				  </div>
	               <div class="col-sm-4">
			            <div class="form-group">
		                  <label for="code">Date</label>
						<input type="date" class="form-control" name="date"> 
		                </div>
                 </div>
                    <div class="col-sm-1">
					  <div class="form-group">
					  </div>
					  </div>
                 <div class="col-sm-4">
			            <div class="form-group">
		                  <label for="code">Time</label>
						<input type="text" class="form-control" name="time"> 
		                </div>
                 </div>
               </div>
                
                <div class="card-footer">
                  <center><button type="submit" class="btn btn-info"> Save </button></center>
                </div>
            </form>
  </section>
  </div>
	<jsp:include page="/WEB-INF/view/common/footer.jsp" />
	<script>
	
      
		$("#train_code").on("change", function(){
			$("#a").val($("#train_code :selected").text());
		});
		
		
		$("#road_code").on("change", function(){
			$("#b").val($("#road_code :selected").text());
		});
		
		
		    $("#a").hide();
		    $("#b").hide(); 
  			/* $("#abc").hide(); */
	</script>
	
	