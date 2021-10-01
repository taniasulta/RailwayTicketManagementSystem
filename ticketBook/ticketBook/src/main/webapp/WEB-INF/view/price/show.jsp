<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>All Ticket Price</h1>
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
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">DataTable with default features</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <table id="example1" class="table table-bordered table-striped">
                  
                  <tr>
                    
                    <th>Class Name</th>
                    <th>Ticket Price</th>
                    
                    <th>Action</th>
                  </tr>
                 
                  
                    <c:forEach items="${price}" var="p">
                  <tr>
                   
                    <td>${p.seat_name}</td>
                    <td>${p.seat_price}</td>
                    
                    <td>
                    <a href="/train/edit/${s.id}" class="btn btn-primary">Edit</a>
                    </td>
                    <td>
                     <a href="/train/delete/${s.id}" class="btn btn-primary">Delete</a>
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