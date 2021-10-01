<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="content-wrapper">
 
  <section class="content-header">
    <div class="container">
      <div class="row mb-1">
        <div class="col-sm-4">
          
        </div>
        <div class="col-sm-4">
          <h1 class="card-title">Add a New Train</h1>
        </div>
      </div>
    </div><!-- /.container-fluid -->
  </section>

  <!-- Main content -->
  <section class="container">
    
            <div class="card-header">
             
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            <form action="/train/save" method="post">
              <div class="row">
              <div class="col-sm-2">
					  <div class="form-group">
					
					  </div>
				  </div>
                <div class="col-sm-4">
                	<div class="form-group">
                  		<label for="name">Train Name</label>
                  		<input type="text" class="form-control" name="train_name">
                	</div>
                 </div>
                 <div class="col-sm-1">
					  <div class="form-group">
					
					  </div>
				  </div>
               	 <div class="col-sm-4">
                	<div class="form-group">
                  		<label for="exampleInputPassword1">Train Code</label>
                  		<input type="text" class="form-control"   name="train_code" >
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
	                     <label for="code">Train Type</label>
	                     <input type="text" class="form-control"  name="train_type">
	                </div>
                 </div>
                 <div class="col-sm-1">
					  <div class="form-group">
					
					  </div>
				  </div>
               	 <div class="col-sm-4">
		               <div class="form-group">
		                  <label for="code">Seat</label>
		                  <input type="text" class="form-control"  name="seat_number">
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
		                  <label for="code">shovon</label>
		                  <input type="text" class="form-control"  name="shovon">
		                </div>
                 </div>
                 <div class="col-sm-1">
					  <div class="form-group">
					
					  </div>
				  </div>
               	 <div class="col-sm-4">
				      <div class="form-group">
		                  <label for="code">AC Seat</label>
		                  <input type="text" class="form-control"  name="ac_seat" >
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
		                  <label for="code">Ac Birth</label>
		                  <input type="text" class="form-control"  name="ac_birth" >
		                </div>
                 </div>
               </div> 
              
                <div class="card-footer" style=" text-aline:center">
                  <center> <button type="submit" class="btn btn-info"> Save </button></center>
                  
                </div>

              
            </form>
         
        
  </section>
  </div>
	<jsp:include page="/WEB-INF/view/common/footer.jsp" />
	