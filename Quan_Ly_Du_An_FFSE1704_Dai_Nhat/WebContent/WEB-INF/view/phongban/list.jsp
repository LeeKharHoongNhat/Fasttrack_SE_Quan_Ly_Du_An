<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/WEB-INF/view/templates/header.jsp" />

<div class="main-panel">
	<div class="content-wrapper">
		<div class="page-header">
			<div class="col-lg-12 stretch-card">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Danh Sách Phòng Ban</h4>
						<nav aria-label="Page navigation example">
							<ul class="pagination">

								<c:if test="${indexPage > 1}">
									<li class="page-item"><a
										href="/qlda/Phong_Ban/List_Phong_Ban/1" class="page-link">First</a></li>
								</c:if>


								<c:if test="${indexPage > 1}">
									<li class="page-item"><a
										href="/qlda/Phong_Ban/List_Phong_Ban/${indexPage-1}"
										class="page-link">${indexPage-1}</a></li>
								</c:if>


								<li class="page-item"><a
									href="/qlda/Phong_Ban/List_Phong_Ban/${indexPage}"
									class="page-link">${indexPage}</a></li>


								<c:if test="${indexPage < allPage}">
									<li class="page-item"><a
										href="/qlda/Phong_Ban/List_Phong_Ban/${indexPage+1}"
										class="page-link">${indexPage+1}</a></li>
								</c:if>

								<c:if test="${indexPage < allPage}">
									<li class="page-item"><a
										href="/qlda/Phong_Ban/List_Phong_Ban/${allPage}"
										class="page-link">Last</a></li>
								</c:if>

							</ul>
						</nav>
						<table class="table table-bordered">
							<thead>
								<tr>
									<th>Mã phòng ban</th>
									<th>Tên phòng ban</th>
									<th>action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="emp" items="${list}">
									<tr>
										<td>${emp.maPhongBan}</td>
										<td>${emp.tenPhongBan}</td>
										<td><a
											href="/qlda/Phong_Ban/Edit_PhongBan/${emp.maPhongBan}"
											class="btn btn-primary">edit</a> <a
											href="/qlda/Phong_Ban/Delete_PhongBan/${emp.maPhongBan}"
											class="btn btn-danger">delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>


		<jsp:include page="/WEB-INF/view/templates/footer.jsp" />