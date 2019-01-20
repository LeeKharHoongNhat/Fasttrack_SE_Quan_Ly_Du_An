<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="/WEB-INF/view/templates/header.jsp" />

<div class="main-panel">
	<div class="content-wrapper">
		<div class="col-12 grid-margin stretch-card">
			<div class="card">
				<div class="card-body">
					<h4 class="card-title">Xóa phòng ban ?</h4>
					<form:form class="forms-sample" method="post" action="submitdeletephongban">
						<div class="form-group">
							<label for="exampleInputName1">Mã phòng ban: </label>
							<form:hidden path="maPhongBan" class="form-control" />
							<strong>${command.maPhongBan}</strong>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail3">Tên phòng ban: </label>
							<form:hidden path="tenPhongBan" class="form-control" />
							<strong>${command.tenPhongBan}</strong>
						</div>
						<button type="submit" class="btn btn-gradient-primary mr-2">Delete</button>
						<a href="<c:url value="/phongban/1" />"><button type="button"
								class="btn btn-light">Cancel</button></a>
					</form:form>
				</div>
			</div>
		</div>
		<jsp:include page="/WEB-INF/view/templates/footer.jsp" />