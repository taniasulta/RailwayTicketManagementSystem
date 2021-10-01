 <jsp:include page="/WEB-INF/view/common/header.jsp" /> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="content-wrapper">
  <!-- Content Header (Page header) -->
  <section class="content-header">
    <div class="container-fluid">
      <div class="row mb-2">
        <div class="col-sm-4">
         
        </div>
        <div class="col-sm-4">
        <center> <h1>Create A new Route</h1></center>
        </div>
      </div>
    </div><!-- /.container-fluid -->
  </section>

  <!-- Main content -->
  <section class="content">
            <!-- form start -->
            <form action="/road/save" method="post">
              <div class="row">
               <div class="col-sm-2">
					  <div class="form-group">
					  </div>
				  </div>
                <div class="col-sm-4" id="abc">
                	<div class="form-group">
                  		<label for="name">Route Code</label>
                  		<input type="text" class="form-control" name="road_code">
                	</div>
                 </div>
                 <div class="col-sm-1">
					  <div class="form-group">
					  </div>
				  </div>
               	 <div class="col-sm-4">
                	<div class="form-group">
                  		<label for="exampleInputPassword1">Route Name</label>
                  		<input type="text" class="form-control" name="road_name">
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
	                     <label for="code">Starting Station Name</label>
	                     <select class="form-control" name="starting_station_code" id="starting_station_code">
                      <c:forEach items="${stations }" var="s">
						<option value="${s.code }"> ${ s.name}</option>
						</c:forEach>
						</select>
						<input type="text" name="starting_station_name" id="a"/>
	                </div>
                 </div>
                 <div class="col-sm-1">
					  <div class="form-group">
					  </div>
				  </div>
               	 <div class="col-sm-4">
				      <div class="form-group">
		                  <label for="code">Ending Station name</label>
		                  <select class="form-control" name="ending_station_code" id="ending_station_code">
                      <c:forEach items="${stations }" var="s">
						<option value="${s.code }"> ${ s.name}</option>
						</c:forEach>
						</select>
						<input type="text" name="ending_station_name" id="b"/>
		               </div>
                 </div>
               </div>
                
                
                <div class="card-footer">
                 <center> <button type="submit" class="btn btn-info"> Save </button></center>
                </div>
            </form>
  </section>

</div>
	 <jsp:include page="/WEB-INF/view/common/footer.jsp" />

  
  <script src="/assets/plugins/jquery/jquery1.js"></script>
  	<script>
	
      
		$("#starting_station_code").on("change", function(){
			$("#a").val($("#starting_station_code :selected").text());
		});
		
		
		$("#ending_station_code").on("change", function(){
			$("#b").val($("#ending_station_code :selected").text());
		});
		
		
		    $("#a").hide();
		    $("#b").hide();
  			/* $("#abc").hide(); */
	</script>
	