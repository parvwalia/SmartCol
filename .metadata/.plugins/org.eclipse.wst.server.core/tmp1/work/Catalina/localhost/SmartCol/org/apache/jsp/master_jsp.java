/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2017-10-15 08:21:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class master_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Master Page</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"bower_components/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"bower_components/Ionicons/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\r\n");
      out.write("  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter\r\n");
      out.write("        page. However, you can choose any other skin. Make sure you\r\n");
      out.write("        apply the skin class to the body tag so the changes take effect. -->\r\n");
      out.write("  \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/skins/_all-skins.min.css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Font -->\r\n");
      out.write("  <link rel=\"stylesheet\"\r\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic\">\r\n");
      out.write("</head>\r\n");
      out.write("<!--\r\n");
      out.write("BODY TAG OPTIONS:\r\n");
      out.write("=================\r\n");
      out.write("Apply one or more of the following classes to get the\r\n");
      out.write("desired effect\r\n");
      out.write("|---------------------------------------------------------|\r\n");
      out.write("| SKINS         | skin-blue                               |\r\n");
      out.write("|               | skin-black                              |\r\n");
      out.write("|               | skin-purple                             |\r\n");
      out.write("|               | skin-yellow                             |\r\n");
      out.write("|               | skin-red                                |\r\n");
      out.write("|               | skin-green                              |\r\n");
      out.write("|---------------------------------------------------------|\r\n");
      out.write("|LAYOUT OPTIONS | fixed                                   |\r\n");
      out.write("|               | layout-boxed                            |\r\n");
      out.write("|               | layout-top-nav                          |\r\n");
      out.write("|               | sidebar-collapse                        |\r\n");
      out.write("|               | sidebar-mini                            |\r\n");
      out.write("|---------------------------------------------------------|\r\n");
      out.write("-->\r\n");
      out.write("<body class=\"hold-transition skin-yellow sidebar-mini\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Main Header -->\r\n");
      out.write("  <header class=\"main-header\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <a href=\"#\" class=\"logo\">\r\n");
      out.write("      <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("      <span class=\"logo-mini\"><b>S</b>Col</span>\r\n");
      out.write("      <!-- logo for regular state and mobile devices -->\r\n");
      out.write("      <span class=\"logo-lg\"><b>Smart</b>COL</span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Header Navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\" role=\"navigation\">\r\n");
      out.write("      <!-- Sidebar toggle button-->\r\n");
      out.write("      <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"push-menu\" role=\"button\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("      </a>\r\n");
      out.write("      \r\n");
      out.write("      <a class=\"label\">\r\n");
      out.write("      <span class=\"label label-default\">Default Label</span>\r\n");
      out.write("      </a>\r\n");
      out.write("      <!-- Navbar Right Menu -->\r\n");
      out.write("      <div class=\"navbar-custom-menu\">\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("          <!-- Messages: style can be found in dropdown.less-->\r\n");
      out.write("          <li class=\"dropdown messages-menu\">\r\n");
      out.write("            <!-- Menu toggle button -->\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <i class=\"fa fa-envelope-o\"></i>\r\n");
      out.write("              <span class=\"label label-success\">4</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <li class=\"header\">You have 4 messages</li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <!-- inner menu: contains the messages -->\r\n");
      out.write("                <ul class=\"menu\">\r\n");
      out.write("                  <li><!-- start message -->\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                      <div class=\"pull-left\">\r\n");
      out.write("                        <!-- User Image -->\r\n");
      out.write("                        <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <!-- Message title and timestamp -->\r\n");
      out.write("                      <h4>\r\n");
      out.write("                        Support Team\r\n");
      out.write("                        <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\r\n");
      out.write("                      </h4>\r\n");
      out.write("                      <!-- The message -->\r\n");
      out.write("                      <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <!-- end message -->\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- /.menu -->\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- /.messages-menu -->\r\n");
      out.write("\r\n");
      out.write("          <!-- Notifications Menu -->\r\n");
      out.write("          <li class=\"dropdown notifications-menu\">\r\n");
      out.write("            <!-- Menu toggle button -->\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <i class=\"fa fa-bell-o\"></i>\r\n");
      out.write("              <span class=\"label label-warning\">10</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <li class=\"header\">You have 10 notifications</li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <!-- Inner Menu: contains the notifications -->\r\n");
      out.write("                <ul class=\"menu\">\r\n");
      out.write("                  <li><!-- start notification -->\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                      <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <!-- end notification -->\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"footer\"><a href=\"#\">View all</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- Tasks Menu -->\r\n");
      out.write("          <li class=\"dropdown tasks-menu\">\r\n");
      out.write("            <!-- Menu Toggle Button -->\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <i class=\"fa fa-flag-o\"></i>\r\n");
      out.write("              <span class=\"label label-danger\">9</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <li class=\"header\">You have 9 tasks</li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <!-- Inner menu: contains the tasks -->\r\n");
      out.write("                <ul class=\"menu\">\r\n");
      out.write("                  <li><!-- Task item -->\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                      <!-- Task title and progress text -->\r\n");
      out.write("                      <h3>\r\n");
      out.write("                        Design some buttons\r\n");
      out.write("                        <small class=\"pull-right\">20%</small>\r\n");
      out.write("                      </h3>\r\n");
      out.write("                      <!-- The progress bar -->\r\n");
      out.write("                      <div class=\"progress xs\">\r\n");
      out.write("                        <!-- Change the css width attribute to simulate progress -->\r\n");
      out.write("                        <div class=\"progress-bar progress-bar-aqua\" style=\"width: 20%\" role=\"progressbar\"\r\n");
      out.write("                             aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\r\n");
      out.write("                          <span class=\"sr-only\">20% Complete</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <!-- end task item -->\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"footer\">\r\n");
      out.write("                <a href=\"#\">View all tasks</a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- User Account Menu -->\r\n");
      out.write("          <li class=\"dropdown user user-menu\">\r\n");
      out.write("            <!-- Menu Toggle Button -->\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <!-- The user image in the navbar-->\r\n");
      out.write("              <img src=\"dist/img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\">\r\n");
      out.write("              <!-- hidden-xs hides the username on small devices so only the image appears. -->\r\n");
      out.write("              <span class=\"hidden-xs\">Alexander Pierce</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <!-- The user image in the menu -->\r\n");
      out.write("              <li class=\"user-header\">\r\n");
      out.write("                <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("\r\n");
      out.write("                <p>\r\n");
      out.write("                  Alexander Pierce - Web Developer\r\n");
      out.write("                  <small>Member since Nov. 2012</small>\r\n");
      out.write("                </p>\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- Menu Body -->\r\n");
      out.write("              <li class=\"user-body\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                    <a href=\"#\">Followers</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                    <a href=\"#\">Sales</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                    <a href=\"#\">Friends</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- Menu Footer-->\r\n");
      out.write("              <li class=\"user-footer\">\r\n");
      out.write("                <div class=\"pull-left\">\r\n");
      out.write("                  <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pull-right\">\r\n");
      out.write("                  <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- Control Sidebar Toggle Button -->\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\" data-toggle=\"control-sidebar\"><i class=\"fa fa-gears\"></i></a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  <!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write("  <aside class=\"main-sidebar\">\r\n");
      out.write("\r\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("    <section class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar user panel (optional) -->\r\n");
      out.write("      <div class=\"user-panel\">\r\n");
      out.write("        <div class=\"pull-left image\">\r\n");
      out.write("          <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"pull-left info\">\r\n");
      out.write("          <p>Alexander Pierce</p>\r\n");
      out.write("          <!-- Status -->\r\n");
      out.write("          <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- search form (Optional) -->\r\n");
      out.write("      <form action=\"#\" method=\"get\" class=\"sidebar-form\">\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("          <span class=\"input-group-btn\">\r\n");
      out.write("              <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\r\n");
      out.write("              </button>\r\n");
      out.write("            </span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("      <!-- /.search form -->\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar Menu -->\r\n");
      out.write("      <ul class=\"sidebar-menu\" data-widget=\"tree\">\r\n");
      out.write("        <li class=\"header\">HEADER</li>\r\n");
      out.write("        <!-- Optionally, you can add icons to the links -->\r\n");
      out.write("        <li class=\"active\"><a href=\"#\"><i class=\"fa fa-link\"></i> <span>Link</span></a></li>\r\n");
      out.write("        <li><a href=\"#\"><i class=\"fa fa-link\"></i> <span>Another Link</span></a></li>\r\n");
      out.write("        <li class=\"treeview\">\r\n");
      out.write("          <a href=\"#\"><i class=\"fa fa-link\"></i> <span>Multilevel</span>\r\n");
      out.write("            <span class=\"pull-right-container\">\r\n");
      out.write("                <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("              </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"treeview-menu\">\r\n");
      out.write("            <li><a href=\"#\">Link in level 2</a></li>\r\n");
      out.write("            <li><a href=\"#\">Link in level 2</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <!-- /.sidebar-menu -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>\r\n");
      out.write("\r\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("  <div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Content Header (Page header) -->\r\n");
      out.write("    <section class=\"content-header\">\r\n");
      out.write("      <h1>\r\n");
      out.write("        Page Header\r\n");
      out.write("        <small>Optional description</small>\r\n");
      out.write("      </h1>\r\n");
      out.write("      <ol class=\"breadcrumb\">\r\n");
      out.write("        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Level</a></li>\r\n");
      out.write("        <li class=\"active\">Here</li>\r\n");
      out.write("      </ol>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- Main content -->\r\n");
      out.write("    <section class=\"content container-fluid\">\r\n");
      out.write("\r\n");
      out.write("      <!--------------------------\r\n");
      out.write("        | Your Page Content Here |\r\n");
      out.write("        -------------------------->\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.content -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Main Footer -->\r\n");
      out.write("  <footer class=\"main-footer\">\r\n");
      out.write("    <!-- To the right -->\r\n");
      out.write("    <div class=\"pull-right hidden-xs\">\r\n");
      out.write("      Anything you want\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Default to the left -->\r\n");
      out.write("    <strong>Copyright &copy; 2016 <a href=\"#\">Company</a>.</strong> All rights reserved.\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Create the tabs -->\r\n");
      out.write("    <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\r\n");
      out.write("      <li class=\"active\"><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\r\n");
      out.write("      <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- Tab panes -->\r\n");
      out.write("    <div class=\"tab-content\">\r\n");
      out.write("      <!-- Home tab content -->\r\n");
      out.write("      <div class=\"tab-pane active\" id=\"control-sidebar-home-tab\">\r\n");
      out.write("        <h3 class=\"control-sidebar-heading\">Recent Activity</h3>\r\n");
      out.write("        <ul class=\"control-sidebar-menu\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"javascript:;\">\r\n");
      out.write("              <i class=\"menu-icon fa fa-birthday-cake bg-red\"></i>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"menu-info\">\r\n");
      out.write("                <h4 class=\"control-sidebar-subheading\">Langdon's Birthday</h4>\r\n");
      out.write("\r\n");
      out.write("                <p>Will be 23 on April 24th</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- /.control-sidebar-menu -->\r\n");
      out.write("\r\n");
      out.write("        <h3 class=\"control-sidebar-heading\">Tasks Progress</h3>\r\n");
      out.write("        <ul class=\"control-sidebar-menu\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"javascript:;\">\r\n");
      out.write("              <h4 class=\"control-sidebar-subheading\">\r\n");
      out.write("                Custom Template Design\r\n");
      out.write("                <span class=\"pull-right-container\">\r\n");
      out.write("                    <span class=\"label label-danger pull-right\">70%</span>\r\n");
      out.write("                  </span>\r\n");
      out.write("              </h4>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"progress progress-xxs\">\r\n");
      out.write("                <div class=\"progress-bar progress-bar-danger\" style=\"width: 70%\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- /.control-sidebar-menu -->\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.tab-pane -->\r\n");
      out.write("      <!-- Stats tab content -->\r\n");
      out.write("      <div class=\"tab-pane\" id=\"control-sidebar-stats-tab\">Stats Tab Content</div>\r\n");
      out.write("      <!-- /.tab-pane -->\r\n");
      out.write("      <!-- Settings tab content -->\r\n");
      out.write("      <div class=\"tab-pane\" id=\"control-sidebar-settings-tab\">\r\n");
      out.write("        <form method=\"post\">\r\n");
      out.write("          <h3 class=\"control-sidebar-heading\">General Settings</h3>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"control-sidebar-subheading\">\r\n");
      out.write("              Report panel usage\r\n");
      out.write("              <input type=\"checkbox\" class=\"pull-right\" checked>\r\n");
      out.write("            </label>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("              Some information about this general settings option\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.form-group -->\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.tab-pane -->\r\n");
      out.write("    </div>\r\n");
      out.write("  </aside>\r\n");
      out.write("  <!-- /.control-sidebar -->\r\n");
      out.write("  <!-- Add the sidebar's background. This div must be placed\r\n");
      out.write("  immediately after the control sidebar -->\r\n");
      out.write("  <div class=\"control-sidebar-bg\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- REQUIRED JS SCRIPTS -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 3 -->\r\n");
      out.write("<script src=\"bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.7 -->\r\n");
      out.write("<script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"dist/js/adminlte.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Optionally, you can add Slimscroll and FastClick plugins.\r\n");
      out.write("     Both of these plugins are recommended to enhance the\r\n");
      out.write("     user experience. -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
