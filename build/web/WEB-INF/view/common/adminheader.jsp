<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Admin Portal</title>

        <!-- Bootstrap Core CSS -->
        <spring:url value="/resources/studentpages/css/bootstrap.min.css" var="mainCss" />
        <link href="${mainCss}" rel="stylesheet" />
        <!--<link href="css/bootstrap.min.css" rel="stylesheet">-->

        <!-- Custom CSS -->
        <spring:url value="/resources/studentpages/css/sb-admin.css" var="mainCss2" />
        <link href="${mainCss2}" rel="stylesheet" />
        <!--<link href="css/sb-admin.css" rel="stylesheet">-->

        <!-- Morris Charts CSS -->
        <spring:url value="/resources/studentpages/css/plugins/morris.css" var="mainCss3" />
        <link href="${mainCss3}" rel="stylesheet" />
        <!--<link href="css/plugins/morris.css" rel="stylesheet">-->

        <!-- Custom Fonts -->
        <spring:url value="/resources/studentpages/font-awesome/css/font-awesome.min.css" var="mainCss4" />
        <link href="${mainCss4}" rel="stylesheet" />
        <!--<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">-->

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>
        <style>
            tr{
                height : 50px;
            }
        </style>
        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="adminLoginSuccess.htm">Admin Portal</a>
                </div>
                <!-- Top Menu Items -->
                <ul class="nav navbar-right top-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                        <ul class="dropdown-menu message-dropdown">
                            <li class="message-preview">
                                <a href="#">
                                    <div class="media">
                                        <span class="pull-left">
                                            <img class="media-object" src="http://placehold.it/50x50" alt="">
                                        </span>
                                        <div class="media-body">
                                            <h5 class="media-heading"><strong>${admin.getAdmin_id()}</strong>
                                            </h5>
                                            <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="message-preview">
                                <a href="#">
                                    <div class="media">
                                        <span class="pull-left">
                                            <img class="media-object" src="http://placehold.it/50x50" alt="">
                                        </span>
                                        <div class="media-body">
                                            <h5 class="media-heading"><strong>${admin.getAdmin_id()}</strong>
                                            </h5>
                                            <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="message-preview">
                                <a href="#">
                                    <div class="media">
                                        <span class="pull-left">
                                            <img class="media-object" src="http://placehold.it/50x50" alt="">
                                        </span>
                                        <div class="media-body">
                                            <h5 class="media-heading"><strong>${student.getFirst_name()} ${student.getLast_name()}</strong>
                                            </h5>
                                            <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="message-footer">
                                <a href="#">Read All New Messages</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                        <ul class="dropdown-menu alert-dropdown">
                            <li>
                                <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">View All</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> ${student.getFirst_name()} ${student.getLast_name()} <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-fw fa-life-saver"></i> Help</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-fw fa-gear"></i> Password</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="adminLogout.htm"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav side-nav">
                        <li class="active">
                            <a href="manageFaculty.htm"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                        </li>
                        <li>
                            <%--<spring:url value="/resources/studentpages/charts.html" var="mainCss6" />--%>
                            <!--<spring:url value="#" var="mainCss6" />-->
                            <a href="addNewFaculty.htm"><i class="fa fa-fw fa-plus"></i>Add New Faculty</a>
                        </li>
                        <li>
                            <%--<spring:url value="/resources/studentpages/charts.html" var="mainCss6" />--%>
                            <!--<spring:url value="#" var="mainCss6" />-->
                            <a href="listFaculty.htm"><i class="fa fa-fw fa-list"></i>List Faculty</a>
                        </li>
                        <li>
                            <%--<spring:url value="/resources/studentpages/bootstrap-grid.html" var="mainCss10" />--%>
                            <!--<spring:url value="#" var="mainCss10" />-->
                            <a href="updateFacultyInformation.htm"><i class="fa fa-fw fa-wrench"></i>Update Information</a>
                        </li>
                        <li>
                            <spring:url value="#" var="mainCss7" />
                            <%--<spring:url value="/resources/studentpages/tables.html" var="mainCss7" />--%>
                            <a href="removeFaculty.htm"><i class="fa fa-minus"></i> Remove Faculty</a>
                        </li>
<!--                        <li>
                            <%--<spring:url value="/resources/studentpages/forms.html" var="mainCss8" />--%>
                            <spring:url value="#" var="mainCss8" />
                            <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
                        </li>-->
<!--                        <li>
                            <%--<spring:url value="/resources/studentpages/bootstrap-elements.html" var="mainCss9" />--%>
                            <spring:url value="#" var="mainCss9" />
                            <a href="#"><i class="fa fa-fw fa-question"></i> Query</a>
                        </li>-->
                        
<!--                        <li>
                            <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Dropdown <i class="fa fa-fw fa-caret-down"></i></a>
                            <ul id="demo" class="collapse">
                                <li>
                                    <a href="#">Dropdown Item</a>
                                </li>
                                <li>
                                    <a href="#">Dropdown Item</a>
                                </li>
                            </ul>
                        </li>-->
<!--                        <li>
                            <%--<spring:url value="/resources/studentpages/blank-page.html" var="mainCss11" />--%>
                            <spring:url value="#" var="mainCss11" />
                            <a href="${mainCss11}"><i class="fa fa-fw fa-file"></i> Blank Page</a>
                        </li>-->
                        <!--<li>-->
                        <%--<spring:url value="/resources/studentpages/index-rtl.html" var="mainCss12" />--%>
                        <%--<spring:url value="#" var="mainCss12" />--%>
                        <!--<a href="${mainCss12}"><i class="fa fa-fw fa-dashboard"></i> RTL Dashboard</a>-->
                        <!--</li>-->
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>

            <div id="page-wrapper">

                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="row">
