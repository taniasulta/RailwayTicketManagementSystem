<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
  <!-- Content Header (Page header) -->
  <section class="content-header">
    <div class="container-fluid">
      <div class="row mb-2">
        <div class="col-sm-6">
          <h1>Train Schedule </h1>
        </div>
        <div class="col-sm-6">
          
        </div>
      </div>
    </div><!-- /.container-fluid -->
  </section>

  <!-- Main content -->
  <section class="content">
        <!-- left column -->
        <div class="col-md-6">
          <!-- general form elements -->
           </div>
            <form action="/schedule/save" method="post">
              <div class="row">
                <div class="col-sm-6">
                  <!-- select -->
                  <div class="form-group">
                    <label>Select Train</label>
                    <select class="form-control" name="train_name">
                     <c:forEach items="${trains }" var="t">
						<option value="${t.trainName}"> ${t.trainName}</option>
						</c:forEach>
                      
                    </select>
                  </div>
                </div>
                <div class="col-sm-6">
                  <div class="form-group">
                    <label for="name">Road Name </label>
                    <input type="text" class="form-control" id="exampleInputName" name="road_name">
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="col-sm-6">
                  <div class="form-group">
                    <label for="name">Departure Time</label>
                    <input type="text" class="form-control" id="exampleInputComuter" name="departer_time">
                  </div>
                </div>
                <div class="col-sm-6">
                  <div class="form-group">
                    <label for="name">Arrival</label>
                  	<input type="text" class="form-control" id="exampleInputSulov" name="arrival_time">
                   </div>
                 </div>
              </div>
              <div class="row">
                <div class="col-sm-6">
                  <!-- select -->
                  <div class="form-group">
                    <label for="name">Return Road</label>
                    <input type="text" class="form-control" id="exampleInputShovon" name="return_road">
                  </div>
                </div>
                <div class="col-sm-6">
                  <!-- select -->
                  <div class="form-group">
                    <label for="name">Return Departure Time</label>
                    <input type="text" class="form-control" id="exampleInputShovonchar" name="return_departur">
                  </div>
                </div>
              </div>
              
              <div class="row">
                <div class="col-sm-6">
                  <!-- select -->
                  <div class="form-group">
                    <label for="name">Return Arrival Time</label>
                    <input type="text" class="form-control" id="exampleInputAcseate" name="return_arrival">
                  </div>
                </div>
              </div>
              <div>
                   <input type="submit" class="btn btn-info" value="Save"> 
              </div>
            </form>
        </div>
  </section>
  <jsp:include page="/WEB-INF/view/common/footer.jsp" />
