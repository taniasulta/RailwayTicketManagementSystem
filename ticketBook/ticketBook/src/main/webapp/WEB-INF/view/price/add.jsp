
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="content-wrapper">
  <!-- Content Header (Page header) -->
  <section class="content-header">
    <div class="container-fluid">
      <div class="row mb-2">
        <div class="col-sm-6">
         
        </div>
        <div class="col-sm-6">
          
            
        </div>
      </div>
    </div><!-- /.container-fluid -->
  </section>

  <!-- Main content -->
  <section class="content">
    <div class="container-fluid">
      <div class="row">
        <!-- left column -->
        <div class="col-md-6">
          <!-- general form elements -->
          <div class="card card-primary">
            <div class="card-header">
              <h3 class="card-title"> Ticket Price</h3>
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            <form action="/price/save" method="post">
              <div class="card-body">
              <div class="form-group">
                  <label for="name"> Code</label>
                  <input type="text" class="form-control" id="exampleInputname" name="code">
                </div>
              	
                <div class="form-group">
                  <label for="name"> Seat Class Name</label>
                  <input type="text" class="form-control" id="exampleInputname" name="seat_name">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Ticket Price</label>
                  <input type="text" class="form-control" id="exampleInputPrice"  name="seat_price" >
                </div>
                
                <div class="card-footer">
                  <button type="submit" class="btn btn-info"> Save </button>
                  
                </div>
               
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </section>
  </div>
	<jsp:include page="/WEB-INF/view/common/footer.jsp" />
	