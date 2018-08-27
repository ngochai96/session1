
<div class="row justify-content-center">
	<div class="col-md-5">
		<div class="card p-4">
			<div
				class="card-header text-center text-uppercase h4 font-weight-light">
				Login</div>

			<div class="card-body py-5">
				<form:form
					action="${pageContext.request.contextPath}/j_spring_security_check"
					method='POST'>

					<div class="form-group has-feedback">
						<label class="form-control-label">Tài Khoản</label> 
						<input type="text" class="form-control" name="TaiKhoan">
						<span class="glyphicon glyphicon-user form-control-feedback"></span>
					</div>
					<div class="form-group has-feedback">
					<label class="form-control-label">Mật khẩu</label>
						<input type="password" class="form-control" name="MatKhau"> <span
							class="glyphicon glyphicon-lock form-control-feedback"></span>
					</div>

					<div class="row">
						<div class="col-6">
							<button type="submit" value="login" class="btn btn-primary px-5">Đăng nhập</button>
						</div>
						<!-- /.col -->
					</div>
				</form:form>
			</div>
		</div>
	</div>
</div>