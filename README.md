# BasicEcommerceSite

Currently in progress with following features as planned : 
Use Cases - 
	Registration Page
	Login Page (with selection of Role)

	Flow for Seller - 
		Product Creation Page 
		Product Listing Page (List of all Products by the specific Seller)
		Wallet Information
		
	Flow for Buyer - 
		Product Listing Page (List of all Products available) 
			- with functionality to add product to cart
		Product Details Page (Details of Product)
			- with functionality for Buyer to enter product reviews
		Cart Page
		Place Order (comprising payment popup/page)
			- Send email to Buyer / Seller for purchase done
			- save purchased Invoice in S3 Bucket
		Order History Page 
			- Buyer can search according to seller and sort them 
			

	Flow for Admin -
		Users List (with roles) 	
		Manage Products Page (PLP for Admin)
		Manage Shopping Cards Page 
		Manage Product Reviews 
	
	

Backend -
	Save User Details in DB on sign up
	Verifying User Credentials on Login
	Based on role, Send Product Details to Front end
		- for Buyer/Seller, Just Basic details
		- For Admin, extra field showiing approval status
	Save Product Details in DB when Seller Creates Products
	Send Product List for Admin/Seller/Buyer
	Send Shopping Card List for Admin
	Based on role, Product Reviews Details to Front end
		- for Buyer, Save Reviews, and view it 
		- For Admin, extra field showiing approval status
	
Front End -
	Registration Page
	Login Page
	Product Details Page
		- SHow List of products with diff view for diff roles
	Product Details Page 
		- New product page where Seller can create product
		- Details for user to add to cart
	Cart Page	
		- showing summary of cart
		- place order 
	payment page
	Order History Page
  Admin Portal
