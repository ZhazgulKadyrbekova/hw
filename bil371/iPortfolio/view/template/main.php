<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>iPortfolio Bootstrap Template - Index</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="./view/template/assets/img/favicon.png" rel="icon">
  <link href="./view/template/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="./view/template/assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="./view/template/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="./view/template/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="./view/template/assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="./view/template/assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="./view/template/assets/vendor/aos/aos.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="./view/template/assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: iPortfolio - v2.0.2
  * Template URL: https://bootstrapmade.com/iportfolio-bootstrap-portfolio-websites-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Mobile nav toggle button ======= -->
  <button type="button" class="mobile-nav-toggle d-xl-none"><i class="icofont-navigation-menu"></i></button>

  <!-- ======= Header ======= -->
  <header id="header">
    <div class="d-flex flex-column">

      <div class="profile">
        <img src="./view/template/assets/img/profile-img.jpg" alt="" class="img-fluid rounded-circle">
        <h1 class="text-light"><a href="index.php">Welcome</a></h1>
      </div>

        <ul>
          <li class="active"><a href="index.php"><i class="bx bx-home"></i> <span>Home</span></a></li>
          <li><a href="index.php?page=showAllData"><i class="bx bx-user"></i> <span>Show all data</span></a></li>
          <li><a href="index.php?page=searchTitle"><i class="bx bx-user"></i> <span>Search by title</span></a></li>
          <li><a href="index.php?page=searchDistance"><i class="bx bx-user"></i> <span>Search by distance</span></a></li>
          <li><a href="index.php?page=searchDifficultyLevel"><i class="bx bx-user"></i> <span>Search by difficulty level</span></a></li>
          <li><a href="index.php?page=searchPrice"><i class="bx bx-user"></i> <span>Search by price</span></a></li>

        </ul>
      <button type="button" class="mobile-nav-toggle d-xl-none"><i class="icofont-navigation-menu"></i></button>

    </div>
  </header><!-- End Header -->

  <main id="main">

    <!-- ======= Breadcrumbs ======= -->
    <section class="breadcrumbs">
      <div class="container">

        <div class="d-flex justify-content-between align-items-center">
          <h2>Header</h2>
          <ol>
            <li><a href="index.html">Home</a></li>
            <li>Inner Page</li>
          </ol>
        </div>

      </div>
    </section><!-- End Breadcrumbs -->

    <section id="hero" class="d-flex flex-column justify-content-center align-items-center">
    <div class="hero-container">
        <p>
          <?php
            echo $this->content;
          ?>
        </p>
    </div>
  </section>

  <div class="d-flex justify-content-between align-items-center">
          <h2>Footer</h2>
          
        </div>

  </main><!-- End #main -->
  <!-- ======= Hero Section ======= -->
  

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong><span>iPortfolio</span></strong>
      </div>
      <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/iportfolio-bootstrap-portfolio-websites-template/ -->
        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
      </div>
    </div>
  </footer><!-- End  Footer -->

  <a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

  <!-- Vendor JS Files -->
  <script src="./view/template/assets/vendor/jquery/jquery.min.js"></script>
  <script src="./view/template/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="./view/template/assets/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="./view/template/assets/vendor/php-email-form/validate.js"></script>
  <script src="./view/template/assets/vendor/waypoints/jquery.waypoints.min.js"></script>
  <script src="./view/template/assets/vendor/counterup/counterup.min.js"></script>
  <script src="./view/template/assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="./view/template/assets/vendor/venobox/venobox.min.js"></script>
  <script src="./view/template/assets/vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="./view/template/assets/vendor/typed.js/typed.min.js"></script>
  <script src="./view/template/assets/vendor/aos/aos.js"></script>

  <!-- Template Main JS File -->
  <script src="./view/template/assets/js/main.js"></script>

</body>

</html>