<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
                        
<!DOCTYPE html>
<html>
   <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Railway Ticket book</title>
      <link rel="stylesheet" href="/app-assets/css/bootstrap.min.css">
      <link rel="stylesheet" href="/app-assets/css/style.css">
      <link rel="stylesheet" href="/app-assets/css/fontawesome.min.css">
      <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto" rel="stylesheet">
   </head>
   <body>
      <div id="header" class="header">
         <nav class="navbar navbar-expand-lg navbar-light text-capitalize">
            <div class="container">
               
               <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#show-menu" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
               <span class="navbar-toggler-icon"></span>
               </button>
               <div class="collapse navbar-collapse" id="show-menu">
                  <ul class="navbar-nav ml-auto">
                     <li class="nav-item active">
                        <a class="nav-link" href="/">Home</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="/login">Login</a>
                     </li>
                     
                     
                  </ul>
               </div>
            </div>
         </nav>
      </div>
      <div id="home" class="slider">
         
            <div class="carousel-inner">
            <div><center><h4>Welcome to Bangladesh Railway Service</h4></center></div>
              
                  <img class="d-block w-100" src="/app-assets/imgs/train7.jpg" alt="slider_img">
                  
                  <div class="ovarlay_slide_cont">
                  
                    <div class="content-wrapper">
                        <!-- Content Header (Page header) -->
                        <section class="content-header">
                          <div class="container-fluid">
                            <div class="row mb-1">
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
                              <div class="col-md-12">
                                <!-- general form elements -->
                                <div class="card card-primary">
                                  <div class="card-header">
                                    <h4 class="card-title">Book Ticket</h4>
                                  </div>
                                  <!-- /.card-header -->
                                  <!-- form start -->
                 <form action="/passenger/bikash" method="POST">
                                  
                           <div>
                         <%--  <label for="name" name="travel_code" value="${at.travel_code}" >${at.travel_code}</label> --%>
                  		  <label for="exampleInputPassword1" value="${at.travel_name}">${at.travel_name}</label>
	                      <%-- <label for="code" name="train_code"   value="${at.train_code}">${at.train_code}</label> --%>
		                  <label for="code" name="train_name"  value="${at.train_name}">${at.train_name}</label>
	                      <label for="code" name="road_code" id="a"  value="${at.road_code}">${at.road_code}</label>
		                  <label for="code" name="road_name" id="b" value="${at.road_name}">${at.road_name}</label>
		                  <label for="code"name="date"  value="${at.date}">${at.date}</label>
		                  <label for="code">${at.time}</label> 
		                  <input type="hidden" class="form-control" name="travel_code"  value="${at.travel_code}">
		                  <input type="hidden" class="form-control" name="travel_name"  value="${at.travel_name}">
		                  <input type="hidden" class="form-control" name="train_code"  value="${at.train_code}">
		                  <input type="hidden" class="form-control" name="train_name"  value="${at.train_name}">
		                  <input type="hidden" class="form-control" name="road_code"  value="${at.road_code}">
		                  <input type="hidden" class="form-control" name="road_name"  value="${at.road_name}">
                          <input type="hidden" class="form-control" name="date"  value="${at.date}">
                           <input type="hidden" class="form-control" name="time"  value="${at.time}">
                		
                                    <div class="card-body" id="div1">
                                        <div class="row">
                                            <div class="col-sm-5" id="abc">
                                                <div class="form-group">
                                                      <label for="name">Fist Name</label>
                                                      <input type="text" class="form-control" name="first_name" placeholder=" First Name"/>
                                                </div>
                                             </div>
                                             <div class="col-sm-2">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                                <div class="col-sm-5">
                                                <div class="form-group">
                                                      <label for="exampleInputPassword1"> Last Name</label>
                                                      <input type="text" class="form-control" name="last_name" placeholder=" Last Name"/>
                                                 </div>
                                             </div>
                                           </div>
                                           <div class="row">
                                            <div class="col-sm-5" id="abc">
                                                <div class="form-group">
                                                      <label for="name">Mobile</label>
                                                      <input type="text" class="form-control" name="mobile_number" placeholder="Mobile Number"/>
                                                </div>
                                             </div>
                                             <div class="col-sm-2">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                                <div class="col-sm-5">
                                                <div class="form-group">
                                                      <label for="exampleInputPassword1">E-mail</label>
                                                      <input type="text" class="form-control" name="email" id = "email" placeholder=" E-mail "/>
                                                 </div>
                                             </div>
                                           </div>
                                           <div class="row">
                                            <div class="col-sm-5" id="abc">
                                                <div class="form-group">
                                                      <label for="name">Address</label>
                                                      <input type="text" class="form-control" name="address" placeholder="Address"/>
                                                </div>
                                             </div>
                                             <div class="col-sm-2">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                                <div class="col-sm-5">
                                                <label for="name"> NID Number</label>
                                                <input type="text" class="form-control" name="passenger_id" placeholder=" Enter your NID Number"/>
                                             </div>
                                           </div>
                                           
                                           <div class="card-footer">
                  								<center><a class="btn btn-primary" id="next">Next</a></center>
                							</div>
                                        </div>
                                    <section class="content" id="div2">
                          
                                          <div class="row">
                                          <div class="col-sm-1">
                                              <div class="form-group">
                                              </div>
                                            </div>
                                            <div class="col-sm-5" id="abc">
                                               <div class="form-group">
                                                    <label for="name">Class</label>
                                                     <select class="form-control" name="seat_class" id="seat_class">
							                          <c:forEach items="${price }" var="p">
													    <option value="${p.seat_name}"> ${p.seat_name}</option>
													   </c:forEach>
											     </select>
                                               </div>
                                           </div>
                                           <div class="col-sm-1">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                              </div>
                                          <div class="row">
                                          <div class="col-sm-1">
                                               <div class="form-group">
                                               </div>
                                            </div>
                                            <div class="col-sm-6" id="abc">
                                                <div class="form-group">
                                                      <label for="name">Ticket Price</label>
                                                       <input type="text"  name="seat_price" id="seat_price" readonly="readonly">
                                                </div>
                                             </div>
                                             <div class="col-sm-1">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                              </div>
                                               <div class="row">
                                        <div class="col-sm-1">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                            <div class="col-sm-6" id="abc">
                                                <div class="form-group">
                                                      <label for="name">No Of Seat</label>
                                                       <input type="text"  name="no_of_seats">
                                                </div>
                                             </div>
                                             <div class="col-sm-1">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                              </div>
                                           <div class="row">
                                             <div class="col-sm-1">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                              
                                            <div class="col-sm-5" id="abc">
                                                <div class="form-group">
                                                  <label for="name">Select Payment Mode</label>
													<div class="dropdown-content">
													   <input type="submit" class="btn btn-info" value="bKash"/>
													   <input type="submit" class="btn btn-info" value="Card"/>
                                                   </div>
                                             </div>
                                             <div class="col-sm-1">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                              </div>
                                              <hr/>
            							</section>	
                                  </form>
                                </div>
                              </div>
                            </div>
                          </div>
                        </section>
   	 				</div>
	              </div>
	             </div>
	            </div>					
      <script src="/app-assets/js/jquery-3.3.1.min.js"></script>
      <script src="/app-assets/js/bootstrap.min.js"></script>
     
   </body>
</html>
		 <script>
		 $("#div2").hide();
		 $("#next").on("click", function(){
			 $("#div1").hide(); 
			 $("#div2").show();
		 })
		 
		 
<c:forEach items="${price}" var="q">
		 
		 if($("#seat_class :selected").val() == "<c:out value='${q.seat_price}' />"){
			 $("#seat_price").val("<c:out value='${q.seat_price}' />");
		 }
		 console.log("<c:out value='${q.seat_price}' />");  
		 
		 </c:forEach>
		 
		 
		$("#seat_class").on("change", function(){

			var code = $("#seat_class :selected").val();
			
			 <c:forEach items="${price}" var="q">
			 
				 if(code == "<c:out value='${q.seat_name}' />"){
					 $("#seat_price").val("<c:out value='${q.seat_price}' />");
				 }

			 </c:forEach>
			   
		
			
		});
		
		</script>