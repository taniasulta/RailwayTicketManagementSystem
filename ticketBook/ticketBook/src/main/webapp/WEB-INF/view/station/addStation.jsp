
<jsp:include page="/WEB-INF/view/common/header.jsp" />

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
  <div class="content-wrapper">
  <!-- Content Header (Page header) -->
  <section class="content-header">
    <div class="container-fluid">
      <div class="row mb-2">
        <div class="col-sm-4">
          
        </div>
        <div class="col-sm-6">
          
        </div>
      </div>
    </div><!-- /.container-fluid -->
  </section>

  <!-- Main content -->
  <section class="content">
    <div class="container">
      <div class="row">
        <!-- left column -->
        <div class="col-md-8">
          <!-- general form elements -->
          <div class="card card-primary">
            <div class="card-header">
              <h3 class="card-title">Add a New Station</h3>
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            <form action="/station/save" method="POST">
              <div class="card-body">
                <div class="form-group">
                  <label for="name">Station Name</label>
                  <input type="text" class="form-control" name="name">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Station Code</label>
                  <input type="text" class="form-control"  name="code" >
                </div>
                <div class="form-group">
                  <label for="code">Station Location</label>
                  <input type="text" class="form-control" name="location">
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
	