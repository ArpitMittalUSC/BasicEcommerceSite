<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<nav class="navbar navbar-expand-md navbar-dark bg-info">
      <a class="navbar-brand" href="#">BasicEcommerceSite</a>
      <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="navbar-collapse collapse" id="navbarsExample04" style="">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="/BasicEcommerceSetup/home">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/BasicEcommerceSetup/orderHistory">Order History</a>
          </li>
			<li class="nav-item active buyer_mode">
            <a class="nav-link" href="/BasicEcommerceSetup/cart">Cart</a>
          </li>
          <li class="nav-item active hide seller_mode"  style="display: none;">
            <a class="nav-link" href="/BasicEcommerceSetup/product/createNewProduct">Create Product</a>
          </li>
           <li class="nav-item">
            <a class="nav-link" href="/BasicEcommerceSetup/adminPortal">Admin</a>
          </li>
        </ul>
        <div class="nav-item nav-link seller_mode"  style="display: none; color: white;">Products Sold : 3 | Dollars Amount in Panel : $600 <span class="sr-only">(current)</span></div>
        <form class="form-inline " >
          <button class="form-control seller_toggle"  >Change to Seller</button>
        </form>
        <form class="form-inline" >
          <button class="form-control buyer_toggle" disabled >Change to Buyer</button>
        </form>
      </div>
    </nav>