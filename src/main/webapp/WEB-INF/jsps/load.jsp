<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
   <script type="text/javascript" src="/resources/js/bootstrap-3.1.1.min.js"></script>
    <link href="/resources/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    
    <link href="/resources/css/fileinput.css" media="all" rel="stylesheet" type="text/css" />
    
    <link href="/resources/css/fileinput.min.css" media="all" rel="stylesheet" type="text/css" />
    
    <script src="/resources/js/fileinput.js" type="text/javascript"></script>

    <script type="text/javascript" src="/resources/js/fileinput_locale_de.js"></script>
	<script type="text/javascript">
    $(document).ready(function() {
        $("#file-1").fileinput({
            uploadUrl: 'localhost:8080/hellow/mvc', // you must set a valid URL here else you will get an error
            allowedFileExtensions : ['jpg', 'png','gif'],
            uploadAsync: false, //设置同步，异步 （同步） 
            overwriteInitial: false,
            maxFileSize: 1000,
            maxFilesNum: 10,
            //allowedFileTypes: ['image', 'video', 'flash'],
            slugCallback: function(filename) {
                return filename.replace('(', '_').replace(']', '_');
            }
    	});	
        });
	</script>
  </head>
  <body>
	<div class="head">
      <div class="container">
        <nav class="navbar navbar-inverse navbar-static-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Project name</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Action</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li role="separator" class="divider"></li>
                    <li class="dropdown-header">Nav header</li>
                    <li><a href="#">Separated link</a></li>
                    <li><a href="#">One more separated link</a></li>
                  </ul>
                </li>
              </ul>
            </div>
          </div>
        </nav>
      </div>
	</div>
	
	<div class="body">
	<div class="container">
		<form enctype="multipart/form-data">
		        <div class="form-group">
                    <input id="file-1" type="file" multiple class="file" data-overwrite-initial="false" data-min-file-count="1">
                </div>
         </form>
	</div>
	</div>
	<div class="foot">
	
	</div>

  </body>
</html>