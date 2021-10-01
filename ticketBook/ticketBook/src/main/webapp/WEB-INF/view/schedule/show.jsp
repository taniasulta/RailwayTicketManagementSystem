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
                <h3 class="card-title">All Train Schedule</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <table id="example1" class="table table-bordered table-striped">
                  
                  <tr>
                    <th> Train Name</th>
                    <th>Route Name</th>
                    <th> Arrival Time</th>
                    <th> Departure Time</th>
                    <th> Return Route</th>
                     <th> Return Departure</th>
                       
                     <th> Return Arrival </th>
                    
                    
                    <th>Action</th>
                  </tr>
                 
                  
                    <c:forEach items="${schedules}" var="s">
                  <tr>
                    <td>${s.train_name}</td>
                    <td>${s.road_name}</td>
                    <td>${s.arrival_time}</td>
                    <td>${s.departer_time}</td>
                    <td>${s.return_road}</td>
                    <td>${s.return_departur}</td>
                    <td>${s.return_arrival}</td>
                    <td>
                    <a href="/schedule/edit/${s.id}" class="btn btn-primary">Edit</a>
                    </td>
                    <td>
                     <a href="/schedule/delete/${s.id}" class="btn btn-primary">Delete</a>
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