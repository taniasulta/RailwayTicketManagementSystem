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
            
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div  class="container text-center" style="width:700px;  height:500px; font-size: 12px">
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">All Trains</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body" class="container text-center" style="width:600px;  height:500px; font-size: 12px">
                <table id="example1" class="table table-bordered table-striped">
                  
                  <tr>
                    <th> Train Name</th>
                    <th>Code</th>
                    <th>Train type</th>
                    <th>Train seat</th>
                    <th>Shovon </th>
                    
                    <th>AC Seat</th>
                    <th>AC Birth</th>
                    <th>Action</th>
                    <th>Action</th>
                   
                  </tr>
               
                    <c:forEach items="${trains}" var="t">
                  <tr>
                    <td>${t.train_name}</td>
                    <td>${t.train_code}</td>
                    <td>${t.train_type}</td>
                    <td>${t.seat_number}</td>
                    <td>${t.shovon}</td>
                    <td>${t.ac_seat}</td>
                    <td>${t.ac_birth}</td>
                    
                    
                   
                    <td>
                    <a href="/train/edit/${t.id}" class="btn btn-primary">Edit</a>
                    </td><td> 
                     <a href="/train/delete/${t.id}" class="btn btn-primary">Delete</a>
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