<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
                        
<!DOCTYPE html>
<html>
   <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Railway Ticket b</title>
      <link rel="stylesheet" href="/app-assets/css/bootstrap.min.css">
      <link rel="stylesheet" href="/app-assets/css/style.css">
      <link rel="stylesheet" href="/app-assets/css/fontawesome.min.css">
      <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto" rel="stylesheet">
     
   </head>
   <body class= "container"><br>

<div ="container">       
	<div class="text-center"><h2> bKash Payment </h2>  </div><hr/>
		 <form action="/book/save" method="post">
		    <input type="hidden" name="travel_code" value ="${b.travel_code }"/>
                 <input type="hidden" name="travel_name" value ="${b.travel_name }"/>
                 <input type="hidden" name="train_code" value= "${b.train_code }"/>
                 <input type="hidden" name="train_name" value ="${b.train_name }"/>
                 <input type="hidden" name="road_code" value ="${b.road_code }"/>
                 <input type="hidden" name="road_name" value ="${b.road_name }"/>
               
                 <input type="hidden" name="date" value ="${b.date}"/>
                 <input type="hidden" name="time" value ="${b.time }"/>
                 <input type="hidden" name="first_name" value ="${b.first_name }"/>
                 <input type="hidden" name="last_name" value ="${b.last_name }"/>
                 <input type="hidden" name="mobile_number" value ="${b.mobile_number}"/>
                 <input type="hidden" name="email" value ="${b.email }"/>
                 <input type="hidden" name="address" value ="${b.address}"/>
                 <input type="hidden" name="passenger_id" value ="${b.passenger_id}"/>
                 <input type="hidden" name="seat_class" value ="${b.seat_class }"/>
                 <input type="hidden" name="seat_price" value ="${b.seat_price }" />
                 <input type="hidden" name="no_of_seats" value ="${b.no_of_seats }" />
  			<div class = "row">
  				<div class = "col-md-6 bg-light">
		  			<label class="font-weight-bold">bKash Number: </label>
		  			<input type="text" class="form-control rounded" name="bkash_number">
		  			<label class="font-weight-bold">Password: </label>
		  			<input type="text" class="form-control rounded" name="password">
		  			<label class="font-weight-bold">Date:</label>
		  			<input type="text" class="form-control rounded" name="issue_date"/>
		  			<label class="font-weight-bold">Pay Amount:</label>
		  			<input type="text" class="form-control rounded" name="pay_amount"/>
		  			
  			    </div>
  			    <div class = "col-md-6 bg-light">
	  				<label class="font-weight-bold">Ticket Price: </label>
	  				<input type="text" class="form-control rounded" name="seat_price" value = "${b.seat_price* b.no_of_seats}">
	  				<label class="font-weight-bold">Vat: </label>
	  				<input type="text" class="form-control rounded" name="vat" value="10%" />
	  				<label class="font-weight-bold">Total Amount: </label>
	  				<input type="text" class="form-control rounded" name="total_amount" value ="${b.seat_price* b.no_of_seats+(b.seat_price* b.no_of_seats)*.1}" />
  			    </div>
  			</div> <br>
  			
  		<div class="text-center"> 
  		<!-- <input type="submitt" class="form-control rounded btn-success" value="Confirm">  -->
  		<button type="submitt" class="form-control rounded btn btn-success" style="width:80px" > Confirm</button>
  		</div>
      </form>    
</div>          
          
          
          
      <script src="/app-assets/js/jquery-3.3.1.min.js"></script>
      <script src="/app-assets/js/bootstrap.min.js"></script>
     
   </body>
</html>

