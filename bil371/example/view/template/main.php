<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Inner Page - Regna Bootstrap Template</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="./view/template/assets/img/favicon.png" rel="icon">
  <link href="./view/template/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="./view/template/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="./view/template/assets/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="./view/template/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="./view/template/assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="./view/template/assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="./view/template/assets/vendor/aos/aos.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="./view/template/assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: Regna - v2.1.0
  * Template URL: https://bootstrapmade.com/regna-bootstrap-onepage-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <a href="index.php"><img src="./view/template/assets/img/logo.png" alt=""></a>
        <!-- Uncomment below if you prefer to use a text logo -->
        <!--<h1><a href="#hero">Regna</a></h1>-->
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li><a href="index.php">Home</a></li>
		  <li><a href="index.php?page=addNewCustomerForm">Add new customer</a></li>
          <li><a href="index.php?page=checkDBConnection">Connect to DB</a></li>
          <li><a href="index.php?page=getAllCustomers">Show customers list</a></li>
          <li class="menu-has-children"><a href="">Drop Down</a>
            <ul>
              <li><a href="#">Drop Down 1</a></li>
              <li class="menu-has-children"><a href="#">Drop Down 2</a>
                <ul>
                  <li><a href="#">Deep Drop Down 1</a></li>
                  <li><a href="#">Deep Drop Down 2</a></li>
                  <li><a href="#">Deep Drop Down 3</a></li>
                  <li><a href="#">Deep Drop Down 4</a></li>
                  <li><a href="#">Deep Drop Down 5</a></li>
                </ul>
              </li>
              <li><a href="#">Drop Down 3</a></li>
              <li><a href="#">Drop Down 4</a></li>
              <li><a href="#">Drop Down 5</a></li>
            </ul>
          </li>
          <li><a href="#contact">Contact Us</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- End Header -->

  <main id="main">

    <!-- ======= Breadcrumbs Section ======= -->
    <section class="breadcrumbs">
      <div class="container">

        <div class="d-flex justify-content-between align-items-center">
          <h2>Inner Page</h2>
          <ol>
            <li><a href="index.php">Home</a></li>
            <li>Inner Page</li>
          </ol>
        </div>

      </div>
    </section><!-- End Breadcrumbs Section -->

    <section class="inner-page pt-4">
      <div class="container">
        <p>
          
<?php
			echo $this->content;
?>
        </p>
      </div>
    </section>

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>

    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong>Regna</strong>. All Rights Reserved
      </div>
      <div class="credits">
        <!--
        All the links in the footer should remain intact.
        You can delete the links only if you purchased the pro version.
        Licensing information: https://bootstrapmade.com/license/
        Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Regna
      -->
        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
      </div>
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- Vendor JS Files -->
  <script src="./view/template/assets/vendor/jquery/jquery.min.js"></script>
  <script src="./view/template/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="./view/template/assets/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="./view/template/assets/vendor/php-email-form/validate.js"></script>
  <script src="./view/template/assets/vendor/counterup/counterup.min.js"></script>
  <script src="./view/template/assets/vendor/waypoints/jquery.waypoints.min.js"></script>
  <script src="./view/template/assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="./view/template/assets/vendor/superfish/superfish.min.js"></script>
  <script src="./view/template/assets/vendor/hoverIntent/hoverIntent.js"></script>
  <script src="./view/template/assets/vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="./view/template/assets/vendor/venobox/venobox.min.js"></script>
  <script src="./view/template/assets/vendor/aos/aos.js"></script>

  <!-- Template Main JS File -->
  <script src="./view/template/assets/js/main.js"></script>

</body>

</html>