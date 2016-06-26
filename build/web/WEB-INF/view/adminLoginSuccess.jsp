<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Welcome Admin</title>

    <!-- Bootstrap Core CSS -->
    <spring:url value="/resources/css/bootstrap.min.css" var="mainCss1" />
    <link href="${mainCss1}" rel="stylesheet" />
    <!--<link rel="stylesheet" href="/resources/css/bootstrap.min.css" type="text/css">-->

    <!-- Custom Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <!--<link rel="stylesheet" href="/resources/font-awesome/css/font-awesome.min.css" type="text/css">-->
    <spring:url value="/resources/font-awesome/css/font-awesome.min.css" var="mainCss2" />
    <link href="${mainCss2}" rel="stylesheet" />
    
    <!-- Plugin CSS -->
    <!--<link rel="stylesheet" href="/resources/css/animate.min.css" type="text/css">-->
    <spring:url value="/resources/css/animate.min.css" var="mainCss3" />
    <link href="${mainCss3}" rel="stylesheet" />
    <!-- Custom CSS -->
    <!--<link rel="stylesheet" href="/resources/css/creative.css" type="text/css">-->
    <spring:url value="/resources/css/creative.css" var="mainCss4" />
    <link href="${mainCss4}" rel="stylesheet" />
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">Admin Control Pannel</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#about">Manage Students</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#services">Services</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#portfolio">Portfolio</a>
                    </li>
                    <li>
                        <a href="adminLogout.htm">Logout</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1>Your Dashboard To Manage SMS</h1>
                <hr>
                <p>You Are Currently logged in as super user of this system from here you can manage every aspect of this system</p>
                <a href="addOtherAdmin.htm" class="btn btn-primary btn-xl page-scroll">Add Other Admin</a>
            </div>
        </div>
    </header>

    <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">You can easily manage student's details</h2>
                    <hr class="light">
                    <p class="text-faded">By clicking the small button given below you can easily manage and manipulate every minute detail of each and every student present in this institute.</p>
                    <a href="manageStudent.htm" class="btn btn-default btn-xl">Manage Students</a>
                </div>
            </div>
        </div>
    </section>

    <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">At Your Service</h2>
                    <hr class="primary">
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-diamond wow bounceIn text-primary"></i>
                        <h3>Sturdy Templates</h3>
                        <p class="text-muted">Our templates are updated regularly so they don't break.</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-paper-plane wow bounceIn text-primary" data-wow-delay=".1s"></i>
                        <h3>Ready to Ship</h3>
                        <p class="text-muted">You can use this theme as is, or you can make changes!</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-newspaper-o wow bounceIn text-primary" data-wow-delay=".2s"></i>
                        <h3>Up to Date</h3>
                        <p class="text-muted">We update dependencies to keep things fresh.</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-heart wow bounceIn text-primary" data-wow-delay=".3s"></i>
                        <h3>Made with Love</h3>
                        <p class="text-muted">You have to make your websites with love these days!</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="no-padding" id="portfolio">
        <div class="container-fluid">
            <div class="row no-gutter">
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <spring:url value="/resources/img/portfolio/1.jpg" var="mainCss5" />
                        <img src="${mainCss5}" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    SMS
                                </div>
                                <div class="project-name">
                                    Manage Admin
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="manageFaculty.htm" class="portfolio-box">
                        <spring:url value="/resources/img/portfolio/2.jpg" var="mainCss6" />
                        <img src="${mainCss6}" class="img-responsive" alt="">
                        <!--<img src="/resources/img/portfolio/2.jpg" class="img-responsive" alt="">-->
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    SMS
                                </div>
                                <div class="project-name">
                                    Manage Faculty
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <spring:url value="/resources/img/portfolio/3.jpg" var="mainCss7" />
                        <img src="${mainCss7}" class="img-responsive" alt="">
                        <!--<img src="/resources/img/portfolio/3.jpg" class="img-responsive" alt="">-->
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    SMS
                                </div>
                                <div class="project-name">
                                    Time-Table
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <spring:url value="/resources/img/portfolio/4.jpg" var="mainCss8" />
                        <img src="${mainCss8}" class="img-responsive" alt="">
                        <!--<img src="/resources/img/portfolio/4.jpg" class="img-responsive" alt="">-->
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    SMS
                                </div>
                                <div class="project-name">
                                    Manage Notification
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <spring:url value="/resources/img/portfolio/5.jpg" var="mainCss9" />
                        <img src="${mainCss9}" class="img-responsive" alt="">
                        <!--<img src="/resources/img/portfolio/5.jpg" class="img-responsive" alt="">-->
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    SMS
                                </div>
                                <div class="project-name">
                                    Manage Inbox
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <spring:url value="/resources/img/portfolio/6.jpg" var="mainCss10" />
                        <img src="${mainCss10}" class="img-responsive" alt="">
                        <!--<img src="/resources/img/portfolio/6.jpg" class="img-responsive" alt="">-->
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    SMS
                                </div>
                                <div class="project-name">
                                    Manage Courses
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </section>

    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Free Download at Start Bootstrap!</h2>
                <a href="#" class="btn btn-default btn-xl wow tada">Download Now!</a>
            </div>
        </div>
    </aside>

    <!-- jQuery -->
    <spring:url value="/resources/js/jquery.js" var="mainCss11" />
    <script src="${mainCss11}"></script>

    <!-- Bootstrap Core JavaScript -->
    <spring:url value="/resources/js/bootstrap.min.js" var="mainCss12" />
    <script src="${mainCss12}"></script>
    <!--<script src="/resources/js/bootstrap.min.js"></script>-->

    <!-- Plugin JavaScript -->
    <spring:url value="/resources/js/jquery.easing.min.js" var="mainCss13" />
    <script src="${mainCss13}"></script>
    <!--<script src="/resources/js/jquery.easing.min.js"></script>-->
    <spring:url value="/resources/js/jquery.fittext.js" var="mainCss14" />
    <script src="${mainCss14}"></script>
    <!--<script src="/resources/js/jquery.fittext.js"></script>-->
    <spring:url value="/resources/js/wow.min.js" var="mainCss15" />
    <script src="${mainCss15}"></script>
    <!--<script src="/resources/js/wow.min.js"></script>-->

    <!-- Custom Theme JavaScript -->
    <spring:url value="/resources/js/creative.js" var="mainCss16" />
    <script src="${mainCss16}"></script>
    <!--<script src="/resources/js/creative.js"></script>-->

</body>

</html>
