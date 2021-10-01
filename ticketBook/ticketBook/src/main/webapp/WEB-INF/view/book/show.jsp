<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>DataTables</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">DataTables</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">Couch Table</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <table id="example1" class="table table-bordered table-striped">
                  
                  <tr>
                    
							<th >Travel Code</th>
							<th >Travel Name</th>
							<th >Train Code</th>
							<th >Train Name</th>
							<th >Road Code</th>
							<th >Road Name</th>
							<th >Date</th>
							<th >Time</th>
							<th >Action</th>
                  </tr>
                    <c:forEach items="${assignTrains}" var="at">
                  <tr>
                   
                    <td>${at.travel_code}</td>
                    <td>${at.travel_name}</td>
                    <td>${at.train_code}</td>
                    <td>${at.train_name}</td>
                    <td>${at.road_code}</td>
                    <td>${at.road_name}</td>
                     <td>${at.date}</td>
                     <td>${at.time}</td>
                    <td>
                    <a href="/passenger/edit/${at.id}" class="btn btn-primary">Select</a>
                    <!-- <a href="/passenger/add" class="btn btn-primary">Select</a> -->
                    </td>
                    
                    
                  </tr>
                  
                    </c:forEach>
                </table>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
          <!-- /.col -->
        </div>
        <!-- /.row -->
      </div>
      <!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  
	<jsp:include page="/WEB-INF/view/common/footer.jsp" />