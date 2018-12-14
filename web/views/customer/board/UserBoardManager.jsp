<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<!-- Semantic UI CSS CDN -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.css">

<!-- Common css -->
<link href="/semi/css/customer/common/main.css" rel="stylesheet">

</head>

<body>

	<%@ include file="/views/customer/common/mainNav.jsp"%>


	<div class="content">
		<br> <br>
		<div align="center"
			style="font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif; font-size: 20px;">MY
			BOARD</div>
		<br> <br> <b>Q&A 게시물 관리</b>
		<hr>
		<table class="ui single line table">
			<thead>
				<tr>
					<th><input type="checkbox"></th>
					<th>게시글 번호</th>
					<th>게시글 제목</th>
					<th>작성자</th>
					<th>조회수</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="checkbox"></td>
					<td>1</td>
					<td>제목입니당</td>
					<td>임수철</td>
					<td>0</td>
					<td>2018/12/14</td>
				</tr>
			</tbody>
		</table>
		<div align="right">
			<button class="ui brown basic mini button">수정하기</button>
			&nbsp;
			<button class="ui brown basic mini button">삭제하기</button>
		</div>
		<hr>
		<br>
		<br> <b>리뷰 게시판 관리</b>
		<hr>
		<table class="ui single line table">
			<thead>
				<tr>
				<th><input type="checkbox"></th>
					<th>게시글 번호</th>
					<th>게시글 제목</th>
					<th>작성자</th>
					<th>조회수</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<tr>
				<td><input type="checkbox"></td>
					<td>1</td>
					<td>제목입니당</td>
					<td>임수철</td>
					<td>0</td>
					<td>2018/12/14</td>
				</tr>
			</tbody>
		</table>
		<div align="right">
			<button class="ui brown basic mini button">수정하기</button>
			&nbsp;
			<button class="ui brown basic mini button">삭제하기</button>
		</div>

		<hr>
		<br>
		<br>
	</div>


	<%@ include file="/views/customer/common/mainFooter.jsp"%>


	<!-- J-query CDN -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<!-- Semantic UI JS CDN -->
	<script
		src="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.js"></script>
	<!-- jQuery Custom Scroller CDN -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>

	<!-- Common js -->
	<script src="/semi/js/customer/common/main.js"></script>

</body>

</html>