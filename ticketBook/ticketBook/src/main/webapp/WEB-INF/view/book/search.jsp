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
                        <a class="/login" href="/login">Login</a>
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
                                  <form action="/book/search" method="post">
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-sm-3" >
                                                
                                             </div>
                                             <div class="col-sm-6">
                                                  <div class="form-group">
                                                      <label for="name">Route Name</label>
                                                      <select class="form-control" name="road_code" id="road_code">
								                          <c:forEach items="${assignTrains }" var="at">
														    <option value="${at.road_code }"> ${at.road_name}</option>
														   </c:forEach>
														 </select>
                                                </div>
                                              </div>
                                                <div class="col-sm-3">
                                                
                                             </div>
                                           </div>
                                           
                                           <div class="row">
                                            <div class="col-sm-3" id="abc">
                                                
                                             </div>
                                             <div class="col-sm-6">
                                                   <div class="form-group">
                                                      <label for="name">Date</label>
                                                      <select class="form-control" name="date" id="date">
								                          <c:forEach items="${assignTrains }" var="at">
														    <option value="${at.date }"> ${ at.date}</option>
														   </c:forEach>
														 </select>
                                                </div>
                                                </div>
                                            
                                                <div class="col-sm-3">
                                             </div>
                                           </div>
                                           
                                           <div class="card-footer">
                  								<center><button type="submit" class="btn btn-info" text-aline="center"> Search </button></center>
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
$("#a").hide();
$("#b").hide();
</script>