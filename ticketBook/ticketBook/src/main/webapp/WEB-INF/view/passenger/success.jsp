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
      <section>
       <div class="row" >
           <div class="col-sm-1" id="abc">
              
            </div>
          </div>
                                            
        </section>
        <section class="content">
           <div>
             <center><h4></h4></center>
            </div>
        </section>
      
         
    <section class="content">
      <div class="container text-center" style="width:700px;  height:500px; font-size: 16px">
        <div class="row" print-container>
          <div class="col-12">
            <div class="card">
              <div class="card-header" style="background-color:green">
              
                <h5 class="card-title">Your provided informations</h5>
                 </div>
              <!-- /.card-header -->
              <div class="card-body">
                <table id="example1" class="table table-bordered table-striped" style="width:600px;  height:400px; font-size: 12px">
                  
                 <tr>
				   <th > Information</th>
				    <th >Value</th>
                  </tr>
                    
                  <tr>
                    <td>Date</td>
                   <td>${b.issue_date}</td>
                  </tr>
                  <tr>
                    <td>First Name</td>
                    <td>${b.first_name}</td>
                  </tr>
                  <tr>
                    <td>Last Name</td>
                    <td>${b.last_name}</td>
                  </tr>
                  <tr>
                    <td>Mobile Number</td>
                    <td>${b.mobile_number}</td>
                  </tr>
                  <tr>
                    <td>Email</td>
                    <td>${b.email}</td>
                  </tr>
                  <tr>
                    <td>Route Name</td>
                    <td>${b.road_name}</td>
                  </tr>
                  <tr>
                    <td>Train Name</td>
                    <td>${b.train_name}</td>
                  </tr>
                  <tr>
                    <td>Class Name</td>
                    <td>${b.seat_class}</td>
                  </tr>
                  <tr>
                  <tr>
                    <td>Coach Name</td>
                    <td>${b.travel_name}</td>
                  </tr>
                  <tr>
                    <td>No of Seats</td>
                    <td>${b.no_of_seats}</td>
                  </tr>
                    <td>Ticket Price</td>
                    <td>${b.seat_price}</td>
                  </tr>
                  
                  <tr>
                    <td>VAT</td>
                    <td>${b.vat}</td>
                  </tr>
                  <tr>
                    <td>Total Amount</td>
                    <td>${b.total_amount}</td>
                  </tr>
                   
                  
                </table>
                
                <div>
                 
                </div>
              </div>
              
              <!-- /.card-body -->
            </div>
            <button type="submit" class="btn btn-danger" onclick="window.print()"> Print
                 </button>
            <!-- /.card -->
          </div>
          <!-- /.col -->
        </div>
        <!-- /.row -->
      </div>
      <!-- /.container-fluid -->
    </section>
    <!-- /.content -->
      
      <script src="/app-assets/js/jquery-3.3.1.min.js"></script>
      <script src="/app-assets/js/bootstrap.min.js"></script>
     
   </body>
</html>

<script>
$("#a").hide();
$("#b").hide();
</script>