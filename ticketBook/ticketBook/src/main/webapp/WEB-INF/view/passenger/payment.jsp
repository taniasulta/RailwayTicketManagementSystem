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
                        <a class="nav-link" href="#home">Home</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="#about">About</a>
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
                            <div class="row mb-2">
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
                                  <form action="/passenger/save" method="POST">
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-sm-5" id="abc">
                                                <div class="form-group">
                                                      <label for="name">Class</label>
                                                      <select class="form-control" name="seat_class" id="seat_class">
								                          <c:forEach items="${price }" var="p">
														    <option value="${p.code}"> ${p.seat_name}</option>
														   </c:forEach>
														 </select>
                                                </div>
                                             </div>
                                             <div class="col-sm-1">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                                <div class="col-sm-5">
                                                <div class="form-group">
                                                      <label for="exampleInputPassword1"> Ticket Price</label>
                                                       
                                                      <input type="text"  name="seat_price" id="seat_price">
                                                 </div>
                                             </div>
                                           </div>
                                           <div class="row">
                                            <div class="col-sm-5" id="abc">
                                                <div class="form-group">
                                                	<label for="name">Select Payment Mode</label>
                                                      <button class="dropbtn">Select</button>
													  <div class="dropdown-content">
													  <li>  <a href="/passenger/bikash">bKash</a></li>
													    <li><a href="passenger/card">Card</a></li>
													    
													  </div>
													</div>
                                                </div>
                                             </div>
                                             <div class="col-sm-2">
                                                  <div class="form-group">
                                                  </div>
                                              </div>
                                                <div class="col-sm-5">
                                                <div class="form-group">
                                                     
                                                 </div>
                                             </div>
                                           </div>
                                            <div class="card-footer">
                  								<a href="/passenger/bikash" class="btn btn-primary">Next</a>
                							</div>	
                                    </div>
                                  </form>
                                </div>
                              </div>
                            </div>
                          </div>
                        </section>
                        </div>
                     <!-- <a class="blue_bt" href="#">See Our Service</a> -->
                  </div>
          
          
      <script src="/app-assets/js/jquery-3.3.1.min.js"></script>
      <script src="/app-assets/js/bootstrap.min.js"></script>
     
   </body>
</html>

		<script>
		
		 <c:forEach items="${price}" var="q">
		 
		 if($("#seat_class :selected").val() == "<c:out value='${q.code}' />"){
			 $("#seat_price").val("<c:out value='${q.seat_price}' />");
		 }
		 console.log("<c:out value='${q.seat_price}' />");  
		 
		 </c:forEach>
		 
		 
		$("#seat_class").on("change", function(){

			var code = $("#seat_class :selected").val();
			
			 <c:forEach items="${price}" var="q">
			 
				 if(code == "<c:out value='${q.code}' />"){
					 $("#seat_price").val("<c:out value='${q.seat_price}' />");
				 }

			 </c:forEach>
			   
		
			
		});
		
		
		console.log(a);
		
		 
		</script>