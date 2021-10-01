<jsp:include page="/WEB-INF/view/common/header.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-">
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
      <div class="container text-center" style="width:3000px;  height:500px; font-size: 12px">
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header" >
                <h3 class="card-title">Book Table</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
              <from action="/passenger/alcoach" method="POST">
              <select class="form-control" name="seat_class" id="seat_class">
							                          
	           <option value="Shovon"> Shovon</option>
	           <option value="AC Seat"> AC Seat</option>
	           <option value="AC Birth"> AC Birth</option>
													  
			  </select>
			  <div><input type="submit" value="Submit"/></div>
              </from>
                <table id="example1" class="table table-bordered table-striped" style="width:2000px;  height:500px; font-size: 12px">
                  
                  <tr>
                    
							<th >Coach Code</th>
							<th >Coach Name</th>
							<th >Train Code</th>
							<th >Train Name</th>
							<th >Road Code</th>
							<th >Road Name</th>
							<th >Date</th>
							<th >Time</th>
							<th >First Name</th>
							<th >Last Name</th>
							<th >Mobile Number</th>
							<th >Email</th>
							<th >Address</th>
							<th >NID</th>
							<th >Class</th>
							
							<th >Ticket Price</th>
							<th >No of seat</th>
							<th >bKash Number</th>
							<th >Vat</th>
							<th >Total Amount</th>
							
							<th >Action </th>
                  </tr>
                    <c:forEach items="${books}" var="b">
                  <tr>
                   
                    <td>${b.travel_code}</td>
                    <td>${b.travel_name}</td>
                    <td>${b.train_code}</td>
                    <td>${b.train_name}</td>
                    <td>${b.road_code}</td>
                    <td>${b.road_name}</td>
                     <td>${b.date}</td>
                     <td>${b.time}</td>
                     <td>${b.first_name}</td>
                     <td>${b.last_name}</td>
                     <td>${b.mobile_number}</td>
                     <td>${b.email}</td>
                     <td>${b.address}</td>
                     <td>${b.passenger_id}</td>
                     <td>${b.seat_class}</td>
                     <td>${b.seat_price}</td>
                     <td>${b.no_of_seats}</td>
                     <td>${b.bkash_number}</td>
                     <td>${b.vat}</td>
                     <td>${b.total_amount}</td>
                     
                    <td>
                    <a href="/passenger/allbook/${b.id}" class="btn btn-primary">Edit</a>
                    </td>
                    <td>
                     <a href="/passenger/delete/${b.id}" class="btn btn-primary">Delete</a>
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