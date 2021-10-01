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
      <div class="container text-center" style="width:600px;  height:500px; font-size: 12px">
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">All Station</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <table id="example1" class="table table-bordered table-striped" style="width:600px;  height:500px; font-size: 12px">
                  
                  <tr>
                    <th>Shovon</th>
                    <th>AC </th>
                    <th> AC Birth</th>
                  </tr>
                  <tr>
                    <td><input type ="button"/></td>
                    <td><input type ="button"/></td>
                    <td><input type ="button"/></td>
                    <td>
                    <a href="/station/edit/${s.id}" class="btn btn-primary">Edit</a>
                    </td>
                    <td>
                     <a href="/station/delete/${s.id}" class="btn btn-primary">Delete</a>
                    </td>
                  </tr>
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