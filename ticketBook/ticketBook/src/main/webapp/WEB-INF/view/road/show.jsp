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
      <div class="container text-center" style="width:700px;  height:600px; font-size: 12px">
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">DataTable with default features</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <table id="example1" class="table table-bordered table-striped" style="width:600px;  height:500px; font-size: 12px">
                  
                  <tr>
                    
							<th >Road Code</th>
							<th >Road Name</th>
							<th >Starting Station Name</th>
							<th >Starting Station Code </th>
							<th >Ending Station Name </th>
							<th >Ending Station Code</th>
							
							<th >Action</th>
							
                  </tr>
                 
                  
                    <c:forEach items="${roads}" var="r">
                  <tr>
                   
                    <td>${r.road_code}</td>
                    <td>${r.road_name}</td>
                    <td>${r.starting_station_name}</td>
                    <td>${r.starting_station_code}</td>
                    <td>${r.ending_station_name}</td>
                    <td>${r.ending_station_code}</td>
                    
                    <td>
                    <a href="/road/edit/${r.id}" class="btn btn-primary">Edit</a>
                    </td>
                    <td>
                     <a href="/road/delete/${r.id}" class="btn btn-primary">Delete</a>
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