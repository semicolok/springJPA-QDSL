<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<title>BoardList</title>
</head>
<body>

	<table>
		<tr>
			<td>Title</td><td><input type="text" id = "title" /></td>
		</tr>
		<tr>
			<td>writer</td><td><input type="text" id = "writer" /></td>
		</tr>
		<tr>
			<td>content</td><td><input type="text" id = "content" /></td>
		</tr>
	</table>
	<button id="saveBt">Save</button>
	<button id="getBt">get</button>
	<div id="boardSection"></div>
	<script type="text/javascript">
	$(document).ready(function (){
		 $.ajaxSetup({ cache: false });
		var listLoad = function() {
			$.getJSON('boards', function(json){
				var page = '';
				page += '<table>';
				page += '<tr>';
					page += '<td>Id</td><td>Title</td><td>Writer</td><td>content</td><td>UpdatedTime</td>';
				page += '</tr>';
				$.each(json.boardList, function(k, v){
					page += '<tr>';	
						page += '<td>' + v.id + '</td><td>' + v.title + '</td><td>' + v.writer + '</td><td>' + v.content + '</td><td>' + v.updatedTime + '</td>';	
					page += '</tr>';	
				});
				page += '</table>';
				$('#boardSection').html(page);
			});
		};
		
		$('#saveBt').click(function(){
			var params = {
				title : $('#title').val(),	
				writer : $('#writer').val(),	
				content : $('#content').val()
			};
			$.post('boards', params, function(json){
				console.log(json.result);
				listLoad();
			});
		});
		
		$('#getBt').click(function(){
			$.getJSON('boards/get/2', function(json){
				console.log(json);
			});
		});
		listLoad();
	});
	</script>
</body>
</html>
