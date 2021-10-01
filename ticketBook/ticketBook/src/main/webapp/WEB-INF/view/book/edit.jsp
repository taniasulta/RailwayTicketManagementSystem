<jsp:include page="/WEB-INF/view/common/header.jsp" />

<div class="mx-5 my-5" >
		<div class="row">
			<div class="col-md-3">
			<a>add</a>
			</div>
			<div class="col-md-6">
				<form  method="POST">
					<div class="mb-3">
						<label for="name" class="form-label">ticket Type</label>
						<input type="text" class="form-control"  id="name" />
					</div>
				
					<div class="mb-3">
						<label for="price" class="form-label">Ticket Code </label>
						<input type="text" class="form-control"  id="price" />
					</div>
				
					<div class="mb-3">
						<label for="qty" class="form-label">|Ticket Date</label>
						<input type="number" class="form-control"  id="qty" />
					</div>
					<div class="mb-3">
						<label for="price" class="form-label">Ticket Description</label>
						<input type="text" class="form-control"  id="price" />
					</div>
					
				
					<button type="submit" class="btn btn-primary">Save Product</button>
				</form>
			</div>
		</div>
	
		
	</div>
	<jsp:include page="/WEB-INF/view/common/footer.jsp" />
	